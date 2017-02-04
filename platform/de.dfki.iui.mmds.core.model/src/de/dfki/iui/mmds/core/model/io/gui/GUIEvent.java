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

import de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData;
import de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input event from the gui. The event data contains all necessary information about the event.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIEvent#getEventData <em>Event Data</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIEvent()
 * @model
 * @generated
 */
public interface GUIEvent extends ControllerInput {
	/**
	 * Returns the value of the '<em><b>Event Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Data</em>' containment reference.
	 * @see #setEventData(GUIEventData)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIEvent_EventData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GUIEventData getEventData();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIEvent#getEventData <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Data</em>' containment reference.
	 * @see #getEventData()
	 * @generated
	 */
	void setEventData(GUIEventData value);

} // GUIEvent
