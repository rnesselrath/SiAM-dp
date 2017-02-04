/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getIf <em>If</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getLog <em>Log</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getRaise <em>Raise</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getSend <em>Send</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getCancel <em>Cancel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getAssign <em>Assign</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getValidate <em>Validate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.ExecutableContent#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent()
 * @model
 * @generated
 */
public interface ExecutableContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.If}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_If()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<If> getIf();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Log}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Log> getLog();

	/**
	 * Returns the value of the '<em><b>Raise</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Raise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Raise()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Raise> getRaise();

	/**
	 * Returns the value of the '<em><b>Send</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Send}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Send()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Send> getSend();

	/**
	 * Returns the value of the '<em><b>Cancel</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Cancel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Cancel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Cancel> getCancel();

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Assign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Assign()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Assign> getAssign();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Validate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Validate> getValidate();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getExecutableContent_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<Script> getScript();

} // ExecutableContent
