/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cond Event Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CondEventTransitionImpl extends TransitionImpl implements CondEventTransition {
	/**
	 * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected static final String COND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected String cond = COND_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondEventTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.COND_EVENT_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCond(String newCond) {
		if ( newCond == null || !newCond.isEmpty() ) {
			String oldCond = cond;
			cond = newCond;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.COND_EVENT_TRANSITION__COND, oldCond, cond));
		} else {
			setCond( COND_EDEFAULT );
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEvent(String newEvent) {
		if ( newEvent == null || !newEvent.isEmpty() ) {
			String oldEvent = event;
			event = newEvent;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.COND_EVENT_TRANSITION__EVENT, oldEvent, event));
		} else {
			setEvent( EVENT_EDEFAULT );
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlPackage.COND_EVENT_TRANSITION__COND:
				return getCond();
			case ScxmlPackage.COND_EVENT_TRANSITION__EVENT:
				return getEvent();
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
			case ScxmlPackage.COND_EVENT_TRANSITION__COND:
				setCond((String)newValue);
				return;
			case ScxmlPackage.COND_EVENT_TRANSITION__EVENT:
				setEvent((String)newValue);
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
			case ScxmlPackage.COND_EVENT_TRANSITION__COND:
				setCond(COND_EDEFAULT);
				return;
			case ScxmlPackage.COND_EVENT_TRANSITION__EVENT:
				setEvent(EVENT_EDEFAULT);
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
			case ScxmlPackage.COND_EVENT_TRANSITION__COND:
				return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
			case ScxmlPackage.COND_EVENT_TRANSITION__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
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
		result.append(" (cond: ");
		result.append(cond);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //CondEventTransitionImpl
