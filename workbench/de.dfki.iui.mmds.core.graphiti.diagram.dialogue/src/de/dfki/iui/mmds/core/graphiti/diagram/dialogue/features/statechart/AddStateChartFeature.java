package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Adding {@link StateChart} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link StateChart} object.
 * 
 * @author Dragan Milchevski
 *
 */

public class AddStateChartFeature extends AbstractAddFeature implements IAddFeature {

	// the additional size of the invisible rectangle at the right border
	// (this also equals the half width of the anchor to paint there)
	public static final int INVISIBLE_RECT_RIGHT = 6;
	public static final int INVISIBLE_RECT_LEFT = 50;

	public int HEIGHT = 800;
	public int WIDTH = 800;
	public int X = -1;
	public int Y = -1;


	public static boolean isParentDiagram = false;

	public AddStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		boolean canAdd = false;
		// TODO: check for right domain object instance below

		if(context.getNewObject() instanceof StateChart){
			if(context.getTargetContainer() instanceof Diagram){

				canAdd = true;
			}
			// Added to handle extended Drag & Drop features
			if (context.getProperty("container") instanceof AbstractCompositeState) {

				canAdd = true;
			}

			if(context.getProperty("container") instanceof Dialogue){
				Dialogue d = (Dialogue) context.getProperty("container") ;
				if(d.getContent()==null){
					canAdd = true;
				}
			}

			// Is it an add request for adding the State to a State Chart?
			ContainerShape container = context.getTargetContainer();
			PictogramLink link = container.getLink();

			for(EObject bo : link.getBusinessObjects()){
				if (bo instanceof AbstractCompositeState) { //
					canAdd = true;
				}

				if(bo instanceof Node){
					canAdd = true;
				}

				if(bo instanceof Dialogue){
					Dialogue d = (Dialogue) bo ;
					if(d.getContent() == null){
						canAdd = true;
					}
				}
			}


			/*for(Shape shape : context.getTargetContainer().getChildren()){
				if(shape instanceof ContainerShape ){ //It is another object
					GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();

					int x  = ga.getX();
					int x1 = ga.getX() + ga.getWidth();
					int y  = ga.getY();
					int y1 = ga.getY() + ga.getHeight();

					if((context.getX()+WIDTH)>x && context.getX()<x1 && (context.getY()+HEIGHT)>y && context.getY()<y1){
						canAdd = false;
					}

				}
			}*/

		}

