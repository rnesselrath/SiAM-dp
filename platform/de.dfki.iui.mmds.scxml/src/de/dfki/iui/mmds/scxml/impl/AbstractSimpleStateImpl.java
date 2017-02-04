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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.AbstractSimpleState;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.InitialState;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.TransitionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Simple State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl#getInitial1 <em>Initial1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSimpleStateImpl extends EObjectImpl implements AbstractSimpleState {
	/**
	 * The cached value of the '{@link #getInitial1() <em>Initial1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial1()
	 * @generated
	 * @ordered
	 */
	protected TransitionTarget initial1;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected InitialState initial;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalState> final_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSimpleStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.ABSTRACT_SIMPLE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTarget getInitial1() {
		return initial1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial1(TransitionTarget newInitial1) {
		TransitionTarget oldInitial1 = initial1;
		initial1 = newInitial1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1, oldInitial1, initial1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(InitialState newInitial, NotificationChain msgs) {
		InitialState oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(InitialState newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalState> getFinal() {
		if (final_ == null) {
			final_ = new EObjectContainmentEList<FinalState>(FinalState.class, this, ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL:
				return basicSetInitial(null, msgs);
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL:
				return ((InternalEList<?>)getFinal()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1:
				return getInitial1();
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL:
				return getInitial();
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL:
				return getFinal();
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
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1:
				setInitial1((TransitionTarget)newValue);
				return;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL:
				setInitial((InitialState)newValue);
				return;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends FinalState>)newValue);
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
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1:
				setInitial1((TransitionTarget)null);
				return;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL:
				setInitial((InitialState)null);
				return;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL:
				getFinal().clear();
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
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1:
				return initial1 != null;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL:
				return initial != null;
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL:
				return final_ != null && !final_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractSimpleStateImpl
