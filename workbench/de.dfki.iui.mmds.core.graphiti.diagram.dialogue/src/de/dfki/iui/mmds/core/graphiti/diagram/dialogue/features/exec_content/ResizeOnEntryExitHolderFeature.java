package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 * The class {@link ResizeOnEntryExitHolderFeature} that forbids resizing of OnEntry/OnExit holders.
 * 
 * @author Dragan Milchevski
 *
 */
public class ResizeOnEntryExitHolderFeature extends DefaultResizeShapeFeature  {

	/**
	 * Creates new {@link ResizeOnEntryExitHolderFeature}
	 * @param fp the feature provider
	 */
	public ResizeOnEntryExitHolderFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Forbid resizing. 
	 * @param context the resizing context 
	 * @return false.
	 */
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}

}
