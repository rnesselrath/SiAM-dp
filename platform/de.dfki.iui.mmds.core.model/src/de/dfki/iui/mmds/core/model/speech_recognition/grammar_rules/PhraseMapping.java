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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phrase Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getPhrases <em>Phrases</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getPhraseMapping()
 * @model
 * @generated
 */
public interface PhraseMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getPhraseMapping_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticContent> getInterpretation();

	/**
	 * Returns the value of the '<em><b>Phrases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phrases</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrases</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getPhraseMapping_Phrases()
	 * @model
	 * @generated
	 */
	EList<String> getPhrases();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getPhraseMapping_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // PhraseMapping
