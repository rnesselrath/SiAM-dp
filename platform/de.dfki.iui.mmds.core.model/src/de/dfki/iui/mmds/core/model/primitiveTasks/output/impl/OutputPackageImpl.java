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
package de.dfki.iui.mmds.core.model.primitiveTasks.output.impl;

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

import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl;

import de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationIndicationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.CommandSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.DateTimeEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.DecimalNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.DocumentPresentationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.FactEntryTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.FreeTextEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.IntegerNumberEntryTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemMultiSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.LongListItemSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ManipulableImageTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.MenuItemSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageDismissalTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ObjectSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.PrimitiveOutputTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.ShortItemSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.TriStateSelectionTask;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.YesNoSelectionTask;

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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputPackageImpl extends EPackageImpl implements OutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveOutputTaskEClass = null;

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
	private EClass adaptationTaskBaseEClass = null;

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
	private EClass messageTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentPresentationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressIndicationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationIndicationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manipulableImageTaskEClass = null;

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
	private EClass longListItemSelectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortItemSelectionTaskEClass = null;

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
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OutputPackageImpl() {
		super(eNS_URI, OutputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OutputPackage init() {
		if (isInited) return (OutputPackage)EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI);

		// Obtain or create and register package
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OutputPackageImpl());

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
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) : ProjectPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theOutputPackage.createPackageContents();
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
		theInputPackage.createPackageContents();
		theProjectPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theSpeechSynthesisPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theOutputPackage.initializePackageContents();
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
		theInputPackage.initializePackageContents();
		theProjectPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theSpeechSynthesisPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOutputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OutputPackage.eNS_URI, theOutputPackage);
		return theOutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveOutputTask() {
		return primitiveOutputTaskEClass;
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
	public EAttribute getSelectionTaskBase_Item() {
		return (EAttribute)selectionTaskBaseEClass.getEStructuralFeatures().get(0);
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
	public EClass getFactEntryTaskBase() {
		return factEntryTaskBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTask() {
		return messageTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentPresentationTask() {
		return documentPresentationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandSelectionTask() {
		return commandSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItemSelectionTask() {
		return menuItemSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressIndicationTask() {
		return progressIndicationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressIndicationTask_Progress() {
		return (EAttribute)progressIndicationTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationIndicationTask() {
		return adaptationIndicationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManipulableImageTask() {
		return manipulableImageTaskEClass;
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
	public EAttribute getBoundedIntegerNumberEntryTask_Min() {
		return (EAttribute)boundedIntegerNumberEntryTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedIntegerNumberEntryTask_Max() {
		return (EAttribute)boundedIntegerNumberEntryTaskEClass.getEStructuralFeatures().get(1);
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
	public EReference getListItemSelectionTask_ListItem() {
		return (EReference)listItemSelectionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongListItemSelectionTask() {
		return longListItemSelectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortItemSelectionTask() {
		return shortItemSelectionTaskEClass;
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
	public OutputFactory getOutputFactory() {
		return (OutputFactory)getEFactoryInstance();
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
		primitiveOutputTaskEClass = createEClass(PRIMITIVE_OUTPUT_TASK);

		selectionTaskBaseEClass = createEClass(SELECTION_TASK_BASE);
		createEAttribute(selectionTaskBaseEClass, SELECTION_TASK_BASE__ITEM);

		adaptationTaskBaseEClass = createEClass(ADAPTATION_TASK_BASE);

		factEntryTaskBaseEClass = createEClass(FACT_ENTRY_TASK_BASE);

		messageTaskEClass = createEClass(MESSAGE_TASK);

		documentPresentationTaskEClass = createEClass(DOCUMENT_PRESENTATION_TASK);

		commandSelectionTaskEClass = createEClass(COMMAND_SELECTION_TASK);

		menuItemSelectionTaskEClass = createEClass(MENU_ITEM_SELECTION_TASK);

		progressIndicationTaskEClass = createEClass(PROGRESS_INDICATION_TASK);
		createEAttribute(progressIndicationTaskEClass, PROGRESS_INDICATION_TASK__PROGRESS);

		adaptationIndicationTaskEClass = createEClass(ADAPTATION_INDICATION_TASK);

		manipulableImageTaskEClass = createEClass(MANIPULABLE_IMAGE_TASK);

		freeTextEntryTaskEClass = createEClass(FREE_TEXT_ENTRY_TASK);

		dateTimeEntryTaskEClass = createEClass(DATE_TIME_ENTRY_TASK);

		integerNumberEntryTaskEClass = createEClass(INTEGER_NUMBER_ENTRY_TASK);

		boundedIntegerNumberEntryTaskEClass = createEClass(BOUNDED_INTEGER_NUMBER_ENTRY_TASK);
		createEAttribute(boundedIntegerNumberEntryTaskEClass, BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MIN);
		createEAttribute(boundedIntegerNumberEntryTaskEClass, BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MAX);

		decimalNumberEntryTaskEClass = createEClass(DECIMAL_NUMBER_ENTRY_TASK);

		yesNoSelectionTaskEClass = createEClass(YES_NO_SELECTION_TASK);

		triStateSelectionTaskEClass = createEClass(TRI_STATE_SELECTION_TASK);

		listItemSelectionTaskEClass = createEClass(LIST_ITEM_SELECTION_TASK);
		createEReference(listItemSelectionTaskEClass, LIST_ITEM_SELECTION_TASK__LIST_ITEM);

		longListItemSelectionTaskEClass = createEClass(LONG_LIST_ITEM_SELECTION_TASK);

		shortItemSelectionTaskEClass = createEClass(SHORT_ITEM_SELECTION_TASK);

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
		InputPackage theInputPackage = (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveOutputTaskEClass.getESuperTypes().add(thePrimitiveTasksPackage.getPrimitiveTask());
		primitiveOutputTaskEClass.getESuperTypes().add(theIoPackage.getOutputRepresentation());
		selectionTaskBaseEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		adaptationTaskBaseEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		factEntryTaskBaseEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		messageTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		documentPresentationTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		commandSelectionTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		menuItemSelectionTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		progressIndicationTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		adaptationIndicationTaskEClass.getESuperTypes().add(theInputPackage.getAdaptationTaskBase());
		manipulableImageTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		freeTextEntryTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		dateTimeEntryTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		integerNumberEntryTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		boundedIntegerNumberEntryTaskEClass.getESuperTypes().add(theInputPackage.getBoundedIntegerNumberEntryTask());
		decimalNumberEntryTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		yesNoSelectionTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		yesNoSelectionTaskEClass.getESuperTypes().add(theInputPackage.getSelectionTaskBase());
		triStateSelectionTaskEClass.getESuperTypes().add(theInputPackage.getFactEntryTaskBase());
		triStateSelectionTaskEClass.getESuperTypes().add(theInputPackage.getSelectionTaskBase());
		listItemSelectionTaskEClass.getESuperTypes().add(this.getSelectionTaskBase());
		longListItemSelectionTaskEClass.getESuperTypes().add(theInputPackage.getListItemSelectionTask());
		shortItemSelectionTaskEClass.getESuperTypes().add(theInputPackage.getListItemSelectionTask());
		listItemMultiSelectionTaskEClass.getESuperTypes().add(this.getPrimitiveOutputTask());
		messageDismissalTaskEClass.getESuperTypes().add(theInputPackage.getAdaptationTaskBase());
		objectSelectionTaskEClass.getESuperTypes().add(theInputPackage.getSelectionTaskBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveOutputTaskEClass, PrimitiveOutputTask.class, "PrimitiveOutputTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionTaskBaseEClass, SelectionTaskBase.class, "SelectionTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionTaskBase_Item(), ecorePackage.getEString(), "item", null, 0, 1, SelectionTaskBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationTaskBaseEClass, AdaptationTaskBase.class, "AdaptationTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factEntryTaskBaseEClass, FactEntryTaskBase.class, "FactEntryTaskBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageTaskEClass, MessageTask.class, "MessageTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentPresentationTaskEClass, DocumentPresentationTask.class, "DocumentPresentationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandSelectionTaskEClass, CommandSelectionTask.class, "CommandSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuItemSelectionTaskEClass, MenuItemSelectionTask.class, "MenuItemSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(progressIndicationTaskEClass, ProgressIndicationTask.class, "ProgressIndicationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressIndicationTask_Progress(), ecorePackage.getEFloat(), "progress", null, 0, 1, ProgressIndicationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationIndicationTaskEClass, AdaptationIndicationTask.class, "AdaptationIndicationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manipulableImageTaskEClass, ManipulableImageTask.class, "ManipulableImageTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(freeTextEntryTaskEClass, FreeTextEntryTask.class, "FreeTextEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTimeEntryTaskEClass, DateTimeEntryTask.class, "DateTimeEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerNumberEntryTaskEClass, IntegerNumberEntryTask.class, "IntegerNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundedIntegerNumberEntryTaskEClass, BoundedIntegerNumberEntryTask.class, "BoundedIntegerNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedIntegerNumberEntryTask_Min(), ecorePackage.getEInt(), "min", null, 0, 1, BoundedIntegerNumberEntryTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedIntegerNumberEntryTask_Max(), ecorePackage.getEInt(), "max", null, 0, 1, BoundedIntegerNumberEntryTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalNumberEntryTaskEClass, DecimalNumberEntryTask.class, "DecimalNumberEntryTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yesNoSelectionTaskEClass, YesNoSelectionTask.class, "YesNoSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triStateSelectionTaskEClass, TriStateSelectionTask.class, "TriStateSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemSelectionTaskEClass, ListItemSelectionTask.class, "ListItemSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListItemSelectionTask_ListItem(), thePrimitiveTasksPackage.getListItem(), null, "listItem", null, 0, -1, ListItemSelectionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longListItemSelectionTaskEClass, LongListItemSelectionTask.class, "LongListItemSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shortItemSelectionTaskEClass, ShortItemSelectionTask.class, "ShortItemSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemMultiSelectionTaskEClass, ListItemMultiSelectionTask.class, "ListItemMultiSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageDismissalTaskEClass, MessageDismissalTask.class, "MessageDismissalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSelectionTaskEClass, ObjectSelectionTask.class, "ObjectSelectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //OutputPackageImpl
