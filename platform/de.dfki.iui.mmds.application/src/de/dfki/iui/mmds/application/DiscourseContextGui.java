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
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence.NonContainmentReferenceHandling;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.dialogue.fade.SemanticContentEntry;

public class DiscourseContextGui extends ApplicationWindow {
	private List<SemanticContentEntry> list;
	private Tree tree;
	private StyledText styledText;

	/**
	 * Create the application window.
	 * 
	 * @param list
	 */
	public DiscourseContextGui(List<SemanticContentEntry> list) {
		super(null);
		this.list = list;
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

		tree = new Tree(container, SWT.BORDER);
		FormData fd_tree = new FormData();
		fd_tree.bottom = new FormAttachment(100, -10);
		fd_tree.right = new FormAttachment(0, 380);
		fd_tree.top = new FormAttachment(0, 10);
		fd_tree.left = new FormAttachment(0, 10);
		tree.setLayoutData(fd_tree);

		tree.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent selection) {
				TreeItem item = (TreeItem) selection.item;
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

		styledText = new StyledText(container, SWT.BORDER | SWT.WRAP);
		FormData fd_styledText = new FormData();
		fd_styledText.bottom = new FormAttachment(tree, 0, SWT.BOTTOM);
		fd_styledText.right = new FormAttachment(100, -10);
		fd_styledText.top = new FormAttachment(tree, 0, SWT.TOP);
		fd_styledText.left = new FormAttachment(tree, 6);
		styledText.setLayoutData(fd_styledText);

		update(list);

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
		newShell.setText("Discourse Context");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(900, 400);
	}

	synchronized public void update(List<SemanticContentEntry> discourseContext) {		
		if (!tree.isDisposed()) {
			list = discourseContext;
			tree.removeAll();
			Iterator<SemanticContentEntry> iterator = list.iterator();
			while (iterator.hasNext()) {
				SemanticContentEntry entry = iterator.next();
				List<Entity> validEntities = entry.getValidEntities();
				if (validEntities.isEmpty()) {
					iterator.remove();
					continue;
				}
				TreeItem item = new TreeItem(tree, SWT.NONE);
				Timestamp time = new Timestamp(entry.getTimestamp());
				item.setText(time.toLocalDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")) + ": " + entry.getDescription());
				item.setData(entry);
				for (Entity entity : validEntities) {
					TreeItem subitem = new TreeItem(item, SWT.NONE);
					subitem.setText(entity.eClass().getName());
					subitem.setData(entity);
				}
			}
		}
	}
}
