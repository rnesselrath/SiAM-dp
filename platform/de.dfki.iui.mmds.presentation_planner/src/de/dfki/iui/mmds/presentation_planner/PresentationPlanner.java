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
package de.dfki.iui.mmds.presentation_planner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager.PREPROCESSOR_PRIORITY;
import de.dfki.iui.mmds.core.events.OutputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.interfaces.IPresentationPlanner;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;
import de.dfki.iui.mmds.core.interfaces.ISessionManager;
import de.dfki.iui.mmds.core.ioMapping.SubruleMapper;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.project.OutputMappingRule;
import de.dfki.iui.mmds.core.model.project.OutputMappingRules;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;

public class PresentationPlanner extends OutputEventHandler implements IPresentationPlanner {

	private IDeviceManager deviceManager;
	private ISessionManager sessionManager;
	private IResourceManager resourceManager;
	private SubruleMapper subruleMapper;
	private EvaluationService evaluationService;
	private final List<OutputMappingRule> outputMappings = new ArrayList<OutputMappingRule>();

	@Override
	protected void activate(ComponentContext context) {

		setPreprocessor(true, PREPROCESSOR_PRIORITY.EARLY);

		super.activate(context);
		this.subscribe("SIAM-INF/presentation_planner.pattern");
		deviceManager = ((IDeviceManager) componentContext.locateService("IDeviceManager"));
		sessionManager = ((ISessionManager) componentContext.locateService("ISessionManager"));
		resourceManager = ((IResourceManager) componentContext.locateService("IResourceManager"));
		evaluationService = ((EvaluationService) componentContext.locateService("EvaluationService"));
		subruleMapper = new SubruleMapper(evaluationService);
	}

	public void registerMappings(OutputMappingRules rules) {
		outputMappings.addAll(rules.getRules());
		subruleMapper.registerMappings(rules.getSubrules());
	}

