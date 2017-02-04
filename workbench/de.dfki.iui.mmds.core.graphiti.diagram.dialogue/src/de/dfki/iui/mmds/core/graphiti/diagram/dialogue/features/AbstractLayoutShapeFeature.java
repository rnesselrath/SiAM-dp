package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;


/**
 * Abstract class for common layout features. 
 * All other classes should extend this one in order not to repeat the common layouting features.
 * 
 * The idea is that most of the shapes have similar layouting. The purpose of this generic class is 
 * to solve most of the layouting problems for all shapes.
 * 
 * @author Dragan Milchevski
 *
 */
public abstract class AbstractLayoutShapeFeature extends AbstractLayoutFeature implements ILayoutFeature{


	private boolean hasHolder;
	private boolean hasFooter;

	private int paddingTop;
	private int paddingBottom;

	protected int rectangleWidth;
	protected int rectangleHeight;
	protected int x;
	protected int y;

	public static int MIN_HEIGHT;
	public static int MIN_WIDTH;
	public static int PADDING;
	public static int PADDING_WIDTH;

	boolean initialVisible;


	/**
	 * Creates a new {@link AbstractLayoutShapeFeature}.
	 *  
	 * @param fp the feature provider
	 */
	public AbstractLayoutShapeFeature(IFeatureProvider fp) {
		super(fp);
		hasHolder = false;
		hasFooter = false;
		paddingTop = 30;
		paddingBottom = 30;
		initialVisible = false;
	}


	/**
	 * General layouting not specific to any object in particular and common for every object
	 * 
	 * @param context the layout context
	 * @return true if anything in the layouting of any shape has changed 
	 * (e.g. the size of a rectangle has changed, position of text, image, etc...)
	 */
	public boolean commonLayout(ILayoutContext context) {

		boolean anythingChanged = false;

		//Get the ContainerShape of the layouting object
		ContainerShape containerShape =(ContainerShape) context.getPictogramElement();

		//Get the parent shape with the graphical algorithm
		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();
		GraphicsAlgorithm parentRectangle = parentContainer.getGraphicsAlgorithm();
		EObject parent = (EObject) getBusinessObjectForPictogramElement(parentContainer);

		//The original positions
		x = containerShape.getGraphicsAlgorithm().getX();
		y = containerShape.getGraphicsAlgorithm().getY();

		//If the context has an initial shape, check if it is visible
		boolean initialVisible = PropertyUtil.isInitialVisible(containerShape);


		//If there is a visible rectangle, get the visible then
		if(!parentGa.getGraphicsAlgorithmChildren().isEmpty()){
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); 
		}

		//Check if this object is a child of the top most object.
		//This does not mean that this is the top most
		//This is used to avoid recomputing of X and Y positions
		boolean onParent = false;
		if(parentContainer.getLink().getBusinessObjects().size()>1){
			onParent = true;
		}

		//NOT USED now.
		//Find if the object is on the parent diagram
		boolean isParentDiagram = PropertyUtil.isParentDiagram(containerShape);

		//Get the graphical algorithm of the layouting context
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		GraphicsAlgorithm rectangle = null;

