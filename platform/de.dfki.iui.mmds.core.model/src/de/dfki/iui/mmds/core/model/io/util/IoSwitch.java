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
package de.dfki.iui.mmds.core.model.io.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.NamedEntity;
import de.dfki.iui.mmds.core.model.io.*;

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
 * @see de.dfki.iui.mmds.core.model.io.IoPackage
 * @generated
 */
public class IoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoSwitch() {
		if (modelPackage == null) {
			modelPackage = IoPackage.eINSTANCE;
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
			case IoPackage.SERVICE_INSTANCE: {
				ServiceInstance serviceInstance = (ServiceInstance)theEObject;
				T result = caseServiceInstance(serviceInstance);
				if (result == null) result = caseEntity(serviceInstance);
				if (result == null) result = caseBObject(serviceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseEntity(service);
				if (result == null) result = caseBObject(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.COMPOUND_SERVICE: {
				CompoundService compoundService = (CompoundService)theEObject;
				T result = caseCompoundService(compoundService);
				if (result == null) result = caseService(compoundService);
				if (result == null) result = caseEntity(compoundService);
				if (result == null) result = caseBObject(compoundService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SIMPLE_SERVICE: {
				SimpleService simpleService = (SimpleService)theEObject;
				T result = caseSimpleService(simpleService);
				if (result == null) result = caseService(simpleService);
				if (result == null) result = caseEntity(simpleService);
				if (result == null) result = caseBObject(simpleService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.COMMUNICATION_INFO: {
				CommunicationInfo communicationInfo = (CommunicationInfo)theEObject;
				T result = caseCommunicationInfo(communicationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.TCP_SERVER: {
				TCPServer tcpServer = (TCPServer)theEObject;
				T result = caseTCPServer(tcpServer);
				if (result == null) result = caseCommunicationInfo(tcpServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.TECS_DIRECT_SERVICE: {
				TECSDirectService tecsDirectService = (TECSDirectService)theEObject;
				T result = caseTECSDirectService(tecsDirectService);
				if (result == null) result = caseCommunicationInfo(tecsDirectService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.HTML_SERVLET: {
				HtmlServlet htmlServlet = (HtmlServlet)theEObject;
				T result = caseHtmlServlet(htmlServlet);
				if (result == null) result = caseCommunicationInfo(htmlServlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SIP_CONNECTION: {
				SipConnection sipConnection = (SipConnection)theEObject;
				T result = caseSipConnection(sipConnection);
				if (result == null) result = caseCommunicationInfo(sipConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.OSGI_BUNDLE: {
				OSGIBundle osgiBundle = (OSGIBundle)theEObject;
				T result = caseOSGIBundle(osgiBundle);
				if (result == null) result = caseCommunicationInfo(osgiBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseNamedEntity(device);
				if (result == null) result = caseEntity(device);
				if (result == null) result = caseBObject(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.HARDWARE: {
				Hardware hardware = (Hardware)theEObject;
				T result = caseHardware(hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.IO_EVENT: {
				IOEvent ioEvent = (IOEvent)theEObject;
				T result = caseIOEvent(ioEvent);
				if (result == null) result = caseBObject(ioEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseBObject(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.INPUT_MESSAGE: {
				InputMessage inputMessage = (InputMessage)theEObject;
				T result = caseInputMessage(inputMessage);
				if (result == null) result = caseMessage(inputMessage);
				if (result == null) result = caseBObject(inputMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.OUTPUT_MESSAGE: {
				OutputMessage outputMessage = (OutputMessage)theEObject;
				T result = caseOutputMessage(outputMessage);
				if (result == null) result = caseMessage(outputMessage);
				if (result == null) result = caseBObject(outputMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.CUSTOM_MESSAGE: {
				CustomMessage customMessage = (CustomMessage)theEObject;
				T result = caseCustomMessage(customMessage);
				if (result == null) result = caseMessage(customMessage);
				if (result == null) result = caseBObject(customMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.COMMUNICATIVE_ACT: {
				CommunicativeAct communicativeAct = (CommunicativeAct)theEObject;
				T result = caseCommunicativeAct(communicativeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.CONTROL_MESSAGE: {
				ControlMessage controlMessage = (ControlMessage)theEObject;
				T result = caseControlMessage(controlMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.UPDATE_DEVICE_MODE: {
				UpdateDeviceMode updateDeviceMode = (UpdateDeviceMode)theEObject;
				T result = caseUpdateDeviceMode(updateDeviceMode);
				if (result == null) result = caseControlMessage(updateDeviceMode);
				if (result == null) result = caseOutputMessage(updateDeviceMode);
				if (result == null) result = caseMessage(updateDeviceMode);
				if (result == null) result = caseBObject(updateDeviceMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.DEVICE_STATE_CHANGED: {
				DeviceStateChanged deviceStateChanged = (DeviceStateChanged)theEObject;
				T result = caseDeviceStateChanged(deviceStateChanged);
				if (result == null) result = caseControlMessage(deviceStateChanged);
				if (result == null) result = caseInputMessage(deviceStateChanged);
				if (result == null) result = caseMessage(deviceStateChanged);
				if (result == null) result = caseBObject(deviceStateChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.INPUT_ACT: {
				InputAct inputAct = (InputAct)theEObject;
				T result = caseInputAct(inputAct);
				if (result == null) result = caseCommunicativeAct(inputAct);
				if (result == null) result = caseInputMessage(inputAct);
				if (result == null) result = caseMessage(inputAct);
				if (result == null) result = caseBObject(inputAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.OUTPUT_ACT: {
				OutputAct outputAct = (OutputAct)theEObject;
				T result = caseOutputAct(outputAct);
				if (result == null) result = caseCommunicativeAct(outputAct);
				if (result == null) result = caseOutputMessage(outputAct);
				if (result == null) result = caseMessage(outputAct);
				if (result == null) result = caseBObject(outputAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.IO_REPRESENTATION: {
				IORepresentation ioRepresentation = (IORepresentation)theEObject;
				T result = caseIORepresentation(ioRepresentation);
				if (result == null) result = caseBObject(ioRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.INPUT_REPRESENTATION: {
				InputRepresentation inputRepresentation = (InputRepresentation)theEObject;
				T result = caseInputRepresentation(inputRepresentation);
				if (result == null) result = caseIORepresentation(inputRepresentation);
				if (result == null) result = caseBObject(inputRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.OUTPUT_REPRESENTATION: {
				OutputRepresentation outputRepresentation = (OutputRepresentation)theEObject;
				T result = caseOutputRepresentation(outputRepresentation);
				if (result == null) result = caseIORepresentation(outputRepresentation);
				if (result == null) result = caseBObject(outputRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.HYPOTHESIS: {
				Hypothesis hypothesis = (Hypothesis)theEObject;
				T result = caseHypothesis(hypothesis);
				if (result == null) result = caseBObject(hypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SPEECH_HYPOTHESIS: {
				SpeechHypothesis speechHypothesis = (SpeechHypothesis)theEObject;
				T result = caseSpeechHypothesis(speechHypothesis);
				if (result == null) result = caseHypothesis(speechHypothesis);
				if (result == null) result = caseBObject(speechHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.GESTURE_HYPOTHESIS: {
				GestureHypothesis gestureHypothesis = (GestureHypothesis)theEObject;
				T result = caseGestureHypothesis(gestureHypothesis);
				if (result == null) result = caseHypothesis(gestureHypothesis);
				if (result == null) result = caseBObject(gestureHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.POINTING_HYPOTHESIS: {
				PointingHypothesis pointingHypothesis = (PointingHypothesis)theEObject;
				T result = casePointingHypothesis(pointingHypothesis);
				if (result == null) result = caseHypothesis(pointingHypothesis);
				if (result == null) result = caseBObject(pointingHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.CUSTOM_FORMAT: {
				CustomFormat customFormat = (CustomFormat)theEObject;
				T result = caseCustomFormat(customFormat);
				if (result == null) result = caseInputRepresentation(customFormat);
				if (result == null) result = caseOutputRepresentation(customFormat);
				if (result == null) result = caseIORepresentation(customFormat);
				if (result == null) result = caseBObject(customFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.DEVICE_STATE: {
				DeviceState deviceState = (DeviceState)theEObject;
				T result = caseDeviceState(deviceState);
				if (result == null) result = caseBObject(deviceState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.DEVICE_MODE: {
				DeviceMode deviceMode = (DeviceMode)theEObject;
				T result = caseDeviceMode(deviceMode);
				if (result == null) result = caseBObject(deviceMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.CANCEL_PRESENTATION: {
				CancelPresentation cancelPresentation = (CancelPresentation)theEObject;
				T result = caseCancelPresentation(cancelPresentation);
				if (result == null) result = caseDeviceMode(cancelPresentation);
				if (result == null) result = caseBObject(cancelPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.PRESENTATION_STATE: {
				PresentationState presentationState = (PresentationState)theEObject;
				T result = casePresentationState(presentationState);
				if (result == null) result = caseDeviceState(presentationState);
				if (result == null) result = caseBObject(presentationState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.UPDATE_GRAMMAR: {
				UpdateGrammar updateGrammar = (UpdateGrammar)theEObject;
				T result = caseUpdateGrammar(updateGrammar);
				if (result == null) result = caseDeviceMode(updateGrammar);
				if (result == null) result = caseBObject(updateGrammar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SPEECH_RECOGNIZER_STATE: {
				SpeechRecognizerState speechRecognizerState = (SpeechRecognizerState)theEObject;
				T result = caseSpeechRecognizerState(speechRecognizerState);
				if (result == null) result = caseDeviceState(speechRecognizerState);
				if (result == null) result = caseBObject(speechRecognizerState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SPEECH_RECOGNIZER_MODE: {
				SpeechRecognizerMode speechRecognizerMode = (SpeechRecognizerMode)theEObject;
				T result = caseSpeechRecognizerMode(speechRecognizerMode);
				if (result == null) result = caseDeviceMode(speechRecognizerMode);
				if (result == null) result = caseBObject(speechRecognizerMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.SPEECH_SYNTHESIS_STATE: {
				SpeechSynthesisState speechSynthesisState = (SpeechSynthesisState)theEObject;
				T result = caseSpeechSynthesisState(speechSynthesisState);
				if (result == null) result = caseDeviceState(speechSynthesisState);
				if (result == null) result = caseBObject(speechSynthesisState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoPackage.ACTIVE_GESTURES: {
				ActiveGestures activeGestures = (ActiveGestures)theEObject;
				T result = caseActiveGestures(activeGestures);
				if (result == null) result = caseDeviceMode(activeGestures);
				if (result == null) result = caseBObject(activeGestures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInstance(ServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundService(CompoundService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleService(SimpleService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationInfo(CommunicationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPServer(TCPServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TECS Direct Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TECS Direct Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTECSDirectService(TECSDirectService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html Servlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlServlet(HtmlServlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sip Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sip Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSipConnection(SipConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSGI Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSGI Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSGIBundle(OSGIBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOEvent(IOEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMessage(InputMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMessage(OutputMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomMessage(CustomMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicative Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicative Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicativeAct(CommunicativeAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlMessage(ControlMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Device Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Device Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDeviceMode(UpdateDeviceMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device State Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device State Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStateChanged(DeviceStateChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputAct(InputAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputAct(OutputAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypothesis(Hypothesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechHypothesis(SpeechHypothesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesture Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesture Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestureHypothesis(GestureHypothesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointing Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointing Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointingHypothesis(PointingHypothesis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomFormat(CustomFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Recognizer State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Recognizer State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechRecognizerState(SpeechRecognizerState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Recognizer Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Recognizer Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechRecognizerMode(SpeechRecognizerMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Synthesis State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Synthesis State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechSynthesisState(SpeechSynthesisState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Gestures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Gestures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveGestures(ActiveGestures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardware(Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceState(DeviceState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMode(DeviceMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelPresentation(CancelPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationState(PresentationState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Grammar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateGrammar(UpdateGrammar object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
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

} //IoSwitch
