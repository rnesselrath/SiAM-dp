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
package de.dfki.iui.mmds.core.model.primitiveTasks.output.util;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.output.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage
 * @generated
 */
public class OutputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSwitch() {
		if (modelPackage == null) {
			modelPackage = OutputPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case OutputPackage.PRIMITIVE_OUTPUT_TASK: {
				PrimitiveOutputTask primitiveOutputTask = (PrimitiveOutputTask)theEObject;
				T result = casePrimitiveOutputTask(primitiveOutputTask);
				if (result == null) result = casePrimitiveTask(primitiveOutputTask);
				if (result == null) result = caseOutputRepresentation(primitiveOutputTask);
				if (result == null) result = caseIORepresentation(primitiveOutputTask);
				if (result == null) result = caseBObject(primitiveOutputTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.SELECTION_TASK_BASE: {
				SelectionTaskBase selectionTaskBase = (SelectionTaskBase)theEObject;
				T result = caseSelectionTaskBase(selectionTaskBase);
				if (result == null) result = casePrimitiveOutputTask(selectionTaskBase);
				if (result == null) result = casePrimitiveTask(selectionTaskBase);
				if (result == null) result = caseOutputRepresentation(selectionTaskBase);
				if (result == null) result = caseIORepresentation(selectionTaskBase);
				if (result == null) result = caseBObject(selectionTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.ADAPTATION_TASK_BASE: {
				AdaptationTaskBase adaptationTaskBase = (AdaptationTaskBase)theEObject;
				T result = caseAdaptationTaskBase(adaptationTaskBase);
				if (result == null) result = casePrimitiveOutputTask(adaptationTaskBase);
				if (result == null) result = casePrimitiveTask(adaptationTaskBase);
				if (result == null) result = caseOutputRepresentation(adaptationTaskBase);
				if (result == null) result = caseIORepresentation(adaptationTaskBase);
				if (result == null) result = caseBObject(adaptationTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.FACT_ENTRY_TASK_BASE: {
				FactEntryTaskBase factEntryTaskBase = (FactEntryTaskBase)theEObject;
				T result = caseFactEntryTaskBase(factEntryTaskBase);
				if (result == null) result = casePrimitiveOutputTask(factEntryTaskBase);
				if (result == null) result = casePrimitiveTask(factEntryTaskBase);
				if (result == null) result = caseOutputRepresentation(factEntryTaskBase);
				if (result == null) result = caseIORepresentation(factEntryTaskBase);
				if (result == null) result = caseBObject(factEntryTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.MESSAGE_TASK: {
				MessageTask messageTask = (MessageTask)theEObject;
				T result = caseMessageTask(messageTask);
				if (result == null) result = casePrimitiveOutputTask(messageTask);
				if (result == null) result = casePrimitiveTask(messageTask);
				if (result == null) result = caseOutputRepresentation(messageTask);
				if (result == null) result = caseIORepresentation(messageTask);
				if (result == null) result = caseBObject(messageTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.DOCUMENT_PRESENTATION_TASK: {
				DocumentPresentationTask documentPresentationTask = (DocumentPresentationTask)theEObject;
				T result = caseDocumentPresentationTask(documentPresentationTask);
				if (result == null) result = casePrimitiveOutputTask(documentPresentationTask);
				if (result == null) result = casePrimitiveTask(documentPresentationTask);
				if (result == null) result = caseOutputRepresentation(documentPresentationTask);
				if (result == null) result = caseIORepresentation(documentPresentationTask);
				if (result == null) result = caseBObject(documentPresentationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.COMMAND_SELECTION_TASK: {
				CommandSelectionTask commandSelectionTask = (CommandSelectionTask)theEObject;
				T result = caseCommandSelectionTask(commandSelectionTask);
				if (result == null) result = casePrimitiveOutputTask(commandSelectionTask);
				if (result == null) result = casePrimitiveTask(commandSelectionTask);
				if (result == null) result = caseOutputRepresentation(commandSelectionTask);
				if (result == null) result = caseIORepresentation(commandSelectionTask);
				if (result == null) result = caseBObject(commandSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.MENU_ITEM_SELECTION_TASK: {
				MenuItemSelectionTask menuItemSelectionTask = (MenuItemSelectionTask)theEObject;
				T result = caseMenuItemSelectionTask(menuItemSelectionTask);
				if (result == null) result = casePrimitiveOutputTask(menuItemSelectionTask);
				if (result == null) result = casePrimitiveTask(menuItemSelectionTask);
				if (result == null) result = caseOutputRepresentation(menuItemSelectionTask);
				if (result == null) result = caseIORepresentation(menuItemSelectionTask);
				if (result == null) result = caseBObject(menuItemSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.PROGRESS_INDICATION_TASK: {
				ProgressIndicationTask progressIndicationTask = (ProgressIndicationTask)theEObject;
				T result = caseProgressIndicationTask(progressIndicationTask);
				if (result == null) result = casePrimitiveOutputTask(progressIndicationTask);
				if (result == null) result = casePrimitiveTask(progressIndicationTask);
				if (result == null) result = caseOutputRepresentation(progressIndicationTask);
				if (result == null) result = caseIORepresentation(progressIndicationTask);
				if (result == null) result = caseBObject(progressIndicationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.ADAPTATION_INDICATION_TASK: {
				AdaptationIndicationTask adaptationIndicationTask = (AdaptationIndicationTask)theEObject;
				T result = caseAdaptationIndicationTask(adaptationIndicationTask);
				if (result == null) result = caseInput_AdaptationTaskBase(adaptationIndicationTask);
				if (result == null) result = casePrimitiveInputTask(adaptationIndicationTask);
				if (result == null) result = casePrimitiveTask(adaptationIndicationTask);
				if (result == null) result = caseInputRepresentation(adaptationIndicationTask);
				if (result == null) result = caseIORepresentation(adaptationIndicationTask);
				if (result == null) result = caseBObject(adaptationIndicationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.MANIPULABLE_IMAGE_TASK: {
				ManipulableImageTask manipulableImageTask = (ManipulableImageTask)theEObject;
				T result = caseManipulableImageTask(manipulableImageTask);
				if (result == null) result = casePrimitiveOutputTask(manipulableImageTask);
				if (result == null) result = casePrimitiveTask(manipulableImageTask);
				if (result == null) result = caseOutputRepresentation(manipulableImageTask);
				if (result == null) result = caseIORepresentation(manipulableImageTask);
				if (result == null) result = caseBObject(manipulableImageTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.FREE_TEXT_ENTRY_TASK: {
				FreeTextEntryTask freeTextEntryTask = (FreeTextEntryTask)theEObject;
				T result = caseFreeTextEntryTask(freeTextEntryTask);
				if (result == null) result = caseInput_FactEntryTaskBase(freeTextEntryTask);
				if (result == null) result = casePrimitiveInputTask(freeTextEntryTask);
				if (result == null) result = casePrimitiveTask(freeTextEntryTask);
				if (result == null) result = caseInputRepresentation(freeTextEntryTask);
				if (result == null) result = caseIORepresentation(freeTextEntryTask);
				if (result == null) result = caseBObject(freeTextEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.DATE_TIME_ENTRY_TASK: {
				DateTimeEntryTask dateTimeEntryTask = (DateTimeEntryTask)theEObject;
				T result = caseDateTimeEntryTask(dateTimeEntryTask);
				if (result == null) result = caseInput_FactEntryTaskBase(dateTimeEntryTask);
				if (result == null) result = casePrimitiveInputTask(dateTimeEntryTask);
				if (result == null) result = casePrimitiveTask(dateTimeEntryTask);
				if (result == null) result = caseInputRepresentation(dateTimeEntryTask);
				if (result == null) result = caseIORepresentation(dateTimeEntryTask);
				if (result == null) result = caseBObject(dateTimeEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.INTEGER_NUMBER_ENTRY_TASK: {
				IntegerNumberEntryTask integerNumberEntryTask = (IntegerNumberEntryTask)theEObject;
				T result = caseIntegerNumberEntryTask(integerNumberEntryTask);
				if (result == null) result = caseInput_FactEntryTaskBase(integerNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(integerNumberEntryTask);
				if (result == null) result = casePrimitiveTask(integerNumberEntryTask);
				if (result == null) result = caseInputRepresentation(integerNumberEntryTask);
				if (result == null) result = caseIORepresentation(integerNumberEntryTask);
				if (result == null) result = caseBObject(integerNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK: {
				BoundedIntegerNumberEntryTask boundedIntegerNumberEntryTask = (BoundedIntegerNumberEntryTask)theEObject;
				T result = caseBoundedIntegerNumberEntryTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseInput_BoundedIntegerNumberEntryTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseInput_IntegerNumberEntryTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseInput_FactEntryTaskBase(boundedIntegerNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(boundedIntegerNumberEntryTask);
				if (result == null) result = casePrimitiveTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseInputRepresentation(boundedIntegerNumberEntryTask);
				if (result == null) result = caseIORepresentation(boundedIntegerNumberEntryTask);
				if (result == null) result = caseBObject(boundedIntegerNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.DECIMAL_NUMBER_ENTRY_TASK: {
				DecimalNumberEntryTask decimalNumberEntryTask = (DecimalNumberEntryTask)theEObject;
				T result = caseDecimalNumberEntryTask(decimalNumberEntryTask);
				if (result == null) result = caseInput_FactEntryTaskBase(decimalNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(decimalNumberEntryTask);
				if (result == null) result = casePrimitiveTask(decimalNumberEntryTask);
				if (result == null) result = caseInputRepresentation(decimalNumberEntryTask);
				if (result == null) result = caseIORepresentation(decimalNumberEntryTask);
				if (result == null) result = caseBObject(decimalNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.YES_NO_SELECTION_TASK: {
				YesNoSelectionTask yesNoSelectionTask = (YesNoSelectionTask)theEObject;
				T result = caseYesNoSelectionTask(yesNoSelectionTask);
				if (result == null) result = caseInput_FactEntryTaskBase(yesNoSelectionTask);
				if (result == null) result = caseInput_SelectionTaskBase(yesNoSelectionTask);
				if (result == null) result = casePrimitiveInputTask(yesNoSelectionTask);
				if (result == null) result = casePrimitiveTask(yesNoSelectionTask);
				if (result == null) result = caseInputRepresentation(yesNoSelectionTask);
				if (result == null) result = caseIORepresentation(yesNoSelectionTask);
				if (result == null) result = caseBObject(yesNoSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.TRI_STATE_SELECTION_TASK: {
				TriStateSelectionTask triStateSelectionTask = (TriStateSelectionTask)theEObject;
				T result = caseTriStateSelectionTask(triStateSelectionTask);
				if (result == null) result = caseInput_FactEntryTaskBase(triStateSelectionTask);
				if (result == null) result = caseInput_SelectionTaskBase(triStateSelectionTask);
				if (result == null) result = casePrimitiveInputTask(triStateSelectionTask);
				if (result == null) result = casePrimitiveTask(triStateSelectionTask);
				if (result == null) result = caseInputRepresentation(triStateSelectionTask);
				if (result == null) result = caseIORepresentation(triStateSelectionTask);
				if (result == null) result = caseBObject(triStateSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.LIST_ITEM_SELECTION_TASK: {
				ListItemSelectionTask listItemSelectionTask = (ListItemSelectionTask)theEObject;
				T result = caseListItemSelectionTask(listItemSelectionTask);
				if (result == null) result = caseSelectionTaskBase(listItemSelectionTask);
				if (result == null) result = casePrimitiveOutputTask(listItemSelectionTask);
				if (result == null) result = casePrimitiveTask(listItemSelectionTask);
				if (result == null) result = caseOutputRepresentation(listItemSelectionTask);
				if (result == null) result = caseIORepresentation(listItemSelectionTask);
				if (result == null) result = caseBObject(listItemSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.LONG_LIST_ITEM_SELECTION_TASK: {
				LongListItemSelectionTask longListItemSelectionTask = (LongListItemSelectionTask)theEObject;
				T result = caseLongListItemSelectionTask(longListItemSelectionTask);
				if (result == null) result = caseInput_ListItemSelectionTask(longListItemSelectionTask);
				if (result == null) result = caseInput_SelectionTaskBase(longListItemSelectionTask);
				if (result == null) result = casePrimitiveInputTask(longListItemSelectionTask);
				if (result == null) result = casePrimitiveTask(longListItemSelectionTask);
				if (result == null) result = caseInputRepresentation(longListItemSelectionTask);
				if (result == null) result = caseIORepresentation(longListItemSelectionTask);
				if (result == null) result = caseBObject(longListItemSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.SHORT_ITEM_SELECTION_TASK: {
				ShortItemSelectionTask shortItemSelectionTask = (ShortItemSelectionTask)theEObject;
				T result = caseShortItemSelectionTask(shortItemSelectionTask);
				if (result == null) result = caseInput_ListItemSelectionTask(shortItemSelectionTask);
				if (result == null) result = caseInput_SelectionTaskBase(shortItemSelectionTask);
				if (result == null) result = casePrimitiveInputTask(shortItemSelectionTask);
				if (result == null) result = casePrimitiveTask(shortItemSelectionTask);
				if (result == null) result = caseInputRepresentation(shortItemSelectionTask);
				if (result == null) result = caseIORepresentation(shortItemSelectionTask);
				if (result == null) result = caseBObject(shortItemSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.LIST_ITEM_MULTI_SELECTION_TASK: {
				ListItemMultiSelectionTask listItemMultiSelectionTask = (ListItemMultiSelectionTask)theEObject;
				T result = caseListItemMultiSelectionTask(listItemMultiSelectionTask);
				if (result == null) result = casePrimitiveOutputTask(listItemMultiSelectionTask);
				if (result == null) result = casePrimitiveTask(listItemMultiSelectionTask);
				if (result == null) result = caseOutputRepresentation(listItemMultiSelectionTask);
				if (result == null) result = caseIORepresentation(listItemMultiSelectionTask);
				if (result == null) result = caseBObject(listItemMultiSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.MESSAGE_DISMISSAL_TASK: {
				MessageDismissalTask messageDismissalTask = (MessageDismissalTask)theEObject;
				T result = caseMessageDismissalTask(messageDismissalTask);
				if (result == null) result = caseInput_AdaptationTaskBase(messageDismissalTask);
				if (result == null) result = casePrimitiveInputTask(messageDismissalTask);
				if (result == null) result = casePrimitiveTask(messageDismissalTask);
				if (result == null) result = caseInputRepresentation(messageDismissalTask);
				if (result == null) result = caseIORepresentation(messageDismissalTask);
				if (result == null) result = caseBObject(messageDismissalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutputPackage.OBJECT_SELECTION_TASK: {
				ObjectSelectionTask objectSelectionTask = (ObjectSelectionTask)theEObject;
				T result = caseObjectSelectionTask(objectSelectionTask);
				if (result == null) result = caseInput_SelectionTaskBase(objectSelectionTask);
				if (result == null) result = casePrimitiveInputTask(objectSelectionTask);
				if (result == null) result = casePrimitiveTask(objectSelectionTask);
				if (result == null) result = caseInputRepresentation(objectSelectionTask);
				if (result == null) result = caseIORepresentation(objectSelectionTask);
				if (result == null) result = caseBObject(objectSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Output Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Output Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveOutputTask(PrimitiveOutputTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionTaskBase(SelectionTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationTaskBase(AdaptationTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Entry Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Entry Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactEntryTaskBase(FactEntryTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTask(MessageTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Presentation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Presentation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentPresentationTask(DocumentPresentationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandSelectionTask(CommandSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItemSelectionTask(MenuItemSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Indication Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Indication Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressIndicationTask(ProgressIndicationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Indication Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Indication Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationIndicationTask(AdaptationIndicationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manipulable Image Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manipulable Image Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManipulableImageTask(ManipulableImageTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeTextEntryTask(FreeTextEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeEntryTask(DateTimeEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Number Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerNumberEntryTask(IntegerNumberEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Integer Number Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedIntegerNumberEntryTask(BoundedIntegerNumberEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Number Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalNumberEntryTask(DecimalNumberEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yes No Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yes No Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYesNoSelectionTask(YesNoSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tri State Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tri State Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriStateSelectionTask(TriStateSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemSelectionTask(ListItemSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long List Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long List Item Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongListItemSelectionTask(LongListItemSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Item Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortItemSelectionTask(ShortItemSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Multi Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Multi Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemMultiSelectionTask(ListItemMultiSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Dismissal Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Dismissal Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDismissalTask(MessageDismissalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSelectionTask(ObjectSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTask(PrimitiveTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIORepresentation(IORepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRepresentation(OutputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRepresentation(InputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Input Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Input Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveInputTask(PrimitiveInputTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_AdaptationTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Entry Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Entry Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_FactEntryTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Number Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_IntegerNumberEntryTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Integer Number Entry Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_BoundedIntegerNumberEntryTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_SelectionTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_ListItemSelectionTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask object) {
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

} //OutputSwitch
