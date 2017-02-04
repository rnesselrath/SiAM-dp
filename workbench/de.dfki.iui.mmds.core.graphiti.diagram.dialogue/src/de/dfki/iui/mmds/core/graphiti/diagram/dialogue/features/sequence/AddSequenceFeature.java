package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.ResizeContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.AbstractLayoutShapeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.AddAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;

/**
 * Adding {@link Sequence} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link Sequence} object.
 * 
 * @author Dragan Milchevski
 * 
 */

public class AddSequenceFeature extends AbstractAddFeature implements IAddFeature {

	// the additional size of the invisible rectangle at the right border
	// (this also equals the half width of the anchor to paint there)
	public static final int INVISIBLE_RECT_RIGHT = 6;
	public static final int INVISIBLE_RECT_LEFT = 60;

	public int HEIGHT = 300;
	public int WIDTH = 400;
	public int X = -1;
	public int Y = -1;

	public static boolean isParentDiagram = false;

	/**
	 * Creates new {@link AddSequenceFeature}
	 * @param fp the feature provider
	 */
	public AddSequenceFeature(IFeatureProvider fp) {
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

		if (context.getNewObject() instanceof Sequence) {
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
		final Sequence addedSequence = (Sequence) context.getNewObject();
		

		final IPeCreateService peCreateService = Graphiti.getPeCreateService();

		if (context.getTargetContainer() instanceof Diagram) {
			Diagram targetDiagram = (Diagram) context.getTargetContainer();
			EObject bo = targetDiagram.getLink().getBusinessObjects().get(0);

			if (bo instanceof Node
					&& targetDiagram.getLink().getBusinessObjects().size() > 0) {
				bo = targetDiagram.getLink().getBusinessObjects().get(1);
			}

			if (bo instanceof Dialogue
					&& targetDiagram.getLink().getBusinessObjects().size() == 1) {
				// isParentDiagram = true;
				//
				// Object[] bos = {addedSequence, (Dialogue)bo};
				// link(getDiagram(), bos);
				//System.out.println("pak li si dialogue?");
				WIDTH = getDiagram().getGraphicsAlgorithm().getWidth();
				HEIGHT = getDiagram().getGraphicsAlgorithm().getWidth();
				X = 0;
				Y = 0;
			} else {
				isParentDiagram = false;
			}
		}

		// if(!isParentDiagram){

		// GraphicsAlgorithm parentShape = targetDiagram.getGraphicsAlgorithm();
		ContainerShape targetContainer = context.getTargetContainer();
		// GraphicsAlgorithm parentShape =
		// targetContainer.getGraphicsAlgorithm();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetContainer, true);

		// Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape,
				PropertyUtil.FLOW_CHART_PACKAGE_VALUE);

		final IGaService gaService = Graphiti.getGaService();
		PropertyUtil.setIsParentDiagram(containerShape, "false");

		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		int width = context.getWidth() <= 0 ? WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? HEIGHT : context.getHeight();
		int x = X == -1 ? context.getX() : X;
		int y = Y == -1 ? context.getY() : Y;

		// System.out.println("X="+X+" Y="+Y+" WIDTH="+WIDTH+" HEIGHT="+HEIGHT+" x="+x+" y="+y);
		Rectangle rectangle; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor

			// create and set visible rectangle inside invisible rectangle
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			
			// if(isParentDiagram){
			// gaService.setLocationAndSize(invisibleRectangle, 0 , 0, width,
			// height);
			// }else{

			// gaService.setLocationAndSize(invisibleRectangle, context.getX(),
			// context.getY(), width, height);
			gaService.setLocationAndSize(invisibleRectangle, x, y, width,
					height);
			rectangle = gaService.createPlainRectangle(invisibleRectangle);

			rectangle.setStyle(StyleUtil.getStyleForSequence(getDiagram()));
			gaService.setLocationAndSize(rectangle, 0, 0, width, height);
			// }

			// create link and wire it
			link(containerShape, addedSequence);
		}
		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape,
					false);

			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape,
					new int[] { 0, 20, width, 20 });
			polyline.setStyle(StyleUtil.getStyleForSequence(getDiagram()));

		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			PropertyUtil.setTextFieldVaue(shape, PropertyUtil.DISPLAY_TEXT_VALUE);

			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, addedSequence.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateChartText(getDiagram()));
			gaService.setLocationAndSize(text, 1, 1, width - 2, 19);
			//
			// create link and wire it
			link(shape, addedSequence);

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

		// SHAPE WITH IMAGE
		{
			final Shape shape = peCreateService.createShape(containerShape, false);
			final Image image = gaService.createImage(shape, DialogueImageProvider.IMG_SEQUENCE);

			// calculate position for icon
			final int iconWidthAndHeight = 16;

			gaService.setLocationAndSize(image, 20, 2, iconWidthAndHeight,
					iconWidthAndHeight);
		}

		{
			ContainerShape shape = addHolder(containerShape, getDiagram(), getFeatureProvider());

			link(shape, addedSequence);
		}

		//		{
		//			ContainerShape shape = addHolder(containerShape, getDiagram(), getFeatureProvider());
		//
		//			link(shape, addedSequence);
		//		}


		// Create the holders for On Entry and On Exit shapes
		// It is not supported for objects from the Flow Chart, but in case it
		// does in future just uncomment it.
		// ExecutableContentHoldersUtil.createHolders(containerShape, width,
		// getDiagram());

		peCreateService.createChopboxAnchor(containerShape);

		//Add new holder if the parent is sequence
		if(getBusinessObjectForPictogramElement(targetContainer) instanceof Sequence){
				AddSequenceFeature.addNewHolder(targetContainer, getDiagram(), getFeatureProvider());
		}
				
		// call the layout feature
		layoutPictogramElement(containerShape);
		
		

		return containerShape;
		// }
		//
		// return null;
	}

	public static ContainerShape addHolder(ContainerShape containerShape, Diagram diagram, IFeatureProvider fp) {
		
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final IGaService gaService = Graphiti.getGaService();

		Anchor sourceAnchor = null;
		final ContainerShape shape = peCreateService.createContainerShape(containerShape, true);

		int width = containerShape.getGraphicsAlgorithm().getWidth();
		int height = containerShape.getGraphicsAlgorithm().getHeight()-40;
		int csHeight = 0;

		int x = 5;
		int y = 30;
		int seqNo = 0;
		//System.out.println("AAAA "+containerShape.getGraphicsAlgorithm().getHeight());
		
		for (Shape s : containerShape.getChildren()) {
			if (PropertyUtil.isSequenceHolder(s)) {
				
				//y = y + height + 20;
				
				if(s instanceof ContainerShape){
					for(Shape s1 : ((ContainerShape)s).getChildren()){
						if(fp.getBusinessObjectForPictogramElement(s1) instanceof ExecutableContentNode
								|| fp.getBusinessObjectForPictogramElement(s1) instanceof WaitForEvent
								|| fp.getBusinessObjectForPictogramElement(s1) instanceof ForEach){
							y  += (46 + 20);
							csHeight += 66;
							
						}else{
							y += (s1.getGraphicsAlgorithm().getHeight() + 20);
							
							csHeight += s1.getGraphicsAlgorithm().getHeight() + 20;
						}
						
					}
					
				}
				
				
				//System.out.println("Y="+s.getGraphicsAlgorithm().getHeight());
				sourceAnchor = s.getAnchors().get(0);
				seqNo++;

			}
		}
		csHeight +=280;
		PropertyUtil.setSequenceHolder(shape, PropertyUtil.SEQUENCE_HOLDER_VALUE);
		PropertyUtil.setSequenceOrder(shape, String.valueOf(seqNo));
		peCreateService.createChopboxAnchor(shape);

		csHeight = 30 + csHeight; //((seqNo+1)*(height+20));
         
		System.out.println("Height "+height);
		Rectangle rec1 = gaService.createPlainRectangle(shape);
		gaService.setLocationAndSize(rec1, x, y, width , height);
		rec1.setStyle(StyleUtil.getStyleForSequenceHolder(diagram));

		ResizeShapeContext context = new ResizeShapeContext(containerShape);
		context.setSize(containerShape.getGraphicsAlgorithm().getWidth(), csHeight);
		context.setLocation(containerShape.getGraphicsAlgorithm().getX(), containerShape.getGraphicsAlgorithm().getY());
		IResizeShapeFeature rsf = fp.getResizeShapeFeature(context);
		
		if (rsf.canExecute(context)) {
			rsf.execute(context);
		}

		
		if(PropertyUtil.isSequenceHolder(containerShape.getContainer())){
			//System.out.println("height "+containerShape.getGraphicsAlgorithm().getHeight()+" pa "+containerShape.getContainer().getGraphicsAlgorithm().getHeight());
			if(containerShape.getGraphicsAlgorithm().getHeight()>containerShape.getContainer().getGraphicsAlgorithm().getHeight()){
				//containerShape.getContainer().getGraphicsAlgorithm().setHeight(containerShape.getGraphicsAlgorithm().getHeight()+20);
				//resizeParent(containerShape.getContainer(), containerShape.getGraphicsAlgorithm().getHeight(), fp);
			}
		}
		
		if(sourceAnchor!=null){

			Connection connection = peCreateService.createManhattanConnection(diagram);
			Polyline polyline = gaService.createPlainPolyline(connection);
			polyline.setStyle(StyleUtil.getStyleForSequenceHolder(diagram));
			polyline.setLineStyle(LineStyle.SOLID);
			//polyline.setLineWidth(5);
			ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
			createArrow(cd, diagram);

			Anchor targetAnchor = shape.getAnchors().get(0);


			connection.setStart(sourceAnchor);
			connection.setEnd(targetAnchor);

		}

		return shape;
	}
	
	/**
	 * Shift holders to certain position
	 * 
	 * @param cs the container shape of the Sequence
	 * @param deletePosition the position to be deleted
	 * @param fp the feature provider
	 * @param diagram the {@link Diagram}
	 */
	public static void shiftHolders(ContainerShape cs, int deletePosition, IFeatureProvider fp, Diagram diagram){
		
		
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final IGaService gaService = Graphiti.getGaService();
		int i=0;
		
		Anchor sourceAnchor = null;
		Anchor targetAnchor = null;
		for(Shape shape : cs.getChildren()){
			if(PropertyUtil.isSequenceHolder(shape)){
				if(i<deletePosition && !shape.getAnchors().isEmpty()){
					sourceAnchor = shape.getAnchors().get(0);
				}
				if(i>=deletePosition){
					if(targetAnchor == null && !shape.getAnchors().isEmpty()){
						//System.out.println("Target vleguva "+i);
						targetAnchor = shape.getAnchors().get(0);
					}
					
					PropertyUtil.setSequenceOrder(shape, String.valueOf(PropertyUtil.getSequenceOrder(shape)-1));
					shape.getGraphicsAlgorithm().setY(shape.getGraphicsAlgorithm().getY()-280);
				}
				i++;
			}
		}
		ResizeShapeContext context = new ResizeShapeContext(cs);
		context.setSize(cs.getGraphicsAlgorithm().getWidth(), (i)*260+i*10+60);
		context.setLocation(cs.getGraphicsAlgorithm().getX(), cs.getGraphicsAlgorithm().getY());
		IResizeShapeFeature rsf = fp.getResizeShapeFeature(context);
		if (rsf.canExecute(context)) {

			rsf.execute(context);
		}
		
		if(sourceAnchor!=null && targetAnchor!=null){
			Connection connection = peCreateService.createManhattanConnection(diagram);
			Polyline polyline = gaService.createPlainPolyline(connection);
			polyline.setStyle(StyleUtil.getStyleForSequenceHolder(diagram));
			polyline.setLineStyle(LineStyle.SOLID);
			//polyline.setLineWidth(5);
			ConnectionDecorator cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
			createArrow(cd, diagram);
			
			connection.setStart(sourceAnchor);
			connection.setEnd(targetAnchor);
		}
		
	}

	/**
	 * Resize the parent shape recursively. 
	 * 
	 *  After doing this with the {@link AbstractLayoutShapeFeature}, this method is deprecated, but left as backup option.
	 * @param cs the container shape 
	 * @param height the new height
	 * @param fp the feature provider
	 */
	private static void resizeParent(ContainerShape cs, int height, IFeatureProvider fp){
		

		if(cs.eContainer() instanceof Diagram){
			return;
		}else{
			ContainerShape parent = cs.getContainer();
			
			//System.out.println("cs h "+(cs.getGraphicsAlgorithm().getY()+height)+" p h "+parent.getGraphicsAlgorithm().getHeight());
			//System.out.println("height "+height+" y="+cs.getGraphicsAlgorithm().getY());
			if(cs.getGraphicsAlgorithm().getY()+height >= parent.getGraphicsAlgorithm().getHeight()){
				//System.out.println("Zgolemuvam height na "+parent);
				int height2 = cs.getGraphicsAlgorithm().getHeight();
				if(!PropertyUtil.isSequenceHolder(parent)){
					height2 +=60;
				}
				
				//				System.out.println("resizing parent with "+(cs.getGraphicsAlgorithm().getY()+height));
				//				System.out.println("parent is "+fp.getBusinessObjectForPictogramElement(parent));
				//				
				ResizeShapeContext context = new ResizeShapeContext(parent);
				context.setSize(parent.getGraphicsAlgorithm().getWidth(), parent.getGraphicsAlgorithm().getY()+height+60);
				context.setLocation(parent.getGraphicsAlgorithm().getX(), parent.getGraphicsAlgorithm().getY());
				IResizeShapeFeature rsf = fp.getResizeShapeFeature(context);
				if (rsf.canExecute(context)) {
					rsf.execute(context);
				}

				//System.out.println("After resizing "+parent.getGraphicsAlgorithm().getHeight());
				resizeParent(parent, parent.getGraphicsAlgorithm().getHeight(), fp);
			}
		}
	}

	/**
	 * Static method for adding new holder at the end
	 * @param cs the Seqence container shape 
	 * @param diagram the {@link Diagram}
	 * @param fp the feature provider
	 */
	public static void addNewHolder(ContainerShape cs, Diagram diagram, IFeatureProvider fp){

		if(fp.getBusinessObjectForPictogramElement(cs) instanceof Sequence){

			if(PropertyUtil.isSequenceHolder(cs)){
				cs = cs.getContainer();
			}
			
			ContainerShape shape = AddSequenceFeature.addHolder(cs,diagram, fp);
			fp.link(shape, fp.getBusinessObjectForPictogramElement(cs));

		}
	}

	/**
	 * Create arrow for the line that connects two holders.
	 * 
	 * @param gaContainer the line graphics algorithm container
	 * @param diagram the diagram
	 * @return arrow represented as {@link Polyline}
	 */
	private static Polyline createArrow(GraphicsAlgorithmContainer gaContainer, Diagram diagram) {
		IGaService gaService = Graphiti.getGaService();
		Polygon polygon =gaService.createPolygon(gaContainer, new int[] { -10, 5, 0, 0, -10, -5 });
		//polygon.setForeground(manageColor(IColorConstant.BLACK));

		polygon.setStyle(StyleUtil.getStyleForSequenceHolder(diagram));
		polygon.setLineWidth(4);
		//polygon.setBackground(IColorConstant.BLACK);
		polygon.setFilled(true);
		return polygon;
	}

}
