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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.ExecutableContent;
import de.dfki.iui.mmds.scxml.If;
import de.dfki.iui.mmds.scxml.Log;
import de.dfki.iui.mmds.scxml.Raise;
import de.dfki.iui.mmds.scxml.Script;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.Validate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getIf <em>If</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getLog <em>Log</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getRaise <em>Raise</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getSend <em>Send</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutableContentImpl extends EObjectImpl implements ExecutableContent {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.EXECUTABLE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ScxmlPackage.EXECUTABLE_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<If> getIf() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__IF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Log> getLog() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__LOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Raise> getRaise() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__RAISE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Send> getSend() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__SEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cancel> getCancel() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__CANCEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assign> getAssign() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__ASSIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Validate> getValidate() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__VALIDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Script> getScript() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.EXECUTABLE_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__RAISE:
				return ((InternalEList<?>)getRaise()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__SEND:
				return ((InternalEList<?>)getSend()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL:
				return ((InternalEList<?>)getCancel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.EXECUTABLE_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ScxmlPackage.EXECUTABLE_CONTENT__IF:
				return getIf();
			case ScxmlPackage.EXECUTABLE_CONTENT__LOG:
				return getLog();
			case ScxmlPackage.EXECUTABLE_CONTENT__RAISE:
				return getRaise();
			case ScxmlPackage.EXECUTABLE_CONTENT__SEND:
				return getSend();
			case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL:
				return getCancel();
			case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN:
				return getAssign();
			case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE:
				return getValidate();
			case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT:
				return getScript();
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
			case ScxmlPackage.EXECUTABLE_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends Log>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__RAISE:
				getRaise().clear();
				getRaise().addAll((Collection<? extends Raise>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends Send>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL:
				getCancel().clear();
				getCancel().addAll((Collection<? extends Cancel>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends Validate>)newValue);
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends Script>)newValue);
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
			case ScxmlPackage.EXECUTABLE_CONTENT__GROUP:
				getGroup().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__IF:
				getIf().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__LOG:
				getLog().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__RAISE:
				getRaise().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__SEND:
				getSend().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL:
				getCancel().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN:
				getAssign().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE:
				getValidate().clear();
				return;
			case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT:
				getScript().clear();
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
			case ScxmlPackage.EXECUTABLE_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__IF:
				return !getIf().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__LOG:
				return !getLog().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__RAISE:
				return !getRaise().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__SEND:
				return !getSend().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL:
				return !getCancel().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN:
				return !getAssign().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE:
				return !getValidate().isEmpty();
			case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT:
				return !getScript().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ExecutableContentImpl
