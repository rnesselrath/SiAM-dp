/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.util;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.dfki.iui.mmds.scxml.AbstractSimpleState;
import de.dfki.iui.mmds.scxml.AbstractState;
import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.Conditional;
import de.dfki.iui.mmds.scxml.Content;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.DatamodelContainer;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.DescriptionContainer;
import de.dfki.iui.mmds.scxml.Donedata;
import de.dfki.iui.mmds.scxml.Else;
import de.dfki.iui.mmds.scxml.ElseIf;
import de.dfki.iui.mmds.scxml.ExecutableContent;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.HistoryState;
import de.dfki.iui.mmds.scxml.If;
import de.dfki.iui.mmds.scxml.InitialState;
import de.dfki.iui.mmds.scxml.Invoke;
import de.dfki.iui.mmds.scxml.Log;
import de.dfki.iui.mmds.scxml.Node;
import de.dfki.iui.mmds.scxml.OnEntry;
import de.dfki.iui.mmds.scxml.OnExit;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.Param;
import de.dfki.iui.mmds.scxml.Raise;
import de.dfki.iui.mmds.scxml.Script;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.Transition;
import de.dfki.iui.mmds.scxml.TransitionSource;
import de.dfki.iui.mmds.scxml.TransitionTarget;
import de.dfki.iui.mmds.scxml.Validate;
import de.dfki.iui.mmds.scxml.XData;
import de.dfki.iui.mmds.scxml.XObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage
 * @generated
 */
