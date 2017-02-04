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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.CancelImpl#getSendid <em>Sendid</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.CancelImpl#getSendidexpr <em>Sendidexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CancelImpl extends EObjectImpl implements Cancel {
	/**
	 * The default value of the '{@link #getSendid() <em>Sendid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendid()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendid() <em>Sendid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendid()
	 * @generated
	 * @ordered
	 */
	protected String sendid = SENDID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendidexpr() <em>Sendidexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendidexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDIDEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendidexpr() <em>Sendidexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendidexpr()
	 * @generated
	 * @ordered
	 */
	protected String sendidexpr = SENDIDEXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.CANCEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendid() {
		return sendid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendid(String newSendid) {
		String oldSendid = sendid;
		sendid = newSendid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.CANCEL__SENDID, oldSendid, sendid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendidexpr() {
		return sendidexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendidexpr(String newSendidexpr) {
		String oldSendidexpr = sendidexpr;
		sendidexpr = newSendidexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.CANCEL__SENDIDEXPR, oldSendidexpr, sendidexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlPackage.CANCEL__SENDID:
				return getSendid();
			case ScxmlPackage.CANCEL__SENDIDEXPR:
				return getSendidexpr();
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
			case ScxmlPackage.CANCEL__SENDID:
				setSendid((String)newValue);
				return;
			case ScxmlPackage.CANCEL__SENDIDEXPR:
				setSendidexpr((String)newValue);
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
			case ScxmlPackage.CANCEL__SENDID:
				setSendid(SENDID_EDEFAULT);
				return;
			case ScxmlPackage.CANCEL__SENDIDEXPR:
				setSendidexpr(SENDIDEXPR_EDEFAULT);
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
			case ScxmlPackage.CANCEL__SENDID:
				return SENDID_EDEFAULT == null ? sendid != null : !SENDID_EDEFAULT.equals(sendid);
			case ScxmlPackage.CANCEL__SENDIDEXPR:
				return SENDIDEXPR_EDEFAULT == null ? sendidexpr != null : !SENDIDEXPR_EDEFAULT.equals(sendidexpr);
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
		result.append(" (sendid: ");
		result.append(sendid);
		result.append(", sendidexpr: ");
		result.append(sendidexpr);
		result.append(')');
		return result.toString();
	}

} //CancelImpl
