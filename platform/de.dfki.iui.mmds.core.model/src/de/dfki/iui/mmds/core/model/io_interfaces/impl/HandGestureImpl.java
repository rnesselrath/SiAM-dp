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

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;

import de.dfki.iui.mmds.core.model.io_interfaces.HandGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hand Gesture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getFingersLeft <em>Fingers Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getFingersRight <em>Fingers Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getLevelLeft <em>Level Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getLevelRight <em>Level Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getGesture <em>Gesture</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl#getGestureDirection <em>Gesture Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandGestureImpl extends BObjectImpl implements HandGesture {
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
	 * The default value of the '{@link #getFingersLeft() <em>Fingers Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersLeft()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger FINGERS_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFingersLeft() <em>Fingers Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersLeft()
	 * @generated
	 * @ordered
	 */
	protected BInteger fingersLeft = FINGERS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFingersRight() <em>Fingers Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersRight()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger FINGERS_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFingersRight() <em>Fingers Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersRight()
	 * @generated
	 * @ordered
	 */
	protected BInteger fingersRight = FINGERS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelLeft() <em>Level Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelLeft()
	 * @generated
	 * @ordered
	 */
	protected static final BString LEVEL_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelLeft() <em>Level Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelLeft()
	 * @generated
	 * @ordered
	 */
	protected BString levelLeft = LEVEL_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelRight() <em>Level Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRight()
	 * @generated
	 * @ordered
	 */
	protected static final BString LEVEL_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelRight() <em>Level Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRight()
	 * @generated
	 * @ordered
	 */
	protected BString levelRight = LEVEL_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGesture() <em>Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesture()
	 * @generated
	 * @ordered
	 */
	protected static final BString GESTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGesture() <em>Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesture()
	 * @generated
	 * @ordered
	 */
	protected BString gesture = GESTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGestureDirection() <em>Gesture Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestureDirection()
	 * @generated
	 * @ordered
	 */
	protected static final BString GESTURE_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGestureDirection() <em>Gesture Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestureDirection()
	 * @generated
	 * @ordered
	 */
	protected BString gestureDirection = GESTURE_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandGestureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.HAND_GESTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__BEGIN_TIME, oldBeginTime, beginTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getFingersLeft() {
		return fingersLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFingersLeft(BInteger newFingersLeft) {
		BInteger oldFingersLeft = fingersLeft;
		fingersLeft = newFingersLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__FINGERS_LEFT, oldFingersLeft, fingersLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getFingersRight() {
		return fingersRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFingersRight(BInteger newFingersRight) {
		BInteger oldFingersRight = fingersRight;
		fingersRight = newFingersRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__FINGERS_RIGHT, oldFingersRight, fingersRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getLevelLeft() {
		return levelLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelLeft(BString newLevelLeft) {
		BString oldLevelLeft = levelLeft;
		levelLeft = newLevelLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__LEVEL_LEFT, oldLevelLeft, levelLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getLevelRight() {
		return levelRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelRight(BString newLevelRight) {
		BString oldLevelRight = levelRight;
		levelRight = newLevelRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__LEVEL_RIGHT, oldLevelRight, levelRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getGesture() {
		return gesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGesture(BString newGesture) {
		BString oldGesture = gesture;
		gesture = newGesture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__GESTURE, oldGesture, gesture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getGestureDirection() {
		return gestureDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestureDirection(BString newGestureDirection) {
		BString oldGestureDirection = gestureDirection;
		gestureDirection = newGestureDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.HAND_GESTURE__GESTURE_DIRECTION, oldGestureDirection, gestureDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.HAND_GESTURE__DEVICE:
				return getDevice();
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_INSTANCE:
				return getServiceInstance();
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_NAME:
				return getServiceName();
			case Io_interfacesPackage.HAND_GESTURE__BEGIN_TIME:
				return getBeginTime();
			case Io_interfacesPackage.HAND_GESTURE__DURATION:
				return getDuration();
			case Io_interfacesPackage.HAND_GESTURE__LANGUAGE:
				return getLanguage();
			case Io_interfacesPackage.HAND_GESTURE__USER_ALIAS:
				return getUserAlias();
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_LEFT:
				return getFingersLeft();
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_RIGHT:
				return getFingersRight();
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_LEFT:
				return getLevelLeft();
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_RIGHT:
				return getLevelRight();
			case Io_interfacesPackage.HAND_GESTURE__GESTURE:
				return getGesture();
			case Io_interfacesPackage.HAND_GESTURE__GESTURE_DIRECTION:
				return getGestureDirection();
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
			case Io_interfacesPackage.HAND_GESTURE__DEVICE:
				setDevice((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__DURATION:
				setDuration((Long)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_LEFT:
				setFingersLeft((BInteger)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_RIGHT:
				setFingersRight((BInteger)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_LEFT:
				setLevelLeft((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_RIGHT:
				setLevelRight((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__GESTURE:
				setGesture((BString)newValue);
				return;
			case Io_interfacesPackage.HAND_GESTURE__GESTURE_DIRECTION:
				setGestureDirection((BString)newValue);
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
			case Io_interfacesPackage.HAND_GESTURE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_LEFT:
				setFingersLeft(FINGERS_LEFT_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_RIGHT:
				setFingersRight(FINGERS_RIGHT_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_LEFT:
				setLevelLeft(LEVEL_LEFT_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_RIGHT:
				setLevelRight(LEVEL_RIGHT_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__GESTURE:
				setGesture(GESTURE_EDEFAULT);
				return;
			case Io_interfacesPackage.HAND_GESTURE__GESTURE_DIRECTION:
				setGestureDirection(GESTURE_DIRECTION_EDEFAULT);
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
			case Io_interfacesPackage.HAND_GESTURE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case Io_interfacesPackage.HAND_GESTURE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case Io_interfacesPackage.HAND_GESTURE__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case Io_interfacesPackage.HAND_GESTURE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case Io_interfacesPackage.HAND_GESTURE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Io_interfacesPackage.HAND_GESTURE__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_LEFT:
				return FINGERS_LEFT_EDEFAULT == null ? fingersLeft != null : !FINGERS_LEFT_EDEFAULT.equals(fingersLeft);
			case Io_interfacesPackage.HAND_GESTURE__FINGERS_RIGHT:
				return FINGERS_RIGHT_EDEFAULT == null ? fingersRight != null : !FINGERS_RIGHT_EDEFAULT.equals(fingersRight);
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_LEFT:
				return LEVEL_LEFT_EDEFAULT == null ? levelLeft != null : !LEVEL_LEFT_EDEFAULT.equals(levelLeft);
			case Io_interfacesPackage.HAND_GESTURE__LEVEL_RIGHT:
				return LEVEL_RIGHT_EDEFAULT == null ? levelRight != null : !LEVEL_RIGHT_EDEFAULT.equals(levelRight);
			case Io_interfacesPackage.HAND_GESTURE__GESTURE:
				return GESTURE_EDEFAULT == null ? gesture != null : !GESTURE_EDEFAULT.equals(gesture);
			case Io_interfacesPackage.HAND_GESTURE__GESTURE_DIRECTION:
				return GESTURE_DIRECTION_EDEFAULT == null ? gestureDirection != null : !GESTURE_DIRECTION_EDEFAULT.equals(gestureDirection);
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
		result.append(", fingersLeft: ");
		result.append(fingersLeft);
		result.append(", fingersRight: ");
		result.append(fingersRight);
		result.append(", levelLeft: ");
		result.append(levelLeft);
		result.append(", levelRight: ");
		result.append(levelRight);
		result.append(", gesture: ");
		result.append(gesture);
		result.append(", gestureDirection: ");
		result.append(gestureDirection);
		result.append(')');
		return result.toString();
	}

} //HandGestureImpl
