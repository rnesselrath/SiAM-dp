package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.util.FlowchartSwitch;

public class FlowChartSwitch extends FlowchartSwitch<EObject>{
	
	private ContainerShape targetContainer_;
	private IFeatureProvider featureProvider_;
	
	Switch<EObject> getSwitch(ContainerShape targetContainer, EObject object) {
		return SwitchHelper.getSwitch(object, targetContainer, featureProvider_);		
	}
	
	private static Logger getLogger() {
		return Logger.getLogger(FlowChartSwitch.class);
	}
	
	private void handleGeneric(EObject object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		addFeature.add(addContext);
	}
	
	FlowChartSwitch(ContainerShape targetContainer, IFeatureProvider featureProvider) {
		targetContainer_ = targetContainer;	
		featureProvider_ = featureProvider;
	}

	@Override
	public EObject caseSequence(Sequence object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseDecision(Decision object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseDoWhile(DoWhile object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseWhile(While object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseForEach(ForEach object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseWaitForEvent(WaitForEvent object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseExecutableContentNode(ExecutableContentNode object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		if (addFeature!= null && addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
		} else {
			getLogger().error("Cannot add an element to current parent context");
		}
		return object;
	}	
}
