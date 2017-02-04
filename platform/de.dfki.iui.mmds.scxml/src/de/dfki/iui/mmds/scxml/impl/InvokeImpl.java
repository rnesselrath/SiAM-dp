/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.scxml.ExecutableContent;
import de.dfki.iui.mmds.scxml.Invoke;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getSrcexpr <em>Srcexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#isAutoforward <em>Autoforward</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl#getFinalize <em>Finalize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends DonedataImpl implements Invoke {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeexpr() <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPEEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeexpr() <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeexpr()
	 * @generated
	 * @ordered
	 */
	protected String typeexpr = TYPEEXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcexpr() <em>Srcexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcexpr() <em>Srcexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcexpr()
	 * @generated
	 * @ordered
	 */
	protected String srcexpr = SRCEXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdlocation() <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdlocation()
	 * @generated
	 * @ordered
	 */
	protected static final String IDLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdlocation() <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdlocation()
	 * @generated
	 * @ordered
	 */
	protected String idlocation = IDLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamelist() <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamelist()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMELIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamelist() <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamelist()
	 * @generated
	 * @ordered
	 */
	protected String namelist = NAMELIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoforward() <em>Autoforward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoforward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOFORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoforward() <em>Autoforward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoforward()
	 * @generated
	 * @ordered
	 */
	protected boolean autoforward = AUTOFORWARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinalize() <em>Finalize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalize()
	 * @generated
	 * @ordered
	 */
	protected ExecutableContent finalize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeexpr() {
		return typeexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeexpr(String newTypeexpr) {
		String oldTypeexpr = typeexpr;
		typeexpr = newTypeexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__TYPEEXPR, oldTypeexpr, typeexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcexpr() {
		return srcexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcexpr(String newSrcexpr) {
		String oldSrcexpr = srcexpr;
		srcexpr = newSrcexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__SRCEXPR, oldSrcexpr, srcexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdlocation() {
		return idlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdlocation(String newIdlocation) {
		String oldIdlocation = idlocation;
		idlocation = newIdlocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__IDLOCATION, oldIdlocation, idlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamelist() {
		return namelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamelist(String newNamelist) {
		String oldNamelist = namelist;
		namelist = newNamelist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__NAMELIST, oldNamelist, namelist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoforward() {
		return autoforward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoforward(boolean newAutoforward) {
		boolean oldAutoforward = autoforward;
		autoforward = newAutoforward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__AUTOFORWARD, oldAutoforward, autoforward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableContent getFinalize() {
		return finalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalize(ExecutableContent newFinalize, NotificationChain msgs) {
		ExecutableContent oldFinalize = finalize;
		finalize = newFinalize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__FINALIZE, oldFinalize, newFinalize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalize(ExecutableContent newFinalize) {
		if (newFinalize != finalize) {
			NotificationChain msgs = null;
			if (finalize != null)
				msgs = ((InternalEObject)finalize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.INVOKE__FINALIZE, null, msgs);
			if (newFinalize != null)
				msgs = ((InternalEObject)newFinalize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.INVOKE__FINALIZE, null, msgs);
			msgs = basicSetFinalize(newFinalize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.INVOKE__FINALIZE, newFinalize, newFinalize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.INVOKE__FINALIZE:
				return basicSetFinalize(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlPackage.INVOKE__TYPE:
				return getType();
			case ScxmlPackage.INVOKE__TYPEEXPR:
				return getTypeexpr();
			case ScxmlPackage.INVOKE__SRC:
				return getSrc();
			case ScxmlPackage.INVOKE__SRCEXPR:
				return getSrcexpr();
			case ScxmlPackage.INVOKE__ID:
				return getId();
			case ScxmlPackage.INVOKE__IDLOCATION:
				return getIdlocation();
			case ScxmlPackage.INVOKE__NAMELIST:
				return getNamelist();
			case ScxmlPackage.INVOKE__AUTOFORWARD:
				return isAutoforward();
			case ScxmlPackage.INVOKE__FINALIZE:
				return getFinalize();
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
			case ScxmlPackage.INVOKE__TYPE:
				setType((String)newValue);
				return;
			case ScxmlPackage.INVOKE__TYPEEXPR:
				setTypeexpr((String)newValue);
				return;
			case ScxmlPackage.INVOKE__SRC:
				setSrc((String)newValue);
				return;
			case ScxmlPackage.INVOKE__SRCEXPR:
				setSrcexpr((String)newValue);
				return;
			case ScxmlPackage.INVOKE__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.INVOKE__IDLOCATION:
				setIdlocation((String)newValue);
				return;
			case ScxmlPackage.INVOKE__NAMELIST:
				setNamelist((String)newValue);
				return;
			case ScxmlPackage.INVOKE__AUTOFORWARD:
				setAutoforward((Boolean)newValue);
				return;
			case ScxmlPackage.INVOKE__FINALIZE:
				setFinalize((ExecutableContent)newValue);
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
			case ScxmlPackage.INVOKE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__TYPEEXPR:
				setTypeexpr(TYPEEXPR_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__SRCEXPR:
				setSrcexpr(SRCEXPR_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__IDLOCATION:
				setIdlocation(IDLOCATION_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__NAMELIST:
				setNamelist(NAMELIST_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__AUTOFORWARD:
				setAutoforward(AUTOFORWARD_EDEFAULT);
				return;
			case ScxmlPackage.INVOKE__FINALIZE:
				setFinalize((ExecutableContent)null);
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
			case ScxmlPackage.INVOKE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ScxmlPackage.INVOKE__TYPEEXPR:
				return TYPEEXPR_EDEFAULT == null ? typeexpr != null : !TYPEEXPR_EDEFAULT.equals(typeexpr);
			case ScxmlPackage.INVOKE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case ScxmlPackage.INVOKE__SRCEXPR:
				return SRCEXPR_EDEFAULT == null ? srcexpr != null : !SRCEXPR_EDEFAULT.equals(srcexpr);
			case ScxmlPackage.INVOKE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.INVOKE__IDLOCATION:
				return IDLOCATION_EDEFAULT == null ? idlocation != null : !IDLOCATION_EDEFAULT.equals(idlocation);
			case ScxmlPackage.INVOKE__NAMELIST:
				return NAMELIST_EDEFAULT == null ? namelist != null : !NAMELIST_EDEFAULT.equals(namelist);
			case ScxmlPackage.INVOKE__AUTOFORWARD:
				return autoforward != AUTOFORWARD_EDEFAULT;
			case ScxmlPackage.INVOKE__FINALIZE:
				return finalize != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", typeexpr: ");
		result.append(typeexpr);
		result.append(", src: ");
		result.append(src);
		result.append(", srcexpr: ");
		result.append(srcexpr);
		result.append(", id: ");
		result.append(id);
		result.append(", idlocation: ");
		result.append(idlocation);
		result.append(", namelist: ");
		result.append(namelist);
		result.append(", autoforward: ");
		result.append(autoforward);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
