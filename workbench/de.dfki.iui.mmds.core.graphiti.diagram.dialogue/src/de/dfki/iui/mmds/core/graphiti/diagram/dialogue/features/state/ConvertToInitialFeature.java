package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.helpers.InitialStateHelper;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class ConvertToInitialFeature extends AbstractCustomFeature{

	public ConvertToInitialFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			//Add more of the objects that collapse here
			if (bo instanceof State) {
				ret = true;
			}
		}

		return ret;
	}

	@Override
	public String getName() {
		return "Initial State"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {

		return "Make this State an Initial State"; //$NON-NLS-1$
	}

	@Override
	public String getImageId() {
		return DialogueImageProvider.IMG_INITIAL_STATE;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {

		PictogramElement pe = context.getPictogramElements()[0];

		State state = (State)getBusinessObjectForPictogramElement(pe);
		CompositeState parent = (CompositeState) state.eContainer();

		if(parent.getInitialState() != null){ //The parent has to have initial state, otherwise don't check
			ContainerShape targetContainer = (ContainerShape) pe.eContainer();
			for(Shape child : targetContainer.getChildren()){

				EObject bo = (EObject) getBusinessObjectForPictogramElement(child);
				if(bo instanceof State){
					State initialStateOld = (State)bo;
					if(initialStateOld.equals(parent.getInitialState())){ //The correct state is found
						ContainerShape cs = (ContainerShape) child;
						disableInitial(cs);
						layoutPictogramElement(cs);
					}
				}
			}
		}
		EObject parentObject = state.eContainer();
		if(parentObject instanceof StateChart){
			StateChart stateChart = (StateChart)parentObject;
			stateChart.setInitialState(state);
		}
		if(parentObject instanceof CompositeState){
			CompositeState compositeParent = (CompositeState)parentObject;
			compositeParent.setInitialState(state);			
		}
		
		ContainerShape cs = (ContainerShape) pe;
		enableInitial(cs);
		layoutPictogramElement(cs);
		//		//Set the initial state shape to be visible
		//		ContainerShape targetContainer = (ContainerShape) pe;
		//		for(Shape shape : targetContainer.getChildren()){
		//			if(shape.getGraphicsAlgorithm() instanceof Ellipse){
		//				shape.setVisible(true);
		//				for(Connection conn : shape.getAnchors().get(0).getOutgoingConnections()){
		//					conn.setVisible(true);
		//				}
		//			}
		//		}

	}


	private void setInitialVisible(ICustomContext context){
		PictogramElement pe = context.getPictogramElements()[0];
		State state = (State)getBusinessObjectForPictogramElement(pe);

		ContainerShape targetContainer = (ContainerShape) pe;

		//Change the width of the invisible rectangle 
		Rectangle invisibleRectangle = (Rectangle) targetContainer.getGraphicsAlgorithm();
		invisibleRectangle.setWidth(invisibleRectangle.getWidth()+AddStateFeature.INVISIBLE_RECT_LEFT);
		//move the visible rectangle to the right
		GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
		rectangle.setX(AddStateFeature.INVISIBLE_RECT_LEFT);



		//Move all the shapes inside to the right
		for(Shape shape : targetContainer.getChildren()){
			if(shape.getGraphicsAlgorithm() instanceof Text){
				Text text = (Text)shape.getGraphicsAlgorithm();
				text.setX(AddStateFeature.INVISIBLE_RECT_LEFT+30);
			}
			if(shape.getGraphicsAlgorithm() instanceof Polyline){
				Polyline polyline = (Polyline)shape.getGraphicsAlgorithm();
				polyline.setX(AddStateFeature.INVISIBLE_RECT_LEFT);
			}
			if(shape.getGraphicsAlgorithm() instanceof Image){
				Image image = (Image)shape.getGraphicsAlgorithm();
				image.setX(AddStateFeature.INVISIBLE_RECT_LEFT+10);
			}
			if(shape.getGraphicsAlgorithm() instanceof Ellipse){
				shape.setVisible(true);
				for(Connection conn : shape.getAnchors().get(0).getOutgoingConnections()){
					conn.setVisible(true);
				}
			}
			//Move the shapes inside the parent (i.e. states, composite state, history state...).
			//They all have ContainerShape as a root shape
			if(shape instanceof ContainerShape){
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
				ga.setX(ga.getX()+AddStateFeature.INVISIBLE_RECT_LEFT);
			}
		}
	}

	/**
	 * Check if the parent of the state has already an initial state assigned. 
	 * If yes, then remove (set visible to false) to the initial state shape
	 * 
	 * @param context
	 */
	private void checkForExistingInitial(ICustomContext context){
		PictogramElement pe = context.getPictogramElements()[0];
		State state = (State)getBusinessObjectForPictogramElement(pe);

		CompositeState parent = (CompositeState) state.eContainer();

		if(parent.getInitialState() != null){ //The parent has to have initial state, otherwise don't check
			ContainerShape targetContainer = (ContainerShape) pe.eContainer();
			for(Shape child : targetContainer.getChildren()){

				EObject bo = (EObject) getBusinessObjectForPictogramElement(child);
				if(bo instanceof State){
					State initialStateOld = (State)bo;
					if(initialStateOld.equals(parent.getInitialState())){ //The correct state is found
						ContainerShape cs = (ContainerShape) child;
						//Change the width of the invisible rectangle. Shrink it back
						GraphicsAlgorithm invisibleRectangle = cs.getGraphicsAlgorithm();
						invisibleRectangle.setWidth(invisibleRectangle.getWidth() - AddStateFeature.INVISIBLE_RECT_LEFT);
						//Move the visible rectangle to the left
						GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
						rectangle.setX(0);

						//Move all the shapes inside to the left
						for(Shape shape : cs.getChildren()){
							if(shape.getGraphicsAlgorithm() instanceof Text){
								Text text = (Text)shape.getGraphicsAlgorithm();
								text.setX(30);

							}
							if(shape.getGraphicsAlgorithm() instanceof Polyline){
								Polyline polyline = (Polyline)shape.getGraphicsAlgorithm();
								polyline.setX(0);
							}
							if(shape.getGraphicsAlgorithm() instanceof Image){
								Image image = (Image)shape.getGraphicsAlgorithm();
								image.setX(10);
							}
							if(shape.getGraphicsAlgorithm() instanceof Ellipse){
								shape.setVisible(false);
								for(Connection conn : shape.getAnchors().get(0).getOutgoingConnections()){
									conn.setVisible(false);
								}
							}

							//Move the shapes inside the parent (i.e. states, composite state, history state...).
							//They all have ContainerShape as a root shape
							if(shape instanceof ContainerShape){
								GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
								ga.setX(ga.getX()-AddStateFeature.INVISIBLE_RECT_LEFT);
							}
						}
					}
				}
			}
		}

	}


	/**
	 * Static function that is called from many places in order to enable or make visible the intial state figure
	 * 
	 * @param cs
	 */
	public static void enableInitial(ContainerShape cs){
		
		//Change the width of the invisible rectangle 
		Rectangle invisibleRectangle = (Rectangle) cs.getGraphicsAlgorithm();
		invisibleRectangle.setWidth(invisibleRectangle.getWidth()+AddStateFeature.INVISIBLE_RECT_LEFT);
		//move the visible rectangle to the right
		GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
		rectangle.setX(AddStateFeature.INVISIBLE_RECT_LEFT);

		PropertyUtil.setInitialVisible(cs, "true");

		//Move all the shapes inside to the right
		for(Shape shape : cs.getChildren()){
			if(shape.getGraphicsAlgorithm() instanceof Text){
				Text text = (Text)shape.getGraphicsAlgorithm();
				text.setX(AddStateFeature.INVISIBLE_RECT_LEFT+1);
			}
			if(shape.getGraphicsAlgorithm() instanceof Polyline){
				Polyline polyline = (Polyline)shape.getGraphicsAlgorithm();
				polyline.setX(AddStateFeature.INVISIBLE_RECT_LEFT);
			}
			if(shape.getGraphicsAlgorithm() instanceof Image){
				Image image = (Image)shape.getGraphicsAlgorithm();
				image.setX(AddStateFeature.INVISIBLE_RECT_LEFT+10);
			}
			if(shape.getGraphicsAlgorithm() instanceof Ellipse){
				shape.setVisible(true);
				for(Connection conn : shape.getAnchors().get(0).getOutgoingConnections()){
					conn.setVisible(true);
				}
			}
			//Move the shapes inside the parent (i.e. states, composite state, history state...).
			//They all have ContainerShape as a root shape
			if(shape instanceof ContainerShape){
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
				ga.setX(ga.getX()+AddStateFeature.INVISIBLE_RECT_LEFT);
			}
		}
	}

	/**
	 * Static function that is called from many places in order to disable or make invisible the initial state figure
	 * 
	 * @param cs
	 */
	public static void disableInitial(ContainerShape cs){
		//Change the width of the invisible rectangle. Shrink it back
		GraphicsAlgorithm invisibleRectangle = cs.getGraphicsAlgorithm();
		invisibleRectangle.setWidth(invisibleRectangle.getWidth() - AddStateFeature.INVISIBLE_RECT_LEFT);
		//Move the visible rectangle to the left
		GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
		rectangle.setX(0);
		
		PropertyUtil.setInitialVisible(cs, "false");

		//Move all the shapes inside to the left
		for(Shape shape1 : cs.getChildren()){
			if(shape1.getGraphicsAlgorithm() instanceof Text){
				Text text = (Text)shape1.getGraphicsAlgorithm();
				text.setX(1);

			}
			if(shape1.getGraphicsAlgorithm() instanceof Polyline){
				Polyline polyline = (Polyline)shape1.getGraphicsAlgorithm();
				polyline.setX(0);
			}
			if(shape1.getGraphicsAlgorithm() instanceof Image){
				Image image = (Image)shape1.getGraphicsAlgorithm();
				image.setX(10);
			}
			if(shape1.getGraphicsAlgorithm() instanceof Ellipse){
				shape1.setVisible(false);
				for(Connection conn : shape1.getAnchors().get(0).getOutgoingConnections()){
					conn.setVisible(false);
				}
			}

			//Move the shapes inside the parent (i.e. states, composite state, history state...).
			//They all have ContainerShape as a root shape
			if(shape1 instanceof ContainerShape){
				GraphicsAlgorithm ga = shape1.getGraphicsAlgorithm();
				ga.setX(ga.getX()-AddStateFeature.INVISIBLE_RECT_LEFT);
			}

		}
	}



	private void transformShape(ICustomContext context){
		PictogramElement pe = context.getPictogramElements()[0];
		State state = (State)getBusinessObjectForPictogramElement(pe);

		ContainerShape targetContainer = (ContainerShape) pe.eContainer();

		//System.out.println("da go eba = "+state.eContainer());


		// CONTAINER SHAPE WITH ELLIPSE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		int width = 20;
		int height = 20;

		IGaService gaService = Graphiti.getGaService();
		Ellipse ellipse; // need to access it later
		{

			ellipse = gaService.createPlainEllipse(containerShape);
			ellipse.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(ellipse, pe.getGraphicsAlgorithm().getX()-50,pe.getGraphicsAlgorithm().getY()+12, width, height);
			ellipse.setLineWidth(10);
			EObject ish =  EcoreFactory.eINSTANCE.createEObject();
			getDiagram().eResource().getContents().add(ish);
			link(containerShape, ish);
		}

		//		{//Create the letter I
		//			final Shape shape = peCreateService.createShape(containerShape, false);
		//			Polyline polyline = gaService.createPlainPolyline(shape, new int[] { 0, 0, 10, 0, 6, 0, 6, 13, 0, 13, 10, 13 });
		//			polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
		//			polyline.setLineWidth(3);
		//			gaService.setLocationAndSize(polyline, 5, 3, 20, 20);
		//		}

		{ //Create a line between the I shape and the state
			// add a chopbox anchor to the shape
			peCreateService.createChopboxAnchor(containerShape);

			Connection connection =peCreateService.createManhattanConnection(getDiagram());
			Polyline polyline = gaService.createPlainPolyline(connection);
			polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
			ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
			createArrow(cd);

			ContainerShape csTmp = (ContainerShape) pe;
			for(int i=0; i<csTmp.getAnchors().size(); i++){
				Anchor anchor = csTmp.getAnchors().get(i);

			}
			Anchor sourceAnchor = containerShape.getAnchors().get(0);
			Anchor targetAnchor = csTmp.getAnchors().get(0);
			connection.setStart(sourceAnchor);
			connection.setEnd(targetAnchor);
		}

		/*
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);


			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, state.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateText(getDiagram()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			//text.setX(0);
			//text.setY(0);
			gaService.setLocationAndSize(text, 15,45, width, 20);


			// create link and wire it
			link(shape, state);

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
		 */
		/*// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// create an additional box relative anchor at middle-right
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // Use golden section

		// anchor references visible rectangle instead of invisible rectangle
		boxAnchor.setReferencedGraphicsAlgorithm(ellipse);

		// assign a graphics algorithm for the box relative anchor
		final Ellipse ellipse2 = gaService.createPlainEllipse(boxAnchor);

		// anchor is located on the right border of the visible rectangle
		// and touches the border of the invisible rectangle
		final int w = INVISIBLE_RECT_RIGHT;
		gaService.setLocationAndSize(ellipse2, -w, 0, 2 * w, 2 * w);
		ellipse2.setStyle(StyleUtil.getStyleForState(getDiagram()));
		final int w = INVISIBLE_RECT_RIGHT;
		ContainerShape csTmp = (ContainerShape) pe;
		for(int i=0; i<csTmp.getAnchors().size(); i++){
			if(csTmp.getAnchors().get(i) instanceof BoxRelativeAnchor){

				BoxRelativeAnchor boxAnchor = (BoxRelativeAnchor) csTmp.getAnchors().get(i);
				//gaService.setLocationAndSize(boxAnchor.getGraphicsAlgorithm(),  -w, 0, 2 * w, 2 * w);
				containerShape.getAnchors().add(boxAnchor);
			}else{
				containerShape.getAnchors().add(csTmp.getAnchors().get(i));
			//}
			//System.out.println("anchors "+csTmp.getAnchors().get(i));
		}
		//containerShape.getAnchors().addAll(csTmp.getAnchors());

		IRemoveContext rc = new RemoveContext(pe);
		IFeatureProvider featureProvider = getFeatureProvider();
		IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
		if (removeFeature != null) {
			removeFeature.remove(rc);
		}

		 */
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
