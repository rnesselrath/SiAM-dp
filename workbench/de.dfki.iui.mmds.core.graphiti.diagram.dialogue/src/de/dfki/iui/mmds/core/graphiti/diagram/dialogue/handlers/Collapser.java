package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.CollapseFeature;
import de.dfki.iui.mmds.core.model.dialogue.Node;

public class Collapser {
	private static List<ContainerShape> toCollapse_ = new ArrayList<ContainerShape>();
	private static IFeatureProvider featureProvider_;
	public static void addShapeToCollapse(ContainerShape sh) {
		toCollapse_.add(sh);		
	}
	/**
	 * 
	 */
	public static void collapse() {
		for(ContainerShape s : toCollapse_) {
			CollapseFeature lFeature = new CollapseFeature(featureProvider_);
			lFeature.setAuto(true);
        	CustomContext c = new CustomContext(new PictogramElement[]{s});
        	lFeature.execute(c);
		}
	}
	/**
	 * @param f
	 */
	public static void setFeatureProvider(IFeatureProvider f){
		featureProvider_ = f;
	}
}
