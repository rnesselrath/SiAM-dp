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
package de.dfki.iui.mmds.core.model.io_interfaces;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage
 * @generated
 */
public interface Io_interfacesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Io_interfacesFactory eINSTANCE = de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Acoustic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acoustic Event</em>'.
	 * @generated
	 */
	AcousticEvent createAcousticEvent();

	/**
	 * Returns a new object of class '<em>Hand Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hand Gesture</em>'.
	 * @generated
	 */
	HandGesture createHandGesture();

	/**
	 * Returns a new object of class '<em>Body Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Gesture</em>'.
	 * @generated
	 */
	BodyGesture createBodyGesture();

	/**
	 * Returns a new object of class '<em>Eye Gaze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eye Gaze</em>'.
	 * @generated
	 */
	EyeGaze createEyeGaze();

	/**
	 * Returns a new object of class '<em>Head Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Gesture</em>'.
	 * @generated
	 */
	HeadGesture createHeadGesture();

	/**
	 * Returns a new object of class '<em>Pointing Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointing Gesture</em>'.
	 * @generated
	 */
	PointingGesture createPointingGesture();

	/**
	 * Returns a new object of class '<em>Speech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech</em>'.
	 * @generated
	 */
	Speech createSpeech();

	/**
	 * Returns a new object of class '<em>Speech Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Synthesis</em>'.
	 * @generated
	 */
	SpeechSynthesis createSpeechSynthesis();

	/**
	 * Returns a new object of class '<em>Audio Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Track</em>'.
	 * @generated
	 */
	AudioTrack createAudioTrack();

	/**
	 * Returns a new object of class '<em>Virtual Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Character</em>'.
	 * @generated
	 */
	VirtualCharacter createVirtualCharacter();

	/**
	 * Returns a new object of class '<em>Eye Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eye Data</em>'.
	 * @generated
	 */
	EyeData createEyeData();

	/**
	 * Returns a new object of class '<em>Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Word</em>'.
	 * @generated
	 */
	Word createWord();

	/**
	 * Returns a new object of class '<em>Thermometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thermometer</em>'.
	 * @generated
	 */
	Thermometer createThermometer();

	/**
	 * Returns a new object of class '<em>Pulse Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pulse Monitor</em>'.
	 * @generated
	 */
	PulseMonitor createPulseMonitor();

	/**
	 * Returns a new object of class '<em>Lamp Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp Control</em>'.
	 * @generated
	 */
	LampControl createLampControl();

	/**
	 * Returns a new object of class '<em>Ventilator Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ventilator Control</em>'.
	 * @generated
	 */
	VentilatorControl createVentilatorControl();

	/**
	 * Returns a new object of class '<em>Tangible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tangible</em>'.
	 * @generated
	 */
	Tangible createTangible();

	/**
	 * Returns a new object of class '<em>Speech Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Features</em>'.
	 * @generated
	 */
	SpeechFeatures createSpeechFeatures();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Io_interfacesPackage getIo_interfacesPackage();

} //Io_interfacesFactory
