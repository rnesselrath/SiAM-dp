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
package de.dfki.iui.mmds.core.model.io_interfaces.impl;

import de.dfki.iui.mmds.core.model.io_interfaces.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Io_interfacesFactoryImpl extends EFactoryImpl implements Io_interfacesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Io_interfacesFactory init() {
		try {
			Io_interfacesFactory theIo_interfacesFactory = (Io_interfacesFactory)EPackage.Registry.INSTANCE.getEFactory(Io_interfacesPackage.eNS_URI);
			if (theIo_interfacesFactory != null) {
				return theIo_interfacesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Io_interfacesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Io_interfacesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Io_interfacesPackage.ACOUSTIC_EVENT: return createAcousticEvent();
			case Io_interfacesPackage.HAND_GESTURE: return createHandGesture();
			case Io_interfacesPackage.BODY_GESTURE: return createBodyGesture();
			case Io_interfacesPackage.EYE_GAZE: return createEyeGaze();
			case Io_interfacesPackage.HEAD_GESTURE: return createHeadGesture();
			case Io_interfacesPackage.POINTING_GESTURE: return createPointingGesture();
			case Io_interfacesPackage.SPEECH: return createSpeech();
			case Io_interfacesPackage.SPEECH_SYNTHESIS: return createSpeechSynthesis();
			case Io_interfacesPackage.AUDIO_TRACK: return createAudioTrack();
			case Io_interfacesPackage.VIRTUAL_CHARACTER: return createVirtualCharacter();
			case Io_interfacesPackage.EYE_DATA: return createEyeData();
			case Io_interfacesPackage.WORD: return createWord();
			case Io_interfacesPackage.THERMOMETER: return createThermometer();
			case Io_interfacesPackage.PULSE_MONITOR: return createPulseMonitor();
			case Io_interfacesPackage.LAMP_CONTROL: return createLampControl();
			case Io_interfacesPackage.VENTILATOR_CONTROL: return createVentilatorControl();
			case Io_interfacesPackage.TANGIBLE: return createTangible();
			case Io_interfacesPackage.SPEECH_FEATURES: return createSpeechFeatures();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Io_interfacesPackage.SPEECH_RECOGNITION_PROBLEM:
				return createSpeechRecognitionProblemFromString(eDataType, initialValue);
			case Io_interfacesPackage.CAMERA:
				return createCameraFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Io_interfacesPackage.SPEECH_RECOGNITION_PROBLEM:
				return convertSpeechRecognitionProblemToString(eDataType, instanceValue);
			case Io_interfacesPackage.CAMERA:
				return convertCameraToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcousticEvent createAcousticEvent() {
		AcousticEventImpl acousticEvent = new AcousticEventImpl();
		return acousticEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandGesture createHandGesture() {
		HandGestureImpl handGesture = new HandGestureImpl();
		return handGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyGesture createBodyGesture() {
		BodyGestureImpl bodyGesture = new BodyGestureImpl();
		return bodyGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeGaze createEyeGaze() {
		EyeGazeImpl eyeGaze = new EyeGazeImpl();
		return eyeGaze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadGesture createHeadGesture() {
		HeadGestureImpl headGesture = new HeadGestureImpl();
		return headGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointingGesture createPointingGesture() {
		PointingGestureImpl pointingGesture = new PointingGestureImpl();
		return pointingGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speech createSpeech() {
		SpeechImpl speech = new SpeechImpl();
		return speech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechSynthesis createSpeechSynthesis() {
		SpeechSynthesisImpl speechSynthesis = new SpeechSynthesisImpl();
		return speechSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioTrack createAudioTrack() {
		AudioTrackImpl audioTrack = new AudioTrackImpl();
		return audioTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualCharacter createVirtualCharacter() {
		VirtualCharacterImpl virtualCharacter = new VirtualCharacterImpl();
		return virtualCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeData createEyeData() {
		EyeDataImpl eyeData = new EyeDataImpl();
		return eyeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Word createWord() {
		WordImpl word = new WordImpl();
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thermometer createThermometer() {
		ThermometerImpl thermometer = new ThermometerImpl();
		return thermometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseMonitor createPulseMonitor() {
		PulseMonitorImpl pulseMonitor = new PulseMonitorImpl();
		return pulseMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LampControl createLampControl() {
		LampControlImpl lampControl = new LampControlImpl();
		return lampControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VentilatorControl createVentilatorControl() {
		VentilatorControlImpl ventilatorControl = new VentilatorControlImpl();
		return ventilatorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tangible createTangible() {
		TangibleImpl tangible = new TangibleImpl();
		return tangible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechFeatures createSpeechFeatures() {
		SpeechFeaturesImpl speechFeatures = new SpeechFeaturesImpl();
		return speechFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechRecognitionProblem createSpeechRecognitionProblemFromString(EDataType eDataType, String initialValue) {
		SpeechRecognitionProblem result = SpeechRecognitionProblem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechRecognitionProblemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCameraFromString(EDataType eDataType, String initialValue) {
		Camera result = Camera.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCameraToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Io_interfacesPackage getIo_interfacesPackage() {
		return (Io_interfacesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Io_interfacesPackage getPackage() {
		return Io_interfacesPackage.eINSTANCE;
	}

} //Io_interfacesFactoryImpl
