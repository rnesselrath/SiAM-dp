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

import de.dfki.iui.mmds.core.model.base.DigitalResource;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.LocalizationResource;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.io.gui.Window;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;

import de.dfki.iui.mmds.core.model.task.TPlan;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getGuis <em>Guis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getKnowledgeBase <em>Knowledge Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getTaskPlans <em>Task Plans</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getGrammarRules <em>Grammar Rules</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getEntityResource <em>Entity Resource</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getDigitalResources <em>Digital Resources</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getLocalization <em>Localization</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getSupportedServiceInterfaces <em>Supported Service Interfaces</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.Project#getTestMessages <em>Test Messages</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Guis</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.gui.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guis</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_Guis()
	 * @model
	 * @generated
	 */
	EList<Window> getGuis();

	/**
	 * Returns the value of the '<em><b>Knowledge Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Base</em>' reference.
	 * @see #setKnowledgeBase(KnowledgeBase)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_KnowledgeBase()
	 * @model
	 * @generated
	 */
	KnowledgeBase getKnowledgeBase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.Project#getKnowledgeBase <em>Knowledge Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Base</em>' reference.
	 * @see #getKnowledgeBase()
	 * @generated
	 */
	void setKnowledgeBase(KnowledgeBase value);

	/**
	 * Returns the value of the '<em><b>Grammar Rules</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar Rules</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_GrammarRules()
	 * @model
	 * @generated
	 */
	EList<Ruleset> getGrammarRules();

	/**
	 * Returns the value of the '<em><b>Entity Resource</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.EntityResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Resource</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_EntityResource()
	 * @model
	 * @generated
	 */
	EList<EntityResource> getEntityResource();

	/**
	 * Returns the value of the '<em><b>Digital Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.DigitalResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Resources</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_DigitalResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalResource> getDigitalResources();

	/**
	 * Returns the value of the '<em><b>Dialogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogue</em>' reference.
	 * @see #setDialogue(Dialogue)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_Dialogue()
	 * @model required="true"
	 * @generated
	 */
	Dialogue getDialogue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.Project#getDialogue <em>Dialogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogue</em>' reference.
	 * @see #getDialogue()
	 * @generated
	 */
	void setDialogue(Dialogue value);

	/**
	 * Returns the value of the '<em><b>Task Plans</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.task.TPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Plans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Plans</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_TaskPlans()
	 * @model
	 * @generated
	 */
	EList<TPlan> getTaskPlans();

	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.project.MappingRules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_MappingRules()
	 * @model
	 * @generated
	 */
	EList<MappingRules> getMappingRules();

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.project.JavaPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaPlugin> getPlugins();

	/**
	 * Returns the value of the '<em><b>Localization</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.LocalizationResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localization</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_Localization()
	 * @model
	 * @generated
	 */
	EList<LocalizationResource> getLocalization();

	/**
	 * Returns the value of the '<em><b>Supported Service Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Service Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Service Interfaces</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_SupportedServiceInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiamInternalServiceInterface> getSupportedServiceInterfaces();

	/**
	 * Returns the value of the '<em><b>Test Messages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Messages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Messages</em>' reference.
	 * @see #setTestMessages(TestMessageSet)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getProject_TestMessages()
	 * @model
	 * @generated
	 */
	TestMessageSet getTestMessages();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.Project#getTestMessages <em>Test Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Messages</em>' reference.
	 * @see #getTestMessages()
	 * @generated
	 */
	void setTestMessages(TestMessageSet value);

} // Project
