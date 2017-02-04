package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.foreach;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.AbstractLayoutShapeFeature;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;

public class LayoutForEachFeature extends AbstractLayoutShapeFeature{

	private static final int MIN_HEIGHT = 66;
	private static final int MIN_WIDTH = 140;
	public static final int PADDING = 50;
	public static final int PADDING_WIDTH = 20;
	public int PADDING_TOP = 30;
	public int PADDING_BOTTOM = 0;
	
	public LayoutForEachFeature(IFeatureProvider fp) {
		super(fp);
	}


	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an Sequence
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof ForEach;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = commonLayout(context);

		ContainerShape containerShape =(ContainerShape) context.getPictogramElement();

		anythingChanged = layoutInsideShapes(containerShape);


		return anythingChanged;
	}
}
