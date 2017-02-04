package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;

/**
 * The Class {@link MoveDownSeqenceContent} that controls the moving down of objects in  {@link Sequence}
 * 
 * @author Dragan Milchevski
 *
 */
public class MoveDownSeqenceContent extends AbstractCustomFeature{

	/**
	 * Creates new {@link MoveDownSeqenceContent}
	 * @param fp the feature provider
	 */
	public MoveDownSeqenceContent(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks whether the objects children of {@link Sequence} objects can be moved an when
	 * 
	 * @param context the context
	 * @return true, if successful
	 */
	@Override
	public boolean canExecute(ICustomContext context) {
		boolean ret = false;
		
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			for(int i=0; i<pes.length; i++){
				if(PropertyUtil.isSequenceHolder(pes[i])){
					
					ContainerShape parent = ((ContainerShape)pes[i]).getContainer();
					int k=-1;
					for(Shape shape : parent.getChildren()){
						if(PropertyUtil.isSequenceHolder(shape)){
							k++;
						}
					}
					////System.out.println("K ="+k+" cc "+PropertyUtil.getSequenceOrder(pes[i]));
					if((k-1)!=PropertyUtil.getSequenceOrder(pes[i])){
						
						ret = true;
					}
				}
			}
			
		}

		return ret;
	}

	/**
	 * Move the object down for one position.
	 * The moving is an actual swapping of the object bellow and the current object.
	 * 
	 * @param context the custom context
	 */
	@Override
	public void execute(ICustomContext context) {
		for(PictogramElement pe : context.getPictogramElements()){
			if(getBusinessObjectForPictogramElement(pe) instanceof Sequence){
				Sequence seq = (Sequence) getBusinessObjectForPictogramElement(pe);
				int order = PropertyUtil.getSequenceOrder(pe);
				
				if(order != -1){
					
					//Shift the Node in the list
					//First clone the content list
					List<Node> cloneContent = new ArrayList<>();
					for(Node node : seq.getContent()){
						cloneContent.add(node);
					}
					
					//Remove the node and add it again
					Node toMove = cloneContent.get(order);
					cloneContent.remove(order);
					cloneContent.add(order+1, toMove);
					
					//Return it back to the original list
					ECollections.setEList(seq.getContent(), cloneContent);
					cloneContent = null;
					
				
					ContainerShape firstShapeToMove = null;
					ContainerShape secondShapeToMove = null;
					ContainerShape secondShapeParent = null;
					
					if(!((ContainerShape)pe).getChildren().isEmpty()){
						firstShapeToMove = (ContainerShape) ((ContainerShape)pe).getChildren().get(0);
					}
					
					ContainerShape parent = ((ContainerShape)pe).getContainer();
					
					int seqOrder = -1;
					for(Shape shape : parent.getChildren()){
						if(PropertyUtil.isSequenceHolder(shape)){
							seqOrder++;
							if(seqOrder > order){
								
								secondShapeParent = (ContainerShape) shape;
								if(!secondShapeParent.getChildren().isEmpty()){
									secondShapeToMove = (ContainerShape) secondShapeParent.getChildren().get(0);
								}
								break;
							}
							
						}
					}
					
					//move the inner shapes
					firstShapeToMove.setContainer(secondShapeParent);
					secondShapeToMove.setContainer((ContainerShape) pe);
					
					//resize the holders
					secondShapeParent.getGraphicsAlgorithm().setHeight(firstShapeToMove.getGraphicsAlgorithm().getHeight());
					pe.getGraphicsAlgorithm().setHeight(secondShapeToMove.getGraphicsAlgorithm().getHeight());
					
					//Move the second holder to the right position, in case it is smaller than the first
					secondShapeParent.getGraphicsAlgorithm().setY(pe.getGraphicsAlgorithm().getY()+pe.getGraphicsAlgorithm().getHeight()+20);
					
				}
				
				//System.out.println("BO "+getBusinessObjectForPictogramElement((PictogramElement) pe.eContainer()));
				
				//layoutPictogramElement((PictogramElement) pe.eContainer());
			}
		}
		
		
	}

}
