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
package de.dfki.iui.mmds.core.model.io;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicative Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#getAddressee <em>Addressee</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#isPassedFade <em>Passed Fade</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCommunicativeAct()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CommunicativeAct extends EObject {
	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID of the user which performed the action, if known. Devices generally do not report this (unless they have special user distinction capabilities), but the dialog system can derive it from its internal mapping table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator</em>' attribute.
	 * @see #setInitiator(BString)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCommunicativeAct_Initiator()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getInitiator();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#getInitiator <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' attribute.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(BString value);

	/**
	 * Returns the value of the '<em><b>Addressee</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID(s) of the user(s) at which the interaction is targeted, if any and if known. For most input types, this is not relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressee</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCommunicativeAct_Addressee()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	EList<BString> getAddressee();

	/**
	 * Returns the value of the '<em><b>Passed Fade</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passed Fade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed Fade</em>' attribute.
	 * @see #setPassedFade(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCommunicativeAct_PassedFade()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPassedFade();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#isPassedFade <em>Passed Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passed Fade</em>' attribute.
	 * @see #isPassedFade()
	 * @generated
	 */
	void setPassedFade(boolean value);

} // CommunicativeAct
