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
 * A representation of the model object '<em><b>Description Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.DescriptionContainer#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getDescriptionContainer()
 * @model interface="true" abstract="true" superTypes="de.dfki.iui.mmds.scxml.IAdaptable"
 * @generated
 */
public interface DescriptionContainer extends EObject, IAdaptable {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getDescriptionContainer_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.DescriptionContainer#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model adapterDataType="de.dfki.iui.mmds.scxml.SJavaClass"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (adapter == Description.class ) {\r\n\treturn getDescription();\r\n} else if ( adapter == String.class ) {\r\n\tMap< String, EObject > result = new HashMap< String, EObject >();\r\n\tresult.put( AdapterToken.DESCRIPTION.getLiteral(), getDescription() );\r\n\treturn result;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Object getAdapter(Class adapter);

} // DescriptionContainer
