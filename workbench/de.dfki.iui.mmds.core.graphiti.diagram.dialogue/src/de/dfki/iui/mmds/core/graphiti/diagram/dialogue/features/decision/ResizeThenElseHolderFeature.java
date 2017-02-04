package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 * Class extending the {@link DefaultResizeShapeFeature} only to fordbid resizing of the shape.
 * 
 * @author Dragan Milchevski
 *
 */
public class ResizeThenElseHolderFeature extends DefaultResizeShapeFeature{

	/**
	 * Creates new {@link ResizeThenElseHolderFeature}
	 * @param fp
	 */
	public ResizeThenElseHolderFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Forbid resizing of the feature.
	 * 
	 * @param context the context
	 * @return always false
	 */
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}
}
