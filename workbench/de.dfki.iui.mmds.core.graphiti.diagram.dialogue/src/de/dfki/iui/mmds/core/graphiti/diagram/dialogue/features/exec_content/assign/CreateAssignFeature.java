package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 *  Class for creating model content of type {@link Assign}. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 * Created on: Jun 16, 2013
 *
 */
public class CreateAssignFeature extends AbstractCreateFeature implements ICreateFeature {

	/**
	 * Creates new {@link CreateAssignFeature}
	 * @param fp the feature provider.
	 */
	public CreateAssignFeature(IFeatureProvider fp) {
		super(fp, "Assign", "Create Assign");
	}

	/**
	 * Check if the object can be created.
	 * 
	 * @param context the creating context
	 * @return true if the context can be created
	 */
	@Override
	public boolean canCreate(ICreateContext context) {
		ContainerShape container = context.getTargetContainer();
		ContainerShape parentContainer = container.getContainer();
		if(PropertyUtil.isOnEntry(container) || PropertyUtil.isOnExit(container)
				|| PropertyUtil.isOnEntry(parentContainer) || PropertyUtil.isOnExit(parentContainer)
				|| PropertyUtil.isExecContentHolder(parentContainer)
				|| PropertyUtil.isExecContentHolder(container)
				|| getBusinessObjectForPictogramElement(container) instanceof ExecutableContentNode){
			return true;
		}
		return false;
	}

	/**
	 * Create new {@link Assign}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link Assign} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		final Assign assign = DialogueFactory.eINSTANCE.createAssign();

		ContainerShape container = context.getTargetContainer();

		
		ContainerShape parent = null;		
		if(getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof ExecutableContentNode){//It is of a type ECN
			parent = context.getTargetContainer();
		}else if(!PropertyUtil.isOnEntry(container) && !PropertyUtil.isOnExit(container) && !PropertyUtil.isExecContentHolder(container)){//It is not directly on the holder
			container = container.getContainer();
			parent = (ContainerShape) container.eContainer();
			
		}else{
			parent =  (ContainerShape) container.eContainer();
		}
		
				
		PictogramLink link = null;
		if(parent != null && parent.getLink()!=null){
			link = parent.getLink();
		}

		EList<EObject> bo = link.getBusinessObjects();

		
		if(!bo.isEmpty()){
			
			if (bo.get(0) instanceof State) {
				final State state = (State)bo.get(0);
				if(PropertyUtil.isOnEntry(container)){
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(state);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						public void doExecute() {
							state.getOnEntry().add(assign);
						}
					});

				}else if(PropertyUtil.isOnExit(container)){
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(state);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						public void doExecute() {
							state.getOnExit().add(assign);
						}
					});
				}
			}
			
			
			//If the parent is of a type ExecutableContentNode
			if(bo.get(0) instanceof ExecutableContentNode){
				
				final ExecutableContentNode ecn = (ExecutableContentNode)bo.get(0);
				//if(PropertyUtil.isExecContentHolder(container)){
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ecn);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						public void doExecute() {
							ecn.getContent().add(assign);
						}
					});
				//}
			}
		}
		addGraphicalRepresentation(context, assign);

		return new Object[] { assign };
	}

	/**
	 * Get the icon for the {@link Assign} from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_ASSIGN;
	}

	/**
	 * This method is overridden for the purpose of classifying the create features in the palate.
	 * 
	 * @param context this is the general input for this method
	 * @return true if it is available, false if not
	 */
	@Override
	public boolean isAvailable(IContext context){
		return PropertyUtil.isPackageMessaging(context);
	}

}
