/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.scxml.Donedata;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.FinalStateImpl#getDonedata <em>Donedata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinalStateImpl extends TransitionTargetImpl implements FinalState {
	/**
	 * The cached value of the '{@link #getDonedata() <em>Donedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonedata()
	 * @generated
	 * @ordered
	 */
	protected Donedata donedata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.FINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donedata getDonedata() {
		return donedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDonedata(Donedata newDonedata, NotificationChain msgs) {
		Donedata oldDonedata = donedata;
		donedata = newDonedata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.FINAL_STATE__DONEDATA, oldDonedata, newDonedata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonedata(Donedata newDonedata) {
		if (newDonedata != donedata) {
			NotificationChain msgs = null;
			if (donedata != null)
				msgs = ((InternalEObject)donedata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.FINAL_STATE__DONEDATA, null, msgs);
			if (newDonedata != null)
				msgs = ((InternalEObject)newDonedata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.FINAL_STATE__DONEDATA, null, msgs);
			msgs = basicSetDonedata(newDonedata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.FINAL_STATE__DONEDATA, newDonedata, newDonedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return basicSetDonedata(null, msgs);
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
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return getDonedata();
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
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				setDonedata((Donedata)newValue);
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
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				setDonedata((Donedata)null);
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
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return donedata != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalStateImpl
