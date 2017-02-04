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
package de.dfki.iui.mmds.core.model.references.impl;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;

import de.dfki.iui.mmds.core.model.pattern.PObject;

import de.dfki.iui.mmds.core.model.references.CollectionReference;
import de.dfki.iui.mmds.core.model.references.LingInfo;
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl#getReferencePattern <em>Reference Pattern</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl#getHasMorphoSyntacticDecomposition <em>Has Morpho Syntactic Decomposition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionReferenceImpl extends MinimalEObjectImpl.Container implements CollectionReference {
	/**
	 * The cached value of the '{@link #getReferencePattern() <em>Reference Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePattern()
	 * @generated
	 * @ordered
	 */
	protected PObject referencePattern;

	/**
	 * The cached value of the '{@link #getHasMorphoSyntacticDecomposition() <em>Has Morpho Syntactic Decomposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMorphoSyntacticDecomposition()
	 * @generated
	 * @ordered
	 */
	protected LingInfo hasMorphoSyntacticDecomposition;

	/**
	 * The default value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected boolean isMany = IS_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BInteger position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BString ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BString order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.COLLECTION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PObject getReferencePattern() {
		return referencePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePattern(PObject newReferencePattern, NotificationChain msgs) {
		PObject oldReferencePattern = referencePattern;
		referencePattern = newReferencePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN, oldReferencePattern, newReferencePattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePattern(PObject newReferencePattern) {
		if (newReferencePattern != referencePattern) {
			NotificationChain msgs = null;
			if (referencePattern != null)
				msgs = ((InternalEObject)referencePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN, null, msgs);
			if (newReferencePattern != null)
				msgs = ((InternalEObject)newReferencePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN, null, msgs);
			msgs = basicSetReferencePattern(newReferencePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN, newReferencePattern, newReferencePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LingInfo getHasMorphoSyntacticDecomposition() {
		return hasMorphoSyntacticDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMorphoSyntacticDecomposition(LingInfo newHasMorphoSyntacticDecomposition, NotificationChain msgs) {
		LingInfo oldHasMorphoSyntacticDecomposition = hasMorphoSyntacticDecomposition;
		hasMorphoSyntacticDecomposition = newHasMorphoSyntacticDecomposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION, oldHasMorphoSyntacticDecomposition, newHasMorphoSyntacticDecomposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMorphoSyntacticDecomposition(LingInfo newHasMorphoSyntacticDecomposition) {
		if (newHasMorphoSyntacticDecomposition != hasMorphoSyntacticDecomposition) {
			NotificationChain msgs = null;
			if (hasMorphoSyntacticDecomposition != null)
				msgs = ((InternalEObject)hasMorphoSyntacticDecomposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION, null, msgs);
			if (newHasMorphoSyntacticDecomposition != null)
				msgs = ((InternalEObject)newHasMorphoSyntacticDecomposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION, null, msgs);
			msgs = basicSetHasMorphoSyntacticDecomposition(newHasMorphoSyntacticDecomposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION, newHasMorphoSyntacticDecomposition, newHasMorphoSyntacticDecomposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMany() {
		return isMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMany(boolean newIsMany) {
		boolean oldIsMany = isMany;
		isMany = newIsMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__IS_MANY, oldIsMany, isMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BInteger newPosition) {
		BInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(BString newOrder) {
		BString oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.COLLECTION_REFERENCE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN:
				return basicSetReferencePattern(null, msgs);
			case ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION:
				return basicSetHasMorphoSyntacticDecomposition(null, msgs);
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
			case ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN:
				return getReferencePattern();
			case ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION:
				return getHasMorphoSyntacticDecomposition();
			case ReferencesPackage.COLLECTION_REFERENCE__IS_MANY:
				return isIsMany();
			case ReferencesPackage.COLLECTION_REFERENCE__POSITION:
				return getPosition();
			case ReferencesPackage.COLLECTION_REFERENCE__ORDER:
				return getOrder();
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
			case ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN:
				setReferencePattern((PObject)newValue);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION:
				setHasMorphoSyntacticDecomposition((LingInfo)newValue);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__IS_MANY:
				setIsMany((Boolean)newValue);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__POSITION:
				setPosition((BInteger)newValue);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__ORDER:
				setOrder((BString)newValue);
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
			case ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN:
				setReferencePattern((PObject)null);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION:
				setHasMorphoSyntacticDecomposition((LingInfo)null);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__IS_MANY:
				setIsMany(IS_MANY_EDEFAULT);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ReferencesPackage.COLLECTION_REFERENCE__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case ReferencesPackage.COLLECTION_REFERENCE__REFERENCE_PATTERN:
				return referencePattern != null;
			case ReferencesPackage.COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION:
				return hasMorphoSyntacticDecomposition != null;
			case ReferencesPackage.COLLECTION_REFERENCE__IS_MANY:
				return isMany != IS_MANY_EDEFAULT;
			case ReferencesPackage.COLLECTION_REFERENCE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case ReferencesPackage.COLLECTION_REFERENCE__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
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
		result.append(" (isMany: ");
		result.append(isMany);
		result.append(", position: ");
		result.append(position);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //CollectionReferenceImpl
