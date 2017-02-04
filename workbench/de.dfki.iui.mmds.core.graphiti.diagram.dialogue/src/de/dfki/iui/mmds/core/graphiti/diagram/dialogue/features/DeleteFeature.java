package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMultiDeleteInfo;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ExecutableContentHoldersUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * Override class for DeleteFeature.
 * Mainly it is used to prevent deleting shapes that don't have business object linked
 * or shapes that are used as holders.
 * 
 * @author Dragan Milchevski
 *
 */
public class DeleteFeature extends DefaultDeleteFeature {

	/**
	 * Creates new {@link DeleteFeature}
	 * @param fp the feature provider
	 */
	public DeleteFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks whether deleting is allowed.
	 * 
	 * @param context the context
	 * @return true if deleting is allowed
	 */
	public boolean canDelete(IDeleteContext context) {
		PictogramElement pe = context.getPictogramElement();

		//DO NOT delete shapes without business object or shapes that are suppose to be holders for other shapes
		if(PropertyUtil.isCondEventHolder(pe) || PropertyUtil.isEntryExitHolder(pe) || PropertyUtil.isThen(pe) || PropertyUtil.isElse(pe) 
				|| PropertyUtil.isSequenceHolder(context.getPictogramElement())
				|| getBusinessObjectForPictogramElement(pe)==null){
			return false;
		}else{
			return true;
		}
	}

	/**
	 * Perform the deleting
	 * 
	 * @param context the context
	 * @see
	 * org.eclipse.graphiti.func.IDelete#delete(org.eclipse.graphiti.features
	 * .context.IDeleteContext)
	 */
	public void delete(IDeleteContext context) {
		// we need this reset, since the an instance of this feature can be
		// used multiple times, e.g. as a part of a pattern
		setDoneChanges(false);

		IMultiDeleteInfo multiDeleteInfo = context.getMultiDeleteInfo();
		if (multiDeleteInfo != null && multiDeleteInfo.isDeleteCanceled()) {
			return;
		}
		PictogramElement pe = context.getPictogramElement();
		Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
		if (businessObjectsForPictogramElement != null
				&& businessObjectsForPictogramElement.length > 0) {
			if (multiDeleteInfo == null) {
				if (!getUserDecision(context)) {
					return;
				}
			} else {
				if (multiDeleteInfo.isShowDialog()) {
					boolean okPressed = getUserDecision(context);
					if (okPressed) {
						// don't show further dialogs
						multiDeleteInfo.setShowDialog(false);
					} else {
						multiDeleteInfo.setDeleteCanceled(true);
						return;
					}
				}
			}
		}

		preDelete(context);
		if (pe instanceof CompositeConnection) {
			// Find all domain objects for the children connections of the
			// composite connection...
			List<Object> compositeChildConnectionsBOs = collectCompositeConnectionsBOs((CompositeConnection) pe);
			// ... and add them to the list of BOs to delete (no duplicates)
			for (Object object : businessObjectsForPictogramElement) {
				if (!compositeChildConnectionsBOs.contains(object)) {
					compositeChildConnectionsBOs.add(object);
				}
			}
			// Update BOs to delete
			businessObjectsForPictogramElement = compositeChildConnectionsBOs.toArray(new Object[compositeChildConnectionsBOs.size()]);
		}
		
		deleteSequenceHolder(pe);
		
		IRemoveContext rc = new RemoveContext(pe);
		IFeatureProvider featureProvider = getFeatureProvider();
		IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
		if (removeFeature != null) {
			removeFeature.remove(rc);
			// Bug 347421: Set hasDoneChanges flag only after first modification
			setDoneChanges(true);
		}

		List<Object> filterBOs = new ArrayList<>();
		for (Object object : businessObjectsForPictogramElement) {
			if (!(object instanceof Dialogue)) {
				filterBOs.add(object);
			}
		}

		businessObjectsForPictogramElement = filterBOs.toArray(new Object[filterBOs.size()]);

		deleteBusinessObjects(businessObjectsForPictogramElement);

		
		
		postDelete(context);
	}

	/**
	 * Custom deleting of sequence holders
	 * @param pe the pictogram element
	 */
	private void deleteSequenceHolder(PictogramElement pe){
		
		if(PropertyUtil.isSequenceHolder(((ContainerShape)pe).getContainer())){
			ContainerShape parent = ((ContainerShape)pe).getContainer().getContainer();
			int deletePosition = PropertyUtil.getSequenceOrder(((ContainerShape)pe).getContainer());
			
			IRemoveContext rc = new RemoveContext(((ContainerShape)pe).getContainer());
			IFeatureProvider featureProvider = getFeatureProvider();
			IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
			if (removeFeature != null) {
				removeFeature.remove(rc);
				// Bug 347421: Set hasDoneChanges flag only after first modification
				setDoneChanges(true);
			}
			
			AddSequenceFeature.shiftHolders(parent, deletePosition, getFeatureProvider(), getDiagram());
		}
	}

	/**
	 * Pre Delete
	 * 
	 * @param context the context
	 */
	@Override
	public void preDelete(IDeleteContext context) {

		PictogramElement cs = context.getPictogramElement();

		EObject bo = (EObject) getBusinessObjectForPictogramElement(context
				.getPictogramElement());

		if (bo instanceof ExecutableContent) {
			ExecutableContent ec = (ExecutableContent) bo;
			ContainerShape holderCS = (ContainerShape) cs.eContainer();
			ContainerShape parentCS = (ContainerShape) holderCS.eContainer();

			State state = null;
			ExecutableContentNode ecn = null;

			if (ec.eContainer() instanceof State) {
				state = (State) ec.eContainer();
			}

			if (ec.eContainer() instanceof ExecutableContentNode) {
				ecn = (ExecutableContentNode) ec.eContainer();
			}

			String moreEntryExit = "";
			String moreValue = "";
			int count = 0;
			if (PropertyUtil.isOnEntry(holderCS)) {
				moreEntryExit = PropertyUtil.MORE_ENTRY_VALUE;
				count = state.getOnEntry().size();
			}

			if (PropertyUtil.isOnExit(holderCS)) {
				moreEntryExit = PropertyUtil.MORE_EXIT_VLUE;
				count = state.getOnExit().size();
			}

			if (PropertyUtil.isExecContentHolder(holderCS)) {
				moreEntryExit = PropertyUtil.MORE_ENTRY_VALUE;
				count = ecn.getContent().size();
			}

			count--;

			if (count > 1) {
				moreValue = "+" + (count - 1);
			} else if (count == 1) {
				moreValue = "";
			}

			ExecutableContentHoldersUtil.setMoreShapeTextValue(parentCS,
					moreEntryExit, moreValue);

		}

	}

	/**
	 * Collect the composite connection business objects
	 * @param composite composite connections
	 * @return list of business objects
	 */
	private List<Object> collectCompositeConnectionsBOs(
			CompositeConnection composite) {
		List<Object> result = new ArrayList<Object>();
		for (Connection childConnection : composite.getChildren()) {
			Object[] allBusinessObjectsForChildConnection = getAllBusinessObjectsForPictogramElement(childConnection);
			for (Object object : allBusinessObjectsForChildConnection) {
				if (!result.contains(object)) {
					result.add(object);
				}
			}
		}
		return result;
	}
}
