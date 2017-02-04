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
package de.dfki.iui.mmds.core.model.io_interfaces;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an interaction that a virtual character should perform. This may also include speech. This model is based on Agent BML (Behavior Modeling Language).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getAvatarId <em>Avatar Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getCamera <em>Camera</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getBml <em>Bml</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getVirtualCharacter()
 * @model
 * @generated
 */
public interface VirtualCharacter extends RendererOutput {
	/**
	 * Returns the value of the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterance</em>' attribute.
	 * @see #setUtterance(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getVirtualCharacter_Utterance()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getUtterance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getUtterance <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterance</em>' attribute.
	 * @see #getUtterance()
	 * @generated
	 */
	void setUtterance(BString value);

	/**
	 * Returns the value of the '<em><b>Avatar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avatar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Id</em>' attribute.
	 * @see #setAvatarId(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getVirtualCharacter_AvatarId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getAvatarId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getAvatarId <em>Avatar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Id</em>' attribute.
	 * @see #getAvatarId()
	 * @generated
	 */
	void setAvatarId(BInteger value);

	/**
	 * Returns the value of the '<em><b>Camera</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io_interfaces.Camera}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Camera
	 * @see #setCamera(Camera)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getVirtualCharacter_Camera()
	 * @model
	 * @generated
	 */
	Camera getCamera();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getCamera <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Camera
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(Camera value);

	/**
	 * Returns the value of the '<em><b>Bml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bml</em>' attribute.
	 * @see #setBml(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getVirtualCharacter_Bml()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getBml();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getBml <em>Bml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bml</em>' attribute.
	 * @see #getBml()
	 * @generated
	 */
	void setBml(BString value);

} // VirtualCharacter
