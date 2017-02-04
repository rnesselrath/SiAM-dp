package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.FinalState;

/**
 * The Class {@link MoveFinalStateFeature} that controls the moving of {@link FinalState} objects
 * 
 * @author Dragan Milchevski
 *
 */
public class MoveFinalStateFeature extends DefaultMoveShapeFeature{

	/**
	 * Creates new {@link MoveFinalStateFeature}
	 * @param fp the feature provider
	 */
	public MoveFinalStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return true if moving to negative coordinates should not be possible
	 */
	protected boolean avoidNegativeCoordinates() {
		return true;
	}

	/**
	 * Checks whether the {@link FinalState} objects can be moved an when
	 * 
	 * @param context the context
	 * @return true, if successful
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = super.canMoveShape(context);

		// perform further check only if move allowed by default feature
		//if (canMove) {
		EObject targetBo = context.getTargetContainer().getLink().getBusinessObjects().get(0);
		if( targetBo instanceof AbstractCompositeState){
			//AbstractCompositeState acs = (AbstractCompositeState)targetBo;
			canMove = true;
		}

		//}
		return canMove;
	}

	/**
	 * Post move corrections
	 * 
	 * @param context the moving shape context
	 */
	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		EObject targetBo = context.getTargetContainer().getLink().getBusinessObjects().get(0);

		FinalState finalState = (FinalState) context.getPictogramElement().getLink().getBusinessObjects().get(0);
		if(targetBo instanceof AbstractCompositeState){
			AbstractCompositeState cs = (AbstractCompositeState)targetBo;
			cs.getStates().add(finalState);
		}


		Shape containerShape = context.getShape();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		ContainerShape parentContainer = (ContainerShape) containerShape.eContainer();
		GraphicsAlgorithm parentGa = parentContainer.getGraphicsAlgorithm();

		if(!parentGa.getGraphicsAlgorithmChildren().isEmpty()){
			parentGa = parentGa.getGraphicsAlgorithmChildren().get(0); //If there is a visible rectangle, get the visible then
		}
		
		//Make sure that the shape is not outside of the the parent visible rectangle
		if(containerGa.getX() <= parentGa.getX()+10){
			containerGa.setX(parentGa.getX()+10);
		}
		if(containerGa.getY() <= parentGa.getY()+30){
			containerGa.setY(parentGa.getY()+30);
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
}
