package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 * The Class {@link MoveOnEntryExitHolderFeature} that forbids moving OnEntry/OnExit holders
 * 
 * @author Dragan Milchevski
 *
 */
public class MoveOnEntryExitHolderFeature extends DefaultMoveShapeFeature{

	/**
	 * Creates new {@link MoveOnEntryExitHolderFeature}
	 * @param fp the feature provider
	 */
	public MoveOnEntryExitHolderFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Forbid moving.
	 * 
	 * @param context the moving context
	 * @return false
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		return false;
	}

}
