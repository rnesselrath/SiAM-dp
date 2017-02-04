package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

public class TransitionReconnectionFeature extends DefaultReconnectionFeature {

	public TransitionReconnectionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canReconnect(IReconnectionContext context) {
		//do not allow to reconnect
		Connection connection = context.getConnection();
		Anchor newAnchor = getNewAnchor(context);
		if((connection != null) && (newAnchor != null) && (connection.getStart() != null) && (connection.getEnd() != null)){
			Object obj = getBusinessObjectForPictogramElement(newAnchor.getParent());
			if(obj instanceof StateChart){
				return false;
			}else if(obj instanceof State){
				return true;
			}
		}
		return false;
	}

	@Override
	public void postReconnect(IReconnectionContext context) {
		Connection connection = context.getConnection();
		Anchor newAnchor = context.getNewAnchor();
		Transition transition = (Transition) getBusinessObjectForPictogramElement(connection);
		State state = (State) getBusinessObjectForPictogramElement(newAnchor.getParent());
		if (context.getReconnectType().equals(ReconnectionContext.RECONNECT_SOURCE)) {
			transition.setSource(state);
		}else{
			transition.setTarget(state);
		}
	}
	
}
