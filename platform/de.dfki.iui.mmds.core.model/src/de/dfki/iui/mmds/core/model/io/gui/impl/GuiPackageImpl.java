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

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import static de.dfki.iui.mmds.core.model.io.gui.GuiPackage.CONTAINER;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout;
import de.dfki.iui.mmds.core.model.io.gui.AbstractContainer;
import de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox;
import de.dfki.iui.mmds.core.model.io.gui.AdapterMapping;
import de.dfki.iui.mmds.core.model.io.gui.AddTableCell;
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
import de.dfki.iui.mmds.core.model.io.gui.DisplayContextView;
import de.dfki.iui.mmds.core.model.io.gui.Div;
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
import de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate;
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
import de.dfki.iui.mmds.core.model.io.gui.MoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.NumericStepper;
import de.dfki.iui.mmds.core.model.io.gui.Orientation;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBar;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RadioButton;
import de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell;
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
import de.dfki.iui.mmds.core.model.io.gui.VAlignment;
import de.dfki.iui.mmds.core.model.io.gui.VBox;
import de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.Window;
import de.dfki.iui.mmds.core.model.io.gui.WindowUpdate;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl;
import de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl;
import de.dfki.iui.mmds.core.model.json.JsonPackage;
import de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl;
import de.dfki.iui.mmds.core.model.pattern.PatternPackage;
import de.dfki.iui.mmds.core.model.pattern.impl.PatternPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTasksPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.impl.PrimitiveTasksPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl;
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;
import de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl;
import de.dfki.iui.mmds.core.model.task.TaskPackage;
import de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class GuiPackageImpl extends EPackageImpl implements GuiPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiRequestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiEventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiApplicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSheetUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeUIElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addUIElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeTableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveUIElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedEventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiElementUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTextInputUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextInputUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorPickerUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboboxUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submitButtonUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageButtonUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleButtonUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridContainerUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vBoxUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBoxUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlViewUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabItemUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressBarUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiPluginEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementAdapterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAdapterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridRowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonBarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayContextViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marginEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolTipEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submitButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTextInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorPickerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressBarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageGalleryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaPlayerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinnerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericStepperEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollbarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softKeyboardEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDialogBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDialogEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileChooserEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridHeaderItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageFillModesEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionHVEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dialogueButtonsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuiPackageImpl() {
		super(eNS_URI, GuiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link GuiPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuiPackage init() {
		if (isInited) return (GuiPackage)EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI);

		// Obtain or create and register package
		GuiPackageImpl theGuiPackage = (GuiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) : Communicative_functionsPackage.eINSTANCE);
		DialoguePackageImpl theDialoguePackage = (DialoguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) instanceof DialoguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) : DialoguePackage.eINSTANCE);
		EarconsPackageImpl theEarconsPackage = (EarconsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) instanceof EarconsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) : EarconsPackage.eINSTANCE);
		Grammar_rulesPackageImpl theGrammar_rulesPackage = (Grammar_rulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) instanceof Grammar_rulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) : Grammar_rulesPackage.eINSTANCE);
		GuiEventsPackageImpl theGuiEventsPackage = (GuiEventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) instanceof GuiEventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) : GuiEventsPackage.eINSTANCE);
		Io_interfacesPackageImpl theIo_interfacesPackage = (Io_interfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) instanceof Io_interfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) : Io_interfacesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		PrimitiveTasksPackageImpl thePrimitiveTasksPackage = (PrimitiveTasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) instanceof PrimitiveTasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) : PrimitiveTasksPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) : OutputPackage.eINSTANCE);
		ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) : ProjectPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theGuiPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theGrammar_rulesPackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();
		theIo_interfacesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		thePrimitiveTasksPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theOutputPackage.createPackageContents();
		theProjectPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theSpeechSynthesisPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theGuiPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theGrammar_rulesPackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();
		theIo_interfacesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		thePrimitiveTasksPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theOutputPackage.initializePackageContents();
		theProjectPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theSpeechSynthesisPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuiPackage.eNS_URI, theGuiPackage);
		return theGuiPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUIRequest() {
		return guiRequestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUIEvent() {
		return guiEventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGUIEvent_EventData() {
		return (EReference)guiEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUIApplication() {
		return guiApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGUIApplication_Window() {
		return (EReference)guiApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUIApplication_ApplicationId() {
		return (EAttribute)guiApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGUIApplication_StyleResource() {
		return (EReference)guiApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUIUpdate() {
		return guiUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGUIUpdate_Updates() {
		return (EReference)guiUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUIUpdate_ApplicationId() {
		return (EAttribute)guiUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUIUpdate_Validated() {
		return (EAttribute)guiUpdateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateInfo() {
		return updateInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindowUpdate() {
		return windowUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWindowUpdate_Window() {
		return (EReference)windowUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleSheetUpdate() {
		return styleSheetUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleSheetUpdate_StyleResource() {
		return (EReference)styleSheetUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveUIElement() {
		return removeUIElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveUIElement_ElementId() {
		return (EAttribute)removeUIElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddUIElement() {
		return addUIElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddUIElement_ParentId() {
		return (EAttribute)addUIElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddUIElement_NewElement() {
		return (EReference)addUIElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddUIElement_NewElementRef() {
		return (EReference)addUIElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddUIElement_Position() {
		return (EAttribute)addUIElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddTableCell() {
		return addTableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTableCell_ColumnPosition() {
		return (EAttribute)addTableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveTableCell() {
		return removeTableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveTableCell_RemoveRow() {
		return (EAttribute)removeTableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveUIElement() {
		return moveUIElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveUIElement_NewParentId() {
		return (EAttribute)moveUIElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveUIElement_ElementId() {
		return (EAttribute)moveUIElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveUIElement_Position() {
		return (EAttribute)moveUIElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUIElement() {
		return uiElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_Id() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_Enabled() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIElement_Layout() {
		return (EReference)uiElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIElement_SupportedEvents() {
		return (EReference)uiElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_StyleNames() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_X() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_Y() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIElement_SemanticContent() {
		return (EReference)uiElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIElement_Adapter() {
		return (EReference)uiElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElement_Tooltip() {
		return (EAttribute)uiElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportedEvent() {
		return supportedEventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedEvent_Interpretation() {
		return (EReference)supportedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedEvent_EventType() {
		return (EReference)supportedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedEvent_Annotation() {
		return (EReference)supportedEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractContainer() {
		return abstractContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContainer_ArrayAdapter() {
		return (EReference)abstractContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContainer__Contains() {
		return abstractContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContainer__AddChild__UIElement() {
		return abstractContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContainer__AddChild__BInteger_UIElement() {
		return abstractContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContainer__RemoveChild__UIElement() {
		return abstractContainerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Elements() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindow_Title() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWindow_Plugins() {
		return (EReference)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabView() {
		return tabViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTabView_Items() {
		return (EReference)tabViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUIElementUpdate() {
		return uiElementUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElementUpdate_Id() {
		return (EAttribute)uiElementUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElementUpdate_Enabled() {
		return (EAttribute)uiElementUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElementUpdate_StyleNames() {
		return (EAttribute)uiElementUpdateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUIElementUpdate_Tooltip() {
		return (EAttribute)uiElementUpdateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUIElementUpdate_StyleProps() {
		return (EReference)uiElementUpdateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextInputUpdate() {
		return textInputUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextInputUpdate_Text() {
		return (EAttribute)textInputUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledTextInputUpdate() {
		return labeledTextInputUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabeledTextInputUpdate_Label() {
		return (EAttribute)labeledTextInputUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichTextInputUpdate() {
		return richTextInputUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorPickerUpdate() {
		return colorPickerUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelUpdate() {
		return labelUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelUpdate_Text() {
		return (EAttribute)labelUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListUpdate() {
		return listUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListUpdate_AllowMultipleSelection() {
		return (EAttribute)listUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListUpdate_SelectedIndex() {
		return (EAttribute)listUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComboboxUpdate() {
		return comboboxUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListItemUpdate() {
		return listItemUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItemUpdate_Label() {
		return (EAttribute)listItemUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItemUpdate_Value() {
		return (EAttribute)listItemUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItemUpdate_Selected() {
		return (EAttribute)listItemUpdateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonUpdate() {
		return buttonUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonUpdate_Label() {
		return (EAttribute)buttonUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmitButtonUpdate() {
		return submitButtonUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckBoxUpdate() {
		return checkBoxUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckBoxUpdate_Checked() {
		return (EAttribute)checkBoxUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckBoxUpdate_Value() {
		return (EAttribute)checkBoxUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRadioButtonUpdate() {
		return radioButtonUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageButtonUpdate() {
		return imageButtonUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageButtonUpdate_Resource() {
		return (EReference)imageButtonUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToggleButtonUpdate() {
		return toggleButtonUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToggleButtonUpdate_IsSelected() {
		return (EAttribute)toggleButtonUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridContainerUpdate() {
		return gridContainerUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCanvasUpdate() {
		return canvasUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormUpdate() {
		return formUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVBoxUpdate() {
		return vBoxUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHBoxUpdate() {
		return hBoxUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHtmlViewUpdate() {
		return htmlViewUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHtmlViewUpdate_Content() {
		return (EAttribute)htmlViewUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHtmlViewUpdate_Source() {
		return (EAttribute)htmlViewUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabItemUpdate() {
		return tabItemUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTabItemUpdate_Title() {
		return (EAttribute)tabItemUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageUpdate() {
		return imageUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageUpdate_Resource() {
		return (EReference)imageUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDialogUpdate() {
		return dialogUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialogUpdate_Visible() {
		return (EAttribute)dialogUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialogUpdate_Title() {
		return (EAttribute)dialogUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialogUpdate_Text() {
		return (EAttribute)dialogUpdateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgressBarUpdate() {
		return progressBarUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgressBarUpdate_Percentage() {
		return (EAttribute)progressBarUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgressBarUpdate_Max() {
		return (EAttribute)progressBarUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaScriptUpdate() {
		return javaScriptUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaScriptUpdate_Script() {
		return (EAttribute)javaScriptUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGuiPlugin() {
		return guiPluginEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGuiPlugin_ClassName() {
		return (EAttribute)guiPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabItem() {
		return tabItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTabItem_Title() {
		return (EAttribute)tabItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTabItem_Element() {
		return (EReference)tabItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementAdapter() {
		return elementAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementAdapter_Pattern() {
		return (EReference)elementAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementAdapter_AdapterMapping() {
		return (EReference)elementAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapterMapping() {
		return adapterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdapterMapping_Feature() {
		return (EAttribute)adapterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdapterMapping_Expression() {
		return (EAttribute)adapterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAdapter() {
		return arrayAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAdapter_Element() {
		return (EReference)arrayAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAdapter_Pattern() {
		return (EReference)arrayAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayAdapter_Expression() {
		return (EAttribute)arrayAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridContainer() {
		return gridContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGridContainer_Row() {
		return (EReference)gridContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCanvas() {
		return canvasEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVBox() {
		return vBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHBox() {
		return hBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiv_Content() {
		return (EAttribute)divEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridRow() {
		return gridRowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridRow_RowId() {
		return (EAttribute)gridRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridRow_Height() {
		return (EAttribute)gridRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridRow_IsPercentage() {
		return (EAttribute)gridRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGridRow_Item() {
		return (EReference)gridRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridItem() {
		return gridItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_Width() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_IsPercentage() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_RowSpan() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_ColumnSpan() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_Alignment() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridItem_Valignment() {
		return (EAttribute)gridItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonBar() {
		return buttonBarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButtonBar_Button() {
		return (EReference)buttonBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButtonBar_Orientation() {
		return (EAttribute)buttonBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLView() {
		return htmlViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLView_Content() {
		return (EAttribute)htmlViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLView_Source() {
		return (EAttribute)htmlViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTMLView_LoadingIndicator() {
		return (EReference)htmlViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayContextView() {
		return displayContextViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayContextView_DisplayContextName() {
		return (EAttribute)displayContextViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayout_Height() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayout_Width() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayout_Margin() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayout_HorizontalAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayout_VerticalAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMargin() {
		return marginEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMargin_Top() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMargin_Left() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMargin_Right() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMargin_Bottom() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMargin_IsPercentage() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_Height() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_Width() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsoluteLayout() {
		return absoluteLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsoluteLayout_X() {
		return (EAttribute)absoluteLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsoluteLayout_Z() {
		return (EAttribute)absoluteLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsoluteLayout_Y() {
		return (EAttribute)absoluteLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowLayout() {
		return flowLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolTip() {
		return toolTipEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolTip_Text() {
		return (EAttribute)toolTipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolTip_Element() {
		return (EReference)toolTipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_Label() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmitButton() {
		return submitButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckBox_Checked() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRadioButton_RadioGroup() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRadioButton_Value() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRadioButton_Checked() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextInput_Text() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextInput_MultiLine() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextInput_SoftKeyboard() {
		return (EReference)textInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledTextInput() {
		return labeledTextInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabeledTextInput_Label() {
		return (EAttribute)labeledTextInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichTextInput() {
		return richTextInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_AllowMultipleSelection() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getList_Item() {
		return (EReference)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_SelectedIndex() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItem_Label() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItem_Value() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItem_Selected() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorPicker() {
		return colorPickerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgressBar() {
		return progressBarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgressBar_Percentage() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgressBar_Determinate() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgressBar_Max() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Smooth() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_FillMode() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImage_LoadingIndicator() {
		return (EReference)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_CanManipulate() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImage_Resource() {
		return (EReference)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageGallery() {
		return imageGalleryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageGallery_Image() {
		return (EReference)imageGalleryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageGallery_ButtonBar() {
		return (EReference)imageGalleryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageGallery_IsSlideShow() {
		return (EAttribute)imageGalleryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediaPlayer() {
		return mediaPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_IsPlaying() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaPlayer_Media() {
		return (EReference)mediaPlayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_AutoPlay() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_ShowControls() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_Width() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_Height() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaPlayer_Visible() {
		return (EAttribute)mediaPlayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpinner() {
		return spinnerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericStepper() {
		return numericStepperEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericStepper_MinValue() {
		return (EAttribute)numericStepperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericStepper_MaxValue() {
		return (EAttribute)numericStepperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScrollbar() {
		return scrollbarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScrollbar_MaxValue() {
		return (EAttribute)scrollbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScrollbar_MinValue() {
		return (EAttribute)scrollbarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScrollbar_Value() {
		return (EAttribute)scrollbarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScrollbar_Orientation() {
		return (EAttribute)scrollbarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalendarView() {
		return calendarViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarView_DisplayMode() {
		return (EAttribute)calendarViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendarView_Date() {
		return (EAttribute)calendarViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftKeyboard() {
		return softKeyboardEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_KeyboardLayout() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_UseDictionary() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_DictionaryLanguage() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_Enabled() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_Dictionary() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftKeyboard_EnableSpeechInputIcon() {
		return (EAttribute)softKeyboardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDialogBox() {
		return dialogBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialogBox_Modal() {
		return (EAttribute)dialogBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialogBox_Buttons() {
		return (EAttribute)dialogBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDialogBox() {
		return abstractDialogBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDialogBox_Title() {
		return (EAttribute)abstractDialogBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDialogBox_Text() {
		return (EAttribute)abstractDialogBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDialogBox_Visible() {
		return (EAttribute)abstractDialogBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomDialog() {
		return customDialogEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomDialog_Element() {
		return (EReference)customDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileChooser() {
		return fileChooserEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToggleButton() {
		return toggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToggleButton_IsSelected() {
		return (EAttribute)toggleButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageButton() {
		return imageButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageButton_Resource() {
		return (EReference)imageButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridHeaderItem() {
		return gridHeaderItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlignment() {
		return alignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVAlignment() {
		return vAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImageFillModes() {
		return imageFillModesEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionHV() {
		return directionHVEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDialogueButtons() {
		return dialogueButtonsEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuiFactory getGuiFactory() {
		return (GuiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		guiRequestEClass = createEClass(GUI_REQUEST);

		guiEventEClass = createEClass(GUI_EVENT);
		createEReference(guiEventEClass, GUI_EVENT__EVENT_DATA);

		guiApplicationEClass = createEClass(GUI_APPLICATION);
		createEReference(guiApplicationEClass, GUI_APPLICATION__WINDOW);
		createEAttribute(guiApplicationEClass, GUI_APPLICATION__APPLICATION_ID);
		createEReference(guiApplicationEClass, GUI_APPLICATION__STYLE_RESOURCE);

		guiUpdateEClass = createEClass(GUI_UPDATE);
		createEReference(guiUpdateEClass, GUI_UPDATE__UPDATES);
		createEAttribute(guiUpdateEClass, GUI_UPDATE__APPLICATION_ID);
		createEAttribute(guiUpdateEClass, GUI_UPDATE__VALIDATED);

		updateInfoEClass = createEClass(UPDATE_INFO);

		windowUpdateEClass = createEClass(WINDOW_UPDATE);
		createEReference(windowUpdateEClass, WINDOW_UPDATE__WINDOW);

		styleSheetUpdateEClass = createEClass(STYLE_SHEET_UPDATE);
		createEReference(styleSheetUpdateEClass, STYLE_SHEET_UPDATE__STYLE_RESOURCE);

		removeUIElementEClass = createEClass(REMOVE_UI_ELEMENT);
		createEAttribute(removeUIElementEClass, REMOVE_UI_ELEMENT__ELEMENT_ID);

		addUIElementEClass = createEClass(ADD_UI_ELEMENT);
		createEAttribute(addUIElementEClass, ADD_UI_ELEMENT__PARENT_ID);
		createEReference(addUIElementEClass, ADD_UI_ELEMENT__NEW_ELEMENT);
		createEReference(addUIElementEClass, ADD_UI_ELEMENT__NEW_ELEMENT_REF);
		createEAttribute(addUIElementEClass, ADD_UI_ELEMENT__POSITION);

		addTableCellEClass = createEClass(ADD_TABLE_CELL);
		createEAttribute(addTableCellEClass, ADD_TABLE_CELL__COLUMN_POSITION);

		removeTableCellEClass = createEClass(REMOVE_TABLE_CELL);
		createEAttribute(removeTableCellEClass, REMOVE_TABLE_CELL__REMOVE_ROW);

		moveUIElementEClass = createEClass(MOVE_UI_ELEMENT);
		createEAttribute(moveUIElementEClass, MOVE_UI_ELEMENT__NEW_PARENT_ID);
		createEAttribute(moveUIElementEClass, MOVE_UI_ELEMENT__ELEMENT_ID);
		createEAttribute(moveUIElementEClass, MOVE_UI_ELEMENT__POSITION);

		uiElementEClass = createEClass(UI_ELEMENT);
		createEAttribute(uiElementEClass, UI_ELEMENT__ID);
		createEAttribute(uiElementEClass, UI_ELEMENT__ENABLED);
		createEReference(uiElementEClass, UI_ELEMENT__LAYOUT);
		createEReference(uiElementEClass, UI_ELEMENT__SUPPORTED_EVENTS);
		createEAttribute(uiElementEClass, UI_ELEMENT__STYLE_NAMES);
		createEAttribute(uiElementEClass, UI_ELEMENT__X);
		createEAttribute(uiElementEClass, UI_ELEMENT__Y);
		createEReference(uiElementEClass, UI_ELEMENT__SEMANTIC_CONTENT);
		createEReference(uiElementEClass, UI_ELEMENT__ADAPTER);
		createEAttribute(uiElementEClass, UI_ELEMENT__TOOLTIP);

		supportedEventEClass = createEClass(SUPPORTED_EVENT);
		createEReference(supportedEventEClass, SUPPORTED_EVENT__INTERPRETATION);
		createEReference(supportedEventEClass, SUPPORTED_EVENT__EVENT_TYPE);
		createEReference(supportedEventEClass, SUPPORTED_EVENT__ANNOTATION);

		abstractContainerEClass = createEClass(ABSTRACT_CONTAINER);
		createEReference(abstractContainerEClass, ABSTRACT_CONTAINER__ARRAY_ADAPTER);
		createEOperation(abstractContainerEClass, ABSTRACT_CONTAINER___CONTAINS);
		createEOperation(abstractContainerEClass, ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT);
		createEOperation(abstractContainerEClass, ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT);
		createEOperation(abstractContainerEClass, ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ELEMENTS);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__TITLE);
		createEReference(windowEClass, WINDOW__PLUGINS);

		elementAdapterEClass = createEClass(ELEMENT_ADAPTER);
		createEReference(elementAdapterEClass, ELEMENT_ADAPTER__PATTERN);
		createEReference(elementAdapterEClass, ELEMENT_ADAPTER__ADAPTER_MAPPING);

		adapterMappingEClass = createEClass(ADAPTER_MAPPING);
		createEAttribute(adapterMappingEClass, ADAPTER_MAPPING__FEATURE);
		createEAttribute(adapterMappingEClass, ADAPTER_MAPPING__EXPRESSION);

		arrayAdapterEClass = createEClass(ARRAY_ADAPTER);
		createEReference(arrayAdapterEClass, ARRAY_ADAPTER__ELEMENT);
		createEReference(arrayAdapterEClass, ARRAY_ADAPTER__PATTERN);
		createEAttribute(arrayAdapterEClass, ARRAY_ADAPTER__EXPRESSION);

		gridContainerEClass = createEClass(GRID_CONTAINER);
		createEReference(gridContainerEClass, GRID_CONTAINER__ROW);

		canvasEClass = createEClass(CANVAS);

		formEClass = createEClass(FORM);

		vBoxEClass = createEClass(VBOX);

		hBoxEClass = createEClass(HBOX);

		divEClass = createEClass(DIV);
		createEAttribute(divEClass, DIV__CONTENT);

		gridRowEClass = createEClass(GRID_ROW);
		createEAttribute(gridRowEClass, GRID_ROW__ROW_ID);
		createEAttribute(gridRowEClass, GRID_ROW__HEIGHT);
		createEAttribute(gridRowEClass, GRID_ROW__IS_PERCENTAGE);
		createEReference(gridRowEClass, GRID_ROW__ITEM);

		gridItemEClass = createEClass(GRID_ITEM);
		createEAttribute(gridItemEClass, GRID_ITEM__WIDTH);
		createEAttribute(gridItemEClass, GRID_ITEM__IS_PERCENTAGE);
		createEAttribute(gridItemEClass, GRID_ITEM__ROW_SPAN);
		createEAttribute(gridItemEClass, GRID_ITEM__COLUMN_SPAN);
		createEAttribute(gridItemEClass, GRID_ITEM__ALIGNMENT);
		createEAttribute(gridItemEClass, GRID_ITEM__VALIGNMENT);

		gridHeaderItemEClass = createEClass(GRID_HEADER_ITEM);

		htmlViewEClass = createEClass(HTML_VIEW);
		createEAttribute(htmlViewEClass, HTML_VIEW__CONTENT);
		createEAttribute(htmlViewEClass, HTML_VIEW__SOURCE);
		createEReference(htmlViewEClass, HTML_VIEW__LOADING_INDICATOR);

		displayContextViewEClass = createEClass(DISPLAY_CONTEXT_VIEW);
		createEAttribute(displayContextViewEClass, DISPLAY_CONTEXT_VIEW__DISPLAY_CONTEXT_NAME);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__HEIGHT);
		createEAttribute(layoutEClass, LAYOUT__WIDTH);
		createEReference(layoutEClass, LAYOUT__MARGIN);
		createEAttribute(layoutEClass, LAYOUT__HORIZONTAL_ALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__VERTICAL_ALIGNMENT);

		marginEClass = createEClass(MARGIN);
		createEAttribute(marginEClass, MARGIN__TOP);
		createEAttribute(marginEClass, MARGIN__LEFT);
		createEAttribute(marginEClass, MARGIN__RIGHT);
		createEAttribute(marginEClass, MARGIN__BOTTOM);
		createEAttribute(marginEClass, MARGIN__IS_PERCENTAGE);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__HEIGHT);
		createEAttribute(sizeEClass, SIZE__WIDTH);

		absoluteLayoutEClass = createEClass(ABSOLUTE_LAYOUT);
		createEAttribute(absoluteLayoutEClass, ABSOLUTE_LAYOUT__X);
		createEAttribute(absoluteLayoutEClass, ABSOLUTE_LAYOUT__Z);
		createEAttribute(absoluteLayoutEClass, ABSOLUTE_LAYOUT__Y);

		flowLayoutEClass = createEClass(FLOW_LAYOUT);

		toolTipEClass = createEClass(TOOL_TIP);
		createEAttribute(toolTipEClass, TOOL_TIP__TEXT);
		createEReference(toolTipEClass, TOOL_TIP__ELEMENT);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__TEXT);

		textInputEClass = createEClass(TEXT_INPUT);
		createEAttribute(textInputEClass, TEXT_INPUT__TEXT);
		createEAttribute(textInputEClass, TEXT_INPUT__MULTI_LINE);
		createEReference(textInputEClass, TEXT_INPUT__SOFT_KEYBOARD);

		labeledTextInputEClass = createEClass(LABELED_TEXT_INPUT);
		createEAttribute(labeledTextInputEClass, LABELED_TEXT_INPUT__LABEL);

		richTextInputEClass = createEClass(RICH_TEXT_INPUT);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__ALLOW_MULTIPLE_SELECTION);
		createEReference(listEClass, LIST__ITEM);
		createEAttribute(listEClass, LIST__SELECTED_INDEX);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__LABEL);
		createEAttribute(listItemEClass, LIST_ITEM__VALUE);
		createEAttribute(listItemEClass, LIST_ITEM__SELECTED);

		comboBoxEClass = createEClass(COMBO_BOX);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__LABEL);

		submitButtonEClass = createEClass(SUBMIT_BUTTON);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__CHECKED);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__RADIO_GROUP);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__VALUE);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__CHECKED);

		toggleButtonEClass = createEClass(TOGGLE_BUTTON);
		createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__IS_SELECTED);

		imageButtonEClass = createEClass(IMAGE_BUTTON);
		createEReference(imageButtonEClass, IMAGE_BUTTON__RESOURCE);

		buttonBarEClass = createEClass(BUTTON_BAR);
		createEReference(buttonBarEClass, BUTTON_BAR__BUTTON);
		createEAttribute(buttonBarEClass, BUTTON_BAR__ORIENTATION);

		colorPickerEClass = createEClass(COLOR_PICKER);

		progressBarEClass = createEClass(PROGRESS_BAR);
		createEAttribute(progressBarEClass, PROGRESS_BAR__PERCENTAGE);
		createEAttribute(progressBarEClass, PROGRESS_BAR__DETERMINATE);
		createEAttribute(progressBarEClass, PROGRESS_BAR__MAX);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SMOOTH);
		createEAttribute(imageEClass, IMAGE__FILL_MODE);
		createEReference(imageEClass, IMAGE__LOADING_INDICATOR);
		createEAttribute(imageEClass, IMAGE__CAN_MANIPULATE);
		createEReference(imageEClass, IMAGE__RESOURCE);

		imageGalleryEClass = createEClass(IMAGE_GALLERY);
		createEReference(imageGalleryEClass, IMAGE_GALLERY__IMAGE);
		createEReference(imageGalleryEClass, IMAGE_GALLERY__BUTTON_BAR);
		createEAttribute(imageGalleryEClass, IMAGE_GALLERY__IS_SLIDE_SHOW);

		mediaPlayerEClass = createEClass(MEDIA_PLAYER);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__IS_PLAYING);
		createEReference(mediaPlayerEClass, MEDIA_PLAYER__MEDIA);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__AUTO_PLAY);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__SHOW_CONTROLS);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__WIDTH);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__HEIGHT);
		createEAttribute(mediaPlayerEClass, MEDIA_PLAYER__VISIBLE);

		spinnerEClass = createEClass(SPINNER);

		numericStepperEClass = createEClass(NUMERIC_STEPPER);
		createEAttribute(numericStepperEClass, NUMERIC_STEPPER__MIN_VALUE);
		createEAttribute(numericStepperEClass, NUMERIC_STEPPER__MAX_VALUE);

		scrollbarEClass = createEClass(SCROLLBAR);
		createEAttribute(scrollbarEClass, SCROLLBAR__MAX_VALUE);
		createEAttribute(scrollbarEClass, SCROLLBAR__MIN_VALUE);
		createEAttribute(scrollbarEClass, SCROLLBAR__VALUE);
		createEAttribute(scrollbarEClass, SCROLLBAR__ORIENTATION);

		calendarViewEClass = createEClass(CALENDAR_VIEW);
		createEAttribute(calendarViewEClass, CALENDAR_VIEW__DISPLAY_MODE);
		createEAttribute(calendarViewEClass, CALENDAR_VIEW__DATE);

		softKeyboardEClass = createEClass(SOFT_KEYBOARD);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__KEYBOARD_LAYOUT);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__USE_DICTIONARY);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__DICTIONARY_LANGUAGE);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__ENABLED);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__DICTIONARY);
		createEAttribute(softKeyboardEClass, SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON);

		abstractDialogBoxEClass = createEClass(ABSTRACT_DIALOG_BOX);
		createEAttribute(abstractDialogBoxEClass, ABSTRACT_DIALOG_BOX__TITLE);
		createEAttribute(abstractDialogBoxEClass, ABSTRACT_DIALOG_BOX__TEXT);
		createEAttribute(abstractDialogBoxEClass, ABSTRACT_DIALOG_BOX__VISIBLE);

		dialogBoxEClass = createEClass(DIALOG_BOX);
		createEAttribute(dialogBoxEClass, DIALOG_BOX__MODAL);
		createEAttribute(dialogBoxEClass, DIALOG_BOX__BUTTONS);

		customDialogEClass = createEClass(CUSTOM_DIALOG);
		createEReference(customDialogEClass, CUSTOM_DIALOG__ELEMENT);

		fileChooserEClass = createEClass(FILE_CHOOSER);

		tabItemEClass = createEClass(TAB_ITEM);
		createEAttribute(tabItemEClass, TAB_ITEM__TITLE);
		createEReference(tabItemEClass, TAB_ITEM__ELEMENT);

		tabViewEClass = createEClass(TAB_VIEW);
		createEReference(tabViewEClass, TAB_VIEW__ITEMS);

		uiElementUpdateEClass = createEClass(UI_ELEMENT_UPDATE);
		createEAttribute(uiElementUpdateEClass, UI_ELEMENT_UPDATE__ID);
		createEAttribute(uiElementUpdateEClass, UI_ELEMENT_UPDATE__ENABLED);
		createEAttribute(uiElementUpdateEClass, UI_ELEMENT_UPDATE__STYLE_NAMES);
		createEAttribute(uiElementUpdateEClass, UI_ELEMENT_UPDATE__TOOLTIP);
		createEReference(uiElementUpdateEClass, UI_ELEMENT_UPDATE__STYLE_PROPS);

		textInputUpdateEClass = createEClass(TEXT_INPUT_UPDATE);
		createEAttribute(textInputUpdateEClass, TEXT_INPUT_UPDATE__TEXT);

		labeledTextInputUpdateEClass = createEClass(LABELED_TEXT_INPUT_UPDATE);
		createEAttribute(labeledTextInputUpdateEClass, LABELED_TEXT_INPUT_UPDATE__LABEL);

		richTextInputUpdateEClass = createEClass(RICH_TEXT_INPUT_UPDATE);

		colorPickerUpdateEClass = createEClass(COLOR_PICKER_UPDATE);

		labelUpdateEClass = createEClass(LABEL_UPDATE);
		createEAttribute(labelUpdateEClass, LABEL_UPDATE__TEXT);

		listUpdateEClass = createEClass(LIST_UPDATE);
		createEAttribute(listUpdateEClass, LIST_UPDATE__ALLOW_MULTIPLE_SELECTION);
		createEAttribute(listUpdateEClass, LIST_UPDATE__SELECTED_INDEX);

		comboboxUpdateEClass = createEClass(COMBOBOX_UPDATE);

		listItemUpdateEClass = createEClass(LIST_ITEM_UPDATE);
		createEAttribute(listItemUpdateEClass, LIST_ITEM_UPDATE__LABEL);
		createEAttribute(listItemUpdateEClass, LIST_ITEM_UPDATE__VALUE);
		createEAttribute(listItemUpdateEClass, LIST_ITEM_UPDATE__SELECTED);

		buttonUpdateEClass = createEClass(BUTTON_UPDATE);
		createEAttribute(buttonUpdateEClass, BUTTON_UPDATE__LABEL);

		submitButtonUpdateEClass = createEClass(SUBMIT_BUTTON_UPDATE);

		checkBoxUpdateEClass = createEClass(CHECK_BOX_UPDATE);
		createEAttribute(checkBoxUpdateEClass, CHECK_BOX_UPDATE__CHECKED);
		createEAttribute(checkBoxUpdateEClass, CHECK_BOX_UPDATE__VALUE);

		radioButtonUpdateEClass = createEClass(RADIO_BUTTON_UPDATE);

		imageButtonUpdateEClass = createEClass(IMAGE_BUTTON_UPDATE);
		createEReference(imageButtonUpdateEClass, IMAGE_BUTTON_UPDATE__RESOURCE);

		toggleButtonUpdateEClass = createEClass(TOGGLE_BUTTON_UPDATE);
		createEAttribute(toggleButtonUpdateEClass, TOGGLE_BUTTON_UPDATE__IS_SELECTED);

		gridContainerUpdateEClass = createEClass(GRID_CONTAINER_UPDATE);

		canvasUpdateEClass = createEClass(CANVAS_UPDATE);

		formUpdateEClass = createEClass(FORM_UPDATE);

		vBoxUpdateEClass = createEClass(VBOX_UPDATE);

		hBoxUpdateEClass = createEClass(HBOX_UPDATE);

		htmlViewUpdateEClass = createEClass(HTML_VIEW_UPDATE);
		createEAttribute(htmlViewUpdateEClass, HTML_VIEW_UPDATE__CONTENT);
		createEAttribute(htmlViewUpdateEClass, HTML_VIEW_UPDATE__SOURCE);

		tabItemUpdateEClass = createEClass(TAB_ITEM_UPDATE);
		createEAttribute(tabItemUpdateEClass, TAB_ITEM_UPDATE__TITLE);

		imageUpdateEClass = createEClass(IMAGE_UPDATE);
		createEReference(imageUpdateEClass, IMAGE_UPDATE__RESOURCE);

		dialogUpdateEClass = createEClass(DIALOG_UPDATE);
		createEAttribute(dialogUpdateEClass, DIALOG_UPDATE__VISIBLE);
		createEAttribute(dialogUpdateEClass, DIALOG_UPDATE__TITLE);
		createEAttribute(dialogUpdateEClass, DIALOG_UPDATE__TEXT);

		progressBarUpdateEClass = createEClass(PROGRESS_BAR_UPDATE);
		createEAttribute(progressBarUpdateEClass, PROGRESS_BAR_UPDATE__PERCENTAGE);
		createEAttribute(progressBarUpdateEClass, PROGRESS_BAR_UPDATE__MAX);

		javaScriptUpdateEClass = createEClass(JAVA_SCRIPT_UPDATE);
		createEAttribute(javaScriptUpdateEClass, JAVA_SCRIPT_UPDATE__SCRIPT);

		guiPluginEClass = createEClass(GUI_PLUGIN);
		createEAttribute(guiPluginEClass, GUI_PLUGIN__CLASS_NAME);

		// Create enums
		alignmentEEnum = createEEnum(ALIGNMENT);
		vAlignmentEEnum = createEEnum(VALIGNMENT);
		orientationEEnum = createEEnum(ORIENTATION);
		imageFillModesEEnum = createEEnum(IMAGE_FILL_MODES);
		directionHVEEnum = createEEnum(DIRECTION_HV);
		dialogueButtonsEEnum = createEEnum(DIALOGUE_BUTTONS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Io_interfacesPackage theIo_interfacesPackage = (Io_interfacesPackage)EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI);
		GuiEventsPackage theGuiEventsPackage = (GuiEventsPackage)EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		Communicative_functionsPackage theCommunicative_functionsPackage = (Communicative_functionsPackage)EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI);
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guiRequestEClass.getESuperTypes().add(theIo_interfacesPackage.getRendererOutput());
		guiEventEClass.getESuperTypes().add(theIo_interfacesPackage.getControllerInput());
		guiApplicationEClass.getESuperTypes().add(this.getGUIRequest());
		guiUpdateEClass.getESuperTypes().add(this.getGUIRequest());
		updateInfoEClass.getESuperTypes().add(theBasePackage.getBObject());
		windowUpdateEClass.getESuperTypes().add(this.getUpdateInfo());
		styleSheetUpdateEClass.getESuperTypes().add(this.getUpdateInfo());
		removeUIElementEClass.getESuperTypes().add(this.getUpdateInfo());
		addUIElementEClass.getESuperTypes().add(this.getUpdateInfo());
		addTableCellEClass.getESuperTypes().add(this.getAddUIElement());
		removeTableCellEClass.getESuperTypes().add(this.getRemoveUIElement());
		moveUIElementEClass.getESuperTypes().add(this.getUpdateInfo());
		uiElementEClass.getESuperTypes().add(theBasePackage.getBObject());
		abstractContainerEClass.getESuperTypes().add(this.getUIElement());
		containerEClass.getESuperTypes().add(this.getAbstractContainer());
		windowEClass.getESuperTypes().add(this.getContainer());
		gridContainerEClass.getESuperTypes().add(this.getAbstractContainer());
		canvasEClass.getESuperTypes().add(this.getContainer());
		formEClass.getESuperTypes().add(this.getContainer());
		vBoxEClass.getESuperTypes().add(this.getContainer());
		hBoxEClass.getESuperTypes().add(this.getContainer());
		divEClass.getESuperTypes().add(this.getContainer());
		gridRowEClass.getESuperTypes().add(this.getAbstractContainer());
		gridItemEClass.getESuperTypes().add(this.getContainer());
		gridHeaderItemEClass.getESuperTypes().add(this.getGridItem());
		htmlViewEClass.getESuperTypes().add(this.getUIElement());
		displayContextViewEClass.getESuperTypes().add(this.getUIElement());
		absoluteLayoutEClass.getESuperTypes().add(this.getLayout());
		flowLayoutEClass.getESuperTypes().add(this.getLayout());
		labelEClass.getESuperTypes().add(this.getUIElement());
		textInputEClass.getESuperTypes().add(this.getUIElement());
		labeledTextInputEClass.getESuperTypes().add(this.getTextInput());
		richTextInputEClass.getESuperTypes().add(this.getTextInput());
		listEClass.getESuperTypes().add(this.getAbstractContainer());
		listItemEClass.getESuperTypes().add(this.getUIElement());
		comboBoxEClass.getESuperTypes().add(this.getList());
		buttonEClass.getESuperTypes().add(this.getUIElement());
		submitButtonEClass.getESuperTypes().add(this.getButton());
		checkBoxEClass.getESuperTypes().add(this.getButton());
		radioButtonEClass.getESuperTypes().add(this.getButton());
		toggleButtonEClass.getESuperTypes().add(this.getButton());
		imageButtonEClass.getESuperTypes().add(this.getButton());
		buttonBarEClass.getESuperTypes().add(this.getAbstractContainer());
		colorPickerEClass.getESuperTypes().add(this.getTextInput());
		progressBarEClass.getESuperTypes().add(this.getUIElement());
		imageEClass.getESuperTypes().add(this.getUIElement());
		imageGalleryEClass.getESuperTypes().add(this.getUIElement());
		mediaPlayerEClass.getESuperTypes().add(this.getUIElement());
		spinnerEClass.getESuperTypes().add(this.getUIElement());
		numericStepperEClass.getESuperTypes().add(this.getSpinner());
		scrollbarEClass.getESuperTypes().add(this.getUIElement());
		calendarViewEClass.getESuperTypes().add(this.getUIElement());
		abstractDialogBoxEClass.getESuperTypes().add(this.getUIElement());
		dialogBoxEClass.getESuperTypes().add(this.getAbstractDialogBox());
		customDialogEClass.getESuperTypes().add(this.getAbstractDialogBox());
		fileChooserEClass.getESuperTypes().add(this.getUIElement());
		tabItemEClass.getESuperTypes().add(this.getUIElement());
		tabViewEClass.getESuperTypes().add(this.getAbstractContainer());
		uiElementUpdateEClass.getESuperTypes().add(this.getUpdateInfo());
		textInputUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		labeledTextInputUpdateEClass.getESuperTypes().add(this.getTextInputUpdate());
		richTextInputUpdateEClass.getESuperTypes().add(this.getTextInputUpdate());
		colorPickerUpdateEClass.getESuperTypes().add(this.getTextInputUpdate());
		labelUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		listUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		comboboxUpdateEClass.getESuperTypes().add(this.getListUpdate());
		listItemUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		buttonUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		submitButtonUpdateEClass.getESuperTypes().add(this.getButtonUpdate());
		checkBoxUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		radioButtonUpdateEClass.getESuperTypes().add(this.getCheckBoxUpdate());
		imageButtonUpdateEClass.getESuperTypes().add(this.getButtonUpdate());
		toggleButtonUpdateEClass.getESuperTypes().add(this.getButtonUpdate());
		gridContainerUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		canvasUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		formUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		vBoxUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		hBoxUpdateEClass.getESuperTypes().add(this.getVBoxUpdate());
		htmlViewUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		tabItemUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		imageUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		dialogUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		progressBarUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		javaScriptUpdateEClass.getESuperTypes().add(this.getUpdateInfo());
		guiPluginEClass.getESuperTypes().add(theBasePackage.getBObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(guiRequestEClass, GUIRequest.class, "GUIRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiEventEClass, GUIEvent.class, "GUIEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIEvent_EventData(), theGuiEventsPackage.getGUIEventData(), null, "eventData", null, 1, 1, GUIEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiApplicationEClass, GUIApplication.class, "GUIApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIApplication_Window(), this.getWindow(), null, "window", null, 1, 1, GUIApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIApplication_ApplicationId(), theBasePackage.getBString(), "applicationId", null, 0, 1, GUIApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIApplication_StyleResource(), theBasePackage.getStyleSheet(), null, "styleResource", null, 0, 1, GUIApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiUpdateEClass, GUIUpdate.class, "GUIUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIUpdate_Updates(), this.getUpdateInfo(), null, "updates", null, 0, -1, GUIUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIUpdate_ApplicationId(), theBasePackage.getBString(), "applicationId", null, 0, 1, GUIUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIUpdate_Validated(), ecorePackage.getEBoolean(), "validated", "false", 0, 1, GUIUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateInfoEClass, UpdateInfo.class, "UpdateInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowUpdateEClass, WindowUpdate.class, "WindowUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWindowUpdate_Window(), this.getWindow(), null, "window", null, 1, 1, WindowUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSheetUpdateEClass, StyleSheetUpdate.class, "StyleSheetUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleSheetUpdate_StyleResource(), theBasePackage.getStyleSheet(), null, "styleResource", null, 0, 1, StyleSheetUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeUIElementEClass, RemoveUIElement.class, "RemoveUIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveUIElement_ElementId(), theBasePackage.getBString(), "elementId", "", 0, 1, RemoveUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addUIElementEClass, AddUIElement.class, "AddUIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddUIElement_ParentId(), theBasePackage.getBString(), "parentId", null, 0, 1, AddUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddUIElement_NewElement(), this.getUIElement(), null, "newElement", null, 0, 1, AddUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddUIElement_NewElementRef(), this.getUIElement(), null, "newElementRef", null, 0, 1, AddUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUIElement_Position(), theBasePackage.getBInteger(), "position", "-1", 0, 1, AddUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTableCellEClass, AddTableCell.class, "AddTableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddTableCell_ColumnPosition(), theBasePackage.getBInteger(), "columnPosition", "-1", 0, 1, AddTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeTableCellEClass, RemoveTableCell.class, "RemoveTableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveTableCell_RemoveRow(), ecorePackage.getEBoolean(), "removeRow", null, 0, 1, RemoveTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveUIElementEClass, MoveUIElement.class, "MoveUIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveUIElement_NewParentId(), theBasePackage.getBString(), "newParentId", null, 0, 1, MoveUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveUIElement_ElementId(), theBasePackage.getBString(), "elementId", null, 0, 1, MoveUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveUIElement_Position(), theBasePackage.getBInteger(), "position", "-1", 0, 1, MoveUIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiElementEClass, UIElement.class, "UIElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIElement_Id(), theBasePackage.getBString(), "id", null, 1, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_Enabled(), theBasePackage.getBBoolean(), "enabled", "true", 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_Layout(), this.getLayout(), null, "layout", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_SupportedEvents(), this.getSupportedEvent(), null, "supportedEvents", null, 0, -1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_StyleNames(), theBasePackage.getBString(), "styleNames", null, 0, -1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_X(), theBasePackage.getBInteger(), "x", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_Y(), theBasePackage.getBInteger(), "y", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_SemanticContent(), theBasePackage.getEntity(), null, "semanticContent", null, 0, -1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_Adapter(), this.getElementAdapter(), null, "adapter", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_Tooltip(), theBasePackage.getBString(), "tooltip", null, 0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedEventEClass, SupportedEvent.class, "SupportedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedEvent_Interpretation(), theCommunicative_functionsPackage.getCommunicativeFunction(), null, "interpretation", null, 0, 1, SupportedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupportedEvent_EventType(), ecorePackage.getEClass(), null, "eventType", null, 1, 1, SupportedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupportedEvent_Annotation(), ecorePackage.getEObject(), null, "annotation", null, 0, 1, SupportedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractContainerEClass, AbstractContainer.class, "AbstractContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractContainer_ArrayAdapter(), this.getArrayAdapter(), null, "arrayAdapter", null, 0, 1, AbstractContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractContainer__Contains(), this.getUIElement(), "contains", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAbstractContainer__AddChild__UIElement(), null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUIElement(), "uiElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractContainer__AddChild__BInteger_UIElement(), null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasePackage.getBInteger(), "beforeIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUIElement(), "uiElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractContainer__RemoveChild__UIElement(), ecorePackage.getEBoolean(), "removeChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUIElement(), "uiElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerEClass, de.dfki.iui.mmds.core.model.io.gui.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Elements(), this.getUIElement(), null, "elements", null, 0, -1, de.dfki.iui.mmds.core.model.io.gui.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Title(), theBasePackage.getBString(), "title", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWindow_Plugins(), this.getGuiPlugin(), null, "plugins", null, 0, -1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementAdapterEClass, ElementAdapter.class, "ElementAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementAdapter_Pattern(), thePatternPackage.getPPattern(), null, "pattern", null, 0, 1, ElementAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementAdapter_AdapterMapping(), this.getAdapterMapping(), null, "adapterMapping", null, 0, -1, ElementAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterMappingEClass, AdapterMapping.class, "AdapterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapterMapping_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, AdapterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdapterMapping_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, AdapterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayAdapterEClass, ArrayAdapter.class, "ArrayAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayAdapter_Element(), this.getUIElement(), null, "element", null, 0, 1, ArrayAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayAdapter_Pattern(), thePatternPackage.getPPattern(), null, "pattern", null, 0, 1, ArrayAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayAdapter_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, ArrayAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridContainerEClass, GridContainer.class, "GridContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridContainer_Row(), this.getGridRow(), null, "row", null, 1, -1, GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vBoxEClass, VBox.class, "VBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hBoxEClass, HBox.class, "HBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiv_Content(), theBasePackage.getBString(), "content", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridRowEClass, GridRow.class, "GridRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridRow_RowId(), theBasePackage.getBInteger(), "rowId", null, 0, 1, GridRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridRow_Height(), theBasePackage.getBFloat(), "height", null, 0, 1, GridRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridRow_IsPercentage(), theBasePackage.getBBoolean(), "isPercentage", "false", 0, 1, GridRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridRow_Item(), this.getGridItem(), null, "item", null, 1, -1, GridRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridItemEClass, GridItem.class, "GridItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridItem_Width(), theBasePackage.getBFloat(), "width", null, 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItem_IsPercentage(), theBasePackage.getBBoolean(), "isPercentage", "false", 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItem_RowSpan(), theBasePackage.getBInteger(), "rowSpan", null, 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItem_ColumnSpan(), theBasePackage.getBInteger(), "columnSpan", null, 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItem_Alignment(), this.getAlignment(), "alignment", null, 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItem_Valignment(), this.getVAlignment(), "valignment", null, 0, 1, GridItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridHeaderItemEClass, GridHeaderItem.class, "GridHeaderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlViewEClass, HTMLView.class, "HTMLView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLView_Content(), theBasePackage.getBString(), "content", null, 0, 1, HTMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLView_Source(), theBasePackage.getUrl(), "source", null, 0, 1, HTMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTMLView_LoadingIndicator(), this.getProgressBar(), null, "loadingIndicator", null, 0, 1, HTMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayContextViewEClass, DisplayContextView.class, "DisplayContextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayContextView_DisplayContextName(), ecorePackage.getEString(), "displayContextName", null, 0, 1, DisplayContextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Margin(), this.getMargin(), null, "margin", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_HorizontalAlignment(), this.getAlignment(), "horizontalAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_VerticalAlignment(), this.getAlignment(), "verticalAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marginEClass, Margin.class, "Margin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMargin_Top(), ecorePackage.getEInt(), "top", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargin_Left(), ecorePackage.getEInt(), "left", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargin_Right(), ecorePackage.getEInt(), "right", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargin_Bottom(), ecorePackage.getEInt(), "bottom", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargin_IsPercentage(), theXMLTypePackage.getBoolean(), "isPercentage", "false", 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteLayoutEClass, AbsoluteLayout.class, "AbsoluteLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteLayout_X(), ecorePackage.getEInt(), "x", null, 0, 1, AbsoluteLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteLayout_Z(), ecorePackage.getEInt(), "z", null, 0, 1, AbsoluteLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteLayout_Y(), ecorePackage.getEInt(), "y", null, 0, 1, AbsoluteLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLayoutEClass, FlowLayout.class, "FlowLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolTipEClass, ToolTip.class, "ToolTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolTip_Text(), ecorePackage.getEString(), "text", null, 0, 1, ToolTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolTip_Element(), this.getUIElement(), null, "element", null, 0, 1, ToolTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Text(), theBasePackage.getBString(), "text", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInput_Text(), theBasePackage.getBString(), "text", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInput_MultiLine(), theBasePackage.getBBoolean(), "multiLine", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextInput_SoftKeyboard(), this.getSoftKeyboard(), null, "softKeyboard", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labeledTextInputEClass, LabeledTextInput.class, "LabeledTextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledTextInput_Label(), theBasePackage.getBString(), "label", null, 1, 1, LabeledTextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richTextInputEClass, RichTextInput.class, "RichTextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_AllowMultipleSelection(), theBasePackage.getBBoolean(), "allowMultipleSelection", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_Item(), this.getListItem(), null, "item", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_SelectedIndex(), theBasePackage.getBInteger(), "selectedIndex", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Label(), theBasePackage.getBString(), "label", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItem_Value(), theBasePackage.getBString(), "value", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItem_Selected(), theBasePackage.getBBoolean(), "selected", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Label(), theBasePackage.getBString(), "label", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submitButtonEClass, SubmitButton.class, "SubmitButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_Checked(), theBasePackage.getBBoolean(), "checked", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_RadioGroup(), ecorePackage.getEString(), "radioGroup", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioButton_Value(), theBasePackage.getBString(), "value", "\"\"", 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioButton_Checked(), theBasePackage.getBBoolean(), "checked", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleButtonEClass, ToggleButton.class, "ToggleButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleButton_IsSelected(), ecorePackage.getEBoolean(), "isSelected", null, 0, 1, ToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageButtonEClass, ImageButton.class, "ImageButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageButton_Resource(), theBasePackage.getPicture(), null, "resource", null, 1, 1, ImageButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonBarEClass, ButtonBar.class, "ButtonBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonBar_Button(), this.getButton(), null, "button", null, 0, -1, ButtonBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonBar_Orientation(), this.getOrientation(), "orientation", null, 0, 1, ButtonBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorPickerEClass, ColorPicker.class, "ColorPicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(progressBarEClass, ProgressBar.class, "ProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressBar_Percentage(), theBasePackage.getBInteger(), "percentage", "10", 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Determinate(), theBasePackage.getBBoolean(), "determinate", "true", 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Max(), theBasePackage.getBInteger(), "max", "100", 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Smooth(), ecorePackage.getEBoolean(), "smooth", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_FillMode(), this.getImageFillModes(), "fillMode", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_LoadingIndicator(), this.getProgressBar(), null, "loadingIndicator", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_CanManipulate(), ecorePackage.getEBoolean(), "canManipulate", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Resource(), theBasePackage.getPicture(), null, "resource", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageGalleryEClass, ImageGallery.class, "ImageGallery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageGallery_Image(), theBasePackage.getPicture(), null, "image", null, 0, -1, ImageGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageGallery_ButtonBar(), this.getButtonBar(), null, "buttonBar", null, 1, 1, ImageGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageGallery_IsSlideShow(), ecorePackage.getEBoolean(), "isSlideShow", null, 0, 1, ImageGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaPlayerEClass, MediaPlayer.class, "MediaPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaPlayer_IsPlaying(), ecorePackage.getEBoolean(), "isPlaying", null, 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaPlayer_Media(), theBasePackage.getMediaResource(), null, "media", null, 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaPlayer_AutoPlay(), theBasePackage.getBBoolean(), "autoPlay", "false", 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaPlayer_ShowControls(), theBasePackage.getBBoolean(), "showControls", "true", 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaPlayer_Width(), theBasePackage.getBInteger(), "width", "640", 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaPlayer_Height(), theBasePackage.getBInteger(), "height", "240", 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaPlayer_Visible(), theBasePackage.getBBoolean(), "visible", "true", 0, 1, MediaPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinnerEClass, Spinner.class, "Spinner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericStepperEClass, NumericStepper.class, "NumericStepper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericStepper_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1, NumericStepper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericStepper_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1, NumericStepper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scrollbarEClass, Scrollbar.class, "Scrollbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScrollbar_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1, Scrollbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollbar_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1, Scrollbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollbar_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Scrollbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollbar_Orientation(), this.getDirectionHV(), "orientation", null, 0, 1, Scrollbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarViewEClass, CalendarView.class, "CalendarView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendarView_DisplayMode(), ecorePackage.getEString(), "displayMode", null, 0, 1, CalendarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarView_Date(), theBasePackage.getDate(), "date", null, 0, 1, CalendarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softKeyboardEClass, SoftKeyboard.class, "SoftKeyboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftKeyboard_KeyboardLayout(), ecorePackage.getEString(), "keyboardLayout", null, 0, 1, SoftKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftKeyboard_UseDictionary(), ecorePackage.getEBoolean(), "useDictionary", null, 0, 1, SoftKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftKeyboard_DictionaryLanguage(), ecorePackage.getEString(), "dictionaryLanguage", null, 0, 1, SoftKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftKeyboard_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, SoftKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftKeyboard_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, -1, SoftKeyboard.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftKeyboard_EnableSpeechInputIcon(), ecorePackage.getEBoolean(), "enableSpeechInputIcon", null, 0, 1, SoftKeyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDialogBoxEClass, AbstractDialogBox.class, "AbstractDialogBox", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDialogBox_Title(), theBasePackage.getBString(), "title", null, 0, 1, AbstractDialogBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDialogBox_Text(), theBasePackage.getBString(), "text", null, 0, 1, AbstractDialogBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDialogBox_Visible(), theBasePackage.getBBoolean(), "visible", "false", 0, 1, AbstractDialogBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogBoxEClass, DialogBox.class, "DialogBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogBox_Modal(), theBasePackage.getBBoolean(), "modal", "false", 0, 1, DialogBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogBox_Buttons(), this.getDialogueButtons(), "buttons", null, 1, 1, DialogBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDialogEClass, CustomDialog.class, "CustomDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomDialog_Element(), this.getUIElement(), null, "element", null, 1, 1, CustomDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileChooserEClass, FileChooser.class, "FileChooser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabItemEClass, TabItem.class, "TabItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabItem_Title(), theBasePackage.getBString(), "title", null, 0, 1, TabItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabItem_Element(), this.getUIElement(), null, "element", null, 1, 1, TabItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabViewEClass, TabView.class, "TabView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabView_Items(), this.getTabItem(), null, "items", null, 0, -1, TabView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiElementUpdateEClass, UIElementUpdate.class, "UIElementUpdate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIElementUpdate_Id(), theBasePackage.getBString(), "id", null, 0, 1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElementUpdate_Enabled(), theBasePackage.getBBoolean(), "enabled", "true", 0, 1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElementUpdate_StyleNames(), theBasePackage.getBString(), "styleNames", null, 0, -1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElementUpdate_Tooltip(), theBasePackage.getBString(), "tooltip", null, 0, 1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElementUpdate_StyleProps(), theBasePackage.getStringToBStringMapEntry(), null, "styleProps", null, 0, -1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputUpdateEClass, TextInputUpdate.class, "TextInputUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputUpdate_Text(), theBasePackage.getBString(), "text", null, 0, 1, TextInputUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labeledTextInputUpdateEClass, LabeledTextInputUpdate.class, "LabeledTextInputUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledTextInputUpdate_Label(), theBasePackage.getBString(), "label", null, 0, 1, LabeledTextInputUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richTextInputUpdateEClass, RichTextInputUpdate.class, "RichTextInputUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorPickerUpdateEClass, ColorPickerUpdate.class, "ColorPickerUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelUpdateEClass, LabelUpdate.class, "LabelUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelUpdate_Text(), theBasePackage.getBString(), "text", null, 0, 1, LabelUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listUpdateEClass, ListUpdate.class, "ListUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListUpdate_AllowMultipleSelection(), theBasePackage.getBBoolean(), "allowMultipleSelection", null, 0, 1, ListUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListUpdate_SelectedIndex(), theBasePackage.getBInteger(), "selectedIndex", null, 0, -1, ListUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboboxUpdateEClass, ComboboxUpdate.class, "ComboboxUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemUpdateEClass, ListItemUpdate.class, "ListItemUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItemUpdate_Label(), theBasePackage.getBString(), "label", null, 0, 1, ListItemUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItemUpdate_Value(), theBasePackage.getBString(), "value", null, 0, 1, ListItemUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItemUpdate_Selected(), theBasePackage.getBBoolean(), "selected", null, 0, 1, ListItemUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonUpdateEClass, ButtonUpdate.class, "ButtonUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonUpdate_Label(), theBasePackage.getBString(), "label", null, 0, 1, ButtonUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submitButtonUpdateEClass, SubmitButtonUpdate.class, "SubmitButtonUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxUpdateEClass, CheckBoxUpdate.class, "CheckBoxUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBoxUpdate_Checked(), theBasePackage.getBBoolean(), "checked", null, 0, 1, CheckBoxUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckBoxUpdate_Value(), theBasePackage.getBString(), "value", null, 0, 1, CheckBoxUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioButtonUpdateEClass, RadioButtonUpdate.class, "RadioButtonUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageButtonUpdateEClass, ImageButtonUpdate.class, "ImageButtonUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageButtonUpdate_Resource(), theBasePackage.getPicture(), null, "resource", null, 1, 1, ImageButtonUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleButtonUpdateEClass, ToggleButtonUpdate.class, "ToggleButtonUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleButtonUpdate_IsSelected(), theBasePackage.getBBoolean(), "isSelected", null, 0, 1, ToggleButtonUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridContainerUpdateEClass, GridContainerUpdate.class, "GridContainerUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(canvasUpdateEClass, CanvasUpdate.class, "CanvasUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formUpdateEClass, FormUpdate.class, "FormUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vBoxUpdateEClass, VBoxUpdate.class, "VBoxUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hBoxUpdateEClass, HBoxUpdate.class, "HBoxUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlViewUpdateEClass, HtmlViewUpdate.class, "HtmlViewUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlViewUpdate_Content(), theBasePackage.getBString(), "content", null, 0, 1, HtmlViewUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHtmlViewUpdate_Source(), theBasePackage.getUrl(), "source", null, 0, 1, HtmlViewUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabItemUpdateEClass, TabItemUpdate.class, "TabItemUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabItemUpdate_Title(), theBasePackage.getBString(), "title", null, 0, 1, TabItemUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUpdateEClass, ImageUpdate.class, "ImageUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageUpdate_Resource(), theBasePackage.getPicture(), null, "resource", null, 1, 1, ImageUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogUpdateEClass, DialogUpdate.class, "DialogUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogUpdate_Visible(), theBasePackage.getBBoolean(), "visible", null, 0, 1, DialogUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogUpdate_Title(), theBasePackage.getBString(), "title", null, 0, 1, DialogUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogUpdate_Text(), theBasePackage.getBString(), "text", null, 0, 1, DialogUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressBarUpdateEClass, ProgressBarUpdate.class, "ProgressBarUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressBarUpdate_Percentage(), theBasePackage.getBInteger(), "percentage", null, 0, 1, ProgressBarUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBarUpdate_Max(), theBasePackage.getBInteger(), "max", null, 0, 1, ProgressBarUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaScriptUpdateEClass, JavaScriptUpdate.class, "JavaScriptUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaScriptUpdate_Script(), theBasePackage.getBString(), "script", null, 1, -1, JavaScriptUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiPluginEClass, GuiPlugin.class, "GuiPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiPlugin_ClassName(), theBasePackage.getBString(), "className", null, 0, 1, GuiPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignmentEEnum, Alignment.class, "Alignment");
		addEEnumLiteral(alignmentEEnum, Alignment.LEFT);
		addEEnumLiteral(alignmentEEnum, Alignment.CENTER);
		addEEnumLiteral(alignmentEEnum, Alignment.RIGHT);

		initEEnum(vAlignmentEEnum, VAlignment.class, "VAlignment");
		addEEnumLiteral(vAlignmentEEnum, VAlignment.TOP);
		addEEnumLiteral(vAlignmentEEnum, VAlignment.MIDDLE);
		addEEnumLiteral(vAlignmentEEnum, VAlignment.BOTTOM);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);

		initEEnum(imageFillModesEEnum, ImageFillModes.class, "ImageFillModes");
		addEEnumLiteral(imageFillModesEEnum, ImageFillModes.ORIGINAL);
		addEEnumLiteral(imageFillModesEEnum, ImageFillModes.STRETCHED);
		addEEnumLiteral(imageFillModesEEnum, ImageFillModes.ZOOMED);
		addEEnumLiteral(imageFillModesEEnum, ImageFillModes.TILED);

		initEEnum(directionHVEEnum, DirectionHV.class, "DirectionHV");
		addEEnumLiteral(directionHVEEnum, DirectionHV.HORIZONTAL);
		addEEnumLiteral(directionHVEEnum, DirectionHV.VERTICAL);

		initEEnum(dialogueButtonsEEnum, DialogueButtons.class, "DialogueButtons");
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.OK_ONLY);
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.OK_CANCEL);
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.ABORT_RETRY_IGNORE);
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.YES_NO_CANCEL);
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.YES_NO);
		addEEnumLiteral(dialogueButtonsEEnum, DialogueButtons.RETRY_CANCEL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} // GuiPackageImpl
