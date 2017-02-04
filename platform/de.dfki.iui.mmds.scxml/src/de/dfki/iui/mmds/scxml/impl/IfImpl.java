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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.Else;
import de.dfki.iui.mmds.scxml.ElseIf;
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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getIf <em>If</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getLog <em>Log</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getRaise <em>Raise</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getSend <em>Send</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getScript <em>Script</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getElseif <em>Elseif</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.IfImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends ConditionalImpl implements If {
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
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ScxmlPackage.IF__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getIf() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__IF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Log> getLog() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__LOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Raise> getRaise() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__RAISE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Send> getSend() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__SEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cancel> getCancel() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__CANCEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssign() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__ASSIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validate> getValidate() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__VALIDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScript() {
		return getGroup().list(ScxmlPackage.Literals.EXECUTABLE_CONTENT__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElseIf> getElseif() {
		return getGroup().list(ScxmlPackage.Literals.IF__ELSEIF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElse() {
		return (Else)getGroup().get(ScxmlPackage.Literals.IF__ELSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Else newElse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGroup()).basicAdd(ScxmlPackage.Literals.IF__ELSE, newElse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Else newElse) {
		((FeatureMap.Internal)getGroup()).set(ScxmlPackage.Literals.IF__ELSE, newElse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.IF__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__RAISE:
				return ((InternalEList<?>)getRaise()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__SEND:
				return ((InternalEList<?>)getSend()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__CANCEL:
				return ((InternalEList<?>)getCancel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__ELSEIF:
				return ((InternalEList<?>)getElseif()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__ELSE:
				return basicSetElse(null, msgs);
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
			case ScxmlPackage.IF__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ScxmlPackage.IF__IF:
				return getIf();
			case ScxmlPackage.IF__LOG:
				return getLog();
			case ScxmlPackage.IF__RAISE:
				return getRaise();
			case ScxmlPackage.IF__SEND:
				return getSend();
			case ScxmlPackage.IF__CANCEL:
				return getCancel();
			case ScxmlPackage.IF__ASSIGN:
				return getAssign();
			case ScxmlPackage.IF__VALIDATE:
				return getValidate();
			case ScxmlPackage.IF__SCRIPT:
				return getScript();
			case ScxmlPackage.IF__ELSEIF:
				return getElseif();
			case ScxmlPackage.IF__ELSE:
				return getElse();
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
			case ScxmlPackage.IF__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ScxmlPackage.IF__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ScxmlPackage.IF__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends Log>)newValue);
				return;
			case ScxmlPackage.IF__RAISE:
				getRaise().clear();
				getRaise().addAll((Collection<? extends Raise>)newValue);
				return;
			case ScxmlPackage.IF__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends Send>)newValue);
				return;
			case ScxmlPackage.IF__CANCEL:
				getCancel().clear();
				getCancel().addAll((Collection<? extends Cancel>)newValue);
				return;
			case ScxmlPackage.IF__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ScxmlPackage.IF__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends Validate>)newValue);
				return;
			case ScxmlPackage.IF__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends Script>)newValue);
				return;
			case ScxmlPackage.IF__ELSEIF:
				getElseif().clear();
				getElseif().addAll((Collection<? extends ElseIf>)newValue);
				return;
			case ScxmlPackage.IF__ELSE:
				setElse((Else)newValue);
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
			case ScxmlPackage.IF__GROUP:
				getGroup().clear();
				return;
			case ScxmlPackage.IF__IF:
				getIf().clear();
				return;
			case ScxmlPackage.IF__LOG:
				getLog().clear();
				return;
			case ScxmlPackage.IF__RAISE:
				getRaise().clear();
				return;
			case ScxmlPackage.IF__SEND:
				getSend().clear();
				return;
			case ScxmlPackage.IF__CANCEL:
				getCancel().clear();
				return;
			case ScxmlPackage.IF__ASSIGN:
				getAssign().clear();
				return;
			case ScxmlPackage.IF__VALIDATE:
				getValidate().clear();
				return;
			case ScxmlPackage.IF__SCRIPT:
				getScript().clear();
				return;
			case ScxmlPackage.IF__ELSEIF:
				getElseif().clear();
				return;
			case ScxmlPackage.IF__ELSE:
				setElse((Else)null);
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
			case ScxmlPackage.IF__GROUP:
				return group != null && !group.isEmpty();
			case ScxmlPackage.IF__IF:
				return !getIf().isEmpty();
			case ScxmlPackage.IF__LOG:
				return !getLog().isEmpty();
			case ScxmlPackage.IF__RAISE:
				return !getRaise().isEmpty();
			case ScxmlPackage.IF__SEND:
				return !getSend().isEmpty();
			case ScxmlPackage.IF__CANCEL:
				return !getCancel().isEmpty();
			case ScxmlPackage.IF__ASSIGN:
				return !getAssign().isEmpty();
			case ScxmlPackage.IF__VALIDATE:
				return !getValidate().isEmpty();
			case ScxmlPackage.IF__SCRIPT:
				return !getScript().isEmpty();
			case ScxmlPackage.IF__ELSEIF:
				return !getElseif().isEmpty();
			case ScxmlPackage.IF__ELSE:
				return getElse() != null;
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
		if (baseClass == ExecutableContent.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.IF__GROUP: return ScxmlPackage.EXECUTABLE_CONTENT__GROUP;
				case ScxmlPackage.IF__IF: return ScxmlPackage.EXECUTABLE_CONTENT__IF;
				case ScxmlPackage.IF__LOG: return ScxmlPackage.EXECUTABLE_CONTENT__LOG;
				case ScxmlPackage.IF__RAISE: return ScxmlPackage.EXECUTABLE_CONTENT__RAISE;
				case ScxmlPackage.IF__SEND: return ScxmlPackage.EXECUTABLE_CONTENT__SEND;
				case ScxmlPackage.IF__CANCEL: return ScxmlPackage.EXECUTABLE_CONTENT__CANCEL;
				case ScxmlPackage.IF__ASSIGN: return ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN;
				case ScxmlPackage.IF__VALIDATE: return ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE;
				case ScxmlPackage.IF__SCRIPT: return ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT;
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
		if (baseClass == ExecutableContent.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.EXECUTABLE_CONTENT__GROUP: return ScxmlPackage.IF__GROUP;
				case ScxmlPackage.EXECUTABLE_CONTENT__IF: return ScxmlPackage.IF__IF;
				case ScxmlPackage.EXECUTABLE_CONTENT__LOG: return ScxmlPackage.IF__LOG;
				case ScxmlPackage.EXECUTABLE_CONTENT__RAISE: return ScxmlPackage.IF__RAISE;
				case ScxmlPackage.EXECUTABLE_CONTENT__SEND: return ScxmlPackage.IF__SEND;
				case ScxmlPackage.EXECUTABLE_CONTENT__CANCEL: return ScxmlPackage.IF__CANCEL;
				case ScxmlPackage.EXECUTABLE_CONTENT__ASSIGN: return ScxmlPackage.IF__ASSIGN;
				case ScxmlPackage.EXECUTABLE_CONTENT__VALIDATE: return ScxmlPackage.IF__VALIDATE;
				case ScxmlPackage.EXECUTABLE_CONTENT__SCRIPT: return ScxmlPackage.IF__SCRIPT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //IfImpl
