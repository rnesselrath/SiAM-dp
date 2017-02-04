package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.Activator;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.condevent.CreateCondEvent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.CreateAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.delay.CreateDelayFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.iff.CreateExecIfFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.log.CreateLogFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.raise.CreateRaiseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.send.CreateSendFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property.UnwrappingPropertySource;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.Else;
import de.dfki.iui.mmds.core.model.dialogue.ElseIf;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.If;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.pattern.PObject;
import de.dfki.iui.mmds.core.model.pattern.PatternFactory;

/**
 * {@link TitleAreaDialog} editor that is used to edit the {@link ExecutableContent} objects.
 * It is opened on double click of shapes of type {@link ExecutableContent} or double click on holders for {@link ExecutableContent}.
 * This class is general and it is used for assigning and editing all executable content objects:
 * {@link Assign}, {@link Log}, {@link Send}, {@link Delay}, {@link Raise}, {@link If} and {@link CondEvent}
 * 
 * Most of the code is generated using the WindowBuilder Editor. 
 * To see the visual elements, right click on the class -> open with -> WindowBuilder Editor.
 * 
 * The left tree is not visible since there is a condition that displays different trees when the calling object is {@link WaitForEvent} which shows only {@link CondEvent}
 * or normal object thats supports {@link ExecutableContent} objects.
 * 
 * @author Dragan Milchevski
 *
 */
public class ExecutableContentChooserDialogue extends TitleAreaDialog {

	//Initializations and declarations
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	private EObject callingObject;
	private final EList<EObject> execContentEList;
	private CondEvent condEvent;
	private EList<EObject> condList;

	private List<EObject> copyContentList;

	private Table table;
	private TreeViewer sendTreeViewer;
	private TreeViewer ifContenttreeViewer;
	private TreeViewer condTreeViewer;

	private final IFeatureProvider fp;
	private TableViewer tableViewer;
	private Text expression2Txt;
	private Text toTxt;
	private Text durationTxt;
	private Text expression1Txt;
	private Text labelTxt;
	private TableViewerColumn executableContentColumn;
	TableViewer condEventTableViewer;

	// protected Button deleteButton;
	protected Label errorLbl;
	final private ContainerShape targetContainer;

	private final ArrayList<Integer> openedDialogs;
	private Button deleteExecutableContent;
	private Button addCondEvent;
	private Button btnAddOutputAct;
	private Button btnAddUpdateDeviceMode;
	private Button btnAddPobject;
	private Button btnAssign;
	private Button btnDeley;
	private Button btnSend;
	private Button btnLog;
	private Button btnRaise;
	private Button btnIf;
	private Button btnElseIf;
	private Button btnElse;

	protected boolean enableSave = false;

	ComposedAdapterFactory adapterFactory;
	AdapterFactoryLabelProvider labelProvider;

	// Options for each dropdown
	private final String[] options = { "Send", "Raise", "Log", "Assign","Delay", "If" };

	private Text ifCondTxt;
	private Text eventTxt;
	private Text txtCondCond;
	private Table condEventTable;

	private EList<EObject> targetStates_;

	private Combo combo_1;

	/**
	 * Creates new {@link ExecutableContentChooserDialogue}
	 * @param parentShell the parent {@link Shell}
	 * @param execContentEList list of {@link ExecutableContent} objects
	 * @param fp the feature provider
	 * @param targetContainer the target {@link ContainerShape}
	 * @param openedDialogs {@link List} of opened dialogues
	 * @param callingObject the business object from which the dialogue is opened. 
	 * @param condEvent when a {@link CondEvent} is the trigger, this is the reference to it.
	 */
	protected ExecutableContentChooserDialogue(Shell parentShell,
			EList<EObject> execContentEList, IFeatureProvider fp,
			ContainerShape targetContainer, ArrayList<Integer> openedDialogs,
			EObject callingObject, CondEvent condEvent) {
		super(parentShell);
		setBlockOnOpen(false);
		setHelpAvailable(false);
		setShellStyle(SWT.CLOSE | SWT.RESIZE);
		this.execContentEList = execContentEList;
		this.fp = fp;
		this.targetContainer = targetContainer;
		this.openedDialogs = openedDialogs;
		this.callingObject = callingObject;
		this.condEvent = condEvent;

		condList = new BasicEList<EObject>();
		if (condEvent != null) {
			condList.add(condEvent);
		}

	}


	/**
	 * Creates this window's widget in a new top-level shell. 
	 */
	@Override
	public void create() {
		super.create();
		// Set the title
		setTitle("Assign Executable Content");
		// Set the message
		setMessage("Modify executable contents assign to this node",
				IMessageProvider.INFORMATION);

	}

