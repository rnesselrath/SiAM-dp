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
package de.dfki.iui.mmds.core.display_context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.emf.datatypes.BDataType;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.events.OutputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IDisplaxContextService;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.gui.AbstractContainer;
import de.dfki.iui.mmds.core.model.io.gui.AdapterMapping;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter;
import de.dfki.iui.mmds.core.model.io.gui.Container;
import de.dfki.iui.mmds.core.model.io.gui.ElementAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GUIUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io.gui.MoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UpdateInfo;
import de.dfki.iui.mmds.core.model.io.gui.WindowUpdate;
import de.dfki.iui.mmds.core.model.pattern.PPattern;

public class DisplayContextService extends OutputEventHandler implements IDisplaxContextService {

	HashMap<String, GUIApplication> currentContexts = new HashMap<String, GUIApplication>();
	GuiInputInterpreter inputInterpreter;

	@Override
	public void activate(ComponentContext context) {
		super.activate(context);
		this.setPreprocessor(true);
		subscribe("/SIAM-INF/display_context.pattern");

		inputInterpreter = new GuiInputInterpreter(this);
		inputInterpreter.activate(context);
	}

	@Override
	protected void handleEvent(OutputMessage message, Event event, MatchReport report) {
		for (OutputRepresentation representation : ((OutputAct) message).getPresentation()) {
			BString device = representation.getDevice();
			if (device == null || device.isEmpty()) {
				logger.warn(
						"No device defined for GUI Output request.\n" + EmfPersistence.writeToString(representation));
			} else {
				if (representation instanceof GUIApplication) {
					logger.info("Create new display context for device: " + device);
					resolveAdapterBindings(((GUIApplication) representation).getWindow(), null);
					currentContexts.put(device.toString(), (GUIApplication) representation);
				} else if (representation instanceof GUIUpdate) {
					logger.info("Updating display context for device: " + device);
					for (UpdateInfo updateInfo : ((GUIUpdate) representation).getUpdates()) {
						if (currentContexts.containsKey(device.toString())) {
							performUpdate(device.toString(), updateInfo);
						} else {
							logger.warn(String.format(
									"Cannot update device context for device %s. Device content is not available",
									device));
						}
					}
					((GUIUpdate) representation).setValidated(true);
				}
			}
		}
	}

	private void performUpdate(String device, UpdateInfo updateInfo) {
		if (updateInfo instanceof WindowUpdate) {
			GUIApplication application = currentContexts.get(device);
			resolveAdapterBindings(((WindowUpdate) updateInfo).getWindow(), null);
			application.setWindow(((WindowUpdate) updateInfo).getWindow());
		} else if (updateInfo instanceof UIElementUpdate) {
			UIElementUpdate uEvt = (UIElementUpdate) updateInfo;
			if (uEvt.getId() == null || uEvt.getId().getValue().isEmpty()) {
				logger.error("No element id specified in UIElementUpdate");
				return;
			}
			BString id = uEvt.getId();
			UIElement uiElement = findUiElement(getCurrentDisplayContext(device).getWindow(), id.toString());
			if (uiElement == null) {
				logger.warn(String.format("Display Context for device %s does not contain an UiElement with id %s",
						device, id));
			} else {
				updateUiElementGeneric(uiElement, (UIElementUpdate) updateInfo);
			}
		} else if (updateInfo instanceof AddUIElement) {
			AddUIElement addElEvt = (AddUIElement) updateInfo;
			if (addElEvt.getParentId() == null || addElEvt.getParentId().getValue().isEmpty()) {
				logger.error("The id of parent element to attach a child has not been specified");
				return;
			}
			BString parentId = addElEvt.getParentId();
			UIElement parentEl = findUiElement(getCurrentDisplayContext(device).getWindow(), parentId.getValue());
			if (parentEl == null) {
				logger.error("No parent element found to attach the child");
				return;
			}
			if (addElEvt.getNewElement() == null && addElEvt.getNewElementRef() == null) {
				logger.error("No new element provided for AddUIElement");
				return;
			}
			if (parentEl instanceof AbstractContainer) {
				logger.info("Adding child element a container parent " + parentId);
				((AbstractContainer) parentEl).addChild(EmfUtils.clone(addElEvt.getNewElement() != null ? addElEvt.getNewElement() : addElEvt.getNewElementRef()));
			} else {
				logger.info("Cannot add child elements to non container parent " + parentId);
			}
		} else if (updateInfo instanceof RemoveUIElement) {
			RemoveUIElement rm = (RemoveUIElement) updateInfo;
			if (rm.getElementId() != null && !rm.getElementId().getValue().isEmpty()) {
				if (!removeUiElement(getCurrentDisplayContext(device).getWindow(), rm.getElementId().getValue())) {
					logger.error("No element with id " + rm.getElementId() + " found removing UI element");
				}
			} else {
				logger.error("No element id provided while removing UI element");
			}
		} else if (updateInfo instanceof MoveUIElement) {
			MoveUIElement m = (MoveUIElement) updateInfo;
			
			if (m.getElementId() == null || m.getElementId().getValue().isEmpty()) {
				logger.error("No element id provided for moving UI element");
			}
			if (m.getNewParentId() == null || m.getNewParentId().getValue().isEmpty()) {
				logger.error("No new parent id provided for moving UI element");
			}
			
			if (!moveUiElement(getCurrentDisplayContext(device).getWindow(), m.getNewParentId().getValue(), m.getElementId().getValue(), m.getPosition() == null ? -1 : m.getPosition().getValue())) {
				logger.error("No element with id " + m.getElementId() + " found removing UI element");
			}
		}
	}

