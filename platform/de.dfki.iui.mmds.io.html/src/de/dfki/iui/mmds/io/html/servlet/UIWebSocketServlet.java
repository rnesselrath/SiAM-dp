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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.interfaces.IDisplaxContextService;
import de.dfki.iui.mmds.core.model.base.StyleSheet;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.gui.AddTableCell;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.GUIEvent;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.MoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate;
import de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsFactory;
import de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent;
import de.dfki.iui.mmds.io.html.HtmlRenderer;
import de.dfki.iui.mmds.io.html.util.DomEvents;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;
import de.dfki.iui.mmds.io.html.util.HtmlRenderResult;
import de.dfki.iui.mmds.io.html.util.Messages;

/**
 * WebSocket Servlet.
 */
public class UIWebSocketServlet extends WebSocketServlet implements GUIRequestHandler {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8689253194520133267L;
	private static final ConcurrentMap<String, WebSocketSession> wsMembers_ = new ConcurrentHashMap<>();
	private static final Logger logger = Logger.getLogger(UIWebSocketServlet.class.getName());
	private ComponentContext context = null;
	private IDisplaxContextService displayContextService;
	private DialogPlatformEventManager eventService;
	static UIWebSocketServlet eINSTANCE;

	private static final String MESSAGE_TYPE = "type";
	private static final String TYPE_UPDATE = "update";
	private static final String TYPE_REMOVE = "remove";
	private static final String TYPE_ADD = "add";
	private static final String TYPE_MOVE = "move";
	private static final String TYPE_ADD_TABLE_CELL = "addTableCell";
	private static final String MESSAGE_DATA = "data";
	private static final String MESSAGE_TARGET = "target";
	private static final String MESSAGE_VALUE = "value";

	/* ------------------------------------------------------------ */

	public void activate(ComponentContext context) {
		this.context = context;
		eventService = ((DialogPlatformEventManager) context.locateService("DialogPlatformEventManager"));
		displayContextService = ((IDisplaxContextService) context.locateService("DisplayContextService"));
		eINSTANCE = this;
	}

	protected void deactivate() {
		context = null;
		eventService = null;
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("HTTP GET method not implemented.");
		response.setStatus(405);
	}

	@Override
	public void configure(WebSocketServletFactory webSocketServletFactory) {
		webSocketServletFactory.getPolicy().setIdleTimeout(1000 * 3600);
		webSocketServletFactory.register(UIWebSocket.class);

	}

	@Override
	public void handle(HtmlRenderResult html, String deviceId, OutputAct output, Event event) {
		WebSocketSession s;
		if (wsMembers_.containsKey(deviceId)) {
			logger.info("Setting new screen for session " + deviceId);
			s = wsMembers_.get(deviceId);
		} else {
			logger.info("Creating new session for device: " + deviceId);
			s = new WebSocketSession(deviceId);
			wsMembers_.put(deviceId, s);
		}
		s.setHtml(html);
	}

	@Override
	public void handle(List<JSONObject> update, String deviceId, OutputAct output, Event event) {
		WebSocketSession s;
		if (!wsMembers_.containsKey(deviceId)) {
			//			logger.error("Websocket session not found for device: " + deviceId);
			return;
		}
		s = wsMembers_.get(deviceId);
		if (s == null) {
			logger.error("Null websocket session under " + deviceId);
			return;
		}
		if (update == null || update.size() == 0) {
			logger.error("Wrong update data, equals to null or empty map");
			return;
		}
		s.updateUIElement(update);
	}

	@Override
	public void handle(RemoveUIElement update, String deviceId, OutputAct output, Event event) {
		WebSocketSession s;
		if (!wsMembers_.containsKey(deviceId)) {
			logger.error("Websocket session not found for device: " + deviceId);
			return;
		}
		s = wsMembers_.get(deviceId);
		if (s == null) {
			logger.error("Null websocket session under " + deviceId);
			return;
		}
		if (update.getElementId() == null || update.getElementId().isEmpty()) {
			logger.error("Wrong update data, equals to null or empty element id");
			return;
		}
		s.removeUIElement(update.getElementId().getValue());
	}

