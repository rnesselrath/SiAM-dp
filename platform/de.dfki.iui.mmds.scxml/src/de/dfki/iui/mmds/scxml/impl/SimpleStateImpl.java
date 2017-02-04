/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.AbstractSimpleState;
import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.InitialState;
import de.dfki.iui.mmds.scxml.Invoke;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.TransitionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl#getInitial1 <em>Initial1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl#getInvoke <em>Invoke</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleStateImpl extends StateImpl implements SimpleState {
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
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected Invoke invoke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SIMPLE_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SIMPLE_STATE__INITIAL1, oldInitial1, initial1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.SIMPLE_STATE__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SIMPLE_STATE__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SIMPLE_STATE__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SIMPLE_STATE__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalState> getFinal() {
		if (final_ == null) {
			final_ = new EObjectContainmentEList<FinalState>(FinalState.class, this, ScxmlPackage.SIMPLE_STATE__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke getInvoke() {
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoke(Invoke newInvoke, NotificationChain msgs) {
		Invoke oldInvoke = invoke;
		invoke = newInvoke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.SIMPLE_STATE__INVOKE, oldInvoke, newInvoke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(Invoke newInvoke) {
		if (newInvoke != invoke) {
			NotificationChain msgs = null;
			if (invoke != null)
				msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SIMPLE_STATE__INVOKE, null, msgs);
			if (newInvoke != null)
				msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SIMPLE_STATE__INVOKE, null, msgs);
			msgs = basicSetInvoke(newInvoke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SIMPLE_STATE__INVOKE, newInvoke, newInvoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getAdapter(Class adapter) {
		if (adapter == Data.class ) {
			return getDatamodel();
		} else if (adapter == Description.class ) {
			return getDescription();
		} else if ( adapter == String.class ) {
			Map< String, EObject > result = new HashMap< String, EObject >();
			result.put( AdapterToken.DATAMODEL.getLiteral(), getDatamodel() );
			result.put( AdapterToken.DESCRIPTION.getLiteral(), getDescription() );
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.SIMPLE_STATE__INITIAL:
				return basicSetInitial(null, msgs);
			case ScxmlPackage.SIMPLE_STATE__FINAL:
				return ((InternalEList<?>)getFinal()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SIMPLE_STATE__INVOKE:
				return basicSetInvoke(null, msgs);
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
			case ScxmlPackage.SIMPLE_STATE__INITIAL1:
				return getInitial1();
			case ScxmlPackage.SIMPLE_STATE__INITIAL:
				return getInitial();
			case ScxmlPackage.SIMPLE_STATE__FINAL:
				return getFinal();
			case ScxmlPackage.SIMPLE_STATE__INVOKE:
				return getInvoke();
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
			case ScxmlPackage.SIMPLE_STATE__INITIAL1:
				setInitial1((TransitionTarget)newValue);
				return;
			case ScxmlPackage.SIMPLE_STATE__INITIAL:
				setInitial((InitialState)newValue);
				return;
			case ScxmlPackage.SIMPLE_STATE__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends FinalState>)newValue);
				return;
			case ScxmlPackage.SIMPLE_STATE__INVOKE:
				setInvoke((Invoke)newValue);
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
			case ScxmlPackage.SIMPLE_STATE__INITIAL1:
				setInitial1((TransitionTarget)null);
				return;
			case ScxmlPackage.SIMPLE_STATE__INITIAL:
				setInitial((InitialState)null);
				return;
			case ScxmlPackage.SIMPLE_STATE__FINAL:
				getFinal().clear();
				return;
			case ScxmlPackage.SIMPLE_STATE__INVOKE:
				setInvoke((Invoke)null);
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
			case ScxmlPackage.SIMPLE_STATE__INITIAL1:
				return initial1 != null;
			case ScxmlPackage.SIMPLE_STATE__INITIAL:
				return initial != null;
			case ScxmlPackage.SIMPLE_STATE__FINAL:
				return final_ != null && !final_.isEmpty();
			case ScxmlPackage.SIMPLE_STATE__INVOKE:
				return invoke != null;
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
		if (baseClass == AbstractSimpleState.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.SIMPLE_STATE__INITIAL1: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1;
				case ScxmlPackage.SIMPLE_STATE__INITIAL: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL;
				case ScxmlPackage.SIMPLE_STATE__FINAL: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL;
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
		if (baseClass == AbstractSimpleState.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1: return ScxmlPackage.SIMPLE_STATE__INITIAL1;
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL: return ScxmlPackage.SIMPLE_STATE__INITIAL;
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL: return ScxmlPackage.SIMPLE_STATE__FINAL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleStateImpl
