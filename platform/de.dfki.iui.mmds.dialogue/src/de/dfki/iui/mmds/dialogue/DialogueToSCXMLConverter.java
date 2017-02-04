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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.NotImplementedException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Decision;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.ElseIf;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.HistoryType;
import de.dfki.iui.mmds.core.model.dialogue.InstanceAssign;
import de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchCondition;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula;
import de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.OperationType;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Reference;
import de.dfki.iui.mmds.core.model.dialogue.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.dialogue.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.While;
import de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum;
import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.DatamodelContainer;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.HistoryState;
import de.dfki.iui.mmds.scxml.HistoryTypeDatatype;
import de.dfki.iui.mmds.scxml.Log;
import de.dfki.iui.mmds.scxml.OnEntry;
import de.dfki.iui.mmds.scxml.OnExit;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.ScxmlFactory;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.Transition;
import de.dfki.iui.mmds.scxml.TransitionTarget;
import de.dfki.iui.mmds.scxml.XData;

public class DialogueToSCXMLConverter {

	HashMap<de.dfki.iui.mmds.core.model.dialogue.TargetState, TransitionTarget> targetMap = new HashMap<de.dfki.iui.mmds.core.model.dialogue.TargetState, TransitionTarget>();
	HashMap<Transition, de.dfki.iui.mmds.core.model.dialogue.Transition> transitionMap = new HashMap<Transition, de.dfki.iui.mmds.core.model.dialogue.Transition>();
	Logger logger = Logger.getLogger(this.getClass());

	Map<String, TransitionTarget> idToScxmlState = new HashMap<String, TransitionTarget>();
	Map<String, AbstractState> idToDialogueNode = new HashMap<String, AbstractState>();

	int instanceId_counter;
	int patternId_counter;
	int sendId_counter;
	
	public StateChart convert(Dialogue dialogue) {
		addMissingIds(dialogue);
		instanceId_counter = 0;
		patternId_counter = 0;
		sendId_counter = 0;
		StateChart stateChart = ScxmlFactory.eINSTANCE.createStateChart();
		stateChart.setId(dialogue.getId());
		Node content = dialogue.getContent();
		State rootState = null;
		List<State> exitState = new ArrayList<State>(1); // list for ref call
		rootState = convert(content, exitState);

		if (rootState != null) {
			stateChart.setInitial1(rootState);
			if (rootState instanceof SimpleState) {
				stateChart.getState().add((SimpleState) rootState);
			} else if (rootState instanceof ParallelState) {
				stateChart.getParallel().add((ParallelState) rootState);
			}
		} else {
			logger.error("No root state defined for dialogue model with id " + dialogue.getId());
		}

		FinalState finalState = ScxmlFactory.eINSTANCE.createFinalState();
		finalState.setId("generatedStatechartFinalState");
		stateChart.getFinal().add(finalState);
		CondEventTransition endTransition = createTransition(dialogue.getId() + "_final");
		endTransition.getTarget().add(finalState);
		if (!exitState.isEmpty()) {
			exitState.get(0).getTransition().add(endTransition);
		}
		return stateChart;
	}

