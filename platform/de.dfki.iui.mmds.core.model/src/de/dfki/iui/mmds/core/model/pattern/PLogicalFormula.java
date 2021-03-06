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
package de.dfki.iui.mmds.core.model.pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLogical Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PLogicalFormula#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PLogicalFormula#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPLogicalFormula()
 * @model
 * @generated
 */
public interface PLogicalFormula extends PPattern {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum
	 * @see #setOperator(PRestrictionsEnum)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPLogicalFormula_Operator()
	 * @model required="true"
	 * @generated
	 */
	PRestrictionsEnum getOperator();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PLogicalFormula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(PRestrictionsEnum value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.pattern.PPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPLogicalFormula_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PPattern> getPattern();

} // PLogicalFormula
