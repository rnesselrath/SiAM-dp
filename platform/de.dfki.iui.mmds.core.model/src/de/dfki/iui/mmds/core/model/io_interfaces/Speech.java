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

import java.net.URL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verbal speech input, usually recorded by an ASR. Only the most likely hypothesis is provided in this representation; other hypotheses are listed separately.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getWords <em>Words</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getSignalUri <em>Signal Uri</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getProblem <em>Problem</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeech()
 * @model
 * @generated
 */
public interface Speech extends ControllerInput {
	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io_interfaces.Word}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeech_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<Word> getWords();

	/**
	 * Returns the value of the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The utterance string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utterance</em>' attribute.
	 * @see #setUtterance(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeech_Utterance()
	 * @model
	 * @generated
	 */
	String getUtterance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getUtterance <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterance</em>' attribute.
	 * @see #getUtterance()
	 * @generated
	 */
	void setUtterance(String value);

	/**
	 * Returns the value of the '<em><b>Signal Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL from which the speech signal can be retrieved. The data should be in WAV format and be exactly of the same length as described in the input meta data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Uri</em>' attribute.
	 * @see #setSignalUri(URL)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeech_SignalUri()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.Url"
	 * @generated
	 */
	URL getSignalUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getSignalUri <em>Signal Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Uri</em>' attribute.
	 * @see #getSignalUri()
	 * @generated
	 */
	void setSignalUri(URL value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be used to mark problems that have occured with speech recognition. This can be specified in addition to a recognition result to indicate potential problems or instead of (if the recognition problem was too severe).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem
	 * @see #setProblem(SpeechRecognitionProblem)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getSpeech_Problem()
	 * @model
	 * @generated
	 */
	SpeechRecognitionProblem getProblem();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(SpeechRecognitionProblem value);

} // Speech
