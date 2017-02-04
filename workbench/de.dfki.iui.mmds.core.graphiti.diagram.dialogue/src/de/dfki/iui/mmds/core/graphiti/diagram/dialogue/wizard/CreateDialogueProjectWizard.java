package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.graphiti.examples.common.ExampleProjectNature;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;

public class CreateDialogueProjectWizard extends BasicNewProjectResourceWizard {
	@Override
	public boolean performFinish() {
		if (!super.performFinish())
			return false;

		IProject newProject = getNewProject();
		try {
			IProjectDescription description = newProject.getDescription();
			description.setNatureIds(new String[] { ExampleProjectNature.NATURE_ID });
			newProject.setDescription(description, null);
			
			createPredefinedContent(newProject);
		} catch (CoreException e) {
			return false;
		}

		return true;
	}
	
	private void createPredefinedContent(IProject newProject) throws CoreException {
		Dialogue dialogue = DialogueFactory.eINSTANCE.createDialogue();
		dialogue.setId("DialogueID");
		
		//resource.save(Collections.EMPTY_MAP);
		/*try {
			EmfWriter.write(dialogue, false, newProject.getFolder("src").getFile("dialogue.dialogue").getFullPath().toString());
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		DialogueUtil.saveToModelFile(dialogue, newProject);
	}
	
	public void getDialogue(){
		
	}
}
