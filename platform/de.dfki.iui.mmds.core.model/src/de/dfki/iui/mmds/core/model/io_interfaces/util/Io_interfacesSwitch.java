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
package de.dfki.iui.mmds.core.model.io_interfaces.util;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;

import de.dfki.iui.mmds.core.model.io_interfaces.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage
 * @generated
 */
public class Io_interfacesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Io_interfacesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Io_interfacesSwitch() {
		if (modelPackage == null) {
			modelPackage = Io_interfacesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Io_interfacesPackage.SENSOR_INPUT: {
				SensorInput sensorInput = (SensorInput)theEObject;
				T result = caseSensorInput(sensorInput);
				if (result == null) result = caseInputRepresentation(sensorInput);
				if (result == null) result = caseIORepresentation(sensorInput);
				if (result == null) result = caseBObject(sensorInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.CONTROLLER_INPUT: {
				ControllerInput controllerInput = (ControllerInput)theEObject;
				T result = caseControllerInput(controllerInput);
				if (result == null) result = caseInputRepresentation(controllerInput);
				if (result == null) result = caseIORepresentation(controllerInput);
				if (result == null) result = caseBObject(controllerInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.RENDERER_OUTPUT: {
				RendererOutput rendererOutput = (RendererOutput)theEObject;
				T result = caseRendererOutput(rendererOutput);
				if (result == null) result = caseOutputRepresentation(rendererOutput);
				if (result == null) result = caseIORepresentation(rendererOutput);
				if (result == null) result = caseBObject(rendererOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.ACTUATOR_OUTPUT: {
				ActuatorOutput actuatorOutput = (ActuatorOutput)theEObject;
				T result = caseActuatorOutput(actuatorOutput);
				if (result == null) result = caseOutputRepresentation(actuatorOutput);
				if (result == null) result = caseIORepresentation(actuatorOutput);
				if (result == null) result = caseBObject(actuatorOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.ACOUSTIC_EVENT: {
				AcousticEvent acousticEvent = (AcousticEvent)theEObject;
				T result = caseAcousticEvent(acousticEvent);
				if (result == null) result = caseControllerInput(acousticEvent);
				if (result == null) result = caseInputRepresentation(acousticEvent);
				if (result == null) result = caseIORepresentation(acousticEvent);
				if (result == null) result = caseBObject(acousticEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.GESTURE: {
				Gesture gesture = (Gesture)theEObject;
				T result = caseGesture(gesture);
				if (result == null) result = caseControllerInput(gesture);
				if (result == null) result = caseInputRepresentation(gesture);
				if (result == null) result = caseIORepresentation(gesture);
				if (result == null) result = caseBObject(gesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.HAND_GESTURE: {
				HandGesture handGesture = (HandGesture)theEObject;
				T result = caseHandGesture(handGesture);
				if (result == null) result = caseGesture(handGesture);
				if (result == null) result = caseControllerInput(handGesture);
				if (result == null) result = caseInputRepresentation(handGesture);
				if (result == null) result = caseIORepresentation(handGesture);
				if (result == null) result = caseBObject(handGesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.BODY_GESTURE: {
				BodyGesture bodyGesture = (BodyGesture)theEObject;
				T result = caseBodyGesture(bodyGesture);
				if (result == null) result = caseGesture(bodyGesture);
				if (result == null) result = caseControllerInput(bodyGesture);
				if (result == null) result = caseInputRepresentation(bodyGesture);
				if (result == null) result = caseIORepresentation(bodyGesture);
				if (result == null) result = caseBObject(bodyGesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.EYE_GAZE: {
				EyeGaze eyeGaze = (EyeGaze)theEObject;
				T result = caseEyeGaze(eyeGaze);
				if (result == null) result = caseControllerInput(eyeGaze);
				if (result == null) result = caseInputRepresentation(eyeGaze);
				if (result == null) result = caseIORepresentation(eyeGaze);
				if (result == null) result = caseBObject(eyeGaze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.HEAD_GESTURE: {
				HeadGesture headGesture = (HeadGesture)theEObject;
				T result = caseHeadGesture(headGesture);
				if (result == null) result = caseGesture(headGesture);
				if (result == null) result = caseControllerInput(headGesture);
				if (result == null) result = caseInputRepresentation(headGesture);
				if (result == null) result = caseIORepresentation(headGesture);
				if (result == null) result = caseBObject(headGesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.POINTING_GESTURE: {
				PointingGesture pointingGesture = (PointingGesture)theEObject;
				T result = casePointingGesture(pointingGesture);
				if (result == null) result = caseGesture(pointingGesture);
				if (result == null) result = caseControllerInput(pointingGesture);
				if (result == null) result = caseInputRepresentation(pointingGesture);
				if (result == null) result = caseIORepresentation(pointingGesture);
				if (result == null) result = caseBObject(pointingGesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.SPEECH: {
				Speech speech = (Speech)theEObject;
				T result = caseSpeech(speech);
				if (result == null) result = caseControllerInput(speech);
				if (result == null) result = caseInputRepresentation(speech);
				if (result == null) result = caseIORepresentation(speech);
				if (result == null) result = caseBObject(speech);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.ISPEECH_SYNTHESIS: {
				ISpeechSynthesis iSpeechSynthesis = (ISpeechSynthesis)theEObject;
				T result = caseISpeechSynthesis(iSpeechSynthesis);
				if (result == null) result = caseRendererOutput(iSpeechSynthesis);
				if (result == null) result = caseOutputRepresentation(iSpeechSynthesis);
				if (result == null) result = caseIORepresentation(iSpeechSynthesis);
				if (result == null) result = caseBObject(iSpeechSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.SPEECH_SYNTHESIS: {
				SpeechSynthesis speechSynthesis = (SpeechSynthesis)theEObject;
				T result = caseSpeechSynthesis(speechSynthesis);
				if (result == null) result = caseISpeechSynthesis(speechSynthesis);
				if (result == null) result = caseRendererOutput(speechSynthesis);
				if (result == null) result = caseOutputRepresentation(speechSynthesis);
				if (result == null) result = caseIORepresentation(speechSynthesis);
				if (result == null) result = caseBObject(speechSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.AUDIO_TRACK: {
				AudioTrack audioTrack = (AudioTrack)theEObject;
				T result = caseAudioTrack(audioTrack);
				if (result == null) result = caseRendererOutput(audioTrack);
				if (result == null) result = caseOutputRepresentation(audioTrack);
				if (result == null) result = caseIORepresentation(audioTrack);
				if (result == null) result = caseBObject(audioTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.VIRTUAL_CHARACTER: {
				VirtualCharacter virtualCharacter = (VirtualCharacter)theEObject;
				T result = caseVirtualCharacter(virtualCharacter);
				if (result == null) result = caseRendererOutput(virtualCharacter);
				if (result == null) result = caseOutputRepresentation(virtualCharacter);
				if (result == null) result = caseIORepresentation(virtualCharacter);
				if (result == null) result = caseBObject(virtualCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.EYE_DATA: {
				EyeData eyeData = (EyeData)theEObject;
				T result = caseEyeData(eyeData);
				if (result == null) result = caseBObject(eyeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.WORD: {
				Word word = (Word)theEObject;
				T result = caseWord(word);
				if (result == null) result = caseBObject(word);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.THERMOMETER: {
				Thermometer thermometer = (Thermometer)theEObject;
				T result = caseThermometer(thermometer);
				if (result == null) result = caseSensorInput(thermometer);
				if (result == null) result = caseInputRepresentation(thermometer);
				if (result == null) result = caseIORepresentation(thermometer);
				if (result == null) result = caseBObject(thermometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.PULSE_MONITOR: {
				PulseMonitor pulseMonitor = (PulseMonitor)theEObject;
				T result = casePulseMonitor(pulseMonitor);
				if (result == null) result = caseSensorInput(pulseMonitor);
				if (result == null) result = caseInputRepresentation(pulseMonitor);
				if (result == null) result = caseIORepresentation(pulseMonitor);
				if (result == null) result = caseBObject(pulseMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.LAMP_CONTROL: {
				LampControl lampControl = (LampControl)theEObject;
				T result = caseLampControl(lampControl);
				if (result == null) result = caseActuatorOutput(lampControl);
				if (result == null) result = caseOutputRepresentation(lampControl);
				if (result == null) result = caseIORepresentation(lampControl);
				if (result == null) result = caseBObject(lampControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.VENTILATOR_CONTROL: {
				VentilatorControl ventilatorControl = (VentilatorControl)theEObject;
				T result = caseVentilatorControl(ventilatorControl);
				if (result == null) result = caseActuatorOutput(ventilatorControl);
				if (result == null) result = caseOutputRepresentation(ventilatorControl);
				if (result == null) result = caseIORepresentation(ventilatorControl);
				if (result == null) result = caseBObject(ventilatorControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.TANGIBLE: {
				Tangible tangible = (Tangible)theEObject;
				T result = caseTangible(tangible);
				if (result == null) result = caseControllerInput(tangible);
				if (result == null) result = caseInputRepresentation(tangible);
				if (result == null) result = caseIORepresentation(tangible);
				if (result == null) result = caseBObject(tangible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Io_interfacesPackage.SPEECH_FEATURES: {
				SpeechFeatures speechFeatures = (SpeechFeatures)theEObject;
				T result = caseSpeechFeatures(speechFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorInput(SensorInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerInput(ControllerInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renderer Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renderer Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRendererOutput(RendererOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorOutput(ActuatorOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acoustic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acoustic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcousticEvent(AcousticEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGesture(Gesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hand Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hand Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandGesture(HandGesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyGesture(BodyGesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eye Gaze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eye Gaze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEyeGaze(EyeGaze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadGesture(HeadGesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointing Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointing Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointingGesture(PointingGesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeech(Speech object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISpeech Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISpeech Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISpeechSynthesis(ISpeechSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechSynthesis(SpeechSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioTrack(AudioTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualCharacter(VirtualCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eye Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eye Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEyeData(EyeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWord(Word object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thermometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thermometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThermometer(Thermometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pulse Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pulse Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePulseMonitor(PulseMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lamp Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lamp Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLampControl(LampControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ventilator Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ventilator Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVentilatorControl(VentilatorControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tangible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tangible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTangible(Tangible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechFeatures(SpeechFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIORepresentation(IORepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRepresentation(InputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRepresentation(OutputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Io_interfacesSwitch
