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

import de.dfki.iui.mmds.core.model.dialogue.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.ParallelState;

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
 * An implementation of the model object '<em><b>Parallel State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl#getHistoryState <em>History State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelStateImpl extends StateImpl implements ParallelState {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractState> states;

	/**
	 * The cached value of the '{@link #getHistoryState() <em>History State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryState()
	 * @generated
	 * @ordered
	 */
	protected HistoryState historyState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.PARALLEL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, DialoguePackage.PARALLEL_STATE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryState getHistoryState() {
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryState(HistoryState newHistoryState, NotificationChain msgs) {
		HistoryState oldHistoryState = historyState;
		historyState = newHistoryState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.PARALLEL_STATE__HISTORY_STATE, oldHistoryState, newHistoryState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryState(HistoryState newHistoryState) {
		if (newHistoryState != historyState) {
			NotificationChain msgs = null;
			if (historyState != null)
				msgs = ((InternalEObject)historyState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.PARALLEL_STATE__HISTORY_STATE, null, msgs);
			if (newHistoryState != null)
				msgs = ((InternalEObject)newHistoryState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.PARALLEL_STATE__HISTORY_STATE, null, msgs);
			msgs = basicSetHistoryState(newHistoryState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.PARALLEL_STATE__HISTORY_STATE, newHistoryState, newHistoryState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.PARALLEL_STATE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DialoguePackage.PARALLEL_STATE__HISTORY_STATE:
				return basicSetHistoryState(null, msgs);
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
			case DialoguePackage.PARALLEL_STATE__STATES:
				return getStates();
			case DialoguePackage.PARALLEL_STATE__HISTORY_STATE:
				return getHistoryState();
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
			case DialoguePackage.PARALLEL_STATE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case DialoguePackage.PARALLEL_STATE__HISTORY_STATE:
				setHistoryState((HistoryState)newValue);
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
			case DialoguePackage.PARALLEL_STATE__STATES:
				getStates().clear();
				return;
			case DialoguePackage.PARALLEL_STATE__HISTORY_STATE:
				setHistoryState((HistoryState)null);
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
			case DialoguePackage.PARALLEL_STATE__STATES:
				return states != null && !states.isEmpty();
			case DialoguePackage.PARALLEL_STATE__HISTORY_STATE:
				return historyState != null;
		}
		return super.eIsSet(featureID);
	}

} //ParallelStateImpl
