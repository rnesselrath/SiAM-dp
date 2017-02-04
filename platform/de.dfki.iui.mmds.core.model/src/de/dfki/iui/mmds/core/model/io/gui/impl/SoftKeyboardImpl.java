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
package de.dfki.iui.mmds.core.model.io.gui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Keyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#getKeyboardLayout <em>Keyboard Layout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#isUseDictionary <em>Use Dictionary</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#getDictionaryLanguage <em>Dictionary Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl#isEnableSpeechInputIcon <em>Enable Speech Input Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftKeyboardImpl extends MinimalEObjectImpl.Container implements SoftKeyboard {
	/**
	 * The default value of the '{@link #getKeyboardLayout() <em>Keyboard Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardLayout()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYBOARD_LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyboardLayout() <em>Keyboard Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardLayout()
	 * @generated
	 * @ordered
	 */
	protected String keyboardLayout = KEYBOARD_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDictionary() <em>Use Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDictionary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DICTIONARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseDictionary() <em>Use Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDictionary()
	 * @generated
	 * @ordered
	 */
	protected boolean useDictionary = USE_DICTIONARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDictionaryLanguage() <em>Dictionary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String DICTIONARY_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDictionaryLanguage() <em>Dictionary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected String dictionaryLanguage = DICTIONARY_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dictionary;

	/**
	 * The default value of the '{@link #isEnableSpeechInputIcon() <em>Enable Speech Input Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableSpeechInputIcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_SPEECH_INPUT_ICON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableSpeechInputIcon() <em>Enable Speech Input Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableSpeechInputIcon()
	 * @generated
	 * @ordered
	 */
	protected boolean enableSpeechInputIcon = ENABLE_SPEECH_INPUT_ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftKeyboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.SOFT_KEYBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyboardLayout() {
		return keyboardLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboardLayout(String newKeyboardLayout) {
		String oldKeyboardLayout = keyboardLayout;
		keyboardLayout = newKeyboardLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.SOFT_KEYBOARD__KEYBOARD_LAYOUT, oldKeyboardLayout, keyboardLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDictionary() {
		return useDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDictionary(boolean newUseDictionary) {
		boolean oldUseDictionary = useDictionary;
		useDictionary = newUseDictionary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.SOFT_KEYBOARD__USE_DICTIONARY, oldUseDictionary, useDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDictionaryLanguage() {
		return dictionaryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryLanguage(String newDictionaryLanguage) {
		String oldDictionaryLanguage = dictionaryLanguage;
		dictionaryLanguage = newDictionaryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.SOFT_KEYBOARD__DICTIONARY_LANGUAGE, oldDictionaryLanguage, dictionaryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.SOFT_KEYBOARD__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDictionary() {
		if (dictionary == null) {
			dictionary = new EDataTypeUniqueEList<String>(String.class, this, GuiPackage.SOFT_KEYBOARD__DICTIONARY);
		}
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableSpeechInputIcon() {
		return enableSpeechInputIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableSpeechInputIcon(boolean newEnableSpeechInputIcon) {
		boolean oldEnableSpeechInputIcon = enableSpeechInputIcon;
		enableSpeechInputIcon = newEnableSpeechInputIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON, oldEnableSpeechInputIcon, enableSpeechInputIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.SOFT_KEYBOARD__KEYBOARD_LAYOUT:
				return getKeyboardLayout();
			case GuiPackage.SOFT_KEYBOARD__USE_DICTIONARY:
				return isUseDictionary();
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY_LANGUAGE:
				return getDictionaryLanguage();
			case GuiPackage.SOFT_KEYBOARD__ENABLED:
				return isEnabled();
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY:
				return getDictionary();
			case GuiPackage.SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON:
				return isEnableSpeechInputIcon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.SOFT_KEYBOARD__KEYBOARD_LAYOUT:
				setKeyboardLayout((String)newValue);
				return;
			case GuiPackage.SOFT_KEYBOARD__USE_DICTIONARY:
				setUseDictionary((Boolean)newValue);
				return;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY_LANGUAGE:
				setDictionaryLanguage((String)newValue);
				return;
			case GuiPackage.SOFT_KEYBOARD__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY:
				getDictionary().clear();
				getDictionary().addAll((Collection<? extends String>)newValue);
				return;
			case GuiPackage.SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON:
				setEnableSpeechInputIcon((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuiPackage.SOFT_KEYBOARD__KEYBOARD_LAYOUT:
				setKeyboardLayout(KEYBOARD_LAYOUT_EDEFAULT);
				return;
			case GuiPackage.SOFT_KEYBOARD__USE_DICTIONARY:
				setUseDictionary(USE_DICTIONARY_EDEFAULT);
				return;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY_LANGUAGE:
				setDictionaryLanguage(DICTIONARY_LANGUAGE_EDEFAULT);
				return;
			case GuiPackage.SOFT_KEYBOARD__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY:
				getDictionary().clear();
				return;
			case GuiPackage.SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON:
				setEnableSpeechInputIcon(ENABLE_SPEECH_INPUT_ICON_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuiPackage.SOFT_KEYBOARD__KEYBOARD_LAYOUT:
				return KEYBOARD_LAYOUT_EDEFAULT == null ? keyboardLayout != null : !KEYBOARD_LAYOUT_EDEFAULT.equals(keyboardLayout);
			case GuiPackage.SOFT_KEYBOARD__USE_DICTIONARY:
				return useDictionary != USE_DICTIONARY_EDEFAULT;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY_LANGUAGE:
				return DICTIONARY_LANGUAGE_EDEFAULT == null ? dictionaryLanguage != null : !DICTIONARY_LANGUAGE_EDEFAULT.equals(dictionaryLanguage);
			case GuiPackage.SOFT_KEYBOARD__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case GuiPackage.SOFT_KEYBOARD__DICTIONARY:
				return dictionary != null && !dictionary.isEmpty();
			case GuiPackage.SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON:
				return enableSpeechInputIcon != ENABLE_SPEECH_INPUT_ICON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (keyboardLayout: ");
		result.append(keyboardLayout);
		result.append(", useDictionary: ");
		result.append(useDictionary);
		result.append(", dictionaryLanguage: ");
		result.append(dictionaryLanguage);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", dictionary: ");
		result.append(dictionary);
		result.append(", enableSpeechInputIcon: ");
		result.append(enableSpeechInputIcon);
		result.append(')');
		return result.toString();
	}

} //SoftKeyboardImpl
