package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Adding CompositeState feature.
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a CompositeState object.
 * 
 * @author Dragan Milchevski
 *
 */
public class AddCompositeStateFeature extends AbstractAddFeature implements IAddFeature{

	public static final int INVISIBLE_RECT_RIGHT = 6;

	public static final int INVISIBLE_RECT_LEFT = 50;
	public static final int HEIGHT = 200;
	public static final int WIDTH = 300;
	public static int MIN_WIDTH = 300;
	public static boolean initialVisible = false; //Indicates whether the initial shape is visible

	/**
	 * Creates new {@link AddCompositeStateFeature}
	 * @param fp
	 */
	public AddCompositeStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Check if a composite state can be added on the diagram.
	 * Only if the container is of a type StateChart, the composite state can be added.
	 * 
	 * @param context the context needed to execute the add
	 * @return true, if the add can be executed
	 */
	@Override
	public boolean canAdd(IAddContext context) {
		// check for right domain object instance below
		if(context.getNewObject() instanceof CompositeState){
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
	 * Add the composite state to the diagram (the state chart).
	 * 
	 * @param context the context needed to execute the add
	 * @return the added pictogram element
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		final CompositeState addedCompositeState= (CompositeState) context.getNewObject();
		// Is it an add request for adding the a Port to a diagram?
		ContainerShape targetContainer = context.getTargetContainer();

		// CONTAINER SHAPE WITH RECTANGLE
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		//Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape, PropertyUtil.STATE_CHART_PACKAGE_VALUE);

		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		GraphicsAlgorithm parentShape = targetContainer.getGraphicsAlgorithm();

		int width = context.getWidth() <= 0 ? WIDTH/*parentShape.getWidth()*/ : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();

		MIN_WIDTH = width;
		width = width-25;
		int x = 50;
		final IGaService gaService = Graphiti.getGaService();
		int y = 30;
		int rectY = 0;
		for(Shape shape : targetContainer.getChildren()){
			Object bo2 = getBusinessObjectForPictogramElement(shape);

			if(((bo2 instanceof State) || (bo2 instanceof CompositeState)) && !(bo2 instanceof StateChart) ){
				if(y < (shape.getGraphicsAlgorithm().getY()+shape.getGraphicsAlgorithm().getHeight())){
					y = shape.getGraphicsAlgorithm().getY()+shape.getGraphicsAlgorithm().getHeight()+5;
				}
			}
		}

		//if(initialVisible){
		//	height = height + INVISIBLE_RECT_TOP;
		//	rectY = 50;
		//}

		Rectangle rectangle;
		{
			// create and set visible rectangle
			Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);
			Graphiti.getPeService().setPropertyValue(invisibleRectangle, PropertyUtil.SERVICE_SHAPE, "true");
			rectangle = gaService.createPlainRectangle(invisibleRectangle);
			rectangle.setStyle(StyleUtil.getStyleForCompositeState(getDiagram()));
			rectangle.setY(0);
			gaService.setLocationAndSize(rectangle, 0, 0, width, height);

			// create link and wire it
			link(containerShape, addedCompositeState);
		}

		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			// create and set graphics algorithm

			final Polyline polyline = gaService.createPlainPolyline(shape,
					//new int[] {  22, 0, 22, height });
					new int[] { 0, rectY+20, width, rectY+20 });

			polyline.setStyle(StyleUtil.getStyleForCompositeState(getDiagram()));
		}
		
		// SHAPE WITH TEXT
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);
			
			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, addedCompositeState.getDisplayName());
			text.setStyle(StyleUtil.getStyleForCompositeStateText(getDiagram()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);

			gaService.setLocationAndSize(text, 1, 1, width-2, 19);
			
			// create link and wire it
			link(shape, addedCompositeState);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();

			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);

			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);

			directEditingInfo.setActive(true);


		}

		{//Shape with icon
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			final Image image = gaService.createImage(shape, DialogueImageProvider.IMG_COMPOSITE_STATE);

			// calculate position for icon
			final int iconWidthAndHeight = 16;
			gaService.setLocationAndSize(image, 20, rectY+3, iconWidthAndHeight, iconWidthAndHeight);

		}

		//Create the holders for On Entry and On Exit shapes
		ExecutableContentHoldersUtil.createHolders(containerShape, width, getDiagram());

		// add a chopbox anchor to the shape
		ChopboxAnchor ca = peCreateService.createChopboxAnchor(containerShape);

		{ //SHAPE FOR INITIAL STATE

			Shape shape = peCreateService.createShape(containerShape, true);
			Ellipse ellipse2 = gaService.createPlainEllipse(shape);
			ellipse2.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(ellipse2, 0, 30, 20, 20);
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

		return containerShape;
	}

	/**
	 * Creates an arrow for the initial shape 
	 * @param gaContainer the container
	 * @return arrow represented as polyline
	 */
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
