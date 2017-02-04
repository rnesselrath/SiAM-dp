package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.condevent;

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
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;

/**
 * Class for creating model content of type {@link CondEvent}. The appropriate pictogram content is added by the add feature.
 *  
 * @author Dragan Milchevski
 *
 */
public class CreateCondEvent extends AbstractCreateFeature implements ICreateFeature {

	/**
	 * Creates new {@link CreateCondEvent}
	 * @param fp the pictogram element
	 */
	public CreateCondEvent(IFeatureProvider fp) {
		super(fp, "CondEvent", "Create CondEvent");
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
		
		if(PropertyUtil.isCondEventHolder(container)|| PropertyUtil.isCondEventHolder(parentContainer) 
				|| getBusinessObjectForPictogramElement(container) instanceof WaitForEvent || getBusinessObjectForPictogramElement(parentContainer) instanceof WaitForEvent){
			
			EObject bo = (EObject) getBusinessObjectForPictogramElement(container);
			
			
			if(!(bo instanceof WaitForEvent)){
				bo = (EObject)getBusinessObjectForPictogramElement(parentContainer);
			}
			if(bo instanceof WaitForEvent){
				if(((WaitForEvent) bo).getEvent()==null){
					return true;
				}
			}
			
		}
		return false;
	}
	
	/**
	 * Create new {@link CondEvent}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link CondEvent} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		final CondEvent condEvent = DialogueFactory.eINSTANCE.createCondEvent();

		ContainerShape container = context.getTargetContainer();

		
		ContainerShape parent = null;		
		if(getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof WaitForEvent){//It is of a type ECN
			parent = context.getTargetContainer();
		}else if(!(PropertyUtil.isCondEventHolder(container))){//It is not directly on the holder
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
			
			//If the parent is of a type WaitForEvent
			if(bo.get(0) instanceof WaitForEvent){
				
				final WaitForEvent wfe = (WaitForEvent)bo.get(0);
				//if(PropertyUtil.isExecContentHolder(container)){
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(wfe);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						public void doExecute() {
							wfe.setEvent(condEvent);
						}
					});
				//}
			}
		}
		addGraphicalRepresentation(context, condEvent);

		return new Object[] { condEvent };
	}

	/**
	 * Get the icon for the Log from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_COND_EVENT;
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
