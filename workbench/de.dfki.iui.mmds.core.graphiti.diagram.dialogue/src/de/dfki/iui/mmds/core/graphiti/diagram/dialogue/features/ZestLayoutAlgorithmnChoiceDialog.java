package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

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
 
public class ZestLayoutAlgorithmnChoiceDialog extends ElementListSelectionDialog {
    public ZestLayoutAlgorithmnChoiceDialog(Shell parent) {
        super(parent, new LabelProvider() {
            public String getText(Object element) {
                Integer idx = (Integer) element;
                return ZestLayoutDiagramFeature.layouts.get(idx - 1);
            }
        });
        Object[] elements = new Object[ZestLayoutDiagramFeature.layouts.size()];
        for (int i = 0; i < ZestLayoutDiagramFeature.layouts.size(); i++) {
            elements[i] = Integer.valueOf(i + 1);
        }
        setElements(elements);
        setTitle("Select Layout");
        setMultipleSelection(false);
    }

    @Override
    public int open() {
        int result = super.open();
        if (result < 0)
            return result;
        return (Integer) getFirstResult();
    }

}
