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

import de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.State;
import de.dfki.iui.mmds.core.model.dialogue.StateChart;

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
 * An implementation of the model object '<em><b>State Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl#getOnEntry <em>On Entry</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl#getOnExit <em>On Exit</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl#getHistoryState <em>History State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateChartImpl extends NodeImpl implements StateChart {
	/**
	 * The cached value of the '{@link #getOnEntry() <em>On Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableContent> onEntry;

	/**
	 * The cached value of the '{@link #getOnExit() <em>On Exit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExit()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableContent> onExit;

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
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.STATE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableContent> getOnEntry() {
		if (onEntry == null) {
			onEntry = new EObjectContainmentEList<ExecutableContent>(ExecutableContent.class, this, DialoguePackage.STATE_CHART__ON_ENTRY);
		}
		return onEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableContent> getOnExit() {
		if (onExit == null) {
			onExit = new EObjectContainmentEList<ExecutableContent>(ExecutableContent.class, this, DialoguePackage.STATE_CHART__ON_EXIT);
		}
		return onExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, DialoguePackage.STATE_CHART__STATES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.STATE_CHART__HISTORY_STATE, oldHistoryState, newHistoryState);
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
				msgs = ((InternalEObject)historyState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.STATE_CHART__HISTORY_STATE, null, msgs);
			if (newHistoryState != null)
				msgs = ((InternalEObject)newHistoryState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.STATE_CHART__HISTORY_STATE, null, msgs);
			msgs = basicSetHistoryState(newHistoryState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.STATE_CHART__HISTORY_STATE, newHistoryState, newHistoryState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DialoguePackage.STATE_CHART__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.STATE_CHART__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.STATE_CHART__ON_ENTRY:
				return ((InternalEList<?>)getOnEntry()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE_CHART__ON_EXIT:
				return ((InternalEList<?>)getOnExit()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE_CHART__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE_CHART__HISTORY_STATE:
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
			case DialoguePackage.STATE_CHART__ON_ENTRY:
				return getOnEntry();
			case DialoguePackage.STATE_CHART__ON_EXIT:
				return getOnExit();
			case DialoguePackage.STATE_CHART__STATES:
				return getStates();
			case DialoguePackage.STATE_CHART__HISTORY_STATE:
				return getHistoryState();
			case DialoguePackage.STATE_CHART__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
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
			case DialoguePackage.STATE_CHART__ON_ENTRY:
				getOnEntry().clear();
				getOnEntry().addAll((Collection<? extends ExecutableContent>)newValue);
				return;
			case DialoguePackage.STATE_CHART__ON_EXIT:
				getOnExit().clear();
				getOnExit().addAll((Collection<? extends ExecutableContent>)newValue);
				return;
			case DialoguePackage.STATE_CHART__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case DialoguePackage.STATE_CHART__HISTORY_STATE:
				setHistoryState((HistoryState)newValue);
				return;
			case DialoguePackage.STATE_CHART__INITIAL_STATE:
				setInitialState((State)newValue);
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
			case DialoguePackage.STATE_CHART__ON_ENTRY:
				getOnEntry().clear();
				return;
			case DialoguePackage.STATE_CHART__ON_EXIT:
				getOnExit().clear();
				return;
			case DialoguePackage.STATE_CHART__STATES:
				getStates().clear();
				return;
			case DialoguePackage.STATE_CHART__HISTORY_STATE:
				setHistoryState((HistoryState)null);
				return;
			case DialoguePackage.STATE_CHART__INITIAL_STATE:
				setInitialState((State)null);
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
			case DialoguePackage.STATE_CHART__ON_ENTRY:
				return onEntry != null && !onEntry.isEmpty();
			case DialoguePackage.STATE_CHART__ON_EXIT:
				return onExit != null && !onExit.isEmpty();
			case DialoguePackage.STATE_CHART__STATES:
				return states != null && !states.isEmpty();
			case DialoguePackage.STATE_CHART__HISTORY_STATE:
				return historyState != null;
			case DialoguePackage.STATE_CHART__INITIAL_STATE:
				return initialState != null;
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
		if (baseClass == State.class) {
			switch (derivedFeatureID) {
				case DialoguePackage.STATE_CHART__ON_ENTRY: return DialoguePackage.STATE__ON_ENTRY;
				case DialoguePackage.STATE_CHART__ON_EXIT: return DialoguePackage.STATE__ON_EXIT;
				default: return -1;
			}
		}
		if (baseClass == AbstractCompositeState.class) {
			switch (derivedFeatureID) {
				case DialoguePackage.STATE_CHART__STATES: return DialoguePackage.ABSTRACT_COMPOSITE_STATE__STATES;
				case DialoguePackage.STATE_CHART__HISTORY_STATE: return DialoguePackage.ABSTRACT_COMPOSITE_STATE__HISTORY_STATE;
				default: return -1;
			}
		}
		if (baseClass == CompositeState.class) {
			switch (derivedFeatureID) {
				case DialoguePackage.STATE_CHART__INITIAL_STATE: return DialoguePackage.COMPOSITE_STATE__INITIAL_STATE;
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
		if (baseClass == State.class) {
			switch (baseFeatureID) {
				case DialoguePackage.STATE__ON_ENTRY: return DialoguePackage.STATE_CHART__ON_ENTRY;
				case DialoguePackage.STATE__ON_EXIT: return DialoguePackage.STATE_CHART__ON_EXIT;
				default: return -1;
			}
		}
		if (baseClass == AbstractCompositeState.class) {
			switch (baseFeatureID) {
				case DialoguePackage.ABSTRACT_COMPOSITE_STATE__STATES: return DialoguePackage.STATE_CHART__STATES;
				case DialoguePackage.ABSTRACT_COMPOSITE_STATE__HISTORY_STATE: return DialoguePackage.STATE_CHART__HISTORY_STATE;
				default: return -1;
			}
		}
		if (baseClass == CompositeState.class) {
			switch (baseFeatureID) {
				case DialoguePackage.COMPOSITE_STATE__INITIAL_STATE: return DialoguePackage.STATE_CHART__INITIAL_STATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateChartImpl
