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
package de.dfki.iui.mmds.core.model.io.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.SpeechSynthesisState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Synthesis State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl#getViseme <em>Viseme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl#getCharIndex <em>Char Index</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl#getBookmark <em>Bookmark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechSynthesisStateImpl extends BObjectImpl implements SpeechSynthesisState {
	/**
	 * The default value of the '{@link #getPhoneme() <em>Phoneme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneme()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneme() <em>Phoneme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneme()
	 * @generated
	 * @ordered
	 */
	protected String phoneme = PHONEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViseme() <em>Viseme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViseme()
	 * @generated
	 * @ordered
	 */
	protected static final String VISEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViseme() <em>Viseme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViseme()
	 * @generated
	 * @ordered
	 */
	protected String viseme = VISEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharIndex() <em>Char Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAR_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharIndex() <em>Char Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharIndex()
	 * @generated
	 * @ordered
	 */
	protected int charIndex = CHAR_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookmark() <em>Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookmark()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookmark() <em>Bookmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookmark()
	 * @generated
	 * @ordered
	 */
	protected String bookmark = BOOKMARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechSynthesisStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.SPEECH_SYNTHESIS_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneme() {
		return phoneme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneme(String newPhoneme) {
		String oldPhoneme = phoneme;
		phoneme = newPhoneme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_SYNTHESIS_STATE__PHONEME, oldPhoneme, phoneme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViseme() {
		return viseme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViseme(String newViseme) {
		String oldViseme = viseme;
		viseme = newViseme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_SYNTHESIS_STATE__VISEME, oldViseme, viseme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharIndex() {
		return charIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharIndex(int newCharIndex) {
		int oldCharIndex = charIndex;
		charIndex = newCharIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_SYNTHESIS_STATE__CHAR_INDEX, oldCharIndex, charIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookmark() {
		return bookmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookmark(String newBookmark) {
		String oldBookmark = bookmark;
		bookmark = newBookmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_SYNTHESIS_STATE__BOOKMARK, oldBookmark, bookmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.SPEECH_SYNTHESIS_STATE__PHONEME:
				return getPhoneme();
			case IoPackage.SPEECH_SYNTHESIS_STATE__VISEME:
				return getViseme();
			case IoPackage.SPEECH_SYNTHESIS_STATE__CHAR_INDEX:
				return getCharIndex();
			case IoPackage.SPEECH_SYNTHESIS_STATE__BOOKMARK:
				return getBookmark();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoPackage.SPEECH_SYNTHESIS_STATE__PHONEME:
				setPhoneme((String)newValue);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__VISEME:
				setViseme((String)newValue);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__CHAR_INDEX:
				setCharIndex((Integer)newValue);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__BOOKMARK:
				setBookmark((String)newValue);
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
			case IoPackage.SPEECH_SYNTHESIS_STATE__PHONEME:
				setPhoneme(PHONEME_EDEFAULT);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__VISEME:
				setViseme(VISEME_EDEFAULT);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__CHAR_INDEX:
				setCharIndex(CHAR_INDEX_EDEFAULT);
				return;
			case IoPackage.SPEECH_SYNTHESIS_STATE__BOOKMARK:
				setBookmark(BOOKMARK_EDEFAULT);
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
			case IoPackage.SPEECH_SYNTHESIS_STATE__PHONEME:
				return PHONEME_EDEFAULT == null ? phoneme != null : !PHONEME_EDEFAULT.equals(phoneme);
			case IoPackage.SPEECH_SYNTHESIS_STATE__VISEME:
				return VISEME_EDEFAULT == null ? viseme != null : !VISEME_EDEFAULT.equals(viseme);
			case IoPackage.SPEECH_SYNTHESIS_STATE__CHAR_INDEX:
				return charIndex != CHAR_INDEX_EDEFAULT;
			case IoPackage.SPEECH_SYNTHESIS_STATE__BOOKMARK:
				return BOOKMARK_EDEFAULT == null ? bookmark != null : !BOOKMARK_EDEFAULT.equals(bookmark);
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
		result.append(" (phoneme: ");
		result.append(phoneme);
		result.append(", viseme: ");
		result.append(viseme);
		result.append(", charIndex: ");
		result.append(charIndex);
		result.append(", bookmark: ");
		result.append(bookmark);
		result.append(')');
		return result.toString();
	}

} //SpeechSynthesisStateImpl
