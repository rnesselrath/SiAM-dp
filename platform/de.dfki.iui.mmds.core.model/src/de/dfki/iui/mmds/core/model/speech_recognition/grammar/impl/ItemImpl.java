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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl;

import java.math.BigDecimal;
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
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getRuleExpansion <em>Rule Expansion</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getRuleref <em>Ruleref</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getRepeatProb <em>Repeat Prob</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
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
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected String repeat = REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatProb() <em>Repeat Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatProb()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REPEAT_PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatProb() <em>Repeat Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatProb()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal repeatProb = REPEAT_PROB_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GrammarPackage.ITEM__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRuleExpansion() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(GrammarPackage.Literals.ITEM__RULE_EXPANSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		return getRuleExpansion().list(GrammarPackage.Literals.ITEM__TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruleref> getRuleref() {
		return getRuleExpansion().list(GrammarPackage.Literals.ITEM__RULEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		return getRuleExpansion().list(GrammarPackage.Literals.ITEM__ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneOf> getOneOf() {
		return getRuleExpansion().list(GrammarPackage.Literals.ITEM__ONE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTag() {
		return getRuleExpansion().list(GrammarPackage.Literals.ITEM__TAG);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ITEM__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(String newRepeat) {
		String oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ITEM__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRepeatProb() {
		return repeatProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatProb(BigDecimal newRepeatProb) {
		BigDecimal oldRepeatProb = repeatProb;
		repeatProb = newRepeatProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ITEM__REPEAT_PROB, oldRepeatProb, repeatProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ITEM__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.ITEM__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GrammarPackage.ITEM__RULE_EXPANSION:
				return ((InternalEList<?>)getRuleExpansion()).basicRemove(otherEnd, msgs);
			case GrammarPackage.ITEM__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case GrammarPackage.ITEM__RULEREF:
				return ((InternalEList<?>)getRuleref()).basicRemove(otherEnd, msgs);
			case GrammarPackage.ITEM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case GrammarPackage.ITEM__ONE_OF:
				return ((InternalEList<?>)getOneOf()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.ITEM__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GrammarPackage.ITEM__RULE_EXPANSION:
				if (coreType) return getRuleExpansion();
				return ((FeatureMap.Internal)getRuleExpansion()).getWrapper();
			case GrammarPackage.ITEM__TOKEN:
				return getToken();
			case GrammarPackage.ITEM__RULEREF:
				return getRuleref();
			case GrammarPackage.ITEM__ITEM:
				return getItem();
			case GrammarPackage.ITEM__ONE_OF:
				return getOneOf();
			case GrammarPackage.ITEM__TAG:
				return getTag();
			case GrammarPackage.ITEM__LANG:
				return getLang();
			case GrammarPackage.ITEM__REPEAT:
				return getRepeat();
			case GrammarPackage.ITEM__REPEAT_PROB:
				return getRepeatProb();
			case GrammarPackage.ITEM__WEIGHT:
				return getWeight();
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
			case GrammarPackage.ITEM__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GrammarPackage.ITEM__RULE_EXPANSION:
				((FeatureMap.Internal)getRuleExpansion()).set(newValue);
				return;
			case GrammarPackage.ITEM__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case GrammarPackage.ITEM__RULEREF:
				getRuleref().clear();
				getRuleref().addAll((Collection<? extends Ruleref>)newValue);
				return;
			case GrammarPackage.ITEM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case GrammarPackage.ITEM__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends OneOf>)newValue);
				return;
			case GrammarPackage.ITEM__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case GrammarPackage.ITEM__LANG:
				setLang((String)newValue);
				return;
			case GrammarPackage.ITEM__REPEAT:
				setRepeat((String)newValue);
				return;
			case GrammarPackage.ITEM__REPEAT_PROB:
				setRepeatProb((BigDecimal)newValue);
				return;
			case GrammarPackage.ITEM__WEIGHT:
				setWeight((String)newValue);
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
			case GrammarPackage.ITEM__MIXED:
				getMixed().clear();
				return;
			case GrammarPackage.ITEM__RULE_EXPANSION:
				getRuleExpansion().clear();
				return;
			case GrammarPackage.ITEM__TOKEN:
				getToken().clear();
				return;
			case GrammarPackage.ITEM__RULEREF:
				getRuleref().clear();
				return;
			case GrammarPackage.ITEM__ITEM:
				getItem().clear();
				return;
			case GrammarPackage.ITEM__ONE_OF:
				getOneOf().clear();
				return;
			case GrammarPackage.ITEM__TAG:
				getTag().clear();
				return;
			case GrammarPackage.ITEM__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case GrammarPackage.ITEM__REPEAT:
				setRepeat(REPEAT_EDEFAULT);
				return;
			case GrammarPackage.ITEM__REPEAT_PROB:
				setRepeatProb(REPEAT_PROB_EDEFAULT);
				return;
			case GrammarPackage.ITEM__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case GrammarPackage.ITEM__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GrammarPackage.ITEM__RULE_EXPANSION:
				return !getRuleExpansion().isEmpty();
			case GrammarPackage.ITEM__TOKEN:
				return !getToken().isEmpty();
			case GrammarPackage.ITEM__RULEREF:
				return !getRuleref().isEmpty();
			case GrammarPackage.ITEM__ITEM:
				return !getItem().isEmpty();
			case GrammarPackage.ITEM__ONE_OF:
				return !getOneOf().isEmpty();
			case GrammarPackage.ITEM__TAG:
				return !getTag().isEmpty();
			case GrammarPackage.ITEM__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case GrammarPackage.ITEM__REPEAT:
				return REPEAT_EDEFAULT == null ? repeat != null : !REPEAT_EDEFAULT.equals(repeat);
			case GrammarPackage.ITEM__REPEAT_PROB:
				return REPEAT_PROB_EDEFAULT == null ? repeatProb != null : !REPEAT_PROB_EDEFAULT.equals(repeatProb);
			case GrammarPackage.ITEM__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
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
		result.append(", lang: ");
		result.append(lang);
		result.append(", repeat: ");
		result.append(repeat);
		result.append(", repeatProb: ");
		result.append(repeatProb);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
