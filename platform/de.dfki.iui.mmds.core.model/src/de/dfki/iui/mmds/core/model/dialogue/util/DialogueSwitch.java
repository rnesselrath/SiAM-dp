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
/**
 */
package de.dfki.iui.mmds.core.model.dialogue.util;

import de.dfki.iui.mmds.core.model.dialogue.*;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.Else;
import de.dfki.iui.mmds.core.model.dialogue.ElseIf;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.If;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.Variable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage
 * @generated
 */
public class DialogueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static DialoguePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DialogueSwitch() {
		if (modelPackage == null) {
			modelPackage = DialoguePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DialoguePackage.DIALOGUE: {
				Dialogue dialogue = (Dialogue)theEObject;
				T result = caseDialogue(dialogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.DIALOGUE_DESIGNER_ELEMENT: {
				DialogueDesignerElement dialogueDesignerElement = (DialogueDesignerElement)theEObject;
				T result = caseDialogueDesignerElement(dialogueDesignerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractState(node);
				if (result == null) result = caseTargetState(node);
				if (result == null) result = caseSourceState(node);
				if (result == null) result = caseDialogueDesignerElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.COND_EVENT: {
				CondEvent condEvent = (CondEvent)theEObject;
				T result = caseCondEvent(condEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_COND_EVENT: {
				InstanceCondEvent instanceCondEvent = (InstanceCondEvent)theEObject;
				T result = caseInstanceCondEvent(instanceCondEvent);
				if (result == null) result = caseCondEvent(instanceCondEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_MATCH_CONDITION: {
				InstanceMatchCondition instanceMatchCondition = (InstanceMatchCondition)theEObject;
				T result = caseInstanceMatchCondition(instanceMatchCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA: {
				InstanceMatchConditionFormula instanceMatchConditionFormula = (InstanceMatchConditionFormula)theEObject;
				T result = caseInstanceMatchConditionFormula(instanceMatchConditionFormula);
				if (result == null) result = caseInstanceMatchCondition(instanceMatchConditionFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM: {
				InstanceMatchConditionAtom instanceMatchConditionAtom = (InstanceMatchConditionAtom)theEObject;
				T result = caseInstanceMatchConditionAtom(instanceMatchConditionAtom);
				if (result == null) result = caseInstanceMatchCondition(instanceMatchConditionAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.EXECUTABLE_CONTENT: {
				ExecutableContent executableContent = (ExecutableContent)theEObject;
				T result = caseExecutableContent(executableContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.RAISE: {
				Raise raise = (Raise)theEObject;
				T result = caseRaise(raise);
				if (result == null) result = caseExecutableContent(raise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.SEND: {
				Send send = (Send)theEObject;
				T result = caseSend(send);
				if (result == null) result = caseExecutableContent(send);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.LOG: {
				Log log = (Log)theEObject;
				T result = caseLog(log);
				if (result == null) result = caseExecutableContent(log);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseExecutableContent(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_ASSIGN: {
				InstanceAssign instanceAssign = (InstanceAssign)theEObject;
				T result = caseInstanceAssign(instanceAssign);
				if (result == null) result = caseExecutableContent(instanceAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.INSTANCE_MODIFY_FEATURE: {
				InstanceModifyFeature instanceModifyFeature = (InstanceModifyFeature)theEObject;
				T result = caseInstanceModifyFeature(instanceModifyFeature);
				if (result == null) result = caseExecutableContent(instanceModifyFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseExecutableContent(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.IADAPTABLE: {
				IAdaptable iAdaptable = (IAdaptable)theEObject;
				T result = caseIAdaptable(iAdaptable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseExecutableContent(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.ELSE_IF: {
				ElseIf elseIf = (ElseIf)theEObject;
				T result = caseElseIf(elseIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.ELSE: {
				Else else_ = (Else)theEObject;
				T result = caseElse(else_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseNode(sequence);
				if (result == null) result = caseAbstractState(sequence);
				if (result == null) result = caseTargetState(sequence);
				if (result == null) result = caseSourceState(sequence);
				if (result == null) result = caseDialogueDesignerElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseNode(decision);
				if (result == null) result = caseAbstractState(decision);
				if (result == null) result = caseTargetState(decision);
				if (result == null) result = caseSourceState(decision);
				if (result == null) result = caseDialogueDesignerElement(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.DO_WHILE: {
				DoWhile doWhile = (DoWhile)theEObject;
				T result = caseDoWhile(doWhile);
				if (result == null) result = caseNode(doWhile);
				if (result == null) result = caseAbstractState(doWhile);
				if (result == null) result = caseTargetState(doWhile);
				if (result == null) result = caseSourceState(doWhile);
				if (result == null) result = caseDialogueDesignerElement(doWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseNode(while_);
				if (result == null) result = caseAbstractState(while_);
				if (result == null) result = caseTargetState(while_);
				if (result == null) result = caseSourceState(while_);
				if (result == null) result = caseDialogueDesignerElement(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.FOR_EACH: {
				ForEach forEach = (ForEach)theEObject;
				T result = caseForEach(forEach);
				if (result == null) result = caseNode(forEach);
				if (result == null) result = caseAbstractState(forEach);
				if (result == null) result = caseTargetState(forEach);
				if (result == null) result = caseSourceState(forEach);
				if (result == null) result = caseDialogueDesignerElement(forEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.WAIT_FOR_EVENT: {
				WaitForEvent waitForEvent = (WaitForEvent)theEObject;
				T result = caseWaitForEvent(waitForEvent);
				if (result == null) result = caseNode(waitForEvent);
				if (result == null) result = caseAbstractState(waitForEvent);
				if (result == null) result = caseTargetState(waitForEvent);
				if (result == null) result = caseSourceState(waitForEvent);
				if (result == null) result = caseDialogueDesignerElement(waitForEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.EXECUTABLE_CONTENT_NODE: {
				ExecutableContentNode executableContentNode = (ExecutableContentNode)theEObject;
				T result = caseExecutableContentNode(executableContentNode);
				if (result == null) result = caseNode(executableContentNode);
				if (result == null) result = caseAbstractState(executableContentNode);
				if (result == null) result = caseTargetState(executableContentNode);
				if (result == null) result = caseSourceState(executableContentNode);
				if (result == null) result = caseDialogueDesignerElement(executableContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.STATE_CHART: {
				StateChart stateChart = (StateChart)theEObject;
				T result = caseStateChart(stateChart);
				if (result == null) result = caseNode(stateChart);
				if (result == null) result = caseCompositeState(stateChart);
				if (result == null) result = caseAbstractCompositeState(stateChart);
				if (result == null) result = caseDialogueDesignerElement(stateChart);
				if (result == null) result = caseState(stateChart);
				if (result == null) result = caseAbstractState(stateChart);
				if (result == null) result = caseTargetState(stateChart);
				if (result == null) result = caseSourceState(stateChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.ABSTRACT_STATE: {
				AbstractState abstractState = (AbstractState)theEObject;
				T result = caseAbstractState(abstractState);
				if (result == null) result = caseDialogueDesignerElement(abstractState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseAbstractState(state);
				if (result == null) result = caseSourceState(state);
				if (result == null) result = caseTargetState(state);
				if (result == null) result = caseDialogueDesignerElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.ABSTRACT_COMPOSITE_STATE: {
				AbstractCompositeState abstractCompositeState = (AbstractCompositeState)theEObject;
				T result = caseAbstractCompositeState(abstractCompositeState);
				if (result == null) result = caseState(abstractCompositeState);
				if (result == null) result = caseAbstractState(abstractCompositeState);
				if (result == null) result = caseSourceState(abstractCompositeState);
				if (result == null) result = caseTargetState(abstractCompositeState);
				if (result == null) result = caseDialogueDesignerElement(abstractCompositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.COMPOSITE_STATE: {
				CompositeState compositeState = (CompositeState)theEObject;
				T result = caseCompositeState(compositeState);
				if (result == null) result = caseAbstractCompositeState(compositeState);
				if (result == null) result = caseState(compositeState);
				if (result == null) result = caseAbstractState(compositeState);
				if (result == null) result = caseSourceState(compositeState);
				if (result == null) result = caseTargetState(compositeState);
				if (result == null) result = caseDialogueDesignerElement(compositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.PARALLEL_STATE: {
				ParallelState parallelState = (ParallelState)theEObject;
				T result = caseParallelState(parallelState);
				if (result == null) result = caseAbstractCompositeState(parallelState);
				if (result == null) result = caseState(parallelState);
				if (result == null) result = caseAbstractState(parallelState);
				if (result == null) result = caseSourceState(parallelState);
				if (result == null) result = caseTargetState(parallelState);
				if (result == null) result = caseDialogueDesignerElement(parallelState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseAbstractState(finalState);
				if (result == null) result = caseTargetState(finalState);
				if (result == null) result = caseDialogueDesignerElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.HISTORY_STATE: {
				HistoryState historyState = (HistoryState)theEObject;
				T result = caseHistoryState(historyState);
				if (result == null) result = caseTargetState(historyState);
				if (result == null) result = caseDialogueDesignerElement(historyState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseDialogueDesignerElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.SOURCE_STATE: {
				SourceState sourceState = (SourceState)theEObject;
				T result = caseSourceState(sourceState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DialoguePackage.TARGET_STATE: {
				TargetState targetState = (TargetState)theEObject;
				T result = caseTargetState(targetState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Node</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Content</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaise(Raise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Send</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Log</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceAssign(InstanceAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Modify Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Modify Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceModifyFeature(InstanceModifyFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAdaptable(IAdaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>If</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIf(ElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Else</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElse(Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhile(DoWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait For Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait For Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitForEvent(WaitForEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableContentNode(ExecutableContentNode object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCompositeState(AbstractCompositeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeState(CompositeState object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Source State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceState(SourceState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetState(TargetState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cond Event</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cond Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondEvent(CondEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Cond Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Cond Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceCondEvent(InstanceCondEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Match Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Match Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceMatchCondition(InstanceMatchCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Match Condition Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Match Condition Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceMatchConditionFormula(InstanceMatchConditionFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Match Condition Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Match Condition Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceMatchConditionAtom(InstanceMatchConditionAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogue(Dialogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designer Element</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogueDesignerElement(DialogueDesignerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // DialogueSwitch