		return canAdd;

	}

	@Override
	public PictogramElement add(IAddContext context) {

		final StateChart addedStateChart = (StateChart) context.getNewObject();

		//Diagram targetDiagram;// = (Diagram) context.getTargetContainer();


		final IPeCreateService peCreateService = Graphiti.getPeCreateService();

		if(context.getTargetContainer() instanceof Diagram){
			Diagram targetDiagram = (Diagram) context.getTargetContainer();
			EObject bo = targetDiagram.getLink().getBusinessObjects().get(0);

			if(bo instanceof AbstractCompositeState && targetDiagram.getLink().getBusinessObjects().size() > 0){
				bo = targetDiagram.getLink().getBusinessObjects().get(1);
			}

			if(bo instanceof Dialogue /*&& targetDiagram.getLink().getBusinessObjects().size() == 1*/){
				//isParentDiagram = true;
				WIDTH = getDiagram().getGraphicsAlgorithm().getWidth();
				HEIGHT = getDiagram().getGraphicsAlgorithm().getWidth();
				X=0;
				Y=0;
				//Object[] bos = {addedStateChart, (Dialogue)bo};
				//link(getDiagram(), bos);
			}else{
				//isParentDiagram = false;
			}
		}
		//		
		//		if(!isParentDiagram){

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
		PropertyUtil.setPackage(containerShape, PropertyUtil.STATE_CHART_PACKAGE_VALUE);

		final IGaService gaService = Graphiti.getGaService();
		Graphiti.getPeService().setPropertyValue(containerShape, "isParentDiagram", "false");
		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		int width = context.getWidth() <= 0 ? WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();
		int x = X < 0 ? context.getX() : X;
		int y = Y < 0 ? context.getY() : Y;

		Rectangle rectangle; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor


			// create and set visible rectangle inside invisible rectangle
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);

			if(isParentDiagram){
				gaService.setLocationAndSize(invisibleRectangle, 0 , 0, width, height);
			}else{

				gaService.setLocationAndSize(invisibleRectangle, x, y, width, height);

				rectangle = gaService.createPlainRectangle(invisibleRectangle);
				rectangle.setStyle(StyleUtil.getStyleForStateChart(getDiagram()));
				gaService.setLocationAndSize(rectangle, 0, 0, width, height);
			}

			// create link and wire it
			link(containerShape, addedStateChart);
		}
		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape,
					false);
			
			PropertyUtil.setServiceShape(shape);

			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape,
					new int[] { 0, 20, width, 20 });
			polyline.setStyle(StyleUtil.getStyleForStateChart(getDiagram()));

		}


		// SHAPE WITH TEXT
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape,false);
			PropertyUtil.setServiceShape(shape);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape,addedStateChart.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateChartText(getDiagram()));
			gaService.setLocationAndSize(text, 1, 1, width-2, 19);
			//
			// create link and wire it
			link(shape, addedStateChart);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider()
					.getDirectEditingInfo();
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
			PropertyUtil.setServiceShape(shape);
			final Image image = gaService.createImage(shape, DialogueImageProvider.IMG_STATECHART);

			// calculate position for icon
			final int iconWidthAndHeight = 16;
			//final int padding = 12;
			//final int xPos =  padding - (width/2);
			//final int yPos = padding - (iconWidthAndHeight/2);

			gaService.setLocationAndSize(image, 20, 2, iconWidthAndHeight, iconWidthAndHeight);
		}

		//Create the holders for On Entry and On Exit shapes
		ExecutableContentHoldersUtil.createHolders(containerShape, width, getDiagram());

		peCreateService.createChopboxAnchor(containerShape);

		{ //SHAPE FOR INITIAL STATE

			Shape shape = peCreateService.createShape(containerShape, true);
			PropertyUtil.setServiceShape(shape);
			Ellipse ellipse2 = gaService.createPlainEllipse(shape);
			ellipse2.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(ellipse2,0,12, 20, 20);
			ellipse2.setLineWidth(10);

			peCreateService.createChopboxAnchor(shape);

			Connection connection = peCreateService.createManhattanConnection(getDiagram());
			Polyline polyline = gaService.createPlainPolyline(connection);
			polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
			ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
			createArrow(cd);

			Anchor sourceAnchor = shape.getAnchors().get(0);
			Anchor targetAnchor = containerShape.getAnchors().get(0);

			connection.setStart(sourceAnchor);
			connection.setEnd(targetAnchor);

			shape.setVisible(false);
			connection.setVisible(false);

		}
		// call the layout feature
		layoutPictogramElement(containerShape);
		

		if(getBusinessObjectForPictogramElement(targetContainer) instanceof Sequence){	
			//Add new holder if the parent is sequence
			AddSequenceFeature.addNewHolder(targetContainer, getDiagram(), getFeatureProvider());
		}
		return containerShape;	
		//		}
		//		return null;
		/*// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// create an additional box relative anchor at middle-right
		final BoxRelativeAnchor boxAnchor = peCreateService
				.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // Use golden section

		// anchor references visible rectangle instead of invisible rectangle
		boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);

		// assign a graphics algorithm for the box relative anchor
		final Ellipse ellipse = gaService.createPlainEllipse(boxAnchor);

		// anchor is located on the right border of the visible rectangle
		// and touches the border of the invisible rectangle
		final int w = INVISIBLE_RECT_RIGHT;
		gaService.setLocationAndSize(ellipse, -w, -w, 2 * w, 2 * w);
		ellipse.setStyle(StyleUtil.getStyleForStateChart(getDiagram()));*/


	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		Polygon polygon =gaService.createPolygon(gaContainer, new int[] { -10, 5, 0, 0, -10, -5 });
		//polygon.setForeground(manageColor(IColorConstant.BLACK));

		polygon.setStyle(StyleUtil.getStyleForState(getDiagram()));
		polygon.setLineWidth(4);
		polygon.setBackground(manageColor(IColorConstant.BLACK));
		polygon.setFilled(true);
		return polygon;
	}
}
