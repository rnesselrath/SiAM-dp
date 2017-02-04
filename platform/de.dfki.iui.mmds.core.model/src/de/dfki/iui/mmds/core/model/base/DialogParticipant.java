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
package de.dfki.iui.mmds.core.model.base;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getUserInterfaces <em>User Interfaces</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getParticipantId <em>Participant Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDialogParticipant()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DialogParticipant extends EObject {

	/**
	 * Returns the value of the '<em><b>User Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.Service}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.mmds.core.model.io.Service#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user interfaces the dialog participant is using for the communication with SiAM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Interfaces</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDialogParticipant_UserInterfaces()
	 * @see de.dfki.iui.mmds.core.model.io.Service#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Service> getUserInterfaces();

	/**
	 * Returns the value of the '<em><b>Participant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable id that is used for participant identification when describing input and output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Id</em>' attribute.
	 * @see #setParticipantId(BString)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDialogParticipant_ParticipantId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getParticipantId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getParticipantId <em>Participant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Id</em>' attribute.
	 * @see #getParticipantId()
	 * @generated
	 */
	void setParticipantId(BString value);
} // DialogParticipant
