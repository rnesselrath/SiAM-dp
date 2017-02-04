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
package de.dfki.iui.mmds.core.model.io.gui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toggle Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ToggleButton component defines a toggle button. Clicking the button toggles it between the up and an down states. If you click the button while it is in the up state, it toggles to the down state. You must click the button again to toggle it back to the up state. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButton#isIsSelected <em>Is Selected</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getToggleButton()
 * @model
 * @generated
 */
public interface ToggleButton extends Button {
	/**
	 * Returns the value of the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains true if the button is in the down state, and false if it is in the up state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Selected</em>' attribute.
	 * @see #setIsSelected(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getToggleButton_IsSelected()
	 * @model
	 * @generated
	 */
	boolean isIsSelected();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButton#isIsSelected <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selected</em>' attribute.
	 * @see #isIsSelected()
	 * @generated
	 */
	void setIsSelected(boolean value);

} // ToggleButton
