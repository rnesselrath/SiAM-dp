/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datamodel Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.DatamodelContainer#getDatamodel <em>Datamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getDatamodelContainer()
 * @model interface="true" abstract="true" superTypes="de.dfki.iui.mmds.scxml.IAdaptable"
 * @generated
 */
public interface DatamodelContainer extends EObject, IAdaptable {
	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' containment reference.
	 * @see #setDatamodel(Datamodel)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getDatamodelContainer_Datamodel()
	 * @model containment="true"
	 * @generated
	 */
	Datamodel getDatamodel();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.DatamodelContainer#getDatamodel <em>Datamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodel</em>' containment reference.
	 * @see #getDatamodel()
	 * @generated
	 */
	void setDatamodel(Datamodel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model adapterDataType="de.dfki.iui.mmds.scxml.SJavaClass"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (adapter == Data.class ) {\r\n\treturn getDatamodel();\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Object getAdapter(Class adapter);

} // DatamodelContainer
