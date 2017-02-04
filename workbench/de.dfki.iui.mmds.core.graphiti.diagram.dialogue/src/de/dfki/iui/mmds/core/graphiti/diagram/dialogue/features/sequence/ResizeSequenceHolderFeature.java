package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;

/**
 * The class {@link ResizeSequenceHolderFeature} that controls the resizing of the {@link Sequence} holders
 * 
 * @author Dragan Milchevski
 *
 */
public class ResizeSequenceHolderFeature extends DefaultResizeShapeFeature{

	/**
	 * Creates new {@link ResizeSequenceHolderFeature}
	 * @param fp the feature provider
	 */
	public ResizeSequenceHolderFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks whether the holders can be resized
	 * 
	 * @param context the resizing context
	 * @return true if the resizing is allowed
	 */
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		boolean canResize = true; //super.canResizeShape(context);

		// perform further check only if move allowed by default feature
		if (canResize) {
			if(PropertyUtil.isCollapsed(context.getPictogramElement())){
				canResize = false;
			}
		}
		
		return canResize;

	}

	/**
	 * Do the actual resizing
	 * 
	 * @param context the resizing context
	 */
	public void resizeShape(IResizeShapeContext context) {
		
		Shape shape = context.getShape();
		int x = context.getX();
		int y = context.getY();
		int width = context.getWidth();
		int height = context.getHeight();
		

		if (shape.getGraphicsAlgorithm() != null) {
			Graphiti.getGaService().setLocationAndSize(shape.getGraphicsAlgorithm(), x, y, width, height);
		}

		PropertyUtil.setResizingParent(shape, "true");
		
		layoutPictogramElement(shape);
		EObject bo = (EObject) getBusinessObjectForPictogramElement(shape);
		
		
		if(bo instanceof Sequence){
			
			Sequence seq = (Sequence)bo;
			EList<Node> nodes = seq.getContent();
			for(Node n : nodes){
				for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(n)){
					//layoutPictogramElement(pe);
				}
			}
			
		}
		
		PropertyUtil.setResizingParent(shape, "false");
	}

}
