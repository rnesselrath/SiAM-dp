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
package de.dfki.iui.mmds.core.model.project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectPackage eINSTANCE = de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Guis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GUIS = 0;

	/**
	 * The feature id for the '<em><b>Knowledge Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KNOWLEDGE_BASE = 1;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIALOGUE = 2;

	/**
	 * The feature id for the '<em><b>Task Plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASK_PLANS = 3;

	/**
	 * The feature id for the '<em><b>Grammar Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GRAMMAR_RULES = 4;

	/**
	 * The feature id for the '<em><b>Entity Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ENTITY_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Digital Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIGITAL_RESOURCES = 6;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MAPPING_RULES = 7;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PLUGINS = 8;

	/**
	 * The feature id for the '<em><b>Localization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LOCALIZATION = 9;

	/**
	 * The feature id for the '<em><b>Supported Service Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUPPORTED_SERVICE_INTERFACES = 10;

	/**
	 * The feature id for the '<em><b>Test Messages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TEST_MESSAGES = 11;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl <em>Siam Internal Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getSiamInternalServiceInterface()
	 * @generated
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Siam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID = 0;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY = 3;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT = 4;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Init Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES = 6;

	/**
	 * The number of structural features of the '<em>Siam Internal Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Siam Internal Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalSpeechInputServiceInterfaceImpl <em>Siam Internal Speech Input Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.SiamInternalSpeechInputServiceInterfaceImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getSiamInternalSpeechInputServiceInterface()
	 * @generated
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Siam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__SIAM_ID = SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__SERVICE_INSTANCE_ID = SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__SERVICE_NAME = SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__MODALITY = SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__PARTICIPANT = SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__SERVICE_TYPE = SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Init Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__INIT_MESSAGES = SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES;

	/**
	 * The feature id for the '<em><b>Grammar Ruleset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID = SIAM_INTERNAL_SERVICE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Siam Internal Speech Input Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE_FEATURE_COUNT = SIAM_INTERNAL_SERVICE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Siam Internal Speech Input Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE_OPERATION_COUNT = SIAM_INTERNAL_SERVICE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.MappingRules <em>Mapping Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.MappingRules
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingRules()
	 * @generated
	 */
	int MAPPING_RULES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULES__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Subrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULES__SUBRULES = 1;

	/**
	 * The number of structural features of the '<em>Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.InputMappingRulesImpl <em>Input Mapping Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.InputMappingRulesImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getInputMappingRules()
	 * @generated
	 */
	int INPUT_MAPPING_RULES = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULES__DESCRIPTION = MAPPING_RULES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULES__SUBRULES = MAPPING_RULES__SUBRULES;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULES__RULES = MAPPING_RULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULES_FEATURE_COUNT = MAPPING_RULES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULES_OPERATION_COUNT = MAPPING_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.OutputMappingRulesImpl <em>Output Mapping Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.OutputMappingRulesImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getOutputMappingRules()
	 * @generated
	 */
	int OUTPUT_MAPPING_RULES = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULES__DESCRIPTION = MAPPING_RULES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULES__SUBRULES = MAPPING_RULES__SUBRULES;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULES__RULES = MAPPING_RULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULES_FEATURE_COUNT = MAPPING_RULES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Mapping Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULES_OPERATION_COUNT = MAPPING_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.MappingRule <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.MappingRule
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingRule()
	 * @generated
	 */
	int MAPPING_RULE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__ACTIVE = 2;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.InputMappingRuleImpl <em>Input Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.InputMappingRuleImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getInputMappingRule()
	 * @generated
	 */
	int INPUT_MAPPING_RULE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE__DESCRIPTION = MAPPING_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE__CONDITION = MAPPING_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE__ACTIVE = MAPPING_RULE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE__TARGET = MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE_FEATURE_COUNT = MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_RULE_OPERATION_COUNT = MAPPING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.OutputMappingRuleImpl <em>Output Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.OutputMappingRuleImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getOutputMappingRule()
	 * @generated
	 */
	int OUTPUT_MAPPING_RULE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE__DESCRIPTION = MAPPING_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE__CONDITION = MAPPING_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE__ACTIVE = MAPPING_RULE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE__TARGET = MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE_FEATURE_COUNT = MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MAPPING_RULE_OPERATION_COUNT = MAPPING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.MappingSubRuleImpl <em>Mapping Sub Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.MappingSubRuleImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingSubRule()
	 * @generated
	 */
	int MAPPING_SUB_RULE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE__DESCRIPTION = MAPPING_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE__CONDITION = MAPPING_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE__ACTIVE = MAPPING_RULE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE__TARGET = MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Sub Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE_FEATURE_COUNT = MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapping Sub Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SUB_RULE_OPERATION_COUNT = MAPPING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.JavaPluginImpl <em>Java Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.JavaPluginImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getJavaPlugin()
	 * @generated
	 */
	int JAVA_PLUGIN = 10;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PLUGIN__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PLUGIN__NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Java Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PLUGIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PLUGIN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.project.impl.TestMessageSetImpl <em>Test Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.project.impl.TestMessageSetImpl
	 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getTestMessageSet()
	 * @generated
	 */
	int TEST_MESSAGE_SET = 11;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE_SET__MESSAGES = 0;

	/**
	 * The number of structural features of the '<em>Test Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE_SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getGuis <em>Guis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guis</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getGuis()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Guis();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.project.Project#getKnowledgeBase <em>Knowledge Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getKnowledgeBase()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_KnowledgeBase();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getGrammarRules <em>Grammar Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grammar Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getGrammarRules()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_GrammarRules();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getEntityResource <em>Entity Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getEntityResource()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_EntityResource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getDigitalResources <em>Digital Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Resources</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getDigitalResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_DigitalResources();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.project.Project#getDialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dialogue</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getDialogue()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Dialogue();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getTaskPlans <em>Task Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Plans</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getTaskPlans()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_TaskPlans();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getMappingRules()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_MappingRules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getPlugins()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Plugins();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getLocalization <em>Localization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localization</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getLocalization()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Localization();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.Project#getSupportedServiceInterfaces <em>Supported Service Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Service Interfaces</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getSupportedServiceInterfaces()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_SupportedServiceInterfaces();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.project.Project#getTestMessages <em>Test Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Messages</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.Project#getTestMessages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_TestMessages();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface <em>Siam Internal Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Siam Internal Service Interface</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface
	 * @generated
	 */
	EClass getSiamInternalServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getSiamId <em>Siam Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Siam Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getSiamId()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EAttribute getSiamInternalServiceInterface_SiamId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceInstanceId <em>Service Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceInstanceId()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EAttribute getSiamInternalServiceInterface_ServiceInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceName()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EAttribute getSiamInternalServiceInterface_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getModality()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EAttribute getSiamInternalServiceInterface_Modality();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getParticipant()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EReference getSiamInternalServiceInterface_Participant();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceType()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EReference getSiamInternalServiceInterface_ServiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getInitMessages <em>Init Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Messages</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getInitMessages()
	 * @see #getSiamInternalServiceInterface()
	 * @generated
	 */
	EReference getSiamInternalServiceInterface_InitMessages();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface <em>Siam Internal Speech Input Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Siam Internal Speech Input Service Interface</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface
	 * @generated
	 */
	EClass getSiamInternalSpeechInputServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface#getGrammarRulesetId <em>Grammar Ruleset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar Ruleset Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface#getGrammarRulesetId()
	 * @see #getSiamInternalSpeechInputServiceInterface()
	 * @generated
	 */
	EAttribute getSiamInternalSpeechInputServiceInterface_GrammarRulesetId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.MappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRules
	 * @generated
	 */
	EClass getMappingRules();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.MappingRules#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRules#getDescription()
	 * @see #getMappingRules()
	 * @generated
	 */
	EAttribute getMappingRules_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.MappingRules#getSubrules <em>Subrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRules#getSubrules()
	 * @see #getMappingRules()
	 * @generated
	 */
	EReference getMappingRules_Subrules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.InputMappingRules <em>Input Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Mapping Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.InputMappingRules
	 * @generated
	 */
	EClass getInputMappingRules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.InputMappingRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.InputMappingRules#getRules()
	 * @see #getInputMappingRules()
	 * @generated
	 */
	EReference getInputMappingRules_Rules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.OutputMappingRules <em>Output Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Mapping Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.OutputMappingRules
	 * @generated
	 */
	EClass getOutputMappingRules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.OutputMappingRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.OutputMappingRules#getRules()
	 * @see #getOutputMappingRules()
	 * @generated
	 */
	EReference getOutputMappingRules_Rules();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRule
	 * @generated
	 */
	EClass getMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.MappingRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRule#getDescription()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.project.MappingRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRule#getCondition()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.MappingRule#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingRule#isActive()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Active();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.InputMappingRule <em>Input Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Mapping Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.InputMappingRule
	 * @generated
	 */
	EClass getInputMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.InputMappingRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.InputMappingRule#getTarget()
	 * @see #getInputMappingRule()
	 * @generated
	 */
	EReference getInputMappingRule_Target();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.OutputMappingRule <em>Output Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Mapping Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.OutputMappingRule
	 * @generated
	 */
	EClass getOutputMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.OutputMappingRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.OutputMappingRule#getTarget()
	 * @see #getOutputMappingRule()
	 * @generated
	 */
	EReference getOutputMappingRule_Target();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.MappingSubRule <em>Mapping Sub Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Sub Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingSubRule
	 * @generated
	 */
	EClass getMappingSubRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.MappingSubRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.MappingSubRule#getTarget()
	 * @see #getMappingSubRule()
	 * @generated
	 */
	EReference getMappingSubRule_Target();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.JavaPlugin <em>Java Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Plugin</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.JavaPlugin
	 * @generated
	 */
	EClass getJavaPlugin();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.JavaPlugin#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.JavaPlugin#getClassName()
	 * @see #getJavaPlugin()
	 * @generated
	 */
	EAttribute getJavaPlugin_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.project.JavaPlugin#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.JavaPlugin#getNamespace()
	 * @see #getJavaPlugin()
	 * @generated
	 */
	EAttribute getJavaPlugin_Namespace();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.project.TestMessageSet <em>Test Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Message Set</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.TestMessageSet
	 * @generated
	 */
	EClass getTestMessageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.project.TestMessageSet#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see de.dfki.iui.mmds.core.model.project.TestMessageSet#getMessages()
	 * @see #getTestMessageSet()
	 * @generated
	 */
	EReference getTestMessageSet_Messages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectFactory getProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Guis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__GUIS = eINSTANCE.getProject_Guis();

		/**
		 * The meta object literal for the '<em><b>Knowledge Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__KNOWLEDGE_BASE = eINSTANCE.getProject_KnowledgeBase();

		/**
		 * The meta object literal for the '<em><b>Grammar Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__GRAMMAR_RULES = eINSTANCE.getProject_GrammarRules();

		/**
		 * The meta object literal for the '<em><b>Entity Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ENTITY_RESOURCE = eINSTANCE.getProject_EntityResource();

		/**
		 * The meta object literal for the '<em><b>Digital Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIGITAL_RESOURCES = eINSTANCE.getProject_DigitalResources();

		/**
		 * The meta object literal for the '<em><b>Dialogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIALOGUE = eINSTANCE.getProject_Dialogue();

		/**
		 * The meta object literal for the '<em><b>Task Plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TASK_PLANS = eINSTANCE.getProject_TaskPlans();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MAPPING_RULES = eINSTANCE.getProject_MappingRules();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PLUGINS = eINSTANCE.getProject_Plugins();

		/**
		 * The meta object literal for the '<em><b>Localization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LOCALIZATION = eINSTANCE.getProject_Localization();

		/**
		 * The meta object literal for the '<em><b>Supported Service Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SUPPORTED_SERVICE_INTERFACES = eINSTANCE.getProject_SupportedServiceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Test Messages</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TEST_MESSAGES = eINSTANCE.getProject_TestMessages();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl <em>Siam Internal Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.SiamInternalServiceInterfaceImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getSiamInternalServiceInterface()
		 * @generated
		 */
		EClass SIAM_INTERNAL_SERVICE_INTERFACE = eINSTANCE.getSiamInternalServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Siam Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIAM_INTERNAL_SERVICE_INTERFACE__SIAM_ID = eINSTANCE.getSiamInternalServiceInterface_SiamId();

		/**
		 * The meta object literal for the '<em><b>Service Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_INSTANCE_ID = eINSTANCE.getSiamInternalServiceInterface_ServiceInstanceId();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_NAME = eINSTANCE.getSiamInternalServiceInterface_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIAM_INTERNAL_SERVICE_INTERFACE__MODALITY = eINSTANCE.getSiamInternalServiceInterface_Modality();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIAM_INTERNAL_SERVICE_INTERFACE__PARTICIPANT = eINSTANCE.getSiamInternalServiceInterface_Participant();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIAM_INTERNAL_SERVICE_INTERFACE__SERVICE_TYPE = eINSTANCE.getSiamInternalServiceInterface_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Init Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIAM_INTERNAL_SERVICE_INTERFACE__INIT_MESSAGES = eINSTANCE.getSiamInternalServiceInterface_InitMessages();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.SiamInternalSpeechInputServiceInterfaceImpl <em>Siam Internal Speech Input Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.SiamInternalSpeechInputServiceInterfaceImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getSiamInternalSpeechInputServiceInterface()
		 * @generated
		 */
		EClass SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE = eINSTANCE.getSiamInternalSpeechInputServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Grammar Ruleset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE__GRAMMAR_RULESET_ID = eINSTANCE.getSiamInternalSpeechInputServiceInterface_GrammarRulesetId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.MappingRules <em>Mapping Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.MappingRules
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingRules()
		 * @generated
		 */
		EClass MAPPING_RULES = eINSTANCE.getMappingRules();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULES__DESCRIPTION = eINSTANCE.getMappingRules_Description();

		/**
		 * The meta object literal for the '<em><b>Subrules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULES__SUBRULES = eINSTANCE.getMappingRules_Subrules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.InputMappingRulesImpl <em>Input Mapping Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.InputMappingRulesImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getInputMappingRules()
		 * @generated
		 */
		EClass INPUT_MAPPING_RULES = eINSTANCE.getInputMappingRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MAPPING_RULES__RULES = eINSTANCE.getInputMappingRules_Rules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.OutputMappingRulesImpl <em>Output Mapping Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.OutputMappingRulesImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getOutputMappingRules()
		 * @generated
		 */
		EClass OUTPUT_MAPPING_RULES = eINSTANCE.getOutputMappingRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_MAPPING_RULES__RULES = eINSTANCE.getOutputMappingRules_Rules();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.MappingRule <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.MappingRule
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingRule()
		 * @generated
		 */
		EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__DESCRIPTION = eINSTANCE.getMappingRule_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__CONDITION = eINSTANCE.getMappingRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__ACTIVE = eINSTANCE.getMappingRule_Active();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.InputMappingRuleImpl <em>Input Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.InputMappingRuleImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getInputMappingRule()
		 * @generated
		 */
		EClass INPUT_MAPPING_RULE = eINSTANCE.getInputMappingRule();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MAPPING_RULE__TARGET = eINSTANCE.getInputMappingRule_Target();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.OutputMappingRuleImpl <em>Output Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.OutputMappingRuleImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getOutputMappingRule()
		 * @generated
		 */
		EClass OUTPUT_MAPPING_RULE = eINSTANCE.getOutputMappingRule();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_MAPPING_RULE__TARGET = eINSTANCE.getOutputMappingRule_Target();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.MappingSubRuleImpl <em>Mapping Sub Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.MappingSubRuleImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getMappingSubRule()
		 * @generated
		 */
		EClass MAPPING_SUB_RULE = eINSTANCE.getMappingSubRule();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_SUB_RULE__TARGET = eINSTANCE.getMappingSubRule_Target();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.JavaPluginImpl <em>Java Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.JavaPluginImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getJavaPlugin()
		 * @generated
		 */
		EClass JAVA_PLUGIN = eINSTANCE.getJavaPlugin();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PLUGIN__CLASS_NAME = eINSTANCE.getJavaPlugin_ClassName();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PLUGIN__NAMESPACE = eINSTANCE.getJavaPlugin_Namespace();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.project.impl.TestMessageSetImpl <em>Test Message Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.project.impl.TestMessageSetImpl
		 * @see de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl#getTestMessageSet()
		 * @generated
		 */
		EClass TEST_MESSAGE_SET = eINSTANCE.getTestMessageSet();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MESSAGE_SET__MESSAGES = eINSTANCE.getTestMessageSet_Messages();

	}

} //ProjectPackage
