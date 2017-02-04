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
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchCondition;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula;

import de.dfki.iui.mmds.core.model.pattern.PRestrictionsEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Match Condition Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceMatchConditionFormulaImpl extends InstanceMatchConditionImpl implements InstanceMatchConditionFormula {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final PRestrictionsEnum OPERATOR_EDEFAULT = PRestrictionsEnum.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected PRestrictionsEnum operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceMatchCondition> cond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceMatchConditionFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRestrictionsEnum getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(PRestrictionsEnum newOperator) {
		PRestrictionsEnum oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceMatchCondition> getCond() {
		if (cond == null) {
			cond = new EObjectContainmentEList<InstanceMatchCondition>(InstanceMatchCondition.class, this, DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND);
		}
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND:
				return ((InternalEList<?>)getCond()).basicRemove(otherEnd, msgs);
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR:
				return getOperator();
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND:
				return getCond();
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR:
				setOperator((PRestrictionsEnum)newValue);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND:
				getCond().clear();
				getCond().addAll((Collection<? extends InstanceMatchCondition>)newValue);
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND:
				getCond().clear();
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
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA__COND:
				return cond != null && !cond.isEmpty();
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //InstanceMatchConditionFormulaImpl
