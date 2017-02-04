package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.wb.swt.SWTResourceManager;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.Activator;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.CreateAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.delay.CreateDelayFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.log.CreateLogFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.raise.CreateRaiseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.send.CreateSendFeature;
import de.dfki.iui.mmds.core.model.base.provider.BaseItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.provider.FlowchartItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.dialogue.provider.DialogueItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.dialogue.statechart.provider.StatechartItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.io.communicative_functions.provider.Communicative_functionsItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.io.earcons.provider.EarconsItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.io.provider.IoItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.io.references.provider.ReferencesItemProviderAdapterFactory;
import de.dfki.iui.mmds.core.model.pattern.provider.PatternItemProviderAdapterFactory;


public class ExecutableContentEditorPart extends EditorPart implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider, IGotoMarker{

	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	private EList<ExecutableContent> execContentEList;
	private Table table;
	private TreeViewer treeViewer;
	private IFeatureProvider fp;
	private TableViewer tableViewer;
	private Text expression2Txt;
	private Text toTxt;
	private Text durationTxt;
	private Text expression1Txt;
	private Text labelTxt;
	private TableViewerColumn executableContentColumn;


	protected Button deleteButton;
	protected Button saveButton;
	protected Label errorLbl;
	protected ContainerShape targetContainer;

	protected boolean enableSave = false;


	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	protected ISelection editorSelection = StructuredSelection.EMPTY;
	protected AdapterFactoryEditingDomain editingDomain;
	
	
	// Options for each dropdown
	private String[] options = { "Send", "Raise", "Log", "Assign", "Delay"};

	public ExecutableContentEditorPart() {
		super();
		//		this.execContentEList = execContentEList;
		//		this.fp = fp;
		//		this.targetContainer = targetContainer;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		// TODO Auto-generated method stub
		//this.site = site;.
		setSite(site);
		setInput(input);
	}
	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite area = parent;
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.widthHint = 96;


