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

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getTokens <em>Tokens</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getGrammar <em>Grammar</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechHypothesis()
 * @model
 * @generated
 */
public interface SpeechHypothesis extends Hypothesis {
	/**
	 * Returns the value of the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utterance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utterance</em>' attribute.
	 * @see #setUtterance(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechHypothesis_Utterance()
	 * @model
	 * @generated
	 */
	String getUtterance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getUtterance <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utterance</em>' attribute.
	 * @see #getUtterance()
	 * @generated
	 */
	void setUtterance(String value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' map.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechHypothesis_Tokens()
	 * @model mapType="de.dfki.iui.mmds.core.model.base.StringToBStringMapEntry<org.eclipse.emf.ecore.EString, de.dfki.iui.mmds.core.model.base.BString>" ordered="false"
	 * @generated
	 */
	EMap<String, BString> getTokens();

	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grammar rule which was matched in this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grammar</em>' attribute.
	 * @see #setGrammar(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechHypothesis_Grammar()
	 * @model
	 * @generated
	 */
	String getGrammar();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getGrammar <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar</em>' attribute.
	 * @see #getGrammar()
	 * @generated
	 */
	void setGrammar(String value);

} // SpeechHypothesis
