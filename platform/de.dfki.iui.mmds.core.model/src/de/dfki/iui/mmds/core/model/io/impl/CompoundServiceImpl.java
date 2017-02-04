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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.impl.EntityImpl;
import de.dfki.iui.mmds.core.model.io.CompoundService;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Compound Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl#getUser <em>User</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundServiceImpl extends EntityImpl implements CompoundService {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<DialogParticipant> user;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleService> services;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.COMPOUND_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.COMPOUND_SERVICE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstance getServiceInstance() {
		if (eContainerFeatureID() != IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE) return null;
		return (ServiceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInstance(ServiceInstance newServiceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceInstance, IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstance(ServiceInstance newServiceInstance) {
		if (newServiceInstance != eInternalContainer() || (eContainerFeatureID() != IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE && newServiceInstance != null)) {
			if (EcoreUtil.isAncestor(this, newServiceInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceInstance != null)
				msgs = ((InternalEObject)newServiceInstance).eInverseAdd(this, IoPackage.SERVICE_INSTANCE__SERVICES, ServiceInstance.class, msgs);
			msgs = basicSetServiceInstance(newServiceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE, newServiceInstance, newServiceInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DialogParticipant> getUser() {
		if (user == null) {
			user = new EObjectWithInverseResolvingEList.ManyInverse<DialogParticipant>(DialogParticipant.class, this, IoPackage.COMPOUND_SERVICE__USER, BasePackage.DIALOG_PARTICIPANT__USER_INTERFACES);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleService> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<SimpleService>(SimpleService.class, this, IoPackage.COMPOUND_SERVICE__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getUniqueId() {
		if (getServiceInstance().getServiceInstanceName() == null)
			return getServiceInstance().getENTITY_ID() + '#' + getServiceName();
		else
			return getServiceInstance().getServiceInstanceName() + '#' + getServiceName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServiceInstance((ServiceInstance)otherEnd, msgs);
			case IoPackage.COMPOUND_SERVICE__USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUser()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				return basicSetServiceInstance(null, msgs);
			case IoPackage.COMPOUND_SERVICE__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, IoPackage.SERVICE_INSTANCE__SERVICES, ServiceInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.COMPOUND_SERVICE__SERVICE_NAME:
				return getServiceName();
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				return getServiceInstance();
			case IoPackage.COMPOUND_SERVICE__USER:
				return getUser();
			case IoPackage.COMPOUND_SERVICE__SERVICES:
				return getServices();
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
			case IoPackage.COMPOUND_SERVICE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				setServiceInstance((ServiceInstance)newValue);
				return;
			case IoPackage.COMPOUND_SERVICE__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends DialogParticipant>)newValue);
				return;
			case IoPackage.COMPOUND_SERVICE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends SimpleService>)newValue);
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
			case IoPackage.COMPOUND_SERVICE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				setServiceInstance((ServiceInstance)null);
				return;
			case IoPackage.COMPOUND_SERVICE__USER:
				getUser().clear();
				return;
			case IoPackage.COMPOUND_SERVICE__SERVICES:
				getServices().clear();
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
			case IoPackage.COMPOUND_SERVICE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IoPackage.COMPOUND_SERVICE__SERVICE_INSTANCE:
				return getServiceInstance() != null;
			case IoPackage.COMPOUND_SERVICE__USER:
				return user != null && !user.isEmpty();
			case IoPackage.COMPOUND_SERVICE__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IoPackage.COMPOUND_SERVICE___GET_UNIQUE_ID:
				return getUniqueId();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} // CompoundServiceImpl