		//Find the visible and invisible graphical algorithms
		if(!containerGa.isSetLineVisible()){
			rectangle = containerGa;
		}else if(!containerGa.getGraphicsAlgorithmChildren().isEmpty()){
			// containing the visible rectangle as its (first and only) child
			rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);
		}
		// containing the visible rectangle as its (first and only) child
		//		if(!containerGa.getGraphicsAlgorithmChildren().isEmpty()){
		//			rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);
		//		}

		//Find whether the target container has a holder container in order to move the shape down by the Y axis 
		Iterator<Shape> iter3 = parentContainer.getChildren().iterator();
		while(iter3.hasNext()){
			Shape shape = iter3.next();
			if(PropertyUtil.isCondEventHolder(shape) || PropertyUtil.isEntryExitHolder(shape)){
				hasHolder = true;
			}
			if(PropertyUtil.isFooterLine(shape)){
				hasFooter = true;
			}
		}

		//If the context has a holder, move the inner shapes +40 pixels down
		if (hasHolder) {
			paddingTop += 40;
		}

		//If the context has a footer move the inner shapes up 50 pixels
		if(hasFooter){
			paddingBottom = 50;
		}

		//Do not allow going outside the borders
		if(y<paddingTop){
			y = paddingTop;
		}

		if(x<5){
			x = 5;
		}


		//If the parent container is any of the following:
		//"Then" container
		//"Else" container
		//"Sequence" container
		if (PropertyUtil.isThen(parentContainer) || PropertyUtil.isElse(parentContainer) || PropertyUtil.isSequenceHolder(parentContainer)) {
			//Paddings are 0
			paddingTop = 0;
			paddingBottom = 0;

			//This is to allow the width to stretch as the parent shape streches
			if(containerGa.getWidth()<parentGa.getWidth()){
				Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), containerGa.getX(), containerGa.getY(), parentGa.getWidth(), containerGa.getHeight());
			}
		}

		//If the layouting context is any of the following:
		//"Then" container
		//"Else" container
		//"Sequence" container
		if (PropertyUtil.isThen(containerShape) || PropertyUtil.isElse(containerShape) || PropertyUtil.isSequenceHolder(containerShape)) {
			//Then set x and y
			x = 5;
			y = containerShape.getGraphicsAlgorithm().getY();
		}

		//Set the actual positions
		containerShape.getGraphicsAlgorithm().setY(y);
		containerShape.getGraphicsAlgorithm().setX(x);
		

		// height of invisible rectangle
		rectangleHeight =containerGa.getHeight();


		//System.out.println("RESIZING PARENT "+PropertyUtil.isResizingParent(containerShape));
		if(!PropertyUtil.isResizingParent(containerShape)){
			//System.out.println("Resizing na child "+getBusinessObjectForPictogramElement(containerShape)+" parent "+getBusinessObjectForPictogramElement(parentContainer));
			resizeParentsRecursive(containerShape, parentContainer);
		}

		//System.out.println("after parent resizing X "+getBusinessObjectForPictogramElement(containerShape)+" "+containerShape.getGraphicsAlgorithm().getX()+"\n");
		
		//If the parents are objects that have only one child, like While, DoWhile
		//in this case shrink the parent if the child shrinks
		if(getBusinessObjectForPictogramElement(parentContainer) instanceof While || getBusinessObjectForPictogramElement(parentContainer) instanceof DoWhile){
			int newWidth = containerGa.getWidth();
			int newHeight = containerGa.getHeight();

			//if((containerGa.getX()+containerGa.getWidth()+10) < (parentContainer.getGraphicsAlgorithm().getWidth())){
			newWidth = parentContainer.getGraphicsAlgorithm().getWidth()-10;
			//}

			//if((containerGa.getY()+containerGa.getHeight()+heightAddition) < (parentContainer.getGraphicsAlgorithm().getHeight())){
			newHeight = parentContainer.getGraphicsAlgorithm().getHeight()-paddingTop-paddingBottom;
			//}

			x = 5;
			y = paddingTop;

			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), x, y, newWidth, newHeight);
			anythingChanged = true;

		}else{//Else
			//Check if the width of the object is higher than the width of the parent.
			if((containerGa.getX()+containerGa.getWidth()) >= (parentGa.getX()+parentGa.getWidth())  && !onParent && !(parent instanceof Dialogue)){
				//int x = (parentGa.getWidth())-containerGa.getWidth();
				///int x = (parentGa.getX()+parentGa.getWidth())-(containerGa.getWidth()+containerGa.getX());
				if(x<0) {
					x=5;
				}
				int newWidth = parentGa.getWidth();

				if(!PropertyUtil.isThen(parentContainer) && !PropertyUtil.isElse(parentContainer) && !PropertyUtil.isSequenceHolder(parentContainer)){
					newWidth = newWidth - 10;
					x = x+5;
				}

				if (PropertyUtil.isThen(containerShape) || PropertyUtil.isElse(containerShape) || PropertyUtil.isSequenceHolder(containerShape)) {
					x = 5;
					y = containerShape.getGraphicsAlgorithm().getY();
				}


				Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), x, y, newWidth, containerGa.getHeight());
				anythingChanged = true;
			}


			if((containerGa.getY()+containerGa.getHeight()) > (parentGa.getY()+parentGa.getHeight())  && !onParent && !(parent instanceof Dialogue)){

				int y = (parentGa.getY()+parentGa.getHeight()) - (parentGa.getY()+parentGa.getHeight());
				if(y<0) {
					y=0;
				}
				int newHeight = parentGa.getHeight();

				y = y+paddingTop;


				newHeight = parentGa.getHeight() - paddingTop - paddingBottom;


				if(!PropertyUtil.isThen(parentContainer) && !PropertyUtil.isElse(parentContainer) && !PropertyUtil.isSequenceHolder(parentContainer)){
					newHeight = newHeight - 10;
				}

				if (PropertyUtil.isThen(containerShape) || PropertyUtil.isElse(containerShape) || PropertyUtil.isSequenceHolder(containerShape)) {
					x = 0;
					y = containerShape.getGraphicsAlgorithm().getY();

				}


				Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), containerGa.getX(), y, containerGa.getWidth(), newHeight);
				anythingChanged = true;
			}
		}

		//System.out.println("here X "+getBusinessObjectForPictogramElement(containerShape)+" "+containerShape.getGraphicsAlgorithm().getX());

		if (rectangle!= null && rectangle.getHeight() != containerGa.getHeight()) {
			rectangle.setHeight(containerGa.getHeight());
			anythingChanged = true;
		}

		// width of invisible rectangle
		rectangleWidth =containerGa.getWidth();

		//If the initial shape is visible, than reduce the size of the shape 
		if(initialVisible){
			rectangleWidth = containerGa.getWidth() - AddStateChartFeature.INVISIBLE_RECT_LEFT;
		}

		//The width must not be smaller than MIN_WIDTH
		if (containerGa.getWidth() < MIN_WIDTH) {
			rectangleWidth = MIN_WIDTH-2;
			containerGa.setWidth(MIN_WIDTH);
			anythingChanged = true;
		}


		//		if(containerGa.getWidth() >= parentWidht ){
		//			System.out.println("aa");
		//			containerShape.getGraphicsAlgorithm().setWidth(parentWidht);
		//			anythingChanged = true;
		//		}
		//
		//
		//		if (rectangle!= null && rectangle.getWidth() != rectangleWidth) {
		//			rectangle.setWidth(rectangleWidth);
		//			anythingChanged = true;
		//		}

		if (rectangle!= null && rectangle.getWidth() != rectangleWidth) {
			rectangle.setWidth(rectangleWidth);
			anythingChanged = true;
		}

		//Make sure that the shape is not outside of the the parent visible rectangle
		if(containerGa.getX() <= parentGa.getX() && !onParent){
			containerGa.setX(parentGa.getX());
		}

		//
		if(containerGa.getY() <= parentGa.getY()+paddingTop  && !onParent){
			if(PropertyUtil.isThen(parentContainer) || PropertyUtil.isElse(parentContainer) || PropertyUtil.isSequenceHolder(parentContainer)){
				containerGa.setY(0);
			}else{
				containerGa.setY(parentGa.getY()+paddingTop);
			}
		}


		//If the parent is THEN or ELSE container then set the x and y to 0
	

		if(PropertyUtil.isThen(parentContainer) || PropertyUtil.isElse(parentContainer)){
			containerGa.setX(0);
			containerGa.setY(0);
			//System.out.println("w "+containerShape.getGraphicsAlgorithm().getWidth()+" w1="+parentContainer.getGraphicsAlgorithm().getWidth());
			if(containerShape.getGraphicsAlgorithm().getWidth()>parentContainer.getGraphicsAlgorithm().getWidth()){
				
				containerShape.getGraphicsAlgorithm().setWidth(parentContainer.getGraphicsAlgorithm().getWidth());
			}
		}
		if(PropertyUtil.isSequenceHolder(parentContainer)){
			containerGa.setX(0);
			containerGa.setY(0);
		}

			
	
		
		if(PropertyUtil.isThen(containerShape)){
			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), 10, 40, 
					parentContainer.getGraphicsAlgorithm().getWidth()/2-15, parentContainer.getGraphicsAlgorithm().getHeight()-90);
		}else if(PropertyUtil.isElse(containerShape)){
			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), 
					parentContainer.getGraphicsAlgorithm().getWidth()/2, 40, 
					parentContainer.getGraphicsAlgorithm().getWidth()/2-10, parentContainer.getGraphicsAlgorithm().getHeight()-90);
		}
		
		
		if(PropertyUtil.isSequenceHolder(parentContainer)){
			//System.out.println("child Y "+getBusinessObjectForPictogramElement(child)+" "+child.getGraphicsAlgorithm().getY());
			//PropertyUtil.setResizingParent(child, "true");
			int seqParentHeight = shiftSeqHolders(parentContainer.getContainer(), parentContainer, PropertyUtil.getSequenceOrder(parentContainer));

			PropertyUtil.setResizingParent(parentContainer.getContainer(), "true");
			//			resize(parentContainer.getContainer(),  parentContainer.getContainer().getGraphicsAlgorithm().getX(), parentContainer.getContainer().getGraphicsAlgorithm().getY(), 
			//					parentContainer.getContainer().getGraphicsAlgorithm().getWidth(), seqParentHeight);

			//PropertyUtil.setResizingParent(parentContainer.getContainer(), "false");
			//resizeParentsRecursive(parent, parent.getContainer());
			//PropertyUtil.setResizingParent(child, "false");
		}

		
		//resizeChildrenRecursive(containerShape);
		//layoutChildrenRecursive(containerShape);

		return anythingChanged;
	}



	/**
	 * Function used for resizing
	 * 
	 * @param containerShape
	 * @param newX
	 * @param newY
	 * @param newWidth
	 * @param newHeight
	 */
	private void resize(ContainerShape containerShape, int newX, int newY, int newWidth, int newHeight){
		ResizeShapeContext context = new ResizeShapeContext(containerShape);
		context.setSize(newWidth, newHeight);
		context.setLocation(newX, newY);
		IResizeShapeFeature rsf = getFeatureProvider().getResizeShapeFeature(context);
		if (rsf.canExecute(context)) {
			rsf.execute(context);
		}
	}



	/**
	 * Resizing the parent objects recursively.
	 * This function resizes the parent shape if the current shape is bigger in size.
	 * It is especially useful if you want to resize the inner shape, and there is no place because the parrent is too small
	 * 
	 * @param child
	 * @param parent
	 */
	private void resizeParentsRecursive(ContainerShape child, ContainerShape parent){

		boolean anythingChanged = false;
		int newParentWidth = parent.getGraphicsAlgorithm().getWidth();
		int newParentHeight = parent.getGraphicsAlgorithm().getHeight();
		int heightAddition = 0;
		int parentX = parent.getGraphicsAlgorithm().getX();


		if(getBusinessObjectForPictogramElement(child.getContainer()) instanceof Dialogue || getBusinessObjectForPictogramElement(child) instanceof Dialogue){
			return;
		}

		if(hasFooter){
			heightAddition += paddingBottom;
		}

		if(hasHolder){
			//heightAddition += paddingTop;
		}


		if(PropertyUtil.isSequenceHolder(parent)){
			//System.out.println("BB child y "+getBusinessObjectForPictogramElement(child)+" "+child.getGraphicsAlgorithm().getY());
			//System.out.println(PropertyUtil.getSequenceOrder(parent)+ " BB parent X "+parent.getGraphicsAlgorithm().getX());
		}
		//System.out.println("Child "+(child.getGraphicsAlgorithm().getX()+child.getGraphicsAlgorithm().getWidth()));
		//System.out.println("parent "+ (parent.getGraphicsAlgorithm().getWidth()));
		if((child.getGraphicsAlgorithm().getX()+child.getGraphicsAlgorithm().getWidth()) >= (parent.getGraphicsAlgorithm().getWidth())){			
			newParentWidth = child.getGraphicsAlgorithm().getX()+child.getGraphicsAlgorithm().getWidth()+10;
			anythingChanged = true;
		}


		if((child.getGraphicsAlgorithm().getY()+child.getGraphicsAlgorithm().getHeight()+heightAddition) > (parent.getGraphicsAlgorithm().getHeight())){
			newParentHeight = child.getGraphicsAlgorithm().getY()+child.getGraphicsAlgorithm().getHeight()+heightAddition+10;

			if(PropertyUtil.isThen(parent) || PropertyUtil.isElse(parent) || PropertyUtil.isSequenceHolder(parent)){
				newParentHeight = child.getGraphicsAlgorithm().getHeight();
			}

			anythingChanged = true;
		}

		if(getBusinessObjectForPictogramElement(parent) instanceof DoWhile || getBusinessObjectForPictogramElement(parent) instanceof While
				|| getBusinessObjectForPictogramElement(parent) instanceof Sequence){

			//newParentWidth = child.getGraphicsAlgorithm().getX()+child.getGraphicsAlgorithm().getWidth();
			newParentWidth = child.getGraphicsAlgorithm().getX()+child.getGraphicsAlgorithm().getWidth()+10;
			newParentHeight = child.getGraphicsAlgorithm().getY()+child.getGraphicsAlgorithm().getHeight()+heightAddition+5;

			if(getBusinessObjectForPictogramElement(parent) instanceof DoWhile || getBusinessObjectForPictogramElement(parent) instanceof While){
				newParentWidth -=5;
			}


			//newParentHeight = child.getGraphicsAlgorithm().getHeight();\
			anythingChanged = true;
		}


		if(PropertyUtil.isThen(parent) || PropertyUtil.isElse(parent) || PropertyUtil.isSequenceHolder(parent)){
			parentX = 0;
			anythingChanged = true;
		}

		if(PropertyUtil.isSequenceHolder(child)){
			//System.out.println("A ovde vlazis le bee?");
			newParentHeight  = paddingTop+paddingBottom;
			for(Shape shape : parent.getChildren()){
				if(PropertyUtil.isSequenceHolder(shape)){
					//System.out.println("Adding plus "+shape.getGraphicsAlgorithm().getHeight());
					newParentHeight += shape.getGraphicsAlgorithm().getHeight()+20;

				}
			}
			anythingChanged = true;
			
		}



		if(anythingChanged){
			//			if(PropertyUtil.isSequenceHolder(parent))
			//					System.out.println("Before height "+newParentHeight);



			resize(parent,  parentX, parent.getGraphicsAlgorithm().getY(), newParentWidth, newParentHeight);
			//System.out.println("after resizing "+getBusinessObjectForPictogramElement(parent)+" x "+parent.getGraphicsAlgorithm().getWidth());
			//
			//			if (parent.getGraphicsAlgorithm() != null) {
			//				System.out.println("resizing o "+parent.getGraphicsAlgorithm().getWidth()+" n "+newParentWidth);
			//				Graphiti.getGaService().setLocationAndSize(parent.getGraphicsAlgorithm(), parent.getGraphicsAlgorithm().getX(), parent.getGraphicsAlgorithm().getY(),
			//						newParentWidth, newParentHeight);
			//			}



			//			if(PropertyUtil.isSequenceHolder(child))
			//				System.out.println("after height "+newParentHeight);

			int seqParentHeight = -1;
			if(PropertyUtil.isSequenceHolder(parent)){
				//System.out.println("child Y "+getBusinessObjectForPictogramElement(child)+" "+child.getGraphicsAlgorithm().getY());
				//PropertyUtil.setResizingParent(child, "true");
				seqParentHeight = shiftSeqHolders(parent.getContainer(), parent, PropertyUtil.getSequenceOrder(parent));
				//resizeParentsRecursive(parent, parent.getContainer());
				//PropertyUtil.setResizingParent(child, "false");
			}



			if(PropertyUtil.isSequenceHolder(parent)){
				parent = parent.getContainer();
				/*System.out.println("h "+parent.getGraphicsAlgorithm().getHeight());*/
				//parent.getGraphicsAlgorithm().setHeight(seqParentHeight);
				resize(parent, parent.getGraphicsAlgorithm().getX(), parent.getGraphicsAlgorithm().getY(), newParentWidth-5, seqParentHeight);
				//PropertyUtil.setResizingParent(parent, "true");
			}

			if(!(getBusinessObjectForPictogramElement(parent) instanceof DoWhile) && !(getBusinessObjectForPictogramElement(parent) instanceof While)
					&& !(getBusinessObjectForPictogramElement(parent) instanceof Sequence)){
				resizeParentsRecursive(parent, parent.getContainer());
			}
		}

	}


	private int shiftSeqHolders(ContainerShape parent, ContainerShape currentHolder, int from){
		int parentHeight = paddingTop + paddingBottom;
		for(Shape shape : parent.getChildren()){
			if(PropertyUtil.isSequenceHolder(shape)){
				if(PropertyUtil.getSequenceOrder(shape)>from){
					int y = currentHolder.getGraphicsAlgorithm().getY()+currentHolder.getGraphicsAlgorithm().getHeight()+20;
					//System.out.println(PropertyUtil.getSequenceOrder(shape)+" Y "+y+" before "+shape.getGraphicsAlgorithm().getY());
					shape.getGraphicsAlgorithm().setY(y);

				}

				parentHeight += shape.getGraphicsAlgorithm().getHeight()+30;
			}
		}


		//System.out.println(" PHIU "+parentHeight);
		///parent.getGraphicsAlgorithm().setHeight(parentHeight);
		//System.out.println("DALIE? "+PropertyUtil.isSequenceHolder(parent)+" "+getBusinessObjectForPictogramElement(parent)+" "+PropertyUtil.getSequenceOrder(parent));
		//resizeParentsRecursive(currentHolder, parent);
		//  PropertyUtil.setResizingParent(parent.getContainer(), "true");
		//resize(parent, parent.getGraphicsAlgorithm().getX(), parent.getGraphicsAlgorithm().getY(), parent.getGraphicsAlgorithm().getWidth(), parentHeight);
		return parentHeight;
	}

	/**
	 * Layout the inside shapes of a container shape. E.g. for inside shapes are images, text, lines, helper holders, etc..
	 * This function is general that layouts all inside shapes according to the holder.
	 * E.g. When a shape resizes, the line should resize as well
	 * 
	 * @param containerShape
	 * @return
	 */
	public boolean layoutInsideShapes(ContainerShape containerShape){
		boolean anythingChanged = false;

		Iterator<Shape> iter = containerShape.getChildren().iterator();
		while (iter.hasNext()) {

			Shape shape = iter.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size =gaService.calculateSize(graphicsAlgorithm);



			if (containerShape.getGraphicsAlgorithm().getWidth() != size.getWidth()) {
				if (graphicsAlgorithm  instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(containerShape.getGraphicsAlgorithm().getWidth(), secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;

				}  else if(graphicsAlgorithm instanceof Ellipse){
					Ellipse ellipse = (Ellipse) graphicsAlgorithm;
					ellipse.setWidth(20);
					ellipse.setHeight(20);
					ellipse.setX(0);

				} else if(graphicsAlgorithm instanceof Image){
					Image image = (Image)graphicsAlgorithm;
					if(initialVisible){
						image.setX(AddStateChartFeature.INVISIBLE_RECT_LEFT+20);
					}else{
						image.setX(20);
					}

				} else if(graphicsAlgorithm instanceof Text){
//					Text text = (Text)graphicsAlgorithm;
//					text.setWidth(rectangleWidth-2);
//					if(initialVisible){
//						text.setX(AddStateChartFeature.INVISIBLE_RECT_LEFT+1);
//					}else{
//						text.setX(1);
//					}
					Text text = (Text)graphicsAlgorithm;

					if(PropertyUtil.isDisplayText(shape)){
						text.setX(1);
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-2);
					}else if(PropertyUtil.isConditionDescText(shape)){
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-10);
						text.setX(5);
						text.setY(containerShape.getGraphicsAlgorithm().getHeight() - 45);
					}else if(PropertyUtil.isConditionText(shape)){
						text.setX(5);
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-10);
						text.setY(containerShape.getGraphicsAlgorithm().getHeight() - 25);
					}else if(PropertyUtil.isThenText(shape)){
						text.setX(10);
						text.setY(22);
					}else if(PropertyUtil.isElseText(shape)){
						text.setX(containerShape.getGraphicsAlgorithm().getWidth()/2+2);
						text.setY(22);
					}
				} else if(graphicsAlgorithm instanceof RoundedRectangle){
					RoundedRectangle rr = (RoundedRectangle)graphicsAlgorithm;
					if(PropertyUtil.isThen(shape)){
						gaService.setLocationAndSize(rr, 10, 40, containerShape.getGraphicsAlgorithm().getWidth()/2-15, containerShape.getGraphicsAlgorithm().getHeight()-90);
					}else if(PropertyUtil.isElse(shape)){
						gaService.setLocationAndSize(rr, containerShape.getGraphicsAlgorithm().getWidth()/2, 40, containerShape.getGraphicsAlgorithm().getWidth()/2-10, containerShape.getGraphicsAlgorithm().getHeight()-90);
					}
				}

				ExecutableContentHoldersUtil.layoutHolders(shape, graphicsAlgorithm, containerShape.getGraphicsAlgorithm().getWidth(), initialVisible);
			}
			
			if(rectangleHeight != size.getHeight()){
				if (graphicsAlgorithm  instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					
					if(PropertyUtil.isFooterLine(shape)){
						Point firstPoint = polyline.getPoints().get(0);
						Point secondPoint = polyline.getPoints().get(1);
						Point newFirstPoint = gaService.createPoint(firstPoint.getX(), containerShape.getGraphicsAlgorithm().getHeight()-45);
						Point newSecondPoint = gaService.createPoint(secondPoint.getX(), containerShape.getGraphicsAlgorithm().getHeight()-45);
						polyline.getPoints().set(0, newFirstPoint);
						polyline.getPoints().set(1, newSecondPoint);
					}

					anythingChanged = true;
				} else if(graphicsAlgorithm instanceof Text){
					
					Text text = (Text)graphicsAlgorithm;

					if(PropertyUtil.isDisplayText(shape)){
						text.setX(1);
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-2);
					}else if(PropertyUtil.isConditionDescText(shape)){
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-10);
						text.setX(5);
						text.setY(containerShape.getGraphicsAlgorithm().getHeight() - 45);
					}else if(PropertyUtil.isConditionText(shape)){
						text.setX(5);
						text.setWidth(containerShape.getGraphicsAlgorithm().getWidth()-10);
						text.setY(containerShape.getGraphicsAlgorithm().getHeight() - 25);
					}
				}
			}

			if(PropertyUtil.isSequenceHolder(shape)){
				if(shape.getGraphicsAlgorithm() instanceof Rectangle){
					Rectangle rec1 = (Rectangle) shape.getGraphicsAlgorithm();
					int height = 260;
					if(shape instanceof ContainerShape){
						for(Shape s : ((ContainerShape)shape).getChildren()){
							if(getBusinessObjectForPictogramElement(s) instanceof ExecutableContentNode 
									|| getBusinessObjectForPictogramElement(s) instanceof WaitForEvent
									|| getBusinessObjectForPictogramElement(s) instanceof ForEach){
								height = 46;
							}
						}
					}

					//System.out.println("Layouting..");

					if(shape instanceof ContainerShape){
						for(Shape s : ((ContainerShape) shape).getChildren()){
							//if(!PropertyUtil.isResizingParent(shape)){
							PropertyUtil.setResizingParent(s, "true");
							PropertyUtil.setResizingParent(shape.getContainer(), "true");
							layoutPictogramElement(s);
							PropertyUtil.setResizingParent(s, "false");
							PropertyUtil.setResizingParent(shape.getContainer(), "false");
							//}
							height = s.getGraphicsAlgorithm().getHeight();
						}
					}
					gaService.setLocationAndSize(rec1, rec1.getX(), rec1.getY(), rectangleWidth - 10, height);
				}
			}
			
			

		}
		return anythingChanged;
	}
}
