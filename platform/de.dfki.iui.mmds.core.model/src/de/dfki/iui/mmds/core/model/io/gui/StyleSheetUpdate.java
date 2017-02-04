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

import de.dfki.iui.mmds.core.model.base.StyleSheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Sheet Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate#getStyleResource <em>Style Resource</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getStyleSheetUpdate()
 * @model
 * @generated
 */
public interface StyleSheetUpdate extends UpdateInfo {
	/**
	 * Returns the value of the '<em><b>Style Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Resource</em>' reference.
	 * @see #setStyleResource(StyleSheet)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getStyleSheetUpdate_StyleResource()
	 * @model
	 * @generated
	 */
	StyleSheet getStyleResource();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate#getStyleResource <em>Style Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Resource</em>' reference.
	 * @see #getStyleResource()
	 * @generated
	 */
	void setStyleResource(StyleSheet value);

} // StyleSheetUpdate
