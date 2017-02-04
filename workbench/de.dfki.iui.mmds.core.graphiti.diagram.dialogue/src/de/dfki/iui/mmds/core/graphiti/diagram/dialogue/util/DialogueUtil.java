package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;

public class DialogueUtil {

	public static void saveToModelFile(final Dialogue dialogue, final IProject newProject) {
		ResourceSet rSet = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(newProject.getFolder("src").getFile("dialogue.dialogue").getFullPath().toString(), true); //$NON-NLS-1$ //$NON-NLS-2$
		uri = uri.trimFragment();
		uri = uri.trimFileExtension();
		uri = uri.appendFileExtension("dialogue");

		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
		try {
			Resource resource = EmfPersistence.writeToUri(dialogue, uri, null, null);
			resource.setTrackingModification(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static Dialogue getModel(final IProject newProject) throws CoreException, IOException {
		URI uri = URI.createPlatformResourceURI(newProject.getFolder("src").getFile("dialogue.dialogue").getFullPath().toString(), true); //$NON-NLS-1$ //$NON-NLS-2$
		uri = uri.trimFragment();
		uri = uri.trimFileExtension();
		uri = uri.appendFileExtension("dialogue"); //$NON-NLS-1$
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
		Resource resource;
		if (file == null || !file.exists()) {
			Dialogue dialogue = DialogueFactory.eINSTANCE.createDialogue();

			resource = EmfPersistence.writeToUri(dialogue, uri, null, null);
		} else {
			resource = EmfPersistence.readFromUri(uri);
		}
		resource.setTrackingModification(true);
		return (Dialogue) resource.getContents().get(0);
	}

}
