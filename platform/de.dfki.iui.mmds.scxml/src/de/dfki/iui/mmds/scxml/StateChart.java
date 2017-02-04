/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getProfile <em>Profile</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getExmode <em>Exmode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.StateChart#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart()
 * @model extendedMetaData="name='scxml'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='initialStateDefined initialStateIsChild'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL initialStateDefined='(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())' initialStateIsChild='initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i )) and (not initial.oclIsUndefined() implies (final->exists( f | f = initial ) or state->exists( s | s = initial ) or parallel->exists( p | p = initial )))'"
 * @generated
 */
public interface StateChart extends AbstractState, AbstractSimpleState, DatamodelContainer, DescriptionContainer {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(BigDecimal)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Version()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	BigDecimal getVersion();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.StateChart#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * The default value is <code>"ecmascript"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Profile()
	 * @model default="ecmascript" dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.StateChart#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Exmode</b></em>' attribute.
	 * The default value is <code>"lax"</code>.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.scxml.ExmodeDatatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exmode</em>' attribute.
	 * @see de.dfki.iui.mmds.scxml.ExmodeDatatype
	 * @see #setExmode(ExmodeDatatype)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Exmode()
	 * @model default="lax"
	 * @generated
	 */
	ExmodeDatatype getExmode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.StateChart#getExmode <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exmode</em>' attribute.
	 * @see de.dfki.iui.mmds.scxml.ExmodeDatatype
	 * @see #getExmode()
	 * @generated
	 */
	void setExmode(ExmodeDatatype value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.StateChart#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.scxml.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Script()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScript();

	/**
	 * Returns the value of the '<em><b>Xmlns</b></em>' attribute.
	 * The default value is <code>"http://www.w3.org/2005/07/scxml"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmlns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmlns</em>' attribute.
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getStateChart_Xmlns()
	 * @model default="http://www.w3.org/2005/07/scxml" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true" changeable="false"
	 * @generated
	 */
	String getXmlns();

} // StateChart
