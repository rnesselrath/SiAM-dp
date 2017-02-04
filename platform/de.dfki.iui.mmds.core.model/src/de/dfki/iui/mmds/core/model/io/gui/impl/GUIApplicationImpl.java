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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.Modality;
import de.dfki.iui.mmds.core.model.base.StyleSheet;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.Window;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GUI Application</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl#getStyleResource <em>Style Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIApplicationImpl extends BObjectImpl implements GUIApplication {
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
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected Window window;

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
	 * The cached value of the '{@link #getStyleResource() <em>Style Resource</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStyleResource()
	 * @generated
	 * @ordered
	 */
	protected StyleSheet styleResource;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.GUI_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__BEGIN_TIME, oldBeginTime, beginTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Window getWindow() {
		if (window != null && window.eIsProxy()) {
			InternalEObject oldWindow = (InternalEObject)window;
			window = (Window)eResolveProxy(oldWindow);
			if (window != oldWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.GUI_APPLICATION__WINDOW, oldWindow, window));
			}
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Window basicGetWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindow(Window newWindow) {
		Window oldWindow = window;
		window = newWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__WINDOW, oldWindow, window));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__APPLICATION_ID, oldApplicationId, applicationId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheet getStyleResource() {
		if (styleResource != null && styleResource.eIsProxy()) {
			InternalEObject oldStyleResource = (InternalEObject)styleResource;
			styleResource = (StyleSheet)eResolveProxy(oldStyleResource);
			if (styleResource != oldStyleResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.GUI_APPLICATION__STYLE_RESOURCE, oldStyleResource, styleResource));
			}
		}
		return styleResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet basicGetStyleResource() {
		return styleResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleResource(StyleSheet newStyleResource) {
		StyleSheet oldStyleResource = styleResource;
		styleResource = newStyleResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GUI_APPLICATION__STYLE_RESOURCE, oldStyleResource, styleResource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.GUI_APPLICATION__DEVICE:
				return getDevice();
			case GuiPackage.GUI_APPLICATION__SERVICE_INSTANCE:
				return getServiceInstance();
			case GuiPackage.GUI_APPLICATION__SERVICE_NAME:
				return getServiceName();
			case GuiPackage.GUI_APPLICATION__BEGIN_TIME:
				return getBeginTime();
			case GuiPackage.GUI_APPLICATION__DURATION:
				return getDuration();
			case GuiPackage.GUI_APPLICATION__LANGUAGE:
				return getLanguage();
			case GuiPackage.GUI_APPLICATION__USER_ALIAS:
				return getUserAlias();
			case GuiPackage.GUI_APPLICATION__WINDOW:
				if (resolve) return getWindow();
				return basicGetWindow();
			case GuiPackage.GUI_APPLICATION__APPLICATION_ID:
				return getApplicationId();
			case GuiPackage.GUI_APPLICATION__STYLE_RESOURCE:
				if (resolve) return getStyleResource();
				return basicGetStyleResource();
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
			case GuiPackage.GUI_APPLICATION__DEVICE:
				setDevice((BString)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__DURATION:
				setDuration((Long)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__WINDOW:
				setWindow((Window)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__APPLICATION_ID:
				setApplicationId((BString)newValue);
				return;
			case GuiPackage.GUI_APPLICATION__STYLE_RESOURCE:
				setStyleResource((StyleSheet)newValue);
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
			case GuiPackage.GUI_APPLICATION__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__WINDOW:
				setWindow((Window)null);
				return;
			case GuiPackage.GUI_APPLICATION__APPLICATION_ID:
				setApplicationId(APPLICATION_ID_EDEFAULT);
				return;
			case GuiPackage.GUI_APPLICATION__STYLE_RESOURCE:
				setStyleResource((StyleSheet)null);
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
			case GuiPackage.GUI_APPLICATION__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case GuiPackage.GUI_APPLICATION__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case GuiPackage.GUI_APPLICATION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case GuiPackage.GUI_APPLICATION__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case GuiPackage.GUI_APPLICATION__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case GuiPackage.GUI_APPLICATION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GuiPackage.GUI_APPLICATION__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case GuiPackage.GUI_APPLICATION__WINDOW:
				return window != null;
			case GuiPackage.GUI_APPLICATION__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case GuiPackage.GUI_APPLICATION__STYLE_RESOURCE:
				return styleResource != null;
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
		result.append(')');
		return result.toString();
	}

} // GUIApplicationImpl
