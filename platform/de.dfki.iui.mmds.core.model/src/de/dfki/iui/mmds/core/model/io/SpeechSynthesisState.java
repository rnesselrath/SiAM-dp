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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Synthesis State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getViseme <em>Viseme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getCharIndex <em>Char Index</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getBookmark <em>Bookmark</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechSynthesisState()
 * @model
 * @generated
 */
public interface SpeechSynthesisState extends DeviceState {
	/**
	 * Returns the value of the '<em><b>Phoneme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phoneme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phoneme</em>' attribute.
	 * @see #setPhoneme(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechSynthesisState_Phoneme()
	 * @model
	 * @generated
	 */
	String getPhoneme();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getPhoneme <em>Phoneme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phoneme</em>' attribute.
	 * @see #getPhoneme()
	 * @generated
	 */
	void setPhoneme(String value);

	/**
	 * Returns the value of the '<em><b>Viseme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viseme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viseme</em>' attribute.
	 * @see #setViseme(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechSynthesisState_Viseme()
	 * @model
	 * @generated
	 */
	String getViseme();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getViseme <em>Viseme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viseme</em>' attribute.
	 * @see #getViseme()
	 * @generated
	 */
	void setViseme(String value);

	/**
	 * Returns the value of the '<em><b>Char Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Index</em>' attribute.
	 * @see #setCharIndex(int)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechSynthesisState_CharIndex()
	 * @model
	 * @generated
	 */
	int getCharIndex();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getCharIndex <em>Char Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Index</em>' attribute.
	 * @see #getCharIndex()
	 * @generated
	 */
	void setCharIndex(int value);

	/**
	 * Returns the value of the '<em><b>Bookmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookmark</em>' attribute.
	 * @see #setBookmark(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechSynthesisState_Bookmark()
	 * @model
	 * @generated
	 */
	String getBookmark();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getBookmark <em>Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookmark</em>' attribute.
	 * @see #getBookmark()
	 * @generated
	 */
	void setBookmark(String value);

} // SpeechSynthesisState
