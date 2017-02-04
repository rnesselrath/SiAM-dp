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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.model.base.impl.EntityImpl;
import de.dfki.iui.mmds.core.model.io.CommunicationInfo;
import de.dfki.iui.mmds.core.model.io.Device;
import de.dfki.iui.mmds.core.model.io.Hardware;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getCommunicationinfo <em>Communicationinfo</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getServices <em>Services</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getUsedHardware <em>Used Hardware</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl#getServiceInstanceName <em>Service Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceImpl extends EntityImpl implements ServiceInstance {
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
	 * The cached value of the '{@link #getCommunicationinfo() <em>Communicationinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationinfo()
	 * @generated
	 * @ordered
	 */
	protected CommunicationInfo communicationinfo;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getUsedHardware() <em>Used Hardware</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedHardware()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardware> usedHardware;

	/**
	 * The default value of the '{@link #getServiceInstanceName() <em>Service Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstanceName() <em>Service Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstanceName = SERVICE_INSTANCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.SERVICE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SERVICE_INSTANCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationInfo getCommunicationinfo() {
		return communicationinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationinfo(CommunicationInfo newCommunicationinfo, NotificationChain msgs) {
		CommunicationInfo oldCommunicationinfo = communicationinfo;
		communicationinfo = newCommunicationinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO, oldCommunicationinfo, newCommunicationinfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationinfo(CommunicationInfo newCommunicationinfo) {
		if (newCommunicationinfo != communicationinfo) {
			NotificationChain msgs = null;
			if (communicationinfo != null)
				msgs = ((InternalEObject)communicationinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO, null, msgs);
			if (newCommunicationinfo != null)
				msgs = ((InternalEObject)newCommunicationinfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO, null, msgs);
			msgs = basicSetCommunicationinfo(newCommunicationinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO, newCommunicationinfo, newCommunicationinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, IoPackage.SERVICE_INSTANCE__SERVICES, IoPackage.SERVICE__SERVICE_INSTANCE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.SERVICE_INSTANCE__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SERVICE_INSTANCE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hardware> getUsedHardware() {
		if (usedHardware == null) {
			usedHardware = new EObjectResolvingEList<Hardware>(Hardware.class, this, IoPackage.SERVICE_INSTANCE__USED_HARDWARE);
		}
		return usedHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstanceName() {
		return serviceInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceName(String newServiceInstanceName) {
		String oldServiceInstanceName = serviceInstanceName;
		serviceInstanceName = newServiceInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME, oldServiceInstanceName, serviceInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
				return basicSetCommunicationinfo(null, msgs);
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case IoPackage.SERVICE_INSTANCE__DESCRIPTION:
				return getDescription();
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
				return getCommunicationinfo();
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				return getServices();
			case IoPackage.SERVICE_INSTANCE__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case IoPackage.SERVICE_INSTANCE__USED_HARDWARE:
				return getUsedHardware();
			case IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME:
				return getServiceInstanceName();
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
			case IoPackage.SERVICE_INSTANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
				setCommunicationinfo((CommunicationInfo)newValue);
				return;
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case IoPackage.SERVICE_INSTANCE__DEVICE:
				setDevice((Device)newValue);
				return;
			case IoPackage.SERVICE_INSTANCE__USED_HARDWARE:
				getUsedHardware().clear();
				getUsedHardware().addAll((Collection<? extends Hardware>)newValue);
				return;
			case IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME:
				setServiceInstanceName((String)newValue);
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
			case IoPackage.SERVICE_INSTANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
				setCommunicationinfo((CommunicationInfo)null);
				return;
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				getServices().clear();
				return;
			case IoPackage.SERVICE_INSTANCE__DEVICE:
				setDevice((Device)null);
				return;
			case IoPackage.SERVICE_INSTANCE__USED_HARDWARE:
				getUsedHardware().clear();
				return;
			case IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME:
				setServiceInstanceName(SERVICE_INSTANCE_NAME_EDEFAULT);
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
			case IoPackage.SERVICE_INSTANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
				return communicationinfo != null;
			case IoPackage.SERVICE_INSTANCE__SERVICES:
				return services != null && !services.isEmpty();
			case IoPackage.SERVICE_INSTANCE__DEVICE:
				return device != null;
			case IoPackage.SERVICE_INSTANCE__USED_HARDWARE:
				return usedHardware != null && !usedHardware.isEmpty();
			case IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME:
				return SERVICE_INSTANCE_NAME_EDEFAULT == null ? serviceInstanceName != null : !SERVICE_INSTANCE_NAME_EDEFAULT.equals(serviceInstanceName);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", serviceInstanceName: ");
		result.append(serviceInstanceName);
		result.append(')');
		return result.toString();
	}

} //ServiceInstanceImpl
