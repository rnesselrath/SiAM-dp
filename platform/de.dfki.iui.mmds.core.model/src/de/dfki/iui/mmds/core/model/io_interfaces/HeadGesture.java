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
 * A representation of the model object '<em><b>Head Gesture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A gesture performed through head rotation and movement, e.g. nodding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getCommonGesture <em>Common Gesture</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getYaw <em>Yaw</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getRoll <em>Roll</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture()
 * @model
 * @generated
 */
public interface HeadGesture extends Gesture {
	/**
	 * Returns the value of the '<em><b>Common Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Gesture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Gesture</em>' attribute.
	 * @see #setCommonGesture(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture_CommonGesture()
	 * @model
	 * @generated
	 */
	String getCommonGesture();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getCommonGesture <em>Common Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Gesture</em>' attribute.
	 * @see #getCommonGesture()
	 * @generated
	 */
	void setCommonGesture(String value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture_Pitch()
	 * @model
	 * @generated
	 */
	float getPitch();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(float value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance from the head to the camera, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yaw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see #setYaw(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture_Yaw()
	 * @model
	 * @generated
	 */
	float getYaw();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getYaw <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' attribute.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(float value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHeadGesture_Roll()
	 * @model
	 * @generated
	 */
	float getRoll();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(float value);

} // HeadGesture
