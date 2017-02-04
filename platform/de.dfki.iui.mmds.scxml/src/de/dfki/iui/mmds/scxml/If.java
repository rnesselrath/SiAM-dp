/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.If#getElseif <em>Elseif</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.If#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Conditional, ExecutableContent {
	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.ElseIf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getIf_Elseif()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	EList<ElseIf> getElseif();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Else)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getIf_Else()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#group:0'"
	 * @generated
	 */
	Else getElse();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Else value);

} // If
