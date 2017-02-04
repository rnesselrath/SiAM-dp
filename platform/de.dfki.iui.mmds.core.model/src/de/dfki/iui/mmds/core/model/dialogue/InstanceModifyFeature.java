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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Modify Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getTo <em>To</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getObject <em>Object</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getOperationType <em>Operation Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature()
 * @model
 * @generated
 */
public interface InstanceModifyFeature extends ExecutableContent {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_To()
	 * @model required="true"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(String)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_Expr()
	 * @model
	 * @generated
	 */
	String getExpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(EObject)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_Object()
	 * @model containment="true"
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_Type()
	 * @model transient="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.dialogue.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.dialogue.OperationType
	 * @see #setOperationType(OperationType)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceModifyFeature_OperationType()
	 * @model
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.dialogue.OperationType
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

} // InstanceModifyFeature
