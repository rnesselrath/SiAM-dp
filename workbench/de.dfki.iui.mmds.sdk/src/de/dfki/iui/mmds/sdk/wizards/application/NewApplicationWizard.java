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
package de.dfki.iui.mmds.sdk.wizards.application;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.NewWizard;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.osgi.framework.Bundle;

import de.dfki.iui.mmds.sdk.editors.model.ProjectEditorPlugin;

@SuppressWarnings("restriction")
public class NewApplicationWizard extends NewWizard {

	private IConfigurationElement fConfig;
	private final PluginFieldData fPluginData;
	private IProjectProvider fProjectProvider;
	protected NewProjectCreationPage fMainPage;
	protected PluginContentPage fContentPage;

	private final Bundle bundle = org.osgi.framework.FrameworkUtil.getBundle(this.getClass());

	public NewApplicationWizard() {
		fPluginData = new PluginFieldData();
	}

	public NewApplicationWizard(String osgiFramework) {
		this();
		fPluginData.setOSGiFramework(osgiFramework);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle(ApplicationWizardMessages.NewProjectWizard_title);
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ProjectEditorPlugin.INSTANCE.getImage("full/wizban/NewApplication")));
	}

	@Override
	public void addPages() {
		fMainPage = new NewProjectCreationPage("main", fPluginData, false, getSelection());
		fMainPage.setTitle(ApplicationWizardMessages.NewProjectWizard_MainPage_title);
		fMainPage.setDescription(ApplicationWizardMessages.NewProjectWizard_MainPage_desc);
		String pname = "de.dfki.iui.example_application";
		if (pname != null) {
			fMainPage.setInitialProjectName(pname);
		}
		addPage(fMainPage);

		fProjectProvider = new IProjectProvider() {
			@Override
			public String getProjectName() {
				return fMainPage.getProjectName();
			}

			@Override
			public IProject getProject() {
				return fMainPage.getProjectHandle();
			}

			@Override
			public IPath getLocationPath() {
				return fMainPage.getLocationPath();
			}
		};

		fContentPage = new PluginContentPage("page2", fProjectProvider, fMainPage, fPluginData);
		addPage(fContentPage);
	}

	@Override
	public boolean performFinish() {
		try {
			fMainPage.updateData();
			fContentPage.updateData();
			IDialogSettings settings = getDialogSettings();
			if (settings != null) {
				fMainPage.saveSettings(settings);
				fContentPage.saveSettings(settings);
			}

			getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, fProjectProvider, null));
			getContainer().run(false, true, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					monitor.beginTask("Generating project: ", 6);
					// create application java class
					buildFileFromTemplate("DialogueApplication.template", "src/" + fProjectProvider.getProjectName().replace(".", "/") + '/' + fContentPage.getApplicationName() + "App.java", false);
					monitor.worked(1);
					// extend manifest
					try {
						fProjectProvider.getProject().getFile("META-INF/MANIFEST.MF").delete(false, null);
					} catch (CoreException e1) {
						e1.printStackTrace();
					}
					buildFileFromTemplate("manifest.template", "META-INF/MANIFEST.MF", false);
					monitor.worked(1);
					// copy configuration files
					buildFileFromTemplate("com.eclipsesource.jaxrs.connector.properties", "configurations/com.eclipsesource.jaxrs.connector.properties", false);
					buildFileFromTemplate("de.dfki.iui.mmds.speech_recognition.grammar_manager.properties", "configurations/de.dfki.iui.mmds.speech_recognition.grammar_manager.properties", false);
					buildFileFromTemplate("org.ops4j.pax.logging.properties", "configurations/org.ops4j.pax.logging.properties", false);
					buildFileFromTemplate("de.dfki.iui.mmds.dialogue.fade.properties", "configurations/de.dfki.iui.mmds.dialogue.fade.properties", false);
					buildFileFromTemplate("de.dfki.iui.mmds.core.resourcemanager.properties", "configurations/de.dfki.iui.mmds.core.resourcemanager.properties", false);

					monitor.worked(1);
					// create component description
					buildFileFromTemplate("component-description.template", "OSGI-INF/" + "component-description.xml", false);
					monitor.worked(1);
					// prepare resource folders
					try {
						prepareFolders(fProjectProvider.getProject().getFolder("resources/css"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/dialogue"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/grammar_rules"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/gui"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/media"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/entities"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/localization"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/mappingRules"));
						prepareFolders(fProjectProvider.getProject().getFolder("resources/knowledge"));
					} catch (CoreException e) {
						e.printStackTrace();
					}
					monitor.worked(1);
					// create project resource
					buildFileFromTemplate("project_model.template", "resources/" + fContentPage.getApplicationName() + ".project", false);
					// create dialogue resource
					buildFileFromTemplate("dialogue_model.template", "resources/dialogue/" + fContentPage.getApplicationName() + ".dialogue", false);
					// create launch configuration
					buildFileFromTemplate("launch.template", fContentPage.getApplicationName() + ".launch", false);
					try {
						fProjectProvider.getProject().getFile("build.properties").delete(false, null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					buildFileFromTemplate("build.properties.template", "build.properties", false);
					buildFileFromTemplate("plugin.xml.template", "plugin.xml", false);

					monitor.worked(1);

					BasicNewProjectResourceWizard.updatePerspective(fConfig);
					IWorkingSet[] workingSets = fMainPage.getSelectedWorkingSets();
					if (workingSets.length > 0) {
						getWorkbench().getWorkingSetManager().addToWorkingSets(fProjectProvider.getProject(), workingSets);
					}
					monitor.done();
				}
			});

			return true;
		} catch (InvocationTargetException e) {
			PDEPlugin.logException(e);
		} catch (InterruptedException e) {
		}
		return false;
	}

	private boolean buildFileFromTemplate(String template, String target, boolean append) {
		IFile outputFile = fProjectProvider.getProject().getFile(target);

		try {
			InputStream inputStream = FileLocator.openStream(bundle, new Path("templates/application_wizard/" + template), false);

			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.replace("PLUGIN_NAME", fProjectProvider.getProjectName());
				line = line.replace("APPLICATION_NAME", fContentPage.getApplicationName());
				content.append(line + '\n');
			}
			InputStream is = new ByteArrayInputStream(content.toString().getBytes());
			prepareFolders(outputFile.getParent());
			if (append) {
				outputFile.appendContents(is, IResource.NONE, null);
			} else {
				outputFile.create(is, IResource.NONE, null);
			}

		} catch (IOException | CoreException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void prepareFolders(IContainer container) throws CoreException {
		if (container instanceof IFolder) {
			IFolder folder = (IFolder) container;
			prepareFolders(folder.getParent());
			if (!folder.exists()) {
				folder.create(false, false, null);
			}
		}
	}

	@Override
	public boolean canFinish() {
		IWizardPage page = getContainer().getCurrentPage();
		return super.canFinish() && page != fMainPage;
	}

}
