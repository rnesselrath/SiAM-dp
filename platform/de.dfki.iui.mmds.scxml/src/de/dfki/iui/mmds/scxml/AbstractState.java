/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.AbstractState#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.AbstractState#getParallel <em>Parallel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.SimpleState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractState_State()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SimpleState> getState();

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.ParallelState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractState_Parallel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParallelState> getParallel();

} // AbstractState
