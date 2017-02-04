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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.gui.*;
import de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput;
import de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput;
import de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout;
import de.dfki.iui.mmds.core.model.io.gui.AbstractContainer;
import de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox;
import de.dfki.iui.mmds.core.model.io.gui.AdapterMapping;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
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
import de.dfki.iui.mmds.core.model.io.gui.Container;
import de.dfki.iui.mmds.core.model.io.gui.CustomDialog;
import de.dfki.iui.mmds.core.model.io.gui.DialogBox;
import de.dfki.iui.mmds.core.model.io.gui.DialogUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ElementAdapter;
import de.dfki.iui.mmds.core.model.io.gui.FileChooser;
import de.dfki.iui.mmds.core.model.io.gui.FlowLayout;
import de.dfki.iui.mmds.core.model.io.gui.Form;
import de.dfki.iui.mmds.core.model.io.gui.FormUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GUIEvent;
import de.dfki.iui.mmds.core.model.io.gui.GUIRequest;
import de.dfki.iui.mmds.core.model.io.gui.GUIUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GridContainer;
import de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.GuiPlugin;
import de.dfki.iui.mmds.core.model.io.gui.HBox;
import de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.HTMLView;
import de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Image;
import de.dfki.iui.mmds.core.model.io.gui.ImageButton;
import de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ImageGallery;
import de.dfki.iui.mmds.core.model.io.gui.ImageUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Label;
import de.dfki.iui.mmds.core.model.io.gui.LabelUpdate;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Layout;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ListUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Margin;
import de.dfki.iui.mmds.core.model.io.gui.MediaPlayer;
import de.dfki.iui.mmds.core.model.io.gui.NumericStepper;
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
import de.dfki.iui.mmds.core.model.io.gui.Spinner;
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
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UpdateInfo;
import de.dfki.iui.mmds.core.model.io.gui.VBox;
import de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Window;
import de.dfki.iui.mmds.core.model.io.gui.WindowUpdate;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage
 * @generated
 */
