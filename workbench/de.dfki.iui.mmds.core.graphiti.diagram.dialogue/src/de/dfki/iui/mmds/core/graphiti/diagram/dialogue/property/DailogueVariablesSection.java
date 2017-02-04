package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.dialogue.provider.DialogueItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.dialogue.provider.VariableItemProvider;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;

public class DailogueVariablesSection extends GFPropertySection implements ITabbedPropertyConstants {

	private Table table;
	TableViewer tableViewer;
	private EList<Variable> variables;
	private ArrayList<EClassifier> classifiers;


	public DailogueVariablesSection() {
		loadECoreResource();
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		// FormToolkit factory = getWidgetFactory();
		// factory.createC
		Composite area = factory.createComposite(parent, SWT.NONE);

		// Composite area = factory.createComposite(parent, SWT.FILL);
		GridLayout gl_areaComposite = new GridLayout(1, false);
		area.setLayout(gl_areaComposite);
		// area.setLayout(new FillLayout(SWT.VERTICAL));
		// area.setLayoutData(new FillData());

		Composite buttonComposite = factory.createComposite(area, SWT.NONE);
		GridLayout gl_buttonComposite = new GridLayout(2, false);
		gl_buttonComposite.marginLeft = -5;
		buttonComposite.setLayout(gl_buttonComposite);
		buttonComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));

		factory.paintBordersFor(buttonComposite);

		Button addNewBtn = factory.createButton(buttonComposite, "Add New", SWT.NONE);
		addNewBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final Variable variable = DialogueFactory.eINSTANCE.createVariable();
				tableViewer.add(variable);
				table.setTopIndex(table.getItemCount());
				table.select(table.getItemCount() - 1);
				tableViewer.editElement(variable, 0);
				final TransactionalEditingDomain domain = getDiagramTypeProvider().getDiagramBehavior().getEditingDomain();
				domain.getCommandStack().execute(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						variables.add(variable);
					}

				});

			}
		});

		//Remove button function
		Button removeBtn = factory.createButton(buttonComposite, "Remove", SWT.NONE);
		removeBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = tableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					Iterator iterator = ((IStructuredSelection) selection).iterator();
					while (iterator.hasNext()) {
						Object obj = iterator.next();
						final Variable variable = (Variable) obj;
						tableViewer.remove(obj);
						// Remove the value from variables with editing domain
						final TransactionalEditingDomain domain = getDiagramTypeProvider().getDiagramBehavior().getEditingDomain();
						domain.getCommandStack().execute(new RecordingCommand(domain) {

							@Override
							protected void doExecute() {
								variables.remove(variable);
							}

						});
					}
				}
			}
		});

		Composite composite = factory.createComposite(area, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));


		factory.paintBordersFor(composite);

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		tableViewer.setColumnProperties(new String[] { "0", "1", "2", "3" });

		tableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				Object result = null;
				Variable variable = (Variable) element;
				switch (property) {
				case "0":
					if (variable.getName() != null) {
						result = variable.getName() + "";
					} else {
						result = "";
					}
					break;
				case "1":
					if (variable.getDefault() != null) {
						result = variable.getDefault() + "";
					} else {
						result = "";
					}
					break;
				case "2":
					if(variable.getEmfType() != null){
						result = variable.getEmfType().getName()+"";
					} else {
						result = "";
					}
					break;
				case "3":
					if (variable.getType() != null) {
						result = variable.getType() + "";
					} else {
						result = "";
					}
					break;
				}
				return result;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;

				EAttribute feature = null;
				switch (property) {
				case "0":
					feature = DialoguePackage.eINSTANCE.getVariable_Name();
					break;
				case "1":
					feature = DialoguePackage.eINSTANCE.getVariable_Default();
					break;
				case "2":
					feature = null;// (EAttribute)
					// DialoguePackage.eINSTANCE.getVariable_EmfType();
					break;
				case "3":
					feature = DialoguePackage.eINSTANCE.getVariable_Type();
				}
				final TransactionalEditingDomain domain = getDiagramTypeProvider().getDiagramBehavior().getEditingDomain();
				domain.getCommandStack().execute(SetCommand.create(domain, item.getData(), feature, value));
				// editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(),
				// item.getData(), feature, value));
				// System.out.println(editor.getEditingDomain().getCommandStack().canUndo()
				// + " aj da vidime");

				tableViewer.update(item.getData(), null);
			}

		});

		tableViewer.setCellEditors(new CellEditor[] {
				new TextCellEditor(tableViewer.getTable()), 
				new TextCellEditor(tableViewer.getTable()), 
				new ComboBoxViewerCellEditor(tableViewer.getTable()),
				//new ComboBoxCellEditor(tableViewer.getTable(), classifiersNames),
				//new EmfTypeEditingSupport(tableViewer, classifiers),
				new TextCellEditor(tableViewer.getTable()) });

		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.minimumHeight = 150;
		// gd_table.heightHint = 500;
		table.setLayoutData(gd_table);

		// table.setLayout(colLayout);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn nameColumn = tableViewerColumn.getColumn();
		nameColumn.setWidth(200);
		nameColumn.setText("Name");
		// colLayout.setColumnData(nameColumn, new ColumnWeightData(100,50 ));

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn defaultColumn = tableViewerColumn_3.getColumn();
		defaultColumn.setWidth(200);
		defaultColumn.setText("Default");
		// colLayout.setColumnData(defaultColumn, new ColumnWeightData(100,50));

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn emfTypeColumn = tableViewerColumn_2.getColumn();
		emfTypeColumn.setWidth(200);
		emfTypeColumn.setText("Emf Type");
		tableViewerColumn_2.setEditingSupport(new EmfTypeEditingSupport(tableViewerColumn_2.getViewer(), classifiers));
		// colLayout.setColumnData(emfTypeColumn, new ColumnWeightData(100,50));

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn typeColumn = tableViewerColumn_1.getColumn();
		typeColumn.setWidth(200);
		typeColumn.setText("Type");
		// colLayout.setColumnData(typeColumn, new ColumnWeightData(100,50));

	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);

			if (bo == null)
				return;
			if (bo instanceof AbstractState) {
				AbstractState as = (AbstractState) bo;
				variables = as.getVariables();
				tableViewer.setContentProvider(new VariableContentProvider());
				tableViewer.setLabelProvider(new VariableLabelProvider());
				tableViewer.setInput(variables);


			}

		}
	}

	/**
	 * Load the EMF Classifier types
	 */
	private void loadECoreResource() {
		DialogueItemProviderAdapterFactory dialogueItemProviderAdapterFactory = new DialogueItemProviderAdapterFactory();
		Adapter createVariableAdapter = dialogueItemProviderAdapterFactory.createVariableAdapter();

		VariableItemProvider variableItemProvider = new VariableItemProvider(dialogueItemProviderAdapterFactory);
		Variable variable = DialogueFactory.eINSTANCE.createVariable();
		IItemPropertyDescriptor propertyDescriptor = variableItemProvider.getPropertyDescriptor(variable, DialoguePackage.eINSTANCE.getVariable_EmfType());

		int n = propertyDescriptor.getChoiceOfValues(variable).size();

		classifiers = new ArrayList<>();
		for (Object value : propertyDescriptor.getChoiceOfValues(variable)) {
			if (value instanceof EClassifier) {
				EClassifier classifier = (EClassifier) value;
				classifiers.add(classifier);

				//System.err.println(((EClassifier) value).getInstanceTypeName());
			}
		}

	}

	/**
	 * Content provider vor the variable table viewer
	 * @author Dragan
	 *
	 */
	static class VariableContentProvider implements IStructuredContentProvider {

		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			// The inputElement comes from view.setInput()
			if (inputElement instanceof EList) {
				EList<Variable> models = (EList<Variable>) inputElement;
				return models.toArray();
			}
			return new Object[0];
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

	/**
	 * Label provider for the variable table viewer
	 * @author Dragan
	 *
	 */
	static class VariableLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;

		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			// each element comes from the ContentProvider.getElements(Object)
			if (!(element instanceof Variable))
				return "";
			Variable variable = (Variable) element;

			switch (columnIndex) {
			case 0:
				if (variable.getName() != null)
					return variable.getName();
				break;
			case 1:
				if (variable.getDefault() != null)
					return variable.getDefault();
				break;
			case 2:
				if (variable.getEmfType() != null)
					return variable.getEmfType().getName();
				break;
			case 3:
				if (variable.getType() != null)
					return variable.getType();
				break;
			default:
				break;
			}
			return "";
		}
	}

	/**
	 * Editing support class for the column emfType
	 * @author Dragan
	 *
	 */
	private class EmfTypeEditingSupport extends EditingSupport {

		private final ColumnViewer  viewer;
		private final ArrayList<EClassifier> classifiers;

		private ComboBoxViewerCellEditor cellEditor = null;


		public EmfTypeEditingSupport(ColumnViewer  viewer, ArrayList<EClassifier> classifiers) {
			super(viewer);
			this.viewer = viewer;
			this.classifiers = classifiers;

			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer().getControl());
			cellEditor.setLabelProvider(new EmfTypeLabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(classifiers);

		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			// TODO Auto-generated method stub
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			if(element instanceof Variable){
				Variable variable = (Variable) element;
				if(variable.getEmfType() != null){
					return variable.getEmfType().getName();
				}else{
					return "";
				}
			}
			return null;
		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Variable && value instanceof EClassifier) {

				final Variable variable = (Variable) element;
				final EClassifier classifier = (EClassifier) value;
				/* only set new value if it differs from old one */
				//if (!variable.getEmfType().equals(classifier)) {
				final TransactionalEditingDomain domain = getDiagramTypeProvider().getDiagramBehavior().getEditingDomain();
				domain.getCommandStack().execute(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						variable.setEmfType(classifier);
					}

				});

				viewer.update(element, null);
			}

		}



	}

	/**
	 * Label provider for the emfType column
	 * 
	 * @author Dragan
	 *
	 */
	class EmfTypeLabelProvider extends LabelProvider{

		public String getText(Object element) {
			if(element instanceof EClassifier){
				EClassifier clasifier = (EClassifier)element;
				return clasifier.getName();
			}
			return "";
		}
	}

	
}
