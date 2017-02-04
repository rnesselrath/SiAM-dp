/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getEvent <em>Event</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getEventexpr <em>Eventexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getTarget <em>Target</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getTargetexpr <em>Targetexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getDelayexpr <em>Delayexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getHints <em>Hints</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.Send#getHintsexpr <em>Hintsexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend()
 * @model
 * @generated
 */
public interface Send extends Donedata {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Event()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Eventexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventexpr</em>' attribute.
	 * @see #setEventexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Eventexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getEventexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getEventexpr <em>Eventexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventexpr</em>' attribute.
	 * @see #getEventexpr()
	 * @generated
	 */
	void setEventexpr(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Targetexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetexpr</em>' attribute.
	 * @see #setTargetexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Targetexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTargetexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getTargetexpr <em>Targetexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetexpr</em>' attribute.
	 * @see #getTargetexpr()
	 * @generated
	 */
	void setTargetexpr(String value);

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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getType <em>Type</em>}' attribute.
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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Typeexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTypeexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getTypeexpr <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeexpr</em>' attribute.
	 * @see #getTypeexpr()
	 * @generated
	 */
	void setTypeexpr(String value);

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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getId <em>Id</em>}' attribute.
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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Idlocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getIdlocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getIdlocation <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idlocation</em>' attribute.
	 * @see #getIdlocation()
	 * @generated
	 */
	void setIdlocation(String value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Delay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

	/**
	 * Returns the value of the '<em><b>Delayexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delayexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delayexpr</em>' attribute.
	 * @see #setDelayexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Delayexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDelayexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getDelayexpr <em>Delayexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delayexpr</em>' attribute.
	 * @see #getDelayexpr()
	 * @generated
	 */
	void setDelayexpr(String value);

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
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Namelist()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getNamelist();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getNamelist <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namelist</em>' attribute.
	 * @see #getNamelist()
	 * @generated
	 */
	void setNamelist(String value);

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' attribute.
	 * @see #setHints(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Hints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getHints();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getHints <em>Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hints</em>' attribute.
	 * @see #getHints()
	 * @generated
	 */
	void setHints(String value);

	/**
	 * Returns the value of the '<em><b>Hintsexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hintsexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hintsexpr</em>' attribute.
	 * @see #setHintsexpr(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getSend_Hintsexpr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getHintsexpr();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.Send#getHintsexpr <em>Hintsexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hintsexpr</em>' attribute.
	 * @see #getHintsexpr()
	 * @generated
	 */
	void setHintsexpr(String value);

} // Send