public class GuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiSwitch() {
		if (modelPackage == null) {
			modelPackage = GuiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GuiPackage.GUI_REQUEST: {
				GUIRequest guiRequest = (GUIRequest)theEObject;
				T result = caseGUIRequest(guiRequest);
				if (result == null) result = caseRendererOutput(guiRequest);
				if (result == null) result = caseOutputRepresentation(guiRequest);
				if (result == null) result = caseIORepresentation(guiRequest);
				if (result == null) result = caseBObject(guiRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GUI_EVENT: {
				GUIEvent guiEvent = (GUIEvent)theEObject;
				T result = caseGUIEvent(guiEvent);
				if (result == null) result = caseControllerInput(guiEvent);
				if (result == null) result = caseInputRepresentation(guiEvent);
				if (result == null) result = caseIORepresentation(guiEvent);
				if (result == null) result = caseBObject(guiEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GUI_APPLICATION: {
				GUIApplication guiApplication = (GUIApplication)theEObject;
				T result = caseGUIApplication(guiApplication);
				if (result == null) result = caseGUIRequest(guiApplication);
				if (result == null) result = caseRendererOutput(guiApplication);
				if (result == null) result = caseOutputRepresentation(guiApplication);
				if (result == null) result = caseIORepresentation(guiApplication);
				if (result == null) result = caseBObject(guiApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GUI_UPDATE: {
				GUIUpdate guiUpdate = (GUIUpdate)theEObject;
				T result = caseGUIUpdate(guiUpdate);
				if (result == null) result = caseGUIRequest(guiUpdate);
				if (result == null) result = caseRendererOutput(guiUpdate);
				if (result == null) result = caseOutputRepresentation(guiUpdate);
				if (result == null) result = caseIORepresentation(guiUpdate);
				if (result == null) result = caseBObject(guiUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.UPDATE_INFO: {
				UpdateInfo updateInfo = (UpdateInfo)theEObject;
				T result = caseUpdateInfo(updateInfo);
				if (result == null) result = caseBObject(updateInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.WINDOW_UPDATE: {
				WindowUpdate windowUpdate = (WindowUpdate)theEObject;
				T result = caseWindowUpdate(windowUpdate);
				if (result == null) result = caseUpdateInfo(windowUpdate);
				if (result == null) result = caseBObject(windowUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.STYLE_SHEET_UPDATE: {
				StyleSheetUpdate styleSheetUpdate = (StyleSheetUpdate)theEObject;
				T result = caseStyleSheetUpdate(styleSheetUpdate);
				if (result == null) result = caseUpdateInfo(styleSheetUpdate);
				if (result == null) result = caseBObject(styleSheetUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.REMOVE_UI_ELEMENT: {
				RemoveUIElement removeUIElement = (RemoveUIElement)theEObject;
				T result = caseRemoveUIElement(removeUIElement);
				if (result == null) result = caseUpdateInfo(removeUIElement);
				if (result == null) result = caseBObject(removeUIElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ADD_UI_ELEMENT: {
				AddUIElement addUIElement = (AddUIElement)theEObject;
				T result = caseAddUIElement(addUIElement);
				if (result == null) result = caseUpdateInfo(addUIElement);
				if (result == null) result = caseBObject(addUIElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ADD_TABLE_CELL: {
				AddTableCell addTableCell = (AddTableCell)theEObject;
				T result = caseAddTableCell(addTableCell);
				if (result == null) result = caseAddUIElement(addTableCell);
				if (result == null) result = caseUpdateInfo(addTableCell);
				if (result == null) result = caseBObject(addTableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.REMOVE_TABLE_CELL: {
				RemoveTableCell removeTableCell = (RemoveTableCell)theEObject;
				T result = caseRemoveTableCell(removeTableCell);
				if (result == null) result = caseRemoveUIElement(removeTableCell);
				if (result == null) result = caseUpdateInfo(removeTableCell);
				if (result == null) result = caseBObject(removeTableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.MOVE_UI_ELEMENT: {
				MoveUIElement moveUIElement = (MoveUIElement)theEObject;
				T result = caseMoveUIElement(moveUIElement);
				if (result == null) result = caseUpdateInfo(moveUIElement);
				if (result == null) result = caseBObject(moveUIElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.UI_ELEMENT: {
				UIElement uiElement = (UIElement)theEObject;
				T result = caseUIElement(uiElement);
				if (result == null) result = caseBObject(uiElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SUPPORTED_EVENT: {
				SupportedEvent supportedEvent = (SupportedEvent)theEObject;
				T result = caseSupportedEvent(supportedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ABSTRACT_CONTAINER: {
				AbstractContainer abstractContainer = (AbstractContainer)theEObject;
				T result = caseAbstractContainer(abstractContainer);
				if (result == null) result = caseUIElement(abstractContainer);
				if (result == null) result = caseBObject(abstractContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseAbstractContainer(container);
				if (result == null) result = caseUIElement(container);
				if (result == null) result = caseBObject(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseContainer(window);
				if (result == null) result = caseAbstractContainer(window);
				if (result == null) result = caseUIElement(window);
				if (result == null) result = caseBObject(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ELEMENT_ADAPTER: {
				ElementAdapter elementAdapter = (ElementAdapter)theEObject;
				T result = caseElementAdapter(elementAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ADAPTER_MAPPING: {
				AdapterMapping adapterMapping = (AdapterMapping)theEObject;
				T result = caseAdapterMapping(adapterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ARRAY_ADAPTER: {
				ArrayAdapter arrayAdapter = (ArrayAdapter)theEObject;
				T result = caseArrayAdapter(arrayAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID_CONTAINER: {
				GridContainer gridContainer = (GridContainer)theEObject;
				T result = caseGridContainer(gridContainer);
				if (result == null) result = caseAbstractContainer(gridContainer);
				if (result == null) result = caseUIElement(gridContainer);
				if (result == null) result = caseBObject(gridContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CANVAS: {
				Canvas canvas = (Canvas)theEObject;
				T result = caseCanvas(canvas);
				if (result == null) result = caseContainer(canvas);
				if (result == null) result = caseAbstractContainer(canvas);
				if (result == null) result = caseUIElement(canvas);
				if (result == null) result = caseBObject(canvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseContainer(form);
				if (result == null) result = caseAbstractContainer(form);
				if (result == null) result = caseUIElement(form);
				if (result == null) result = caseBObject(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.VBOX: {
				VBox vBox = (VBox)theEObject;
				T result = caseVBox(vBox);
				if (result == null) result = caseContainer(vBox);
				if (result == null) result = caseAbstractContainer(vBox);
				if (result == null) result = caseUIElement(vBox);
				if (result == null) result = caseBObject(vBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.HBOX: {
				HBox hBox = (HBox)theEObject;
				T result = caseHBox(hBox);
				if (result == null) result = caseContainer(hBox);
				if (result == null) result = caseAbstractContainer(hBox);
				if (result == null) result = caseUIElement(hBox);
				if (result == null) result = caseBObject(hBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseContainer(div);
				if (result == null) result = caseAbstractContainer(div);
				if (result == null) result = caseUIElement(div);
				if (result == null) result = caseBObject(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID_ROW: {
				GridRow gridRow = (GridRow)theEObject;
				T result = caseGridRow(gridRow);
				if (result == null) result = caseAbstractContainer(gridRow);
				if (result == null) result = caseUIElement(gridRow);
				if (result == null) result = caseBObject(gridRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID_ITEM: {
				GridItem gridItem = (GridItem)theEObject;
				T result = caseGridItem(gridItem);
				if (result == null) result = caseContainer(gridItem);
				if (result == null) result = caseAbstractContainer(gridItem);
				if (result == null) result = caseUIElement(gridItem);
				if (result == null) result = caseBObject(gridItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID_HEADER_ITEM: {
				GridHeaderItem gridHeaderItem = (GridHeaderItem)theEObject;
				T result = caseGridHeaderItem(gridHeaderItem);
				if (result == null) result = caseGridItem(gridHeaderItem);
				if (result == null) result = caseContainer(gridHeaderItem);
				if (result == null) result = caseAbstractContainer(gridHeaderItem);
				if (result == null) result = caseUIElement(gridHeaderItem);
				if (result == null) result = caseBObject(gridHeaderItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.HTML_VIEW: {
				HTMLView htmlView = (HTMLView)theEObject;
				T result = caseHTMLView(htmlView);
				if (result == null) result = caseUIElement(htmlView);
				if (result == null) result = caseBObject(htmlView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.DISPLAY_CONTEXT_VIEW: {
				DisplayContextView displayContextView = (DisplayContextView)theEObject;
				T result = caseDisplayContextView(displayContextView);
				if (result == null) result = caseUIElement(displayContextView);
				if (result == null) result = caseBObject(displayContextView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.MARGIN: {
				Margin margin = (Margin)theEObject;
				T result = caseMargin(margin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SIZE: {
				Size size = (Size)theEObject;
				T result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ABSOLUTE_LAYOUT: {
				AbsoluteLayout absoluteLayout = (AbsoluteLayout)theEObject;
				T result = caseAbsoluteLayout(absoluteLayout);
				if (result == null) result = caseLayout(absoluteLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.FLOW_LAYOUT: {
				FlowLayout flowLayout = (FlowLayout)theEObject;
				T result = caseFlowLayout(flowLayout);
				if (result == null) result = caseLayout(flowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TOOL_TIP: {
				ToolTip toolTip = (ToolTip)theEObject;
				T result = caseToolTip(toolTip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseUIElement(label);
				if (result == null) result = caseBObject(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TEXT_INPUT: {
				TextInput textInput = (TextInput)theEObject;
				T result = caseTextInput(textInput);
				if (result == null) result = caseUIElement(textInput);
				if (result == null) result = caseBObject(textInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LABELED_TEXT_INPUT: {
				LabeledTextInput labeledTextInput = (LabeledTextInput)theEObject;
				T result = caseLabeledTextInput(labeledTextInput);
				if (result == null) result = caseTextInput(labeledTextInput);
				if (result == null) result = caseUIElement(labeledTextInput);
				if (result == null) result = caseBObject(labeledTextInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.RICH_TEXT_INPUT: {
				RichTextInput richTextInput = (RichTextInput)theEObject;
				T result = caseRichTextInput(richTextInput);
				if (result == null) result = caseTextInput(richTextInput);
				if (result == null) result = caseUIElement(richTextInput);
				if (result == null) result = caseBObject(richTextInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseAbstractContainer(list);
				if (result == null) result = caseUIElement(list);
				if (result == null) result = caseBObject(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseUIElement(listItem);
				if (result == null) result = caseBObject(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.COMBO_BOX: {
				ComboBox comboBox = (ComboBox)theEObject;
				T result = caseComboBox(comboBox);
				if (result == null) result = caseList(comboBox);
				if (result == null) result = caseAbstractContainer(comboBox);
				if (result == null) result = caseUIElement(comboBox);
				if (result == null) result = caseBObject(comboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseUIElement(button);
				if (result == null) result = caseBObject(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SUBMIT_BUTTON: {
				SubmitButton submitButton = (SubmitButton)theEObject;
				T result = caseSubmitButton(submitButton);
				if (result == null) result = caseButton(submitButton);
				if (result == null) result = caseUIElement(submitButton);
				if (result == null) result = caseBObject(submitButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseButton(checkBox);
				if (result == null) result = caseUIElement(checkBox);
				if (result == null) result = caseBObject(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseButton(radioButton);
				if (result == null) result = caseUIElement(radioButton);
				if (result == null) result = caseBObject(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TOGGLE_BUTTON: {
				ToggleButton toggleButton = (ToggleButton)theEObject;
				T result = caseToggleButton(toggleButton);
				if (result == null) result = caseButton(toggleButton);
				if (result == null) result = caseUIElement(toggleButton);
				if (result == null) result = caseBObject(toggleButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE_BUTTON: {
				ImageButton imageButton = (ImageButton)theEObject;
				T result = caseImageButton(imageButton);
				if (result == null) result = caseButton(imageButton);
				if (result == null) result = caseUIElement(imageButton);
				if (result == null) result = caseBObject(imageButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.BUTTON_BAR: {
				ButtonBar buttonBar = (ButtonBar)theEObject;
				T result = caseButtonBar(buttonBar);
				if (result == null) result = caseAbstractContainer(buttonBar);
				if (result == null) result = caseUIElement(buttonBar);
				if (result == null) result = caseBObject(buttonBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.COLOR_PICKER: {
				ColorPicker colorPicker = (ColorPicker)theEObject;
				T result = caseColorPicker(colorPicker);
				if (result == null) result = caseTextInput(colorPicker);
				if (result == null) result = caseUIElement(colorPicker);
				if (result == null) result = caseBObject(colorPicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.PROGRESS_BAR: {
				ProgressBar progressBar = (ProgressBar)theEObject;
				T result = caseProgressBar(progressBar);
				if (result == null) result = caseUIElement(progressBar);
				if (result == null) result = caseBObject(progressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseUIElement(image);
				if (result == null) result = caseBObject(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE_GALLERY: {
				ImageGallery imageGallery = (ImageGallery)theEObject;
				T result = caseImageGallery(imageGallery);
				if (result == null) result = caseUIElement(imageGallery);
				if (result == null) result = caseBObject(imageGallery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.MEDIA_PLAYER: {
				MediaPlayer mediaPlayer = (MediaPlayer)theEObject;
				T result = caseMediaPlayer(mediaPlayer);
				if (result == null) result = caseUIElement(mediaPlayer);
				if (result == null) result = caseBObject(mediaPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseUIElement(spinner);
				if (result == null) result = caseBObject(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.NUMERIC_STEPPER: {
				NumericStepper numericStepper = (NumericStepper)theEObject;
				T result = caseNumericStepper(numericStepper);
				if (result == null) result = caseSpinner(numericStepper);
				if (result == null) result = caseUIElement(numericStepper);
				if (result == null) result = caseBObject(numericStepper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SCROLLBAR: {
				Scrollbar scrollbar = (Scrollbar)theEObject;
				T result = caseScrollbar(scrollbar);
				if (result == null) result = caseUIElement(scrollbar);
				if (result == null) result = caseBObject(scrollbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CALENDAR_VIEW: {
				CalendarView calendarView = (CalendarView)theEObject;
				T result = caseCalendarView(calendarView);
				if (result == null) result = caseUIElement(calendarView);
				if (result == null) result = caseBObject(calendarView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SOFT_KEYBOARD: {
				SoftKeyboard softKeyboard = (SoftKeyboard)theEObject;
				T result = caseSoftKeyboard(softKeyboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ABSTRACT_DIALOG_BOX: {
				AbstractDialogBox abstractDialogBox = (AbstractDialogBox)theEObject;
				T result = caseAbstractDialogBox(abstractDialogBox);
				if (result == null) result = caseUIElement(abstractDialogBox);
				if (result == null) result = caseBObject(abstractDialogBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.DIALOG_BOX: {
				DialogBox dialogBox = (DialogBox)theEObject;
				T result = caseDialogBox(dialogBox);
				if (result == null) result = caseAbstractDialogBox(dialogBox);
				if (result == null) result = caseUIElement(dialogBox);
				if (result == null) result = caseBObject(dialogBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CUSTOM_DIALOG: {
				CustomDialog customDialog = (CustomDialog)theEObject;
				T result = caseCustomDialog(customDialog);
				if (result == null) result = caseAbstractDialogBox(customDialog);
				if (result == null) result = caseUIElement(customDialog);
				if (result == null) result = caseBObject(customDialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.FILE_CHOOSER: {
				FileChooser fileChooser = (FileChooser)theEObject;
				T result = caseFileChooser(fileChooser);
				if (result == null) result = caseUIElement(fileChooser);
				if (result == null) result = caseBObject(fileChooser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAB_ITEM: {
				TabItem tabItem = (TabItem)theEObject;
				T result = caseTabItem(tabItem);
				if (result == null) result = caseUIElement(tabItem);
				if (result == null) result = caseBObject(tabItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAB_VIEW: {
				TabView tabView = (TabView)theEObject;
				T result = caseTabView(tabView);
				if (result == null) result = caseAbstractContainer(tabView);
				if (result == null) result = caseUIElement(tabView);
				if (result == null) result = caseBObject(tabView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.UI_ELEMENT_UPDATE: {
				UIElementUpdate uiElementUpdate = (UIElementUpdate)theEObject;
				T result = caseUIElementUpdate(uiElementUpdate);
				if (result == null) result = caseUpdateInfo(uiElementUpdate);
				if (result == null) result = caseBObject(uiElementUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TEXT_INPUT_UPDATE: {
				TextInputUpdate textInputUpdate = (TextInputUpdate)theEObject;
				T result = caseTextInputUpdate(textInputUpdate);
				if (result == null) result = caseUIElementUpdate(textInputUpdate);
				if (result == null) result = caseUpdateInfo(textInputUpdate);
				if (result == null) result = caseBObject(textInputUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LABELED_TEXT_INPUT_UPDATE: {
				LabeledTextInputUpdate labeledTextInputUpdate = (LabeledTextInputUpdate)theEObject;
				T result = caseLabeledTextInputUpdate(labeledTextInputUpdate);
				if (result == null) result = caseTextInputUpdate(labeledTextInputUpdate);
				if (result == null) result = caseUIElementUpdate(labeledTextInputUpdate);
				if (result == null) result = caseUpdateInfo(labeledTextInputUpdate);
				if (result == null) result = caseBObject(labeledTextInputUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.RICH_TEXT_INPUT_UPDATE: {
				RichTextInputUpdate richTextInputUpdate = (RichTextInputUpdate)theEObject;
				T result = caseRichTextInputUpdate(richTextInputUpdate);
				if (result == null) result = caseTextInputUpdate(richTextInputUpdate);
				if (result == null) result = caseUIElementUpdate(richTextInputUpdate);
				if (result == null) result = caseUpdateInfo(richTextInputUpdate);
				if (result == null) result = caseBObject(richTextInputUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.COLOR_PICKER_UPDATE: {
				ColorPickerUpdate colorPickerUpdate = (ColorPickerUpdate)theEObject;
				T result = caseColorPickerUpdate(colorPickerUpdate);
				if (result == null) result = caseTextInputUpdate(colorPickerUpdate);
				if (result == null) result = caseUIElementUpdate(colorPickerUpdate);
				if (result == null) result = caseUpdateInfo(colorPickerUpdate);
				if (result == null) result = caseBObject(colorPickerUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LABEL_UPDATE: {
				LabelUpdate labelUpdate = (LabelUpdate)theEObject;
				T result = caseLabelUpdate(labelUpdate);
				if (result == null) result = caseUIElementUpdate(labelUpdate);
				if (result == null) result = caseUpdateInfo(labelUpdate);
				if (result == null) result = caseBObject(labelUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LIST_UPDATE: {
				ListUpdate listUpdate = (ListUpdate)theEObject;
				T result = caseListUpdate(listUpdate);
				if (result == null) result = caseUIElementUpdate(listUpdate);
				if (result == null) result = caseUpdateInfo(listUpdate);
				if (result == null) result = caseBObject(listUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.COMBOBOX_UPDATE: {
				ComboboxUpdate comboboxUpdate = (ComboboxUpdate)theEObject;
				T result = caseComboboxUpdate(comboboxUpdate);
				if (result == null) result = caseListUpdate(comboboxUpdate);
				if (result == null) result = caseUIElementUpdate(comboboxUpdate);
				if (result == null) result = caseUpdateInfo(comboboxUpdate);
				if (result == null) result = caseBObject(comboboxUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LIST_ITEM_UPDATE: {
				ListItemUpdate listItemUpdate = (ListItemUpdate)theEObject;
				T result = caseListItemUpdate(listItemUpdate);
				if (result == null) result = caseUIElementUpdate(listItemUpdate);
				if (result == null) result = caseUpdateInfo(listItemUpdate);
				if (result == null) result = caseBObject(listItemUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.BUTTON_UPDATE: {
				ButtonUpdate buttonUpdate = (ButtonUpdate)theEObject;
				T result = caseButtonUpdate(buttonUpdate);
				if (result == null) result = caseUIElementUpdate(buttonUpdate);
				if (result == null) result = caseUpdateInfo(buttonUpdate);
				if (result == null) result = caseBObject(buttonUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.SUBMIT_BUTTON_UPDATE: {
				SubmitButtonUpdate submitButtonUpdate = (SubmitButtonUpdate)theEObject;
				T result = caseSubmitButtonUpdate(submitButtonUpdate);
				if (result == null) result = caseButtonUpdate(submitButtonUpdate);
				if (result == null) result = caseUIElementUpdate(submitButtonUpdate);
				if (result == null) result = caseUpdateInfo(submitButtonUpdate);
				if (result == null) result = caseBObject(submitButtonUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CHECK_BOX_UPDATE: {
				CheckBoxUpdate checkBoxUpdate = (CheckBoxUpdate)theEObject;
				T result = caseCheckBoxUpdate(checkBoxUpdate);
				if (result == null) result = caseUIElementUpdate(checkBoxUpdate);
				if (result == null) result = caseUpdateInfo(checkBoxUpdate);
				if (result == null) result = caseBObject(checkBoxUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.RADIO_BUTTON_UPDATE: {
				RadioButtonUpdate radioButtonUpdate = (RadioButtonUpdate)theEObject;
				T result = caseRadioButtonUpdate(radioButtonUpdate);
				if (result == null) result = caseCheckBoxUpdate(radioButtonUpdate);
				if (result == null) result = caseUIElementUpdate(radioButtonUpdate);
				if (result == null) result = caseUpdateInfo(radioButtonUpdate);
				if (result == null) result = caseBObject(radioButtonUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE_BUTTON_UPDATE: {
				ImageButtonUpdate imageButtonUpdate = (ImageButtonUpdate)theEObject;
				T result = caseImageButtonUpdate(imageButtonUpdate);
				if (result == null) result = caseButtonUpdate(imageButtonUpdate);
				if (result == null) result = caseUIElementUpdate(imageButtonUpdate);
				if (result == null) result = caseUpdateInfo(imageButtonUpdate);
				if (result == null) result = caseBObject(imageButtonUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TOGGLE_BUTTON_UPDATE: {
				ToggleButtonUpdate toggleButtonUpdate = (ToggleButtonUpdate)theEObject;
				T result = caseToggleButtonUpdate(toggleButtonUpdate);
				if (result == null) result = caseButtonUpdate(toggleButtonUpdate);
				if (result == null) result = caseUIElementUpdate(toggleButtonUpdate);
				if (result == null) result = caseUpdateInfo(toggleButtonUpdate);
				if (result == null) result = caseBObject(toggleButtonUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID_CONTAINER_UPDATE: {
				GridContainerUpdate gridContainerUpdate = (GridContainerUpdate)theEObject;
				T result = caseGridContainerUpdate(gridContainerUpdate);
				if (result == null) result = caseUIElementUpdate(gridContainerUpdate);
				if (result == null) result = caseUpdateInfo(gridContainerUpdate);
				if (result == null) result = caseBObject(gridContainerUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CANVAS_UPDATE: {
				CanvasUpdate canvasUpdate = (CanvasUpdate)theEObject;
				T result = caseCanvasUpdate(canvasUpdate);
				if (result == null) result = caseUIElementUpdate(canvasUpdate);
				if (result == null) result = caseUpdateInfo(canvasUpdate);
				if (result == null) result = caseBObject(canvasUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.FORM_UPDATE: {
				FormUpdate formUpdate = (FormUpdate)theEObject;
				T result = caseFormUpdate(formUpdate);
				if (result == null) result = caseUIElementUpdate(formUpdate);
				if (result == null) result = caseUpdateInfo(formUpdate);
				if (result == null) result = caseBObject(formUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.VBOX_UPDATE: {
				VBoxUpdate vBoxUpdate = (VBoxUpdate)theEObject;
				T result = caseVBoxUpdate(vBoxUpdate);
				if (result == null) result = caseUIElementUpdate(vBoxUpdate);
				if (result == null) result = caseUpdateInfo(vBoxUpdate);
				if (result == null) result = caseBObject(vBoxUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.HBOX_UPDATE: {
				HBoxUpdate hBoxUpdate = (HBoxUpdate)theEObject;
				T result = caseHBoxUpdate(hBoxUpdate);
				if (result == null) result = caseVBoxUpdate(hBoxUpdate);
				if (result == null) result = caseUIElementUpdate(hBoxUpdate);
				if (result == null) result = caseUpdateInfo(hBoxUpdate);
				if (result == null) result = caseBObject(hBoxUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.HTML_VIEW_UPDATE: {
				HtmlViewUpdate htmlViewUpdate = (HtmlViewUpdate)theEObject;
				T result = caseHtmlViewUpdate(htmlViewUpdate);
				if (result == null) result = caseUIElementUpdate(htmlViewUpdate);
				if (result == null) result = caseUpdateInfo(htmlViewUpdate);
				if (result == null) result = caseBObject(htmlViewUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAB_ITEM_UPDATE: {
				TabItemUpdate tabItemUpdate = (TabItemUpdate)theEObject;
				T result = caseTabItemUpdate(tabItemUpdate);
				if (result == null) result = caseUIElementUpdate(tabItemUpdate);
				if (result == null) result = caseUpdateInfo(tabItemUpdate);
				if (result == null) result = caseBObject(tabItemUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE_UPDATE: {
				ImageUpdate imageUpdate = (ImageUpdate)theEObject;
				T result = caseImageUpdate(imageUpdate);
				if (result == null) result = caseUIElementUpdate(imageUpdate);
				if (result == null) result = caseUpdateInfo(imageUpdate);
				if (result == null) result = caseBObject(imageUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.DIALOG_UPDATE: {
				DialogUpdate dialogUpdate = (DialogUpdate)theEObject;
				T result = caseDialogUpdate(dialogUpdate);
				if (result == null) result = caseUIElementUpdate(dialogUpdate);
				if (result == null) result = caseUpdateInfo(dialogUpdate);
				if (result == null) result = caseBObject(dialogUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.PROGRESS_BAR_UPDATE: {
				ProgressBarUpdate progressBarUpdate = (ProgressBarUpdate)theEObject;
				T result = caseProgressBarUpdate(progressBarUpdate);
				if (result == null) result = caseUIElementUpdate(progressBarUpdate);
				if (result == null) result = caseUpdateInfo(progressBarUpdate);
				if (result == null) result = caseBObject(progressBarUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.JAVA_SCRIPT_UPDATE: {
				JavaScriptUpdate javaScriptUpdate = (JavaScriptUpdate)theEObject;
				T result = caseJavaScriptUpdate(javaScriptUpdate);
				if (result == null) result = caseUpdateInfo(javaScriptUpdate);
				if (result == null) result = caseBObject(javaScriptUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GUI_PLUGIN: {
				GuiPlugin guiPlugin = (GuiPlugin)theEObject;
				T result = caseGuiPlugin(guiPlugin);
				if (result == null) result = caseBObject(guiPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIRequest(GUIRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIEvent(GUIEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIApplication(GUIApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIUpdate(GUIUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateInfo(UpdateInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowUpdate(WindowUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Sheet Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Sheet Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSheetUpdate(StyleSheetUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveUIElement(RemoveUIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddUIElement(AddUIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddTableCell(AddTableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveTableCell(RemoveTableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveUIElement(MoveUIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElement(UIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedEvent(SupportedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContainer(AbstractContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabView(TabView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Element Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Element Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElementUpdate(UIElementUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputUpdate(TextInputUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Text Input Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledTextInputUpdate(LabeledTextInputUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Input Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Input Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichTextInputUpdate(RichTextInputUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Picker Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Picker Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorPickerUpdate(ColorPickerUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelUpdate(LabelUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListUpdate(ListUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combobox Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combobox Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboboxUpdate(ComboboxUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemUpdate(ListItemUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonUpdate(ButtonUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submit Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submit Button Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmitButtonUpdate(SubmitButtonUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBoxUpdate(CheckBoxUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButtonUpdate(RadioButtonUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Button Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageButtonUpdate(ImageButtonUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Button Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Button Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleButtonUpdate(ToggleButtonUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Container Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Container Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridContainerUpdate(GridContainerUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvasUpdate(CanvasUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormUpdate(FormUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBox Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBox Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVBoxUpdate(VBoxUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HBox Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HBox Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHBoxUpdate(HBoxUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html View Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html View Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlViewUpdate(HtmlViewUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Item Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Item Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabItemUpdate(TabItemUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageUpdate(ImageUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogUpdate(DialogUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Bar Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Bar Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressBarUpdate(ProgressBarUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScriptUpdate(JavaScriptUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiPlugin(GuiPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabItem(TabItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementAdapter(ElementAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapterMapping(AdapterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAdapter(ArrayAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridContainer(GridContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVBox(VBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HBox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HBox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHBox(HBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridRow(GridRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridItem(GridItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonBar(ButtonBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLView(HTMLView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Context View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Context View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayContextView(DisplayContextView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMargin(Margin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteLayout(AbsoluteLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLayout(FlowLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Tip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Tip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolTip(ToolTip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submit Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submit Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmitButton(SubmitButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInput(TextInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Text Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledTextInput(LabeledTextInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichTextInput(RichTextInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboBox(ComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorPicker(ColorPicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressBar(ProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Gallery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageGallery(ImageGallery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaPlayer(MediaPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Stepper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Stepper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericStepper(NumericStepper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scrollbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollbar(Scrollbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarView(CalendarView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Keyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftKeyboard(SoftKeyboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogBox(DialogBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Dialog Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Dialog Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDialogBox(AbstractDialogBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDialog(CustomDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Chooser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Chooser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileChooser(FileChooser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleButton(ToggleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageButton(ImageButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Header Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Header Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridHeaderItem(GridHeaderItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIORepresentation(IORepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRepresentation(OutputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renderer Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renderer Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRendererOutput(RendererOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRepresentation(InputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerInput(ControllerInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GuiSwitch
