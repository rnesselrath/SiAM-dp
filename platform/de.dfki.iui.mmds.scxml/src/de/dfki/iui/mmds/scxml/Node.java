/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.Node#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Node#getOnexit <em>Onexit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DescriptionContainer {
	/**
	 * Returns the value of the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onentry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onentry</em>' containment reference.
	 * @see #setOnentry(OnEntry)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getNode_Onentry()
	 * @model containment="true"
	 * @generated
	 */
	OnEntry getOnentry();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Node#getOnentry <em>Onentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onentry</em>' containment reference.
	 * @see #getOnentry()
	 * @generated
	 */
	void setOnentry(OnEntry value);

	/**
	 * Returns the value of the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onexit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onexit</em>' containment reference.
	 * @see #setOnexit(OnExit)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getNode_Onexit()
	 * @model containment="true"
	 * @generated
	 */
	OnExit getOnexit();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Node#getOnexit <em>Onexit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onexit</em>' containment reference.
	 * @see #getOnexit()
	 * @generated
	 */
	void setOnexit(OnExit value);

} // Node
