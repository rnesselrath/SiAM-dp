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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.LocatableEntity;
import de.dfki.iui.mmds.core.model.base.PhysicalLocation;
import de.dfki.iui.mmds.core.model.base.PhysicalResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl#getENTITY_ID <em>ENTITY ID</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalResourceImpl extends ResourceImpl implements PhysicalResource {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected PhysicalLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.PHYSICAL_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.PHYSICAL_RESOURCE__BINDING, oldBinding, binding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.PHYSICAL_RESOURCE__ENTITY_ID, oldENTITY_ID, entitY_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(PhysicalLocation newLocation, NotificationChain msgs) {
		PhysicalLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.PHYSICAL_RESOURCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(PhysicalLocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.PHYSICAL_RESOURCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.PHYSICAL_RESOURCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.PHYSICAL_RESOURCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.PHYSICAL_RESOURCE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case BasePackage.PHYSICAL_RESOURCE__BINDING:
				return getBinding();
			case BasePackage.PHYSICAL_RESOURCE__ENTITY_ID:
				return getENTITY_ID();
			case BasePackage.PHYSICAL_RESOURCE__LOCATION:
				return getLocation();
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
			case BasePackage.PHYSICAL_RESOURCE__BINDING:
				setBinding((String)newValue);
				return;
			case BasePackage.PHYSICAL_RESOURCE__ENTITY_ID:
				setENTITY_ID((String)newValue);
				return;
			case BasePackage.PHYSICAL_RESOURCE__LOCATION:
				setLocation((PhysicalLocation)newValue);
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
			case BasePackage.PHYSICAL_RESOURCE__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case BasePackage.PHYSICAL_RESOURCE__ENTITY_ID:
				setENTITY_ID(ENTITY_ID_EDEFAULT);
				return;
			case BasePackage.PHYSICAL_RESOURCE__LOCATION:
				setLocation((PhysicalLocation)null);
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
			case BasePackage.PHYSICAL_RESOURCE__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
			case BasePackage.PHYSICAL_RESOURCE__ENTITY_ID:
				return ENTITY_ID_EDEFAULT == null ? entitY_ID != null : !ENTITY_ID_EDEFAULT.equals(entitY_ID);
			case BasePackage.PHYSICAL_RESOURCE__LOCATION:
				return location != null;
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
				case BasePackage.PHYSICAL_RESOURCE__BINDING: return BasePackage.BOBJECT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				case BasePackage.PHYSICAL_RESOURCE__ENTITY_ID: return BasePackage.ENTITY__ENTITY_ID;
				default: return -1;
			}
		}
		if (baseClass == LocatableEntity.class) {
			switch (derivedFeatureID) {
				case BasePackage.PHYSICAL_RESOURCE__LOCATION: return BasePackage.LOCATABLE_ENTITY__LOCATION;
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
				case BasePackage.BOBJECT__BINDING: return BasePackage.PHYSICAL_RESOURCE__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				case BasePackage.ENTITY__ENTITY_ID: return BasePackage.PHYSICAL_RESOURCE__ENTITY_ID;
				default: return -1;
			}
		}
		if (baseClass == LocatableEntity.class) {
			switch (baseFeatureID) {
				case BasePackage.LOCATABLE_ENTITY__LOCATION: return BasePackage.PHYSICAL_RESOURCE__LOCATION;
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
		result.append(" (binding: ");
		result.append(binding);
		result.append(", ENTITY_ID: ");
		result.append(entitY_ID);
		result.append(')');
		return result.toString();
	}

} //PhysicalResourceImpl
