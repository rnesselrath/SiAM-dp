package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;
 
public class TransitionChoiceDialog extends ElementListSelectionDialog {
	private static EList<Transition> trans_;
    public TransitionChoiceDialog(Shell parent, EList<Transition> transitions) {
        super(parent, new LabelProvider() {
            public String getText(Object element) {
                Transition tr = (Transition)element;
                String name = tr.getDisplayName();
                if(tr.getSource() != null && tr.getTarget() != null) {
                	name += "("+((DialogueDesignerElement)tr.getSource()).getDisplayName() +"->"+
                			((DialogueDesignerElement)tr.getTarget()).getDisplayName()+")";
                }
                return name;
            }
        });
        trans_ = transitions;
        Object[] elements = new Object[transitions.size()];
        for (int i = 0; i < transitions.size(); i++) {
            elements[i] = transitions.get(i);
        }
        setElements(elements);
        setTitle("Select Transition");
        setMultipleSelection(false);
    }

    @Override
    public int open() {
        return super.open();
    }

}
