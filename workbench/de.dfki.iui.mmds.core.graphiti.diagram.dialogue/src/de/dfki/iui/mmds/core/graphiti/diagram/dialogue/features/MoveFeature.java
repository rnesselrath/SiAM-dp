package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.ConvertToInitialFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;

/**
 * The class Move Feature. Moves objects on the diagram
 * 
 * @author Dragan Milchevski
 *
 */
public class MoveFeature extends DefaultMoveShapeFeature{

	/**
	 * Creates new {@link MoveFeature}
	 * @param fp the feature provider
	 */
	public MoveFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return true if moving to negative coordinates should not be possible
	 */
	protected boolean avoidNegativeCoordinates() {
		return true;
	}

	/**
	 * Can move shape.
	 * @param context the context
	 * @return true, if successful
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = super.canMoveShape(context);
		GraphicsAlgorithm thisGa = context.getShape().getGraphicsAlgorithm();

		if(context.getTargetContainer().getLink()!=null){
			EList<EObject> targetBos = context.getTargetContainer().getLink().getBusinessObjects();
			if(context.getSourceContainer() != context.getTargetContainer()){
				for(EObject targetBo : targetBos){
					if( targetBo instanceof DialogueDesignerElement){
						if(targetBo instanceof Node){
							canMove = BoUtil.canCreateNodeBusinessObject(targetBo, context.getTargetContainer());
						}else{ //TODO:See if you need further checks
							canMove = true;
						}
					}
				}
			}
		}

		
		//In order not to create a whole new MoveFeature for the If object do the check for then and else containers
		if(PropertyUtil.isThen(context.getPictogramElement()) || PropertyUtil.isElse(context.getPictogramElement()) || PropertyUtil.isSequenceHolder(context.getPictogramElement())){
			canMove = false;
		}

		//Check the relative position of all children of the target container
		for(Shape shape : context.getTargetContainer().getChildren()){
			if(shape instanceof ContainerShape && !shape.equals(context.getShape())){ //It is another object
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();

				//With only two points we can define the area of the shape
				//e.g:  (x,y)
				//        +---------+
				//	      |         |
				//        +---------+
				//              (x1, y1)
				int x  = ga.getX(); //left most x
				int x1 = ga.getX() + ga.getWidth(); //right most x
				int y  = ga.getY(); //left most y
				int y1 = ga.getY() + ga.getHeight(); //right most y

				//If the new position of the moving shape are within one of the children, do not allow moving
				if((context.getX()+thisGa.getWidth())>x && context.getX()<x1 && (context.getY()+thisGa.getHeight())>y && context.getY()<y1){
					canMove = false;
				}

			}
		}
		
		
		return canMove;
	}


	/**
	 * Post move correction
	 * 
	 * @param context the moving shape context
	 */
	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		EObject targetBo = context.getTargetContainer().getLink().getBusinessObjects().get(0);
		EObject sourceBo = context.getSourceContainer().getLink().getBusinessObjects().get(0);

		EObject toAdd = (EObject) context.getPictogramElement().getLink().getBusinessObjects().get(0);
		if(targetBo instanceof Dialogue){
			return;
		}
		if(targetBo instanceof AbstractCompositeState){
			AbstractCompositeState cs = (AbstractCompositeState)targetBo;
			cs.getStates().add((AbstractState) toAdd);
		}
		
		if(targetBo instanceof While){
			While w = (While)targetBo;
			w.setBody((Node) toAdd);
			
		}
		
		if(targetBo instanceof DoWhile){
			DoWhile dw = (DoWhile)targetBo;
			dw.setBody((Node) toAdd);
			
		}
		
		if(targetBo instanceof Sequence){
			//System.out.println("Aloo dodavam??");
			Sequence seq = (Sequence)targetBo;
			seq.getContent().add((Node) toAdd);
			
		}
		
		if(sourceBo instanceof CompositeState && !targetBo.equals(sourceBo)){
			CompositeState cs = (CompositeState)sourceBo;
			//If this is an initial state to the source container, then remove the initial state
			if(cs.getInitialState()!=null && cs.getInitialState().equals(toAdd)){
				cs.setInitialState(null);
				ConvertToInitialFeature.disableInitial((ContainerShape) context.getPictogramElement());

			}
		}

		Shape containerShape = context.getShape();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();

		//If it is on the top most object then don't restrict it to the borders. It should stretch the size of the parent.
		//Otherwise restrict the shape withing the borders of its parent
		if(parentContainer.getLink().getBusinessObjects().size()<2){  

			if(!parentGa.getGraphicsAlgorithmChildren().isEmpty()){
				parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); //If there is a visible rectangle, get the visible then
			}

			//Make sure that the shape is not outside of the the parent visible rectangle
			if(containerGa.getX() <= parentGa.getX()+10){
				containerGa.setX(parentGa.getX()+10);
			}
			
			
			if(containerGa.getY() <= parentGa.getY()+30){
				//TODO: THIS IS TEMPORARY COMMENTED. IF THERE ARE PROBLEMS UNCOMMENT IT!
				//containerGa.setY(parentGa.getY());
			}

			if((containerGa.getX()+containerGa.getWidth()) > (parentGa.getX()+parentGa.getWidth())){
				int x = (parentGa.getX()+parentGa.getWidth())-containerGa.getWidth()-10;
				containerGa.setX(x);
			}

			if((containerGa.getY()+containerGa.getHeight()) > (parentGa.getY()+parentGa.getHeight())){
				int y = (parentGa.getY()+parentGa.getHeight()) - containerGa.getHeight() - 10;
				containerGa.setY(y);
			}
		}
		
		layoutPictogramElement(containerShape);
	}
}
