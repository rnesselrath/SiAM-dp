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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Speech features computed from the speech signal. These features can be used in some cases to support the interpretation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getSpearkingRate <em>Spearking Rate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getPitch <em>Pitch</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeechFeatures()
 * @model
 * @generated
 */
public interface SpeechFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>Spearking Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spearking Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spearking Rate</em>' attribute.
	 * @see #setSpearkingRate(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeechFeatures_SpearkingRate()
	 * @model
	 * @generated
	 */
	float getSpearkingRate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getSpearkingRate <em>Spearking Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spearking Rate</em>' attribute.
	 * @see #getSpearkingRate()
	 * @generated
	 */
	void setSpearkingRate(float value);

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see #setIntensity(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeechFeatures_Intensity()
	 * @model
	 * @generated
	 */
	float getIntensity();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(float value);

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
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeechFeatures_Pitch()
	 * @model
	 * @generated
	 */
	float getPitch();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(float value);

} // SpeechFeatures
