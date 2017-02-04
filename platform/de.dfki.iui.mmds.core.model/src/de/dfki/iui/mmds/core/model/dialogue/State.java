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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A state with the description of the onEntry and onExit executable content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.State#getOnEntry <em>On Entry</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.State#getOnExit <em>On Exit</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState, SourceState, TargetState {
	/**
	 * Returns the value of the '<em><b>On Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Entry</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getState_OnEntry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExecutableContent> getOnEntry();

	/**
	 * Returns the value of the '<em><b>On Exit</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Exit</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getState_OnExit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExecutableContent> getOnExit();

} // State
