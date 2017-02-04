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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl;

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
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;
import de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl;
import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.util.GrammarValidator;
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
public class GrammarPackageImpl extends EPackageImpl implements GrammarPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammar1EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexiconEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneOfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulerefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exampleEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType repeatDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType repeatProbDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rootDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specialDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tagEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tagFormatDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weightDatatypeEDataType = null;

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
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarPackageImpl() {
		super(eNS_URI, GrammarFactory.eINSTANCE);
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
	 * This method is used to initialize {@link GrammarPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarPackage init() {
		if (isInited) return (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Obtain or create and register package
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrammarPackageImpl());

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
		Io_interfacesPackageImpl theIo_interfacesPackage = (Io_interfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) instanceof Io_interfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) : Io_interfacesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		PrimitiveTasksPackageImpl thePrimitiveTasksPackage = (PrimitiveTasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) instanceof PrimitiveTasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) : PrimitiveTasksPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) : OutputPackage.eINSTANCE);
		ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) : ProjectPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theGrammarPackage.createPackageContents();
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
		theSpeechSynthesisPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theGrammarPackage.initializePackageContents();
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
		theSpeechSynthesisPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGrammarPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GrammarValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGrammarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarPackage.eNS_URI, theGrammarPackage);
		return theGrammarPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Grammar() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrammar() {
		return grammarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Group() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrammar_Lexicon() {
		return (EReference)grammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrammar_Meta() {
		return (EReference)grammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrammar_Metadata() {
		return (EReference)grammarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Tag() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Group1() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrammar_Rule() {
		return (EReference)grammarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Base() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Lang() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Mode() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Root() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_TagFormat() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Version() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrammar1() {
		return grammar1EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Mixed() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_RuleExpansion() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Token() {
		return (EReference)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Ruleref() {
		return (EReference)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Item() {
		return (EReference)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_OneOf() {
		return (EReference)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Tag() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Lang() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Repeat() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_RepeatProb() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Weight() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLexicon() {
		return lexiconEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLexicon_Type() {
		return (EAttribute)lexiconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLexicon_Uri() {
		return (EAttribute)lexiconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_Content() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_HttpEquiv() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_Name() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Group() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Any() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_AnyAttribute() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneOf() {
		return oneOfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneOf_Group() {
		return (EAttribute)oneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOneOf_Item() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneOf_Lang() {
		return (EAttribute)oneOfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Mixed() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Group() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Token() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Ruleref() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Item() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_OneOf() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Tag() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Example() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Id() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Scope() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleref() {
		return rulerefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleref_Special() {
		return (EAttribute)rulerefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleref_Type() {
		return (EAttribute)rulerefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleref_Uri() {
		return (EAttribute)rulerefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_Mixed() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_Lang() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModeDatatype() {
		return modeDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScopeDatatype() {
		return scopeDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecialDatatype() {
		return specialDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExample() {
		return exampleEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdDatatype() {
		return idDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModeDatatypeObject() {
		return modeDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRepeatDatatype() {
		return repeatDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRepeatProbDatatype() {
		return repeatProbDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRootDatatype() {
		return rootDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScopeDatatypeObject() {
		return scopeDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpecialDatatypeObject() {
		return specialDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTag() {
		return tagEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTagFormatDatatype() {
		return tagFormatDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeDatatype() {
		return typeDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionDatatype() {
		return versionDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWeightDatatype() {
		return weightDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrammarFactory getGrammarFactory() {
		return (GrammarFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GRAMMAR);

		grammarEClass = createEClass(GRAMMAR);
		createEAttribute(grammarEClass, GRAMMAR__GROUP);
		createEReference(grammarEClass, GRAMMAR__LEXICON);
		createEReference(grammarEClass, GRAMMAR__META);
		createEReference(grammarEClass, GRAMMAR__METADATA);
		createEAttribute(grammarEClass, GRAMMAR__TAG);
		createEAttribute(grammarEClass, GRAMMAR__GROUP1);
		createEReference(grammarEClass, GRAMMAR__RULE);
		createEAttribute(grammarEClass, GRAMMAR__BASE);
		createEAttribute(grammarEClass, GRAMMAR__LANG);
		createEAttribute(grammarEClass, GRAMMAR__MODE);
		createEAttribute(grammarEClass, GRAMMAR__ROOT);
		createEAttribute(grammarEClass, GRAMMAR__TAG_FORMAT);
		createEAttribute(grammarEClass, GRAMMAR__VERSION);

		grammar1EClass = createEClass(GRAMMAR1);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__MIXED);
		createEAttribute(itemEClass, ITEM__RULE_EXPANSION);
		createEReference(itemEClass, ITEM__TOKEN);
		createEReference(itemEClass, ITEM__RULEREF);
		createEReference(itemEClass, ITEM__ITEM);
		createEReference(itemEClass, ITEM__ONE_OF);
		createEAttribute(itemEClass, ITEM__TAG);
		createEAttribute(itemEClass, ITEM__LANG);
		createEAttribute(itemEClass, ITEM__REPEAT);
		createEAttribute(itemEClass, ITEM__REPEAT_PROB);
		createEAttribute(itemEClass, ITEM__WEIGHT);

		lexiconEClass = createEClass(LEXICON);
		createEAttribute(lexiconEClass, LEXICON__TYPE);
		createEAttribute(lexiconEClass, LEXICON__URI);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__CONTENT);
		createEAttribute(metaEClass, META__HTTP_EQUIV);
		createEAttribute(metaEClass, META__NAME);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__GROUP);
		createEAttribute(metadataEClass, METADATA__ANY);
		createEAttribute(metadataEClass, METADATA__ANY_ATTRIBUTE);

		oneOfEClass = createEClass(ONE_OF);
		createEAttribute(oneOfEClass, ONE_OF__GROUP);
		createEReference(oneOfEClass, ONE_OF__ITEM);
		createEAttribute(oneOfEClass, ONE_OF__LANG);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__MIXED);
		createEAttribute(ruleEClass, RULE__GROUP);
		createEReference(ruleEClass, RULE__TOKEN);
		createEReference(ruleEClass, RULE__RULEREF);
		createEReference(ruleEClass, RULE__ITEM);
		createEReference(ruleEClass, RULE__ONE_OF);
		createEAttribute(ruleEClass, RULE__TAG);
		createEAttribute(ruleEClass, RULE__EXAMPLE);
		createEAttribute(ruleEClass, RULE__ID);
		createEAttribute(ruleEClass, RULE__SCOPE);

		rulerefEClass = createEClass(RULEREF);
		createEAttribute(rulerefEClass, RULEREF__SPECIAL);
		createEAttribute(rulerefEClass, RULEREF__TYPE);
		createEAttribute(rulerefEClass, RULEREF__URI);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__MIXED);
		createEAttribute(tokenEClass, TOKEN__LANG);

		// Create enums
		modeDatatypeEEnum = createEEnum(MODE_DATATYPE);
		scopeDatatypeEEnum = createEEnum(SCOPE_DATATYPE);
		specialDatatypeEEnum = createEEnum(SPECIAL_DATATYPE);

		// Create data types
		exampleEDataType = createEDataType(EXAMPLE);
		idDatatypeEDataType = createEDataType(ID_DATATYPE);
		modeDatatypeObjectEDataType = createEDataType(MODE_DATATYPE_OBJECT);
		repeatDatatypeEDataType = createEDataType(REPEAT_DATATYPE);
		repeatProbDatatypeEDataType = createEDataType(REPEAT_PROB_DATATYPE);
		rootDatatypeEDataType = createEDataType(ROOT_DATATYPE);
		scopeDatatypeObjectEDataType = createEDataType(SCOPE_DATATYPE_OBJECT);
		specialDatatypeObjectEDataType = createEDataType(SPECIAL_DATATYPE_OBJECT);
		tagEDataType = createEDataType(TAG);
		tagFormatDatatypeEDataType = createEDataType(TAG_FORMAT_DATATYPE);
		typeDatatypeEDataType = createEDataType(TYPE_DATATYPE);
		versionDatatypeEDataType = createEDataType(VERSION_DATATYPE);
		weightDatatypeEDataType = createEDataType(WEIGHT_DATATYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		grammar1EClass.getESuperTypes().add(this.getGrammar());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Grammar(), this.getGrammar(), null, "grammar", null, 0, 1, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(grammarEClass, Grammar.class, "Grammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrammar_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammar_Lexicon(), this.getLexicon(), null, "lexicon", null, 0, -1, Grammar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGrammar_Meta(), this.getMeta(), null, "meta", null, 0, -1, Grammar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGrammar_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, Grammar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Tag(), this.getTag(), "tag", null, 0, -1, Grammar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammar_Rule(), this.getRule(), null, "rule", null, 0, -1, Grammar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Base(), theXMLTypePackage.getAnyURI(), "base", null, 0, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 1, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Mode(), this.getModeDatatype(), "mode", "voice", 0, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Root(), this.getRootDatatype(), "root", null, 0, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_TagFormat(), this.getTagFormatDatatype(), "tagFormat", null, 0, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Version(), this.getVersionDatatype(), "version", null, 1, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grammar1EClass, Grammar1.class, "Grammar1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_RuleExpansion(), ecorePackage.getEFeatureMapEntry(), "ruleExpansion", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Token(), this.getToken(), null, "token", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Ruleref(), this.getRuleref(), null, "ruleref", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Item(), this.getItem(), null, "item", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItem_OneOf(), this.getOneOf(), null, "oneOf", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Tag(), this.getTag(), "tag", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Repeat(), this.getRepeatDatatype(), "repeat", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_RepeatProb(), this.getRepeatProbDatatype(), "repeatProb", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Weight(), this.getWeightDatatype(), "weight", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lexiconEClass, Lexicon.class, "Lexicon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLexicon_Type(), this.getTypeDatatype(), "type", null, 0, 1, Lexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexicon_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, Lexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Content(), theXMLTypePackage.getString(), "content", null, 1, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_HttpEquiv(), theXMLTypePackage.getNMTOKEN(), "httpEquiv", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Metadata.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneOfEClass, OneOf.class, "OneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneOf_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_Item(), this.getItem(), null, "item", null, 1, -1, OneOf.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneOf_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Token(), this.getToken(), null, "token", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Ruleref(), this.getRuleref(), null, "ruleref", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Item(), this.getItem(), null, "item", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRule_OneOf(), this.getOneOf(), null, "oneOf", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Tag(), this.getTag(), "tag", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Example(), this.getExample(), "example", null, 0, -1, Rule.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Id(), this.getIdDatatype(), "id", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Scope(), this.getScopeDatatype(), "scope", "private", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulerefEClass, Ruleref.class, "Ruleref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleref_Special(), this.getSpecialDatatype(), "special", null, 0, 1, Ruleref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleref_Type(), this.getTypeDatatype(), "type", null, 0, 1, Ruleref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleref_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 0, 1, Ruleref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeDatatypeEEnum, ModeDatatype.class, "ModeDatatype");
		addEEnumLiteral(modeDatatypeEEnum, ModeDatatype.VOICE);
		addEEnumLiteral(modeDatatypeEEnum, ModeDatatype.DTMF);

		initEEnum(scopeDatatypeEEnum, ScopeDatatype.class, "ScopeDatatype");
		addEEnumLiteral(scopeDatatypeEEnum, ScopeDatatype.PRIVATE);
		addEEnumLiteral(scopeDatatypeEEnum, ScopeDatatype.PUBLIC);

		initEEnum(specialDatatypeEEnum, SpecialDatatype.class, "SpecialDatatype");
		addEEnumLiteral(specialDatatypeEEnum, SpecialDatatype.NULL);
		addEEnumLiteral(specialDatatypeEEnum, SpecialDatatype.VOID);
		addEEnumLiteral(specialDatatypeEEnum, SpecialDatatype.GARBAGE);

		// Initialize data types
		initEDataType(exampleEDataType, String.class, "Example", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idDatatypeEDataType, String.class, "IdDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeDatatypeObjectEDataType, ModeDatatype.class, "ModeDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(repeatDatatypeEDataType, String.class, "RepeatDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(repeatProbDatatypeEDataType, BigDecimal.class, "RepeatProbDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rootDatatypeEDataType, String.class, "RootDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scopeDatatypeObjectEDataType, ScopeDatatype.class, "ScopeDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(specialDatatypeObjectEDataType, SpecialDatatype.class, "SpecialDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tagEDataType, String.class, "Tag", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tagFormatDatatypeEDataType, String.class, "TagFormatDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDatatypeEDataType, String.class, "TypeDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionDatatypeEDataType, String.class, "VersionDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(weightDatatypeEDataType, String.class, "WeightDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Grammar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "grammar",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (exampleEDataType, 
		   source, 
		   new String[] {
			 "name", "example",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (grammarEClass, 
		   source, 
		   new String[] {
			 "name", "grammar",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGrammar_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getGrammar_Lexicon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lexicon",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getGrammar_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getGrammar_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getGrammar_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getGrammar_Group1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:5"
		   });	
		addAnnotation
		  (getGrammar_Rule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rule",
			 "namespace", "##targetNamespace",
			 "group", "#group:5"
		   });	
		addAnnotation
		  (getGrammar_Base(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "base",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getGrammar_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getGrammar_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });	
		addAnnotation
		  (getGrammar_Root(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "root"
		   });	
		addAnnotation
		  (getGrammar_TagFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tag-format"
		   });	
		addAnnotation
		  (getGrammar_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (grammar1EClass, 
		   source, 
		   new String[] {
			 "name", "grammar",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (idDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Id.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#ID",
			 "pattern", "[^.:\\-]+"
		   });	
		addAnnotation
		  (itemEClass, 
		   source, 
		   new String[] {
			 "name", "item",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getItem_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getItem_RuleExpansion(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace",
			 "group", "#RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_Ruleref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ruleref",
			 "namespace", "##targetNamespace",
			 "group", "#RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace",
			 "group", "#RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_OneOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one-of",
			 "namespace", "##targetNamespace",
			 "group", "#RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace",
			 "group", "#RuleExpansion:1"
		   });	
		addAnnotation
		  (getItem_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getItem_Repeat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeat"
		   });	
		addAnnotation
		  (getItem_RepeatProb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeat-prob"
		   });	
		addAnnotation
		  (getItem_Weight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "weight"
		   });	
		addAnnotation
		  (lexiconEClass, 
		   source, 
		   new String[] {
			 "name", "lexicon",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLexicon_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getLexicon_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });	
		addAnnotation
		  (metaEClass, 
		   source, 
		   new String[] {
			 "name", "meta",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMeta_Content(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "content"
		   });	
		addAnnotation
		  (getMeta_HttpEquiv(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "http-equiv"
		   });	
		addAnnotation
		  (getMeta_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (metadataEClass, 
		   source, 
		   new String[] {
			 "name", "metadata",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMetadata_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getMetadata_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMetadata_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "strict"
		   });	
		addAnnotation
		  (modeDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Mode.datatype"
		   });	
		addAnnotation
		  (modeDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Mode.datatype:Object",
			 "baseType", "Mode.datatype"
		   });	
		addAnnotation
		  (oneOfEClass, 
		   source, 
		   new String[] {
			 "name", "one-of",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOneOf_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getOneOf_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOf_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (repeatDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Repeat.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+ [0-9]+-([0-9]+)? ([0-9]+)?-[0-9]+"
		   });	
		addAnnotation
		  (repeatProbDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Repeat-prob.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "0.0",
			 "maxInclusive", "1.0"
		   });	
		addAnnotation
		  (rootDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Root.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#IDREF",
			 "pattern", "[^.:\\-]+"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "name", "rule",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getRule_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getRule_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getRule_Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_Ruleref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ruleref",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_OneOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one-of",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_Example(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "example",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getRule_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getRule_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });	
		addAnnotation
		  (rulerefEClass, 
		   source, 
		   new String[] {
			 "name", "ruleref",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRuleref_Special(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "special"
		   });	
		addAnnotation
		  (getRuleref_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getRuleref_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });	
		addAnnotation
		  (scopeDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Scope.datatype"
		   });	
		addAnnotation
		  (scopeDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Scope.datatype:Object",
			 "baseType", "Scope.datatype"
		   });	
		addAnnotation
		  (specialDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Special.datatype"
		   });	
		addAnnotation
		  (specialDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Special.datatype:Object",
			 "baseType", "Special.datatype"
		   });	
		addAnnotation
		  (tagEDataType, 
		   source, 
		   new String[] {
			 "name", "tag",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (tagFormatDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Tag-format.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });	
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
			 "name", "token",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getToken_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getToken_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (typeDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Type.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (versionDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Version.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN"
		   });	
		addAnnotation
		  (weightDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Weight.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]+[.]? ([0-9]+)?[.][0-9]+"
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

} // GrammarPackageImpl
