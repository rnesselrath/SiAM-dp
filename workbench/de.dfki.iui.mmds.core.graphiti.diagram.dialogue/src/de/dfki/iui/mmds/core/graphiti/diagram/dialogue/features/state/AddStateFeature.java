package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state;

import org.eclipse.emf.common.util.EList;
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
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
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
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * Adding {@link State} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link State} object.
 * 
 * @author Dragan Milchevski
 *
 */
public class AddStateFeature extends AbstractAddFeature implements IAddFeature{

	public static final int INVISIBLE_RECT_RIGHT = 6;
	public static final int INVISIBLE_RECT_LEFT = 50;
	public static final int HEIGHT = 66;
	public static final int WIDTH = 130;
	public static boolean initialVisible = false;

	/**
	 * Creates new {@link AddStateFeature}
	 * @param fp the feature provider
	 */
	public AddStateFeature(IFeatureProvider fp) {
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
		if(context.getNewObject() instanceof State){
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
		final State addedState = (State) context.getNewObject();

		ContainerShape targetContainer = context.getTargetContainer();


		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		//Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape, PropertyUtil.STATE_CHART_PACKAGE_VALUE);

		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		int width = context.getWidth() <= 0 ? WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();
		int x = 50;

		IGaService gaService = Graphiti.getGaService();

		RoundedRectangle roundedRectangle; // need to access it later
		Rectangle invisibleRectangle;
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width + INVISIBLE_RECT_RIGHT, height);

			// create and set visible rectangle inside invisible rectangle
			roundedRectangle = gaService.createPlainRoundedRectangle(invisibleRectangle, 5, 5);
			roundedRectangle.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(roundedRectangle, 0, 0, width, height);


			// create link and wire it
			link(containerShape, addedState);
		}

		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape,
					false);

			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape,
					new int[] { 0, 20, width, 20 });
			polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);

			// create and set text graphics algorithm
			Text text = gaService.createPlainText(shape, addedState.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateText(getDiagram()));
			text.setFilled(false);
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			text.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
			gaService.setLocationAndSize(text, 1, 1, width-2, 19);

			// create link and wire it
			link(shape, addedState);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);
			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);
			directEditingInfo.setActive(false);
		}

		{ //SHAPE WITH IMAGE
			Shape shape = peCreateService.createShape(containerShape, false);
			Image image = gaService.createImage(shape, DialogueImageProvider.IMG_STATE);

			// calculate position for icon
			int iconWidthAndHeight = 16;

			gaService.setLocationAndSize(image, 10, 2/*yPos*/, iconWidthAndHeight, iconWidthAndHeight);
		}

		//Create the holders for On Entry and On Exit shapes
		ExecutableContentHoldersUtil.createHolders(containerShape, width, getDiagram());


		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// create an additional box relative anchor at middle-right
		BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // Use golden section

		// anchor references visible rectangle instead of invisible rectangle
		boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);

		// assign a graphics algorithm for the box relative anchor
		Ellipse ellipse = gaService.createPlainEllipse(boxAnchor);

		// anchor is located on the right border of the visible rectangle
		// and touches the border of the invisible rectangle
		int w = INVISIBLE_RECT_RIGHT;
		gaService.setLocationAndSize(ellipse, -w, 0, 2 * w, 2 * w);
		ellipse.setStyle(StyleUtil.getStyleForState(getDiagram()));


		{ //SHAPE FOR INITIAL STATE

			Shape shape = peCreateService.createShape(containerShape, true);
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

		return containerShape;
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
