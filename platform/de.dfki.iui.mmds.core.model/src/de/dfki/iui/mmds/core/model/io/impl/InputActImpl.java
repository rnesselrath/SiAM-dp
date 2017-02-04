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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getAddressee <em>Addressee</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#isPassedFade <em>Passed Fade</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getSession <em>Session</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputActImpl extends MinimalEObjectImpl.Container implements InputAct {
	/**
	 * The default value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final BString INITIATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected BString initiator = INITIATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddressee() <em>Addressee</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressee()
	 * @generated
	 * @ordered
	 */
	protected EList<BString> addressee;

	/**
	 * The default value of the '{@link #isPassedFade() <em>Passed Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassedFade()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSED_FADE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassedFade() <em>Passed Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassedFade()
	 * @generated
	 * @ordered
	 */
	protected boolean passedFade = PASSED_FADE_EDEFAULT;

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
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<InputRepresentation> representation;

	/**
	 * The cached value of the '{@link #getHypotheses() <em>Hypotheses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypotheses()
	 * @generated
	 * @ordered
	 */
	protected EList<Hypothesis> hypotheses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.INPUT_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiator(BString newInitiator) {
		BString oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BString> getAddressee() {
		if (addressee == null) {
			addressee = new EDataTypeUniqueEList<BString>(BString.class, this, IoPackage.INPUT_ACT__ADDRESSEE);
		}
		return addressee;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BString newId) {
		BString oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSession(BString newSession) {
		BString oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__SESSION, oldSession, session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputRepresentation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectContainmentEList<InputRepresentation>(InputRepresentation.class, this, IoPackage.INPUT_ACT__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hypothesis> getHypotheses() {
		if (hypotheses == null) {
			hypotheses = new EObjectContainmentEList<Hypothesis>(Hypothesis.class, this, IoPackage.INPUT_ACT__HYPOTHESES);
		}
		return hypotheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPassedFade() {
		return passedFade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassedFade(boolean newPassedFade) {
		boolean oldPassedFade = passedFade;
		passedFade = newPassedFade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.INPUT_ACT__PASSED_FADE, oldPassedFade, passedFade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.INPUT_ACT__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
			case IoPackage.INPUT_ACT__HYPOTHESES:
				return ((InternalEList<?>)getHypotheses()).basicRemove(otherEnd, msgs);
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
			case IoPackage.INPUT_ACT__INITIATOR:
				return getInitiator();
			case IoPackage.INPUT_ACT__ADDRESSEE:
				return getAddressee();
			case IoPackage.INPUT_ACT__PASSED_FADE:
				return isPassedFade();
			case IoPackage.INPUT_ACT__BINDING:
				return getBinding();
			case IoPackage.INPUT_ACT__DESCRIPTION:
				return getDescription();
			case IoPackage.INPUT_ACT__ID:
				return getId();
			case IoPackage.INPUT_ACT__TIMESTAMP:
				return getTimestamp();
			case IoPackage.INPUT_ACT__SESSION:
				return getSession();
			case IoPackage.INPUT_ACT__REPRESENTATION:
				return getRepresentation();
			case IoPackage.INPUT_ACT__HYPOTHESES:
				return getHypotheses();
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
			case IoPackage.INPUT_ACT__INITIATOR:
				setInitiator((BString)newValue);
				return;
			case IoPackage.INPUT_ACT__ADDRESSEE:
				getAddressee().clear();
				getAddressee().addAll((Collection<? extends BString>)newValue);
				return;
			case IoPackage.INPUT_ACT__PASSED_FADE:
				setPassedFade((Boolean)newValue);
				return;
			case IoPackage.INPUT_ACT__BINDING:
				setBinding((String)newValue);
				return;
			case IoPackage.INPUT_ACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IoPackage.INPUT_ACT__ID:
				setId((BString)newValue);
				return;
			case IoPackage.INPUT_ACT__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case IoPackage.INPUT_ACT__SESSION:
				setSession((BString)newValue);
				return;
			case IoPackage.INPUT_ACT__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends InputRepresentation>)newValue);
				return;
			case IoPackage.INPUT_ACT__HYPOTHESES:
				getHypotheses().clear();
				getHypotheses().addAll((Collection<? extends Hypothesis>)newValue);
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
			case IoPackage.INPUT_ACT__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__ADDRESSEE:
				getAddressee().clear();
				return;
			case IoPackage.INPUT_ACT__PASSED_FADE:
				setPassedFade(PASSED_FADE_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__ID:
				setId(ID_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__SESSION:
				setSession(SESSION_EDEFAULT);
				return;
			case IoPackage.INPUT_ACT__REPRESENTATION:
				getRepresentation().clear();
				return;
			case IoPackage.INPUT_ACT__HYPOTHESES:
				getHypotheses().clear();
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
			case IoPackage.INPUT_ACT__INITIATOR:
				return INITIATOR_EDEFAULT == null ? initiator != null : !INITIATOR_EDEFAULT.equals(initiator);
			case IoPackage.INPUT_ACT__ADDRESSEE:
				return addressee != null && !addressee.isEmpty();
			case IoPackage.INPUT_ACT__PASSED_FADE:
				return passedFade != PASSED_FADE_EDEFAULT;
			case IoPackage.INPUT_ACT__BINDING:
				return BINDING_EDEFAULT == null ? binding != null : !BINDING_EDEFAULT.equals(binding);
			case IoPackage.INPUT_ACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IoPackage.INPUT_ACT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IoPackage.INPUT_ACT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IoPackage.INPUT_ACT__SESSION:
				return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
			case IoPackage.INPUT_ACT__REPRESENTATION:
				return representation != null && !representation.isEmpty();
			case IoPackage.INPUT_ACT__HYPOTHESES:
				return hypotheses != null && !hypotheses.isEmpty();
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
				case IoPackage.INPUT_ACT__BINDING: return BasePackage.BOBJECT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Message.class) {
			switch (derivedFeatureID) {
				case IoPackage.INPUT_ACT__DESCRIPTION: return IoPackage.MESSAGE__DESCRIPTION;
				case IoPackage.INPUT_ACT__ID: return IoPackage.MESSAGE__ID;
				case IoPackage.INPUT_ACT__TIMESTAMP: return IoPackage.MESSAGE__TIMESTAMP;
				case IoPackage.INPUT_ACT__SESSION: return IoPackage.MESSAGE__SESSION;
				default: return -1;
			}
		}
		if (baseClass == InputMessage.class) {
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
				case BasePackage.BOBJECT__BINDING: return IoPackage.INPUT_ACT__BINDING;
				default: return -1;
			}
		}
		if (baseClass == Message.class) {
			switch (baseFeatureID) {
				case IoPackage.MESSAGE__DESCRIPTION: return IoPackage.INPUT_ACT__DESCRIPTION;
				case IoPackage.MESSAGE__ID: return IoPackage.INPUT_ACT__ID;
				case IoPackage.MESSAGE__TIMESTAMP: return IoPackage.INPUT_ACT__TIMESTAMP;
				case IoPackage.MESSAGE__SESSION: return IoPackage.INPUT_ACT__SESSION;
				default: return -1;
			}
		}
		if (baseClass == InputMessage.class) {
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
		result.append(" (initiator: ");
		result.append(initiator);
		result.append(", addressee: ");
		result.append(addressee);
		result.append(", passedFade: ");
		result.append(passedFade);
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

} //InputActImpl
