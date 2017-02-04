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
package de.dfki.iui.mmds.core.model.io.impl;

import de.dfki.iui.mmds.core.model.io.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IoFactoryImpl extends EFactoryImpl implements IoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static IoFactory init() {
		try {
			IoFactory theIoFactory = (IoFactory)EPackage.Registry.INSTANCE.getEFactory(IoPackage.eNS_URI);
			if (theIoFactory != null) {
				return theIoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoPackage.SERVICE_INSTANCE: return createServiceInstance();
			case IoPackage.COMPOUND_SERVICE: return createCompoundService();
			case IoPackage.SIMPLE_SERVICE: return createSimpleService();
			case IoPackage.TCP_SERVER: return createTCPServer();
			case IoPackage.TECS_DIRECT_SERVICE: return createTECSDirectService();
			case IoPackage.HTML_SERVLET: return createHtmlServlet();
			case IoPackage.SIP_CONNECTION: return createSipConnection();
			case IoPackage.OSGI_BUNDLE: return createOSGIBundle();
			case IoPackage.DEVICE: return createDevice();
			case IoPackage.HARDWARE: return createHardware();
			case IoPackage.IO_EVENT: return createIOEvent();
			case IoPackage.CUSTOM_MESSAGE: return createCustomMessage();
			case IoPackage.UPDATE_DEVICE_MODE: return createUpdateDeviceMode();
			case IoPackage.DEVICE_STATE_CHANGED: return createDeviceStateChanged();
			case IoPackage.INPUT_ACT: return createInputAct();
			case IoPackage.OUTPUT_ACT: return createOutputAct();
			case IoPackage.HYPOTHESIS: return createHypothesis();
			case IoPackage.SPEECH_HYPOTHESIS: return createSpeechHypothesis();
			case IoPackage.GESTURE_HYPOTHESIS: return createGestureHypothesis();
			case IoPackage.POINTING_HYPOTHESIS: return createPointingHypothesis();
			case IoPackage.CUSTOM_FORMAT: return createCustomFormat();
			case IoPackage.CANCEL_PRESENTATION: return createCancelPresentation();
			case IoPackage.PRESENTATION_STATE: return createPresentationState();
			case IoPackage.UPDATE_GRAMMAR: return createUpdateGrammar();
			case IoPackage.SPEECH_RECOGNIZER_STATE: return createSpeechRecognizerState();
			case IoPackage.SPEECH_RECOGNIZER_MODE: return createSpeechRecognizerMode();
			case IoPackage.SPEECH_SYNTHESIS_STATE: return createSpeechSynthesisState();
			case IoPackage.ACTIVE_GESTURES: return createActiveGestures();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IoPackage.PRESENTATION_STATE_ENUM:
				return createPresentationStateEnumFromString(eDataType, initialValue);
			case IoPackage.SPEECH_RECOGNIZER_STATE_ENUM:
				return createSpeechRecognizerStateEnumFromString(eDataType, initialValue);
			case IoPackage.SPEECH_RECOGNIZER_MODE_ENUM:
				return createSpeechRecognizerModeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IoPackage.PRESENTATION_STATE_ENUM:
				return convertPresentationStateEnumToString(eDataType, instanceValue);
			case IoPackage.SPEECH_RECOGNIZER_STATE_ENUM:
				return convertSpeechRecognizerStateEnumToString(eDataType, instanceValue);
			case IoPackage.SPEECH_RECOGNIZER_MODE_ENUM:
				return convertSpeechRecognizerModeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstance createServiceInstance() {
		ServiceInstanceImpl serviceInstance = new ServiceInstanceImpl();
		return serviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundService createCompoundService() {
		CompoundServiceImpl compoundService = new CompoundServiceImpl();
		return compoundService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleService createSimpleService() {
		SimpleServiceImpl simpleService = new SimpleServiceImpl();
		return simpleService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPServer createTCPServer() {
		TCPServerImpl tcpServer = new TCPServerImpl();
		return tcpServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TECSDirectService createTECSDirectService() {
		TECSDirectServiceImpl tecsDirectService = new TECSDirectServiceImpl();
		return tecsDirectService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlServlet createHtmlServlet() {
		HtmlServletImpl htmlServlet = new HtmlServletImpl();
		return htmlServlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SipConnection createSipConnection() {
		SipConnectionImpl sipConnection = new SipConnectionImpl();
		return sipConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGIBundle createOSGIBundle() {
		OSGIBundleImpl osgiBundle = new OSGIBundleImpl();
		return osgiBundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOEvent createIOEvent() {
		IOEventImpl ioEvent = new IOEventImpl();
		return ioEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMessage createCustomMessage() {
		CustomMessageImpl customMessage = new CustomMessageImpl();
		return customMessage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateDeviceMode createUpdateDeviceMode() {
		UpdateDeviceModeImpl updateDeviceMode = new UpdateDeviceModeImpl();
		return updateDeviceMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStateChanged createDeviceStateChanged() {
		DeviceStateChangedImpl deviceStateChanged = new DeviceStateChangedImpl();
		return deviceStateChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputAct createInputAct() {
		InputActImpl inputAct = new InputActImpl();
		return inputAct;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputAct createOutputAct() {
		OutputActImpl outputAct = new OutputActImpl();
		return outputAct;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hypothesis createHypothesis() {
		HypothesisImpl hypothesis = new HypothesisImpl();
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechHypothesis createSpeechHypothesis() {
		SpeechHypothesisImpl speechHypothesis = new SpeechHypothesisImpl();
		return speechHypothesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestureHypothesis createGestureHypothesis() {
		GestureHypothesisImpl gestureHypothesis = new GestureHypothesisImpl();
		return gestureHypothesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointingHypothesis createPointingHypothesis() {
		PointingHypothesisImpl pointingHypothesis = new PointingHypothesisImpl();
		return pointingHypothesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomFormat createCustomFormat() {
		CustomFormatImpl customFormat = new CustomFormatImpl();
		return customFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelPresentation createCancelPresentation() {
		CancelPresentationImpl cancelPresentation = new CancelPresentationImpl();
		return cancelPresentation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationState createPresentationState() {
		PresentationStateImpl presentationState = new PresentationStateImpl();
		return presentationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateGrammar createUpdateGrammar() {
		UpdateGrammarImpl updateGrammar = new UpdateGrammarImpl();
		return updateGrammar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechRecognizerState createSpeechRecognizerState() {
		SpeechRecognizerStateImpl speechRecognizerState = new SpeechRecognizerStateImpl();
		return speechRecognizerState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechRecognizerMode createSpeechRecognizerMode() {
		SpeechRecognizerModeImpl speechRecognizerMode = new SpeechRecognizerModeImpl();
		return speechRecognizerMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechSynthesisState createSpeechSynthesisState() {
		SpeechSynthesisStateImpl speechSynthesisState = new SpeechSynthesisStateImpl();
		return speechSynthesisState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveGestures createActiveGestures() {
		ActiveGesturesImpl activeGestures = new ActiveGesturesImpl();
		return activeGestures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechRecognizerStateEnum createSpeechRecognizerStateEnumFromString(EDataType eDataType, String initialValue) {
		SpeechRecognizerStateEnum result = SpeechRecognizerStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechRecognizerStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechRecognizerModeEnum createSpeechRecognizerModeEnumFromString(EDataType eDataType, String initialValue) {
		SpeechRecognizerModeEnum result = SpeechRecognizerModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechRecognizerModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationStateEnum createPresentationStateEnumFromString(EDataType eDataType, String initialValue) {
		PresentationStateEnum result = PresentationStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoPackage getIoPackage() {
		return (IoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoPackage getPackage() {
		return IoPackage.eINSTANCE;
	}

} // IoFactoryImpl
