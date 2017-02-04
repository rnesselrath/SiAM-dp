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
package de.dfki.iui.mmds.core.device_manager;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.events.OutputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IDeviceComponent;
import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.ISessionManager;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.Session;
import de.dfki.iui.mmds.core.model.io.CustomMessage;
import de.dfki.iui.mmds.core.model.io.DeviceStateChanged;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OSGIBundle;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.pattern.PObject;
import de.dfki.iui.mmds.core.model.pattern.PPattern;
import de.dfki.iui.mmds.core.model.pattern.PRestrictions;
import de.dfki.iui.mmds.core.model.pattern.PStringRestriction;
import de.dfki.iui.mmds.core.model.pattern.PSubscription;
import de.dfki.iui.mmds.core.model.pattern.PatternFactory;

public abstract class AbstractDeviceComponent extends OutputEventHandler implements IDeviceComponent {

	protected IDeviceManager deviceManager = null;
	protected IKnowledgeManager knowledgeManager = null;
	protected ISessionManager sessionManager = null;
	public List<String> connectedServices = Collections.synchronizedList(new ArrayList<String>());
	public HashMap<String, SimpleService> siamIdToServiceMapping = new HashMap<String, SimpleService>();
	public HashMap<String, String> serviceToSiamIdMapping = new HashMap<String, String>();
	private PSubscription patternTemplate;
	protected List<PPattern> staticPatterns = new ArrayList<PPattern>();
	protected ServiceInstance serviceInstance; 

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		if (deviceManager == null)
			deviceManager = (IDeviceManager) context.locateService("IDeviceManager");
		if (deviceManager == null) {
			Logger.getLogger(getClass())
					.error(String.format(
							"IDeviceManager for component %s in bundle %s not registered. Add the IDeviceManager to the referenced services in the declarative component description!",
							context.getProperties().get("component.name"),
							context.getBundleContext().getBundle().getSymbolicName()));
		}
		URL patternUrl = deviceManager.getComponentContext().getBundleContext().getBundle()
				.getEntry("/SIAM-INF/abstract_device_component.pattern");
		try {
			Resource resource = EmfPersistence.readFromUri(URI.createURI(patternUrl.toString()));
			patternTemplate = ((PSubscription) resource.getContents().get(0));
		} catch (IOException e) {
			logger.warn("Error loading subscription pattern: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		knowledgeManager = (IKnowledgeManager) context.locateService("IKnowledgeManager");
		if (knowledgeManager == null) {
			Logger.getLogger(getClass())
					.error(String.format(
							"IKnowledgeManager for component %s in bundle %s not registered. Add the IKnowledgeManager to the referenced services in the declarative component description!",
							context.getProperties().get("component.name"),
							context.getBundleContext().getBundle().getSymbolicName()));
		}
		sessionManager = (ISessionManager) context.locateService("ISessionManager");
		if (sessionManager == null) {
			Logger.getLogger(getClass())
					.error(String.format(
							"ISessionManager for component %s in bundle %s not registered. Add the ISession to the referenced services in the declarative component description!",
							context.getProperties().get("component.name"),
							context.getBundleContext().getBundle().getSymbolicName()));
		}
		serviceInstance = IoFactory.eINSTANCE.createServiceInstance();
		serviceInstance = fillServiceInstanceInformation(serviceInstance);
		if (serviceInstance != null) {
			OSGIBundle bundleInfo = IoFactory.eINSTANCE.createOSGIBundle();
			bundleInfo.setBundleName(this.getClass().getName());
			serviceInstance.setCommunicationinfo(bundleInfo);
		}
	}

	public void detectServices() {
		if (serviceInstance != null) {
			String entityID = knowledgeManager.addEntity(serviceInstance);
			serviceInstance.setENTITY_ID(entityID);
		}
	}

	@Override
	protected void deactivate() {
		super.deactivate();
		if (serviceInstance != null)
			knowledgeManager.removeEntity(serviceInstance.getENTITY_ID());
		deviceManager = null;
		knowledgeManager = null;
	}

	@Override
	protected void handleEvent(OutputMessage output, Event event, MatchReport report) {
		if (output instanceof OutputAct) {
			for (String siamID : connectedServices) {
				List<OutputRepresentation> representations = new ArrayList<OutputRepresentation>();
				for (OutputRepresentation representation : ((List<OutputRepresentation>) report.variables
						.get("representation"))) {
					if (representation.getDevice().equals(siamID)) {
						representations.add(representation);
					}
				}
				if (!representations.isEmpty()) {
					Service service = siamIdToServiceMapping.get(siamID);
					outputActEvent(service, representations, (OutputAct) output, event);
				}
			}

		} else if (output instanceof UpdateDeviceMode) {
			for (String siamID : connectedServices) {
				UpdateDeviceMode update = (UpdateDeviceMode) output;
				if (update.getDevice().equals(siamID)) {
					Service service = siamIdToServiceMapping.get(siamID);
					updateDeviceModeEvent(service, update, event);
					break;
				}
			}
		}
	}

	protected abstract void outputActEvent(Service service, List<OutputRepresentation> representations,
			OutputAct message, Event event);

	protected abstract void updateDeviceModeEvent(Service service, UpdateDeviceMode update, Event event);

	protected abstract ServiceInstance fillServiceInstanceInformation(ServiceInstance serviceInstance);

	protected String findSiamIdForService(Service service) {
		for (String key : siamIdToServiceMapping.keySet()) {
			Service value = siamIdToServiceMapping.get(key);
			if (service.getServiceName().equals(value.getServiceName())
					&& service.getServiceInstance().getENTITY_ID().equals(value.getServiceInstance().getENTITY_ID()))
				return key;
		}
		return null;
	}

	void connect(String siamId, SimpleService service) {
		siamIdToServiceMapping.put(siamId, service);
		serviceToSiamIdMapping.put(service.getUniqueId(), siamId);
		connect(service);
	}

	abstract public void connect(Service service);

	protected void connected(SimpleService service) {
		// build patterns first for output acts
		String siamId = findSiamIdForService(service);
		if (siamId != null) {
			logger.info(String.format("Service with name '%s' connected to siam interface '%s'.",
					service.getServiceName(), siamId));
			connectedServices.add(siamId);
			updateSubscriptionPatterns();
			deviceManager.deviceConnected(siamId, service);
		}
	}

	protected void updateSubscriptionPatterns() {
		clearPatterns();
		if (!connectedServices.isEmpty()) {
			PObject outputActPattern = EmfUtils.clone((PObject) patternTemplate.getPatterns().get(0));
			PObject updateDeviceModePattern = EmfUtils.clone((PObject) patternTemplate.getPatterns().get(1));

			PRestrictions restrictions1 = outputActPattern.getSlot().get(1).getRangeObject().getSlot().get(0)
					.getRangeValue().getRestrictions();
			PRestrictions restrictions2 = updateDeviceModePattern.getSlot().get(0).getRangeValue().getRestrictions();

			for (String device : connectedServices) {
				PStringRestriction stringRestriction = PatternFactory.eINSTANCE.createPStringRestriction();
				stringRestriction.setValue(new BString(device));
				restrictions1.getRestriction().add(stringRestriction);
				restrictions2.getRestriction().add(EmfUtils.clone(stringRestriction));
			}
			subscribe(outputActPattern);
			subscribe(updateDeviceModePattern);
		}
		for (PPattern pattern : staticPatterns)
			subscribe(pattern);
	}

	void disconnect(String siamId) {
		SimpleService service = siamIdToServiceMapping.get(siamId);
		disconnect(service);
		serviceToSiamIdMapping.remove(service.getUniqueId());
	}

	protected abstract void disconnect(Service service);

	protected void disconnected(Service service) {
		String siamId = findSiamIdForService(service);
		connectedServices.remove(siamId);
		updateSubscriptionPatterns();
		deviceManager.deviceDisconnected(siamId);
	}

	protected void postInputMessage(Message inputMessage) {
		if (inputMessage instanceof InputAct) {
			InputAct inputAct = (InputAct) inputMessage;
			for (InputRepresentation rep : inputAct.getRepresentation()) {
				// find siam internal device id for input representation
				if (BString.isNullOrEmpty(rep.getDevice()) && rep.getServiceInstance() != null
						&& rep.getServiceName() != null) {
					String siamId = serviceToSiamIdMapping.get(rep.getServiceInstance() + '#' + rep.getServiceName());
					if (siamId == null)
						logger.warn(String.format(
								"Received an input message from a device that is not conntected to a registered siam service interface. ServiceInstanceId: %s, ServiceName: %s",
								rep.getServiceInstance(), rep.getServiceName()));
					else
						rep.setDevice(new BString(siamId));
				}
			}
			BString initiator = inputAct.getInitiator();
			// find the user the input. we assume that only one person is
			// originator of the input act, so it is sufficient to
			// analyze the first representation
			if (initiator == null && !inputAct.getRepresentation().isEmpty()) {
				InputRepresentation rep = inputAct.getRepresentation().get(0);
				List<DialogParticipant> participants = sessionManager
						.retrieveParticipantForService(rep.getServiceInstance(), rep.getServiceName());
				if (participants.size() == 1) {
					// can only decide if service is used by exactly one
					// participant
					inputAct.setInitiator(participants.get(0).getParticipantId());
					initiator = inputAct.getInitiator();
				}
			}
			// if a user is available we can determine the session
			if (!BString.isNullOrEmpty(initiator) && BString.isNullOrEmpty(inputAct.getSession())) {
				List<Session> sessions = sessionManager.retrieveSessionsForParticipant(initiator.toString());
				if (sessions.size() == 1) {
					// can only detect session if user participates in only one
					// session
					inputAct.setSession(sessions.get(0).getSessionID());
				}
			}

			eventService.postInputEvent(inputAct, this);
		} else if (inputMessage instanceof DeviceStateChanged)

		{
			DeviceStateChanged input = (DeviceStateChanged) inputMessage;
			String siamId = serviceToSiamIdMapping.get(input.getServiceInstanceId() + '#' + input.getServiceName());
			input.setDevice(new BString(siamId));
			eventService.postInputEvent(input, this);
		} else if (inputMessage instanceof CustomMessage)

		{
			eventService.postCustomEvent((CustomMessage) inputMessage, this);
		}
	}

}
