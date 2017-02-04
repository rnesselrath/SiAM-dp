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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.exceptions.DeviceManagerException;
import de.dfki.iui.mmds.core.interfaces.IDeviceComponent;
import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.interfaces.IDisplaxContextService;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManagerListener;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.Modality;
import de.dfki.iui.mmds.core.model.io.CommunicationInfo;
import de.dfki.iui.mmds.core.model.io.HtmlServlet;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.OSGIBundle;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.TCPServer;
import de.dfki.iui.mmds.core.model.io.TECSDirectService;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;

public class DeviceManager implements IDeviceManager, IKnowledgeManagerListener {

	private GenericTCPDeviceConnector tcpConnector;
	private IDisplaxContextService displayContextService;
	private IGrammarManagementService grammarManagementService;
	private DialogPlatformEventManager eventManager;
	// private DialogPlatformEventManager eventManger;
	private final Logger logger = Logger.getLogger(getClass());
	private ComponentContext context;

	private Map<String, IDeviceComponent> availableDeviceComponents = new HashMap<String, IDeviceComponent>();
	private HashMap<String, SiamInternalServiceInterface> registeredDevices = new HashMap<String, SiamInternalServiceInterface>();
	private Map<String, SimpleService> discoveredServices = new HashMap<String, SimpleService>();
	private Map<String, SimpleService> connectedServices = new HashMap<String, SimpleService>();
	private HashMap<String, AbstractDeviceComponent> serviceToComponentMapping = new HashMap<String, AbstractDeviceComponent>();

	protected void activate(ComponentContext context) {
		this.context = context;
		tcpConnector = new GenericTCPDeviceConnector();
		tcpConnector.activate(context, this);
		displayContextService = (IDisplaxContextService) context.locateService("DisplayContextService");
		eventManager = ((DialogPlatformEventManager) context.locateService("DialogPlatformEventManager"));
	}

	protected void deactivate() {
		eventManager = null;
		displayContextService = null;
		tcpConnector.deactivate();
		tcpConnector = null;
		context = null;

		availableDeviceComponents.clear();
		connectedServices.clear();
		discoveredServices.clear();
		registeredDevices.clear();
		serviceToComponentMapping.clear();
	}

	public ComponentContext getComponentContext() {
		return context;
	}

	protected synchronized void bindKnowledgeManager(IKnowledgeManager manager) {
		List<ServiceInstance> serviceInstances = (List<ServiceInstance>) manager
				.getEntitiesOfType(IoPackage.eINSTANCE.getServiceInstance());

		for (ServiceInstance serviceInstance : serviceInstances) {
			for (Service service : serviceInstance.getServices())
				if (service instanceof SimpleService)
					deviceDiscovered((SimpleService) service);
		}
		manager.registerForType(IoPackage.eINSTANCE.getServiceInstance(), this);
	}

	protected synchronized void unbindKnowledgeManager(IKnowledgeManager manager) {
		List<ServiceInstance> serviceInstances = (List<ServiceInstance>) manager
				.getEntitiesOfType(IoPackage.eINSTANCE.getServiceInstance());

		for (ServiceInstance serviceInstance : serviceInstances) {
			for (Service service : serviceInstance.getServices())
				if (service instanceof SimpleService)
					deviceLost((SimpleService) service);
		}
		manager.unregisterForType(IoPackage.eINSTANCE.getServiceInstance(), this);
	}

	protected synchronized void bindDeviceComponent(IDeviceComponent component) {
		availableDeviceComponents.put(component.getClass().getName(), component);
		if (component instanceof AbstractDeviceComponent)
			((AbstractDeviceComponent) component).detectServices();
	}

	protected synchronized void unbindDeviceComponent(IDeviceComponent manager) {
		if (availableDeviceComponents != null)
			availableDeviceComponents.remove(manager.getClass().getName());
	}

	public synchronized void bindGrammarManagementService(IGrammarManagementService service) {
		grammarManagementService = service;
	}

