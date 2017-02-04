package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;

public class LayoutExecutableContentFeature extends AbstractLayoutFeature implements ILayoutFeature {

	public LayoutExecutableContentFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && (businessObjects.get(0) instanceof ExecutableContent || businessObjects.get(0) instanceof CondEvent);
	}

	@Override
	public boolean layout(ILayoutContext context) {
		
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		
		//Find the parent container
		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();
		
		if(containerGa.getWidth()!= parentGa.getWidth()){
			containerGa.setWidth(parentGa.getWidth());
			anythingChanged = true;
		}
		
		if(containerGa.getHeight()!= parentGa.getHeight()){
			containerGa.setHeight(parentGa.getHeight());
			anythingChanged = true;
		}
		
		Iterator<Shape> iter = containerShape.getChildren().iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			
			if(graphicsAlgorithm instanceof Text){
				Text text = (Text)graphicsAlgorithm;
				text.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
				text.setY(containerGa.getHeight()/2-10);
			
			}
			if(graphicsAlgorithm instanceof Image){
				Image image = (Image)graphicsAlgorithm;
				image.setY(containerGa.getHeight()/2-8);
			}
		}
		return anythingChanged;
	}

}
