package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * The Class {@link MoveStateFeature} that controls the moving down of objects in  {@link State}
 * 
 * @author Dragan Milchevski
 *
 */
public class MoveStateFeature extends DefaultMoveShapeFeature{

	/**
	 * Creates new {@link MoveStateFeature}
	 * @param fp the feature provider
	 */
	public MoveStateFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * @return true if moving to negative coordinates should not be possible
	 */
	protected boolean avoidNegativeCoordinates() {
		return true;
	}
	
	/**
	 * Checks whether the {@link State} objects can be moved an when
	 * 
	 * @param context the context
	 * @return true, if successful
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = super.canMoveShape(context);

		// perform further check only if move allowed by default feature
		//if (canMove) {
			Shape shape = context.getShape();
			EObject targetBo = context.getTargetContainer().getLink().getBusinessObjects().get(0);
			if( targetBo instanceof AbstractCompositeState){
				canMove = true;
			}
			
			
		//}
		return canMove;
	}
	
	
	@Override
	protected void preMoveShape(IMoveShapeContext context){
		
	}
	
	/**
	 * Post move corrections
	 * 
	 * @param context the moving shape context
	 */
	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		
		EObject targetBo = context.getTargetContainer().getLink().getBusinessObjects().get(0);
		EObject sourceBo = context.getSourceContainer().getLink().getBusinessObjects().get(0);
		State state = (State) context.getPictogramElement().getLink().getBusinessObjects().get(0);
		if(targetBo instanceof CompositeState){
			CompositeState cs = (CompositeState)targetBo;
			cs.getStates().add(state);
		}
		if(sourceBo instanceof CompositeState && !targetBo.equals(sourceBo)){
			CompositeState cs = (CompositeState)sourceBo;
			//If this is an initial state to the source container, then remove the initial state
			if(cs.getInitialState()!=null && cs.getInitialState().equals(state)){
				cs.setInitialState(null);
				ConvertToInitialFeature.disableInitial((ContainerShape) context.getPictogramElement());
			
			}
		}
	
		Shape containerShape = context.getShape();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		
		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();
		
		if(!parentGa.getGraphicsAlgorithmChildren().isEmpty()){
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); //If there is a visible rectangle, get the visible then
		}
		//System.out.println("W="+containerGa.getWidth()+" H="+containerGa.getHeight()+" P="+parentGa.getWidth()+" PY="+parentGa.getHeight());
		//Make sure that the shape is not outside of the the parent visible rectangle
		if(containerGa.getX() <= parentGa.getX()+10){
			//System.out.println("1");
			containerGa.setX(parentGa.getX()+10);
		}
		if(containerGa.getY() <= parentGa.getY()+30){
			//System.out.println("2");
			containerGa.setY(parentGa.getY()+30);
		}
		
		//System.out.println("Prvo "+(containerGa.getX()+containerGa.getWidth())+" vtoro "+(parentGa.getX()+parentGa.getWidth()));
		if((containerGa.getX()+containerGa.getWidth()) > (parentGa.getX()+parentGa.getWidth())){
			//System.out.println("3");
			int x = (parentGa.getX()+parentGa.getWidth())-containerGa.getWidth()-10;
			containerGa.setX(x);
			
		}
	
		if((containerGa.getY()+containerGa.getHeight()) > (parentGa.getY()+parentGa.getHeight())){
			//System.out.println("4");
			int y = (parentGa.getY()+parentGa.getHeight()) - containerGa.getHeight() - 10;
			containerGa.setY(y);
		}
	}
}
