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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sentence;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getSentenceClass <em>Sentence Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentenceImpl extends MinimalEObjectImpl.Container implements Sentence {
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
	protected SentenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.SENTENCE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSentenceClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SENTENCE__SENTENCE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup() {
		return (FeatureMap)getSentenceClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SENTENCE__AWS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAws() {
		return getAwsGroup().list(SpeechSynthesisPackage.Literals.SENTENCE__AWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup() {
		return getSentenceClass().list(SpeechSynthesisPackage.Literals.SENTENCE__LOOKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getSentenceClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SENTENCE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SENTENCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SENTENCE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SENTENCE__ONLANGFAILURE, oldOnlangfailure, onlangfailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE);
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
			case SpeechSynthesisPackage.SENTENCE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__SENTENCE_CLASS:
				return ((InternalEList<?>)getSentenceClass()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__AWS_GROUP:
				return ((InternalEList<?>)getAwsGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__AWS:
				return ((InternalEList<?>)getAws()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__LOOKUP:
				return ((InternalEList<?>)getLookup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SENTENCE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.SENTENCE__SENTENCE_CLASS:
				if (coreType) return getSentenceClass();
				return ((FeatureMap.Internal)getSentenceClass()).getWrapper();
			case SpeechSynthesisPackage.SENTENCE__AWS_GROUP:
				if (coreType) return getAwsGroup();
				return ((FeatureMap.Internal)getAwsGroup()).getWrapper();
			case SpeechSynthesisPackage.SENTENCE__AWS:
				return getAws();
			case SpeechSynthesisPackage.SENTENCE__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.SENTENCE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.SENTENCE__ID:
				return getId();
			case SpeechSynthesisPackage.SENTENCE__LANG:
				return getLang();
			case SpeechSynthesisPackage.SENTENCE__ONLANGFAILURE:
				return getOnlangfailure();
			case SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SENTENCE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__SENTENCE_CLASS:
				((FeatureMap.Internal)getSentenceClass()).set(newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__AWS_GROUP:
				((FeatureMap.Internal)getAwsGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__LOOKUP:
				getLookup().clear();
				getLookup().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__ID:
				setId((String)newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__LANG:
				setLang((String)newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__ONLANGFAILURE:
				setOnlangfailure((String)newValue);
				return;
			case SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SENTENCE__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.SENTENCE__SENTENCE_CLASS:
				getSentenceClass().clear();
				return;
			case SpeechSynthesisPackage.SENTENCE__AWS_GROUP:
				getAwsGroup().clear();
				return;
			case SpeechSynthesisPackage.SENTENCE__LOOKUP:
				getLookup().clear();
				return;
			case SpeechSynthesisPackage.SENTENCE__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.SENTENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SENTENCE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SENTENCE__ONLANGFAILURE:
				setOnlangfailure(ONLANGFAILURE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SENTENCE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.SENTENCE__SENTENCE_CLASS:
				return !getSentenceClass().isEmpty();
			case SpeechSynthesisPackage.SENTENCE__AWS_GROUP:
				return !getAwsGroup().isEmpty();
			case SpeechSynthesisPackage.SENTENCE__AWS:
				return !getAws().isEmpty();
			case SpeechSynthesisPackage.SENTENCE__LOOKUP:
				return !getLookup().isEmpty();
			case SpeechSynthesisPackage.SENTENCE__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.SENTENCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpeechSynthesisPackage.SENTENCE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SpeechSynthesisPackage.SENTENCE__ONLANGFAILURE:
				return ONLANGFAILURE_EDEFAULT == null ? onlangfailure != null : !ONLANGFAILURE_EDEFAULT.equals(onlangfailure);
			case SpeechSynthesisPackage.SENTENCE__ANY_ATTRIBUTE:
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
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SentenceImpl
