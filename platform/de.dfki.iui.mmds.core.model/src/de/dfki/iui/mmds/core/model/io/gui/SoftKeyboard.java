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
package de.dfki.iui.mmds.core.model.io.gui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Keyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a softkeyboard that will be displayed on the screen. In most cases placed on top of the other views.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getKeyboardLayout <em>Keyboard Layout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isUseDictionary <em>Use Dictionary</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionaryLanguage <em>Dictionary Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnableSpeechInputIcon <em>Enable Speech Input Icon</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard()
 * @model
 * @generated
 */
public interface SoftKeyboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Keyboard Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the keyboard layout (QWERTY, AZERTY, Kanji, T9, 123)
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyboard Layout</em>' attribute.
	 * @see #setKeyboardLayout(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_KeyboardLayout()
	 * @model
	 * @generated
	 */
	String getKeyboardLayout();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getKeyboardLayout <em>Keyboard Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard Layout</em>' attribute.
	 * @see #getKeyboardLayout()
	 * @generated
	 */
	void setKeyboardLayout(String value);

	/**
	 * Returns the value of the '<em><b>Use Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if a dictionary might be used to suggest or autocomplete words.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Dictionary</em>' attribute.
	 * @see #setUseDictionary(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_UseDictionary()
	 * @model
	 * @generated
	 */
	boolean isUseDictionary();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isUseDictionary <em>Use Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Dictionary</em>' attribute.
	 * @see #isUseDictionary()
	 * @generated
	 */
	void setUseDictionary(boolean value);

	/**
	 * Returns the value of the '<em><b>Dictionary Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the language used by the dictionary (used by autocompletion)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary Language</em>' attribute.
	 * @see #setDictionaryLanguage(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_DictionaryLanguage()
	 * @model
	 * @generated
	 */
	String getDictionaryLanguage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionaryLanguage <em>Dictionary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Language</em>' attribute.
	 * @see #getDictionaryLanguage()
	 * @generated
	 */
	void setDictionaryLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @ToDo ?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_Dictionary()
	 * @model transient="true"
	 * @generated
	 */
	EList<String> getDictionary();

	/**
	 * Returns the value of the '<em><b>Enable Speech Input Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enables/disables the speech icon to allow users to launch the voice recognition from the keyboard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Speech Input Icon</em>' attribute.
	 * @see #setEnableSpeechInputIcon(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getSoftKeyboard_EnableSpeechInputIcon()
	 * @model
	 * @generated
	 */
	boolean isEnableSpeechInputIcon();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnableSpeechInputIcon <em>Enable Speech Input Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Speech Input Icon</em>' attribute.
	 * @see #isEnableSpeechInputIcon()
	 * @generated
	 */
	void setEnableSpeechInputIcon(boolean value);

} // SoftKeyboard
