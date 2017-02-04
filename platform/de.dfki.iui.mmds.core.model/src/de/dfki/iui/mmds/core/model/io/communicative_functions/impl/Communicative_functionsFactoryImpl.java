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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptOffer;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptRequest;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptSuggestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AddressOffer;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AddressRequest;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Answer;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Apology;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ApologyDownplay;
import de.dfki.iui.mmds.core.model.io.communicative_functions.AttentionFeedbackElicitation;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Completion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Confirm;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ContactCheck;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ContactIndication;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CorrectMisspeaking;
import de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineOffer;
import de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineRequest;
import de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineSuggestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Disconfirm;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ErrorSignaling;
import de.dfki.iui.mmds.core.model.io.communicative_functions.EvaluationFeedackElicitation;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ExecutionFeedbackElicitation;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Inform;
import de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGoodbye;
import de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGreeting;
import de.dfki.iui.mmds.core.model.io.communicative_functions.InitialSelfIntroduction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Instruct;
import de.dfki.iui.mmds.core.model.io.communicative_functions.InterpretationFeedbackElicitation;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeCheckQuestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Opening;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Pausing;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PerceptionFeedbackElicitation;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveCheckQuestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAlloFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Preclosing;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Question;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Request;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Retraction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGoodbye;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGreeting;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnSelfIntroduction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SelfCorrection;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SetQuestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Stalling;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Suggestion;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Thanking;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ThankingDownplay;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TopicIntroduction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShift;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShiftAnnouncement;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAccept;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAssign;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnGrab;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnKeep;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnRelease;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Communicative_functionsFactoryImpl extends EFactoryImpl implements Communicative_functionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Communicative_functionsFactory init() {
		try {
			Communicative_functionsFactory theCommunicative_functionsFactory = (Communicative_functionsFactory)EPackage.Registry.INSTANCE.getEFactory(Communicative_functionsPackage.eNS_URI);
			if (theCommunicative_functionsFactory != null) {
				return theCommunicative_functionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Communicative_functionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicative_functionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Communicative_functionsPackage.SEMANTIC_CONTENT: return createSemanticContent();
			case Communicative_functionsPackage.QUESTION: return createQuestion();
			case Communicative_functionsPackage.SET_QUESTION: return createSetQuestion();
			case Communicative_functionsPackage.POSITIVE_CHECK_QUESTION: return createPositiveCheckQuestion();
			case Communicative_functionsPackage.NEGATIVE_CHECK_QUESTION: return createNegativeCheckQuestion();
			case Communicative_functionsPackage.INFORM: return createInform();
			case Communicative_functionsPackage.ANSWER: return createAnswer();
			case Communicative_functionsPackage.CONFIRM: return createConfirm();
			case Communicative_functionsPackage.DISCONFIRM: return createDisconfirm();
			case Communicative_functionsPackage.ADDRESS_REQUEST: return createAddressRequest();
			case Communicative_functionsPackage.ACCEPT_REQUEST: return createAcceptRequest();
			case Communicative_functionsPackage.DECLINE_REQUEST: return createDeclineRequest();
			case Communicative_functionsPackage.ACCEPT_SUGGESTION: return createAcceptSuggestion();
			case Communicative_functionsPackage.DECLINE_SUGGESTION: return createDeclineSuggestion();
			case Communicative_functionsPackage.REQUEST: return createRequest();
			case Communicative_functionsPackage.INSTRUCT: return createInstruct();
			case Communicative_functionsPackage.ADDRESS_OFFER: return createAddressOffer();
			case Communicative_functionsPackage.ACCEPT_OFFER: return createAcceptOffer();
			case Communicative_functionsPackage.DECLINE_OFFER: return createDeclineOffer();
			case Communicative_functionsPackage.SUGGESTION: return createSuggestion();
			case Communicative_functionsPackage.INITIAL_GREETING: return createInitialGreeting();
			case Communicative_functionsPackage.RETURN_GREETING: return createReturnGreeting();
			case Communicative_functionsPackage.INITIAL_SELF_INTRODUCTION: return createInitialSelfIntroduction();
			case Communicative_functionsPackage.RETURN_SELF_INTRODUCTION: return createReturnSelfIntroduction();
			case Communicative_functionsPackage.APOLOGY: return createApology();
			case Communicative_functionsPackage.APOLOGY_DOWNPLAY: return createApologyDownplay();
			case Communicative_functionsPackage.THANKING: return createThanking();
			case Communicative_functionsPackage.THANKING_DOWNPLAY: return createThankingDownplay();
			case Communicative_functionsPackage.INITIAL_GOODBYE: return createInitialGoodbye();
			case Communicative_functionsPackage.RETURN_GOODBYE: return createReturnGoodbye();
			case Communicative_functionsPackage.OPENING: return createOpening();
			case Communicative_functionsPackage.PRECLOSING: return createPreclosing();
			case Communicative_functionsPackage.TOPIC_INTRODUCTION: return createTopicIntroduction();
			case Communicative_functionsPackage.TOPIC_SHIFT_ANNOUNCEMENT: return createTopicShiftAnnouncement();
			case Communicative_functionsPackage.TOPIC_SHIFT: return createTopicShift();
			case Communicative_functionsPackage.COMPLETION: return createCompletion();
			case Communicative_functionsPackage.CORRECT_MISSPEAKING: return createCorrectMisspeaking();
			case Communicative_functionsPackage.ERROR_SIGNALING: return createErrorSignaling();
			case Communicative_functionsPackage.RETRACTION: return createRetraction();
			case Communicative_functionsPackage.SELF_CORRECTION: return createSelfCorrection();
			case Communicative_functionsPackage.CONTACT_CHECK: return createContactCheck();
			case Communicative_functionsPackage.CONTACT_INDICATION: return createContactIndication();
			case Communicative_functionsPackage.STALLING: return createStalling();
			case Communicative_functionsPackage.PAUSING: return createPausing();
			case Communicative_functionsPackage.TURN_ACCEPT: return createTurnAccept();
			case Communicative_functionsPackage.TURN_GRAB: return createTurnGrab();
			case Communicative_functionsPackage.TURN_TAKE: return createTurnTake();
			case Communicative_functionsPackage.TURN_ASSIGN: return createTurnAssign();
			case Communicative_functionsPackage.TURN_KEEP: return createTurnKeep();
			case Communicative_functionsPackage.TURN_RELEASE: return createTurnRelease();
			case Communicative_functionsPackage.ATTENTION_FEEDBACK_ELICITATION: return createAttentionFeedbackElicitation();
			case Communicative_functionsPackage.PERCEPTION_FEEDBACK_ELICITATION: return createPerceptionFeedbackElicitation();
			case Communicative_functionsPackage.INTERPRETATION_FEEDBACK_ELICITATION: return createInterpretationFeedbackElicitation();
			case Communicative_functionsPackage.EVALUATION_FEEDACK_ELICITATION: return createEvaluationFeedackElicitation();
			case Communicative_functionsPackage.EXECUTION_FEEDBACK_ELICITATION: return createExecutionFeedbackElicitation();
			case Communicative_functionsPackage.POSITIVE_ALLO_FEEDBACK: return createPositiveAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_ALLO_FEEDBACK: return createNegativeAlloFeedback();
			case Communicative_functionsPackage.POSITIVE_EXECUTION_ALLO_FEEDBACK: return createPositiveExecutionAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_EXECUTION_ALLO_FEEDBACK: return createNegativeExecutionAlloFeedback();
			case Communicative_functionsPackage.POSITIVE_EVALUATION_ALLO_FEEDBACK: return createPositiveEvaluationAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_EVALUATION_ALLO_FEEDBACK: return createNegativeEvaluationAlloFeedback();
			case Communicative_functionsPackage.POSITIVE_INTERPRETATION_ALLO_FEEDBACK: return createPositiveInterpretationAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_INTERPRETATION_ALLO_FEEDBACK: return createNegativeInterpretationAlloFeedback();
			case Communicative_functionsPackage.POSITIVE_PERCEPTION_ALLO_FEEDBACK: return createPositivePerceptionAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_PERCEPTION_ALLO_FEEDBACK: return createNegativePerceptionAlloFeedback();
			case Communicative_functionsPackage.NEGATIVE_ATTENTION_ALLO_FEEDBACK: return createNegativeAttentionAlloFeedback();
			case Communicative_functionsPackage.POSITIVE_AUTO_FEEDBACK: return createPositiveAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_AUTO_FEEDBACK: return createNegativeAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_EXECUTION_AUTO_FEEDBACK: return createPositiveExecutionAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_EXECUTION_AUTO_FEEDBACK: return createNegativeExecutionAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_EVALUATION_AUTO_FEEDBACK: return createPositiveEvaluationAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_EVALUATION_AUTO_FEEDBACK: return createNegativeEvaluationAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_PERCEPTION_AUTO_FEEDBACK: return createPositivePerceptionAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK: return createNegativePerceptionAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK: return createPositiveInterpretationAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_INTERPRETATION_AUTO_FEEDBACK: return createNegativeInterpretationAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_ATTENTION_AUTO_FEEDBACK: return createPositiveAttentionAutoFeedback();
			case Communicative_functionsPackage.NEGATIVE_ATTENTION_AUTO_FEEDBACK: return createNegativeAttentionAutoFeedback();
			case Communicative_functionsPackage.POSITIVE_ATTENTION_ALLO_FEEDBACK: return createPositiveAttentionAlloFeedback();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Communicative_functionsPackage.RESOLVE_STATE:
				return createResolveStateFromString(eDataType, initialValue);
			case Communicative_functionsPackage.RESOLVE_STATE_OBJECT:
				return createResolveStateObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Communicative_functionsPackage.RESOLVE_STATE:
				return convertResolveStateToString(eDataType, instanceValue);
			case Communicative_functionsPackage.RESOLVE_STATE_OBJECT:
				return convertResolveStateObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticContent createSemanticContent() {
		SemanticContentImpl semanticContent = new SemanticContentImpl();
		return semanticContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetQuestion createSetQuestion() {
		SetQuestionImpl setQuestion = new SetQuestionImpl();
		return setQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveCheckQuestion createPositiveCheckQuestion() {
		PositiveCheckQuestionImpl positiveCheckQuestion = new PositiveCheckQuestionImpl();
		return positiveCheckQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeCheckQuestion createNegativeCheckQuestion() {
		NegativeCheckQuestionImpl negativeCheckQuestion = new NegativeCheckQuestionImpl();
		return negativeCheckQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inform createInform() {
		InformImpl inform = new InformImpl();
		return inform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confirm createConfirm() {
		ConfirmImpl confirm = new ConfirmImpl();
		return confirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconfirm createDisconfirm() {
		DisconfirmImpl disconfirm = new DisconfirmImpl();
		return disconfirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressRequest createAddressRequest() {
		AddressRequestImpl addressRequest = new AddressRequestImpl();
		return addressRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptRequest createAcceptRequest() {
		AcceptRequestImpl acceptRequest = new AcceptRequestImpl();
		return acceptRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclineRequest createDeclineRequest() {
		DeclineRequestImpl declineRequest = new DeclineRequestImpl();
		return declineRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptSuggestion createAcceptSuggestion() {
		AcceptSuggestionImpl acceptSuggestion = new AcceptSuggestionImpl();
		return acceptSuggestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclineSuggestion createDeclineSuggestion() {
		DeclineSuggestionImpl declineSuggestion = new DeclineSuggestionImpl();
		return declineSuggestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruct createInstruct() {
		InstructImpl instruct = new InstructImpl();
		return instruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressOffer createAddressOffer() {
		AddressOfferImpl addressOffer = new AddressOfferImpl();
		return addressOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptOffer createAcceptOffer() {
		AcceptOfferImpl acceptOffer = new AcceptOfferImpl();
		return acceptOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclineOffer createDeclineOffer() {
		DeclineOfferImpl declineOffer = new DeclineOfferImpl();
		return declineOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suggestion createSuggestion() {
		SuggestionImpl suggestion = new SuggestionImpl();
		return suggestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialGreeting createInitialGreeting() {
		InitialGreetingImpl initialGreeting = new InitialGreetingImpl();
		return initialGreeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnGreeting createReturnGreeting() {
		ReturnGreetingImpl returnGreeting = new ReturnGreetingImpl();
		return returnGreeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialSelfIntroduction createInitialSelfIntroduction() {
		InitialSelfIntroductionImpl initialSelfIntroduction = new InitialSelfIntroductionImpl();
		return initialSelfIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSelfIntroduction createReturnSelfIntroduction() {
		ReturnSelfIntroductionImpl returnSelfIntroduction = new ReturnSelfIntroductionImpl();
		return returnSelfIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apology createApology() {
		ApologyImpl apology = new ApologyImpl();
		return apology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApologyDownplay createApologyDownplay() {
		ApologyDownplayImpl apologyDownplay = new ApologyDownplayImpl();
		return apologyDownplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thanking createThanking() {
		ThankingImpl thanking = new ThankingImpl();
		return thanking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThankingDownplay createThankingDownplay() {
		ThankingDownplayImpl thankingDownplay = new ThankingDownplayImpl();
		return thankingDownplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialGoodbye createInitialGoodbye() {
		InitialGoodbyeImpl initialGoodbye = new InitialGoodbyeImpl();
		return initialGoodbye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnGoodbye createReturnGoodbye() {
		ReturnGoodbyeImpl returnGoodbye = new ReturnGoodbyeImpl();
		return returnGoodbye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opening createOpening() {
		OpeningImpl opening = new OpeningImpl();
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preclosing createPreclosing() {
		PreclosingImpl preclosing = new PreclosingImpl();
		return preclosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicIntroduction createTopicIntroduction() {
		TopicIntroductionImpl topicIntroduction = new TopicIntroductionImpl();
		return topicIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicShiftAnnouncement createTopicShiftAnnouncement() {
		TopicShiftAnnouncementImpl topicShiftAnnouncement = new TopicShiftAnnouncementImpl();
		return topicShiftAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicShift createTopicShift() {
		TopicShiftImpl topicShift = new TopicShiftImpl();
		return topicShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Completion createCompletion() {
		CompletionImpl completion = new CompletionImpl();
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectMisspeaking createCorrectMisspeaking() {
		CorrectMisspeakingImpl correctMisspeaking = new CorrectMisspeakingImpl();
		return correctMisspeaking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSignaling createErrorSignaling() {
		ErrorSignalingImpl errorSignaling = new ErrorSignalingImpl();
		return errorSignaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retraction createRetraction() {
		RetractionImpl retraction = new RetractionImpl();
		return retraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfCorrection createSelfCorrection() {
		SelfCorrectionImpl selfCorrection = new SelfCorrectionImpl();
		return selfCorrection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactCheck createContactCheck() {
		ContactCheckImpl contactCheck = new ContactCheckImpl();
		return contactCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactIndication createContactIndication() {
		ContactIndicationImpl contactIndication = new ContactIndicationImpl();
		return contactIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stalling createStalling() {
		StallingImpl stalling = new StallingImpl();
		return stalling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pausing createPausing() {
		PausingImpl pausing = new PausingImpl();
		return pausing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnAccept createTurnAccept() {
		TurnAcceptImpl turnAccept = new TurnAcceptImpl();
		return turnAccept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnGrab createTurnGrab() {
		TurnGrabImpl turnGrab = new TurnGrabImpl();
		return turnGrab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTake createTurnTake() {
		TurnTakeImpl turnTake = new TurnTakeImpl();
		return turnTake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnAssign createTurnAssign() {
		TurnAssignImpl turnAssign = new TurnAssignImpl();
		return turnAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnKeep createTurnKeep() {
		TurnKeepImpl turnKeep = new TurnKeepImpl();
		return turnKeep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRelease createTurnRelease() {
		TurnReleaseImpl turnRelease = new TurnReleaseImpl();
		return turnRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttentionFeedbackElicitation createAttentionFeedbackElicitation() {
		AttentionFeedbackElicitationImpl attentionFeedbackElicitation = new AttentionFeedbackElicitationImpl();
		return attentionFeedbackElicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerceptionFeedbackElicitation createPerceptionFeedbackElicitation() {
		PerceptionFeedbackElicitationImpl perceptionFeedbackElicitation = new PerceptionFeedbackElicitationImpl();
		return perceptionFeedbackElicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationFeedbackElicitation createInterpretationFeedbackElicitation() {
		InterpretationFeedbackElicitationImpl interpretationFeedbackElicitation = new InterpretationFeedbackElicitationImpl();
		return interpretationFeedbackElicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationFeedackElicitation createEvaluationFeedackElicitation() {
		EvaluationFeedackElicitationImpl evaluationFeedackElicitation = new EvaluationFeedackElicitationImpl();
		return evaluationFeedackElicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFeedbackElicitation createExecutionFeedbackElicitation() {
		ExecutionFeedbackElicitationImpl executionFeedbackElicitation = new ExecutionFeedbackElicitationImpl();
		return executionFeedbackElicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAlloFeedback createPositiveAlloFeedback() {
		PositiveAlloFeedbackImpl positiveAlloFeedback = new PositiveAlloFeedbackImpl();
		return positiveAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAlloFeedback createNegativeAlloFeedback() {
		NegativeAlloFeedbackImpl negativeAlloFeedback = new NegativeAlloFeedbackImpl();
		return negativeAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveExecutionAlloFeedback createPositiveExecutionAlloFeedback() {
		PositiveExecutionAlloFeedbackImpl positiveExecutionAlloFeedback = new PositiveExecutionAlloFeedbackImpl();
		return positiveExecutionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeExecutionAlloFeedback createNegativeExecutionAlloFeedback() {
		NegativeExecutionAlloFeedbackImpl negativeExecutionAlloFeedback = new NegativeExecutionAlloFeedbackImpl();
		return negativeExecutionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveEvaluationAlloFeedback createPositiveEvaluationAlloFeedback() {
		PositiveEvaluationAlloFeedbackImpl positiveEvaluationAlloFeedback = new PositiveEvaluationAlloFeedbackImpl();
		return positiveEvaluationAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeEvaluationAlloFeedback createNegativeEvaluationAlloFeedback() {
		NegativeEvaluationAlloFeedbackImpl negativeEvaluationAlloFeedback = new NegativeEvaluationAlloFeedbackImpl();
		return negativeEvaluationAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInterpretationAlloFeedback createPositiveInterpretationAlloFeedback() {
		PositiveInterpretationAlloFeedbackImpl positiveInterpretationAlloFeedback = new PositiveInterpretationAlloFeedbackImpl();
		return positiveInterpretationAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeInterpretationAlloFeedback createNegativeInterpretationAlloFeedback() {
		NegativeInterpretationAlloFeedbackImpl negativeInterpretationAlloFeedback = new NegativeInterpretationAlloFeedbackImpl();
		return negativeInterpretationAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositivePerceptionAlloFeedback createPositivePerceptionAlloFeedback() {
		PositivePerceptionAlloFeedbackImpl positivePerceptionAlloFeedback = new PositivePerceptionAlloFeedbackImpl();
		return positivePerceptionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativePerceptionAlloFeedback createNegativePerceptionAlloFeedback() {
		NegativePerceptionAlloFeedbackImpl negativePerceptionAlloFeedback = new NegativePerceptionAlloFeedbackImpl();
		return negativePerceptionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAttentionAlloFeedback createNegativeAttentionAlloFeedback() {
		NegativeAttentionAlloFeedbackImpl negativeAttentionAlloFeedback = new NegativeAttentionAlloFeedbackImpl();
		return negativeAttentionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAutoFeedback createPositiveAutoFeedback() {
		PositiveAutoFeedbackImpl positiveAutoFeedback = new PositiveAutoFeedbackImpl();
		return positiveAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAutoFeedback createNegativeAutoFeedback() {
		NegativeAutoFeedbackImpl negativeAutoFeedback = new NegativeAutoFeedbackImpl();
		return negativeAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveExecutionAutoFeedback createPositiveExecutionAutoFeedback() {
		PositiveExecutionAutoFeedbackImpl positiveExecutionAutoFeedback = new PositiveExecutionAutoFeedbackImpl();
		return positiveExecutionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeExecutionAutoFeedback createNegativeExecutionAutoFeedback() {
		NegativeExecutionAutoFeedbackImpl negativeExecutionAutoFeedback = new NegativeExecutionAutoFeedbackImpl();
		return negativeExecutionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveEvaluationAutoFeedback createPositiveEvaluationAutoFeedback() {
		PositiveEvaluationAutoFeedbackImpl positiveEvaluationAutoFeedback = new PositiveEvaluationAutoFeedbackImpl();
		return positiveEvaluationAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeEvaluationAutoFeedback createNegativeEvaluationAutoFeedback() {
		NegativeEvaluationAutoFeedbackImpl negativeEvaluationAutoFeedback = new NegativeEvaluationAutoFeedbackImpl();
		return negativeEvaluationAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositivePerceptionAutoFeedback createPositivePerceptionAutoFeedback() {
		PositivePerceptionAutoFeedbackImpl positivePerceptionAutoFeedback = new PositivePerceptionAutoFeedbackImpl();
		return positivePerceptionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativePerceptionAutoFeedback createNegativePerceptionAutoFeedback() {
		NegativePerceptionAutoFeedbackImpl negativePerceptionAutoFeedback = new NegativePerceptionAutoFeedbackImpl();
		return negativePerceptionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInterpretationAutoFeedback createPositiveInterpretationAutoFeedback() {
		PositiveInterpretationAutoFeedbackImpl positiveInterpretationAutoFeedback = new PositiveInterpretationAutoFeedbackImpl();
		return positiveInterpretationAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeInterpretationAutoFeedback createNegativeInterpretationAutoFeedback() {
		NegativeInterpretationAutoFeedbackImpl negativeInterpretationAutoFeedback = new NegativeInterpretationAutoFeedbackImpl();
		return negativeInterpretationAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAttentionAutoFeedback createPositiveAttentionAutoFeedback() {
		PositiveAttentionAutoFeedbackImpl positiveAttentionAutoFeedback = new PositiveAttentionAutoFeedbackImpl();
		return positiveAttentionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAttentionAutoFeedback createNegativeAttentionAutoFeedback() {
		NegativeAttentionAutoFeedbackImpl negativeAttentionAutoFeedback = new NegativeAttentionAutoFeedbackImpl();
		return negativeAttentionAutoFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAttentionAlloFeedback createPositiveAttentionAlloFeedback() {
		PositiveAttentionAlloFeedbackImpl positiveAttentionAlloFeedback = new PositiveAttentionAlloFeedbackImpl();
		return positiveAttentionAlloFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveState createResolveStateFromString(EDataType eDataType, String initialValue) {
		ResolveState result = ResolveState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createResolveStateObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveStateObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicative_functionsPackage getCommunicative_functionsPackage() {
		return (Communicative_functionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Communicative_functionsPackage getPackage() {
		return Communicative_functionsPackage.eINSTANCE;
	}

} //Communicative_functionsFactoryImpl
