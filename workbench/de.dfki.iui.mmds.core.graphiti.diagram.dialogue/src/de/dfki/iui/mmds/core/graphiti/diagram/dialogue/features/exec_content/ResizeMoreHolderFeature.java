package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 * The class {@link ResizeMoreHolderFeature} that forbids resizing of the More holders
 * 
 * @author Dragan Milchevski
 *
 */
public class ResizeMoreHolderFeature extends DefaultResizeShapeFeature  {

	/**
	 * Creates new {@link ResizeMoreHolderFeature}
	 * @param fp the feature provider
	 */
	public ResizeMoreHolderFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Forbids resizing.
	 */
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}
}