	private void addMissingIds(Dialogue dialogue) {
		int id_counter = 0;
		TreeIterator<EObject> allContents = dialogue.eAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof DialogueDesignerElement) {
				DialogueDesignerElement dde = (DialogueDesignerElement) next;
				if (dde.getId() == null || dde.getId().isEmpty()) {
					dde.setId(String.format("genID_%s_%d", dde.eClass().getName(), id_counter++));
				}
				if (dde.getDisplayName() == null || dde.getDisplayName().isEmpty()) {
					dde.setDisplayName(dde.getId());
				}
			}
		}

	}

	private SimpleState convert(Node node, List<State> exitState) {
		SimpleState result = null;
		if (node instanceof de.dfki.iui.mmds.core.model.dialogue.StateChart) {
			result = (SimpleState) convert((de.dfki.iui.mmds.core.model.dialogue.State) node, exitState);
		} else if (node instanceof Sequence) {
			result = convert((Sequence) node, exitState);
		} else if (node instanceof ExecutableContentNode) {
			result = convert((ExecutableContentNode) node, exitState);
		} else if (node instanceof Decision) {
			result = convert((Decision) node, exitState);
		} else if (node instanceof WaitForEvent) {
			result = convert((WaitForEvent) node, exitState);
		} else if (node instanceof DoWhile) {
			result = convert((DoWhile) node, exitState);
		} else if (node instanceof While) {
			result = convert((While) node, exitState);
		} else if (node != null) {
			System.err.println(String.format("node %s noch nicht behandelt!", node.eClass().getName()));
		}
		// create data-model for node variables
		if (result != null) {
			createDataModel(node, result);
			idToDialogueNode.put(result.getId(), node);
			idToScxmlState.put(result.getId(), result);
		}
		return result;
	}

	private void createDataModel(de.dfki.iui.mmds.core.model.dialogue.AbstractState source, State target) {
		if (target.getDatamodel() == null) {
			target.setDatamodel(ScxmlFactory.eINSTANCE.createDatamodel());
		}

		Data data = ScxmlFactory.eINSTANCE.createData();
		data.setId("stateID");
		data.setExpr(String.format("\"%s\"", target.getId()));
		target.getDatamodel().getData().add(0, data);

		for (Variable variable : source.getVariables()) {
			XData newData = ScxmlFactory.eINSTANCE.createXData();
			target.getDatamodel().getData().add(newData);
			newData.setId("_variable$" + variable.getName());
			newData.setObject(EcoreUtil.copy(variable));
		}
	}

	private State convert(de.dfki.iui.mmds.core.model.dialogue.State state, List<State> exitState) {
		// state level
		State scxmlState = state instanceof de.dfki.iui.mmds.core.model.dialogue.ParallelState ? ScxmlFactory.eINSTANCE.createParallelState() : ScxmlFactory.eINSTANCE.createSimpleState();
		OnEntry onEntry = ScxmlFactory.eINSTANCE.createOnEntry();
		for (ExecutableContent content : state.getOnEntry()) {
			convert(scxmlState, content, onEntry);
		}
		scxmlState.setOnentry(onEntry);
		OnExit onExit = ScxmlFactory.eINSTANCE.createOnExit();
		for (ExecutableContent content : state.getOnExit()) {
			convert(scxmlState, content, onExit);
		}
		scxmlState.setOnexit(onExit);
		SimpleState landingZone = null;
		targetMap.put(state, scxmlState);
		scxmlState.setId(state.getId());

		for (de.dfki.iui.mmds.core.model.dialogue.Transition transition : state.getTransitions()) {
			CondEventTransition scxmlTransition = createTransition(transition.getDisplayName());
			setTransitionCondition(scxmlState, scxmlTransition, transition.getId(), transition.getEvent(), transition.getOnTrigger());
			scxmlState.getTransition().add(scxmlTransition);
			transitionMap.put(scxmlTransition, transition);
		}

		// abstract composite state level
		if (state instanceof AbstractCompositeState) {
			AbstractCompositeState compositeState = (AbstractCompositeState) state;
			// child nodes verarbeiten
			for (de.dfki.iui.mmds.core.model.dialogue.AbstractState childState : compositeState.getStates()) {
				State scxmlChildState = null;
				// composite or state
				if (childState instanceof de.dfki.iui.mmds.core.model.dialogue.State && !(childState instanceof Node)) {
					scxmlChildState = convert((de.dfki.iui.mmds.core.model.dialogue.State) childState, null);
					createDataModel(childState, scxmlChildState);
				} else if (childState instanceof de.dfki.iui.mmds.core.model.dialogue.FinalState) {
					String id = state.getId() + "_end";
					SimpleState endState = createSimpleState(id, childState);
					scxmlState.getState().add(endState);
					exitState.add(endState);
					targetMap.put((TargetState) childState, endState);
				} else if (childState instanceof Node) {
					List<State> nodeEndState = new ArrayList<State>(1);
					scxmlChildState = convert((Node) childState, nodeEndState);
					targetMap.put((Node) childState, scxmlChildState);
					if (childState instanceof WaitForEvent) {
						landingZone = createSimpleState(scxmlChildState.getId() + "_landingZone", childState);
						scxmlChildState.getTransition().get(0).getTarget().add(landingZone);
						nodeEndState.set(0, landingZone);
					} else {
						nodeEndState.get(0).getTransition().clear();
					}
					for (de.dfki.iui.mmds.core.model.dialogue.Transition transition : ((Node) childState).getTransitions()) {
						CondEventTransition scxmlTransition = createTransition(transition.getId());
						nodeEndState.get(0).getTransition().add(scxmlTransition);
						setTransitionCondition(scxmlChildState, scxmlTransition, transition.getId(), transition.getEvent(), transition.getOnTrigger());
						transitionMap.put(scxmlTransition, transition);
					}
				} else {
					System.err.println(String.format("child vom typ %s  nicht verabeitet", childState.getClass().getName()));
				}

				if (scxmlChildState != null) {
					if (compositeState instanceof CompositeState && ((CompositeState) compositeState).getInitialState() == childState) {
						((SimpleState) scxmlState).setInitial1(scxmlChildState);
					}
					if (scxmlChildState instanceof SimpleState) {
						scxmlState.getState().add((SimpleState) scxmlChildState);
						if (landingZone != null) {
							scxmlState.getState().add(landingZone);
						}
					} else if (scxmlChildState instanceof ParallelState) {
						scxmlState.getParallel().add((ParallelState) scxmlChildState);
					}
				}
			}
			if (compositeState.getHistoryState() != null) {
				de.dfki.iui.mmds.core.model.dialogue.HistoryState historyState = compositeState.getHistoryState();
				HistoryState scxmlHistoryState = ScxmlFactory.eINSTANCE.createHistoryState();
				scxmlHistoryState.setId(historyState.getId());
				scxmlHistoryState.setType(historyState.getType() == HistoryType.DEEP ? HistoryTypeDatatype.DEEP : HistoryTypeDatatype.SHALLOW);
				scxmlState.setHistory(scxmlHistoryState);
				targetMap.put(historyState, scxmlHistoryState);
			}
		}

		// connect transition targets
		if (state instanceof de.dfki.iui.mmds.core.model.dialogue.StateChart) {
			for (Iterator<EObject> iter = scxmlState.eAllContents(); iter.hasNext();) {
				EObject item = iter.next();
				if (item instanceof Transition) {
					Transition transition = (Transition) item;
					try {
						if (transition.getTarget().isEmpty()) {
							transition.getTarget().add(targetMap.get(transitionMap.get(transition).getTarget()));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		idToScxmlState.put(scxmlState.getId(), scxmlState);
		idToDialogueNode.put(scxmlState.getId(), state);
		return scxmlState;
	}

	private SimpleState convert(Sequence sequence, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(sequence.getId());
		CondEventTransition tempTransition = null;

		State previousState = null;
		for (int i = 0; i < sequence.getContent().size(); ++i) {
			Node node = sequence.getContent().get(i);
			if (node instanceof WaitForEvent && previousState != null && !(sequence.getContent().get(i - 1) instanceof WaitForEvent)) {
				tempTransition = createTransition(node.getId() + "_transition");
				setTransitionCondition(scxmlState, tempTransition, node.getId() + "_transition", ((WaitForEvent) node).getEvent(), null);

			} else {
				List<State> childEndState = new ArrayList<State>(1);
				SimpleState scxmlContent = convert(node, childEndState);
				scxmlState.getState().add(scxmlContent);
				if (previousState != null) {
					CondEventTransition transition = previousState.getTransition().get(0);
					if (tempTransition != null) {
						transition.setCond(tempTransition.getCond());
						transition.setEvent(tempTransition.getEvent());
						tempTransition = null;
					}
					transition.getTarget().add(scxmlContent);
				} else {
					scxmlState.setInitial1(scxmlContent);
				}
				previousState = childEndState.get(0);
			}
		}

		if (tempTransition != null) {
			CondEventTransition transition = previousState.getTransition().get(0);
			transition.setCond(tempTransition.getCond());
			transition.setEvent(tempTransition.getEvent());
		}
		// special case: no body in sequence
		if (previousState == null) {
			previousState = scxmlState;
			scxmlState.getTransition().add(createTransition((sequence.getId() + "_exit")));
		}
		exitState.add(previousState);
		return scxmlState;
	}

	private SimpleState convert(ExecutableContentNode node, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(node.getId());
		OnEntry onEntry = ScxmlFactory.eINSTANCE.createOnEntry();
		for (ExecutableContent content : node.getContent()) {
			convert(scxmlState, content, onEntry);
		}
		scxmlState.setOnentry(onEntry);
		exitState.add(scxmlState);
		scxmlState.getTransition().add(createTransition(node.getId() + "_exit"));
		return scxmlState;
	}

	private void convert(DatamodelContainer datamodelContainer, ExecutableContent content, de.dfki.iui.mmds.scxml.ExecutableContent executableContent) {
		if (content instanceof de.dfki.iui.mmds.core.model.dialogue.Send) {
			de.dfki.iui.mmds.core.model.dialogue.Send sendContent = (de.dfki.iui.mmds.core.model.dialogue.Send) content;
			String sendID = "send_" + sendId_counter++;
			Send send = ScxmlFactory.eINSTANCE.createSend();
			send.setId(sendID);
			send.setType("output_event");
			send.setTarget("siam");
			send.setContent(EmfUtils.clone((sendContent.getOutputRequest())));
			executableContent.getSend().add(send);
		} else if (content instanceof InstanceAssign) {
			InstanceAssign instAssign = (InstanceAssign) content;
			
			XData instanceData = ScxmlFactory.eINSTANCE.createXData();
			instanceData.setId("instance_" + instanceId_counter++);
			instanceData.setObject(EmfUtils.clone(instAssign.getInstance() != null ? instAssign.getInstance() : instAssign.getCopyOf()));
			if (datamodelContainer.getDatamodel() == null) {
				datamodelContainer.setDatamodel(ScxmlFactory.eINSTANCE.createDatamodel());
			}
			datamodelContainer.getDatamodel().getData().add(instanceData);

			Assign assign = ScxmlFactory.eINSTANCE.createAssign();
			assign.setExpr("SIAM.evaluateContents(EmfUtils.cloneEObject(" + instanceData.getId() + "))");
			assign.setName(instAssign.getTo());
			executableContent.getAssign().add(assign);
		} else if (content instanceof InstanceModifyFeature) {
			InstanceModifyFeature instModFeat = (InstanceModifyFeature) content;
			EStructuralFeature feat = instModFeat.getFeature();
			Reference ref = DialogueFactory.eINSTANCE.createReference();
			ref.setReference(feat);
			
			XData instanceData = ScxmlFactory.eINSTANCE.createXData();
			instanceData.setId("instance_" + instanceId_counter++ + "_featReference");
			instanceData.setObject(ref);
			if (datamodelContainer.getDatamodel() == null) {
				datamodelContainer.setDatamodel(ScxmlFactory.eINSTANCE.createDatamodel());
			}
			datamodelContainer.getDatamodel().getData().add(instanceData);
			
			String newValue = instModFeat.getExpr();
			if (newValue == null || newValue.isEmpty()) {
				XData newValueData = ScxmlFactory.eINSTANCE.createXData();
				newValueData.setId("instance_" + instanceId_counter++);
				newValue = "SIAM.evaluateContents(EmfUtils.cloneEObject(" + newValueData.getId() + "))";
				newValueData.setObject(EmfUtils.clone(instModFeat.getObject()));
				if (datamodelContainer.getDatamodel() == null) {
					datamodelContainer.setDatamodel(ScxmlFactory.eINSTANCE.createDatamodel());
				}
				datamodelContainer.getDatamodel().getData().add(newValueData);
			}
			
			String modifyExpr = "(" + instModFeat.getTo() + ")";
			if (feat.isMany()) {
				if (instModFeat.getOperationType() == OperationType.UNSPECIFIED) {
					instModFeat.setOperationType(OperationType.SET);
				}
				switch (instModFeat.getOperationType()) {
					case SET:
						modifyExpr += ".eSet(" + instanceData.getId() + ".getReference(), EmfUtils.createEList(" + newValue + "))";
						break;
					case PREPEND:
						modifyExpr = "EmfUtils.addToEList(" + modifyExpr + ".eGet(" + instanceData.getId() + ".getReference()), 0, " + newValue + ")";
						break;
					case APPEND:
						modifyExpr = "EmfUtils.addToEList(" + modifyExpr + ".eGet(" + instanceData.getId() + ".getReference()), " + newValue + ")";
						break;
					default:
						break;
				}
			} else {
				modifyExpr += ".eSet(" + instanceData.getId() + ".getReference(), " + newValue + ")";
			}
			
			Assign assign = ScxmlFactory.eINSTANCE.createAssign();
			assign.setExpr(modifyExpr);
//			assign.setName(getTmpVariable(datamodelContainer));
			executableContent.getAssign().add(assign);
			
		} else if (content instanceof de.dfki.iui.mmds.core.model.dialogue.Assign) {
			de.dfki.iui.mmds.core.model.dialogue.Assign assignContent = (de.dfki.iui.mmds.core.model.dialogue.Assign) content;
			Assign assign = ScxmlFactory.eINSTANCE.createAssign();
			assign.setExpr(assignContent.getExpression());
			assign.setName(assignContent.getTo());
			executableContent.getAssign().add(assign);
		} else if (content instanceof de.dfki.iui.mmds.core.model.dialogue.If) {
			de.dfki.iui.mmds.core.model.dialogue.If ifContent = (de.dfki.iui.mmds.core.model.dialogue.If) content;
			de.dfki.iui.mmds.scxml.If if_element = ScxmlFactory.eINSTANCE.createIf();
			if_element.setCond(ifContent.getCondition());
			for (ExecutableContent innerContent : ifContent.getContent()) {
				convert(datamodelContainer, innerContent, if_element);
			}
			for (ElseIf elseIf : ifContent.getElseIf()) {
				de.dfki.iui.mmds.scxml.ElseIf elseIf_element = ScxmlFactory.eINSTANCE.createElseIf();
				elseIf_element.setCond(elseIf.getCondition());
				if_element.getElseif().add(elseIf_element);
				for (ExecutableContent innerContent : elseIf.getContent()) {
					convert(datamodelContainer, innerContent, if_element);
				}
			}
			if (ifContent.getElse() != null) {
				de.dfki.iui.mmds.scxml.Else else_element = ScxmlFactory.eINSTANCE.createElse();
				if_element.setElse(else_element);
				for (ExecutableContent innerContent : ifContent.getElse().getContent()) {
					convert(datamodelContainer, innerContent, if_element);
				}
			}
			executableContent.getIf().add(if_element);
		} else if (content instanceof de.dfki.iui.mmds.core.model.dialogue.Log) {
			de.dfki.iui.mmds.core.model.dialogue.Log logContent = (de.dfki.iui.mmds.core.model.dialogue.Log) content;
			de.dfki.iui.mmds.scxml.Log log_element = ScxmlFactory.eINSTANCE.createLog();
			log_element.setExpr(logContent.getExpression());
			log_element.setLabel(logContent.getLabel());
			executableContent.getLog().add(log_element);
		} else if (content instanceof Delay) {
			Delay delayContent = (Delay) content;
			Assign assign = ScxmlFactory.eINSTANCE.createAssign();
			assign.setExpr(String.format("SIAM.delay(%d)", delayContent.getDuration().getValue()));
			executableContent.getAssign().add(assign);
		} else if (content instanceof Raise) {
			// raise is not implemented in common scxml :( but standard says
			// send also works
			de.dfki.iui.mmds.core.model.dialogue.Raise raiseContent = (de.dfki.iui.mmds.core.model.dialogue.Raise) content;
			String sendID = "send_" + sendId_counter++;
			Send send = ScxmlFactory.eINSTANCE.createSend();
			send.setId(sendID);
			send.setType(raiseContent.getEvent());
			send.setTarget("siam");
			executableContent.getSend().add(send);
		} else
			throw new NotImplementedException();
	}

	private SimpleState convert(Decision node, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(node.getId());
		SimpleState beginState = createSimpleState(scxmlState.getId() + "_begin", node);
		scxmlState.getState().add(beginState);
		scxmlState.setInitial1(beginState);
		SimpleState endState = createSimpleState(scxmlState.getId() + "_end", node);
		endState.getTransition().add(createTransition(node.getId() + "_exit"));
		scxmlState.getState().add(endState);
		exitState.add(endState);

		// then
		CondEventTransition thenTransition = createTransition(node.getId() + "_then");
		if (node.getCondition() == null) {
			logger.warn(String.format("No condition specified in If node %s(%s)!", node.getDisplayName(), node.getId()));
		}
		beginState.getTransition().add(thenTransition);
		thenTransition.setCond(node.getCondition());
		List<State> endStateFromBody = new ArrayList<State>(1);
		SimpleState body = convert(node.getThen(), endStateFromBody);
		scxmlState.getState().add(body);
		thenTransition.getTarget().add(body);
		endStateFromBody.get(0).getTransition().get(0).getTarget().add(endState);

		// else
		CondEventTransition elseTransition = createTransition(node.getId() + "_else");
		beginState.getTransition().add(elseTransition);
		elseTransition.setCond("not (" + node.getCondition() + ")");
		endStateFromBody.clear();
		if (node.getElse() != null) {
			body = convert(node.getElse(), endStateFromBody);
			scxmlState.getState().add(body);
			elseTransition.getTarget().add(body);
			endStateFromBody.get(0).getTransition().get(0).getTarget().add(endState);
		} else {
			elseTransition.getTarget().add(endState);
		}

		return scxmlState;
	}

	private SimpleState convert(WaitForEvent node, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(node.getId());
		CondEventTransition transition = createTransition(node.getId() + "_exit");
		setTransitionCondition(scxmlState, transition, node.getId() + "_exit", node.getEvent(), null);
		scxmlState.getTransition().add(transition);
		exitState.add(scxmlState);

		return scxmlState;
	}

	private SimpleState convert(DoWhile node, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(node.getId());
		SimpleState bodyState = convert(node.getBody(), exitState);
		scxmlState.setInitial1(bodyState);
		scxmlState.getState().add(bodyState);

		CondEventTransition loop_transition = createTransition(node.getId() + "_loop");
		CondEventTransition end_transition = createTransition(node.getId() + "_leave");

		String condAdd = exitState.get(0).getTransition().get(0).getCond();
		if (condAdd != null) {
			SimpleState bodyTarget = createSimpleState(bodyState.getId() + "_target", node);
			scxmlState.getState().add(bodyTarget);
			exitState.get(0).getTransition().get(0).getTarget().add(bodyTarget);
			bodyTarget.getTransition().add(loop_transition);
			bodyTarget.getTransition().add(end_transition);
		} else {
			exitState.get(0).getTransition().clear();
			bodyState.getTransition().add(loop_transition);
			bodyState.getTransition().add(end_transition);
		}
		if (node.getCondition() == null) {
			logger.warn(String.format("No condition specified in DoWhile node %s(%s)!", node.getDisplayName(), node.getId()));
		}
		loop_transition.setCond(node.getCondition());
		loop_transition.getTarget().add(bodyState);
		SimpleState endState = createSimpleState(node.getId() + "_end", node);
		scxmlState.getState().add(endState);
		end_transition.setCond(String.format("not (%s)", node.getCondition()));
		end_transition.getTarget().add(endState);
		exitState.clear();
		exitState.add(endState);
		endState.getTransition().add(createTransition(node.getId() + "_exit"));
		return scxmlState;
	}

	private SimpleState convert(While node, List<State> exitState) {
		SimpleState scxmlState = ScxmlFactory.eINSTANCE.createSimpleState();
		scxmlState.setId(node.getId());
		SimpleState beginState = createSimpleState(node.getId() + "_start", node);
		scxmlState.getState().add(beginState);
		scxmlState.setInitial1(beginState);
		List<State> exitFromBody = new ArrayList<State>(1);
		SimpleState bodyState = convert(node.getBody(), exitFromBody);
		scxmlState.getState().add(bodyState);
		SimpleState endState = createSimpleState(node.getId() + "_end", node);
		scxmlState.getState().add(endState);
		exitState.add(endState);

		CondEventTransition condTrueFromStart = createTransition(node.getId() + "_first_true");
		CondEventTransition condFalseFromStart = createTransition(node.getId() + "_first_false");
		CondEventTransition condTrueFromBody = createTransition(node.getId() + "_true");
		CondEventTransition condFalseFromBody = createTransition(node.getId() + "_false");

		String condAdd = exitFromBody.get(0).getTransition().get(0).getCond();
		if (condAdd != null) {
			SimpleState bodyTarget = createSimpleState(bodyState.getId() + "_target", node);
			scxmlState.getState().add(bodyTarget);
			exitFromBody.get(0).getTransition().get(0).getTarget().add(bodyTarget);
			bodyTarget.getTransition().add(condTrueFromBody);
			bodyTarget.getTransition().add(condFalseFromBody);
		} else {
			exitFromBody.get(0).getTransition().clear();
			exitFromBody.get(0).getTransition().add(condTrueFromBody);
			exitFromBody.get(0).getTransition().add(condFalseFromBody);
		}

		if (node.getCondition() == null) {
			logger.warn(String.format("No condition specified in While node %s(%s)!", node.getDisplayName(), node.getId()));
		}
		condTrueFromStart.setCond(node.getCondition());
		condTrueFromBody.setCond(node.getCondition());
		condFalseFromStart.setCond(String.format("not (%s)", node.getCondition()));
		condFalseFromBody.setCond(String.format("not (%s)", node.getCondition()));

		// connect transitions
		beginState.getTransition().add(condTrueFromStart);
		beginState.getTransition().add(condFalseFromStart);
		condTrueFromStart.getTarget().add(bodyState);
		condFalseFromStart.getTarget().add(endState);
		condTrueFromBody.getTarget().add(bodyState);
		condFalseFromBody.getTarget().add(endState);
		endState.getTransition().add(createTransition(node.getId() + "_exit"));

		return scxmlState;
	}

	private CondEventTransition createTransition(String id) {
		CondEventTransition scxmlTransition = ScxmlFactory.eINSTANCE.createCondEventTransition();
		Log log = ScxmlFactory.eINSTANCE.createLog();
		log.setLabel(id);
		log.setExpr(String.format("\"Fire transition with id %s\"", id));
		scxmlTransition.getLog().add(log);
		return scxmlTransition;
	}

	private void setTransitionCondition(State transitionSource, CondEventTransition transition, String transitionId, CondEvent event, EList<ExecutableContent> onTrigger) {
		if (event != null) {
			String patternCondition;
			String condition;
			transition.setEvent(event.getEvent());
			if (event.getPattern() != null) {
				patternCondition = "";
				for (int i = 0; i < event.getPattern().size(); ++i) {
					if (i > 0) {
						patternCondition += " or ";
					}
					String pattern_id = "pattern_" + patternId_counter++;
					patternCondition += String.format("SIAM.unifies(%s, \"%s\", \"%s\")", pattern_id, transitionId, event.getEvent());
					XData patternData = ScxmlFactory.eINSTANCE.createXData();
					patternData.setId(pattern_id);
					patternData.setObject(EcoreUtil.copy(event.getPattern().get(i)));
					if (transitionSource.getDatamodel() == null) {
						transitionSource.setDatamodel(ScxmlFactory.eINSTANCE.createDatamodel());
					}
					transitionSource.getDatamodel().getData().add(patternData);
				}
				if (event.getPattern().size() > 1) {
					patternCondition = "(" + patternCondition + ")";
				}
				if (event.getCondition() != null && !event.getCondition().isEmpty()) {
					condition = event.getCondition() + (patternCondition.isEmpty() ? "" : " && " + patternCondition);
				} else {
					condition = patternCondition;
				}
				transition.setCond(condition);
			}
		}
		if (event instanceof InstanceCondEvent) {
			InstanceCondEvent instCondEvent = (InstanceCondEvent) event;
			if (instCondEvent.getInstanceMatchCondition() != null) {
				Datamodel datamodel = transitionSource.getDatamodel();
				if (datamodel == null) {
					transitionSource.setDatamodel(datamodel = ScxmlFactory.eINSTANCE.createDatamodel());
				}
				String condition = parseInstanceMatchCondition(instCondEvent.getEvent(), instCondEvent.getInstanceMatchCondition(), datamodel, transitionId);
				String format = transition.getCond() == null || transition.getCond().isEmpty() ? "%s" : "(" + transition.getCond() + ") and (%s)";
				transition.setCond(String.format(format, condition));
			}
		}
		if (onTrigger != null) {
			for (ExecutableContent content : onTrigger) {
				convert(transitionSource, content, transition);
			}
		}
	}

	private String parseInstanceMatchCondition(String event, InstanceMatchCondition instanceMatchCondition, Datamodel datamodel, String transitionId) {
		if (instanceMatchCondition instanceof InstanceMatchConditionAtom) {
			return parseInstanceMatchConditionAtom(event, (InstanceMatchConditionAtom) instanceMatchCondition, datamodel, transitionId);
		} else if (instanceMatchCondition instanceof InstanceMatchConditionFormula) {
			return parseInstanceMatchConditionFormula(event, (InstanceMatchConditionFormula) instanceMatchCondition, datamodel, transitionId);
		}
		logger.error("No instance expression or instance object provided for match condition in transition " + transitionId);
		throw new UnsupportedOperationException(instanceMatchCondition.toString() + " not supported!");
	}
	
	private String parseInstanceMatchConditionFormula(String event, InstanceMatchConditionFormula formula, Datamodel datamodel, String transitionId) {
		if (formula.getOperator() == PRestrictionsEnum.NOT && formula.getCond().size() != 1) {
			logger.error("The NOT operator expects exactly 1 match condition but " + formula.getCond().size() + " are given!");
		}
		
		String condition = "";
		boolean first = true;
		String op = formula.getOperator() == PRestrictionsEnum.AND ? " and " : " or ";
		for (InstanceMatchCondition matchCond : formula.getCond()) {
			condition += (first ? "" : op) + "(" + parseInstanceMatchCondition(event, matchCond, datamodel, transitionId) + ")";
			first = false;
		}
		return formula.getOperator() == PRestrictionsEnum.NOT ? String.format("not %s", condition) : condition;
	}

	private String parseInstanceMatchConditionAtom(String event, InstanceMatchConditionAtom matchCond, Datamodel datamodel, String transitionId) {
		String instCond = "";
		if (matchCond.getInstanceExpr() != null) {
			instCond = String.format("\"%s\"", matchCond.getInstanceExpr());
		} else if (matchCond.getInstance() != null) {
			XData instanceData = ScxmlFactory.eINSTANCE.createXData();
			instCond = "instance_" + instanceId_counter++;
			instanceData.setId(instCond);
			instanceData.setObject(EcoreUtil.copy(matchCond.getInstance()));
			datamodel.getData().add(instanceData);
		} else {
			logger.error("No instance expression or instance object provided for match condition in transition " + transitionId);
		}

		String pattern_id = "pattern_" + patternId_counter++;
		String patternCondition = String.format("SIAM.unifies(%s, %s, \"%s\", \"%s\")", instCond, pattern_id, transitionId, event);
		XData patternData = ScxmlFactory.eINSTANCE.createXData();
		patternData.setId(pattern_id);
		patternData.setObject(EcoreUtil.copy(matchCond.getPattern()));
		datamodel.getData().add(patternData);
		return patternCondition;
	}

	private SimpleState createSimpleState(String id, AbstractState sourceElement) {
		SimpleState state = ScxmlFactory.eINSTANCE.createSimpleState();
		state.setId(id);
		idToDialogueNode.put(id, sourceElement);
		return state;
	}
}
