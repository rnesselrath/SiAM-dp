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
package de.dfki.iui.mmds.io.html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.device_manager.AbstractDeviceComponent;
import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.HtmlServlet;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GUIUpdate;
import de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate;
import de.dfki.iui.mmds.core.model.io.gui.MoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate;
import de.dfki.iui.mmds.core.model.io.gui.StyleUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UpdateInfo;
import de.dfki.iui.mmds.core.model.io.gui.WindowUpdate;
import de.dfki.iui.mmds.io.html.servlet.GUIRequestHandler;
import de.dfki.iui.mmds.io.html.util.HtmlRenderResult;
import de.dfki.iui.mmds.io.html.util.HtmlUpdateUtil;

public class HtmlGeneratorComponent extends AbstractDeviceComponent {

	@Override
	protected void handleEvent(OutputMessage message, Event event, MatchReport report) {
		if (message instanceof OutputAct) {
			// for (OutputRepresentation representation : ((OutputAct) message).getPresentation()) {
			// if (!siamIdToServiceMapping.containsKey(representation.getDevice().toString()))
			outputActEvent(null, ((OutputAct) message).getPresentation(), ((OutputAct) message), event);
			// }
		}
		super.handleEvent(message, event, report);
	}

	private GUIRequestHandler guiRequestHandler;

	public HtmlGeneratorComponent() {
	}

	@Override
	public void activate(ComponentContext context) {
		super.activate(context);
		this.guiRequestHandler = (GUIRequestHandler) context.locateService("GuiRequestHandler");
		staticPatterns.addAll(loadPattern("/SIAM-INF/gui_update.pattern"));
		updateSubscriptionPatterns();
	}

	@Override
	protected void outputActEvent(Service service, List<OutputRepresentation> representations, OutputAct message, Event event) {
		for (OutputRepresentation representation : representations)
			if (representation instanceof GUIApplication) {
				logger.info("Rendering application");
				String deviceId;
				if (representation.getDevice() == null) {
					logger.error("No device id provided");
					return;
				}
				deviceId = representation.getDevice().getValue();
				if (deviceId.isEmpty()) {
					logger.error("Device id is empty");
					return;
				}
				HtmlRenderResult res = new HtmlRenderer(componentContext).render((GUIApplication) representation, false, null);
				guiRequestHandler.handle(res, deviceId, message, event);
			} else if (representation instanceof GUIUpdate) {
				GUIUpdate update = (GUIUpdate) representation;
				logger.info("Processing update info");
				EList<UpdateInfo> updates = update.getUpdates();
				HtmlUpdateUtil updateUtil = new HtmlUpdateUtil();
				for (UpdateInfo u : updates) {
					String locDeviceId = null;
					if (update.getDevice() != null) {
						locDeviceId = update.getDevice().getValue();
					}
					if (locDeviceId == null) {
						logger.error("Device id is empty");
						continue;
					}
					if (u instanceof WindowUpdate) {
						logger.debug("Processing Window update event");
						if (((WindowUpdate) u).getWindow() != null) {
							HtmlRenderResult res = new HtmlRenderer(componentContext).renderWindow(((WindowUpdate) u).getWindow());
							guiRequestHandler.handle(res, locDeviceId, message, event);
						} else {
							logger.error("Empty window in the update event");
						}
					}
					if (u instanceof UIElementUpdate || u instanceof StyleUpdate) {
						logger.info("Processing UI element update");
						List<JSONObject> uData = updateUtil.doSwitch(u);
						guiRequestHandler.handle(uData, locDeviceId, message, event);
					}
					if (u instanceof JavaScriptUpdate) {
						logger.info("Processing java script update");
						JavaScriptUpdate jsu = (JavaScriptUpdate) u;
						List<JSONObject> uData = new ArrayList<JSONObject>(jsu.getScript().size());
						for (BString script : jsu.getScript()) {
							JSONObject scriptObj = new JSONObject();
							scriptObj.put("script", script.getValue());
							uData.add(scriptObj);
						}
						guiRequestHandler.handle(uData, locDeviceId, message, event);
					}
					if (u instanceof StyleSheetUpdate) {
						logger.info("Processing update stylesheet event");
						guiRequestHandler.handle((StyleSheetUpdate) u, locDeviceId, message, event);
					}
					if (u instanceof RemoveUIElement) {
						logger.info("Processing remove UI element event");
						guiRequestHandler.handle((RemoveUIElement) u, locDeviceId, message, event);
					}
					if (u instanceof AddUIElement) {
						logger.info("Processing add UI element event");
						AddUIElement addEl = (AddUIElement) u;
						if (addEl.getNewElement() != null || addEl.getNewElementRef() != null) {
							HtmlRenderResult res = new HtmlRenderer(componentContext).renderElement(addEl.getNewElement() != null ? addEl.getNewElement() : addEl.getNewElementRef());
							guiRequestHandler.handle(addEl, res, locDeviceId, message, event);
						} else {
							logger.error("Empty new element data in the add element event");
						}
					}
					if (u instanceof MoveUIElement) {
						logger.info("Processing move UI element event");
						guiRequestHandler.handle((MoveUIElement) u, locDeviceId, message, event);
					}
				}
			}
	}

	Map<String, Service> uriFragmentToService = new HashMap<String, Service>();

	@Override
	public void connect(Service service) {
		if (service instanceof SimpleService) {
			uriFragmentToService.put(((HtmlServlet) service.getServiceInstance().getCommunicationinfo()).getFragmentName() + '/' + service.getServiceName(), service);
			connected((SimpleService) service);
		} else
			throw new IllegalArgumentException("Service is no SimpleService");
	}

	@Override
	public void disconnect(Service service) {
		uriFragmentToService.remove(((HtmlServlet) service.getServiceInstance().getCommunicationinfo()).getFragmentName() + '/' + service.getServiceName());
		disconnected(service);
	}

	@Override
	protected void updateDeviceModeEvent(Service service, UpdateDeviceMode update, Event event) {
		// TODO do nothing
		
	}

	@Override
	protected ServiceInstance fillServiceInstanceInformation(ServiceInstance serviceInstance) {
		return null;
	}

}