	/**
	 * Adds buttons to this dialog's button bar. Only OK button is created here.
	 * 
	 * @param parent the parent {@link Composite}
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button ok = getButton(IDialogConstants.OK_ID);
		ok.setText("OK");
		setButtonLayoutData(ok);
	}

	/**
	 * Create contents of the dialog. Here is where all the magic happens. All visual components are created here.
	 * 
	 * @param parent The parent composite to contain the dialog area
	 * @return the dialog area control
	 */
	@Override
	protected Control createDialogArea(Composite parent) {

		//The main area
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		if(callingObject instanceof Transition) {
			Composite composite_11 = new Composite(container, SWT.NONE);
			composite_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			composite_11.setLayout(new GridLayout(6, false));
			GridData gd_composite_11 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			gd_composite_11.widthHint = 742;
			composite_11.setLayoutData(gd_composite_11);
			formToolkit.adapt(composite_11);
			formToolkit.paintBordersFor(composite_11);
			
			Label lblNewLabel_6 = new Label(composite_11, SWT.NONE);
			formToolkit.adapt(lblNewLabel_6, true, true);
			lblNewLabel_6.setText("Transition target:");
			
			combo_1 = new Combo(composite_11, SWT.NONE);
			combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			formToolkit.adapt(combo_1);
			formToolkit.paintBordersFor(combo_1);
			
			Dialogue dialogue = null;

			for (EObject bo : fp
					.getDiagramTypeProvider().getDiagram().getLink()
					.getBusinessObjects()) {
				if (bo instanceof Dialogue) {
					dialogue = (Dialogue) bo;
				}
			}
			// Holders
			ArrayList<String> targetState = new ArrayList<>();
			targetStates_ = new BasicEList<>();
			// Get the target states
			getAllTargetStates(dialogue, targetState, targetStates_);
			
			Object[] sArr = targetState.toArray();
			String[] ITEMS = Arrays.copyOf(sArr,sArr.length,String[].class);
			combo_1.setItems(ITEMS);
			int selId = 0;
			for(int i=0; i < targetState.size();++i) {
				if(targetStates_.get(i).equals(((Transition) callingObject).getTarget()))
					selId = i;
			}
			combo_1.select(selId);
		}
		
		SashForm sashForm = new SashForm(container, SWT.NONE);
		sashForm.setSashWidth(2);
		sashForm.setBackground(SWTResourceManager .getColor(SWT.COLOR_WIDGET_BACKGROUND));
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,1));
		formToolkit.adapt(sashForm);
		formToolkit.paintBordersFor(sashForm);
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.widthHint = 96;

		Composite composite_3 = formToolkit.createComposite(sashForm, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(composite_3);
		GridLayout gl_composite_3 = new GridLayout(1, false);
		gl_composite_3.marginHeight = 0;
		gl_composite_3.verticalSpacing = 0;
		gl_composite_3.horizontalSpacing = 2;
		composite_3.setLayout(gl_composite_3);

		//If the parent object is not of type WaitForEvent, create one type of view
		if (!(callingObject instanceof WaitForEvent)) {

			Composite composite_7 = formToolkit.createComposite(composite_3,SWT.NONE);
			composite_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			GridLayout gl_composite_7 = new GridLayout(2, false);
			gl_composite_7.horizontalSpacing = 0;
			gl_composite_7.marginTop = 5;
			gl_composite_7.marginHeight = 0;
			gl_composite_7.marginWidth = 0;
			gl_composite_7.verticalSpacing = 0;
			composite_7.setLayout(gl_composite_7);
			GridData gd_composite_7 = new GridData(SWT.FILL, SWT.FILL, true,false, 1, 1);
			gd_composite_7.heightHint = 33;
			composite_7.setLayoutData(gd_composite_7);
			formToolkit.paintBordersFor(composite_7);

			Label lblNewLabel = formToolkit.createLabel(composite_7,"Executable Content", SWT.NONE);
			lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

			Composite composite_8 = formToolkit.createComposite(composite_7, SWT.NONE);
			composite_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			GridLayout gl_composite_8 = new GridLayout(2, false);
			gl_composite_8.horizontalSpacing = 2;
			gl_composite_8.marginWidth = 0;
			gl_composite_8.marginHeight = 0;
			composite_8.setLayout(gl_composite_8);
			composite_8.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, true, 1, 1));
			formToolkit.paintBordersFor(composite_8);

			//Create the delete button and the selection listener of the button
			deleteExecutableContent = formToolkit.createButton(composite_8, "", SWT.NONE);
			deleteExecutableContent.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (table.getSelectionIndex() > -1) {
						final EObject ec = execContentEList.get(table.getSelectionIndex());
						final PictogramElement pe = fp.getPictogramElementForBusinessObject(ec);

						if (pe != null) {
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(pe);
							domain.getCommandStack().execute(
									new RecordingCommand(domain) {
										@Override
										public void doExecute() {
											DeleteContext dc = new DeleteContext(pe);
											IDeleteFeature df = fp.getDeleteFeature(dc);
											if (df.canExecute(dc)) {
												df.execute(dc);
											}
										}
									});
						} else {
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
							domain.getCommandStack().execute(
									new RecordingCommand(domain) {
										@Override
										public void doExecute() {
											execContentEList.remove(table.getSelectionIndex());
										}
									});

						}
						if (callingObject instanceof Transition) {
							if (((Transition) callingObject).getOnTrigger().isEmpty()
									&& ((Transition) callingObject).getEvent() == null) {
								resetTransitionDisplay((Transition) callingObject);
							}
						}
						tableViewer.refresh();
					}
				}
			});
			deleteExecutableContent.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/close.png"));

			//Create the Add Button
			Button addExecutableContent = formToolkit.createButton(composite_8,"", SWT.NONE);
			addExecutableContent.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			addExecutableContent.setSize(28, 26);
			addExecutableContent.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					tableViewer.add(new Object());
					final TableItem item = table.getItem(table.getItemCount() - 1);
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
						@Override
						public void widgetSelected(SelectionEvent event) {
							boolean canCreate = true;
							CreateContext cc = new CreateContext();
							ICreateFeature cf = null;
							String toCreate = "";

							if (targetContainer != null) {
								cc.setTargetContainer(targetContainer);
							}
							switch (combo.getText()) {
							case "Send":
								if (targetContainer != null) {
									cf = new CreateSendFeature(fp);
								}
								toCreate = "Send";
								break;
							case "Raise":
								if (targetContainer != null) {
									cf = new CreateRaiseFeature(fp);
								}
								toCreate = "Raise";
								break;
							case "Log":
								if (targetContainer != null) {
									cf = new CreateLogFeature(fp);
								}
								toCreate = "Log";
								break;
							case "Assign":
								if (targetContainer != null) {
									cf = new CreateAssignFeature(fp);
								}
								toCreate = "Assign";
								break;
							case "Delay":
								if (targetContainer != null) {
									cf = new CreateDelayFeature(fp);
								}
								toCreate = "Delay";
								break;
							case "If":
								if (targetContainer != null) {
									cf = new CreateExecIfFeature(fp);
								}
								toCreate = "If";
								break;
							default:
								canCreate = false;
								break;
							}

							//IF it can create
							if (canCreate) {
								//And the create feature is available
								if (targetContainer != null && cf.canCreate(cc)) {
									cf.execute(cc);
								} else { 
									// There is no create feature. Create the object manually
									if (callingObject instanceof Transition) {
										switch (toCreate) {
										case "Send":
											TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(callingObject);
											domain.getCommandStack().execute(
													new RecordingCommand(domain) {
														@Override
														public void doExecute() {
															Send send = DialogueFactory.eINSTANCE.createSend();
															((Transition) callingObject).getOnTrigger().add(send);
															execContentEList.add(send);
														}
													});
											break;
										case "Raise":
											TransactionalEditingDomain domain2 = TransactionUtil.getEditingDomain(callingObject);
											domain2.getCommandStack().execute(
													new RecordingCommand(domain2) {
														@Override
														public void doExecute() {
															Raise raise = DialogueFactory.eINSTANCE.createRaise();
															((Transition) callingObject).getOnTrigger().add(raise);
															execContentEList.add(raise);
														}
													});
											break;

										case "Log":
											TransactionalEditingDomain domain3 = TransactionUtil.getEditingDomain(callingObject);
											domain3.getCommandStack().execute(
													new RecordingCommand(domain3) {
														@Override
														public void doExecute() {
															Log log = DialogueFactory.eINSTANCE.createLog();
															((Transition) callingObject).getOnTrigger().add(log);
															execContentEList.add(log);
														}
													});
											break;

										case "Assign":
											TransactionalEditingDomain domain4 = TransactionUtil.getEditingDomain(callingObject);
											domain4.getCommandStack().execute(
													new RecordingCommand(domain4) {
														@Override
														public void doExecute() {
															Assign assign = DialogueFactory.eINSTANCE.createAssign();
															((Transition) callingObject).getOnTrigger().add(assign);
															execContentEList.add(assign);
														}
													});
											break;

										case "Delay":
											TransactionalEditingDomain domain5 = TransactionUtil.getEditingDomain(callingObject);
											domain5.getCommandStack().execute(
													new RecordingCommand(domain5) {
														@Override
														public void doExecute() {
															Delay delay = DialogueFactory.eINSTANCE.createDelay();
															((Transition) callingObject).getOnTrigger().add(delay);
															execContentEList.add(delay);
														}
													});
											break;

										case "If":
											TransactionalEditingDomain domain7 = TransactionUtil.getEditingDomain(callingObject);
											domain7.getCommandStack().execute(
													new RecordingCommand(domain7) {
														@Override
														public void doExecute() {
															If iff = DialogueFactory.eINSTANCE.createIf();
															((Transition) callingObject).getOnTrigger().add(iff);
															execContentEList.add(iff);
														}
													});
											break;
										}

										changeTransitionDisplay((Transition) callingObject);
									}

								}

								//Remove the artificial blank object from the table
								tableViewer.remove(table.getItemCount() - 1);
								//And refresh the table
								tableViewer.refresh();

								//Seletct the last added element
								table.setTopIndex(table.getItemCount());
								table.select(table.getItemCount() - 1);

							}
							combo.dispose();
						}
					});

				}
			});
			addExecutableContent.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue","icons/add.png"));
			//End Add button code


			TableColumnLayout layout = new TableColumnLayout();
			Composite composite = new Composite(composite_3, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,true, 1, 1));
			formToolkit.adapt(composite);
			formToolkit.paintBordersFor(composite);

			tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
			table = tableViewer.getTable();
			table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
			formToolkit.paintBordersFor(table);

			executableContentColumn = new TableViewerColumn(tableViewer, SWT.NONE);
			TableColumn tblclmnNewColumn = executableContentColumn.getColumn();
			tblclmnNewColumn.setWidth(100);
			composite.setLayout(layout);

			// 4
			layout.setColumnData(tblclmnNewColumn, new ColumnWeightData(30));

			tableViewer.setContentProvider(new ModelContentProvider());
			tableViewer.setLabelProvider(new ModelLabelProvider());

			tableViewer.setInput(execContentEList);

			final Transfer[] types = new Transfer[] { TextTransfer.getInstance() };

			//Enable drag and drop to allow re-ordering of the Executable content objects
			DragSource source = new DragSource(table, DND.DROP_MOVE);
			source.setTransfer(types);
			final TableItem[] dragSourceItem = new TableItem[1];
			final Integer[] selectedIndex = new Integer[1];

			source.addDragListener(new DragSourceListener() {
				@Override
				public void dragStart(DragSourceEvent event) {
					TableItem[] selection = table.getSelection();
					selectedIndex[0] = table.getSelectionIndex();
					event.doit = true;
					dragSourceItem[0] = selection[0];

					if (copyContentList == null) {
						copyContentList = new ArrayList<>();
					}

					// Create a copy of the list for ordering
					for (int i = 0; i < execContentEList.size(); i++) {
						copyContentList.add(execContentEList.get(i));
					}
				}

				@Override
				public void dragSetData(DragSourceEvent event) {
					if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
						String[] tmp = new String[2];
						tmp[0] = dragSourceItem[0].getText();
						tmp[1] = selectedIndex[0].toString();
						event.data = selectedIndex[0].toString();
					}
				}

				@Override
				public void dragFinished(DragSourceEvent event) {
					if (event.detail == DND.DROP_MOVE) {
						//Do nothing
					}
				}

			});

			DropTarget target = new DropTarget(table, DND.DROP_MOVE);
			target.setTransfer(types);

			target.addDropListener(new DropTargetListener() {
				@Override
				public void dragEnter(DropTargetEvent event) {
					event.feedback = DND.FEEDBACK_EXPAND | DND.FEEDBACK_SCROLL;
					if (event.item != null) {
						event.feedback |= DND.FEEDBACK_INSERT_BEFORE | DND.FEEDBACK_INSERT_AFTER;
					}

				}

				@Override
				public void dragLeave(DropTargetEvent event) {
				}

				@Override
				public void dragOperationChanged(DropTargetEvent event) {
					event.feedback = DND.FEEDBACK_EXPAND | DND.FEEDBACK_SCROLL;
					if (event.item != null) {
						event.feedback |= DND.FEEDBACK_INSERT_BEFORE | DND.FEEDBACK_INSERT_AFTER;
					}

				}

				@Override
				public void dragOver(DropTargetEvent event) {
					event.feedback = DND.FEEDBACK_EXPAND | DND.FEEDBACK_SCROLL;
					if (event.item != null) {
						event.feedback |= DND.FEEDBACK_INSERT_BEFORE | DND.FEEDBACK_INSERT_AFTER;

					}
				}

				@Override
				public void drop(DropTargetEvent event) {
					if (event.data == null) {
						event.detail = DND.DROP_NONE;
						return;
					}
					//Save the original index
					int index2 = Integer.parseInt((String) event.data);

					//Find the drop point
					Point p = event.display.map(null, table, event.x, event.y);
					TableItem dropItem = table.getItem(p);

					//Find the index of the drop item
					int index = dropItem == null ? table.getItemCount() : table.indexOf(dropItem);

					//Adjust the index to fall in borders from [0 - list size]
					index--;
					if (index < 0) {
						index = 0;
					}
					if (index > execContentEList.size() - 1) {
						index = execContentEList.size() - 1;
					}

					//Save the object to delete
					EObject toDelete = execContentEList.get(index2);

					// Remove the object first
					copyContentList.remove(toDelete);

					// Than add it to the desired position
					copyContentList.add(index, toDelete);

					// Copy the list to the original list
					ECollections.setEList(execContentEList, copyContentList);

					// gc
					copyContentList = null;

					// refresh the table viewer
					tableViewer.refresh();

				}

				@Override
				public void dropAccept(DropTargetEvent event) {
				}

			});

			if (table.getSelectionIndex() < 0) {
				deleteExecutableContent.setEnabled(false);
			}

		}
		// END IF for if(!(callingObject instanceof CondEvent))


		final StackLayout sl_stackComposite = new StackLayout();

		Composite composite_1 = formToolkit.createComposite(sashForm, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		Label lblNewLabel_1 = formToolkit.createLabel(composite_1, "Edit properties:", SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		final Composite stackComposite = new Composite(composite_1, SWT.NONE);
		stackComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		stackComposite.setLayout(sl_stackComposite);
		stackComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(stackComposite);
		formToolkit.paintBordersFor(stackComposite);

		final Composite defaultComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		defaultComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(defaultComposite);
		defaultComposite.setLayout(new GridLayout(1, false));

		sl_stackComposite.topControl = defaultComposite;

		Label lblNewLabel_3 = formToolkit.createLabel(defaultComposite, "Select assigned Executable content from the left panel to see its properties", SWT.WRAP);
		GridData gd_lblNewLabel_3 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_lblNewLabel_3.widthHint = 343;
		gd_lblNewLabel_3.heightHint = 50;
		lblNewLabel_3.setLayoutData(gd_lblNewLabel_3);
		lblNewLabel_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		final Composite logComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		logComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(logComposite);
		logComposite.setLayout(new GridLayout(2, false));

		Label lblNewLabel_2 = formToolkit.createLabel(logComposite, "Expression:", SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		expression1Txt = formToolkit.createText(logComposite, "New Text", SWT.NONE);
		expression1Txt.setText("");
		expression1Txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving on focus out
		expression1Txt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				// saveElementOnFocusOut();
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Log) {
							if (expression1Txt.getText() != "") {
								((Log) ec).setExpression(expression1Txt.getText());
							}
						}
					}
				});
			}
		});

		Label lblLabel = formToolkit.createLabel(logComposite, "Label:", SWT.NONE);
		lblLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		labelTxt = formToolkit.createText(logComposite, "New Text", SWT.NONE);
		labelTxt.setText("");
		labelTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		labelTxt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				// saveElementOnFocusOut();
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Log) {
							if (labelTxt.getText() != "") {
								((Log) ec).setLabel(labelTxt.getText());
							}
						}
					}
				});
			}
		});

		final Composite assignComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		assignComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(assignComposite);
		assignComposite.setLayout(new GridLayout(2, false));

		Label lblExpression = formToolkit.createLabel(assignComposite, "Expression:", SWT.NONE);
		lblExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExpression.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		expression2Txt = formToolkit.createText(assignComposite, "New Text", SWT.NONE);
		expression2Txt.setText("");
		expression2Txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		expression2Txt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				// saveElementOnFocusOut();
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Assign) {
							if (expression2Txt.getText() != "") {
								((Assign) ec).setExpression(expression2Txt.getText());
							}
						}
					}
				});
			}
		});

		Label lblTo = formToolkit.createLabel(assignComposite, "To:", SWT.NONE);
		lblTo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblTo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		toTxt = formToolkit.createText(assignComposite, "New Text", SWT.NONE);
		toTxt.setText("");
		toTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		toTxt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				// saveElementOnFocusOut();
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Assign) {
							if (toTxt.getText() != "") {
								((Assign) ec).setTo(toTxt.getText());
							}
						}
					}
				});
			}
		});

		final Composite delayComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		delayComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(delayComposite);
		delayComposite.setLayout(new GridLayout(2, false));

		Label lblNewLabel_4 = formToolkit.createLabel(delayComposite, "Duration:", SWT.NONE);
		lblNewLabel_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		durationTxt = formToolkit.createText(delayComposite, "New Text", SWT.NONE);
		durationTxt.setText("");
		durationTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		durationTxt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				// saveElementOnFocusOut();
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Delay) {
							if (durationTxt.getText() != "") {
								try {
									errorLbl.setVisible(false);
									BInteger value = BInteger.valueOf(durationTxt.getText());
									((Delay) ec).setDuration(value);
								} catch (NumberFormatException e1) {
									errorLbl.setVisible(true);
								}
							}
						}
					}
				});
			}
		});

		new Label(delayComposite, SWT.NONE);

		errorLbl = formToolkit.createLabel(delayComposite, "Please enter a numerical value!", SWT.NONE);
		errorLbl.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		errorLbl.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		errorLbl.setVisible(false);

		final Composite sendComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		sendComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(sendComposite);
		sendComposite.setLayout(new GridLayout(1, false));

		Composite composite = formToolkit.createComposite(sendComposite, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		composite.setLayout(new GridLayout(2, false));
		formToolkit.paintBordersFor(composite);

		btnAddOutputAct = new Button(composite, SWT.NONE);

		btnAddOutputAct.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Monitor.png"));
		formToolkit.adapt(btnAddOutputAct, true, true);
		btnAddOutputAct.setText("Add Output Act");

		btnAddUpdateDeviceMode = new Button(composite, SWT.NONE);

		btnAddUpdateDeviceMode.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/UpdateDevice.png"));
		formToolkit.adapt(btnAddUpdateDeviceMode, true, true);
		btnAddUpdateDeviceMode.setText("Add Update Device Mode");

		final Composite composite_9 = new Composite(sendComposite, SWT.NONE);
		composite_9.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite_9);
		formToolkit.paintBordersFor(composite_9);
		TreeColumnLayout tcl_composite_9 = new TreeColumnLayout();
		composite_9.setLayout(tcl_composite_9);

		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

		//Create the send tree viewer
		sendTreeViewer = new TreeViewer(composite_9, SWT.BORDER) {
			@Override
			public ISelection getSelection() {
				IStructuredSelection selection = (IStructuredSelection) super.getSelection();

				if (selection.getFirstElement() == null)
					return StructuredSelection.EMPTY;
				IItemPropertySource source = (IItemPropertySource) adapterFactory.adapt(selection.getFirstElement(), IItemPropertySource.class);

				return new StructuredSelection(new UnwrappingPropertySource(selection.getFirstElement(), source));
			}
		};

		//Add change listener on the tree viewer
		sendTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				PropertySheet sheet = (PropertySheet) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.ui.views.PropertySheet");
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				sheet.selectionChanged(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor(), event.getSelection());

				createContextMenuFor(sendTreeViewer, (EObject) sendTreeViewer.getInput());
			}
		});

		Tree sendTree = sendTreeViewer.getTree();
		sendTree.setHeaderVisible(true);
		formToolkit.paintBordersFor(sendTree);

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(sendTreeViewer, SWT.NONE);
		final TreeColumn trclmnOutput = treeViewerColumn.getColumn();

		tcl_composite_9.setColumnData(trclmnOutput, new ColumnPixelData(380, false, false));
		trclmnOutput.setText("Output Request");
		sendTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		sendTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		final Composite raiseComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		raiseComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(raiseComposite);
		raiseComposite.setLayout(new GridLayout(2, false));

		Label lblThisExecutableContent = formToolkit.createLabel(raiseComposite, "Event:", SWT.NONE);
		lblThisExecutableContent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblThisExecutableContent.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		eventTxt = formToolkit.createText(raiseComposite, "New Text", SWT.NONE);
		eventTxt.setText("");
		eventTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		eventTxt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof Raise) {
							if (eventTxt.getText() != "") {
								((Raise) ec).setEvent(eventTxt.getText());
							}

						}
					}
				});
			}
		});

		/***** IF Composite ****/
		final Composite ifComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		ifComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(ifComposite);
		ifComposite.setLayout(new GridLayout(1, false));

		Composite composite_2 = formToolkit.createComposite(ifComposite, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		composite_2.setLayout(new GridLayout(2, false));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(composite_2);

		Label lblNewLabel_5 = formToolkit.createLabel(composite_2, "Condition:", SWT.NONE);
		lblNewLabel_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		ifCondTxt = formToolkit.createText(composite_2, "", SWT.NONE);
		ifCondTxt.setText("");
		ifCondTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		ifCondTxt.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				final EObject ec = execContentEList.get(table.getSelectionIndex());
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (ec instanceof If) {
							if (ifCondTxt.getText() != "") {
								((If) ec).setCondition(ifCondTxt.getText());
							}
						}
					}
				});
			}
		});

		Composite composite_8 = formToolkit.createComposite(ifComposite, SWT.NONE);
		composite_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		composite_8.setLayout(new GridLayout(8, false));
		GridData gd_composite_8 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite_8.heightHint = 38;
		composite_8.setLayoutData(gd_composite_8);
		formToolkit.paintBordersFor(composite_8);

		btnAssign = new Button(composite_8, SWT.NONE);

		btnAssign.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Assign.gif"));
		formToolkit.adapt(btnAssign, true, true);
		btnAssign.setText("Assign");

		btnLog = new Button(composite_8, SWT.NONE);

		btnLog.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Log.gif"));
		formToolkit.adapt(btnLog, true, true);
		btnLog.setText("Log");

		btnDeley = new Button(composite_8, SWT.NONE);

		btnDeley.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Delay.gif"));
		formToolkit.adapt(btnDeley, true, true);
		btnDeley.setText("Deley");

		btnRaise = new Button(composite_8, SWT.NONE);

		btnRaise.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Raise.gif"));
		formToolkit.adapt(btnRaise, true, true);
		btnRaise.setText("Raise");

		btnSend = new Button(composite_8, SWT.NONE);

		btnSend.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Send.gif"));
		formToolkit.adapt(btnSend, true, true);
		btnSend.setText("Send");

		btnIf = new Button(composite_8, SWT.NONE);

		btnIf.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/If.gif"));
		formToolkit.adapt(btnIf, true, true);
		btnIf.setText("If");

		btnElseIf = new Button(composite_8, SWT.NONE);

		btnElseIf.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/ElseIf.gif"));
		formToolkit.adapt(btnElseIf, true, true);
		btnElseIf.setText("Else If");

		btnElse = new Button(composite_8, SWT.NONE);

		btnElse.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/Else.gif"));
		formToolkit.adapt(btnElse, true, true);
		btnElse.setText("Else");

		Composite contentComposite = formToolkit.createComposite(ifComposite, SWT.NONE);
		contentComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		contentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		formToolkit.paintBordersFor(contentComposite);
		TreeColumnLayout tcl_contentComposite = new TreeColumnLayout();
		contentComposite.setLayout(tcl_contentComposite);

		ifContenttreeViewer = new TreeViewer(contentComposite, SWT.BORDER) {
			@Override
			public ISelection getSelection() {
				IStructuredSelection selection = (IStructuredSelection) super.getSelection();

				if (selection.getFirstElement() == null)
					return StructuredSelection.EMPTY;
				IItemPropertySource source = (IItemPropertySource) adapterFactory.adapt(selection.getFirstElement(), IItemPropertySource.class);

				return new StructuredSelection(new UnwrappingPropertySource(selection.getFirstElement(), source));
			}
		};

		ifContenttreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				PropertySheet sheet = (PropertySheet) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.ui.views.PropertySheet");
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				sheet.selectionChanged(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor(), event.getSelection());
			}
		});

		Tree ifContentTree = ifContenttreeViewer.getTree();
		ifContentTree.setHeaderVisible(true);
		formToolkit.paintBordersFor(ifContentTree);

		TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(ifContenttreeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn = treeViewerColumn_1.getColumn();
		trclmnNewColumn.setResizable(true);
		trclmnNewColumn.setMoveable(false);
		trclmnNewColumn.setWidth(0);
		trclmnNewColumn.setText("Content/Else/Else If");

		tcl_contentComposite.setColumnData(trclmnNewColumn, new ColumnPixelData(380, false, false));

		ifContenttreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		ifContenttreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		/************* CondEvent Composite ***************/

		final Composite condComposite = formToolkit.createComposite(stackComposite, SWT.NONE);
		condComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		formToolkit.paintBordersFor(condComposite);
		condComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		condComposite.setLayout(new GridLayout(1, false));

		Composite composite_4 = formToolkit.createComposite(condComposite, SWT.NONE);
		composite_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		composite_4.setLayout(new GridLayout(2, false));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_4.setBounds(0, 0, 64, 64);
		formToolkit.paintBordersFor(composite_4);

		Label lblNewLabel_7 = formToolkit.createLabel(composite_4, "Condition:", SWT.NONE);
		lblNewLabel_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblNewLabel_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtCondCond = formToolkit.createText(composite_4, "New Text", SWT.NONE);
		txtCondCond.setText("");
		txtCondCond.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Add FocusOut listener to do saving
		txtCondCond.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event e) {
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(condEvent);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						if (txtCondCond.getText() != "") {
							condEvent.setCondition(txtCondCond.getText());
						}
					}
				});
			}
		});

		Composite composite_7 = formToolkit.createComposite(condComposite, SWT.NONE);
		composite_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		composite_7.setLayout(new GridLayout(1, false));
		GridData gd_composite_7 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite_7.heightHint = 34;
		composite_7.setLayoutData(gd_composite_7);
		formToolkit.paintBordersFor(composite_7);

		btnAddPobject = new Button(composite_7, SWT.NONE);

		formToolkit.adapt(btnAddPobject, true, true);
		btnAddPobject.setText("Add PObject");

		Composite condTreeComposite = formToolkit.createComposite(condComposite, SWT.NONE);
		condTreeComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

		condTreeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		formToolkit.paintBordersFor(condTreeComposite);
		TreeColumnLayout tcl_condTreeComposite = new TreeColumnLayout();
		condTreeComposite.setLayout(tcl_condTreeComposite);

		condTreeViewer = new TreeViewer(condTreeComposite, SWT.BORDER) {
			@Override
			public ISelection getSelection() {
				IStructuredSelection selection = (IStructuredSelection) super.getSelection();

				if (selection.getFirstElement() == null)
					return StructuredSelection.EMPTY;
				IItemPropertySource source = (IItemPropertySource) adapterFactory.adapt(selection.getFirstElement(), IItemPropertySource.class);

				return new StructuredSelection(new UnwrappingPropertySource(selection.getFirstElement(), source));
			}
		};
		condTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				PropertySheet sheet = (PropertySheet) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.ui.views.PropertySheet");
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				sheet.selectionChanged(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor(), event.getSelection());
			}
		});

		Tree condTree = condTreeViewer.getTree();
		condTree.setHeaderVisible(true);
		condTree.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		condTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,1));
		formToolkit.paintBordersFor(condTree);

		TreeViewerColumn condTreeColumnW = new TreeViewerColumn(condTreeViewer, SWT.NONE);
		TreeColumn condTreeColumn = condTreeColumnW.getColumn();
		condTreeColumn.setResizable(true);
		condTreeColumn.setMoveable(false);
		condTreeColumn.setWidth(0);
		condTreeColumn.setText("Pattern");

		tcl_condTreeComposite.setColumnData(condTreeColumn, new ColumnPixelData(380, false, false));
		sashForm.setWeights(new int[] { 175, 550 });

		condTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		condTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		if (callingObject instanceof Transition || callingObject instanceof WaitForEvent) {

			Composite composite_6 = formToolkit.createComposite(composite_3, SWT.NONE);
			composite_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			GridLayout gl_composite_6 = new GridLayout(2, false);
			gl_composite_6.marginHeight = 0;
			gl_composite_6.marginWidth = 0;
			composite_6.setLayout(gl_composite_6);
			GridData gd_composite_6 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
			gd_composite_6.heightHint = 30;
			composite_6.setLayoutData(gd_composite_6);
			formToolkit.paintBordersFor(composite_6);

			Label lblCondEvent = formToolkit.createLabel(composite_6, "Condition Event", SWT.NONE);
			GridData gd_lblCondEvent = new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1);
			gd_lblCondEvent.widthHint = 100;
			lblCondEvent.setLayoutData(gd_lblCondEvent);
			lblCondEvent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));

			Composite composite_10 = formToolkit.createComposite(composite_6, SWT.NONE);
			composite_10.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			GridLayout gl_composite_10 = new GridLayout(2, false);
			gl_composite_10.marginBottom = 2;
			gl_composite_10.marginWidth = 0;
			gl_composite_10.marginHeight = 0;
			gl_composite_10.horizontalSpacing = 2;
			composite_10.setLayout(gl_composite_10);
			composite_10.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, true, true, 1, 1));
			formToolkit.paintBordersFor(composite_10);

			Composite composite_5 = formToolkit.createComposite(composite_3, SWT.NONE);
			GridLayout gl_composite_5 = new GridLayout(1, false);
			gl_composite_5.marginTop = 5;
			gl_composite_5.marginHeight = 0;
			gl_composite_5.marginBottom = 5;
			gl_composite_5.horizontalSpacing = 0;
			gl_composite_5.marginWidth = 0;
			gl_composite_5.verticalSpacing = 0;
			// composite_5.setLayout(gl_composite_5);
			GridData gd_composite_5 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
			gd_composite_5.heightHint = 23;
			gd_composite_5.minimumHeight = 50;
			// composite_5.setLayoutData(gd_composite_5);
			composite_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
			formToolkit.adapt(composite_5);
			formToolkit.paintBordersFor(composite_5);

			TableColumnLayout condEventLayout = new TableColumnLayout();
			composite_5.setLayoutData(gd_composite_5);

			condEventTableViewer = new TableViewer(composite_5, SWT.BORDER | SWT.FULL_SELECTION);
			condEventTable = condEventTableViewer.getTable();
			condEventTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			formToolkit.paintBordersFor(condEventTable);

			TableViewerColumn condEventColumn = new TableViewerColumn(condEventTableViewer, SWT.NONE);
			TableColumn tblclmnNewColumn_1 = condEventColumn.getColumn();
			tblclmnNewColumn_1.setWidth(100);
			composite_5.setLayout(condEventLayout);

			condEventLayout.setColumnData(tblclmnNewColumn_1, new ColumnWeightData(30));

			condEventTableViewer.setContentProvider(new ModelContentProvider());
			condEventTableViewer.setLabelProvider(new ModelLabelProvider());

			condEventTableViewer.setInput(condList);

			final Button deleteCondEvent = formToolkit.createButton(composite_10, "", SWT.NONE);

			if (condEventTable.getSelectionIndex() < 0) {
				deleteCondEvent.setEnabled(false);
			}

			deleteCondEvent.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/close.png"));

			addCondEvent = formToolkit.createButton(composite_10, "", SWT.NONE);
			addCondEvent.setSize(28, 25);
			addCondEvent.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", "icons/add.png"));

			addCondEvent.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					CreateContext cc = new CreateContext();
					ICreateFeature cf = new CreateCondEvent(fp);

					if (targetContainer != null) {
						cc.setTargetContainer(targetContainer);
					}

					if (targetContainer != null && cf.canCreate(cc)) {
						cf.execute(cc);

					} else {
						// There is no create feature. Create the
						// object manually
						if (callingObject instanceof Transition) {
							TransactionalEditingDomain domain6 = TransactionUtil.getEditingDomain(callingObject);
							domain6.getCommandStack().execute(
									new RecordingCommand(domain6) {
										@Override
										public void doExecute() {
											CondEvent ce = DialogueFactory.eINSTANCE.createCondEvent();
											((Transition) callingObject).setEvent(ce);
										}
									});

							changeTransitionDisplay((Transition) callingObject);
						}

					}

					if (callingObject instanceof Transition) {
						condEvent = ((Transition) callingObject).getEvent();
					}
					if (callingObject instanceof WaitForEvent) {
						condEvent = ((WaitForEvent) callingObject).getEvent();
					}

					if (condEvent != null) {
						condList.add(condEvent);
					}

					condEventTableViewer.refresh();

					condEventTable.setTopIndex(condEventTable.getItemCount());
					condEventTable.select(condEventTable.getItemCount() - 1);
					addCondEvent.setEnabled(false);
				}
			});
			if (condEvent != null) {
				addCondEvent.setEnabled(false);
			}

			//Delete the CondEvent
			deleteCondEvent.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {

					if (condEventTable.getSelectionIndex() > -1) {

						final PictogramElement pe = fp.getPictogramElementForBusinessObject(condEvent);
						if (pe != null) {
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(pe);
							domain.getCommandStack().execute(
									new RecordingCommand(domain) {
										@Override
										public void doExecute() {
											DeleteContext dc = new DeleteContext(pe);
											IDeleteFeature df = fp.getDeleteFeature(dc);
											if (df.canExecute(dc)) {
												df.execute(dc);
												condList.clear();
												addCondEvent.setEnabled(true);
												deleteCondEvent.setEnabled(false);
											} else {
												// The CondEvent is on Transition, and don't have shape to execute remove it manually
												condList.remove(0);
												condList.clear();
												addCondEvent.setEnabled(true);
												deleteCondEvent.setEnabled(false);
											}
										}
									});
						} else {
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(callingObject);
							domain.getCommandStack().execute(
									new RecordingCommand(domain) {
										@Override
										public void doExecute() { 
											if (callingObject instanceof Transition) {
												((Transition) callingObject).setEvent(null);
											}
										}
									});

							condList.remove(0);
							condList.clear();
							addCondEvent.setEnabled(true);
							deleteCondEvent.setEnabled(false);
						}
						if (callingObject instanceof Transition) {
							if (((Transition) callingObject).getOnTrigger().isEmpty() && ((Transition) callingObject).getEvent() == null) {
								resetTransitionDisplay((Transition) callingObject);
							}
						}
						condEventTableViewer.refresh();
					}
				}
			});

			condEventTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				// This ensures that we handle selections correctly.
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (condEventTable.getSelectionIndex() > -1) {
						deleteCondEvent.setEnabled(true);
						IStructuredSelection selection = (IStructuredSelection) condEventTableViewer.getSelection();
						if (selection != null) {
							final Object obj = selection.getFirstElement();
							if (obj instanceof CondEvent) {
								sl_stackComposite.topControl = condComposite;
								CondEvent condEvent = (CondEvent) obj;
								if (condEvent.getCondition() != null) {
									txtCondCond.setText(condEvent.getCondition());
								}

								btnAddPobject
								.addSelectionListener(new SelectionAdapter() {
									@Override
									public void widgetSelected(SelectionEvent e) {

										TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
										domain.getCommandStack().execute(
												new RecordingCommand(domain) {
													@Override
													public void doExecute() {
														final PObject po = PatternFactory.eINSTANCE.createPObject();
														((CondEvent) obj).getPattern().add(po);
													}
												});
									}
								});

								condTreeViewer.setInput(obj);

								createContextMenuFor(condTreeViewer, (CondEvent) obj);
							} else {
								sl_stackComposite.topControl = defaultComposite;
							}

							stackComposite.layout();

						}
					}
				}
			});
		}
		if (tableViewer != null) {

			//What happens when different kind of object is selected in the tree
			tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				// This ensures that we handle selections correctly.
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					deleteExecutableContent.setEnabled(true);

					IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
					if (selection != null) {
						final Object obj = selection.getFirstElement();
						if (obj instanceof Log) {
							Log log = (Log) obj;
							sl_stackComposite.topControl = logComposite;
							if (log.getExpression() != null) {
								expression1Txt.setText(log.getExpression());
							}
							if (log.getLabel() != null) {
								labelTxt.setText(log.getLabel());
							}

						} else if (obj instanceof Send) {
							sl_stackComposite.topControl = sendComposite;

							sendTreeViewer.setInput(obj);
							createContextMenuFor(sendTreeViewer, (Send) obj);

							final Send send = (Send) obj;
							if (send.getOutputRequest() == null) {
								trclmnOutput.setText("Output Request (Right Click to add new child)");

							} else {
								trclmnOutput.setText("Output Request");
							}

							btnAddOutputAct.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {

									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(new RecordingCommand(domain) {
										@Override
										public void doExecute() {
											final OutputAct oa = IoFactory.eINSTANCE.createOutputAct();
											((Send) obj).setOutputRequest(oa);
											btnAddUpdateDeviceMode.setEnabled(false);
											btnAddOutputAct.setEnabled(false);
										}
									});
								}
							});

							btnAddUpdateDeviceMode.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {

									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final UpdateDeviceMode udm = IoFactory.eINSTANCE.createUpdateDeviceMode();
													((Send) obj).setOutputRequest(udm);
													btnAddUpdateDeviceMode.setEnabled(false);
													btnAddOutputAct.setEnabled(false);
												}
											});
								}

							});

							if (((Send) obj).getOutputRequest() != null) {
								btnAddUpdateDeviceMode.setEnabled(false);
								btnAddOutputAct.setEnabled(false);
							} else {
								btnAddUpdateDeviceMode.setEnabled(true);
								btnAddOutputAct.setEnabled(true);
							}

						} else if (obj instanceof Raise) {
							sl_stackComposite.topControl = raiseComposite;
							if (((Raise) obj).getEvent() != null) {
								eventTxt.setText(((Raise) obj).getEvent());
							}
						} else if (obj instanceof Assign) {
							Assign assign = (Assign) obj;
							sl_stackComposite.topControl = assignComposite;

							if (assign.getExpression() != null) {
								expression2Txt.setText(assign.getExpression());
							}
							if (assign.getTo() != null) {
								toTxt.setText(assign.getTo());
							}

						} else if (obj instanceof Delay) {
							sl_stackComposite.topControl = delayComposite;

							Delay delay = (Delay) obj;
							if (delay.getDuration() != null) {
								durationTxt.setText(delay.getDuration()+ "");
							}

						} else if (obj instanceof If) {
							sl_stackComposite.topControl = ifComposite;

							btnAssign.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final Assign as = DialogueFactory.eINSTANCE.createAssign();
													((If) obj).getContent().add(as);
												}
											});
								}
							});
							btnLog.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final Log log = DialogueFactory.eINSTANCE.createLog();
													((If) obj).getContent().add(log);
												}
											});
								}
							});
							btnDeley.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(
										SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final Delay delay = DialogueFactory.eINSTANCE.createDelay();
													((If) obj).getContent().add(delay);
												}
											});
								}
							});
							btnRaise.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final Raise raise = DialogueFactory.eINSTANCE.createRaise();
													((If) obj).getContent().add(raise);
												}
											});
								}
							});
							btnSend.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final Send send = DialogueFactory.eINSTANCE.createSend();
													((If) obj).getContent().add(send);
												}
											});
								}
							});
							btnIf.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(
										SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final If iff = DialogueFactory.eINSTANCE.createIf();
													((If) obj).getContent().add(iff);
												}
											});
								}
							});
							btnElseIf.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													final ElseIf eif = DialogueFactory.eINSTANCE.createElseIf();
													((If) obj).getElseIf().add(eif);
												}
											});
								}
							});
							btnElse.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(obj);
									domain.getCommandStack().execute(new RecordingCommand(domain) {
										@Override
										public void doExecute() {
											final Else els = DialogueFactory.eINSTANCE.createElse();
											((If) obj).setElse(els);
											btnElse.setEnabled(false);
										}
									});
								}
							});

							if (((If) obj).getElse() != null) {
								btnElse.setEnabled(false);
							} else {
								btnElse.setEnabled(true);
							}

							ifContenttreeViewer.setInput(obj);

							createContextMenuFor(ifContenttreeViewer, (If) obj);

							If iff = (If) obj;
							if (iff.getCondition() != null) {
								ifCondTxt.setText(iff.getCondition());
							}

						} else if (obj instanceof CondEvent) {
							sl_stackComposite.topControl = condComposite;

							condTreeViewer.setInput(obj);

							createContextMenuFor(condTreeViewer, (CondEvent) obj);

							CondEvent condEvent = (CondEvent) obj;
							if (condEvent.getCondition() != null) {
								txtCondCond.setText(condEvent.getCondition());
							}

						} else {
							sl_stackComposite.topControl = defaultComposite;
						}

						stackComposite.layout();
					}

				}
			});

		} // end if (callingObject instanceof Transition || callingObject
		// instanceof WaitForEvent) {

		return area;

	}

	/**
	 * Return the initial size of the dialog.
	 */

	@Override
	protected Point getInitialSize() {
		return new Point(745, 480);
	}

	/**
	 * Notifies that the ok button of this dialog has been pressed. 
	 */
	@Override
	protected void okPressed() {
		storeTransitionTarget();
		this.close();
	}
	/**
	 * 
	 */
	private void storeTransitionTarget() {
		if(callingObject instanceof Transition) {
			if(combo_1.getSelectionIndex() > -1) {
				final int selId = combo_1.getSelectionIndex();
				if(selId < targetStates_.size()) {
					if(!((Transition) callingObject).getTarget().equals(targetStates_.get(selId))) {
						TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(callingObject);
						domain.getCommandStack().execute(
							new RecordingCommand(domain) {
								@Override
								public void doExecute() { 
									((Transition) callingObject).setTarget((TargetState)targetStates_.get(selId));
								}
							});
					}
				}
			}
		}
	}
	
	/**
	 * Create context menu for a tree viewer
	 * 
	 * @param viewer the tree viewer
	 * @param eObject the object that triggers the context meny
	 */
	protected void createContextMenuFor(final TreeViewer viewer, final EObject eObject) {
		final MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(viewer.getControl());

		//new children
		final MenuManager childMngr = new MenuManager("New Child", Activator.getImageDescriptor("icons/Child.png"), "newChild");
		childMngr.setRemoveAllWhenShown(true);
		menuMgr.add(childMngr);

		//new sibling
		final MenuManager siblingMngr = new MenuManager("New Sibling", Activator.getImageDescriptor("icons/Sibling.png"), "newSibling");
		siblingMngr.setRemoveAllWhenShown(true);
		menuMgr.add(siblingMngr);

		menuMgr.setRemoveAllWhenShown(false);
		final Action deleteAction = new Action("Delete", Activator.getImageDescriptor("icons/Delete.png")) {

			@Override
			public void run() {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();

				final EObject node = (EObject) ((UnwrappingPropertySource) selection.getFirstElement()).getEditableValue();
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eObject);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					public void doExecute() {
						EcoreUtil.delete(node);
						btnAddUpdateDeviceMode.setEnabled(true);
						btnAddOutputAct.setEnabled(true);
					}
				});
			}
		};

		if (viewer.getTree().getItemCount() > 0) {
			deleteAction.setEnabled(true);
		} else {
			deleteAction.setEnabled(false);
		}
		
		//Menu listener for the children menu
		childMngr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				if (viewer.getSelection().isEmpty()) {

					final EObject node = eObject;
					TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(node);
					Collection<?> children = editingDomain.getNewChildDescriptors(node, null);

					for (Object child : children) {
						CommandParameter parameter = (CommandParameter) child;
						final EObject childElement = (EObject) parameter.getValue();
						final EStructuralFeature reference = parameter.getEStructuralFeature();

						Action action = new Action(labelProvider.getText(childElement), ImageDescriptor.createFromImage(labelProvider.getImage(childElement))) {
							@Override
							public void run() {
								TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(node);
								domain.getCommandStack().execute(
										new RecordingCommand(domain) {
											@Override
											public void doExecute() {
												EObject newContent = childElement.eClass().getEPackage().getEFactoryInstance().create(childElement.eClass());
												if (reference.isMany()) {
													EList<EObject> list = (EList<EObject>) node.eGet(reference);
													list.add(newContent);
												} else {
													node.eSet(reference, newContent);
												}
												viewer.expandToLevel(node, 1);
											}
										});
							}
						};
						manager.add(action);
					}
				}

				if (viewer.getSelection() instanceof IStructuredSelection) {

					IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
					if (selection.getFirstElement() != null) {

						final EObject node = (EObject) ((UnwrappingPropertySource) selection.getFirstElement()).getEditableValue();

						TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(node);
						Collection<?> children = editingDomain.getNewChildDescriptors(node, null);

						for (Object child : children) {
							CommandParameter parameter = (CommandParameter) child;
							final EObject childElement = (EObject) parameter.getValue();
							final EStructuralFeature reference = parameter.getEStructuralFeature();

							Action action = new Action(labelProvider.getText(childElement), ImageDescriptor.createFromImage(labelProvider.getImage(childElement))) {
								@Override
								public void run() {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(node);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													EObject newContent = childElement.eClass().getEPackage().getEFactoryInstance().create(childElement.eClass());
													if (reference.isMany()) {
														EList<EObject> list = (EList<EObject>) node.eGet(reference);
														list.add(newContent);
													} else {
														node.eSet(reference,newContent);

													}
													viewer.expandToLevel(node,1);

												}
											});
								}
							};
							action.setEnabled(!(!reference.isMany() && node.eContents().size() != 0));
							manager.add(action);
						}

					}

				}
				viewer.refresh();

			}
		});

		//Menu listener for the siblings menu
		siblingMngr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				if (viewer.getSelection() instanceof IStructuredSelection) {

					IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
					if (selection.getFirstElement() != null) {

						final EObject node1 = (EObject) ((UnwrappingPropertySource) selection.getFirstElement()).getEditableValue();
						final EObject node = node1.eContainer();

						TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(node);
						Collection<?> children = editingDomain.getNewChildDescriptors(node, null);

						for (Object child : children) {
							CommandParameter parameter = (CommandParameter) child;
							final EObject childElement = (EObject) parameter.getValue();
							final EStructuralFeature reference = parameter.getEStructuralFeature();

							Action action = new Action(labelProvider.getText(childElement), ImageDescriptor.createFromImage(labelProvider.getImage(childElement))) {
								@Override
								public void run() {
									TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(node);
									domain.getCommandStack().execute(
											new RecordingCommand(domain) {
												@Override
												public void doExecute() {
													EObject newContent = childElement.eClass().getEPackage().getEFactoryInstance().create(childElement.eClass());
													if (reference.isMany()) {
														EList<EObject> list = (EList<EObject>) node.eGet(reference);
														list.add(newContent);
													} else {
														node.eSet(reference, newContent);
													}
													viewer.expandToLevel(node, 1);
												}
											});
								}
							};

							action.setEnabled(!(!reference.isMany() && !node.eContents().isEmpty()));

							if (!reference.isMany()) {
								if (reference.getName().equals("else")) {
									if (node instanceof If) {
										If iiff = (If) node;
										if (iiff.getElse() != null) {
											action.setEnabled(false);
										} else {
											action.setEnabled(true);
										}
									}
								}
							}
							manager.add(action);
						}

					}

				}
			}

		});

		menuMgr.add(new Separator());
		menuMgr.add(deleteAction);
		viewer.getControl().setMenu(menu);
	}

	/**
	 * Content provider for the {@link ExecutableContent} model
	 * 
	 * @author Dragan Milchevski
	 *
	 */
	static class ModelContentProvider implements IStructuredContentProvider {

		/**
		 * Returns the elements to display in the viewer when its input is set to the given element. 
		 * These elements can be presented as rows in a table, items in a list, etc. The result is not modified by the viewer.
		 * 
		 * @param inputElement the input element
		 * @return the array of elements to display in the viewer
		 */
		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			// The inputElement comes from view.setInput()

			if (inputElement instanceof List) {
				List<EObject> models = (List<EObject>) inputElement;
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
	 * A label provider implementation for the {@link ExecutableContent} model 
	 * 
	 * @author Dragan Milchevski
	 *
	 */
	static class ModelLabelProvider extends LabelProvider implements ITableLabelProvider {

		/**
		 * Returns the label image for the given column of the given element.
		 * @param element the object representing the entire row, or null indicating that no input object is set in the viewer
		 * @param columnIndex the zero-based index of the column in which the label appears
		 * @return Image or null if there is no image for the given object at columnIndex
		 */
		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			String imageName = "";
			if (element instanceof Send) {
				imageName = "Send";
			} else if (element instanceof Assign) {
				imageName = "Assign";
			} else if (element instanceof Raise) {
				imageName = "Raise";
			} else if (element instanceof Delay) {
				imageName = "Delay";
			} else if (element instanceof Log) {
				imageName = "Log";
			} else if (element instanceof If) {
				imageName = "If";
			} else if (element instanceof CondEvent) {
				imageName = "CondEvent";
			}
			if (!imageName.equals(""))
				return new Image(null, Activator.getImageDescriptor(
						"icons/" + imageName + ".gif").getImageData());
			else
				return null;

		}

		/**
		 * Returns the label text for the given column of the given element.
		 * 
		 * @param element the object representing the entire row, or null indicating that no input object is set in the viewer
		 * @param columnIndex the zero-based index of the column in which the label appears
		 * @return String or or null if there is no text for the given object at columnIndex
		 */
		@Override
		public String getColumnText(Object element, int columnIndex) {
			// each element comes from the ContentProvider.getElements(Object)

			if (element instanceof CondEvent)
				return "CondEvent";
			if (element instanceof Send)
				return "Send";
			else if (element instanceof Assign)
				return "Assign";
			else if (element instanceof Raise)
				return "Raise";
			else if (element instanceof Delay)
				return "Delay";
			else if (element instanceof Log)
				return "Log";
			else if (element instanceof If)
				return "If";

			return "";
		}
	}

	/**
	 * Closes this window, disposes its shell, and removes this window from its window manager (if it has one). 
	 * This framework method may be extended (super.close must be called). 
	 * 
	 * Note that in order to prevent recursive calls to this method it does not call Shell#close(). As a result ShellListeners will not receive a shellClosed event. 
	 * @return true if the window is (or was already) closed, and false if it is still open
	 */
	@Override
	public boolean close() {
		boolean ret = super.close();

		for (int i = 0; i < openedDialogs.size(); i++) {
			int hashCode = 1;
			if (targetContainer != null) {
				hashCode = targetContainer.hashCode();
			}
			if (openedDialogs.get(i) == hashCode) {
				openedDialogs.remove(i);
			}
		}
		// openedDialogs.remove(targetContainer.hashCode());
		return ret;
	}

	/**
	 * Opens this window, creating it first if it has not yet been created. 
	 * If this window has been configured to block on open ( setBlockOnOpen), this method waits until the window is closed by the end user, and then it returns the window's return code; otherwise, this method returns immediately. A window's return codes are window-specific, although two standard return codes are predefined: OK and CANCEL. 
	 * @return the return code
	 */
	@Override
	public int open() {
		int ret = Window.CANCEL;
		// System.out.println(openedDialogs);
		int hashCode = 1;
		if (targetContainer != null) {
			hashCode = targetContainer.hashCode();
		}
		if (!openedDialogs.contains(hashCode)) {
			ret = super.open();
			openedDialogs.add(hashCode);
		}
		return ret;
	}

	/**
	 * Change the color and the tickness of the transition when ConditionalEvenet
	 * or Executable Contents are add to it.
	 * 
	 * @param t the Transition
	 */
	private void changeTransitionDisplay(final Transition t) {
		if (t.getEvent() != null || !t.getOnTrigger().isEmpty()) {
			TransactionalEditingDomain domain7 = TransactionUtil.getEditingDomain(callingObject);
			domain7.getCommandStack().execute(new RecordingCommand(domain7) {
				@Override
				public void doExecute() {
					IGaService gaService = Graphiti.getGaService();

					PictogramElement pe = fp.getPictogramElementForBusinessObject(t);
					if (pe instanceof Connection) {
						Connection conn = (Connection) pe;

						GraphicsAlgorithm ga = conn.getGraphicsAlgorithm();
						if (ga instanceof Polyline) {
							Polyline polyline = (Polyline) ga;
							polyline.setLineWidth(2);
							polyline.setForeground(gaService.manageColor(fp .getDiagramTypeProvider().getDiagram(), IColorConstant.BLUE));
							// polyline.setLineStyle(LineStyle.DOT);
						}
						for (ConnectionDecorator cd : conn.getConnectionDecorators()) {
							GraphicsAlgorithm ga1 = cd.getGraphicsAlgorithm();
							if (ga1 instanceof Polygon) {
								ga1.setForeground(gaService.manageColor(fp .getDiagramTypeProvider().getDiagram(), IColorConstant.BLUE));
							}
						}
					}
				}
			});
		}
	}

	/**
	 * Reset the transition display when all assigned {@link ExecutableContent}s and {@link CondEvent} are deleted
	 * @param t
	 */
	private void resetTransitionDisplay(final Transition t) {
		TransactionalEditingDomain domain7 = TransactionUtil.getEditingDomain(callingObject);
		domain7.getCommandStack().execute(new RecordingCommand(domain7) {
			@Override
			public void doExecute() {
				IGaService gaService = Graphiti.getGaService();

				PictogramElement pe = fp.getPictogramElementForBusinessObject(t);
				if (pe instanceof Connection) {
					Connection conn = (Connection) pe;

					GraphicsAlgorithm ga = conn.getGraphicsAlgorithm();
					if (ga instanceof Polyline) {
						Polyline polyline = (Polyline) ga;
						polyline.setLineWidth(1);
						polyline.setForeground(gaService.manageColor(fp.getDiagramTypeProvider().getDiagram(), IColorConstant.BLACK));
					}
					for (ConnectionDecorator cd : conn
							.getConnectionDecorators()) {
						GraphicsAlgorithm ga1 = cd.getGraphicsAlgorithm();
						if (ga1 instanceof Polygon) {
							ga1.setForeground(gaService.manageColor(fp.getDiagramTypeProvider().getDiagram(),IColorConstant.BLACK));
						}
					}
				}
			}
		});

	}
	
	/**
	 * Helper function to extract the names and the EObjects of all the states
	 * that are candidates to be a target State
	 * 
	 * @param object
	 *            parent object
	 * @param targetState
	 *            target state names
	 * @param targetStates
	 *            target states
	 */
	private void getAllTargetStates(EObject object,
			ArrayList<String> targetState, EList<EObject> targetStates) {
		if (object == null || object.eContents().isEmpty()) {
			return;
		} else {
			for (EObject obj : object.eContents()) {
				getAllTargetStates(obj, targetState, targetStates);
				if (obj instanceof TargetState) {
					String name = "";

					if (obj instanceof HistoryState) {
						name = ((HistoryState) obj).getId();
					} else {
						name = ((DialogueDesignerElement) obj).getDisplayName();
					}
					if (name == null) {
						name = "";
					}
					targetState.add(name);
					targetStates.add(obj);
				}
			}
		}
	}
}
