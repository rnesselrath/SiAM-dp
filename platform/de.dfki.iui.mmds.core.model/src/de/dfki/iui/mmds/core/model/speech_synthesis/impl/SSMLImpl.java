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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.Break;
import de.dfki.iui.mmds.core.model.speech_synthesis.Desc;
import de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis;
import de.dfki.iui.mmds.core.model.speech_synthesis.LangType;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark1;
import de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph;
import de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SSML;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sentence;
import de.dfki.iui.mmds.core.model.speech_synthesis.Speak;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sub;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getAudio <em>Audio</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getP <em>P</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getProsody <em>Prosody</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getS <em>S</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getSayAs <em>Say As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getSpeak <em>Speak</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl#getW <em>W</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSMLImpl extends MinimalEObjectImpl.Container implements SSML {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.SSML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.SSML__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audio> getAudio() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__AUDIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAws() {
		return (EObject)getMixed().get(SpeechSynthesisPackage.Literals.SSML__AWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAws(EObject newAws, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__AWS, newAws, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Break> getBreak() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__BREAK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desc getDesc() {
		return (Desc)getMixed().get(SpeechSynthesisPackage.Literals.SSML__DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesc(Desc newDesc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__DESC, newDesc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(Desc newDesc) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__DESC, newDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emphasis> getEmphasis() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__EMPHASIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangType getLang() {
		return (LangType)getMixed().get(SpeechSynthesisPackage.Literals.SSML__LANG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLang(LangType newLang, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__LANG, newLang, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(LangType newLang) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__LANG, newLang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupType getLookup() {
		return (LookupType)getMixed().get(SpeechSynthesisPackage.Literals.SSML__LOOKUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookup(LookupType newLookup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__LOOKUP, newLookup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookup(LookupType newLookup) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__LOOKUP, newLookup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark1> getMark() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__MARK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getP() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStruct() {
		return (EObject)getMixed().get(SpeechSynthesisPackage.Literals.SSML__STRUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(EObject newStruct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__STRUCT, newStruct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phoneme> getPhoneme() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__PHONEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prosody> getProsody() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__PROSODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getS() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__S);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SayAs> getSayAs() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__SAY_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speak getSpeak() {
		return (Speak)getMixed().get(SpeechSynthesisPackage.Literals.SSML__SPEAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeak(Speak newSpeak, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__SPEAK, newSpeak, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeak(Speak newSpeak) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__SPEAK, newSpeak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenType getToken() {
		return (TokenType)getMixed().get(SpeechSynthesisPackage.Literals.SSML__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(TokenType newToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__TOKEN, newToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(TokenType newToken) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voice> getVoice() {
		return getMixed().list(SpeechSynthesisPackage.Literals.SSML__VOICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenType getW() {
		return (TokenType)getMixed().get(SpeechSynthesisPackage.Literals.SSML__W, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetW(TokenType newW, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SSML__W, newW, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(TokenType newW) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SSML__W, newW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpeechSynthesisPackage.SSML__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__AUDIO:
				return ((InternalEList<?>)getAudio()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__AWS:
				return basicSetAws(null, msgs);
			case SpeechSynthesisPackage.SSML__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__DESC:
				return basicSetDesc(null, msgs);
			case SpeechSynthesisPackage.SSML__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__LANG:
				return basicSetLang(null, msgs);
			case SpeechSynthesisPackage.SSML__LOOKUP:
				return basicSetLookup(null, msgs);
			case SpeechSynthesisPackage.SSML__MARK:
				return ((InternalEList<?>)getMark()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__STRUCT:
				return basicSetStruct(null, msgs);
			case SpeechSynthesisPackage.SSML__PHONEME:
				return ((InternalEList<?>)getPhoneme()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__PROSODY:
				return ((InternalEList<?>)getProsody()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__SAY_AS:
				return ((InternalEList<?>)getSayAs()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__SPEAK:
				return basicSetSpeak(null, msgs);
			case SpeechSynthesisPackage.SSML__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__TOKEN:
				return basicSetToken(null, msgs);
			case SpeechSynthesisPackage.SSML__VOICE:
				return ((InternalEList<?>)getVoice()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SSML__W:
				return basicSetW(null, msgs);
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
			case SpeechSynthesisPackage.SSML__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SpeechSynthesisPackage.SSML__AUDIO:
				return getAudio();
			case SpeechSynthesisPackage.SSML__AWS:
				return getAws();
			case SpeechSynthesisPackage.SSML__BREAK:
				return getBreak();
			case SpeechSynthesisPackage.SSML__DESC:
				return getDesc();
			case SpeechSynthesisPackage.SSML__EMPHASIS:
				return getEmphasis();
			case SpeechSynthesisPackage.SSML__LANG:
				return getLang();
			case SpeechSynthesisPackage.SSML__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.SSML__MARK:
				return getMark();
			case SpeechSynthesisPackage.SSML__P:
				return getP();
			case SpeechSynthesisPackage.SSML__STRUCT:
				return getStruct();
			case SpeechSynthesisPackage.SSML__PHONEME:
				return getPhoneme();
			case SpeechSynthesisPackage.SSML__PROSODY:
				return getProsody();
			case SpeechSynthesisPackage.SSML__S:
				return getS();
			case SpeechSynthesisPackage.SSML__SAY_AS:
				return getSayAs();
			case SpeechSynthesisPackage.SSML__SPEAK:
				return getSpeak();
			case SpeechSynthesisPackage.SSML__SUB:
				return getSub();
			case SpeechSynthesisPackage.SSML__TOKEN:
				return getToken();
			case SpeechSynthesisPackage.SSML__VOICE:
				return getVoice();
			case SpeechSynthesisPackage.SSML__W:
				return getW();
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
			case SpeechSynthesisPackage.SSML__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SpeechSynthesisPackage.SSML__AUDIO:
				getAudio().clear();
				getAudio().addAll((Collection<? extends Audio>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends Break>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__DESC:
				setDesc((Desc)newValue);
				return;
			case SpeechSynthesisPackage.SSML__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends Emphasis>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__LANG:
				setLang((LangType)newValue);
				return;
			case SpeechSynthesisPackage.SSML__LOOKUP:
				setLookup((LookupType)newValue);
				return;
			case SpeechSynthesisPackage.SSML__MARK:
				getMark().clear();
				getMark().addAll((Collection<? extends Mark1>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__P:
				getP().clear();
				getP().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__PHONEME:
				getPhoneme().clear();
				getPhoneme().addAll((Collection<? extends Phoneme>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__PROSODY:
				getProsody().clear();
				getProsody().addAll((Collection<? extends Prosody>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__S:
				getS().clear();
				getS().addAll((Collection<? extends Sentence>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__SAY_AS:
				getSayAs().clear();
				getSayAs().addAll((Collection<? extends SayAs>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__SPEAK:
				setSpeak((Speak)newValue);
				return;
			case SpeechSynthesisPackage.SSML__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__TOKEN:
				setToken((TokenType)newValue);
				return;
			case SpeechSynthesisPackage.SSML__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends Voice>)newValue);
				return;
			case SpeechSynthesisPackage.SSML__W:
				setW((TokenType)newValue);
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
			case SpeechSynthesisPackage.SSML__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SpeechSynthesisPackage.SSML__AUDIO:
				getAudio().clear();
				return;
			case SpeechSynthesisPackage.SSML__BREAK:
				getBreak().clear();
				return;
			case SpeechSynthesisPackage.SSML__DESC:
				setDesc((Desc)null);
				return;
			case SpeechSynthesisPackage.SSML__EMPHASIS:
				getEmphasis().clear();
				return;
			case SpeechSynthesisPackage.SSML__LANG:
				setLang((LangType)null);
				return;
			case SpeechSynthesisPackage.SSML__LOOKUP:
				setLookup((LookupType)null);
				return;
			case SpeechSynthesisPackage.SSML__MARK:
				getMark().clear();
				return;
			case SpeechSynthesisPackage.SSML__P:
				getP().clear();
				return;
			case SpeechSynthesisPackage.SSML__PHONEME:
				getPhoneme().clear();
				return;
			case SpeechSynthesisPackage.SSML__PROSODY:
				getProsody().clear();
				return;
			case SpeechSynthesisPackage.SSML__S:
				getS().clear();
				return;
			case SpeechSynthesisPackage.SSML__SAY_AS:
				getSayAs().clear();
				return;
			case SpeechSynthesisPackage.SSML__SPEAK:
				setSpeak((Speak)null);
				return;
			case SpeechSynthesisPackage.SSML__SUB:
				getSub().clear();
				return;
			case SpeechSynthesisPackage.SSML__TOKEN:
				setToken((TokenType)null);
				return;
			case SpeechSynthesisPackage.SSML__VOICE:
				getVoice().clear();
				return;
			case SpeechSynthesisPackage.SSML__W:
				setW((TokenType)null);
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
			case SpeechSynthesisPackage.SSML__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.SSML__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SpeechSynthesisPackage.SSML__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SpeechSynthesisPackage.SSML__AUDIO:
				return !getAudio().isEmpty();
			case SpeechSynthesisPackage.SSML__AWS:
				return getAws() != null;
			case SpeechSynthesisPackage.SSML__BREAK:
				return !getBreak().isEmpty();
			case SpeechSynthesisPackage.SSML__DESC:
				return getDesc() != null;
			case SpeechSynthesisPackage.SSML__EMPHASIS:
				return !getEmphasis().isEmpty();
			case SpeechSynthesisPackage.SSML__LANG:
				return getLang() != null;
			case SpeechSynthesisPackage.SSML__LOOKUP:
				return getLookup() != null;
			case SpeechSynthesisPackage.SSML__MARK:
				return !getMark().isEmpty();
			case SpeechSynthesisPackage.SSML__P:
				return !getP().isEmpty();
			case SpeechSynthesisPackage.SSML__STRUCT:
				return getStruct() != null;
			case SpeechSynthesisPackage.SSML__PHONEME:
				return !getPhoneme().isEmpty();
			case SpeechSynthesisPackage.SSML__PROSODY:
				return !getProsody().isEmpty();
			case SpeechSynthesisPackage.SSML__S:
				return !getS().isEmpty();
			case SpeechSynthesisPackage.SSML__SAY_AS:
				return !getSayAs().isEmpty();
			case SpeechSynthesisPackage.SSML__SPEAK:
				return getSpeak() != null;
			case SpeechSynthesisPackage.SSML__SUB:
				return !getSub().isEmpty();
			case SpeechSynthesisPackage.SSML__TOKEN:
				return getToken() != null;
			case SpeechSynthesisPackage.SSML__VOICE:
				return !getVoice().isEmpty();
			case SpeechSynthesisPackage.SSML__W:
				return getW() != null;
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
		result.append(')');
		return result.toString();
	}

} //SSMLImpl
