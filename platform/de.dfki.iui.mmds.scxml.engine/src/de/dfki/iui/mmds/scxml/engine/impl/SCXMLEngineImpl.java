package de.dfki.iui.mmds.scxml.engine.impl;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.SCXMLListener;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.env.SimpleDispatcher;
import org.apache.commons.scxml.env.SimpleErrorHandler;
import org.apache.commons.scxml.env.SimpleErrorReporter;
import org.apache.commons.scxml.env.javascript.JSContext;
import org.apache.commons.scxml.env.javascript.JSEvaluator;
import org.apache.commons.scxml.invoke.SimpleSCXMLInvoker;
import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.model.CustomAction;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import de.dfki.iui.mmds.scxml.engine.SCXMLEngine;
import de.dfki.iui.mmds.scxml.engine.SCXMLEngineActivator;
import de.dfki.iui.mmds.scxml.engine.customactions.Raise;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLChangeDataValueEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLChangeTransitionCondEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLEventFiredEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLMacroMicroStepEvent;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLTransitionEvent;

/**
 * <p>
 * This class demonstrates one approach for providing the base functionality
 * needed by classes representing stateful entities, whose behaviors are defined
 * via SCXML documents.
 * </p>
 * 
 * <p>
 * SCXML documents (more generically, UML state chart diagrams) can be used to
 * define stateful behavior of objects, and Commons SCXML enables developers to
 * use this model directly into the corresponding code artifacts. The resulting
 * artifacts tend to be much simpler, embody a useful separation of concerns and
 * are easier to understand and maintain. As the size of the modeled entity
 * grows, these benefits become more apparent.
 * </p>
 * 
 * <p>
 * This approach functions by registering an SCXMLListener that gets notified
 * onentry, and calls the namesake method for each state that has been entered.
 * </p>
 * 
 * <p>
 * This class swallows all exceptions only to log them. Developers of subclasses
 * should think of themselves as &quot;component developers&quot; catering to
 * other end users, and therefore ensure that the subclasses are free of
 * <code>ModelException</code>s and the like. Most methods are
 * <code>protected</code> for ease of subclassing.
 * </p>
 * 
 */
public class SCXMLEngineImpl implements SCXMLEngine {

	private static int CONFIG_HISTORY_SIZE = 5;

	private final List<ServiceRegistration<?>> serviceRegs = new LinkedList<ServiceRegistration<?>>();
	private final List<EventHandler> handlers = new LinkedList<EventHandler>();
	private final LinkedList<Set<String>> configHistory = new LinkedList<Set<String>>();

	/**
	 * The instance specific SCXML engine.
	 */
	protected SCXMLExecutor engine;

	private String id;

	// private SCXMLCallback cb;

	private boolean running = false;

	/**
	 * The log.
	 */
	private Log log;

	/**
	 * The method signature for the activities corresponding to each state in
	 * the SCXML document.
	 */
	private static final Class[] SIGNATURE = new Class[0];

	/**
	 * The method parameters for the activities corresponding to each state in
	 * the SCXML document.
	 */
	private static final Object[] PARAMETERS = new Object[0];

	/**
	 * Default constructor.
	 * 
	 * @since 0.7
	 */
	public SCXMLEngineImpl() {
	}

	/**
	 * Convenience constructor, object instantiation incurs parsing cost.
	 * 
	 * @param scxmlDocument
	 *            The URL pointing to the SCXML document that describes the
	 *            &quot;lifecycle&quot; of the instances of this class.
	 */
	public SCXMLEngineImpl(final URL scxmlDocument) {
		// default is JEXL
		this(scxmlDocument, new JSContext(), new JSEvaluator());
	}

	/**
	 * Convenience constructor.
	 * 
	 * @param stateMachine
	 *            The parsed SCXML instance that describes the
	 *            &quot;lifecycle&quot; of the instances of this class.
	 * 
	 * @since 0.7
	 */
	public SCXMLEngineImpl(final SCXML stateMachine) {
		this(stateMachine, new JSContext(), new JSEvaluator());
	}

