package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;

public class LayoutingUtil {

	private static final int MIN_HEIGHT = 40;
	private static final int MIN_WIDTH = 180;
	public static final int PADDING = 50;
	public static final int PADDING_WIDTH = 20;
	public static int PADDING_TOP = 30;

	public static boolean layoutCommon(ILayoutContext context, EObject parent) {

		boolean anythingChanged = false;
		boolean hasHolder = false;

		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();

		// Find the parent container
		ContainerShape parentContainer = (ContainerShape) containerShape
				.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();

		if (!parentGa.getGraphicsAlgorithmChildren().isEmpty()) {
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); // If
																		// there
																		// is a
																		// visible
																		// rectangle,
																		// get
																		// the
																		// visible
																		// then
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

		boolean initialVisible = false;
		Iterator<Shape> iter2 = containerShape.getChildren().iterator();
		while (iter2.hasNext()) {
			Shape shape = iter2.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			if (graphicsAlgorithm instanceof Ellipse) {
				initialVisible = shape.isVisible();
			}
		}

		// Find whether the target container has a holder container in order to
		// move the shape down by the Y axis
		Iterator<Shape> iter3 = parentContainer.getChildren().iterator();
		while (iter3.hasNext()) {
			Shape shape = iter3.next();
			if (PropertyUtil.isCondEventHolder(shape)
					|| PropertyUtil.isEntryExitHolder(shape)) {
				hasHolder = true;
			}
		}

		int max_width = parentGa.getWidth();// - PADDING_WIDTH;
		int max_height = parentGa.getHeight();

		// NOT USED now.
		// Find if the object is on the parent diagram
		boolean isParentDiagram = false;
		if (Graphiti.getPeService().getPropertyValue(containerShape,
				"isParentDiagram") != null) {
			isParentDiagram = Boolean.parseBoolean(Graphiti.getPeService()
					.getPropertyValue(containerShape, "isParentDiagram"));
		}

		// Check if the width of the object is higher than the width of the
		// parent.
		if ((containerGa.getX() + containerGa.getWidth()) >= (parentGa.getX() + parentGa
				.getWidth()) && !onParent) {
			int x = (parentGa.getX() + parentGa.getWidth())
					- (containerGa.getWidth() + containerGa.getX());
			if (x < 0)
				x = 0;
			int newWidth = parentGa.getWidth();
			System.out.println("X " + x + " parent width "
					+ parentGa.getWidth() + " current width "
					+ containerGa.getWidth() + " curr x" + containerGa.getX());
			// If the parent can have more children don't stick it to the
			// border, leave some place
			if (BoUtil.canHaveMoreChildren(parent)) {
				newWidth = newWidth - 10;
				x = x + 5;
				System.out.println("Width  " + newWidth + " x " + x);
			}
			Graphiti.getGaService().setLocationAndSize(
					containerShape.getGraphicsAlgorithm(), x,
					containerGa.getY(), newWidth, containerGa.getHeight());
		}

		// Check if the height of the object is higher than the object
		if ((containerGa.getY() + containerGa.getHeight()) > (parentGa.getY() + parentGa
				.getHeight()) && !onParent) {

			int y = (parentGa.getY() + parentGa.getHeight()) - (parentGa.getY() + parentGa.getHeight());
			if (y < 0)
				y = 0;
			int newHeight = parentGa.getHeight();

			if (hasHolder) {
				PADDING_TOP = 70;
				y = PADDING_TOP;

			}
			newHeight = parentGa.getHeight() - PADDING_TOP;

			// If the parent can have more children don't stick it to the
			// border, leave some place
			if (BoUtil.canHaveMoreChildren(parent)) {
				newHeight = newHeight - 10;
			}

			Graphiti.getGaService().setLocationAndSize(containerShape.getGraphicsAlgorithm(), containerGa.getX(),y, containerGa.getWidth(), newHeight);
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
		if (rectangle != null
				&& rectangle.getHeight() != containerGa.getHeight()) {
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
			rectangleWidth = containerGa.getWidth()
					- AddStateChartFeature.INVISIBLE_RECT_LEFT;
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

		//
		if (containerGa.getY() <= parentGa.getY() + PADDING_TOP && !onParent) {
			// System.out.println("RRRR");
			if (PropertyUtil.isThen(parentContainer)
					|| PropertyUtil.isElse(parentContainer)) {
				// System.out.println("BBBBB");
				containerGa.setY(0);
			} else {
				// System.out.println("AAAAAAAAAAA   ");
				containerGa.setY(parentGa.getY() + PADDING_TOP);
			}
		}

		// If the parent is THEN or ELSE container then set the x and y to 0
		if (PropertyUtil.isThen(parentContainer)
				|| PropertyUtil.isElse(parentContainer)) {
			containerGa.setX(0);
			containerGa.setY(0);
			anythingChanged = true;
		}

		return anythingChanged;
	}
}
