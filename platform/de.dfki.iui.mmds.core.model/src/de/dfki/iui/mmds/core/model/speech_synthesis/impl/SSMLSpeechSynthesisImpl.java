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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence.NonContainmentReferenceHandling;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.speech_synthesis.SSML;
import de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>SSML Speech Synthesis</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getSsml <em>Ssml</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl#getSsmlDocument <em>Ssml Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSMLSpeechSynthesisImpl extends BObjectImpl implements SSMLSpeechSynthesis {
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
	 * The default value of the '{@link #getSsml() <em>Ssml</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSsml()
	 * @generated
	 * @ordered
	 */
	protected static final BString SSML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsml() <em>Ssml</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSsml()
	 * @generated
	 * @ordered
	 */
	protected BString ssml = SSML_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SSMLSpeechSynthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.SSML_SPEECH_SYNTHESIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE, oldServiceInstance, serviceInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBeginTime() {
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginTime(Long newBeginTime) {
		Long oldBeginTime = beginTime;
		beginTime = newBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__BEGIN_TIME, oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Long newDuration) {
		Long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BString getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(BString newLanguage) {
		BString oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BString getUserAlias() {
		return userAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAlias(BString newUserAlias) {
		BString oldUserAlias = userAlias;
		userAlias = newUserAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public BString getSsml() {
		if (ssml != null && ssml.toString().startsWith("$expr"))
			return ssml;
		if (ssmlDocumentCache != null && ssmlDocumentCache.getSpeak() != null) {
			this.ssml = documentToString(ssmlDocumentCache);
		} else if (ssmlChanged)
			return ssml;
		else {
			ssml = null;
		}
		return ssml;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setSsml(BString newSsml) {
		setSsml(newSsml, true);
	}

	private void setSsml(BString newSsml, boolean buildDocument) {
		if (newSsml != null && newSsml.toString().isEmpty()) {
			newSsml = null;
		}
		BString oldSsml = ssml;
		ssml = newSsml;
		if (buildDocument) {
			SSML oldSsmlDocument = ssmlDocumentCache;
			ssmlChanged = true;

			if (eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT, oldSsmlDocument, ssmlDocumentCache));
			}
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML, oldSsml, ssml));
		}
	}

	SSML ssmlDocumentCache = null;
	private boolean ssmlChanged = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public SSML getSsmlDocument() {
		if (ssmlChanged) {
			ssmlDocumentCache = ssml == null ? null : stringToDocument(ssml.toString());
			ssmlChanged = false;
		}
		return ssmlDocumentCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setSsmlDocument(SSML newSsmlDocument) {
		if (newSsmlDocument != null && newSsmlDocument.getSpeak() == null) {
			newSsmlDocument.setSpeak(SpeechSynthesisFactory.eINSTANCE.createSpeak());
		}
		newSsmlDocument.getSpeak().setVersion("1.0");
		SSML oldSsmlDocument = ssmlDocumentCache;
		ssmlDocumentCache = newSsmlDocument;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT, oldSsmlDocument, ssmlDocumentCache));
		}
		ssmlChanged = false;
		setSsml(documentToString(newSsmlDocument), false);
	}

	private BString documentToString(SSML document) {
		if (document != null && document.getSpeak() != null) {
			try {
				HashMap<String, Object> options = new HashMap<String, Object>();
				options.put(XMIResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);
				options.put(XMIResource.OPTION_DECLARE_XML, Boolean.FALSE);
				options.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE);
				String ssml = EmfPersistence.writeToString(getSsmlDocument(), NonContainmentReferenceHandling.ADD_TO_RESOURCE, options);
				ssml = ssml.replace("speech_synthesis:", "");
				// ssml =
				// ssml.replace("xmlns:speech_synthesis=\"http://www.w3.org/2001/10/synthesis\"",
				// "xmlns=\"http://www.w3.org/2001/10/synthesis\"
				// version=\"1.0\"");
				ssml = ssml.replace("volume=\"+0.0dB\"", "");
				return new BString(ssml);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private SSML stringToDocument(String ssml) {
		if (ssml == null || ssml.toString().startsWith("$expr"))
			return null;
		try {
			Resource readFromString;
			if (ssml.startsWith("<speak")) {
				ssml = ssml.replaceAll("<(?![/!])", "<speech_synthesis:");
				ssml = ssml.replaceAll("</", "</speech_synthesis:");
				ssml = ssml.replaceAll("xmlns=\"http://www.w3.org/2001/10/synthesis\"", "xmlns:speech_synthesis=\"http://www.w3.org/2001/10/synthesis\"");
				ssml = ssml.replaceAll("speech_synthesis:break", "break");
				ssml = ssml.replaceAll("speech_synthesis:a", "a");
				readFromString = EmfPersistence.readFromString(ssml);
			} else {
				readFromString = EmfPersistence.readFromString(ssml.toString());
			}
			SSML result = (SSML) readFromString.getContents().get(0);
			result.getSpeak().setVersion("1.0");
			return result;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DEVICE:
				return getDevice();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE:
				return getServiceInstance();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_NAME:
				return getServiceName();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__BEGIN_TIME:
				return getBeginTime();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DURATION:
				return getDuration();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__LANGUAGE:
				return getLanguage();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__USER_ALIAS:
				return getUserAlias();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML:
				return getSsml();
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT:
				return getSsmlDocument();
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
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DEVICE:
				setDevice((BString)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE:
				setServiceInstance((String)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DURATION:
				setDuration((Long)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__LANGUAGE:
				setLanguage((BString)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__USER_ALIAS:
				setUserAlias((BString)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML:
				setSsml((BString)newValue);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT:
				setSsmlDocument((SSML)newValue);
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
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE:
				setServiceInstance(SERVICE_INSTANCE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML:
				setSsml(SSML_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT:
				setSsmlDocument((SSML)null);
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
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE:
				return SERVICE_INSTANCE_EDEFAULT == null ? serviceInstance != null : !SERVICE_INSTANCE_EDEFAULT.equals(serviceInstance);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML:
				return SSML_EDEFAULT == null ? ssml != null : !SSML_EDEFAULT.equals(ssml);
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT:
				return getSsmlDocument() != null;
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
		result.append(", ssml: ");
		result.append(ssml);
		result.append(')');
		return result.toString();
	}

} // SSMLSpeechSynthesisImpl