	@Override
	public void handle(AddUIElement update, HtmlRenderResult html, String deviceId, OutputAct output, Event event) {
		WebSocketSession s;
		if (!wsMembers_.containsKey(deviceId)) {
			logger.error("Websocket session not found for device: " + deviceId);
			return;
		}
		s = wsMembers_.get(deviceId);
		if (s == null) {
			logger.error("Null websocket session under " + deviceId);
			return;
		}
		if ((update.getNewElement() == null && update.getNewElementRef() == null) || update.getParentId() == null || html == null || html.getContents() == null) {
			logger.error("Wrong add element data, equals to null or empty arguments");
			return;
		}
		if (update.getNewElement() != null && update.getNewElementRef() != null) {
			logger.error("Wrong new element data, only containment of the new element or reference to the new element allowed but not both");
			return;
		}
		if (update instanceof AddTableCell) {
			s.addTableCellUIElement(update.getParentId().getValue(), update.getPosition().getValue(), ((AddTableCell) update).getColumnPosition().getValue(), html.getContents().toString());
		} else {
			s.addUIElement(update.getParentId().getValue(), update.getPosition().getValue(), html.getContents().toString());
		}
	}

	WebSocketSession getSession(String deviceId) {
		WebSocketSession sess;
		if (wsMembers_.containsKey(deviceId)) {
			logger.info("Added new member to a session " + deviceId);
			sess = wsMembers_.get(deviceId);
		} else {
			logger.info("Created a new session " + deviceId);
			sess = new WebSocketSession(deviceId);
			wsMembers_.put(deviceId, sess);
		}
		return sess;
	}

	/**
	 * 
	 * @author kirill
	 * 
	 */
	public class WebSocketSession {
		private final String deviceId_;
		private final Set<UIWebSocket> members_ = new CopyOnWriteArraySet<UIWebSocket>();
		private final HtmlRenderResult currentHtml_ = new HtmlRenderResult("", null, null);

		public WebSocketSession(String deviceId) {
			this.deviceId_ = deviceId;
		}

		public void removeConnection(UIWebSocket uiWebSocket) {
			members_.remove(uiWebSocket);
		}

		public void addConnection(UIWebSocket socket) {
			members_.add(socket);
			sendWelcomeMsg(socket);
		}

