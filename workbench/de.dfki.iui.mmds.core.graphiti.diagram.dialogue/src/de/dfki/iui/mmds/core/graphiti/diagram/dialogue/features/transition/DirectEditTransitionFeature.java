package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 * The class {@link DirectEditTransitionFeature}. It is use for inline editing names of objects 
 * 
 * @author Dragan Milchevski
 *
 */
public class DirectEditTransitionFeature extends AbstractDirectEditingFeature{

	/**
	 * Creates new {@link DirectEditTransitionFeature}
	 * @param fp the feature provider
	 */
	public DirectEditTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Framework calls this method to decide which UI to show up.
	 * 
	 * @return the editing type (Text)
	 */
	@Override
	public int getEditingType() {
		// TODO Auto-generated method stub
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
		// support direct editing, if it is a Transition, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (bo instanceof Transition && ga instanceof Text) {
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
		PictogramElement pe = context.getPictogramElement();
		Transition transition = (Transition) getBusinessObjectForPictogramElement(pe);
		return transition.getDisplayName();
	}
	
	/**
	 * Validation of the new string
	 * @param value the value
	 * @param context the context
	 * 
	 * @return null if value is okay and could be set; any text means value is not valid; text is reason for invalidality
	 */
	public void setValue(String value, IDirectEditingContext context) {
		// set the new name for the EClass
		PictogramElement pe = context.getPictogramElement();
		Text ga = (Text) context.getGraphicsAlgorithm();
		Transition transition = (Transition) getBusinessObjectForPictogramElement(pe);
		transition.setDisplayName(value);
		
		ga.setValue(value);
		// Explicitly update the shape to display the new value in the diagram
		// Note, that this might not be necessary in future versions of Graphiti
		// (currently in discussion)

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the Transition
		
		//updatePictogramElement(((ConnectionDecorator) pe).getContainer());
	}
}