	/**
	 * Primary constructor, object instantiation incurs parsing cost.
	 * 
	 * @param scxmlDocument
	 *            The URL pointing to the SCXML document that describes the
	 *            &quot;lifecycle&quot; of the instances of this class.
	 * @param rootCtx
	 *            The root context for this instance.
	 * @param evaluator
	 *            The expression evaluator for this instance.
	 * 
	 * @see Context
	 * @see Evaluator
	 */
	public SCXMLEngineImpl(final URL scxmlDocument, final Context rootCtx, final Evaluator evaluator) {
		log = LogFactory.getLog(this.getClass());
		initialize(load(scxmlDocument), rootCtx, evaluator, new SimpleDispatcher(), new SimpleErrorReporter());
	}

	/**
	 * Primary constructor.
	 * 
	 * @param stateMachine
	 *            The parsed SCXML instance that describes the
	 *            &quot;lifecycle&quot; of the instances of this class.
	 * @param rootCtx
	 *            The root context for this instance.
	 * @param evaluator
	 *            The expression evaluator for this instance.
	 * 
	 * @see Context
	 * @see Evaluator
	 * 
	 * @since 0.7
	 */
	public SCXMLEngineImpl(final SCXML stateMachine, final Context rootCtx, final Evaluator evaluator) {
		log = LogFactory.getLog(this.getClass());
		initialize(stateMachine, rootCtx, evaluator, new SimpleDispatcher(), new SimpleErrorReporter());
	}

	/**
	 * Load the SCXML object representing this state machine.
	 * 
	 * @param scxmlDocument
	 *            The URL pointing to the SCXML document that describes the
	 *            &quot;lifecycle&quot; of the instances of this class.
	 * @return Returns the stateMachine.
	 */
	private SCXML load(final URL scxmlDocument) {

		log = LogFactory.getLog(this.getClass());
		// logInfo(log.getClass().getName());
		if (log.isDebugEnabled()) {
			// logInfo("debub enabled");
		}
		ErrorHandler errHandler = new SimpleErrorHandler();
		try {

			List customActions = new ArrayList();
			CustomAction ca = new CustomAction("http://www.dfki.de/mmds/scxml/customaction", "raise", Raise.class);
			customActions.add(ca);

			SCXML stateMachine = SCXMLParser.parse(scxmlDocument, errHandler, customActions);
			// logInfo("SCXML loaded");
			return stateMachine;
		} catch (IOException ioe) {
			logError(ioe);
		} catch (SAXException sae) {
			logError(sae);
		} catch (ModelException me) {
			logError(me);
		}
		return null;
	}

	@Override
	public void setId(final String engineId) {
		this.id = engineId;
	}

	@Override
	public URL preprocess(URL url) {
		return url;
	}

	private void propagateNamespace(Element element) {
		List children = element.getChildren();
		for (Object o : children) {
			Element child = (Element) o;
			if (child.getName().equals("raise")) {
				child.setNamespace(Namespace.getNamespace("ca", "http://www.dfki.de/mmds/scxml/customaction"));
			} else {
				child.setNamespace(element.getNamespace());
			}
			propagateNamespace(child);
		}
	}

	@Override
	public void addListener(SCXMLListener listener) {
		engine.addListener(engine.getStateMachine(), listener);
	}

	@Override
	public List<String> getAvailableEvents() {

		Set<TransitionTarget> states = engine.getCurrentStatus().getAllStates();
		// logInfo("found states: " + states.size());
		Set<Transition> transitions = new HashSet<Transition>();

		for (TransitionTarget state : states) {
			// logInfo("found state: " + state.getId());
			transitions.addAll(state.getTransitionsList());
		}

		List<String> events = new LinkedList<String>();
		for (Transition t : transitions) {
			// System.out.println("Available event: " + t.getEvent());
			if (t.getEvent() != null) {
				events.add(t.getEvent());
			}
		}

		return events;
	}

