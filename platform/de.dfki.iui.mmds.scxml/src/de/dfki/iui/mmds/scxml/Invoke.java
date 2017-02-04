/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getSrc <em>Src</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getSrcexpr <em>Srcexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#isAutoforward <em>Autoforward</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Invoke#getFinalize <em>Finalize</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Donedata {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeexpr</em>' attribute.
	 * @see #setTypeexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Typeexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTypeexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getTypeexpr <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeexpr</em>' attribute.
	 * @see #getTypeexpr()
	 * @generated
	 */
	void setTypeexpr(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Srcexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srcexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcexpr</em>' attribute.
	 * @see #setSrcexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Srcexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSrcexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getSrcexpr <em>Srcexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcexpr</em>' attribute.
	 * @see #getSrcexpr()
	 * @generated
	 */
	void setSrcexpr(String value);

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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idlocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idlocation</em>' attribute.
	 * @see #setIdlocation(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Idlocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIdlocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getIdlocation <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idlocation</em>' attribute.
	 * @see #getIdlocation()
	 * @generated
	 */
	void setIdlocation(String value);

	/**
	 * Returns the value of the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namelist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namelist</em>' attribute.
	 * @see #setNamelist(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Namelist()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNamelist();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getNamelist <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namelist</em>' attribute.
	 * @see #getNamelist()
	 * @generated
	 */
	void setNamelist(String value);

	/**
	 * Returns the value of the '<em><b>Autoforward</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoforward</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoforward</em>' attribute.
	 * @see #setAutoforward(boolean)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Autoforward()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAutoforward();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#isAutoforward <em>Autoforward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoforward</em>' attribute.
	 * @see #isAutoforward()
	 * @generated
	 */
	void setAutoforward(boolean value);

	/**
	 * Returns the value of the '<em><b>Finalize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalize</em>' containment reference.
	 * @see #setFinalize(ExecutableContent)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getInvoke_Finalize()
	 * @model containment="true"
	 * @generated
	 */
	ExecutableContent getFinalize();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Invoke#getFinalize <em>Finalize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalize</em>' containment reference.
	 * @see #getFinalize()
	 * @generated
	 */
	void setFinalize(ExecutableContent value);

} // Invoke
