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

import de.dfki.iui.mmds.core.model.base.DigitalResource;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.LocalizationResource;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.io.gui.Window;
import de.dfki.iui.mmds.core.model.project.JavaPlugin;
import de.dfki.iui.mmds.core.model.project.MappingRules;
import de.dfki.iui.mmds.core.model.project.Project;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;
import de.dfki.iui.mmds.core.model.project.TestMessageSet;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;

import de.dfki.iui.mmds.core.model.task.TPlan;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getGuis <em>Guis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getKnowledgeBase <em>Knowledge Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getTaskPlans <em>Task Plans</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getGrammarRules <em>Grammar Rules</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getEntityResource <em>Entity Resource</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getDigitalResources <em>Digital Resources</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getLocalization <em>Localization</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getSupportedServiceInterfaces <em>Supported Service Interfaces</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.impl.ProjectImpl#getTestMessages <em>Test Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getGuis() <em>Guis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuis()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> guis;

	/**
	 * The cached value of the '{@link #getKnowledgeBase() <em>Knowledge Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeBase()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeBase knowledgeBase;

	/**
	 * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogue()
	 * @generated
	 * @ordered
	 */
	protected Dialogue dialogue;

	/**
	 * The cached value of the '{@link #getTaskPlans() <em>Task Plans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<TPlan> taskPlans;

	/**
	 * The cached value of the '{@link #getGrammarRules() <em>Grammar Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruleset> grammarRules;

	/**
	 * The cached value of the '{@link #getEntityResource() <em>Entity Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityResource()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityResource> entityResource;

	/**
	 * The cached value of the '{@link #getDigitalResources() <em>Digital Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalResources()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalResource> digitalResources;

	/**
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingRules> mappingRules;

	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaPlugin> plugins;

	/**
	 * The cached value of the '{@link #getLocalization() <em>Localization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalization()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizationResource> localization;

	/**
	 * The cached value of the '{@link #getSupportedServiceInterfaces() <em>Supported Service Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedServiceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SiamInternalServiceInterface> supportedServiceInterfaces;

	/**
	 * The cached value of the '{@link #getTestMessages() <em>Test Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMessages()
	 * @generated
	 * @ordered
	 */
	protected TestMessageSet testMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getGuis() {
		if (guis == null) {
			guis = new EObjectResolvingEList<Window>(Window.class, this, ProjectPackage.PROJECT__GUIS);
		}
		return guis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBase getKnowledgeBase() {
		if (knowledgeBase != null && knowledgeBase.eIsProxy()) {
			InternalEObject oldKnowledgeBase = (InternalEObject)knowledgeBase;
			knowledgeBase = (KnowledgeBase)eResolveProxy(oldKnowledgeBase);
			if (knowledgeBase != oldKnowledgeBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.PROJECT__KNOWLEDGE_BASE, oldKnowledgeBase, knowledgeBase));
			}
		}
		return knowledgeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBase basicGetKnowledgeBase() {
		return knowledgeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeBase(KnowledgeBase newKnowledgeBase) {
		KnowledgeBase oldKnowledgeBase = knowledgeBase;
		knowledgeBase = newKnowledgeBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__KNOWLEDGE_BASE, oldKnowledgeBase, knowledgeBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruleset> getGrammarRules() {
		if (grammarRules == null) {
			grammarRules = new EObjectResolvingEList<Ruleset>(Ruleset.class, this, ProjectPackage.PROJECT__GRAMMAR_RULES);
		}
		return grammarRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityResource> getEntityResource() {
		if (entityResource == null) {
			entityResource = new EObjectResolvingEList<EntityResource>(EntityResource.class, this, ProjectPackage.PROJECT__ENTITY_RESOURCE);
		}
		return entityResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DigitalResource> getDigitalResources() {
		if (digitalResources == null) {
			digitalResources = new EObjectContainmentEList<DigitalResource>(DigitalResource.class, this, ProjectPackage.PROJECT__DIGITAL_RESOURCES);
		}
		return digitalResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue getDialogue() {
		if (dialogue != null && dialogue.eIsProxy()) {
			InternalEObject oldDialogue = (InternalEObject)dialogue;
			dialogue = (Dialogue)eResolveProxy(oldDialogue);
			if (dialogue != oldDialogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.PROJECT__DIALOGUE, oldDialogue, dialogue));
			}
		}
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue basicGetDialogue() {
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogue(Dialogue newDialogue) {
		Dialogue oldDialogue = dialogue;
		dialogue = newDialogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__DIALOGUE, oldDialogue, dialogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPlan> getTaskPlans() {
		if (taskPlans == null) {
			taskPlans = new EObjectResolvingEList<TPlan>(TPlan.class, this, ProjectPackage.PROJECT__TASK_PLANS);
		}
		return taskPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingRules> getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectResolvingEList<MappingRules>(MappingRules.class, this, ProjectPackage.PROJECT__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaPlugin> getPlugins() {
		if (plugins == null) {
			plugins = new EObjectContainmentEList<JavaPlugin>(JavaPlugin.class, this, ProjectPackage.PROJECT__PLUGINS);
		}
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizationResource> getLocalization() {
		if (localization == null) {
			localization = new EObjectResolvingEList<LocalizationResource>(LocalizationResource.class, this, ProjectPackage.PROJECT__LOCALIZATION);
		}
		return localization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiamInternalServiceInterface> getSupportedServiceInterfaces() {
		if (supportedServiceInterfaces == null) {
			supportedServiceInterfaces = new EObjectContainmentEList<SiamInternalServiceInterface>(SiamInternalServiceInterface.class, this, ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES);
		}
		return supportedServiceInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMessageSet getTestMessages() {
		if (testMessages != null && testMessages.eIsProxy()) {
			InternalEObject oldTestMessages = (InternalEObject)testMessages;
			testMessages = (TestMessageSet)eResolveProxy(oldTestMessages);
			if (testMessages != oldTestMessages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.PROJECT__TEST_MESSAGES, oldTestMessages, testMessages));
			}
		}
		return testMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMessageSet basicGetTestMessages() {
		return testMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestMessages(TestMessageSet newTestMessages) {
		TestMessageSet oldTestMessages = testMessages;
		testMessages = newTestMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__TEST_MESSAGES, oldTestMessages, testMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PROJECT__DIGITAL_RESOURCES:
				return ((InternalEList<?>)getDigitalResources()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES:
				return ((InternalEList<?>)getSupportedServiceInterfaces()).basicRemove(otherEnd, msgs);
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
			case ProjectPackage.PROJECT__GUIS:
				return getGuis();
			case ProjectPackage.PROJECT__KNOWLEDGE_BASE:
				if (resolve) return getKnowledgeBase();
				return basicGetKnowledgeBase();
			case ProjectPackage.PROJECT__DIALOGUE:
				if (resolve) return getDialogue();
				return basicGetDialogue();
			case ProjectPackage.PROJECT__TASK_PLANS:
				return getTaskPlans();
			case ProjectPackage.PROJECT__GRAMMAR_RULES:
				return getGrammarRules();
			case ProjectPackage.PROJECT__ENTITY_RESOURCE:
				return getEntityResource();
			case ProjectPackage.PROJECT__DIGITAL_RESOURCES:
				return getDigitalResources();
			case ProjectPackage.PROJECT__MAPPING_RULES:
				return getMappingRules();
			case ProjectPackage.PROJECT__PLUGINS:
				return getPlugins();
			case ProjectPackage.PROJECT__LOCALIZATION:
				return getLocalization();
			case ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES:
				return getSupportedServiceInterfaces();
			case ProjectPackage.PROJECT__TEST_MESSAGES:
				if (resolve) return getTestMessages();
				return basicGetTestMessages();
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
			case ProjectPackage.PROJECT__GUIS:
				getGuis().clear();
				getGuis().addAll((Collection<? extends Window>)newValue);
				return;
			case ProjectPackage.PROJECT__KNOWLEDGE_BASE:
				setKnowledgeBase((KnowledgeBase)newValue);
				return;
			case ProjectPackage.PROJECT__DIALOGUE:
				setDialogue((Dialogue)newValue);
				return;
			case ProjectPackage.PROJECT__TASK_PLANS:
				getTaskPlans().clear();
				getTaskPlans().addAll((Collection<? extends TPlan>)newValue);
				return;
			case ProjectPackage.PROJECT__GRAMMAR_RULES:
				getGrammarRules().clear();
				getGrammarRules().addAll((Collection<? extends Ruleset>)newValue);
				return;
			case ProjectPackage.PROJECT__ENTITY_RESOURCE:
				getEntityResource().clear();
				getEntityResource().addAll((Collection<? extends EntityResource>)newValue);
				return;
			case ProjectPackage.PROJECT__DIGITAL_RESOURCES:
				getDigitalResources().clear();
				getDigitalResources().addAll((Collection<? extends DigitalResource>)newValue);
				return;
			case ProjectPackage.PROJECT__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends MappingRules>)newValue);
				return;
			case ProjectPackage.PROJECT__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends JavaPlugin>)newValue);
				return;
			case ProjectPackage.PROJECT__LOCALIZATION:
				getLocalization().clear();
				getLocalization().addAll((Collection<? extends LocalizationResource>)newValue);
				return;
			case ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES:
				getSupportedServiceInterfaces().clear();
				getSupportedServiceInterfaces().addAll((Collection<? extends SiamInternalServiceInterface>)newValue);
				return;
			case ProjectPackage.PROJECT__TEST_MESSAGES:
				setTestMessages((TestMessageSet)newValue);
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
			case ProjectPackage.PROJECT__GUIS:
				getGuis().clear();
				return;
			case ProjectPackage.PROJECT__KNOWLEDGE_BASE:
				setKnowledgeBase((KnowledgeBase)null);
				return;
			case ProjectPackage.PROJECT__DIALOGUE:
				setDialogue((Dialogue)null);
				return;
			case ProjectPackage.PROJECT__TASK_PLANS:
				getTaskPlans().clear();
				return;
			case ProjectPackage.PROJECT__GRAMMAR_RULES:
				getGrammarRules().clear();
				return;
			case ProjectPackage.PROJECT__ENTITY_RESOURCE:
				getEntityResource().clear();
				return;
			case ProjectPackage.PROJECT__DIGITAL_RESOURCES:
				getDigitalResources().clear();
				return;
			case ProjectPackage.PROJECT__MAPPING_RULES:
				getMappingRules().clear();
				return;
			case ProjectPackage.PROJECT__PLUGINS:
				getPlugins().clear();
				return;
			case ProjectPackage.PROJECT__LOCALIZATION:
				getLocalization().clear();
				return;
			case ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES:
				getSupportedServiceInterfaces().clear();
				return;
			case ProjectPackage.PROJECT__TEST_MESSAGES:
				setTestMessages((TestMessageSet)null);
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
			case ProjectPackage.PROJECT__GUIS:
				return guis != null && !guis.isEmpty();
			case ProjectPackage.PROJECT__KNOWLEDGE_BASE:
				return knowledgeBase != null;
			case ProjectPackage.PROJECT__DIALOGUE:
				return dialogue != null;
			case ProjectPackage.PROJECT__TASK_PLANS:
				return taskPlans != null && !taskPlans.isEmpty();
			case ProjectPackage.PROJECT__GRAMMAR_RULES:
				return grammarRules != null && !grammarRules.isEmpty();
			case ProjectPackage.PROJECT__ENTITY_RESOURCE:
				return entityResource != null && !entityResource.isEmpty();
			case ProjectPackage.PROJECT__DIGITAL_RESOURCES:
				return digitalResources != null && !digitalResources.isEmpty();
			case ProjectPackage.PROJECT__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
			case ProjectPackage.PROJECT__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case ProjectPackage.PROJECT__LOCALIZATION:
				return localization != null && !localization.isEmpty();
			case ProjectPackage.PROJECT__SUPPORTED_SERVICE_INTERFACES:
				return supportedServiceInterfaces != null && !supportedServiceInterfaces.isEmpty();
			case ProjectPackage.PROJECT__TEST_MESSAGES:
				return testMessages != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
