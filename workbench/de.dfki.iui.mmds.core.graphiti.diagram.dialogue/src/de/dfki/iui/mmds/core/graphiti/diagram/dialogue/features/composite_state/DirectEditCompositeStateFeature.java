package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * The class {@link DirectEditCompositeStateFeature}
 * @author Dragan Milchevski
 *
 */
public class DirectEditCompositeStateFeature extends AbstractDirectEditingFeature{

	/**
	 * Creates new {@link DirectEditCompositeStateFeature}
	 * @param fp the feature provider
	 */
	public DirectEditCompositeStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Returns an editing type
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
		// return the current name of the State
		PictogramElement pe = context.getPictogramElement();
		CompositeState compositeState = (CompositeState) getBusinessObjectForPictogramElement(pe);
		return compositeState.getDisplayName();
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
		if (value.length() < 1)
			return "Please enter any text as Composite State name."; //$NON-NLS-1$
		//		if (value.contains(" ")) //$NON-NLS-1$
		//			return "Spaces are not allowed in Composite State names."; //$NON-NLS-1$
		if (value.contains("\n")) //$NON-NLS-1$
			return "Line breakes are not allowed in Composite State names."; //$NON-NLS-1$

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
		CompositeState compositeState = (CompositeState) getBusinessObjectForPictogramElement(pe);
		compositeState.setDisplayName(value);

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the State
		updatePictogramElement(((Shape) pe).getContainer());
	}

}
