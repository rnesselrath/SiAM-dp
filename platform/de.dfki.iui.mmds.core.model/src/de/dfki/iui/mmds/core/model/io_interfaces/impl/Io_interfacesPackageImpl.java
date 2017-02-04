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
package de.dfki.iui.mmds.core.model.io_interfaces.impl;

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

import de.dfki.iui.mmds.core.model.io_interfaces.AcousticEvent;
import de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput;
import de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack;
import de.dfki.iui.mmds.core.model.io_interfaces.BodyGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.Camera;
import de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput;
import de.dfki.iui.mmds.core.model.io_interfaces.EyeData;
import de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze;
import de.dfki.iui.mmds.core.model.io_interfaces.Gesture;
import de.dfki.iui.mmds.core.model.io_interfaces.HandGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.LampControl;
import de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture;
import de.dfki.iui.mmds.core.model.io_interfaces.PulseMonitor;
import de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput;
import de.dfki.iui.mmds.core.model.io_interfaces.SensorInput;
import de.dfki.iui.mmds.core.model.io_interfaces.Speech;
import de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures;
import de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem;
import de.dfki.iui.mmds.core.model.io_interfaces.SpeechSynthesis;
import de.dfki.iui.mmds.core.model.io_interfaces.Tangible;
import de.dfki.iui.mmds.core.model.io_interfaces.Thermometer;
import de.dfki.iui.mmds.core.model.io_interfaces.VentilatorControl;
import de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter;
import de.dfki.iui.mmds.core.model.io_interfaces.Word;

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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Io_interfacesPackageImpl extends EPackageImpl implements Io_interfacesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rendererOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acousticEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handGestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyGestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eyeGazeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headGestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointingGestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSpeechSynthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechSynthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualCharacterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eyeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thermometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pulseMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lampControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ventilatorControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tangibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speechRecognitionProblemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameraEEnum = null;

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
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Io_interfacesPackageImpl() {
		super(eNS_URI, Io_interfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Io_interfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Io_interfacesPackage init() {
		if (isInited) return (Io_interfacesPackage)EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI);

		// Obtain or create and register package
		Io_interfacesPackageImpl theIo_interfacesPackage = (Io_interfacesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Io_interfacesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Io_interfacesPackageImpl());

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
		GuiPackageImpl theGuiPackage = (GuiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) instanceof GuiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) : GuiPackage.eINSTANCE);
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
		theIo_interfacesPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theGrammar_rulesPackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();
		theGuiPackage.createPackageContents();
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
		theIo_interfacesPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theGrammar_rulesPackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();
		theGuiPackage.initializePackageContents();
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
		theIo_interfacesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Io_interfacesPackage.eNS_URI, theIo_interfacesPackage);
		return theIo_interfacesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorInput() {
		return sensorInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerInput() {
		return controllerInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRendererOutput() {
		return rendererOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorOutput() {
		return actuatorOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcousticEvent() {
		return acousticEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGesture() {
		return gestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandGesture() {
		return handGestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_FingersLeft() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_FingersRight() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_LevelLeft() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_LevelRight() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_Gesture() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandGesture_GestureDirection() {
		return (EAttribute)handGestureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyGesture() {
		return bodyGestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEyeGaze() {
		return eyeGazeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEyeGaze_LeftEye() {
		return (EReference)eyeGazeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEyeGaze_RightEye() {
		return (EReference)eyeGazeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadGesture() {
		return headGestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadGesture_CommonGesture() {
		return (EAttribute)headGestureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadGesture_Pitch() {
		return (EAttribute)headGestureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadGesture_Distance() {
		return (EAttribute)headGestureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadGesture_Yaw() {
		return (EAttribute)headGestureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadGesture_Roll() {
		return (EAttribute)headGestureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointingGesture() {
		return pointingGestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointingGesture_Coordinate() {
		return (EReference)pointingGestureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeech() {
		return speechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeech_Words() {
		return (EReference)speechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeech_Utterance() {
		return (EAttribute)speechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeech_SignalUri() {
		return (EAttribute)speechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeech_Problem() {
		return (EAttribute)speechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISpeechSynthesis() {
		return iSpeechSynthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechSynthesis() {
		return speechSynthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechSynthesis_Utterance() {
		return (EAttribute)speechSynthesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioTrack() {
		return audioTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioTrack_TrackId() {
		return (EAttribute)audioTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioTrack_Uri() {
		return (EAttribute)audioTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualCharacter() {
		return virtualCharacterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualCharacter_Utterance() {
		return (EAttribute)virtualCharacterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualCharacter_AvatarId() {
		return (EAttribute)virtualCharacterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualCharacter_Camera() {
		return (EAttribute)virtualCharacterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualCharacter_Bml() {
		return (EAttribute)virtualCharacterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEyeData() {
		return eyeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_GazePosX() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_GazePosY() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_CameraPosX() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_CameraPosY() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_PupilDiameter() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_Distance() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEyeData_ConfusionConfidence() {
		return (EAttribute)eyeDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWord() {
		return wordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_Confidence() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_Phonemes() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_Text() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_LexicalForm() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_BeginTime() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_EndTime() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThermometer() {
		return thermometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThermometer_Temperature() {
		return (EAttribute)thermometerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThermometer_Unit() {
		return (EAttribute)thermometerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPulseMonitor() {
		return pulseMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPulseMonitor_Pulse() {
		return (EAttribute)pulseMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLampControl() {
		return lampControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLampControl_OnState() {
		return (EAttribute)lampControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLampControl_Color() {
		return (EAttribute)lampControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVentilatorControl() {
		return ventilatorControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVentilatorControl_Level() {
		return (EAttribute)ventilatorControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTangible() {
		return tangibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechFeatures() {
		return speechFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechFeatures_SpearkingRate() {
		return (EAttribute)speechFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechFeatures_Intensity() {
		return (EAttribute)speechFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechFeatures_Pitch() {
		return (EAttribute)speechFeaturesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpeechRecognitionProblem() {
		return speechRecognitionProblemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCamera() {
		return cameraEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Io_interfacesFactory getIo_interfacesFactory() {
		return (Io_interfacesFactory)getEFactoryInstance();
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
		sensorInputEClass = createEClass(SENSOR_INPUT);

		controllerInputEClass = createEClass(CONTROLLER_INPUT);

		rendererOutputEClass = createEClass(RENDERER_OUTPUT);

		actuatorOutputEClass = createEClass(ACTUATOR_OUTPUT);

		acousticEventEClass = createEClass(ACOUSTIC_EVENT);

		gestureEClass = createEClass(GESTURE);

		handGestureEClass = createEClass(HAND_GESTURE);
		createEAttribute(handGestureEClass, HAND_GESTURE__FINGERS_LEFT);
		createEAttribute(handGestureEClass, HAND_GESTURE__FINGERS_RIGHT);
		createEAttribute(handGestureEClass, HAND_GESTURE__LEVEL_LEFT);
		createEAttribute(handGestureEClass, HAND_GESTURE__LEVEL_RIGHT);
		createEAttribute(handGestureEClass, HAND_GESTURE__GESTURE);
		createEAttribute(handGestureEClass, HAND_GESTURE__GESTURE_DIRECTION);

		bodyGestureEClass = createEClass(BODY_GESTURE);

		eyeGazeEClass = createEClass(EYE_GAZE);
		createEReference(eyeGazeEClass, EYE_GAZE__LEFT_EYE);
		createEReference(eyeGazeEClass, EYE_GAZE__RIGHT_EYE);

		headGestureEClass = createEClass(HEAD_GESTURE);
		createEAttribute(headGestureEClass, HEAD_GESTURE__COMMON_GESTURE);
		createEAttribute(headGestureEClass, HEAD_GESTURE__PITCH);
		createEAttribute(headGestureEClass, HEAD_GESTURE__DISTANCE);
		createEAttribute(headGestureEClass, HEAD_GESTURE__YAW);
		createEAttribute(headGestureEClass, HEAD_GESTURE__ROLL);

		pointingGestureEClass = createEClass(POINTING_GESTURE);
		createEReference(pointingGestureEClass, POINTING_GESTURE__COORDINATE);

		speechEClass = createEClass(SPEECH);
		createEReference(speechEClass, SPEECH__WORDS);
		createEAttribute(speechEClass, SPEECH__UTTERANCE);
		createEAttribute(speechEClass, SPEECH__SIGNAL_URI);
		createEAttribute(speechEClass, SPEECH__PROBLEM);

		iSpeechSynthesisEClass = createEClass(ISPEECH_SYNTHESIS);

		speechSynthesisEClass = createEClass(SPEECH_SYNTHESIS);
		createEAttribute(speechSynthesisEClass, SPEECH_SYNTHESIS__UTTERANCE);

		audioTrackEClass = createEClass(AUDIO_TRACK);
		createEAttribute(audioTrackEClass, AUDIO_TRACK__TRACK_ID);
		createEAttribute(audioTrackEClass, AUDIO_TRACK__URI);

		virtualCharacterEClass = createEClass(VIRTUAL_CHARACTER);
		createEAttribute(virtualCharacterEClass, VIRTUAL_CHARACTER__UTTERANCE);
		createEAttribute(virtualCharacterEClass, VIRTUAL_CHARACTER__AVATAR_ID);
		createEAttribute(virtualCharacterEClass, VIRTUAL_CHARACTER__CAMERA);
		createEAttribute(virtualCharacterEClass, VIRTUAL_CHARACTER__BML);

		eyeDataEClass = createEClass(EYE_DATA);
		createEAttribute(eyeDataEClass, EYE_DATA__GAZE_POS_X);
		createEAttribute(eyeDataEClass, EYE_DATA__GAZE_POS_Y);
		createEAttribute(eyeDataEClass, EYE_DATA__CAMERA_POS_X);
		createEAttribute(eyeDataEClass, EYE_DATA__CAMERA_POS_Y);
		createEAttribute(eyeDataEClass, EYE_DATA__PUPIL_DIAMETER);
		createEAttribute(eyeDataEClass, EYE_DATA__DISTANCE);
		createEAttribute(eyeDataEClass, EYE_DATA__CONFUSION_CONFIDENCE);

		wordEClass = createEClass(WORD);
		createEAttribute(wordEClass, WORD__CONFIDENCE);
		createEAttribute(wordEClass, WORD__PHONEMES);
		createEAttribute(wordEClass, WORD__TEXT);
		createEAttribute(wordEClass, WORD__LEXICAL_FORM);
		createEAttribute(wordEClass, WORD__BEGIN_TIME);
		createEAttribute(wordEClass, WORD__END_TIME);

		thermometerEClass = createEClass(THERMOMETER);
		createEAttribute(thermometerEClass, THERMOMETER__TEMPERATURE);
		createEAttribute(thermometerEClass, THERMOMETER__UNIT);

		pulseMonitorEClass = createEClass(PULSE_MONITOR);
		createEAttribute(pulseMonitorEClass, PULSE_MONITOR__PULSE);

		lampControlEClass = createEClass(LAMP_CONTROL);
		createEAttribute(lampControlEClass, LAMP_CONTROL__ON_STATE);
		createEAttribute(lampControlEClass, LAMP_CONTROL__COLOR);

		ventilatorControlEClass = createEClass(VENTILATOR_CONTROL);
		createEAttribute(ventilatorControlEClass, VENTILATOR_CONTROL__LEVEL);

		tangibleEClass = createEClass(TANGIBLE);

		speechFeaturesEClass = createEClass(SPEECH_FEATURES);
		createEAttribute(speechFeaturesEClass, SPEECH_FEATURES__SPEARKING_RATE);
		createEAttribute(speechFeaturesEClass, SPEECH_FEATURES__INTENSITY);
		createEAttribute(speechFeaturesEClass, SPEECH_FEATURES__PITCH);

		// Create enums
		speechRecognitionProblemEEnum = createEEnum(SPEECH_RECOGNITION_PROBLEM);
		cameraEEnum = createEEnum(CAMERA);
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
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorInputEClass.getESuperTypes().add(theIoPackage.getInputRepresentation());
		controllerInputEClass.getESuperTypes().add(theIoPackage.getInputRepresentation());
		rendererOutputEClass.getESuperTypes().add(theIoPackage.getOutputRepresentation());
		actuatorOutputEClass.getESuperTypes().add(theIoPackage.getOutputRepresentation());
		acousticEventEClass.getESuperTypes().add(this.getControllerInput());
		gestureEClass.getESuperTypes().add(this.getControllerInput());
		handGestureEClass.getESuperTypes().add(this.getGesture());
		bodyGestureEClass.getESuperTypes().add(this.getGesture());
		eyeGazeEClass.getESuperTypes().add(this.getControllerInput());
		headGestureEClass.getESuperTypes().add(this.getGesture());
		pointingGestureEClass.getESuperTypes().add(this.getGesture());
		speechEClass.getESuperTypes().add(this.getControllerInput());
		iSpeechSynthesisEClass.getESuperTypes().add(this.getRendererOutput());
		speechSynthesisEClass.getESuperTypes().add(this.getISpeechSynthesis());
		audioTrackEClass.getESuperTypes().add(this.getRendererOutput());
		virtualCharacterEClass.getESuperTypes().add(this.getRendererOutput());
		eyeDataEClass.getESuperTypes().add(theBasePackage.getBObject());
		wordEClass.getESuperTypes().add(theBasePackage.getBObject());
		thermometerEClass.getESuperTypes().add(this.getSensorInput());
		pulseMonitorEClass.getESuperTypes().add(this.getSensorInput());
		lampControlEClass.getESuperTypes().add(this.getActuatorOutput());
		ventilatorControlEClass.getESuperTypes().add(this.getActuatorOutput());
		tangibleEClass.getESuperTypes().add(this.getControllerInput());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorInputEClass, SensorInput.class, "SensorInput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerInputEClass, ControllerInput.class, "ControllerInput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rendererOutputEClass, RendererOutput.class, "RendererOutput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorOutputEClass, ActuatorOutput.class, "ActuatorOutput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acousticEventEClass, AcousticEvent.class, "AcousticEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gestureEClass, Gesture.class, "Gesture", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handGestureEClass, HandGesture.class, "HandGesture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHandGesture_FingersLeft(), theBasePackage.getBInteger(), "fingersLeft", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandGesture_FingersRight(), theBasePackage.getBInteger(), "fingersRight", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandGesture_LevelLeft(), theBasePackage.getBString(), "levelLeft", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandGesture_LevelRight(), theBasePackage.getBString(), "levelRight", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandGesture_Gesture(), theBasePackage.getBString(), "gesture", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandGesture_GestureDirection(), theBasePackage.getBString(), "gestureDirection", null, 0, 1, HandGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyGestureEClass, BodyGesture.class, "BodyGesture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eyeGazeEClass, EyeGaze.class, "EyeGaze", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEyeGaze_LeftEye(), this.getEyeData(), null, "leftEye", null, 1, 1, EyeGaze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEyeGaze_RightEye(), this.getEyeData(), null, "rightEye", null, 1, 1, EyeGaze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headGestureEClass, HeadGesture.class, "HeadGesture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeadGesture_CommonGesture(), ecorePackage.getEString(), "commonGesture", null, 0, 1, HeadGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadGesture_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, HeadGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadGesture_Distance(), ecorePackage.getEFloat(), "distance", null, 0, 1, HeadGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadGesture_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, HeadGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadGesture_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, HeadGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointingGestureEClass, PointingGesture.class, "PointingGesture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointingGesture_Coordinate(), theBasePackage.getCartesianCoordinate2D(), null, "coordinate", null, 1, 1, PointingGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechEClass, Speech.class, "Speech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeech_Words(), this.getWord(), null, "words", null, 0, -1, Speech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeech_Utterance(), ecorePackage.getEString(), "utterance", null, 0, 1, Speech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeech_SignalUri(), theBasePackage.getUrl(), "signalUri", null, 0, 1, Speech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeech_Problem(), this.getSpeechRecognitionProblem(), "problem", null, 0, 1, Speech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSpeechSynthesisEClass, ISpeechSynthesis.class, "ISpeechSynthesis", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechSynthesisEClass, SpeechSynthesis.class, "SpeechSynthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechSynthesis_Utterance(), theBasePackage.getBString(), "utterance", null, 0, 1, SpeechSynthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioTrackEClass, AudioTrack.class, "AudioTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioTrack_TrackId(), theBasePackage.getBString(), "trackId", null, 0, 1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioTrack_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 0, 1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualCharacterEClass, VirtualCharacter.class, "VirtualCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualCharacter_Utterance(), theBasePackage.getBString(), "utterance", null, 0, 1, VirtualCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualCharacter_AvatarId(), theBasePackage.getBInteger(), "avatarId", null, 0, 1, VirtualCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualCharacter_Camera(), this.getCamera(), "camera", null, 0, 1, VirtualCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualCharacter_Bml(), theBasePackage.getBString(), "bml", null, 0, 1, VirtualCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eyeDataEClass, EyeData.class, "EyeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEyeData_GazePosX(), ecorePackage.getEFloat(), "gazePosX", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_GazePosY(), ecorePackage.getEFloat(), "gazePosY", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_CameraPosX(), ecorePackage.getEFloat(), "cameraPosX", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_CameraPosY(), ecorePackage.getEFloat(), "cameraPosY", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_PupilDiameter(), ecorePackage.getEFloat(), "pupilDiameter", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_Distance(), ecorePackage.getEFloat(), "distance", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEyeData_ConfusionConfidence(), ecorePackage.getEFloat(), "confusionConfidence", null, 0, 1, EyeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWord_Confidence(), ecorePackage.getEFloat(), "confidence", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWord_Phonemes(), ecorePackage.getEString(), "phonemes", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWord_Text(), ecorePackage.getEString(), "text", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWord_LexicalForm(), ecorePackage.getEString(), "lexicalForm", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWord_BeginTime(), theBasePackage.getTimeStamp(), "beginTime", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWord_EndTime(), theBasePackage.getTimeStamp(), "endTime", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thermometerEClass, Thermometer.class, "Thermometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThermometer_Temperature(), theBasePackage.getBFloat(), "temperature", null, 0, 1, Thermometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThermometer_Unit(), theBasePackage.getBString(), "Unit", null, 0, 1, Thermometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pulseMonitorEClass, PulseMonitor.class, "PulseMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPulseMonitor_Pulse(), theBasePackage.getBInteger(), "pulse", null, 0, 1, PulseMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lampControlEClass, LampControl.class, "LampControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLampControl_OnState(), theBasePackage.getBBoolean(), "onState", null, 0, 1, LampControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLampControl_Color(), theBasePackage.getBString(), "color", null, 0, 1, LampControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ventilatorControlEClass, VentilatorControl.class, "VentilatorControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVentilatorControl_Level(), theBasePackage.getBInteger(), "level", null, 0, 1, VentilatorControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tangibleEClass, Tangible.class, "Tangible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speechFeaturesEClass, SpeechFeatures.class, "SpeechFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechFeatures_SpearkingRate(), ecorePackage.getEFloat(), "spearkingRate", null, 0, 1, SpeechFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechFeatures_Intensity(), ecorePackage.getEFloat(), "intensity", null, 0, 1, SpeechFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechFeatures_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, SpeechFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(speechRecognitionProblemEEnum, SpeechRecognitionProblem.class, "SpeechRecognitionProblem");
		addEEnumLiteral(speechRecognitionProblemEEnum, SpeechRecognitionProblem.NONE);
		addEEnumLiteral(speechRecognitionProblemEEnum, SpeechRecognitionProblem.REJECTED);
		addEEnumLiteral(speechRecognitionProblemEEnum, SpeechRecognitionProblem.SILENCE_TIMEOUT);
		addEEnumLiteral(speechRecognitionProblemEEnum, SpeechRecognitionProblem.TOO_QUIET);
		addEEnumLiteral(speechRecognitionProblemEEnum, SpeechRecognitionProblem.TOO_LOUD);

		initEEnum(cameraEEnum, Camera.class, "Camera");
		addEEnumLiteral(cameraEEnum, Camera.FULL);
		addEEnumLiteral(cameraEEnum, Camera.FULLBODY);
		addEEnumLiteral(cameraEEnum, Camera.UPPERBODY);
		addEEnumLiteral(cameraEEnum, Camera.CLOSEUP);

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

} //Io_interfacesPackageImpl
