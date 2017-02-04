package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.FlowchartFactory;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;

/**
 * Class for creating model content of type {@link Decision}. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 *
 */
public class CreateDecisionFeature extends AbstractCreateFeature implements ICreateFeature{

	/**
	 * Creates new {@link CreateDecisionFeature}
	 * @param fp the feature provider
	 */
	public CreateDecisionFeature(IFeatureProvider fp) {
		super(fp, "Decision", "Create new Decision");
	}

	/**
	 * Check if the object of a type {@link Decision} can be created
	 * {@link Decision} can be created only inside objects that support composite state creation
	 * 
	 * @param context the context provider
	 * @return true if create is possible.
	 */
	@Override
	public boolean canCreate(ICreateContext context) {

		return BoUtil.canCreateNode(context);
	}

	/**
	 * Create new {@link Decision}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link Decision} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		final Decision newDecision = FlowchartFactory.eINSTANCE.createDecision();

		ContainerShape container = context.getTargetContainer();
		PictogramLink link = container.getLink();

		EList<EObject> bos = link.getBusinessObjects();
		if(!bos.isEmpty()){
			for(EObject bo : bos){
				if(BoUtil.addEObjectToParent(bo, newDecision, container)){
					break;
				}
			}
		}

		// do the add
		addGraphicalRepresentation(context, newDecision);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { newDecision };
	}

	/**
	 * Get the icon for the {@link Decision} from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_IF;
	}

	/**
	 * This method is overridden for the purpose of classifying the create features in the palate.
	 * 
	 * @param context this is the general input for this method
	 * @return true if it is available, false if not
	 */
	@Override
	public boolean isAvailable(IContext context){
		if(context.getProperty(PropertyUtil.PACKAGE_KEY).equals(PropertyUtil.FLOW_CHART_PACKAGE_VALUE)){
			return true;
		}
		return false;
	}
}
