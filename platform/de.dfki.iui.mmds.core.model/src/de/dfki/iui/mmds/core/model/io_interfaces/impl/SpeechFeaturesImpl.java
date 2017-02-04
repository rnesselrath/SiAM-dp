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
package de.dfki.iui.mmds.core.model.io_interfaces.impl;

import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl#getSpearkingRate <em>Spearking Rate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl#getPitch <em>Pitch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechFeaturesImpl extends MinimalEObjectImpl.Container implements SpeechFeatures {
	/**
	 * The default value of the '{@link #getSpearkingRate() <em>Spearking Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpearkingRate()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEARKING_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpearkingRate() <em>Spearking Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpearkingRate()
	 * @generated
	 * @ordered
	 */
	protected float spearkingRate = SPEARKING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final float INTENSITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected float intensity = INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final float PITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected float pitch = PITCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.SPEECH_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpearkingRate() {
		return spearkingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpearkingRate(float newSpearkingRate) {
		float oldSpearkingRate = spearkingRate;
		spearkingRate = newSpearkingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.SPEECH_FEATURES__SPEARKING_RATE, oldSpearkingRate, spearkingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(float newIntensity) {
		float oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.SPEECH_FEATURES__INTENSITY, oldIntensity, intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(float newPitch) {
		float oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.SPEECH_FEATURES__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.SPEECH_FEATURES__SPEARKING_RATE:
				return getSpearkingRate();
			case Io_interfacesPackage.SPEECH_FEATURES__INTENSITY:
				return getIntensity();
			case Io_interfacesPackage.SPEECH_FEATURES__PITCH:
				return getPitch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Io_interfacesPackage.SPEECH_FEATURES__SPEARKING_RATE:
				setSpearkingRate((Float)newValue);
				return;
			case Io_interfacesPackage.SPEECH_FEATURES__INTENSITY:
				setIntensity((Float)newValue);
				return;
			case Io_interfacesPackage.SPEECH_FEATURES__PITCH:
				setPitch((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Io_interfacesPackage.SPEECH_FEATURES__SPEARKING_RATE:
				setSpearkingRate(SPEARKING_RATE_EDEFAULT);
				return;
			case Io_interfacesPackage.SPEECH_FEATURES__INTENSITY:
				setIntensity(INTENSITY_EDEFAULT);
				return;
			case Io_interfacesPackage.SPEECH_FEATURES__PITCH:
				setPitch(PITCH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Io_interfacesPackage.SPEECH_FEATURES__SPEARKING_RATE:
				return spearkingRate != SPEARKING_RATE_EDEFAULT;
			case Io_interfacesPackage.SPEECH_FEATURES__INTENSITY:
				return intensity != INTENSITY_EDEFAULT;
			case Io_interfacesPackage.SPEECH_FEATURES__PITCH:
				return pitch != PITCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (spearkingRate: ");
		result.append(spearkingRate);
		result.append(", intensity: ");
		result.append(intensity);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(')');
		return result.toString();
	}

} //SpeechFeaturesImpl
