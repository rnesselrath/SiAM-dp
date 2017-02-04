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
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getRuleref <em>Ruleref</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getItem <em>Item</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getExample <em>Example</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeDatatype SCOPE_EDEFAULT = ScopeDatatype.PRIVATE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeDatatype scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GrammarPackage.RULE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(GrammarPackage.Literals.RULE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		return getGroup().list(GrammarPackage.Literals.RULE__TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruleref> getRuleref() {
		return getGroup().list(GrammarPackage.Literals.RULE__RULEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		return getGroup().list(GrammarPackage.Literals.RULE__ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneOf> getOneOf() {
		return getGroup().list(GrammarPackage.Literals.RULE__ONE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTag() {
		return getGroup().list(GrammarPackage.Literals.RULE__TAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExample() {
		return getGroup().list(GrammarPackage.Literals.RULE__EXAMPLE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDatatype getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ScopeDatatype newScope) {
		ScopeDatatype oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		ScopeDatatype oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GrammarPackage.RULE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return scopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.RULE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GrammarPackage.RULE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GrammarPackage.RULE__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case GrammarPackage.RULE__RULEREF:
				return ((InternalEList<?>)getRuleref()).basicRemove(otherEnd, msgs);
			case GrammarPackage.RULE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case GrammarPackage.RULE__ONE_OF:
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
			case GrammarPackage.RULE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GrammarPackage.RULE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GrammarPackage.RULE__TOKEN:
				return getToken();
			case GrammarPackage.RULE__RULEREF:
				return getRuleref();
			case GrammarPackage.RULE__ITEM:
				return getItem();
			case GrammarPackage.RULE__ONE_OF:
				return getOneOf();
			case GrammarPackage.RULE__TAG:
				return getTag();
			case GrammarPackage.RULE__EXAMPLE:
				return getExample();
			case GrammarPackage.RULE__ID:
				return getId();
			case GrammarPackage.RULE__SCOPE:
				return getScope();
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
			case GrammarPackage.RULE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GrammarPackage.RULE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GrammarPackage.RULE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case GrammarPackage.RULE__RULEREF:
				getRuleref().clear();
				getRuleref().addAll((Collection<? extends Ruleref>)newValue);
				return;
			case GrammarPackage.RULE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case GrammarPackage.RULE__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends OneOf>)newValue);
				return;
			case GrammarPackage.RULE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case GrammarPackage.RULE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends String>)newValue);
				return;
			case GrammarPackage.RULE__ID:
				setId((String)newValue);
				return;
			case GrammarPackage.RULE__SCOPE:
				setScope((ScopeDatatype)newValue);
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
			case GrammarPackage.RULE__MIXED:
				getMixed().clear();
				return;
			case GrammarPackage.RULE__GROUP:
				getGroup().clear();
				return;
			case GrammarPackage.RULE__TOKEN:
				getToken().clear();
				return;
			case GrammarPackage.RULE__RULEREF:
				getRuleref().clear();
				return;
			case GrammarPackage.RULE__ITEM:
				getItem().clear();
				return;
			case GrammarPackage.RULE__ONE_OF:
				getOneOf().clear();
				return;
			case GrammarPackage.RULE__TAG:
				getTag().clear();
				return;
			case GrammarPackage.RULE__EXAMPLE:
				getExample().clear();
				return;
			case GrammarPackage.RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case GrammarPackage.RULE__SCOPE:
				unsetScope();
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
			case GrammarPackage.RULE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GrammarPackage.RULE__GROUP:
				return !getGroup().isEmpty();
			case GrammarPackage.RULE__TOKEN:
				return !getToken().isEmpty();
			case GrammarPackage.RULE__RULEREF:
				return !getRuleref().isEmpty();
			case GrammarPackage.RULE__ITEM:
				return !getItem().isEmpty();
			case GrammarPackage.RULE__ONE_OF:
				return !getOneOf().isEmpty();
			case GrammarPackage.RULE__TAG:
				return !getTag().isEmpty();
			case GrammarPackage.RULE__EXAMPLE:
				return !getExample().isEmpty();
			case GrammarPackage.RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GrammarPackage.RULE__SCOPE:
				return isSetScope();
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
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RuleImpl
