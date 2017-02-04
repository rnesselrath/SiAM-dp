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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Device Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Changes the state/configuration of a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode#getDeviceMode <em>Device Mode</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateDeviceMode()
 * @model
 * @generated
 */
public interface UpdateDeviceMode extends ControlMessage, OutputMessage {
	/**
	 * Returns the value of the '<em><b>Device Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains information about the state of a device, which the device may provide as additional feedback. The dialog platform can use this to update its internal database on device states. Normally, this field is only provided when explicitly requested by the dialog system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Mode</em>' containment reference.
	 * @see #setDeviceMode(DeviceMode)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateDeviceMode_DeviceMode()
	 * @model containment="true"
	 * @generated
	 */
	DeviceMode getDeviceMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode#getDeviceMode <em>Device Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Mode</em>' containment reference.
	 * @see #getDeviceMode()
	 * @generated
	 */
	void setDeviceMode(DeviceMode value);

} // UpdateDeviceMode
