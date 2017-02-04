package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.AbstractLayoutShapeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.AddStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;

/**
 * This class extends {@link AbstractLayoutShapeFeature} and implements some feature specific only for {@link CompositeState}
 * @author Dragan Milchevski
 *
 */
public class LayoutCompositeStateFeature extends AbstractLayoutShapeFeature {

	private static final int MIN_HEIGHT = 40;
	private static final int MIN_WIDTH = 180;// AddCompositeStateFeature.MIN_WIDTH;
	public static final int PADDING = 50;
	public static final int PADDING_WIDTH = 20;
	public int PADDING_TOP = 30;
	public int PADDING_BOTTOM = 0;

	/**
	 * Creates new {@link LayoutCompositeStateFeature}
	 * @param fp the feature provider
	 */
	public LayoutCompositeStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks whether the current pictogram element of the given context can be layouted.
	 * 
	 * @param context the context
	 * @return true if update is possible
	 */
	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an EClass
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof CompositeState;
	}

	/**
	 * Layoutes the pictogram element.
	 * 
	 * @param context the context
	 * @return true, if update process was successful
	 */
	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = commonLayout(context);

		ContainerShape containerShape =(ContainerShape) context.getPictogramElement();
		anythingChanged = layoutInsideShapes(containerShape);

		return anythingChanged;
	}

}
