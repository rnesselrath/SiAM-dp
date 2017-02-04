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
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getIsPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getValignment <em>Valignment</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem()
 * @model
 * @generated
 */
public interface GridItem extends Container {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BFloat)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_Width()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BFloat"
	 * @generated
	 */
	BFloat getWidth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BFloat value);

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
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_IsPercentage()
	 * @model default="false" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getIsPercentage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getIsPercentage <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage</em>' attribute.
	 * @see #getIsPercentage()
	 * @generated
	 */
	void setIsPercentage(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #setRowSpan(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_RowSpan()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getRowSpan();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(BInteger value);

	/**
	 * Returns the value of the '<em><b>Column Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Span</em>' attribute.
	 * @see #setColumnSpan(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_ColumnSpan()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getColumnSpan();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getColumnSpan <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Span</em>' attribute.
	 * @see #getColumnSpan()
	 * @generated
	 */
	void setColumnSpan(BInteger value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #setAlignment(Alignment)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_Alignment()
	 * @model
	 * @generated
	 */
	Alignment getAlignment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Valignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.VAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VAlignment
	 * @see #setValignment(VAlignment)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGridItem_Valignment()
	 * @model
	 * @generated
	 */
	VAlignment getValignment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getValignment <em>Valignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VAlignment
	 * @see #getValignment()
	 * @generated
	 */
	void setValignment(VAlignment value);

} // GridItem
