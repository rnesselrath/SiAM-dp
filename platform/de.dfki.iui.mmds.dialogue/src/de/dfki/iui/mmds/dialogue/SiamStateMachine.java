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
package de.dfki.iui.mmds.dialogue;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence.NonContainmentReferenceHandling;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.engine.impl.SCXMLEngineImpl;

public class SiamStateMachine extends SCXMLEngineImpl {

	private class Event {
		String event;
		Object payload;

		Event(String event, Object payload) {
			this.event = event;
			this.payload = payload;
		}
	}

	/**
	 * The instance specific SCXML engine.
	 */

	Queue<Event> eventQueue = new LinkedList<Event>();
	boolean isRunning = false;
	private final Lock lock = new ReentrantLock();
	private final Condition notEmpty = lock.newCondition();

	Runnable queueWorker = new Runnable() {
		@Override
		public void run() {
			while (SiamStateMachine.this.isRunning) {
				lock.lock();
				while (!eventQueue.isEmpty()) {
					Event event = eventQueue.poll();
					SiamStateMachine.this.executeEvent(event);
				}
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	};

	SiamEvaluator siamEvaluator;

	SiamContext siamContext;

	SiamDispatcher siamDispatcher;

	public SiamStateMachine() {
		Logger.getLogger(this.getClass()).info("Load statechart");
		String writeToString;
		StateChart stateChartModel = DialogueComponent.INSTANCE.stateChartModel;
		SCXML stateMachine = null;
		try {
			writeToString = EmfPersistence.writeToString(stateChartModel, NonContainmentReferenceHandling.KEEP_ORIGINAL_LOCATION, null);
			Logger.getLogger(this.getClass().getName() + ".SCXML").info(writeToString);
			stateMachine = load(writeToString);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (stateMachine != null) {
			logInfo(String.format("StateChart %s loaded into statemachine", stateChartModel.getId()));
			siamContext = new SiamContext(this);
			siamEvaluator = new SiamEvaluator(this);

			siamDispatcher = new SiamDispatcher(this);
			initialize(stateMachine, siamContext, siamEvaluator, siamDispatcher, new SiamErrorReporter());

			siamContext.set("SIAM", siamEvaluator);
			siamContext.set("EmfUtils", new EmfUtils());
		} else {
			logError(String.format("Error loading statechart %s into statemachine", stateChartModel.getId()));
		}
		setId(stateChartModel.getId());
	}

	void executeEvent(Event event) {
		super.fireEvent(event.event, event.payload);
	}

	@Override
	public boolean fireEvent(String event, Object payload) {
		lock.lock();
		eventQueue.add(new Event(event, payload));
		notEmpty.signalAll();
		lock.unlock();
		return true;
	}

	private SCXML load(final String scxml) {

		ErrorHandler errHandler = new ErrorHandler() {
			@Override
			public void error(SAXParseException e) throws SAXException {
				System.err.println(e.getMessage());

			}

			@Override
			public void fatalError(SAXParseException e) throws SAXException {
				System.err.println(e.getMessage());

			}

			@Override
			public void warning(SAXParseException e) throws SAXException {
				System.err.println(e.getMessage());
			}
		};

		SCXML stateMachine = null;
		try {
			stateMachine = SCXMLParser.parse(new InputSource(new StringReader(scxml)), errHandler);// ca
																									// );
		} catch (IOException | SAXException | ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stateMachine;
	}

	@Override
	public void logError(String message) {
		DialogueComponent.logger.error(message);
	}

	@Override
	public void logError(String message, Throwable error) {
		DialogueComponent.logger.error(message, error);
	}

	@Override
	public void logInfo(String message) {
		DialogueComponent.logger.info(message);
	}

	@Override
	public void logInfo(String message, Throwable error) {
		DialogueComponent.logger.info(message, error);
	}

	@Override
	public boolean start() {
		isRunning = true;
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(queueWorker);
		addListener(siamEvaluator);
		return super.start();
	}

	@Override
	public void stop() {
		isRunning = false;
		super.stop();
	}

	public void step() {
		try {
			this.getEngine().triggerEvents(new TriggerEvent[0]);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Context getContext(String stateId) {
		return getEngine().getSCInstance().getContext(getState(stateId));
	}

	TransitionTarget getState(String stateId) {
		return getEngine().getStateMachine().getTargets().get(stateId);
	}

	Context getCurrentContext() {
		if (getActiveStates().iterator().hasNext())
			return getContext(getActiveStates().iterator().next());
		else
			return null;
	}
}
