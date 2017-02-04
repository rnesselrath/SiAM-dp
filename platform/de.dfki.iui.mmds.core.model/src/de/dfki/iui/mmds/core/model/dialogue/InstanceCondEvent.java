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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Cond Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a condition set where pattern can be matched against instances, not only with InputActs but with any kind of instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent#getInstanceMatchCondition <em>Instance Match Condition</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceCondEvent()
 * @model
 * @generated
 */
public interface InstanceCondEvent extends CondEvent {
	/**
	 * Returns the value of the '<em><b>Instance Match Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Match Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Match Condition</em>' containment reference.
	 * @see #setInstanceMatchCondition(InstanceMatchCondition)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getInstanceCondEvent_InstanceMatchCondition()
	 * @model containment="true"
	 * @generated
	 */
	InstanceMatchCondition getInstanceMatchCondition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent#getInstanceMatchCondition <em>Instance Match Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Match Condition</em>' containment reference.
	 * @see #getInstanceMatchCondition()
	 * @generated
	 */
	void setInstanceMatchCondition(InstanceMatchCondition value);

} // InstanceCondEvent
