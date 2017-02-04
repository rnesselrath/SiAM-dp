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

import de.dfki.iui.mmds.core.model.project.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectFactoryImpl extends EFactoryImpl implements ProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectFactory init() {
		try {
			ProjectFactory theProjectFactory = (ProjectFactory)EPackage.Registry.INSTANCE.getEFactory(ProjectPackage.eNS_URI);
			if (theProjectFactory != null) {
				return theProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProjectPackage.PROJECT: return createProject();
			case ProjectPackage.SIAM_INTERNAL_SERVICE_INTERFACE: return createSiamInternalServiceInterface();
			case ProjectPackage.SIAM_INTERNAL_SPEECH_INPUT_SERVICE_INTERFACE: return createSiamInternalSpeechInputServiceInterface();
			case ProjectPackage.INPUT_MAPPING_RULES: return createInputMappingRules();
			case ProjectPackage.OUTPUT_MAPPING_RULES: return createOutputMappingRules();
			case ProjectPackage.INPUT_MAPPING_RULE: return createInputMappingRule();
			case ProjectPackage.OUTPUT_MAPPING_RULE: return createOutputMappingRule();
			case ProjectPackage.MAPPING_SUB_RULE: return createMappingSubRule();
			case ProjectPackage.JAVA_PLUGIN: return createJavaPlugin();
			case ProjectPackage.TEST_MESSAGE_SET: return createTestMessageSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiamInternalServiceInterface createSiamInternalServiceInterface() {
		SiamInternalServiceInterfaceImpl siamInternalServiceInterface = new SiamInternalServiceInterfaceImpl();
		return siamInternalServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiamInternalSpeechInputServiceInterface createSiamInternalSpeechInputServiceInterface() {
		SiamInternalSpeechInputServiceInterfaceImpl siamInternalSpeechInputServiceInterface = new SiamInternalSpeechInputServiceInterfaceImpl();
		return siamInternalSpeechInputServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMappingRules createInputMappingRules() {
		InputMappingRulesImpl inputMappingRules = new InputMappingRulesImpl();
		return inputMappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMappingRules createOutputMappingRules() {
		OutputMappingRulesImpl outputMappingRules = new OutputMappingRulesImpl();
		return outputMappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMappingRule createInputMappingRule() {
		InputMappingRuleImpl inputMappingRule = new InputMappingRuleImpl();
		return inputMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMappingRule createOutputMappingRule() {
		OutputMappingRuleImpl outputMappingRule = new OutputMappingRuleImpl();
		return outputMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSubRule createMappingSubRule() {
		MappingSubRuleImpl mappingSubRule = new MappingSubRuleImpl();
		return mappingSubRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPlugin createJavaPlugin() {
		JavaPluginImpl javaPlugin = new JavaPluginImpl();
		return javaPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMessageSet createTestMessageSet() {
		TestMessageSetImpl testMessageSet = new TestMessageSetImpl();
		return testMessageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPackage getProjectPackage() {
		return (ProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectPackage getPackage() {
		return ProjectPackage.eINSTANCE;
	}

} //ProjectFactoryImpl
