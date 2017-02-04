/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
package de.dfki.iui.mmds.dialogue.fade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.Overlay;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.events.AnyEventHandler;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.interfaces.IFadeService;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.DateTimeDescription;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.UnitType;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.pattern.PObject;
import de.dfki.iui.mmds.core.model.references.DeicticReference;
import de.dfki.iui.mmds.core.model.references.KnowledgeBaseReference;
import de.dfki.iui.mmds.core.model.references.TemporalReference;

public class FadeComponent extends AnyEventHandler implements IFadeService {

	private DialogPlatformEventManager dialogPlatformEventManager;

	WorkingMemory workingMemory;
	IKnowledgeManager knowledgeManager;
	Logger logger = Logger.getLogger(this.getClass());
	// hypotheses with lower confidence than min_confidence are filtered. It is
	// configured by the parameter MIN_CONFIDENCE
	static float min_confidence;
	// standard validity (in milliseconds) for semantic contents in the
	// discourse history if now validity is explicitly set (validity == -1). It
	// is configured by the parameter EXPIRATION_TIME
	static int expiration_time;
	// How long a previous interaction is considered for the resolution of
	// ellipses (in milliseconds, -1 means ad infinitum)
	static int max_ellipsis_time_distance;

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		subscribe("SIAM-INF/subscription.pattern");
		knowledgeManager = ((IKnowledgeManager) componentContext.locateService("IKnowledgeManager"));
		workingMemory = new WorkingMemory(knowledgeManager);
		modified(context);
	}

	public synchronized void modified(ComponentContext context) {
		min_confidence = Float.parseFloat((String) context.getProperties().get("MIN_CONFIDENCE"));
		expiration_time = Integer.parseInt((String) context.getProperties().get("EXPIRATION_TIME"));
		max_ellipsis_time_distance = Integer.parseInt((String) context.getProperties().get("MAX_ELLIPSIS_TIME_DISTANCE"));
	}

	@Override
	protected void handleEvent(Message message, Event event, MatchReport report) {
		// TODO aktuell wird nur die erste Hypothese betrachtet

		if (message instanceof InputAct) {
			InputAct content = (InputAct) message;
			content.setPassedFade(true);
			for (Hypothesis hypothesis : content.getHypotheses()) {
				// leave if confidence is not high enough
				if (hypothesis.getConfidence() < min_confidence) {
					logger.warn("Confidence is below confidence threshold. Input is ignored!");
					return;
				}
				CommunicativeFunction communicativeFunction = hypothesis.getCommunicativeFunction();
				if (communicativeFunction != null) {
					for (int i = 0; i < communicativeFunction.getSemanticContent().size(); ++i) {
						SemanticContent sc = communicativeFunction.getSemanticContent().get(i);
						if (sc.getResolved() == ResolveState.UNRESOLVED) {
							// first resolve deictic and temporal references
							if (sc.getReference() instanceof DeicticReference) {
								// deictic references
								if (sc.getReference().getReferencePattern() != null) {
									PObject pattern = sc.getReference().getReferencePattern();
									Iterator<SemanticContentEntry> iterator = workingMemory.iterator();
									while (iterator.hasNext()) {
										SemanticContentEntry entry = iterator.next();
										List<Entity> entities = entry.getMatchingContent(pattern, sc.getReference().isIsMany(), true);
										if (!entities.isEmpty()) {
											sc.setContent(EmfUtils.clone(entities.get(0)));
											sc.setResolved(ResolveState.RESOLVED);
											for (int j = 1; j < entities.size(); ++j) {
												SemanticContent clone = EmfUtils.clone(sc);
												clone.setContent(EmfUtils.clone(entities.get(j)));
												communicativeFunction.getSemanticContent().add(clone);
											}
											break;
										}
									}
								} else if (logger.isEnabledFor(Level.WARN))
									logger.warn("No semantic content unification background defined for unresolved reference.\n" + EmfPersistence.writeToString(sc.getReference()));

							} else if (sc.getResolved() == ResolveState.UNRESOLVED && sc.getReference() instanceof KnowledgeBaseReference) {
								// physical context reference
								if (sc.getReference().getReferencePattern() != null) {
									PObject pattern = sc.getReference().getReferencePattern();
									List<Entity> entities = workingMemory.findMatchingPhysicalEntities(pattern, sc.getReference().isIsMany(), true);
									if (!entities.isEmpty()) {
										sc.setContent(EmfUtils.clone(entities.get(0)));
										sc.setResolved(ResolveState.RESOLVED);
										for (int j = 1; j < entities.size(); ++j) {
											SemanticContent clone = EmfUtils.clone(sc);
											clone.setContent(EmfUtils.clone(entities.get(j)));
											communicativeFunction.getSemanticContent().add(clone);
										}
										break;

									}
								}
							} else if (sc.getResolved() == ResolveState.UNRESOLVED && sc.getReference() instanceof TemporalReference) {
								// temporal references
								TemporalReference temporalReference = (TemporalReference) sc.getReference();
								LocalDateTime temporalFrame;
								if (temporalReference.getTemporalFrame().getValue().equalsIgnoreCase("now")) {
									temporalFrame = LocalDateTime.now();
								} else
									throw new UnsupportedOperationException("Other types than now in temporal references are not supported yet");

								if (temporalReference.getUnit() == UnitType.UNIT_DAY) {
									if (temporalReference.getNumber() != null) {
										LocalDateTime plusDays = temporalFrame.plusDays(temporalReference.getNumber().getValue());
										DateTimeDescription description = BaseFactory.eINSTANCE.createDateTimeDescription();
										description.setUnitType(UnitType.UNIT_DAY);
										description.setLocalDateTime(plusDays);
										if (sc.getContent() != null && sc.getContent() instanceof DateTimeDescription) {
											description = (DateTimeDescription) Overlay.compute(sc.getContent(), description);
										}
										sc.setContent(description);
									}
								} else
									throw new UnsupportedOperationException("Other units than day in unit are not supported yet");
								sc.setResolved(ResolveState.RESOLVED);
							}
						}
					}

					// then add resolved context to working memory
					List<SemanticContent> newEntities = new ArrayList<SemanticContent>();
					for (SemanticContent sc : communicativeFunction.getSemanticContent()) {
						if (sc.getResolved() == ResolveState.RESOLVED && sc.getContent() != null) {
							newEntities.add(sc);
						}
					}
					updateWorkingMemory(newEntities, String.format("InputAct: %s", content.getId()));

					// ellipsis resolution
					if (communicativeFunction.isIsEllipsis()) {
						for (Message act : workingMemory.getDiscourseHistory()) {
							if (message.getTimestamp() - act.getTimestamp() > FadeComponent.max_ellipsis_time_distance)
								break;
							if (act instanceof InputAct) {
								CommunicativeFunction cf = EmfUtils.clone(((InputAct) act).getHypotheses().get(0).getCommunicativeFunction());

								List<PObject> matchingPatterns = new ArrayList<PObject>();
								List<SemanticContent> newContents = new ArrayList<SemanticContent>();
								int numProvidedContents = communicativeFunction.getSemanticContent().size();

								// schauen ob einträge überschrieben werden
								// können
								for (SemanticContent semanticContent : communicativeFunction.getSemanticContent()) {
									if (semanticContent.getResolved() == ResolveState.RESOLVED && semanticContent.getContent() != null) {
										for (SemanticContent sc : cf.getSemanticContent()) {
											if (sc.getReference() != null && sc.getReference().getReferencePattern() != null) {
												PObject referencePattern = sc.getReference().getReferencePattern();
												if (referencePattern.matches(semanticContent.getContent())) {
													if (!matchingPatterns.contains(referencePattern)) {
														matchingPatterns.add(referencePattern);
													}
													semanticContent.setReference(EmfUtils.clone(sc.getReference()));
													newContents.add(semanticContent);
													break;
												}
											} else if (sc.getReference() instanceof TemporalReference && semanticContent.getContent() instanceof DateTimeDescription) {
												sc.setContent(semanticContent.getContent());
												newContents.add(sc);
											}

										}
									}
								}
								Iterator<SemanticContent> iterator = cf.getSemanticContent().iterator();
								while (iterator.hasNext()) {
									SemanticContent next = iterator.next();
									if (next.getContent() != null) {
										for (PObject pattern : matchingPatterns) {
											if (pattern.matches(next.getContent())) {
												iterator.remove();
												break;
											}
										}
									} else if (next.getReference() != null && next.getReference().getReferencePattern() != null) {
										for (PObject pattern : matchingPatterns) {
											if (EcoreUtil.equals(pattern, next.getReference().getReferencePattern())) {
												iterator.remove();
												break;
											}
										}
									}
								}
								cf.getSemanticContent().addAll(newContents);

								if (newContents.size() == numProvidedContents) {
									hypothesis.setCommunicativeFunction(cf);
									cf.setIsEllipsis(false);
									break;
								}
							}
						}
					}

					// content.getHypotheses().retainAll(Collections.singleton(hypothesis));
					workingMemory.getDiscourseHistory().add(0, content);
					for (WorkingMemoreChangeListener listener : listeners) {
						listener.changed(workingMemory);
					}
				}
			}
			dialogPlatformEventManager.postInputEvent(content, this);
		} else if (message instanceof OutputAct) {
			// output acts
			OutputAct outputAct = (OutputAct) message;
			outputAct.setPassedFade(true);
			CommunicativeFunction communicativeFunction = outputAct.getCommunicativeFunction();
			if (communicativeFunction != null) {
				List<SemanticContent> newEntities = new ArrayList<SemanticContent>();
				for (SemanticContent content : communicativeFunction.getSemanticContent()) {
					if (content.getResolved() == ResolveState.RESOLVED && content.getContent() != null) {
						newEntities.add(content);
					} else if (content.getResolved() == ResolveState.UNRESOLVED && content.getReference() instanceof KnowledgeBaseReference) {
						PObject pattern = content.getReference().getReferencePattern();
						List<Entity> entities = workingMemory.findMatchingPhysicalEntities(pattern, content.getReference().isIsMany(), true);
						if (!entities.isEmpty()) {
							content.setContent(EmfUtils.clone(entities.get(0)));
							content.setResolved(ResolveState.RESOLVED);
							for (int j = 1; j < entities.size(); ++j) {
								SemanticContent clone = EmfUtils.clone(content);
								clone.setContent(EmfUtils.clone(entities.get(j)));
								communicativeFunction.getSemanticContent().add(clone);
							}
							break;

						}
					}
				}
				updateWorkingMemory(newEntities, String.format("OutputAct: %s", outputAct.getId()));
			}
			dialogPlatformEventManager.postOutputEvent(outputAct, this);
			workingMemory.getDiscourseHistory().add(0, outputAct);
		}
	}

	protected void setDialogPlatformEventManager(DialogPlatformEventManager manager) {
		dialogPlatformEventManager = manager;
	}

	protected void unsetDialogPlatformEventManager(DialogPlatformEventManager manager) {
		dialogPlatformEventManager = null;
	}

	Set<EObject> alreadyEvaluated = new HashSet<EObject>(); // avoiding loops

	public void updateWorkingMemory(List<SemanticContent> entities, String description) {
		List<SemanticContent> clonedList = new ArrayList<SemanticContent>();
		for (SemanticContent entity : entities) {
			clonedList.add(EmfUtils.clone(entity));
		}
		if (!entities.isEmpty()) {
			workingMemory.updateDiscourseContext(clonedList, description);
			for (WorkingMemoreChangeListener listener : listeners) {
				listener.changed(workingMemory);
			}
		}
	}

	@Override
	public void reset() {
		workingMemory.clear();
		for (WorkingMemoreChangeListener listener : listeners) {
			listener.changed(workingMemory);
		}
	}

	List<WorkingMemoreChangeListener> listeners = new ArrayList<WorkingMemoreChangeListener>();

	public void registerChangeListener(WorkingMemoreChangeListener listener) {
		listeners.add(listener);
	}

	public WorkingMemory getWorkingMemory() {
		return workingMemory;
	}
}
