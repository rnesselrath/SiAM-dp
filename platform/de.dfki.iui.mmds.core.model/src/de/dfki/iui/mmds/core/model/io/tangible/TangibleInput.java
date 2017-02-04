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
package de.dfki.iui.mmds.core.model.io.tangible;

import de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareType <em>Hardware Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareFriendlyName <em>Hardware Friendly Name</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTangibleInput()
 * @model
 * @generated
 */
public interface TangibleInput extends ControllerInput {
	/**
	 * Returns the value of the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware ID</em>' attribute.
	 * @see #setHardwareID(String)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTangibleInput_HardwareID()
	 * @model
	 * @generated
	 */
	String getHardwareID();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareID <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware ID</em>' attribute.
	 * @see #getHardwareID()
	 * @generated
	 */
	void setHardwareID(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes
	 * @see #setHardwareType(HardwareTypes)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTangibleInput_HardwareType()
	 * @model
	 * @generated
	 */
	HardwareTypes getHardwareType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareType <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes
	 * @see #getHardwareType()
	 * @generated
	 */
	void setHardwareType(HardwareTypes value);

	/**
	 * Returns the value of the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Friendly Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Friendly Name</em>' attribute.
	 * @see #setHardwareFriendlyName(String)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTangibleInput_HardwareFriendlyName()
	 * @model
	 * @generated
	 */
	String getHardwareFriendlyName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareFriendlyName <em>Hardware Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Friendly Name</em>' attribute.
	 * @see #getHardwareFriendlyName()
	 * @generated
	 */
	void setHardwareFriendlyName(String value);

} // TangibleInput
