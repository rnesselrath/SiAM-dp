package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers.treemodel;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;


public class TreeContentProvider implements ITreeContentProvider {

	private Dialogue model;

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.model = (Dialogue) newInput;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		Node root = model.getContent();
		if(root != null) {
			return new Object[]{root};
		}
		return new Object[]{};
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof AbstractCompositeState) {
			AbstractCompositeState state = (AbstractCompositeState) parentElement;
			return state.getStates().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof AbstractCompositeState) {
			return true;
		}
		return false;
	}

}