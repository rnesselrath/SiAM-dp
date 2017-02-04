package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;

/**
 * Add {@link DoWhile} feature
 * 
 * @author Dragan Milchevski
 *
 */
public class AddDoWhileFeature extends AbstractAddFeature implements IAddFeature{
	public static final int INVISIBLE_RECT_RIGHT = 6;
	public static final int INVISIBLE_RECT_LEFT = 60;

	public int HEIGHT = 400;
	public int WIDTH = 400;
	public int X = -1;
	public int Y = -1;

	public static boolean isParentDiagram = false;

	/**
	 * Creates new {@link AddDoWhileFeature}
	 * @param fp the feature provider
	 */
	public AddDoWhileFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Check if the shape can be added.
	 * 
	 * @param context the adding context
	 * @return true if the feature can be added.
	 */
	@Override
	public boolean canAdd(IAddContext context) {
		boolean canAdd = false;

		if(context.getNewObject() instanceof DoWhile){
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


		final DoWhile addedDoWhile = (DoWhile)context.getNewObject();


		final IPeCreateService peCreateService = Graphiti.getPeCreateService();

		if(context.getTargetContainer() instanceof Diagram){
			Diagram targetDiagram = (Diagram) context.getTargetContainer();
			EObject bo = targetDiagram.getLink().getBusinessObjects().get(0);

			if(bo instanceof Node && targetDiagram.getLink().getBusinessObjects().size() > 0){
				bo = targetDiagram.getLink().getBusinessObjects().get(1);
			}

			if(bo instanceof Dialogue /*&& targetDiagram.getLink().getBusinessObjects().size() == 1*/){
				//				isParentDiagram = true;
				//
				//				Object[] bos = {addedDoWhile, (Dialogue)bo};
				//				link(getDiagram(), bos);
				WIDTH = getDiagram().getGraphicsAlgorithm().getWidth();
				HEIGHT = getDiagram().getGraphicsAlgorithm().getWidth();
				X=0;
				Y=0;
			}else{
				//isParentDiagram = false;
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

		Rectangle rectangle; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor


			// create and set visible rectangle inside invisible rectangle
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);


			gaService.setLocationAndSize(invisibleRectangle, x, y, width, height);
			rectangle = gaService.createPlainRectangle(invisibleRectangle);

			rectangle.setStyle(StyleUtil.getStyleForSequence(getDiagram()));
			gaService.setLocationAndSize(rectangle, 0, 0, width, height);



			// create link and wire it
			link(containerShape, addedDoWhile);
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

		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape,false);
			PropertyUtil.setFooterVaue(shape, PropertyUtil.FOOTER_LINE_VALUE);
			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape,
					new int[] { 0, height-45, width, height-45 });
			polyline.setStyle(StyleUtil.getStyleForSequence(getDiagram()));

		}

		// SHAPE WITH TEXT FOR CONDITION Description
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.CONDITION_DESC_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, "Condition:");
			//text.setStyle(StyleUtil.getStyleForStateChartText(getDiagram()));
			text.setFilled(false);
			gaService.setLocationAndSize(text, 10, height-45, 30, 19);
		}

		// SHAPE WITH TEXT FOR CONDITION
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.CONDITION_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, addedDoWhile.getCondition());
			text.setStyle(StyleUtil.getStyleForConditionText(getDiagram()));

			gaService.setLocationAndSize(text, 5, height-25, width-10, 19);
			//
			// create link and wire it
			link(shape, addedDoWhile);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();

			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);

			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);

		}


		// SHAPE WITH TEXT NAME
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, addedDoWhile.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateChartText(getDiagram()));
			gaService.setLocationAndSize(text, 1, 1, width-2, 19);

			// create link and wire it
			link(shape, addedDoWhile);

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
			final Image image = gaService.createImage(shape, DialogueImageProvider.IMG_DO_WHILE);

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
