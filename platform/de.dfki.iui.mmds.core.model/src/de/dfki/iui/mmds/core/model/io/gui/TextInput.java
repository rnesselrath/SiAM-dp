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
import de.dfki.iui.mmds.core.emf.datatypes.BString;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TextInput control is a single-line text field that is optionally editable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getSoftKeyboard <em>Soft Keyboard</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getTextInput()
 * @model
 * @generated
 */
public interface TextInput extends UIElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getTextInput_Text()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getText();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(BString value);

	/**
	 * Returns the value of the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line</em>' attribute.
	 * @see #setMultiLine(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getTextInput_MultiLine()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getMultiLine();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line</em>' attribute.
	 * @see #getMultiLine()
	 * @generated
	 */
	void setMultiLine(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Soft Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether a soft keyboard is shown when the control is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Keyboard</em>' containment reference.
	 * @see #setSoftKeyboard(SoftKeyboard)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getTextInput_SoftKeyboard()
	 * @model containment="true"
	 * @generated
	 */
	SoftKeyboard getSoftKeyboard();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getSoftKeyboard <em>Soft Keyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Keyboard</em>' containment reference.
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	void setSoftKeyboard(SoftKeyboard value);

} // TextInput
