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

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event that updates the content of application with id 'applicationId'. It can contain updates for several widgets.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getUpdates <em>Updates</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#isValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIUpdate()
 * @model
 * @generated
 */
public interface GUIUpdate extends GUIRequest {
	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.gui.UpdateInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIUpdate_Updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<UpdateInfo> getUpdates();

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIUpdate_ApplicationId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getApplicationId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(BString value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that is initially true for a new update event. The display context is responsible for the validation of the updated ui element in terms of availability and correct type. After the validation process the flag is set to true. Client devices should only work with update events with a validated flag set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated</em>' attribute.
	 * @see #setValidated(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIUpdate_Validated()
	 * @model default="false"
	 * @generated
	 */
	boolean isValidated();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#isValidated <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' attribute.
	 * @see #isValidated()
	 * @generated
	 */
	void setValidated(boolean value);

} // GUIUpdate
