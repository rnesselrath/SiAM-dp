/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.State#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getState()
 * @model
 * @generated
 */
public interface State extends TransitionTarget, AbstractState, TransitionSource, DatamodelContainer {
	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryState)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getState_History()
	 * @model containment="true"
	 * @generated
	 */
	HistoryState getHistory();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.State#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryState value);

} // State
