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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phrase Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl#getPhrases <em>Phrases</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhraseMappingImpl extends MinimalEObjectImpl.Container implements PhraseMapping {
	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticContent> interpretation;

	/**
	 * The cached value of the '{@link #getPhrases() <em>Phrases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhrases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> phrases;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhraseMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Grammar_rulesPackage.Literals.PHRASE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticContent> getInterpretation() {
		if (interpretation == null) {
			interpretation = new EObjectContainmentEList<SemanticContent>(SemanticContent.class, this, Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION);
		}
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPhrases() {
		if (phrases == null) {
			phrases = new EDataTypeUniqueEList<String>(String.class, this, Grammar_rulesPackage.PHRASE_MAPPING__PHRASES);
		}
		return phrases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Grammar_rulesPackage.PHRASE_MAPPING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION:
				return ((InternalEList<?>)getInterpretation()).basicRemove(otherEnd, msgs);
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
			case Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION:
				return getInterpretation();
			case Grammar_rulesPackage.PHRASE_MAPPING__PHRASES:
				return getPhrases();
			case Grammar_rulesPackage.PHRASE_MAPPING__DESCRIPTION:
				return getDescription();
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
			case Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION:
				getInterpretation().clear();
				getInterpretation().addAll((Collection<? extends SemanticContent>)newValue);
				return;
			case Grammar_rulesPackage.PHRASE_MAPPING__PHRASES:
				getPhrases().clear();
				getPhrases().addAll((Collection<? extends String>)newValue);
				return;
			case Grammar_rulesPackage.PHRASE_MAPPING__DESCRIPTION:
				setDescription((String)newValue);
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
			case Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION:
				getInterpretation().clear();
				return;
			case Grammar_rulesPackage.PHRASE_MAPPING__PHRASES:
				getPhrases().clear();
				return;
			case Grammar_rulesPackage.PHRASE_MAPPING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Grammar_rulesPackage.PHRASE_MAPPING__INTERPRETATION:
				return interpretation != null && !interpretation.isEmpty();
			case Grammar_rulesPackage.PHRASE_MAPPING__PHRASES:
				return phrases != null && !phrases.isEmpty();
			case Grammar_rulesPackage.PHRASE_MAPPING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (phrases: ");
		result.append(phrases);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PhraseMappingImpl