	@Override
	public Map<String, Map<String, List<Object[]>>> getAvailableEventsStates() {
		Map<String, Map<String, List<Object[]>>> eventsStates = new HashMap<String, Map<String, List<Object[]>>>();
		if (engine.getCurrentStatus().isFinal())
			// stop the interpretation by sending an empty config/available
			// event states
			return eventsStates;

		String event, id;
		Map<String, List<Object[]>> states;
		Map<String, Object> vars, rootVars;
		List<Object[]> state;
		int pos;
		SCInstance sci = engine.getSCInstance();
		Set<String> datas;

		for (TransitionTarget tt : engine.getCurrentStatus().getAllStates()) {
			id = tt.getId();
			pos = 0;
			for (Transition t : tt.getTransitionsList()) {
				event = t.getEvent();
				event = (event != null || engine.isSuperStep()) ? event : TriggerEvent.EMPTY_EVENT;
				if (event != null) {
					// 1. add all events to the configuration
					if (!eventsStates.containsKey(event)) {
						eventsStates.put(event, new HashMap<String, List<Object[]>>());
					}

					// 2. add all active source states to the config
					states = eventsStates.get(event);
					if (!states.containsKey(id)) {
						states.put(id, new LinkedList<Object[]>());
					}

					// 3. add the transition condition to the config
					state = states.get(id);

					/*
					 * the following 4 values in the Object array indicate: i)
					 * the position of the transition ii) the condition of the
					 * transition iii) that the evaluation of the transition's
					 * condition is not performed in the last step, i.e. it is
					 * 'UNKNOWN' // * iii) that the transition condition was not
					 * changed in the last step, i.e. no dynamical change and
					 * this is not a 'refresh' event
					 */
					state.add(new Object[] { pos, t.getCond() == null ? "" : t.getCond(), -1 });

					// 4. add all contexts to the config
					vars = new HashMap<String, Object>();
					while (tt != null) {
						vars.putAll(sci.getContext(tt).getVars());
						tt = tt.getParent();
					}
					rootVars = sci.getRootContext().getVars();
					if (rootVars != null) {
						vars.putAll(rootVars);
					}

					// to skip double entries the names of all datas in the
					// state config are needed
					// the following set/for-loop could be removed if the used
					// list would check double occurrences itself -> exchange
					// LinkedList by something else
					datas = new HashSet<String>();
					for (Object[] data : state) {
						if (data[0] instanceof String) {
							datas.add((String) data[0]);
						}
					}
					for (Entry<String, Object> e : vars.entrySet()) {
						/*
						 * the following 3 values in the Object array indicate:
						 * i) the name of the data ii) the current value of the
						 * data iii) that the data value was not changed in the
						 * last step, i.e. no dynamical change and this is not a
						 * 'refresh' event
						 */
						if (!datas.contains(e.getKey())) {
							state.add(new Object[] { e.getKey(), e.getValue(), false });
							datas.add(e.getKey());
						}
					}
				}
				pos++;
			}
		}
		return eventsStates;
	}

	@Override
	public List<String> getActiveStates() {
		Set<TransitionTarget> states = engine.getCurrentStatus().getStates();
		List<String> ids = new LinkedList<String>();
		for (TransitionTarget t : states) {
			ids.add(t.getId());
		}
		return ids;
	};

	@Override
	public List<String> getAllActiveStates() {
		Set<TransitionTarget> states = engine.getCurrentStatus().getAllStates();
		List<String> ids = new LinkedList<String>();
		for (TransitionTarget t : states) {
			ids.add(t.getId());
		}
		return ids;
	};

	/**
	 * 
	 * @param stateMachine
	 * @param rootCtx
	 * @param evaluator
	 * 
	 * @param dispatcher
	 */
	protected void initialize(final SCXML stateMachine, final Context rootCtx, final Evaluator evaluator, EventDispatcher dispatcher, final ErrorReporter errorReporter) {
		initialize(stateMachine, "", rootCtx, evaluator, dispatcher, errorReporter);
	}

