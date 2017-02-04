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
package de.dfki.iui.mmds.core.model.io.gui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSupportedEvent()
 * @model
 * @generated
 */
public interface SupportedEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(CommunicativeFunction)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSupportedEvent_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	CommunicativeFunction getInterpretation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(CommunicativeFunction value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(EClass)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSupportedEvent_EventType()
	 * @model required="true"
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EClass value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(EObject)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSupportedEvent_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EObject getAnnotation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(EObject value);

} // SupportedEvent
