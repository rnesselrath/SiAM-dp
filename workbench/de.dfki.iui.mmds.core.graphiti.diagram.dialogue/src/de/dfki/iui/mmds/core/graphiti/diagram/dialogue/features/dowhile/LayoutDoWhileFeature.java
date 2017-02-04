package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.AbstractLayoutShapeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;

/**
 * The class {@link LayoutDoWhileFeature} that extends the 
 * @author Dragan Milchevski
 *
 */
public class LayoutDoWhileFeature extends AbstractLayoutShapeFeature{

	public static final int MIN_HEIGHT = 40;
	public static final int MIN_WIDTH = 140;
	public static final int PADDING = 50;
	public static final int PADDING_WIDTH = 20;
	public int PADDING_TOP = 30;
	public int PADDING_BOTTOM = 0;

	public LayoutDoWhileFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an Sequence
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof DoWhile;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = commonLayout(context);

		ContainerShape containerShape =(ContainerShape) context.getPictogramElement();

		anythingChanged = layoutInsideShapes(containerShape);

		return anythingChanged;
	}
}
