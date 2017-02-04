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

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;

import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.UpdateGrammar;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl#getGrammarID <em>Grammar ID</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateGrammarImpl extends BObjectImpl implements UpdateGrammar {
	/**
	 * The default value of the '{@link #getGrammarID() <em>Grammar ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarID()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAMMAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrammarID() <em>Grammar ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarID()
	 * @generated
	 * @ordered
	 */
	protected String grammarID = GRAMMAR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected DocumentRoot grammar;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateGrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.UPDATE_GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrammarID() {
		return grammarID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammarID(String newGrammarID) {
		String oldGrammarID = grammarID;
		grammarID = newGrammarID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_GRAMMAR__GRAMMAR_ID, oldGrammarID, grammarID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot getGrammar() {
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrammar(DocumentRoot newGrammar, NotificationChain msgs) {
		DocumentRoot oldGrammar = grammar;
		grammar = newGrammar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_GRAMMAR__GRAMMAR, oldGrammar, newGrammar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammar(DocumentRoot newGrammar) {
		if (newGrammar != grammar) {
			NotificationChain msgs = null;
			if (grammar != null)
				msgs = ((InternalEObject)grammar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoPackage.UPDATE_GRAMMAR__GRAMMAR, null, msgs);
			if (newGrammar != null)
				msgs = ((InternalEObject)newGrammar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoPackage.UPDATE_GRAMMAR__GRAMMAR, null, msgs);
			msgs = basicSetGrammar(newGrammar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_GRAMMAR__GRAMMAR, newGrammar, newGrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.UPDATE_GRAMMAR__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR:
				return basicSetGrammar(null, msgs);
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
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR_ID:
				return getGrammarID();
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR:
				return getGrammar();
			case IoPackage.UPDATE_GRAMMAR__ACTIVE:
				return isActive();
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
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR_ID:
				setGrammarID((String)newValue);
				return;
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR:
				setGrammar((DocumentRoot)newValue);
				return;
			case IoPackage.UPDATE_GRAMMAR__ACTIVE:
				setActive((Boolean)newValue);
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
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR_ID:
				setGrammarID(GRAMMAR_ID_EDEFAULT);
				return;
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR:
				setGrammar((DocumentRoot)null);
				return;
			case IoPackage.UPDATE_GRAMMAR__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR_ID:
				return GRAMMAR_ID_EDEFAULT == null ? grammarID != null : !GRAMMAR_ID_EDEFAULT.equals(grammarID);
			case IoPackage.UPDATE_GRAMMAR__GRAMMAR:
				return grammar != null;
			case IoPackage.UPDATE_GRAMMAR__ACTIVE:
				return active != ACTIVE_EDEFAULT;
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
		result.append(" (grammarID: ");
		result.append(grammarID);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //UpdateGrammarImpl
