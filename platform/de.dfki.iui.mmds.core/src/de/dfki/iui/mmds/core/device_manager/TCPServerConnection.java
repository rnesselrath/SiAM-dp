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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.TCPServer;

class TCPServerConnection {
	final TCPServer tcpServer;

	private Socket socket;
	private BufferedWriter out;
	private BufferedReader in;
	private final List<TCPDeviceListener> listener = new ArrayList<TCPDeviceListener>();
	boolean firstAttempt = true;
	List<SimpleService> connectedDevices = new ArrayList<SimpleService>();

	private boolean keepConnection;
	Logger logger = Logger.getLogger(GenericTCPDeviceConnector.class);

	public TCPServerConnection(TCPServer tcpServer) {
		this.tcpServer = tcpServer;
	}

	public boolean isConnected;

	private void connected() {
		logger.info(String.format("Established connection with %s:%d", tcpServer.getHost(), tcpServer.getPort()));
		isConnected = true;

		ExecutorService receiverThread = Executors.newSingleThreadExecutor();
		receiverThread.execute(new Runnable() {
			@Override
			public void run() {
				StringBuilder builder = new StringBuilder();
				while (keepConnection && isConnected) {
					try {
						int c;
						while ((c = in.read()) != 0) {
							if (c == -1)
								throw new IOException();
							else {
								builder.append((char) c);
							}
						}
						String message = builder.toString();
						logger.debug(String.format("Received message from %s: %s", tcpServer.getHost(), message));
						builder = new StringBuilder();
						for (TCPDeviceListener l : listener) {
							l.messageReceived(TCPServerConnection.this, message);
						}
					} catch (IOException e) {
						logger.warn(String.format("Lost connection with %s:%d - ", tcpServer.getHost(),
								tcpServer.getPort(), e.getLocalizedMessage()));
						disconnected();
						if (keepConnection) {
							connect();
						}
					}
				}
			}
		});

		for (TCPDeviceListener l : listener) {
			l.connectionEstablished(this);
		}
	}

	private void connect() {
		keepConnection = true;
		ExecutorService connectorThread = Executors.newSingleThreadExecutor();
		connectorThread.execute(new Runnable() {
			@Override
			public void run() {
				while (keepConnection && !isConnected) {
					try {
						logger.debug(String.format("Try to establish connection with %s:%d", tcpServer.getHost(),
								tcpServer.getPort()));
						socket = new Socket(tcpServer.getHost(), tcpServer.getPort());
						out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
						in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
						connected();
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						if (firstAttempt) {
							logger.warn(String.format("Cannot connect to %s:%d - %s", tcpServer.getHost(),
									tcpServer.getPort(), e.getLocalizedMessage()));
						} else {
							logger.debug(String.format("Cannot connect to %s:%d - %s", tcpServer.getHost(),
									tcpServer.getPort(), e.getLocalizedMessage()));
						}
						firstAttempt = false;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}
		});
	}

	private void disconnected() {
		firstAttempt = true;
		isConnected = false;
		for (int i = 0; i < listener.size(); ++i) {
			listener.get(i).connectionLost(this);
		}
	}

	void disconnect() {
		logger.info(String.format("Disconnected from %s:%d", tcpServer.getHost(), tcpServer.getPort()));
		keepConnection = false;
		try {
			if (socket != null) {
				socket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void send(String message) {
		try {
			out.write(message);
			out.flush();
		} catch (IOException e) {
			logger.warn(String.format("Lost connection to %s:%d - %s", tcpServer.getHost(), tcpServer.getPort(),
					e.getLocalizedMessage()));
			disconnected();
		}
	}

	void registerListener(TCPDeviceListener listener) {
		this.listener.add(listener);
	}

	void unregisterListener(TCPDeviceListener listener) {
		this.listener.remove(listener);
	}

	void connectService(SimpleService service) {
		connectedDevices.add(service);
		if (!isConnected)
			connect();
	}

	void disconnectService(Service service) {
		connectedDevices.remove(service);
		if (connectedDevices.isEmpty() && isConnected)
			disconnect();
	}

	OutputStream getOutputStream() {
		try {
			return socket.getOutputStream();
		} catch (IOException e) {
			logger.warn(String.format("Lost connection to %s:%d - ", tcpServer.getHost(), tcpServer.getPort(),
					e.getLocalizedMessage()));
			disconnected();
		}
		return null;
	}

}
