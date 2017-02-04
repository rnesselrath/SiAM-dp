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
package de.dfki.iui.mmds.core.events;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventHandler;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.model.io.CustomMessage;
import de.dfki.iui.mmds.core.model.io.IOEvent;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OutputMessage;

public class DialogPlatformEventManager {

	EventAdmin eventAdmin;
	private ComponentContext componentContext;
	Logger logger = Logger.getLogger(this.getClass());
	long event_counter = -1;

	public void setEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}

	public void unsetEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = null;
	}

	HashMap<Object, ServiceRegistration<?>> registeredHandlers = new HashMap<Object, ServiceRegistration<?>>();

	private Event buildEvent(String topic, Object content, Object sender, boolean isPreprocessor,
			PREPROCESSOR_PRIORITY priority) {
		HashMap<String, Object> props = new HashMap<String, Object>();
		props.put("content", content);
		props.put("sender", sender);
		props.put("id", event_counter);
		props.put("preprocessor", Boolean.toString(isPreprocessor));
		if (isPreprocessor) {
			props.put("priority", priority.name());
		}
		Event event = new Event(topic, props);
		return event;
	}

	synchronized private void postEvent(String topic, IOEvent content, Object sender) {
		event_counter++;

		if (eventAdmin != null) {
			if (logger.isInfoEnabled())
				logger.info(String.format("POST EVENT %d from sender %s.\n%s", event_counter, sender,
						EmfPersistence.writeToString(content)));
			// build properties for preprocessor calls. first iterate over all
			// three preprocessor priorities

			for (PREPROCESSOR_PRIORITY priority : PREPROCESSOR_PRIORITY.values()) {
				Event event = buildEvent(topic, content, sender, true, priority);
				if (logger.isDebugEnabled()) {
					logger.debug(String.format("Preprocessor call for EVENT %d with priority %s ", event_counter,
							priority.name()));
				}
				eventAdmin.sendEvent(event);
			}
			// then send event to non preprocessors
			Event event = buildEvent(topic, content, sender, false, null);
			if (logger.isDebugEnabled()) {
				logger.debug(String.format("Post call for EVENT %d.", event_counter));
			}
			eventAdmin.postEvent(event);
		} else {
			logger.warn("No EventAdmin-Service registered");
		}
	}

	public void postInputEvent(InputMessage message, Object sender) {
		postEvent(InputEventHandler.topic, buildIOEvent(message), sender);
	}

	public void postOutputEvent(OutputMessage message, Object sender) {
		postEvent(OutputEventHandler.topic, buildIOEvent(message), sender);
	}

	public void postCustomEvent(CustomMessage message, Object sender) {
		postEvent(CustomEventHandler.topic, buildIOEvent(message), sender);
	}

	private IOEvent buildIOEvent(Message message) {
		IOEvent event = IoFactory.eINSTANCE.createIOEvent();
		message.setTimestamp((new Date()).getTime());
		if (message.getId() == null || message.getId().isEmpty()) {
			message.setId(new BString(UUID.randomUUID().toString()));
		}
		event.setMessage(message);
		return event;
	}

	public void registerPlatformEventHandler(DialogPlatformEventHandler<?> handler) {
		ServiceRegistration<?> registerService = componentContext.getBundleContext()
				.registerService(EventHandler.class.getName(), handler, handler.getProperties());
		registeredHandlers.put(handler, registerService);
		Logger.getLogger(handler.getClass()).info("Registered for event topic " + handler.getTopic());
	}

	public void removePlatformEventHandler(DialogPlatformEventHandler<?> handler) {
		ServiceRegistration<?> registerService = registeredHandlers.get(handler);
		registerService.unregister();
		registeredHandlers.remove(handler);
		Logger.getLogger(handler.getClass()).info("Unregistered for event topic " + handler.getTopic());
	}

	void updateServiceRegistration(DialogPlatformEventHandler<?> handler) {
		if (registeredHandlers.containsKey(handler)) {
			ServiceRegistration<?> registerService = registeredHandlers.get(handler);
			registerService.setProperties(handler.getProperties());
		}
	}

	protected void activate(ComponentContext context) {
		componentContext = context;
		
		Object maxStringSize = context.getProperties().get("MAX_STRING_SIZE");
		if (maxStringSize instanceof String) {
			EmfPersistence.MAX_STRING_SIZE = Integer.valueOf((String) maxStringSize);
		}
	}

	protected void deactivate() {
		componentContext = null;
	}

	public enum PREPROCESSOR_PRIORITY {
		EARLY, NORMAL, LATE
	};

}
