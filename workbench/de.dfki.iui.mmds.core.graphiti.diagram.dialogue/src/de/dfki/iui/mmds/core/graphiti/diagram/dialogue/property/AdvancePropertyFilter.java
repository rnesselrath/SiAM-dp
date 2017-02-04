package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 * Filter class for checking which shape linked to a business object is selected
 * in order to enable the property window to show data.
 * 
 * @author Dragan Milcevski
 * @date Apr 12, 2013
 *
 */
public class AdvancePropertyFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pe) {

		// System.out.println("dali filtriram?");
		// for(EObject bo : pe.getLink().getBusinessObjects()){

		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);

		// System.out.println("BOO "+bo);

		if (bo instanceof Transition)
			return true;
		else if (bo instanceof HistoryState)
			return true;
		else if (bo instanceof StateChart)
			// System.out.println("StateChart selected");
			return true;
		else if (bo instanceof AbstractState)
			// System.out.println("State selected");
			return true;
		else if (bo instanceof Dialogue)
			return true;

		return false;
	}
}
