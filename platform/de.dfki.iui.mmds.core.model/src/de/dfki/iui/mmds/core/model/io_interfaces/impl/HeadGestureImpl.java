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

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;

import de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Gesture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getCommonGesture <em>Common Gesture</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl#getRoll <em>Roll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadGestureImpl extends BObjectImpl implements HeadGesture {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final BString DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected BString device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstance() <em>Service Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstance() <em>Service Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstance()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstance = SERVICE_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long BEGIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected Long beginTime = BEGIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Long DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BString LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected BString language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected static final BString USER_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected BString userAlias = USER_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommonGesture() <em>Common Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonGesture()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMON_GESTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonGesture() <em>Common Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonGesture()
	 * @generated
	 * @ordered
	 */
	protected String commonGesture = COMMON_GESTURE_EDEFAULT;

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
	 * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected static final float YAW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected float yaw = YAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final float ROLL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected float roll = ROLL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadGestureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.HEAD_GESTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(BString newDevice) {
		BString oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstance() {
		return serviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstance(String newServiceInstance) {
		String oldServiceInstance = serviceInstance;
		serviceInstance = newServiceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBeginTime() {
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginTime(Long newBeginTime) {
		Long oldBeginTime = beginTime;
		beginTime = newBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__BEGIN_TIME, oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Long newDuration) {
		Long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(BString newLanguage) {
		BString oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getUserAlias() {
		return userAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAlias(BString newUserAlias) {
		BString oldUserAlias = userAlias;
		userAlias = newUserAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommonGesture() {
		return commonGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonGesture(String newCommonGesture) {
		String oldCommonGesture = commonGesture;
		commonGesture = newCommonGesture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__COMMON_GESTURE, oldCommonGesture, commonGesture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__PITCH, oldPitch, pitch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(float newYaw) {
		float oldYaw = yaw;
		yaw = newYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__YAW, oldYaw, yaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(float newRoll) {
		float oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HEAD_GESTURE__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.HEAD_GESTURE__DEVICE:
				return getDevice();
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_INSTANCE:
				return getServiceInstance();
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_NAME:
				return getServiceName();
			case Io_interfacesPackage.HEAD_GESTURE__BEGIN_TIME:
				return getBeginTime();
			case Io_interfacesPackage.HEAD_GESTURE__DURATION:
				return getDuration();
			case Io_interfacesPackage.HEAD_GESTURE__LANGUAGE:
				return getLanguage();
			case Io_interfacesPackage.HEAD_GESTURE__USER_ALIAS:
				return getUserAlias();
			case Io_interfacesPackage.HEAD_GESTURE__COMMON_GESTURE:
				return getCommonGesture();
			case Io_interfacesPackage.HEAD_GESTURE__PITCH:
				return getPitch();
			case Io_interfacesPackage.HEAD_GESTURE__DISTANCE:
				return getDistance();
			case Io_interfacesPackage.HEAD_GESTURE__YAW:
				return getYaw();
			case Io_interfacesPackage.HEAD_GESTURE__ROLL:
				return getRoll();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Io_interfacesPackage.HEAD_GESTURE__DEVICE:
				setDevice((BString)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__DURATION:
				setDuration((Long)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__COMMON_GESTURE:
				setCommonGesture((String)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__PITCH:
				setPitch((Float)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__DISTANCE:
				setDistance((Float)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__YAW:
				setYaw((Float)newValue);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__ROLL:
				setRoll((Float)newValue);
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
			case Io_interfacesPackage.HEAD_GESTURE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__COMMON_GESTURE:
				setCommonGesture(COMMON_GESTURE_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__PITCH:
				setPitch(PITCH_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__YAW:
				setYaw(YAW_EDEFAULT);
				return;
			case Io_interfacesPackage.HEAD_GESTURE__ROLL:
				setRoll(ROLL_EDEFAULT);
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
			case Io_interfacesPackage.HEAD_GESTURE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case Io_interfacesPackage.HEAD_GESTURE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case Io_interfacesPackage.HEAD_GESTURE__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case Io_interfacesPackage.HEAD_GESTURE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case Io_interfacesPackage.HEAD_GESTURE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Io_interfacesPackage.HEAD_GESTURE__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case Io_interfacesPackage.HEAD_GESTURE__COMMON_GESTURE:
				return COMMON_GESTURE_EDEFAULT == null ? commonGesture != null : !COMMON_GESTURE_EDEFAULT.equals(commonGesture);
			case Io_interfacesPackage.HEAD_GESTURE__PITCH:
				return pitch != PITCH_EDEFAULT;
			case Io_interfacesPackage.HEAD_GESTURE__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case Io_interfacesPackage.HEAD_GESTURE__YAW:
				return yaw != YAW_EDEFAULT;
			case Io_interfacesPackage.HEAD_GESTURE__ROLL:
				return roll != ROLL_EDEFAULT;
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
		result.append(" (device: ");
		result.append(device);
		result.append(", serviceInstance: ");
		result.append(serviceInstance);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", beginTime: ");
		result.append(beginTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(", language: ");
		result.append(language);
		result.append(", userAlias: ");
		result.append(userAlias);
		result.append(", commonGesture: ");
		result.append(commonGesture);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(", distance: ");
		result.append(distance);
		result.append(", yaw: ");
		result.append(yaw);
		result.append(", roll: ");
		result.append(roll);
		result.append(')');
		return result.toString();
	}

} //HeadGestureImpl
