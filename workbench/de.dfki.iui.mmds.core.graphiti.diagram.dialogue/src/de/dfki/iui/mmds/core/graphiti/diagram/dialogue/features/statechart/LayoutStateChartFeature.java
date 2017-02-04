package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.AbstractLayoutShapeFeature;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Layoyt feature for StateChart
 * @author Dragan
 *
 */
public class LayoutStateChartFeature extends AbstractLayoutShapeFeature {

	public static int MIN_HEIGHT = 40;
	public static int MIN_WIDTH = 180;
	public static int PADDING = 50;
	public static int PADDING_WIDTH = 20;
	public int PADDING_TOP = 30;
	public int PADDING_BOTTOM = 0;

	public LayoutStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Check if the layouting is possible
	 */
	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an EClass
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof StateChart;
	}

	/**
	 * Layout the object
	 */
	public boolean layout(ILayoutContext context) {

		boolean anythingChanged = commonLayout(context);

		ContainerShape containerShape =(ContainerShape) context.getPictogramElement();

		anythingChanged = layoutInsideShapes(containerShape);


		return anythingChanged;
	}

}
