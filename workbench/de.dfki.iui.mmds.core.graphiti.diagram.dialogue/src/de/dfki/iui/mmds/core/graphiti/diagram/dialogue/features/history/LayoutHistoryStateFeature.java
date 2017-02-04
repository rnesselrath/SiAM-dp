package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;

public class LayoutHistoryStateFeature extends AbstractLayoutFeature implements ILayoutFeature{

	private static final int MIN_HEIGHT = 30;
	private static final int MIN_WIDTH = 30;

	public LayoutHistoryStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an State
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof HistoryState;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		// the containerGa is the invisible rectangle
		// containing the visible rectangle as its (first and only) child
		GraphicsAlgorithm rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);

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

		// don't allow changing of the height
		if (containerGa.getHeight() < MIN_HEIGHT || containerGa.getHeight() > MIN_HEIGHT) {
			containerGa.setHeight(MIN_HEIGHT);
			anythingChanged = true;
		}


		// height of visible rectangle (same as invisible rectangle)
		if (rectangle.getHeight() != containerGa.getHeight()) {
			rectangle.setHeight(30);
			anythingChanged = true;
		}

		// Don't allow changing of the width
		if (containerGa.getWidth() < MIN_WIDTH || containerGa.getWidth() > MIN_WIDTH) {
			containerGa.setWidth(MIN_WIDTH);
			anythingChanged = true;
		}


		// width of visible rectangle (smaller than invisible rectangle)
		int rectangleWidth = containerGa.getWidth();

		if (rectangle.getWidth() != rectangleWidth) {
			rectangle.setWidth(30);
			anythingChanged = true;
		}

		int rectangleHeight = containerGa.getHeight();

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

	

		return anythingChanged;
	}

}
