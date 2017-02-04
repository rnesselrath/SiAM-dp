/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.SimpleState#getInvoke <em>Invoke</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSimpleState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='initialStateDefined initialStateIsChild'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL initialStateDefined='(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())' initialStateIsChild='initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i ))'"
 * @generated
 */
public interface SimpleState extends State, AbstractSimpleState {
	/**
	 * Returns the value of the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke</em>' containment reference.
	 * @see #setInvoke(Invoke)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSimpleState_Invoke()
	 * @model containment="true"
	 * @generated
	 */
	Invoke getInvoke();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.SimpleState#getInvoke <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke</em>' containment reference.
	 * @see #getInvoke()
	 * @generated
	 */
	void setInvoke(Invoke value);

} // SimpleState
