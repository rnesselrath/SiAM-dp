package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.TransitionPropertySource;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

public class ConnectionEditPartToIPropertySourceAdapterFactory implements
		IAdapterFactory {

	public ConnectionEditPartToIPropertySourceAdapterFactory() {
		super();
	}

	public Object getAdapter(Object adaptableObject,
			@SuppressWarnings("rawtypes") Class adapterType) {
		if (IPropertySource.class.equals(adapterType)) {
			if (adaptableObject instanceof GraphitiConnectionEditPart) {
				GraphitiConnectionEditPart editPart = (GraphitiConnectionEditPart) adaptableObject;
				PictogramElement pictogramElement = editPart
						.getPictogramElement();
				Object object = editPart.getFeatureProvider()
						.getBusinessObjectForPictogramElement(pictogramElement);
				if (object instanceof Transition) {
					Dialogue dialogue = null;

					for (EObject bo : editPart.getFeatureProvider()
							.getDiagramTypeProvider().getDiagram().getLink()
							.getBusinessObjects()) {
						if (bo instanceof Dialogue) {
							dialogue = (Dialogue) bo;
						}
					}

					// Holders
					ArrayList<String> sourceState = new ArrayList<>();
					ArrayList<String> targetState = new ArrayList<>();
					EList<EObject> sourceStates = new BasicEList<>();
					EList<EObject> targetStates = new BasicEList<>();

					// Get the source states
					getAllSourceStates(dialogue, sourceState, sourceStates);
					// Get the target states
					getAllTargetStates(dialogue, targetState, targetStates);

					// The names of the source and target states must be in
					// arrays
					String[] sourceStateArr = new String[sourceState.size()];
					String[] targetStateArr = new String[targetState.size()];
					for (int i = 0; i < sourceStateArr.length; i++) {
						sourceStateArr[i] = sourceState.get(i);
					}

					for (int i = 0; i < targetStateArr.length; i++) {
						targetStateArr[i] = targetState.get(i);
					}

					// Return the Transition property page
					return new TransitionPropertySource((Transition) object,
							sourceStateArr, targetStateArr, sourceStates,
							targetStates, editPart.getFeatureProvider());

				}
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}

	/**
	 * Helper function to extract the names and EObjects of all the states that
	 * are candidates to be a source State
	 * 
	 * @param object
	 *            parent object
	 * @param sourceState
	 *            list of names
	 * @param sourceStates
	 *            list of source states
	 */
	private void getAllSourceStates(EObject object,
			ArrayList<String> sourceState, EList<EObject> sourceStates) {
		if (object == null || object.eContents().isEmpty()) {
			return;
		} else {
			for (EObject obj : object.eContents()) {
				getAllSourceStates(obj, sourceState, sourceStates);

				if (obj instanceof SourceState) {
					String name = ((DialogueDesignerElement) obj)
							.getDisplayName();
					if (name == null) {
						name = "";
					}
					sourceState.add(name);
					sourceStates.add(obj);
				}
			}
		}
	}

	/**
	 * Helper function to extract the names and the EObjects of all the states
	 * that are candidates to be a target State
	 * 
	 * @param object
	 *            parent object
	 * @param targetState
	 *            target state names
	 * @param targetStates
	 *            target states
	 */
	private void getAllTargetStates(EObject object,
			ArrayList<String> targetState, EList<EObject> targetStates) {
		if (object == null || object.eContents().isEmpty()) {
			return;
		} else {
			for (EObject obj : object.eContents()) {
				getAllTargetStates(obj, targetState, targetStates);
				if (obj instanceof TargetState) {
					String name = "";

					if (obj instanceof HistoryState) {
						name = ((HistoryState) obj).getId();
					} else {
						name = ((DialogueDesignerElement) obj).getDisplayName();
					}
					if (name == null) {
						name = "";
					}
					targetState.add(name);
					targetStates.add(obj);
				}
			}
		}
	}

}
