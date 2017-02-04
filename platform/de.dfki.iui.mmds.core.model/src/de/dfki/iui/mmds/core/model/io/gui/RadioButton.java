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
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RadioButton control lets the user make a single choice within a set of mutually exclusive choices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getRadioGroup <em>Radio Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getChecked <em>Checked</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends Button {
	/**
	 * Returns the value of the '<em><b>Radio Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Group</em>' attribute.
	 * @see #setRadioGroup(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRadioButton_RadioGroup()
	 * @model
	 * @generated
	 */
	String getRadioGroup();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getRadioGroup <em>Radio Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio Group</em>' attribute.
	 * @see #getRadioGroup()
	 * @generated
	 */
	void setRadioGroup(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRadioButton_Value()
	 * @model default="\"\"" dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BString value);

	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see #setChecked(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRadioButton_Checked()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getChecked();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #getChecked()
	 * @generated
	 */
	void setChecked(BBoolean value);

} // RadioButton
