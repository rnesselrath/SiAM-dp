/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.HistoryState#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getHistoryState()
 * @model
 * @generated
 */
public interface HistoryState extends TransitionTarget, InitialState {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"shallow"</code>.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.scxml.HistoryTypeDatatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.mmds.scxml.HistoryTypeDatatype
	 * @see #setType(HistoryTypeDatatype)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getHistoryState_Type()
	 * @model default="shallow"
	 * @generated
	 */
	HistoryTypeDatatype getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.HistoryState#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.iui.mmds.scxml.HistoryTypeDatatype
	 * @see #getType()
	 * @generated
	 */
	void setType(HistoryTypeDatatype value);

} // HistoryState
