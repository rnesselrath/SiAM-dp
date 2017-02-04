package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.model.dialogue.statechart.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StatechartFactory;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 *  Class for creating model content of type {@link Transition}. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 *
 */
public class CreateTransitionConnectionFeature extends AbstractCreateConnectionFeature {

	/**
	 * Creates new {@link CreateTransitionConnectionFeature}
	 * @param fp the feature provider.
	 */
	public CreateTransitionConnectionFeature(IFeatureProvider fp) {
		super(fp, "Transition", "Creates a new Transition between two Nodes");
	}
	
	/**
	 * Check if the connection can be started
	 * 
	 * @param context the creating context
	 * @return true if the context can be created
	 */
	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// TODO: check for right domain object instance below
		if(getSource(context.getSourceAnchor()) != null){
			return true;
		}
		return false;
	}

	/**
	 * Check if the object can be created.
	 * 
	 * @param context the creating context
	 * @return true if the context can be created
	 */
	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		//PictogramElement sourcePictogramElement = context.getSourcePictogramElement();
		//PictogramElement targetPictogramElement = context.getTargetPictogramElement();
		
		SourceState source = getSource(context.getSourceAnchor());
		TargetState target = getTarget(context.getTargetAnchor());
		if(source != null && target != null){
			return true;
		}
		return false;
		// TODO: check for right domain object instance below
		// if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof <DomainObject> && getBusinessObjectForPictogramElement(targetPictogramElement) instanceof <DomainObject>) {
		//  	return true;
		// }
		
	}
	
	
	/**
	 * Create new {@link Transition}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link Transition} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// TODO: create the domain object connection here
		//Object newDomainObjectConnetion = null;
		SourceState source = getSource(context.getSourceAnchor());
		TargetState target = getTarget(context.getTargetAnchor());
		
		if (source != null && target != null) {
			Transition transition = createTransition(source, target);
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(transition);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}
		
		return newConnection;
	}
	  
	/**
	 * Returns the SourceState belonging to the anchor, or null if not available.  
	 * @param anchor
	 * @return
	 */
	private SourceState getSource(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof SourceState) {
				return (SourceState) obj;
			}
		}
		return null;
	}
	
	/**
	 * Returns the TargetState belonging to the anchor, or null if not available.
	 * @param anchor
	 * @return
	 */
	private TargetState getTarget(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof TargetState) {
				return (TargetState) obj;
			}
		}
		return null;
	}
	
	/**
	 * Creates a EReference between two EClasses.
	 * @param source
	 * @param target
	 * @return
	 */
	private Transition createTransition(SourceState source, TargetState target) {
		Transition transition = StatechartFactory.eINSTANCE.createTransition();
		transition.setDisplayName("new Transition");
		transition.setSource(source);
		transition.setTarget(target);
		return transition;
	}
	
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_TRANSITION;
	}
}
