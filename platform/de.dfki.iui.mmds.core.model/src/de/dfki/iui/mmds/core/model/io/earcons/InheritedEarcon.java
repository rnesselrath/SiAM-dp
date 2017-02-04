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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherited Earcon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An earcon that is created by "inheriting" from another one (see Blattner, Sumikawa and Greenberg, 1989).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getLayer <em>Layer</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#isIncludeBase <em>Include Base</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarcon()
 * @model
 * @generated
 */
public interface InheritedEarcon extends EarconStructure {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base earcon, which can be incompletely specified (e.g. without pitch).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(EarconStructure)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarcon_Base()
	 * @model required="true"
	 * @generated
	 */
	EarconStructure getBase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(EarconStructure value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more layers of changes applied to the base. Each layer is appended to the output or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarcon_Layer()
	 * @model
	 * @generated
	 */
	EList<InheritedEarconLayer> getLayer();

	/**
	 * Returns the value of the '<em><b>Include Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True to include the base in the output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Base</em>' attribute.
	 * @see #setIncludeBase(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getInheritedEarcon_IncludeBase()
	 * @model
	 * @generated
	 */
	boolean isIncludeBase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#isIncludeBase <em>Include Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Base</em>' attribute.
	 * @see #isIncludeBase()
	 * @generated
	 */
	void setIncludeBase(boolean value);

} // InheritedEarcon
