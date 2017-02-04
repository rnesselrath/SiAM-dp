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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getTo <em>To</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getCopyOf <em>Copy Of</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceAssign()
 * @model
 * @generated
 */
public interface InstanceAssign extends ExecutableContent {
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
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceAssign_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EObject getInstance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(EObject value);

	/**
	 * Returns the value of the '<em><b>Copy Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Of</em>' reference.
	 * @see #setCopyOf(EObject)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceAssign_CopyOf()
	 * @model
	 * @generated
	 */
	EObject getCopyOf();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getCopyOf <em>Copy Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Of</em>' reference.
	 * @see #getCopyOf()
	 * @generated
	 */
	void setCopyOf(EObject value);

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
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceAssign_To()
	 * @model required="true"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // InstanceAssign
