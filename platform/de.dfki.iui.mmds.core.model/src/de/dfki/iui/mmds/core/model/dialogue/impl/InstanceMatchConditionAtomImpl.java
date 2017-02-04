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
package de.dfki.iui.mmds.core.model.dialogue.impl;

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom;

import de.dfki.iui.mmds.core.model.pattern.PPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Match Condition Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl#getInstanceExpr <em>Instance Expr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceMatchConditionAtomImpl extends InstanceMatchConditionImpl implements InstanceMatchConditionAtom {
	/**
	 * The default value of the '{@link #getInstanceExpr() <em>Instance Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceExpr() <em>Instance Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceExpr()
	 * @generated
	 * @ordered
	 */
	protected String instanceExpr = INSTANCE_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject instance;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected PPattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceMatchConditionAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceExpr() {
		return instanceExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceExpr(String newInstanceExpr) {
		String oldInstanceExpr = instanceExpr;
		instanceExpr = newInstanceExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR, oldInstanceExpr, instanceExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(EObject newInstance, NotificationChain msgs) {
		EObject oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(EObject newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PPattern newPattern, NotificationChain msgs) {
		PPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
				return basicSetInstance(null, msgs);
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
				return basicSetPattern(null, msgs);
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR:
				return getInstanceExpr();
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
				return getInstance();
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
				return getPattern();
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR:
				setInstanceExpr((String)newValue);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
				setInstance((EObject)newValue);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
				setPattern((PPattern)newValue);
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR:
				setInstanceExpr(INSTANCE_EXPR_EDEFAULT);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
				setInstance((EObject)null);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
				setPattern((PPattern)null);
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR:
				return INSTANCE_EXPR_EDEFAULT == null ? instanceExpr != null : !INSTANCE_EXPR_EDEFAULT.equals(instanceExpr);
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
				return instance != null;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
				return pattern != null;
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
		result.append(" (instanceExpr: ");
		result.append(instanceExpr);
		result.append(')');
		return result.toString();
	}

} //InstanceMatchConditionAtomImpl
