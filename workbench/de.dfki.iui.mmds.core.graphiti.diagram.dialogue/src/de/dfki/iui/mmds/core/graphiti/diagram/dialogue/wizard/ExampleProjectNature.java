package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class ExampleProjectNature implements IProjectNature {

	public static final String NATURE_ID = "de.dfki.iui.mmds.core.graphiti.diagram.dialogue"; //$NON-NLS-1$

	IProject p;

	public void configure() throws CoreException {

	}

	public void deconfigure() throws CoreException {

	}

	public IProject getProject() {
		return p;
	}

	public void setProject(IProject project) {
		p = project;

	}
}
