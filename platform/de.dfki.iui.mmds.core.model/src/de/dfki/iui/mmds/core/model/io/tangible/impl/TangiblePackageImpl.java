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
package de.dfki.iui.mmds.core.model.io.tangible.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
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
import de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput;
import de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput;
import de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput;
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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TangiblePackageImpl extends EPackageImpl implements TangiblePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tangibleInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtonInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleButtonInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyboardInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnDialFiniteDiscreteInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnDialFiniteContinuousInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnDialInfiniteDiscreteInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnDialInfiniteContinuousInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joystick2DInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joystick3DInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwareTypesEEnum = null;

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
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TangiblePackageImpl() {
		super(eNS_URI, TangibleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TangiblePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TangiblePackage init() {
		if (isInited) return (TangiblePackage)EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI);

		// Obtain or create and register package
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TangiblePackageImpl());

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
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) : OutputPackage.eINSTANCE);
		ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) : ProjectPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theTangiblePackage.createPackageContents();
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
		theOutputPackage.createPackageContents();
		theProjectPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theSpeechSynthesisPackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theTangiblePackage.initializePackageContents();
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
		theOutputPackage.initializePackageContents();
		theProjectPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theSpeechSynthesisPackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTangiblePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TangiblePackage.eNS_URI, theTangiblePackage);
		return theTangiblePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTangibleInput() {
		return tangibleInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTangibleInput_HardwareID() {
		return (EAttribute)tangibleInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTangibleInput_HardwareType() {
		return (EAttribute)tangibleInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTangibleInput_HardwareFriendlyName() {
		return (EAttribute)tangibleInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButtonInput() {
		return pushButtonInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButtonInput_IsPressed() {
		return (EAttribute)pushButtonInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButtonInput_CanNotifyRelease() {
		return (EAttribute)pushButtonInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleButtonInput() {
		return toggleButtonInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleButtonInput_IsPressed() {
		return (EAttribute)toggleButtonInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyboardInput() {
		return keyboardInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInput_Key() {
		return (EAttribute)keyboardInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInput_IsPressed() {
		return (EAttribute)keyboardInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInput_CanNotifyRelease() {
		return (EAttribute)keyboardInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnDialFiniteDiscreteInput() {
		return turnDialFiniteDiscreteInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteDiscreteInput_Min() {
		return (EAttribute)turnDialFiniteDiscreteInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteDiscreteInput_Max() {
		return (EAttribute)turnDialFiniteDiscreteInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteDiscreteInput_Value() {
		return (EAttribute)turnDialFiniteDiscreteInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnDialFiniteContinuousInput() {
		return turnDialFiniteContinuousInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteContinuousInput_Min() {
		return (EAttribute)turnDialFiniteContinuousInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteContinuousInput_Max() {
		return (EAttribute)turnDialFiniteContinuousInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialFiniteContinuousInput_Value() {
		return (EAttribute)turnDialFiniteContinuousInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnDialInfiniteDiscreteInput() {
		return turnDialInfiniteDiscreteInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialInfiniteDiscreteInput_Delta() {
		return (EAttribute)turnDialInfiniteDiscreteInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnDialInfiniteContinuousInput() {
		return turnDialInfiniteContinuousInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDialInfiniteContinuousInput_Delta() {
		return (EAttribute)turnDialInfiniteContinuousInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoystick2DInput() {
		return joystick2DInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoystick2DInput_X() {
		return (EAttribute)joystick2DInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoystick2DInput_Y() {
		return (EAttribute)joystick2DInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoystick3DInput() {
		return joystick3DInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoystick3DInput_X() {
		return (EAttribute)joystick3DInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoystick3DInput_Y() {
		return (EAttribute)joystick3DInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoystick3DInput_Z() {
		return (EAttribute)joystick3DInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardwareTypes() {
		return hardwareTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TangibleFactory getTangibleFactory() {
		return (TangibleFactory)getEFactoryInstance();
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
		tangibleInputEClass = createEClass(TANGIBLE_INPUT);
		createEAttribute(tangibleInputEClass, TANGIBLE_INPUT__HARDWARE_ID);
		createEAttribute(tangibleInputEClass, TANGIBLE_INPUT__HARDWARE_TYPE);
		createEAttribute(tangibleInputEClass, TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME);

		pushButtonInputEClass = createEClass(PUSH_BUTTON_INPUT);
		createEAttribute(pushButtonInputEClass, PUSH_BUTTON_INPUT__IS_PRESSED);
		createEAttribute(pushButtonInputEClass, PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE);

		toggleButtonInputEClass = createEClass(TOGGLE_BUTTON_INPUT);
		createEAttribute(toggleButtonInputEClass, TOGGLE_BUTTON_INPUT__IS_PRESSED);

		keyboardInputEClass = createEClass(KEYBOARD_INPUT);
		createEAttribute(keyboardInputEClass, KEYBOARD_INPUT__KEY);
		createEAttribute(keyboardInputEClass, KEYBOARD_INPUT__IS_PRESSED);
		createEAttribute(keyboardInputEClass, KEYBOARD_INPUT__CAN_NOTIFY_RELEASE);

		turnDialFiniteDiscreteInputEClass = createEClass(TURN_DIAL_FINITE_DISCRETE_INPUT);
		createEAttribute(turnDialFiniteDiscreteInputEClass, TURN_DIAL_FINITE_DISCRETE_INPUT__MIN);
		createEAttribute(turnDialFiniteDiscreteInputEClass, TURN_DIAL_FINITE_DISCRETE_INPUT__MAX);
		createEAttribute(turnDialFiniteDiscreteInputEClass, TURN_DIAL_FINITE_DISCRETE_INPUT__VALUE);

		turnDialFiniteContinuousInputEClass = createEClass(TURN_DIAL_FINITE_CONTINUOUS_INPUT);
		createEAttribute(turnDialFiniteContinuousInputEClass, TURN_DIAL_FINITE_CONTINUOUS_INPUT__MIN);
		createEAttribute(turnDialFiniteContinuousInputEClass, TURN_DIAL_FINITE_CONTINUOUS_INPUT__MAX);
		createEAttribute(turnDialFiniteContinuousInputEClass, TURN_DIAL_FINITE_CONTINUOUS_INPUT__VALUE);

		turnDialInfiniteDiscreteInputEClass = createEClass(TURN_DIAL_INFINITE_DISCRETE_INPUT);
		createEAttribute(turnDialInfiniteDiscreteInputEClass, TURN_DIAL_INFINITE_DISCRETE_INPUT__DELTA);

		turnDialInfiniteContinuousInputEClass = createEClass(TURN_DIAL_INFINITE_CONTINUOUS_INPUT);
		createEAttribute(turnDialInfiniteContinuousInputEClass, TURN_DIAL_INFINITE_CONTINUOUS_INPUT__DELTA);

		joystick2DInputEClass = createEClass(JOYSTICK2_DINPUT);
		createEAttribute(joystick2DInputEClass, JOYSTICK2_DINPUT__X);
		createEAttribute(joystick2DInputEClass, JOYSTICK2_DINPUT__Y);

		joystick3DInputEClass = createEClass(JOYSTICK3_DINPUT);
		createEAttribute(joystick3DInputEClass, JOYSTICK3_DINPUT__X);
		createEAttribute(joystick3DInputEClass, JOYSTICK3_DINPUT__Y);
		createEAttribute(joystick3DInputEClass, JOYSTICK3_DINPUT__Z);

		// Create enums
		hardwareTypesEEnum = createEEnum(HARDWARE_TYPES);
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
		Io_interfacesPackage theIo_interfacesPackage = (Io_interfacesPackage)EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tangibleInputEClass.getESuperTypes().add(theIo_interfacesPackage.getControllerInput());
		pushButtonInputEClass.getESuperTypes().add(this.getTangibleInput());
		toggleButtonInputEClass.getESuperTypes().add(this.getTangibleInput());
		keyboardInputEClass.getESuperTypes().add(this.getTangibleInput());
		turnDialFiniteDiscreteInputEClass.getESuperTypes().add(this.getTangibleInput());
		turnDialFiniteContinuousInputEClass.getESuperTypes().add(this.getTangibleInput());
		turnDialInfiniteDiscreteInputEClass.getESuperTypes().add(this.getTangibleInput());
		turnDialInfiniteContinuousInputEClass.getESuperTypes().add(this.getTangibleInput());
		joystick2DInputEClass.getESuperTypes().add(this.getTangibleInput());
		joystick3DInputEClass.getESuperTypes().add(this.getTangibleInput());

		// Initialize classes, features, and operations; add parameters
		initEClass(tangibleInputEClass, TangibleInput.class, "TangibleInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTangibleInput_HardwareID(), ecorePackage.getEString(), "hardwareID", null, 0, 1, TangibleInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTangibleInput_HardwareType(), this.getHardwareTypes(), "hardwareType", null, 0, 1, TangibleInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTangibleInput_HardwareFriendlyName(), ecorePackage.getEString(), "hardwareFriendlyName", null, 0, 1, TangibleInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushButtonInputEClass, PushButtonInput.class, "PushButtonInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPushButtonInput_IsPressed(), ecorePackage.getEBoolean(), "isPressed", null, 0, 1, PushButtonInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushButtonInput_CanNotifyRelease(), ecorePackage.getEBoolean(), "canNotifyRelease", null, 0, 1, PushButtonInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleButtonInputEClass, ToggleButtonInput.class, "ToggleButtonInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleButtonInput_IsPressed(), ecorePackage.getEBoolean(), "isPressed", null, 0, 1, ToggleButtonInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyboardInputEClass, KeyboardInput.class, "KeyboardInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyboardInput_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyboardInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboardInput_IsPressed(), ecorePackage.getEBoolean(), "isPressed", null, 0, 1, KeyboardInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboardInput_CanNotifyRelease(), ecorePackage.getEBoolean(), "canNotifyRelease", null, 0, 1, KeyboardInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnDialFiniteDiscreteInputEClass, TurnDialFiniteDiscreteInput.class, "TurnDialFiniteDiscreteInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnDialFiniteDiscreteInput_Min(), ecorePackage.getEInt(), "min", null, 0, 1, TurnDialFiniteDiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnDialFiniteDiscreteInput_Max(), ecorePackage.getEInt(), "max", null, 0, 1, TurnDialFiniteDiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnDialFiniteDiscreteInput_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TurnDialFiniteDiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnDialFiniteContinuousInputEClass, TurnDialFiniteContinuousInput.class, "TurnDialFiniteContinuousInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnDialFiniteContinuousInput_Min(), ecorePackage.getEFloat(), "min", null, 0, 1, TurnDialFiniteContinuousInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnDialFiniteContinuousInput_Max(), ecorePackage.getEFloat(), "max", null, 0, 1, TurnDialFiniteContinuousInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnDialFiniteContinuousInput_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, TurnDialFiniteContinuousInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnDialInfiniteDiscreteInputEClass, TurnDialInfiniteDiscreteInput.class, "TurnDialInfiniteDiscreteInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnDialInfiniteDiscreteInput_Delta(), ecorePackage.getEInt(), "delta", null, 0, 1, TurnDialInfiniteDiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnDialInfiniteContinuousInputEClass, TurnDialInfiniteContinuousInput.class, "TurnDialInfiniteContinuousInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnDialInfiniteContinuousInput_Delta(), ecorePackage.getEFloat(), "delta", null, 0, 1, TurnDialInfiniteContinuousInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joystick2DInputEClass, Joystick2DInput.class, "Joystick2DInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoystick2DInput_X(), ecorePackage.getEFloat(), "x", null, 0, 1, Joystick2DInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoystick2DInput_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, Joystick2DInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joystick3DInputEClass, Joystick3DInput.class, "Joystick3DInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoystick3DInput_X(), ecorePackage.getEFloat(), "x", null, 0, 1, Joystick3DInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoystick3DInput_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, Joystick3DInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoystick3DInput_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, Joystick3DInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hardwareTypesEEnum, HardwareTypes.class, "HardwareTypes");
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.PUSH_BUTTON);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.DIAL);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.SLIDER);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.FLIP_SWITCH);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.KEYBOARD);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.CONTACT_BUTTON);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.JOYSTICK);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.SCROLL_WHEEL);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.PEDAL);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.STEERING_WHEEL);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.TRISTATE_FLIP_SWITCH);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.FOUR_WAY_BUTTON);
		addEEnumLiteral(hardwareTypesEEnum, HardwareTypes.TOUCH_PAD);

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

} //TangiblePackageImpl
