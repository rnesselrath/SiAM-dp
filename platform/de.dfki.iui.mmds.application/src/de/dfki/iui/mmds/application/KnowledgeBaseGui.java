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
package de.dfki.iui.mmds.application;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence.NonContainmentReferenceHandling;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry;

public class KnowledgeBaseGui extends ApplicationWindow {
	private Table table, table1;
	private List<KnowledgeBaseEntry> list;
	EList<EntityResource> entityResources;
	private StyledText styledText;

	/**
	 * Create the application window.
	 * 
	 * @param entityResources
	 * 
	 * @param hashMap
	 */
	public KnowledgeBaseGui(EList<KnowledgeBaseEntry> eList, EList<EntityResource> entityResources) {
		super(null);
		this.list = eList;
		this.entityResources = entityResources;
		open();
	}

	/**
	 * Create contents of the application window.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FormLayout());

		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -10);
		fd_table.right = new FormAttachment(33, -5);
		fd_table.top = new FormAttachment(0, 10);
		fd_table.left = new FormAttachment(0, 10);
		table.setLayoutData(fd_table);
		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent selection) {
				TableItem item = (TableItem) selection.item;
				if (item != null) {
					Object content = item.getData();
					if (content instanceof EObject) {
						try {
							styledText.setText(EmfPersistence.writeToString((EObject) content, NonContainmentReferenceHandling.ADD_TO_RESOURCE, null));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// do nothing
			}
		});
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		org.eclipse.swt.widgets.TableColumn tblclmnEntity = new org.eclipse.swt.widgets.TableColumn(table, SWT.NONE);
		tblclmnEntity.setWidth(366);
		tblclmnEntity.setText("Entities");

		// Create context menu
		Menu menuTable = new Menu(table);
		table.setMenu(menuTable);

		// create entity
		MenuItem createMenuItem = new MenuItem(menuTable, SWT.NONE);
		createMenuItem.setText("Create Entity");
		createMenuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				CreateEntityDialog entityDialog = new CreateEntityDialog(KnowledgeBaseGui.this.getShell());
				String conceptName = entityDialog.open();
				if (conceptName != null)
					ProjectManager.knowledgeManager.createEntity(conceptName);
			}
		});

		// set feature entity
		MenuItem setFeatureMenuItem = new MenuItem(menuTable, SWT.NONE);
		setFeatureMenuItem.setText("Set Feature");
		setFeatureMenuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String parentId = "";
				if (table.getSelection().length > 0) {
					parentId = ((KnowledgeBaseEntry) table.getSelection()[0].getData()).getContent().getENTITY_ID();
				}
				SetFeatureDialog setFeatureDialog = new SetFeatureDialog(KnowledgeBaseGui.this.getShell(), parentId);
				boolean success = setFeatureDialog.open();
				if (success) {
					ProjectManager.knowledgeManager.setFeature(setFeatureDialog.parent, setFeatureDialog.feature, setFeatureDialog.entity);
				}
			}
		});

		// delete entity
		MenuItem deleteMenuItem = new MenuItem(menuTable, SWT.NONE);
		deleteMenuItem.setText("Delete Entity");
		deleteMenuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				for (TableItem ti : table.getSelection()) {
					ProjectManager.knowledgeManager.removeEntity(((KnowledgeBaseEntry) ti.getData()).getContent().getENTITY_ID());
				}
			}
		});

		styledText = new StyledText(container, SWT.BORDER | SWT.WRAP);
		FormData fd_styledText = new FormData();
		fd_styledText.bottom = new FormAttachment(100, -10);
		fd_styledText.right = new FormAttachment(80, -5);
		fd_styledText.top = new FormAttachment(0, 10);
		fd_styledText.left = new FormAttachment(33, 5);
		styledText.setLayoutData(fd_styledText);
		update(list);

		table1 = new Table(container, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		FormData fd_table1 = new FormData();
		fd_table1.bottom = new FormAttachment(100, -10);
		fd_table1.right = new FormAttachment(100, -10);
		fd_table1.top = new FormAttachment(0, 10);
		fd_table1.left = new FormAttachment(80, 5);
		table1.setLayoutData(fd_table1);
		table1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent selection) {
				TableItem item = (TableItem) selection.item;
				if (item != null) {
					Object content = item.getData();
					if (content instanceof EObject) {
						try {
							styledText.setText(EmfPersistence.writeToString((EObject) content, NonContainmentReferenceHandling.ADD_TO_RESOURCE, null));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// do nothing
			}
		});

		// Create context menu
		Menu menuTable1 = new Menu(table1);
		table1.setMenu(menuTable1);

		// add entity
		MenuItem addMenuItem = new MenuItem(menuTable1, SWT.NONE);
		addMenuItem.setText("Add Entity");
		addMenuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				for (TableItem ti : table1.getSelection()) {
					ProjectManager.knowledgeManager.addEntity(((Entity) ti.getData()));
				}
			}
		});

		// Do not show menu, when no item is selected
		table1.addListener(SWT.MenuDetect, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (table1.getSelectionCount() <= 0) {
					event.doit = false;
				}
			}
		});
		table1.setHeaderVisible(true);
		table1.setLinesVisible(true);
		org.eclipse.swt.widgets.TableColumn tblclmnEntity1 = new org.eclipse.swt.widgets.TableColumn(table1, SWT.NONE);
		tblclmnEntity1.setWidth(200);
		tblclmnEntity1.setText("Test Entities");
		fillTestEntities();

		return container;
	}

	/**
	 * Configure the shell.
	 * 
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Physical Context");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(1200, 400);
	}

	public void update(List<KnowledgeBaseEntry> physicalContext) {
		try {
			list = physicalContext;
			int chosenItem = table.getSelectionIndex();
			table.removeAll();
			for (int i = 0; i < list.size(); i++) {
				KnowledgeBaseEntry entry = list.get(i);
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(0, String.format("%s (id: %s)", entry.getContent().eClass().getName(), entry.getContent().getENTITY_ID()));
				item.setData(entry);

			}
			try {
				if (chosenItem != -1 && chosenItem < table.getItemCount()) {
					TableItem item = table.getItem(chosenItem);
					table.setSelection(chosenItem);
					styledText.setText(EmfPersistence.writeToString((EObject) item.getData(), NonContainmentReferenceHandling.ADD_TO_RESOURCE, null));
				} else
					styledText.setText("");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

	}

	public void fillTestEntities() {
		for (EntityResource resource : entityResources) {
			if (!resource.isAddToKnowledgeManager())
				for (Entity e : resource.getContent()) {
					TableItem item = new TableItem(table1, SWT.NONE);
					item.setText(0, e.eClass().getName());
					item.setData(e);
				}
		}
	}
}
