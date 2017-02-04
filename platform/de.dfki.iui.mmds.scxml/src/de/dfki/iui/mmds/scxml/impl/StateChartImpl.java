/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.scxml.AbstractSimpleState;
import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.DatamodelContainer;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.DescriptionContainer;
import de.dfki.iui.mmds.scxml.ExmodeDatatype;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.InitialState;
import de.dfki.iui.mmds.scxml.Script;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.TransitionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getInitial1 <em>Initial1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getExmode <em>Exmode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateChartImpl extends AbstractStateImpl implements StateChart {
	/**
	 * The cached value of the '{@link #getInitial1() <em>Initial1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial1()
	 * @generated
	 * @ordered
	 */
	protected TransitionTarget initial1;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected InitialState initial;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalState> final_;

	/**
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected Datamodel datamodel;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The default value of the '{@link #getXmlns() <em>Xmlns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlns()
	 * @generated
	 * @ordered
	 */
	protected static final String XMLNS_EDEFAULT = "http://www.w3.org/2005/07/scxml";

	/**
	 * The cached value of the '{@link #getXmlns() <em>Xmlns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlns()
	 * @generated
	 * @ordered
	 */
	protected String xmlns = XMLNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VERSION_EDEFAULT = new BigDecimal("1.0");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = "ecmascript";

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExmode() <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExmode()
	 * @generated
	 * @ordered
	 */
	protected static final ExmodeDatatype EXMODE_EDEFAULT = ExmodeDatatype.LAX;

	/**
	 * The cached value of the '{@link #getExmode() <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExmode()
	 * @generated
	 * @ordered
	 */
	protected ExmodeDatatype exmode = EXMODE_EDEFAULT;

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
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.STATE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionTarget getInitial1() {
		return initial1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial1(TransitionTarget newInitial1) {
		TransitionTarget oldInitial1 = initial1;
		initial1 = newInitial1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__INITIAL1, oldInitial1, initial1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(InitialState newInitial, NotificationChain msgs) {
		InitialState oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(InitialState newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinal() {
		if (final_ == null) {
			final_ = new EObjectContainmentEList<FinalState>(FinalState.class, this, ScxmlPackage.STATE_CHART__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datamodel getDatamodel() {
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatamodel(Datamodel newDatamodel, NotificationChain msgs) {
		Datamodel oldDatamodel = datamodel;
		datamodel = newDatamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__DATAMODEL, oldDatamodel, newDatamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatamodel(Datamodel newDatamodel) {
		if (newDatamodel != datamodel) {
			NotificationChain msgs = null;
			if (datamodel != null)
				msgs = ((InternalEObject)datamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__DATAMODEL, null, msgs);
			if (newDatamodel != null)
				msgs = ((InternalEObject)newDatamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__DATAMODEL, null, msgs);
			msgs = basicSetDatamodel(newDatamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__DATAMODEL, newDatamodel, newDatamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Script> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<Script>(Script.class, this, ScxmlPackage.STATE_CHART__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigDecimal newVersion) {
		BigDecimal oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExmodeDatatype getExmode() {
		return exmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExmode(ExmodeDatatype newExmode) {
		ExmodeDatatype oldExmode = exmode;
		exmode = newExmode == null ? EXMODE_EDEFAULT : newExmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__EXMODE, oldExmode, exmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE_CHART__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE_CHART__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.STATE_CHART__INITIAL:
				return basicSetInitial(null, msgs);
			case ScxmlPackage.STATE_CHART__FINAL:
				return ((InternalEList<?>)getFinal()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE_CHART__DATAMODEL:
				return basicSetDatamodel(null, msgs);
			case ScxmlPackage.STATE_CHART__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ScxmlPackage.STATE_CHART__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.STATE_CHART__INITIAL1:
				return getInitial1();
			case ScxmlPackage.STATE_CHART__INITIAL:
				return getInitial();
			case ScxmlPackage.STATE_CHART__FINAL:
				return getFinal();
			case ScxmlPackage.STATE_CHART__DATAMODEL:
				return getDatamodel();
			case ScxmlPackage.STATE_CHART__DESCRIPTION:
				return getDescription();
			case ScxmlPackage.STATE_CHART__XMLNS:
				return getXmlns();
			case ScxmlPackage.STATE_CHART__VERSION:
				return getVersion();
			case ScxmlPackage.STATE_CHART__PROFILE:
				return getProfile();
			case ScxmlPackage.STATE_CHART__EXMODE:
				return getExmode();
			case ScxmlPackage.STATE_CHART__ID:
				return getId();
			case ScxmlPackage.STATE_CHART__SCRIPT:
				return getScript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScxmlPackage.STATE_CHART__INITIAL1:
				setInitial1((TransitionTarget)newValue);
				return;
			case ScxmlPackage.STATE_CHART__INITIAL:
				setInitial((InitialState)newValue);
				return;
			case ScxmlPackage.STATE_CHART__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends FinalState>)newValue);
				return;
			case ScxmlPackage.STATE_CHART__DATAMODEL:
				setDatamodel((Datamodel)newValue);
				return;
			case ScxmlPackage.STATE_CHART__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case ScxmlPackage.STATE_CHART__VERSION:
				setVersion((BigDecimal)newValue);
				return;
			case ScxmlPackage.STATE_CHART__PROFILE:
				setProfile((String)newValue);
				return;
			case ScxmlPackage.STATE_CHART__EXMODE:
				setExmode((ExmodeDatatype)newValue);
				return;
			case ScxmlPackage.STATE_CHART__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.STATE_CHART__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends Script>)newValue);
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
			case ScxmlPackage.STATE_CHART__INITIAL1:
				setInitial1((TransitionTarget)null);
				return;
			case ScxmlPackage.STATE_CHART__INITIAL:
				setInitial((InitialState)null);
				return;
			case ScxmlPackage.STATE_CHART__FINAL:
				getFinal().clear();
				return;
			case ScxmlPackage.STATE_CHART__DATAMODEL:
				setDatamodel((Datamodel)null);
				return;
			case ScxmlPackage.STATE_CHART__DESCRIPTION:
				setDescription((Description)null);
				return;
			case ScxmlPackage.STATE_CHART__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ScxmlPackage.STATE_CHART__PROFILE:
				setProfile(PROFILE_EDEFAULT);
				return;
			case ScxmlPackage.STATE_CHART__EXMODE:
				setExmode(EXMODE_EDEFAULT);
				return;
			case ScxmlPackage.STATE_CHART__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.STATE_CHART__SCRIPT:
				getScript().clear();
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
			case ScxmlPackage.STATE_CHART__INITIAL1:
				return initial1 != null;
			case ScxmlPackage.STATE_CHART__INITIAL:
				return initial != null;
			case ScxmlPackage.STATE_CHART__FINAL:
				return final_ != null && !final_.isEmpty();
			case ScxmlPackage.STATE_CHART__DATAMODEL:
				return datamodel != null;
			case ScxmlPackage.STATE_CHART__DESCRIPTION:
				return description != null;
			case ScxmlPackage.STATE_CHART__XMLNS:
				return XMLNS_EDEFAULT == null ? xmlns != null : !XMLNS_EDEFAULT.equals(xmlns);
			case ScxmlPackage.STATE_CHART__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ScxmlPackage.STATE_CHART__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
			case ScxmlPackage.STATE_CHART__EXMODE:
				return exmode != EXMODE_EDEFAULT;
			case ScxmlPackage.STATE_CHART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.STATE_CHART__SCRIPT:
				return script != null && !script.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractSimpleState.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE_CHART__INITIAL1: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1;
				case ScxmlPackage.STATE_CHART__INITIAL: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL;
				case ScxmlPackage.STATE_CHART__FINAL: return ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL;
				default: return -1;
			}
		}
		if (baseClass == IAdaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DatamodelContainer.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE_CHART__DATAMODEL: return ScxmlPackage.DATAMODEL_CONTAINER__DATAMODEL;
				default: return -1;
			}
		}
		if (baseClass == DescriptionContainer.class) {
			switch (derivedFeatureID) {
				case ScxmlPackage.STATE_CHART__DESCRIPTION: return ScxmlPackage.DESCRIPTION_CONTAINER__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractSimpleState.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL1: return ScxmlPackage.STATE_CHART__INITIAL1;
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__INITIAL: return ScxmlPackage.STATE_CHART__INITIAL;
				case ScxmlPackage.ABSTRACT_SIMPLE_STATE__FINAL: return ScxmlPackage.STATE_CHART__FINAL;
				default: return -1;
			}
		}
		if (baseClass == IAdaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DatamodelContainer.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.DATAMODEL_CONTAINER__DATAMODEL: return ScxmlPackage.STATE_CHART__DATAMODEL;
				default: return -1;
			}
		}
		if (baseClass == DescriptionContainer.class) {
			switch (baseFeatureID) {
				case ScxmlPackage.DESCRIPTION_CONTAINER__DESCRIPTION: return ScxmlPackage.STATE_CHART__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (xmlns: ");
		result.append(xmlns);
		result.append(", version: ");
		result.append(version);
		result.append(", profile: ");
		result.append(profile);
		result.append(", exmode: ");
		result.append(exmode);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == Data.class ) {
			return getDatamodel();
		} else if (adapter == Description.class ) {
			return getDescription();
		} else if ( adapter == String.class ) {
			Map< String, EObject > result = new HashMap< String, EObject >();
			result.put( AdapterToken.DATAMODEL.getLiteral(), getDatamodel() );
			result.put( AdapterToken.DESCRIPTION.getLiteral(), getDescription() );
			return result;
		}
		return null;
	}

} //StateChartImpl
