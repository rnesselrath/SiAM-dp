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

import de.dfki.iui.mmds.core.model.base.Person;
import de.dfki.iui.mmds.core.model.task.TAction;
import de.dfki.iui.mmds.core.model.task.TCondition;
import de.dfki.iui.mmds.core.model.task.TTask;
import de.dfki.iui.mmds.core.model.task.TaskPackage;
import de.dfki.iui.mmds.core.model.task.TaskState;

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
 * An implementation of the model object '<em><b>TTask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTaskImpl extends TMetaDataImpl implements TTask {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskState STATE_EDEFAULT = TaskState.INACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected TaskState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<TCondition> precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<TCondition> postcondition;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<TTask> successor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected TAction action;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TTASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TTASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TaskState newState) {
		TaskState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TTASK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<TCondition>(TCondition.class, this, TaskPackage.TTASK__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCondition> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList<TCondition>(TCondition.class, this, TaskPackage.TTASK__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TTask> getSuccessor() {
		if (successor == null) {
			successor = new EObjectResolvingEList<TTask>(TTask.class, this, TaskPackage.TTASK__SUCCESSOR);
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(TAction newAction, NotificationChain msgs) {
		TAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TTASK__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(TAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TTASK__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TTASK__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TTASK__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getActor() {
		if (actor == null) {
			actor = new EObjectResolvingEList<Person>(Person.class, this, TaskPackage.TTASK__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TTASK__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case TaskPackage.TTASK__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
			case TaskPackage.TTASK__ACTION:
				return basicSetAction(null, msgs);
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
			case TaskPackage.TTASK__ID:
				return getId();
			case TaskPackage.TTASK__STATE:
				return getState();
			case TaskPackage.TTASK__PRECONDITION:
				return getPrecondition();
			case TaskPackage.TTASK__POSTCONDITION:
				return getPostcondition();
			case TaskPackage.TTASK__SUCCESSOR:
				return getSuccessor();
			case TaskPackage.TTASK__ACTION:
				return getAction();
			case TaskPackage.TTASK__ACTOR:
				return getActor();
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
			case TaskPackage.TTASK__ID:
				setId((String)newValue);
				return;
			case TaskPackage.TTASK__STATE:
				setState((TaskState)newValue);
				return;
			case TaskPackage.TTASK__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends TCondition>)newValue);
				return;
			case TaskPackage.TTASK__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends TCondition>)newValue);
				return;
			case TaskPackage.TTASK__SUCCESSOR:
				getSuccessor().clear();
				getSuccessor().addAll((Collection<? extends TTask>)newValue);
				return;
			case TaskPackage.TTASK__ACTION:
				setAction((TAction)newValue);
				return;
			case TaskPackage.TTASK__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Person>)newValue);
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
			case TaskPackage.TTASK__ID:
				setId(ID_EDEFAULT);
				return;
			case TaskPackage.TTASK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case TaskPackage.TTASK__PRECONDITION:
				getPrecondition().clear();
				return;
			case TaskPackage.TTASK__POSTCONDITION:
				getPostcondition().clear();
				return;
			case TaskPackage.TTASK__SUCCESSOR:
				getSuccessor().clear();
				return;
			case TaskPackage.TTASK__ACTION:
				setAction((TAction)null);
				return;
			case TaskPackage.TTASK__ACTOR:
				getActor().clear();
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
			case TaskPackage.TTASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TaskPackage.TTASK__STATE:
				return state != STATE_EDEFAULT;
			case TaskPackage.TTASK__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case TaskPackage.TTASK__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case TaskPackage.TTASK__SUCCESSOR:
				return successor != null && !successor.isEmpty();
			case TaskPackage.TTASK__ACTION:
				return action != null;
			case TaskPackage.TTASK__ACTOR:
				return actor != null && !actor.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //TTaskImpl
