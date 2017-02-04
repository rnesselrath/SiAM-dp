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
package de.dfki.iui.mmds.core.model.primitiveTasks.output;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage
 * @generated
 */
public interface OutputFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutputFactory eINSTANCE = de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Output Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Output Task</em>'.
	 * @generated
	 */
	PrimitiveOutputTask createPrimitiveOutputTask();

	/**
	 * Returns a new object of class '<em>Message Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Task</em>'.
	 * @generated
	 */
	MessageTask createMessageTask();

	/**
	 * Returns a new object of class '<em>Document Presentation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Presentation Task</em>'.
	 * @generated
	 */
	DocumentPresentationTask createDocumentPresentationTask();

	/**
	 * Returns a new object of class '<em>Command Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Selection Task</em>'.
	 * @generated
	 */
	CommandSelectionTask createCommandSelectionTask();

	/**
	 * Returns a new object of class '<em>Menu Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item Selection Task</em>'.
	 * @generated
	 */
	MenuItemSelectionTask createMenuItemSelectionTask();

	/**
	 * Returns a new object of class '<em>Progress Indication Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Indication Task</em>'.
	 * @generated
	 */
	ProgressIndicationTask createProgressIndicationTask();

	/**
	 * Returns a new object of class '<em>Adaptation Indication Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Indication Task</em>'.
	 * @generated
	 */
	AdaptationIndicationTask createAdaptationIndicationTask();

	/**
	 * Returns a new object of class '<em>Manipulable Image Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manipulable Image Task</em>'.
	 * @generated
	 */
	ManipulableImageTask createManipulableImageTask();

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
	 * Returns a new object of class '<em>Long List Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long List Item Selection Task</em>'.
	 * @generated
	 */
	LongListItemSelectionTask createLongListItemSelectionTask();

	/**
	 * Returns a new object of class '<em>Short Item Selection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Item Selection Task</em>'.
	 * @generated
	 */
	ShortItemSelectionTask createShortItemSelectionTask();

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
	OutputPackage getOutputPackage();

} //OutputFactory
