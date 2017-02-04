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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;

public class ContentListComposite extends Composite {
	/*
	 * The grid drawn around a table cell is this many pixels wide.
	 */
	private static final int GRID_WIDTH = 1;
	private static final int PADDING = 4;
	private static final int MARGIN = 4;

	private TableViewer tableViewer;
	private Button btnAddNewItem;
	private Button btnDeleteItem;
	private Button btnMoveUp;
	private Button btnMoveDown;
	private RulesEditor editor;
	private TableColumnLayout tableColumnLayout;
	private Clipboard cb;

	public ContentListComposite(Composite parent, int style, final EStructuralFeature eReference, final EClassifier eClass, final RulesEditor editor, Clipboard cb) {
		super(parent, style);
		this.editor = editor;
		this.cb = cb;
		setLayout(new FormLayout());

		Composite tableComposite = new Composite(this, SWT.NONE);
		FormData fd_table = new FormData();
		fd_table.left = new FormAttachment(0, MARGIN);
		fd_table.bottom = new FormAttachment(100, -MARGIN);
		fd_table.top = new FormAttachment(0, MARGIN);
		tableComposite.setLayoutData(fd_table);
		tableColumnLayout = new TableColumnLayout();
		tableComposite.setLayout(tableColumnLayout);
		tableViewer = new TableViewer(tableComposite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		// sets the content provider of the rules TableViewer to an
		// adapterFactory for the provided object where the objects returned
		// form the getRules() method that are instance of Utterance are set as
		// output to the table
		tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.editor.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				ArrayList<Object> result = new ArrayList<>();
				for (Object r : (Iterable) ((EObject) object).eGet(eReference)) {
					if (eClass.isInstance(r)) {
						result.add(r);
					}
				}
				return result.toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}
		});

		// here the label provider is set by default by the EMF platform
		// the EMF platform using the type of the object retrieves the Label
		// provider for the Utterance rules. See the ItemProvider for the
		// implementation of the label provider
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(this.editor.getAdapterFactory()));
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				btnDeleteItem.setEnabled(!event.getSelection().isEmpty());
				btnMoveDown.setEnabled(!event.getSelection().isEmpty());
				btnMoveUp.setEnabled(!event.getSelection().isEmpty());
				editor.setSelection(event.getSelection());
			}
		});

		Composite buttonsComposite = new Composite(this, SWT.NONE);
		fd_table.right = new FormAttachment(buttonsComposite, -PADDING);
		FormData fd_buttonsComposite = new FormData();
		fd_buttonsComposite.top = new FormAttachment(0);
		fd_buttonsComposite.bottom = new FormAttachment(100);
		fd_buttonsComposite.right = new FormAttachment(100);
		fd_buttonsComposite.left = new FormAttachment(100, -100);
		buttonsComposite.setLayoutData(fd_buttonsComposite);
		buttonsComposite.setLayout(new FormLayout());

		btnAddNewItem = new Button(buttonsComposite, SWT.NONE);
		FormData fd_btnAddNewItem = new FormData();
		fd_btnAddNewItem.right = new FormAttachment(100, -MARGIN);
		fd_btnAddNewItem.top = new FormAttachment(0, MARGIN);
		fd_btnAddNewItem.left = new FormAttachment(0, PADDING);
		btnAddNewItem.setLayoutData(fd_btnAddNewItem);
		btnAddNewItem.setText("Add New Item");
		btnAddNewItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (eClass instanceof EClass) {
					addElementToTable(tableViewer, (EObject) tableViewer.getInput(), eReference, EcoreUtil.create((EClass) eClass));
				} else {
					addElementToTable(tableViewer, (EObject) tableViewer.getInput(), eReference, "");
				}
			}
		});

		btnDeleteItem = new Button(buttonsComposite, SWT.NONE);
		FormData fd_btnDeleteUtterance = new FormData();
		fd_btnDeleteUtterance.top = new FormAttachment(btnAddNewItem, PADDING);
		fd_btnDeleteUtterance.right = new FormAttachment(100, -MARGIN);
		fd_btnDeleteUtterance.left = new FormAttachment(0, PADDING);
		btnDeleteItem.setLayoutData(fd_btnDeleteUtterance);
		btnDeleteItem.setText("Delete");
		btnDeleteItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteSelectedTableElements(tableViewer, (EObject) tableViewer.getInput(), eReference);
			}
		});

		btnMoveUp = new Button(buttonsComposite, SWT.NONE);
		FormData fd_btnMoveUp = new FormData();
		fd_btnMoveUp.top = new FormAttachment(btnDeleteItem, PADDING);
		fd_btnMoveUp.right = new FormAttachment(100, -MARGIN);
		fd_btnMoveUp.left = new FormAttachment(0, PADDING);
		btnMoveUp.setLayoutData(fd_btnMoveUp);
		btnMoveUp.setText("Move Up");
		btnMoveUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				moveUpSelectedElements(tableViewer, (EObject) tableViewer.getInput(), eReference);
			}
		});

		btnMoveDown = new Button(buttonsComposite, SWT.NONE);
		FormData fd_btnMoveDown = new FormData();
		fd_btnMoveDown.top = new FormAttachment(btnMoveUp, PADDING);
		fd_btnMoveDown.right = new FormAttachment(100, -MARGIN);
		fd_btnMoveDown.left = new FormAttachment(0, PADDING);
		btnMoveDown.setLayoutData(fd_btnMoveDown);
		btnMoveDown.setText("Move Down");
		btnMoveDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				moveDownSelectedElements(tableViewer, (EObject) tableViewer.getInput(), eReference);
			}
		});

		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				if (table.isEnabled()) {
					ContentListComposite.paintControl(e);
				}
			}
		});

		createCopyPasteContextMenu(tableViewer, eReference);
	}

	public TableColumnLayout getTableColumnLayout() {
		return tableColumnLayout;
	}

	public TableViewer getTableViewer() {
		return tableViewer;
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		btnAddNewItem.setEnabled(enabled);
		btnDeleteItem.setEnabled(enabled);
		btnMoveUp.setEnabled(enabled);
		btnMoveDown.setEnabled(enabled);
		tableViewer.getTable().setEnabled(enabled);
	}

	protected void addElementToTable(TableViewer tableViewer, EObject container, EStructuralFeature feature, Object newValue) {
		Command cmd = AddCommand.create(editor.getEditingDomain(), container, feature, newValue);
		editor.getEditingDomain().getCommandStack().execute(cmd);
		Table table = tableViewer.getTable();
		tableViewer.refresh();
		tableViewer.setSelection(new StructuredSelection(tableViewer.getElementAt(table.getItemCount() - 1)), true);
		// hickhack
		if (newValue instanceof PhraseMapping) {
			((PhraseMapping) newValue).setDescription(String.valueOf(table.getItemCount()));
		}

	}

	protected void deleteSelectedTableElements(TableViewer tableViewer, EObject container, EStructuralFeature feature) {
		List<Object> elements = new ArrayList<Object>();
		Iterator<Object> iterator = ((IStructuredSelection) tableViewer.getSelection()).iterator();

		while (iterator.hasNext()) {
			elements.add(iterator.next());
		}
		RemoveCommand cmd = new RemoveCommand(editor.getEditingDomain(), container, feature, elements);
		editor.getEditingDomain().getCommandStack().execute(cmd);
	}

	protected void moveUpSelectedElements(TableViewer tableViewer, EObject container, EStructuralFeature feature) {
		CompoundCommand subcommands = new CompoundCommand();
		int[] selectedIndices = tableViewer.getTable().getSelectionIndices();
		Arrays.sort(selectedIndices);
		if (selectedIndices[0] == 0)
			return;
		for (int i = 0; i < selectedIndices.length; ++i) {
			int sourceIndex, targetIndex;
			if (feature instanceof EAttribute) {
				sourceIndex = selectedIndices[i];
				targetIndex = selectedIndices[i] - 1;
			} else {
				sourceIndex = ((List<?>) container.eGet(feature)).indexOf(tableViewer.getElementAt(selectedIndices[i]));
				targetIndex = ((List<?>) container.eGet(feature)).indexOf(tableViewer.getElementAt(selectedIndices[i] - 1));
			}
			subcommands.append(new MoveCommand(editor.getEditingDomain(), container, feature, sourceIndex, targetIndex));
		}
		editor.getEditingDomain().getCommandStack().execute(subcommands.unwrap());
	}

	protected void moveDownSelectedElements(TableViewer tableViewer, EObject container, EStructuralFeature feature) {
		CompoundCommand subcommands = new CompoundCommand();
		int[] selectedIndices = tableViewer.getTable().getSelectionIndices();
		Arrays.sort(selectedIndices);
		ArrayUtils.reverse(selectedIndices);
		if (selectedIndices[0] == tableViewer.getTable().getItemCount() - 1)
			return;
		for (int i = 0; i < selectedIndices.length; ++i) {
			int sourceIndex, targetIndex;
			if (feature instanceof EAttribute) {
				sourceIndex = selectedIndices[i];
				targetIndex = selectedIndices[i] + 1;
			} else {
				sourceIndex = ((List) container.eGet(feature)).indexOf(tableViewer.getElementAt(selectedIndices[i]));
				targetIndex = ((List) container.eGet(feature)).indexOf(tableViewer.getElementAt(selectedIndices[i] + 1));
			}
			subcommands.append(new MoveCommand(editor.getEditingDomain(), container, feature, sourceIndex, targetIndex));
		}
		editor.getEditingDomain().getCommandStack().execute(subcommands.unwrap());
	}

	enum COLUMN_TYPE {
		RULENAME, ENABLED, TYPE
	}

	public TableColumn addColumn(String title, COLUMN_TYPE type) {
		TableColumn tableColumn = null;
		if (type == COLUMN_TYPE.RULENAME) {
			tableColumn = new TableColumn(tableViewer.getTable(), SWT.NONE);
			tableColumn.setResizable(true);
			tableColumnLayout.setColumnData(tableColumn, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		} else if (type == COLUMN_TYPE.ENABLED) {
			tableColumn = new TableColumn(tableViewer.getTable(), SWT.CHECK);
			tableColumn.setResizable(false);
			tableColumnLayout.setColumnData(tableColumn, new ColumnPixelData(60, true, true));

		} else if (type == COLUMN_TYPE.TYPE) {
			tableColumn = new TableColumn(tableViewer.getTable(), SWT.CHECK);
			tableColumn.setResizable(false);
			tableColumnLayout.setColumnData(tableColumn, new ColumnPixelData(80, true, true));
		}
		tableColumn.setText(title);
		return tableColumn;
	}

	/**
	 * This method creates a copyPaste context menu for the viewer that is received as an input the other parameter is used to indicate whether the selected element is a rule or not because the logic
	 * needs to be changed accordingly
	 * 
	 * @param viewer
	 * @param feature
	 */
	protected void createCopyPasteContextMenu(final TableViewer viewer, final EStructuralFeature feature) {
		final MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		menuMgr.setRemoveAllWhenShown(true);

		menuMgr.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				editor.setCurrentViewer(viewer);
				ISelection selection = viewer.getSelection();
				if (selection.isEmpty()) {
					selection = new StructuredSelection(tableViewer.getInput());
				}

				editor.setSelection(selection);

				editor.menuAboutToShow(manager);
				manager.remove("addChild");
				manager.remove("addSibling");

			}
		});
		viewer.getControl().setMenu(menu);

		// final MenuManager menuMgr = new MenuManager();
		// Menu menu = menuMgr.createContextMenu(viewer.getControl());
		// Action action = new Action("Copy",
		// ProjectEditorPlugin.getImageDescriptor("icons/Copy.png")) {
		// @Override
		// public void run() {
		// IStructuredSelection selection = (IStructuredSelection)
		// viewer.getSelection();
		// if (selection != null) {
		//
		// List<Object> selectedElements = new ArrayList<Object>();
		// Iterator<Object> iterator = selection.iterator();
		// while (iterator.hasNext()) {
		// selectedElements.add(iterator.next());
		// }
		//
		// if (feature.getEType().getInstanceClass() == String.class) {
		// // copyToClipboardCommand only works with EObjects
		// StringBuilder builder = new StringBuilder();
		// for (Object entry : selectedElements) {
		// builder.append(entry);
		// builder.append('\n');
		// }
		// cb.setContents(new Object[] { builder.toString() }, new Transfer[] {
		// TextTransfer.getInstance() });
		// } else {
		// editor.getEditingDomain().getCommandStack().execute(CopyToClipboardCommand.create(editor.getEditingDomain(),
		// selectedElements));
		// }
		// }
		// }
		// };
		// menuMgr.add(action);
		//
		// Action action1 = new Action("Paste",
		// ProjectEditorPlugin.getImageDescriptor("icons/Paste.png")) {
		// @Override
		// public void run() {
		// if (feature.getEType().getInstanceClass() == String.class) {
		// String contents = (String)
		// cb.getContents(TextTransfer.getInstance());
		// for (String entry : contents.split("\n")) {
		// if (!entry.isEmpty()) {
		// Command cmd = AddCommand.create(editor.getEditingDomain(),
		// viewer.getInput(), feature, entry);
		// editor.getEditingDomain().getCommandStack().execute(cmd);
		// }
		// }
		// } else {
		// cb.getContents(TextTransfer.getInstance());
		// Command command =
		// PasteFromClipboardCommand.create(editor.getEditingDomain(),
		// viewer.getInput(), feature);
		// editor.getEditingDomain().getCommandStack().execute(command);
		// }
		// }
		// };
		// menuMgr.add(action1);
		// viewer.getControl().setMenu(menu);
	}

	// /// helper methods for deleting grid lines for empty entries
	static protected void paintControl(PaintEvent e) {
		Table table = (Table) e.widget;
		e.gc.fillRectangle(getUnusedBottomRectangle(table));
		e.gc.fillRectangle(getUnusedRightRectangle(table));
	}

	/*
	 * Get the unused bottom portion of the table area.
	 */
	static private Rectangle getUnusedBottomRectangle(Table table) {
		Rectangle tableArea = table.getClientArea();
		if (table.getItemCount() > 0) {
			TableItem item = table.getItem(table.getItemCount() - 1);
			Rectangle lastItemBounds = item.getBounds();
			int yDelta = lastItemBounds.y + lastItemBounds.height + GRID_WIDTH;
			tableArea.y += yDelta;
			tableArea.height -= yDelta;
		}
		return tableArea;
	}

	/*
	 * Get the unused bottom portion of the table area.
	 */
	static private Rectangle getUnusedRightRectangle(Table table) {

		int totalColumnWidth = GRID_WIDTH; // Allow for grid line of last column

		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; ++i) {
			totalColumnWidth += columns[i].getWidth();
		}

		Rectangle tableArea = table.getClientArea();
		tableArea.x += totalColumnWidth;
		tableArea.width -= totalColumnWidth;
		return tableArea;
	}
}
