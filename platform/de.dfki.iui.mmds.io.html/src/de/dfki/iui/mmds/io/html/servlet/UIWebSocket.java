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
package de.dfki.iui.mmds.io.html.servlet;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@WebSocket
public class UIWebSocket {

	UIWebSocketServlet.WebSocketSession wss;
	Session session;

	/* ------------------------------------------------------------ */

	@OnWebSocketConnect
	public void onConnect(Session session) {
		this.session = session;
		session.getUpgradeRequest().getHeaders();
		session.getUpgradeRequest().getSubProtocols();
		session.getUpgradeResponse().setAcceptedSubProtocol("userInterface");
		String deviceId = session.getUpgradeRequest().getParameterMap().get("deviceId").get(0);
		wss = UIWebSocketServlet.eINSTANCE.getSession(deviceId);
		wss.addConnection(this);

	}

	/* ------------------------------------------------------------ */

	@OnWebSocketClose
	public void onClose(Session session, int statusCode, String reason) {
		wss.removeConnection(this);
	}

	@OnWebSocketMessage
	public void onMessage(String message) {
		Logger.getLogger(UIWebSocket.class).info("Server recieved message from client " + message);
		wss.handleMessage(message, this);
	}

	/**
	 *
	 * @param data
	 * @throws IOException
	 */
	public void sendMessage(String message) throws IOException {
		this.session.getRemote().sendString(message);
		Logger.getLogger(UIWebSocket.class).info("Send message to client " + message);
	}
}