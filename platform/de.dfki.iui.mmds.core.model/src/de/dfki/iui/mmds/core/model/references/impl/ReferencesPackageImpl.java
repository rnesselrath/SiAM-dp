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
package de.dfki.iui.mmds.core.model.references.impl;

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
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;

import de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl;

import de.dfki.iui.mmds.core.model.references.CollectionReference;
import de.dfki.iui.mmds.core.model.references.DeicticReference;
import de.dfki.iui.mmds.core.model.references.GuiContentReference;
import de.dfki.iui.mmds.core.model.references.KnowledgeBaseReference;
import de.dfki.iui.mmds.core.model.references.LingInfo;
import de.dfki.iui.mmds.core.model.references.ReferenceModel;
import de.dfki.iui.mmds.core.model.references.ReferencesFactory;
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;
import de.dfki.iui.mmds.core.model.references.SpatialReference;
import de.dfki.iui.mmds.core.model.references.TemporalReference;

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
public class ReferencesPackageImpl extends EPackageImpl implements ReferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deicticReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBaseReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiContentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lingInfoEClass = null;

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
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencesPackageImpl() {
		super(eNS_URI, ReferencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencesPackage init() {
		if (isInited) return (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Obtain or create and register package
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReferencesPackageImpl());

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
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theReferencesPackage.createPackageContents();
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
		theGrammarPackage.createPackageContents();
		theSpeechSynthesisPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesPackage.initializePackageContents();
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
		theGrammarPackage.initializePackageContents();
		theSpeechSynthesisPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencesPackage.eNS_URI, theReferencesPackage);
		return theReferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModel() {
		return referenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceModel_ReferencePattern() {
		return (EReference)referenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceModel_HasMorphoSyntacticDecomposition() {
		return (EReference)referenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModel_IsMany() {
		return (EAttribute)referenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeicticReference() {
		return deicticReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeBaseReference() {
		return knowledgeBaseReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiContentReference() {
		return guiContentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpatialReference() {
		return spatialReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpatialReference_Relatum() {
		return (EReference)spatialReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialReference_SpatialExpression() {
		return (EAttribute)spatialReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalReference() {
		return temporalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalReference_Unit() {
		return (EAttribute)temporalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalReference_Number() {
		return (EAttribute)temporalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalReference_TemporalFrame() {
		return (EAttribute)temporalReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionReference() {
		return collectionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionReference_Position() {
		return (EAttribute)collectionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionReference_Order() {
		return (EAttribute)collectionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLingInfo() {
		return lingInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLingInfo_Case() {
		return (EAttribute)lingInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLingInfo_Gender() {
		return (EAttribute)lingInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLingInfo_Number() {
		return (EAttribute)lingInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLingInfo_PartOfSpeech() {
		return (EAttribute)lingInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactory getReferencesFactory() {
		return (ReferencesFactory)getEFactoryInstance();
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
		referenceModelEClass = createEClass(REFERENCE_MODEL);
		createEReference(referenceModelEClass, REFERENCE_MODEL__REFERENCE_PATTERN);
		createEReference(referenceModelEClass, REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION);
		createEAttribute(referenceModelEClass, REFERENCE_MODEL__IS_MANY);

		deicticReferenceEClass = createEClass(DEICTIC_REFERENCE);

		knowledgeBaseReferenceEClass = createEClass(KNOWLEDGE_BASE_REFERENCE);

		guiContentReferenceEClass = createEClass(GUI_CONTENT_REFERENCE);

		spatialReferenceEClass = createEClass(SPATIAL_REFERENCE);
		createEReference(spatialReferenceEClass, SPATIAL_REFERENCE__RELATUM);
		createEAttribute(spatialReferenceEClass, SPATIAL_REFERENCE__SPATIAL_EXPRESSION);

		temporalReferenceEClass = createEClass(TEMPORAL_REFERENCE);
		createEAttribute(temporalReferenceEClass, TEMPORAL_REFERENCE__UNIT);
		createEAttribute(temporalReferenceEClass, TEMPORAL_REFERENCE__NUMBER);
		createEAttribute(temporalReferenceEClass, TEMPORAL_REFERENCE__TEMPORAL_FRAME);

		collectionReferenceEClass = createEClass(COLLECTION_REFERENCE);
		createEAttribute(collectionReferenceEClass, COLLECTION_REFERENCE__POSITION);
		createEAttribute(collectionReferenceEClass, COLLECTION_REFERENCE__ORDER);

		lingInfoEClass = createEClass(LING_INFO);
		createEAttribute(lingInfoEClass, LING_INFO__CASE);
		createEAttribute(lingInfoEClass, LING_INFO__GENDER);
		createEAttribute(lingInfoEClass, LING_INFO__NUMBER);
		createEAttribute(lingInfoEClass, LING_INFO__PART_OF_SPEECH);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deicticReferenceEClass.getESuperTypes().add(this.getReferenceModel());
		knowledgeBaseReferenceEClass.getESuperTypes().add(this.getReferenceModel());
		guiContentReferenceEClass.getESuperTypes().add(this.getReferenceModel());
		spatialReferenceEClass.getESuperTypes().add(this.getReferenceModel());
		temporalReferenceEClass.getESuperTypes().add(this.getReferenceModel());
		collectionReferenceEClass.getESuperTypes().add(this.getReferenceModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(referenceModelEClass, ReferenceModel.class, "ReferenceModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceModel_ReferencePattern(), thePatternPackage.getPObject(), null, "referencePattern", null, 0, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceModel_HasMorphoSyntacticDecomposition(), this.getLingInfo(), null, "hasMorphoSyntacticDecomposition", null, 0, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceModel_IsMany(), ecorePackage.getEBoolean(), "isMany", null, 0, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deicticReferenceEClass, DeicticReference.class, "DeicticReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeBaseReferenceEClass, KnowledgeBaseReference.class, "KnowledgeBaseReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiContentReferenceEClass, GuiContentReference.class, "GuiContentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spatialReferenceEClass, SpatialReference.class, "SpatialReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpatialReference_Relatum(), theBasePackage.getEntity(), null, "relatum", null, 1, 1, SpatialReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialReference_SpatialExpression(), theBasePackage.getBString(), "spatialExpression", null, 0, 1, SpatialReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalReferenceEClass, TemporalReference.class, "TemporalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalReference_Unit(), theBasePackage.getUnitType(), "unit", null, 0, 1, TemporalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalReference_Number(), theBasePackage.getBInteger(), "number", null, 0, 1, TemporalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalReference_TemporalFrame(), theBasePackage.getBString(), "temporalFrame", null, 0, 1, TemporalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionReferenceEClass, CollectionReference.class, "CollectionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionReference_Position(), theBasePackage.getBInteger(), "position", null, 0, 1, CollectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionReference_Order(), theBasePackage.getBString(), "order", null, 0, 1, CollectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lingInfoEClass, LingInfo.class, "LingInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLingInfo_Case(), theBasePackage.getBString(), "case", null, 0, 1, LingInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLingInfo_Gender(), theBasePackage.getBString(), "gender", null, 0, 1, LingInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLingInfo_Number(), theBasePackage.getBString(), "number", null, 0, 1, LingInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLingInfo_PartOfSpeech(), theBasePackage.getBString(), "partOfSpeech", null, 0, 1, LingInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //ReferencesPackageImpl
