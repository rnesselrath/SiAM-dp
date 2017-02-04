package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.examples.common.ExamplesCommonPlugin;
import org.eclipse.graphiti.examples.common.FileService;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.navigator.nodes.base.AbstractInstancesOfTypeContainerNode;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.Messages;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;

public class CreateDialogueDiagramWizard extends BasicNewResourceWizard {

	private static final String PAGE_NAME_DIAGRAM_TYPE = Messages.CreateDiagramWizard_DiagramTypeField;
	private static final String PAGE_NAME_DIAGRAM_NAME = Messages.CreateDiagramWizard_DiagramNameField;
	private static final String WIZARD_WINDOW_TITLE = Messages.CreateDiagramWizard_WizardTitle;

	private Diagram diagram;

	@Override
	public void addPages() {
		super.addPages();
		addPage(new DialogueDiagramTypeWizardPage(PAGE_NAME_DIAGRAM_TYPE));
		addPage(new DialogueDiagramNameWizardPage(PAGE_NAME_DIAGRAM_NAME));
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(WIZARD_WINDOW_TITLE);

	}

	@Override
	public boolean performFinish() {

		ITextProvider typePage = (ITextProvider) getPage(PAGE_NAME_DIAGRAM_TYPE);
		final String diagramTypeId = typePage.getText();

		ITextProvider namePage = (ITextProvider) getPage(PAGE_NAME_DIAGRAM_NAME);
		final String diagramName = namePage.getText();

		IProject project = null;
		IFolder diagramFolder = null;

		Object element = getSelection().getFirstElement();
		if (element instanceof IProject) {
			project = (IProject) element;
		} else if (element instanceof AbstractInstancesOfTypeContainerNode) {
			AbstractInstancesOfTypeContainerNode aiocn = (AbstractInstancesOfTypeContainerNode) element;
			project = aiocn.getProject();
		} else if (element instanceof IFolder) {
			diagramFolder = (IFolder) element;
			project = diagramFolder.getProject();
		}

		if (project == null || !project.isAccessible()) {
			String error = Messages.CreateDiagramWizard_NoProjectFoundError;
			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error);
			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_NoProjectFoundErrorTitle, null, status);
			return false;
		}

		diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, diagramName, true);

		if (diagramFolder == null) {
			diagramFolder = project.getFolder("src/diagrams/"); //$NON-NLS-1$
		}

		String editorID = DiagramEditor.DIAGRAM_EDITOR_ID;
		String editorExtension = "diagram"; //$NON-NLS-1$
		String diagramTypeProviderId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagramTypeId);
		String namingConventionID = diagramTypeProviderId + ".editor"; //$NON-NLS-1$
		IEditorDescriptor specificEditor = PlatformUI.getWorkbench().getEditorRegistry().findEditor(namingConventionID);

		// If there is a specific editor get the file extension
		if (specificEditor != null) {
			editorID = namingConventionID;
			IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
			IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint("org.eclipse.ui.editors"); //$NON-NLS-1$
			IExtension[] extensions = extensionPoint.getExtensions();
			for (IExtension ext : extensions) {
				IConfigurationElement[] configurationElements = ext.getConfigurationElements();
				for (IConfigurationElement ce : configurationElements) {
					String id = ce.getAttribute("id"); //$NON-NLS-1$
					if (editorID.equals(id)) {
						String fileExt = ce.getAttribute("extensions"); //$NON-NLS-1$
						if (fileExt != null) {
							editorExtension = fileExt;
							break;
						}
					}

				}
			}
		}

		// Get the model from the file
		Dialogue dialogue = null; // getModel(project);
		try {
			dialogue = DialogueUtil.getModel(project);
		} catch (CoreException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// create a pictogram link and link the diagram with the EMF Dialogue
		// model
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		link.setPictogramElement(diagram);
		link.getBusinessObjects().add(dialogue);

		IFile diagramFile = diagramFolder.getFile(diagramName + "." + editorExtension); //$NON-NLS-1$
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);

		FileService.createEmfFileForDiagram(uri, diagram);
		String providerId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagram.getDiagramTypeId());
		DiagramEditorInput editorInput = new DiagramEditorInput(EcoreUtil.getURI(diagram), providerId);

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, editorID);
		} catch (PartInitException e) {
			String error = Messages.CreateDiagramWizard_OpeningEditorError;
			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error, e);
			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_ErrorOccuredTitle, null, status);
			return false;
		}
		
		return true;
	}

	public Diagram getDiagram() {
		return diagram;
	}

	public Dialogue getModel(IProject project) {
		Dialogue dialogue = null;
		try {
			dialogue = (Dialogue) EmfPersistence.readFromFile(project.getFolder("src").getFile("dialogue.dialogue").getFullPath().toString()).getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dialogue;
	}

}