	// if method is called for an array adapter, the array context is given.
	// otherwise it should be null
	private void resolveAdapterBindings(AbstractContainer container, Map<String, Object> containerContext) {
		JexlEngine jexl = new JexlEngine();
		for (UIElement element : container.contains()) {
			// each element has its own context
			Map<String, Object> context = new HashMap<String, Object>();
			if (containerContext != null) {
				context.putAll(containerContext);
			}
			ElementAdapter elementAdapter = element.getAdapter();
			if (elementAdapter != null) {
				if (elementAdapter.getPattern() != null) {
					MatchReport matchReport = findMatchingContent(elementAdapter.getPattern(), element);
					if (matchReport != null) {
						for (String key : matchReport.variables.keySet()) {
							context.put(key, matchReport.variables.get(key));
						}
					}
				}
				if (!elementAdapter.getAdapterMapping().isEmpty()) {
					JexlContext jc = new MapContext();
					for (String key : context.keySet()) {
						jc.set(key, context.get(key));
					}

					for (AdapterMapping mapping : elementAdapter.getAdapterMapping()) {
						String jexlExp = mapping.getExpression();
						Expression e = jexl.createExpression(jexlExp);

						Object value = e.evaluate(jc);
						EStructuralFeature eStructuralFeature = element.eClass()
								.getEStructuralFeature(mapping.getFeature());
						EClassifier targetType = eStructuralFeature.getEType();
						if (targetType.getInstanceClass().getSuperclass() == BDataType.class) {
							try {
								BDataType<?> b = (BDataType<?>) targetType.getInstanceClass().newInstance();
								b.setValue(value.toString());
								value = b;
							} catch (InstantiationException | IllegalAccessException e1) {
								e1.printStackTrace();
							}
						}
						setUiElementFeature(element, mapping.getFeature(), value);
					}
				}
				element.setAdapter(null);
			}
			if (element instanceof AbstractContainer && ((AbstractContainer) element).getArrayAdapter() != null) {
				ArrayAdapter arrayAdapter = ((AbstractContainer) element).getArrayAdapter();
				((AbstractContainer) element).setArrayAdapter(null);
				MatchReport matchReport = findMatchingContent(arrayAdapter.getPattern(), element);
				if (matchReport.result == MatchResult.MATCH_SUCCESS) {
					int i = 0;
					for (String key : matchReport.variables.keySet()) {
						context.put(key, matchReport.variables.get(key));
					}
					JexlContext jc = new MapContext();
					for (String key : context.keySet()) {
						jc.set(key, context.get(key));
					}
					String jexlExp = arrayAdapter.getExpression();
					if (jexlExp != null) {
						Expression e = jexl.createExpression(jexlExp);
						Object value = e.evaluate(jc);

						if (value instanceof Iterable) {
							for (Object content : (Iterable<?>) value) {
								if (content instanceof Entity) {
									Entity entity = (Entity) content;
									UIElement arrayElement = EmfUtils.clone(arrayAdapter.getElement());
									arrayElement.getSemanticContent().add(entity);
									arrayElement.setId(new BString(String.format("%s_%d",
											element.getId() != null ? element.getId().toString() : "null", i++)));
									if (element instanceof de.dfki.iui.mmds.core.model.io.gui.List) {
										((de.dfki.iui.mmds.core.model.io.gui.List) element).getItem()
												.add((ListItem) arrayElement);
									} else if (element instanceof Container) {
										((de.dfki.iui.mmds.core.model.io.gui.Container) element).addChild(arrayElement);
									}
								} else {
									logger.error(String.format(
											"Result of expression \"%s\" of array adapter in element %s does not contain instances of type Entity!",
											arrayAdapter.getExpression(),
											element.getId() != null ? element.getId().toString() : "null"));
								}
							}
						} else {
							logger.warn(String.format(
									"Result of expression \"%s\" of array adapter in element %s is not an interable!",
									arrayAdapter.getExpression(),
									element.getId() != null ? element.getId().toString() : "null"));
							if (value instanceof Entity) {
								Entity entity = (Entity) value;
								UIElement arrayElement = EmfUtils.clone(arrayAdapter.getElement());
								arrayElement.getSemanticContent().add(entity);
								if (element instanceof de.dfki.iui.mmds.core.model.io.gui.List) {
									((de.dfki.iui.mmds.core.model.io.gui.List) element).getItem()
											.add((ListItem) arrayElement);
								} else if (element instanceof Container) {
									((de.dfki.iui.mmds.core.model.io.gui.Container) element).addChild(arrayElement);
								}
							} else {
								logger.error(String.format(
										"Result of expression \"%s\" of array adapter in element %s does not contain instances of type Entity!",
										arrayAdapter.getExpression(),
										element.getId() != null ? element.getId().toString() : "null"));
							}
						}
					}
				}
			}
			if (element instanceof AbstractContainer) {
				resolveAdapterBindings((AbstractContainer) element, context);
			}
		}
	}

