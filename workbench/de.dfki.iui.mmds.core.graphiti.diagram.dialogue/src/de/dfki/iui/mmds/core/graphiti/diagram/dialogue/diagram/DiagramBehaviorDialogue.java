package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram;


import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.ui.IWorkbenchPart;

public class DiagramBehaviorDialogue extends DiagramBehavior{

	private DefaultPersistencyBehavior persistencyBehavior;
	public DiagramBehaviorDialogue(IDiagramContainerUI diagramContainer) {
		super(diagramContainer);
	}

	public DefaultPersistencyBehavior getPersistencyBehavior() {
		return persistencyBehavior;
	}

	/**
	 * Sets the parent {@link IWorkbenchPart} for this behavior. Can be used to
	 * embed this behavior in various UIs.
	 * 
	 * @param parentPart
	 */
	public void setParentPart(IWorkbenchPart parentPart) {
		super.setParentPart(parentPart);
	}
	
	public void initDefaultBehaviors() {
		super.initDefaultBehaviors();
		persistencyBehavior = new PersistencyBehaviorCustom(this);
	}
	
}
