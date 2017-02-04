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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eye Gaze</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents low-level information from an eye-tracking device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getLeftEye <em>Left Eye</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getRightEye <em>Right Eye</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeGaze()
 * @model
 * @generated
 */
public interface EyeGaze extends ControllerInput {
	/**
	 * Returns the value of the '<em><b>Left Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Eye</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Eye</em>' containment reference.
	 * @see #setLeftEye(EyeData)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeGaze_LeftEye()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EyeData getLeftEye();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getLeftEye <em>Left Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Eye</em>' containment reference.
	 * @see #getLeftEye()
	 * @generated
	 */
	void setLeftEye(EyeData value);

	/**
	 * Returns the value of the '<em><b>Right Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Eye</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Eye</em>' containment reference.
	 * @see #setRightEye(EyeData)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeGaze_RightEye()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EyeData getRightEye();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getRightEye <em>Right Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Eye</em>' containment reference.
	 * @see #getRightEye()
	 * @generated
	 */
	void setRightEye(EyeData value);

} // EyeGaze
