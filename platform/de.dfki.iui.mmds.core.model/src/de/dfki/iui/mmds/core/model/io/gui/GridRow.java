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
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getRowId <em>Row Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getIsPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridRow()
 * @model
 * @generated
 */
public interface GridRow extends AbstractContainer {
	/**
	 * Returns the value of the '<em><b>Row Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Id</em>' attribute.
	 * @see #setRowId(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridRow_RowId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getRowId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getRowId <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Id</em>' attribute.
	 * @see #getRowId()
	 * @generated
	 */
	void setRowId(BInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BFloat)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridRow_Height()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BFloat"
	 * @generated
	 */
	BFloat getHeight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BFloat value);

	/**
	 * Returns the value of the '<em><b>Is Percentage</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Percentage</em>' attribute.
	 * @see #setIsPercentage(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridRow_IsPercentage()
	 * @model default="false" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getIsPercentage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getIsPercentage <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage</em>' attribute.
	 * @see #getIsPercentage()
	 * @generated
	 */
	void setIsPercentage(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.gui.GridItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a column in the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridRow_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GridItem> getItem();

} // GridRow
