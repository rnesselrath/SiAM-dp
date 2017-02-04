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
package de.dfki.iui.mmds.core.model.io.tangible.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getHardwareType <em>Hardware Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl#getHardwareFriendlyName <em>Hardware Friendly Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TangibleInputImpl extends BObjectImpl implements TangibleInput {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long BEGIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected Long beginTime = BEGIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Long DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BString LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected BString language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected static final BString USER_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected BString userAlias = USER_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected String hardwareID = HARDWARE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareType() <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHardwareType()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareTypes HARDWARE_TYPE_EDEFAULT = HardwareTypes.PUSH_BUTTON;

	/**
	 * The cached value of the '{@link #getHardwareType() <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHardwareType()
	 * @generated
	 * @ordered
	 */
	protected HardwareTypes hardwareType = HARDWARE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareFriendlyName() <em>Hardware Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHardwareFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_FRIENDLY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareFriendlyName() <em>Hardware Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHardwareFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected String hardwareFriendlyName = HARDWARE_FRIENDLY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TangibleInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TangiblePackage.Literals.TANGIBLE_INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__BEGIN_TIME, oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Long newDuration) {
		Long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(BString newLanguage) {
		BString oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getUserAlias() {
		return userAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAlias(BString newUserAlias) {
		BString oldUserAlias = userAlias;
		userAlias = newUserAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareID() {
		return hardwareID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareID(String newHardwareID) {
		String oldHardwareID = hardwareID;
		hardwareID = newHardwareID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__HARDWARE_ID, oldHardwareID, hardwareID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareTypes getHardwareType() {
		return hardwareType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareType(HardwareTypes newHardwareType) {
		HardwareTypes oldHardwareType = hardwareType;
		hardwareType = newHardwareType == null ? HARDWARE_TYPE_EDEFAULT : newHardwareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__HARDWARE_TYPE, oldHardwareType, hardwareType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareFriendlyName() {
		return hardwareFriendlyName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareFriendlyName(String newHardwareFriendlyName) {
		String oldHardwareFriendlyName = hardwareFriendlyName;
		hardwareFriendlyName = newHardwareFriendlyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME, oldHardwareFriendlyName, hardwareFriendlyName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TangiblePackage.TANGIBLE_INPUT__DEVICE:
				return getDevice();
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_INSTANCE:
				return getServiceInstance();
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_NAME:
				return getServiceName();
			case TangiblePackage.TANGIBLE_INPUT__BEGIN_TIME:
				return getBeginTime();
			case TangiblePackage.TANGIBLE_INPUT__DURATION:
				return getDuration();
			case TangiblePackage.TANGIBLE_INPUT__LANGUAGE:
				return getLanguage();
			case TangiblePackage.TANGIBLE_INPUT__USER_ALIAS:
				return getUserAlias();
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_ID:
				return getHardwareID();
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_TYPE:
				return getHardwareType();
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME:
				return getHardwareFriendlyName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TangiblePackage.TANGIBLE_INPUT__DEVICE:
				setDevice((BString)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__DURATION:
				setDuration((Long)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_ID:
				setHardwareID((String)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_TYPE:
				setHardwareType((HardwareTypes)newValue);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME:
				setHardwareFriendlyName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TangiblePackage.TANGIBLE_INPUT__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_ID:
				setHardwareID(HARDWARE_ID_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_TYPE:
				setHardwareType(HARDWARE_TYPE_EDEFAULT);
				return;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME:
				setHardwareFriendlyName(HARDWARE_FRIENDLY_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TangiblePackage.TANGIBLE_INPUT__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case TangiblePackage.TANGIBLE_INPUT__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case TangiblePackage.TANGIBLE_INPUT__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case TangiblePackage.TANGIBLE_INPUT__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case TangiblePackage.TANGIBLE_INPUT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TangiblePackage.TANGIBLE_INPUT__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_ID:
				return HARDWARE_ID_EDEFAULT == null ? hardwareID != null : !HARDWARE_ID_EDEFAULT.equals(hardwareID);
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_TYPE:
				return hardwareType != HARDWARE_TYPE_EDEFAULT;
			case TangiblePackage.TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME:
				return HARDWARE_FRIENDLY_NAME_EDEFAULT == null ? hardwareFriendlyName != null : !HARDWARE_FRIENDLY_NAME_EDEFAULT.equals(hardwareFriendlyName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", hardwareID: ");
		result.append(hardwareID);
		result.append(", hardwareType: ");
		result.append(hardwareType);
		result.append(", hardwareFriendlyName: ");
		result.append(hardwareFriendlyName);
		result.append(')');
		return result.toString();
	}

} // TangibleInputImpl