		public void setHtml(HtmlRenderResult html) {
			updateScreen(html);
			for (UIWebSocket member : members_) {
				try {
					JSONObject obj = new JSONObject();
					obj.put("type", "screen");
					JSONObject pageData = new JSONObject();
					pageData.put("content", getHtml());
					pageData.put("style", getStyle());
					pageData.put("title", getTitle());
					obj.put("data", pageData);
					logger.info("Server pushes gui to client");
					member.sendMessage(obj.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private void updateScreen(HtmlRenderResult html) {
			if (html.getContents() != null) {
				currentHtml_.setContents(html.getContents());
			}
			if (html.getStyle() != null) {
				currentHtml_.setStyle(html.getStyle());
			}
			if (html.getTitle() != null) {
				currentHtml_.setTitle(html.getTitle());
			}
		}

		public String getHtml() {
			if (currentHtml_.getContents() != null)
				return currentHtml_.getContents().toString();
			return "";
		}

		public String getTitle() {
			if (currentHtml_.getTitle() != null)
				return currentHtml_.getTitle();
			return "";
		}

		public void updateUIElement(List<JSONObject> elData) {
			if (elData.size() == 0) {
				logger.error("Trying to send empty update data to the UI");
				return;
			}
			JSONObject jData = new JSONObject();
			jData.put(MESSAGE_TYPE, TYPE_UPDATE);
			JSONArray updates = new JSONArray();
			for (JSONObject obj : elData) {
				updates.put(obj);
			}
			jData.put(MESSAGE_DATA, updates);
			logger.debug("Updating ui element " + jData.toString());
			for (UIWebSocket member : members_) {
				try {
					logger.info("Server pushes update data to client");
					member.sendMessage(jData.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public void removeUIElement(String elementId) {
			if (elementId == null || elementId.isEmpty()) {
				logger.error("Trying to remove element with empty id");
				return;
			}
			JSONObject jData = new JSONObject();
			jData.put(MESSAGE_TYPE, TYPE_REMOVE);
			JSONObject data = new JSONObject();
			data.put("id", elementId);
			jData.put(MESSAGE_DATA, data);
			for (UIWebSocket member : members_) {
				try {
					logger.info("Server pushes remove element data to client");
					member.sendMessage(jData.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public void addUIElement(String parentId, int positionInContainer, String content) {
			if (parentId == null || parentId.isEmpty()) {
				logger.error("Trying to add child to parent element with empty id");
				return;
			}
			if (content == null || content.isEmpty()) {
				logger.error("Empty element contents");
				return;
			}
			JSONObject jData = new JSONObject();
			jData.put(MESSAGE_TYPE, TYPE_ADD);
			JSONObject data = new JSONObject();
			data.put("parentId", parentId);
			data.put("position", String.valueOf(positionInContainer));
			data.put("content", content);
			jData.put(MESSAGE_DATA, data);
			for (UIWebSocket member : members_) {
				try {
					logger.info("Server pushes add element data to client");
					member.sendMessage(jData.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public void addTableCellUIElement(String tableId, int rowIdx, int colIdx, String content) {
			if (tableId == null || tableId.isEmpty()) {
				logger.error("Trying to add child to table element with empty id");
				return;
			}
			if (content == null || content.isEmpty()) {
				logger.error("Empty element contents");
				return;
			}
			JSONObject jData = new JSONObject();
			jData.put(MESSAGE_TYPE, TYPE_ADD_TABLE_CELL);
			JSONObject data = new JSONObject();
			data.put("tableId", tableId);
			data.put("row", String.valueOf(rowIdx));
			data.put("col", String.valueOf(colIdx));
			data.put("content", content);
			jData.put(MESSAGE_DATA, data);
			for (UIWebSocket member : members_) {
				try {
					logger.info("Server pushes add element data to client");
					member.sendMessage(jData.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public String getStyle() {
			if (currentHtml_.getStyle() != null)
				return currentHtml_.getStyle().toString();
			return "";
		}

		public Set<UIWebSocket> getConnections() {
			return members_;
		}

		public void handleMessage(String data, UIWebSocket source) {
			try {
				JSONObject jsonObject = new JSONObject(data);

				switch (jsonObject.getString(MESSAGE_TYPE)) {
				case DomEvents.SCREEN_TYPE:
					handleScreen(jsonObject, source);
					break;
				case DomEvents.EVENT_TYPE:
					handleEvent(jsonObject, source);
					break;
				default:
					logger.error("Unknown message type from browser");
					break;
				}
			} catch (Exception ex) {
				try {
					handleError(source);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		/**
		 * 
		 * @throws IOException
		 */
		private void handleError(UIWebSocket reciever) throws IOException {
			JSONObject obj = new JSONObject();
			obj.put("type", "error");
			obj.put("data", "An error occured");
			reciever.sendMessage(obj.toString());
		}

		/**
		 * 
		 * @param msg
		 * @throws Exception
		 */
		private void handleScreen(JSONObject msg, UIWebSocket reciever) throws Exception {
			JSONObject obj = new JSONObject();
			if (msg.get(MESSAGE_DATA).toString().equals(Messages.CURRENT_SCREEN)) {
				if (displayContextService == null) {
					logger.error("Display context is not set");
					return;
				}
				if (displayContextService.getCurrentDisplayContext(deviceId_) == null) {
					logger.error("No device in display context: " + deviceId_);
					return;
				}
				HtmlRenderResult res = new HtmlRenderer(context).render(displayContextService.getCurrentDisplayContext(deviceId_), false, null);
				updateScreen(res);
				obj.put("type", "screen");
				JSONObject pageData = new JSONObject();
				pageData.put("content", getHtml());
				pageData.put("style", getStyle());
				pageData.put("title", getTitle());
				obj.put("data", pageData);
				reciever.sendMessage(obj.toString());
			} else
				throw new Exception("Unsupported command while handling screen message");
		}

		/**
		 * Send event to dialogue system
		 * 
		 * @param msg
		 * @throws IOException
		 */
		private void handleEvent(JSONObject msg, UIWebSocket reciever) throws IOException {
			logger.info("Server recieved an event " + msg);
			GUIEventData event = null;
			String targetId = msg.getJSONObject(MESSAGE_DATA).getString(MESSAGE_TARGET);
			if (targetId == null) {
				handleError(reciever);
				return;
			}

			String type = msg.getJSONObject(MESSAGE_DATA).getString(MESSAGE_TYPE);
			if (type == null) {
				handleError(reciever);
				return;
			}

			switch (type) {
			case DomEvents.ONCLICK:
				event = GuiEventsFactory.eINSTANCE.createClickEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONDBLCLICK:
				event = GuiEventsFactory.eINSTANCE.createDblClickEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONMOUSEDOWN:
				event = GuiEventsFactory.eINSTANCE.createMouseDownEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONMOUSEMOVE:
				event = GuiEventsFactory.eINSTANCE.createMouseMoveEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONMOUSEOUT:
				event = GuiEventsFactory.eINSTANCE.createMouseOutEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONMOUSEOVER:
				event = GuiEventsFactory.eINSTANCE.createMouseOverEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONMOUSEUP:
				event = GuiEventsFactory.eINSTANCE.createMouseUpEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONKEYPRESS:
				event = GuiEventsFactory.eINSTANCE.createKeyPressEvent();
				event.setTargetId(new BString(targetId));
				// TODO pass keycode
				break;
			case DomEvents.ONKEYDOWN:
				event = GuiEventsFactory.eINSTANCE.createKeyDownEvent();
				event.setTargetId(new BString(targetId));
				// TODO pass keycode
				break;
			case DomEvents.ONKEYUP:
				event = GuiEventsFactory.eINSTANCE.createKeyUpEvent();
				event.setTargetId(new BString(targetId));
				// TODO keycode
				break;
			case DomEvents.ONCHANGE:
				event = GuiEventsFactory.eINSTANCE.createChangeEvent();
				event.setTargetId(new BString(targetId));

				String value = msg.getJSONObject(MESSAGE_DATA).getString(MESSAGE_VALUE);
				if (value == null)
					throw new IllegalArgumentException("Value is empty for onChange event, target:" + targetId);
				String[] valIndex = value.split("@@", -1);
				if (valIndex.length > 1) {
					int index = -1;
					try {
						index = Integer.parseInt(valIndex[1]);
					} catch (Exception e) {
						logger.error("Cannot recognise list index id, setting to -1");
					}
					((ChangeEvent) event).setIndex(new BInteger(index));
					event.setValue(new BString(valIndex[0]));
				} else {
					((ChangeEvent) event).setIndex(new BInteger(-1));
					event.setValue(new BString(value));
				}
				break;
			case DomEvents.ONBLUR:
				event = GuiEventsFactory.eINSTANCE.createBlurEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONSELECT:
				event = GuiEventsFactory.eINSTANCE.createSelectTextEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONFOCUS:
				event = GuiEventsFactory.eINSTANCE.createFocusEvent();
				event.setTargetId(new BString(targetId));
				break;
			case DomEvents.ONSUBMIT:
				event = GuiEventsFactory.eINSTANCE.createSubmitEvent();
				event.setTargetId(new BString(targetId));
				if (!msg.getJSONObject(MESSAGE_DATA).has(MESSAGE_VALUE))
					return;
				String formValue = msg.getJSONObject(MESSAGE_DATA).getString(MESSAGE_VALUE);
				if (formValue == null)
					throw new IllegalArgumentException("Value is empty for onSubmit event, target:" + targetId);

				for (Entry<String, String> entry : getQueryMap(formValue).entrySet()) {
					((SubmitEvent) event).getAttributes().put(entry.getKey(), new BString(entry.getValue()));
				}

				// event.setValue(BaseFactory.eINSTANCE.createBString(formValue));
				break;
			case DomEvents.ONDIALOGRESULT:
				event = GuiEventsFactory.eINSTANCE.createDialogEvent();
				event.setTargetId(new BString(targetId));
				String dValue = msg.getJSONObject(MESSAGE_DATA).getString(MESSAGE_VALUE);
				if (dValue == null)
					throw new IllegalArgumentException("Value is empty for dialog event, target:" + targetId);
				event.setValue(new BString(dValue));

				break;
			default:
				throw new IllegalArgumentException("Unknown event type from browser, target:" + targetId);
			}

			if (event != null) {
				sendEvent(deviceId_, event);
			}
		}

		public void setStyle(StyleSheet styleResource) {
			currentHtml_.setStyle(HtmlFactory.makeAppStyleImportFromURL(styleResource.getLocation().getUrl()));
			for (UIWebSocket member : members_) {
				try {
					JSONObject obj = new JSONObject();
					obj.put(MESSAGE_TYPE, "screen");
					JSONObject pageData = new JSONObject();
					pageData.put("style", getStyle());
					obj.put(MESSAGE_DATA, pageData);
					logger.info("Server pushes style to client");
					member.sendMessage(obj.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public void moveUIElement(String newParentId, String elementId, int positionInContainer) {
			if (newParentId == null || newParentId.isEmpty()) {
				logger.error("Trying to move child to parent element with empty id");
				return;
			}
			if (elementId == null || elementId.isEmpty()) {
				logger.error("Trying to move child with empty id");
				return;
			}
			JSONObject jData = new JSONObject();
			jData.put(MESSAGE_TYPE, TYPE_MOVE);
			JSONObject data = new JSONObject();
			data.put("newParentId", newParentId);
			data.put("elementId", elementId);
			data.put("position", String.valueOf(positionInContainer));
			jData.put(MESSAGE_DATA, data);
			for (UIWebSocket member : members_) {
				try {
					logger.info("Server pushes add element data to client");
					member.sendMessage(jData.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void sendWelcomeMsg(UIWebSocket socket) {
		logger.info("Server sends welcome message to client");
		JSONObject msg = new JSONObject();
		msg.put("type", "welcome");
		try {
			socket.sendMessage(msg.toString());
		} catch (IOException e) {
			logger.info("Server failed to send welcome message to client");
			e.printStackTrace();
		}
	}

	public void sendEvent(String sourceDevice, GUIEventData instance) {
		InputAct input = IoFactory.eINSTANCE.createInputAct();
		GUIEvent guiEvent = GuiFactory.eINSTANCE.createGUIEvent();
		input.getRepresentation().add(guiEvent);
		guiEvent.setEventData(instance);
		guiEvent.setDevice(new BString(sourceDevice));
		eventService.postInputEvent(input, this);
	}

	/**
	 * 
	 * @param query
	 * @return
	 */
	public static Map<String, String> getQueryMap(String query) {
		String[] params = query.split("&");
		Map<String, String> map = new HashMap<String, String>();
		for (String param : params) {
			String[] kv = param.split("=");
			if (kv.length > 1) {
				String name = param.split("=")[0];
				String value = param.split("=")[1];
				map.put(name, value);
			}
		}
		return map;
	}

	@Override
	public void handle(StyleSheetUpdate u, String deviceId, OutputAct message, Event event) {
		WebSocketSession s;
		if (wsMembers_.containsKey(deviceId)) {
			logger.info("Setting new screen for session " + deviceId);
			s = wsMembers_.get(deviceId);
		} else {
			logger.info("Creating new session for device: " + deviceId);
			s = new WebSocketSession(deviceId);
			wsMembers_.put(deviceId, s);
		}
		s.setStyle(u.getStyleResource());
	}

	@Override
	public void handle(MoveUIElement update, String deviceId, OutputAct output, Event event) {
		WebSocketSession s;
		if (!wsMembers_.containsKey(deviceId)) {
			logger.error("Websocket session not found for device: " + deviceId);
			return;
		}
		s = wsMembers_.get(deviceId);
		if (s == null) {
			logger.error("Null websocket session under " + deviceId);
			return;
		}
		if (update.getNewParentId() == null || update.getNewParentId().isEmpty() || update.getElementId() == null || update.getElementId().isEmpty()) {
			logger.error("Wrong add element data, equals to null or empty arguments");
			return;
		}
		s.moveUIElement(update.getNewParentId().getValue(), update.getElementId().getValue(), update.getPosition() == null ? -1 : update.getPosition().getValue());
	}
}
