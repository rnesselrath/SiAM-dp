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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.Break;
import de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis;
import de.dfki.iui.mmds.core.model.speech_synthesis.LangType;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark1;
import de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph;
import de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sentence;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sub;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getAudio <em>Audio</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getProsody <em>Prosody</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getSayAs <em>Say As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getS <em>S</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getW <em>W</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupTypeImpl extends MinimalEObjectImpl.Container implements LookupType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.LOOKUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.LOOKUP_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audio> getAudio() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__AUDIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Break> getBreak() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__BREAK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emphasis> getEmphasis() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__EMPHASIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LangType> getLang() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__LANG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__LOOKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark1> getMark() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__MARK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getP() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phoneme> getPhoneme() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__PHONEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prosody> getProsody() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__PROSODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SayAs> getSayAs() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__SAY_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getS() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__S);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenType> getToken() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voice> getVoice() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__VOICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenType> getW() {
		return getGroup().list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__W);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.LOOKUP_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.LOOKUP_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpeechSynthesisPackage.LOOKUP_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__AUDIO:
				return ((InternalEList<?>)getAudio()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__LANG:
				return ((InternalEList<?>)getLang()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__LOOKUP:
				return ((InternalEList<?>)getLookup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__MARK:
				return ((InternalEList<?>)getMark()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__PHONEME:
				return ((InternalEList<?>)getPhoneme()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__PROSODY:
				return ((InternalEList<?>)getProsody()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__SAY_AS:
				return ((InternalEList<?>)getSayAs()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__VOICE:
				return ((InternalEList<?>)getVoice()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__W:
				return ((InternalEList<?>)getW()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case SpeechSynthesisPackage.LOOKUP_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.LOOKUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpeechSynthesisPackage.LOOKUP_TYPE__AUDIO:
				return getAudio();
			case SpeechSynthesisPackage.LOOKUP_TYPE__BREAK:
				return getBreak();
			case SpeechSynthesisPackage.LOOKUP_TYPE__EMPHASIS:
				return getEmphasis();
			case SpeechSynthesisPackage.LOOKUP_TYPE__LANG:
				return getLang();
			case SpeechSynthesisPackage.LOOKUP_TYPE__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.LOOKUP_TYPE__MARK:
				return getMark();
			case SpeechSynthesisPackage.LOOKUP_TYPE__P:
				return getP();
			case SpeechSynthesisPackage.LOOKUP_TYPE__PHONEME:
				return getPhoneme();
			case SpeechSynthesisPackage.LOOKUP_TYPE__PROSODY:
				return getProsody();
			case SpeechSynthesisPackage.LOOKUP_TYPE__SAY_AS:
				return getSayAs();
			case SpeechSynthesisPackage.LOOKUP_TYPE__SUB:
				return getSub();
			case SpeechSynthesisPackage.LOOKUP_TYPE__S:
				return getS();
			case SpeechSynthesisPackage.LOOKUP_TYPE__TOKEN:
				return getToken();
			case SpeechSynthesisPackage.LOOKUP_TYPE__VOICE:
				return getVoice();
			case SpeechSynthesisPackage.LOOKUP_TYPE__W:
				return getW();
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.LOOKUP_TYPE__REF:
				return getRef();
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case SpeechSynthesisPackage.LOOKUP_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__AUDIO:
				getAudio().clear();
				getAudio().addAll((Collection<? extends Audio>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends Break>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends Emphasis>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__LANG:
				getLang().clear();
				getLang().addAll((Collection<? extends LangType>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__LOOKUP:
				getLookup().clear();
				getLookup().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__MARK:
				getMark().clear();
				getMark().addAll((Collection<? extends Mark1>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__PHONEME:
				getPhoneme().clear();
				getPhoneme().addAll((Collection<? extends Phoneme>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__PROSODY:
				getProsody().clear();
				getProsody().addAll((Collection<? extends Prosody>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__SAY_AS:
				getSayAs().clear();
				getSayAs().addAll((Collection<? extends SayAs>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__S:
				getS().clear();
				getS().addAll((Collection<? extends Sentence>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends TokenType>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends Voice>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__W:
				getW().clear();
				getW().addAll((Collection<? extends TokenType>)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__REF:
				setRef((String)newValue);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case SpeechSynthesisPackage.LOOKUP_TYPE__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__AUDIO:
				getAudio().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__BREAK:
				getBreak().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__LANG:
				getLang().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__LOOKUP:
				getLookup().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__MARK:
				getMark().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__P:
				getP().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__PHONEME:
				getPhoneme().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__PROSODY:
				getProsody().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__SAY_AS:
				getSayAs().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__SUB:
				getSub().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__S:
				getS().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__TOKEN:
				getToken().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__VOICE:
				getVoice().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__W:
				getW().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__REF:
				setRef(REF_EDEFAULT);
				return;
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case SpeechSynthesisPackage.LOOKUP_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__GROUP:
				return !getGroup().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__AUDIO:
				return !getAudio().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__BREAK:
				return !getBreak().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__LANG:
				return !getLang().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__LOOKUP:
				return !getLookup().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__MARK:
				return !getMark().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__P:
				return !getP().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__PHONEME:
				return !getPhoneme().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__PROSODY:
				return !getProsody().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__SAY_AS:
				return !getSayAs().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__SUB:
				return !getSub().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__S:
				return !getS().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__TOKEN:
				return !getToken().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__VOICE:
				return !getVoice().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__W:
				return !getW().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.LOOKUP_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case SpeechSynthesisPackage.LOOKUP_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", ref: ");
		result.append(ref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //LookupTypeImpl
