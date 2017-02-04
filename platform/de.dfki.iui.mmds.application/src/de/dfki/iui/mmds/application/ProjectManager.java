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
package de.dfki.iui.mmds.application;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.interfaces.IFadeService;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.IPresentationPlanner;
import de.dfki.iui.mmds.core.interfaces.IProjectManager;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;
import de.dfki.iui.mmds.core.interfaces.ISessionManager;
import de.dfki.iui.mmds.core.ioMapping.InputMappingService;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.LocalizationResource;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.project.InputMappingRules;
import de.dfki.iui.mmds.core.model.project.JavaPlugin;
import de.dfki.iui.mmds.core.model.project.MappingRules;
import de.dfki.iui.mmds.core.model.project.OutputMappingRules;
import de.dfki.iui.mmds.core.model.project.Project;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.dialogue.DialogueComponent;
import de.dfki.iui.mmds.dialogue.fade.FadeComponent;

public class ProjectManager implements IProjectManager {

	private ComponentContext componentContext;
	private ComponentContext projectContext;
	private String projectResource;

	static IResourceManager resourceManager;
	static DialogueComponent dialogueManager;
	static IDeviceManager deviceManager;
	static IFadeService fadeService;
	static IGrammarManagementService grammarManagementService;
	static ISessionManager sessionManager;
	static InputMappingService inputMappingService;
	static IPresentationPlanner presentationPlanner;
	static EvaluationService evaluationService;
	static IKnowledgeManager knowledgeManager;

	protected void activate(ComponentContext context) {
		componentContext = context;
		deviceManager = ((IDeviceManager) componentContext.locateService("DeviceManager"));
		resourceManager = ((IResourceManager) componentContext.locateService("ResourceManager"));
		dialogueManager = ((DialogueComponent) componentContext.locateService("DialogueManager"));
		grammarManagementService = ((IGrammarManagementService) componentContext.locateService("GrammarManagementService"));
		sessionManager = ((ISessionManager) componentContext.locateService("ISessionManager"));
		fadeService = ((FadeComponent) componentContext.locateService("FadeService"));
		inputMappingService = ((InputMappingService) componentContext.locateService("InputMappingService"));
		presentationPlanner = ((IPresentationPlanner) componentContext.locateService("IPresentationPlanner"));
		evaluationService = ((EvaluationService) componentContext.locateService("EvaluationService"));
		knowledgeManager = (IKnowledgeManager) componentContext.locateService("IKnowledgeManager");
		// start presentation planner && resource service
		componentContext.locateService("PresentationPlanner");
		componentContext.locateService("ResourceService");
	}

	void setProject(String projectResource, ComponentContext projectContext) {
		this.projectResource = projectResource;
		// needs application's bundle context for correct ClassLoader
		this.projectContext = projectContext;
		dialogueManager.setProjectContext(projectContext);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.application.IProjectManager#getApplicationContext()
	 */
	@Override
	public ComponentContext getApplicationContext() {
		return projectContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.application.IProjectManager#startApplication()
	 */
	@Override
	public void startApplication() {
		Resource resource = resourceManager.loadResource(projectResource);
		Project project = (Project) resource.getContents().get(0);

		for (UIElement el : project.getGuis()) {
			resourceManager.addResource("gui", el.getId().getValue(), el);
		}
		try {
			dialogueManager.loadDialog(project.getDialogue());

			for (SiamInternalServiceInterface supportedServiceInterface : project.getSupportedServiceInterfaces()) {
				deviceManager.registerDevice(supportedServiceInterface);
			}

			KnowledgeBase knowledgeBase = project.getKnowledgeBase();
			if (knowledgeBase != null) {
				knowledgeManager.addToWorld(knowledgeBase);
			}

			if (!project.getGrammarRules().isEmpty()) {

				if (grammarManagementService != null) {
					for (Ruleset ruleSet : project.getGrammarRules()) {
						grammarManagementService.addRuleset(ruleSet);
					}
					grammarManagementService.commit();
				}
			}
			if (grammarManagementService != null) {
				evaluationService.registerPlugin("GrammarManagementService", grammarManagementService);
			}
			for (EntityResource entities : project.getEntityResource()) {
				for (int i = 0; i < entities.getContent().size(); ++i) {
					Entity entity = entities.getContent().get(i);
					resourceManager.addResource("entities", String.format("%s%d", entities.getId(), i), entity);
					if (entities.isAddToKnowledgeManager()) {
						knowledgeManager.addEntity(entity, "SiAM_Project_Specification", 1.0f);
					}
				}
			}
			for (MappingRules rules : project.getMappingRules()) {
				if (rules instanceof InputMappingRules) {
					if (inputMappingService == null) {
						inputMappingService = ((InputMappingService) componentContext.locateService("InputMappingService"));
					}
					inputMappingService.registerMappings((InputMappingRules) rules);
				}
				if (rules instanceof OutputMappingRules) {
					if (presentationPlanner == null) {
						presentationPlanner = ((IPresentationPlanner) componentContext.locateService("IPresentationPlanner"));
					}
					presentationPlanner.registerMappings((OutputMappingRules) rules);
				}
			}
			for (JavaPlugin plugin : project.getPlugins()) {
				evaluationService.registerPlugin(plugin, projectContext);
			}
			for (LocalizationResource lr : project.getLocalization()) {
				LocalizationResource r = (LocalizationResource) resourceManager.getResource("localization", lr.getLanguage().toString());
				if (r == null) {
					resourceManager.addResource("localization", lr.getLanguage().toString(), lr);
				} else {
					r.getEntries().addAll(lr.getEntries());
				}
			}
			evaluationService.registerPlugin("ResourceManager", resourceManager);

			ScxmlDebugGui debugGui = new ScxmlDebugGui(dialogueManager.getStateMachine(), componentContext, project.getEntityResource());
			debugGui.open();
			if (project.getTestMessages() != null)
				debugGui.collectInputMessages(project.getTestMessages());
			for (SiamInternalServiceInterface supportedServiceInterface : project.getSupportedServiceInterfaces()) {
				if (supportedServiceInterface.getServiceType() == Io_interfacesPackage.eINSTANCE.getSpeech()) {
					debugGui.addSpeechRecognizer(supportedServiceInterface.getSiamId().toString());
				}
			}
			dialogueManager.startDialog();
			debugGui.waitUntilDispose();
		} catch (NoClassDefFoundError e) {
			Logger.getLogger(this.getClass()).error("Error in launch configuration. Add platform specific org.eclipse.swt fragement bundle to configuration.");
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.application.IProjectManager#resetApplication()
	 */
	@Override
	public void resetApplication() {
		fadeService.reset();
		grammarManagementService.reset();
		deviceManager.reset();
		resourceManager.clear();
		dialogueManager.reset();
		// entityStore.reset();
		// startApplication(projectResource, projectContext);
	}
}
