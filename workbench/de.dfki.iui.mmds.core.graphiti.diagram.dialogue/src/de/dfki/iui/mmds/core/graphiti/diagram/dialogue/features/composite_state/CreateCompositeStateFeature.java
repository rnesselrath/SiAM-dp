package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StatechartFactory;

/**
 * Class for creating model content of type CompositeState. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 *
 */
public class CreateCompositeStateFeature extends AbstractCreateFeature implements ICreateFeature{

	/**
	 * Creates new {@link CreateCompositeStateFeature}
	 * @param fp the feature provider
	 */
	public CreateCompositeStateFeature(IFeatureProvider fp) {
		super(fp, "Composite State", "Create new Composite State");
	}

	/**
	 * Check if the object of a type Composite State can be created
	 * Composite state can be created only inside objects that support composite state creation
	 * 
	 * @param context the context provider
	 * @return true if create is possible.
	 */
	@Override
	public boolean canCreate(ICreateContext context) {
		// Added to handle extended Drag & Drop features
		if (context.getProperty("container") instanceof AbstractCompositeState) {
			return true;
		}	
		ContainerShape container = context.getTargetContainer();
		PictogramLink link = container.getLink();


		if(link != null && !link.getBusinessObjects().isEmpty()){
			EList<EObject> bo = link.getBusinessObjects();
			if (bo.get(0) instanceof AbstractCompositeState) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Create new CompositeState. First get the container shape of the target object
	 * and check if is of the allowed instances create the CompositeState inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		CompositeState newCompositeState = StatechartFactory.eINSTANCE.createCompositeState();
		
		
		ContainerShape container = context.getTargetContainer();
		PictogramLink link = container.getLink();
		
		EList<EObject> bo = link.getBusinessObjects();
		if(!bo.isEmpty()){
			if (bo.get(0) instanceof AbstractCompositeState) {
				AbstractCompositeState parent = (AbstractCompositeState)bo.get(0);
				parent.getStates().add(newCompositeState);
			}
		}
		addGraphicalRepresentation(context, newCompositeState);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { newCompositeState };
	}

	/**
	 * Get the icon for the CompositeState from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_COMPOSITE_STATE;
	}
	
	/**
	 * This method is overridden for the purpose of classifying the create features in the palate.
	 * 
	 * @param context this is the general input for this method
	 * @return true if it is available, false if not
	 */
	@Override
	public boolean isAvailable(IContext context){
		if(context.getProperty(PropertyUtil.PACKAGE_KEY).equals(PropertyUtil.STATE_CHART_PACKAGE_VALUE)){
			return true;
		}
		return false;
	}
}
