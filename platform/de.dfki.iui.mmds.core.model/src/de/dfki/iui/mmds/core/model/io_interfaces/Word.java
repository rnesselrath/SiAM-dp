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

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getPhonemes <em>Phonemes</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord()
 * @model
 * @generated
 */
public interface Word extends BObject {
	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_Confidence()
	 * @model
	 * @generated
	 */
	float getConfidence();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(float value);

	/**
	 * Returns the value of the '<em><b>Phonemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pronunciation of the word as phonemes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phonemes</em>' attribute.
	 * @see #setPhonemes(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_Phonemes()
	 * @model
	 * @generated
	 */
	String getPhonemes();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getPhonemes <em>Phonemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phonemes</em>' attribute.
	 * @see #getPhonemes()
	 * @generated
	 */
	void setPhonemes(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be used to describe the lexical form of the element without normalization of numbers, currency values, and ordinals (for example, displays "two dollars" for the spoken words "two dollars").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lexical Form</em>' attribute.
	 * @see #setLexicalForm(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_LexicalForm()
	 * @model
	 * @generated
	 */
	String getLexicalForm();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getLexicalForm <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Form</em>' attribute.
	 * @see #getLexicalForm()
	 * @generated
	 */
	void setLexicalForm(String value);

	/**
	 * Returns the value of the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact beginning of this word unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin Time</em>' attribute.
	 * @see #setBeginTime(Long)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_BeginTime()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.TimeStamp"
	 * @generated
	 */
	Long getBeginTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getBeginTime <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Time</em>' attribute.
	 * @see #getBeginTime()
	 * @generated
	 */
	void setBeginTime(Long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact end  time of this word unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Long)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getWord_EndTime()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.TimeStamp"
	 * @generated
	 */
	Long getEndTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Long value);

} // Word
