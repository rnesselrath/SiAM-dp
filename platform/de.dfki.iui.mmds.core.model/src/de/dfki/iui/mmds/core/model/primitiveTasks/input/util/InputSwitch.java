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
package de.dfki.iui.mmds.core.model.primitiveTasks.input.util;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.*;

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
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage
 * @generated
 */
public class InputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSwitch() {
		if (modelPackage == null) {
			modelPackage = InputPackage.eINSTANCE;
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
			case InputPackage.PRIMITIVE_INPUT_TASK: {
				PrimitiveInputTask primitiveInputTask = (PrimitiveInputTask)theEObject;
				T result = casePrimitiveInputTask(primitiveInputTask);
				if (result == null) result = casePrimitiveTask(primitiveInputTask);
				if (result == null) result = caseInputRepresentation(primitiveInputTask);
				if (result == null) result = caseIORepresentation(primitiveInputTask);
				if (result == null) result = caseBObject(primitiveInputTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.CONTAINER_MANIPULATION_TASK_BASE: {
				ContainerManipulationTaskBase containerManipulationTaskBase = (ContainerManipulationTaskBase)theEObject;
				T result = caseContainerManipulationTaskBase(containerManipulationTaskBase);
				if (result == null) result = casePrimitiveInputTask(containerManipulationTaskBase);
				if (result == null) result = casePrimitiveTask(containerManipulationTaskBase);
				if (result == null) result = caseInputRepresentation(containerManipulationTaskBase);
				if (result == null) result = caseIORepresentation(containerManipulationTaskBase);
				if (result == null) result = caseBObject(containerManipulationTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.SELECTION_TASK_BASE: {
				SelectionTaskBase selectionTaskBase = (SelectionTaskBase)theEObject;
				T result = caseSelectionTaskBase(selectionTaskBase);
				if (result == null) result = casePrimitiveInputTask(selectionTaskBase);
				if (result == null) result = casePrimitiveTask(selectionTaskBase);
				if (result == null) result = caseInputRepresentation(selectionTaskBase);
				if (result == null) result = caseIORepresentation(selectionTaskBase);
				if (result == null) result = caseBObject(selectionTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.FACT_ENTRY_TASK_BASE: {
				FactEntryTaskBase factEntryTaskBase = (FactEntryTaskBase)theEObject;
				T result = caseFactEntryTaskBase(factEntryTaskBase);
				if (result == null) result = casePrimitiveInputTask(factEntryTaskBase);
				if (result == null) result = casePrimitiveTask(factEntryTaskBase);
				if (result == null) result = caseInputRepresentation(factEntryTaskBase);
				if (result == null) result = caseIORepresentation(factEntryTaskBase);
				if (result == null) result = caseBObject(factEntryTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.NAVIGATION_TASK_BASE: {
				NavigationTaskBase navigationTaskBase = (NavigationTaskBase)theEObject;
				T result = caseNavigationTaskBase(navigationTaskBase);
				if (result == null) result = casePrimitiveInputTask(navigationTaskBase);
				if (result == null) result = casePrimitiveTask(navigationTaskBase);
				if (result == null) result = caseInputRepresentation(navigationTaskBase);
				if (result == null) result = caseIORepresentation(navigationTaskBase);
				if (result == null) result = caseBObject(navigationTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.INVOCATION_TASK_BASE: {
				InvocationTaskBase invocationTaskBase = (InvocationTaskBase)theEObject;
				T result = caseInvocationTaskBase(invocationTaskBase);
				if (result == null) result = casePrimitiveInputTask(invocationTaskBase);
				if (result == null) result = casePrimitiveTask(invocationTaskBase);
				if (result == null) result = caseInputRepresentation(invocationTaskBase);
				if (result == null) result = caseIORepresentation(invocationTaskBase);
				if (result == null) result = caseBObject(invocationTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.ADAPTATION_TASK_BASE: {
				AdaptationTaskBase adaptationTaskBase = (AdaptationTaskBase)theEObject;
				T result = caseAdaptationTaskBase(adaptationTaskBase);
				if (result == null) result = casePrimitiveInputTask(adaptationTaskBase);
				if (result == null) result = casePrimitiveTask(adaptationTaskBase);
				if (result == null) result = caseInputRepresentation(adaptationTaskBase);
				if (result == null) result = caseIORepresentation(adaptationTaskBase);
				if (result == null) result = caseBObject(adaptationTaskBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.ZOOM_TASK: {
				ZoomTask zoomTask = (ZoomTask)theEObject;
				T result = caseZoomTask(zoomTask);
				if (result == null) result = caseContainerManipulationTaskBase(zoomTask);
				if (result == null) result = casePrimitiveInputTask(zoomTask);
				if (result == null) result = casePrimitiveTask(zoomTask);
				if (result == null) result = caseInputRepresentation(zoomTask);
				if (result == null) result = caseIORepresentation(zoomTask);
				if (result == null) result = caseBObject(zoomTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.PAN_TASK: {
				PanTask panTask = (PanTask)theEObject;
				T result = casePanTask(panTask);
				if (result == null) result = caseContainerManipulationTaskBase(panTask);
				if (result == null) result = casePrimitiveInputTask(panTask);
				if (result == null) result = casePrimitiveTask(panTask);
				if (result == null) result = caseInputRepresentation(panTask);
				if (result == null) result = caseIORepresentation(panTask);
				if (result == null) result = caseBObject(panTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.SCROLL_TASK: {
				ScrollTask scrollTask = (ScrollTask)theEObject;
				T result = caseScrollTask(scrollTask);
				if (result == null) result = caseContainerManipulationTaskBase(scrollTask);
				if (result == null) result = casePrimitiveInputTask(scrollTask);
				if (result == null) result = casePrimitiveTask(scrollTask);
				if (result == null) result = caseInputRepresentation(scrollTask);
				if (result == null) result = caseIORepresentation(scrollTask);
				if (result == null) result = caseBObject(scrollTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.INTRA_DOCUMENT_NAVIGATION_TASK: {
				IntraDocumentNavigationTask intraDocumentNavigationTask = (IntraDocumentNavigationTask)theEObject;
				T result = caseIntraDocumentNavigationTask(intraDocumentNavigationTask);
				if (result == null) result = caseNavigationTaskBase(intraDocumentNavigationTask);
				if (result == null) result = casePrimitiveInputTask(intraDocumentNavigationTask);
				if (result == null) result = casePrimitiveTask(intraDocumentNavigationTask);
				if (result == null) result = caseInputRepresentation(intraDocumentNavigationTask);
				if (result == null) result = caseIORepresentation(intraDocumentNavigationTask);
				if (result == null) result = caseBObject(intraDocumentNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK: {
				DialogFlowDirectionalNavigationTask dialogFlowDirectionalNavigationTask = (DialogFlowDirectionalNavigationTask)theEObject;
				T result = caseDialogFlowDirectionalNavigationTask(dialogFlowDirectionalNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowDirectionalNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowDirectionalNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowDirectionalNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowDirectionalNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowDirectionalNavigationTask);
				if (result == null) result = caseBObject(dialogFlowDirectionalNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_FORWARD_NAVIGATION_TASK: {
				DialogFlowForwardNavigationTask dialogFlowForwardNavigationTask = (DialogFlowForwardNavigationTask)theEObject;
				T result = caseDialogFlowForwardNavigationTask(dialogFlowForwardNavigationTask);
				if (result == null) result = caseDialogFlowDirectionalNavigationTask(dialogFlowForwardNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowForwardNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowForwardNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowForwardNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowForwardNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowForwardNavigationTask);
				if (result == null) result = caseBObject(dialogFlowForwardNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_BACKWARD_NAVIGATION_TASK: {
				DialogFlowBackwardNavigationTask dialogFlowBackwardNavigationTask = (DialogFlowBackwardNavigationTask)theEObject;
				T result = caseDialogFlowBackwardNavigationTask(dialogFlowBackwardNavigationTask);
				if (result == null) result = caseDialogFlowDirectionalNavigationTask(dialogFlowBackwardNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowBackwardNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowBackwardNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowBackwardNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowBackwardNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowBackwardNavigationTask);
				if (result == null) result = caseBObject(dialogFlowBackwardNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_START_NAVIGATION_TASK: {
				DialogFlowStartNavigationTask dialogFlowStartNavigationTask = (DialogFlowStartNavigationTask)theEObject;
				T result = caseDialogFlowStartNavigationTask(dialogFlowStartNavigationTask);
				if (result == null) result = caseDialogFlowDirectionalNavigationTask(dialogFlowStartNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowStartNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowStartNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowStartNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowStartNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowStartNavigationTask);
				if (result == null) result = caseBObject(dialogFlowStartNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_END_NAVIGATION_TASK: {
				DialogFlowEndNavigationTask dialogFlowEndNavigationTask = (DialogFlowEndNavigationTask)theEObject;
				T result = caseDialogFlowEndNavigationTask(dialogFlowEndNavigationTask);
				if (result == null) result = caseDialogFlowDirectionalNavigationTask(dialogFlowEndNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowEndNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowEndNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowEndNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowEndNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowEndNavigationTask);
				if (result == null) result = caseBObject(dialogFlowEndNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_RANDOM_NAVIGATION_TASK: {
				DialogFlowRandomNavigationTask dialogFlowRandomNavigationTask = (DialogFlowRandomNavigationTask)theEObject;
				T result = caseDialogFlowRandomNavigationTask(dialogFlowRandomNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowRandomNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowRandomNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowRandomNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowRandomNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowRandomNavigationTask);
				if (result == null) result = caseBObject(dialogFlowRandomNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_CANCEL_NAVIGATION_TASK: {
				DialogFlowCancelNavigationTask dialogFlowCancelNavigationTask = (DialogFlowCancelNavigationTask)theEObject;
				T result = caseDialogFlowCancelNavigationTask(dialogFlowCancelNavigationTask);
				if (result == null) result = caseDialogFlowRandomNavigationTask(dialogFlowCancelNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowCancelNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowCancelNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowCancelNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowCancelNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowCancelNavigationTask);
				if (result == null) result = caseBObject(dialogFlowCancelNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DIALOG_FLOW_LABEL_NAVIGATION_TASK: {
				DialogFlowLabelNavigationTask dialogFlowLabelNavigationTask = (DialogFlowLabelNavigationTask)theEObject;
				T result = caseDialogFlowLabelNavigationTask(dialogFlowLabelNavigationTask);
				if (result == null) result = caseDialogFlowRandomNavigationTask(dialogFlowLabelNavigationTask);
				if (result == null) result = caseNavigationTaskBase(dialogFlowLabelNavigationTask);
				if (result == null) result = casePrimitiveInputTask(dialogFlowLabelNavigationTask);
				if (result == null) result = casePrimitiveTask(dialogFlowLabelNavigationTask);
				if (result == null) result = caseInputRepresentation(dialogFlowLabelNavigationTask);
				if (result == null) result = caseIORepresentation(dialogFlowLabelNavigationTask);
				if (result == null) result = caseBObject(dialogFlowLabelNavigationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.COMMAND_INVOCATION_TASK: {
				CommandInvocationTask commandInvocationTask = (CommandInvocationTask)theEObject;
				T result = caseCommandInvocationTask(commandInvocationTask);
				if (result == null) result = caseInvocationTaskBase(commandInvocationTask);
				if (result == null) result = casePrimitiveInputTask(commandInvocationTask);
				if (result == null) result = casePrimitiveTask(commandInvocationTask);
				if (result == null) result = caseInputRepresentation(commandInvocationTask);
				if (result == null) result = caseIORepresentation(commandInvocationTask);
				if (result == null) result = caseBObject(commandInvocationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.MENU_INVOCATION_TASK: {
				MenuInvocationTask menuInvocationTask = (MenuInvocationTask)theEObject;
				T result = caseMenuInvocationTask(menuInvocationTask);
				if (result == null) result = caseInvocationTaskBase(menuInvocationTask);
				if (result == null) result = casePrimitiveInputTask(menuInvocationTask);
				if (result == null) result = casePrimitiveTask(menuInvocationTask);
				if (result == null) result = caseInputRepresentation(menuInvocationTask);
				if (result == null) result = caseIORepresentation(menuInvocationTask);
				if (result == null) result = caseBObject(menuInvocationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.ITEM_ACTIVATION_TASK: {
				ItemActivationTask itemActivationTask = (ItemActivationTask)theEObject;
				T result = caseItemActivationTask(itemActivationTask);
				if (result == null) result = caseSelectionTaskBase(itemActivationTask);
				if (result == null) result = casePrimitiveInputTask(itemActivationTask);
				if (result == null) result = casePrimitiveTask(itemActivationTask);
				if (result == null) result = caseInputRepresentation(itemActivationTask);
				if (result == null) result = caseIORepresentation(itemActivationTask);
				if (result == null) result = caseBObject(itemActivationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.ITEM_REARRANGEMENT_TASK: {
				ItemRearrangementTask itemRearrangementTask = (ItemRearrangementTask)theEObject;
				T result = caseItemRearrangementTask(itemRearrangementTask);
				if (result == null) result = casePrimitiveInputTask(itemRearrangementTask);
				if (result == null) result = casePrimitiveTask(itemRearrangementTask);
				if (result == null) result = caseInputRepresentation(itemRearrangementTask);
				if (result == null) result = caseIORepresentation(itemRearrangementTask);
				if (result == null) result = caseBObject(itemRearrangementTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.EXPAND_INFORMATION_TASK: {
				ExpandInformationTask expandInformationTask = (ExpandInformationTask)theEObject;
				T result = caseExpandInformationTask(expandInformationTask);
				if (result == null) result = casePrimitiveInputTask(expandInformationTask);
				if (result == null) result = casePrimitiveTask(expandInformationTask);
				if (result == null) result = caseInputRepresentation(expandInformationTask);
				if (result == null) result = caseIORepresentation(expandInformationTask);
				if (result == null) result = caseBObject(expandInformationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.ASR_ERROR_CORRECTION_TASK: {
				ASRErrorCorrectionTask asrErrorCorrectionTask = (ASRErrorCorrectionTask)theEObject;
				T result = caseASRErrorCorrectionTask(asrErrorCorrectionTask);
				if (result == null) result = casePrimitiveInputTask(asrErrorCorrectionTask);
				if (result == null) result = casePrimitiveTask(asrErrorCorrectionTask);
				if (result == null) result = caseInputRepresentation(asrErrorCorrectionTask);
				if (result == null) result = caseIORepresentation(asrErrorCorrectionTask);
				if (result == null) result = caseBObject(asrErrorCorrectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.TEXT_SELECTION_TASK: {
				TextSelectionTask textSelectionTask = (TextSelectionTask)theEObject;
				T result = caseTextSelectionTask(textSelectionTask);
				if (result == null) result = casePrimitiveInputTask(textSelectionTask);
				if (result == null) result = casePrimitiveTask(textSelectionTask);
				if (result == null) result = caseInputRepresentation(textSelectionTask);
				if (result == null) result = caseIORepresentation(textSelectionTask);
				if (result == null) result = caseBObject(textSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.PROACTIVITY_INVOCATION_TASK: {
				ProactivityInvocationTask proactivityInvocationTask = (ProactivityInvocationTask)theEObject;
				T result = caseProactivityInvocationTask(proactivityInvocationTask);
				if (result == null) result = caseAdaptationTaskBase(proactivityInvocationTask);
				if (result == null) result = caseInvocationTaskBase(proactivityInvocationTask);
				if (result == null) result = casePrimitiveInputTask(proactivityInvocationTask);
				if (result == null) result = casePrimitiveTask(proactivityInvocationTask);
				if (result == null) result = caseInputRepresentation(proactivityInvocationTask);
				if (result == null) result = caseIORepresentation(proactivityInvocationTask);
				if (result == null) result = caseBObject(proactivityInvocationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.EXPANATION_EXPANSION_TASK: {
				ExpanationExpansionTask expanationExpansionTask = (ExpanationExpansionTask)theEObject;
				T result = caseExpanationExpansionTask(expanationExpansionTask);
				if (result == null) result = caseAdaptationTaskBase(expanationExpansionTask);
				if (result == null) result = casePrimitiveInputTask(expanationExpansionTask);
				if (result == null) result = casePrimitiveTask(expanationExpansionTask);
				if (result == null) result = caseInputRepresentation(expanationExpansionTask);
				if (result == null) result = caseIORepresentation(expanationExpansionTask);
				if (result == null) result = caseBObject(expanationExpansionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.REVERT_ADAPTATION_TASK: {
				RevertAdaptationTask revertAdaptationTask = (RevertAdaptationTask)theEObject;
				T result = caseRevertAdaptationTask(revertAdaptationTask);
				if (result == null) result = caseAdaptationTaskBase(revertAdaptationTask);
				if (result == null) result = casePrimitiveInputTask(revertAdaptationTask);
				if (result == null) result = casePrimitiveTask(revertAdaptationTask);
				if (result == null) result = caseInputRepresentation(revertAdaptationTask);
				if (result == null) result = caseIORepresentation(revertAdaptationTask);
				if (result == null) result = caseBObject(revertAdaptationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.FREE_TEXT_ENTRY_TASK: {
				FreeTextEntryTask freeTextEntryTask = (FreeTextEntryTask)theEObject;
				T result = caseFreeTextEntryTask(freeTextEntryTask);
				if (result == null) result = caseFactEntryTaskBase(freeTextEntryTask);
				if (result == null) result = casePrimitiveInputTask(freeTextEntryTask);
				if (result == null) result = casePrimitiveTask(freeTextEntryTask);
				if (result == null) result = caseInputRepresentation(freeTextEntryTask);
				if (result == null) result = caseIORepresentation(freeTextEntryTask);
				if (result == null) result = caseBObject(freeTextEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DATE_TIME_ENTRY_TASK: {
				DateTimeEntryTask dateTimeEntryTask = (DateTimeEntryTask)theEObject;
				T result = caseDateTimeEntryTask(dateTimeEntryTask);
				if (result == null) result = caseFactEntryTaskBase(dateTimeEntryTask);
				if (result == null) result = casePrimitiveInputTask(dateTimeEntryTask);
				if (result == null) result = casePrimitiveTask(dateTimeEntryTask);
				if (result == null) result = caseInputRepresentation(dateTimeEntryTask);
				if (result == null) result = caseIORepresentation(dateTimeEntryTask);
				if (result == null) result = caseBObject(dateTimeEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.INTEGER_NUMBER_ENTRY_TASK: {
				IntegerNumberEntryTask integerNumberEntryTask = (IntegerNumberEntryTask)theEObject;
				T result = caseIntegerNumberEntryTask(integerNumberEntryTask);
				if (result == null) result = caseFactEntryTaskBase(integerNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(integerNumberEntryTask);
				if (result == null) result = casePrimitiveTask(integerNumberEntryTask);
				if (result == null) result = caseInputRepresentation(integerNumberEntryTask);
				if (result == null) result = caseIORepresentation(integerNumberEntryTask);
				if (result == null) result = caseBObject(integerNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK: {
				BoundedIntegerNumberEntryTask boundedIntegerNumberEntryTask = (BoundedIntegerNumberEntryTask)theEObject;
				T result = caseBoundedIntegerNumberEntryTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseIntegerNumberEntryTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseFactEntryTaskBase(boundedIntegerNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(boundedIntegerNumberEntryTask);
				if (result == null) result = casePrimitiveTask(boundedIntegerNumberEntryTask);
				if (result == null) result = caseInputRepresentation(boundedIntegerNumberEntryTask);
				if (result == null) result = caseIORepresentation(boundedIntegerNumberEntryTask);
				if (result == null) result = caseBObject(boundedIntegerNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.DECIMAL_NUMBER_ENTRY_TASK: {
				DecimalNumberEntryTask decimalNumberEntryTask = (DecimalNumberEntryTask)theEObject;
				T result = caseDecimalNumberEntryTask(decimalNumberEntryTask);
				if (result == null) result = caseFactEntryTaskBase(decimalNumberEntryTask);
				if (result == null) result = casePrimitiveInputTask(decimalNumberEntryTask);
				if (result == null) result = casePrimitiveTask(decimalNumberEntryTask);
				if (result == null) result = caseInputRepresentation(decimalNumberEntryTask);
				if (result == null) result = caseIORepresentation(decimalNumberEntryTask);
				if (result == null) result = caseBObject(decimalNumberEntryTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.YES_NO_SELECTION_TASK: {
				YesNoSelectionTask yesNoSelectionTask = (YesNoSelectionTask)theEObject;
				T result = caseYesNoSelectionTask(yesNoSelectionTask);
				if (result == null) result = caseFactEntryTaskBase(yesNoSelectionTask);
				if (result == null) result = caseSelectionTaskBase(yesNoSelectionTask);
				if (result == null) result = casePrimitiveInputTask(yesNoSelectionTask);
				if (result == null) result = casePrimitiveTask(yesNoSelectionTask);
				if (result == null) result = caseInputRepresentation(yesNoSelectionTask);
				if (result == null) result = caseIORepresentation(yesNoSelectionTask);
				if (result == null) result = caseBObject(yesNoSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.TRI_STATE_SELECTION_TASK: {
				TriStateSelectionTask triStateSelectionTask = (TriStateSelectionTask)theEObject;
				T result = caseTriStateSelectionTask(triStateSelectionTask);
				if (result == null) result = caseFactEntryTaskBase(triStateSelectionTask);
				if (result == null) result = caseSelectionTaskBase(triStateSelectionTask);
				if (result == null) result = casePrimitiveInputTask(triStateSelectionTask);
				if (result == null) result = casePrimitiveTask(triStateSelectionTask);
				if (result == null) result = caseInputRepresentation(triStateSelectionTask);
				if (result == null) result = caseIORepresentation(triStateSelectionTask);
				if (result == null) result = caseBObject(triStateSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.LIST_ITEM_SELECTION_TASK: {
				ListItemSelectionTask listItemSelectionTask = (ListItemSelectionTask)theEObject;
				T result = caseListItemSelectionTask(listItemSelectionTask);
				if (result == null) result = caseSelectionTaskBase(listItemSelectionTask);
				if (result == null) result = casePrimitiveInputTask(listItemSelectionTask);
				if (result == null) result = casePrimitiveTask(listItemSelectionTask);
				if (result == null) result = caseInputRepresentation(listItemSelectionTask);
				if (result == null) result = caseIORepresentation(listItemSelectionTask);
				if (result == null) result = caseBObject(listItemSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.LIST_ITEM_MULTI_SELECTION_TASK: {
				ListItemMultiSelectionTask listItemMultiSelectionTask = (ListItemMultiSelectionTask)theEObject;
				T result = caseListItemMultiSelectionTask(listItemMultiSelectionTask);
				if (result == null) result = casePrimitiveInputTask(listItemMultiSelectionTask);
				if (result == null) result = casePrimitiveTask(listItemMultiSelectionTask);
				if (result == null) result = caseInputRepresentation(listItemMultiSelectionTask);
				if (result == null) result = caseIORepresentation(listItemMultiSelectionTask);
				if (result == null) result = caseBObject(listItemMultiSelectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.MESSAGE_DISMISSAL_TASK: {
				MessageDismissalTask messageDismissalTask = (MessageDismissalTask)theEObject;
				T result = caseMessageDismissalTask(messageDismissalTask);
				if (result == null) result = caseAdaptationTaskBase(messageDismissalTask);
				if (result == null) result = casePrimitiveInputTask(messageDismissalTask);
				if (result == null) result = casePrimitiveTask(messageDismissalTask);
				if (result == null) result = caseInputRepresentation(messageDismissalTask);
				if (result == null) result = caseIORepresentation(messageDismissalTask);
				if (result == null) result = caseBObject(messageDismissalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InputPackage.OBJECT_SELECTION_TASK: {
				ObjectSelectionTask objectSelectionTask = (ObjectSelectionTask)theEObject;
				T result = caseObjectSelectionTask(objectSelectionTask);
				if (result == null) result = caseSelectionTaskBase(objectSelectionTask);
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
	 * Returns the result of interpreting the object as an instance of '<em>Container Manipulation Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Manipulation Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerManipulationTaskBase(ContainerManipulationTaskBase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationTaskBase(NavigationTaskBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Task Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Task Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationTaskBase(InvocationTaskBase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Zoom Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zoom Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoomTask(ZoomTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pan Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pan Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanTask(PanTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollTask(ScrollTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intra Document Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intra Document Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraDocumentNavigationTask(IntraDocumentNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Directional Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Directional Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowDirectionalNavigationTask(DialogFlowDirectionalNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Forward Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Forward Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowForwardNavigationTask(DialogFlowForwardNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Backward Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Backward Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowBackwardNavigationTask(DialogFlowBackwardNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Start Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Start Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowStartNavigationTask(DialogFlowStartNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow End Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow End Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowEndNavigationTask(DialogFlowEndNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Random Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Random Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowRandomNavigationTask(DialogFlowRandomNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Cancel Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Cancel Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowCancelNavigationTask(DialogFlowCancelNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Flow Label Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Flow Label Navigation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogFlowLabelNavigationTask(DialogFlowLabelNavigationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Invocation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandInvocationTask(CommandInvocationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Invocation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuInvocationTask(MenuInvocationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Activation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Activation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemActivationTask(ItemActivationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Rearrangement Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Rearrangement Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemRearrangementTask(ItemRearrangementTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expand Information Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expand Information Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandInformationTask(ExpandInformationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASR Error Correction Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASR Error Correction Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASRErrorCorrectionTask(ASRErrorCorrectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Selection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSelectionTask(TextSelectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactivity Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactivity Invocation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactivityInvocationTask(ProactivityInvocationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expanation Expansion Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expanation Expansion Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpanationExpansionTask(ExpanationExpansionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revert Adaptation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revert Adaptation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevertAdaptationTask(RevertAdaptationTask object) {
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

} //InputSwitch
