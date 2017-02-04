package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 * Class extending {@link DefaultMoveShapeFeature} only to forbid moving of the ThenElse shape
 * @author Dragan Milchevski
 *
 */
public class MoveThenElseHolderFeature  extends DefaultMoveShapeFeature{

	/**
	 * Creates new {@link MoveThenElseHolderFeature}
	 * @param fp
	 */
	public MoveThenElseHolderFeature(IFeatureProvider fp) {
		super(fp);
	}

	
	/**
	 * Forbid moving of the shape.
	 *  
	 * @param context the context
	 * @return always false
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		return false;
	}
}
