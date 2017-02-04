package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.If;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.dialogue.util.DialogueSwitch;

public class DialogTypeSwitch extends DialogueSwitch<EObject> {

	private final ContainerShape targetContainer_;
	private final IFeatureProvider featureProvider_;

	DialogTypeSwitch(ContainerShape targetContainer, IFeatureProvider featureProvider) {
		targetContainer_ = targetContainer;
		featureProvider_ = featureProvider;
	}

	private static Logger getLogger() {
		return Logger.getLogger(DialogTypeSwitch.class);
	}

	private void handleGeneric(EObject object) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(object);
		addContext.setTargetContainer(targetContainer_);
		IAddFeature addFeature = featureProvider_.getAddFeature(addContext);
		addFeature.add(addContext);
	}

	Switch<EObject> getSwitch(ContainerShape targetContainer, EObject object) {
		return SwitchHelper.getSwitch(object, targetContainer, featureProvider_);
	}

	@Override
	public EObject caseDialogue(Dialogue dialog) {
		if (dialog != null) {
			if (dialog.getContent() != null) {
				Node node = dialog.getContent();
				getSwitch(targetContainer_, node).doSwitch(node);
			}

		}
		return dialog;
	}

	@Override
	public EObject caseRaise(Raise object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseSend(Send object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseLog(Log object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseAssign(Assign object) {
		handleGeneric(object);
		return null;
	}

	@Override
	public EObject caseDelay(Delay object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseIf(If object) {
		handleGeneric(object);
		return null;
	}

	@Override
	public EObject caseCondEvent(CondEvent object) {
		handleGeneric(object);
		return object;
	}

	@Override
	public EObject caseVariable(Variable object) {
		handleGeneric(object);
		return object;
	}

}
