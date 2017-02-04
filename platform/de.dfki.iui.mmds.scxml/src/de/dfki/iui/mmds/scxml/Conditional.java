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
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.Conditional#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends EObject {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see #setCond(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getConditional_Cond()
	 * @model required="true"
	 * @generated
	 */
	String getCond();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Conditional#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(String value);

} // Conditional
