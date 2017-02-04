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
package de.dfki.iui.mmds.core.model.base.impl;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.CyberPhysicalEnvironment;

import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Service;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyber Physical Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl#getUserInterfaces <em>User Interfaces</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl#getParticipantId <em>Participant Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl#getENTITY_ID <em>ENTITY ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CyberPhysicalEnvironmentImpl extends MinimalEObjectImpl.Container implements CyberPhysicalEnvironment {
	/**
	 * The cached value of the '{@link #getUserInterfaces() <em>User Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> userInterfaces;
	/**
	 * The default value of the '{@link #getParticipantId() <em>Participant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantId()
	 * @generated
	 * @ordered
	 */
	protected static final BString PARTICIPANT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParticipantId() <em>Participant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantId()
	 * @generated
	 * @ordered
	 */
	protected BString participantId = PARTICIPANT_ID_EDEFAULT;
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
	 * The default value of the '{@link #getENTITY_ID() <em>ENTITY ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENTITY_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_ID_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getENTITY_ID() <em>ENTITY ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENTITY_ID()
	 * @generated
	 * @ordered
	 */
	protected String entitY_ID = ENTITY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CYBER_PHYSICAL_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUserInterfaces() {
		if (userInterfaces == null) {
			userInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES, IoPackage.SERVICE__USER);
		}
		return userInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getParticipantId() {
		return participantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantId(BString newParticipantId) {
		BString oldParticipantId = participantId;
		participantId = newParticipantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID, oldParticipantId, participantId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getENTITY_ID() {
		return entitY_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setENTITY_ID(String newENTITY_ID) {
		String oldENTITY_ID = entitY_ID;
		entitY_ID = newENTITY_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID, oldENTITY_ID, entitY_ID));
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserInterfaces()).basicAdd(otherEnd, msgs);
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				return ((InternalEList<?>)getUserInterfaces()).basicRemove(otherEnd, msgs);
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				return getUserInterfaces();
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID:
				return getParticipantId();
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING:
				return getBinding();
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID:
				return getENTITY_ID();
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				getUserInterfaces().clear();
				getUserInterfaces().addAll((Collection<? extends Service>)newValue);
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID:
				setParticipantId((BString)newValue);
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING:
				setBinding((String)newValue);
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID:
				setENTITY_ID((String)newValue);
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				getUserInterfaces().clear();
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID:
				setParticipantId(PARTICIPANT_ID_EDEFAULT);
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID:
				setENTITY_ID(ENTITY_ID_EDEFAULT);
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
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES:
				return userInterfaces != null && !userInterfaces.isEmpty();
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID:
				return PARTICIPANT_ID_EDEFAULT == null ? participantId != null : !PARTICIPANT_ID_EDEFAULT.equals(participantId);
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID:
				return ENTITY_ID_EDEFAULT == null ? entitY_ID != null : !ENTITY_ID_EDEFAULT.equals(entitY_ID);
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
				case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING: return BasePackage.BOBJECT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				case BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID: return BasePackage.ENTITY__ENTITY_ID;
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
				case BasePackage.BOBJECT__BINDING: return BasePackage.CYBER_PHYSICAL_ENVIRONMENT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				case BasePackage.ENTITY__ENTITY_ID: return BasePackage.CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID;
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
		result.append(" (participantId: ");
		result.append(participantId);
		result.append(", binding: ");
		result.append(binding);
		result.append(", ENTITY_ID: ");
		result.append(entitY_ID);
		result.append(')');
		return result.toString();
	}

} //CyberPhysicalEnvironmentImpl
