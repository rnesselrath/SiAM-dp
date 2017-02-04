package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.FinalState;

/**
 * Adding {@link FinalState} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link FinalState} object.
 * 
 * @author Dragan Milchevski
 * Created on: Apr 17, 2013
 *
 */
public class AddFinalStateFeature extends AbstractAddFeature implements IAddFeature {

	public static final int HEIGHT = 30;
	public static final int WIDTH = 30;

	/**
	 * Creates new {@link AddFinalStateFeature}
	 * @param fp the feature provider
	 */
	public AddFinalStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Check the container if it is of a type entry or exit
	 * 
	 * @param context the adding context
	 * @return true if the feature can be added.
	 */
	@Override
	public boolean canAdd(IAddContext context) {
		// check for right domain object instance below
		if(context.getNewObject() instanceof FinalState){
			// Added to handle extended Drag & Drop features
			if (context.getProperty("container") instanceof AbstractCompositeState) {
				return true;
			}


			// Is it an add request for adding the State to a State Chart?
			ContainerShape container = context.getTargetContainer();
			PictogramLink link = container.getLink();
			EList<EObject> bo = link.getBusinessObjects();
			if (bo.get(0) instanceof AbstractCompositeState) { //
				return true;
			}


		}
		return false;
	}


	/**
	 * Add the object on the diagram.
	 * 
	 * @param context the adding context
	 * @return the added pictogram element
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		final FinalState addedFinalState = (FinalState) context.getNewObject();
		// Is it an add request for adding the a Port to a diagram?
		ContainerShape targetContainer = context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		//Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape, PropertyUtil.STATE_CHART_PACKAGE_VALUE);

		int width = context.getWidth() <= 0 ? WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();
		//int INVISIBLE_RECT_RIGHT = 6;

		IGaService gaService = Graphiti.getGaService();
		Ellipse ellipse; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);

			// create and set visible ellipse inside invisible rectangle
			ellipse = gaService.createPlainEllipse(invisibleRectangle);
			ellipse.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(ellipse, 0, 0, width, height);
			ellipse.setLineWidth(2);

		}
		{//Create the dot inside the circle
			final Shape shape = peCreateService.createShape(containerShape, false);
			Ellipse insideDot = gaService.createPlainEllipse(shape);
			insideDot.setStyle(StyleUtil.getStyleForState(getDiagram()));

			gaService.setLocationAndSize(insideDot, 7, 7, 16, 16);
			insideDot.setLineWidth(8);
			//link(shape, addedFinalState);
		}

		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);
		link(containerShape, addedFinalState);

		//		// create an additional box relative anchor at middle-right
		//		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		//		boxAnchor.setRelativeWidth(1.0);
		//		boxAnchor.setRelativeHeight(0.38); // Use golden section
		//
		//		// anchor references visible rectangle instead of invisible rectangle
		//		boxAnchor.setReferencedGraphicsAlgorithm(ellipse);

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	} 

}