	private MatchReport findMatchingContent(PPattern pattern, UIElement element) {
		for (Entity entity : element.getSemanticContent()) {
			MatchReport matchReport = Matches.matches(entity, pattern);
			if (matchReport.result == MatchResult.MATCH_SUCCESS)
				return matchReport;
		}
		if (element.eContainer() != null)
			return findMatchingContent(pattern, (UIElement) element.eContainer());

		return null;
	}

	private void updateUiElementGeneric(UIElement uiElement, UIElementUpdate updateInfo) {
		final EList<EStructuralFeature> allEStructFeats = updateInfo.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature esf : allEStructFeats) {
			if (!updateInfo.eIsSet(esf)) {
				continue;
			}
			if (esf.getName() == "id") {
				continue;
			}

			Object value = updateInfo.eGet(esf);

			if (!setUiElementFeature(uiElement, esf.getName(), value)) {
				logger.error("Failed to change feature value: " + uiElement.getId().getValue());
			}
		}
	}

	private boolean setUiElementFeature(UIElement uiElement, String featureName, Object value) {
		EStructuralFeature structuralFeature = uiElement.eClass().getEStructuralFeature(featureName);
		try {
			uiElement.eSet(structuralFeature, value);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.display_context.IDisplaxContextService#
	 * getCurrentDisplayContext(java.lang.String)
	 */
	@Override
	public GUIApplication getCurrentDisplayContext(String deviceId) {
		return currentContexts.get(deviceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.display_context.IDisplaxContextService#
	 * sendCurrentDisplayContent(java.lang.String)
	 */
	@Override
	public void sendCurrentDisplayContent(String id) {
		GUIApplication currentContext = currentContexts.get(id);
		if (currentContext != null) {
			OutputAct act = IoFactory.eINSTANCE.createOutputAct();
			act.getPresentation().add(currentContext);
			currentContext.setDevice(new BString(id));
			this.eventService.postOutputEvent(act, this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.display_context.IDisplaxContextService#
	 * getDeviceList ()
	 */
	@Override
	public List<String> getDeviceList() {
		return new ArrayList<String>(currentContexts.keySet());
	}

	@Override
	public UIElement findUiElement(AbstractContainer container, String id) {
		if (container.getId() != null && container.getId().equals(id))
			return container;
		for (UIElement element : container.contains()) {
			if (element instanceof AbstractContainer) {
				UIElement result = findUiElement((AbstractContainer) element, id);
				if (result != null)
					return result;
			} else if (element.getId() != null && element.getId().equals(id))
				return element;
		}
		return null;
	}

	/**
	 * 
	 * @param container
	 * @param id
	 * @return
	 */
	private boolean removeUiElement(AbstractContainer container, String id) {
		if (container == null || container.contains() == null)
			return false;
		for (UIElement element : container.contains()) {
			if (element.getId() != null && element.getId().equals(id))
				return container.removeChild(element);
			if (element instanceof AbstractContainer) {
				boolean found = removeUiElement((AbstractContainer) element, id);
				if (found) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	private boolean moveUiElement(AbstractContainer container, String newParentId, String id, int pos) {
		if (container == null || container.contains() == null)
			return false;
		UIElement element = findUiElement(container, id);
		if (element == null) {
			return false;
		}
		UIElement parent = findUiElement(container, newParentId);
		if (!(parent instanceof AbstractContainer)) {
			return false;
		}
		if (pos == -1) {
			return ((AbstractContainer) parent).contains().add(element);
		}
		((AbstractContainer) parent).contains().add(pos, element);
		return true;
	}
}
