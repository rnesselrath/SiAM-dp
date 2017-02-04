/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond Event Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.CondEventTransition#getCond <em>Cond</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.CondEventTransition#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getCondEventTransition()
 * @model
 * @generated
 */
public interface CondEventTransition extends Transition {
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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getCondEventTransition_Cond()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCond();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.CondEventTransition#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getCondEventTransition_Event()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.CondEventTransition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // CondEventTransition
