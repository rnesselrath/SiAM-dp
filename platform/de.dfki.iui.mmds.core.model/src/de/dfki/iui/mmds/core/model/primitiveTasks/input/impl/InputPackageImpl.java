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
package de.dfki.iui.mmds.core.model.primitiveTasks.input.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import de.dfki.iui.mmds.core.model.base.BasePackage;

import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;

import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;

import de.dfki.iui.mmds.core.model.io.IoPackage;

import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;

import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl;

import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;

import de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl;

import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;

import de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl;

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

import de.dfki.iui.mmds.core.model.primitiveTasks.input.ASRErrorCorrectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.CommandInvocationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ContainerManipulationTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DateTimeEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DecimalNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowBackwardNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowCancelNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowDirectionalNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowEndNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowForwardNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowLabelNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowRandomNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowStartNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpanationExpansionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpandInformationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.FreeTextEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.IntraDocumentNavigationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InvocationTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemActivationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemRearrangementTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemMultiSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.MenuInvocationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.MessageDismissalTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.NavigationTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ObjectSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.PanTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ProactivityInvocationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.RevertAdaptationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ScrollTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.TextSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.TriStateSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.YesNoSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.ZoomTask;

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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputPackageImpl extends EPackageImpl implements InputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveInputTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerManipulationTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factEntryTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationTaskBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoomTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraDocumentNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowDirectionalNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowForwardNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowBackwardNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowStartNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowEndNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowRandomNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowCancelNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogFlowLabelNavigationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandInvocationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuInvocationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemActivationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemRearrangementTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandInformationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asrErrorCorrectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proactivityInvocationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expanationExpansionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revertAdaptationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextEntryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEntryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerNumberEntryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedIntegerNumberEntryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalNumberEntryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yesNoSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triStateSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemMultiSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDismissalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSelectionTaskEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InputPackageImpl() {
		super(eNS_URI, InputFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InputPackage init() {
		if (isInited) return (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);

		// Obtain or create and register package
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) : Communicative_functionsPackage.eINSTANCE);
		DialoguePackageImpl theDialoguePackage = (DialoguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) instanceof DialoguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) : DialoguePackage.eINSTANCE);
		EarconsPackageImpl theEarconsPackage = (EarconsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) instanceof EarconsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) : EarconsPackage.eINSTANCE);
		Grammar_rulesPackageImpl theGrammar_rulesPackage = (Grammar_rulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) instanceof Grammar_rulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) : Grammar_rulesPackage.eINSTANCE);
		GuiEventsPackageImpl theGuiEventsPackage = (GuiEventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) instanceof GuiEventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) : GuiEventsPackage.eINSTANCE);
		GuiPackageImpl theGuiPackage = (GuiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) instanceof GuiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) : GuiPackage.eINSTANCE);
		Io_interfacesPackageImpl theIo_interfacesPackage = (Io_interfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) instanceof Io_interfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) : Io_interfacesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		PrimitiveTasksPackageImpl thePrimitiveTasksPackage = (PrimitiveTasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) instanceof PrimitiveTasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) : PrimitiveTasksPackage.eINSTANCE);
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
		theInputPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theGrammar_rulesPackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();
		theGuiPackage.createPackageContents();
		theIo_interfacesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		thePrimitiveTasksPackage.createPackageContents();
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
		theInputPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theGrammar_rulesPackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();
		theGuiPackage.initializePackageContents();
		theIo_interfacesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		thePrimitiveTasksPackage.initializePackageContents();
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
		theInputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InputPackage.eNS_URI, theInputPackage);
		return theInputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveInputTask() {
		return primitiveInputTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerManipulationTaskBase() {
		return containerManipulationTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionTaskBase() {
		return selectionTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactEntryTaskBase() {
		return factEntryTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationTaskBase() {
		return navigationTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationTaskBase() {
		return invocationTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationTaskBase() {
		return adaptationTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoomTask() {
		return zoomTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanTask() {
		return panTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollTask() {
		return scrollTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraDocumentNavigationTask() {
		return intraDocumentNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowDirectionalNavigationTask() {
		return dialogFlowDirectionalNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowForwardNavigationTask() {
		return dialogFlowForwardNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowBackwardNavigationTask() {
		return dialogFlowBackwardNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowStartNavigationTask() {
		return dialogFlowStartNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowEndNavigationTask() {
		return dialogFlowEndNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowRandomNavigationTask() {
		return dialogFlowRandomNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowCancelNavigationTask() {
		return dialogFlowCancelNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogFlowLabelNavigationTask() {
		return dialogFlowLabelNavigationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandInvocationTask() {
		return commandInvocationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuInvocationTask() {
		return menuInvocationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemActivationTask() {
		return itemActivationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemRearrangementTask() {
		return itemRearrangementTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandInformationTask() {
		return expandInformationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASRErrorCorrectionTask() {
		return asrErrorCorrectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSelectionTask() {
		return textSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProactivityInvocationTask() {
		return proactivityInvocationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpanationExpansionTask() {
		return expanationExpansionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevertAdaptationTask() {
		return revertAdaptationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeTextEntryTask() {
		return freeTextEntryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeEntryTask() {
		return dateTimeEntryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerNumberEntryTask() {
		return integerNumberEntryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedIntegerNumberEntryTask() {
		return boundedIntegerNumberEntryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalNumberEntryTask() {
		return decimalNumberEntryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYesNoSelectionTask() {
		return yesNoSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriStateSelectionTask() {
		return triStateSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemSelectionTask() {
		return listItemSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemMultiSelectionTask() {
		return listItemMultiSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDismissalTask() {
		return messageDismissalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSelectionTask() {
		return objectSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFactory getInputFactory() {
		return (InputFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		primitiveInputTaskEClass = createEClass(PRIMITIVE_INPUT_TASK);

		containerManipulationTaskBaseEClass = createEClass(CONTAINER_MANIPULATION_TASK_BASE);

		selectionTaskBaseEClass = createEClass(SELECTION_TASK_BASE);

		factEntryTaskBaseEClass = createEClass(FACT_ENTRY_TASK_BASE);

		navigationTaskBaseEClass = createEClass(NAVIGATION_TASK_BASE);

		invocationTaskBaseEClass = createEClass(INVOCATION_TASK_BASE);

		adaptationTaskBaseEClass = createEClass(ADAPTATION_TASK_BASE);

		zoomTaskEClass = createEClass(ZOOM_TASK);

		panTaskEClass = createEClass(PAN_TASK);

		scrollTaskEClass = createEClass(SCROLL_TASK);

		intraDocumentNavigationTaskEClass = createEClass(INTRA_DOCUMENT_NAVIGATION_TASK);

		dialogFlowDirectionalNavigationTaskEClass = createEClass(DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK);

		dialogFlowForwardNavigationTaskEClass = createEClass(DIALOG_FLOW_FORWARD_NAVIGATION_TASK);

		dialogFlowBackwardNavigationTaskEClass = createEClass(DIALOG_FLOW_BACKWARD_NAVIGATION_TASK);

		dialogFlowStartNavigationTaskEClass = createEClass(DIALOG_FLOW_START_NAVIGATION_TASK);

		dialogFlowEndNavigationTaskEClass = createEClass(DIALOG_FLOW_END_NAVIGATION_TASK);

		dialogFlowRandomNavigationTaskEClass = createEClass(DIALOG_FLOW_RANDOM_NAVIGATION_TASK);

		dialogFlowCancelNavigationTaskEClass = createEClass(DIALOG_FLOW_CANCEL_NAVIGATION_TASK);

		dialogFlowLabelNavigationTaskEClass = createEClass(DIALOG_FLOW_LABEL_NAVIGATION_TASK);

		commandInvocationTaskEClass = createEClass(COMMAND_INVOCATION_TASK);

		menuInvocationTaskEClass = createEClass(MENU_INVOCATION_TASK);

		itemActivationTaskEClass = createEClass(ITEM_ACTIVATION_TASK);

		itemRearrangementTaskEClass = createEClass(ITEM_REARRANGEMENT_TASK);

		expandInformationTaskEClass = createEClass(EXPAND_INFORMATION_TASK);

		asrErrorCorrectionTaskEClass = createEClass(ASR_ERROR_CORRECTION_TASK);

		textSelectionTaskEClass = createEClass(TEXT_SELECTION_TASK);

		proactivityInvocationTaskEClass = createEClass(PROACTIVITY_INVOCATION_TASK);

		expanationExpansionTaskEClass = createEClass(EXPANATION_EXPANSION_TASK);

		revertAdaptationTaskEClass = createEClass(REVERT_ADAPTATION_TASK);

		freeTextEntryTaskEClass = createEClass(FREE_TEXT_ENTRY_TASK);

		dateTimeEntryTaskEClass = createEClass(DATE_TIME_ENTRY_TASK);

		integerNumberEntryTaskEClass = createEClass(INTEGER_NUMBER_ENTRY_TASK);

		boundedIntegerNumberEntryTaskEClass = createEClass(BOUNDED_INTEGER_NUMBER_ENTRY_TASK);

		decimalNumberEntryTaskEClass = createEClass(DECIMAL_NUMBER_ENTRY_TASK);

		yesNoSelectionTaskEClass = createEClass(YES_NO_SELECTION_TASK);

		triStateSelectionTaskEClass = createEClass(TRI_STATE_SELECTION_TASK);

		listItemSelectionTaskEClass = createEClass(LIST_ITEM_SELECTION_TASK);

		listItemMultiSelectionTaskEClass = createEClass(LIST_ITEM_MULTI_SELECTION_TASK);

		messageDismissalTaskEClass = createEClass(MESSAGE_DISMISSAL_TASK);

		objectSelectionTaskEClass = createEClass(OBJECT_SELECTION_TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		PrimitiveTasksPackage thePrimitiveTasksPackage = (PrimitiveTasksPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI);
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveInputTaskEClass.getESuperTypes().add(thePrimitiveTasksPackage.getPrimitiveTask());
		primitiveInputTaskEClass.getESuperTypes().add(theIoPackage.getInputRepresentation());
		containerManipulationTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		selectionTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		factEntryTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		navigationTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		invocationTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		adaptationTaskBaseEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		zoomTaskEClass.getESuperTypes().add(this.getContainerManipulationTaskBase());
		panTaskEClass.getESuperTypes().add(this.getContainerManipulationTaskBase());
		scrollTaskEClass.getESuperTypes().add(this.getContainerManipulationTaskBase());
		intraDocumentNavigationTaskEClass.getESuperTypes().add(this.getNavigationTaskBase());
		dialogFlowDirectionalNavigationTaskEClass.getESuperTypes().add(this.getNavigationTaskBase());
		dialogFlowForwardNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowDirectionalNavigationTask());
		dialogFlowBackwardNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowDirectionalNavigationTask());
		dialogFlowStartNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowDirectionalNavigationTask());
		dialogFlowEndNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowDirectionalNavigationTask());
		dialogFlowRandomNavigationTaskEClass.getESuperTypes().add(this.getNavigationTaskBase());
		dialogFlowCancelNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowRandomNavigationTask());
		dialogFlowLabelNavigationTaskEClass.getESuperTypes().add(this.getDialogFlowRandomNavigationTask());
		commandInvocationTaskEClass.getESuperTypes().add(this.getInvocationTaskBase());
		menuInvocationTaskEClass.getESuperTypes().add(this.getInvocationTaskBase());
		itemActivationTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());
		itemRearrangementTaskEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		expandInformationTaskEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		asrErrorCorrectionTaskEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		textSelectionTaskEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		proactivityInvocationTaskEClass.getESuperTypes().add(this.getAdaptationTaskBase());
		proactivityInvocationTaskEClass.getESuperTypes().add(this.getInvocationTaskBase());
		expanationExpansionTaskEClass.getESuperTypes().add(this.getAdaptationTaskBase());
		revertAdaptationTaskEClass.getESuperTypes().add(this.getAdaptationTaskBase());
		freeTextEntryTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		dateTimeEntryTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		integerNumberEntryTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		boundedIntegerNumberEntryTaskEClass.getESuperTypes().add(this.getIntegerNumberEntryTask());
		decimalNumberEntryTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		yesNoSelectionTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		yesNoSelectionTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());
		triStateSelectionTaskEClass.getESuperTypes().add(this.getFactEntryTaskBase());
		triStateSelectionTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());
		listItemSelectionTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());
		listItemMultiSelectionTaskEClass.getESuperTypes().add(this.getPrimitiveInputTask());
		messageDismissalTaskEClass.getESuperTypes().add(this.getAdaptationTaskBase());
		objectSelectionTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveInputTaskEClass, PrimitiveInputTask.class, "PrimitiveInputTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerManipulationTaskBaseEClass, ContainerManipulationTaskBase.class, "ContainerManipulationTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionTaskBaseEClass, SelectionTaskBase.class, "SelectionTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factEntryTaskBaseEClass, FactEntryTaskBase.class, "FactEntryTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationTaskBaseEClass, NavigationTaskBase.class, "NavigationTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invocationTaskBaseEClass, InvocationTaskBase.class, "InvocationTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationTaskBaseEClass, AdaptationTaskBase.class, "AdaptationTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zoomTaskEClass, ZoomTask.class, "ZoomTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panTaskEClass, PanTask.class, "PanTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollTaskEClass, ScrollTask.class, "ScrollTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intraDocumentNavigationTaskEClass, IntraDocumentNavigationTask.class, "IntraDocumentNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowDirectionalNavigationTaskEClass, DialogFlowDirectionalNavigationTask.class, "DialogFlowDirectionalNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowForwardNavigationTaskEClass, DialogFlowForwardNavigationTask.class, "DialogFlowForwardNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowBackwardNavigationTaskEClass, DialogFlowBackwardNavigationTask.class, "DialogFlowBackwardNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowStartNavigationTaskEClass, DialogFlowStartNavigationTask.class, "DialogFlowStartNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowEndNavigationTaskEClass, DialogFlowEndNavigationTask.class, "DialogFlowEndNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowRandomNavigationTaskEClass, DialogFlowRandomNavigationTask.class, "DialogFlowRandomNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowCancelNavigationTaskEClass, DialogFlowCancelNavigationTask.class, "DialogFlowCancelNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogFlowLabelNavigationTaskEClass, DialogFlowLabelNavigationTask.class, "DialogFlowLabelNavigationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandInvocationTaskEClass, CommandInvocationTask.class, "CommandInvocationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuInvocationTaskEClass, MenuInvocationTask.class, "MenuInvocationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemActivationTaskEClass, ItemActivationTask.class, "ItemActivationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemRearrangementTaskEClass, ItemRearrangementTask.class, "ItemRearrangementTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expandInformationTaskEClass, ExpandInformationTask.class, "ExpandInformationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asrErrorCorrectionTaskEClass, ASRErrorCorrectionTask.class, "ASRErrorCorrectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textSelectionTaskEClass, TextSelectionTask.class, "TextSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proactivityInvocationTaskEClass, ProactivityInvocationTask.class, "ProactivityInvocationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expanationExpansionTaskEClass, ExpanationExpansionTask.class, "ExpanationExpansionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(revertAdaptationTaskEClass, RevertAdaptationTask.class, "RevertAdaptationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(freeTextEntryTaskEClass, FreeTextEntryTask.class, "FreeTextEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTimeEntryTaskEClass, DateTimeEntryTask.class, "DateTimeEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerNumberEntryTaskEClass, IntegerNumberEntryTask.class, "IntegerNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundedIntegerNumberEntryTaskEClass, BoundedIntegerNumberEntryTask.class, "BoundedIntegerNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalNumberEntryTaskEClass, DecimalNumberEntryTask.class, "DecimalNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yesNoSelectionTaskEClass, YesNoSelectionTask.class, "YesNoSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triStateSelectionTaskEClass, TriStateSelectionTask.class, "TriStateSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemSelectionTaskEClass, ListItemSelectionTask.class, "ListItemSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemMultiSelectionTaskEClass, ListItemMultiSelectionTask.class, "ListItemMultiSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageDismissalTaskEClass, MessageDismissalTask.class, "MessageDismissalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSelectionTaskEClass, ObjectSelectionTask.class, "ObjectSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //InputPackageImpl
