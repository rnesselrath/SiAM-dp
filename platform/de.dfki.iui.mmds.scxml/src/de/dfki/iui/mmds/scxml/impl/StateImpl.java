/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.AbstractState;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.DatamodelContainer;
import de.dfki.iui.mmds.scxml.HistoryState;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.TransitionSource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>State</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateImpl#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateImpl#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateImpl#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends TransitionTargetImpl implements State {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleState> state;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected EList<ParallelState> parallel;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<CondEventTransition> transition;

	/**
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected Datamodel datamodel;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected HistoryState history;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<SimpleState>(SimpleState.class, this, ScxmlPackage.STATE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParallelState> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<ParallelState>(ParallelState.class, this, ScxmlPackage.STATE__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CondEventTransition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<CondEventTransition>(CondEventTransition.class, this, ScxmlPackage.STATE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datamodel getDatamodel() {
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatamodel(Datamodel newDatamodel, NotificationChain msgs) {
		Datamodel oldDatamodel = datamodel;
		datamodel = newDatamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__DATAMODEL, oldDatamodel, newDatamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatamodel(Datamodel newDatamodel) {
		if (newDatamodel != datamodel) {
			NotificationChain msgs = null;
			if (datamodel != null)
				msgs = ((InternalEObject)datamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__DATAMODEL, null, msgs);
			if (newDatamodel != null)
				msgs = ((InternalEObject)newDatamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__DATAMODEL, null, msgs);
			msgs = basicSetDatamodel(newDatamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__DATAMODEL, newDatamodel, newDatamodel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryState getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryState newHistory, NotificationChain msgs) {
		HistoryState oldHistory = history;
		history = newHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__HISTORY, oldHistory, newHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryState newHistory) {
		if (newHistory != history) {
			NotificationChain msgs = null;
			if (history != null)
				msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__HISTORY, null, msgs);
			if (newHistory != null)
				msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__HISTORY, null, msgs);
			msgs = basicSetHistory(newHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__HISTORY, newHistory, newHistory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAdapter(final Class adapter) {
		if (adapter == Data.class ) {
			return getDatamodel();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.STATE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__DATAMODEL:
				return basicSetDatamodel(null, msgs);
			case ScxmlPackage.STATE__HISTORY:
				return basicSetHistory(null, msgs);
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
			case ScxmlPackage.STATE__STATE:
				return getState();
			case ScxmlPackage.STATE__PARALLEL:
				return getParallel();
			case ScxmlPackage.STATE__TRANSITION:
				return getTransition();
			case ScxmlPackage.STATE__DATAMODEL:
				return getDatamodel();
			case ScxmlPackage.STATE__HISTORY:
				return getHistory();
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
			case ScxmlPackage.STATE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends SimpleState>)newValue);
				return;
			case ScxmlPackage.STATE__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends ParallelState>)newValue);
				return;
			case ScxmlPackage.STATE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends CondEventTransition>)newValue);
				return;
			case ScxmlPackage.STATE__DATAMODEL:
				setDatamodel((Datamodel)newValue);
				return;
			case ScxmlPackage.STATE__HISTORY:
				setHistory((HistoryState)newValue);
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
			case ScxmlPackage.STATE__STATE:
				getState().clear();
				return;
			case ScxmlPackage.STATE__PARALLEL:
				getParallel().clear();
				return;
			case ScxmlPackage.STATE__TRANSITION:
				getTransition().clear();
				return;
			case ScxmlPackage.STATE__DATAMODEL:
				setDatamodel((Datamodel)null);
				return;
			case ScxmlPackage.STATE__HISTORY:
				setHistory((HistoryState)null);
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
			case ScxmlPackage.STATE__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.STATE__PARALLEL:
				return parallel != null && !parallel.isEmpty();
			case ScxmlPackage.STATE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ScxmlPackage.STATE__DATAMODEL:
				return datamodel != null;
			case ScxmlPackage.STATE__HISTORY:
				return history != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractState.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE__STATE: return ScxmlPackage.ABSTRACT_STATE__STATE;
				case ScxmlPackage.STATE__PARALLEL: return ScxmlPackage.ABSTRACT_STATE__PARALLEL;
				default: return -1;
			}
		}
		if (baseClass == TransitionSource.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE__TRANSITION: return ScxmlPackage.TRANSITION_SOURCE__TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == DatamodelContainer.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE__DATAMODEL: return ScxmlPackage.DATAMODEL_CONTAINER__DATAMODEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractState.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.ABSTRACT_STATE__STATE: return ScxmlPackage.STATE__STATE;
				case ScxmlPackage.ABSTRACT_STATE__PARALLEL: return ScxmlPackage.STATE__PARALLEL;
				default: return -1;
			}
		}
		if (baseClass == TransitionSource.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.TRANSITION_SOURCE__TRANSITION: return ScxmlPackage.STATE__TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == DatamodelContainer.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.DATAMODEL_CONTAINER__DATAMODEL: return ScxmlPackage.STATE__DATAMODEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // StateImpl
