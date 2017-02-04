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
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The List control displays a vertical list of items. The user can select one or more items from the list, depending on the value of the allowMultipleSelection property. Usually displayed as a scrollable vertical list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.List#getAllowMultipleSelection <em>Allow Multiple Selection</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.List#getItem <em>Item</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.List#getSelectedIndex <em>Selected Index</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getList()
 * @model
 * @generated
 */
public interface List extends AbstractContainer {
	/**
	 * Returns the value of the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets if the user might select more than one item in the list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Multiple Selection</em>' attribute.
	 * @see #setAllowMultipleSelection(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getList_AllowMultipleSelection()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getAllowMultipleSelection();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.List#getAllowMultipleSelection <em>Allow Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple Selection</em>' attribute.
	 * @see #getAllowMultipleSelection()
	 * @generated
	 */
	void setAllowMultipleSelection(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.gui.ListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getList_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItem();

	/**
	 * Returns the value of the '<em><b>Selected Index</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.emf.datatypes.BInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Index</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getList_SelectedIndex()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	EList<BInteger> getSelectedIndex();

} // List
