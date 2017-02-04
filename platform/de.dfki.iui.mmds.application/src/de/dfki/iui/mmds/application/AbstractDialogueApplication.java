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

import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;

import org.apache.log4j.Logger;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.interfaces.IDeviceManager;
import de.dfki.iui.mmds.core.interfaces.IDialogueManager;
import de.dfki.iui.mmds.core.interfaces.IFadeService;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.IProjectManager;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;

public abstract class AbstractDialogueApplication implements IApplication {

	protected String projectResource;
	static protected ProjectManager projectManager;
	static private String language;
	static private ConfigurationAdmin ca;

	protected AbstractDialogueApplication(String projectResource) {
		this.projectResource = projectResource;
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		if (projectManager == null)
			Logger.getLogger(getClass()).error("Project Manager has not been activated yet. Check service dependencies!");
		String[] args = (String[]) context.getArguments().get("application.args");
		int index = Arrays.binarySearch(args, "-language");
		if (index >= 0 && index + 1 < args.length) {
			language = args[index + 1];
		}
		if (language != null && ca != null) {
			Logger.getLogger(getClass()).info(String.format("Found language argument in command prompt. Switch language to %s", language));
			Configuration configuration;
			try {
				configuration = ca.getConfiguration("de.dfki.iui.mmds.core.resourcemanager", null);
				Dictionary<String, Object> properties = configuration.getProperties();
				properties.put("LANGUAGE", language);
				configuration.update(properties);

				configuration = ca.getConfiguration("de.dfki.iui.mmds.speech_recognition.grammar_manager", null);
				properties = configuration.getProperties();
				properties.put("LANGUAGE", language);
				configuration.update(properties);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		projectManager.startApplication();
		return EXIT_OK;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	protected void activate(ComponentContext componentContext) {
		ServiceReference<?> serviceReference = componentContext.getBundleContext().getServiceReference(ConfigurationAdmin.class.getName());
		ca = (ConfigurationAdmin) componentContext.getBundleContext().getService(serviceReference);

		projectManager = ((ProjectManager) componentContext.locateService("IProjectManager"));
		if (projectManager != null)

		{
			projectManager.setProject(projectResource, componentContext);

		} else

		{
			Logger.getLogger(componentContext.getBundleContext().getBundle().getSymbolicName()).error("No Project Manager found. Make sure your component-description refers to this service!");
		}

	}

	static public IResourceManager getResourceManager() {
		return ProjectManager.resourceManager;
	}

	static public IDialogueManager getDialogueManager() {
		return ProjectManager.dialogueManager;
	}

	static public IDeviceManager getDeviceManager() {
		return ProjectManager.deviceManager;
	}

	static public IFadeService getFadeService() {
		return ProjectManager.fadeService;
	}

	static public IGrammarManagementService getGrammarManagementService() {
		return ProjectManager.grammarManagementService;
	}

	static public IProjectManager getProjectManager() {
		return projectManager;
	}

	static public IKnowledgeManager getKnowledgeManager() {
		return ProjectManager.knowledgeManager;
	}
}