	public synchronized void unbindGrammarManagementService(IGrammarManagementService service) {
		grammarManagementService = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, SimpleService> getConnectedServices() {
		return (Map<String, SimpleService>) ((HashMap<String, SimpleService>) connectedServices).clone();
	}

	@Override
	public void registerDevice(SiamInternalServiceInterface serviceInterface) {
		if (serviceInterface.getSiamId() == null || serviceInterface.getSiamId().getValue()
				.isEmpty() /* || device.getId().isEmpty() */) {
			logger.warn("No id specified for device to register");
			throw new DeviceManagerException("No id specified for device to register");
		}
		if (registeredDevices.containsKey(serviceInterface.getSiamId().toString())) {
			logger.warn(String.format("There is already a device registered with id \"%s\".",
					serviceInterface.getSiamId()));
			throw new DeviceManagerException(String.format("There is already a device registered with id \"%s\".",
					serviceInterface.getSiamId()));
		}
		logger.info(String.format("Device with id %s registered.", serviceInterface.getSiamId()));
		registeredDevices.put(serviceInterface.getSiamId().toString(), serviceInterface);

		final String serviceInstanceId, serviceName;

		BString helper = serviceInterface.getServiceInstanceId();
		if (BString.isNullOrEmpty(helper))
			serviceInstanceId = null;
		else
			serviceInstanceId = helper.toString();

		helper = serviceInterface.getServiceName();
		if (BString.isNullOrEmpty(helper))
			serviceName = null;
		else
			serviceName = helper.toString();

		if (serviceInstanceId != null && serviceName != null) {
			SimpleService service = discoveredServices.get(serviceInstanceId + '#' + serviceName);
			if (service != null)
				connectToDevice(serviceInterface.getSiamId().toString(), service);
			else
				return;
		}

		List<SimpleService> candidates = new ArrayList<SimpleService>(discoveredServices.values());

		// filter all with wrong serviceName
		if (serviceName != null) {
			candidates.removeIf(c -> !serviceName.equals(c.getServiceName()));
		}
		// filter all with non matching attributes
		candidates.removeIf(c -> !matchesByAttributes(serviceInterface, c));

		// if candidates are left then connect
		for (SimpleService service : candidates) {
			connectToDevice(serviceInterface.getSiamId().toString(), service);
		}

	}

	@Override
	public void unregisterDevice(String deviceId) {
		if (!registeredDevices.containsKey(deviceId))
			logger.warn(String.format("Cannot unregister device with id %s. Device is not registered.", deviceId));
		else {
			logger.info(String.format("Device with id %s unregistered.", deviceId));
			registeredDevices.remove(deviceId);
			if (connectedServices.containsKey(deviceId)) {
				serviceToComponentMapping.get(connectedServices.get(deviceId).getUniqueId()).disconnect(deviceId);
			}
		}
	}

	@Override
	public void reset() {
		while (!registeredDevices.isEmpty()) {
			unregisterDevice(registeredDevices.get(0).getSiamId().toString());
		}
	}

	private String getServicePhysicalId(Service service) {
		return service.getServiceInstance().getENTITY_ID() + '#' + service.getServiceName();
	}

	public void deviceDiscovered(SimpleService service, IDeviceComponent component) {
		discoveredServices.put(service.getUniqueId(), service);
		serviceToComponentMapping.put(getServicePhysicalId(service), (AbstractDeviceComponent) component);

		Stream<SiamInternalServiceInterface> stream = registeredDevices.values().stream();

		// if serviceInterfaceName is available filter all siam interfaces that
		// do
		// no match
		String helper = service.getServiceInstance().getServiceInstanceName();
		if (helper != null && helper.isEmpty())
			helper = null;

		final String serviceInstanceName = helper;

		if (serviceInstanceName != null) {
			stream = stream.filter(i -> i.getServiceInstanceId() == null || i.getServiceInstanceId().isEmpty()
					|| serviceInstanceName.equals(i.getServiceInstanceId().toString()));
		}

		// if serviceName is available filter all siam interfaces that do no
		// match
		helper = service.getServiceName();
		if (helper != null && helper.isEmpty())
			helper = null;

		final String serviceName = helper;

		if (serviceName != null) {
			stream = stream.filter(i -> i.getServiceName() == null || i.getServiceName().isEmpty()
					|| i.getServiceName().equals(serviceName));
		}

		List<SiamInternalServiceInterface> candidates = stream.collect(Collectors.toList());
		if (candidates.isEmpty())
			return;

		// highest priority: interface id and service name match. A connection
		// is definitely established
		if (serviceInstanceName != null && serviceName != null) {
			List<SiamInternalServiceInterface> matches = candidates.stream()
					.filter(i -> i.getServiceInstanceId() != null
							&& serviceInstanceName.equals(i.getServiceInstanceId().toString())
							&& i.getServiceName() != null && serviceName.equals(i.getServiceName().toString()))
					.collect(Collectors.toList());
			if (matches.size() > 0) {
				// no service name specified or no matching service name found
				for (SiamInternalServiceInterface siamInterface : matches)
					connectToDevice(siamInterface.getSiamId().toString(), service);
				return;
			}
		}

		// filter all already connected siam interfaces
		candidates.removeIf(i -> connectedServices.containsKey(i.getSiamId().toString()));

		// filter all siam interfaces with matching attributes
		candidates.removeIf(i -> !matchesByAttributes(i, service));

		// find siam interfaces that have matching service name
		if (serviceName != null) {
			List<SiamInternalServiceInterface> matches = candidates.stream()
					.filter(i -> i.getServiceName() != null && serviceName.equals(i.getServiceName().toString()))
					.collect(Collectors.toList());
			if (matches.size() > 0) {
				for (SiamInternalServiceInterface match : matches)
					connectToDevice(match.getSiamId().toString(), service);
				return;
			}
		}

		// no service name specified or no matching service name found
		for (SiamInternalServiceInterface candidate : candidates)
			connectToDevice(candidate.getSiamId().toString(), service);
	}

	boolean matchesByAttributes(SiamInternalServiceInterface siamInterface, Service service) {
		if (siamInterface.getServiceType() != null) {
			for (EClass clazz : ((SimpleService) service).getServiceType()) {
				if (clazz.isSuperTypeOf(siamInterface.getServiceType()))
					return true;
			}
		}
		return false;
	}

	@Override
	public void deviceDiscovered(SimpleService service) {
		CommunicationInfo commInfo = service.getServiceInstance().getCommunicationinfo();
		logger.info(String.format("Discovered new device with name %s", service.getServiceName()));
		if (commInfo instanceof TCPServer)
			deviceDiscovered(service, tcpConnector);
		else if (commInfo instanceof HtmlServlet) {
			if (availableDeviceComponents.containsKey("de.dfki.iui.mmds.io.html.HtmlGeneratorComponent"))
				deviceDiscovered(service,
						availableDeviceComponents.get("de.dfki.iui.mmds.io.html.HtmlGeneratorComponent"));
		} else if (commInfo instanceof TECSDirectService) {
			if (availableDeviceComponents.containsKey("de.dfki.iui.madmacs.thrift_bridge.ThriftBridgeComponent"))
				deviceDiscovered(service,
						availableDeviceComponents.get("de.dfki.iui.madmacs.thrift_bridge.ThriftBridgeComponent"));
		} else if (commInfo instanceof OSGIBundle) {
			String bundleId = ((OSGIBundle) commInfo).getBundleName();
			if (availableDeviceComponents.containsKey(bundleId))
				deviceDiscovered(service, availableDeviceComponents.get(bundleId));
		}
	}

	private void connectToDevice(String siamId, SimpleService service) {
		AbstractDeviceComponent component = serviceToComponentMapping.get(getServicePhysicalId(service));
		if(service == null || component == null) {
			logger.error("service or component null");
		}
		logger.info(String.format(
				"Establish connection to service with name %s via device component %s for internal devide id %s",
				service.getServiceName(), component.getClass(), siamId));
		component.connect(siamId, service);
	}

	@Override
	public void deviceConnected(String siamId, SimpleService service) {
		logger.info(String.format("Siam interface with id %s connected to service %s:%s.", siamId,
				service.getServiceInstance().getServiceInstanceName(), service.getServiceName()));
		connectedServices.put(siamId, service);
		if (service instanceof SimpleService) {
			if (((SimpleService) service).getServiceType().stream()
					.anyMatch(type -> Io_interfacesPackage.eINSTANCE.getSpeech().isSuperTypeOf(type)))
				grammarManagementService.sendGrammarToDevice(siamId);
			if (((SimpleService) service).getModalities().contains("GUI")) {
				displayContextService.sendCurrentDisplayContent(siamId);
			}
		}
		// send init message specified in the project specification
		EList<OutputMessage> initMessages = registeredDevices.get(siamId).getInitMessages();

		for (OutputMessage message : initMessages) {
			message = EmfUtils.clone(message);
			if (message instanceof OutputAct) {
				OutputAct outputAct = (OutputAct) message;
				outputAct.setInitiator(new BString("SIAM"));
				outputAct.setId(new BString("device init message"));
				for (OutputRepresentation rep : outputAct.getPresentation()) {
					rep.setDevice(new BString(siamId));
				}
			} else if (message instanceof UpdateDeviceMode) {
				UpdateDeviceMode updateMode = (UpdateDeviceMode) message;
				updateMode.setId(new BString("device init message"));
				updateMode.setDevice(new BString(siamId));
			}
			eventManager.postOutputEvent(message, this);
		}

	}

	@Override
	public void deviceLost(SimpleService service) {
		if (connectedServices != null) {
			logger.info(String.format("Lost service with name %s", service.getServiceName()));

			// if connected then disconnect
			List<String> disconnectFrom = new ArrayList<String>();
			for (Entry<String, SimpleService> entry : connectedServices.entrySet()) {
				if (entry.getValue().getUniqueId().equals(service.getUniqueId()))
					disconnectFrom.add(entry.getKey());
			}
			for (String id : disconnectFrom) {
				AbstractDeviceComponent deviceComponent = serviceToComponentMapping.get(service.getUniqueId());
				if (deviceComponent != null)
					deviceComponent.disconnect(id);
			}
			discoveredServices.remove(service.getUniqueId());

		}
	}

	@Override
	public void deviceDisconnected(String siamId) {
		if (connectedServices != null)
			if (connectedServices.containsKey(siamId)) {
				logger.info(String.format("Device with id %s disconnected.", siamId));
				connectedServices.remove(siamId);
			} else {
				logger.warn(String.format("Device with id %s not found.", siamId));
			}
	}

	// helper

	@Override
	public List<Service> findServiceForModality(Modality modality) {
		throw new UnsupportedOperationException("offenes TODO");
		// TODO (wird überhaupt noch gebraucht???)
		// ArrayList<Service> result = new ArrayList<Service>();
		// for (Device device : registeredDevices.values()) {
		// if (device.getModality() == modality) {
		// result.add(device);
		// }
		// }
		// return result;
	}

	@Override
	public List<String> findServiceForType(EClass clazz) {
		List<String> result = new ArrayList<String>();
		for (Entry<String, SimpleService> entry : connectedServices.entrySet()) {
			SimpleService service = (SimpleService) entry.getValue();
			if (service.getServiceType().stream().anyMatch(type -> type.isSuperTypeOf(clazz)))
				result.add(entry.getKey());
		}
		return result;
	}

	@Override
	public SiamInternalServiceInterface getSiamInternalInterface(String id) {
		return registeredDevices.get(id);
	}

	// knowledge server listener implementations

	@Override
	public void entityRemoved(Entity object) {
		ServiceInstance serviceInstance = (ServiceInstance) object;
		for (Service service : serviceInstance.getServices()) {
			if (service instanceof SimpleService)
				if (service.getServiceName() == null || service.getServiceName().isEmpty()) {
					logger.error("No service name specified for service in lost service instance "
							+ serviceInstance.getServiceInstanceName());
				} else
					deviceLost((SimpleService) service);
		}
	}

	@Override
	public void entityAdded(Entity object) {

		ServiceInstance serviceInstance = (ServiceInstance) object;
		for (Service service : serviceInstance.getServices()) {
			if (service instanceof SimpleService)
				if (service.getServiceName() == null || service.getServiceName().isEmpty()) {
					logger.error("No service name specified for service in discovered service instance "
							+ serviceInstance.getServiceInstanceName());
				} else
					deviceDiscovered((SimpleService) service);
		}
	}

}
