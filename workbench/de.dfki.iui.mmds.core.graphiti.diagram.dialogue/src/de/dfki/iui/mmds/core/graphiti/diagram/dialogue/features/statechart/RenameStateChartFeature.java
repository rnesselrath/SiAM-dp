package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class RenameStateChartFeature extends AbstractCustomFeature {

	private boolean hasDoneChanges = false;

	public RenameStateChartFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Rename State Chart";
	}

	@Override
	public String getDescription() {
		return "Change the name of the State Chart";
	}


	@Override
	public boolean canExecute(ICustomContext context) {
		// allow rename if exactly one pictogram element
		// representing a EClass is selected
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof StateChart) {
				ret = true;
			}
		}
		return ret;
	}

	@Override
	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof StateChart) {
				StateChart stateChart = (StateChart) bo;
				String currentName = stateChart.getDisplayName();
				// ask user for a new class name
				String newName = ExampleUtil.askString(getName(), getDescription(),
						currentName);
				if (newName != null && !newName.equals(currentName)) {
					this.hasDoneChanges = true;
					stateChart.setDisplayName(newName);
					updatePictogramElement(pes[0]);
				}
			}
		}
	}

	@Override
	public boolean hasDoneChanges() {
		return this.hasDoneChanges;
	}
}
