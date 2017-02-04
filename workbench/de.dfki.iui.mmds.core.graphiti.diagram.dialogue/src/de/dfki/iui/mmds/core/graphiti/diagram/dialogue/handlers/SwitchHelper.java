package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class SwitchHelper {
	public static Switch<EObject> getSwitch(EObject object, ContainerShape targetContainer, IFeatureProvider featureProvider) {
		if(object.eClass().getEPackage().getName().contains("flowchart")) 
			return new FlowChartSwitch(targetContainer, featureProvider);
		if(object.eClass().getEPackage().getName().contains("statechart")) 
			return new StateChartSwitch(targetContainer, featureProvider);
		if(object.eClass().getEPackage().getName().contains("dialogue"))
			return new DialogTypeSwitch(targetContainer, featureProvider);
		return null;
	}
}
