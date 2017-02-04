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
package de.dfki.iui.mmds.core.model.dialogue;

import de.dfki.iui.mmds.core.model.pattern.PPattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Match Condition Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstanceExpr <em>Instance Expr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceMatchConditionAtom()
 * @model
 * @generated
 */
public interface InstanceMatchConditionAtom extends InstanceMatchCondition {
	/**
	 * Returns the value of the '<em><b>Instance Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Expr</em>' attribute.
	 * @see #setInstanceExpr(String)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceMatchConditionAtom_InstanceExpr()
	 * @model
	 * @generated
	 */
	String getInstanceExpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstanceExpr <em>Instance Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Expr</em>' attribute.
	 * @see #getInstanceExpr()
	 * @generated
	 */
	void setInstanceExpr(String value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(EObject)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceMatchConditionAtom_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EObject getInstance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(EObject value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PPattern)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceMatchConditionAtom_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PPattern getPattern();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PPattern value);

} // InstanceMatchConditionAtom
