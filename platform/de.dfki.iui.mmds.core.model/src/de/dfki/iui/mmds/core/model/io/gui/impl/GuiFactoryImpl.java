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
/**
 */
package de.dfki.iui.mmds.core.model.io.gui.impl;

import de.dfki.iui.mmds.core.model.io.gui.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout;
import de.dfki.iui.mmds.core.model.io.gui.AdapterMapping;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.Alignment;
import de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter;
import de.dfki.iui.mmds.core.model.io.gui.Button;
import de.dfki.iui.mmds.core.model.io.gui.ButtonBar;
import de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.CalendarView;
import de.dfki.iui.mmds.core.model.io.gui.Canvas;
import de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate;
import de.dfki.iui.mmds.core.model.io.gui.CheckBox;
import de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ColorPicker;
import de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ComboBox;
import de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.CustomDialog;
import de.dfki.iui.mmds.core.model.io.gui.DialogBox;
import de.dfki.iui.mmds.core.model.io.gui.DialogUpdate;
import de.dfki.iui.mmds.core.model.io.gui.DialogueButtons;
import de.dfki.iui.mmds.core.model.io.gui.DirectionHV;
import de.dfki.iui.mmds.core.model.io.gui.ElementAdapter;
import de.dfki.iui.mmds.core.model.io.gui.FileChooser;
import de.dfki.iui.mmds.core.model.io.gui.FlowLayout;
import de.dfki.iui.mmds.core.model.io.gui.Form;
import de.dfki.iui.mmds.core.model.io.gui.FormUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GUIEvent;
import de.dfki.iui.mmds.core.model.io.gui.GUIUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GridContainer;
import de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.GuiPlugin;
import de.dfki.iui.mmds.core.model.io.gui.HBox;
import de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.HTMLView;
import de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Image;
import de.dfki.iui.mmds.core.model.io.gui.ImageButton;
import de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ImageFillModes;
import de.dfki.iui.mmds.core.model.io.gui.ImageGallery;
import de.dfki.iui.mmds.core.model.io.gui.ImageUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Label;
import de.dfki.iui.mmds.core.model.io.gui.LabelUpdate;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ListUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Margin;
import de.dfki.iui.mmds.core.model.io.gui.MediaPlayer;
import de.dfki.iui.mmds.core.model.io.gui.NumericStepper;
import de.dfki.iui.mmds.core.model.io.gui.Orientation;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBar;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RadioButton;
import de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.RichTextInput;
import de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Scrollbar;
import de.dfki.iui.mmds.core.model.io.gui.Size;
import de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard;
import de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate;
import de.dfki.iui.mmds.core.model.io.gui.SubmitButton;
import de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.SupportedEvent;
import de.dfki.iui.mmds.core.model.io.gui.TabItem;
import de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate;
import de.dfki.iui.mmds.core.model.io.gui.TabView;
import de.dfki.iui.mmds.core.model.io.gui.TextInput;
import de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ToggleButton;
import de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ToolTip;
import de.dfki.iui.mmds.core.model.io.gui.VAlignment;
import de.dfki.iui.mmds.core.model.io.gui.VBox;
import de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Window;
import de.dfki.iui.mmds.core.model.io.gui.WindowUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiFactoryImpl extends EFactoryImpl implements GuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuiFactory init() {
		try {
			GuiFactory theGuiFactory = (GuiFactory)EPackage.Registry.INSTANCE.getEFactory(GuiPackage.eNS_URI);
			if (theGuiFactory != null) {
				return theGuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GuiPackage.GUI_EVENT: return createGUIEvent();
			case GuiPackage.GUI_APPLICATION: return createGUIApplication();
			case GuiPackage.GUI_UPDATE: return createGUIUpdate();
			case GuiPackage.WINDOW_UPDATE: return createWindowUpdate();
			case GuiPackage.STYLE_SHEET_UPDATE: return createStyleSheetUpdate();
			case GuiPackage.REMOVE_UI_ELEMENT: return createRemoveUIElement();
			case GuiPackage.ADD_UI_ELEMENT: return createAddUIElement();
			case GuiPackage.ADD_TABLE_CELL: return createAddTableCell();
			case GuiPackage.REMOVE_TABLE_CELL: return createRemoveTableCell();
			case GuiPackage.MOVE_UI_ELEMENT: return createMoveUIElement();
			case GuiPackage.SUPPORTED_EVENT: return createSupportedEvent();
			case GuiPackage.WINDOW: return createWindow();
			case GuiPackage.ELEMENT_ADAPTER: return createElementAdapter();
			case GuiPackage.ADAPTER_MAPPING: return createAdapterMapping();
			case GuiPackage.ARRAY_ADAPTER: return createArrayAdapter();
			case GuiPackage.GRID_CONTAINER: return createGridContainer();
			case GuiPackage.CANVAS: return createCanvas();
			case GuiPackage.FORM: return createForm();
			case GuiPackage.VBOX: return createVBox();
			case GuiPackage.HBOX: return createHBox();
			case GuiPackage.DIV: return createDiv();
			case GuiPackage.GRID_ROW: return createGridRow();
			case GuiPackage.GRID_ITEM: return createGridItem();
			case GuiPackage.GRID_HEADER_ITEM: return createGridHeaderItem();
			case GuiPackage.HTML_VIEW: return createHTMLView();
			case GuiPackage.DISPLAY_CONTEXT_VIEW: return createDisplayContextView();
			case GuiPackage.MARGIN: return createMargin();
			case GuiPackage.SIZE: return createSize();
			case GuiPackage.ABSOLUTE_LAYOUT: return createAbsoluteLayout();
			case GuiPackage.FLOW_LAYOUT: return createFlowLayout();
			case GuiPackage.TOOL_TIP: return createToolTip();
			case GuiPackage.LABEL: return createLabel();
			case GuiPackage.TEXT_INPUT: return createTextInput();
			case GuiPackage.LABELED_TEXT_INPUT: return createLabeledTextInput();
			case GuiPackage.RICH_TEXT_INPUT: return createRichTextInput();
			case GuiPackage.LIST: return createList();
			case GuiPackage.LIST_ITEM: return createListItem();
			case GuiPackage.COMBO_BOX: return createComboBox();
			case GuiPackage.BUTTON: return createButton();
			case GuiPackage.SUBMIT_BUTTON: return createSubmitButton();
			case GuiPackage.CHECK_BOX: return createCheckBox();
			case GuiPackage.RADIO_BUTTON: return createRadioButton();
			case GuiPackage.TOGGLE_BUTTON: return createToggleButton();
			case GuiPackage.IMAGE_BUTTON: return createImageButton();
			case GuiPackage.BUTTON_BAR: return createButtonBar();
			case GuiPackage.COLOR_PICKER: return createColorPicker();
			case GuiPackage.PROGRESS_BAR: return createProgressBar();
			case GuiPackage.IMAGE: return createImage();
			case GuiPackage.IMAGE_GALLERY: return createImageGallery();
			case GuiPackage.MEDIA_PLAYER: return createMediaPlayer();
			case GuiPackage.NUMERIC_STEPPER: return createNumericStepper();
			case GuiPackage.SCROLLBAR: return createScrollbar();
			case GuiPackage.CALENDAR_VIEW: return createCalendarView();
			case GuiPackage.SOFT_KEYBOARD: return createSoftKeyboard();
			case GuiPackage.DIALOG_BOX: return createDialogBox();
			case GuiPackage.CUSTOM_DIALOG: return createCustomDialog();
			case GuiPackage.FILE_CHOOSER: return createFileChooser();
			case GuiPackage.TAB_ITEM: return createTabItem();
			case GuiPackage.TAB_VIEW: return createTabView();
			case GuiPackage.TEXT_INPUT_UPDATE: return createTextInputUpdate();
			case GuiPackage.LABELED_TEXT_INPUT_UPDATE: return createLabeledTextInputUpdate();
			case GuiPackage.RICH_TEXT_INPUT_UPDATE: return createRichTextInputUpdate();
			case GuiPackage.COLOR_PICKER_UPDATE: return createColorPickerUpdate();
			case GuiPackage.LABEL_UPDATE: return createLabelUpdate();
			case GuiPackage.LIST_UPDATE: return createListUpdate();
			case GuiPackage.COMBOBOX_UPDATE: return createComboboxUpdate();
			case GuiPackage.LIST_ITEM_UPDATE: return createListItemUpdate();
			case GuiPackage.BUTTON_UPDATE: return createButtonUpdate();
			case GuiPackage.SUBMIT_BUTTON_UPDATE: return createSubmitButtonUpdate();
			case GuiPackage.CHECK_BOX_UPDATE: return createCheckBoxUpdate();
			case GuiPackage.RADIO_BUTTON_UPDATE: return createRadioButtonUpdate();
			case GuiPackage.IMAGE_BUTTON_UPDATE: return createImageButtonUpdate();
			case GuiPackage.TOGGLE_BUTTON_UPDATE: return createToggleButtonUpdate();
			case GuiPackage.GRID_CONTAINER_UPDATE: return createGridContainerUpdate();
			case GuiPackage.CANVAS_UPDATE: return createCanvasUpdate();
			case GuiPackage.FORM_UPDATE: return createFormUpdate();
			case GuiPackage.VBOX_UPDATE: return createVBoxUpdate();
			case GuiPackage.HBOX_UPDATE: return createHBoxUpdate();
			case GuiPackage.HTML_VIEW_UPDATE: return createHtmlViewUpdate();
			case GuiPackage.TAB_ITEM_UPDATE: return createTabItemUpdate();
			case GuiPackage.IMAGE_UPDATE: return createImageUpdate();
			case GuiPackage.DIALOG_UPDATE: return createDialogUpdate();
			case GuiPackage.PROGRESS_BAR_UPDATE: return createProgressBarUpdate();
			case GuiPackage.JAVA_SCRIPT_UPDATE: return createJavaScriptUpdate();
			case GuiPackage.GUI_PLUGIN: return createGuiPlugin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GuiPackage.ALIGNMENT:
				return createAlignmentFromString(eDataType, initialValue);
			case GuiPackage.VALIGNMENT:
				return createVAlignmentFromString(eDataType, initialValue);
			case GuiPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case GuiPackage.IMAGE_FILL_MODES:
				return createImageFillModesFromString(eDataType, initialValue);
			case GuiPackage.DIRECTION_HV:
				return createDirectionHVFromString(eDataType, initialValue);
			case GuiPackage.DIALOGUE_BUTTONS:
				return createDialogueButtonsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GuiPackage.ALIGNMENT:
				return convertAlignmentToString(eDataType, instanceValue);
			case GuiPackage.VALIGNMENT:
				return convertVAlignmentToString(eDataType, instanceValue);
			case GuiPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case GuiPackage.IMAGE_FILL_MODES:
				return convertImageFillModesToString(eDataType, instanceValue);
			case GuiPackage.DIRECTION_HV:
				return convertDirectionHVToString(eDataType, instanceValue);
			case GuiPackage.DIALOGUE_BUTTONS:
				return convertDialogueButtonsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIEvent createGUIEvent() {
		GUIEventImpl guiEvent = new GUIEventImpl();
		return guiEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIApplication createGUIApplication() {
		GUIApplicationImpl guiApplication = new GUIApplicationImpl();
		return guiApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIUpdate createGUIUpdate() {
		GUIUpdateImpl guiUpdate = new GUIUpdateImpl();
		return guiUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowUpdate createWindowUpdate() {
		WindowUpdateImpl windowUpdate = new WindowUpdateImpl();
		return windowUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheetUpdate createStyleSheetUpdate() {
		StyleSheetUpdateImpl styleSheetUpdate = new StyleSheetUpdateImpl();
		return styleSheetUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveUIElement createRemoveUIElement() {
		RemoveUIElementImpl removeUIElement = new RemoveUIElementImpl();
		return removeUIElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUIElement createAddUIElement() {
		AddUIElementImpl addUIElement = new AddUIElementImpl();
		return addUIElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTableCell createAddTableCell() {
		AddTableCellImpl addTableCell = new AddTableCellImpl();
		return addTableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveTableCell createRemoveTableCell() {
		RemoveTableCellImpl removeTableCell = new RemoveTableCellImpl();
		return removeTableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveUIElement createMoveUIElement() {
		MoveUIElementImpl moveUIElement = new MoveUIElementImpl();
		return moveUIElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedEvent createSupportedEvent() {
		SupportedEventImpl supportedEvent = new SupportedEventImpl();
		return supportedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabView createTabView() {
		TabViewImpl tabView = new TabViewImpl();
		return tabView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputUpdate createTextInputUpdate() {
		TextInputUpdateImpl textInputUpdate = new TextInputUpdateImpl();
		return textInputUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledTextInputUpdate createLabeledTextInputUpdate() {
		LabeledTextInputUpdateImpl labeledTextInputUpdate = new LabeledTextInputUpdateImpl();
		return labeledTextInputUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichTextInputUpdate createRichTextInputUpdate() {
		RichTextInputUpdateImpl richTextInputUpdate = new RichTextInputUpdateImpl();
		return richTextInputUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorPickerUpdate createColorPickerUpdate() {
		ColorPickerUpdateImpl colorPickerUpdate = new ColorPickerUpdateImpl();
		return colorPickerUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelUpdate createLabelUpdate() {
		LabelUpdateImpl labelUpdate = new LabelUpdateImpl();
		return labelUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListUpdate createListUpdate() {
		ListUpdateImpl listUpdate = new ListUpdateImpl();
		return listUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboboxUpdate createComboboxUpdate() {
		ComboboxUpdateImpl comboboxUpdate = new ComboboxUpdateImpl();
		return comboboxUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemUpdate createListItemUpdate() {
		ListItemUpdateImpl listItemUpdate = new ListItemUpdateImpl();
		return listItemUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonUpdate createButtonUpdate() {
		ButtonUpdateImpl buttonUpdate = new ButtonUpdateImpl();
		return buttonUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitButtonUpdate createSubmitButtonUpdate() {
		SubmitButtonUpdateImpl submitButtonUpdate = new SubmitButtonUpdateImpl();
		return submitButtonUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBoxUpdate createCheckBoxUpdate() {
		CheckBoxUpdateImpl checkBoxUpdate = new CheckBoxUpdateImpl();
		return checkBoxUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButtonUpdate createRadioButtonUpdate() {
		RadioButtonUpdateImpl radioButtonUpdate = new RadioButtonUpdateImpl();
		return radioButtonUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageButtonUpdate createImageButtonUpdate() {
		ImageButtonUpdateImpl imageButtonUpdate = new ImageButtonUpdateImpl();
		return imageButtonUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleButtonUpdate createToggleButtonUpdate() {
		ToggleButtonUpdateImpl toggleButtonUpdate = new ToggleButtonUpdateImpl();
		return toggleButtonUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridContainerUpdate createGridContainerUpdate() {
		GridContainerUpdateImpl gridContainerUpdate = new GridContainerUpdateImpl();
		return gridContainerUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasUpdate createCanvasUpdate() {
		CanvasUpdateImpl canvasUpdate = new CanvasUpdateImpl();
		return canvasUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormUpdate createFormUpdate() {
		FormUpdateImpl formUpdate = new FormUpdateImpl();
		return formUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBoxUpdate createVBoxUpdate() {
		VBoxUpdateImpl vBoxUpdate = new VBoxUpdateImpl();
		return vBoxUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBoxUpdate createHBoxUpdate() {
		HBoxUpdateImpl hBoxUpdate = new HBoxUpdateImpl();
		return hBoxUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlViewUpdate createHtmlViewUpdate() {
		HtmlViewUpdateImpl htmlViewUpdate = new HtmlViewUpdateImpl();
		return htmlViewUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItemUpdate createTabItemUpdate() {
		TabItemUpdateImpl tabItemUpdate = new TabItemUpdateImpl();
		return tabItemUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageUpdate createImageUpdate() {
		ImageUpdateImpl imageUpdate = new ImageUpdateImpl();
		return imageUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogUpdate createDialogUpdate() {
		DialogUpdateImpl dialogUpdate = new DialogUpdateImpl();
		return dialogUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBarUpdate createProgressBarUpdate() {
		ProgressBarUpdateImpl progressBarUpdate = new ProgressBarUpdateImpl();
		return progressBarUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptUpdate createJavaScriptUpdate() {
		JavaScriptUpdateImpl javaScriptUpdate = new JavaScriptUpdateImpl();
		return javaScriptUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiPlugin createGuiPlugin() {
		GuiPluginImpl guiPlugin = new GuiPluginImpl();
		return guiPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItem createTabItem() {
		TabItemImpl tabItem = new TabItemImpl();
		return tabItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementAdapter createElementAdapter() {
		ElementAdapterImpl elementAdapter = new ElementAdapterImpl();
		return elementAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterMapping createAdapterMapping() {
		AdapterMappingImpl adapterMapping = new AdapterMappingImpl();
		return adapterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAdapter createArrayAdapter() {
		ArrayAdapterImpl arrayAdapter = new ArrayAdapterImpl();
		return arrayAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridContainer createGridContainer() {
		GridContainerImpl gridContainer = new GridContainerImpl();
		return gridContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBox createVBox() {
		VBoxImpl vBox = new VBoxImpl();
		return vBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBox createHBox() {
		HBoxImpl hBox = new HBoxImpl();
		return hBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridRow createGridRow() {
		GridRowImpl gridRow = new GridRowImpl();
		return gridRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItem createGridItem() {
		GridItemImpl gridItem = new GridItemImpl();
		return gridItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonBar createButtonBar() {
		ButtonBarImpl buttonBar = new ButtonBarImpl();
		return buttonBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLView createHTMLView() {
		HTMLViewImpl htmlView = new HTMLViewImpl();
		return htmlView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayContextView createDisplayContextView() {
		DisplayContextViewImpl displayContextView = new DisplayContextViewImpl();
		return displayContextView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Margin createMargin() {
		MarginImpl margin = new MarginImpl();
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteLayout createAbsoluteLayout() {
		AbsoluteLayoutImpl absoluteLayout = new AbsoluteLayoutImpl();
		return absoluteLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLayout createFlowLayout() {
		FlowLayoutImpl flowLayout = new FlowLayoutImpl();
		return flowLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolTip createToolTip() {
		ToolTipImpl toolTip = new ToolTipImpl();
		return toolTip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitButton createSubmitButton() {
		SubmitButtonImpl submitButton = new SubmitButtonImpl();
		return submitButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledTextInput createLabeledTextInput() {
		LabeledTextInputImpl labeledTextInput = new LabeledTextInputImpl();
		return labeledTextInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichTextInput createRichTextInput() {
		RichTextInputImpl richTextInput = new RichTextInputImpl();
		return richTextInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorPicker createColorPicker() {
		ColorPickerImpl colorPicker = new ColorPickerImpl();
		return colorPicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar createProgressBar() {
		ProgressBarImpl progressBar = new ProgressBarImpl();
		return progressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageGallery createImageGallery() {
		ImageGalleryImpl imageGallery = new ImageGalleryImpl();
		return imageGallery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaPlayer createMediaPlayer() {
		MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
		return mediaPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStepper createNumericStepper() {
		NumericStepperImpl numericStepper = new NumericStepperImpl();
		return numericStepper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scrollbar createScrollbar() {
		ScrollbarImpl scrollbar = new ScrollbarImpl();
		return scrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarView createCalendarView() {
		CalendarViewImpl calendarView = new CalendarViewImpl();
		return calendarView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftKeyboard createSoftKeyboard() {
		SoftKeyboardImpl softKeyboard = new SoftKeyboardImpl();
		return softKeyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogBox createDialogBox() {
		DialogBoxImpl dialogBox = new DialogBoxImpl();
		return dialogBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialog createCustomDialog() {
		CustomDialogImpl customDialog = new CustomDialogImpl();
		return customDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileChooser createFileChooser() {
		FileChooserImpl fileChooser = new FileChooserImpl();
		return fileChooser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleButton createToggleButton() {
		ToggleButtonImpl toggleButton = new ToggleButtonImpl();
		return toggleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageButton createImageButton() {
		ImageButtonImpl imageButton = new ImageButtonImpl();
		return imageButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridHeaderItem createGridHeaderItem() {
		GridHeaderItemImpl gridHeaderItem = new GridHeaderItemImpl();
		return gridHeaderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignment createVAlignmentFromString(EDataType eDataType, String initialValue) {
		VAlignment result = VAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFillModes createImageFillModesFromString(EDataType eDataType, String initialValue) {
		ImageFillModes result = ImageFillModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageFillModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionHV createDirectionHVFromString(EDataType eDataType, String initialValue) {
		DirectionHV result = DirectionHV.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionHVToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogueButtons createDialogueButtonsFromString(EDataType eDataType, String initialValue) {
		DialogueButtons result = DialogueButtons.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialogueButtonsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiPackage getGuiPackage() {
		return (GuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GuiPackage getPackage() {
		return GuiPackage.eINSTANCE;
	}

} //GuiFactoryImpl
