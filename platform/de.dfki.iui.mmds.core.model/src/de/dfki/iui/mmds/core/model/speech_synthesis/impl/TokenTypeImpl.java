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
import java.util.List;
import javax.xml.namespace.QName;
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
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark1;
import de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sub;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getAudio <em>Audio</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getProsody <em>Prosody</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getSayAs <em>Say As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenTypeImpl extends MinimalEObjectImpl.Container implements TokenType {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected static final String ONLANGFAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected String onlangfailure = ONLANGFAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected List<QName> role = ROLE_EDEFAULT;

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
	protected TokenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.TOKEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.TOKEN_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audio> getAudio() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__AUDIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Break> getBreak() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__BREAK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emphasis> getEmphasis() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__EMPHASIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark1> getMark() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MARK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phoneme> getPhoneme() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__PHONEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prosody> getProsody() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__PROSODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SayAs> getSayAs() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__SAY_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voice> getVoice() {
		return getGroup().list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__VOICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.TOKEN_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.TOKEN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.TOKEN_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnlangfailure() {
		return onlangfailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlangfailure(String newOnlangfailure) {
		String oldOnlangfailure = onlangfailure;
		onlangfailure = newOnlangfailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE, oldOnlangfailure, onlangfailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(List<QName> newRole) {
		List<QName> oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.TOKEN_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE);
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
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__AUDIO:
				return ((InternalEList<?>)getAudio()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__MARK:
				return ((InternalEList<?>)getMark()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__PHONEME:
				return ((InternalEList<?>)getPhoneme()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__PROSODY:
				return ((InternalEList<?>)getProsody()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__SAY_AS:
				return ((InternalEList<?>)getSayAs()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__VOICE:
				return ((InternalEList<?>)getVoice()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.TOKEN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpeechSynthesisPackage.TOKEN_TYPE__AUDIO:
				return getAudio();
			case SpeechSynthesisPackage.TOKEN_TYPE__BREAK:
				return getBreak();
			case SpeechSynthesisPackage.TOKEN_TYPE__EMPHASIS:
				return getEmphasis();
			case SpeechSynthesisPackage.TOKEN_TYPE__MARK:
				return getMark();
			case SpeechSynthesisPackage.TOKEN_TYPE__PHONEME:
				return getPhoneme();
			case SpeechSynthesisPackage.TOKEN_TYPE__PROSODY:
				return getProsody();
			case SpeechSynthesisPackage.TOKEN_TYPE__SAY_AS:
				return getSayAs();
			case SpeechSynthesisPackage.TOKEN_TYPE__SUB:
				return getSub();
			case SpeechSynthesisPackage.TOKEN_TYPE__VOICE:
				return getVoice();
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.TOKEN_TYPE__ID:
				return getId();
			case SpeechSynthesisPackage.TOKEN_TYPE__LANG:
				return getLang();
			case SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE:
				return getOnlangfailure();
			case SpeechSynthesisPackage.TOKEN_TYPE__ROLE:
				return getRole();
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__AUDIO:
				getAudio().clear();
				getAudio().addAll((Collection<? extends Audio>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends Break>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends Emphasis>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__MARK:
				getMark().clear();
				getMark().addAll((Collection<? extends Mark1>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__PHONEME:
				getPhoneme().clear();
				getPhoneme().addAll((Collection<? extends Phoneme>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__PROSODY:
				getProsody().clear();
				getProsody().addAll((Collection<? extends Prosody>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__SAY_AS:
				getSayAs().clear();
				getSayAs().addAll((Collection<? extends SayAs>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends Voice>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ID:
				setId((String)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE:
				setOnlangfailure((String)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ROLE:
				setRole((List<QName>)newValue);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__GROUP:
				getGroup().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__AUDIO:
				getAudio().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__BREAK:
				getBreak().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__MARK:
				getMark().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__PHONEME:
				getPhoneme().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__PROSODY:
				getProsody().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__SAY_AS:
				getSayAs().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__SUB:
				getSub().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__VOICE:
				getVoice().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE:
				setOnlangfailure(ONLANGFAILURE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__GROUP:
				return !getGroup().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__AUDIO:
				return !getAudio().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__BREAK:
				return !getBreak().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__MARK:
				return !getMark().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__PHONEME:
				return !getPhoneme().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__PROSODY:
				return !getProsody().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__SAY_AS:
				return !getSayAs().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__SUB:
				return !getSub().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__VOICE:
				return !getVoice().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.TOKEN_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpeechSynthesisPackage.TOKEN_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE:
				return ONLANGFAILURE_EDEFAULT == null ? onlangfailure != null : !ONLANGFAILURE_EDEFAULT.equals(onlangfailure);
			case SpeechSynthesisPackage.TOKEN_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", onlangfailure: ");
		result.append(onlangfailure);
		result.append(", role: ");
		result.append(role);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TokenTypeImpl
