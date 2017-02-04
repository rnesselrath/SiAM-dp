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
package de.dfki.iui.mmds.core.model.speech_synthesis;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSML Speech Synthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to output spoken text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsml <em>Ssml</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsmlDocument <em>Ssml Document</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSMLSpeechSynthesis()
 * @model
 * @generated
 */
public interface SSMLSpeechSynthesis extends ISpeechSynthesis {
	/**
	 * Returns the value of the '<em><b>Ssml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssml</em>' attribute.
	 * @see #setSsml(BString)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSMLSpeechSynthesis_Ssml()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getSsml();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsml <em>Ssml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssml</em>' attribute.
	 * @see #getSsml()
	 * @generated
	 */
	void setSsml(BString value);

	/**
	 * Returns the value of the '<em><b>Ssml Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssml Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssml Document</em>' reference.
	 * @see #setSsmlDocument(SSML)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSMLSpeechSynthesis_SsmlDocument()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        annotation="http://de.dfki.iui/TypeMapping dotnet='opaque'"
	 * @generated
	 */
	SSML getSsmlDocument();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsmlDocument <em>Ssml Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssml Document</em>' reference.
	 * @see #getSsmlDocument()
	 * @generated
	 */
	void setSsmlDocument(SSML value);

} // SSMLSpeechSynthesis
