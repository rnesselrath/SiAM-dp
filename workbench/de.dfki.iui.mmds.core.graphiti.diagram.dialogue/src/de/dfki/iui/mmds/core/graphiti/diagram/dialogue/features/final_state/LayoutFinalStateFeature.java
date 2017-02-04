package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state;

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
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.model.dialogue.statechart.FinalState;

public class LayoutFinalStateFeature extends AbstractLayoutFeature implements ILayoutFeature{

	private static final int MIN_HEIGHT = 30;
	private static final int MIN_WIDTH = 30;

	public LayoutFinalStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an State
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof FinalState;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		// the containerGa is the invisible rectangle
		// containing the visible rectangle as its (first and only) child
		GraphicsAlgorithm ellipse = containerGa.getGraphicsAlgorithmChildren().get(0);

		//Find the parent container
		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();
		if(!parentGa.getGraphicsAlgorithmChildren().isEmpty()){
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); //If there is a visible rectangle, get the visible then
		}

		//Check if this object is a child of the top most object.
		//This does not mean that this is the top most
		//This is used to avoid recomputing of X and Y positions
		boolean onParent = false;
		if(parentContainer.getLink().getBusinessObjects().size()>1){
			onParent = true;
		}

		// height of invisible rectangle
		if (containerGa.getHeight() < MIN_HEIGHT) {
			containerGa.setHeight(MIN_HEIGHT);
			anythingChanged = true;
		}

		// height of visible rectangle (same as invisible rectangle)
		if (ellipse.getHeight() != containerGa.getHeight()) {
			ellipse.setHeight(30);
			anythingChanged = true;
		}

		// width of invisible rectangle
		if (containerGa.getWidth() < MIN_WIDTH) {
			containerGa.setWidth(MIN_WIDTH);
			anythingChanged = true;
		}

		// width of visible rectangle (smaller than invisible rectangle)
		int rectangleWidth = containerGa.getWidth();

		if (ellipse.getWidth() != rectangleWidth) {
			ellipse.setWidth(30);
			anythingChanged = true;
		}

		//Make sure that the shape is not outside of the the parent visible rectangle
		if(containerGa.getX() <= parentGa.getX() && !onParent){
			containerGa.setX(parentGa.getX()+10);
		}
		if(containerGa.getY() <= parentGa.getY()+30 && !onParent){
			containerGa.setY(parentGa.getY()+30);
		}

		if((containerGa.getX()+containerGa.getWidth()) > (parentGa.getX()+parentGa.getWidth()) && !onParent){
			int x = (parentGa.getX()+parentGa.getWidth())-containerGa.getWidth()-10;
			containerGa.setX(x);

		}

		if((containerGa.getY()+containerGa.getHeight()) > (parentGa.getY()+parentGa.getHeight()) && !onParent){
			int y = (parentGa.getY()+parentGa.getHeight()) - containerGa.getHeight() - 10;
			containerGa.setY(y);
		}

		int rectangleHeight = containerGa.getHeight();

		// width of text and line (same as visible rectangle)
		Iterator<Shape> iter = containerShape.getChildren().iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (rectangleWidth != size.getWidth()) {
				if(graphicsAlgorithm instanceof Ellipse){
					Ellipse dot = (Ellipse)graphicsAlgorithm;
					gaService.setLocationAndSize(dot, 7, 7, 16, 16);
				}else{
					gaService.setWidth(graphicsAlgorithm, rectangleWidth);
					anythingChanged = true;
				}

			}
			if(rectangleHeight != size.getHeight()){
				if(graphicsAlgorithm instanceof Ellipse){
					Ellipse dot = (Ellipse)graphicsAlgorithm;
					gaService.setLocationAndSize(dot, 7, 7, 16, 16);
				}else{
					gaService.setHeight(graphicsAlgorithm, rectangleHeight);
					anythingChanged = true;
				}

			}

		}

		return anythingChanged;
	}

}
