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
package de.dfki.iui.mmds.scxml.engine;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import de.dfki.iui.mmds.scxml.engine.SCXMLEngine.State;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLActiveStatesEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLConfigHistoryEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLEngineStateChangedEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLOnEntryEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLOnExitEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLOnTransitionEvent;

public class SCXMLEngineActivator implements BundleActivator {

	// The shared instance
	private static BundleContext context;
	private static final String EVENT_HANDLER_CLASS = EventHandler.class.getName();
	public static final String PLUGIN_ID = "de.dfki.iui.mmds.scxml.engine";

	private static EventAdmin eventAdmin;

	@Override
	public void start(BundleContext context) throws Exception {
		SCXMLEngineActivator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		SCXMLEngineActivator.context = null;

	}

	private static EventAdmin getEventAdmin() {
		if (eventAdmin == null) {
			context.getService(context.getServiceReference(EventAdmin.class));
		}
		return eventAdmin;
	}

	static BundleContext getContext() {
		return context;
	}

	/**
	 * 
	 * 
	 * @param id
	 * @param state
	 */
	public static void sendScxmlOnEntryEvent(final String id, final TransitionTarget state) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().sendEvent(new SCXMLOnEntryEvent(id, state));
			}
		});
	}

	public static void postScxmlOnEntryEvent(final String id, final TransitionTarget state) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLOnEntryEvent(id, state));
			}
		});
	}

	public static void sendScxmlOnExitEvent(final String id, final TransitionTarget state) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().sendEvent(new SCXMLOnExitEvent(id, state));
			}
		});
	}

	public static void postScxmlOnExitEvent(final String id, final TransitionTarget state) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLOnExitEvent(id, state));
			}
		});
	}

	public static void sendScxmlOnTransitionEvent(final String id, final TransitionTarget from, final TransitionTarget to, final Transition transition) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().sendEvent(new SCXMLOnTransitionEvent(id, from, to, transition));
			}
		});
	}

	public static void postScxmlOnTransitionEvent(final String id, final TransitionTarget from, final TransitionTarget to, final Transition transition) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLOnTransitionEvent(id, from, to, transition));
			}
		});
	}

	public static void sendActiveStates(final String id, final List<String> activeStates, final List<String> allActiveStates) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().sendEvent(new SCXMLActiveStatesEvent(id, activeStates, allActiveStates));
			}
		});
	}

	public static void postActiveStates(final String id, final List<String> activeStates, final List<String> allActiveStates) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLActiveStatesEvent(id, activeStates, allActiveStates));
			}
		});
	}

	/**
	 * Informs all interested listeners/handlers about the new state of the
	 * engine 'id' and provides a list of available events and the corresponding
	 * states (needed for Debug View) where the events can be taken.
	 * 
	 * @param id
	 *            - The id of the engine that changed its state.
	 * @param state
	 *            - The state which the engine changed to.
	 * @param availableEventsStates
	 *            - The map containing all available events and the
	 *            corresponding states.
	 */
	public static void sendScxmlState(final String id, final State state, final Map<String, Map<String, List<Object[]>>> availableEventsStates) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLEngineStateChangedEvent(id, state, availableEventsStates));
			}
		});
	}

	/**
	 * Informs all interested listeners/handlers about the current config
	 * history of the engine and provides a list of all leafs in the
	 * configuration from the last steps, s.t. the complete configuration can be
	 * restored (if the client has the corresponding model). The number of
	 * history length can vary.
	 * 
	 * @param id
	 *            - The id of the engine that changed its configuration.
	 * @param history
	 *            - The history of the engine's configuration. The first set
	 *            represents the last step, the 2nd represents the 2nd last step
	 *            etc.
	 */
	public static void sendScxmlConfigHistory(final String id, final List<Set<String>> history) {
		if (getEventAdmin() == null)
			return;
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			@Override
			public void run() {
				getEventAdmin().postEvent(new SCXMLConfigHistoryEvent(id, history));
			}
		});
	}

	/**
	 * Register an event handler to be able to listen for osgi events like from
	 * the <code>Scxml Debug View</code>.
	 * 
	 * @param handler
	 *            - The handler to call in case of an event match.
	 * @param topics
	 *            - An array of topics that will be used to check on which
	 *            events the handler should be called.
	 * @return The service registration to be able to change the properties or
	 *         to unregister the handler by using
	 *         {@link #unregisterEventHandler(ServiceReference) }.
	 */
	public static ServiceRegistration<?> registerEventHandler(EventHandler handler, String... topics) {
		if (context != null) {
			Dictionary<String, Object> ht = new Hashtable<String, Object>(1);
			ht.put(EventConstants.EVENT_TOPIC, topics);
			return context.registerService(EVENT_HANDLER_CLASS, handler, ht);
		}
		return null;
	}

}
