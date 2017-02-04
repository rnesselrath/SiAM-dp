package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;

/**
 * The class {@link DirectEditWhileFeature}. It is use for inline editing names of objects 
 * 
 * @author Dragan Milchevski
 *
 */
public class DirectEditWhileFeature extends AbstractDirectEditingFeature {

	/**
	 * Creates new {@link DirectEditWhileFeature}
	 * @param fp the feature provider
	 */
	public DirectEditWhileFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Framework calls this method to decide which UI to show up.
	 * 
	 * @return the editing type (Text)
	 */
	@Override
	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...

		return TYPE_TEXT;

	}

	/**
	 * Provides the initial value for the opened text editing UI component.
	 * 
	 * @param context the editing context.
	 * @return the initial value
	 */
	@Override
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		While w = (While) getBusinessObjectForPictogramElement(pe);

		if(PropertyUtil.isDisplayText(pe)){
			return w.getDisplayName();
		}

		if(PropertyUtil.isConditionText(pe)){
			
			return w.getCondition();
		}

		//The click is outside the text shape (it is on the pictogram element)
		//In this case find the name only and return it.
		
		return w.getDisplayName();
	}

	/**
	 * Validation of the new string
	 * @param value the value
	 * @param context the context
	 * 
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
		While w = (While) getBusinessObjectForPictogramElement(pe);

		if(PropertyUtil.isDisplayText(pe)){
			w.setDisplayName(value);
		}else if(PropertyUtil.isConditionText(pe)){
			
			w.setCondition(value);
		} else{
			if (pe instanceof ContainerShape) {
				ContainerShape cs = (ContainerShape) pe;
				for (Shape shape : cs.getChildren()) {
					if(PropertyUtil.isDisplayText(shape)){
						if (shape.getGraphicsAlgorithm() instanceof Text) {
							w.setDisplayName(value);
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
