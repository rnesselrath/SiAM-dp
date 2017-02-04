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
package de.dfki.iui.mmds.core.model.primitiveTasks.input;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage
 * @generated
 */
public interface InputFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputFactory eINSTANCE = de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Input Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Input Task</em>'.
	 * @generated
	 */
	PrimitiveInputTask createPrimitiveInputTask();

	/**
	 * Returns a new object of class '<em>Zoom Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoom Task</em>'.
	 * @generated
	 */
	ZoomTask createZoomTask();

	/**
	 * Returns a new object of class '<em>Pan Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pan Task</em>'.
	 * @generated
	 */
	PanTask createPanTask();

	/**
	 * Returns a new object of class '<em>Scroll Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scroll Task</em>'.
	 * @generated
	 */
	ScrollTask createScrollTask();

	/**
	 * Returns a new object of class '<em>Intra Document Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intra Document Navigation Task</em>'.
	 * @generated
	 */
	IntraDocumentNavigationTask createIntraDocumentNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Directional Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Directional Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowDirectionalNavigationTask createDialogFlowDirectionalNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Forward Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Forward Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowForwardNavigationTask createDialogFlowForwardNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Backward Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Backward Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowBackwardNavigationTask createDialogFlowBackwardNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Start Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Start Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowStartNavigationTask createDialogFlowStartNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow End Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow End Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowEndNavigationTask createDialogFlowEndNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Random Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Random Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowRandomNavigationTask createDialogFlowRandomNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Cancel Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Cancel Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowCancelNavigationTask createDialogFlowCancelNavigationTask();

	/**
	 * Returns a new object of class '<em>Dialog Flow Label Navigation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Flow Label Navigation Task</em>'.
	 * @generated
	 */
	DialogFlowLabelNavigationTask createDialogFlowLabelNavigationTask();

	/**
	 * Returns a new object of class '<em>Command Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Invocation Task</em>'.
	 * @generated
	 */
	CommandInvocationTask createCommandInvocationTask();

	/**
	 * Returns a new object of class '<em>Menu Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Invocation Task</em>'.
	 * @generated
	 */
	MenuInvocationTask createMenuInvocationTask();

	/**
	 * Returns a new object of class '<em>Item Activation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Activation Task</em>'.
	 * @generated
	 */
	ItemActivationTask createItemActivationTask();

	/**
	 * Returns a new object of class '<em>Item Rearrangement Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Rearrangement Task</em>'.
	 * @generated
	 */
	ItemRearrangementTask createItemRearrangementTask();

	/**
	 * Returns a new object of class '<em>Expand Information Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expand Information Task</em>'.
	 * @generated
	 */
	ExpandInformationTask createExpandInformationTask();

	/**
	 * Returns a new object of class '<em>ASR Error Correction Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASR Error Correction Task</em>'.
	 * @generated
	 */
	ASRErrorCorrectionTask createASRErrorCorrectionTask();

	/**
	 * Returns a new object of class '<em>Text Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Selection Task</em>'.
	 * @generated
	 */
	TextSelectionTask createTextSelectionTask();

	/**
	 * Returns a new object of class '<em>Proactivity Invocation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proactivity Invocation Task</em>'.
	 * @generated
	 */
	ProactivityInvocationTask createProactivityInvocationTask();

	/**
	 * Returns a new object of class '<em>Expanation Expansion Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expanation Expansion Task</em>'.
	 * @generated
	 */
	ExpanationExpansionTask createExpanationExpansionTask();

	/**
	 * Returns a new object of class '<em>Revert Adaptation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revert Adaptation Task</em>'.
	 * @generated
	 */
	RevertAdaptationTask createRevertAdaptationTask();

	/**
	 * Returns a new object of class '<em>Free Text Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Entry Task</em>'.
	 * @generated
	 */
	FreeTextEntryTask createFreeTextEntryTask();

	/**
	 * Returns a new object of class '<em>Date Time Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Entry Task</em>'.
	 * @generated
	 */
	DateTimeEntryTask createDateTimeEntryTask();

	/**
	 * Returns a new object of class '<em>Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Number Entry Task</em>'.
	 * @generated
	 */
	IntegerNumberEntryTask createIntegerNumberEntryTask();

	/**
	 * Returns a new object of class '<em>Bounded Integer Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Integer Number Entry Task</em>'.
	 * @generated
	 */
	BoundedIntegerNumberEntryTask createBoundedIntegerNumberEntryTask();

	/**
	 * Returns a new object of class '<em>Decimal Number Entry Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Number Entry Task</em>'.
	 * @generated
	 */
	DecimalNumberEntryTask createDecimalNumberEntryTask();

	/**
	 * Returns a new object of class '<em>Yes No Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yes No Selection Task</em>'.
	 * @generated
	 */
	YesNoSelectionTask createYesNoSelectionTask();

	/**
	 * Returns a new object of class '<em>Tri State Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tri State Selection Task</em>'.
	 * @generated
	 */
	TriStateSelectionTask createTriStateSelectionTask();

	/**
	 * Returns a new object of class '<em>List Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item Selection Task</em>'.
	 * @generated
	 */
	ListItemSelectionTask createListItemSelectionTask();

	/**
	 * Returns a new object of class '<em>List Item Multi Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item Multi Selection Task</em>'.
	 * @generated
	 */
	ListItemMultiSelectionTask createListItemMultiSelectionTask();

	/**
	 * Returns a new object of class '<em>Message Dismissal Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Dismissal Task</em>'.
	 * @generated
	 */
	MessageDismissalTask createMessageDismissalTask();

	/**
	 * Returns a new object of class '<em>Object Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Selection Task</em>'.
	 * @generated
	 */
	ObjectSelectionTask createObjectSelectionTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InputPackage getInputPackage();

} //InputFactory
