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
 * A representation of the model object '<em><b>Remove Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Removes a cell of a table specified via the elementId (=table id) of the table. RemoveRow specifies if the entire row is to be removed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell#isRemoveRow <em>Remove Row</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRemoveTableCell()
 * @model
 * @generated
 */
public interface RemoveTableCell extends RemoveUIElement {
	/**
	 * Returns the value of the '<em><b>Remove Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Row</em>' attribute.
	 * @see #setRemoveRow(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRemoveTableCell_RemoveRow()
	 * @model
	 * @generated
	 */
	boolean isRemoveRow();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell#isRemoveRow <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Row</em>' attribute.
	 * @see #isRemoveRow()
	 * @generated
	 */
	void setRemoveRow(boolean value);

} // RemoveTableCell
