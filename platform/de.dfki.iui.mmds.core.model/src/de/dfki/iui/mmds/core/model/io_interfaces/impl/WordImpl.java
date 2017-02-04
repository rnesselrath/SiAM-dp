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
package de.dfki.iui.mmds.core.model.io_interfaces.impl;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;

import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.Word;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getPhonemes <em>Phonemes</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordImpl extends BObjectImpl implements Word {
	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final float CONFIDENCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected float confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhonemes() <em>Phonemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhonemes()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONEMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhonemes() <em>Phonemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhonemes()
	 * @generated
	 * @ordered
	 */
	protected String phonemes = PHONEMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected static final String LEXICAL_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected String lexicalForm = LEXICAL_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long BEGIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected Long beginTime = BEGIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Long endTime = END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Io_interfacesPackage.Literals.WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidence(float newConfidence) {
		float oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhonemes() {
		return phonemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhonemes(String newPhonemes) {
		String oldPhonemes = phonemes;
		phonemes = newPhonemes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__PHONEMES, oldPhonemes, phonemes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalForm() {
		return lexicalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalForm(String newLexicalForm) {
		String oldLexicalForm = lexicalForm;
		lexicalForm = newLexicalForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__LEXICAL_FORM, oldLexicalForm, lexicalForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBeginTime() {
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginTime(Long newBeginTime) {
		Long oldBeginTime = beginTime;
		beginTime = newBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__BEGIN_TIME, oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Long newEndTime) {
		Long oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Io_interfacesPackage.WORD__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Io_interfacesPackage.WORD__CONFIDENCE:
				return getConfidence();
			case Io_interfacesPackage.WORD__PHONEMES:
				return getPhonemes();
			case Io_interfacesPackage.WORD__TEXT:
				return getText();
			case Io_interfacesPackage.WORD__LEXICAL_FORM:
				return getLexicalForm();
			case Io_interfacesPackage.WORD__BEGIN_TIME:
				return getBeginTime();
			case Io_interfacesPackage.WORD__END_TIME:
				return getEndTime();
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
			case Io_interfacesPackage.WORD__CONFIDENCE:
				setConfidence((Float)newValue);
				return;
			case Io_interfacesPackage.WORD__PHONEMES:
				setPhonemes((String)newValue);
				return;
			case Io_interfacesPackage.WORD__TEXT:
				setText((String)newValue);
				return;
			case Io_interfacesPackage.WORD__LEXICAL_FORM:
				setLexicalForm((String)newValue);
				return;
			case Io_interfacesPackage.WORD__BEGIN_TIME:
				setBeginTime((Long)newValue);
				return;
			case Io_interfacesPackage.WORD__END_TIME:
				setEndTime((Long)newValue);
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
			case Io_interfacesPackage.WORD__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case Io_interfacesPackage.WORD__PHONEMES:
				setPhonemes(PHONEMES_EDEFAULT);
				return;
			case Io_interfacesPackage.WORD__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Io_interfacesPackage.WORD__LEXICAL_FORM:
				setLexicalForm(LEXICAL_FORM_EDEFAULT);
				return;
			case Io_interfacesPackage.WORD__BEGIN_TIME:
				setBeginTime(BEGIN_TIME_EDEFAULT);
				return;
			case Io_interfacesPackage.WORD__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
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
			case Io_interfacesPackage.WORD__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
			case Io_interfacesPackage.WORD__PHONEMES:
				return PHONEMES_EDEFAULT == null ? phonemes != null : !PHONEMES_EDEFAULT.equals(phonemes);
			case Io_interfacesPackage.WORD__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Io_interfacesPackage.WORD__LEXICAL_FORM:
				return LEXICAL_FORM_EDEFAULT == null ? lexicalForm != null : !LEXICAL_FORM_EDEFAULT.equals(lexicalForm);
			case Io_interfacesPackage.WORD__BEGIN_TIME:
				return BEGIN_TIME_EDEFAULT == null ? beginTime != null : !BEGIN_TIME_EDEFAULT.equals(beginTime);
			case Io_interfacesPackage.WORD__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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
		result.append(" (confidence: ");
		result.append(confidence);
		result.append(", phonemes: ");
		result.append(phonemes);
		result.append(", text: ");
		result.append(text);
		result.append(", lexicalForm: ");
		result.append(lexicalForm);
		result.append(", beginTime: ");
		result.append(beginTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //WordImpl
