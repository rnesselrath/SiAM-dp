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
package de.dfki.iui.mmds.core.model.backchannel.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory;
import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback;
import de.dfki.iui.mmds.core.model.backchannel.UhmNegativeAutoFeedback;

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
public class BackchannelPackageImpl extends EPackageImpl implements BackchannelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass okayPositiveAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uhmNegativeAutoFeedbackEClass = null;

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
	 * @see de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BackchannelPackageImpl() {
		super(eNS_URI, BackchannelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BackchannelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BackchannelPackage init() {
		if (isInited) return (BackchannelPackage)EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI);

		// Obtain or create and register package
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BackchannelPackageImpl());

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
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);

		// Create package meta-data objects
		theBackchannelPackage.createPackageContents();
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
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theBackchannelPackage.initializePackageContents();
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
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBackchannelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BackchannelPackage.eNS_URI, theBackchannelPackage);
		return theBackchannelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOkayPositiveAutoFeedback() {
		return okayPositiveAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUhmNegativeAutoFeedback() {
		return uhmNegativeAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackchannelFactory getBackchannelFactory() {
		return (BackchannelFactory)getEFactoryInstance();
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
		okayPositiveAutoFeedbackEClass = createEClass(OKAY_POSITIVE_AUTO_FEEDBACK);

		uhmNegativeAutoFeedbackEClass = createEClass(UHM_NEGATIVE_AUTO_FEEDBACK);
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
		Communicative_functionsPackage theCommunicative_functionsPackage = (Communicative_functionsPackage)EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		okayPositiveAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getPositiveInterpretationAutoFeedback());
		okayPositiveAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getPositiveEvaluationAutoFeedback());
		okayPositiveAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getPositiveExecutionAutoFeedback());
		uhmNegativeAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getNegativePerceptionAutoFeedback());
		uhmNegativeAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getNegativeInterpretationAutoFeedback());
		uhmNegativeAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getNegativeEvaluationAutoFeedback());
		uhmNegativeAutoFeedbackEClass.getESuperTypes().add(theCommunicative_functionsPackage.getNegativeExecutionAutoFeedback());

		// Initialize classes, features, and operations; add parameters
		initEClass(okayPositiveAutoFeedbackEClass, OkayPositiveAutoFeedback.class, "OkayPositiveAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uhmNegativeAutoFeedbackEClass, UhmNegativeAutoFeedback.class, "UhmNegativeAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //BackchannelPackageImpl
