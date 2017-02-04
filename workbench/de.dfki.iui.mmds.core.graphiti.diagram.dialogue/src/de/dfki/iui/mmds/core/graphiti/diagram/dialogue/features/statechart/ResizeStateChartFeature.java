package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class ResizeStateChartFeature extends DefaultResizeShapeFeature  {

	public ResizeStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		boolean canResize = super.canResizeShape(context);
		
		// perform further check only if move allowed by default feature
		if (canResize) {
			
			boolean isCollapsed = Boolean.parseBoolean(Graphiti.getPeService().getPropertyValue(context.getPictogramElement(), "isCollapsed"));
			//Do not allow further resizing of collapsed shapes
			if(isCollapsed){
				canResize = false;
			}
		}
		return canResize;

	}
	

}
