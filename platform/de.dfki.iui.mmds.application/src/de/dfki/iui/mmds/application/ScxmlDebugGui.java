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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.scxml.SCXMLListener;
import org.apache.commons.scxml.model.Log;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManagerListener;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.io.CustomMessage;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.project.TestMessageSet;
import de.dfki.iui.mmds.dialogue.SiamStateMachine;
import de.dfki.iui.mmds.dialogue.fade.FadeComponent;
import de.dfki.iui.mmds.dialogue.fade.WorkingMemoreChangeListener;
import de.dfki.iui.mmds.dialogue.fade.WorkingMemory;

public class ScxmlDebugGui implements SCXMLListener, IKnowledgeManagerListener, WorkingMemoreChangeListener {

	protected Shell shlSiamDpDebug;
	private Table variableTable;
	private TableColumn variableTableColumn1;
	private TableColumn variableTableColumn2;
	Display display;
	Map<String, Message> testMessages;
	EList<EntityResource> entityResources;
	private final FadeComponent fadeService;
	IKnowledgeManager knowledgeManager;
	private final DialogPlatformEventManager eventService;

	private SiamStateMachine engine = null;

	private final Map<String, DebugGuiVariableInfo> varInfos = new HashMap<String, DebugGuiVariableInfo>();
	private DiscourseContextGui discourseContextGui;
	private KnowledgeBaseGui physicalContextGui;
	private DiscourseHistoryGui discourseHistoryGui;
	Set<String> activeStates = new LinkedHashSet<String>();
	boolean activeStatesChanged = false;
	private Table logTable;
	private TableColumn eventColumn;
	private TableColumn stateIdColumn;
	private TableColumn dialogueNodeIdColumn;
	private Group logGroup;

	private Group variableGroup;
	private SashForm sashForm;
	private Composite picturesComposite;
	private Composite topBox;
	private Combo deviceComboBox;
	private Combo eventComboBox;
	private Text messageTextBox;
	private Composite composite;
	private Composite composite_1;
	private Label lblNewLabel;
	private Label lblDfkiimage;
	private Button btnStepwise;
	private Button btnNext;
	private Composite composite_2;

	private boolean discourseContextGuiOpen = false;
	private boolean discourseHistoryGuiOpen = false;
	private boolean physicalContextGuiOpen = false;

	public ScxmlDebugGui(SiamStateMachine engine, ComponentContext componentContext,
			EList<EntityResource> entityResources) {
		super();
		this.entityResources = entityResources;
		fadeService = (FadeComponent) componentContext.locateService("FadeService");
		eventService = ((DialogPlatformEventManager) componentContext.locateService("DialogPlatformEventManager"));
		knowledgeManager = ((IKnowledgeManager) componentContext.locateService("IKnowledgeManager"));
		knowledgeManager.registerForType(BasePackage.eINSTANCE.getEntity(), this);
		fadeService.registerChangeListener(this);
		setEngine(engine);
	}

	public SiamStateMachine getEngine() {
		return engine;
	}

	public void setEngine(SiamStateMachine engine) {
		this.engine = engine;
		if (engine != null) {
			engine.addListener(this);
		}
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ScxmlDebugGui window = new ScxmlDebugGui(null, null, null);
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = new Display();
		createContents(display);
		shlSiamDpDebug.open();
		shlSiamDpDebug.layout();
		shlSiamDpDebug.forceActive();
	}

	public void waitUntilDispose() {
		while (!shlSiamDpDebug.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents(final Display display) {
		shlSiamDpDebug = new Shell(display);
		shlSiamDpDebug.setMinimumSize(new Point(680, 480));
		shlSiamDpDebug.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.dialogue", "resources/siamIcon.png"));
		shlSiamDpDebug.setSize(1166, 750);
		shlSiamDpDebug.setText("SiAM-dp Debug GUI");
		shlSiamDpDebug.setLayout(new FormLayout());

		topBox = new Composite(shlSiamDpDebug, SWT.NONE);
		topBox.setLayout(new FormLayout());
		FormData fd_topBox = new FormData();
		fd_topBox.top = new FormAttachment(0, 10);
		fd_topBox.bottom = new FormAttachment(0, 160);
		fd_topBox.right = new FormAttachment(100, -10);
		fd_topBox.left = new FormAttachment(0, 10);
		topBox.setLayoutData(fd_topBox);

		sashForm = new SashForm(shlSiamDpDebug, SWT.NONE);
		FormData fd_sashForm = new FormData();
		fd_sashForm.top = new FormAttachment(topBox, 10, SWT.BOTTOM);

		composite = new Composite(topBox, SWT.BORDER);
		FormData fd_composite = new FormData();
		fd_composite.right = new FormAttachment(0, 200);
		fd_composite.bottom = new FormAttachment(100, -60);
		fd_composite.top = new FormAttachment(0, 5);
		fd_composite.left = new FormAttachment(0, 5);
		composite.setLayoutData(fd_composite);

		deviceComboBox = new Combo(composite, SWT.BORDER);
		deviceComboBox.setLocation(10, 23);
		deviceComboBox.setSize(175, 21);

		Button btnOpenMicrophone = new Button(composite, SWT.NONE);
		btnOpenMicrophone.setLocation(10, 50);
		btnOpenMicrophone.setSize(121, 25);
		btnOpenMicrophone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openMicrophonePushed();
			}
		});
		btnOpenMicrophone.setText("Open Microphone");

