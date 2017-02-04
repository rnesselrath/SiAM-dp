package de.dfki.mmds.preferences.page.preferences;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import de.dfki.mmds.preferences.page.Activator;
import de.dfki.mmds.preferences.page.util.ManifestData;
import de.dfki.mmds.preferences.page.util.ManifestFileUtil;

public class VersionPage extends ViewPart {
	public static final String ID = "de.dfki.mmds.preferences.tableviewer.view";

	private CheckboxTableViewer viewer;

	public void createPartControl(final Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);
		final Text versionText = new Text(parent, SWT.BORDER | SWT.SEARCH);
		versionText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));
		Button setVersionButton = new Button(parent, SWT.NONE);
		
		setVersionButton.setText("Set value");
		setVersionButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				Shell shell = parent.getShell();
				if(versionText.getText().isEmpty()) {
					MessageDialog.openError(shell, "Error", "Please specify a correct MMDS version identificator");
					return;
				}
				if(viewer.getCheckedElements().length == 0) {
					MessageDialog.openError(shell, "Error", "Please select one or multiple projects");
					return;
				}
				for(Object selObj : viewer.getCheckedElements()) {
					ManifestData mData = (ManifestData)selObj;
					mData.setNewVersion(versionText.getText());
				}
				viewer.refresh();
			}
			public void widgetDefaultSelected(SelectionEvent event) {}
		});
		
		final Button checkAll = new Button(parent, SWT.CHECK);
		checkAll.setText("Check/Uncheck all");
		checkAll.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				viewer.setAllChecked(checkAll.getSelection());
			}
			public void widgetDefaultSelected(SelectionEvent event) {}
		});
		createViewer(parent);
	}

	private void createViewer(Composite parent) {
		viewer = CheckboxTableViewer.newCheckList(parent, 0);
		createColumns(parent, viewer);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setInput(ManifestFileUtil.listManifestFiles());

		// define layout for the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);
	}

	public TableViewer getViewer() {
		return viewer;
	}

	// create the columns for the table
	private void createColumns(final Composite parent, final TableViewer viewer) {
		String[] titles = { "", "Project", "Current version", "New version" };
		int[] bounds = {20, 170, 150};

		// first column is for the first name
		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return "";
			}
		});

		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ManifestData f = (ManifestData) element;
				return f.getProjectName();
			}
		});

		col = createTableViewerColumn(titles[2], bounds[2], 2);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ManifestData f = (ManifestData) element;
				return f.getCurrentVersion();
			}
		});
		
		col = createTableViewerColumn(titles[3], bounds[2], 3);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ManifestData f = (ManifestData) element;
				return f.getNewVersion();
			}
		});
	}
	
	/**
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		return Logger.getLogger(VersionPage.class.getName());
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	protected void performDefaults() {
		if(viewer.getInput() != null) {
			List<ManifestData> data = (List<ManifestData>)viewer.getInput();
			for(ManifestData mData : data) {
				mData.setNewVersion(mData.getCurrentVersion());				
			}
			viewer.refresh();
		} else
			getLogger().info("Input is null in the table viewer");
	}
	
	public boolean performOk() {
		if(viewer.getInput() != null) {
			List<ManifestData> data = (List<ManifestData>)viewer.getInput();
			for(ManifestData mData : data) {
				if(!mData.getNewVersion().isEmpty()) {
					ManifestFileUtil.setField(mData.getManifestHandle(), ManifestFileUtil.FIELD_BUNDLE_VERSION, mData.getNewVersion());	
					mData.setCurrentVersion(mData.getNewVersion());
				}			
			}
			
			viewer.refresh();
		} else
			getLogger().info("Input is null in the table viewer");
		return true;
	}
}
