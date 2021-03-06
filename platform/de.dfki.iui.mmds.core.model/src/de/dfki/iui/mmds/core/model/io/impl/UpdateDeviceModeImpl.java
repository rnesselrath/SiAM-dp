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
package de.dfki.iui.mmds.core.model.io.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.DeviceMode;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Device Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getServiceInstanceId <em>Service Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getSession <em>Session</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl#getDeviceMode <em>Device Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateDeviceModeImpl extends MinimalEObjectImpl.Container implements UpdateDeviceMode {
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
	 * The default value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstanceId = SERVICE_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected String binding = BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BString ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BString id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected static final BString SESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected BString session = SESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviceMode() <em>Device Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMode()
	 * @generated
	 * @ordered
	 */
	protected DeviceMode deviceMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateDeviceModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.UPDATE_DEVICE_MODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstanceId() {
		return serviceInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceId(String newServiceInstanceId) {
		String oldServiceInstanceId = serviceInstanceId;
		serviceInstanceId = newServiceInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID, oldServiceInstanceId, serviceInstanceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(String newBinding) {
		String oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BString newId) {
		BString oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Long newTimestamp) {
		Long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(BString newSession) {
		BString oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__SESSION, oldSession, session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMode getDeviceMode() {
		return deviceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceMode(DeviceMode newDeviceMode, NotificationChain msgs) {
		DeviceMode oldDeviceMode = deviceMode;
		deviceMode = newDeviceMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE, oldDeviceMode, newDeviceMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceMode(DeviceMode newDeviceMode) {
		if (newDeviceMode != deviceMode) {
			NotificationChain msgs = null;
			if (deviceMode != null)
				msgs = ((InternalEObject)deviceMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE, null, msgs);
			if (newDeviceMode != null)
				msgs = ((InternalEObject)newDeviceMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE, null, msgs);
			msgs = basicSetDeviceMode(newDeviceMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE, newDeviceMode, newDeviceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE:
				return basicSetDeviceMode(null, msgs);
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
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE:
				return getDevice();
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID:
				return getServiceInstanceId();
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_NAME:
				return getServiceName();
			case IoPackage.UPDATE_DEVICE_MODE__BINDING:
				return getBinding();
			case IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION:
				return getDescription();
			case IoPackage.UPDATE_DEVICE_MODE__ID:
				return getId();
			case IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP:
				return getTimestamp();
			case IoPackage.UPDATE_DEVICE_MODE__SESSION:
				return getSession();
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE:
				return getDeviceMode();
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
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE:
				setDevice((BString)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID:
				setServiceInstanceId((String)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__BINDING:
				setBinding((String)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__ID:
				setId((BString)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SESSION:
				setSession((BString)newValue);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE:
				setDeviceMode((DeviceMode)newValue);
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
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID:
				setServiceInstanceId(SERVICE_INSTANCE_ID_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__ID:
				setId(ID_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__SESSION:
				setSession(SESSION_EDEFAULT);
				return;
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE:
				setDeviceMode((DeviceMode)null);
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
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID:
				return SERVICE_INSTANCE_ID_EDEFAULT == null ? serviceInstanceId != null : !SERVICE_INSTANCE_ID_EDEFAULT.equals(serviceInstanceId);
			case IoPackage.UPDATE_DEVICE_MODE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IoPackage.UPDATE_DEVICE_MODE__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
			case IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IoPackage.UPDATE_DEVICE_MODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IoPackage.UPDATE_DEVICE_MODE__SESSION:
				return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
			case IoPackage.UPDATE_DEVICE_MODE__DEVICE_MODE:
				return deviceMode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BObject.class) {
			switch (derivedFeatureID) {
				case IoPackage.UPDATE_DEVICE_MODE__BINDING: return BasePackage.BOBJECT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Message.class) {
			switch (derivedFeatureID) {
				case IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION: return IoPackage.MESSAGE__DESCRIPTION;
				case IoPackage.UPDATE_DEVICE_MODE__ID: return IoPackage.MESSAGE__ID;
				case IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP: return IoPackage.MESSAGE__TIMESTAMP;
				case IoPackage.UPDATE_DEVICE_MODE__SESSION: return IoPackage.MESSAGE__SESSION;
				default: return -1;
			}
		}
		if (baseClass == OutputMessage.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BObject.class) {
			switch (baseFeatureID) {
				case BasePackage.BOBJECT__BINDING: return IoPackage.UPDATE_DEVICE_MODE__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Message.class) {
			switch (baseFeatureID) {
				case IoPackage.MESSAGE__DESCRIPTION: return IoPackage.UPDATE_DEVICE_MODE__DESCRIPTION;
				case IoPackage.MESSAGE__ID: return IoPackage.UPDATE_DEVICE_MODE__ID;
				case IoPackage.MESSAGE__TIMESTAMP: return IoPackage.UPDATE_DEVICE_MODE__TIMESTAMP;
				case IoPackage.MESSAGE__SESSION: return IoPackage.UPDATE_DEVICE_MODE__SESSION;
				default: return -1;
			}
		}
		if (baseClass == OutputMessage.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", serviceInstanceId: ");
		result.append(serviceInstanceId);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", binding: ");
		result.append(binding);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", session: ");
		result.append(session);
		result.append(')');
		return result.toString();
	}

} //UpdateDeviceModeImpl
