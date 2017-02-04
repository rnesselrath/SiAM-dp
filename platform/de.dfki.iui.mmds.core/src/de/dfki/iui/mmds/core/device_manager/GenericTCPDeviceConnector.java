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
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.model.io.CommunicationInfo;
import de.dfki.iui.mmds.core.model.io.DeviceStateChanged;
import de.dfki.iui.mmds.core.model.io.IOEvent;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.TCPServer;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;

class GenericTCPDeviceConnector extends AbstractDeviceComponent implements TCPDeviceListener {

	Logger logger = Logger.getLogger(this.getClass());

	HashMap<String, TCPServerConnection> idToConnection = new HashMap<String, TCPServerConnection>();
	HashMap<String, String> serviceIdToName = new HashMap<String, String>();

	public void activate(ComponentContext context, IDeviceManager deviceManager) {
		this.deviceManager = deviceManager;
		super.activate(context);
	}

	@Override
	protected void deactivate() {
		for (TCPServerConnection connection : idToConnection.values()) {
			connection.disconnect();
		}
	}

	@Override
	protected void outputActEvent(Service service, List<OutputRepresentation> representations, OutputAct message,
			Event event) {
		IOEvent ioEvent = IoFactory.eINSTANCE.createIOEvent();
		TCPServerConnection connection = idToConnection.get(service.getServiceInstance().getENTITY_ID());

		OutputAct request = EmfUtils.clone(message);
		request.getPresentation().clear();
		for (OutputRepresentation representation : representations) {
			request.getPresentation().add(EmfUtils.clone(representation));
		}

		ioEvent.setMessage(request);

		// String m = audioManagerHack(EmfPersistence.writeToString(ioEvent));
		String m = EmfPersistence.writeToString(ioEvent);
		PrintStream printStream = new PrintStream(connection.getOutputStream());
		printStream.print(m);
		// EmfPersistence.writeToStream(ioEvent,
		// connection.getOutputStream());
		connection.send("\0");
		logger.info(String.format("Send EVENT %s to service with name: %s", event.getProperty("id"),
				service.getServiceName()));
	}

	// wird mit
	// audio manager
	// anpassung an
	// das neues
	// modell nicht
	// mehr benötigt

	// private String audioManagerHack(String message) {
	// if (!message.contains("xmlns:io_interfaces"))
	// message =
	// message.replace("xmlns:io=\"http://www.dfki.de/iui/mmds/core/model/io\"",
	// "xmlns:io=\"http://www.dfki.de/iui/mmds/core/model/io\"
	// xmlns:io_interfaces=\"http://www.dfki.de/iui/mmds/core/model/io_interfaces\"");
	//
	// message = message.replace("io_interfaces:SpeechSynthesis",
	// "io:SpeechSynthesis");
	// message = message.replace("\"io:Speech\"", "\"io_interfaces:Speech\"");
	// message = message.replace("io:modality=\"0\"", "");
	// message = message.replace("io:modality=\"SPEECH\"", "");
	// if (message.contains("xsi:type=\"io:OutputAct\"")) {
	// message = message.replace("<presentation",
	// "<presentationAlternatives><presentation");
	// message = message.replace("</message>",
	// "</presentationAlternatives></message>");
	// }
	// return message;
	// }

