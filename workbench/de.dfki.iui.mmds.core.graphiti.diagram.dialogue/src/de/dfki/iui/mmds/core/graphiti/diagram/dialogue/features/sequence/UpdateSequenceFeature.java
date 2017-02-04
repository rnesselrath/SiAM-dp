package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence;

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
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;

/**
 * The class {@link UpdateSequenceFeature}. Used to update a pictogram element when some changes are done in the object {@link Sequence}, e.g. editing text.
 * 
 * @author Dragan Milchevski
 *
 */
public class UpdateSequenceFeature extends AbstractUpdateFeature {

	/**
	 * Creates new {@link UpdateSequenceFeature}
	 * @param fp the feature provider
	 */
	public UpdateSequenceFeature(IFeatureProvider fp) {
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
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof Sequence);
	}

	/**
	 * Check whether the values in the pictogram element are up to date, that means whether the graphics algorithm of this pictogram element contain the latest values from the business objects.
	 * 
	 * @param context the context
	 * @return true if parts of the pictogram model needs to be updated with the latest values from the business model
	 */
	@Override
	public IReason updateNeeded(IUpdateContext context) {
		
		if(PropertyUtil.isSequenceHolder(context.getPictogramElement())){
			return Reason.createFalseReason();
		}
		
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (PropertyUtil.isDisplayText(shape)) {
					if (shape.getGraphicsAlgorithm() instanceof Text) {
						Text text = (Text) shape.getGraphicsAlgorithm();
						pictogramName = text.getValue();

					}
				}
			}
		}

		DefaultRefreshBehavior d;
		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (bo instanceof DialogueDesignerElement) {
			DialogueDesignerElement dde = (DialogueDesignerElement) bo;
			businessName = dde.getDisplayName();
		}

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
		} else {
			return Reason.createFalseReason();
		}
	}

	/**
	 * Updates the pictogram element. It copies the latest values from the business model to the graphics algorithm of this pictogram elements.
	 * 
	 * @param context the context
	 * @return true, if update process was successfull
	 */
	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof DialogueDesignerElement) {
			DialogueDesignerElement dde = (DialogueDesignerElement) bo;
			businessName = dde.getDisplayName();
		}

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					if (PropertyUtil.isDisplayText(shape)) {
						text.setValue(businessName);
					}
					return true;
				}
			}
		}

		return false;
	}

}
