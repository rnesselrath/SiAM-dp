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

import de.dfki.iui.mmds.core.model.task.THistoryEntry;
import de.dfki.iui.mmds.core.model.task.TaskPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THistory Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl#isSystemAction <em>System Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class THistoryEntryImpl extends MinimalEObjectImpl.Container implements THistoryEntry {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected THistoryEntry predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected THistoryEntry successor;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> data;

	/**
	 * The default value of the '{@link #isSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYSTEM_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemAction()
	 * @generated
	 * @ordered
	 */
	protected boolean systemAction = SYSTEM_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected THistoryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.THISTORY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.THISTORY_ENTRY__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THistoryEntry getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (THistoryEntry)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.THISTORY_ENTRY__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THistoryEntry basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(THistoryEntry newPredecessor) {
		THistoryEntry oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.THISTORY_ENTRY__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THistoryEntry getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (THistoryEntry)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.THISTORY_ENTRY__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THistoryEntry basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(THistoryEntry newSuccessor) {
		THistoryEntry oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.THISTORY_ENTRY__SUCCESSOR, oldSuccessor, successor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<EObject>(EObject.class, this, TaskPackage.THISTORY_ENTRY__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSystemAction() {
		return systemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemAction(boolean newSystemAction) {
		boolean oldSystemAction = systemAction;
		systemAction = newSystemAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.THISTORY_ENTRY__SYSTEM_ACTION, oldSystemAction, systemAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.THISTORY_ENTRY__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.THISTORY_ENTRY__TIME:
				return getTime();
			case TaskPackage.THISTORY_ENTRY__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case TaskPackage.THISTORY_ENTRY__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
			case TaskPackage.THISTORY_ENTRY__DATA:
				return getData();
			case TaskPackage.THISTORY_ENTRY__SYSTEM_ACTION:
				return isSystemAction();
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
			case TaskPackage.THISTORY_ENTRY__TIME:
				setTime((Long)newValue);
				return;
			case TaskPackage.THISTORY_ENTRY__PREDECESSOR:
				setPredecessor((THistoryEntry)newValue);
				return;
			case TaskPackage.THISTORY_ENTRY__SUCCESSOR:
				setSuccessor((THistoryEntry)newValue);
				return;
			case TaskPackage.THISTORY_ENTRY__DATA:
				getData().clear();
				getData().addAll((Collection<? extends EObject>)newValue);
				return;
			case TaskPackage.THISTORY_ENTRY__SYSTEM_ACTION:
				setSystemAction((Boolean)newValue);
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
			case TaskPackage.THISTORY_ENTRY__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TaskPackage.THISTORY_ENTRY__PREDECESSOR:
				setPredecessor((THistoryEntry)null);
				return;
			case TaskPackage.THISTORY_ENTRY__SUCCESSOR:
				setSuccessor((THistoryEntry)null);
				return;
			case TaskPackage.THISTORY_ENTRY__DATA:
				getData().clear();
				return;
			case TaskPackage.THISTORY_ENTRY__SYSTEM_ACTION:
				setSystemAction(SYSTEM_ACTION_EDEFAULT);
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
			case TaskPackage.THISTORY_ENTRY__TIME:
				return time != TIME_EDEFAULT;
			case TaskPackage.THISTORY_ENTRY__PREDECESSOR:
				return predecessor != null;
			case TaskPackage.THISTORY_ENTRY__SUCCESSOR:
				return successor != null;
			case TaskPackage.THISTORY_ENTRY__DATA:
				return data != null && !data.isEmpty();
			case TaskPackage.THISTORY_ENTRY__SYSTEM_ACTION:
				return systemAction != SYSTEM_ACTION_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", systemAction: ");
		result.append(systemAction);
		result.append(')');
		return result.toString();
	}

} //THistoryEntryImpl
