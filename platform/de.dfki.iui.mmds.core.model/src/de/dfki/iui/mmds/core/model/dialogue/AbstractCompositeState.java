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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The composite state contains several states and transitions but can also be a state. The definition of a history state allows to remember the state configuration and continue the workflow at the state, that was active when the composite state was left.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getStates <em>States</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getHistoryState <em>History State</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getAbstractCompositeState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractCompositeState extends State {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.dialogue.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getAbstractCompositeState_States()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractState> getStates();

	/**
	 * Returns the value of the '<em><b>History State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History State</em>' containment reference.
	 * @see #setHistoryState(HistoryState)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getAbstractCompositeState_HistoryState()
	 * @model containment="true"
	 * @generated
	 */
	HistoryState getHistoryState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getHistoryState <em>History State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History State</em>' containment reference.
	 * @see #getHistoryState()
	 * @generated
	 */
	void setHistoryState(HistoryState value);

} // AbstractCompositeState
