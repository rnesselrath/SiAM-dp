package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.foreach;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.AddAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;

/**
 * Adding {@link ForEach} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link ForEach} object.
 * 
 * @author Dragan
 *
 */
public class AddForEachFeature extends AbstractAddFeature implements IAddFeature{

	public static final int INVISIBLE_RECT_RIGHT = 6;
	public static final int INVISIBLE_RECT_LEFT = 50;
	public int HEIGHT = 40;
	public int WIDTH = 130;
	public int X = -1;
	public int Y = -1;

	public static boolean isParentDiagram = false;

	/**
	 * Creates new {@link AddForEachFeature}
	 * @param fp the feature provider
	 */
	public AddForEachFeature(IFeatureProvider fp) {
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
		boolean canAdd = false;

		if(context.getNewObject() instanceof ForEach){
			canAdd = BoUtil.canAddNode(context);
		}
		return canAdd;
	}

	/**
	 * Add the object on the diagram.
	 * 
	 * @param context the adding context
	 * @return the added pictogram element
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		final ForEach addedForEach = (ForEach)context.getNewObject();

		final IPeCreateService peCreateService = Graphiti.getPeCreateService();

		if(context.getTargetContainer() instanceof Diagram){
			Diagram targetDiagram = (Diagram) context.getTargetContainer();
			EObject bo = targetDiagram.getLink().getBusinessObjects().get(0);

			if(bo instanceof Node && targetDiagram.getLink().getBusinessObjects().size() > 0){
				bo = targetDiagram.getLink().getBusinessObjects().get(1);
			}

			if(bo instanceof Dialogue && targetDiagram.getLink().getBusinessObjects().size() == 1){
				//				isParentDiagram = true;
				//
				//				Object[] bos = {addedForEach, (Dialogue)bo};
				//				link(getDiagram(), bos);

				WIDTH = getDiagram().getGraphicsAlgorithm().getWidth();
				HEIGHT = getDiagram().getGraphicsAlgorithm().getWidth();
				X=0;
				Y=0;
			}else{
				isParentDiagram = false;
			}
		}

		//if(!isParentDiagram){

		//GraphicsAlgorithm parentShape = targetDiagram.getGraphicsAlgorithm();
		ContainerShape targetContainer = context.getTargetContainer();
		//GraphicsAlgorithm parentShape = targetContainer.getGraphicsAlgorithm();

		//If the target container is of a type Sequence, find free holder to put the object11
		if(getBusinessObjectForPictogramElement(targetContainer) instanceof Sequence){
			if(!PropertyUtil.isSequenceHolder(targetContainer)){
				for(Shape shape : targetContainer.getChildren()){
					if(PropertyUtil.isSequenceHolder(shape) && ((ContainerShape)shape).getChildren().isEmpty()){

						targetContainer = (ContainerShape)shape;
					}
				}
			}
		}

		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		//Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape, PropertyUtil.FLOW_CHART_PACKAGE_VALUE);

		final IGaService gaService = Graphiti.getGaService();
		PropertyUtil.setIsParentDiagram(containerShape, "false");


		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		int width = context.getWidth() <= 0 ? WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();
		int x = X == -1 ? context.getX() : X;
		int y = Y == -1 ? context.getY() : Y;

		
		RoundedRectangle rectangle; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor


			// create and set visible rectangle inside invisible rectangle
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);


			gaService.setLocationAndSize(invisibleRectangle, x, y, width, height);
			rectangle = gaService.createPlainRoundedRectangle(invisibleRectangle, 5, 5);

			rectangle.setStyle(StyleUtil.getStyleForSequence(getDiagram()));
			gaService.setLocationAndSize(rectangle, 0, 0, width, height);



			// create link and wire it
			link(containerShape, addedForEach);
		}


		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape,false);

			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape,
					new int[] { 0, 20, width, 20 });
			polyline.setStyle(StyleUtil.getStyleForSequence(getDiagram()));

		}


		// SHAPE WITH TEXT NAME
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, addedForEach.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateChartText(getDiagram()));
			gaService.setLocationAndSize(text, 1, 1, width-2, 19);

			// create link and wire it
			link(shape, addedForEach);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();

			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);

			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setActive(true);
			directEditingInfo.setGraphicsAlgorithm(text);
		}

		//SHAPE WITH IMAGE
		{
			final Shape shape = peCreateService.createShape(containerShape, false);
			final Image image = gaService.createImage(shape, DialogueImageProvider.IMG_FOR_EACH);

			// calculate position for icon
			final int iconWidthAndHeight = 16;

			gaService.setLocationAndSize(image, 20, 2, iconWidthAndHeight, iconWidthAndHeight);
		}

		//Create the holders for On Entry and On Exit shapes
		//It is not supported for objects from the Flow Chart, but in case it does in future just uncomment it.
		//ExecutableContentHoldersUtil.createHolders(containerShape, width, getDiagram());

		peCreateService.createChopboxAnchor(containerShape);

		// call the layout feature
		layoutPictogramElement(containerShape);

		//Add new holder if the parent is sequence
		if(getBusinessObjectForPictogramElement(targetContainer) instanceof Sequence){
			AddSequenceFeature.addNewHolder(targetContainer, getDiagram(), getFeatureProvider());
		}
		
		return containerShape;	
		//		}
		//		return null;
	}

}
