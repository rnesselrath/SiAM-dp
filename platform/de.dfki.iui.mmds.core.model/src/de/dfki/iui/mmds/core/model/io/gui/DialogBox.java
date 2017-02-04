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

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Modal UI Component retain the graphical focus (foreground) until the user closes or skips it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getModal <em>Modal</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDialogBox()
 * @model
 * @generated
 */
public interface DialogBox extends AbstractDialogBox {
	/**
	 * Returns the value of the '<em><b>Modal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modal</em>' attribute.
	 * @see #setModal(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDialogBox_Modal()
	 * @model default="false" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getModal();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getModal <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modal</em>' attribute.
	 * @see #getModal()
	 * @generated
	 */
	void setModal(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.DialogueButtons}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogueButtons
	 * @see #setButtons(DialogueButtons)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDialogBox_Buttons()
	 * @model required="true"
	 * @generated
	 */
	DialogueButtons getButtons();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getButtons <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buttons</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogueButtons
	 * @see #getButtons()
	 * @generated
	 */
	void setButtons(DialogueButtons value);

} // DialogBox
