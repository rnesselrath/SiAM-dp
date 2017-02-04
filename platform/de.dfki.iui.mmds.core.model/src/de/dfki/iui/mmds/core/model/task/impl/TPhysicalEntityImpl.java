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
package de.dfki.iui.mmds.core.model.task.impl;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.LocatableEntity;
import de.dfki.iui.mmds.core.model.base.MediaResource;
import de.dfki.iui.mmds.core.model.base.PhysicalLocation;
import de.dfki.iui.mmds.core.model.base.impl.NamedEntityImpl;

import de.dfki.iui.mmds.core.model.task.TDescription;
import de.dfki.iui.mmds.core.model.task.THistory;
import de.dfki.iui.mmds.core.model.task.TMetaData;
import de.dfki.iui.mmds.core.model.task.TPhysicalEntity;
import de.dfki.iui.mmds.core.model.task.TaskPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPhysical Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TPhysicalEntityImpl extends NamedEntityImpl implements TPhysicalEntity {
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
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaResource> media;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected TDescription description;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<THistory> history;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPhysicalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TPHYSICAL_ENTITY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TPHYSICAL_ENTITY__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TPHYSICAL_ENTITY__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TPHYSICAL_ENTITY__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TPHYSICAL_ENTITY__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaResource> getMedia() {
		if (media == null) {
			media = new EObjectResolvingEList<MediaResource>(MediaResource.class, this, TaskPackage.TPHYSICAL_ENTITY__MEDIA);
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(TDescription newDescription, NotificationChain msgs) {
		TDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(TDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<THistory> getHistory() {
		if (history == null) {
			history = new EObjectContainmentEList<THistory>(THistory.class, this, TaskPackage.TPHYSICAL_ENTITY__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TPHYSICAL_ENTITY__LOCATION:
				return basicSetLocation(null, msgs);
			case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TaskPackage.TPHYSICAL_ENTITY__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.TPHYSICAL_ENTITY__LOCATION:
				return getLocation();
			case TaskPackage.TPHYSICAL_ENTITY__MEDIA:
				return getMedia();
			case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION:
				return getDescription();
			case TaskPackage.TPHYSICAL_ENTITY__HISTORY:
				return getHistory();
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
			case TaskPackage.TPHYSICAL_ENTITY__LOCATION:
				setLocation((PhysicalLocation)newValue);
				return;
			case TaskPackage.TPHYSICAL_ENTITY__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaResource>)newValue);
				return;
			case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION:
				setDescription((TDescription)newValue);
				return;
			case TaskPackage.TPHYSICAL_ENTITY__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends THistory>)newValue);
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
			case TaskPackage.TPHYSICAL_ENTITY__LOCATION:
				setLocation((PhysicalLocation)null);
				return;
			case TaskPackage.TPHYSICAL_ENTITY__MEDIA:
				getMedia().clear();
				return;
			case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION:
				setDescription((TDescription)null);
				return;
			case TaskPackage.TPHYSICAL_ENTITY__HISTORY:
				getHistory().clear();
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
			case TaskPackage.TPHYSICAL_ENTITY__LOCATION:
				return location != null;
			case TaskPackage.TPHYSICAL_ENTITY__MEDIA:
				return media != null && !media.isEmpty();
			case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION:
				return description != null;
			case TaskPackage.TPHYSICAL_ENTITY__HISTORY:
				return history != null && !history.isEmpty();
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
		if (baseClass == LocatableEntity.class) {
			switch (derivedFeatureID) {
				case TaskPackage.TPHYSICAL_ENTITY__LOCATION: return BasePackage.LOCATABLE_ENTITY__LOCATION;
				default: return -1;
			}
		}
		if (baseClass == TMetaData.class) {
			switch (derivedFeatureID) {
				case TaskPackage.TPHYSICAL_ENTITY__MEDIA: return TaskPackage.TMETA_DATA__MEDIA;
				case TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION: return TaskPackage.TMETA_DATA__DESCRIPTION;
				case TaskPackage.TPHYSICAL_ENTITY__HISTORY: return TaskPackage.TMETA_DATA__HISTORY;
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
		if (baseClass == LocatableEntity.class) {
			switch (baseFeatureID) {
				case BasePackage.LOCATABLE_ENTITY__LOCATION: return TaskPackage.TPHYSICAL_ENTITY__LOCATION;
				default: return -1;
			}
		}
		if (baseClass == TMetaData.class) {
			switch (baseFeatureID) {
				case TaskPackage.TMETA_DATA__MEDIA: return TaskPackage.TPHYSICAL_ENTITY__MEDIA;
				case TaskPackage.TMETA_DATA__DESCRIPTION: return TaskPackage.TPHYSICAL_ENTITY__DESCRIPTION;
				case TaskPackage.TMETA_DATA__HISTORY: return TaskPackage.TPHYSICAL_ENTITY__HISTORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TPhysicalEntityImpl
