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
package de.dfki.iui.mmds.core.model.io.gui.util;

import de.dfki.iui.mmds.core.model.io.gui.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage
 * @generated
 */
public class GuiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GuiValidator INSTANCE = new GuiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.mmds.core.model.io.gui";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GuiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GuiPackage.GUI_REQUEST:
				return validateGUIRequest((GUIRequest)value, diagnostics, context);
			case GuiPackage.GUI_EVENT:
				return validateGUIEvent((GUIEvent)value, diagnostics, context);
			case GuiPackage.GUI_APPLICATION:
				return validateGUIApplication((GUIApplication)value, diagnostics, context);
			case GuiPackage.GUI_UPDATE:
				return validateGUIUpdate((GUIUpdate)value, diagnostics, context);
			case GuiPackage.UPDATE_INFO:
				return validateUpdateInfo((UpdateInfo)value, diagnostics, context);
			case GuiPackage.WINDOW_UPDATE:
				return validateWindowUpdate((WindowUpdate)value, diagnostics, context);
			case GuiPackage.STYLE_SHEET_UPDATE:
				return validateStyleSheetUpdate((StyleSheetUpdate)value, diagnostics, context);
			case GuiPackage.REMOVE_UI_ELEMENT:
				return validateRemoveUIElement((RemoveUIElement)value, diagnostics, context);
			case GuiPackage.ADD_UI_ELEMENT:
				return validateAddUIElement((AddUIElement)value, diagnostics, context);
			case GuiPackage.ADD_TABLE_CELL:
				return validateAddTableCell((AddTableCell)value, diagnostics, context);
			case GuiPackage.REMOVE_TABLE_CELL:
				return validateRemoveTableCell((RemoveTableCell)value, diagnostics, context);
			case GuiPackage.MOVE_UI_ELEMENT:
				return validateMoveUIElement((MoveUIElement)value, diagnostics, context);
			case GuiPackage.UI_ELEMENT:
				return validateUIElement((UIElement)value, diagnostics, context);
			case GuiPackage.SUPPORTED_EVENT:
				return validateSupportedEvent((SupportedEvent)value, diagnostics, context);
			case GuiPackage.ABSTRACT_CONTAINER:
				return validateAbstractContainer((AbstractContainer)value, diagnostics, context);
			case GuiPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case GuiPackage.WINDOW:
				return validateWindow((Window)value, diagnostics, context);
			case GuiPackage.ELEMENT_ADAPTER:
				return validateElementAdapter((ElementAdapter)value, diagnostics, context);
			case GuiPackage.ADAPTER_MAPPING:
				return validateAdapterMapping((AdapterMapping)value, diagnostics, context);
			case GuiPackage.ARRAY_ADAPTER:
				return validateArrayAdapter((ArrayAdapter)value, diagnostics, context);
			case GuiPackage.GRID_CONTAINER:
				return validateGridContainer((GridContainer)value, diagnostics, context);
			case GuiPackage.CANVAS:
				return validateCanvas((Canvas)value, diagnostics, context);
			case GuiPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case GuiPackage.VBOX:
				return validateVBox((VBox)value, diagnostics, context);
			case GuiPackage.HBOX:
				return validateHBox((HBox)value, diagnostics, context);
			case GuiPackage.DIV:
				return validateDiv((Div)value, diagnostics, context);
			case GuiPackage.GRID_ROW:
				return validateGridRow((GridRow)value, diagnostics, context);
			case GuiPackage.GRID_ITEM:
				return validateGridItem((GridItem)value, diagnostics, context);
			case GuiPackage.GRID_HEADER_ITEM:
				return validateGridHeaderItem((GridHeaderItem)value, diagnostics, context);
			case GuiPackage.HTML_VIEW:
				return validateHTMLView((HTMLView)value, diagnostics, context);
			case GuiPackage.DISPLAY_CONTEXT_VIEW:
				return validateDisplayContextView((DisplayContextView)value, diagnostics, context);
			case GuiPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			case GuiPackage.MARGIN:
				return validateMargin((Margin)value, diagnostics, context);
			case GuiPackage.SIZE:
				return validateSize((Size)value, diagnostics, context);
			case GuiPackage.ABSOLUTE_LAYOUT:
				return validateAbsoluteLayout((AbsoluteLayout)value, diagnostics, context);
			case GuiPackage.FLOW_LAYOUT:
				return validateFlowLayout((FlowLayout)value, diagnostics, context);
			case GuiPackage.TOOL_TIP:
				return validateToolTip((ToolTip)value, diagnostics, context);
			case GuiPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case GuiPackage.TEXT_INPUT:
				return validateTextInput((TextInput)value, diagnostics, context);
			case GuiPackage.LABELED_TEXT_INPUT:
				return validateLabeledTextInput((LabeledTextInput)value, diagnostics, context);
			case GuiPackage.RICH_TEXT_INPUT:
				return validateRichTextInput((RichTextInput)value, diagnostics, context);
			case GuiPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case GuiPackage.LIST_ITEM:
				return validateListItem((ListItem)value, diagnostics, context);
			case GuiPackage.COMBO_BOX:
				return validateComboBox((ComboBox)value, diagnostics, context);
			case GuiPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case GuiPackage.SUBMIT_BUTTON:
				return validateSubmitButton((SubmitButton)value, diagnostics, context);
			case GuiPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			case GuiPackage.RADIO_BUTTON:
				return validateRadioButton((RadioButton)value, diagnostics, context);
			case GuiPackage.TOGGLE_BUTTON:
				return validateToggleButton((ToggleButton)value, diagnostics, context);
			case GuiPackage.IMAGE_BUTTON:
				return validateImageButton((ImageButton)value, diagnostics, context);
			case GuiPackage.BUTTON_BAR:
				return validateButtonBar((ButtonBar)value, diagnostics, context);
			case GuiPackage.COLOR_PICKER:
				return validateColorPicker((ColorPicker)value, diagnostics, context);
			case GuiPackage.PROGRESS_BAR:
				return validateProgressBar((ProgressBar)value, diagnostics, context);
			case GuiPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case GuiPackage.IMAGE_GALLERY:
				return validateImageGallery((ImageGallery)value, diagnostics, context);
			case GuiPackage.MEDIA_PLAYER:
				return validateMediaPlayer((MediaPlayer)value, diagnostics, context);
			case GuiPackage.SPINNER:
				return validateSpinner((Spinner)value, diagnostics, context);
			case GuiPackage.NUMERIC_STEPPER:
				return validateNumericStepper((NumericStepper)value, diagnostics, context);
			case GuiPackage.SCROLLBAR:
				return validateScrollbar((Scrollbar)value, diagnostics, context);
			case GuiPackage.CALENDAR_VIEW:
				return validateCalendarView((CalendarView)value, diagnostics, context);
			case GuiPackage.SOFT_KEYBOARD:
				return validateSoftKeyboard((SoftKeyboard)value, diagnostics, context);
			case GuiPackage.ABSTRACT_DIALOG_BOX:
				return validateAbstractDialogBox((AbstractDialogBox)value, diagnostics, context);
			case GuiPackage.DIALOG_BOX:
				return validateDialogBox((DialogBox)value, diagnostics, context);
			case GuiPackage.CUSTOM_DIALOG:
				return validateCustomDialog((CustomDialog)value, diagnostics, context);
			case GuiPackage.FILE_CHOOSER:
				return validateFileChooser((FileChooser)value, diagnostics, context);
			case GuiPackage.TAB_ITEM:
				return validateTabItem((TabItem)value, diagnostics, context);
			case GuiPackage.TAB_VIEW:
				return validateTabView((TabView)value, diagnostics, context);
			case GuiPackage.UI_ELEMENT_UPDATE:
				return validateUIElementUpdate((UIElementUpdate)value, diagnostics, context);
			case GuiPackage.TEXT_INPUT_UPDATE:
				return validateTextInputUpdate((TextInputUpdate)value, diagnostics, context);
			case GuiPackage.LABELED_TEXT_INPUT_UPDATE:
				return validateLabeledTextInputUpdate((LabeledTextInputUpdate)value, diagnostics, context);
			case GuiPackage.RICH_TEXT_INPUT_UPDATE:
				return validateRichTextInputUpdate((RichTextInputUpdate)value, diagnostics, context);
			case GuiPackage.COLOR_PICKER_UPDATE:
				return validateColorPickerUpdate((ColorPickerUpdate)value, diagnostics, context);
			case GuiPackage.LABEL_UPDATE:
				return validateLabelUpdate((LabelUpdate)value, diagnostics, context);
			case GuiPackage.LIST_UPDATE:
				return validateListUpdate((ListUpdate)value, diagnostics, context);
			case GuiPackage.COMBOBOX_UPDATE:
				return validateComboboxUpdate((ComboboxUpdate)value, diagnostics, context);
			case GuiPackage.LIST_ITEM_UPDATE:
				return validateListItemUpdate((ListItemUpdate)value, diagnostics, context);
			case GuiPackage.BUTTON_UPDATE:
				return validateButtonUpdate((ButtonUpdate)value, diagnostics, context);
			case GuiPackage.SUBMIT_BUTTON_UPDATE:
				return validateSubmitButtonUpdate((SubmitButtonUpdate)value, diagnostics, context);
			case GuiPackage.CHECK_BOX_UPDATE:
				return validateCheckBoxUpdate((CheckBoxUpdate)value, diagnostics, context);
			case GuiPackage.RADIO_BUTTON_UPDATE:
				return validateRadioButtonUpdate((RadioButtonUpdate)value, diagnostics, context);
			case GuiPackage.IMAGE_BUTTON_UPDATE:
				return validateImageButtonUpdate((ImageButtonUpdate)value, diagnostics, context);
			case GuiPackage.TOGGLE_BUTTON_UPDATE:
				return validateToggleButtonUpdate((ToggleButtonUpdate)value, diagnostics, context);
			case GuiPackage.GRID_CONTAINER_UPDATE:
				return validateGridContainerUpdate((GridContainerUpdate)value, diagnostics, context);
			case GuiPackage.CANVAS_UPDATE:
				return validateCanvasUpdate((CanvasUpdate)value, diagnostics, context);
			case GuiPackage.FORM_UPDATE:
				return validateFormUpdate((FormUpdate)value, diagnostics, context);
			case GuiPackage.VBOX_UPDATE:
				return validateVBoxUpdate((VBoxUpdate)value, diagnostics, context);
			case GuiPackage.HBOX_UPDATE:
				return validateHBoxUpdate((HBoxUpdate)value, diagnostics, context);
			case GuiPackage.HTML_VIEW_UPDATE:
				return validateHtmlViewUpdate((HtmlViewUpdate)value, diagnostics, context);
			case GuiPackage.TAB_ITEM_UPDATE:
				return validateTabItemUpdate((TabItemUpdate)value, diagnostics, context);
			case GuiPackage.IMAGE_UPDATE:
				return validateImageUpdate((ImageUpdate)value, diagnostics, context);
			case GuiPackage.DIALOG_UPDATE:
				return validateDialogUpdate((DialogUpdate)value, diagnostics, context);
			case GuiPackage.PROGRESS_BAR_UPDATE:
				return validateProgressBarUpdate((ProgressBarUpdate)value, diagnostics, context);
			case GuiPackage.JAVA_SCRIPT_UPDATE:
				return validateJavaScriptUpdate((JavaScriptUpdate)value, diagnostics, context);
			case GuiPackage.GUI_PLUGIN:
				return validateGuiPlugin((GuiPlugin)value, diagnostics, context);
			case GuiPackage.ALIGNMENT:
				return validateAlignment((Alignment)value, diagnostics, context);
			case GuiPackage.VALIGNMENT:
				return validateVAlignment((VAlignment)value, diagnostics, context);
			case GuiPackage.ORIENTATION:
				return validateOrientation((Orientation)value, diagnostics, context);
			case GuiPackage.IMAGE_FILL_MODES:
				return validateImageFillModes((ImageFillModes)value, diagnostics, context);
			case GuiPackage.DIRECTION_HV:
				return validateDirectionHV((DirectionHV)value, diagnostics, context);
			case GuiPackage.DIALOGUE_BUTTONS:
				return validateDialogueButtons((DialogueButtons)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUIRequest(GUIRequest guiRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUIEvent(GUIEvent guiEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUIApplication(GUIApplication guiApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUIUpdate(GUIUpdate guiUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateInfo(UpdateInfo updateInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowUpdate(WindowUpdate windowUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(windowUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSheetUpdate(StyleSheetUpdate styleSheetUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSheetUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveUIElement(RemoveUIElement removeUIElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeUIElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddUIElement(AddUIElement addUIElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addUIElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddTableCell(AddTableCell addTableCell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addTableCell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveTableCell(RemoveTableCell removeTableCell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeTableCell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoveUIElement(MoveUIElement moveUIElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveUIElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIElement(UIElement uiElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedEvent(SupportedEvent supportedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractContainer(AbstractContainer abstractContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(window, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementAdapter(ElementAdapter elementAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdapterMapping(AdapterMapping adapterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adapterMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayAdapter(ArrayAdapter arrayAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridContainer(GridContainer gridContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanvas(Canvas canvas, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(canvas, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBox(VBox vBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHBox(HBox hBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiv(Div div, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(div, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridRow(GridRow gridRow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridRow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridItem(GridItem gridItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gridItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gridItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateGridItem_oneChildOnly(gridItem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneChildOnly constraint of '<em>Grid Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRID_ITEM__ONE_CHILD_ONLY__EEXPRESSION = "elements->size() = 1";

	/**
	 * Validates the oneChildOnly constraint of '<em>Grid Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridItem_oneChildOnly(GridItem gridItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GuiPackage.Literals.GRID_ITEM,
				 gridItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneChildOnly",
				 GRID_ITEM__ONE_CHILD_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridHeaderItem(GridHeaderItem gridHeaderItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gridHeaderItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gridHeaderItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateGridItem_oneChildOnly(gridHeaderItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTMLView(HTMLView htmlView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htmlView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayContextView(DisplayContextView displayContextView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displayContextView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMargin(Margin margin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(margin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(size, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteLayout(AbsoluteLayout absoluteLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absoluteLayout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowLayout(FlowLayout flowLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowLayout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolTip(ToolTip toolTip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolTip, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInput(TextInput textInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledTextInput(LabeledTextInput labeledTextInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledTextInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichTextInput(RichTextInput richTextInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richTextInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItem(ListItem listItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComboBox(ComboBox comboBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comboBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(button, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmitButton(SubmitButton submitButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(submitButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioButton(RadioButton radioButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToggleButton(ToggleButton toggleButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toggleButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageButton(ImageButton imageButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonBar(ButtonBar buttonBar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonBar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPicker(ColorPicker colorPicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorPicker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressBar(ProgressBar progressBar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(progressBar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageGallery(ImageGallery imageGallery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageGallery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaPlayer(MediaPlayer mediaPlayer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mediaPlayer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpinner(Spinner spinner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spinner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericStepper(NumericStepper numericStepper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericStepper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScrollbar(Scrollbar scrollbar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scrollbar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarView(CalendarView calendarView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendarView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftKeyboard(SoftKeyboard softKeyboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softKeyboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDialogBox(AbstractDialogBox abstractDialogBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractDialogBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogBox(DialogBox dialogBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dialogBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomDialog(CustomDialog customDialog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customDialog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileChooser(FileChooser fileChooser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileChooser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabItem(TabItem tabItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabView(TabView tabView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIElementUpdate(UIElementUpdate uiElementUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiElementUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInputUpdate(TextInputUpdate textInputUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textInputUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledTextInputUpdate(LabeledTextInputUpdate labeledTextInputUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledTextInputUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichTextInputUpdate(RichTextInputUpdate richTextInputUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richTextInputUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPickerUpdate(ColorPickerUpdate colorPickerUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorPickerUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelUpdate(LabelUpdate labelUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListUpdate(ListUpdate listUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComboboxUpdate(ComboboxUpdate comboboxUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comboboxUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemUpdate(ListItemUpdate listItemUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listItemUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonUpdate(ButtonUpdate buttonUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmitButtonUpdate(SubmitButtonUpdate submitButtonUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(submitButtonUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBoxUpdate(CheckBoxUpdate checkBoxUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBoxUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioButtonUpdate(RadioButtonUpdate radioButtonUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioButtonUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageButtonUpdate(ImageButtonUpdate imageButtonUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageButtonUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToggleButtonUpdate(ToggleButtonUpdate toggleButtonUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toggleButtonUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridContainerUpdate(GridContainerUpdate gridContainerUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridContainerUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanvasUpdate(CanvasUpdate canvasUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(canvasUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormUpdate(FormUpdate formUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBoxUpdate(VBoxUpdate vBoxUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vBoxUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHBoxUpdate(HBoxUpdate hBoxUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hBoxUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHtmlViewUpdate(HtmlViewUpdate htmlViewUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htmlViewUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabItemUpdate(TabItemUpdate tabItemUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabItemUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageUpdate(ImageUpdate imageUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogUpdate(DialogUpdate dialogUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dialogUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressBarUpdate(ProgressBarUpdate progressBarUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(progressBarUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaScriptUpdate(JavaScriptUpdate javaScriptUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaScriptUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuiPlugin(GuiPlugin guiPlugin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiPlugin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignment(Alignment alignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVAlignment(VAlignment vAlignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientation(Orientation orientation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageFillModes(ImageFillModes imageFillModes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionHV(DirectionHV directionHV, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogueButtons(DialogueButtons dialogueButtons, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GuiValidator
