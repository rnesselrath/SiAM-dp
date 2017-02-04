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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage
 * @generated
 */
public class GuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GuiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiSwitch<Adapter> modelSwitch =
		new GuiSwitch<Adapter>() {
			@Override
			public Adapter caseGUIRequest(GUIRequest object) {
				return createGUIRequestAdapter();
			}
			@Override
			public Adapter caseGUIEvent(GUIEvent object) {
				return createGUIEventAdapter();
			}
			@Override
			public Adapter caseGUIApplication(GUIApplication object) {
				return createGUIApplicationAdapter();
			}
			@Override
			public Adapter caseGUIUpdate(GUIUpdate object) {
				return createGUIUpdateAdapter();
			}
			@Override
			public Adapter caseUpdateInfo(UpdateInfo object) {
				return createUpdateInfoAdapter();
			}
			@Override
			public Adapter caseWindowUpdate(WindowUpdate object) {
				return createWindowUpdateAdapter();
			}
			@Override
			public Adapter caseStyleSheetUpdate(StyleSheetUpdate object) {
				return createStyleSheetUpdateAdapter();
			}
			@Override
			public Adapter caseRemoveUIElement(RemoveUIElement object) {
				return createRemoveUIElementAdapter();
			}
			@Override
			public Adapter caseAddUIElement(AddUIElement object) {
				return createAddUIElementAdapter();
			}
			@Override
			public Adapter caseAddTableCell(AddTableCell object) {
				return createAddTableCellAdapter();
			}
			@Override
			public Adapter caseRemoveTableCell(RemoveTableCell object) {
				return createRemoveTableCellAdapter();
			}
			@Override
			public Adapter caseMoveUIElement(MoveUIElement object) {
				return createMoveUIElementAdapter();
			}
			@Override
			public Adapter caseUIElement(UIElement object) {
				return createUIElementAdapter();
			}
			@Override
			public Adapter caseSupportedEvent(SupportedEvent object) {
				return createSupportedEventAdapter();
			}
			@Override
			public Adapter caseAbstractContainer(AbstractContainer object) {
				return createAbstractContainerAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseElementAdapter(ElementAdapter object) {
				return createElementAdapterAdapter();
			}
			@Override
			public Adapter caseAdapterMapping(AdapterMapping object) {
				return createAdapterMappingAdapter();
			}
			@Override
			public Adapter caseArrayAdapter(ArrayAdapter object) {
				return createArrayAdapterAdapter();
			}
			@Override
			public Adapter caseGridContainer(GridContainer object) {
				return createGridContainerAdapter();
			}
			@Override
			public Adapter caseCanvas(Canvas object) {
				return createCanvasAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseVBox(VBox object) {
				return createVBoxAdapter();
			}
			@Override
			public Adapter caseHBox(HBox object) {
				return createHBoxAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter caseGridRow(GridRow object) {
				return createGridRowAdapter();
			}
			@Override
			public Adapter caseGridItem(GridItem object) {
				return createGridItemAdapter();
			}
			@Override
			public Adapter caseGridHeaderItem(GridHeaderItem object) {
				return createGridHeaderItemAdapter();
			}
			@Override
			public Adapter caseHTMLView(HTMLView object) {
				return createHTMLViewAdapter();
			}
			@Override
			public Adapter caseDisplayContextView(DisplayContextView object) {
				return createDisplayContextViewAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseMargin(Margin object) {
				return createMarginAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseAbsoluteLayout(AbsoluteLayout object) {
				return createAbsoluteLayoutAdapter();
			}
			@Override
			public Adapter caseFlowLayout(FlowLayout object) {
				return createFlowLayoutAdapter();
			}
			@Override
			public Adapter caseToolTip(ToolTip object) {
				return createToolTipAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseTextInput(TextInput object) {
				return createTextInputAdapter();
			}
			@Override
			public Adapter caseLabeledTextInput(LabeledTextInput object) {
				return createLabeledTextInputAdapter();
			}
			@Override
			public Adapter caseRichTextInput(RichTextInput object) {
				return createRichTextInputAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListItem(ListItem object) {
				return createListItemAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseSubmitButton(SubmitButton object) {
				return createSubmitButtonAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseToggleButton(ToggleButton object) {
				return createToggleButtonAdapter();
			}
			@Override
			public Adapter caseImageButton(ImageButton object) {
				return createImageButtonAdapter();
			}
			@Override
			public Adapter caseButtonBar(ButtonBar object) {
				return createButtonBarAdapter();
			}
			@Override
			public Adapter caseColorPicker(ColorPicker object) {
				return createColorPickerAdapter();
			}
			@Override
			public Adapter caseProgressBar(ProgressBar object) {
				return createProgressBarAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseImageGallery(ImageGallery object) {
				return createImageGalleryAdapter();
			}
			@Override
			public Adapter caseMediaPlayer(MediaPlayer object) {
				return createMediaPlayerAdapter();
			}
			@Override
			public Adapter caseSpinner(Spinner object) {
				return createSpinnerAdapter();
			}
			@Override
			public Adapter caseNumericStepper(NumericStepper object) {
				return createNumericStepperAdapter();
			}
			@Override
			public Adapter caseScrollbar(Scrollbar object) {
				return createScrollbarAdapter();
			}
			@Override
			public Adapter caseCalendarView(CalendarView object) {
				return createCalendarViewAdapter();
			}
			@Override
			public Adapter caseSoftKeyboard(SoftKeyboard object) {
				return createSoftKeyboardAdapter();
			}
			@Override
			public Adapter caseAbstractDialogBox(AbstractDialogBox object) {
				return createAbstractDialogBoxAdapter();
			}
			@Override
			public Adapter caseDialogBox(DialogBox object) {
				return createDialogBoxAdapter();
			}
			@Override
			public Adapter caseCustomDialog(CustomDialog object) {
				return createCustomDialogAdapter();
			}
			@Override
			public Adapter caseFileChooser(FileChooser object) {
				return createFileChooserAdapter();
			}
			@Override
			public Adapter caseTabItem(TabItem object) {
				return createTabItemAdapter();
			}
			@Override
			public Adapter caseTabView(TabView object) {
				return createTabViewAdapter();
			}
			@Override
			public Adapter caseUIElementUpdate(UIElementUpdate object) {
				return createUIElementUpdateAdapter();
			}
			@Override
			public Adapter caseTextInputUpdate(TextInputUpdate object) {
				return createTextInputUpdateAdapter();
			}
			@Override
			public Adapter caseLabeledTextInputUpdate(LabeledTextInputUpdate object) {
				return createLabeledTextInputUpdateAdapter();
			}
			@Override
			public Adapter caseRichTextInputUpdate(RichTextInputUpdate object) {
				return createRichTextInputUpdateAdapter();
			}
			@Override
			public Adapter caseColorPickerUpdate(ColorPickerUpdate object) {
				return createColorPickerUpdateAdapter();
			}
			@Override
			public Adapter caseLabelUpdate(LabelUpdate object) {
				return createLabelUpdateAdapter();
			}
			@Override
			public Adapter caseListUpdate(ListUpdate object) {
				return createListUpdateAdapter();
			}
			@Override
			public Adapter caseComboboxUpdate(ComboboxUpdate object) {
				return createComboboxUpdateAdapter();
			}
			@Override
			public Adapter caseListItemUpdate(ListItemUpdate object) {
				return createListItemUpdateAdapter();
			}
			@Override
			public Adapter caseButtonUpdate(ButtonUpdate object) {
				return createButtonUpdateAdapter();
			}
			@Override
			public Adapter caseSubmitButtonUpdate(SubmitButtonUpdate object) {
				return createSubmitButtonUpdateAdapter();
			}
			@Override
			public Adapter caseCheckBoxUpdate(CheckBoxUpdate object) {
				return createCheckBoxUpdateAdapter();
			}
			@Override
			public Adapter caseRadioButtonUpdate(RadioButtonUpdate object) {
				return createRadioButtonUpdateAdapter();
			}
			@Override
			public Adapter caseImageButtonUpdate(ImageButtonUpdate object) {
				return createImageButtonUpdateAdapter();
			}
			@Override
			public Adapter caseToggleButtonUpdate(ToggleButtonUpdate object) {
				return createToggleButtonUpdateAdapter();
			}
			@Override
			public Adapter caseGridContainerUpdate(GridContainerUpdate object) {
				return createGridContainerUpdateAdapter();
			}
			@Override
			public Adapter caseCanvasUpdate(CanvasUpdate object) {
				return createCanvasUpdateAdapter();
			}
			@Override
			public Adapter caseFormUpdate(FormUpdate object) {
				return createFormUpdateAdapter();
			}
			@Override
			public Adapter caseVBoxUpdate(VBoxUpdate object) {
				return createVBoxUpdateAdapter();
			}
			@Override
			public Adapter caseHBoxUpdate(HBoxUpdate object) {
				return createHBoxUpdateAdapter();
			}
			@Override
			public Adapter caseHtmlViewUpdate(HtmlViewUpdate object) {
				return createHtmlViewUpdateAdapter();
			}
			@Override
			public Adapter caseTabItemUpdate(TabItemUpdate object) {
				return createTabItemUpdateAdapter();
			}
			@Override
			public Adapter caseImageUpdate(ImageUpdate object) {
				return createImageUpdateAdapter();
			}
			@Override
			public Adapter caseDialogUpdate(DialogUpdate object) {
				return createDialogUpdateAdapter();
			}
			@Override
			public Adapter caseProgressBarUpdate(ProgressBarUpdate object) {
				return createProgressBarUpdateAdapter();
			}
			@Override
			public Adapter caseJavaScriptUpdate(JavaScriptUpdate object) {
				return createJavaScriptUpdateAdapter();
			}
			@Override
			public Adapter caseGuiPlugin(GuiPlugin object) {
				return createGuiPluginAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseIORepresentation(IORepresentation object) {
				return createIORepresentationAdapter();
			}
			@Override
			public Adapter caseOutputRepresentation(OutputRepresentation object) {
				return createOutputRepresentationAdapter();
			}
			@Override
			public Adapter caseRendererOutput(RendererOutput object) {
				return createRendererOutputAdapter();
			}
			@Override
			public Adapter caseInputRepresentation(InputRepresentation object) {
				return createInputRepresentationAdapter();
			}
			@Override
			public Adapter caseControllerInput(ControllerInput object) {
				return createControllerInputAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIRequest <em>GUI Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIRequest
	 * @generated
	 */
	public Adapter createGUIRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIEvent <em>GUI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIEvent
	 * @generated
	 */
	public Adapter createGUIEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication <em>GUI Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIApplication
	 * @generated
	 */
	public Adapter createGUIApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate <em>GUI Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIUpdate
	 * @generated
	 */
	public Adapter createGUIUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.UpdateInfo <em>Update Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UpdateInfo
	 * @generated
	 */
	public Adapter createUpdateInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.WindowUpdate <em>Window Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.WindowUpdate
	 * @generated
	 */
	public Adapter createWindowUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate <em>Style Sheet Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate
	 * @generated
	 */
	public Adapter createStyleSheetUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement <em>Remove UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement
	 * @generated
	 */
	public Adapter createRemoveUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement <em>Add UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement
	 * @generated
	 */
	public Adapter createAddUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AddTableCell <em>Add Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddTableCell
	 * @generated
	 */
	public Adapter createAddTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell <em>Remove Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell
	 * @generated
	 */
	public Adapter createRemoveTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.MoveUIElement <em>Move UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MoveUIElement
	 * @generated
	 */
	public Adapter createMoveUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement
	 * @generated
	 */
	public Adapter createUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent <em>Supported Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SupportedEvent
	 * @generated
	 */
	public Adapter createSupportedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer <em>Abstract Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer
	 * @generated
	 */
	public Adapter createAbstractContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.TabView <em>Tab View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabView
	 * @generated
	 */
	public Adapter createTabViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate <em>UI Element Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate
	 * @generated
	 */
	public Adapter createUIElementUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate <em>Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate
	 * @generated
	 */
	public Adapter createTextInputUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate <em>Labeled Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate
	 * @generated
	 */
	public Adapter createLabeledTextInputUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate <em>Rich Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate
	 * @generated
	 */
	public Adapter createRichTextInputUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate <em>Color Picker Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate
	 * @generated
	 */
	public Adapter createColorPickerUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.LabelUpdate <em>Label Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabelUpdate
	 * @generated
	 */
	public Adapter createLabelUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate <em>List Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListUpdate
	 * @generated
	 */
	public Adapter createListUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate <em>Combobox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate
	 * @generated
	 */
	public Adapter createComboboxUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate <em>List Item Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate
	 * @generated
	 */
	public Adapter createListItemUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate <em>Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate
	 * @generated
	 */
	public Adapter createButtonUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate <em>Submit Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate
	 * @generated
	 */
	public Adapter createSubmitButtonUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate <em>Check Box Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate
	 * @generated
	 */
	public Adapter createCheckBoxUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate <em>Radio Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate
	 * @generated
	 */
	public Adapter createRadioButtonUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate <em>Image Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate
	 * @generated
	 */
	public Adapter createImageButtonUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate <em>Toggle Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate
	 * @generated
	 */
	public Adapter createToggleButtonUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate <em>Grid Container Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate
	 * @generated
	 */
	public Adapter createGridContainerUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate <em>Canvas Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate
	 * @generated
	 */
	public Adapter createCanvasUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.FormUpdate <em>Form Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FormUpdate
	 * @generated
	 */
	public Adapter createFormUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate <em>VBox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate
	 * @generated
	 */
	public Adapter createVBoxUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate <em>HBox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate
	 * @generated
	 */
	public Adapter createHBoxUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate <em>Html View Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate
	 * @generated
	 */
	public Adapter createHtmlViewUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate <em>Tab Item Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate
	 * @generated
	 */
	public Adapter createTabItemUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageUpdate <em>Image Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageUpdate
	 * @generated
	 */
	public Adapter createImageUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.DialogUpdate <em>Dialog Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogUpdate
	 * @generated
	 */
	public Adapter createDialogUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate <em>Progress Bar Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate
	 * @generated
	 */
	public Adapter createProgressBarUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate <em>Java Script Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate
	 * @generated
	 */
	public Adapter createJavaScriptUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GuiPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPlugin
	 * @generated
	 */
	public Adapter createGuiPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.TabItem <em>Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItem
	 * @generated
	 */
	public Adapter createTabItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ElementAdapter <em>Element Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ElementAdapter
	 * @generated
	 */
	public Adapter createElementAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AdapterMapping <em>Adapter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AdapterMapping
	 * @generated
	 */
	public Adapter createAdapterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter <em>Array Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter
	 * @generated
	 */
	public Adapter createArrayAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GridContainer <em>Grid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridContainer
	 * @generated
	 */
	public Adapter createGridContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Canvas
	 * @generated
	 */
	public Adapter createCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.VBox <em>VBox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VBox
	 * @generated
	 */
	public Adapter createVBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.HBox <em>HBox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HBox
	 * @generated
	 */
	public Adapter createHBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow <em>Grid Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow
	 * @generated
	 */
	public Adapter createGridRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem <em>Grid Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem
	 * @generated
	 */
	public Adapter createGridItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonBar <em>Button Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonBar
	 * @generated
	 */
	public Adapter createButtonBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView <em>HTML View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HTMLView
	 * @generated
	 */
	public Adapter createHTMLViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.DisplayContextView <em>Display Context View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DisplayContextView
	 * @generated
	 */
	public Adapter createDisplayContextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout <em>Absolute Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout
	 * @generated
	 */
	public Adapter createAbsoluteLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FlowLayout
	 * @generated
	 */
	public Adapter createFlowLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ToolTip <em>Tool Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToolTip
	 * @generated
	 */
	public Adapter createToolTipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SubmitButton
	 * @generated
	 */
	public Adapter createSubmitButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInput
	 * @generated
	 */
	public Adapter createTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput <em>Labeled Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput
	 * @generated
	 */
	public Adapter createLabeledTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.RichTextInput <em>Rich Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RichTextInput
	 * @generated
	 */
	public Adapter createRichTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ComboBox
	 * @generated
	 */
	public Adapter createComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ColorPicker <em>Color Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ColorPicker
	 * @generated
	 */
	public Adapter createColorPickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBar
	 * @generated
	 */
	public Adapter createProgressBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery <em>Image Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageGallery
	 * @generated
	 */
	public Adapter createImageGalleryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer <em>Media Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer
	 * @generated
	 */
	public Adapter createMediaPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Spinner
	 * @generated
	 */
	public Adapter createSpinnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.NumericStepper <em>Numeric Stepper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.NumericStepper
	 * @generated
	 */
	public Adapter createNumericStepperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar <em>Scrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar
	 * @generated
	 */
	public Adapter createScrollbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView <em>Calendar View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CalendarView
	 * @generated
	 */
	public Adapter createCalendarViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard <em>Soft Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard
	 * @generated
	 */
	public Adapter createSoftKeyboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox <em>Dialog Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogBox
	 * @generated
	 */
	public Adapter createDialogBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox <em>Abstract Dialog Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox
	 * @generated
	 */
	public Adapter createAbstractDialogBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.CustomDialog <em>Custom Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CustomDialog
	 * @generated
	 */
	public Adapter createCustomDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.FileChooser <em>File Chooser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FileChooser
	 * @generated
	 */
	public Adapter createFileChooserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButton <em>Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButton
	 * @generated
	 */
	public Adapter createToggleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButton <em>Image Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButton
	 * @generated
	 */
	public Adapter createImageButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem <em>Grid Header Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem
	 * @generated
	 */
	public Adapter createGridHeaderItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.IORepresentation <em>IO Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation
	 * @generated
	 */
	public Adapter createIORepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.OutputRepresentation
	 * @generated
	 */
	public Adapter createOutputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput <em>Renderer Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput
	 * @generated
	 */
	public Adapter createRendererOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.InputRepresentation
	 * @generated
	 */
	public Adapter createInputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput <em>Controller Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput
	 * @generated
	 */
	public Adapter createControllerInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GuiAdapterFactory
