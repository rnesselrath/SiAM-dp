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
package de.dfki.iui.mmds.core.model.io.communicative_functions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.communicative_functions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage
 * @generated
 */
public class Communicative_functionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Communicative_functionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicative_functionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Communicative_functionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Communicative_functionsSwitch<Adapter> modelSwitch =
		new Communicative_functionsSwitch<Adapter>() {
			@Override
			public Adapter caseSemanticContent(SemanticContent object) {
				return createSemanticContentAdapter();
			}
			@Override
			public Adapter caseCommunicativeFunction(CommunicativeFunction object) {
				return createCommunicativeFunctionAdapter();
			}
			@Override
			public Adapter caseGeneralPurposeCommunicativeFunction(GeneralPurposeCommunicativeFunction object) {
				return createGeneralPurposeCommunicativeFunctionAdapter();
			}
			@Override
			public Adapter caseInformationTransferFunction(InformationTransferFunction object) {
				return createInformationTransferFunctionAdapter();
			}
			@Override
			public Adapter caseInformationSeekingFunction(InformationSeekingFunction object) {
				return createInformationSeekingFunctionAdapter();
			}
			@Override
			public Adapter caseInformationProvidingFunction(InformationProvidingFunction object) {
				return createInformationProvidingFunctionAdapter();
			}
			@Override
			public Adapter caseActionDiscussionFunction(ActionDiscussionFunction object) {
				return createActionDiscussionFunctionAdapter();
			}
			@Override
			public Adapter caseCommissive(Commissive object) {
				return createCommissiveAdapter();
			}
			@Override
			public Adapter caseDirective(Directive object) {
				return createDirectiveAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseSetQuestion(SetQuestion object) {
				return createSetQuestionAdapter();
			}
			@Override
			public Adapter casePropositionalQuestion(PropositionalQuestion object) {
				return createPropositionalQuestionAdapter();
			}
			@Override
			public Adapter caseCheckQuestion(CheckQuestion object) {
				return createCheckQuestionAdapter();
			}
			@Override
			public Adapter casePositiveCheckQuestion(PositiveCheckQuestion object) {
				return createPositiveCheckQuestionAdapter();
			}
			@Override
			public Adapter caseNegativeCheckQuestion(NegativeCheckQuestion object) {
				return createNegativeCheckQuestionAdapter();
			}
			@Override
			public Adapter caseChoiceQuestion(ChoiceQuestion object) {
				return createChoiceQuestionAdapter();
			}
			@Override
			public Adapter caseInform(Inform object) {
				return createInformAdapter();
			}
			@Override
			public Adapter caseAgreement(Agreement object) {
				return createAgreementAdapter();
			}
			@Override
			public Adapter caseDisagreement(Disagreement object) {
				return createDisagreementAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseCorrection(Correction object) {
				return createCorrectionAdapter();
			}
			@Override
			public Adapter caseConfirm(Confirm object) {
				return createConfirmAdapter();
			}
			@Override
			public Adapter caseDisconfirm(Disconfirm object) {
				return createDisconfirmAdapter();
			}
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
			}
			@Override
			public Adapter caseAddressSuggestion(AddressSuggestion object) {
				return createAddressSuggestionAdapter();
			}
			@Override
			public Adapter casePromise(Promise object) {
				return createPromiseAdapter();
			}
			@Override
			public Adapter caseThreat(Threat object) {
				return createThreatAdapter();
			}
			@Override
			public Adapter caseAddressRequest(AddressRequest object) {
				return createAddressRequestAdapter();
			}
			@Override
			public Adapter caseAcceptRequest(AcceptRequest object) {
				return createAcceptRequestAdapter();
			}
			@Override
			public Adapter caseDeclineRequest(DeclineRequest object) {
				return createDeclineRequestAdapter();
			}
			@Override
			public Adapter caseAcceptSuggestion(AcceptSuggestion object) {
				return createAcceptSuggestionAdapter();
			}
			@Override
			public Adapter caseDeclineSuggestion(DeclineSuggestion object) {
				return createDeclineSuggestionAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseInstruct(Instruct object) {
				return createInstructAdapter();
			}
			@Override
			public Adapter caseAddressOffer(AddressOffer object) {
				return createAddressOfferAdapter();
			}
			@Override
			public Adapter caseAcceptOffer(AcceptOffer object) {
				return createAcceptOfferAdapter();
			}
			@Override
			public Adapter caseDeclineOffer(DeclineOffer object) {
				return createDeclineOfferAdapter();
			}
			@Override
			public Adapter caseSuggestion(Suggestion object) {
				return createSuggestionAdapter();
			}
			@Override
			public Adapter caseDimensionSpecificCommunicativeFunction(DimensionSpecificCommunicativeFunction object) {
				return createDimensionSpecificCommunicativeFunctionAdapter();
			}
			@Override
			public Adapter caseDialogueControlFunction(DialogueControlFunction object) {
				return createDialogueControlFunctionAdapter();
			}
			@Override
			public Adapter caseFeedbackFunction(FeedbackFunction object) {
				return createFeedbackFunctionAdapter();
			}
			@Override
			public Adapter caseAutoFeedback(AutoFeedback object) {
				return createAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseAlloFeedback(AlloFeedback object) {
				return createAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseInteractionManagementFunction(InteractionManagementFunction object) {
				return createInteractionManagementFunctionAdapter();
			}
			@Override
			public Adapter caseTurnManagementFunction(TurnManagementFunction object) {
				return createTurnManagementFunctionAdapter();
			}
			@Override
			public Adapter caseTimeManagementFunction(TimeManagementFunction object) {
				return createTimeManagementFunctionAdapter();
			}
			@Override
			public Adapter caseContactManagementFunction(ContactManagementFunction object) {
				return createContactManagementFunctionAdapter();
			}
			@Override
			public Adapter caseOwnCommunicationManagementFunction(OwnCommunicationManagementFunction object) {
				return createOwnCommunicationManagementFunctionAdapter();
			}
			@Override
			public Adapter casePartnerCommunicationManagementFunction(PartnerCommunicationManagementFunction object) {
				return createPartnerCommunicationManagementFunctionAdapter();
			}
			@Override
			public Adapter caseDiscourseStructureManagementFunction(DiscourseStructureManagementFunction object) {
				return createDiscourseStructureManagementFunctionAdapter();
			}
			@Override
			public Adapter caseSocialObligationManagementFunction(SocialObligationManagementFunction object) {
				return createSocialObligationManagementFunctionAdapter();
			}
			@Override
			public Adapter caseSalutation(Salutation object) {
				return createSalutationAdapter();
			}
			@Override
			public Adapter caseSelfIntroduction(SelfIntroduction object) {
				return createSelfIntroductionAdapter();
			}
			@Override
			public Adapter caseApologizing(Apologizing object) {
				return createApologizingAdapter();
			}
			@Override
			public Adapter caseGratitude(Gratitude object) {
				return createGratitudeAdapter();
			}
			@Override
			public Adapter caseValediction(Valediction object) {
				return createValedictionAdapter();
			}
			@Override
			public Adapter caseInitialGreeting(InitialGreeting object) {
				return createInitialGreetingAdapter();
			}
			@Override
			public Adapter caseReturnGreeting(ReturnGreeting object) {
				return createReturnGreetingAdapter();
			}
			@Override
			public Adapter caseInitialSelfIntroduction(InitialSelfIntroduction object) {
				return createInitialSelfIntroductionAdapter();
			}
			@Override
			public Adapter caseReturnSelfIntroduction(ReturnSelfIntroduction object) {
				return createReturnSelfIntroductionAdapter();
			}
			@Override
			public Adapter caseApology(Apology object) {
				return createApologyAdapter();
			}
			@Override
			public Adapter caseApologyDownplay(ApologyDownplay object) {
				return createApologyDownplayAdapter();
			}
			@Override
			public Adapter caseThanking(Thanking object) {
				return createThankingAdapter();
			}
			@Override
			public Adapter caseThankingDownplay(ThankingDownplay object) {
				return createThankingDownplayAdapter();
			}
			@Override
			public Adapter caseInitialGoodbye(InitialGoodbye object) {
				return createInitialGoodbyeAdapter();
			}
			@Override
			public Adapter caseReturnGoodbye(ReturnGoodbye object) {
				return createReturnGoodbyeAdapter();
			}
			@Override
			public Adapter caseOpening(Opening object) {
				return createOpeningAdapter();
			}
			@Override
			public Adapter casePreclosing(Preclosing object) {
				return createPreclosingAdapter();
			}
			@Override
			public Adapter caseTopicIntroduction(TopicIntroduction object) {
				return createTopicIntroductionAdapter();
			}
			@Override
			public Adapter caseTopicShiftAnnouncement(TopicShiftAnnouncement object) {
				return createTopicShiftAnnouncementAdapter();
			}
			@Override
			public Adapter caseTopicShift(TopicShift object) {
				return createTopicShiftAdapter();
			}
			@Override
			public Adapter caseCompletion(Completion object) {
				return createCompletionAdapter();
			}
			@Override
			public Adapter caseCorrectMisspeaking(CorrectMisspeaking object) {
				return createCorrectMisspeakingAdapter();
			}
			@Override
			public Adapter caseErrorSignaling(ErrorSignaling object) {
				return createErrorSignalingAdapter();
			}
			@Override
			public Adapter caseRetraction(Retraction object) {
				return createRetractionAdapter();
			}
			@Override
			public Adapter caseSelfCorrection(SelfCorrection object) {
				return createSelfCorrectionAdapter();
			}
			@Override
			public Adapter caseContactCheck(ContactCheck object) {
				return createContactCheckAdapter();
			}
			@Override
			public Adapter caseContactIndication(ContactIndication object) {
				return createContactIndicationAdapter();
			}
			@Override
			public Adapter caseStalling(Stalling object) {
				return createStallingAdapter();
			}
			@Override
			public Adapter casePausing(Pausing object) {
				return createPausingAdapter();
			}
			@Override
			public Adapter caseTurnUnitInitialFuntion(TurnUnitInitialFuntion object) {
				return createTurnUnitInitialFuntionAdapter();
			}
			@Override
			public Adapter caseTurnUnitFinalFunction(TurnUnitFinalFunction object) {
				return createTurnUnitFinalFunctionAdapter();
			}
			@Override
			public Adapter caseTurnAccept(TurnAccept object) {
				return createTurnAcceptAdapter();
			}
			@Override
			public Adapter caseTurnGrab(TurnGrab object) {
				return createTurnGrabAdapter();
			}
			@Override
			public Adapter caseTurnTake(TurnTake object) {
				return createTurnTakeAdapter();
			}
			@Override
			public Adapter caseTurnAssign(TurnAssign object) {
				return createTurnAssignAdapter();
			}
			@Override
			public Adapter caseTurnKeep(TurnKeep object) {
				return createTurnKeepAdapter();
			}
			@Override
			public Adapter caseTurnRelease(TurnRelease object) {
				return createTurnReleaseAdapter();
			}
			@Override
			public Adapter caseFeedbackElicitationFunction(FeedbackElicitationFunction object) {
				return createFeedbackElicitationFunctionAdapter();
			}
			@Override
			public Adapter caseAttentionFeedbackElicitation(AttentionFeedbackElicitation object) {
				return createAttentionFeedbackElicitationAdapter();
			}
			@Override
			public Adapter casePerceptionFeedbackElicitation(PerceptionFeedbackElicitation object) {
				return createPerceptionFeedbackElicitationAdapter();
			}
			@Override
			public Adapter caseInterpretationFeedbackElicitation(InterpretationFeedbackElicitation object) {
				return createInterpretationFeedbackElicitationAdapter();
			}
			@Override
			public Adapter caseEvaluationFeedackElicitation(EvaluationFeedackElicitation object) {
				return createEvaluationFeedackElicitationAdapter();
			}
			@Override
			public Adapter caseExecutionFeedbackElicitation(ExecutionFeedbackElicitation object) {
				return createExecutionFeedbackElicitationAdapter();
			}
			@Override
			public Adapter caseFeedbackGivingFunction(FeedbackGivingFunction object) {
				return createFeedbackGivingFunctionAdapter();
			}
			@Override
			public Adapter casePositiveAlloFeedback(PositiveAlloFeedback object) {
				return createPositiveAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeAlloFeedback(NegativeAlloFeedback object) {
				return createNegativeAlloFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveExecutionAlloFeedback(PositiveExecutionAlloFeedback object) {
				return createPositiveExecutionAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeExecutionAlloFeedback(NegativeExecutionAlloFeedback object) {
				return createNegativeExecutionAlloFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveEvaluationAlloFeedback(PositiveEvaluationAlloFeedback object) {
				return createPositiveEvaluationAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeEvaluationAlloFeedback(NegativeEvaluationAlloFeedback object) {
				return createNegativeEvaluationAlloFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveInterpretationAlloFeedback(PositiveInterpretationAlloFeedback object) {
				return createPositiveInterpretationAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeInterpretationAlloFeedback(NegativeInterpretationAlloFeedback object) {
				return createNegativeInterpretationAlloFeedbackAdapter();
			}
			@Override
			public Adapter casePositivePerceptionAlloFeedback(PositivePerceptionAlloFeedback object) {
				return createPositivePerceptionAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativePerceptionAlloFeedback(NegativePerceptionAlloFeedback object) {
				return createNegativePerceptionAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeAttentionAlloFeedback(NegativeAttentionAlloFeedback object) {
				return createNegativeAttentionAlloFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveAutoFeedback(PositiveAutoFeedback object) {
				return createPositiveAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeAutoFeedback(NegativeAutoFeedback object) {
				return createNegativeAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveExecutionAutoFeedback(PositiveExecutionAutoFeedback object) {
				return createPositiveExecutionAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeExecutionAutoFeedback(NegativeExecutionAutoFeedback object) {
				return createNegativeExecutionAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveEvaluationAutoFeedback(PositiveEvaluationAutoFeedback object) {
				return createPositiveEvaluationAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeEvaluationAutoFeedback(NegativeEvaluationAutoFeedback object) {
				return createNegativeEvaluationAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositivePerceptionAutoFeedback(PositivePerceptionAutoFeedback object) {
				return createPositivePerceptionAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativePerceptionAutoFeedback(NegativePerceptionAutoFeedback object) {
				return createNegativePerceptionAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveInterpretationAutoFeedback(PositiveInterpretationAutoFeedback object) {
				return createPositiveInterpretationAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeInterpretationAutoFeedback(NegativeInterpretationAutoFeedback object) {
				return createNegativeInterpretationAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveAttentionAutoFeedback(PositiveAttentionAutoFeedback object) {
				return createPositiveAttentionAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeAttentionAutoFeedback(NegativeAttentionAutoFeedback object) {
				return createNegativeAttentionAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveAttentionAlloFeedback(PositiveAttentionAlloFeedback object) {
				return createPositiveAttentionAlloFeedbackAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent <em>Semantic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent
	 * @generated
	 */
	public Adapter createSemanticContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction <em>Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction
	 * @generated
	 */
	public Adapter createCommunicativeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction <em>General Purpose Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction
	 * @generated
	 */
	public Adapter createGeneralPurposeCommunicativeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction <em>Information Transfer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction
	 * @generated
	 */
	public Adapter createInformationTransferFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction <em>Information Seeking Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction
	 * @generated
	 */
	public Adapter createInformationSeekingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction <em>Information Providing Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction
	 * @generated
	 */
	public Adapter createInformationProvidingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction <em>Action Discussion Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction
	 * @generated
	 */
	public Adapter createActionDiscussionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive <em>Commissive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive
	 * @generated
	 */
	public Adapter createCommissiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Directive
	 * @generated
	 */
	public Adapter createDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SetQuestion <em>Set Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SetQuestion
	 * @generated
	 */
	public Adapter createSetQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion <em>Propositional Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion
	 * @generated
	 */
	public Adapter createPropositionalQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion <em>Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion
	 * @generated
	 */
	public Adapter createCheckQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveCheckQuestion <em>Positive Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveCheckQuestion
	 * @generated
	 */
	public Adapter createPositiveCheckQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeCheckQuestion <em>Negative Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeCheckQuestion
	 * @generated
	 */
	public Adapter createNegativeCheckQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion <em>Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion
	 * @generated
	 */
	public Adapter createChoiceQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Inform <em>Inform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Inform
	 * @generated
	 */
	public Adapter createInformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement
	 * @generated
	 */
	public Adapter createAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement <em>Disagreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement
	 * @generated
	 */
	public Adapter createDisagreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Correction <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Correction
	 * @generated
	 */
	public Adapter createCorrectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Confirm <em>Confirm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Confirm
	 * @generated
	 */
	public Adapter createConfirmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disconfirm <em>Disconfirm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disconfirm
	 * @generated
	 */
	public Adapter createDisconfirmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion <em>Address Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion
	 * @generated
	 */
	public Adapter createAddressSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Promise <em>Promise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Promise
	 * @generated
	 */
	public Adapter createPromiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressRequest <em>Address Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressRequest
	 * @generated
	 */
	public Adapter createAddressRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptRequest <em>Accept Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptRequest
	 * @generated
	 */
	public Adapter createAcceptRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineRequest <em>Decline Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineRequest
	 * @generated
	 */
	public Adapter createDeclineRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptSuggestion <em>Accept Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptSuggestion
	 * @generated
	 */
	public Adapter createAcceptSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineSuggestion <em>Decline Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineSuggestion
	 * @generated
	 */
	public Adapter createDeclineSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Instruct <em>Instruct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Instruct
	 * @generated
	 */
	public Adapter createInstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressOffer <em>Address Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressOffer
	 * @generated
	 */
	public Adapter createAddressOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptOffer <em>Accept Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptOffer
	 * @generated
	 */
	public Adapter createAcceptOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineOffer <em>Decline Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineOffer
	 * @generated
	 */
	public Adapter createDeclineOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Suggestion <em>Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Suggestion
	 * @generated
	 */
	public Adapter createSuggestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction <em>Dimension Specific Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction
	 * @generated
	 */
	public Adapter createDimensionSpecificCommunicativeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction <em>Dialogue Control Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction
	 * @generated
	 */
	public Adapter createDialogueControlFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction <em>Feedback Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction
	 * @generated
	 */
	public Adapter createFeedbackFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback <em>Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback
	 * @generated
	 */
	public Adapter createAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback <em>Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback
	 * @generated
	 */
	public Adapter createAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction <em>Interaction Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction
	 * @generated
	 */
	public Adapter createInteractionManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction <em>Turn Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction
	 * @generated
	 */
	public Adapter createTurnManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction <em>Time Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction
	 * @generated
	 */
	public Adapter createTimeManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction <em>Contact Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction
	 * @generated
	 */
	public Adapter createContactManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction <em>Own Communication Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction
	 * @generated
	 */
	public Adapter createOwnCommunicationManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction <em>Partner Communication Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction
	 * @generated
	 */
	public Adapter createPartnerCommunicationManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction <em>Discourse Structure Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction
	 * @generated
	 */
	public Adapter createDiscourseStructureManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction <em>Social Obligation Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction
	 * @generated
	 */
	public Adapter createSocialObligationManagementFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation
	 * @generated
	 */
	public Adapter createSalutationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction <em>Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction
	 * @generated
	 */
	public Adapter createSelfIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing <em>Apologizing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing
	 * @generated
	 */
	public Adapter createApologizingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude <em>Gratitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude
	 * @generated
	 */
	public Adapter createGratitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction <em>Valediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction
	 * @generated
	 */
	public Adapter createValedictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGreeting <em>Initial Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGreeting
	 * @generated
	 */
	public Adapter createInitialGreetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGreeting <em>Return Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGreeting
	 * @generated
	 */
	public Adapter createReturnGreetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialSelfIntroduction <em>Initial Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialSelfIntroduction
	 * @generated
	 */
	public Adapter createInitialSelfIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnSelfIntroduction <em>Return Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnSelfIntroduction
	 * @generated
	 */
	public Adapter createReturnSelfIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apology <em>Apology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apology
	 * @generated
	 */
	public Adapter createApologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ApologyDownplay <em>Apology Downplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ApologyDownplay
	 * @generated
	 */
	public Adapter createApologyDownplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Thanking <em>Thanking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Thanking
	 * @generated
	 */
	public Adapter createThankingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ThankingDownplay <em>Thanking Downplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ThankingDownplay
	 * @generated
	 */
	public Adapter createThankingDownplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGoodbye <em>Initial Goodbye</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGoodbye
	 * @generated
	 */
	public Adapter createInitialGoodbyeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGoodbye <em>Return Goodbye</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGoodbye
	 * @generated
	 */
	public Adapter createReturnGoodbyeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Opening
	 * @generated
	 */
	public Adapter createOpeningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Preclosing <em>Preclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Preclosing
	 * @generated
	 */
	public Adapter createPreclosingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicIntroduction <em>Topic Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicIntroduction
	 * @generated
	 */
	public Adapter createTopicIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShiftAnnouncement <em>Topic Shift Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShiftAnnouncement
	 * @generated
	 */
	public Adapter createTopicShiftAnnouncementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShift <em>Topic Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShift
	 * @generated
	 */
	public Adapter createTopicShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Completion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Completion
	 * @generated
	 */
	public Adapter createCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CorrectMisspeaking <em>Correct Misspeaking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CorrectMisspeaking
	 * @generated
	 */
	public Adapter createCorrectMisspeakingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ErrorSignaling <em>Error Signaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ErrorSignaling
	 * @generated
	 */
	public Adapter createErrorSignalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Retraction <em>Retraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Retraction
	 * @generated
	 */
	public Adapter createRetractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfCorrection <em>Self Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfCorrection
	 * @generated
	 */
	public Adapter createSelfCorrectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactCheck <em>Contact Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactCheck
	 * @generated
	 */
	public Adapter createContactCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactIndication <em>Contact Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactIndication
	 * @generated
	 */
	public Adapter createContactIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Stalling <em>Stalling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Stalling
	 * @generated
	 */
	public Adapter createStallingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Pausing <em>Pausing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Pausing
	 * @generated
	 */
	public Adapter createPausingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion <em>Turn Unit Initial Funtion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion
	 * @generated
	 */
	public Adapter createTurnUnitInitialFuntionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction <em>Turn Unit Final Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction
	 * @generated
	 */
	public Adapter createTurnUnitFinalFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAccept <em>Turn Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAccept
	 * @generated
	 */
	public Adapter createTurnAcceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnGrab <em>Turn Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnGrab
	 * @generated
	 */
	public Adapter createTurnGrabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake <em>Turn Take</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake
	 * @generated
	 */
	public Adapter createTurnTakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAssign <em>Turn Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAssign
	 * @generated
	 */
	public Adapter createTurnAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnKeep <em>Turn Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnKeep
	 * @generated
	 */
	public Adapter createTurnKeepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnRelease <em>Turn Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnRelease
	 * @generated
	 */
	public Adapter createTurnReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction <em>Feedback Elicitation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction
	 * @generated
	 */
	public Adapter createFeedbackElicitationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AttentionFeedbackElicitation <em>Attention Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AttentionFeedbackElicitation
	 * @generated
	 */
	public Adapter createAttentionFeedbackElicitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PerceptionFeedbackElicitation <em>Perception Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PerceptionFeedbackElicitation
	 * @generated
	 */
	public Adapter createPerceptionFeedbackElicitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InterpretationFeedbackElicitation <em>Interpretation Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InterpretationFeedbackElicitation
	 * @generated
	 */
	public Adapter createInterpretationFeedbackElicitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.EvaluationFeedackElicitation <em>Evaluation Feedack Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.EvaluationFeedackElicitation
	 * @generated
	 */
	public Adapter createEvaluationFeedackElicitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ExecutionFeedbackElicitation <em>Execution Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ExecutionFeedbackElicitation
	 * @generated
	 */
	public Adapter createExecutionFeedbackElicitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction <em>Feedback Giving Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction
	 * @generated
	 */
	public Adapter createFeedbackGivingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAlloFeedback <em>Positive Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAlloFeedback
	 * @generated
	 */
	public Adapter createPositiveAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAlloFeedback <em>Negative Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAlloFeedback
	 * @generated
	 */
	public Adapter createNegativeAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAlloFeedback <em>Positive Execution Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAlloFeedback
	 * @generated
	 */
	public Adapter createPositiveExecutionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAlloFeedback <em>Negative Execution Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAlloFeedback
	 * @generated
	 */
	public Adapter createNegativeExecutionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAlloFeedback <em>Positive Evaluation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAlloFeedback
	 * @generated
	 */
	public Adapter createPositiveEvaluationAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAlloFeedback <em>Negative Evaluation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAlloFeedback
	 * @generated
	 */
	public Adapter createNegativeEvaluationAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAlloFeedback <em>Positive Interpretation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAlloFeedback
	 * @generated
	 */
	public Adapter createPositiveInterpretationAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAlloFeedback <em>Negative Interpretation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAlloFeedback
	 * @generated
	 */
	public Adapter createNegativeInterpretationAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAlloFeedback <em>Positive Perception Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAlloFeedback
	 * @generated
	 */
	public Adapter createPositivePerceptionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAlloFeedback <em>Negative Perception Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAlloFeedback
	 * @generated
	 */
	public Adapter createNegativePerceptionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAlloFeedback <em>Negative Attention Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAlloFeedback
	 * @generated
	 */
	public Adapter createNegativeAttentionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback <em>Positive Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback
	 * @generated
	 */
	public Adapter createPositiveAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback <em>Negative Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback
	 * @generated
	 */
	public Adapter createNegativeAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback <em>Positive Execution Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback
	 * @generated
	 */
	public Adapter createPositiveExecutionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback <em>Negative Execution Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback
	 * @generated
	 */
	public Adapter createNegativeExecutionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback <em>Positive Evaluation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback
	 * @generated
	 */
	public Adapter createPositiveEvaluationAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback <em>Negative Evaluation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback
	 * @generated
	 */
	public Adapter createNegativeEvaluationAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback <em>Positive Perception Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback
	 * @generated
	 */
	public Adapter createPositivePerceptionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback <em>Negative Perception Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback
	 * @generated
	 */
	public Adapter createNegativePerceptionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback <em>Positive Interpretation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback
	 * @generated
	 */
	public Adapter createPositiveInterpretationAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback <em>Negative Interpretation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback
	 * @generated
	 */
	public Adapter createNegativeInterpretationAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback <em>Positive Attention Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback
	 * @generated
	 */
	public Adapter createPositiveAttentionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAutoFeedback <em>Negative Attention Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAutoFeedback
	 * @generated
	 */
	public Adapter createNegativeAttentionAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAlloFeedback <em>Positive Attention Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAlloFeedback
	 * @generated
	 */
	public Adapter createPositiveAttentionAlloFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Communicative_functionsAdapterFactory
