package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;

/**
 * The class {@link ResizeHistoryStateFeature} that forbids resizing of {@link HistoryState} objects
 * 
 * @author Dragan Milchevski
 *
 */
public class ResizeHistoryStateFeature extends DefaultResizeShapeFeature{

	/**
	 * Creates new {@link ResizeHistoryStateFeature}
	 * @param fp the feature provider
	 */
	public ResizeHistoryStateFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Forbid resizing of the {@link HistoryState} shapes
	 * 
	 * @param the resizing context.
	 * @return always false
	 */
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}

}
