/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.AbstractState;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.SimpleState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.AbstractStateImpl#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.AbstractStateImpl#getParallel <em>Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends EObjectImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleState> state;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected EList<ParallelState> parallel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleState> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<SimpleState>(SimpleState.class, this, ScxmlPackage.ABSTRACT_STATE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParallelState> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<ParallelState>(ParallelState.class, this, ScxmlPackage.ABSTRACT_STATE__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.ABSTRACT_STATE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ABSTRACT_STATE__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.ABSTRACT_STATE__STATE:
				return getState();
			case ScxmlPackage.ABSTRACT_STATE__PARALLEL:
				return getParallel();
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
			case ScxmlPackage.ABSTRACT_STATE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends SimpleState>)newValue);
				return;
			case ScxmlPackage.ABSTRACT_STATE__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends ParallelState>)newValue);
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
			case ScxmlPackage.ABSTRACT_STATE__STATE:
				getState().clear();
				return;
			case ScxmlPackage.ABSTRACT_STATE__PARALLEL:
				getParallel().clear();
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
			case ScxmlPackage.ABSTRACT_STATE__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.ABSTRACT_STATE__PARALLEL:
				return parallel != null && !parallel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateImpl
