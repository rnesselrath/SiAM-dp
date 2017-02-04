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

import de.dfki.iui.mmds.core.model.io_interfaces.EyeData;
import de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eye Gaze</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getLeftEye <em>Left Eye</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl#getRightEye <em>Right Eye</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EyeGazeImpl extends BObjectImpl implements EyeGaze {
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
	 * The cached value of the '{@link #getLeftEye() <em>Left Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEye()
	 * @generated
	 * @ordered
	 */
	protected EyeData leftEye;

	/**
	 * The cached value of the '{@link #getRightEye() <em>Right Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEye()
	 * @generated
	 * @ordered
	 */
	protected EyeData rightEye;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EyeGazeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.EYE_GAZE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__BEGIN_TIME, oldBeginTime, beginTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeData getLeftEye() {
		return leftEye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftEye(EyeData newLeftEye, NotificationChain msgs) {
		EyeData oldLeftEye = leftEye;
		leftEye = newLeftEye;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__LEFT_EYE, oldLeftEye, newLeftEye);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftEye(EyeData newLeftEye) {
		if (newLeftEye != leftEye) {
			NotificationChain msgs = null;
			if (leftEye != null)
				msgs = ((InternalEObject)leftEye).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Io_interfacesPackage.EYE_GAZE__LEFT_EYE, null, msgs);
			if (newLeftEye != null)
				msgs = ((InternalEObject)newLeftEye).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Io_interfacesPackage.EYE_GAZE__LEFT_EYE, null, msgs);
			msgs = basicSetLeftEye(newLeftEye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__LEFT_EYE, newLeftEye, newLeftEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeData getRightEye() {
		return rightEye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightEye(EyeData newRightEye, NotificationChain msgs) {
		EyeData oldRightEye = rightEye;
		rightEye = newRightEye;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__RIGHT_EYE, oldRightEye, newRightEye);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightEye(EyeData newRightEye) {
		if (newRightEye != rightEye) {
			NotificationChain msgs = null;
			if (rightEye != null)
				msgs = ((InternalEObject)rightEye).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Io_interfacesPackage.EYE_GAZE__RIGHT_EYE, null, msgs);
			if (newRightEye != null)
				msgs = ((InternalEObject)newRightEye).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Io_interfacesPackage.EYE_GAZE__RIGHT_EYE, null, msgs);
			msgs = basicSetRightEye(newRightEye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.EYE_GAZE__RIGHT_EYE, newRightEye, newRightEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Io_interfacesPackage.EYE_GAZE__LEFT_EYE:
				return basicSetLeftEye(null, msgs);
			case Io_interfacesPackage.EYE_GAZE__RIGHT_EYE:
				return basicSetRightEye(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.EYE_GAZE__DEVICE:
				return getDevice();
			case Io_interfacesPackage.EYE_GAZE__SERVICE_INSTANCE:
				return getServiceInstance();
			case Io_interfacesPackage.EYE_GAZE__SERVICE_NAME:
				return getServiceName();
			case Io_interfacesPackage.EYE_GAZE__BEGIN_TIME:
				return getBeginTime();
			case Io_interfacesPackage.EYE_GAZE__DURATION:
				return getDuration();
			case Io_interfacesPackage.EYE_GAZE__LANGUAGE:
				return getLanguage();
			case Io_interfacesPackage.EYE_GAZE__USER_ALIAS:
				return getUserAlias();
			case Io_interfacesPackage.EYE_GAZE__LEFT_EYE:
				return getLeftEye();
			case Io_interfacesPackage.EYE_GAZE__RIGHT_EYE:
				return getRightEye();
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
			case Io_interfacesPackage.EYE_GAZE__DEVICE:
				setDevice((BString)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__DURATION:
				setDuration((Long)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__LEFT_EYE:
				setLeftEye((EyeData)newValue);
				return;
			case Io_interfacesPackage.EYE_GAZE__RIGHT_EYE:
				setRightEye((EyeData)newValue);
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
			case Io_interfacesPackage.EYE_GAZE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case Io_interfacesPackage.EYE_GAZE__LEFT_EYE:
				setLeftEye((EyeData)null);
				return;
			case Io_interfacesPackage.EYE_GAZE__RIGHT_EYE:
				setRightEye((EyeData)null);
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
			case Io_interfacesPackage.EYE_GAZE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case Io_interfacesPackage.EYE_GAZE__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case Io_interfacesPackage.EYE_GAZE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case Io_interfacesPackage.EYE_GAZE__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case Io_interfacesPackage.EYE_GAZE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case Io_interfacesPackage.EYE_GAZE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Io_interfacesPackage.EYE_GAZE__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case Io_interfacesPackage.EYE_GAZE__LEFT_EYE:
				return leftEye != null;
			case Io_interfacesPackage.EYE_GAZE__RIGHT_EYE:
				return rightEye != null;
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
		result.append(')');
		return result.toString();
	}

} //EyeGazeImpl
