package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class UpdateStateChartFeature extends AbstractUpdateFeature {

	public UpdateStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is an StateChart
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof StateChart);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		boolean isInitialVisible = false;
		ArrayList<AbstractState> pictogramStates = new ArrayList<>();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					pictogramName = text.getValue();
				}
				if(shape.getGraphicsAlgorithm() instanceof Ellipse){
					
					isInitialVisible = shape.isVisible();
				}
				Object bo = getBusinessObjectForPictogramElement(shape);
				//System.out.println("BOOO "+bo);
				if(bo instanceof AbstractState){
					if(getBusinessObjectForPictogramElement(pictogramElement) != (AbstractState) bo){
						pictogramStates.add((AbstractState) bo);
					}
				}
			}
		}
		
		//System.out.println(pictogramStates.size()+ " pic states "+pictogramStates);
		EList<AbstractState> businessStates = null;
		// retrieve name from business model
		String businessName = null;
		State initialBusinessState = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof StateChart) {
			StateChart stateChart = (StateChart) bo;
			businessName = stateChart.getDisplayName();
			businessStates = stateChart.getStates();
			initialBusinessState = stateChart.getInitialState();
			//System.out.println(businessStates.size()+ " buss states "+businessStates);
		}
		
		/*if(businessStates.size() != pictogramStates.size()){
			return Reason.createTrueReason("State is deleted from the State Chart");
		}*/
		/*if(initialBusinessState != null && isInitialVisible == false){
			return Reason.createTrueReason();
		}*/
		
		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName.equals(businessName)));
		if (updateNameNeeded) {
			/*if(pictogramElement.eContainer() instanceof Diagram){
				return Reason.createFalseReason();
			}else {*/
				return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
			//}
		}else {
			return Reason.createFalseReason();
		}
	
	}

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof StateChart) {
			StateChart stateChart = (StateChart) bo;
			businessName = stateChart.getDisplayName();
		}

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					text.setValue(businessName);
					return true;
				}
			}
		}

		return false;
	}

}
