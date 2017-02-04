package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.parallel_state;

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
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.ParallelState;

public class LayoutParallelStateFeature extends AbstractLayoutFeature implements
		ILayoutFeature {

	private static final int MIN_HEIGHT = 40;
	private static final int MIN_WIDTH = 150;
	public static final int PADDING = 50;
	public static final int PADDING_WIDTH = 20;
	public int PADDING_TOP = 30;
	public int PADDING_BOTTOM = 0;

	public LayoutParallelStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an EClass
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof ParallelState;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		boolean hasHolder = false;
		boolean hasFooter = false;

		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();

		// Find the parent container
		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();
		EObject parent = (EObject) getBusinessObjectForPictogramElement(parentContainer);

		if (!parentGa.getGraphicsAlgorithmChildren().isEmpty()) {
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); 
		}

		// Check if this object is a child of the top most object.
		// This does not mean that this is the top most
		// This is used to avoid recomputing of X and Y positions
		boolean onParent = false;
		if (parentContainer.getLink().getBusinessObjects().size() > 1) {
			onParent = true;
		}

		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		// the containerGa is the invisible rectangle

		GraphicsAlgorithm rectangle = null;
		// containing the visible rectangle as its (first and only) child
		if (!containerGa.getGraphicsAlgorithmChildren().isEmpty()) {
			rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);
		}

		boolean initialVisible = PropertyUtil.isInitialVisible(containerShape);

		// Find whether the target container has a holder container in order to
		// move the shape down by the Y axis
		Iterator<Shape> iter3 = parentContainer.getChildren().iterator();
		while (iter3.hasNext()) {
			Shape shape = iter3.next();
			if (PropertyUtil.isCondEventHolder(shape) || PropertyUtil.isEntryExitHolder(shape)) {
				hasHolder = true;
			}
			if(PropertyUtil.isFooterLine(shape)){
				hasFooter = true;
			}
		}

		int max_width = parentGa.getWidth();// - PADDING_WIDTH;
		int max_height = parentGa.getHeight();

		// NOT USED now.
		// Find if the object is on the parent diagram
		boolean isParentDiagram = false;
		if (Graphiti.getPeService().getPropertyValue(containerShape, "isParentDiagram") != null) {
			isParentDiagram = Boolean.parseBoolean(Graphiti.getPeService().getPropertyValue(containerShape, "isParentDiagram"));
		}

		// Check if the width of the object is higher than the width of the
		// parent.
		if ((containerGa.getX() + containerGa.getWidth()) >= (parentGa.getX() + parentGa.getWidth()) && !onParent) {
			int x = (parentGa.getX() + parentGa.getWidth())
					- (containerGa.getWidth() + containerGa.getX());
			if (x < 0)
				x = 0;
			int newWidth = parentGa.getWidth();

			if(!PropertyUtil.isThen(parentContainer) && !PropertyUtil.isElse(parentContainer)){
				newWidth = newWidth - 10;
				x = x+5;
			}
			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), x, containerGa.getY(), newWidth, containerGa.getHeight());
		}

		if (hasHolder) {
			PADDING_TOP = 70;
		}
		
		if(hasFooter){
			PADDING_BOTTOM = 50;
		}
		
		if (PropertyUtil.isThen(parentContainer) || PropertyUtil.isElse(parentContainer)) {
			PADDING_TOP = 0;
		}
		
		// Check if the height of the object is higher than the object
		if ((containerGa.getY() + containerGa.getHeight()) > (parentGa.getY() + parentGa
				.getHeight()) && !onParent) {

			int y = (parentGa.getY() + parentGa.getHeight()) - (parentGa.getY() + parentGa.getHeight());
			if (y < 0) y = 0;
			int newHeight = parentGa.getHeight();

			y = PADDING_TOP;
			newHeight = parentGa.getHeight() - PADDING_TOP - PADDING_BOTTOM;

			if(!PropertyUtil.isThen(parentContainer) && !PropertyUtil.isElse(parentContainer)){
				newHeight = newHeight - 10;
			}

			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), containerGa.getX(), y, containerGa.getWidth(), newHeight);
			anythingChanged = true;
		}

		if (isParentDiagram) {
			containerGa.setHeight(MIN_HEIGHT);
			anythingChanged = true;
		} else {
			// The height must not be smaller than MIN_HEIGHT
			if (containerGa.getHeight() < MIN_HEIGHT) {
				containerGa.setHeight(MIN_HEIGHT);
				anythingChanged = true;
			}
			if (containerGa.getHeight() > max_height) {
				containerGa.setHeight(max_height);
				anythingChanged = true;
			}
		}

		// height of visible rectangle (same as invisible rectangle)
		if (rectangle != null && rectangle.getHeight() != containerGa.getHeight()) {
			rectangle.setHeight(containerGa.getHeight());
			anythingChanged = true;
		}

		// width of invisible rectangle
		int rectangleWidth = containerGa.getWidth();

		if (isParentDiagram) {
			containerGa.setWidth(MIN_WIDTH);
			anythingChanged = true;
		} else {
			// The width must not be smaller than MIN_WIDTH
			if (containerGa.getWidth() < MIN_WIDTH) {
				rectangleWidth = MIN_WIDTH - 2;
				containerGa.setWidth(MIN_WIDTH);
				anythingChanged = true;
			}
			if (containerGa.getWidth() > max_width) {
				// System.out.println("grater than max width");
				rectangleWidth = max_width;
				containerGa.setWidth(max_width);
				anythingChanged = true;
			}
		}

		// If the initial shape is visible, than reduce the size of the shape
		if (initialVisible) {
			rectangleWidth = containerGa.getWidth() - AddStateChartFeature.INVISIBLE_RECT_LEFT;
		}

		// height of visible rectangle (same as invisible rectangle)
		if (rectangle != null && rectangle.getWidth() != rectangleWidth) {
			rectangle.setWidth(rectangleWidth);
			anythingChanged = true;
		}

		// Make sure that the shape is not outside of the the parent visible
		// rectangle
		if (containerGa.getX() <= parentGa.getX() && !onParent) {
			containerGa.setX(parentGa.getX());
		}


		if (containerGa.getY() <= parentGa.getY() + PADDING_TOP && !onParent) {
			if (PropertyUtil.isThen(parentContainer)
					|| PropertyUtil.isElse(parentContainer)) {
				containerGa.setY(0);
			} else {
				containerGa.setY(parentGa.getY() + PADDING_TOP);
			}
		}

		// If the parent is THEN or ELSE container then set the x and y to 0
		if (PropertyUtil.isThen(parentContainer) || PropertyUtil.isElse(parentContainer)) {
			containerGa.setX(0);
			containerGa.setY(0);
			anythingChanged = true;
		}

		// width of text and line (same as visible rectangle)
		Iterator<Shape> iter = containerShape.getChildren().iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (rectangleWidth != size.getWidth()) {
				if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(rectangleWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;
				} else if (graphicsAlgorithm instanceof Ellipse) {
					Ellipse ellipse = (Ellipse) graphicsAlgorithm;
					ellipse.setWidth(20);
					ellipse.setHeight(20);
					ellipse.setX(0);
				} else if (graphicsAlgorithm instanceof Image) {
					Image image = (Image) graphicsAlgorithm;
					if (initialVisible) {
						image.setX(AddParallelStateFeature.INVISIBLE_RECT_LEFT + 10);
					} else {
						image.setX(10);

					}
				} else if (graphicsAlgorithm instanceof Text) {
					Text text = (Text) graphicsAlgorithm;
					text.setWidth(rectangleWidth - 2);
					if (initialVisible) {
						text.setX(AddParallelStateFeature.INVISIBLE_RECT_LEFT + 1);
					} else {
						text.setX(1);

					}
				}

				ExecutableContentHoldersUtil.layoutHolders(shape,
						graphicsAlgorithm, rectangleWidth, initialVisible);
				
			}
		}

		return anythingChanged;
	}

}