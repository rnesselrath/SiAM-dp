package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * The class ResizeFeature. Used for resizing shapes
 * @author Dragan Milchevski
 *
 */
public class ResizeFeature extends DefaultResizeShapeFeature  {

	/**
	 * Creates new {@link ResizeFeature}
	 * 
	 * @param fp the feature provider
	 */
	public ResizeFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can resize shape.
	 * @param context the context
	 * @return true, if successful
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



		if(PropertyUtil.isThen(context.getPictogramElement()) || PropertyUtil.isElse(context.getPictogramElement()) 
				/*|| PropertyUtil.isSequenceHolder(context.getPictogramElement())*/){
			canResize = false;
		}
		return canResize;

	}

	/**
	 * Resize shape.
	 * 
	 * @param context the context
	 */
	public void resizeShape(IResizeShapeContext context) {

		Shape shape = context.getShape();
		int x = context.getX();
		int y = context.getY();
		int width = context.getWidth();
		int height = context.getHeight();


		//System.out.println("height "+height);

		if (shape.getGraphicsAlgorithm() != null) {
			Graphiti.getGaService().setLocationAndSize(shape.getGraphicsAlgorithm(), x, y, width, height);
		}

		//System.out.println("h2 "+shape.getGraphicsAlgorithm().getHeight());

		
		
		layoutPictogramElement(shape);
		//if(shape instanceof ContainerShape){
		//layoutRecursive((ContainerShape) shape);
		//}

		//layoutPictogramElement(shape);
		EObject bo = (EObject) getBusinessObjectForPictogramElement(shape);
		if(bo instanceof State){
			State state = (State)bo;
			if(state.getOnEntry()!= null){
				EList<ExecutableContent> onEntries = state.getOnEntry();
				for(ExecutableContent onEntry : onEntries){
					for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(onEntry)){
						layoutPictogramElement(pe);
					}
				}


			}
			if(state.getOnExit()!= null){
				EList<ExecutableContent> onExits = state.getOnExit();
				for(ExecutableContent onExit : onExits){
					for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(onExit)){
						layoutPictogramElement(pe);
					}
				}
			}
		}
		if(bo instanceof ExecutableContentNode){
			ExecutableContentNode ecn = (ExecutableContentNode)bo;
			EList<ExecutableContent> onEntries = ecn.getContent();
			for(ExecutableContent onEntry : onEntries){
				for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(onEntry)){
					//layoutPictogramElement(pe);
				}
			}
		}

		if(bo instanceof Sequence){

			Sequence seq = (Sequence)bo;
			EList<Node> nodes = seq.getContent();
			for(Node n : nodes){
				for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(n)){
					//layoutPictogramElement(pe);
				}
			}

		}


		if(bo instanceof DoWhile){

			DoWhile dw = (DoWhile)bo;
			Node node = dw.getBody();

			for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(node)){
				//layoutPictogramElement(pe);
			}
		}

		if(bo instanceof While){

			While dw = (While)bo;
			Node node = dw.getBody();
			//System.out.println("Node "+node);
			//PictogramElement pe = getFeatureProvider().getAllPictogramElementsForBusinessObject(node)[0];
			//layoutPictogramElement(pe);
			for(PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(node)){

				//layoutPictogramElement(pe);
			}

		}


	}


	/**
	 * Layouts shapes recursively. 
	 * First it layouts the current shape, and then recursively layouts all children of the shape
	 * 
	 * @param cs current container shape
	 */
	private void layoutRecursive(ContainerShape cs){
		if(cs.getChildren().isEmpty()){
			return;
		}else{
			for(Shape shape : cs.getChildren()){
				if(shape instanceof ContainerShape){
					ContainerShape chCs = (ContainerShape)shape;
					if(getBusinessObjectForPictogramElement(chCs) != null){
						//System.out.println("Layouting ... "+getBusinessObjectForPictogramElement(chCs));

						//if(getBusinessObjectForPictogramElement(cs) instanceof DoWhile || getBusinessObjectForPictogramElement(cs) instanceof While){
						
						//Set a flag to prevent going into loop
						/*if(PropertyUtil.isElse(chCs)){
							System.out.println("pred Budaloooo "+chCs.getGraphicsAlgorithm().getX());
						}*/
						PropertyUtil.setResizingParent(chCs, "true");
						//if(!PropertyUtil.isElse(chCs) && !PropertyUtil.isThen(chCs)){
							layoutPictogramElement(chCs);
						//}

						//}

//						if(PropertyUtil.isElse(chCs)){
//							System.out.println("posle Budaloooo "+chCs.getGraphicsAlgorithm().getX());
//						}
						layoutRecursive(chCs);

					}
					if(PropertyUtil.isOnExit(chCs) || PropertyUtil.isOnEntry(chCs)
							|| PropertyUtil.isCondEventHolder(chCs)
							|| PropertyUtil.isExecContentHolder(chCs)){
						for(Shape shape2 : chCs.getChildren()){

							layoutPictogramElement(shape2);
						}
					}
					
					
					
					//unset the flag to allow further resizing
					PropertyUtil.setResizingParent(chCs, "false");
				}
			}

		}

	}

}