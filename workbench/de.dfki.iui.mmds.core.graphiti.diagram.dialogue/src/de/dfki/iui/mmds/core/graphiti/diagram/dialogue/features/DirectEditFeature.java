package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;

/**
 * The class {@link DirectEditFeature}. It is use for inline editing names of objects 
 * 
 * @author Dragan Milchevski
 *
 */
public class DirectEditFeature extends AbstractDirectEditingFeature{

	/**
	 * Creates new {@link DirectEditFeature}
	 * @param fp
	 */
	public DirectEditFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Framework calls this method to decide which UI to show up.
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
	 * Provides the initial value for the opened text editing UI component.
	 * 
	 * @param context the editing context.
	 * @return the initial value
	 */
	@Override
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		DialogueDesignerElement dde = (DialogueDesignerElement) getBusinessObjectForPictogramElement(pe);
		return dde.getDisplayName();
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
		if (value.length() < 1)
			return "Please enter any text as display name."; //$NON-NLS-1$
		//if (value.contains(" ")) //$NON-NLS-1$
		//	return "Spaces are not allowed in the display names."; //$NON-NLS-1$
		if (value.contains("\n")) //$NON-NLS-1$
			return "Line breakes are not allowed in display names."; //$NON-NLS-1$

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
		DialogueDesignerElement dde = (DialogueDesignerElement) getBusinessObjectForPictogramElement(pe);
		dde.setDisplayName(value);

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the State
		updatePictogramElement(((Shape) pe).getContainer());
	}


}
