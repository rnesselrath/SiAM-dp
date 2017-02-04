package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;

/**
 * The class {@link DirectEditDecisionFeature}
 * 
 * @author Dragan Milchevski
 *
 */
public class DirectEditDecisionFeature extends AbstractDirectEditingFeature {

	/**
	 * Creates new {@link DirectEditDecisionFeature}
	 * 
	 * @param fp the feature provider
	 */
	public DirectEditDecisionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Returns an editing type.
	 * 
	 * @return the editing type
	 */
	@Override
	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...

		return TYPE_TEXT;

	}

	/**
	 * Get the initial value of the class.
	 * 
	 * @param context the editing context
	 */
	@Override
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Decision decision = (Decision) getBusinessObjectForPictogramElement(pe);

		if(PropertyUtil.isDisplayText(pe)){
			return decision.getDisplayName();
		}

		if(PropertyUtil.isConditionText(pe)){
			
			return decision.getCondition();
		}

		//The click is outside the text shape (it is on the pictogram element)
		//In this case find the name only and return it.
		
		return decision.getDisplayName();
	}

	/**
	 * Validation of the new string.
	 * 
	 * @param value the value
	 * @param context the context
	 * @return null if value is okay and could be set; any text means value is not valid; text is reason for invalidality
	 */
	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if(PropertyUtil.isDisplayText(context.getPictogramElement())){
			if (value.length() < 1)
				return "Please enter any text as display name."; //$NON-NLS-1$
//			if (value.contains(" ")) //$NON-NLS-1$
//				return "Spaces are not allowed in the display names."; //$NON-NLS-1$
			if (value.contains("\n")) //$NON-NLS-1$
				return "Line breakes are not allowed in display names."; //$NON-NLS-1$
		}
		// null means, that the value is valid
		return null;
	}

	/**
	 * Set the new value to the business object.
	 * 
	 * @param value the value
	 * @param context the context
	 */
	public void setValue(String value, IDirectEditingContext context) {
		// set the new name for the State
		PictogramElement pe = context.getPictogramElement();
		Decision decision = (Decision) getBusinessObjectForPictogramElement(pe);

		if(PropertyUtil.isDisplayText(pe)){
			decision.setDisplayName(value);
		}else if(PropertyUtil.isConditionText(pe)){
			
			decision.setCondition(value);
		} else{
			if (pe instanceof ContainerShape) {
				ContainerShape cs = (ContainerShape) pe;
				for (Shape shape : cs.getChildren()) {
					if(PropertyUtil.isDisplayText(shape)){
						if (shape.getGraphicsAlgorithm() instanceof Text) {
							decision.setDisplayName(value);
						}
					}
				}
			}
		}


		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the State
		updatePictogramElement(((Shape) pe).getContainer());
	}
}
