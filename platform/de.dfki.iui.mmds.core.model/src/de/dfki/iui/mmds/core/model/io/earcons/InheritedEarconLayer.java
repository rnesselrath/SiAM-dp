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
package de.dfki.iui.mmds.core.model.io.earcons;

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherited Earcon Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#getEarcon <em>Earcon</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#isInclude <em>Include</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarconLayer()
 * @model
 * @generated
 */
public interface InheritedEarconLayer extends BObject {
	/**
	 * Returns the value of the '<em><b>Earcon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Layer-specific earcon, which can be incompletely specified (e.g. pitch only). Only the specified attributes will be overridden in the base.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earcon</em>' reference.
	 * @see #setEarcon(PlainEarcon)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarconLayer_Earcon()
	 * @model required="true"
	 * @generated
	 */
	PlainEarcon getEarcon();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#getEarcon <em>Earcon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earcon</em>' reference.
	 * @see #getEarcon()
	 * @generated
	 */
	void setEarcon(PlainEarcon value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True to include this inheritance layer in the actual output, or False to merely apply the modification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarconLayer_Include()
	 * @model
	 * @generated
	 */
	boolean isInclude();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#isInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #isInclude()
	 * @generated
	 */
	void setInclude(boolean value);

} // InheritedEarconLayer
