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
import de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Cond Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceCondEventImpl#getInstanceMatchCondition <em>Instance Match Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceCondEventImpl extends CondEventImpl implements InstanceCondEvent {
	/**
	 * The cached value of the '{@link #getInstanceMatchCondition() <em>Instance Match Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceMatchCondition()
	 * @generated
	 * @ordered
	 */
	protected InstanceMatchCondition instanceMatchCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceCondEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.INSTANCE_COND_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceMatchCondition getInstanceMatchCondition() {
		return instanceMatchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceMatchCondition(InstanceMatchCondition newInstanceMatchCondition, NotificationChain msgs) {
		InstanceMatchCondition oldInstanceMatchCondition = instanceMatchCondition;
		instanceMatchCondition = newInstanceMatchCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION, oldInstanceMatchCondition, newInstanceMatchCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceMatchCondition(InstanceMatchCondition newInstanceMatchCondition) {
		if (newInstanceMatchCondition != instanceMatchCondition) {
			NotificationChain msgs = null;
			if (instanceMatchCondition != null)
				msgs = ((InternalEObject)instanceMatchCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION, null, msgs);
			if (newInstanceMatchCondition != null)
				msgs = ((InternalEObject)newInstanceMatchCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION, null, msgs);
			msgs = basicSetInstanceMatchCondition(newInstanceMatchCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION, newInstanceMatchCondition, newInstanceMatchCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION:
				return basicSetInstanceMatchCondition(null, msgs);
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
			case DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION:
				return getInstanceMatchCondition();
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
			case DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION:
				setInstanceMatchCondition((InstanceMatchCondition)newValue);
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
			case DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION:
				setInstanceMatchCondition((InstanceMatchCondition)null);
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
			case DialoguePackage.INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION:
				return instanceMatchCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceCondEventImpl
