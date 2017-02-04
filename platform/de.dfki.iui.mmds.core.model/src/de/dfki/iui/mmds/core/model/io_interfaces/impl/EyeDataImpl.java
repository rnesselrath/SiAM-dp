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

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;

import de.dfki.iui.mmds.core.model.io_interfaces.EyeData;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eye Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getGazePosX <em>Gaze Pos X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getGazePosY <em>Gaze Pos Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getCameraPosX <em>Camera Pos X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getCameraPosY <em>Camera Pos Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getPupilDiameter <em>Pupil Diameter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl#getConfusionConfidence <em>Confusion Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EyeDataImpl extends BObjectImpl implements EyeData {
	/**
	 * The default value of the '{@link #getGazePosX() <em>Gaze Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGazePosX()
	 * @generated
	 * @ordered
	 */
	protected static final float GAZE_POS_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGazePosX() <em>Gaze Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGazePosX()
	 * @generated
	 * @ordered
	 */
	protected float gazePosX = GAZE_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getGazePosY() <em>Gaze Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGazePosY()
	 * @generated
	 * @ordered
	 */
	protected static final float GAZE_POS_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGazePosY() <em>Gaze Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGazePosY()
	 * @generated
	 * @ordered
	 */
	protected float gazePosY = GAZE_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getCameraPosX() <em>Camera Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraPosX()
	 * @generated
	 * @ordered
	 */
	protected static final float CAMERA_POS_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCameraPosX() <em>Camera Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraPosX()
	 * @generated
	 * @ordered
	 */
	protected float cameraPosX = CAMERA_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCameraPosY() <em>Camera Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraPosY()
	 * @generated
	 * @ordered
	 */
	protected static final float CAMERA_POS_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCameraPosY() <em>Camera Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraPosY()
	 * @generated
	 * @ordered
	 */
	protected float cameraPosY = CAMERA_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPupilDiameter() <em>Pupil Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPupilDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final float PUPIL_DIAMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPupilDiameter() <em>Pupil Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPupilDiameter()
	 * @generated
	 * @ordered
	 */
	protected float pupilDiameter = PUPIL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfusionConfidence() <em>Confusion Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfusionConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final float CONFUSION_CONFIDENCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConfusionConfidence() <em>Confusion Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfusionConfidence()
	 * @generated
	 * @ordered
	 */
	protected float confusionConfidence = CONFUSION_CONFIDENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EyeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.EYE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGazePosX() {
		return gazePosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGazePosX(float newGazePosX) {
		float oldGazePosX = gazePosX;
		gazePosX = newGazePosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__GAZE_POS_X, oldGazePosX, gazePosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGazePosY() {
		return gazePosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGazePosY(float newGazePosY) {
		float oldGazePosY = gazePosY;
		gazePosY = newGazePosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__GAZE_POS_Y, oldGazePosY, gazePosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCameraPosX() {
		return cameraPosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraPosX(float newCameraPosX) {
		float oldCameraPosX = cameraPosX;
		cameraPosX = newCameraPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__CAMERA_POS_X, oldCameraPosX, cameraPosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCameraPosY() {
		return cameraPosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraPosY(float newCameraPosY) {
		float oldCameraPosY = cameraPosY;
		cameraPosY = newCameraPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__CAMERA_POS_Y, oldCameraPosY, cameraPosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPupilDiameter() {
		return pupilDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPupilDiameter(float newPupilDiameter) {
		float oldPupilDiameter = pupilDiameter;
		pupilDiameter = newPupilDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__PUPIL_DIAMETER, oldPupilDiameter, pupilDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConfusionConfidence() {
		return confusionConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfusionConfidence(float newConfusionConfidence) {
		float oldConfusionConfidence = confusionConfidence;
		confusionConfidence = newConfusionConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_DATA__CONFUSION_CONFIDENCE, oldConfusionConfidence, confusionConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_X:
				return getGazePosX();
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_Y:
				return getGazePosY();
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_X:
				return getCameraPosX();
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_Y:
				return getCameraPosY();
			case Io_interfacesPackage.EYE_DATA__PUPIL_DIAMETER:
				return getPupilDiameter();
			case Io_interfacesPackage.EYE_DATA__DISTANCE:
				return getDistance();
			case Io_interfacesPackage.EYE_DATA__CONFUSION_CONFIDENCE:
				return getConfusionConfidence();
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
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_X:
				setGazePosX((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_Y:
				setGazePosY((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_X:
				setCameraPosX((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_Y:
				setCameraPosY((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__PUPIL_DIAMETER:
				setPupilDiameter((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__DISTANCE:
				setDistance((Float)newValue);
				return;
			case Io_interfacesPackage.EYE_DATA__CONFUSION_CONFIDENCE:
				setConfusionConfidence((Float)newValue);
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
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_X:
				setGazePosX(GAZE_POS_X_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_Y:
				setGazePosY(GAZE_POS_Y_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_X:
				setCameraPosX(CAMERA_POS_X_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_Y:
				setCameraPosY(CAMERA_POS_Y_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__PUPIL_DIAMETER:
				setPupilDiameter(PUPIL_DIAMETER_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_DATA__CONFUSION_CONFIDENCE:
				setConfusionConfidence(CONFUSION_CONFIDENCE_EDEFAULT);
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
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_X:
				return gazePosX != GAZE_POS_X_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__GAZE_POS_Y:
				return gazePosY != GAZE_POS_Y_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_X:
				return cameraPosX != CAMERA_POS_X_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__CAMERA_POS_Y:
				return cameraPosY != CAMERA_POS_Y_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__PUPIL_DIAMETER:
				return pupilDiameter != PUPIL_DIAMETER_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case Io_interfacesPackage.EYE_DATA__CONFUSION_CONFIDENCE:
				return confusionConfidence != CONFUSION_CONFIDENCE_EDEFAULT;
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
		result.append(" (gazePosX: ");
		result.append(gazePosX);
		result.append(", gazePosY: ");
		result.append(gazePosY);
		result.append(", cameraPosX: ");
		result.append(cameraPosX);
		result.append(", cameraPosY: ");
		result.append(cameraPosY);
		result.append(", pupilDiameter: ");
		result.append(pupilDiameter);
		result.append(", distance: ");
		result.append(distance);
		result.append(", confusionConfidence: ");
		result.append(confusionConfidence);
		result.append(')');
		return result.toString();
	}

} //EyeDataImpl
