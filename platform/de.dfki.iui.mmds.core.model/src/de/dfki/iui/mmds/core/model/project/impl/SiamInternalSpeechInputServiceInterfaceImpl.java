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
package de.dfki.iui.mmds.core.model.project.impl;

import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Siam Internal Speech Input Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalSpeechInputServiceInterfaceImpl#getGrammarRulesetId <em>Grammar Ruleset Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiamInternalSpeechInputServiceInterfaceImpl extends SiamInternalServiceInterfaceImpl implements SiamInternalSpeechInputServiceInterface {
	/**
	 * The default value of the '{@link #getGrammarRulesetId() <em>Grammar Ruleset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarRulesetId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAMMAR_RULESET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrammarRulesetId() <em>Grammar Ruleset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarRulesetId()
	 * @generated
	 * @ordered
	 */
	protected String grammarRulesetId = GRAMMAR_RULESET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiamInternalSpeechInputServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrammarRulesetId() {
		return grammarRulesetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammarRulesetId(String newGrammarRulesetId) {
		String oldGrammarRulesetId = grammarRulesetId;
		grammarRulesetId = newGrammarRulesetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID, oldGrammarRulesetId, grammarRulesetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID:
				return getGrammarRulesetId();
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
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID:
				setGrammarRulesetId((String)newValue);
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
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID:
				setGrammarRulesetId(GRAMMAR_RULESET_ID_EDEFAULT);
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
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID:
				return GRAMMAR_RULESET_ID_EDEFAULT == null ? grammarRulesetId != null : !GRAMMAR_RULESET_ID_EDEFAULT.equals(grammarRulesetId);
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
		result.append(" (grammarRulesetId: ");
		result.append(grammarRulesetId);
		result.append(')');
		return result.toString();
	}

} //SiamInternalSpeechInputServiceInterfaceImpl
