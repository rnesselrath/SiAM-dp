package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.editor.DefaultRefreshBehavior;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;


public class UpdateWhileFeature extends AbstractUpdateFeature{

	public UpdateWhileFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof While);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
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
						//System.out.println("condt "+pictogramCondText);
					}
				}
			}
		}
		
		DefaultRefreshBehavior d;
		// retrieve name from business model
		String businessName = null;
		String businessCondText = null;
		
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (bo instanceof While) {
			While w = (While) bo;
			businessName = w.getDisplayName();
			businessCondText= w.getCondition();
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

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean updated = false;
		String businessName = null;
		String businessCond = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof While) {
			While w = (While) bo;
			businessName = w.getDisplayName();
			businessCond = w.getCondition();
			
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
