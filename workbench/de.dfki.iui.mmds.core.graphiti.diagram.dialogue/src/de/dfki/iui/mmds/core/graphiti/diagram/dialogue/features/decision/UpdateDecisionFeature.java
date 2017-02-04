package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;

/**
 * The class {@link UpdateDecisionFeature}. Used to update a pictogram element when some changes are done in the object Decision, e.g. editing text.
 * 
 * @author Dragan Milchevski
 *
 */
public class UpdateDecisionFeature extends AbstractUpdateFeature{

	/**
	 * Creates new {@link UpdateDecisionFeature}
	 * @param fp the feature provider
	 */
	public UpdateDecisionFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks whether the values of the current pictogram element of the given context can be updated.
	 * 
	 * @param context the context
	 * @return true if update is possible
	 */
	@Override
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Decision);
	}

	/**
	 * Check whether the values in the pictogram element are up to date, that means whether the graphics algorithm of this pictogram element contain the latest values from the business objects.
	 * 
	 * @param context the context
	 * @return true if parts of the pictogram model needs to be updated with the latest values from the business model
	 */
	@Override
	public IReason updateNeeded(IUpdateContext context) {
		if(PropertyUtil.isThen(context.getPictogramElement()) || PropertyUtil.isElse(context.getPictogramElement())){
			return Reason.createFalseReason();
		}
		// retrieve name from pictogram model
		String pictogramName = null;
		String pictogramCondText = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					if(PropertyUtil.isDisplayText(shape)){
						pictogramName = text.getValue();
					}
					if(PropertyUtil.isConditionText(shape)){
						pictogramCondText = text.getValue();
					}
				}
			}
		}
		
		//DefaultRefreshBehavior d;
		// retrieve name from business model
		String businessName = null;
		String businessCondText = null;
		
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (bo instanceof Decision) {
			Decision decision = (Decision) bo;
			businessName = decision.getDisplayName();
			businessCondText= decision.getCondition();
		}

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName.equals(businessName)));
		boolean updateCondNeeded = ((pictogramCondText == null && businessCondText != null) || (pictogramCondText != null && !pictogramCondText.equals(businessCondText)));
		
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
		}
		if(updateCondNeeded){
			return Reason.createTrueReason("Condition is out of date");
		}
		return Reason.createFalseReason();
		
	}

	/**
	 * Updates the pictogram element. It copies the latest values from the business model to the graphics algorithm of this pictogram elements.
	 * 
	 * @param context the context
	 * @return true, if update process was successful
	 */
	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean updated = false;
		String businessName = null;
		String businessCond = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Decision) {
			Decision decision = (Decision) bo;
			businessName = decision.getDisplayName();
			businessCond = decision.getCondition();
			
		}

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					if(PropertyUtil.isDisplayText(shape)){
						
						text.setValue(businessName);
						updated =  true;
					}
					if(PropertyUtil.isConditionText(shape)){
						text.setValue(businessCond);
						updated =  true;
					}
					
				}
			}
		}

		return updated;
	}

}
