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
 * A representation of the model object '<em><b>Speech Recognizer Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechRecognizerMode()
 * @model
 * @generated
 */
public interface SpeechRecognizerMode extends DeviceMode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum
	 * @see #setMode(SpeechRecognizerModeEnum)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechRecognizerMode_Mode()
	 * @model required="true"
	 * @generated
	 */
	SpeechRecognizerModeEnum getMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SpeechRecognizerModeEnum value);

} // SpeechRecognizerMode
