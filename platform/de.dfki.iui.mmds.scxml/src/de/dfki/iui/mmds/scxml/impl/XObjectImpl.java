/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.XObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl#isExchange <em>Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XObjectImpl extends EObjectImpl implements XObject {
	/**
	 * The default value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsUri()
	 * @generated
	 * @ordered
	 */
	protected String nsUri = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = CLASSIFIER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The default value of the '{@link #isExchange() <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExchange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCHANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExchange() <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExchange()
	 * @generated
	 * @ordered
	 */
	protected boolean exchange = EXCHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected XObjectImpl() {
		super();
		registerAdapter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.XOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsUri() {
		return nsUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsUri(String newNsUri) {
		String oldNsUri = nsUri;
		nsUri = newNsUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.XOBJECT__NS_URI, oldNsUri, nsUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		return classifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.XOBJECT__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScxmlPackage.XOBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.XOBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExchange() {
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchange(boolean newExchange) {
		boolean oldExchange = exchange;
		exchange = newExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.XOBJECT__EXCHANGE, oldExchange, exchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerAdapter() {
		eAdapters().add( new Adapter() {
			Notifier t;
			boolean justSet;
			
			@Override
			public void setTarget( Notifier newTarget ) {
				t = newTarget;
			}
			
			@Override
			public void notifyChanged( Notification notification ) {
				switch ( notification.getFeatureID( null )) {
				case ScxmlPackage.XOBJECT__NS_URI:
					switch ( notification.getEventType()) {
						case Notification.SET:
							// if there is a classifier name find and set the type
							if ( eIsSet( ScxmlPackage.XOBJECT__CLASSIFIER_NAME )) {
								Object o = EPackage.Registry.INSTANCE.get( /* difference A */ notification.getNewStringValue() );
								EPackage p = (EPackage) (o instanceof EPackage.Descriptor ? ((EPackage.Descriptor) o).getEPackage() : o);
								if ( p != null ) {
									EClassifier cl = p.getEClassifier( /* difference B */ getClassifierName() );
									if ( cl instanceof EClass ) {
										setType( (EClass) cl );
									}
								}
							}
							break;
					}
					break;
				case ScxmlPackage.XOBJECT__CLASSIFIER_NAME:
					switch ( notification.getEventType()) {
						case Notification.SET:
							// if there is a package name find and set the type
							if ( eIsSet( ScxmlPackage.XOBJECT__NS_URI )) {
								Object o = EPackage.Registry.INSTANCE.get( /* difference A */ getNsUri() );
								EPackage p = (EPackage) (o instanceof EPackage.Descriptor ? ((EPackage.Descriptor) o).getEPackage() : o);
								if ( p != null ) {
									EClassifier cl = p.getEClassifier( /* difference B */ notification.getNewStringValue() );
									if ( cl instanceof EClass ) {
										setType( (EClass) cl );
									}
								}
							}
							break;
					}
					break;
				case ScxmlPackage.XOBJECT__TYPE:
					switch ( notification.getEventType()) {
						case Notification.SET:
							// do nothing
							break;
					}
					break;
				case ScxmlPackage.XOBJECT__EXCHANGE:
					switch ( notification.getEventType()) {
						case Notification.SET:
							if ( justSet ) {
								// in that case do nothing since the object was just set, otherwise stack overflow
								justSet = false;
							} else {
								// create an object and replace this object by the new object
								if ( !eIsSet( ScxmlPackage.XOBJECT__TYPE )) {
									// there is no type chosen, inform the use by prompting a dialog
								} else if ( eContainer() != null ) {
									// only if this xobject is part of an 'ecore model' proceed, otherwise not possible to set the new instance or to replace the xobject
									EObject newInst = getType().getEPackage().getEFactoryInstance().create( getType() );
									EStructuralFeature contFeat = eContainingFeature();
									if ( contFeat.getEType().isInstance( newInst )) {
										// the new object matches the feature
										eContainer().eSet( contFeat, newInst );
									}
								}
								justSet = true;
								eUnset( ScxmlPackage.XOBJECT__EXCHANGE );
							}
							break;
					}
					break;
				}
			}
			
			@Override
			public boolean isAdapterForType( Object type ) {
				return false;
			}
			
			@Override
			public Notifier getTarget() {
				return t;
			}
		} );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlPackage.XOBJECT__NS_URI:
				return getNsUri();
			case ScxmlPackage.XOBJECT__CLASSIFIER_NAME:
				return getClassifierName();
			case ScxmlPackage.XOBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ScxmlPackage.XOBJECT__EXCHANGE:
				return isExchange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScxmlPackage.XOBJECT__NS_URI:
				setNsUri((String)newValue);
				return;
			case ScxmlPackage.XOBJECT__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case ScxmlPackage.XOBJECT__TYPE:
				setType((EClass)newValue);
				return;
			case ScxmlPackage.XOBJECT__EXCHANGE:
				setExchange((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScxmlPackage.XOBJECT__NS_URI:
				setNsUri(NS_URI_EDEFAULT);
				return;
			case ScxmlPackage.XOBJECT__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case ScxmlPackage.XOBJECT__TYPE:
				setType((EClass)null);
				return;
			case ScxmlPackage.XOBJECT__EXCHANGE:
				setExchange(EXCHANGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScxmlPackage.XOBJECT__NS_URI:
				return NS_URI_EDEFAULT == null ? nsUri != null : !NS_URI_EDEFAULT.equals(nsUri);
			case ScxmlPackage.XOBJECT__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case ScxmlPackage.XOBJECT__TYPE:
				return type != null;
			case ScxmlPackage.XOBJECT__EXCHANGE:
				return exchange != EXCHANGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nsUri: ");
		result.append(nsUri);
		result.append(", classifierName: ");
		result.append(classifierName);
		result.append(", exchange: ");
		result.append(exchange);
		result.append(')');
		return result.toString();
	}

} //XObjectImpl
