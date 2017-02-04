package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import sun.security.provider.certpath.IndexedCollectionCertStore;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.CollapseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.ZestLayoutDiagramFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.FinalState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.ParallelState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;
import de.dfki.iui.mmds.core.model.dialogue.statechart.util.StatechartSwitch;

public class StateChartSwitch extends StatechartSwitch<EObject>{
	private ContainerShape targetContainer_;
	private IFeatureProvider featureProvider_;
	StateChartSwitch(ContainerShape targetContainer, IFeatureProvider featureProvider) {
		targetContainer_ = targetContainer;	
		featureProvider_ = featureProvider;
	}
	
	Switch<EObject> getSwitch(ContainerShape targetContainer, EObject object) {
		return SwitchHelper.getSwitch(object, targetContainer, featureProvider_);		
	}
	
	private static Logger getLogger() {
		return Logger.getLogger(StateChartSwitch.class);
	}
	/**
	 * 
	 * @param object
	 */
	private void handleGeneric(EObject object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		addContext.setLocation(100, 100);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		if (addFeature!= null && addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
		} else {
			getLogger().error("Cannot add an element to current parent context");
		}
	}
	/**
	 * 
	 */
	@Override
	public EObject caseStateChart(StateChart object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		
		if (addFeature!= null && addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
			ContainerShape sShape =  (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(object);
			if(object.getStates() != null) {				
				for(EObject state: object.getStates()) {
					getSwitch(sShape, state).doSwitch(state);
				}
				EList<AbstractState> states = object.getStates();
				for(AbstractState st: states) {
					addTransitions(st);
				}
			}
//			if(object.getVariables() != null) {
//				for(Variable vb : object.getVariables()) {
//					getSwitch(sShape, vb).doSwitch(vb);
//				}
//			}
			addEntryExitFeatures(sShape, object);
		}
		return object;
	}
	/**
	 * 
	 */
	@Override
	public EObject caseState(State object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		addContext.setLocation(100, 100);
		addContext.setWidth(200);
		addContext.setHeight(200);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		if (addFeature!= null && addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
			ContainerShape stateShape =  (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(object);
			addEntryExitFeatures(stateShape, object);		
		} else {
			getLogger().error("Cannot add an element to current parent context");
		}
		
		return object;
	}
	/**
	 * 
	 */
	@Override
	public EObject caseCompositeState(CompositeState object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		addContext.setWidth(600);
		addContext.setHeight(600);
		if (addFeature!= null && addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
			if(object.getStates() != null) {
				ContainerShape sShape =  (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(object);
				for(EObject state: object.getStates()) {
					getSwitch(sShape, state).doSwitch(state);
				}
			}
			ContainerShape stateShape =  (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(object);
			addEntryExitFeatures(stateShape, object);
			Collapser.addShapeToCollapse(stateShape);
		} else {
			getLogger().error("Cannot add an element to current parent context");
		}
		return object;
	}

	@Override
	public EObject caseFinalState(FinalState object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseHistoryState(HistoryState object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseTransition(Transition object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseParallelState(ParallelState object) {
		return caseState(object);
	}
	/**
	 * 
	 * @param object
	 */
	private void addTransitions(EObject object){
		//Only if the object is of instance SourceState since this obect has list of transitions
		if(object instanceof SourceState) {
			SourceState ss = (SourceState)object;
			if(!ss.getTransitions().isEmpty()) {
				EList<Transition> trans = ss.getTransitions();
				for(Transition t : trans){
					SourceState ss1 = t.getSource();
					TargetState ts1 = t.getTarget();
					Anchor sourceAnchor = null;
					Anchor targetAnchor = null;

					ContainerShape targetShape = null;
					ContainerShape sourceShape  = null;

					if(ss1!= null){
						sourceShape = (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(ss1);
					}
					if(ts1 != null){
						targetShape = (ContainerShape) featureProvider_.getPictogramElementForBusinessObject(ts1);
					}
					
					if(sourceShape != null && targetShape != null) {
						if(sourceShape.getContainer() != targetShape.getContainer()) {
							getLogger().debug("Skipping a transition");
							continue;
						}
					}

					if(sourceShape!= null && !sourceShape.getAnchors().isEmpty()){
						sourceAnchor = sourceShape.getAnchors().get(0);
					}

					if(targetShape!= null && !targetShape.getAnchors().isEmpty()){
						targetAnchor = targetShape.getAnchors().get(0);

					}

					if(sourceAnchor != null && targetAnchor != null){
						AddConnectionContext addConContext = new AddConnectionContext(sourceAnchor, targetAnchor);
						addConContext.setTargetContainer(targetContainer_);
						addConContext.setNewObject(t);

						IAddFeature addConFeature = featureProvider_.getAddFeature(addConContext);
						if (addConFeature.canAdd(addConContext)) {
							addConFeature.add(addConContext);
						}
					}
				}
			}
		}
		if(object instanceof AbstractCompositeState){
			AbstractCompositeState acs = (AbstractCompositeState)object;
			if(!acs.getStates().isEmpty()){
				EList<AbstractState> states = acs.getStates();
				for(AbstractState as : states){
					addTransitions(as);
				}
			}
		}
	}
	/**
	 * 
	 * @param parent
	 * @param object
	 */
	private void addEntryExitFeatures(ContainerShape parent, State object) {
		ContainerShape onEntryShape = null;
		ContainerShape onExitShape = null;
		
		EList<Shape> children = parent.getChildren();
		for(Shape s : children) {
			if(s instanceof ContainerShape) {
				if(PropertyUtil.isOnEntry(s))
					onEntryShape = (ContainerShape)s;
				if(PropertyUtil.isOnExit(s))
					onExitShape = (ContainerShape)s;
			}
		}
		
		if(object.getOnEntry()!=null) {
			EList<ExecutableContent> onEntries = object.getOnEntry();
			if(onEntryShape != null)
				for(ExecutableContent e : onEntries) {
					getSwitch(onEntryShape, e).doSwitch(e);
				}
		}
		
		if(object.getOnExit() != null) {
			EList<ExecutableContent> onExit = object.getOnExit();
			if(onExitShape != null)
				for(ExecutableContent e : onExit) {
					getSwitch(onExitShape, e).doSwitch(e);
				}
		}
	}
	
}
