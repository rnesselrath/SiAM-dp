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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
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
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;
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
public class Grammar_rulesPackageImpl extends EPackageImpl implements Grammar_rulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utteranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phraseMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phraseValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityTypeEEnum = null;

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
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Grammar_rulesPackageImpl() {
		super(eNS_URI, Grammar_rulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Grammar_rulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Grammar_rulesPackage init() {
		if (isInited) return (Grammar_rulesPackage)EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI);

		// Obtain or create and register package
		Grammar_rulesPackageImpl theGrammar_rulesPackage = (Grammar_rulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Grammar_rulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Grammar_rulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) : Communicative_functionsPackage.eINSTANCE);
		DialoguePackageImpl theDialoguePackage = (DialoguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) instanceof DialoguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) : DialoguePackage.eINSTANCE);
		EarconsPackageImpl theEarconsPackage = (EarconsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) instanceof EarconsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) : EarconsPackage.eINSTANCE);
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
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theGrammar_rulesPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
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
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theGrammar_rulesPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
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
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammar_rulesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Grammar_rulesPackage.eNS_URI, theGrammar_rulesPackage);
		return theGrammar_rulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleset() {
		return rulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleset_Identifier() {
		return (EAttribute)rulesetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleset_Rules() {
		return (EReference)rulesetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleset_Language() {
		return (EAttribute)rulesetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Enabled() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtterance() {
		return utteranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtterance_Interpretation() {
		return (EReference)utteranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtterance_Phrases() {
		return (EAttribute)utteranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtterance_Annotation() {
		return (EReference)utteranceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Type() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Entries() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Interpretation() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticMapping() {
		return semanticMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticMapping_PhraseMappings() {
		return (EReference)semanticMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticMapping_MappingTarget() {
		return (EReference)semanticMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhraseMapping() {
		return phraseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhraseMapping_Interpretation() {
		return (EReference)phraseMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseMapping_Phrases() {
		return (EAttribute)phraseMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseMapping_Description() {
		return (EAttribute)phraseMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhraseValuePair() {
		return phraseValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseValuePair_Phrase() {
		return (EAttribute)phraseValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseValuePair_Value() {
		return (EAttribute)phraseValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityType() {
		return entityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar_rulesFactory getGrammar_rulesFactory() {
		return (Grammar_rulesFactory)getEFactoryInstance();
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
		rulesetEClass = createEClass(RULESET);
		createEAttribute(rulesetEClass, RULESET__IDENTIFIER);
		createEReference(rulesetEClass, RULESET__RULES);
		createEAttribute(rulesetEClass, RULESET__LANGUAGE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__ENABLED);

		utteranceEClass = createEClass(UTTERANCE);
		createEReference(utteranceEClass, UTTERANCE__INTERPRETATION);
		createEAttribute(utteranceEClass, UTTERANCE__PHRASES);
		createEReference(utteranceEClass, UTTERANCE__ANNOTATION);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__TYPE);
		createEReference(entityEClass, ENTITY__ENTRIES);
		createEReference(entityEClass, ENTITY__INTERPRETATION);

		semanticMappingEClass = createEClass(SEMANTIC_MAPPING);
		createEReference(semanticMappingEClass, SEMANTIC_MAPPING__PHRASE_MAPPINGS);
		createEReference(semanticMappingEClass, SEMANTIC_MAPPING__MAPPING_TARGET);

		phraseMappingEClass = createEClass(PHRASE_MAPPING);
		createEReference(phraseMappingEClass, PHRASE_MAPPING__INTERPRETATION);
		createEAttribute(phraseMappingEClass, PHRASE_MAPPING__PHRASES);
		createEAttribute(phraseMappingEClass, PHRASE_MAPPING__DESCRIPTION);

		phraseValuePairEClass = createEClass(PHRASE_VALUE_PAIR);
		createEAttribute(phraseValuePairEClass, PHRASE_VALUE_PAIR__PHRASE);
		createEAttribute(phraseValuePairEClass, PHRASE_VALUE_PAIR__VALUE);

		// Create enums
		entityTypeEEnum = createEEnum(ENTITY_TYPE);
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
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);
		Communicative_functionsPackage theCommunicative_functionsPackage = (Communicative_functionsPackage)EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		utteranceEClass.getESuperTypes().add(this.getRule());
		entityEClass.getESuperTypes().add(this.getRule());
		semanticMappingEClass.getESuperTypes().add(this.getRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(rulesetEClass, Ruleset.class, "Ruleset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleset_Identifier(), ecorePackage.getEString(), "identifier", "new_ruleset", 1, 1, Ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleset_Rules(), this.getRule(), null, "rules", null, 0, -1, Ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleset_Language(), theXMLNamespacePackage.getLangType(), "language", null, 1, 1, Ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utteranceEClass, Utterance.class, "Utterance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtterance_Interpretation(), theCommunicative_functionsPackage.getCommunicativeFunction(), null, "interpretation", null, 0, 1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtterance_Phrases(), ecorePackage.getEString(), "phrases", null, 0, -1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtterance_Annotation(), ecorePackage.getEObject(), null, "annotation", null, 0, 1, Utterance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Type(), this.getEntityType(), "type", "static", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Entries(), this.getPhraseValuePair(), null, "entries", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Interpretation(), theCommunicative_functionsPackage.getSemanticContent(), null, "interpretation", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticMappingEClass, SemanticMapping.class, "SemanticMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticMapping_PhraseMappings(), this.getPhraseMapping(), null, "phraseMappings", null, 0, -1, SemanticMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticMapping_MappingTarget(), theCommunicative_functionsPackage.getSemanticContent(), null, "mappingTarget", null, 0, 1, SemanticMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phraseMappingEClass, PhraseMapping.class, "PhraseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhraseMapping_Interpretation(), theCommunicative_functionsPackage.getSemanticContent(), null, "interpretation", null, 0, -1, PhraseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhraseMapping_Phrases(), ecorePackage.getEString(), "phrases", null, 0, -1, PhraseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhraseMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, PhraseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phraseValuePairEClass, PhraseValuePair.class, "PhraseValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhraseValuePair_Phrase(), ecorePackage.getEString(), "phrase", null, 1, 1, PhraseValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhraseValuePair_Value(), ecorePackage.getEString(), "value", null, 1, 1, PhraseValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
		addEEnumLiteral(entityTypeEEnum, EntityType.STATIC);
		addEEnumLiteral(entityTypeEEnum, EntityType.DYNAMIC);

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

} //Grammar_rulesPackageImpl
