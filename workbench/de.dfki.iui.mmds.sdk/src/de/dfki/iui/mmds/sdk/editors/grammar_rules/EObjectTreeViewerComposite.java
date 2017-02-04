/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
package de.dfki.iui.mmds.sdk.editors.grammar_rules;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class EObjectTreeViewerComposite extends Composite {

	private static final int PADDING = 4;
	private static final int MARGIN = 4;

	private final TreeViewer treeViewer;
	private final ContentListComposite connectedList;

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	private final RulesEditor editor;

	public EObjectTreeViewerComposite(Composite parent, int style, final RulesEditor editor, ContentListComposite connectedList) {
		super(parent, style);
		this.editor = editor;
		this.connectedList = connectedList;
		setLayout(new FormLayout());

		treeViewer = new TreeViewer(this, SWT.MULTI | SWT.BORDER);
		Tree tree = treeViewer.getTree();
		FormData fd_tree = new FormData();
		fd_tree.bottom = new FormAttachment(100, -MARGIN);
		fd_tree.right = new FormAttachment(100, -MARGIN);
		fd_tree.top = new FormAttachment(0, MARGIN);
		fd_tree.left = new FormAttachment(0, MARGIN);
		tree.setLayoutData(fd_tree);
		tree.setHeaderVisible(true);

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnInterpretation = treeViewerColumn.getColumn();
		trclmnInterpretation.setWidth(400);
		trclmnInterpretation.setText("Right click to enter an interpretation");

		// the default content and label providers provided from EMF are used
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(this.editor.getAdapterFactory()));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(this.editor.getAdapterFactory()));

		// on selection change the current viewer is set to the selected tree
		// viewer so the properties of the objects are shown in the properties
		// view
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly.
			//
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				if (selection != null) {
					editor.setCurrentViewer(treeViewer);
					editor.setSelection(selection);
				}
			}
		});
		createTreeViewerContextMenu();

		this.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				createTreeViewerContextMenu();
			}
		});
	}

	protected void createTreeViewerContextMenu() {
		final MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		menuMgr.setRemoveAllWhenShown(true);

		menuMgr.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				final TreeSelection selection = (TreeSelection) treeViewer.getSelection();
				int pathDepth = selection.getPaths().length;
				if (pathDepth == 0) {
					editor.setCurrentViewer(treeViewer);
					editor.setSelection(connectedList.getTableViewer().getSelection());
				}

				editor.menuAboutToShow(manager);
				if (pathDepth < 1) {
					manager.remove("addSibling");
				}

			}

		});
		treeViewer.getControl().setMenu(menu);
	}

}
