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
package de.dfki.iui.mmds.core.model.io.communicative_functions.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.*;
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

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Communicative_functionsPackageImpl extends EPackageImpl implements Communicative_functionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicativeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPurposeCommunicativeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTransferFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationSeekingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationProvidingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDiscussionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commissiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionalQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveCheckQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeCheckQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceQuestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disagreementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconfirmEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSuggestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promiseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressRequestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptRequestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declineRequestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptSuggestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declineSuggestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressOfferEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptOfferEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declineOfferEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suggestionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionSpecificCommunicativeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueControlFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownCommunicationManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partnerCommunicationManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discourseStructureManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialObligationManagementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salutationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apologizingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gratitudeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valedictionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialGreetingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnGreetingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialSelfIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnSelfIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apologyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apologyDownplayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thankingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thankingDownplayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialGoodbyeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnGoodbyeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preclosingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicShiftAnnouncementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicShiftEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctMisspeakingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorSignalingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retractionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfCorrectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactCheckEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactIndicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stallingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pausingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnUnitInitialFuntionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnUnitFinalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnAcceptEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnGrabEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnTakeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnAssignEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnKeepEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnReleaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackElicitationFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attentionFeedbackElicitationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perceptionFeedbackElicitationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpretationFeedbackElicitationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationFeedackElicitationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFeedbackElicitationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackGivingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveExecutionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeExecutionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEvaluationAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeEvaluationAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveInterpretationAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeInterpretationAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positivePerceptionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativePerceptionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeAttentionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveExecutionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeExecutionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEvaluationAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeEvaluationAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positivePerceptionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativePerceptionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveInterpretationAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeInterpretationAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveAttentionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeAttentionAutoFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveAttentionAlloFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolveStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resolveStateObjectEDataType = null;

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
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Communicative_functionsPackageImpl() {
		super(eNS_URI, Communicative_functionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Communicative_functionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Communicative_functionsPackage init() {
		if (isInited) return (Communicative_functionsPackage)EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI);

		// Obtain or create and register package
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Communicative_functionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
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
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theCommunicative_functionsPackage.createPackageContents();
		theBasePackage.createPackageContents();
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
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicative_functionsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
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
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicative_functionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Communicative_functionsPackage.eNS_URI, theCommunicative_functionsPackage);
		return theCommunicative_functionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticContent() {
		return semanticContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticContent_Content() {
		return (EReference)semanticContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticContent_Reference() {
		return (EReference)semanticContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticContent_Resolved() {
		return (EAttribute)semanticContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticContent_Id() {
		return (EAttribute)semanticContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticContent_Validity() {
		return (EAttribute)semanticContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicativeFunction() {
		return communicativeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeFunction_SemanticContent() {
		return (EReference)communicativeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicativeFunction_IsEllipsis() {
		return (EAttribute)communicativeFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicativeFunction_KnowledgeItem() {
		return (EAttribute)communicativeFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralPurposeCommunicativeFunction() {
		return generalPurposeCommunicativeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationTransferFunction() {
		return informationTransferFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationSeekingFunction() {
		return informationSeekingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationProvidingFunction() {
		return informationProvidingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionDiscussionFunction() {
		return actionDiscussionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommissive() {
		return commissiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirective() {
		return directiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetQuestion() {
		return setQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropositionalQuestion() {
		return propositionalQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckQuestion() {
		return checkQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveCheckQuestion() {
		return positiveCheckQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeCheckQuestion() {
		return negativeCheckQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoiceQuestion() {
		return choiceQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInform() {
		return informEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisagreement() {
		return disagreementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrection() {
		return correctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfirm() {
		return confirmEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisconfirm() {
		return disconfirmEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressSuggestion() {
		return addressSuggestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromise() {
		return promiseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressRequest() {
		return addressRequestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptRequest() {
		return acceptRequestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclineRequest() {
		return declineRequestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptSuggestion() {
		return acceptSuggestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclineSuggestion() {
		return declineSuggestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_RequestInfo() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstruct() {
		return instructEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressOffer() {
		return addressOfferEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptOffer() {
		return acceptOfferEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclineOffer() {
		return declineOfferEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuggestion() {
		return suggestionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimensionSpecificCommunicativeFunction() {
		return dimensionSpecificCommunicativeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDialogueControlFunction() {
		return dialogueControlFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackFunction() {
		return feedbackFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutoFeedback() {
		return autoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlloFeedback() {
		return alloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractionManagementFunction() {
		return interactionManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnManagementFunction() {
		return turnManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeManagementFunction() {
		return timeManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactManagementFunction() {
		return contactManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwnCommunicationManagementFunction() {
		return ownCommunicationManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartnerCommunicationManagementFunction() {
		return partnerCommunicationManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscourseStructureManagementFunction() {
		return discourseStructureManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialObligationManagementFunction() {
		return socialObligationManagementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalutation() {
		return salutationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfIntroduction() {
		return selfIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApologizing() {
		return apologizingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGratitude() {
		return gratitudeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValediction() {
		return valedictionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialGreeting() {
		return initialGreetingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnGreeting() {
		return returnGreetingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialSelfIntroduction() {
		return initialSelfIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnSelfIntroduction() {
		return returnSelfIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApology() {
		return apologyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApologyDownplay() {
		return apologyDownplayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThanking() {
		return thankingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThankingDownplay() {
		return thankingDownplayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialGoodbye() {
		return initialGoodbyeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnGoodbye() {
		return returnGoodbyeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpening() {
		return openingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreclosing() {
		return preclosingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopicIntroduction() {
		return topicIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopicShiftAnnouncement() {
		return topicShiftAnnouncementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopicShift() {
		return topicShiftEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompletion() {
		return completionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrectMisspeaking() {
		return correctMisspeakingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorSignaling() {
		return errorSignalingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetraction() {
		return retractionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfCorrection() {
		return selfCorrectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactCheck() {
		return contactCheckEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactIndication() {
		return contactIndicationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStalling() {
		return stallingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPausing() {
		return pausingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnUnitInitialFuntion() {
		return turnUnitInitialFuntionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnUnitFinalFunction() {
		return turnUnitFinalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnAccept() {
		return turnAcceptEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnGrab() {
		return turnGrabEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnTake() {
		return turnTakeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnAssign() {
		return turnAssignEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnKeep() {
		return turnKeepEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnRelease() {
		return turnReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackElicitationFunction() {
		return feedbackElicitationFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttentionFeedbackElicitation() {
		return attentionFeedbackElicitationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerceptionFeedbackElicitation() {
		return perceptionFeedbackElicitationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterpretationFeedbackElicitation() {
		return interpretationFeedbackElicitationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluationFeedackElicitation() {
		return evaluationFeedackElicitationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionFeedbackElicitation() {
		return executionFeedbackElicitationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackGivingFunction() {
		return feedbackGivingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveAlloFeedback() {
		return positiveAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeAlloFeedback() {
		return negativeAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveExecutionAlloFeedback() {
		return positiveExecutionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeExecutionAlloFeedback() {
		return negativeExecutionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveEvaluationAlloFeedback() {
		return positiveEvaluationAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeEvaluationAlloFeedback() {
		return negativeEvaluationAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveInterpretationAlloFeedback() {
		return positiveInterpretationAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeInterpretationAlloFeedback() {
		return negativeInterpretationAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositivePerceptionAlloFeedback() {
		return positivePerceptionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativePerceptionAlloFeedback() {
		return negativePerceptionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeAttentionAlloFeedback() {
		return negativeAttentionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveAutoFeedback() {
		return positiveAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeAutoFeedback() {
		return negativeAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveExecutionAutoFeedback() {
		return positiveExecutionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeExecutionAutoFeedback() {
		return negativeExecutionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveEvaluationAutoFeedback() {
		return positiveEvaluationAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeEvaluationAutoFeedback() {
		return negativeEvaluationAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositivePerceptionAutoFeedback() {
		return positivePerceptionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativePerceptionAutoFeedback() {
		return negativePerceptionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveInterpretationAutoFeedback() {
		return positiveInterpretationAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeInterpretationAutoFeedback() {
		return negativeInterpretationAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveAttentionAutoFeedback() {
		return positiveAttentionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeAttentionAutoFeedback() {
		return negativeAttentionAutoFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveAttentionAlloFeedback() {
		return positiveAttentionAlloFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolveState() {
		return resolveStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResolveStateObject() {
		return resolveStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communicative_functionsFactory getCommunicative_functionsFactory() {
		return (Communicative_functionsFactory)getEFactoryInstance();
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
		semanticContentEClass = createEClass(SEMANTIC_CONTENT);
		createEReference(semanticContentEClass, SEMANTIC_CONTENT__CONTENT);
		createEReference(semanticContentEClass, SEMANTIC_CONTENT__REFERENCE);
		createEAttribute(semanticContentEClass, SEMANTIC_CONTENT__RESOLVED);
		createEAttribute(semanticContentEClass, SEMANTIC_CONTENT__ID);
		createEAttribute(semanticContentEClass, SEMANTIC_CONTENT__VALIDITY);

		communicativeFunctionEClass = createEClass(COMMUNICATIVE_FUNCTION);
		createEReference(communicativeFunctionEClass, COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT);
		createEAttribute(communicativeFunctionEClass, COMMUNICATIVE_FUNCTION__IS_ELLIPSIS);
		createEAttribute(communicativeFunctionEClass, COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM);

		generalPurposeCommunicativeFunctionEClass = createEClass(GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION);

		informationTransferFunctionEClass = createEClass(INFORMATION_TRANSFER_FUNCTION);

		informationSeekingFunctionEClass = createEClass(INFORMATION_SEEKING_FUNCTION);

		informationProvidingFunctionEClass = createEClass(INFORMATION_PROVIDING_FUNCTION);

		actionDiscussionFunctionEClass = createEClass(ACTION_DISCUSSION_FUNCTION);

		commissiveEClass = createEClass(COMMISSIVE);

		directiveEClass = createEClass(DIRECTIVE);

		questionEClass = createEClass(QUESTION);

		setQuestionEClass = createEClass(SET_QUESTION);

		propositionalQuestionEClass = createEClass(PROPOSITIONAL_QUESTION);

		checkQuestionEClass = createEClass(CHECK_QUESTION);

		positiveCheckQuestionEClass = createEClass(POSITIVE_CHECK_QUESTION);

		negativeCheckQuestionEClass = createEClass(NEGATIVE_CHECK_QUESTION);

		choiceQuestionEClass = createEClass(CHOICE_QUESTION);

		informEClass = createEClass(INFORM);

		agreementEClass = createEClass(AGREEMENT);

		disagreementEClass = createEClass(DISAGREEMENT);

		answerEClass = createEClass(ANSWER);

		correctionEClass = createEClass(CORRECTION);

		confirmEClass = createEClass(CONFIRM);

		disconfirmEClass = createEClass(DISCONFIRM);

		offerEClass = createEClass(OFFER);

		addressSuggestionEClass = createEClass(ADDRESS_SUGGESTION);

		promiseEClass = createEClass(PROMISE);

		threatEClass = createEClass(THREAT);

		addressRequestEClass = createEClass(ADDRESS_REQUEST);

		acceptRequestEClass = createEClass(ACCEPT_REQUEST);

		declineRequestEClass = createEClass(DECLINE_REQUEST);

		acceptSuggestionEClass = createEClass(ACCEPT_SUGGESTION);

		declineSuggestionEClass = createEClass(DECLINE_SUGGESTION);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__REQUEST_INFO);

		instructEClass = createEClass(INSTRUCT);

		addressOfferEClass = createEClass(ADDRESS_OFFER);

		acceptOfferEClass = createEClass(ACCEPT_OFFER);

		declineOfferEClass = createEClass(DECLINE_OFFER);

		suggestionEClass = createEClass(SUGGESTION);

		dimensionSpecificCommunicativeFunctionEClass = createEClass(DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION);

		dialogueControlFunctionEClass = createEClass(DIALOGUE_CONTROL_FUNCTION);

		feedbackFunctionEClass = createEClass(FEEDBACK_FUNCTION);

		autoFeedbackEClass = createEClass(AUTO_FEEDBACK);

		alloFeedbackEClass = createEClass(ALLO_FEEDBACK);

		interactionManagementFunctionEClass = createEClass(INTERACTION_MANAGEMENT_FUNCTION);

		turnManagementFunctionEClass = createEClass(TURN_MANAGEMENT_FUNCTION);

		timeManagementFunctionEClass = createEClass(TIME_MANAGEMENT_FUNCTION);

		contactManagementFunctionEClass = createEClass(CONTACT_MANAGEMENT_FUNCTION);

		ownCommunicationManagementFunctionEClass = createEClass(OWN_COMMUNICATION_MANAGEMENT_FUNCTION);

		partnerCommunicationManagementFunctionEClass = createEClass(PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION);

		discourseStructureManagementFunctionEClass = createEClass(DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION);

		socialObligationManagementFunctionEClass = createEClass(SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION);

		salutationEClass = createEClass(SALUTATION);

		selfIntroductionEClass = createEClass(SELF_INTRODUCTION);

		apologizingEClass = createEClass(APOLOGIZING);

		gratitudeEClass = createEClass(GRATITUDE);

		valedictionEClass = createEClass(VALEDICTION);

		initialGreetingEClass = createEClass(INITIAL_GREETING);

		returnGreetingEClass = createEClass(RETURN_GREETING);

		initialSelfIntroductionEClass = createEClass(INITIAL_SELF_INTRODUCTION);

		returnSelfIntroductionEClass = createEClass(RETURN_SELF_INTRODUCTION);

		apologyEClass = createEClass(APOLOGY);

		apologyDownplayEClass = createEClass(APOLOGY_DOWNPLAY);

		thankingEClass = createEClass(THANKING);

		thankingDownplayEClass = createEClass(THANKING_DOWNPLAY);

		initialGoodbyeEClass = createEClass(INITIAL_GOODBYE);

		returnGoodbyeEClass = createEClass(RETURN_GOODBYE);

		openingEClass = createEClass(OPENING);

		preclosingEClass = createEClass(PRECLOSING);

		topicIntroductionEClass = createEClass(TOPIC_INTRODUCTION);

		topicShiftAnnouncementEClass = createEClass(TOPIC_SHIFT_ANNOUNCEMENT);

		topicShiftEClass = createEClass(TOPIC_SHIFT);

		completionEClass = createEClass(COMPLETION);

		correctMisspeakingEClass = createEClass(CORRECT_MISSPEAKING);

		errorSignalingEClass = createEClass(ERROR_SIGNALING);

		retractionEClass = createEClass(RETRACTION);

		selfCorrectionEClass = createEClass(SELF_CORRECTION);

		contactCheckEClass = createEClass(CONTACT_CHECK);

		contactIndicationEClass = createEClass(CONTACT_INDICATION);

		stallingEClass = createEClass(STALLING);

		pausingEClass = createEClass(PAUSING);

		turnUnitInitialFuntionEClass = createEClass(TURN_UNIT_INITIAL_FUNTION);

		turnUnitFinalFunctionEClass = createEClass(TURN_UNIT_FINAL_FUNCTION);

		turnAcceptEClass = createEClass(TURN_ACCEPT);

		turnGrabEClass = createEClass(TURN_GRAB);

		turnTakeEClass = createEClass(TURN_TAKE);

		turnAssignEClass = createEClass(TURN_ASSIGN);

		turnKeepEClass = createEClass(TURN_KEEP);

		turnReleaseEClass = createEClass(TURN_RELEASE);

		feedbackElicitationFunctionEClass = createEClass(FEEDBACK_ELICITATION_FUNCTION);

		attentionFeedbackElicitationEClass = createEClass(ATTENTION_FEEDBACK_ELICITATION);

		perceptionFeedbackElicitationEClass = createEClass(PERCEPTION_FEEDBACK_ELICITATION);

		interpretationFeedbackElicitationEClass = createEClass(INTERPRETATION_FEEDBACK_ELICITATION);

		evaluationFeedackElicitationEClass = createEClass(EVALUATION_FEEDACK_ELICITATION);

		executionFeedbackElicitationEClass = createEClass(EXECUTION_FEEDBACK_ELICITATION);

		feedbackGivingFunctionEClass = createEClass(FEEDBACK_GIVING_FUNCTION);

		positiveAlloFeedbackEClass = createEClass(POSITIVE_ALLO_FEEDBACK);

		negativeAlloFeedbackEClass = createEClass(NEGATIVE_ALLO_FEEDBACK);

		positiveExecutionAlloFeedbackEClass = createEClass(POSITIVE_EXECUTION_ALLO_FEEDBACK);

		negativeExecutionAlloFeedbackEClass = createEClass(NEGATIVE_EXECUTION_ALLO_FEEDBACK);

		positiveEvaluationAlloFeedbackEClass = createEClass(POSITIVE_EVALUATION_ALLO_FEEDBACK);

		negativeEvaluationAlloFeedbackEClass = createEClass(NEGATIVE_EVALUATION_ALLO_FEEDBACK);

		positiveInterpretationAlloFeedbackEClass = createEClass(POSITIVE_INTERPRETATION_ALLO_FEEDBACK);

		negativeInterpretationAlloFeedbackEClass = createEClass(NEGATIVE_INTERPRETATION_ALLO_FEEDBACK);

		positivePerceptionAlloFeedbackEClass = createEClass(POSITIVE_PERCEPTION_ALLO_FEEDBACK);

		negativePerceptionAlloFeedbackEClass = createEClass(NEGATIVE_PERCEPTION_ALLO_FEEDBACK);

		negativeAttentionAlloFeedbackEClass = createEClass(NEGATIVE_ATTENTION_ALLO_FEEDBACK);

		positiveAutoFeedbackEClass = createEClass(POSITIVE_AUTO_FEEDBACK);

		negativeAutoFeedbackEClass = createEClass(NEGATIVE_AUTO_FEEDBACK);

		positiveExecutionAutoFeedbackEClass = createEClass(POSITIVE_EXECUTION_AUTO_FEEDBACK);

		negativeExecutionAutoFeedbackEClass = createEClass(NEGATIVE_EXECUTION_AUTO_FEEDBACK);

		positiveEvaluationAutoFeedbackEClass = createEClass(POSITIVE_EVALUATION_AUTO_FEEDBACK);

		negativeEvaluationAutoFeedbackEClass = createEClass(NEGATIVE_EVALUATION_AUTO_FEEDBACK);

		positivePerceptionAutoFeedbackEClass = createEClass(POSITIVE_PERCEPTION_AUTO_FEEDBACK);

		negativePerceptionAutoFeedbackEClass = createEClass(NEGATIVE_PERCEPTION_AUTO_FEEDBACK);

		positiveInterpretationAutoFeedbackEClass = createEClass(POSITIVE_INTERPRETATION_AUTO_FEEDBACK);

		negativeInterpretationAutoFeedbackEClass = createEClass(NEGATIVE_INTERPRETATION_AUTO_FEEDBACK);

		positiveAttentionAutoFeedbackEClass = createEClass(POSITIVE_ATTENTION_AUTO_FEEDBACK);

		negativeAttentionAutoFeedbackEClass = createEClass(NEGATIVE_ATTENTION_AUTO_FEEDBACK);

		positiveAttentionAlloFeedbackEClass = createEClass(POSITIVE_ATTENTION_ALLO_FEEDBACK);

		// Create enums
		resolveStateEEnum = createEEnum(RESOLVE_STATE);

		// Create data types
		resolveStateObjectEDataType = createEDataType(RESOLVE_STATE_OBJECT);
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
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		semanticContentEClass.getESuperTypes().add(theBasePackage.getBObject());
		communicativeFunctionEClass.getESuperTypes().add(theBasePackage.getBObject());
		generalPurposeCommunicativeFunctionEClass.getESuperTypes().add(this.getCommunicativeFunction());
		informationTransferFunctionEClass.getESuperTypes().add(this.getGeneralPurposeCommunicativeFunction());
		informationSeekingFunctionEClass.getESuperTypes().add(this.getInformationTransferFunction());
		informationProvidingFunctionEClass.getESuperTypes().add(this.getInformationTransferFunction());
		actionDiscussionFunctionEClass.getESuperTypes().add(this.getGeneralPurposeCommunicativeFunction());
		commissiveEClass.getESuperTypes().add(this.getActionDiscussionFunction());
		directiveEClass.getESuperTypes().add(this.getActionDiscussionFunction());
		questionEClass.getESuperTypes().add(this.getInformationSeekingFunction());
		setQuestionEClass.getESuperTypes().add(this.getQuestion());
		propositionalQuestionEClass.getESuperTypes().add(this.getQuestion());
		checkQuestionEClass.getESuperTypes().add(this.getPropositionalQuestion());
		positiveCheckQuestionEClass.getESuperTypes().add(this.getCheckQuestion());
		negativeCheckQuestionEClass.getESuperTypes().add(this.getCheckQuestion());
		choiceQuestionEClass.getESuperTypes().add(this.getQuestion());
		informEClass.getESuperTypes().add(this.getInformationProvidingFunction());
		agreementEClass.getESuperTypes().add(this.getInform());
		disagreementEClass.getESuperTypes().add(this.getInform());
		answerEClass.getESuperTypes().add(this.getInform());
		correctionEClass.getESuperTypes().add(this.getDisagreement());
		confirmEClass.getESuperTypes().add(this.getAnswer());
		disconfirmEClass.getESuperTypes().add(this.getAnswer());
		offerEClass.getESuperTypes().add(this.getCommissive());
		addressSuggestionEClass.getESuperTypes().add(this.getCommissive());
		promiseEClass.getESuperTypes().add(this.getOffer());
		threatEClass.getESuperTypes().add(this.getOffer());
		addressRequestEClass.getESuperTypes().add(this.getThreat());
		acceptRequestEClass.getESuperTypes().add(this.getAddressRequest());
		declineRequestEClass.getESuperTypes().add(this.getAddressRequest());
		acceptSuggestionEClass.getESuperTypes().add(this.getAddressSuggestion());
		declineSuggestionEClass.getESuperTypes().add(this.getAddressSuggestion());
		requestEClass.getESuperTypes().add(this.getDirective());
		instructEClass.getESuperTypes().add(this.getRequest());
		addressOfferEClass.getESuperTypes().add(this.getRequest());
		acceptOfferEClass.getESuperTypes().add(this.getAddressOffer());
		declineOfferEClass.getESuperTypes().add(this.getAddressOffer());
		suggestionEClass.getESuperTypes().add(this.getDirective());
		dimensionSpecificCommunicativeFunctionEClass.getESuperTypes().add(this.getCommunicativeFunction());
		dialogueControlFunctionEClass.getESuperTypes().add(this.getDimensionSpecificCommunicativeFunction());
		feedbackFunctionEClass.getESuperTypes().add(this.getDialogueControlFunction());
		autoFeedbackEClass.getESuperTypes().add(this.getFeedbackFunction());
		alloFeedbackEClass.getESuperTypes().add(this.getFeedbackFunction());
		interactionManagementFunctionEClass.getESuperTypes().add(this.getDialogueControlFunction());
		turnManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		timeManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		contactManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		ownCommunicationManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		partnerCommunicationManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		discourseStructureManagementFunctionEClass.getESuperTypes().add(this.getInteractionManagementFunction());
		socialObligationManagementFunctionEClass.getESuperTypes().add(this.getDialogueControlFunction());
		salutationEClass.getESuperTypes().add(this.getSocialObligationManagementFunction());
		selfIntroductionEClass.getESuperTypes().add(this.getSocialObligationManagementFunction());
		apologizingEClass.getESuperTypes().add(this.getSocialObligationManagementFunction());
		gratitudeEClass.getESuperTypes().add(this.getSocialObligationManagementFunction());
		valedictionEClass.getESuperTypes().add(this.getSocialObligationManagementFunction());
		initialGreetingEClass.getESuperTypes().add(this.getSalutation());
		returnGreetingEClass.getESuperTypes().add(this.getSalutation());
		initialSelfIntroductionEClass.getESuperTypes().add(this.getSelfIntroduction());
		returnSelfIntroductionEClass.getESuperTypes().add(this.getSelfIntroduction());
		apologyEClass.getESuperTypes().add(this.getApologizing());
		apologyDownplayEClass.getESuperTypes().add(this.getApologizing());
		thankingEClass.getESuperTypes().add(this.getGratitude());
		thankingDownplayEClass.getESuperTypes().add(this.getGratitude());
		initialGoodbyeEClass.getESuperTypes().add(this.getValediction());
		returnGoodbyeEClass.getESuperTypes().add(this.getValediction());
		openingEClass.getESuperTypes().add(this.getDiscourseStructureManagementFunction());
		preclosingEClass.getESuperTypes().add(this.getDiscourseStructureManagementFunction());
		topicIntroductionEClass.getESuperTypes().add(this.getDiscourseStructureManagementFunction());
		topicShiftAnnouncementEClass.getESuperTypes().add(this.getDiscourseStructureManagementFunction());
		topicShiftEClass.getESuperTypes().add(this.getTopicShiftAnnouncement());
		completionEClass.getESuperTypes().add(this.getPartnerCommunicationManagementFunction());
		correctMisspeakingEClass.getESuperTypes().add(this.getPartnerCommunicationManagementFunction());
		errorSignalingEClass.getESuperTypes().add(this.getOwnCommunicationManagementFunction());
		retractionEClass.getESuperTypes().add(this.getErrorSignaling());
		selfCorrectionEClass.getESuperTypes().add(this.getRetraction());
		contactCheckEClass.getESuperTypes().add(this.getContactManagementFunction());
		contactIndicationEClass.getESuperTypes().add(this.getContactManagementFunction());
		stallingEClass.getESuperTypes().add(this.getTimeManagementFunction());
		pausingEClass.getESuperTypes().add(this.getTimeManagementFunction());
		turnUnitInitialFuntionEClass.getESuperTypes().add(this.getTurnManagementFunction());
		turnUnitFinalFunctionEClass.getESuperTypes().add(this.getTurnManagementFunction());
		turnAcceptEClass.getESuperTypes().add(this.getTurnUnitInitialFuntion());
		turnGrabEClass.getESuperTypes().add(this.getTurnUnitInitialFuntion());
		turnTakeEClass.getESuperTypes().add(this.getTurnUnitInitialFuntion());
		turnAssignEClass.getESuperTypes().add(this.getTurnUnitFinalFunction());
		turnKeepEClass.getESuperTypes().add(this.getTurnUnitFinalFunction());
		turnReleaseEClass.getESuperTypes().add(this.getTurnUnitFinalFunction());
		feedbackElicitationFunctionEClass.getESuperTypes().add(this.getAlloFeedback());
		attentionFeedbackElicitationEClass.getESuperTypes().add(this.getFeedbackElicitationFunction());
		perceptionFeedbackElicitationEClass.getESuperTypes().add(this.getFeedbackElicitationFunction());
		interpretationFeedbackElicitationEClass.getESuperTypes().add(this.getFeedbackElicitationFunction());
		evaluationFeedackElicitationEClass.getESuperTypes().add(this.getFeedbackElicitationFunction());
		executionFeedbackElicitationEClass.getESuperTypes().add(this.getFeedbackElicitationFunction());
		feedbackGivingFunctionEClass.getESuperTypes().add(this.getAlloFeedback());
		positiveAlloFeedbackEClass.getESuperTypes().add(this.getFeedbackGivingFunction());
		negativeAlloFeedbackEClass.getESuperTypes().add(this.getFeedbackGivingFunction());
		positiveExecutionAlloFeedbackEClass.getESuperTypes().add(this.getPositiveEvaluationAlloFeedback());
		negativeExecutionAlloFeedbackEClass.getESuperTypes().add(this.getNegativeAlloFeedback());
		positiveEvaluationAlloFeedbackEClass.getESuperTypes().add(this.getPositiveInterpretationAlloFeedback());
		negativeEvaluationAlloFeedbackEClass.getESuperTypes().add(this.getNegativeExecutionAlloFeedback());
		positiveInterpretationAlloFeedbackEClass.getESuperTypes().add(this.getPositivePerceptionAlloFeedback());
		negativeInterpretationAlloFeedbackEClass.getESuperTypes().add(this.getNegativeEvaluationAlloFeedback());
		positivePerceptionAlloFeedbackEClass.getESuperTypes().add(this.getPositiveAttentionAlloFeedback());
		negativePerceptionAlloFeedbackEClass.getESuperTypes().add(this.getNegativeInterpretationAlloFeedback());
		negativeAttentionAlloFeedbackEClass.getESuperTypes().add(this.getNegativePerceptionAlloFeedback());
		positiveAutoFeedbackEClass.getESuperTypes().add(this.getAutoFeedback());
		negativeAutoFeedbackEClass.getESuperTypes().add(this.getAutoFeedback());
		positiveExecutionAutoFeedbackEClass.getESuperTypes().add(this.getPositiveEvaluationAutoFeedback());
		negativeExecutionAutoFeedbackEClass.getESuperTypes().add(this.getNegativeAutoFeedback());
		positiveEvaluationAutoFeedbackEClass.getESuperTypes().add(this.getPositiveInterpretationAutoFeedback());
		negativeEvaluationAutoFeedbackEClass.getESuperTypes().add(this.getNegativeExecutionAutoFeedback());
		positivePerceptionAutoFeedbackEClass.getESuperTypes().add(this.getPositiveAttentionAutoFeedback());
		negativePerceptionAutoFeedbackEClass.getESuperTypes().add(this.getNegativeInterpretationAutoFeedback());
		positiveInterpretationAutoFeedbackEClass.getESuperTypes().add(this.getPositivePerceptionAutoFeedback());
		negativeInterpretationAutoFeedbackEClass.getESuperTypes().add(this.getNegativeEvaluationAutoFeedback());
		positiveAttentionAutoFeedbackEClass.getESuperTypes().add(this.getPositiveAutoFeedback());
		negativeAttentionAutoFeedbackEClass.getESuperTypes().add(this.getNegativePerceptionAutoFeedback());
		positiveAttentionAlloFeedbackEClass.getESuperTypes().add(this.getPositiveAlloFeedback());

		// Initialize classes, features, and operations; add parameters
		initEClass(semanticContentEClass, SemanticContent.class, "SemanticContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticContent_Content(), theBasePackage.getEntity(), null, "content", null, 0, 1, SemanticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticContent_Reference(), theReferencesPackage.getReferenceModel(), null, "reference", null, 0, 1, SemanticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemanticContent_Resolved(), this.getResolveState(), "resolved", "UNDEFINED", 0, 1, SemanticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemanticContent_Id(), theBasePackage.getBString(), "id", null, 0, 1, SemanticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemanticContent_Validity(), ecorePackage.getELong(), "validity", "-1", 0, 1, SemanticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeFunctionEClass, CommunicativeFunction.class, "CommunicativeFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicativeFunction_SemanticContent(), this.getSemanticContent(), null, "semanticContent", null, 0, -1, CommunicativeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicativeFunction_IsEllipsis(), ecorePackage.getEBoolean(), "isEllipsis", null, 0, 1, CommunicativeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicativeFunction_KnowledgeItem(), ecorePackage.getEString(), "knowledgeItem", null, 0, 1, CommunicativeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalPurposeCommunicativeFunctionEClass, GeneralPurposeCommunicativeFunction.class, "GeneralPurposeCommunicativeFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationTransferFunctionEClass, InformationTransferFunction.class, "InformationTransferFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationSeekingFunctionEClass, InformationSeekingFunction.class, "InformationSeekingFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationProvidingFunctionEClass, InformationProvidingFunction.class, "InformationProvidingFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionDiscussionFunctionEClass, ActionDiscussionFunction.class, "ActionDiscussionFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commissiveEClass, Commissive.class, "Commissive", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directiveEClass, Directive.class, "Directive", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setQuestionEClass, SetQuestion.class, "SetQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propositionalQuestionEClass, PropositionalQuestion.class, "PropositionalQuestion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkQuestionEClass, CheckQuestion.class, "CheckQuestion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveCheckQuestionEClass, PositiveCheckQuestion.class, "PositiveCheckQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeCheckQuestionEClass, NegativeCheckQuestion.class, "NegativeCheckQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceQuestionEClass, ChoiceQuestion.class, "ChoiceQuestion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informEClass, Inform.class, "Inform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agreementEClass, Agreement.class, "Agreement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disagreementEClass, Disagreement.class, "Disagreement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctionEClass, Correction.class, "Correction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confirmEClass, Confirm.class, "Confirm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disconfirmEClass, Disconfirm.class, "Disconfirm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offerEClass, Offer.class, "Offer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressSuggestionEClass, AddressSuggestion.class, "AddressSuggestion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(promiseEClass, Promise.class, "Promise", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threatEClass, Threat.class, "Threat", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressRequestEClass, AddressRequest.class, "AddressRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptRequestEClass, AcceptRequest.class, "AcceptRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declineRequestEClass, DeclineRequest.class, "DeclineRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptSuggestionEClass, AcceptSuggestion.class, "AcceptSuggestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declineSuggestionEClass, DeclineSuggestion.class, "DeclineSuggestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_RequestInfo(), theBasePackage.getBString(), "requestInfo", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructEClass, Instruct.class, "Instruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressOfferEClass, AddressOffer.class, "AddressOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptOfferEClass, AcceptOffer.class, "AcceptOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declineOfferEClass, DeclineOffer.class, "DeclineOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suggestionEClass, Suggestion.class, "Suggestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimensionSpecificCommunicativeFunctionEClass, DimensionSpecificCommunicativeFunction.class, "DimensionSpecificCommunicativeFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogueControlFunctionEClass, DialogueControlFunction.class, "DialogueControlFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feedbackFunctionEClass, FeedbackFunction.class, "FeedbackFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autoFeedbackEClass, AutoFeedback.class, "AutoFeedback", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alloFeedbackEClass, AlloFeedback.class, "AlloFeedback", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionManagementFunctionEClass, InteractionManagementFunction.class, "InteractionManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnManagementFunctionEClass, TurnManagementFunction.class, "TurnManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeManagementFunctionEClass, TimeManagementFunction.class, "TimeManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactManagementFunctionEClass, ContactManagementFunction.class, "ContactManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ownCommunicationManagementFunctionEClass, OwnCommunicationManagementFunction.class, "OwnCommunicationManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partnerCommunicationManagementFunctionEClass, PartnerCommunicationManagementFunction.class, "PartnerCommunicationManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discourseStructureManagementFunctionEClass, DiscourseStructureManagementFunction.class, "DiscourseStructureManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(socialObligationManagementFunctionEClass, SocialObligationManagementFunction.class, "SocialObligationManagementFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(salutationEClass, Salutation.class, "Salutation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selfIntroductionEClass, SelfIntroduction.class, "SelfIntroduction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apologizingEClass, Apologizing.class, "Apologizing", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gratitudeEClass, Gratitude.class, "Gratitude", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valedictionEClass, Valediction.class, "Valediction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialGreetingEClass, InitialGreeting.class, "InitialGreeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnGreetingEClass, ReturnGreeting.class, "ReturnGreeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialSelfIntroductionEClass, InitialSelfIntroduction.class, "InitialSelfIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnSelfIntroductionEClass, ReturnSelfIntroduction.class, "ReturnSelfIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apologyEClass, Apology.class, "Apology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apologyDownplayEClass, ApologyDownplay.class, "ApologyDownplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thankingEClass, Thanking.class, "Thanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thankingDownplayEClass, ThankingDownplay.class, "ThankingDownplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialGoodbyeEClass, InitialGoodbye.class, "InitialGoodbye", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnGoodbyeEClass, ReturnGoodbye.class, "ReturnGoodbye", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openingEClass, Opening.class, "Opening", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preclosingEClass, Preclosing.class, "Preclosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topicIntroductionEClass, TopicIntroduction.class, "TopicIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topicShiftAnnouncementEClass, TopicShiftAnnouncement.class, "TopicShiftAnnouncement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topicShiftEClass, TopicShift.class, "TopicShift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(completionEClass, Completion.class, "Completion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctMisspeakingEClass, CorrectMisspeaking.class, "CorrectMisspeaking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorSignalingEClass, ErrorSignaling.class, "ErrorSignaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retractionEClass, Retraction.class, "Retraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selfCorrectionEClass, SelfCorrection.class, "SelfCorrection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactCheckEClass, ContactCheck.class, "ContactCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactIndicationEClass, ContactIndication.class, "ContactIndication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stallingEClass, Stalling.class, "Stalling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pausingEClass, Pausing.class, "Pausing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnUnitInitialFuntionEClass, TurnUnitInitialFuntion.class, "TurnUnitInitialFuntion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnUnitFinalFunctionEClass, TurnUnitFinalFunction.class, "TurnUnitFinalFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnAcceptEClass, TurnAccept.class, "TurnAccept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnGrabEClass, TurnGrab.class, "TurnGrab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnTakeEClass, TurnTake.class, "TurnTake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnAssignEClass, TurnAssign.class, "TurnAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnKeepEClass, TurnKeep.class, "TurnKeep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnReleaseEClass, TurnRelease.class, "TurnRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feedbackElicitationFunctionEClass, FeedbackElicitationFunction.class, "FeedbackElicitationFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attentionFeedbackElicitationEClass, AttentionFeedbackElicitation.class, "AttentionFeedbackElicitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perceptionFeedbackElicitationEClass, PerceptionFeedbackElicitation.class, "PerceptionFeedbackElicitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interpretationFeedbackElicitationEClass, InterpretationFeedbackElicitation.class, "InterpretationFeedbackElicitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evaluationFeedackElicitationEClass, EvaluationFeedackElicitation.class, "EvaluationFeedackElicitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionFeedbackElicitationEClass, ExecutionFeedbackElicitation.class, "ExecutionFeedbackElicitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feedbackGivingFunctionEClass, FeedbackGivingFunction.class, "FeedbackGivingFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveAlloFeedbackEClass, PositiveAlloFeedback.class, "PositiveAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeAlloFeedbackEClass, NegativeAlloFeedback.class, "NegativeAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveExecutionAlloFeedbackEClass, PositiveExecutionAlloFeedback.class, "PositiveExecutionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeExecutionAlloFeedbackEClass, NegativeExecutionAlloFeedback.class, "NegativeExecutionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEvaluationAlloFeedbackEClass, PositiveEvaluationAlloFeedback.class, "PositiveEvaluationAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeEvaluationAlloFeedbackEClass, NegativeEvaluationAlloFeedback.class, "NegativeEvaluationAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveInterpretationAlloFeedbackEClass, PositiveInterpretationAlloFeedback.class, "PositiveInterpretationAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeInterpretationAlloFeedbackEClass, NegativeInterpretationAlloFeedback.class, "NegativeInterpretationAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positivePerceptionAlloFeedbackEClass, PositivePerceptionAlloFeedback.class, "PositivePerceptionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativePerceptionAlloFeedbackEClass, NegativePerceptionAlloFeedback.class, "NegativePerceptionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeAttentionAlloFeedbackEClass, NegativeAttentionAlloFeedback.class, "NegativeAttentionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveAutoFeedbackEClass, PositiveAutoFeedback.class, "PositiveAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeAutoFeedbackEClass, NegativeAutoFeedback.class, "NegativeAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveExecutionAutoFeedbackEClass, PositiveExecutionAutoFeedback.class, "PositiveExecutionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeExecutionAutoFeedbackEClass, NegativeExecutionAutoFeedback.class, "NegativeExecutionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEvaluationAutoFeedbackEClass, PositiveEvaluationAutoFeedback.class, "PositiveEvaluationAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeEvaluationAutoFeedbackEClass, NegativeEvaluationAutoFeedback.class, "NegativeEvaluationAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positivePerceptionAutoFeedbackEClass, PositivePerceptionAutoFeedback.class, "PositivePerceptionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativePerceptionAutoFeedbackEClass, NegativePerceptionAutoFeedback.class, "NegativePerceptionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveInterpretationAutoFeedbackEClass, PositiveInterpretationAutoFeedback.class, "PositiveInterpretationAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeInterpretationAutoFeedbackEClass, NegativeInterpretationAutoFeedback.class, "NegativeInterpretationAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveAttentionAutoFeedbackEClass, PositiveAttentionAutoFeedback.class, "PositiveAttentionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeAttentionAutoFeedbackEClass, NegativeAttentionAutoFeedback.class, "NegativeAttentionAutoFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveAttentionAlloFeedbackEClass, PositiveAttentionAlloFeedback.class, "PositiveAttentionAlloFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(resolveStateEEnum, ResolveState.class, "ResolveState");
		addEEnumLiteral(resolveStateEEnum, ResolveState.UNDEFINED);
		addEEnumLiteral(resolveStateEEnum, ResolveState.RESOLVED);
		addEEnumLiteral(resolveStateEEnum, ResolveState.UNRESOLVED);

		// Initialize data types
		initEDataType(resolveStateObjectEDataType, Enumerator.class, "ResolveStateObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
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
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (resolveStateObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "ResolvedState"
		   });
	}

} // Communicative_functionsPackageImpl
