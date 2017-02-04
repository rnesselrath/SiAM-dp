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
package de.dfki.iui.mmds.core.model.io.communicative_functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.references.ReferenceModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Semantic Content</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl#getResolved <em>Resolved</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticContentImpl extends BObjectImpl implements SemanticContent {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Entity content;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceModel reference;

	/**
	 * The default value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected static final ResolveState RESOLVED_EDEFAULT = ResolveState.UNDEFINED;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected ResolveState resolved = RESOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BString ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BString id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final long VALIDITY_EDEFAULT = -1L;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected long validity = VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Communicative_functionsPackage.Literals.SEMANTIC_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Entity newContent, NotificationChain msgs) {
		Entity oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(Entity newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceModel getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceModel newReference, NotificationChain msgs) {
		ReferenceModel oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceModel newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolveState getResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolved(ResolveState newResolved) {
		ResolveState oldResolved = resolved;
		resolved = newResolved == null ? RESOLVED_EDEFAULT : newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BString newId) {
		BString oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidity(long newValidity) {
		long oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
				return basicSetContent(null, msgs);
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
				return basicSetReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
				return getContent();
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
				return getReference();
			case Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED:
				return getResolved();
			case Communicative_functionsPackage.SEMANTIC_CONTENT__ID:
				return getId();
			case Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY:
				return getValidity();
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
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
				setContent((Entity)newValue);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
				setReference((ReferenceModel)newValue);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED:
				setResolved((ResolveState)newValue);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__ID:
				setId((BString)newValue);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY:
				setValidity((Long)newValue);
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
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
				setContent((Entity)null);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
				setReference((ReferenceModel)null);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__ID:
				setId(ID_EDEFAULT);
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
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
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
				return content != null;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
				return reference != null;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY:
				return validity != VALIDITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resolved: ");
		result.append(resolved);
		result.append(", id: ");
		result.append(id);
		result.append(", validity: ");
		result.append(validity);
		result.append(')');
		return result.toString();
	}

} // SemanticContentImpl
