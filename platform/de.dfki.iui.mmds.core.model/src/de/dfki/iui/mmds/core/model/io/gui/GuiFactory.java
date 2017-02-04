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
package de.dfki.iui.mmds.core.model.io.gui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage
 * @generated
 */
public interface GuiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.gui.impl.GuiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GUI Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Event</em>'.
	 * @generated
	 */
	GUIEvent createGUIEvent();

	/**
	 * Returns a new object of class '<em>GUI Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Application</em>'.
	 * @generated
	 */
	GUIApplication createGUIApplication();

	/**
	 * Returns a new object of class '<em>GUI Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Update</em>'.
	 * @generated
	 */
	GUIUpdate createGUIUpdate();

	/**
	 * Returns a new object of class '<em>Window Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window Update</em>'.
	 * @generated
	 */
	WindowUpdate createWindowUpdate();

	/**
	 * Returns a new object of class '<em>Style Sheet Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Sheet Update</em>'.
	 * @generated
	 */
	StyleSheetUpdate createStyleSheetUpdate();

	/**
	 * Returns a new object of class '<em>Remove UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove UI Element</em>'.
	 * @generated
	 */
	RemoveUIElement createRemoveUIElement();

	/**
	 * Returns a new object of class '<em>Add UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add UI Element</em>'.
	 * @generated
	 */
	AddUIElement createAddUIElement();

	/**
	 * Returns a new object of class '<em>Add Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Table Cell</em>'.
	 * @generated
	 */
	AddTableCell createAddTableCell();

	/**
	 * Returns a new object of class '<em>Remove Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Table Cell</em>'.
	 * @generated
	 */
	RemoveTableCell createRemoveTableCell();

	/**
	 * Returns a new object of class '<em>Move UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move UI Element</em>'.
	 * @generated
	 */
	MoveUIElement createMoveUIElement();

	/**
	 * Returns a new object of class '<em>Supported Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Event</em>'.
	 * @generated
	 */
	SupportedEvent createSupportedEvent();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Tab View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab View</em>'.
	 * @generated
	 */
	TabView createTabView();

	/**
	 * Returns a new object of class '<em>Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input Update</em>'.
	 * @generated
	 */
	TextInputUpdate createTextInputUpdate();

	/**
	 * Returns a new object of class '<em>Labeled Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Text Input Update</em>'.
	 * @generated
	 */
	LabeledTextInputUpdate createLabeledTextInputUpdate();

	/**
	 * Returns a new object of class '<em>Rich Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich Text Input Update</em>'.
	 * @generated
	 */
	RichTextInputUpdate createRichTextInputUpdate();

	/**
	 * Returns a new object of class '<em>Color Picker Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Picker Update</em>'.
	 * @generated
	 */
	ColorPickerUpdate createColorPickerUpdate();

	/**
	 * Returns a new object of class '<em>Label Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Update</em>'.
	 * @generated
	 */
	LabelUpdate createLabelUpdate();

	/**
	 * Returns a new object of class '<em>List Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Update</em>'.
	 * @generated
	 */
	ListUpdate createListUpdate();

	/**
	 * Returns a new object of class '<em>Combobox Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combobox Update</em>'.
	 * @generated
	 */
	ComboboxUpdate createComboboxUpdate();

	/**
	 * Returns a new object of class '<em>List Item Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item Update</em>'.
	 * @generated
	 */
	ListItemUpdate createListItemUpdate();

	/**
	 * Returns a new object of class '<em>Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Update</em>'.
	 * @generated
	 */
	ButtonUpdate createButtonUpdate();

	/**
	 * Returns a new object of class '<em>Submit Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Button Update</em>'.
	 * @generated
	 */
	SubmitButtonUpdate createSubmitButtonUpdate();

	/**
	 * Returns a new object of class '<em>Check Box Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box Update</em>'.
	 * @generated
	 */
	CheckBoxUpdate createCheckBoxUpdate();

	/**
	 * Returns a new object of class '<em>Radio Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button Update</em>'.
	 * @generated
	 */
	RadioButtonUpdate createRadioButtonUpdate();

	/**
	 * Returns a new object of class '<em>Image Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Button Update</em>'.
	 * @generated
	 */
	ImageButtonUpdate createImageButtonUpdate();

	/**
	 * Returns a new object of class '<em>Toggle Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle Button Update</em>'.
	 * @generated
	 */
	ToggleButtonUpdate createToggleButtonUpdate();

	/**
	 * Returns a new object of class '<em>Grid Container Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Container Update</em>'.
	 * @generated
	 */
	GridContainerUpdate createGridContainerUpdate();

	/**
	 * Returns a new object of class '<em>Canvas Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas Update</em>'.
	 * @generated
	 */
	CanvasUpdate createCanvasUpdate();

	/**
	 * Returns a new object of class '<em>Form Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Update</em>'.
	 * @generated
	 */
	FormUpdate createFormUpdate();

	/**
	 * Returns a new object of class '<em>VBox Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBox Update</em>'.
	 * @generated
	 */
	VBoxUpdate createVBoxUpdate();

	/**
	 * Returns a new object of class '<em>HBox Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBox Update</em>'.
	 * @generated
	 */
	HBoxUpdate createHBoxUpdate();

	/**
	 * Returns a new object of class '<em>Html View Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html View Update</em>'.
	 * @generated
	 */
	HtmlViewUpdate createHtmlViewUpdate();

	/**
	 * Returns a new object of class '<em>Tab Item Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Item Update</em>'.
	 * @generated
	 */
	TabItemUpdate createTabItemUpdate();

	/**
	 * Returns a new object of class '<em>Image Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Update</em>'.
	 * @generated
	 */
	ImageUpdate createImageUpdate();

	/**
	 * Returns a new object of class '<em>Dialog Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Update</em>'.
	 * @generated
	 */
	DialogUpdate createDialogUpdate();

	/**
	 * Returns a new object of class '<em>Progress Bar Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Bar Update</em>'.
	 * @generated
	 */
	ProgressBarUpdate createProgressBarUpdate();

	/**
	 * Returns a new object of class '<em>Java Script Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Update</em>'.
	 * @generated
	 */
	JavaScriptUpdate createJavaScriptUpdate();

	/**
	 * Returns a new object of class '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin</em>'.
	 * @generated
	 */
	GuiPlugin createGuiPlugin();

	/**
	 * Returns a new object of class '<em>Tab Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Item</em>'.
	 * @generated
	 */
	TabItem createTabItem();

	/**
	 * Returns a new object of class '<em>Element Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Adapter</em>'.
	 * @generated
	 */
	ElementAdapter createElementAdapter();

	/**
	 * Returns a new object of class '<em>Adapter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Mapping</em>'.
	 * @generated
	 */
	AdapterMapping createAdapterMapping();

	/**
	 * Returns a new object of class '<em>Array Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Adapter</em>'.
	 * @generated
	 */
	ArrayAdapter createArrayAdapter();

	/**
	 * Returns a new object of class '<em>Grid Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Container</em>'.
	 * @generated
	 */
	GridContainer createGridContainer();

	/**
	 * Returns a new object of class '<em>Grid Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Row</em>'.
	 * @generated
	 */
	GridRow createGridRow();

	/**
	 * Returns a new object of class '<em>Grid Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Item</em>'.
	 * @generated
	 */
	GridItem createGridItem();

	/**
	 * Returns a new object of class '<em>Button Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Bar</em>'.
	 * @generated
	 */
	ButtonBar createButtonBar();

	/**
	 * Returns a new object of class '<em>HTML View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML View</em>'.
	 * @generated
	 */
	HTMLView createHTMLView();

	/**
	 * Returns a new object of class '<em>Display Context View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Context View</em>'.
	 * @generated
	 */
	DisplayContextView createDisplayContextView();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns a new object of class '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Margin</em>'.
	 * @generated
	 */
	Margin createMargin();

	/**
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns a new object of class '<em>Absolute Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Layout</em>'.
	 * @generated
	 */
	AbsoluteLayout createAbsoluteLayout();

	/**
	 * Returns a new object of class '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Layout</em>'.
	 * @generated
	 */
	FlowLayout createFlowLayout();

	/**
	 * Returns a new object of class '<em>Tool Tip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Tip</em>'.
	 * @generated
	 */
	ToolTip createToolTip();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Submit Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Button</em>'.
	 * @generated
	 */
	SubmitButton createSubmitButton();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input</em>'.
	 * @generated
	 */
	TextInput createTextInput();

	/**
	 * Returns a new object of class '<em>Labeled Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Text Input</em>'.
	 * @generated
	 */
	LabeledTextInput createLabeledTextInput();

	/**
	 * Returns a new object of class '<em>Rich Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich Text Input</em>'.
	 * @generated
	 */
	RichTextInput createRichTextInput();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item</em>'.
	 * @generated
	 */
	ListItem createListItem();

	/**
	 * Returns a new object of class '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box</em>'.
	 * @generated
	 */
	ComboBox createComboBox();

	/**
	 * Returns a new object of class '<em>Color Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Picker</em>'.
	 * @generated
	 */
	ColorPicker createColorPicker();

	/**
	 * Returns a new object of class '<em>Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Bar</em>'.
	 * @generated
	 */
	ProgressBar createProgressBar();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Image Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Gallery</em>'.
	 * @generated
	 */
	ImageGallery createImageGallery();

	/**
	 * Returns a new object of class '<em>Media Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Player</em>'.
	 * @generated
	 */
	MediaPlayer createMediaPlayer();

	/**
	 * Returns a new object of class '<em>Numeric Stepper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Stepper</em>'.
	 * @generated
	 */
	NumericStepper createNumericStepper();

	/**
	 * Returns a new object of class '<em>Scrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scrollbar</em>'.
	 * @generated
	 */
	Scrollbar createScrollbar();

	/**
	 * Returns a new object of class '<em>Calendar View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar View</em>'.
	 * @generated
	 */
	CalendarView createCalendarView();

	/**
	 * Returns a new object of class '<em>Soft Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soft Keyboard</em>'.
	 * @generated
	 */
	SoftKeyboard createSoftKeyboard();

	/**
	 * Returns a new object of class '<em>Dialog Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Box</em>'.
	 * @generated
	 */
	DialogBox createDialogBox();

	/**
	 * Returns a new object of class '<em>Custom Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Dialog</em>'.
	 * @generated
	 */
	CustomDialog createCustomDialog();

	/**
	 * Returns a new object of class '<em>File Chooser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Chooser</em>'.
	 * @generated
	 */
	FileChooser createFileChooser();

	/**
	 * Returns a new object of class '<em>Toggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle Button</em>'.
	 * @generated
	 */
	ToggleButton createToggleButton();

	/**
	 * Returns a new object of class '<em>Image Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Button</em>'.
	 * @generated
	 */
	ImageButton createImageButton();

	/**
	 * Returns a new object of class '<em>Grid Header Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Header Item</em>'.
	 * @generated
	 */
	GridHeaderItem createGridHeaderItem();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>VBox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBox</em>'.
	 * @generated
	 */
	VBox createVBox();

	/**
	 * Returns a new object of class '<em>HBox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBox</em>'.
	 * @generated
	 */
	HBox createHBox();

	/**
	 * Returns a new object of class '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Div</em>'.
	 * @generated
	 */
	Div createDiv();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuiPackage getGuiPackage();

} //GuiFactory
