/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.Node;
import de.dfki.iui.mmds.scxml.OnEntry;
import de.dfki.iui.mmds.scxml.OnExit;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.NodeImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.NodeImpl#getOnexit <em>Onexit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getOnentry() <em>Onentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnentry()
	 * @generated
	 * @ordered
	 */
	protected OnEntry onentry;

	/**
	 * The cached value of the '{@link #getOnexit() <em>Onexit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnexit()
	 * @generated
	 * @ordered
	 */
	protected OnExit onexit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnEntry getOnentry() {
		return onentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnentry(OnEntry newOnentry, NotificationChain msgs) {
		OnEntry oldOnentry = onentry;
		onentry = newOnentry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__ONENTRY, oldOnentry, newOnentry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnentry(OnEntry newOnentry) {
		if (newOnentry != onentry) {
			NotificationChain msgs = null;
			if (onentry != null)
				msgs = ((InternalEObject)onentry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__ONENTRY, null, msgs);
			if (newOnentry != null)
				msgs = ((InternalEObject)newOnentry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__ONENTRY, null, msgs);
			msgs = basicSetOnentry(newOnentry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__ONENTRY, newOnentry, newOnentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnExit getOnexit() {
		return onexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnexit(OnExit newOnexit, NotificationChain msgs) {
		OnExit oldOnexit = onexit;
		onexit = newOnexit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__ONEXIT, oldOnexit, newOnexit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnexit(OnExit newOnexit) {
		if (newOnexit != onexit) {
			NotificationChain msgs = null;
			if (onexit != null)
				msgs = ((InternalEObject)onexit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__ONEXIT, null, msgs);
			if (newOnexit != null)
				msgs = ((InternalEObject)newOnexit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.NODE__ONEXIT, null, msgs);
			msgs = basicSetOnexit(newOnexit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.NODE__ONEXIT, newOnexit, newOnexit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAdapter(final Class adapter) {
		if (adapter == Description.class ) {
			return getDescription();
		} else if ( adapter == String.class ) {
			Map< String, EObject > result = new HashMap< String, EObject >();
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
			case ScxmlPackage.NODE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ScxmlPackage.NODE__ONENTRY:
				return basicSetOnentry(null, msgs);
			case ScxmlPackage.NODE__ONEXIT:
				return basicSetOnexit(null, msgs);
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
			case ScxmlPackage.NODE__DESCRIPTION:
				return getDescription();
			case ScxmlPackage.NODE__ONENTRY:
				return getOnentry();
			case ScxmlPackage.NODE__ONEXIT:
				return getOnexit();
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
			case ScxmlPackage.NODE__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case ScxmlPackage.NODE__ONENTRY:
				setOnentry((OnEntry)newValue);
				return;
			case ScxmlPackage.NODE__ONEXIT:
				setOnexit((OnExit)newValue);
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
			case ScxmlPackage.NODE__DESCRIPTION:
				setDescription((Description)null);
				return;
			case ScxmlPackage.NODE__ONENTRY:
				setOnentry((OnEntry)null);
				return;
			case ScxmlPackage.NODE__ONEXIT:
				setOnexit((OnExit)null);
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
			case ScxmlPackage.NODE__DESCRIPTION:
				return description != null;
			case ScxmlPackage.NODE__ONENTRY:
				return onentry != null;
			case ScxmlPackage.NODE__ONEXIT:
				return onexit != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