		Label lblDeviceId = new Label(composite, SWT.NONE);
		lblDeviceId.setBounds(10, 7, 55, 15);
		lblDeviceId.setText("Device Id:");

		composite_1 = new Composite(topBox, SWT.BORDER);
		composite_1.setLayout(new FormLayout());
		FormData fd_composite_1 = new FormData();
		fd_composite_1.top = new FormAttachment(0, 5);
		fd_composite_1.left = new FormAttachment(composite, 5);
		fd_composite_1.right = new FormAttachment(100, -146);
		fd_composite_1.bottom = new FormAttachment(100, -5);
		composite_1.setLayoutData(fd_composite_1);

		eventComboBox = new Combo(composite_1, SWT.NONE);
		FormData fd_eventComboBox = new FormData();
		fd_eventComboBox.right = new FormAttachment(0, 150);
		fd_eventComboBox.top = new FormAttachment(0, 3);
		fd_eventComboBox.left = new FormAttachment(0, 3);
		eventComboBox.setLayoutData(fd_eventComboBox);

		Button btnFireEvent = new Button(composite_1, SWT.NONE);
		FormData fd_btnFireEvent = new FormData();
		fd_btnFireEvent.top = new FormAttachment(eventComboBox, 3);
		fd_btnFireEvent.right = new FormAttachment(eventComboBox, 0, SWT.RIGHT);
		fd_btnFireEvent.left = new FormAttachment(eventComboBox, 0, SWT.LEFT);
		btnFireEvent.setLayoutData(fd_btnFireEvent);
		btnFireEvent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Message message = (Message) EmfPersistence.readFromString(messageTextBox.getText()).getContents()
							.get(0);
					if (message instanceof InputMessage)
						eventService.postInputEvent((InputMessage) message, this);
					else if (message instanceof OutputMessage)
						eventService.postOutputEvent((OutputMessage) message, this);
					else if (message instanceof CustomMessage)
						eventService.postCustomEvent((CustomMessage) message, this);
				} catch (IOException e1) {
					MessageBox m = new MessageBox(display.getActiveShell(), SWT.OK | SWT.ERROR);
					m.setText("Parsing Error");
					m.setMessage(e1.getLocalizedMessage());
					m.open();
				}
			}
		});
		btnFireEvent.setText("Fire Event");

		messageTextBox = new Text(composite_1, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL | SWT.MULTI);
		FormData fd_messageTextBox = new FormData();
		fd_messageTextBox.top = new FormAttachment(0, 3);
		fd_messageTextBox.left = new FormAttachment(eventComboBox, 3);
		fd_messageTextBox.bottom = new FormAttachment(100, -3);
		fd_messageTextBox.right = new FormAttachment(100, -10);
		messageTextBox.setLayoutData(fd_messageTextBox);

		composite_2 = new Composite(topBox, SWT.BORDER);
		FormData fd_composite_2 = new FormData();
		fd_composite_2.top = new FormAttachment(composite, 6);
		fd_composite_2.bottom = new FormAttachment(100, -5);
		fd_composite_2.left = new FormAttachment(0, 5);
		fd_composite_2.right = new FormAttachment(0, 200);
		composite_2.setLayoutData(fd_composite_2);

		btnStepwise = new Button(composite_2, SWT.CHECK);
		btnStepwise.setBounds(10, 15, 67, 16);
		btnStepwise.setEnabled(true);
		btnStepwise.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getEngine().setSuperStep(!btnStepwise.getSelection());
			}
		});
		btnStepwise.setText("Stepwise");

		btnNext = new Button(composite_2, SWT.NONE);
		btnNext.setBounds(96, 10, 89, 25);
		btnNext.setEnabled(false);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getEngine().step();
			}
		});
		btnNext.setText("Next Step ==>");

		Composite composite_3 = new Composite(topBox, SWT.BORDER);
		FormData fd_composite_3 = new FormData();
		fd_composite_3.bottom = new FormAttachment(composite_1, 0, SWT.BOTTOM);
		fd_composite_3.right = new FormAttachment(composite_1, 146, SWT.RIGHT);
		fd_composite_3.top = new FormAttachment(0, 5);
		fd_composite_3.left = new FormAttachment(composite_1, 6);
		composite_3.setLayoutData(fd_composite_3);

		Button discourseContextButton = new Button(composite_3, SWT.TOGGLE);
		discourseContextButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (discourseContextGui == null) {
					discourseContextGui = new DiscourseContextGui(fadeService.getWorkingMemory().getDiscourseContext());

				}
				if (!discourseContextGuiOpen) {
					discourseContextGui.open();
					DisposeListener dl = new DisposeListener() {
						@Override
						public void widgetDisposed(DisposeEvent e) {
							discourseContextGuiOpen = false;
							discourseContextGui = null;
							discourseContextButton.setSelection(false);
						}
					};
					discourseContextGui.getShell().addDisposeListener(dl);
					discourseContextGuiOpen = true;
					discourseContextButton.setSelection(true);
				} else {
					discourseContextGui.close();
					discourseContextGuiOpen = false;
					discourseContextButton.setSelection(false);
				}
			}
		});
		discourseContextButton.setBounds(3, 2, 130, 25);
		discourseContextButton.setText("Discourse Context");

		Button discourseHistoryButton = new Button(composite_3, SWT.TOGGLE);
		discourseHistoryButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (discourseHistoryGui == null) {
					discourseHistoryGui = new DiscourseHistoryGui(fadeService.getWorkingMemory().getDiscourseHistory());
				}
				if (!discourseHistoryGuiOpen) {
					discourseHistoryGui.open();
					DisposeListener dl = new DisposeListener() {
						@Override
						public void widgetDisposed(DisposeEvent e) {
							discourseHistoryGuiOpen = false;
							discourseHistoryButton.setSelection(false);
						}
					};
					discourseHistoryGui.getShell().addDisposeListener(dl);
					discourseHistoryGuiOpen = true;
					discourseHistoryButton.setSelection(true);
				} else {
					discourseHistoryGui.close();
					discourseHistoryGuiOpen = false;
					discourseHistoryButton.setSelection(false);
				}
			}

		});
		discourseHistoryButton.setBounds(3, 32, 130, 25);
		discourseHistoryButton.setText("Discourse History");

		Button physicalContextButton = new Button(composite_3, SWT.TOGGLE);

		physicalContextButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (physicalContextGui == null) {
					physicalContextGui = new KnowledgeBaseGui(knowledgeManager.getWorld().getEntries(),
							entityResources);
				}
				if (!physicalContextGuiOpen) {
					physicalContextGui.open();
					DisposeListener dl = new DisposeListener() {
						@Override
						public void widgetDisposed(DisposeEvent e) {
							physicalContextGuiOpen = false;
							physicalContextGui = null;
							physicalContextButton.setSelection(false);
						}
					};
					physicalContextGui.getShell().addDisposeListener(dl);
					physicalContextGuiOpen = true;
					physicalContextButton.setSelection(true);
				} else {
					physicalContextGui.close();
					physicalContextGuiOpen = false;
					physicalContextButton.setSelection(false);
				}
			}
		});
		physicalContextButton.setBounds(3, 62, 130, 25);
		physicalContextButton.setText("Knowledge Base");

		eventComboBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Message message = testMessages.get(eventComboBox.getText());
				if (message != null) {
					messageTextBox.setText(EmfPersistence.writeToString(message));
				}
			}
		});
		fd_sashForm.right = new FormAttachment(100, -10);
		fd_sashForm.left = new FormAttachment(0, 10);

		sashForm.setLayoutData(fd_sashForm);

		logGroup = new Group(sashForm, SWT.NONE);
		logGroup.setText("Logs");
		logGroup.setLayout(new FillLayout(SWT.VERTICAL));

		logTable = new Table(logGroup, SWT.BORDER | SWT.FULL_SELECTION);
		logTable.setHeaderVisible(true);
		logTable.setLinesVisible(true);

		eventColumn = new TableColumn(logTable, SWT.NONE);
		eventColumn.setWidth(120);
		eventColumn.setText("Event");

		stateIdColumn = new TableColumn(logTable, SWT.NONE);
		stateIdColumn.setWidth(380);
		stateIdColumn.setText("StateID");

		dialogueNodeIdColumn = new TableColumn(logTable, SWT.NONE);
		dialogueNodeIdColumn.setWidth(131);
		dialogueNodeIdColumn.setText("DialogueNodeID");

		variableGroup = new Group(sashForm, SWT.NONE);
		variableGroup.setText("Variables");
		variableGroup.setLayout(new FillLayout(SWT.HORIZONTAL));

		variableTable = new Table(variableGroup, SWT.BORDER | SWT.FULL_SELECTION);
		variableTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent event) {
				TableItem item = variableTable.getItem(new Point(event.x, event.y));
				Object content = null;
				final String key = item.getText(0);
				if (!item.getText(0).equals("null")) {
					content = ProjectManager.dialogueManager.getCurrentScxmlContext().get(key);
				}

				if (content instanceof EObject) {
					try {
						DebugGuiVariableInfo window = new DebugGuiVariableInfo((EObject) content);
						if (varInfos.get(key) == null) {
							window.open();
							varInfos.put(key, window);
							DisposeListener dl = new DisposeListener() {

								@Override
								public void widgetDisposed(DisposeEvent e) {
									varInfos.put(key, null);

								}

							};
							window.getShell().addDisposeListener(dl);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		});
		variableTable.setHeaderVisible(true);
		variableTable.setLinesVisible(true);

		variableTableColumn1 = new TableColumn(variableTable, SWT.NONE);
		variableTableColumn1.setWidth(212);
		variableTableColumn1.setText("Name");

		variableTableColumn2 = new TableColumn(variableTable, SWT.NONE);
		variableTableColumn2.setWidth(240);
		variableTableColumn2.setText("Content");

		picturesComposite = new Composite(shlSiamDpDebug, SWT.NONE);
		fd_sashForm.bottom = new FormAttachment(picturesComposite, -10, SWT.TOP);

		FormData fd_picturesComposite = new FormData();
		fd_picturesComposite.top = new FormAttachment(100, -120);
		fd_picturesComposite.bottom = new FormAttachment(100, -10);
		fd_picturesComposite.right = new FormAttachment(100, -10);
		fd_picturesComposite.left = new FormAttachment(0, 10);
		sashForm.setWeights(new int[] { 654, 473 });
		picturesComposite.setLayout(null);

		picturesComposite.setLayoutData(fd_picturesComposite);

		Label siamLogo = new Label(picturesComposite, SWT.NONE);
		siamLogo.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.dialogue", "resources/siam.png"));
		siamLogo.setBounds(285, 25, 228, 70);

		lblNewLabel = new Label(picturesComposite, SWT.NONE);
		lblNewLabel.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.dialogue", "resources/bmbf_klein.png"));
		lblNewLabel.setBounds(519, 10, 116, 100);

		lblDfkiimage = new Label(picturesComposite, SWT.NONE);
		lblDfkiimage.setImage(ResourceManager.getPluginImage("de.dfki.iui.mmds.dialogue", "resources/dfki.png"));
		lblDfkiimage.setBounds(15, 15, 253, 90);

	}

	@Override
	public void onEntry(TransitionTarget state) {
		append("ENTER", state.getId(), ProjectManager.dialogueManager.idToDialogueNode.get(state.getId()).getId());
		activeStates.add(state.getId());
		activeStatesChanged = true;
	}

	@Override
	public void onExit(TransitionTarget state) {
		append("LEAVE", state.getId(), "");
		activeStates.remove(state.getId());
		activeStatesChanged = true;
	}

	@Override
	public void onTransition(TransitionTarget from, TransitionTarget to, Transition transition) {
		Log log = (Log) transition.getActions().get(0);
		append("TRANS ", log.getLabel() + ": " + from.getId() + " --> " + to.getId(), "");
	}

	private void append(final String event, final String states, final String node) {
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				TableItem item = new TableItem(logTable, SWT.NONE, 0);
				item.setText(0, event);
				item.setText(1, states);
				item.setText(2, node);
			}
		});
	}

	@Override
	public void onStable() {

		if (activeStatesChanged) {
			append("ACTIVE STATES", activeStates.toString(), "");
			activeStatesChanged = false;
		}
		updateVariableTable();

		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				btnNext.setEnabled(!getEngine().getEngine().getCurrentStatus().getEvents().isEmpty());
				// eventComboBox.removeAll();
				// int index = 0;
				// for (int i = 0; i <
				// ProjectManager.dialogueManager.getActiveTransitions().size();
				// ++i) {
				// String id =
				// ProjectManager.dialogueManager.getActiveTransitions().get(i);
				// if (inputEvents.containsKey(id)) {
				// eventComboBox.add(id);
				// }
				// if (id.equals(previousSelectedEvent)) {
				// index = eventComboBox.getItemCount() - 1;
				// }
				// }
				// eventComboBox.select(index);
				// try {
				// InputMessage inputEvent =
				// inputEvents.get(eventComboBox.getText());
				// if (inputEvent != null) {
				// messageTextBox.setText(EmfPersistence.writeToString(inputEvent));
				// }
				// } catch (IOException | IllegalArgumentException e) {
				// e.printStackTrace();
				// }
			};
		});

	}

	private void updateVariableTable() {
		final Map<String, Object> context = ProjectManager.dialogueManager.getCurrentScxmlContext();

		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				variableTable.removeAll();
				for (String key : context.keySet()) {
					TableItem item = new TableItem(variableTable, SWT.NONE);
					item.setText(0, key);
					Object content = context.get(key);
					String text;
					if (content == null) {
						text = "null";
					} else if (content instanceof EObject) {
						if (varInfos.get(key) != null) {
							varInfos.get(key).update((EObject) content);
						}
						text = ((EObject) content).eClass().getName() + " (EObject: <double click>)";
					} else {
						text = content.toString();
					}
					item.setText(1, text);
				}
			}
		});
	}

	private void openMicrophonePushed() {
		UpdateDeviceMode updateDeviceMode = IoFactory.eINSTANCE.createUpdateDeviceMode();
		updateDeviceMode.setDevice(new BString(deviceComboBox.getText()));
		SpeechRecognizerMode recognizerMode = IoFactory.eINSTANCE.createSpeechRecognizerMode();
		recognizerMode.setMode(SpeechRecognizerModeEnum.OPEN_MICROPHONE);
		updateDeviceMode.setDeviceMode(recognizerMode);
		eventService.postOutputEvent(updateDeviceMode, this);
	}

	void collectInputMessages(TestMessageSet testMessageSet) {
		testMessages = new HashMap<String, Message>();

		for (int i = 0; i < testMessageSet.getMessages().size(); ++i) {
			Message message = testMessageSet.getMessages().get(i);
			String key = "#" + i + ":" + message.getDescription();
			testMessages.put(key, message);
			eventComboBox.add(key);
		}

		eventComboBox.select(0);

		eventComboBox.notifyListeners(SWT.Selection, new Event());

		// while (eAllContents.hasNext()) {
		// EObject next = eAllContents.next();
		// if (next instanceof WaitForEvent) {
		// WaitForEvent waitFor = (WaitForEvent) next;
		// inputEvents.put(waitFor.getId(), (InputMessage)
		// waitFor.getEvent().getPattern().get(0).createSkeleton());
		// }
		// if (next instanceof de.dfki.iui.mmds.core.model.dialogue.Transition)
		// {
		// de.dfki.iui.mmds.core.model.dialogue.Transition transition =
		// (de.dfki.iui.mmds.core.model.dialogue.Transition) next;
		// if (transition.getId() != null)
		// if (transition.getEvent() != null &&
		// transition.getEvent().getPattern() != null &&
		// transition.getEvent().getPattern().size() > 0) {
		// inputEvents.put(transition.getId(), (InputMessage)
		// transition.getEvent().getPattern().get(0).createSkeleton());
		// }
		// }
		// }
	}

	@Override
	public void changed(final WorkingMemory wm) {
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				if (discourseContextGui != null) {
					discourseContextGui.update(wm.getDiscourseContext());
				}
				if (discourseHistoryGui != null) {
					discourseHistoryGui.update(wm.getDiscourseHistory());
				}
			}
		});
	}

	@Override
	public void entityRemoved(Entity object) {
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				if (physicalContextGui != null)
					physicalContextGui.update(knowledgeManager.getWorld().getEntries());
			}
		});
	}

	@Override
	public void entityAdded(Entity object) {
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				if (physicalContextGui != null)
					physicalContextGui.update(knowledgeManager.getWorld().getEntries());
			}
		});
	}

	public void addSpeechRecognizer(String deviceId) {
		deviceComboBox.add(deviceId);
		deviceComboBox.select(0);
	}

}