		ComposedAdapterFactory adapterFactory;
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DialogueItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new FlowchartItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new StatechartItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BaseItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new Communicative_functionsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new IoItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EarconsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReferencesItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PatternItemProviderAdapterFactory());
		

		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		//editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

		Composite composite_2 = new Composite(parent, SWT.NONE);
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));

		Form frmNewForm = formToolkit.createForm(composite_2);
		frmNewForm.setMessage("Assign/edit executable content for the object:");
		frmNewForm.setSeparatorVisible(true);
		formToolkit.paintBordersFor(frmNewForm);
		frmNewForm.setText("Executable Content's Editor");
		frmNewForm.getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite container = new Composite(frmNewForm.getBody(), SWT.NONE);
		container.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		container.setLayout(new GridLayout(1, false));
		//container.setLayout(new GridLayout(1, false));
		//container.setLayoutData(new GridData(GridData.FILL_BOTH));

		SashForm sashForm = new SashForm(container, SWT.NONE);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sashForm.setSashWidth(2);
		sashForm.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.adapt(sashForm);
		formToolkit.paintBordersFor(sashForm);

		Composite composite_3 = formToolkit.createComposite(sashForm, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(composite_3);
		composite_3.setLayout(new GridLayout(1, false));

		Label lblNewLabel = formToolkit.createLabel(composite_3, "Assigned:", SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));


		TableColumnLayout layout = new TableColumnLayout();

		Composite composite = new Composite(composite_3, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);




		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(table);

		executableContentColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = executableContentColumn.getColumn();
		tblclmnNewColumn.setWidth(100);
		composite.setLayout( layout );


		// 4
		layout.setColumnData( tblclmnNewColumn, new ColumnWeightData( 30 ) );

		tableViewer.setContentProvider(new ModelContentProvider());
		tableViewer.setLabelProvider(new ModelLabelProvider());


		final StackLayout sl_stackComposite = new StackLayout();



		Composite composite_1 = formToolkit.createComposite(sashForm, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		Label lblNewLabel_1 = formToolkit.createLabel(composite_1, "Edit properties:", SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		final Composite stackComposite = new Composite(composite_1, SWT.NONE);
		stackComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		stackComposite.setLayout(sl_stackComposite);
		stackComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(stackComposite);
		formToolkit.paintBordersFor(stackComposite);

		final Composite defaultComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		defaultComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(defaultComposite);
		defaultComposite.setLayout(new GridLayout(1, false));

		sl_stackComposite.topControl = defaultComposite;



		Label lblNewLabel_3 = formToolkit.createLabel(defaultComposite, "Select assigned Executable content from the left panel to see its properties", SWT.WRAP);
		GridData gd_lblNewLabel_3 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_lblNewLabel_3.widthHint = 343;
		gd_lblNewLabel_3.heightHint = 50;
		lblNewLabel_3.setLayoutData(gd_lblNewLabel_3);
		lblNewLabel_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));

		final Composite logComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		logComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(logComposite);
		logComposite.setLayout(new GridLayout(2, false));

		Label lblNewLabel_2 = formToolkit.createLabel(logComposite, "Expression:", SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		expression1Txt = formToolkit.createText(logComposite, "New Text", SWT.NONE);
		expression1Txt.setText("");
		expression1Txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblLabel = formToolkit.createLabel(logComposite, "Label:", SWT.NONE);
		lblLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		labelTxt = formToolkit.createText(logComposite, "New Text", SWT.NONE);
		labelTxt.setText("");
		labelTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Composite assignComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		assignComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		formToolkit.paintBordersFor(assignComposite);
		assignComposite.setLayout(new GridLayout(2, false));

		Label lblExpression = formToolkit.createLabel(assignComposite, "Expression:", SWT.NONE);
		lblExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExpression.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));

		expression2Txt = formToolkit.createText(assignComposite, "New Text", SWT.NONE);
		expression2Txt.setText("");
		expression2Txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblTo = formToolkit.createLabel(assignComposite, "To:", SWT.NONE);
		lblTo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblTo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		toTxt = formToolkit.createText(assignComposite, "New Text", SWT.NONE);
		toTxt.setText("");
		toTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Composite delayComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		delayComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		formToolkit.paintBordersFor(delayComposite);
		delayComposite.setLayout(new GridLayout(2, false));

		Label lblNewLabel_4 = formToolkit.createLabel(delayComposite, "Duration:", SWT.NONE);
		lblNewLabel_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		durationTxt = formToolkit.createText(delayComposite, "New Text", SWT.NONE);
		durationTxt.setText("");
		durationTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(delayComposite, SWT.NONE);

		errorLbl = formToolkit.createLabel(delayComposite, "Please enter a numerical value!", SWT.NONE);
		errorLbl.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		errorLbl.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		errorLbl.setVisible(false);

		final Composite sendComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		sendComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(sendComposite);
		sendComposite.setLayout(new GridLayout(1, false));

		final Composite composite_9 = new Composite(sendComposite, SWT.NONE);
		composite_9.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite_9);
		formToolkit.paintBordersFor(composite_9);
		composite_9.setLayout(new TreeColumnLayout());

		treeViewer = new TreeViewer(composite_9, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		formToolkit.paintBordersFor(tree);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		//createContextMenuFor(tableViewer);
		//treeViewer.setInput(fp.getDiagramTypeProvider().getDiagramBehavior().getEditingDomain().getResourceSet());

		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);


		final Composite raiseComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		raiseComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(raiseComposite);
		raiseComposite.setLayout(new GridLayout(1, false));

		Label lblThisExecutableContent = formToolkit.createLabel(raiseComposite, "This executable content does not have any properties to edit", SWT.NONE);
		lblThisExecutableContent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblThisExecutableContent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		sashForm.setWeights(new int[] {116, 358});

		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		formToolkit.adapt(label, true, true);

		SashForm sashForm_1 = new SashForm(container, SWT.NONE);
		sashForm_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.adapt(sashForm_1);
		formToolkit.paintBordersFor(sashForm_1);

		Composite composite_4 = formToolkit.createComposite(sashForm_1, SWT.NONE);
		composite_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_4.setLayout(new GridLayout(2, true));
		formToolkit.paintBordersFor(composite_4);

		Button btnNewButton_1 = formToolkit.createButton(composite_4, "Add New", SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.add(new Object());
				final TableItem item = table.getItem(table.getItemCount()-1);
				final TableEditor editor = new TableEditor(table);
				editor.horizontalAlignment = SWT.LEFT;
				editor.grabHorizontal = true;

				int column = 0;
				// Create the dropdown and add data to it
				final CCombo combo = new CCombo(table, SWT.READ_ONLY);
				for (int i = 0, n = options.length; i < n; i++) {
					combo.add(options[i]);
				}

				// Select the previously selected item from the cell
				combo.select(combo.indexOf(item.getText(column)));


				// Set the focus on the dropdown and set into the editor
				combo.setFocus();
				editor.setEditor(combo, item, column);

				// Add a listener to set the selected item back into the cell
				
				combo.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						
						boolean canCreate = true;
						CreateContext cc = new CreateContext();
						ICreateFeature cf = null; 
						cc.setTargetContainer(targetContainer);
						switch(combo.getText()){
						case "Send":
							cf = new  CreateSendFeature(fp);

							break;
						case "Raise":
							cf = new CreateRaiseFeature(fp);
							break;
						case "Log":
							cf = new CreateLogFeature(fp);
							break;
						case "Assign":
							cf = new CreateAssignFeature(fp);
							break;
						case "Delay":
							cf = new CreateDelayFeature(fp);
							break;
						default:
							canCreate = false;
							break;
						}



						if(canCreate){
							if(cf.canCreate(cc)){

								cf.execute(cc);
							}

							tableViewer.remove(table.getItemCount()-1);
							//execContentEList.add(ec);
							tableViewer.refresh();

							table.setTopIndex(table.getItemCount());
							table.select(table.getItemCount() - 1);
						}
						combo.dispose();
					}
				});

				
			}
		});
		btnNewButton_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		deleteButton = formToolkit.createButton(composite_4, "Delete", SWT.NONE);
		GridData gd_deleteButton = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_deleteButton.widthHint = 65;
		deleteButton.setLayoutData(gd_deleteButton);

		deleteButton.setEnabled(false);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ExecutableContent ec = execContentEList.get(table.getSelectionIndex());

				PictogramElement pe = fp.getPictogramElementForBusinessObject(ec);
				final DeleteContext dc = new DeleteContext(pe);
				final IDeleteFeature df = fp.getDeleteFeature(dc);
				if(df.canExecute(dc)){
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						public void doExecute() {
							df.execute(dc);
						}
					});
				}

				tableViewer.refresh();
			}
		});
		
		Composite composite_5 = formToolkit.createComposite(sashForm_1, SWT.NONE);
		formToolkit.paintBordersFor(composite_5);
		composite_5.setLayout(new GridLayout(1, true));

		saveButton = formToolkit.createButton(composite_5, "Save", SWT.NONE);
		GridData gd_saveButton = new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1);
		gd_saveButton.widthHint = 71;
		saveButton.setLayoutData(gd_saveButton);
		sashForm_1.setWeights(new int[] {1, 1});
		
		saveButton.setEnabled(enableSave);
		

		saveButton.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				final ExecutableContent ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					public void doExecute() {
						if(ec instanceof Log){
							if(expression1Txt.getText() != ""){
								((Log) ec).setExpression(expression1Txt.getText());
							}
							if(labelTxt.getText() != ""){
								((Log) ec).setLabel(labelTxt.getText());
							}
						} else if(ec instanceof Assign){
							if(expression2Txt.getText() != ""){
								((Assign) ec).setExpression(expression2Txt.getText());
							}
							if(toTxt.getText() != ""){
								((Assign) ec).setTo(toTxt.getText());
							}
						} else if(ec instanceof Delay){
							if(durationTxt.getText() != ""){
								try { 
									errorLbl.setVisible(false);
									BInteger value = BInteger.valueOf(durationTxt.getText());
									((Delay) ec).setDuration(value);
								} catch(NumberFormatException e1) { 
									errorLbl.setVisible(true);
								}
							}
						}
					}
				});
			}
		});


		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly.
			//
			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
				if (selection != null) {
					Object obj = selection.getFirstElement();
					if(obj instanceof Log){
						Log log = (Log)obj;
						sl_stackComposite.topControl = logComposite;
						if(log.getExpression() != null){
							expression1Txt.setText(log.getExpression());
						}
						if(log.getLabel() != null){
							labelTxt.setText(log.getLabel());
						}
						saveButton.setEnabled(true);

					}else if(obj instanceof Send){
						sl_stackComposite.topControl = sendComposite;
						treeViewer.setInput(obj);
						createContextMenuFor(treeViewer);
					}else if(obj instanceof Raise){
						sl_stackComposite.topControl = raiseComposite;
					}else if(obj instanceof Assign){
						Assign assign = (Assign)obj;
						sl_stackComposite.topControl = assignComposite;

						if(assign.getExpression() != null){
							expression2Txt.setText(assign.getExpression());
						}
						if(assign.getTo() != null){
							toTxt.setText(assign.getTo());
						}
						saveButton.setEnabled(true);
					}else if(obj instanceof Delay){
						sl_stackComposite.topControl = delayComposite;

						Delay delay = (Delay)obj;
						if(delay.getDuration() != null){
							durationTxt.setText(delay.getDuration()+"");
						}
						saveButton.setEnabled(true);
					}else{
						sl_stackComposite.topControl = defaultComposite;
					}

					stackComposite.layout();
					deleteButton.setEnabled(true);
				}

			}
		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	static class ModelContentProvider implements IStructuredContentProvider {

		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			// The inputElement comes from view.setInput()
			if (inputElement instanceof EList) {
				EList<ExecutableContent> models = (EList<ExecutableContent>) inputElement;
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

	static class ModelLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			String imageName = "";
			if(element instanceof Send){
				imageName = "Send";
			}else if(element instanceof Assign){
				imageName = "Assign";
			}else if(element instanceof Raise){
				imageName ="Raise";
			}else if(element instanceof Delay){
				imageName ="Delay";
			}else if(element instanceof Log){
				imageName ="Log";
			}
			if(!imageName.equals("")){
				return new Image(null, Activator.getImageDescriptor("icons/"+imageName+".gif").getImageData());
			}else{
				return null;
			}

		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			// each element comes from the ContentProvider.getElements(Object)
			if (!(element instanceof ExecutableContent)) {
				return "";
			}
			ExecutableContent model = (ExecutableContent) element;

			if(model instanceof Send){
				return "Send";
			}else if(model instanceof Assign){
				return "Assign";
			}else if(model instanceof Raise){
				return "Raise";
			}else if(model instanceof Delay){
				return "Delay";
			}else if(model instanceof Log){
				return "Log";
			}

			return "";
		}
	}

	public void setExecContentEList(EList<ExecutableContent> execContentEList) {
		this.execContentEList = execContentEList;
		tableViewer.setInput(execContentEList);
	}


	public void setFp(IFeatureProvider fp) {
		this.fp = fp;
	}


	public void setTargetContainer(ContainerShape targetContainer) {
		this.targetContainer = targetContainer;
	}
	
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

//		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
//		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
//		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
//		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(null, viewer));
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		// TODO Auto-generated method stub
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(manager);
	}

	@Override
	public void gotoMarker(IMarker marker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Viewer getViewer() {
		// TODO Auto-generated method stub
		return treeViewer;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
		
	}

	@Override
	public ISelection getSelection() {
		return editorSelection;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
		
	}

	@Override
	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		//setStatusLineManager(selection);
		
	}
	
	

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

}
