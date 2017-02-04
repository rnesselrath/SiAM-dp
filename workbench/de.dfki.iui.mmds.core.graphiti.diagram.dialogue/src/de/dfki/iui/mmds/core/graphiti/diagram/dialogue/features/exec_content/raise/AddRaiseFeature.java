package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.raise;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;

/**
 * Adding {@link Raise} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link Raise} object.
 * 
 * @author Dragan Milchevski
 * Created on: Jun 16, 2013
 *
 */
public class AddRaiseFeature extends AbstractAddFeature implements IAddFeature {

	/**
	 * Creates new {@link AddRaiseFeature}
	 * @param fp the feature provider
	 */
	public AddRaiseFeature(IFeatureProvider fp) {
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
		if(context.getNewObject() instanceof ExecutableContent){
			ContainerShape container = context.getTargetContainer();
			ContainerShape parentContainer = container.getContainer();
			if(PropertyUtil.isOnEntry(container) || PropertyUtil.isOnExit(container)
					|| PropertyUtil.isOnEntry(parentContainer) || PropertyUtil.isOnExit(parentContainer)
					|| PropertyUtil.isExecContentHolder(parentContainer)
					|| PropertyUtil.isExecContentHolder(container)
					|| getBusinessObjectForPictogramElement(container) instanceof ExecutableContentNode){
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
		final Raise addedRaise = (Raise) context.getNewObject();

		ContainerShape targetContainer = context.getTargetContainer();
		if(!PropertyUtil.isOnEntry(targetContainer) && !PropertyUtil.isOnExit(targetContainer) && !PropertyUtil.isExecContentHolder(targetContainer)){
			targetContainer = targetContainer.getContainer();
		}
		
		//Find the target Exec Content Holder if the BO is of a type ExecutableContentNode
		if(getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof ExecutableContentNode){
				for(Shape shape : context.getTargetContainer().getChildren()){
					if(shape instanceof ContainerShape && PropertyUtil.isExecContentHolder(shape)){
						targetContainer = (ContainerShape) shape;
					}
				}
		
		}	
		
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		//Set a property that this shape is a part of the StateChart package
		PropertyUtil.setPackage(containerShape, PropertyUtil.MESSAGING_PACKAGE_VALUE);

		int width =  targetContainer.getGraphicsAlgorithm().getWidth();
		int height = 18;//targetContainer.getGraphicsAlgorithm().getHeight();
		int y = 0;
		IGaService gaService = Graphiti.getGaService();
		
		ContainerShape parent = (ContainerShape) targetContainer.eContainer();
		PictogramLink link = parent.getLink();

		EList<EObject> bo = link.getBusinessObjects();
	
		// Find the y of the new shape
		//If the parent state have more than one onEntry/onExit executable contents, than the Y 
		//mutlplied by the number of onEntry/onExit executable contents
		if(!bo.isEmpty()){
			ExecutableContentHoldersUtil.setMoreText(bo.get(0), targetContainer, parent);
		}
		
		y = 0; //remove this if you want to simulate stack layout
		
		Rectangle rectangle;
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			rectangle = gaService.createRectangle(containerShape);
			gaService.setLocationAndSize(rectangle, 0, y, width, height );
			rectangle.setStyle(StyleUtil.getStyleForEntry(getDiagram()));
			rectangle.setFilled(true);
			// create link and wire it
			link(containerShape, addedRaise);
		}
		{ //SHAPE WITH IMAGE
			Shape shape = peCreateService.createShape(containerShape, false);
			Image image = gaService.createImage(shape, DialogueImageProvider.IMG_RAISE);

			// calculate position for icon
			int iconWidthAndHeight = 16;

			gaService.setLocationAndSize(image, 5, 1, iconWidthAndHeight, iconWidthAndHeight);
		}
		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);


			// create and set text graphics algorithm
			Text text = gaService.createPlainText(shape, "Raise");
			text.setStyle(StyleUtil.getStyleForStateText(getDiagram()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFilled(false);
			gaService.setLocationAndSize(text, 25,0, width-20, 20);

			
		}
		layoutPictogramElement(containerShape);
		return containerShape;
	}

}
