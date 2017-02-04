package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.GraphitiDialogEditor;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.Messages;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;

/**
 * Creates sample data
 */
public final class CreateDiagramWithAllClassesHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		if (!(selection instanceof IStructuredSelection))
			return null;

		// Operation must be started on ECLasses node -> cancel if not
		IFile first = (IFile) ((IStructuredSelection) selection).getFirstElement();

		Dialogue dialogue = null;
		try {

			dialogue = (Dialogue) EmfPersistence.readFromFile(first.getFullPath().toString()).getContents().get(0);

		} catch (IOException e) {
			e.printStackTrace();
		}

		IProject project = first.getProject();
		if (project == null)
			return null;

		// Ask for the name of the new diagram
		InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), Messages.CreateDiagramWithAllClassesHandler_NewDiagramTitle,
				Messages.CreateDiagramWithAllClassesHandler_NewDiagramDescription, null, null);
		if (dialog.open() != Dialog.OK)
			return null;
		String diagramName = dialog.getValue();

		// Get the default resource set to hold the new resource
		ResourceSet resourceSet = new ResourceSetImpl();
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);
		if (editingDomain == null) {
			// Not yet existing, create one
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		}

		// Create the data within a command and save (must not happen inside
		// the command since finishing the command will trigger setting the
		// modification flag on the resource which will be used by the save
		// operation to determine which resources need to be saved)
		final AddAllClassesCommand operation = new AddAllClassesCommand(project, editingDomain, diagramName, dialogue);
		editingDomain.getCommandStack().execute(operation);

		try {
			EmfPersistence.write(operation.getCreatedResource(), null, null);
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, "de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), Messages.CreateDiagramWithAllClassesHandler_ErrorTitle, e.getMessage(), status);
			return null;
		}

		// Dispose the editing domain to eliminate memory leak
		editingDomain.dispose();

		// Open the editor
		String platformString = operation.getCreatedResource().getURI().toPlatformString(true);
		IFile file = project.getParent().getFile(new Path(platformString));
		IFileEditorInput input = new FileEditorInput(file);
		try {
			final GraphitiDialogEditor dEditor = (GraphitiDialogEditor) 
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, GraphitiDialogEditor.EDITOR_ID);
			
		} catch (PartInitException e) {
			IStatus status = new Status(IStatus.ERROR, "de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), Messages.CreateDiagramWithAllClassesHandler_ErrorTitle, e.getMessage(), status);
			return null;
		}

		return null;
	}
}
