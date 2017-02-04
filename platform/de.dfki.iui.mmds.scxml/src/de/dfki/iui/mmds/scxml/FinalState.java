/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.FinalState#getDonedata <em>Donedata</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends TransitionTarget {
	/**
	 * Returns the value of the '<em><b>Donedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donedata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donedata</em>' containment reference.
	 * @see #setDonedata(Donedata)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getFinalState_Donedata()
	 * @model containment="true"
	 * @generated
	 */
	Donedata getDonedata();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.FinalState#getDonedata <em>Donedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donedata</em>' containment reference.
	 * @see #getDonedata()
	 * @generated
	 */
	void setDonedata(Donedata value);

} // FinalState
