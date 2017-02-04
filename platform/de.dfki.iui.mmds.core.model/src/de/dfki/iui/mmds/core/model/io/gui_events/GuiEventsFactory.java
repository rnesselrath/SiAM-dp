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
package de.dfki.iui.mmds.core.model.io.gui_events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage
 * @generated
 */
public interface GuiEventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiEventsFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Event</em>'.
	 * @generated
	 */
	ClickEvent createClickEvent();

	/**
	 * Returns a new object of class '<em>Dbl Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dbl Click Event</em>'.
	 * @generated
	 */
	DblClickEvent createDblClickEvent();

	/**
	 * Returns a new object of class '<em>Mouse Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse Down Event</em>'.
	 * @generated
	 */
	MouseDownEvent createMouseDownEvent();

	/**
	 * Returns a new object of class '<em>Mouse Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse Move Event</em>'.
	 * @generated
	 */
	MouseMoveEvent createMouseMoveEvent();

	/**
	 * Returns a new object of class '<em>Mouse Over Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse Over Event</em>'.
	 * @generated
	 */
	MouseOverEvent createMouseOverEvent();

	/**
	 * Returns a new object of class '<em>Mouse Out Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse Out Event</em>'.
	 * @generated
	 */
	MouseOutEvent createMouseOutEvent();

	/**
	 * Returns a new object of class '<em>Mouse Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse Up Event</em>'.
	 * @generated
	 */
	MouseUpEvent createMouseUpEvent();

	/**
	 * Returns a new object of class '<em>Key Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Press Event</em>'.
	 * @generated
	 */
	KeyPressEvent createKeyPressEvent();

	/**
	 * Returns a new object of class '<em>Key Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Up Event</em>'.
	 * @generated
	 */
	KeyUpEvent createKeyUpEvent();

	/**
	 * Returns a new object of class '<em>Key Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Down Event</em>'.
	 * @generated
	 */
	KeyDownEvent createKeyDownEvent();

	/**
	 * Returns a new object of class '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Event</em>'.
	 * @generated
	 */
	ChangeEvent createChangeEvent();

	/**
	 * Returns a new object of class '<em>Blur Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blur Event</em>'.
	 * @generated
	 */
	BlurEvent createBlurEvent();

	/**
	 * Returns a new object of class '<em>Focus Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Focus Event</em>'.
	 * @generated
	 */
	FocusEvent createFocusEvent();

	/**
	 * Returns a new object of class '<em>Select Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Text Event</em>'.
	 * @generated
	 */
	SelectTextEvent createSelectTextEvent();

	/**
	 * Returns a new object of class '<em>Submit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Event</em>'.
	 * @generated
	 */
	SubmitEvent createSubmitEvent();

	/**
	 * Returns a new object of class '<em>Dialog Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Event</em>'.
	 * @generated
	 */
	DialogEvent createDialogEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuiEventsPackage getGuiEventsPackage();

} //GuiEventsFactory