	@Override
	protected void handleEvent(OutputMessage message, Event event, MatchReport report) {
		if (message instanceof OutputAct) {
			OutputAct outputAct = (OutputAct) message;

			if (outputAct.getPresentation().isEmpty()) {
				// First Pattern. Only a hypothesis is given. Presentations must be generated
				Set<DialogParticipant> addressees = new HashSet<DialogParticipant>();
				for (BString a : outputAct.getAddressee()) {
					DialogParticipant participant = sessionManager.getParticipant(a.toString());
					if (participant != null)
						addressees.add(participant);
				}
				if (addressees.isEmpty() && !BString.isNullOrEmpty(outputAct.getSession())) {
					// if no addressee is given, collect participants that are group members
					BString session = outputAct.getSession();
					List<DialogParticipant> participants = sessionManager.retrieveParticipantsForSession(session.toString());
					participants.forEach(s -> addressees.add(s));
				}

				if (!addressees.isEmpty()) {
					// collect output representation types that are supported by the user interfaces of the participants
					Set<EClass> supportedRepresentations = new HashSet<EClass>();
					Set<SiamInternalServiceInterface> interfacesToFeed = new HashSet<SiamInternalServiceInterface>();
					Map<String, SimpleService> connectedDevices = deviceManager.getConnectedServices();

					for (DialogParticipant addressee : addressees) {
						for (String key : connectedDevices.keySet()) {
							SiamInternalServiceInterface siamInterface = deviceManager.getSiamInternalInterface(key);
							if (!IoPackage.eINSTANCE.getOutputRepresentation().isSuperTypeOf(siamInterface.getServiceType()))
								continue;
							if (connectedDevices.get(key).getUser().stream().anyMatch(user -> user.getParticipantId().equals(addressee.getParticipantId())))
								supportedRepresentations.add(siamInterface.getServiceType());
							interfacesToFeed.add(siamInterface);
						}
					}

					HashMap<EClass, List<OutputRepresentation>> representations = new HashMap<EClass, List<OutputRepresentation>>();
					// generate output representations for supported representations
					if (!supportedRepresentations.isEmpty()) {
						CommunicativeFunction cf = (CommunicativeFunction) report.variables.get("commFunction");
						for (OutputMappingRule mapping : outputMappings) {
							if (!mapping.isActive())
								continue;
							Set<EClass> intersection = new HashSet<EClass>();
							for (OutputRepresentation target : mapping.getTarget()) {
								if (supportedRepresentations.stream().anyMatch(s -> s.isSuperTypeOf(target.eClass())) && !representations.containsKey(target.eClass()))
									intersection.add(target.eClass());
							}

							if (!intersection.isEmpty()) {
								MatchReport matchReport = Matches.matches(cf, mapping.getCondition());
								if (matchReport.result == MatchResult.MATCH_SUCCESS) {
									// pattern is correct
									Map<String, Object> context = new HashMap<String, Object>(matchReport.variables);
									context.put("Subrules", subruleMapper);
									for (OutputRepresentation target : mapping.getTarget()) {
										// target is required
										if (intersection.stream().anyMatch(i -> i.isSuperTypeOf(target.eClass()))) {
											List<EObject> results = evaluationService.evaluateContents(target, context);
											if (!results.isEmpty()) {
												List<OutputRepresentation> r = new ArrayList<OutputRepresentation>();
												for (EObject result : results) {
													if (result instanceof OutputRepresentation)
														r.add((OutputRepresentation) result);
												}
												representations.put(target.eClass(), r);
											}
										}
									}
								}
							}
						}
					}
					// add representations to output act
					for (SiamInternalServiceInterface i : interfacesToFeed) {
						Optional<EClass> optional = representations.keySet().stream().filter(key -> i.getServiceType().isSuperTypeOf(key)).findFirst();
						if (optional.isPresent()) {
							List<OutputRepresentation> list = representations.get(optional.get());
							SimpleService simpleService = connectedDevices.get(i.getSiamId().toString());
							for (OutputRepresentation r : list) {
								OutputRepresentation clone = EmfUtils.clone(r);
								clone.setDevice(i.getSiamId());
								clone.setServiceInstance(simpleService.getServiceInstance().getServiceInstanceName());
								clone.setServiceName(simpleService.getServiceName().toString());
								outputAct.getPresentation().add(clone);
							}
						}
					}
				} else if (BString.isNullOrEmpty(outputAct.getSession())) {
					// no addressee is given or addressee is not in the knowledge base. search for matching mapping rule and use all output representations of this rule
					CommunicativeFunction cf = (CommunicativeFunction) report.variables.get("commFunction");
					for (OutputMappingRule mapping : outputMappings) {
						if (!mapping.isActive())
							continue;
						MatchReport matchReport = Matches.matches(cf, mapping.getCondition());
						if (matchReport.result == MatchResult.MATCH_SUCCESS) {
							// pattern is correct
							Map<String, Object> context = new HashMap<String, Object>(matchReport.variables);
							context.put("Subrules", subruleMapper);
							for (OutputRepresentation target : mapping.getTarget()) {
								List<EObject> results = evaluationService.evaluateContents(target, context);
								for (EObject result : results)
									outputAct.getPresentation().add((OutputRepresentation) result);
							}
							break;
						}
					}
				}
			}

			//
			for (OutputRepresentation presentation : outputAct.getPresentation()) {
				// if no language is set use standard language
				if (BString.isNullOrEmpty(presentation.getLanguage())) {
					presentation.setLanguage(new BString(resourceManager.getLanguage()));
				}
				// find devices that can handle the presentation type if no device is set
				if (BString.isNullOrEmpty(presentation.getDevice())) {
					List<String> devices = null;
					List<OutputRepresentation> additionalRepresentations = new ArrayList<OutputRepresentation>();
					devices = deviceManager.findServiceForType(presentation.eClass());
					for (int i = 0; i < devices.size(); ++i) {
						if (i == 0) {
							presentation.setDevice(new BString(devices.get(i)));
						} else {
							OutputRepresentation newPresentation = EcoreUtil.copy(presentation);
							newPresentation.setDevice(new BString(devices.get(i)));
							additionalRepresentations.add(newPresentation);
						}
					}
					outputAct.getPresentation().addAll(additionalRepresentations);
				}
			}
		} else if (message instanceof UpdateDeviceMode) {

			UpdateDeviceMode updateDeviceMode = (UpdateDeviceMode) message;

			List<String> devices = null;

			if (IoPackage.eINSTANCE.getUpdateGrammar().isInstance(updateDeviceMode.getDeviceMode())) {
				devices = deviceManager.findServiceForType(Io_interfacesPackage.eINSTANCE.getSpeech());
			}

			if (devices != null && !devices.isEmpty()) {
				updateDeviceMode.setDevice(new BString(devices.get(0)));
				if (devices.size() > 1)
					throw new UnsupportedOperationException("Muss noch implentiert werden. Events für andere devices feuern!");
			}
		}
	}

}
