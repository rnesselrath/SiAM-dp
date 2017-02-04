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
package de.dfki.iui.mmds.core.model.project.impl;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import de.dfki.iui.mmds.core.model.base.Person;

import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Siam Internal Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getSiamId <em>Siam Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getServiceInstanceId <em>Service Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl#getInitMessages <em>Init Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiamInternalServiceInterfaceImpl extends MinimalEObjectImpl.Container implements SiamInternalServiceInterface {
	/**
	 * The default value of the '{@link #getSiamId() <em>Siam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiamId()
	 * @generated
	 * @ordered
	 */
	protected static final BString SIAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiamId() <em>Siam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiamId()
	 * @generated
	 * @ordered
	 */
	protected BString siamId = SIAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final BString SERVICE_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected BString serviceInstanceId = SERVICE_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final BString SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected BString serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected static final BString MODALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected BString modality = MODALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected Person participant;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EClass serviceType;

	/**
	 * The cached value of the '{@link #getInitMessages() <em>Init Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputMessage> initMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiamInternalServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.SIAM_INTERNAL_SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getSiamId() {
		return siamId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiamId(BString newSiamId) {
		BString oldSiamId = siamId;
		siamId = newSiamId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID, oldSiamId, siamId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getServiceInstanceId() {
		return serviceInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceId(BString newServiceInstanceId) {
		BString oldServiceInstanceId = serviceInstanceId;
		serviceInstanceId = newServiceInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID, oldServiceInstanceId, serviceInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(BString newServiceName) {
		BString oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(BString newModality) {
		BString oldModality = modality;
		modality = newModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY, oldModality, modality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getParticipant() {
		if (participant != null && participant.eIsProxy()) {
			InternalEObject oldParticipant = (InternalEObject)participant;
			participant = (Person)eResolveProxy(oldParticipant);
			if (participant != oldParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT, oldParticipant, participant));
			}
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetParticipant() {
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(Person newParticipant) {
		Person oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT, oldParticipant, participant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		if (serviceType != null && serviceType.eIsProxy()) {
			InternalEObject oldServiceType = (InternalEObject)serviceType;
			serviceType = (EClass)eResolveProxy(oldServiceType);
			if (serviceType != oldServiceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE, oldServiceType, serviceType));
			}
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(EClass newServiceType) {
		EClass oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputMessage> getInitMessages() {
		if (initMessages == null) {
			initMessages = new EObjectContainmentEList<OutputMessage>(OutputMessage.class, this, ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES);
		}
		return initMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES:
				return ((InternalEList<?>)getInitMessages()).basicRemove(otherEnd, msgs);
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
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID:
				return getSiamId();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID:
				return getServiceInstanceId();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME:
				return getServiceName();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY:
				return getModality();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT:
				if (resolve) return getParticipant();
				return basicGetParticipant();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE:
				if (resolve) return getServiceType();
				return basicGetServiceType();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES:
				return getInitMessages();
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
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID:
				setSiamId((BString)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID:
				setServiceInstanceId((BString)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME:
				setServiceName((BString)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY:
				setModality((BString)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT:
				setParticipant((Person)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE:
				setServiceType((EClass)newValue);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES:
				getInitMessages().clear();
				getInitMessages().addAll((Collection<? extends OutputMessage>)newValue);
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
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID:
				setSiamId(SIAM_ID_EDEFAULT);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID:
				setServiceInstanceId(SERVICE_INSTANCE_ID_EDEFAULT);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY:
				setModality(MODALITY_EDEFAULT);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT:
				setParticipant((Person)null);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE:
				setServiceType((EClass)null);
				return;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES:
				getInitMessages().clear();
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
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID:
				return SIAM_ID_EDEFAULT == null ? siamId != null : !SIAM_ID_EDEFAULT.equals(siamId);
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID:
				return SERVICE_INSTANCE_ID_EDEFAULT == null ? serviceInstanceId != null : !SERVICE_INSTANCE_ID_EDEFAULT.equals(serviceInstanceId);
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY:
				return MODALITY_EDEFAULT == null ? modality != null : !MODALITY_EDEFAULT.equals(modality);
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT:
				return participant != null;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE:
				return serviceType != null;
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES:
				return initMessages != null && !initMessages.isEmpty();
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
		result.append(" (siamId: ");
		result.append(siamId);
		result.append(", serviceInstanceId: ");
		result.append(serviceInstanceId);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", modality: ");
		result.append(modality);
		result.append(')');
		return result.toString();
	}

} //SiamInternalServiceInterfaceImpl
