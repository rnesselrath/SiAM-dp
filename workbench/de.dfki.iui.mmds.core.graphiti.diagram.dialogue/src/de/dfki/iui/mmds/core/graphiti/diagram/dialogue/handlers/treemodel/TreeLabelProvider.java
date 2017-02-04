package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers.treemodel;

import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import de.dfki.iui.mmds.core.model.dialogue.statechart.State;


public class TreeLabelProvider extends StyledCellLabelProvider {
	@Override
	public void update(ViewerCell cell) {
		Object element = cell.getElement();
		StyledString text = new StyledString();

		if (element instanceof State) {
			State state = (State) element;
			text.append(state.getDisplayName());
			text.append(" - ");
			text.append(state.eClass().getName());
			cell.setImage(PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_FOLDER));
		}
		cell.setText(text.toString());
		cell.setStyleRanges(text.getStyleRanges());
		super.update(cell);
	}
}