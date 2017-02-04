/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.Send;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getEventexpr <em>Eventexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getTargetexpr <em>Targetexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getDelayexpr <em>Delayexpr</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.SendImpl#getHintsexpr <em>Hintsexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendImpl extends DonedataImpl implements Send {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventexpr() <em>Eventexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENTEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventexpr() <em>Eventexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventexpr()
	 * @generated
	 * @ordered
	 */
	protected String eventexpr = EVENTEXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetexpr() <em>Targetexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetexpr() <em>Targetexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetexpr()
	 * @generated
	 * @ordered
	 */
	protected String targetexpr = TARGETEXPR_EDEFAULT;

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
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelayexpr() <em>Delayexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAYEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayexpr() <em>Delayexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayexpr()
	 * @generated
	 * @ordered
	 */
	protected String delayexpr = DELAYEXPR_EDEFAULT;

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
	 * The default value of the '{@link #getHints() <em>Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected static final String HINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected String hints = HINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHintsexpr() <em>Hintsexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHintsexpr()
	 * @generated
	 * @ordered
	 */
	protected static final String HINTSEXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHintsexpr() <em>Hintsexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHintsexpr()
	 * @generated
	 * @ordered
	 */
	protected String hintsexpr = HINTSEXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventexpr() {
		return eventexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventexpr(String newEventexpr) {
		String oldEventexpr = eventexpr;
		eventexpr = newEventexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__EVENTEXPR, oldEventexpr, eventexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetexpr() {
		return targetexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetexpr(String newTargetexpr) {
		String oldTargetexpr = targetexpr;
		targetexpr = newTargetexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__TARGETEXPR, oldTargetexpr, targetexpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__TYPEEXPR, oldTypeexpr, typeexpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__IDLOCATION, oldIdlocation, idlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelayexpr() {
		return delayexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayexpr(String newDelayexpr) {
		String oldDelayexpr = delayexpr;
		delayexpr = newDelayexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__DELAYEXPR, oldDelayexpr, delayexpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__NAMELIST, oldNamelist, namelist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHints() {
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHints(String newHints) {
		String oldHints = hints;
		hints = newHints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__HINTS, oldHints, hints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHintsexpr() {
		return hintsexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHintsexpr(String newHintsexpr) {
		String oldHintsexpr = hintsexpr;
		hintsexpr = newHintsexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SEND__HINTSEXPR, oldHintsexpr, hintsexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlPackage.SEND__EVENT:
				return getEvent();
			case ScxmlPackage.SEND__EVENTEXPR:
				return getEventexpr();
			case ScxmlPackage.SEND__TARGET:
				return getTarget();
			case ScxmlPackage.SEND__TARGETEXPR:
				return getTargetexpr();
			case ScxmlPackage.SEND__TYPE:
				return getType();
			case ScxmlPackage.SEND__TYPEEXPR:
				return getTypeexpr();
			case ScxmlPackage.SEND__ID:
				return getId();
			case ScxmlPackage.SEND__IDLOCATION:
				return getIdlocation();
			case ScxmlPackage.SEND__DELAY:
				return getDelay();
			case ScxmlPackage.SEND__DELAYEXPR:
				return getDelayexpr();
			case ScxmlPackage.SEND__NAMELIST:
				return getNamelist();
			case ScxmlPackage.SEND__HINTS:
				return getHints();
			case ScxmlPackage.SEND__HINTSEXPR:
				return getHintsexpr();
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
			case ScxmlPackage.SEND__EVENT:
				setEvent((String)newValue);
				return;
			case ScxmlPackage.SEND__EVENTEXPR:
				setEventexpr((String)newValue);
				return;
			case ScxmlPackage.SEND__TARGET:
				setTarget((String)newValue);
				return;
			case ScxmlPackage.SEND__TARGETEXPR:
				setTargetexpr((String)newValue);
				return;
			case ScxmlPackage.SEND__TYPE:
				setType((String)newValue);
				return;
			case ScxmlPackage.SEND__TYPEEXPR:
				setTypeexpr((String)newValue);
				return;
			case ScxmlPackage.SEND__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.SEND__IDLOCATION:
				setIdlocation((String)newValue);
				return;
			case ScxmlPackage.SEND__DELAY:
				setDelay((String)newValue);
				return;
			case ScxmlPackage.SEND__DELAYEXPR:
				setDelayexpr((String)newValue);
				return;
			case ScxmlPackage.SEND__NAMELIST:
				setNamelist((String)newValue);
				return;
			case ScxmlPackage.SEND__HINTS:
				setHints((String)newValue);
				return;
			case ScxmlPackage.SEND__HINTSEXPR:
				setHintsexpr((String)newValue);
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
			case ScxmlPackage.SEND__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case ScxmlPackage.SEND__EVENTEXPR:
				setEventexpr(EVENTEXPR_EDEFAULT);
				return;
			case ScxmlPackage.SEND__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case ScxmlPackage.SEND__TARGETEXPR:
				setTargetexpr(TARGETEXPR_EDEFAULT);
				return;
			case ScxmlPackage.SEND__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ScxmlPackage.SEND__TYPEEXPR:
				setTypeexpr(TYPEEXPR_EDEFAULT);
				return;
			case ScxmlPackage.SEND__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.SEND__IDLOCATION:
				setIdlocation(IDLOCATION_EDEFAULT);
				return;
			case ScxmlPackage.SEND__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case ScxmlPackage.SEND__DELAYEXPR:
				setDelayexpr(DELAYEXPR_EDEFAULT);
				return;
			case ScxmlPackage.SEND__NAMELIST:
				setNamelist(NAMELIST_EDEFAULT);
				return;
			case ScxmlPackage.SEND__HINTS:
				setHints(HINTS_EDEFAULT);
				return;
			case ScxmlPackage.SEND__HINTSEXPR:
				setHintsexpr(HINTSEXPR_EDEFAULT);
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
			case ScxmlPackage.SEND__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
			case ScxmlPackage.SEND__EVENTEXPR:
				return EVENTEXPR_EDEFAULT == null ? eventexpr != null : !EVENTEXPR_EDEFAULT.equals(eventexpr);
			case ScxmlPackage.SEND__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case ScxmlPackage.SEND__TARGETEXPR:
				return TARGETEXPR_EDEFAULT == null ? targetexpr != null : !TARGETEXPR_EDEFAULT.equals(targetexpr);
			case ScxmlPackage.SEND__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ScxmlPackage.SEND__TYPEEXPR:
				return TYPEEXPR_EDEFAULT == null ? typeexpr != null : !TYPEEXPR_EDEFAULT.equals(typeexpr);
			case ScxmlPackage.SEND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.SEND__IDLOCATION:
				return IDLOCATION_EDEFAULT == null ? idlocation != null : !IDLOCATION_EDEFAULT.equals(idlocation);
			case ScxmlPackage.SEND__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case ScxmlPackage.SEND__DELAYEXPR:
				return DELAYEXPR_EDEFAULT == null ? delayexpr != null : !DELAYEXPR_EDEFAULT.equals(delayexpr);
			case ScxmlPackage.SEND__NAMELIST:
				return NAMELIST_EDEFAULT == null ? namelist != null : !NAMELIST_EDEFAULT.equals(namelist);
			case ScxmlPackage.SEND__HINTS:
				return HINTS_EDEFAULT == null ? hints != null : !HINTS_EDEFAULT.equals(hints);
			case ScxmlPackage.SEND__HINTSEXPR:
				return HINTSEXPR_EDEFAULT == null ? hintsexpr != null : !HINTSEXPR_EDEFAULT.equals(hintsexpr);
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
		result.append(" (event: ");
		result.append(event);
		result.append(", eventexpr: ");
		result.append(eventexpr);
		result.append(", target: ");
		result.append(target);
		result.append(", targetexpr: ");
		result.append(targetexpr);
		result.append(", type: ");
		result.append(type);
		result.append(", typeexpr: ");
		result.append(typeexpr);
		result.append(", id: ");
		result.append(id);
		result.append(", idlocation: ");
		result.append(idlocation);
		result.append(", delay: ");
		result.append(delay);
		result.append(", delayexpr: ");
		result.append(delayexpr);
		result.append(", namelist: ");
		result.append(namelist);
		result.append(", hints: ");
		result.append(hints);
		result.append(", hintsexpr: ");
		result.append(hintsexpr);
		result.append(')');
		return result.toString();
	}

} //SendImpl
