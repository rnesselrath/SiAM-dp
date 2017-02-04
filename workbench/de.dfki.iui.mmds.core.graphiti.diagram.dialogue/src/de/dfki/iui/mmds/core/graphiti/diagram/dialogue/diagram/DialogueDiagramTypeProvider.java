package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;


/**
 * 
 * Auto Generated Class
 * 
 * @author Dragan Milchevski
 *
 */
public class DialogueDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public static final String PROVIDER_ID = "de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram.DialogueDiagramTypeProvider";
	
	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public DialogueDiagramTypeProvider() {
		super();
		setFeatureProvider(new DialogueFeatureProvider(this));
		
		
		
	}
	
	@Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new DialogueToolBehaviourProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }
	
	/*public boolean isAutoUpdateAtRuntime() {
		return true;
	}

	*//**
	 * @since 0.9
	 *//*
	public boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return true;
	}

	public boolean isAutoUpdateAtStartup() {
		return true;
	}

	public boolean isAutoUpdateAtReset() {
		return true;
	}*/
}
