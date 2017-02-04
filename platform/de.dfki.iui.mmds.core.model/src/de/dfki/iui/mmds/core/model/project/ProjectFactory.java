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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage
 * @generated
 */
public interface ProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectFactory eINSTANCE = de.dfki.iui.mmds.core.model.project.impl.ProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Siam Internal Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Siam Internal Service Interface</em>'.
	 * @generated
	 */
	SiamInternalServiceInterface createSiamInternalServiceInterface();

	/**
	 * Returns a new object of class '<em>Siam Internal Speech Input Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Siam Internal Speech Input Service Interface</em>'.
	 * @generated
	 */
	SiamInternalSpeechInputServiceInterface createSiamInternalSpeechInputServiceInterface();

	/**
	 * Returns a new object of class '<em>Input Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Mapping Rules</em>'.
	 * @generated
	 */
	InputMappingRules createInputMappingRules();

	/**
	 * Returns a new object of class '<em>Output Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Mapping Rules</em>'.
	 * @generated
	 */
	OutputMappingRules createOutputMappingRules();

	/**
	 * Returns a new object of class '<em>Input Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Mapping Rule</em>'.
	 * @generated
	 */
	InputMappingRule createInputMappingRule();

	/**
	 * Returns a new object of class '<em>Output Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Mapping Rule</em>'.
	 * @generated
	 */
	OutputMappingRule createOutputMappingRule();

	/**
	 * Returns a new object of class '<em>Mapping Sub Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Sub Rule</em>'.
	 * @generated
	 */
	MappingSubRule createMappingSubRule();

	/**
	 * Returns a new object of class '<em>Java Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Plugin</em>'.
	 * @generated
	 */
	JavaPlugin createJavaPlugin();

	/**
	 * Returns a new object of class '<em>Test Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Message Set</em>'.
	 * @generated
	 */
	TestMessageSet createTestMessageSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjectPackage getProjectPackage();

} //ProjectFactory
