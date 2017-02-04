/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
/**
 */
package de.dfki.iui.mmds.core.model.io.gui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.Modality;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.gui.GUIUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UpdateInfo;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GUI Update</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl#isValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIUpdateImpl extends BObjectImpl implements GUIUpdate {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final BString DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected BString device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstance() <em>Service Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstance() <em>Service Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstance()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstance = SERVICE_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModality()
	 * @generated NOT
	 * @ordered
	 */
	protected static final BString MODALITY_EDEFAULT = Modality.GUI;

	/**
	 * The default value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long BEGIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected Long beginTime = BEGIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Long DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BString LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected BString language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected static final BString USER_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected BString userAlias = USER_ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateInfo> updates;

	/**
	 * The default value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final BString APPLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected BString applicationId = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isValidated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isValidated()
	 * @generated
	 * @ordered
	 */
	protected boolean validated = VALIDATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.GUI_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(BString newDevice) {
		BString oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstance() {
		return serviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstance(String newServiceInstance) {
		String oldServiceInstance = serviceInstance;
		serviceInstance = newServiceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBeginTime() {
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginTime(Long newBeginTime) {
		Long oldBeginTime = beginTime;
		beginTime = newBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__BEGIN_TIME, oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Long newDuration) {
		Long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(BString newLanguage) {
		BString oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getUserAlias() {
		return userAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAlias(BString newUserAlias) {
		BString oldUserAlias = userAlias;
		userAlias = newUserAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UpdateInfo> getUpdates() {
		if (updates == null) {
			updates = new EObjectContainmentEList<UpdateInfo>(UpdateInfo.class, this, GuiPackage.GUI_UPDATE__UPDATES);
		}
		return updates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getApplicationId() {
		return applicationId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationId(BString newApplicationId) {
		BString oldApplicationId = applicationId;
		applicationId = newApplicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__APPLICATION_ID, oldApplicationId, applicationId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidated(boolean newValidated) {
		boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_UPDATE__VALIDATED, oldValidated, validated));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.GUI_UPDATE__UPDATES:
				return ((InternalEList<?>)getUpdates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.GUI_UPDATE__DEVICE:
				return getDevice();
			case GuiPackage.GUI_UPDATE__SERVICE_INSTANCE:
				return getServiceInstance();
			case GuiPackage.GUI_UPDATE__SERVICE_NAME:
				return getServiceName();
			case GuiPackage.GUI_UPDATE__BEGIN_TIME:
				return getBeginTime();
			case GuiPackage.GUI_UPDATE__DURATION:
				return getDuration();
			case GuiPackage.GUI_UPDATE__LANGUAGE:
				return getLanguage();
			case GuiPackage.GUI_UPDATE__USER_ALIAS:
				return getUserAlias();
			case GuiPackage.GUI_UPDATE__UPDATES:
				return getUpdates();
			case GuiPackage.GUI_UPDATE__APPLICATION_ID:
				return getApplicationId();
			case GuiPackage.GUI_UPDATE__VALIDATED:
				return isValidated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.GUI_UPDATE__DEVICE:
				setDevice((BString)newValue);
				return;
			case GuiPackage.GUI_UPDATE__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case GuiPackage.GUI_UPDATE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case GuiPackage.GUI_UPDATE__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case GuiPackage.GUI_UPDATE__DURATION:
				setDuration((Long)newValue);
				return;
			case GuiPackage.GUI_UPDATE__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case GuiPackage.GUI_UPDATE__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case GuiPackage.GUI_UPDATE__UPDATES:
				getUpdates().clear();
				getUpdates().addAll((Collection<? extends UpdateInfo>)newValue);
				return;
			case GuiPackage.GUI_UPDATE__APPLICATION_ID:
				setApplicationId((BString)newValue);
				return;
			case GuiPackage.GUI_UPDATE__VALIDATED:
				setValidated((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuiPackage.GUI_UPDATE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__UPDATES:
				getUpdates().clear();
				return;
			case GuiPackage.GUI_UPDATE__APPLICATION_ID:
				setApplicationId(APPLICATION_ID_EDEFAULT);
				return;
			case GuiPackage.GUI_UPDATE__VALIDATED:
				setValidated(VALIDATED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuiPackage.GUI_UPDATE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case GuiPackage.GUI_UPDATE__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case GuiPackage.GUI_UPDATE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case GuiPackage.GUI_UPDATE__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case GuiPackage.GUI_UPDATE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case GuiPackage.GUI_UPDATE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GuiPackage.GUI_UPDATE__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case GuiPackage.GUI_UPDATE__UPDATES:
				return updates != null && !updates.isEmpty();
			case GuiPackage.GUI_UPDATE__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case GuiPackage.GUI_UPDATE__VALIDATED:
				return validated != VALIDATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (device: ");
		result.append(device);
		result.append(", serviceInstance: ");
		result.append(serviceInstance);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", beginTime: ");
		result.append(beginTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(", language: ");
		result.append(language);
		result.append(", userAlias: ");
		result.append(userAlias);
		result.append(", applicationId: ");
		result.append(applicationId);
		result.append(", validated: ");
		result.append(validated);
		result.append(')');
		return result.toString();
	}

} // GUIUpdateImpl
