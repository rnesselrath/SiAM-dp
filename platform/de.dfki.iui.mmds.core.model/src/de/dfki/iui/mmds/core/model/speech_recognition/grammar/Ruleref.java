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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruleref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial <em>Special</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage#getRuleref()
 * @model extendedMetaData="name='ruleref' kind='empty'"
 * @generated
 */
public interface Ruleref extends EObject {
	/**
	 * Returns the value of the '<em><b>Special</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #setSpecial(SpecialDatatype)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage#getRuleref_Special()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='special'"
	 * @generated
	 */
	SpecialDatatype getSpecial();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #getSpecial()
	 * @generated
	 */
	void setSpecial(SpecialDatatype value);

	/**
	 * Unsets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecial()
	 * @see #getSpecial()
	 * @see #setSpecial(SpecialDatatype)
	 * @generated
	 */
	void unsetSpecial();

	/**
	 * Returns whether the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial <em>Special</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Special</em>' attribute is set.
	 * @see #unsetSpecial()
	 * @see #getSpecial()
	 * @see #setSpecial(SpecialDatatype)
	 * @generated
	 */
	boolean isSetSpecial();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage#getRuleref_Type()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_recognition.grammar.TypeDatatype"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage#getRuleref_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // Ruleref