	@Override
	protected void updateDeviceModeEvent(Service service, UpdateDeviceMode update, Event event) {
		TCPServerConnection connection = idToConnection.get(service.getServiceInstance().getENTITY_ID());
		if (connection != null) {
			IOEvent ioEvent = IoFactory.eINSTANCE.createIOEvent();
			UpdateDeviceMode request = EmfUtils.clone(update);
			ioEvent.setMessage(request);

			try {
				EmfPersistence.writeToStream(ioEvent, connection.getOutputStream());
				connection.send("\0");
				logger.info(String.format("Send EVENT %s to service with name: %s", event.getProperty("id"),
						service.getServiceName()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void connect(Service service) {
		if (service instanceof SimpleService) {
			CommunicationInfo communicationinfo = service.getServiceInstance().getCommunicationinfo();

			if (communicationinfo instanceof TCPServer) {
				TCPServer tcpServer = (TCPServer) communicationinfo;
				String connectionId = service.getServiceInstance().getENTITY_ID();
				TCPServerConnection connection;
				if (idToConnection.containsKey(connectionId)) {
					connection = idToConnection.get(connectionId);
					if (connection.isConnected)
						super.connected((SimpleService) service);
				} else {
					connection = new TCPServerConnection(tcpServer);
					idToConnection.put(connectionId, connection);
					if (service.getServiceInstance().getServiceInstanceName() != null)
						serviceIdToName.put(connectionId, service.getServiceInstance().getServiceInstanceName());
					connection.registerListener(this);
				}
				connection.connectService((SimpleService) service);
			} else
				throw new IllegalArgumentException("Device is not a connection to a TCP server.");
		} else
			throw new IllegalArgumentException("Service is no SimpleService");
	}

	@Override
	public void disconnect(Service service) {
		CommunicationInfo communicationinfo = service.getServiceInstance().getCommunicationinfo();

		if (communicationinfo instanceof TCPServer) {
			String connectionId = service.getServiceInstance().getENTITY_ID();
			TCPServerConnection connection = idToConnection.get(connectionId);

			if (connection != null) {
				connection.disconnectService(service);
				if (connection.connectedDevices.isEmpty()) {
					idToConnection.remove(connectionId);
					serviceIdToName.remove(connectionId);
					connection.unregisterListener(this);
					super.disconnected(service);
				}
			}
		}
	}

	// TCPDeviceListener implementations
	@Override
	public void connectionEstablished(TCPServerConnection connection) {
		for (SimpleService service : connection.connectedDevices) {
			super.connected(service);
		}
	}

	@Override
	public void connectionLost(TCPServerConnection connection) {
		for (Service service : connection.connectedDevices) {
			super.disconnected(service);
		}
	}

	@Override
	public void messageReceived(TCPServerConnection connection, String message) {
		if (message.isEmpty()) {
			logger.debug(String.format("Received empty message from tcp device with ip %s:%d.",
					connection.tcpServer.getHost(), connection.tcpServer.getPort()));
			return;
		}
		Logger.getLogger(this.getClass()).debug(String.format("Received message from tcp device with ip %s:%d\n%s",
				connection.tcpServer.getHost(), connection.tcpServer.getPort(), message));
		Resource resource;
		try {
			// message = audioManagerHack(message);
			resource = EmfPersistence.readFromString(message);

			for (EObject content : resource.getContents()) {
				IOEvent event = (IOEvent) content;
				Message inputMessage = event.getMessage();
				if (inputMessage instanceof InputAct) {
					InputAct inputAct = (InputAct) inputMessage;
					for (InputRepresentation rep : inputAct.getRepresentation()) {
						if (rep.getServiceInstance() == null || rep.getServiceInstance().isEmpty()) {
							for (String key : idToConnection.keySet()) {
								if (connection == idToConnection.get(key))
									if (serviceIdToName.containsKey(key))
										rep.setServiceInstance(serviceIdToName.get(key));
									else
										rep.setServiceInstance(key);
							}
						}
						if (rep.getServiceName() == null || rep.getServiceName().isEmpty())
							rep.setServiceName(connection.connectedDevices.get(0).getServiceName());
					}
				} else if (inputMessage instanceof DeviceStateChanged) {
					DeviceStateChanged ds = (DeviceStateChanged) inputMessage;

					if (ds.getServiceInstanceId() == null || ds.getServiceInstanceId().isEmpty()) {
						for (String key : idToConnection.keySet()) {
							if (connection == idToConnection.get(key))
								if (serviceIdToName.containsKey(key))
									ds.setServiceInstanceId(serviceIdToName.get(key));
								else
									ds.setServiceInstanceId(key);
						}
					}
					if (ds.getServiceName() == null || ds.getServiceName().isEmpty())
						ds.setServiceName(connection.connectedDevices.get(0).getServiceName());
				}
				postInputMessage(inputMessage);
			}
		} catch (IOException e) {
			logger.error(String.format("Cannot parse XML input from TCP connection at %S:%d. The message is:\n%s",
					connection.tcpServer.getHost(), connection.tcpServer.getPort(), message));
			logger.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	@Override
	protected ServiceInstance fillServiceInstanceInformation(ServiceInstance serviceInstance) {
		return null;
	}
}
