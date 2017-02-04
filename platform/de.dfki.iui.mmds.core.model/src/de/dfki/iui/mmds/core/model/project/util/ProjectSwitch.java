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
package de.dfki.iui.mmds.core.model.project.util;

import de.dfki.iui.mmds.core.model.project.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage
 * @generated
 */
public class ProjectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProjectPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE: {
				SiamInternalServiceInterface siamInternalServiceInterface = (SiamInternalServiceInterface)theEObject;
				T result = caseSiamInternalServiceInterface(siamInternalServiceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE: {
				SiamInternalSpeechInputServiceInterface siamInternalSpeechInputServiceInterface = (SiamInternalSpeechInputServiceInterface)theEObject;
				T result = caseSiamInternalSpeechInputServiceInterface(siamInternalSpeechInputServiceInterface);
				if (result == null) result = caseSiamInternalServiceInterface(siamInternalSpeechInputServiceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.MAPPING_RULES: {
				MappingRules mappingRules = (MappingRules)theEObject;
				T result = caseMappingRules(mappingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.INPUT_MAPPING_RULES: {
				InputMappingRules inputMappingRules = (InputMappingRules)theEObject;
				T result = caseInputMappingRules(inputMappingRules);
				if (result == null) result = caseMappingRules(inputMappingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.OUTPUT_MAPPING_RULES: {
				OutputMappingRules outputMappingRules = (OutputMappingRules)theEObject;
				T result = caseOutputMappingRules(outputMappingRules);
				if (result == null) result = caseMappingRules(outputMappingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.MAPPING_RULE: {
				MappingRule mappingRule = (MappingRule)theEObject;
				T result = caseMappingRule(mappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.INPUT_MAPPING_RULE: {
				InputMappingRule inputMappingRule = (InputMappingRule)theEObject;
				T result = caseInputMappingRule(inputMappingRule);
				if (result == null) result = caseMappingRule(inputMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.OUTPUT_MAPPING_RULE: {
				OutputMappingRule outputMappingRule = (OutputMappingRule)theEObject;
				T result = caseOutputMappingRule(outputMappingRule);
				if (result == null) result = caseMappingRule(outputMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.MAPPING_SUB_RULE: {
				MappingSubRule mappingSubRule = (MappingSubRule)theEObject;
				T result = caseMappingSubRule(mappingSubRule);
				if (result == null) result = caseMappingRule(mappingSubRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.JAVA_PLUGIN: {
				JavaPlugin javaPlugin = (JavaPlugin)theEObject;
				T result = caseJavaPlugin(javaPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjectPackage.TEST_MESSAGE_SET: {
				TestMessageSet testMessageSet = (TestMessageSet)theEObject;
				T result = caseTestMessageSet(testMessageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Siam Internal Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Siam Internal Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiamInternalServiceInterface(SiamInternalServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Siam Internal Speech Input Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Siam Internal Speech Input Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiamInternalSpeechInputServiceInterface(SiamInternalSpeechInputServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRules(MappingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Mapping Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMappingRules(InputMappingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Mapping Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMappingRules(OutputMappingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRule(MappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMappingRule(InputMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMappingRule(OutputMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Sub Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Sub Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSubRule(MappingSubRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPlugin(JavaPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Message Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestMessageSet(TestMessageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProjectSwitch
