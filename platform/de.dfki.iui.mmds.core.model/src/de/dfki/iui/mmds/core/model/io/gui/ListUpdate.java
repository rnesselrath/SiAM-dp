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

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getAllowMultipleSelection <em>Allow Multiple Selection</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getSelectedIndex <em>Selected Index</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getListUpdate()
 * @model
 * @generated
 */
public interface ListUpdate extends UIElementUpdate {

	/**
	 * Returns the value of the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets if the user might select more than one item in the list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Multiple Selection</em>' attribute.
	 * @see #setAllowMultipleSelection(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getListUpdate_AllowMultipleSelection()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getAllowMultipleSelection();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getAllowMultipleSelection <em>Allow Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple Selection</em>' attribute.
	 * @see #getAllowMultipleSelection()
	 * @generated
	 */
	void setAllowMultipleSelection(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Selected Index</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.emf.datatypes.BInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Index</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Index</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getListUpdate_SelectedIndex()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	EList<BInteger> getSelectedIndex();
} // ListUpdate
