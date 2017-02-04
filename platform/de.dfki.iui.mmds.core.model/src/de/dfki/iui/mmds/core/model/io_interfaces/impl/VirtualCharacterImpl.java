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

import de.dfki.iui.mmds.core.model.io_interfaces.Camera;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getAvatarId <em>Avatar Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl#getBml <em>Bml</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualCharacterImpl extends BObjectImpl implements VirtualCharacter {
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
	 * The default value of the '{@link #getUtterance() <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected static final BString UTTERANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtterance() <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected BString utterance = UTTERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvatarId() <em>Avatar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarId()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger AVATAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvatarId() <em>Avatar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarId()
	 * @generated
	 * @ordered
	 */
	protected BInteger avatarId = AVATAR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCamera() <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected static final Camera CAMERA_EDEFAULT = Camera.FULL;

	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera camera = CAMERA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBml() <em>Bml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBml()
	 * @generated
	 * @ordered
	 */
	protected static final BString BML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBml() <em>Bml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBml()
	 * @generated
	 * @ordered
	 */
	protected BString bml = BML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualCharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.VIRTUAL_CHARACTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__BEGIN_TIME, oldBeginTime, beginTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getUtterance() {
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtterance(BString newUtterance) {
		BString oldUtterance = utterance;
		utterance = newUtterance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__UTTERANCE, oldUtterance, utterance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getAvatarId() {
		return avatarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvatarId(BInteger newAvatarId) {
		BInteger oldAvatarId = avatarId;
		avatarId = newAvatarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__AVATAR_ID, oldAvatarId, avatarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera getCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamera(Camera newCamera) {
		Camera oldCamera = camera;
		camera = newCamera == null ? CAMERA_EDEFAULT : newCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__CAMERA, oldCamera, camera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getBml() {
		return bml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBml(BString newBml) {
		BString oldBml = bml;
		bml = newBml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.VIRTUAL_CHARACTER__BML, oldBml, bml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DEVICE:
				return getDevice();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_INSTANCE:
				return getServiceInstance();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_NAME:
				return getServiceName();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BEGIN_TIME:
				return getBeginTime();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DURATION:
				return getDuration();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__LANGUAGE:
				return getLanguage();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__USER_ALIAS:
				return getUserAlias();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__UTTERANCE:
				return getUtterance();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__AVATAR_ID:
				return getAvatarId();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__CAMERA:
				return getCamera();
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BML:
				return getBml();
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
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DEVICE:
				setDevice((BString)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DURATION:
				setDuration((Long)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__UTTERANCE:
				setUtterance((BString)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__AVATAR_ID:
				setAvatarId((BInteger)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__CAMERA:
				setCamera((Camera)newValue);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BML:
				setBml((BString)newValue);
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
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__UTTERANCE:
				setUtterance(UTTERANCE_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__AVATAR_ID:
				setAvatarId(AVATAR_ID_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__CAMERA:
				setCamera(CAMERA_EDEFAULT);
				return;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BML:
				setBml(BML_EDEFAULT);
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
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__UTTERANCE:
				return UTTERANCE_EDEFAULT == null ? utterance != null : !UTTERANCE_EDEFAULT.equals(utterance);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__AVATAR_ID:
				return AVATAR_ID_EDEFAULT == null ? avatarId != null : !AVATAR_ID_EDEFAULT.equals(avatarId);
			case Io_interfacesPackage.VIRTUAL_CHARACTER__CAMERA:
				return camera != CAMERA_EDEFAULT;
			case Io_interfacesPackage.VIRTUAL_CHARACTER__BML:
				return BML_EDEFAULT == null ? bml != null : !BML_EDEFAULT.equals(bml);
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
		result.append(", utterance: ");
		result.append(utterance);
		result.append(", avatarId: ");
		result.append(avatarId);
		result.append(", camera: ");
		result.append(camera);
		result.append(", bml: ");
		result.append(bml);
		result.append(')');
		return result.toString();
	}

} //VirtualCharacterImpl
