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

import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utterance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getPhrases <em>Phrases</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getUtterance()
 * @model
 * @generated
 */
public interface Utterance extends Rule {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(CommunicativeFunction)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getUtterance_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	CommunicativeFunction getInterpretation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(CommunicativeFunction value);

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
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getUtterance_Phrases()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPhrases();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(EObject)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#getUtterance_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EObject getAnnotation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(EObject value);

} // Utterance
