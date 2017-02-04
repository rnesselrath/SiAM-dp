/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.Validate#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Validate#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getValidate()
 * @model
 * @generated
 */
public interface Validate extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getValidate_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Validate#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getValidate_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Validate#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

} // Validate
