package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

public class UpdateTransitionFeature extends AbstractUpdateFeature{

	public UpdateTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is an StateChart
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Transition);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		SourceState sourceState = null;
		TargetState targetState = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof Connection) {
			Connection connection = (Connection) pictogramElement;
			for(ConnectionDecorator cd : connection.getConnectionDecorators()){
				if(cd.getGraphicsAlgorithm() instanceof Text){
					Text text = (Text) cd.getGraphicsAlgorithm();
					pictogramName = text.getValue();
				}
			}
			
			//System.out.println("properties "+context.getPropertyKeys());
			Anchor startAnchor = connection.getStart();
			Anchor endAnchor = connection.getEnd();
			if(getBusinessObjectForPictogramElement(startAnchor.getParent()) instanceof SourceState){
				sourceState = (SourceState) getBusinessObjectForPictogramElement(startAnchor.getParent());
			}
			if(getBusinessObjectForPictogramElement(endAnchor.getParent()) instanceof TargetState){
				targetState = (TargetState) getBusinessObjectForPictogramElement(endAnchor.getParent());
			}
			//System.out.println(" pic source "+sourceState);
			//System.out.println("pictogramName "+pictogramName);
			
		}
		
		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		SourceState businessSourceState = null;
		TargetState businessTargetState = null;
		if (bo instanceof Transition) {
			Transition transition = (Transition) bo;
			businessName = transition.getDisplayName();
			businessSourceState = transition.getSource();
			businessTargetState = transition.getTarget();
			//System.out.println("transition "+transition);
			//System.out.println(" source "+transition.getSource());
		}

		
		// update needed, if names are different
		boolean updateNameNeeded = false;
		if((pictogramName == null && businessName != null)){
			updateNameNeeded = true;
		}
		
		if((pictogramName != null && businessName != null && !pictogramName.substring(1, pictogramName.length()-1).equals(businessName))){
			updateNameNeeded = true;
		}
		
		
		boolean updateSourceNeeded = false;
		if(sourceState == null && businessSourceState != null) {
			updateSourceNeeded = true;
		}
		
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
		} else if(updateSourceNeeded){
			return Reason.createTrueReason("Source state is out of date"); //$NON-NLS-1$
		}else{
			return Reason.createFalseReason();
		}
		
	}

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Transition) {
			Transition transition = (Transition) bo;
			businessName = transition.getDisplayName();
		}
		
		if (pictogramElement instanceof Connection) {
			for(ConnectionDecorator cd : ((Connection) pictogramElement).getConnectionDecorators()){
				if(cd.getGraphicsAlgorithm() instanceof Text){
					Text text = (Text) cd.getGraphicsAlgorithm();
					text.setValue(businessName);
					return true;
				}
			}
		}

		return false;
	}

}
