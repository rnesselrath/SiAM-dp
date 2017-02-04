package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * The class {@link DirectEditStateFeature}. It is use for inline editing names of objects 
 * 
 * @author Dragan Milchevski
 *
 */
public class DirectEditStateFeature extends AbstractDirectEditingFeature{

	/**
	 * Creates new {@link DirectEditStateFeature}
	 * @param fp the feature provider
	 */
	public DirectEditStateFeature(IFeatureProvider fp) {
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
	 * Checks if the feature can perform direct editing on the context handed over.
	 * 
	 * @param context the context
	 * @return This method is equivalent to
	 */
	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		// support direct editing, if it is a State, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (bo instanceof State && ga instanceof Text) {
			return true;
		}
		// direct editing not supported in all other cases
		return false;
	}

	/**
	 * Provides the initial value for the opened text editing UI component.
	 * 
	 * @param context the editing context.
	 * @return the initial value
	 */
	@Override
	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the State
		PictogramElement pe = context.getPictogramElement();
		State state = (State) getBusinessObjectForPictogramElement(pe);
		return state.getDisplayName();
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
			return "Please enter any text as State name."; //$NON-NLS-1$
//		if (value.contains(" ")) //$NON-NLS-1$
//			return "Spaces are not allowed in State names."; //$NON-NLS-1$
		if (value.contains("\n")) //$NON-NLS-1$
			return "Line breakes are not allowed in State names."; //$NON-NLS-1$

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
		State state = (State) getBusinessObjectForPictogramElement(pe);
		state.setDisplayName(value);

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the State
		updatePictogramElement(((Shape) pe).getContainer());
	}
	
	
}
