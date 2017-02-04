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
package de.dfki.iui.mmds.core.model.io.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import de.dfki.iui.mmds.core.model.io.ActiveGestures;
import de.dfki.iui.mmds.core.model.io.CancelPresentation;
import de.dfki.iui.mmds.core.model.io.CommunicationInfo;
import de.dfki.iui.mmds.core.model.io.CommunicativeAct;
import de.dfki.iui.mmds.core.model.io.CompoundService;
import de.dfki.iui.mmds.core.model.io.ControlMessage;
import de.dfki.iui.mmds.core.model.io.CustomFormat;
import de.dfki.iui.mmds.core.model.io.CustomMessage;
import de.dfki.iui.mmds.core.model.io.Device;
import de.dfki.iui.mmds.core.model.io.DeviceMode;
import de.dfki.iui.mmds.core.model.io.DeviceState;
import de.dfki.iui.mmds.core.model.io.DeviceStateChanged;
import de.dfki.iui.mmds.core.model.io.GestureHypothesis;
import de.dfki.iui.mmds.core.model.io.Hardware;
import de.dfki.iui.mmds.core.model.io.HtmlServlet;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.IOEvent;
import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.OSGIBundle;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;
import de.dfki.iui.mmds.core.model.io.PointingHypothesis;
import de.dfki.iui.mmds.core.model.io.PresentationState;
import de.dfki.iui.mmds.core.model.io.PresentationStateEnum;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.io.SipConnection;
import de.dfki.iui.mmds.core.model.io.SpeechHypothesis;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerState;
import de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum;
import de.dfki.iui.mmds.core.model.io.SpeechSynthesisState;
import de.dfki.iui.mmds.core.model.io.TCPServer;
import de.dfki.iui.mmds.core.model.io.TECSDirectService;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.io.UpdateGrammar;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl;
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
public class IoPackageImpl extends EPackageImpl implements IoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tecsDirectServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlServletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sipConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osgiBundleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioEventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMessageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputMessageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customMessageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicativeActEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlMessageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateDeviceModeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStateChangedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputActEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputActEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypothesisEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechHypothesisEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestureHypothesisEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointingHypothesisEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customFormatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceModeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelPresentationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateGrammarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechRecognizerStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechRecognizerModeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechSynthesisStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeGesturesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speechRecognizerStateEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speechRecognizerModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationStateEnumEEnum = null;

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
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoPackageImpl() {
		super(eNS_URI, IoFactory.eINSTANCE);
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
	 * This method is used to initialize {@link IoPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IoPackage init() {
		if (isInited) return (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

		// Obtain or create and register package
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IoPackageImpl());

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
		theIoPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theGrammar_rulesPackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();
		theGuiPackage.createPackageContents();
		theIo_interfacesPackage.createPackageContents();
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
		theIoPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theGrammar_rulesPackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();
		theGuiPackage.initializePackageContents();
		theIo_interfacesPackage.initializePackageContents();
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
		theIoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IoPackage.eNS_URI, theIoPackage);
		return theIoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInstance() {
		return serviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInstance_Description() {
		return (EAttribute)serviceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_Communicationinfo() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_Services() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_Device() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_UsedHardware() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInstance_ServiceInstanceName() {
		return (EAttribute)serviceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceInstance() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_User() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__GetUniqueId() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundService() {
		return compoundServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundService_Services() {
		return (EReference)compoundServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleService() {
		return simpleServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleService_ServiceType() {
		return (EReference)simpleServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleService_Modalities() {
		return (EAttribute)simpleServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationInfo() {
		return communicationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPServer() {
		return tcpServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPServer_Host() {
		return (EAttribute)tcpServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPServer_Port() {
		return (EAttribute)tcpServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTECSDirectService() {
		return tecsDirectServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTECSDirectService_Type() {
		return (EAttribute)tecsDirectServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTECSDirectService_Data1() {
		return (EAttribute)tecsDirectServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTECSDirectService_Data2() {
		return (EAttribute)tecsDirectServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTECSDirectService_URIs() {
		return (EAttribute)tecsDirectServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlServlet() {
		return htmlServletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHtmlServlet_FragmentName() {
		return (EAttribute)htmlServletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSipConnection() {
		return sipConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSipConnection_CallId() {
		return (EAttribute)sipConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSGIBundle() {
		return osgiBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSGIBundle_BundleName() {
		return (EAttribute)osgiBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIOEvent() {
		return ioEventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIOEvent_Message() {
		return (EReference)ioEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Description() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Id() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Timestamp() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Session() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputMessage() {
		return inputMessageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputMessage() {
		return outputMessageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomMessage() {
		return customMessageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMessage_Content() {
		return (EReference)customMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicativeAct() {
		return communicativeActEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicativeAct_Initiator() {
		return (EAttribute)communicativeActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicativeAct_Addressee() {
		return (EAttribute)communicativeActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicativeAct_PassedFade() {
		return (EAttribute)communicativeActEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlMessage() {
		return controlMessageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlMessage_Device() {
		return (EAttribute)controlMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlMessage_ServiceInstanceId() {
		return (EAttribute)controlMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlMessage_ServiceName() {
		return (EAttribute)controlMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateDeviceMode() {
		return updateDeviceModeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateDeviceMode_DeviceMode() {
		return (EReference)updateDeviceModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStateChanged() {
		return deviceStateChangedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStateChanged_DeviceState() {
		return (EReference)deviceStateChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputAct() {
		return inputActEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputAct_Representation() {
		return (EReference)inputActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputAct_Hypotheses() {
		return (EReference)inputActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputAct() {
		return outputActEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputAct_CommunicativeFunction() {
		return (EReference)outputActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputAct_Presentation() {
		return (EReference)outputActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIORepresentation() {
		return ioRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIORepresentation_Device() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIORepresentation_ServiceInstance() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIORepresentation_ServiceName() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIORepresentation_BeginTime() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIORepresentation_Duration() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIORepresentation_Language() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIORepresentation_UserAlias() {
		return (EAttribute)ioRepresentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputRepresentation() {
		return inputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputRepresentation() {
		return outputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHypothesis() {
		return hypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Confidence() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_CommunicativeFunction() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechHypothesis() {
		return speechHypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechHypothesis_Utterance() {
		return (EAttribute)speechHypothesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechHypothesis_Tokens() {
		return (EReference)speechHypothesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechHypothesis_Grammar() {
		return (EAttribute)speechHypothesisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestureHypothesis() {
		return gestureHypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGestureHypothesis_Gesture() {
		return (EAttribute)gestureHypothesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGestureHypothesis_Parameter() {
		return (EReference)gestureHypothesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointingHypothesis() {
		return pointingHypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomFormat() {
		return customFormatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomFormat_Content() {
		return (EReference)customFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomFormat_Uri() {
		return (EAttribute)customFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomFormat_Type() {
		return (EAttribute)customFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceState() {
		return deviceStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceMode() {
		return deviceModeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancelPresentation() {
		return cancelPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelPresentation_Id() {
		return (EAttribute)cancelPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationState() {
		return presentationStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPresentationState_Id() {
		return (EAttribute)presentationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPresentationState_State() {
		return (EAttribute)presentationStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateGrammar() {
		return updateGrammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateGrammar_GrammarID() {
		return (EAttribute)updateGrammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateGrammar_Grammar() {
		return (EReference)updateGrammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateGrammar_Active() {
		return (EAttribute)updateGrammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechRecognizerState() {
		return speechRecognizerStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechRecognizerState_State() {
		return (EAttribute)speechRecognizerStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechRecognizerMode() {
		return speechRecognizerModeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechRecognizerMode_Mode() {
		return (EAttribute)speechRecognizerModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechSynthesisState() {
		return speechSynthesisStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechSynthesisState_Phoneme() {
		return (EAttribute)speechSynthesisStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechSynthesisState_Viseme() {
		return (EAttribute)speechSynthesisStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechSynthesisState_CharIndex() {
		return (EAttribute)speechSynthesisStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechSynthesisState_Bookmark() {
		return (EAttribute)speechSynthesisStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveGestures() {
		return activeGesturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveGestures_Gestures() {
		return (EAttribute)activeGesturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceType() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Hardware() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardware_Id() {
		return (EAttribute)hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpeechRecognizerStateEnum() {
		return speechRecognizerStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpeechRecognizerModeEnum() {
		return speechRecognizerModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPresentationStateEnum() {
		return presentationStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoFactory getIoFactory() {
		return (IoFactory)getEFactoryInstance();
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
		serviceInstanceEClass = createEClass(SERVICE_INSTANCE);
		createEAttribute(serviceInstanceEClass, SERVICE_INSTANCE__DESCRIPTION);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__COMMUNICATIONINFO);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__SERVICES);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__DEVICE);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__USED_HARDWARE);
		createEAttribute(serviceInstanceEClass, SERVICE_INSTANCE__SERVICE_INSTANCE_NAME);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_NAME);
		createEReference(serviceEClass, SERVICE__SERVICE_INSTANCE);
		createEReference(serviceEClass, SERVICE__USER);
		createEOperation(serviceEClass, SERVICE___GET_UNIQUE_ID);

		compoundServiceEClass = createEClass(COMPOUND_SERVICE);
		createEReference(compoundServiceEClass, COMPOUND_SERVICE__SERVICES);

		simpleServiceEClass = createEClass(SIMPLE_SERVICE);
		createEReference(simpleServiceEClass, SIMPLE_SERVICE__SERVICE_TYPE);
		createEAttribute(simpleServiceEClass, SIMPLE_SERVICE__MODALITIES);

		communicationInfoEClass = createEClass(COMMUNICATION_INFO);

		tcpServerEClass = createEClass(TCP_SERVER);
		createEAttribute(tcpServerEClass, TCP_SERVER__HOST);
		createEAttribute(tcpServerEClass, TCP_SERVER__PORT);

		tecsDirectServiceEClass = createEClass(TECS_DIRECT_SERVICE);
		createEAttribute(tecsDirectServiceEClass, TECS_DIRECT_SERVICE__TYPE);
		createEAttribute(tecsDirectServiceEClass, TECS_DIRECT_SERVICE__DATA1);
		createEAttribute(tecsDirectServiceEClass, TECS_DIRECT_SERVICE__DATA2);
		createEAttribute(tecsDirectServiceEClass, TECS_DIRECT_SERVICE__UR_IS);

		htmlServletEClass = createEClass(HTML_SERVLET);
		createEAttribute(htmlServletEClass, HTML_SERVLET__FRAGMENT_NAME);

		sipConnectionEClass = createEClass(SIP_CONNECTION);
		createEAttribute(sipConnectionEClass, SIP_CONNECTION__CALL_ID);

		osgiBundleEClass = createEClass(OSGI_BUNDLE);
		createEAttribute(osgiBundleEClass, OSGI_BUNDLE__BUNDLE_NAME);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_TYPE);
		createEReference(deviceEClass, DEVICE__HARDWARE);

		hardwareEClass = createEClass(HARDWARE);
		createEAttribute(hardwareEClass, HARDWARE__ID);

		ioEventEClass = createEClass(IO_EVENT);
		createEReference(ioEventEClass, IO_EVENT__MESSAGE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__DESCRIPTION);
		createEAttribute(messageEClass, MESSAGE__ID);
		createEAttribute(messageEClass, MESSAGE__TIMESTAMP);
		createEAttribute(messageEClass, MESSAGE__SESSION);

		inputMessageEClass = createEClass(INPUT_MESSAGE);

		outputMessageEClass = createEClass(OUTPUT_MESSAGE);

		customMessageEClass = createEClass(CUSTOM_MESSAGE);
		createEReference(customMessageEClass, CUSTOM_MESSAGE__CONTENT);

		communicativeActEClass = createEClass(COMMUNICATIVE_ACT);
		createEAttribute(communicativeActEClass, COMMUNICATIVE_ACT__INITIATOR);
		createEAttribute(communicativeActEClass, COMMUNICATIVE_ACT__ADDRESSEE);
		createEAttribute(communicativeActEClass, COMMUNICATIVE_ACT__PASSED_FADE);

		controlMessageEClass = createEClass(CONTROL_MESSAGE);
		createEAttribute(controlMessageEClass, CONTROL_MESSAGE__DEVICE);
		createEAttribute(controlMessageEClass, CONTROL_MESSAGE__SERVICE_INSTANCE_ID);
		createEAttribute(controlMessageEClass, CONTROL_MESSAGE__SERVICE_NAME);

		updateDeviceModeEClass = createEClass(UPDATE_DEVICE_MODE);
		createEReference(updateDeviceModeEClass, UPDATE_DEVICE_MODE__DEVICE_MODE);

		deviceStateChangedEClass = createEClass(DEVICE_STATE_CHANGED);
		createEReference(deviceStateChangedEClass, DEVICE_STATE_CHANGED__DEVICE_STATE);

		inputActEClass = createEClass(INPUT_ACT);
		createEReference(inputActEClass, INPUT_ACT__REPRESENTATION);
		createEReference(inputActEClass, INPUT_ACT__HYPOTHESES);

		outputActEClass = createEClass(OUTPUT_ACT);
		createEReference(outputActEClass, OUTPUT_ACT__COMMUNICATIVE_FUNCTION);
		createEReference(outputActEClass, OUTPUT_ACT__PRESENTATION);

		ioRepresentationEClass = createEClass(IO_REPRESENTATION);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__DEVICE);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__SERVICE_INSTANCE);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__SERVICE_NAME);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__BEGIN_TIME);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__DURATION);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__LANGUAGE);
		createEAttribute(ioRepresentationEClass, IO_REPRESENTATION__USER_ALIAS);

		inputRepresentationEClass = createEClass(INPUT_REPRESENTATION);

		outputRepresentationEClass = createEClass(OUTPUT_REPRESENTATION);

		hypothesisEClass = createEClass(HYPOTHESIS);
		createEAttribute(hypothesisEClass, HYPOTHESIS__CONFIDENCE);
		createEReference(hypothesisEClass, HYPOTHESIS__COMMUNICATIVE_FUNCTION);

		speechHypothesisEClass = createEClass(SPEECH_HYPOTHESIS);
		createEAttribute(speechHypothesisEClass, SPEECH_HYPOTHESIS__UTTERANCE);
		createEReference(speechHypothesisEClass, SPEECH_HYPOTHESIS__TOKENS);
		createEAttribute(speechHypothesisEClass, SPEECH_HYPOTHESIS__GRAMMAR);

		gestureHypothesisEClass = createEClass(GESTURE_HYPOTHESIS);
		createEAttribute(gestureHypothesisEClass, GESTURE_HYPOTHESIS__GESTURE);
		createEReference(gestureHypothesisEClass, GESTURE_HYPOTHESIS__PARAMETER);

		pointingHypothesisEClass = createEClass(POINTING_HYPOTHESIS);

		customFormatEClass = createEClass(CUSTOM_FORMAT);
		createEReference(customFormatEClass, CUSTOM_FORMAT__CONTENT);
		createEAttribute(customFormatEClass, CUSTOM_FORMAT__URI);
		createEAttribute(customFormatEClass, CUSTOM_FORMAT__TYPE);

		deviceStateEClass = createEClass(DEVICE_STATE);

		deviceModeEClass = createEClass(DEVICE_MODE);

		cancelPresentationEClass = createEClass(CANCEL_PRESENTATION);
		createEAttribute(cancelPresentationEClass, CANCEL_PRESENTATION__ID);

		presentationStateEClass = createEClass(PRESENTATION_STATE);
		createEAttribute(presentationStateEClass, PRESENTATION_STATE__ID);
		createEAttribute(presentationStateEClass, PRESENTATION_STATE__STATE);

		updateGrammarEClass = createEClass(UPDATE_GRAMMAR);
		createEAttribute(updateGrammarEClass, UPDATE_GRAMMAR__GRAMMAR_ID);
		createEReference(updateGrammarEClass, UPDATE_GRAMMAR__GRAMMAR);
		createEAttribute(updateGrammarEClass, UPDATE_GRAMMAR__ACTIVE);

		speechRecognizerStateEClass = createEClass(SPEECH_RECOGNIZER_STATE);
		createEAttribute(speechRecognizerStateEClass, SPEECH_RECOGNIZER_STATE__STATE);

		speechRecognizerModeEClass = createEClass(SPEECH_RECOGNIZER_MODE);
		createEAttribute(speechRecognizerModeEClass, SPEECH_RECOGNIZER_MODE__MODE);

		speechSynthesisStateEClass = createEClass(SPEECH_SYNTHESIS_STATE);
		createEAttribute(speechSynthesisStateEClass, SPEECH_SYNTHESIS_STATE__PHONEME);
		createEAttribute(speechSynthesisStateEClass, SPEECH_SYNTHESIS_STATE__VISEME);
		createEAttribute(speechSynthesisStateEClass, SPEECH_SYNTHESIS_STATE__CHAR_INDEX);
		createEAttribute(speechSynthesisStateEClass, SPEECH_SYNTHESIS_STATE__BOOKMARK);

		activeGesturesEClass = createEClass(ACTIVE_GESTURES);
		createEAttribute(activeGesturesEClass, ACTIVE_GESTURES__GESTURES);

		// Create enums
		presentationStateEnumEEnum = createEEnum(PRESENTATION_STATE_ENUM);
		speechRecognizerStateEnumEEnum = createEEnum(SPEECH_RECOGNIZER_STATE_ENUM);
		speechRecognizerModeEnumEEnum = createEEnum(SPEECH_RECOGNIZER_MODE_ENUM);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		Communicative_functionsPackage theCommunicative_functionsPackage = (Communicative_functionsPackage)EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI);
		GrammarPackage theGrammarPackage = (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceInstanceEClass.getESuperTypes().add(theBasePackage.getEntity());
		serviceEClass.getESuperTypes().add(theBasePackage.getEntity());
		compoundServiceEClass.getESuperTypes().add(this.getService());
		simpleServiceEClass.getESuperTypes().add(this.getService());
		tcpServerEClass.getESuperTypes().add(this.getCommunicationInfo());
		tecsDirectServiceEClass.getESuperTypes().add(this.getCommunicationInfo());
		htmlServletEClass.getESuperTypes().add(this.getCommunicationInfo());
		sipConnectionEClass.getESuperTypes().add(this.getCommunicationInfo());
		osgiBundleEClass.getESuperTypes().add(this.getCommunicationInfo());
		deviceEClass.getESuperTypes().add(theBasePackage.getNamedEntity());
		ioEventEClass.getESuperTypes().add(theBasePackage.getBObject());
		messageEClass.getESuperTypes().add(theBasePackage.getBObject());
		inputMessageEClass.getESuperTypes().add(this.getMessage());
		outputMessageEClass.getESuperTypes().add(this.getMessage());
		customMessageEClass.getESuperTypes().add(this.getMessage());
		updateDeviceModeEClass.getESuperTypes().add(this.getControlMessage());
		updateDeviceModeEClass.getESuperTypes().add(this.getOutputMessage());
		deviceStateChangedEClass.getESuperTypes().add(this.getControlMessage());
		deviceStateChangedEClass.getESuperTypes().add(this.getInputMessage());
		inputActEClass.getESuperTypes().add(this.getCommunicativeAct());
		inputActEClass.getESuperTypes().add(this.getInputMessage());
		outputActEClass.getESuperTypes().add(this.getCommunicativeAct());
		outputActEClass.getESuperTypes().add(this.getOutputMessage());
		ioRepresentationEClass.getESuperTypes().add(theBasePackage.getBObject());
		inputRepresentationEClass.getESuperTypes().add(this.getIORepresentation());
		outputRepresentationEClass.getESuperTypes().add(this.getIORepresentation());
		hypothesisEClass.getESuperTypes().add(theBasePackage.getBObject());
		speechHypothesisEClass.getESuperTypes().add(this.getHypothesis());
		gestureHypothesisEClass.getESuperTypes().add(this.getHypothesis());
		pointingHypothesisEClass.getESuperTypes().add(this.getHypothesis());
		customFormatEClass.getESuperTypes().add(this.getInputRepresentation());
		customFormatEClass.getESuperTypes().add(this.getOutputRepresentation());
		deviceStateEClass.getESuperTypes().add(theBasePackage.getBObject());
		deviceModeEClass.getESuperTypes().add(theBasePackage.getBObject());
		cancelPresentationEClass.getESuperTypes().add(this.getDeviceMode());
		presentationStateEClass.getESuperTypes().add(this.getDeviceState());
		updateGrammarEClass.getESuperTypes().add(this.getDeviceMode());
		speechRecognizerStateEClass.getESuperTypes().add(this.getDeviceState());
		speechRecognizerModeEClass.getESuperTypes().add(this.getDeviceMode());
		speechSynthesisStateEClass.getESuperTypes().add(this.getDeviceState());
		activeGesturesEClass.getESuperTypes().add(this.getDeviceMode());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceInstanceEClass, ServiceInstance.class, "ServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstance_Communicationinfo(), this.getCommunicationInfo(), null, "communicationinfo", null, 1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstance_Services(), this.getService(), this.getService_ServiceInstance(), "services", null, 1, -1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstance_Device(), this.getDevice(), null, "device", null, 0, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstance_UsedHardware(), this.getHardware(), null, "usedHardware", null, 0, -1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInstance_ServiceInstanceName(), ecorePackage.getEString(), "serviceInstanceName", null, 0, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ServiceInstance(), this.getServiceInstance(), this.getServiceInstance_Services(), "serviceInstance", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_User(), theBasePackage.getDialogParticipant(), theBasePackage.getDialogParticipant_UserInterfaces(), "user", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getService__GetUniqueId(), ecorePackage.getEString(), "getUniqueId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compoundServiceEClass, CompoundService.class, "CompoundService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundService_Services(), this.getSimpleService(), null, "services", null, 0, -1, CompoundService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleServiceEClass, SimpleService.class, "SimpleService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleService_ServiceType(), ecorePackage.getEClass(), null, "serviceType", null, 0, -1, SimpleService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleService_Modalities(), ecorePackage.getEString(), "modalities", null, 0, -1, SimpleService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationInfoEClass, CommunicationInfo.class, "CommunicationInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcpServerEClass, TCPServer.class, "TCPServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCPServer_Host(), ecorePackage.getEString(), "host", null, 0, 1, TCPServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPServer_Port(), ecorePackage.getEInt(), "port", null, 1, 1, TCPServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tecsDirectServiceEClass, TECSDirectService.class, "TECSDirectService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTECSDirectService_Type(), ecorePackage.getEString(), "type", null, 0, 1, TECSDirectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTECSDirectService_Data1(), ecorePackage.getEByte(), "data1", null, 0, -1, TECSDirectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTECSDirectService_Data2(), ecorePackage.getEByte(), "data2", null, 0, -1, TECSDirectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTECSDirectService_URIs(), ecorePackage.getEString(), "URIs", null, 0, -1, TECSDirectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlServletEClass, HtmlServlet.class, "HtmlServlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlServlet_FragmentName(), ecorePackage.getEString(), "fragmentName", null, 0, 1, HtmlServlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sipConnectionEClass, SipConnection.class, "SipConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSipConnection_CallId(), ecorePackage.getEString(), "callId", null, 1, 1, SipConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osgiBundleEClass, OSGIBundle.class, "OSGIBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGIBundle_BundleName(), ecorePackage.getEString(), "bundleName", null, 1, 1, OSGIBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceType(), ecorePackage.getEString(), "deviceType", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Hardware(), this.getHardware(), null, "hardware", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareEClass, Hardware.class, "Hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardware_Id(), ecorePackage.getEString(), "id", null, 0, 1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioEventEClass, IOEvent.class, "IOEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOEvent_Message(), this.getMessage(), null, "message", null, 1, 1, IOEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Description(), ecorePackage.getEString(), "description", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Id(), theBasePackage.getBString(), "id", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Timestamp(), theBasePackage.getTimeStamp(), "timestamp", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Session(), theBasePackage.getBString(), "session", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputMessageEClass, InputMessage.class, "InputMessage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputMessageEClass, OutputMessage.class, "OutputMessage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customMessageEClass, CustomMessage.class, "CustomMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomMessage_Content(), ecorePackage.getEObject(), null, "content", null, 1, 1, CustomMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeActEClass, CommunicativeAct.class, "CommunicativeAct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicativeAct_Initiator(), theBasePackage.getBString(), "initiator", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicativeAct_Addressee(), theBasePackage.getBString(), "addressee", null, 0, -1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicativeAct_PassedFade(), ecorePackage.getEBoolean(), "passedFade", "false", 1, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlMessageEClass, ControlMessage.class, "ControlMessage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlMessage_Device(), theBasePackage.getBString(), "device", null, 0, 1, ControlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlMessage_ServiceInstanceId(), ecorePackage.getEString(), "serviceInstanceId", "", 0, 1, ControlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlMessage_ServiceName(), ecorePackage.getEString(), "serviceName", "", 0, 1, ControlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateDeviceModeEClass, UpdateDeviceMode.class, "UpdateDeviceMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateDeviceMode_DeviceMode(), this.getDeviceMode(), null, "deviceMode", null, 0, 1, UpdateDeviceMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStateChangedEClass, DeviceStateChanged.class, "DeviceStateChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStateChanged_DeviceState(), this.getDeviceState(), null, "deviceState", null, 0, 1, DeviceStateChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputActEClass, InputAct.class, "InputAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputAct_Representation(), this.getInputRepresentation(), null, "representation", null, 0, -1, InputAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputAct_Hypotheses(), this.getHypothesis(), null, "hypotheses", null, 0, -1, InputAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputActEClass, OutputAct.class, "OutputAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputAct_CommunicativeFunction(), theCommunicative_functionsPackage.getCommunicativeFunction(), null, "communicativeFunction", null, 0, 1, OutputAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputAct_Presentation(), this.getOutputRepresentation(), null, "presentation", null, 0, -1, OutputAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioRepresentationEClass, IORepresentation.class, "IORepresentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIORepresentation_Device(), theBasePackage.getBString(), "device", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_ServiceInstance(), ecorePackage.getEString(), "serviceInstance", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_BeginTime(), theBasePackage.getTimeStamp(), "beginTime", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_Duration(), theBasePackage.getTimeSpan(), "duration", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_Language(), theBasePackage.getBString(), "language", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIORepresentation_UserAlias(), theBasePackage.getBString(), "userAlias", null, 0, 1, IORepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputRepresentationEClass, InputRepresentation.class, "InputRepresentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputRepresentationEClass, OutputRepresentation.class, "OutputRepresentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hypothesisEClass, Hypothesis.class, "Hypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypothesis_Confidence(), ecorePackage.getEFloat(), "confidence", "1", 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_CommunicativeFunction(), theCommunicative_functionsPackage.getCommunicativeFunction(), null, "communicativeFunction", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechHypothesisEClass, SpeechHypothesis.class, "SpeechHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechHypothesis_Utterance(), ecorePackage.getEString(), "utterance", null, 0, 1, SpeechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechHypothesis_Tokens(), theBasePackage.getStringToBStringMapEntry(), null, "tokens", null, 0, -1, SpeechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpeechHypothesis_Grammar(), ecorePackage.getEString(), "grammar", null, 0, 1, SpeechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gestureHypothesisEClass, GestureHypothesis.class, "GestureHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGestureHypothesis_Gesture(), ecorePackage.getEString(), "gesture", null, 0, 1, GestureHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGestureHypothesis_Parameter(), ecorePackage.getEStringToStringMapEntry(), null, "parameter", null, 0, -1, GestureHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointingHypothesisEClass, PointingHypothesis.class, "PointingHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customFormatEClass, CustomFormat.class, "CustomFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomFormat_Content(), theBasePackage.getStringToBStringMapEntry(), null, "content", null, 0, -1, CustomFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomFormat_Uri(), theBasePackage.getUrl(), "uri", null, 0, 1, CustomFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomFormat_Type(), ecorePackage.getEString(), "type", null, 0, 1, CustomFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStateEClass, DeviceState.class, "DeviceState", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceModeEClass, DeviceMode.class, "DeviceMode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cancelPresentationEClass, CancelPresentation.class, "CancelPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancelPresentation_Id(), theBasePackage.getBString(), "id", null, 0, 1, CancelPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationStateEClass, PresentationState.class, "PresentationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentationState_Id(), ecorePackage.getEString(), "id", null, 0, 1, PresentationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationState_State(), this.getPresentationStateEnum(), "state", null, 1, 1, PresentationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateGrammarEClass, UpdateGrammar.class, "UpdateGrammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateGrammar_GrammarID(), ecorePackage.getEString(), "grammarID", null, 1, 1, UpdateGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateGrammar_Grammar(), theGrammarPackage.getDocumentRoot(), null, "grammar", null, 1, 1, UpdateGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateGrammar_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, UpdateGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechRecognizerStateEClass, SpeechRecognizerState.class, "SpeechRecognizerState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechRecognizerState_State(), this.getSpeechRecognizerStateEnum(), "state", null, 1, 1, SpeechRecognizerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechRecognizerModeEClass, SpeechRecognizerMode.class, "SpeechRecognizerMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechRecognizerMode_Mode(), this.getSpeechRecognizerModeEnum(), "mode", null, 1, 1, SpeechRecognizerMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechSynthesisStateEClass, SpeechSynthesisState.class, "SpeechSynthesisState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechSynthesisState_Phoneme(), ecorePackage.getEString(), "phoneme", null, 0, 1, SpeechSynthesisState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechSynthesisState_Viseme(), ecorePackage.getEString(), "viseme", null, 0, 1, SpeechSynthesisState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechSynthesisState_CharIndex(), ecorePackage.getEInt(), "charIndex", null, 0, 1, SpeechSynthesisState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechSynthesisState_Bookmark(), ecorePackage.getEString(), "bookmark", null, 0, 1, SpeechSynthesisState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeGesturesEClass, ActiveGestures.class, "ActiveGestures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveGestures_Gestures(), theBasePackage.getBString(), "gestures", null, 0, -1, ActiveGestures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(presentationStateEnumEEnum, PresentationStateEnum.class, "PresentationStateEnum");
		addEEnumLiteral(presentationStateEnumEEnum, PresentationStateEnum.NONE);
		addEEnumLiteral(presentationStateEnumEEnum, PresentationStateEnum.STARTED);
		addEEnumLiteral(presentationStateEnumEEnum, PresentationStateEnum.FINISHED);
		addEEnumLiteral(presentationStateEnumEEnum, PresentationStateEnum.IN_PROGRESS);

		initEEnum(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.class, "SpeechRecognizerStateEnum");
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.NONE);
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.MICROPHONE_OPEN);
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.MICROPHONE_CLOSED);
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.SPEECH_STARTED);
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.SPEECH_STOPPED);
		addEEnumLiteral(speechRecognizerStateEnumEEnum, SpeechRecognizerStateEnum.SILENCE);

		initEEnum(speechRecognizerModeEnumEEnum, SpeechRecognizerModeEnum.class, "SpeechRecognizerModeEnum");
		addEEnumLiteral(speechRecognizerModeEnumEEnum, SpeechRecognizerModeEnum.NONE);
		addEEnumLiteral(speechRecognizerModeEnumEEnum, SpeechRecognizerModeEnum.OPEN_MICROPHONE);
		addEEnumLiteral(speechRecognizerModeEnumEEnum, SpeechRecognizerModeEnum.CLOSE_MICROPHONE);
		addEEnumLiteral(speechRecognizerModeEnumEEnum, SpeechRecognizerModeEnum.SPEAK_TO_ACTIVATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui/ReferencedBy
		createReferencedByAnnotations();
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://de.dfki.iui/TypeMapping
		createTypeMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui/ReferencedBy</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createReferencedByAnnotations() {
		String source = "http://de.dfki.iui/ReferencedBy";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "gui", "../../../de.dfki.iui.mmds.core.model/model/io/gui.ecore"
		   });
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

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui/TypeMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTypeMappingAnnotations() {
		String source = "http://de.dfki.iui/TypeMapping";	
		addAnnotation
		  (getUpdateGrammar_Grammar(), 
		   source, 
		   new String[] {
			 "dotnet", "opaque"
		   });
	}

} // IoPackageImpl
