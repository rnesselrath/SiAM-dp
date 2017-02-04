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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

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
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl;
import java.math.BigDecimal;
import java.util.List;

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

import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.Break;
import de.dfki.iui.mmds.core.model.speech_synthesis.Desc;
import de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis;
import de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale;
import de.dfki.iui.mmds.core.model.speech_synthesis.LangType;
import de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark1;
import de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph;
import de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sentence;
import de.dfki.iui.mmds.core.model.speech_synthesis.Speak;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata;
import de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sub;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;
import de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale;
import de.dfki.iui.mmds.core.model.speech_synthesis.util.SpeechSynthesisValidator;
import de.dfki.iui.mmds.core.model.task.TaskPackage;
import de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeechSynthesisPackageImpl extends EPackageImpl implements SpeechSynthesisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmlSpeechSynthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mark1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phonemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prosodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sayAsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmlLexiconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmlMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmlMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum heightScaleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speedScaleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strengthDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum volumeScaleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ageDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alphabetDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contourDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contourpointDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dbDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emptystringDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fetchhintDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genderDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType heightScaleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hertzNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hertzRelativeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languagesDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonnegpercentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType onlangfailureDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType onvoicefailureDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderingDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderingitemDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderinglistDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phonemetypeDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pitchDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rangeDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rateDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requiredDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requireditemDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requiredlistDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType semitoneEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType speedScaleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strengthDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timedesignationDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variantDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voicenameDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voicenamesDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeScaleObjectEDataType = null;

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpeechSynthesisPackageImpl() {
		super(eNS_URI, SpeechSynthesisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpeechSynthesisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpeechSynthesisPackage init() {
		if (isInited) return (SpeechSynthesisPackage)EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI);

		// Obtain or create and register package
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpeechSynthesisPackageImpl());

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
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theSpeechSynthesisPackage.createPackageContents();
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
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theSpeechSynthesisPackage.initializePackageContents();
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
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSpeechSynthesisPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SpeechSynthesisValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSpeechSynthesisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpeechSynthesisPackage.eNS_URI, theSpeechSynthesisPackage);
		return theSpeechSynthesisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSMLSpeechSynthesis() {
		return ssmlSpeechSynthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSMLSpeechSynthesis_Ssml() {
		return (EAttribute)ssmlSpeechSynthesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSMLSpeechSynthesis_SsmlDocument() {
		return (EReference)ssmlSpeechSynthesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Mixed() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_DescAndSentenceAndStructureClass() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_AwsGroup() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudio_Aws() {
		return (EReference)audioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_StructGroup() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudio_Struct() {
		return (EReference)audioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudio_Lookup() {
		return (EReference)audioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudio_Desc() {
		return (EReference)audioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Any() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Fetchhint() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Fetchtimeout() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Maxage() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Maxstale() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Src() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_AnyAttribute() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreak() {
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreak_Any() {
		return (EAttribute)breakEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreak_Strength() {
		return (EAttribute)breakEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreak_Time() {
		return (EAttribute)breakEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreak_AnyAttribute() {
		return (EAttribute)breakEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesc() {
		return descEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_Mixed() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_Any() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_Lang() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_Onlangfailure() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_AnyAttribute() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSML() {
		return ssmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSML_Mixed() {
		return (EAttribute)ssmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_XMLNSPrefixMap() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_XSISchemaLocation() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Audio() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Aws() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Break() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Desc() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Emphasis() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Lang() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Lookup() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Mark() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_P() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Struct() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Phoneme() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Prosody() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_S() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_SayAs() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Speak() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Sub() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Token() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_Voice() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSML_W() {
		return (EReference)ssmlEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasis() {
		return emphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_Mixed() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_SentenceClass() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_AwsGroup() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmphasis_Aws() {
		return (EReference)emphasisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmphasis_Lookup() {
		return (EReference)emphasisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_Any() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_Level() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasis_AnyAttribute() {
		return (EAttribute)emphasisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangType() {
		return langTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_Mixed() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_Group() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Audio() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Break() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Emphasis() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Lang() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Lookup() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Mark() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_P() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Phoneme() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Prosody() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_SayAs() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Sub() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_S() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Token() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_Voice() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLangType_W() {
		return (EReference)langTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_Any() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_Lang1() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_Onlangfailure() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangType_AnyAttribute() {
		return (EAttribute)langTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupType() {
		return lookupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupType_Mixed() {
		return (EAttribute)lookupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupType_Group() {
		return (EAttribute)lookupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Audio() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Break() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Emphasis() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Lang() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Lookup() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Mark() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_P() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Phoneme() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Prosody() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_SayAs() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Sub() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_S() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Token() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_Voice() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupType_W() {
		return (EReference)lookupTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupType_Any() {
		return (EAttribute)lookupTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupType_Ref() {
		return (EAttribute)lookupTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupType_AnyAttribute() {
		return (EAttribute)lookupTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMark() {
		return markEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMark_Any() {
		return (EAttribute)markEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMark_Name() {
		return (EAttribute)markEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMark_AnyAttribute() {
		return (EAttribute)markEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMark1() {
		return mark1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Mixed() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Group() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_AwsGroup() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Aws() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_S() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Lookup() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Any() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Id() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Lang() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Onlangfailure() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_AnyAttribute() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoneme() {
		return phonemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_Mixed() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_Any() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_Alphabet() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_Ph() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_Type() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneme_AnyAttribute() {
		return (EAttribute)phonemeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProsody() {
		return prosodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Mixed() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_SentenceAndStructureClass() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_AwsGroup() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProsody_Aws() {
		return (EReference)prosodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_StructGroup() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProsody_Struct() {
		return (EReference)prosodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProsody_Lookup() {
		return (EReference)prosodyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Contour() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Duration() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Pitch() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Range() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Rate() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_Volume() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProsody_AnyAttribute() {
		return (EAttribute)prosodyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSayAs() {
		return sayAsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_Mixed() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_Any() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_Detail() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_Format() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_InterpretAs() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayAs_AnyAttribute() {
		return (EAttribute)sayAsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Mixed() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_SentenceClass() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_AwsGroup() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Aws() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Lookup() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Any() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Id() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Lang() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Onlangfailure() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_AnyAttribute() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeak() {
		return speakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Mixed() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Group() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Meta() {
		return (EReference)speakEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Metadata() {
		return (EReference)speakEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Lexicon() {
		return (EReference)speakEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Any() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_AwsGroup() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Aws() {
		return (EReference)speakEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_StructGroup() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Struct() {
		return (EReference)speakEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Lookup() {
		return (EReference)speakEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Group1() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_AwsGroup1() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Aws1() {
		return (EReference)speakEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_StructGroup1() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Struct1() {
		return (EReference)speakEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeak_Lookup1() {
		return (EReference)speakEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Any1() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Base() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Endmark() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Lang() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Onlangfailure() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Startmark() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_Version() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeak_AnyAttribute() {
		return (EAttribute)speakEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsmlLexicon() {
		return ssmlLexiconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Any() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Fetchtimeout() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Id() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Maxage() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Maxstale() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Type() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_Uri() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlLexicon_AnyAttribute() {
		return (EAttribute)ssmlLexiconEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsmlMeta() {
		return ssmlMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMeta_Any() {
		return (EAttribute)ssmlMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMeta_Content() {
		return (EAttribute)ssmlMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMeta_HttpEquiv() {
		return (EAttribute)ssmlMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMeta_Name() {
		return (EAttribute)ssmlMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMeta_AnyAttribute() {
		return (EAttribute)ssmlMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsmlMetadata() {
		return ssmlMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMetadata_Any() {
		return (EAttribute)ssmlMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsmlMetadata_AnyAttribute() {
		return (EAttribute)ssmlMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSub() {
		return subEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSub_Mixed() {
		return (EAttribute)subEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSub_Any() {
		return (EAttribute)subEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSub_Alias() {
		return (EAttribute)subEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSub_AnyAttribute() {
		return (EAttribute)subEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenType() {
		return tokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Mixed() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Group() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Audio() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Break() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Emphasis() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Mark() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Phoneme() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Prosody() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_SayAs() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Sub() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Voice() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Any() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Id() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Lang() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Onlangfailure() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_Role() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_AnyAttribute() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoice() {
		return voiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Mixed() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_SentenceAndStructureClass() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_AwsGroup() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoice_Aws() {
		return (EReference)voiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_StructGroup() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoice_Struct() {
		return (EReference)voiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoice_Lookup() {
		return (EReference)voiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Age() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Gender() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Languages() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Name() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Onvoicefailure() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Ordering() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Required() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_Variant() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoice_AnyAttribute() {
		return (EAttribute)voiceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderDatatype() {
		return genderDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeightScale() {
		return heightScaleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelDatatype() {
		return levelDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpeedScale() {
		return speedScaleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrengthDatatype() {
		return strengthDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVolumeScale() {
		return volumeScaleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAgeDatatype() {
		return ageDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlphabetDatatype() {
		return alphabetDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContourDatatype() {
		return contourDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContourpointDatatype() {
		return contourpointDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDbDatatype() {
		return dbDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDuration() {
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEmptystringDatatype() {
		return emptystringDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFetchhintDatatype() {
		return fetchhintDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenderDatatypeObject() {
		return genderDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHeightScaleObject() {
		return heightScaleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHertzNumber() {
		return hertzNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHertzRelative() {
		return hertzRelativeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguagesDatatype() {
		return languagesDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLevelDatatypeObject() {
		return levelDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameDatatype() {
		return nameDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonnegpercent() {
		return nonnegpercentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOnlangfailureDatatype() {
		return onlangfailureDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOnvoicefailureDatatype() {
		return onvoicefailureDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderingDatatype() {
		return orderingDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderingitemDatatype() {
		return orderingitemDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderinglistDatatype() {
		return orderinglistDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhonemetypeDatatype() {
		return phonemetypeDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPitchDatatype() {
		return pitchDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRangeDatatype() {
		return rangeDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRateDatatype() {
		return rateDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelative() {
		return relativeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequiredDatatype() {
		return requiredDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequireditemDatatype() {
		return requireditemDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequiredlistDatatype() {
		return requiredlistDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleDatatype() {
		return roleDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSemitone() {
		return semitoneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpeedScaleObject() {
		return speedScaleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrengthDatatypeObject() {
		return strengthDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimedesignationDatatype() {
		return timedesignationDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariantDatatype() {
		return variantDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionDatatype() {
		return versionDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoicenameDatatype() {
		return voicenameDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoicenamesDatatype() {
		return voicenamesDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVolumeDatatype() {
		return volumeDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVolumeScaleObject() {
		return volumeScaleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechSynthesisFactory getSpeechSynthesisFactory() {
		return (SpeechSynthesisFactory)getEFactoryInstance();
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
		ssmlSpeechSynthesisEClass = createEClass(SSML_SPEECH_SYNTHESIS);
		createEAttribute(ssmlSpeechSynthesisEClass, SSML_SPEECH_SYNTHESIS__SSML);
		createEReference(ssmlSpeechSynthesisEClass, SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__MIXED);
		createEAttribute(audioEClass, AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS);
		createEAttribute(audioEClass, AUDIO__AWS_GROUP);
		createEReference(audioEClass, AUDIO__AWS);
		createEAttribute(audioEClass, AUDIO__STRUCT_GROUP);
		createEReference(audioEClass, AUDIO__STRUCT);
		createEReference(audioEClass, AUDIO__LOOKUP);
		createEReference(audioEClass, AUDIO__DESC);
		createEAttribute(audioEClass, AUDIO__ANY);
		createEAttribute(audioEClass, AUDIO__FETCHHINT);
		createEAttribute(audioEClass, AUDIO__FETCHTIMEOUT);
		createEAttribute(audioEClass, AUDIO__MAXAGE);
		createEAttribute(audioEClass, AUDIO__MAXSTALE);
		createEAttribute(audioEClass, AUDIO__SRC);
		createEAttribute(audioEClass, AUDIO__ANY_ATTRIBUTE);

		breakEClass = createEClass(BREAK);
		createEAttribute(breakEClass, BREAK__ANY);
		createEAttribute(breakEClass, BREAK__STRENGTH);
		createEAttribute(breakEClass, BREAK__TIME);
		createEAttribute(breakEClass, BREAK__ANY_ATTRIBUTE);

		descEClass = createEClass(DESC);
		createEAttribute(descEClass, DESC__MIXED);
		createEAttribute(descEClass, DESC__ANY);
		createEAttribute(descEClass, DESC__LANG);
		createEAttribute(descEClass, DESC__ONLANGFAILURE);
		createEAttribute(descEClass, DESC__ANY_ATTRIBUTE);

		ssmlEClass = createEClass(SSML);
		createEAttribute(ssmlEClass, SSML__MIXED);
		createEReference(ssmlEClass, SSML__XMLNS_PREFIX_MAP);
		createEReference(ssmlEClass, SSML__XSI_SCHEMA_LOCATION);
		createEReference(ssmlEClass, SSML__AUDIO);
		createEReference(ssmlEClass, SSML__AWS);
		createEReference(ssmlEClass, SSML__BREAK);
		createEReference(ssmlEClass, SSML__DESC);
		createEReference(ssmlEClass, SSML__EMPHASIS);
		createEReference(ssmlEClass, SSML__LANG);
		createEReference(ssmlEClass, SSML__LOOKUP);
		createEReference(ssmlEClass, SSML__MARK);
		createEReference(ssmlEClass, SSML__P);
		createEReference(ssmlEClass, SSML__STRUCT);
		createEReference(ssmlEClass, SSML__PHONEME);
		createEReference(ssmlEClass, SSML__PROSODY);
		createEReference(ssmlEClass, SSML__S);
		createEReference(ssmlEClass, SSML__SAY_AS);
		createEReference(ssmlEClass, SSML__SPEAK);
		createEReference(ssmlEClass, SSML__SUB);
		createEReference(ssmlEClass, SSML__TOKEN);
		createEReference(ssmlEClass, SSML__VOICE);
		createEReference(ssmlEClass, SSML__W);

		emphasisEClass = createEClass(EMPHASIS);
		createEAttribute(emphasisEClass, EMPHASIS__MIXED);
		createEAttribute(emphasisEClass, EMPHASIS__SENTENCE_CLASS);
		createEAttribute(emphasisEClass, EMPHASIS__AWS_GROUP);
		createEReference(emphasisEClass, EMPHASIS__AWS);
		createEReference(emphasisEClass, EMPHASIS__LOOKUP);
		createEAttribute(emphasisEClass, EMPHASIS__ANY);
		createEAttribute(emphasisEClass, EMPHASIS__LEVEL);
		createEAttribute(emphasisEClass, EMPHASIS__ANY_ATTRIBUTE);

		langTypeEClass = createEClass(LANG_TYPE);
		createEAttribute(langTypeEClass, LANG_TYPE__MIXED);
		createEAttribute(langTypeEClass, LANG_TYPE__GROUP);
		createEReference(langTypeEClass, LANG_TYPE__AUDIO);
		createEReference(langTypeEClass, LANG_TYPE__BREAK);
		createEReference(langTypeEClass, LANG_TYPE__EMPHASIS);
		createEReference(langTypeEClass, LANG_TYPE__LANG);
		createEReference(langTypeEClass, LANG_TYPE__LOOKUP);
		createEReference(langTypeEClass, LANG_TYPE__MARK);
		createEReference(langTypeEClass, LANG_TYPE__P);
		createEReference(langTypeEClass, LANG_TYPE__PHONEME);
		createEReference(langTypeEClass, LANG_TYPE__PROSODY);
		createEReference(langTypeEClass, LANG_TYPE__SAY_AS);
		createEReference(langTypeEClass, LANG_TYPE__SUB);
		createEReference(langTypeEClass, LANG_TYPE__S);
		createEReference(langTypeEClass, LANG_TYPE__TOKEN);
		createEReference(langTypeEClass, LANG_TYPE__VOICE);
		createEReference(langTypeEClass, LANG_TYPE__W);
		createEAttribute(langTypeEClass, LANG_TYPE__ANY);
		createEAttribute(langTypeEClass, LANG_TYPE__LANG1);
		createEAttribute(langTypeEClass, LANG_TYPE__ONLANGFAILURE);
		createEAttribute(langTypeEClass, LANG_TYPE__ANY_ATTRIBUTE);

		lookupTypeEClass = createEClass(LOOKUP_TYPE);
		createEAttribute(lookupTypeEClass, LOOKUP_TYPE__MIXED);
		createEAttribute(lookupTypeEClass, LOOKUP_TYPE__GROUP);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__AUDIO);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__BREAK);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__EMPHASIS);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__LANG);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__LOOKUP);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__MARK);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__P);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__PHONEME);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__PROSODY);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__SAY_AS);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__SUB);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__S);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__TOKEN);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__VOICE);
		createEReference(lookupTypeEClass, LOOKUP_TYPE__W);
		createEAttribute(lookupTypeEClass, LOOKUP_TYPE__ANY);
		createEAttribute(lookupTypeEClass, LOOKUP_TYPE__REF);
		createEAttribute(lookupTypeEClass, LOOKUP_TYPE__ANY_ATTRIBUTE);

		markEClass = createEClass(MARK);
		createEAttribute(markEClass, MARK__ANY);
		createEAttribute(markEClass, MARK__NAME);
		createEAttribute(markEClass, MARK__ANY_ATTRIBUTE);

		mark1EClass = createEClass(MARK1);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__MIXED);
		createEAttribute(paragraphEClass, PARAGRAPH__GROUP);
		createEAttribute(paragraphEClass, PARAGRAPH__AWS_GROUP);
		createEReference(paragraphEClass, PARAGRAPH__AWS);
		createEReference(paragraphEClass, PARAGRAPH__S);
		createEReference(paragraphEClass, PARAGRAPH__LOOKUP);
		createEAttribute(paragraphEClass, PARAGRAPH__ANY);
		createEAttribute(paragraphEClass, PARAGRAPH__ID);
		createEAttribute(paragraphEClass, PARAGRAPH__LANG);
		createEAttribute(paragraphEClass, PARAGRAPH__ONLANGFAILURE);
		createEAttribute(paragraphEClass, PARAGRAPH__ANY_ATTRIBUTE);

		phonemeEClass = createEClass(PHONEME);
		createEAttribute(phonemeEClass, PHONEME__MIXED);
		createEAttribute(phonemeEClass, PHONEME__ANY);
		createEAttribute(phonemeEClass, PHONEME__ALPHABET);
		createEAttribute(phonemeEClass, PHONEME__PH);
		createEAttribute(phonemeEClass, PHONEME__TYPE);
		createEAttribute(phonemeEClass, PHONEME__ANY_ATTRIBUTE);

		prosodyEClass = createEClass(PROSODY);
		createEAttribute(prosodyEClass, PROSODY__MIXED);
		createEAttribute(prosodyEClass, PROSODY__SENTENCE_AND_STRUCTURE_CLASS);
		createEAttribute(prosodyEClass, PROSODY__AWS_GROUP);
		createEReference(prosodyEClass, PROSODY__AWS);
		createEAttribute(prosodyEClass, PROSODY__STRUCT_GROUP);
		createEReference(prosodyEClass, PROSODY__STRUCT);
		createEReference(prosodyEClass, PROSODY__LOOKUP);
		createEAttribute(prosodyEClass, PROSODY__CONTOUR);
		createEAttribute(prosodyEClass, PROSODY__DURATION);
		createEAttribute(prosodyEClass, PROSODY__PITCH);
		createEAttribute(prosodyEClass, PROSODY__RANGE);
		createEAttribute(prosodyEClass, PROSODY__RATE);
		createEAttribute(prosodyEClass, PROSODY__VOLUME);
		createEAttribute(prosodyEClass, PROSODY__ANY_ATTRIBUTE);

		sayAsEClass = createEClass(SAY_AS);
		createEAttribute(sayAsEClass, SAY_AS__MIXED);
		createEAttribute(sayAsEClass, SAY_AS__ANY);
		createEAttribute(sayAsEClass, SAY_AS__DETAIL);
		createEAttribute(sayAsEClass, SAY_AS__FORMAT);
		createEAttribute(sayAsEClass, SAY_AS__INTERPRET_AS);
		createEAttribute(sayAsEClass, SAY_AS__ANY_ATTRIBUTE);

		sentenceEClass = createEClass(SENTENCE);
		createEAttribute(sentenceEClass, SENTENCE__MIXED);
		createEAttribute(sentenceEClass, SENTENCE__SENTENCE_CLASS);
		createEAttribute(sentenceEClass, SENTENCE__AWS_GROUP);
		createEReference(sentenceEClass, SENTENCE__AWS);
		createEReference(sentenceEClass, SENTENCE__LOOKUP);
		createEAttribute(sentenceEClass, SENTENCE__ANY);
		createEAttribute(sentenceEClass, SENTENCE__ID);
		createEAttribute(sentenceEClass, SENTENCE__LANG);
		createEAttribute(sentenceEClass, SENTENCE__ONLANGFAILURE);
		createEAttribute(sentenceEClass, SENTENCE__ANY_ATTRIBUTE);

		speakEClass = createEClass(SPEAK);
		createEAttribute(speakEClass, SPEAK__MIXED);
		createEAttribute(speakEClass, SPEAK__GROUP);
		createEReference(speakEClass, SPEAK__META);
		createEReference(speakEClass, SPEAK__METADATA);
		createEReference(speakEClass, SPEAK__LEXICON);
		createEAttribute(speakEClass, SPEAK__ANY);
		createEAttribute(speakEClass, SPEAK__AWS_GROUP);
		createEReference(speakEClass, SPEAK__AWS);
		createEAttribute(speakEClass, SPEAK__STRUCT_GROUP);
		createEReference(speakEClass, SPEAK__STRUCT);
		createEReference(speakEClass, SPEAK__LOOKUP);
		createEAttribute(speakEClass, SPEAK__GROUP1);
		createEAttribute(speakEClass, SPEAK__AWS_GROUP1);
		createEReference(speakEClass, SPEAK__AWS1);
		createEAttribute(speakEClass, SPEAK__STRUCT_GROUP1);
		createEReference(speakEClass, SPEAK__STRUCT1);
		createEReference(speakEClass, SPEAK__LOOKUP1);
		createEAttribute(speakEClass, SPEAK__ANY1);
		createEAttribute(speakEClass, SPEAK__BASE);
		createEAttribute(speakEClass, SPEAK__ENDMARK);
		createEAttribute(speakEClass, SPEAK__LANG);
		createEAttribute(speakEClass, SPEAK__ONLANGFAILURE);
		createEAttribute(speakEClass, SPEAK__STARTMARK);
		createEAttribute(speakEClass, SPEAK__VERSION);
		createEAttribute(speakEClass, SPEAK__ANY_ATTRIBUTE);

		ssmlLexiconEClass = createEClass(SSML_LEXICON);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__ANY);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__FETCHTIMEOUT);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__ID);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__MAXAGE);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__MAXSTALE);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__TYPE);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__URI);
		createEAttribute(ssmlLexiconEClass, SSML_LEXICON__ANY_ATTRIBUTE);

		ssmlMetaEClass = createEClass(SSML_META);
		createEAttribute(ssmlMetaEClass, SSML_META__ANY);
		createEAttribute(ssmlMetaEClass, SSML_META__CONTENT);
		createEAttribute(ssmlMetaEClass, SSML_META__HTTP_EQUIV);
		createEAttribute(ssmlMetaEClass, SSML_META__NAME);
		createEAttribute(ssmlMetaEClass, SSML_META__ANY_ATTRIBUTE);

		ssmlMetadataEClass = createEClass(SSML_METADATA);
		createEAttribute(ssmlMetadataEClass, SSML_METADATA__ANY);
		createEAttribute(ssmlMetadataEClass, SSML_METADATA__ANY_ATTRIBUTE);

		subEClass = createEClass(SUB);
		createEAttribute(subEClass, SUB__MIXED);
		createEAttribute(subEClass, SUB__ANY);
		createEAttribute(subEClass, SUB__ALIAS);
		createEAttribute(subEClass, SUB__ANY_ATTRIBUTE);

		tokenTypeEClass = createEClass(TOKEN_TYPE);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__MIXED);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__GROUP);
		createEReference(tokenTypeEClass, TOKEN_TYPE__AUDIO);
		createEReference(tokenTypeEClass, TOKEN_TYPE__BREAK);
		createEReference(tokenTypeEClass, TOKEN_TYPE__EMPHASIS);
		createEReference(tokenTypeEClass, TOKEN_TYPE__MARK);
		createEReference(tokenTypeEClass, TOKEN_TYPE__PHONEME);
		createEReference(tokenTypeEClass, TOKEN_TYPE__PROSODY);
		createEReference(tokenTypeEClass, TOKEN_TYPE__SAY_AS);
		createEReference(tokenTypeEClass, TOKEN_TYPE__SUB);
		createEReference(tokenTypeEClass, TOKEN_TYPE__VOICE);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__ANY);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__ID);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__LANG);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__ONLANGFAILURE);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__ROLE);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__ANY_ATTRIBUTE);

		voiceEClass = createEClass(VOICE);
		createEAttribute(voiceEClass, VOICE__MIXED);
		createEAttribute(voiceEClass, VOICE__SENTENCE_AND_STRUCTURE_CLASS);
		createEAttribute(voiceEClass, VOICE__AWS_GROUP);
		createEReference(voiceEClass, VOICE__AWS);
		createEAttribute(voiceEClass, VOICE__STRUCT_GROUP);
		createEReference(voiceEClass, VOICE__STRUCT);
		createEReference(voiceEClass, VOICE__LOOKUP);
		createEAttribute(voiceEClass, VOICE__AGE);
		createEAttribute(voiceEClass, VOICE__GENDER);
		createEAttribute(voiceEClass, VOICE__LANGUAGES);
		createEAttribute(voiceEClass, VOICE__NAME);
		createEAttribute(voiceEClass, VOICE__ONVOICEFAILURE);
		createEAttribute(voiceEClass, VOICE__ORDERING);
		createEAttribute(voiceEClass, VOICE__REQUIRED);
		createEAttribute(voiceEClass, VOICE__VARIANT);
		createEAttribute(voiceEClass, VOICE__ANY_ATTRIBUTE);

		// Create enums
		genderDatatypeEEnum = createEEnum(GENDER_DATATYPE);
		heightScaleEEnum = createEEnum(HEIGHT_SCALE);
		levelDatatypeEEnum = createEEnum(LEVEL_DATATYPE);
		speedScaleEEnum = createEEnum(SPEED_SCALE);
		strengthDatatypeEEnum = createEEnum(STRENGTH_DATATYPE);
		volumeScaleEEnum = createEEnum(VOLUME_SCALE);

		// Create data types
		ageDatatypeEDataType = createEDataType(AGE_DATATYPE);
		alphabetDatatypeEDataType = createEDataType(ALPHABET_DATATYPE);
		contourDatatypeEDataType = createEDataType(CONTOUR_DATATYPE);
		contourpointDatatypeEDataType = createEDataType(CONTOURPOINT_DATATYPE);
		dbDatatypeEDataType = createEDataType(DB_DATATYPE);
		durationEDataType = createEDataType(DURATION);
		emptystringDatatypeEDataType = createEDataType(EMPTYSTRING_DATATYPE);
		fetchhintDatatypeEDataType = createEDataType(FETCHHINT_DATATYPE);
		genderDatatypeObjectEDataType = createEDataType(GENDER_DATATYPE_OBJECT);
		heightScaleObjectEDataType = createEDataType(HEIGHT_SCALE_OBJECT);
		hertzNumberEDataType = createEDataType(HERTZ_NUMBER);
		hertzRelativeEDataType = createEDataType(HERTZ_RELATIVE);
		languagesDatatypeEDataType = createEDataType(LANGUAGES_DATATYPE);
		levelDatatypeObjectEDataType = createEDataType(LEVEL_DATATYPE_OBJECT);
		nameDatatypeEDataType = createEDataType(NAME_DATATYPE);
		nonnegpercentEDataType = createEDataType(NONNEGPERCENT);
		numberEDataType = createEDataType(NUMBER);
		onlangfailureDatatypeEDataType = createEDataType(ONLANGFAILURE_DATATYPE);
		onvoicefailureDatatypeEDataType = createEDataType(ONVOICEFAILURE_DATATYPE);
		orderingDatatypeEDataType = createEDataType(ORDERING_DATATYPE);
		orderingitemDatatypeEDataType = createEDataType(ORDERINGITEM_DATATYPE);
		orderinglistDatatypeEDataType = createEDataType(ORDERINGLIST_DATATYPE);
		percentEDataType = createEDataType(PERCENT);
		phonemetypeDatatypeEDataType = createEDataType(PHONEMETYPE_DATATYPE);
		pitchDatatypeEDataType = createEDataType(PITCH_DATATYPE);
		rangeDatatypeEDataType = createEDataType(RANGE_DATATYPE);
		rateDatatypeEDataType = createEDataType(RATE_DATATYPE);
		relativeEDataType = createEDataType(RELATIVE);
		requiredDatatypeEDataType = createEDataType(REQUIRED_DATATYPE);
		requireditemDatatypeEDataType = createEDataType(REQUIREDITEM_DATATYPE);
		requiredlistDatatypeEDataType = createEDataType(REQUIREDLIST_DATATYPE);
		roleDatatypeEDataType = createEDataType(ROLE_DATATYPE);
		semitoneEDataType = createEDataType(SEMITONE);
		speedScaleObjectEDataType = createEDataType(SPEED_SCALE_OBJECT);
		strengthDatatypeObjectEDataType = createEDataType(STRENGTH_DATATYPE_OBJECT);
		timedesignationDatatypeEDataType = createEDataType(TIMEDESIGNATION_DATATYPE);
		variantDatatypeEDataType = createEDataType(VARIANT_DATATYPE);
		versionDatatypeEDataType = createEDataType(VERSION_DATATYPE);
		voicenameDatatypeEDataType = createEDataType(VOICENAME_DATATYPE);
		voicenamesDatatypeEDataType = createEDataType(VOICENAMES_DATATYPE);
		volumeDatatypeEDataType = createEDataType(VOLUME_DATATYPE);
		volumeScaleObjectEDataType = createEDataType(VOLUME_SCALE_OBJECT);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ssmlSpeechSynthesisEClass.getESuperTypes().add(theIo_interfacesPackage.getISpeechSynthesis());
		mark1EClass.getESuperTypes().add(this.getMark());

		// Initialize classes, features, and operations; add parameters
		initEClass(ssmlSpeechSynthesisEClass, SSMLSpeechSynthesis.class, "SSMLSpeechSynthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSSMLSpeechSynthesis_Ssml(), theBasePackage.getBString(), "ssml", null, 0, 1, SSMLSpeechSynthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSMLSpeechSynthesis_SsmlDocument(), this.getSSML(), null, "ssmlDocument", null, 0, 1, SSMLSpeechSynthesis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_DescAndSentenceAndStructureClass(), ecorePackage.getEFeatureMapEntry(), "descAndSentenceAndStructureClass", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAudio_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_StructGroup(), ecorePackage.getEFeatureMapEntry(), "structGroup", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAudio_Struct(), ecorePackage.getEObject(), null, "struct", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAudio_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAudio_Desc(), this.getDesc(), null, "desc", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Audio.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Fetchhint(), this.getFetchhintDatatype(), "fetchhint", "prefetch", 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Fetchtimeout(), this.getTimedesignationDatatype(), "fetchtimeout", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Maxage(), theXMLTypePackage.getNonNegativeInteger(), "maxage", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Maxstale(), theXMLTypePackage.getNonNegativeInteger(), "maxstale", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreak_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreak_Strength(), this.getStrengthDatatype(), "strength", "medium", 0, 1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreak_Time(), this.getDuration(), "time", null, 0, 1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreak_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesc_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Desc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesc_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Desc.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesc_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, Desc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesc_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, Desc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesc_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Desc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssmlEClass, de.dfki.iui.mmds.core.model.speech_synthesis.SSML.class, "SSML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSSML_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Audio(), this.getAudio(), null, "audio", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Break(), this.getBreak(), null, "break", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Desc(), this.getDesc(), null, "desc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Emphasis(), this.getEmphasis(), null, "emphasis", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Lang(), this.getLangType(), null, "lang", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Lookup(), this.getLookupType(), null, "lookup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Mark(), this.getMark1(), null, "mark", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_P(), this.getParagraph(), null, "p", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Struct(), ecorePackage.getEObject(), null, "struct", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Phoneme(), this.getPhoneme(), null, "phoneme", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Prosody(), this.getProsody(), null, "prosody", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_S(), this.getSentence(), null, "s", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_SayAs(), this.getSayAs(), null, "sayAs", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Speak(), this.getSpeak(), null, "speak", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Sub(), this.getSub(), null, "sub", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Token(), this.getTokenType(), null, "token", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_Voice(), this.getVoice(), null, "voice", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSSML_W(), this.getTokenType(), null, "w", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emphasisEClass, Emphasis.class, "Emphasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmphasis_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Emphasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasis_SentenceClass(), ecorePackage.getEFeatureMapEntry(), "sentenceClass", null, 0, -1, Emphasis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasis_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Emphasis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEmphasis_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Emphasis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEmphasis_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Emphasis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasis_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Emphasis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasis_Level(), this.getLevelDatatype(), "level", "moderate", 0, 1, Emphasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasis_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Emphasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(langTypeEClass, LangType.class, "LangType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Audio(), this.getAudio(), null, "audio", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Break(), this.getBreak(), null, "break", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Emphasis(), this.getEmphasis(), null, "emphasis", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Lang(), this.getLangType(), null, "lang", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Mark(), this.getMark1(), null, "mark", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_P(), this.getParagraph(), null, "p", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Phoneme(), this.getPhoneme(), null, "phoneme", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Prosody(), this.getProsody(), null, "prosody", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_SayAs(), this.getSayAs(), null, "sayAs", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Sub(), this.getSub(), null, "sub", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_S(), this.getSentence(), null, "s", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Token(), this.getTokenType(), null, "token", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_Voice(), this.getVoice(), null, "voice", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLangType_W(), this.getTokenType(), null, "w", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, LangType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 1, 1, LangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangType_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, LangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupTypeEClass, LookupType.class, "LookupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LookupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Audio(), this.getAudio(), null, "audio", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Break(), this.getBreak(), null, "break", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Emphasis(), this.getEmphasis(), null, "emphasis", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Lang(), this.getLangType(), null, "lang", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Mark(), this.getMark1(), null, "mark", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_P(), this.getParagraph(), null, "p", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Phoneme(), this.getPhoneme(), null, "phoneme", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Prosody(), this.getProsody(), null, "prosody", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_SayAs(), this.getSayAs(), null, "sayAs", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Sub(), this.getSub(), null, "sub", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_S(), this.getSentence(), null, "s", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Token(), this.getTokenType(), null, "token", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_Voice(), this.getVoice(), null, "voice", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLookupType_W(), this.getTokenType(), null, "w", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, LookupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 1, 1, LookupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LookupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markEClass, Mark.class, "Mark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMark_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Mark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMark_Name(), theXMLTypePackage.getToken(), "name", null, 0, 1, Mark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMark_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Mark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mark1EClass, Mark1.class, "Mark1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_S(), this.getSentence(), null, "s", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Paragraph.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phonemeEClass, Phoneme.class, "Phoneme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhoneme_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Phoneme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoneme_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Phoneme.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoneme_Alphabet(), this.getAlphabetDatatype(), "alphabet", null, 0, 1, Phoneme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoneme_Ph(), theXMLTypePackage.getString(), "ph", null, 1, 1, Phoneme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoneme_Type(), this.getPhonemetypeDatatype(), "type", "default", 0, -1, Phoneme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoneme_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Phoneme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prosodyEClass, Prosody.class, "Prosody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProsody_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_SentenceAndStructureClass(), ecorePackage.getEFeatureMapEntry(), "sentenceAndStructureClass", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProsody_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_StructGroup(), ecorePackage.getEFeatureMapEntry(), "structGroup", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProsody_Struct(), ecorePackage.getEObject(), null, "struct", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProsody_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Prosody.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Contour(), this.getContourDatatype(), "contour", null, 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Duration(), this.getDuration(), "duration", null, 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Pitch(), this.getPitchDatatype(), "pitch", null, 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Range(), this.getRangeDatatype(), "range", null, 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Rate(), this.getRateDatatype(), "rate", null, 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_Volume(), this.getVolumeDatatype(), "volume", "+0.0dB", 0, 1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProsody_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Prosody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sayAsEClass, SayAs.class, "SayAs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSayAs_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SayAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayAs_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SayAs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayAs_Detail(), theXMLTypePackage.getNMTOKEN(), "detail", null, 0, 1, SayAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayAs_Format(), theXMLTypePackage.getNMTOKEN(), "format", null, 0, 1, SayAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayAs_InterpretAs(), theXMLTypePackage.getNMTOKEN(), "interpretAs", null, 1, 1, SayAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayAs_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SayAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentence_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_SentenceClass(), ecorePackage.getEFeatureMapEntry(), "sentenceClass", null, 0, -1, Sentence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Sentence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Sentence.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Sentence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Sentence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speakEClass, Speak.class, "Speak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeak_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Meta(), this.getSsmlMeta(), null, "meta", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Metadata(), this.getSsmlMetadata(), null, "metadata", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Lexicon(), this.getSsmlLexicon(), null, "lexicon", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, 1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, 1, Speak.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_StructGroup(), ecorePackage.getEFeatureMapEntry(), "structGroup", null, 0, 1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Struct(), ecorePackage.getEObject(), null, "struct", null, 0, 1, Speak.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Lookup(), this.getLookupType(), null, "lookup", null, 0, 1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_AwsGroup1(), ecorePackage.getEFeatureMapEntry(), "awsGroup1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Aws1(), ecorePackage.getEObject(), null, "aws1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_StructGroup1(), ecorePackage.getEFeatureMapEntry(), "structGroup1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Struct1(), ecorePackage.getEObject(), null, "struct1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpeak_Lookup1(), this.getLookupType(), null, "lookup1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, Speak.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Base(), theXMLTypePackage.getAnyURI(), "base", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Endmark(), theXMLTypePackage.getToken(), "endmark", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Lang(), theXMLNamespacePackage.getLangType(), "lang", "en", 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Startmark(), theXMLTypePackage.getToken(), "startmark", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_Version(), this.getVersionDatatype(), "version", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeak_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssmlLexiconEClass, SsmlLexicon.class, "SsmlLexicon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsmlLexicon_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Fetchtimeout(), this.getTimedesignationDatatype(), "fetchtimeout", null, 0, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Maxage(), theXMLTypePackage.getNonNegativeInteger(), "maxage", null, 0, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Maxstale(), theXMLTypePackage.getNonNegativeInteger(), "maxstale", null, 0, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Type(), theXMLTypePackage.getString(), "type", "application/pls+xml", 0, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlLexicon_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SsmlLexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssmlMetaEClass, SsmlMeta.class, "SsmlMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsmlMeta_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SsmlMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlMeta_Content(), theXMLTypePackage.getString(), "content", null, 1, 1, SsmlMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlMeta_HttpEquiv(), theXMLTypePackage.getNMTOKEN(), "httpEquiv", null, 0, 1, SsmlMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlMeta_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, SsmlMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlMeta_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SsmlMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssmlMetadataEClass, SsmlMetadata.class, "SsmlMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsmlMetadata_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SsmlMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsmlMetadata_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SsmlMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subEClass, Sub.class, "Sub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSub_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Sub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSub_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Sub.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSub_Alias(), theXMLTypePackage.getString(), "alias", null, 1, 1, Sub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSub_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Sub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenTypeEClass, TokenType.class, "TokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Audio(), this.getAudio(), null, "audio", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Break(), this.getBreak(), null, "break", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Emphasis(), this.getEmphasis(), null, "emphasis", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Mark(), this.getMark1(), null, "mark", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Phoneme(), this.getPhoneme(), null, "phoneme", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Prosody(), this.getProsody(), null, "prosody", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_SayAs(), this.getSayAs(), null, "sayAs", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Sub(), this.getSub(), null, "sub", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTokenType_Voice(), this.getVoice(), null, "voice", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TokenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Onlangfailure(), this.getOnlangfailureDatatype(), "onlangfailure", null, 0, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_Role(), this.getRoleDatatype(), "role", null, 0, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voiceEClass, Voice.class, "Voice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoice_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_SentenceAndStructureClass(), ecorePackage.getEFeatureMapEntry(), "sentenceAndStructureClass", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_AwsGroup(), ecorePackage.getEFeatureMapEntry(), "awsGroup", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVoice_Aws(), ecorePackage.getEObject(), null, "aws", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_StructGroup(), ecorePackage.getEFeatureMapEntry(), "structGroup", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVoice_Struct(), ecorePackage.getEObject(), null, "struct", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVoice_Lookup(), this.getLookupType(), null, "lookup", null, 0, -1, Voice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Age(), this.getAgeDatatype(), "age", null, 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Gender(), this.getGenderDatatype(), "gender", null, 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Languages(), this.getLanguagesDatatype(), "languages", null, 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Name(), this.getNameDatatype(), "name", null, 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Onvoicefailure(), this.getOnvoicefailureDatatype(), "onvoicefailure", "priorityselect", 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Ordering(), this.getOrderingDatatype(), "ordering", "languages", 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Required(), this.getRequiredDatatype(), "required", "languages", 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_Variant(), this.getVariantDatatype(), "variant", null, 0, 1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoice_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Voice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderDatatypeEEnum, GenderDatatype.class, "GenderDatatype");
		addEEnumLiteral(genderDatatypeEEnum, GenderDatatype.MALE);
		addEEnumLiteral(genderDatatypeEEnum, GenderDatatype.FEMALE);
		addEEnumLiteral(genderDatatypeEEnum, GenderDatatype.NEUTRAL);
		addEEnumLiteral(genderDatatypeEEnum, GenderDatatype._);

		initEEnum(heightScaleEEnum, HeightScale.class, "HeightScale");
		addEEnumLiteral(heightScaleEEnum, HeightScale.XHIGH);
		addEEnumLiteral(heightScaleEEnum, HeightScale.HIGH);
		addEEnumLiteral(heightScaleEEnum, HeightScale.MEDIUM);
		addEEnumLiteral(heightScaleEEnum, HeightScale.LOW);
		addEEnumLiteral(heightScaleEEnum, HeightScale.XLOW);
		addEEnumLiteral(heightScaleEEnum, HeightScale.DEFAULT);

		initEEnum(levelDatatypeEEnum, LevelDatatype.class, "LevelDatatype");
		addEEnumLiteral(levelDatatypeEEnum, LevelDatatype.STRONG);
		addEEnumLiteral(levelDatatypeEEnum, LevelDatatype.MODERATE);
		addEEnumLiteral(levelDatatypeEEnum, LevelDatatype.NONE);
		addEEnumLiteral(levelDatatypeEEnum, LevelDatatype.REDUCED);

		initEEnum(speedScaleEEnum, SpeedScale.class, "SpeedScale");
		addEEnumLiteral(speedScaleEEnum, SpeedScale.XFAST);
		addEEnumLiteral(speedScaleEEnum, SpeedScale.FAST);
		addEEnumLiteral(speedScaleEEnum, SpeedScale.MEDIUM);
		addEEnumLiteral(speedScaleEEnum, SpeedScale.SLOW);
		addEEnumLiteral(speedScaleEEnum, SpeedScale.XSLOW);
		addEEnumLiteral(speedScaleEEnum, SpeedScale.DEFAULT);

		initEEnum(strengthDatatypeEEnum, StrengthDatatype.class, "StrengthDatatype");
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.NONE);
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.XWEAK);
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.WEAK);
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.MEDIUM);
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.STRONG);
		addEEnumLiteral(strengthDatatypeEEnum, StrengthDatatype.XSTRONG);

		initEEnum(volumeScaleEEnum, VolumeScale.class, "VolumeScale");
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.SILENT);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.XSOFT);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.SOFT);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.MEDIUM);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.LOUD);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.XLOUD);
		addEEnumLiteral(volumeScaleEEnum, VolumeScale.DEFAULT);

		// Initialize data types
		initEDataType(ageDatatypeEDataType, Object.class, "AgeDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alphabetDatatypeEDataType, String.class, "AlphabetDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contourDatatypeEDataType, List.class, "ContourDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contourpointDatatypeEDataType, String.class, "ContourpointDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dbDatatypeEDataType, String.class, "DbDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationEDataType, String.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(emptystringDatatypeEDataType, String.class, "EmptystringDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fetchhintDatatypeEDataType, String.class, "FetchhintDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(genderDatatypeObjectEDataType, GenderDatatype.class, "GenderDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(heightScaleObjectEDataType, HeightScale.class, "HeightScaleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hertzNumberEDataType, String.class, "HertzNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hertzRelativeEDataType, String.class, "HertzRelative", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languagesDatatypeEDataType, Object.class, "LanguagesDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(levelDatatypeObjectEDataType, LevelDatatype.class, "LevelDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameDatatypeEDataType, Object.class, "NameDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonnegpercentEDataType, String.class, "Nonnegpercent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, BigDecimal.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(onlangfailureDatatypeEDataType, String.class, "OnlangfailureDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(onvoicefailureDatatypeEDataType, String.class, "OnvoicefailureDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderingDatatypeEDataType, Object.class, "OrderingDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderingitemDatatypeEDataType, String.class, "OrderingitemDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderinglistDatatypeEDataType, List.class, "OrderinglistDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentEDataType, String.class, "Percent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(phonemetypeDatatypeEDataType, String.class, "PhonemetypeDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pitchDatatypeEDataType, Object.class, "PitchDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rangeDatatypeEDataType, Object.class, "RangeDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rateDatatypeEDataType, Object.class, "RateDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relativeEDataType, String.class, "Relative", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requiredDatatypeEDataType, Object.class, "RequiredDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requireditemDatatypeEDataType, String.class, "RequireditemDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requiredlistDatatypeEDataType, List.class, "RequiredlistDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roleDatatypeEDataType, List.class, "RoleDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(semitoneEDataType, String.class, "Semitone", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(speedScaleObjectEDataType, SpeedScale.class, "SpeedScaleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strengthDatatypeObjectEDataType, StrengthDatatype.class, "StrengthDatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timedesignationDatatypeEDataType, String.class, "TimedesignationDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variantDatatypeEDataType, Object.class, "VariantDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionDatatypeEDataType, String.class, "VersionDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voicenameDatatypeEDataType, String.class, "VoicenameDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voicenamesDatatypeEDataType, List.class, "VoicenamesDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(volumeDatatypeEDataType, Object.class, "VolumeDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(volumeScaleObjectEDataType, VolumeScale.class, "VolumeScaleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://de.dfki.iui/TypeMapping
		createTypeMappingAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getSSMLSpeechSynthesis_SsmlDocument(), 
		   source, 
		   new String[] {
			 "dotnet", "opaque"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (ageDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "age.datatype",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger emptystring.datatype"
		   });	
		addAnnotation
		  (alphabetDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "alphabet.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "(ipa|x-.*)"
		   });	
		addAnnotation
		  (audioEClass, 
		   source, 
		   new String[] {
			 "name", "audio",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAudio_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getAudio_DescAndSentenceAndStructureClass(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getAudio_StructGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "struct:group",
			 "namespace", "##targetNamespace",
			 "group", "#DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace",
			 "group", "struct:group"
		   });	
		addAnnotation
		  (getAudio_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace",
			 "group", "#DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":8",
			 "processing", "lax",
			 "group", "#DescAndSentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getAudio_Fetchhint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetchhint"
		   });	
		addAnnotation
		  (getAudio_Fetchtimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetchtimeout"
		   });	
		addAnnotation
		  (getAudio_Maxage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxage"
		   });	
		addAnnotation
		  (getAudio_Maxstale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxstale"
		   });	
		addAnnotation
		  (getAudio_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });	
		addAnnotation
		  (getAudio_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":14",
			 "processing", "lax"
		   });	
		addAnnotation
		  (breakEClass, 
		   source, 
		   new String[] {
			 "name", "break",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBreak_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getBreak_Strength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strength"
		   });	
		addAnnotation
		  (getBreak_Time(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time"
		   });	
		addAnnotation
		  (getBreak_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });	
		addAnnotation
		  (contourDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "contour.datatype",
			 "itemType", "contourpoint.datatype"
		   });	
		addAnnotation
		  (contourpointDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "contourpoint.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "\\(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25,(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st|x-high|high|medium|low|x-low|default)\\)"
		   });	
		addAnnotation
		  (dbDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "db.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "(\\+|-)?([0-9]*\\.)?[0-9]+dB"
		   });	
		addAnnotation
		  (descEClass, 
		   source, 
		   new String[] {
			 "name", "desc",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDesc_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDesc_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getDesc_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getDesc_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getDesc_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });	
		addAnnotation
		  (ssmlEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSSML_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSSML_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getSSML_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getSSML_Audio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "audio",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSSML_Break(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "break",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSSML_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Lang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lang",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSSML_Mark(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mark",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "affiliation", "struct"
		   });	
		addAnnotation
		  (getSSML_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSSML_Phoneme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phoneme",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Prosody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prosody",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_S(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "s",
			 "namespace", "##targetNamespace",
			 "affiliation", "struct"
		   });	
		addAnnotation
		  (getSSML_SayAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "say-as",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Speak(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speak",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSSML_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_Voice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "voice",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (getSSML_W(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "w",
			 "namespace", "##targetNamespace",
			 "affiliation", "aws"
		   });	
		addAnnotation
		  (durationEDataType, 
		   source, 
		   new String[] {
			 "name", "duration",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "(\\+)?([0-9]*\\.)?[0-9]+(ms|s)"
		   });	
		addAnnotation
		  (emphasisEClass, 
		   source, 
		   new String[] {
			 "name", "emphasis",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getEmphasis_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getEmphasis_SentenceClass(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SentenceClass:1"
		   });	
		addAnnotation
		  (getEmphasis_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getEmphasis_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getEmphasis_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getEmphasis_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getEmphasis_Level(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "level"
		   });	
		addAnnotation
		  (getEmphasis_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "lax"
		   });	
		addAnnotation
		  (emptystringDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "emptystring.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "0"
		   });	
		addAnnotation
		  (fetchhintDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "fetchhint.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "safe prefetch"
		   });	
		addAnnotation
		  (genderDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "gender.datatype"
		   });	
		addAnnotation
		  (genderDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "gender.datatype:Object",
			 "baseType", "gender.datatype"
		   });	
		addAnnotation
		  (heightScaleEEnum, 
		   source, 
		   new String[] {
			 "name", "height.scale"
		   });	
		addAnnotation
		  (heightScaleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "height.scale:Object",
			 "baseType", "height.scale"
		   });	
		addAnnotation
		  (hertzNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "hertz.number",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz"
		   });	
		addAnnotation
		  (hertzRelativeEDataType, 
		   source, 
		   new String[] {
			 "name", "hertz.relative",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz"
		   });	
		addAnnotation
		  (langTypeEClass, 
		   source, 
		   new String[] {
			 "name", "langType",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getLangType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getLangType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getLangType_Audio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "audio",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Break(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "break",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lang",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Mark(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mark",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Phoneme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phoneme",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Prosody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prosody",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_SayAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "say-as",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_S(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "s",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Voice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "voice",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_W(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "w",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":17",
			 "processing", "lax",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLangType_Lang1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getLangType_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getLangType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":20",
			 "processing", "lax"
		   });	
		addAnnotation
		  (languagesDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "languages.datatype",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#NMTOKENS emptystring.datatype"
		   });	
		addAnnotation
		  (levelDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "level.datatype"
		   });	
		addAnnotation
		  (levelDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "level.datatype:Object",
			 "baseType", "level.datatype"
		   });	
		addAnnotation
		  (lookupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "lookupType",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getLookupType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getLookupType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getLookupType_Audio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "audio",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Break(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "break",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lang",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Mark(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mark",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Phoneme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phoneme",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Prosody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prosody",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_SayAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "say-as",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_S(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "s",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Voice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "voice",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_W(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "w",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":17",
			 "processing", "lax",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getLookupType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });	
		addAnnotation
		  (getLookupType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":19",
			 "processing", "lax"
		   });	
		addAnnotation
		  (markEClass, 
		   source, 
		   new String[] {
			 "name", "mark",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMark_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getMark_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getMark_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });	
		addAnnotation
		  (mark1EClass, 
		   source, 
		   new String[] {
			 "name", "mark",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (nameDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "name.datatype",
			 "memberTypes", "voicenames.datatype emptystring.datatype"
		   });	
		addAnnotation
		  (nonnegpercentEDataType, 
		   source, 
		   new String[] {
			 "name", "nonnegpercent",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25"
		   });	
		addAnnotation
		  (numberEDataType, 
		   source, 
		   new String[] {
			 "name", "number",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "0"
		   });	
		addAnnotation
		  (onlangfailureDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "onlangfailure.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "changevoice ignoretext ignorelang processorchoice"
		   });	
		addAnnotation
		  (onvoicefailureDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "onvoicefailure.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "priorityselect keepexisting processorchoice"
		   });	
		addAnnotation
		  (orderingDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ordering.datatype",
			 "memberTypes", "orderinglist.datatype emptystring.datatype"
		   });	
		addAnnotation
		  (orderingitemDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "orderingitem.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "name languages gender age variant"
		   });	
		addAnnotation
		  (orderinglistDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "orderinglist.datatype",
			 "itemType", "orderingitem.datatype"
		   });	
		addAnnotation
		  (paragraphEClass, 
		   source, 
		   new String[] {
			 "name", "paragraph",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getParagraph_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getParagraph_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getParagraph_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getParagraph_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getParagraph_S(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "s",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getParagraph_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getParagraph_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getParagraph_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getParagraph_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getParagraph_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getParagraph_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "lax"
		   });	
		addAnnotation
		  (percentEDataType, 
		   source, 
		   new String[] {
			 "name", "percent",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25"
		   });	
		addAnnotation
		  (phonemeEClass, 
		   source, 
		   new String[] {
			 "name", "phoneme",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getPhoneme_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getPhoneme_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getPhoneme_Alphabet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alphabet"
		   });	
		addAnnotation
		  (getPhoneme_Ph(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ph"
		   });	
		addAnnotation
		  (getPhoneme_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getPhoneme_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
		   });	
		addAnnotation
		  (phonemetypeDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "phonemetype.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "default ruby"
		   });	
		addAnnotation
		  (pitchDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "pitch.datatype",
			 "memberTypes", "hertz.number hertz.relative percent semitone height.scale"
		   });	
		addAnnotation
		  (prosodyEClass, 
		   source, 
		   new String[] {
			 "name", "prosody",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getProsody_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getProsody_SentenceAndStructureClass(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getProsody_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getProsody_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getProsody_StructGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "struct:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getProsody_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace",
			 "group", "struct:group"
		   });	
		addAnnotation
		  (getProsody_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getProsody_Contour(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "contour"
		   });	
		addAnnotation
		  (getProsody_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "duration"
		   });	
		addAnnotation
		  (getProsody_Pitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pitch"
		   });	
		addAnnotation
		  (getProsody_Range(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "range"
		   });	
		addAnnotation
		  (getProsody_Rate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rate"
		   });	
		addAnnotation
		  (getProsody_Volume(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volume"
		   });	
		addAnnotation
		  (getProsody_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":13",
			 "processing", "lax"
		   });	
		addAnnotation
		  (rangeDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "range.datatype",
			 "memberTypes", "hertz.number hertz.relative percent semitone height.scale"
		   });	
		addAnnotation
		  (rateDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "rate.datatype",
			 "memberTypes", "number nonnegpercent speed.scale"
		   });	
		addAnnotation
		  (relativeEDataType, 
		   source, 
		   new String[] {
			 "name", "relative",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)"
		   });	
		addAnnotation
		  (requiredDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "required.datatype",
			 "memberTypes", "requiredlist.datatype emptystring.datatype"
		   });	
		addAnnotation
		  (requireditemDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "requireditem.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "name languages gender age variant"
		   });	
		addAnnotation
		  (requiredlistDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "requiredlist.datatype",
			 "itemType", "requireditem.datatype"
		   });	
		addAnnotation
		  (roleDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "role.datatype",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
		   });	
		addAnnotation
		  (sayAsEClass, 
		   source, 
		   new String[] {
			 "name", "say-as",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSayAs_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSayAs_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getSayAs_Detail(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "detail"
		   });	
		addAnnotation
		  (getSayAs_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format"
		   });	
		addAnnotation
		  (getSayAs_InterpretAs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interpret-as"
		   });	
		addAnnotation
		  (getSayAs_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
		   });	
		addAnnotation
		  (semitoneEDataType, 
		   source, 
		   new String[] {
			 "name", "semitone",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st"
		   });	
		addAnnotation
		  (sentenceEClass, 
		   source, 
		   new String[] {
			 "name", "sentence",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSentence_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSentence_SentenceClass(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SentenceClass:1"
		   });	
		addAnnotation
		  (getSentence_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getSentence_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getSentence_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getSentence_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax",
			 "group", "#SentenceClass:1"
		   });	
		addAnnotation
		  (getSentence_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getSentence_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getSentence_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getSentence_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":9",
			 "processing", "lax"
		   });	
		addAnnotation
		  (speakEClass, 
		   source, 
		   new String[] {
			 "name", "speak",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSpeak_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSpeak_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getSpeak_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getSpeak_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getSpeak_Lexicon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lexicon",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getSpeak_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getSpeak_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSpeak_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getSpeak_StructGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "struct:group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSpeak_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace",
			 "group", "struct:group"
		   });	
		addAnnotation
		  (getSpeak_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSpeak_Group1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:11"
		   });	
		addAnnotation
		  (getSpeak_AwsGroup1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:11"
		   });	
		addAnnotation
		  (getSpeak_Aws1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getSpeak_StructGroup1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "struct:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:11"
		   });	
		addAnnotation
		  (getSpeak_Struct1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace",
			 "group", "struct:group"
		   });	
		addAnnotation
		  (getSpeak_Lookup1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#group:11"
		   });	
		addAnnotation
		  (getSpeak_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":17",
			 "processing", "lax",
			 "group", "#group:11"
		   });	
		addAnnotation
		  (getSpeak_Base(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "base",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getSpeak_Endmark(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endmark"
		   });	
		addAnnotation
		  (getSpeak_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getSpeak_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getSpeak_Startmark(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startmark"
		   });	
		addAnnotation
		  (getSpeak_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (getSpeak_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":24",
			 "processing", "lax"
		   });	
		addAnnotation
		  (speedScaleEEnum, 
		   source, 
		   new String[] {
			 "name", "speed.scale"
		   });	
		addAnnotation
		  (speedScaleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "speed.scale:Object",
			 "baseType", "speed.scale"
		   });	
		addAnnotation
		  (ssmlLexiconEClass, 
		   source, 
		   new String[] {
			 "name", "ssml-lexicon",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSsmlLexicon_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getSsmlLexicon_Fetchtimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetchtimeout"
		   });	
		addAnnotation
		  (getSsmlLexicon_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getSsmlLexicon_Maxage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxage"
		   });	
		addAnnotation
		  (getSsmlLexicon_Maxstale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxstale"
		   });	
		addAnnotation
		  (getSsmlLexicon_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getSsmlLexicon_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });	
		addAnnotation
		  (getSsmlLexicon_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "lax"
		   });	
		addAnnotation
		  (ssmlMetaEClass, 
		   source, 
		   new String[] {
			 "name", "ssml-meta",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSsmlMeta_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getSsmlMeta_Content(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "content"
		   });	
		addAnnotation
		  (getSsmlMeta_HttpEquiv(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "http-equiv"
		   });	
		addAnnotation
		  (getSsmlMeta_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getSsmlMeta_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });	
		addAnnotation
		  (ssmlMetadataEClass, 
		   source, 
		   new String[] {
			 "name", "ssml-metadata",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSsmlMetadata_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getSsmlMetadata_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "strict"
		   });	
		addAnnotation
		  (strengthDatatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "strength.datatype"
		   });	
		addAnnotation
		  (strengthDatatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "strength.datatype:Object",
			 "baseType", "strength.datatype"
		   });	
		addAnnotation
		  (subEClass, 
		   source, 
		   new String[] {
			 "name", "sub",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSub_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSub_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getSub_Alias(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alias"
		   });	
		addAnnotation
		  (getSub_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });	
		addAnnotation
		  (timedesignationDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "timedesignation.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "(\\+)?([0-9]*\\.)?[0-9]+(ms|s)"
		   });	
		addAnnotation
		  (tokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tokenType",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTokenType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getTokenType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getTokenType_Audio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "audio",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Break(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "break",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Mark(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mark",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Phoneme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phoneme",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Prosody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prosody",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_SayAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "say-as",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Voice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "voice",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":11",
			 "processing", "lax",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getTokenType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getTokenType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });	
		addAnnotation
		  (getTokenType_Onlangfailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onlangfailure"
		   });	
		addAnnotation
		  (getTokenType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role"
		   });	
		addAnnotation
		  (getTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":16",
			 "processing", "lax"
		   });	
		addAnnotation
		  (variantDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "variant.datatype",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger emptystring.datatype"
		   });	
		addAnnotation
		  (versionDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "version.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN"
		   });	
		addAnnotation
		  (voiceEClass, 
		   source, 
		   new String[] {
			 "name", "voice",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getVoice_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getVoice_SentenceAndStructureClass(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getVoice_AwsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "aws:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getVoice_Aws(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aws",
			 "namespace", "##targetNamespace",
			 "group", "aws:group"
		   });	
		addAnnotation
		  (getVoice_StructGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "struct:group",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getVoice_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace",
			 "group", "struct:group"
		   });	
		addAnnotation
		  (getVoice_Lookup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup",
			 "namespace", "##targetNamespace",
			 "group", "#SentenceAndStructureClass:1"
		   });	
		addAnnotation
		  (getVoice_Age(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "age"
		   });	
		addAnnotation
		  (getVoice_Gender(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gender"
		   });	
		addAnnotation
		  (getVoice_Languages(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "languages"
		   });	
		addAnnotation
		  (getVoice_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getVoice_Onvoicefailure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onvoicefailure"
		   });	
		addAnnotation
		  (getVoice_Ordering(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ordering"
		   });	
		addAnnotation
		  (getVoice_Required(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "required"
		   });	
		addAnnotation
		  (getVoice_Variant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variant"
		   });	
		addAnnotation
		  (getVoice_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax"
		   });	
		addAnnotation
		  (voicenameDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "voicename.datatype",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\S+"
		   });	
		addAnnotation
		  (voicenamesDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "voicenames.datatype",
			 "itemType", "voicename.datatype"
		   });	
		addAnnotation
		  (volumeDatatypeEDataType, 
		   source, 
		   new String[] {
			 "name", "volume.datatype",
			 "memberTypes", "db.datatype volume.scale"
		   });	
		addAnnotation
		  (volumeScaleEEnum, 
		   source, 
		   new String[] {
			 "name", "volume.scale"
		   });	
		addAnnotation
		  (volumeScaleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "volume.scale:Object",
			 "baseType", "volume.scale"
		   });
	}

} //SpeechSynthesisPackageImpl
