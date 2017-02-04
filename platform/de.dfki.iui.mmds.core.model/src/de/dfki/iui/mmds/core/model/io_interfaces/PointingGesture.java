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

import de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointing Gesture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pointing gesture with a single target point. Should be considered in conjunction with the modality/device meta data. According to this, it could represent a non-touch finger gesture, a touch pointing gesture, a mouse click etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getPointingGesture()
 * @model
 * @generated
 */
public interface PointingGesture extends Gesture {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(CartesianCoordinate2D)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getPointingGesture_Coordinate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CartesianCoordinate2D getCoordinate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(CartesianCoordinate2D value);

} // PointingGesture
