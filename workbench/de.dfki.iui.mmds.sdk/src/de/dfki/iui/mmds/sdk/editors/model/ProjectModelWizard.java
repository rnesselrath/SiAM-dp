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
package de.dfki.iui.mmds.sdk.editors.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.pattern.PatternPackage;
import de.dfki.iui.mmds.core.model.project.ProjectFactory;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.task.TaskPackage;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProjectModelWizard extends Wizard implements INewWizard {
	/**
	 * This caches an instance of the model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ProjectPackage projectPackage = ProjectPackage.eINSTANCE;
	protected DialoguePackage dialoguePackage = DialoguePackage.eINSTANCE;
	protected GuiPackage guiPackage = GuiPackage.eINSTANCE;
	protected Grammar_rulesPackage rulesPackage = Grammar_rulesPackage.eINSTANCE;
	protected PatternPackage patternPackage = PatternPackage.eINSTANCE;
	protected BasePackage basePackage = BasePackage.eINSTANCE;
	protected IoPackage ioPackage = IoPackage.eINSTANCE;
	// List<EPackage> packages = new ArrayList<EPackage>();
	Map<String, EClass> nameClassMapping = new LinkedHashMap<String, EClass>();

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProjectFactory projectFactory = projectPackage.getProjectFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProjectModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProjectModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ProjectEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ProjectEditorPlugin.INSTANCE.getImage("full/wizban/NewProject")));
	}

	protected void loadInitialObjects() {
		nameClassMapping.put("Project Description", projectPackage.getProject());
		nameClassMapping.put("Entity Resource", basePackage.getEntityResource());
		nameClassMapping.put("Subscription Pattern", patternPackage.getPSubscription());
		nameClassMapping.put("Dialog Model", dialoguePackage.getDialogue());
		nameClassMapping.put("Grammar Ruleset", rulesPackage.getRuleset());
		nameClassMapping.put("Input Mapping Rules", projectPackage.getInputMappingRules());
		nameClassMapping.put("Output Mapping Rules", projectPackage.getOutputMappingRules());
		nameClassMapping.put("Localization Rules", basePackage.getLocalizationResource());
		nameClassMapping.put("GUI Window", guiPackage.getWindow());
		nameClassMapping.put("IO Event", IoPackage.eINSTANCE.getIOEvent());
		nameClassMapping.put("Knowledge Base", BasePackage.eINSTANCE.getKnowledgeBase());
		nameClassMapping.put("Test Message Set", ProjectPackage.eINSTANCE.getTestMessageSet());
		nameClassMapping.put("Task Plan", TaskPackage.eINSTANCE.getTPlan());
	}

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected EObject createInitialModel() {
		EClass eClass = nameClassMapping.get(initialObjectCreationPage.initialObjectField.getText());
		EObject rootObject = EcoreUtil.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();
						resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMLResourceFactoryImpl());

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, "UTF-8");
						resource.save(options);
					} catch (Exception exception) {
						ProjectEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(
						new FileEditorInput(modelFile),
						workbench.getEditorRegistry().
						getDefaultEditor(
								modelFile.getFullPath().toString())
						.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), ProjectEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			ProjectEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class ProjectModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		IResource selectedResource;

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				// Make up a unique new name here.
				//
				String defaultModelBaseFilename = ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectEditorFilenameDefaultBase");
				setFileExtension(getInstanceFileExtension());
				String defaultModelFilenameExtension = getFileExtension();
				String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
				for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
					modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
				}
				newFileCreationPage.setFileName(modelFilename);
			}

		}

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public ProjectModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();

				String fileExtension = getFileExtension();

				if (!extension.equals(fileExtension)) {
					String key = "_WARN_FilenameExtension";
					setErrorMessage(ProjectEditorPlugin.INSTANCE.getString(key, new Object[] { fileExtension }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class ProjectModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public ProjectModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated NOT
		 */
		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText("Siam DP Model");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			loadInitialObjects();
			for (String objectName : nameClassMapping.keySet()) {
				initialObjectField.add(objectName);
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected boolean validatePage() {
			return true;
			// return getInitialObjectName() != null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
				} else {
					initialObjectField.setFocus();
				}
			}
		}

		// /**
		// * <!-- begin-user-doc --> <!-- end-user-doc -->
		// *
		// * @generated
		// */
		// public String getInitialObjectName() {
		// String label = initialObjectField.getText();
		//
		// for (String name : getInitialObjectNames()) {
		// if (getLabel(name).equals(label))
		// return name;
		// }
		// return null;
		// }

		/**
		 * Returns the label for the specified type name. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return SiamEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			} catch (MissingResourceException mre) {
				ProjectEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addPages() {
		initialObjectCreationPage = new ProjectModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectModelWizard_label"));
		initialObjectCreationPage.setDescription(ProjectEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ProjectModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectModelWizard_label"));
		newFileCreationPage.setDescription(ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectModelWizard_description"));
		// newFileCreationPage.setFileName(ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectEditorFilenameDefaultBase")
		// + "." + getFileExtension());
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				newFileCreationPage.selectedResource = (IResource) selectedElement;
				if (newFileCreationPage.selectedResource.getType() == IResource.FILE) {
					newFileCreationPage.selectedResource = newFileCreationPage.selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (newFileCreationPage.selectedResource instanceof IFolder || newFileCreationPage.selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(newFileCreationPage.selectedResource.getFullPath());
				}
			}
		}

	}

	/**
	 * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

	String getInstanceFileExtension() {
		String label = initialObjectCreationPage.initialObjectField.getText();

		Map<String, String> map = new HashMap<String, String>();

		map.put("Project Description", "project");
		map.put("Entity Resource", "entities");
		map.put("Subscription Pattern", "pattern");
		map.put("Dialog Model", "dialog");
		map.put("Grammar Ruleset", "grammarRules");
		map.put("Knowledge Base", "knowledgeBase");
		map.put("Input Mapping Rules", "inputMappingRules");
		map.put("Output Mapping Rules", "outputMappingRules");
		map.put("Localization Rules", "localization");
		map.put("GUI Window", "gui");
		map.put("IO Event", "io");
		map.put("Test Message Set", "tests");
		map.put("Task Plan", "task");

		return map.get(label);
	}

}
