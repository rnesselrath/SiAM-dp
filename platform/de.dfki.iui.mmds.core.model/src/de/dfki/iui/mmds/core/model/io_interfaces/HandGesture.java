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
 * A representation of the model object '<em><b>Hand Gesture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersLeft <em>Fingers Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersRight <em>Fingers Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelLeft <em>Level Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelRight <em>Level Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGesture <em>Gesture</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGestureDirection <em>Gesture Direction</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture()
 * @model
 * @generated
 */
public interface HandGesture extends Gesture {
	/**
	 * Returns the value of the '<em><b>Fingers Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fingers Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingers Left</em>' attribute.
	 * @see #setFingersLeft(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_FingersLeft()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getFingersLeft();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersLeft <em>Fingers Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingers Left</em>' attribute.
	 * @see #getFingersLeft()
	 * @generated
	 */
	void setFingersLeft(BInteger value);

	/**
	 * Returns the value of the '<em><b>Fingers Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fingers Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingers Right</em>' attribute.
	 * @see #setFingersRight(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_FingersRight()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getFingersRight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersRight <em>Fingers Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingers Right</em>' attribute.
	 * @see #getFingersRight()
	 * @generated
	 */
	void setFingersRight(BInteger value);

	/**
	 * Returns the value of the '<em><b>Level Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Left</em>' attribute.
	 * @see #setLevelLeft(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_LevelLeft()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getLevelLeft();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelLeft <em>Level Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Left</em>' attribute.
	 * @see #getLevelLeft()
	 * @generated
	 */
	void setLevelLeft(BString value);

	/**
	 * Returns the value of the '<em><b>Level Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Right</em>' attribute.
	 * @see #setLevelRight(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_LevelRight()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getLevelRight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelRight <em>Level Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Right</em>' attribute.
	 * @see #getLevelRight()
	 * @generated
	 */
	void setLevelRight(BString value);

	/**
	 * Returns the value of the '<em><b>Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gesture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesture</em>' attribute.
	 * @see #setGesture(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_Gesture()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getGesture();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGesture <em>Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesture</em>' attribute.
	 * @see #getGesture()
	 * @generated
	 */
	void setGesture(BString value);

	/**
	 * Returns the value of the '<em><b>Gesture Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gesture Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesture Direction</em>' attribute.
	 * @see #setGestureDirection(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getHandGesture_GestureDirection()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getGestureDirection();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGestureDirection <em>Gesture Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesture Direction</em>' attribute.
	 * @see #getGestureDirection()
	 * @generated
	 */
	void setGestureDirection(BString value);

} // HandGesture
