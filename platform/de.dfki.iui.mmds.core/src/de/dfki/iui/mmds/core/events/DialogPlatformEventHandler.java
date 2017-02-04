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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.model.io.IOEvent;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.pattern.PPattern;
import de.dfki.iui.mmds.core.model.pattern.PSubscription;

abstract class DialogPlatformEventHandler<T extends Message> implements EventHandler {
	protected DialogPlatformEventManager eventService;
	protected Logger logger = Logger.getLogger(this.getClass());

	protected ComponentContext componentContext;

	private final List<PPattern> pattern = Collections.synchronizedList(new ArrayList<PPattern>());
	private boolean preprocessor = false;

	private DialogPlatformEventManager.PREPROCESSOR_PRIORITY priority;

	public boolean isPreprocessor() {
		return preprocessor;
	}

	public void setPreprocessor(boolean preprocessor, DialogPlatformEventManager.PREPROCESSOR_PRIORITY priority) {
		this.preprocessor = preprocessor;
		this.priority = priority;
		if (eventService != null) {
			eventService.updateServiceRegistration(this);
		}
	}

	public void setPreprocessor(boolean preprocessor) {
		setPreprocessor(preprocessor, DialogPlatformEventManager.PREPROCESSOR_PRIORITY.NORMAL);
	}

	public void subscribe(PPattern pattern) {
		if (pattern == null) {
			logger.warn("Cannot add Null-Pattern to device handler");
		} else {
			this.pattern.add(pattern);
		}
	}

	public void unsubscribe(PPattern pattern) {
		if (pattern == null) {
			logger.warn("Cannot not unsubscribe Null-Pattern from device handler");
		} else {
			this.pattern.remove(pattern);
		}
	}

	public void clearPatterns() {
		pattern.clear();
	}

	public void subscribe(String patternPath) {
		List<PPattern> patterns = loadPattern(patternPath);
		for (PPattern pattern : patterns) {
			this.subscribe(pattern);
		}
	}

	public List<PPattern> loadPattern(String patternPath) {
		if (componentContext == null) {
			logger.error("Cannot load pattern. Component must be activated first");
		}
		List<PPattern> result = new ArrayList<PPattern>();
		URL patternUrl = componentContext.getBundleContext().getBundle().getEntry(patternPath);
		if (patternUrl != null) {
			Resource resource;
			try {
				resource = EmfPersistence.readFromUri(URI.createURI(patternUrl.toString()));
				PSubscription subscription = ((PSubscription) resource.getContents().get(0));
				for (PPattern pattern : subscription.getPatterns()) {
					result.add(pattern);
				}
			} catch (IOException e) {
				logger.warn("Error loading subscription pattern: " + e.getLocalizedMessage());
				e.printStackTrace();
			}
		} else {
			logger.warn(String.format("Error loading subscription pattern %s. File does not exist!", patternPath));
		}
		return result;
	}

	protected void activate(ComponentContext context) {
		componentContext = context;
		eventService = ((DialogPlatformEventManager) context.locateService("DialogPlatformEventManager"));
		if (eventService == null) {
			logger.error(String.format(
					"DialogPlatformEventManager for component %s in bundle %s not registered. Add the DialogPlatformEventManager to the referenced services in the declarative component description!",
					context.getProperties().get("component.name"),
					context.getBundleContext().getBundle().getSymbolicName()));
		} else {
			eventService.registerPlatformEventHandler(this);
		}
	}

	@Override
	public void handleEvent(Event event) {
		Object sender = event.getProperty("sender");
		if (sender == this)
			return;
		IOEvent ioEvent = (IOEvent) event.getProperty("content");
		T message = (T) ioEvent.getMessage();
		for (int i = 0; i < pattern.size(); ++i) {
			PPattern p = pattern.get(i);
			if (p == null) {
				logger.error("Pattern is null");
			}

			MatchReport report = Matches.matches(message, p);
			if (report != null && report.result == MatchResult.MATCH_SUCCESS) {
				Logger.getLogger("de.dfki.iui.mmds.core.events.DialogPlatformEventManager")
						.debug(String.format("Event %d matches pattern %d in in component %s of bundle %s",
								event.getProperty("id"), i, componentContext.getProperties().get("component.name"),
								componentContext.getBundleContext().getBundle().getSymbolicName()));
				logger.info(String.format("%s EVENT %d: %s from %s", preprocessor ? "PREPROCESS" : "HANDLE",
						event.getProperty("id"), event.getTopic(), event.getProperty("sender").getClass().getName()));
				ChangeRecorder changeRecorder = null;
				if (!preprocessor) {
					message = EmfUtils.clone(message);
				} else {
					changeRecorder = new ChangeRecorder(message);
				}
				handleEvent(message, event, report);
				if (preprocessor) {
					ChangeDescription description = changeRecorder.endRecording();
					if (description.getObjectChanges().size() > 0) {
						if (logger.isInfoEnabled()) {
							logger.info(String.format("Result of preprocessing event %d: \n%s", event.getProperty("id"),
									EmfPersistence.writeToString(message)));
						}
					} else if (logger.isInfoEnabled()) {
						logger.info(
								String.format("Result of preprocessing event %d: No changes", event.getProperty("id")));
					}
				}
				break;
			} else {
				Logger logger = Logger.getLogger("de.dfki.iui.mmds.core.events.DialogPlatformEventManager");
				if (logger.isDebugEnabled()) {
					logger.debug(String.format(
							"Event %d does not match pattern %d in component %s of bundle %s. Reason is: %s",
							event.getProperty("id"), i, componentContext.getProperties().get("component.name"),
							componentContext.getBundleContext().getBundle().getSymbolicName(), report.getReason()));
				}
			}
		}
	}

	protected abstract void handleEvent(T message, Event event, MatchReport report);

	protected void deactivate() {
		componentContext = null;
		eventService.removePlatformEventHandler(this);
	}

	abstract protected String getTopic();

	Hashtable<String, String> getProperties() {
		Hashtable<String, String> properties = new Hashtable<String, String>();
		properties.put(EventConstants.EVENT_TOPIC, getTopic());
		if (isPreprocessor()) {
			properties.put(EventConstants.EVENT_FILTER,
					String.format("(&(preprocessor=true)(priority=%s))", priority.name()));
		} else {
			properties.put(EventConstants.EVENT_FILTER, "(preprocessor=false)");
		}
		return properties;
	}

}