	/**
	 * Instantiate and initialize the underlying executor instance.
	 * 
	 * @param stateMachine
	 *            The state machine
	 * @param topicInfix
	 * @param rootCtx
	 *            The root context
	 * @param evaluator
	 *            The expression evaluator
	 * @param dispatcher
	 */
	private void initialize(final SCXML stateMachine, String idSuffix, final Context rootCtx, final Evaluator evaluator, EventDispatcher dispatcher, final ErrorReporter errorReporter) {
		engine = new SCXMLExecutor(evaluator, dispatcher, new SimpleErrorReporter());
		engine.setStateMachine(stateMachine);
		engine.setSuperStep(true);
		engine.setRootContext(rootCtx);
		engine.addListener(stateMachine, new EntryListener());
		engine.registerInvokerClass("scxml", SimpleSCXMLInvoker.class);

		// engine.registerInvokerClass("grounding", GroundingInvoker.class);

		// setId(stateMachine.getId());
		String topicId = stateMachine.getId() + idSuffix;
		setId(topicId);
		EventHandler handler = new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				if (event instanceof SCXMLEventFiredEvent) {
					// logInfo( "Scxml event 'SCXMLEventFiredEvent' received!"
					// );
					fireEvent(((SCXMLEventFiredEvent) event).getEvent(), null);
				}
			}
		};
		serviceRegs.add(SCXMLEngineActivator.registerEventHandler(handler, SCXMLEventFiredEvent.getTopic(topicId)));
		handlers.add(handler);

		// One event handler to listen for macro/micro step instructions
		handler = new EventHandler() {
			@Override
			public void handleEvent(Event event) {
				// logInfo( "Scxml event 'SCXMLMacroMicroStepEvent' received!"
				// );
				engine.setSuperStep(SCXMLMacroMicroStepEvent.isMacroStepEvent(event));
				String ev = ((SCXMLMacroMicroStepEvent) event).getEvent();
				if (ev == null) {
					resume();
				} else {
					fireEvent(ev, null);
				}
			}
		};
		serviceRegs.add(SCXMLEngineActivator.registerEventHandler(handler, SCXMLMacroMicroStepEvent.getTopic(topicId, SCXMLMacroMicroStepEvent.TOPIC_SUFFIX_MACRO)));
		serviceRegs.add(SCXMLEngineActivator.registerEventHandler(handler, SCXMLMacroMicroStepEvent.getTopic(topicId, SCXMLMacroMicroStepEvent.TOPIC_SUFFIX_MICRO)));
		handlers.add(handler);

		// a handler for the transition cond evaluation/change events
		handler = new EventHandler() {

			public Transition findTransition(SCXMLTransitionEvent ev) {
				String stateId = ev.getStateId();
				for (TransitionTarget tt : engine.getCurrentStatus().getAllStates()) {
					if (tt.getId().equals(stateId)) {
						try {
							// the state is found, now take a look at the
							// transitions
							return tt.getTransitionsList().get(ev.getTransPos());
						} catch (IndexOutOfBoundsException e) {
							logError(e);
						}
					}
				}
				return null;
			}

			@Override
			public void handleEvent(Event event) {
				if (SCXMLTransitionEvent.isEvalTransitionCondEvent(event)) {
					// logInfo( "Scxml event 'SCXMLTransitionEvent' received!"
					// );
					SCXMLTransitionEvent ev = (SCXMLTransitionEvent) event;
					Transition t = findTransition(ev);
					if (t != null) {
						try {
							String cond = t.getCond();
							boolean evalResult = engine.getEvaluator().evalCond(engine.getSCInstance().getContext(t.getParent()), cond);

							// now send the complete current state
							Map<String, Map<String, List<Object[]>>> currentState = getAvailableEventsStates();
							for (Map<String, List<Object[]>> evVal : currentState.values()) {
								for (List<Object[]> stateVal : evVal.values()) {
									for (Object[] values : stateVal) {
										if (values[0] instanceof Integer && values[1].equals(cond)) {
											// set the evaluation result
											values[2] = evalResult ? 1 : 0;
										}
									}
								}
							}
							// logInfo( "Send 'Active states'" );
							SCXMLEngineActivator.sendActiveStates(id, getActiveStates(), getAllActiveStates());
							// logInfo( "Send 'Scxml state'" );
							SCXMLEngineActivator.sendScxmlState(id, State.IDLE, currentState);
						} catch (SCXMLExpressionException e) {
							logError(e);
						}
					}
				} else if (SCXMLChangeTransitionCondEvent.isChangeTransitionCondEvent(event)) {
					// logInfo(
					// "Scxml event 'SCXMLChangeTransitionCondEvent' received!"
					// );
					SCXMLChangeTransitionCondEvent ev = (SCXMLChangeTransitionCondEvent) event;
					Transition t = findTransition(ev);
					if (t != null) {
						t.setCond(ev.getNewCond());
					}
				}
			}
		};
		serviceRegs.add(SCXMLEngineActivator.registerEventHandler(handler, SCXMLTransitionEvent.getTopic(topicId, SCXMLTransitionEvent.Sort.COND)));
		handlers.add(handler);

		// a handler for the change of data values
		handler = new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				if (event instanceof SCXMLChangeDataValueEvent) {
					// logInfo(
					// "Scxml event 'SCXMLChangeDataValueEvent' received!" );
					SCXMLChangeDataValueEvent ev = (SCXMLChangeDataValueEvent) event;
					String stateId = ev.getStateId();
					for (TransitionTarget tt : engine.getCurrentStatus().getAllStates()) {
						if (tt.getId().equals(stateId)) {
							try {
								// here comes a 'silent' change of the content,
								// i.e. there is no event 'dataId.change' sent
								Context ctxt = engine.getSCInstance().getContext(tt);
								Object result = engine.getEvaluator().eval(ctxt, ev.getValueScript());
								String dataId = ev.getDataId();
								ctxt.set(dataId, result);

								// now send the complete current state
								Map<String, Map<String, List<Object[]>>> currentState = getAvailableEventsStates();
								for (Map<String, List<Object[]>> val : currentState.values()) {
									for (List<Object[]> state : val.values()) {
										for (Object[] values : state) {
											if (values[0].equals(dataId)) {
												// indicate that the value
												// changed
												values[2] = true;
											}
										}
									}
								}

								// logInfo( "Send 'Active states'" );
								SCXMLEngineActivator.sendActiveStates(id, getActiveStates(), getAllActiveStates());
								// logInfo( "Send 'Scxml state'" );
								SCXMLEngineActivator.sendScxmlState(id, State.IDLE, currentState);

								return;
							} catch (SCXMLExpressionException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		};
		serviceRegs.add(SCXMLEngineActivator.registerEventHandler(handler, SCXMLChangeDataValueEvent.getTopic(topicId)));
		handlers.add(handler);
	}

	/**
	 * Instantiate and initialize the underlying executor instance with default
	 * evaluator and context.
	 */
	@Override
	public void initialize(URL scxmlDocument) {
		initialize(load(scxmlDocument), new JSContext(), new JSEvaluator(), new SimpleDispatcher(), new SimpleErrorReporter());
	}

	/**
	 * 
	 */
	@Override
	public void initialize(URL scxmlDocument, String idSuffix) {
		initialize(load(scxmlDocument), idSuffix, new JSContext(), new JSEvaluator(), new SimpleDispatcher(), new SimpleErrorReporter());
	}

	@Override
	public boolean start() {
		if (!running)
			return reset();
		else
			return false;
	}

	/**
	 * Reset the state machine.
	 * 
	 * @return Whether the reset was successful.
	 */
	@Override
	public boolean reset() {
		try {
			running = true;
			Set<TransitionTarget> lastLeafs = engine.getCurrentStatus().getStates();
			engine.reset();
			SCXMLEngineActivator.sendActiveStates(id, this.getActiveStates(), this.getAllActiveStates());

			// logInfo( "Send 'Scxml state'" );
			SCXMLEngineActivator.sendScxmlState(id, State.IDLE, getAvailableEventsStates());
			List<Set<String>> cfgHistory = new ArrayList<Set<String>>(configHistory);
			updateConfigHistory(lastLeafs);
			SCXMLEngineActivator.sendScxmlConfigHistory(id, cfgHistory);
			// if (cb!=null) {
			//
			// Set<TransitionTarget> targets =
			// engine.getCurrentStatus().getAllStates();
			// List<Set<String>> allEvents = new LinkedList<Set<String>>();
			// List<String> states = new ArrayList<String>(targets.size());
			// Set<String> events = null;
			//
			// for (TransitionTarget state : targets) {
			// states.add(state.getId());
			// events = new HashSet<String>();
			// for (Transition t : state.getTransitionsList()) {
			// if (t.getEvent() != null)
			// events.add(t.getEvent());
			// }
			// allEvents.add(events);
			//
			// }
			// cb.notifyEvents(this.getAllActiveStates(), allEvents);
			// }
			// String s = SCXMLSerializer.serialize(engine.getStateMachine());
			// logInfo(s);

		} catch (ModelException me) {
			logError(me);
			running = false;
		}
		return running;
	}

	/**
	 * Fire an event on the SCXML engine.
	 * 
	 * @param event
	 *            The event name.
	 * @return Whether the state machine has reached a &quot;final&quot;
	 *         configuration.
	 */
	@Override
	public boolean fireEvent(final String event, final Object payload) {

		TriggerEvent evts = new TriggerEvent(event, TriggerEvent.SIGNAL_EVENT, payload);

		Set<TransitionTarget> lastLeafs = engine.getCurrentStatus().getStates();

		try {
			engine.triggerEvent(evts);
		} catch (ModelException me) {
			logError(me);
		}
		SCXMLEngineActivator.sendActiveStates(id, this.getActiveStates(), this.getAllActiveStates());

		// logInfo( "Send 'Scxml state'" );
		SCXMLEngineActivator.sendScxmlState(id, State.IDLE, getAvailableEventsStates());
		List<Set<String>> cfgHistory = new ArrayList<Set<String>>(configHistory);
		updateConfigHistory(lastLeafs);
		SCXMLEngineActivator.sendScxmlConfigHistory(id, cfgHistory);

		// if (cb!=null) {
		//
		// Set<TransitionTarget> targets =
		// engine.getCurrentStatus().getAllStates();
		// List<Set<String>> allEvents = new LinkedList<Set<String>>();
		// List<String> states = new ArrayList<String>(targets.size());
		// Set<String> events = null;
		//
		// for (TransitionTarget state : targets) {
		// states.add(state.getId());
		// events = new HashSet<String>();
		// for (Transition t : state.getTransitionsList()) {
		// if (t.getEvent() != null)
		// events.add(t.getEvent());
		// }
		// allEvents.add(events);
		//
		// }
		// cb.notifyEvents(this.getAllActiveStates(), allEvents);
		// }

		// SCXMLEngineComponent.sendActiveStates(scxmlDocument,
		// engine.getCurrentStatus().getAllStates());
		return engine.getCurrentStatus().isFinal();
	}

	/**
	 * Resumes the interpretation, i.e. it does not fire any event but lets the
	 * engine run to completion. This method is used whenever the engine's flag
	 * <code>superstep</code> is false.
	 * 
	 * @return true if the engine is done, i.e. reached a top final state,
	 *         otherwise false.
	 * 
	 */
	public boolean resume() {
		Set<TransitionTarget> lastLeafs = engine.getCurrentStatus().getStates();
		try {
			engine.triggerEvents(new TriggerEvent[0]);
		} catch (ModelException me) {
			logError(me);
		}
		SCXMLEngineActivator.sendActiveStates(id, this.getActiveStates(), this.getAllActiveStates());
		// logInfo( "Send 'Scxml state'" );
		SCXMLEngineActivator.sendScxmlState(id, State.IDLE, getAvailableEventsStates());
		List<Set<String>> cfgHistory = new LinkedList<Set<String>>(configHistory);
		updateConfigHistory(lastLeafs);
		SCXMLEngineActivator.sendScxmlConfigHistory(id, cfgHistory);
		return engine.getCurrentStatus().isFinal();
	}

	/**
	 * @param lastLeafs
	 * @return
	 */
	private void updateConfigHistory(Set<TransitionTarget> lastLeafs) {
		if (lastLeafs.equals(engine.getCurrentStatus().getStates()))
			// only update the history if there was a change in the
			// configuration
			return;
		int histSize = configHistory.size();
		if (0 < histSize && histSize == CONFIG_HISTORY_SIZE) {
			configHistory.pollLast();
		}
		if (configHistory.size() < CONFIG_HISTORY_SIZE) {
			Set<TransitionTarget> leafs = engine.getCurrentStatus().getStates();
			Set<String> leafStateIds = new HashSet<String>(leafs.size());
			for (TransitionTarget tt : leafs) {
				leafStateIds.add(tt.getId());
			}
			configHistory.push(leafStateIds);
		}
	}

	/**
	 * Get the SCXML engine driving the &quot;lifecycle&quot; of the instances
	 * of this class.
	 * 
	 * @return Returns the engine.
	 */
	public SCXMLExecutor getEngine() {
		return engine;
	}

	/**
	 * Get the log for this class.
	 * 
	 * @return Returns the log.
	 */
	public Log getLog() {
		return log;
	}

	/**
	 * Set the log for this class.
	 * 
	 * @param log
	 *            The log to set.
	 */
	public void setLog(final Log log) {
		this.log = log;
	}

	/**
	 * Invoke the no argument method with the following name.
	 * 
	 * @param methodName
	 *            The method to invoke.
	 * @return Whether the invoke was successful.
	 */
	public boolean invoke(final String methodName) {
		Class clas = this.getClass();
		try {
			Method method = clas.getDeclaredMethod(methodName, SIGNATURE);
			method.invoke(this, PARAMETERS);
		} catch (SecurityException se) {
			logError(se);
			return false;
		} catch (NoSuchMethodException nsme) {
			logError(nsme);
			return false;
		} catch (IllegalArgumentException iae) {
			logError(iae);
			return false;
		} catch (IllegalAccessException iae) {
			logError(iae);
			return false;
		} catch (InvocationTargetException ite) {
			logError(ite);
			return false;
		}
		return true;
	}

	/**
	 * Utility method for logging error.
	 * 
	 * @param exception
	 *            The exception leading to this error condition.
	 */
	final void logError(final Exception exception) {
		if (log.isErrorEnabled()) {
			logError(exception.getMessage(), exception);
		}
	}

	/**
	 * A SCXMLListener that is only concerned about &quot;onentry&quot;
	 * notifications.
	 */
	protected class EntryListener implements SCXMLListener {

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void onEntry(final TransitionTarget entered) {
			// logInfo("Entered state: " + entered.getId());
			SCXMLEngineActivator.sendScxmlOnEntryEvent(id, entered);
		}

		/**
		 * No-op.
		 * 
		 * @param from
		 *            The &quot;source&quot; transition target.
		 * @param to
		 *            The &quot;destination&quot; transition target.
		 * @param transition
		 *            The transition being followed.
		 */
		@Override
		public void onTransition(final TransitionTarget from, final TransitionTarget to, final Transition transition) {
			// nothing to do
			SCXMLEngineActivator.sendScxmlOnTransitionEvent(id, from, to, transition);
		}

		/**
		 * No-op.
		 * 
		 * @param exited
		 *            The transition target being exited.
		 */
		@Override
		public void onExit(final TransitionTarget exited) {
			// logInfo("Left state:" + exited.getId());
			SCXMLEngineActivator.sendScxmlOnExitEvent(id, exited);
		}

		@Override
		public void onStable() {
			// TODO Auto-generated method stub

		}

	}

	// @Override
	// public void setCallback(SCXMLCallback cb) {
	// this.cb = cb;
	// }

	@Override
	public void setActiveStates(Set<String> activeStates) {
		if (!running) {
			engine.setActiveStates(activeStates);
		} else
			throw new IllegalStateException("Method only applicable before engine is started");
	}

	@Override
	public void setVar(String name, Object object) {
		engine.getRootContext().set(name, object);
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setSuperStep(boolean superStep) {
		engine.setSuperStep(superStep);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.scxml.engine.SCXMLEngine#stop()
	 */
	@Override
	public void stop() {
		// logInfo( String.format( "Engine '%s' stopped.", id ));
		for (ServiceRegistration<?> reg : serviceRegs) {
			reg.unregister();
		}
		serviceRegs.clear();
		handlers.clear();
	}

	@Override
	public void setBreakpoints(List<String> stateIds) {
		getEngine().setBreakpoints(stateIds);
	}

	@Override
	public void logInfo(String message, Throwable error) {
		log.info(message, error);
	}

	@Override
	public void logInfo(String message) {
		log.info(message);
	}

	@Override
	public void logError(String message, Throwable error) {
		log.error(message);
	}

	@Override
	public void logError(String message) {
		log.error(message);
	}

}
