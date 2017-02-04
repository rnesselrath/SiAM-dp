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
package de.dfki.iui.mmds.core.model.io.communicative_functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage
 * @generated
 */
public interface Communicative_functionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Communicative_functionsFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Semantic Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Content</em>'.
	 * @generated
	 */
	SemanticContent createSemanticContent();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Set Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Question</em>'.
	 * @generated
	 */
	SetQuestion createSetQuestion();

	/**
	 * Returns a new object of class '<em>Positive Check Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Check Question</em>'.
	 * @generated
	 */
	PositiveCheckQuestion createPositiveCheckQuestion();

	/**
	 * Returns a new object of class '<em>Negative Check Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Check Question</em>'.
	 * @generated
	 */
	NegativeCheckQuestion createNegativeCheckQuestion();

	/**
	 * Returns a new object of class '<em>Inform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inform</em>'.
	 * @generated
	 */
	Inform createInform();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Confirm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirm</em>'.
	 * @generated
	 */
	Confirm createConfirm();

	/**
	 * Returns a new object of class '<em>Disconfirm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconfirm</em>'.
	 * @generated
	 */
	Disconfirm createDisconfirm();

	/**
	 * Returns a new object of class '<em>Address Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Request</em>'.
	 * @generated
	 */
	AddressRequest createAddressRequest();

	/**
	 * Returns a new object of class '<em>Accept Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Request</em>'.
	 * @generated
	 */
	AcceptRequest createAcceptRequest();

	/**
	 * Returns a new object of class '<em>Decline Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decline Request</em>'.
	 * @generated
	 */
	DeclineRequest createDeclineRequest();

	/**
	 * Returns a new object of class '<em>Accept Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Suggestion</em>'.
	 * @generated
	 */
	AcceptSuggestion createAcceptSuggestion();

	/**
	 * Returns a new object of class '<em>Decline Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decline Suggestion</em>'.
	 * @generated
	 */
	DeclineSuggestion createDeclineSuggestion();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Instruct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruct</em>'.
	 * @generated
	 */
	Instruct createInstruct();

	/**
	 * Returns a new object of class '<em>Address Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Offer</em>'.
	 * @generated
	 */
	AddressOffer createAddressOffer();

	/**
	 * Returns a new object of class '<em>Accept Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Offer</em>'.
	 * @generated
	 */
	AcceptOffer createAcceptOffer();

	/**
	 * Returns a new object of class '<em>Decline Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decline Offer</em>'.
	 * @generated
	 */
	DeclineOffer createDeclineOffer();

	/**
	 * Returns a new object of class '<em>Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suggestion</em>'.
	 * @generated
	 */
	Suggestion createSuggestion();

	/**
	 * Returns a new object of class '<em>Initial Greeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Greeting</em>'.
	 * @generated
	 */
	InitialGreeting createInitialGreeting();

	/**
	 * Returns a new object of class '<em>Return Greeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Greeting</em>'.
	 * @generated
	 */
	ReturnGreeting createReturnGreeting();

	/**
	 * Returns a new object of class '<em>Initial Self Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Self Introduction</em>'.
	 * @generated
	 */
	InitialSelfIntroduction createInitialSelfIntroduction();

	/**
	 * Returns a new object of class '<em>Return Self Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Self Introduction</em>'.
	 * @generated
	 */
	ReturnSelfIntroduction createReturnSelfIntroduction();

	/**
	 * Returns a new object of class '<em>Apology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apology</em>'.
	 * @generated
	 */
	Apology createApology();

	/**
	 * Returns a new object of class '<em>Apology Downplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apology Downplay</em>'.
	 * @generated
	 */
	ApologyDownplay createApologyDownplay();

	/**
	 * Returns a new object of class '<em>Thanking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thanking</em>'.
	 * @generated
	 */
	Thanking createThanking();

	/**
	 * Returns a new object of class '<em>Thanking Downplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thanking Downplay</em>'.
	 * @generated
	 */
	ThankingDownplay createThankingDownplay();

	/**
	 * Returns a new object of class '<em>Initial Goodbye</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Goodbye</em>'.
	 * @generated
	 */
	InitialGoodbye createInitialGoodbye();

	/**
	 * Returns a new object of class '<em>Return Goodbye</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Goodbye</em>'.
	 * @generated
	 */
	ReturnGoodbye createReturnGoodbye();

	/**
	 * Returns a new object of class '<em>Opening</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opening</em>'.
	 * @generated
	 */
	Opening createOpening();

	/**
	 * Returns a new object of class '<em>Preclosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preclosing</em>'.
	 * @generated
	 */
	Preclosing createPreclosing();

	/**
	 * Returns a new object of class '<em>Topic Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Introduction</em>'.
	 * @generated
	 */
	TopicIntroduction createTopicIntroduction();

	/**
	 * Returns a new object of class '<em>Topic Shift Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Shift Announcement</em>'.
	 * @generated
	 */
	TopicShiftAnnouncement createTopicShiftAnnouncement();

	/**
	 * Returns a new object of class '<em>Topic Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Shift</em>'.
	 * @generated
	 */
	TopicShift createTopicShift();

	/**
	 * Returns a new object of class '<em>Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completion</em>'.
	 * @generated
	 */
	Completion createCompletion();

	/**
	 * Returns a new object of class '<em>Correct Misspeaking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correct Misspeaking</em>'.
	 * @generated
	 */
	CorrectMisspeaking createCorrectMisspeaking();

	/**
	 * Returns a new object of class '<em>Error Signaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Signaling</em>'.
	 * @generated
	 */
	ErrorSignaling createErrorSignaling();

	/**
	 * Returns a new object of class '<em>Retraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retraction</em>'.
	 * @generated
	 */
	Retraction createRetraction();

	/**
	 * Returns a new object of class '<em>Self Correction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Correction</em>'.
	 * @generated
	 */
	SelfCorrection createSelfCorrection();

	/**
	 * Returns a new object of class '<em>Contact Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Check</em>'.
	 * @generated
	 */
	ContactCheck createContactCheck();

	/**
	 * Returns a new object of class '<em>Contact Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Indication</em>'.
	 * @generated
	 */
	ContactIndication createContactIndication();

	/**
	 * Returns a new object of class '<em>Stalling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stalling</em>'.
	 * @generated
	 */
	Stalling createStalling();

	/**
	 * Returns a new object of class '<em>Pausing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pausing</em>'.
	 * @generated
	 */
	Pausing createPausing();

	/**
	 * Returns a new object of class '<em>Turn Accept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Accept</em>'.
	 * @generated
	 */
	TurnAccept createTurnAccept();

	/**
	 * Returns a new object of class '<em>Turn Grab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Grab</em>'.
	 * @generated
	 */
	TurnGrab createTurnGrab();

	/**
	 * Returns a new object of class '<em>Turn Take</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Take</em>'.
	 * @generated
	 */
	TurnTake createTurnTake();

	/**
	 * Returns a new object of class '<em>Turn Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Assign</em>'.
	 * @generated
	 */
	TurnAssign createTurnAssign();

	/**
	 * Returns a new object of class '<em>Turn Keep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Keep</em>'.
	 * @generated
	 */
	TurnKeep createTurnKeep();

	/**
	 * Returns a new object of class '<em>Turn Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Release</em>'.
	 * @generated
	 */
	TurnRelease createTurnRelease();

	/**
	 * Returns a new object of class '<em>Attention Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attention Feedback Elicitation</em>'.
	 * @generated
	 */
	AttentionFeedbackElicitation createAttentionFeedbackElicitation();

	/**
	 * Returns a new object of class '<em>Perception Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perception Feedback Elicitation</em>'.
	 * @generated
	 */
	PerceptionFeedbackElicitation createPerceptionFeedbackElicitation();

	/**
	 * Returns a new object of class '<em>Interpretation Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpretation Feedback Elicitation</em>'.
	 * @generated
	 */
	InterpretationFeedbackElicitation createInterpretationFeedbackElicitation();

	/**
	 * Returns a new object of class '<em>Evaluation Feedack Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Feedack Elicitation</em>'.
	 * @generated
	 */
	EvaluationFeedackElicitation createEvaluationFeedackElicitation();

	/**
	 * Returns a new object of class '<em>Execution Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Feedback Elicitation</em>'.
	 * @generated
	 */
	ExecutionFeedbackElicitation createExecutionFeedbackElicitation();

	/**
	 * Returns a new object of class '<em>Positive Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Allo Feedback</em>'.
	 * @generated
	 */
	PositiveAlloFeedback createPositiveAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Allo Feedback</em>'.
	 * @generated
	 */
	NegativeAlloFeedback createNegativeAlloFeedback();

	/**
	 * Returns a new object of class '<em>Positive Execution Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Execution Allo Feedback</em>'.
	 * @generated
	 */
	PositiveExecutionAlloFeedback createPositiveExecutionAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Execution Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Execution Allo Feedback</em>'.
	 * @generated
	 */
	NegativeExecutionAlloFeedback createNegativeExecutionAlloFeedback();

	/**
	 * Returns a new object of class '<em>Positive Evaluation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Evaluation Allo Feedback</em>'.
	 * @generated
	 */
	PositiveEvaluationAlloFeedback createPositiveEvaluationAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Evaluation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Evaluation Allo Feedback</em>'.
	 * @generated
	 */
	NegativeEvaluationAlloFeedback createNegativeEvaluationAlloFeedback();

	/**
	 * Returns a new object of class '<em>Positive Interpretation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Interpretation Allo Feedback</em>'.
	 * @generated
	 */
	PositiveInterpretationAlloFeedback createPositiveInterpretationAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Interpretation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Interpretation Allo Feedback</em>'.
	 * @generated
	 */
	NegativeInterpretationAlloFeedback createNegativeInterpretationAlloFeedback();

	/**
	 * Returns a new object of class '<em>Positive Perception Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Perception Allo Feedback</em>'.
	 * @generated
	 */
	PositivePerceptionAlloFeedback createPositivePerceptionAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Perception Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Perception Allo Feedback</em>'.
	 * @generated
	 */
	NegativePerceptionAlloFeedback createNegativePerceptionAlloFeedback();

	/**
	 * Returns a new object of class '<em>Negative Attention Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Attention Allo Feedback</em>'.
	 * @generated
	 */
	NegativeAttentionAlloFeedback createNegativeAttentionAlloFeedback();

	/**
	 * Returns a new object of class '<em>Positive Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Auto Feedback</em>'.
	 * @generated
	 */
	PositiveAutoFeedback createPositiveAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Auto Feedback</em>'.
	 * @generated
	 */
	NegativeAutoFeedback createNegativeAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Execution Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Execution Auto Feedback</em>'.
	 * @generated
	 */
	PositiveExecutionAutoFeedback createPositiveExecutionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Execution Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Execution Auto Feedback</em>'.
	 * @generated
	 */
	NegativeExecutionAutoFeedback createNegativeExecutionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Evaluation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Evaluation Auto Feedback</em>'.
	 * @generated
	 */
	PositiveEvaluationAutoFeedback createPositiveEvaluationAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Evaluation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Evaluation Auto Feedback</em>'.
	 * @generated
	 */
	NegativeEvaluationAutoFeedback createNegativeEvaluationAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Perception Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Perception Auto Feedback</em>'.
	 * @generated
	 */
	PositivePerceptionAutoFeedback createPositivePerceptionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Perception Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Perception Auto Feedback</em>'.
	 * @generated
	 */
	NegativePerceptionAutoFeedback createNegativePerceptionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Interpretation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Interpretation Auto Feedback</em>'.
	 * @generated
	 */
	PositiveInterpretationAutoFeedback createPositiveInterpretationAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Interpretation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Interpretation Auto Feedback</em>'.
	 * @generated
	 */
	NegativeInterpretationAutoFeedback createNegativeInterpretationAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Attention Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Attention Auto Feedback</em>'.
	 * @generated
	 */
	PositiveAttentionAutoFeedback createPositiveAttentionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Negative Attention Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Attention Auto Feedback</em>'.
	 * @generated
	 */
	NegativeAttentionAutoFeedback createNegativeAttentionAutoFeedback();

	/**
	 * Returns a new object of class '<em>Positive Attention Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Attention Allo Feedback</em>'.
	 * @generated
	 */
	PositiveAttentionAlloFeedback createPositiveAttentionAlloFeedback();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Communicative_functionsPackage getCommunicative_functionsPackage();

} //Communicative_functionsFactory
