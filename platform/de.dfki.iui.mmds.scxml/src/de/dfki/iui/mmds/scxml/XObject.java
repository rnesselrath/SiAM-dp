/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.XObject#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.XObject#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.XObject#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.XObject#isExchange <em>Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getXObject()
 * @model
 * @generated
 */
public interface XObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Ns Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Uri</em>' attribute.
	 * @see #setNsUri(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getXObject_NsUri()
	 * @model
	 * @generated
	 */
	String getNsUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.XObject#getNsUri <em>Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Uri</em>' attribute.
	 * @see #getNsUri()
	 * @generated
	 */
	void setNsUri(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getXObject_ClassifierName()
	 * @model
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.XObject#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getXObject_Type()
	 * @model
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.XObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange</em>' attribute.
	 * @see #setExchange(boolean)
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#getXObject_Exchange()
	 * @model
	 * @generated
	 */
	boolean isExchange();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.scxml.XObject#isExchange <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange</em>' attribute.
	 * @see #isExchange()
	 * @generated
	 */
	void setExchange(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='eAdapters().add( new Adapter() {\r\n\tNotifier t;\r\n\tboolean justSet;\r\n\t\r\n\t@Override\r\n\tpublic void setTarget( Notifier newTarget ) {\r\n\t\tt = newTarget;\r\n\t}\r\n\t\r\n\t@Override\r\n\tpublic void notifyChanged( Notification notification ) {\r\n\t\tswitch ( notification.getFeatureID( null )) {\r\n\t\tcase ScxmlPackage.XOBJECT__NS_URI:\r\n\t\t\tswitch ( notification.getEventType()) {\r\n\t\t\t\tcase Notification.SET:\r\n\t\t\t\t\t// if there is a classifier name find and set the type\r\n\t\t\t\t\tif ( eIsSet( ScxmlPackage.XOBJECT__CLASSIFIER_NAME )) {\r\n\t\t\t\t\t\tObject o = EPackage.Registry.INSTANCE.get( /* difference A \052/ notification.getNewStringValue() );\r\n\t\t\t\t\t\tEPackage p = (EPackage) (o instanceof EPackage.Descriptor ? ((EPackage.Descriptor) o).getEPackage() : o);\r\n\t\t\t\t\t\tif ( p != null ) {\r\n\t\t\t\t\t\t\tEClassifier cl = p.getEClassifier( /* difference B \052/ getClassifierName() );\r\n\t\t\t\t\t\t\tif ( cl instanceof EClass ) {\r\n\t\t\t\t\t\t\t\tsetType( (EClass) cl );\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase ScxmlPackage.XOBJECT__CLASSIFIER_NAME:\r\n\t\t\tswitch ( notification.getEventType()) {\r\n\t\t\t\tcase Notification.SET:\r\n\t\t\t\t\t// if there is a package name find and set the type\r\n\t\t\t\t\tif ( eIsSet( ScxmlPackage.XOBJECT__NS_URI )) {\r\n\t\t\t\t\t\tObject o = EPackage.Registry.INSTANCE.get( /* difference A \052/ getNsUri() );\r\n\t\t\t\t\t\tEPackage p = (EPackage) (o instanceof EPackage.Descriptor ? ((EPackage.Descriptor) o).getEPackage() : o);\r\n\t\t\t\t\t\tif ( p != null ) {\r\n\t\t\t\t\t\t\tEClassifier cl = p.getEClassifier( /* difference B \052/ notification.getNewStringValue() );\r\n\t\t\t\t\t\t\tif ( cl instanceof EClass ) {\r\n\t\t\t\t\t\t\t\tsetType( (EClass) cl );\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase ScxmlPackage.XOBJECT__TYPE:\r\n\t\t\tswitch ( notification.getEventType()) {\r\n\t\t\t\tcase Notification.SET:\r\n\t\t\t\t\t// do nothing\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\tcase ScxmlPackage.XOBJECT__EXCHANGE:\r\n\t\t\tswitch ( notification.getEventType()) {\r\n\t\t\t\tcase Notification.SET:\r\n\t\t\t\t\tif ( justSet ) {\r\n\t\t\t\t\t\t// in that case do nothing since the object was just set, otherwise stack overflow\r\n\t\t\t\t\t\tjustSet = false;\r\n\t\t\t\t\t} else {\r\n\t\t\t\t\t\t// create an object and replace this object by the new object\r\n\t\t\t\t\t\tif ( !eIsSet( ScxmlPackage.XOBJECT__TYPE )) {\r\n\t\t\t\t\t\t\t// there is no type chosen, inform the use by prompting a dialog\r\n\t\t\t\t\t\t} else if ( eContainer() != null ) {\r\n\t\t\t\t\t\t\t// only if this xobject is part of an \'ecore model\' proceed, otherwise not possible to set the new instance or to replace the xobject\r\n\t\t\t\t\t\t\tEObject newInst = getType().getEPackage().getEFactoryInstance().create( getType() );\r\n\t\t\t\t\t\t\tEStructuralFeature contFeat = eContainingFeature();\r\n\t\t\t\t\t\t\tif ( contFeat.getEType().isInstance( newInst )) {\r\n\t\t\t\t\t\t\t\t// the new object matches the feature\r\n\t\t\t\t\t\t\t\teContainer().eSet( contFeat, newInst );\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\tjustSet = true;\r\n\t\t\t\t\t\teUnset( ScxmlPackage.XOBJECT__EXCHANGE );\r\n\t\t\t\t\t}\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\t}\r\n\t}\r\n\t\r\n\t@Override\r\n\tpublic boolean isAdapterForType( Object type ) {\r\n\t\treturn false;\r\n\t}\r\n\t\r\n\t@Override\r\n\tpublic Notifier getTarget() {\r\n\t\treturn t;\r\n\t}\r\n} );'"
	 * @generated
	 */
	void registerAdapter();

} // XObject
