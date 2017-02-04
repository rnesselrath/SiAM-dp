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
 * A representation of the model object '<em><b>Abstract Simple State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial1 <em>Initial1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial <em>Initial</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractSimpleState()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueInitialStateDefinition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL uniqueInitialStateDefinition='(initial1->notEmpty() implies initial.oclIsUndefined()) and (not initial.oclIsUndefined() implies initial1->isEmpty())'"
 * @generated
 */
public interface AbstractSimpleState extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial1</em>' reference.
	 * @see #setInitial1(TransitionTarget)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractSimpleState_Initial1()
	 * @model resolveProxies="false" keys="id"
	 *        extendedMetaData="name='initial' kind='attribute'"
	 * @generated
	 */
	TransitionTarget getInitial1();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial1 <em>Initial1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial1</em>' reference.
	 * @see #getInitial1()
	 * @generated
	 */
	void setInitial1(TransitionTarget value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(InitialState)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractSimpleState_Initial()
	 * @model containment="true"
	 * @generated
	 */
	InitialState getInitial();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(InitialState value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.FinalState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getAbstractSimpleState_Final()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinalState> getFinal();

} // AbstractSimpleState
