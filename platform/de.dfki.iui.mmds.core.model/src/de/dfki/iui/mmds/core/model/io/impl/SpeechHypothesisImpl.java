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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.SpeechHypothesis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl#getUtterance <em>Utterance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl#getGrammar <em>Grammar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechHypothesisImpl extends HypothesisImpl implements SpeechHypothesis {
	/**
	 * The default value of the '{@link #getUtterance() <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected static final String UTTERANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtterance() <em>Utterance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected String utterance = UTTERANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, BString> tokens;

	/**
	 * The default value of the '{@link #getGrammar() <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAMMAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected String grammar = GRAMMAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechHypothesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.SPEECH_HYPOTHESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUtterance() {
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtterance(String newUtterance) {
		String oldUtterance = utterance;
		utterance = newUtterance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_HYPOTHESIS__UTTERANCE, oldUtterance, utterance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, BString> getTokens() {
		if (tokens == null) {
			tokens = new EcoreEMap<String,BString>(BasePackage.Literals.STRING_TO_BSTRING_MAP_ENTRY, StringToBStringMapEntryImpl.class, this, IoPackage.SPEECH_HYPOTHESIS__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrammar() {
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammar(String newGrammar) {
		String oldGrammar = grammar;
		grammar = newGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.SPEECH_HYPOTHESIS__GRAMMAR, oldGrammar, grammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.SPEECH_HYPOTHESIS__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.SPEECH_HYPOTHESIS__UTTERANCE:
				return getUtterance();
			case IoPackage.SPEECH_HYPOTHESIS__TOKENS:
				if (coreType) return getTokens();
				else return getTokens().map();
			case IoPackage.SPEECH_HYPOTHESIS__GRAMMAR:
				return getGrammar();
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
			case IoPackage.SPEECH_HYPOTHESIS__UTTERANCE:
				setUtterance((String)newValue);
				return;
			case IoPackage.SPEECH_HYPOTHESIS__TOKENS:
				((EStructuralFeature.Setting)getTokens()).set(newValue);
				return;
			case IoPackage.SPEECH_HYPOTHESIS__GRAMMAR:
				setGrammar((String)newValue);
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
			case IoPackage.SPEECH_HYPOTHESIS__UTTERANCE:
				setUtterance(UTTERANCE_EDEFAULT);
				return;
			case IoPackage.SPEECH_HYPOTHESIS__TOKENS:
				getTokens().clear();
				return;
			case IoPackage.SPEECH_HYPOTHESIS__GRAMMAR:
				setGrammar(GRAMMAR_EDEFAULT);
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
			case IoPackage.SPEECH_HYPOTHESIS__UTTERANCE:
				return UTTERANCE_EDEFAULT == null ? utterance != null : !UTTERANCE_EDEFAULT.equals(utterance);
			case IoPackage.SPEECH_HYPOTHESIS__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case IoPackage.SPEECH_HYPOTHESIS__GRAMMAR:
				return GRAMMAR_EDEFAULT == null ? grammar != null : !GRAMMAR_EDEFAULT.equals(grammar);
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
		result.append(" (utterance: ");
		result.append(utterance);
		result.append(", grammar: ");
		result.append(grammar);
		result.append(')');
		return result.toString();
	}

} //SpeechHypothesisImpl