public class ScxmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScxmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlSwitch() {
		if (modelPackage == null) {
			modelPackage = ScxmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScxmlPackage.STATE_CHART: {
				StateChart stateChart = (StateChart)theEObject;
				T result = caseStateChart(stateChart);
				if (result == null) result = caseAbstractState(stateChart);
				if (result == null) result = caseAbstractSimpleState(stateChart);
				if (result == null) result = caseDatamodelContainer(stateChart);
				if (result == null) result = caseDescriptionContainer(stateChart);
				if (result == null) result = caseIAdaptable(stateChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDescriptionContainer(node);
				if (result == null) result = caseIAdaptable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.TRANSITION_SOURCE: {
				TransitionSource transitionSource = (TransitionSource)theEObject;
				T result = caseTransitionSource(transitionSource);
				if (result == null) result = caseNode(transitionSource);
				if (result == null) result = caseDescriptionContainer(transitionSource);
				if (result == null) result = caseIAdaptable(transitionSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.TRANSITION_TARGET: {
				TransitionTarget transitionTarget = (TransitionTarget)theEObject;
				T result = caseTransitionTarget(transitionTarget);
				if (result == null) result = caseNode(transitionTarget);
				if (result == null) result = caseDescriptionContainer(transitionTarget);
				if (result == null) result = caseIAdaptable(transitionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ABSTRACT_STATE: {
				AbstractState abstractState = (AbstractState)theEObject;
				T result = caseAbstractState(abstractState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseTransitionTarget(state);
				if (result == null) result = caseAbstractState(state);
				if (result == null) result = caseTransitionSource(state);
				if (result == null) result = caseDatamodelContainer(state);
				if (result == null) result = caseNode(state);
				if (result == null) result = caseDescriptionContainer(state);
				if (result == null) result = caseIAdaptable(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseExecutableContent(transition);
				if (result == null) result = caseDescriptionContainer(transition);
				if (result == null) result = caseIAdaptable(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.COND_EVENT_TRANSITION: {
				CondEventTransition condEventTransition = (CondEventTransition)theEObject;
				T result = caseCondEventTransition(condEventTransition);
				if (result == null) result = caseTransition(condEventTransition);
				if (result == null) result = caseExecutableContent(condEventTransition);
				if (result == null) result = caseDescriptionContainer(condEventTransition);
				if (result == null) result = caseIAdaptable(condEventTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseDescriptionContainer(initialState);
				if (result == null) result = caseIAdaptable(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DONEDATA: {
				Donedata donedata = (Donedata)theEObject;
				T result = caseDonedata(donedata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseTransitionTarget(finalState);
				if (result == null) result = caseNode(finalState);
				if (result == null) result = caseDescriptionContainer(finalState);
				if (result == null) result = caseIAdaptable(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.PARALLEL_STATE: {
				ParallelState parallelState = (ParallelState)theEObject;
				T result = caseParallelState(parallelState);
				if (result == null) result = caseState(parallelState);
				if (result == null) result = caseTransitionTarget(parallelState);
				if (result == null) result = caseAbstractState(parallelState);
				if (result == null) result = caseTransitionSource(parallelState);
				if (result == null) result = caseDatamodelContainer(parallelState);
				if (result == null) result = caseNode(parallelState);
				if (result == null) result = caseDescriptionContainer(parallelState);
				if (result == null) result = caseIAdaptable(parallelState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE: {
				AbstractSimpleState abstractSimpleState = (AbstractSimpleState)theEObject;
				T result = caseAbstractSimpleState(abstractSimpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.SIMPLE_STATE: {
				SimpleState simpleState = (SimpleState)theEObject;
				T result = caseSimpleState(simpleState);
				if (result == null) result = caseState(simpleState);
				if (result == null) result = caseAbstractSimpleState(simpleState);
				if (result == null) result = caseTransitionTarget(simpleState);
				if (result == null) result = caseAbstractState(simpleState);
				if (result == null) result = caseTransitionSource(simpleState);
				if (result == null) result = caseDatamodelContainer(simpleState);
				if (result == null) result = caseNode(simpleState);
				if (result == null) result = caseDescriptionContainer(simpleState);
				if (result == null) result = caseIAdaptable(simpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.HISTORY_STATE: {
				HistoryState historyState = (HistoryState)theEObject;
				T result = caseHistoryState(historyState);
				if (result == null) result = caseTransitionTarget(historyState);
				if (result == null) result = caseInitialState(historyState);
				if (result == null) result = caseNode(historyState);
				if (result == null) result = caseDescriptionContainer(historyState);
				if (result == null) result = caseIAdaptable(historyState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ON_ENTRY: {
				OnEntry onEntry = (OnEntry)theEObject;
				T result = caseOnEntry(onEntry);
				if (result == null) result = caseExecutableContent(onEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ON_EXIT: {
				OnExit onExit = (OnExit)theEObject;
				T result = caseOnExit(onExit);
				if (result == null) result = caseExecutableContent(onExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.EXECUTABLE_CONTENT: {
				ExecutableContent executableContent = (ExecutableContent)theEObject;
				T result = caseExecutableContent(executableContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.RAISE: {
				Raise raise = (Raise)theEObject;
				T result = caseRaise(raise);
				if (result == null) result = caseDonedata(raise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseConditional(if_);
				if (result == null) result = caseExecutableContent(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ELSE_IF: {
				ElseIf elseIf = (ElseIf)theEObject;
				T result = caseElseIf(elseIf);
				if (result == null) result = caseConditional(elseIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ELSE: {
				Else else_ = (Else)theEObject;
				T result = caseElse(else_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.LOG: {
				Log log = (Log)theEObject;
				T result = caseLog(log);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.SEND: {
				Send send = (Send)theEObject;
				T result = caseSend(send);
				if (result == null) result = caseDonedata(send);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.CANCEL: {
				Cancel cancel = (Cancel)theEObject;
				T result = caseCancel(cancel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.INVOKE: {
				Invoke invoke = (Invoke)theEObject;
				T result = caseInvoke(invoke);
				if (result == null) result = caseDonedata(invoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseDescriptionContainer(data);
				if (result == null) result = caseIAdaptable(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.XDATA: {
				XData xData = (XData)theEObject;
				T result = caseXData(xData);
				if (result == null) result = caseData(xData);
				if (result == null) result = caseDescriptionContainer(xData);
				if (result == null) result = caseIAdaptable(xData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.XOBJECT: {
				XObject xObject = (XObject)theEObject;
				T result = caseXObject(xObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DATAMODEL: {
				Datamodel datamodel = (Datamodel)theEObject;
				T result = caseDatamodel(datamodel);
				if (result == null) result = caseDescriptionContainer(datamodel);
				if (result == null) result = caseIAdaptable(datamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DATAMODEL_CONTAINER: {
				DatamodelContainer datamodelContainer = (DatamodelContainer)theEObject;
				T result = caseDatamodelContainer(datamodelContainer);
				if (result == null) result = caseIAdaptable(datamodelContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DESCRIPTION_CONTAINER: {
				DescriptionContainer descriptionContainer = (DescriptionContainer)theEObject;
				T result = caseDescriptionContainer(descriptionContainer);
				if (result == null) result = caseIAdaptable(descriptionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.VALIDATE: {
				Validate validate = (Validate)theEObject;
				T result = caseValidate(validate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScxmlPackage.IADAPTABLE: {
				IAdaptable iAdaptable = (IAdaptable)theEObject;
				T result = caseIAdaptable(iAdaptable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateChart(StateChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionSource(TransitionSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionTarget(TransitionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractState(AbstractState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cond Event Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cond Event Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondEventTransition(CondEventTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donedata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donedata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonedata(Donedata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelState(ParallelState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Simple State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSimpleState(AbstractSimpleState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleState(SimpleState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryState(HistoryState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnEntry(OnEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnExit(OnExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableContent(ExecutableContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaise(Raise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIf(ElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElse(Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancel(Cancel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoke(Invoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XData</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XData</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXData(XData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXObject(XObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodel(Datamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datamodel Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datamodel Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodelContainer(DatamodelContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionContainer(DescriptionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidate(Validate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAdaptable(IAdaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScxmlSwitch
