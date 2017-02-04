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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage
 * @generated
 */
public interface SpeechSynthesisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpeechSynthesisFactory eINSTANCE = de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SSML Speech Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSML Speech Synthesis</em>'.
	 * @generated
	 */
	SSMLSpeechSynthesis createSSMLSpeechSynthesis();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break</em>'.
	 * @generated
	 */
	Break createBreak();

	/**
	 * Returns a new object of class '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desc</em>'.
	 * @generated
	 */
	Desc createDesc();

	/**
	 * Returns a new object of class '<em>SSML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSML</em>'.
	 * @generated
	 */
	SSML createSSML();

	/**
	 * Returns a new object of class '<em>Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emphasis</em>'.
	 * @generated
	 */
	Emphasis createEmphasis();

	/**
	 * Returns a new object of class '<em>Lang Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Type</em>'.
	 * @generated
	 */
	LangType createLangType();

	/**
	 * Returns a new object of class '<em>Lookup Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Type</em>'.
	 * @generated
	 */
	LookupType createLookupType();

	/**
	 * Returns a new object of class '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark</em>'.
	 * @generated
	 */
	Mark createMark();

	/**
	 * Returns a new object of class '<em>Mark1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark1</em>'.
	 * @generated
	 */
	Mark1 createMark1();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Phoneme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phoneme</em>'.
	 * @generated
	 */
	Phoneme createPhoneme();

	/**
	 * Returns a new object of class '<em>Prosody</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prosody</em>'.
	 * @generated
	 */
	Prosody createProsody();

	/**
	 * Returns a new object of class '<em>Say As</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Say As</em>'.
	 * @generated
	 */
	SayAs createSayAs();

	/**
	 * Returns a new object of class '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentence</em>'.
	 * @generated
	 */
	Sentence createSentence();

	/**
	 * Returns a new object of class '<em>Speak</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speak</em>'.
	 * @generated
	 */
	Speak createSpeak();

	/**
	 * Returns a new object of class '<em>Ssml Lexicon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssml Lexicon</em>'.
	 * @generated
	 */
	SsmlLexicon createSsmlLexicon();

	/**
	 * Returns a new object of class '<em>Ssml Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssml Meta</em>'.
	 * @generated
	 */
	SsmlMeta createSsmlMeta();

	/**
	 * Returns a new object of class '<em>Ssml Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssml Metadata</em>'.
	 * @generated
	 */
	SsmlMetadata createSsmlMetadata();

	/**
	 * Returns a new object of class '<em>Sub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub</em>'.
	 * @generated
	 */
	Sub createSub();

	/**
	 * Returns a new object of class '<em>Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Type</em>'.
	 * @generated
	 */
	TokenType createTokenType();

	/**
	 * Returns a new object of class '<em>Voice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voice</em>'.
	 * @generated
	 */
	Voice createVoice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpeechSynthesisPackage getSpeechSynthesisPackage();

} //SpeechSynthesisFactory
