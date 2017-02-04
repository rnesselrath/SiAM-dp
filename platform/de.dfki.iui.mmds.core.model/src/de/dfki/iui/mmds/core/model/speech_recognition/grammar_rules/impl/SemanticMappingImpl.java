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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl#getPhraseMappings <em>Phrase Mappings</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticMappingImpl extends MinimalEObjectImpl.Container implements SemanticMapping {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

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
	 * The cached value of the '{@link #getPhraseMappings() <em>Phrase Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhraseMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PhraseMapping> phraseMappings;

	/**
	 * The cached value of the '{@link #getMappingTarget() <em>Mapping Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingTarget()
	 * @generated
	 * @ordered
	 */
	protected SemanticContent mappingTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Grammar_rulesPackage.Literals.SEMANTIC_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Grammar_rulesPackage.SEMANTIC_MAPPING__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Grammar_rulesPackage.SEMANTIC_MAPPING__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhraseMapping> getPhraseMappings() {
		if (phraseMappings == null) {
			phraseMappings = new EObjectContainmentEList<PhraseMapping>(PhraseMapping.class, this, Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS);
		}
		return phraseMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticContent getMappingTarget() {
		return mappingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingTarget(SemanticContent newMappingTarget, NotificationChain msgs) {
		SemanticContent oldMappingTarget = mappingTarget;
		mappingTarget = newMappingTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET, oldMappingTarget, newMappingTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingTarget(SemanticContent newMappingTarget) {
		if (newMappingTarget != mappingTarget) {
			NotificationChain msgs = null;
			if (mappingTarget != null)
				msgs = ((InternalEObject)mappingTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET, null, msgs);
			if (newMappingTarget != null)
				msgs = ((InternalEObject)newMappingTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET, null, msgs);
			msgs = basicSetMappingTarget(newMappingTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET, newMappingTarget, newMappingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS:
				return ((InternalEList<?>)getPhraseMappings()).basicRemove(otherEnd, msgs);
			case Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET:
				return basicSetMappingTarget(null, msgs);
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
			case Grammar_rulesPackage.SEMANTIC_MAPPING__NAME:
				return getName();
			case Grammar_rulesPackage.SEMANTIC_MAPPING__ENABLED:
				return isEnabled();
			case Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS:
				return getPhraseMappings();
			case Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET:
				return getMappingTarget();
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
			case Grammar_rulesPackage.SEMANTIC_MAPPING__NAME:
				setName((String)newValue);
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS:
				getPhraseMappings().clear();
				getPhraseMappings().addAll((Collection<? extends PhraseMapping>)newValue);
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET:
				setMappingTarget((SemanticContent)newValue);
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
			case Grammar_rulesPackage.SEMANTIC_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS:
				getPhraseMappings().clear();
				return;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET:
				setMappingTarget((SemanticContent)null);
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
			case Grammar_rulesPackage.SEMANTIC_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Grammar_rulesPackage.SEMANTIC_MAPPING__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case Grammar_rulesPackage.SEMANTIC_MAPPING__PHRASE_MAPPINGS:
				return phraseMappings != null && !phraseMappings.isEmpty();
			case Grammar_rulesPackage.SEMANTIC_MAPPING__MAPPING_TARGET:
				return mappingTarget != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //SemanticMappingImpl
