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
package de.dfki.iui.mmds.core.model.io;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.IoPackage
 * @generated
 */
public interface IoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.impl.IoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Instance</em>'.
	 * @generated
	 */
	ServiceInstance createServiceInstance();

	/**
	 * Returns a new object of class '<em>Compound Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Service</em>'.
	 * @generated
	 */
	CompoundService createCompoundService();

	/**
	 * Returns a new object of class '<em>Simple Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Service</em>'.
	 * @generated
	 */
	SimpleService createSimpleService();

	/**
	 * Returns a new object of class '<em>TCP Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCP Server</em>'.
	 * @generated
	 */
	TCPServer createTCPServer();

	/**
	 * Returns a new object of class '<em>TECS Direct Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TECS Direct Service</em>'.
	 * @generated
	 */
	TECSDirectService createTECSDirectService();

	/**
	 * Returns a new object of class '<em>Html Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html Servlet</em>'.
	 * @generated
	 */
	HtmlServlet createHtmlServlet();

	/**
	 * Returns a new object of class '<em>Sip Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sip Connection</em>'.
	 * @generated
	 */
	SipConnection createSipConnection();

	/**
	 * Returns a new object of class '<em>OSGI Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSGI Bundle</em>'.
	 * @generated
	 */
	OSGIBundle createOSGIBundle();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware</em>'.
	 * @generated
	 */
	Hardware createHardware();

	/**
	 * Returns a new object of class '<em>IO Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Event</em>'.
	 * @generated
	 */
	IOEvent createIOEvent();

	/**
	 * Returns a new object of class '<em>Custom Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Message</em>'.
	 * @generated
	 */
	CustomMessage createCustomMessage();

	/**
	 * Returns a new object of class '<em>Update Device Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Device Mode</em>'.
	 * @generated
	 */
	UpdateDeviceMode createUpdateDeviceMode();

	/**
	 * Returns a new object of class '<em>Device State Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device State Changed</em>'.
	 * @generated
	 */
	DeviceStateChanged createDeviceStateChanged();

	/**
	 * Returns a new object of class '<em>Input Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Act</em>'.
	 * @generated
	 */
	InputAct createInputAct();

	/**
	 * Returns a new object of class '<em>Output Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Act</em>'.
	 * @generated
	 */
	OutputAct createOutputAct();

	/**
	 * Returns a new object of class '<em>Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypothesis</em>'.
	 * @generated
	 */
	Hypothesis createHypothesis();

	/**
	 * Returns a new object of class '<em>Speech Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Hypothesis</em>'.
	 * @generated
	 */
	SpeechHypothesis createSpeechHypothesis();

	/**
	 * Returns a new object of class '<em>Gesture Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gesture Hypothesis</em>'.
	 * @generated
	 */
	GestureHypothesis createGestureHypothesis();

	/**
	 * Returns a new object of class '<em>Pointing Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointing Hypothesis</em>'.
	 * @generated
	 */
	PointingHypothesis createPointingHypothesis();

	/**
	 * Returns a new object of class '<em>Custom Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Format</em>'.
	 * @generated
	 */
	CustomFormat createCustomFormat();

	/**
	 * Returns a new object of class '<em>Cancel Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Presentation</em>'.
	 * @generated
	 */
	CancelPresentation createCancelPresentation();

	/**
	 * Returns a new object of class '<em>Presentation State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation State</em>'.
	 * @generated
	 */
	PresentationState createPresentationState();

	/**
	 * Returns a new object of class '<em>Update Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Grammar</em>'.
	 * @generated
	 */
	UpdateGrammar createUpdateGrammar();

	/**
	 * Returns a new object of class '<em>Speech Recognizer State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Recognizer State</em>'.
	 * @generated
	 */
	SpeechRecognizerState createSpeechRecognizerState();

	/**
	 * Returns a new object of class '<em>Speech Recognizer Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Recognizer Mode</em>'.
	 * @generated
	 */
	SpeechRecognizerMode createSpeechRecognizerMode();

	/**
	 * Returns a new object of class '<em>Speech Synthesis State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Synthesis State</em>'.
	 * @generated
	 */
	SpeechSynthesisState createSpeechSynthesisState();

	/**
	 * Returns a new object of class '<em>Active Gestures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Gestures</em>'.
	 * @generated
	 */
	ActiveGestures createActiveGestures();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoPackage getIoPackage();

} //IoFactory
