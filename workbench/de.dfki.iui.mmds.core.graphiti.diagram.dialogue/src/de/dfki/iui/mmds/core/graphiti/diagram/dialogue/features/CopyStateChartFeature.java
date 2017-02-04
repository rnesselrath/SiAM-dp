package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractCopyFeature;

import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Copy the shape and object StateChart
 * @author Dragan Milchevski
 *
 */
public class CopyStateChartFeature extends AbstractCopyFeature{

	/**
	 * Creates new {@link CopyStateChartFeature}
	 * @param fp the feature provider
	 */
	public CopyStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Perform the copying.
	 * 
	 * @param context the context
	 */
	@Override
	public void copy(ICopyContext context) {
		// get the business-objects for all pictogram-elements
		// we already verified, that all business-objets are StateChart
		PictogramElement[] pes = context.getPictogramElements();
		Object[] bos = new Object[pes.length];
		for (int i = 0; i < pes.length; i++) {
			PictogramElement pe = pes[i];
			bos[i] = getBusinessObjectForPictogramElement(pe);
		}
		// put all business objects to the clipboard
		putToClipboard(bos);
	}

	/**
	 * Check whether the copying is allowed
	 * @param context the context
	 * @return true if copying is allowed
	 */
	@Override
	public boolean canCopy(ICopyContext context) {
		final PictogramElement[] pes = context.getPictogramElements();
		if (pes == null || pes.length == 0) { // nothing selected
			return false;
		}

		// return true, if all selected elements are a EClasses
		for (PictogramElement pe : pes) {
			final Object bo = getBusinessObjectForPictogramElement(pe);
			if (!(bo instanceof StateChart)) {
				return false;
			}
		}
		return true;
	}

}
