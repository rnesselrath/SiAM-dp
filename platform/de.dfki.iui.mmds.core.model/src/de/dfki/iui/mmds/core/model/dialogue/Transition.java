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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes transitions between states. When a condition is defined, the transition is triggered only when the event occurs and the condition pattern unifies with the incoming event content. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getOnTrigger <em>On Trigger</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends DialogueDesignerElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.mmds.core.model.dialogue.SourceState#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(SourceState)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getTransition_Source()
	 * @see de.dfki.iui.mmds.core.model.dialogue.SourceState#getTransitions
	 * @model opposite="transitions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SourceState getSource();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TargetState)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	TargetState getTarget();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetState value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(CondEvent)
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getTransition_Event()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CondEvent getEvent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(CondEvent value);

	/**
	 * Returns the value of the '<em><b>On Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Trigger</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getTransition_OnTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableContent> getOnTrigger();

} // Transition
