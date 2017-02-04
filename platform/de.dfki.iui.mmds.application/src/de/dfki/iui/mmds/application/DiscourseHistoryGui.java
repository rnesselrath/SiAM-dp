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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence.NonContainmentReferenceHandling;
import de.dfki.iui.mmds.core.model.io.Message;

public class DiscourseHistoryGui extends ApplicationWindow {
	private Table table;
	private List<Message> list;
	private StyledText styledText;

	/**
	 * Create the application window.
	 * 
	 * @param list
	 */
	public DiscourseHistoryGui(List<Message> list) {
		super(null);
		this.list = list;
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

		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -10);
		fd_table.right = new FormAttachment(0, 380);
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

		TableColumn tblclmnCommunicativeact = new TableColumn(table, SWT.NONE);
		tblclmnCommunicativeact.setWidth(366);
		tblclmnCommunicativeact.setText("CommunicativeAct");

		styledText = new StyledText(container, SWT.BORDER | SWT.WRAP);
		FormData fd_styledText = new FormData();
		fd_styledText.bottom = new FormAttachment(100, -10);
		fd_styledText.right = new FormAttachment(100, -10);
		fd_styledText.top = new FormAttachment(0, 10);
		fd_styledText.left = new FormAttachment(0, 386);
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
		newShell.setText("Discourse History");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(900, 400);
	}

	public void update(List<Message> discourseHistory) {
		list = discourseHistory;
		table.removeAll();

		for (Message entry : list) {
			TableItem item = new TableItem(table, SWT.NONE);
			Timestamp time = new Timestamp(entry.getTimestamp());
			item.setText(0, time.toLocalDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")) + ": " + entry.eClass().getName());
			item.setData(entry);
		}
	}

}
