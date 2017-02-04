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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.communicative_functions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage
 * @generated
 */
public class Communicative_functionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Communicative_functionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicative_functionsSwitch() {
		if (modelPackage == null) {
			modelPackage = Communicative_functionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Communicative_functionsPackage.SEMANTIC_CONTENT: {
				SemanticContent semanticContent = (SemanticContent)theEObject;
				T result = caseSemanticContent(semanticContent);
				if (result == null) result = caseBObject(semanticContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.COMMUNICATIVE_FUNCTION: {
				CommunicativeFunction communicativeFunction = (CommunicativeFunction)theEObject;
				T result = caseCommunicativeFunction(communicativeFunction);
				if (result == null) result = caseBObject(communicativeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION: {
				GeneralPurposeCommunicativeFunction generalPurposeCommunicativeFunction = (GeneralPurposeCommunicativeFunction)theEObject;
				T result = caseGeneralPurposeCommunicativeFunction(generalPurposeCommunicativeFunction);
				if (result == null) result = caseCommunicativeFunction(generalPurposeCommunicativeFunction);
				if (result == null) result = caseBObject(generalPurposeCommunicativeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INFORMATION_TRANSFER_FUNCTION: {
				InformationTransferFunction informationTransferFunction = (InformationTransferFunction)theEObject;
				T result = caseInformationTransferFunction(informationTransferFunction);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(informationTransferFunction);
				if (result == null) result = caseCommunicativeFunction(informationTransferFunction);
				if (result == null) result = caseBObject(informationTransferFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INFORMATION_SEEKING_FUNCTION: {
				InformationSeekingFunction informationSeekingFunction = (InformationSeekingFunction)theEObject;
				T result = caseInformationSeekingFunction(informationSeekingFunction);
				if (result == null) result = caseInformationTransferFunction(informationSeekingFunction);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(informationSeekingFunction);
				if (result == null) result = caseCommunicativeFunction(informationSeekingFunction);
				if (result == null) result = caseBObject(informationSeekingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INFORMATION_PROVIDING_FUNCTION: {
				InformationProvidingFunction informationProvidingFunction = (InformationProvidingFunction)theEObject;
				T result = caseInformationProvidingFunction(informationProvidingFunction);
				if (result == null) result = caseInformationTransferFunction(informationProvidingFunction);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(informationProvidingFunction);
				if (result == null) result = caseCommunicativeFunction(informationProvidingFunction);
				if (result == null) result = caseBObject(informationProvidingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ACTION_DISCUSSION_FUNCTION: {
				ActionDiscussionFunction actionDiscussionFunction = (ActionDiscussionFunction)theEObject;
				T result = caseActionDiscussionFunction(actionDiscussionFunction);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(actionDiscussionFunction);
				if (result == null) result = caseCommunicativeFunction(actionDiscussionFunction);
				if (result == null) result = caseBObject(actionDiscussionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.COMMISSIVE: {
				Commissive commissive = (Commissive)theEObject;
				T result = caseCommissive(commissive);
				if (result == null) result = caseActionDiscussionFunction(commissive);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(commissive);
				if (result == null) result = caseCommunicativeFunction(commissive);
				if (result == null) result = caseBObject(commissive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DIRECTIVE: {
				Directive directive = (Directive)theEObject;
				T result = caseDirective(directive);
				if (result == null) result = caseActionDiscussionFunction(directive);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(directive);
				if (result == null) result = caseCommunicativeFunction(directive);
				if (result == null) result = caseBObject(directive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseInformationSeekingFunction(question);
				if (result == null) result = caseInformationTransferFunction(question);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(question);
				if (result == null) result = caseCommunicativeFunction(question);
				if (result == null) result = caseBObject(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SET_QUESTION: {
				SetQuestion setQuestion = (SetQuestion)theEObject;
				T result = caseSetQuestion(setQuestion);
				if (result == null) result = caseQuestion(setQuestion);
				if (result == null) result = caseInformationSeekingFunction(setQuestion);
				if (result == null) result = caseInformationTransferFunction(setQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(setQuestion);
				if (result == null) result = caseCommunicativeFunction(setQuestion);
				if (result == null) result = caseBObject(setQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PROPOSITIONAL_QUESTION: {
				PropositionalQuestion propositionalQuestion = (PropositionalQuestion)theEObject;
				T result = casePropositionalQuestion(propositionalQuestion);
				if (result == null) result = caseQuestion(propositionalQuestion);
				if (result == null) result = caseInformationSeekingFunction(propositionalQuestion);
				if (result == null) result = caseInformationTransferFunction(propositionalQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(propositionalQuestion);
				if (result == null) result = caseCommunicativeFunction(propositionalQuestion);
				if (result == null) result = caseBObject(propositionalQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CHECK_QUESTION: {
				CheckQuestion checkQuestion = (CheckQuestion)theEObject;
				T result = caseCheckQuestion(checkQuestion);
				if (result == null) result = casePropositionalQuestion(checkQuestion);
				if (result == null) result = caseQuestion(checkQuestion);
				if (result == null) result = caseInformationSeekingFunction(checkQuestion);
				if (result == null) result = caseInformationTransferFunction(checkQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(checkQuestion);
				if (result == null) result = caseCommunicativeFunction(checkQuestion);
				if (result == null) result = caseBObject(checkQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_CHECK_QUESTION: {
				PositiveCheckQuestion positiveCheckQuestion = (PositiveCheckQuestion)theEObject;
				T result = casePositiveCheckQuestion(positiveCheckQuestion);
				if (result == null) result = caseCheckQuestion(positiveCheckQuestion);
				if (result == null) result = casePropositionalQuestion(positiveCheckQuestion);
				if (result == null) result = caseQuestion(positiveCheckQuestion);
				if (result == null) result = caseInformationSeekingFunction(positiveCheckQuestion);
				if (result == null) result = caseInformationTransferFunction(positiveCheckQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(positiveCheckQuestion);
				if (result == null) result = caseCommunicativeFunction(positiveCheckQuestion);
				if (result == null) result = caseBObject(positiveCheckQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_CHECK_QUESTION: {
				NegativeCheckQuestion negativeCheckQuestion = (NegativeCheckQuestion)theEObject;
				T result = caseNegativeCheckQuestion(negativeCheckQuestion);
				if (result == null) result = caseCheckQuestion(negativeCheckQuestion);
				if (result == null) result = casePropositionalQuestion(negativeCheckQuestion);
				if (result == null) result = caseQuestion(negativeCheckQuestion);
				if (result == null) result = caseInformationSeekingFunction(negativeCheckQuestion);
				if (result == null) result = caseInformationTransferFunction(negativeCheckQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(negativeCheckQuestion);
				if (result == null) result = caseCommunicativeFunction(negativeCheckQuestion);
				if (result == null) result = caseBObject(negativeCheckQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CHOICE_QUESTION: {
				ChoiceQuestion choiceQuestion = (ChoiceQuestion)theEObject;
				T result = caseChoiceQuestion(choiceQuestion);
				if (result == null) result = caseQuestion(choiceQuestion);
				if (result == null) result = caseInformationSeekingFunction(choiceQuestion);
				if (result == null) result = caseInformationTransferFunction(choiceQuestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(choiceQuestion);
				if (result == null) result = caseCommunicativeFunction(choiceQuestion);
				if (result == null) result = caseBObject(choiceQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INFORM: {
				Inform inform = (Inform)theEObject;
				T result = caseInform(inform);
				if (result == null) result = caseInformationProvidingFunction(inform);
				if (result == null) result = caseInformationTransferFunction(inform);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(inform);
				if (result == null) result = caseCommunicativeFunction(inform);
				if (result == null) result = caseBObject(inform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.AGREEMENT: {
				Agreement agreement = (Agreement)theEObject;
				T result = caseAgreement(agreement);
				if (result == null) result = caseInform(agreement);
				if (result == null) result = caseInformationProvidingFunction(agreement);
				if (result == null) result = caseInformationTransferFunction(agreement);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(agreement);
				if (result == null) result = caseCommunicativeFunction(agreement);
				if (result == null) result = caseBObject(agreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DISAGREEMENT: {
				Disagreement disagreement = (Disagreement)theEObject;
				T result = caseDisagreement(disagreement);
				if (result == null) result = caseInform(disagreement);
				if (result == null) result = caseInformationProvidingFunction(disagreement);
				if (result == null) result = caseInformationTransferFunction(disagreement);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(disagreement);
				if (result == null) result = caseCommunicativeFunction(disagreement);
				if (result == null) result = caseBObject(disagreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ANSWER: {
				Answer answer = (Answer)theEObject;
				T result = caseAnswer(answer);
				if (result == null) result = caseInform(answer);
				if (result == null) result = caseInformationProvidingFunction(answer);
				if (result == null) result = caseInformationTransferFunction(answer);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(answer);
				if (result == null) result = caseCommunicativeFunction(answer);
				if (result == null) result = caseBObject(answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CORRECTION: {
				Correction correction = (Correction)theEObject;
				T result = caseCorrection(correction);
				if (result == null) result = caseDisagreement(correction);
				if (result == null) result = caseInform(correction);
				if (result == null) result = caseInformationProvidingFunction(correction);
				if (result == null) result = caseInformationTransferFunction(correction);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(correction);
				if (result == null) result = caseCommunicativeFunction(correction);
				if (result == null) result = caseBObject(correction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CONFIRM: {
				Confirm confirm = (Confirm)theEObject;
				T result = caseConfirm(confirm);
				if (result == null) result = caseAnswer(confirm);
				if (result == null) result = caseInform(confirm);
				if (result == null) result = caseInformationProvidingFunction(confirm);
				if (result == null) result = caseInformationTransferFunction(confirm);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(confirm);
				if (result == null) result = caseCommunicativeFunction(confirm);
				if (result == null) result = caseBObject(confirm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DISCONFIRM: {
				Disconfirm disconfirm = (Disconfirm)theEObject;
				T result = caseDisconfirm(disconfirm);
				if (result == null) result = caseAnswer(disconfirm);
				if (result == null) result = caseInform(disconfirm);
				if (result == null) result = caseInformationProvidingFunction(disconfirm);
				if (result == null) result = caseInformationTransferFunction(disconfirm);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(disconfirm);
				if (result == null) result = caseCommunicativeFunction(disconfirm);
				if (result == null) result = caseBObject(disconfirm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.OFFER: {
				Offer offer = (Offer)theEObject;
				T result = caseOffer(offer);
				if (result == null) result = caseCommissive(offer);
				if (result == null) result = caseActionDiscussionFunction(offer);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(offer);
				if (result == null) result = caseCommunicativeFunction(offer);
				if (result == null) result = caseBObject(offer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ADDRESS_SUGGESTION: {
				AddressSuggestion addressSuggestion = (AddressSuggestion)theEObject;
				T result = caseAddressSuggestion(addressSuggestion);
				if (result == null) result = caseCommissive(addressSuggestion);
				if (result == null) result = caseActionDiscussionFunction(addressSuggestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(addressSuggestion);
				if (result == null) result = caseCommunicativeFunction(addressSuggestion);
				if (result == null) result = caseBObject(addressSuggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PROMISE: {
				Promise promise = (Promise)theEObject;
				T result = casePromise(promise);
				if (result == null) result = caseOffer(promise);
				if (result == null) result = caseCommissive(promise);
				if (result == null) result = caseActionDiscussionFunction(promise);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(promise);
				if (result == null) result = caseCommunicativeFunction(promise);
				if (result == null) result = caseBObject(promise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.THREAT: {
				Threat threat = (Threat)theEObject;
				T result = caseThreat(threat);
				if (result == null) result = caseOffer(threat);
				if (result == null) result = caseCommissive(threat);
				if (result == null) result = caseActionDiscussionFunction(threat);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(threat);
				if (result == null) result = caseCommunicativeFunction(threat);
				if (result == null) result = caseBObject(threat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ADDRESS_REQUEST: {
				AddressRequest addressRequest = (AddressRequest)theEObject;
				T result = caseAddressRequest(addressRequest);
				if (result == null) result = caseThreat(addressRequest);
				if (result == null) result = caseOffer(addressRequest);
				if (result == null) result = caseCommissive(addressRequest);
				if (result == null) result = caseActionDiscussionFunction(addressRequest);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(addressRequest);
				if (result == null) result = caseCommunicativeFunction(addressRequest);
				if (result == null) result = caseBObject(addressRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ACCEPT_REQUEST: {
				AcceptRequest acceptRequest = (AcceptRequest)theEObject;
				T result = caseAcceptRequest(acceptRequest);
				if (result == null) result = caseAddressRequest(acceptRequest);
				if (result == null) result = caseThreat(acceptRequest);
				if (result == null) result = caseOffer(acceptRequest);
				if (result == null) result = caseCommissive(acceptRequest);
				if (result == null) result = caseActionDiscussionFunction(acceptRequest);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(acceptRequest);
				if (result == null) result = caseCommunicativeFunction(acceptRequest);
				if (result == null) result = caseBObject(acceptRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DECLINE_REQUEST: {
				DeclineRequest declineRequest = (DeclineRequest)theEObject;
				T result = caseDeclineRequest(declineRequest);
				if (result == null) result = caseAddressRequest(declineRequest);
				if (result == null) result = caseThreat(declineRequest);
				if (result == null) result = caseOffer(declineRequest);
				if (result == null) result = caseCommissive(declineRequest);
				if (result == null) result = caseActionDiscussionFunction(declineRequest);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(declineRequest);
				if (result == null) result = caseCommunicativeFunction(declineRequest);
				if (result == null) result = caseBObject(declineRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ACCEPT_SUGGESTION: {
				AcceptSuggestion acceptSuggestion = (AcceptSuggestion)theEObject;
				T result = caseAcceptSuggestion(acceptSuggestion);
				if (result == null) result = caseAddressSuggestion(acceptSuggestion);
				if (result == null) result = caseCommissive(acceptSuggestion);
				if (result == null) result = caseActionDiscussionFunction(acceptSuggestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(acceptSuggestion);
				if (result == null) result = caseCommunicativeFunction(acceptSuggestion);
				if (result == null) result = caseBObject(acceptSuggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DECLINE_SUGGESTION: {
				DeclineSuggestion declineSuggestion = (DeclineSuggestion)theEObject;
				T result = caseDeclineSuggestion(declineSuggestion);
				if (result == null) result = caseAddressSuggestion(declineSuggestion);
				if (result == null) result = caseCommissive(declineSuggestion);
				if (result == null) result = caseActionDiscussionFunction(declineSuggestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(declineSuggestion);
				if (result == null) result = caseCommunicativeFunction(declineSuggestion);
				if (result == null) result = caseBObject(declineSuggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = caseDirective(request);
				if (result == null) result = caseActionDiscussionFunction(request);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(request);
				if (result == null) result = caseCommunicativeFunction(request);
				if (result == null) result = caseBObject(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INSTRUCT: {
				Instruct instruct = (Instruct)theEObject;
				T result = caseInstruct(instruct);
				if (result == null) result = caseRequest(instruct);
				if (result == null) result = caseDirective(instruct);
				if (result == null) result = caseActionDiscussionFunction(instruct);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(instruct);
				if (result == null) result = caseCommunicativeFunction(instruct);
				if (result == null) result = caseBObject(instruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ADDRESS_OFFER: {
				AddressOffer addressOffer = (AddressOffer)theEObject;
				T result = caseAddressOffer(addressOffer);
				if (result == null) result = caseRequest(addressOffer);
				if (result == null) result = caseDirective(addressOffer);
				if (result == null) result = caseActionDiscussionFunction(addressOffer);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(addressOffer);
				if (result == null) result = caseCommunicativeFunction(addressOffer);
				if (result == null) result = caseBObject(addressOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ACCEPT_OFFER: {
				AcceptOffer acceptOffer = (AcceptOffer)theEObject;
				T result = caseAcceptOffer(acceptOffer);
				if (result == null) result = caseAddressOffer(acceptOffer);
				if (result == null) result = caseRequest(acceptOffer);
				if (result == null) result = caseDirective(acceptOffer);
				if (result == null) result = caseActionDiscussionFunction(acceptOffer);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(acceptOffer);
				if (result == null) result = caseCommunicativeFunction(acceptOffer);
				if (result == null) result = caseBObject(acceptOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DECLINE_OFFER: {
				DeclineOffer declineOffer = (DeclineOffer)theEObject;
				T result = caseDeclineOffer(declineOffer);
				if (result == null) result = caseAddressOffer(declineOffer);
				if (result == null) result = caseRequest(declineOffer);
				if (result == null) result = caseDirective(declineOffer);
				if (result == null) result = caseActionDiscussionFunction(declineOffer);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(declineOffer);
				if (result == null) result = caseCommunicativeFunction(declineOffer);
				if (result == null) result = caseBObject(declineOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SUGGESTION: {
				Suggestion suggestion = (Suggestion)theEObject;
				T result = caseSuggestion(suggestion);
				if (result == null) result = caseDirective(suggestion);
				if (result == null) result = caseActionDiscussionFunction(suggestion);
				if (result == null) result = caseGeneralPurposeCommunicativeFunction(suggestion);
				if (result == null) result = caseCommunicativeFunction(suggestion);
				if (result == null) result = caseBObject(suggestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION: {
				DimensionSpecificCommunicativeFunction dimensionSpecificCommunicativeFunction = (DimensionSpecificCommunicativeFunction)theEObject;
				T result = caseDimensionSpecificCommunicativeFunction(dimensionSpecificCommunicativeFunction);
				if (result == null) result = caseCommunicativeFunction(dimensionSpecificCommunicativeFunction);
				if (result == null) result = caseBObject(dimensionSpecificCommunicativeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DIALOGUE_CONTROL_FUNCTION: {
				DialogueControlFunction dialogueControlFunction = (DialogueControlFunction)theEObject;
				T result = caseDialogueControlFunction(dialogueControlFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(dialogueControlFunction);
				if (result == null) result = caseCommunicativeFunction(dialogueControlFunction);
				if (result == null) result = caseBObject(dialogueControlFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.FEEDBACK_FUNCTION: {
				FeedbackFunction feedbackFunction = (FeedbackFunction)theEObject;
				T result = caseFeedbackFunction(feedbackFunction);
				if (result == null) result = caseDialogueControlFunction(feedbackFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(feedbackFunction);
				if (result == null) result = caseCommunicativeFunction(feedbackFunction);
				if (result == null) result = caseBObject(feedbackFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.AUTO_FEEDBACK: {
				AutoFeedback autoFeedback = (AutoFeedback)theEObject;
				T result = caseAutoFeedback(autoFeedback);
				if (result == null) result = caseFeedbackFunction(autoFeedback);
				if (result == null) result = caseDialogueControlFunction(autoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(autoFeedback);
				if (result == null) result = caseCommunicativeFunction(autoFeedback);
				if (result == null) result = caseBObject(autoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ALLO_FEEDBACK: {
				AlloFeedback alloFeedback = (AlloFeedback)theEObject;
				T result = caseAlloFeedback(alloFeedback);
				if (result == null) result = caseFeedbackFunction(alloFeedback);
				if (result == null) result = caseDialogueControlFunction(alloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(alloFeedback);
				if (result == null) result = caseCommunicativeFunction(alloFeedback);
				if (result == null) result = caseBObject(alloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INTERACTION_MANAGEMENT_FUNCTION: {
				InteractionManagementFunction interactionManagementFunction = (InteractionManagementFunction)theEObject;
				T result = caseInteractionManagementFunction(interactionManagementFunction);
				if (result == null) result = caseDialogueControlFunction(interactionManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(interactionManagementFunction);
				if (result == null) result = caseCommunicativeFunction(interactionManagementFunction);
				if (result == null) result = caseBObject(interactionManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_MANAGEMENT_FUNCTION: {
				TurnManagementFunction turnManagementFunction = (TurnManagementFunction)theEObject;
				T result = caseTurnManagementFunction(turnManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(turnManagementFunction);
				if (result == null) result = caseDialogueControlFunction(turnManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnManagementFunction);
				if (result == null) result = caseCommunicativeFunction(turnManagementFunction);
				if (result == null) result = caseBObject(turnManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TIME_MANAGEMENT_FUNCTION: {
				TimeManagementFunction timeManagementFunction = (TimeManagementFunction)theEObject;
				T result = caseTimeManagementFunction(timeManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(timeManagementFunction);
				if (result == null) result = caseDialogueControlFunction(timeManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(timeManagementFunction);
				if (result == null) result = caseCommunicativeFunction(timeManagementFunction);
				if (result == null) result = caseBObject(timeManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CONTACT_MANAGEMENT_FUNCTION: {
				ContactManagementFunction contactManagementFunction = (ContactManagementFunction)theEObject;
				T result = caseContactManagementFunction(contactManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(contactManagementFunction);
				if (result == null) result = caseDialogueControlFunction(contactManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(contactManagementFunction);
				if (result == null) result = caseCommunicativeFunction(contactManagementFunction);
				if (result == null) result = caseBObject(contactManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.OWN_COMMUNICATION_MANAGEMENT_FUNCTION: {
				OwnCommunicationManagementFunction ownCommunicationManagementFunction = (OwnCommunicationManagementFunction)theEObject;
				T result = caseOwnCommunicationManagementFunction(ownCommunicationManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(ownCommunicationManagementFunction);
				if (result == null) result = caseDialogueControlFunction(ownCommunicationManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(ownCommunicationManagementFunction);
				if (result == null) result = caseCommunicativeFunction(ownCommunicationManagementFunction);
				if (result == null) result = caseBObject(ownCommunicationManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION: {
				PartnerCommunicationManagementFunction partnerCommunicationManagementFunction = (PartnerCommunicationManagementFunction)theEObject;
				T result = casePartnerCommunicationManagementFunction(partnerCommunicationManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(partnerCommunicationManagementFunction);
				if (result == null) result = caseDialogueControlFunction(partnerCommunicationManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(partnerCommunicationManagementFunction);
				if (result == null) result = caseCommunicativeFunction(partnerCommunicationManagementFunction);
				if (result == null) result = caseBObject(partnerCommunicationManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION: {
				DiscourseStructureManagementFunction discourseStructureManagementFunction = (DiscourseStructureManagementFunction)theEObject;
				T result = caseDiscourseStructureManagementFunction(discourseStructureManagementFunction);
				if (result == null) result = caseInteractionManagementFunction(discourseStructureManagementFunction);
				if (result == null) result = caseDialogueControlFunction(discourseStructureManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(discourseStructureManagementFunction);
				if (result == null) result = caseCommunicativeFunction(discourseStructureManagementFunction);
				if (result == null) result = caseBObject(discourseStructureManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION: {
				SocialObligationManagementFunction socialObligationManagementFunction = (SocialObligationManagementFunction)theEObject;
				T result = caseSocialObligationManagementFunction(socialObligationManagementFunction);
				if (result == null) result = caseDialogueControlFunction(socialObligationManagementFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(socialObligationManagementFunction);
				if (result == null) result = caseCommunicativeFunction(socialObligationManagementFunction);
				if (result == null) result = caseBObject(socialObligationManagementFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SALUTATION: {
				Salutation salutation = (Salutation)theEObject;
				T result = caseSalutation(salutation);
				if (result == null) result = caseSocialObligationManagementFunction(salutation);
				if (result == null) result = caseDialogueControlFunction(salutation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(salutation);
				if (result == null) result = caseCommunicativeFunction(salutation);
				if (result == null) result = caseBObject(salutation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SELF_INTRODUCTION: {
				SelfIntroduction selfIntroduction = (SelfIntroduction)theEObject;
				T result = caseSelfIntroduction(selfIntroduction);
				if (result == null) result = caseSocialObligationManagementFunction(selfIntroduction);
				if (result == null) result = caseDialogueControlFunction(selfIntroduction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(selfIntroduction);
				if (result == null) result = caseCommunicativeFunction(selfIntroduction);
				if (result == null) result = caseBObject(selfIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.APOLOGIZING: {
				Apologizing apologizing = (Apologizing)theEObject;
				T result = caseApologizing(apologizing);
				if (result == null) result = caseSocialObligationManagementFunction(apologizing);
				if (result == null) result = caseDialogueControlFunction(apologizing);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(apologizing);
				if (result == null) result = caseCommunicativeFunction(apologizing);
				if (result == null) result = caseBObject(apologizing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.GRATITUDE: {
				Gratitude gratitude = (Gratitude)theEObject;
				T result = caseGratitude(gratitude);
				if (result == null) result = caseSocialObligationManagementFunction(gratitude);
				if (result == null) result = caseDialogueControlFunction(gratitude);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(gratitude);
				if (result == null) result = caseCommunicativeFunction(gratitude);
				if (result == null) result = caseBObject(gratitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.VALEDICTION: {
				Valediction valediction = (Valediction)theEObject;
				T result = caseValediction(valediction);
				if (result == null) result = caseSocialObligationManagementFunction(valediction);
				if (result == null) result = caseDialogueControlFunction(valediction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(valediction);
				if (result == null) result = caseCommunicativeFunction(valediction);
				if (result == null) result = caseBObject(valediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INITIAL_GREETING: {
				InitialGreeting initialGreeting = (InitialGreeting)theEObject;
				T result = caseInitialGreeting(initialGreeting);
				if (result == null) result = caseSalutation(initialGreeting);
				if (result == null) result = caseSocialObligationManagementFunction(initialGreeting);
				if (result == null) result = caseDialogueControlFunction(initialGreeting);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(initialGreeting);
				if (result == null) result = caseCommunicativeFunction(initialGreeting);
				if (result == null) result = caseBObject(initialGreeting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.RETURN_GREETING: {
				ReturnGreeting returnGreeting = (ReturnGreeting)theEObject;
				T result = caseReturnGreeting(returnGreeting);
				if (result == null) result = caseSalutation(returnGreeting);
				if (result == null) result = caseSocialObligationManagementFunction(returnGreeting);
				if (result == null) result = caseDialogueControlFunction(returnGreeting);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(returnGreeting);
				if (result == null) result = caseCommunicativeFunction(returnGreeting);
				if (result == null) result = caseBObject(returnGreeting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INITIAL_SELF_INTRODUCTION: {
				InitialSelfIntroduction initialSelfIntroduction = (InitialSelfIntroduction)theEObject;
				T result = caseInitialSelfIntroduction(initialSelfIntroduction);
				if (result == null) result = caseSelfIntroduction(initialSelfIntroduction);
				if (result == null) result = caseSocialObligationManagementFunction(initialSelfIntroduction);
				if (result == null) result = caseDialogueControlFunction(initialSelfIntroduction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(initialSelfIntroduction);
				if (result == null) result = caseCommunicativeFunction(initialSelfIntroduction);
				if (result == null) result = caseBObject(initialSelfIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.RETURN_SELF_INTRODUCTION: {
				ReturnSelfIntroduction returnSelfIntroduction = (ReturnSelfIntroduction)theEObject;
				T result = caseReturnSelfIntroduction(returnSelfIntroduction);
				if (result == null) result = caseSelfIntroduction(returnSelfIntroduction);
				if (result == null) result = caseSocialObligationManagementFunction(returnSelfIntroduction);
				if (result == null) result = caseDialogueControlFunction(returnSelfIntroduction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(returnSelfIntroduction);
				if (result == null) result = caseCommunicativeFunction(returnSelfIntroduction);
				if (result == null) result = caseBObject(returnSelfIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.APOLOGY: {
				Apology apology = (Apology)theEObject;
				T result = caseApology(apology);
				if (result == null) result = caseApologizing(apology);
				if (result == null) result = caseSocialObligationManagementFunction(apology);
				if (result == null) result = caseDialogueControlFunction(apology);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(apology);
				if (result == null) result = caseCommunicativeFunction(apology);
				if (result == null) result = caseBObject(apology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.APOLOGY_DOWNPLAY: {
				ApologyDownplay apologyDownplay = (ApologyDownplay)theEObject;
				T result = caseApologyDownplay(apologyDownplay);
				if (result == null) result = caseApologizing(apologyDownplay);
				if (result == null) result = caseSocialObligationManagementFunction(apologyDownplay);
				if (result == null) result = caseDialogueControlFunction(apologyDownplay);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(apologyDownplay);
				if (result == null) result = caseCommunicativeFunction(apologyDownplay);
				if (result == null) result = caseBObject(apologyDownplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.THANKING: {
				Thanking thanking = (Thanking)theEObject;
				T result = caseThanking(thanking);
				if (result == null) result = caseGratitude(thanking);
				if (result == null) result = caseSocialObligationManagementFunction(thanking);
				if (result == null) result = caseDialogueControlFunction(thanking);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(thanking);
				if (result == null) result = caseCommunicativeFunction(thanking);
				if (result == null) result = caseBObject(thanking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.THANKING_DOWNPLAY: {
				ThankingDownplay thankingDownplay = (ThankingDownplay)theEObject;
				T result = caseThankingDownplay(thankingDownplay);
				if (result == null) result = caseGratitude(thankingDownplay);
				if (result == null) result = caseSocialObligationManagementFunction(thankingDownplay);
				if (result == null) result = caseDialogueControlFunction(thankingDownplay);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(thankingDownplay);
				if (result == null) result = caseCommunicativeFunction(thankingDownplay);
				if (result == null) result = caseBObject(thankingDownplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INITIAL_GOODBYE: {
				InitialGoodbye initialGoodbye = (InitialGoodbye)theEObject;
				T result = caseInitialGoodbye(initialGoodbye);
				if (result == null) result = caseValediction(initialGoodbye);
				if (result == null) result = caseSocialObligationManagementFunction(initialGoodbye);
				if (result == null) result = caseDialogueControlFunction(initialGoodbye);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(initialGoodbye);
				if (result == null) result = caseCommunicativeFunction(initialGoodbye);
				if (result == null) result = caseBObject(initialGoodbye);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.RETURN_GOODBYE: {
				ReturnGoodbye returnGoodbye = (ReturnGoodbye)theEObject;
				T result = caseReturnGoodbye(returnGoodbye);
				if (result == null) result = caseValediction(returnGoodbye);
				if (result == null) result = caseSocialObligationManagementFunction(returnGoodbye);
				if (result == null) result = caseDialogueControlFunction(returnGoodbye);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(returnGoodbye);
				if (result == null) result = caseCommunicativeFunction(returnGoodbye);
				if (result == null) result = caseBObject(returnGoodbye);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.OPENING: {
				Opening opening = (Opening)theEObject;
				T result = caseOpening(opening);
				if (result == null) result = caseDiscourseStructureManagementFunction(opening);
				if (result == null) result = caseInteractionManagementFunction(opening);
				if (result == null) result = caseDialogueControlFunction(opening);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(opening);
				if (result == null) result = caseCommunicativeFunction(opening);
				if (result == null) result = caseBObject(opening);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PRECLOSING: {
				Preclosing preclosing = (Preclosing)theEObject;
				T result = casePreclosing(preclosing);
				if (result == null) result = caseDiscourseStructureManagementFunction(preclosing);
				if (result == null) result = caseInteractionManagementFunction(preclosing);
				if (result == null) result = caseDialogueControlFunction(preclosing);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(preclosing);
				if (result == null) result = caseCommunicativeFunction(preclosing);
				if (result == null) result = caseBObject(preclosing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TOPIC_INTRODUCTION: {
				TopicIntroduction topicIntroduction = (TopicIntroduction)theEObject;
				T result = caseTopicIntroduction(topicIntroduction);
				if (result == null) result = caseDiscourseStructureManagementFunction(topicIntroduction);
				if (result == null) result = caseInteractionManagementFunction(topicIntroduction);
				if (result == null) result = caseDialogueControlFunction(topicIntroduction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(topicIntroduction);
				if (result == null) result = caseCommunicativeFunction(topicIntroduction);
				if (result == null) result = caseBObject(topicIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TOPIC_SHIFT_ANNOUNCEMENT: {
				TopicShiftAnnouncement topicShiftAnnouncement = (TopicShiftAnnouncement)theEObject;
				T result = caseTopicShiftAnnouncement(topicShiftAnnouncement);
				if (result == null) result = caseDiscourseStructureManagementFunction(topicShiftAnnouncement);
				if (result == null) result = caseInteractionManagementFunction(topicShiftAnnouncement);
				if (result == null) result = caseDialogueControlFunction(topicShiftAnnouncement);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(topicShiftAnnouncement);
				if (result == null) result = caseCommunicativeFunction(topicShiftAnnouncement);
				if (result == null) result = caseBObject(topicShiftAnnouncement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TOPIC_SHIFT: {
				TopicShift topicShift = (TopicShift)theEObject;
				T result = caseTopicShift(topicShift);
				if (result == null) result = caseTopicShiftAnnouncement(topicShift);
				if (result == null) result = caseDiscourseStructureManagementFunction(topicShift);
				if (result == null) result = caseInteractionManagementFunction(topicShift);
				if (result == null) result = caseDialogueControlFunction(topicShift);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(topicShift);
				if (result == null) result = caseCommunicativeFunction(topicShift);
				if (result == null) result = caseBObject(topicShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.COMPLETION: {
				Completion completion = (Completion)theEObject;
				T result = caseCompletion(completion);
				if (result == null) result = casePartnerCommunicationManagementFunction(completion);
				if (result == null) result = caseInteractionManagementFunction(completion);
				if (result == null) result = caseDialogueControlFunction(completion);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(completion);
				if (result == null) result = caseCommunicativeFunction(completion);
				if (result == null) result = caseBObject(completion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CORRECT_MISSPEAKING: {
				CorrectMisspeaking correctMisspeaking = (CorrectMisspeaking)theEObject;
				T result = caseCorrectMisspeaking(correctMisspeaking);
				if (result == null) result = casePartnerCommunicationManagementFunction(correctMisspeaking);
				if (result == null) result = caseInteractionManagementFunction(correctMisspeaking);
				if (result == null) result = caseDialogueControlFunction(correctMisspeaking);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(correctMisspeaking);
				if (result == null) result = caseCommunicativeFunction(correctMisspeaking);
				if (result == null) result = caseBObject(correctMisspeaking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ERROR_SIGNALING: {
				ErrorSignaling errorSignaling = (ErrorSignaling)theEObject;
				T result = caseErrorSignaling(errorSignaling);
				if (result == null) result = caseOwnCommunicationManagementFunction(errorSignaling);
				if (result == null) result = caseInteractionManagementFunction(errorSignaling);
				if (result == null) result = caseDialogueControlFunction(errorSignaling);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(errorSignaling);
				if (result == null) result = caseCommunicativeFunction(errorSignaling);
				if (result == null) result = caseBObject(errorSignaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.RETRACTION: {
				Retraction retraction = (Retraction)theEObject;
				T result = caseRetraction(retraction);
				if (result == null) result = caseErrorSignaling(retraction);
				if (result == null) result = caseOwnCommunicationManagementFunction(retraction);
				if (result == null) result = caseInteractionManagementFunction(retraction);
				if (result == null) result = caseDialogueControlFunction(retraction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(retraction);
				if (result == null) result = caseCommunicativeFunction(retraction);
				if (result == null) result = caseBObject(retraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.SELF_CORRECTION: {
				SelfCorrection selfCorrection = (SelfCorrection)theEObject;
				T result = caseSelfCorrection(selfCorrection);
				if (result == null) result = caseRetraction(selfCorrection);
				if (result == null) result = caseErrorSignaling(selfCorrection);
				if (result == null) result = caseOwnCommunicationManagementFunction(selfCorrection);
				if (result == null) result = caseInteractionManagementFunction(selfCorrection);
				if (result == null) result = caseDialogueControlFunction(selfCorrection);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(selfCorrection);
				if (result == null) result = caseCommunicativeFunction(selfCorrection);
				if (result == null) result = caseBObject(selfCorrection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CONTACT_CHECK: {
				ContactCheck contactCheck = (ContactCheck)theEObject;
				T result = caseContactCheck(contactCheck);
				if (result == null) result = caseContactManagementFunction(contactCheck);
				if (result == null) result = caseInteractionManagementFunction(contactCheck);
				if (result == null) result = caseDialogueControlFunction(contactCheck);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(contactCheck);
				if (result == null) result = caseCommunicativeFunction(contactCheck);
				if (result == null) result = caseBObject(contactCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.CONTACT_INDICATION: {
				ContactIndication contactIndication = (ContactIndication)theEObject;
				T result = caseContactIndication(contactIndication);
				if (result == null) result = caseContactManagementFunction(contactIndication);
				if (result == null) result = caseInteractionManagementFunction(contactIndication);
				if (result == null) result = caseDialogueControlFunction(contactIndication);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(contactIndication);
				if (result == null) result = caseCommunicativeFunction(contactIndication);
				if (result == null) result = caseBObject(contactIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.STALLING: {
				Stalling stalling = (Stalling)theEObject;
				T result = caseStalling(stalling);
				if (result == null) result = caseTimeManagementFunction(stalling);
				if (result == null) result = caseInteractionManagementFunction(stalling);
				if (result == null) result = caseDialogueControlFunction(stalling);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(stalling);
				if (result == null) result = caseCommunicativeFunction(stalling);
				if (result == null) result = caseBObject(stalling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PAUSING: {
				Pausing pausing = (Pausing)theEObject;
				T result = casePausing(pausing);
				if (result == null) result = caseTimeManagementFunction(pausing);
				if (result == null) result = caseInteractionManagementFunction(pausing);
				if (result == null) result = caseDialogueControlFunction(pausing);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(pausing);
				if (result == null) result = caseCommunicativeFunction(pausing);
				if (result == null) result = caseBObject(pausing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_UNIT_INITIAL_FUNTION: {
				TurnUnitInitialFuntion turnUnitInitialFuntion = (TurnUnitInitialFuntion)theEObject;
				T result = caseTurnUnitInitialFuntion(turnUnitInitialFuntion);
				if (result == null) result = caseTurnManagementFunction(turnUnitInitialFuntion);
				if (result == null) result = caseInteractionManagementFunction(turnUnitInitialFuntion);
				if (result == null) result = caseDialogueControlFunction(turnUnitInitialFuntion);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnUnitInitialFuntion);
				if (result == null) result = caseCommunicativeFunction(turnUnitInitialFuntion);
				if (result == null) result = caseBObject(turnUnitInitialFuntion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_UNIT_FINAL_FUNCTION: {
				TurnUnitFinalFunction turnUnitFinalFunction = (TurnUnitFinalFunction)theEObject;
				T result = caseTurnUnitFinalFunction(turnUnitFinalFunction);
				if (result == null) result = caseTurnManagementFunction(turnUnitFinalFunction);
				if (result == null) result = caseInteractionManagementFunction(turnUnitFinalFunction);
				if (result == null) result = caseDialogueControlFunction(turnUnitFinalFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnUnitFinalFunction);
				if (result == null) result = caseCommunicativeFunction(turnUnitFinalFunction);
				if (result == null) result = caseBObject(turnUnitFinalFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_ACCEPT: {
				TurnAccept turnAccept = (TurnAccept)theEObject;
				T result = caseTurnAccept(turnAccept);
				if (result == null) result = caseTurnUnitInitialFuntion(turnAccept);
				if (result == null) result = caseTurnManagementFunction(turnAccept);
				if (result == null) result = caseInteractionManagementFunction(turnAccept);
				if (result == null) result = caseDialogueControlFunction(turnAccept);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnAccept);
				if (result == null) result = caseCommunicativeFunction(turnAccept);
				if (result == null) result = caseBObject(turnAccept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_GRAB: {
				TurnGrab turnGrab = (TurnGrab)theEObject;
				T result = caseTurnGrab(turnGrab);
				if (result == null) result = caseTurnUnitInitialFuntion(turnGrab);
				if (result == null) result = caseTurnManagementFunction(turnGrab);
				if (result == null) result = caseInteractionManagementFunction(turnGrab);
				if (result == null) result = caseDialogueControlFunction(turnGrab);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnGrab);
				if (result == null) result = caseCommunicativeFunction(turnGrab);
				if (result == null) result = caseBObject(turnGrab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_TAKE: {
				TurnTake turnTake = (TurnTake)theEObject;
				T result = caseTurnTake(turnTake);
				if (result == null) result = caseTurnUnitInitialFuntion(turnTake);
				if (result == null) result = caseTurnManagementFunction(turnTake);
				if (result == null) result = caseInteractionManagementFunction(turnTake);
				if (result == null) result = caseDialogueControlFunction(turnTake);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnTake);
				if (result == null) result = caseCommunicativeFunction(turnTake);
				if (result == null) result = caseBObject(turnTake);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_ASSIGN: {
				TurnAssign turnAssign = (TurnAssign)theEObject;
				T result = caseTurnAssign(turnAssign);
				if (result == null) result = caseTurnUnitFinalFunction(turnAssign);
				if (result == null) result = caseTurnManagementFunction(turnAssign);
				if (result == null) result = caseInteractionManagementFunction(turnAssign);
				if (result == null) result = caseDialogueControlFunction(turnAssign);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnAssign);
				if (result == null) result = caseCommunicativeFunction(turnAssign);
				if (result == null) result = caseBObject(turnAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_KEEP: {
				TurnKeep turnKeep = (TurnKeep)theEObject;
				T result = caseTurnKeep(turnKeep);
				if (result == null) result = caseTurnUnitFinalFunction(turnKeep);
				if (result == null) result = caseTurnManagementFunction(turnKeep);
				if (result == null) result = caseInteractionManagementFunction(turnKeep);
				if (result == null) result = caseDialogueControlFunction(turnKeep);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnKeep);
				if (result == null) result = caseCommunicativeFunction(turnKeep);
				if (result == null) result = caseBObject(turnKeep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.TURN_RELEASE: {
				TurnRelease turnRelease = (TurnRelease)theEObject;
				T result = caseTurnRelease(turnRelease);
				if (result == null) result = caseTurnUnitFinalFunction(turnRelease);
				if (result == null) result = caseTurnManagementFunction(turnRelease);
				if (result == null) result = caseInteractionManagementFunction(turnRelease);
				if (result == null) result = caseDialogueControlFunction(turnRelease);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(turnRelease);
				if (result == null) result = caseCommunicativeFunction(turnRelease);
				if (result == null) result = caseBObject(turnRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.FEEDBACK_ELICITATION_FUNCTION: {
				FeedbackElicitationFunction feedbackElicitationFunction = (FeedbackElicitationFunction)theEObject;
				T result = caseFeedbackElicitationFunction(feedbackElicitationFunction);
				if (result == null) result = caseAlloFeedback(feedbackElicitationFunction);
				if (result == null) result = caseFeedbackFunction(feedbackElicitationFunction);
				if (result == null) result = caseDialogueControlFunction(feedbackElicitationFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(feedbackElicitationFunction);
				if (result == null) result = caseCommunicativeFunction(feedbackElicitationFunction);
				if (result == null) result = caseBObject(feedbackElicitationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.ATTENTION_FEEDBACK_ELICITATION: {
				AttentionFeedbackElicitation attentionFeedbackElicitation = (AttentionFeedbackElicitation)theEObject;
				T result = caseAttentionFeedbackElicitation(attentionFeedbackElicitation);
				if (result == null) result = caseFeedbackElicitationFunction(attentionFeedbackElicitation);
				if (result == null) result = caseAlloFeedback(attentionFeedbackElicitation);
				if (result == null) result = caseFeedbackFunction(attentionFeedbackElicitation);
				if (result == null) result = caseDialogueControlFunction(attentionFeedbackElicitation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(attentionFeedbackElicitation);
				if (result == null) result = caseCommunicativeFunction(attentionFeedbackElicitation);
				if (result == null) result = caseBObject(attentionFeedbackElicitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.PERCEPTION_FEEDBACK_ELICITATION: {
				PerceptionFeedbackElicitation perceptionFeedbackElicitation = (PerceptionFeedbackElicitation)theEObject;
				T result = casePerceptionFeedbackElicitation(perceptionFeedbackElicitation);
				if (result == null) result = caseFeedbackElicitationFunction(perceptionFeedbackElicitation);
				if (result == null) result = caseAlloFeedback(perceptionFeedbackElicitation);
				if (result == null) result = caseFeedbackFunction(perceptionFeedbackElicitation);
				if (result == null) result = caseDialogueControlFunction(perceptionFeedbackElicitation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(perceptionFeedbackElicitation);
				if (result == null) result = caseCommunicativeFunction(perceptionFeedbackElicitation);
				if (result == null) result = caseBObject(perceptionFeedbackElicitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.INTERPRETATION_FEEDBACK_ELICITATION: {
				InterpretationFeedbackElicitation interpretationFeedbackElicitation = (InterpretationFeedbackElicitation)theEObject;
				T result = caseInterpretationFeedbackElicitation(interpretationFeedbackElicitation);
				if (result == null) result = caseFeedbackElicitationFunction(interpretationFeedbackElicitation);
				if (result == null) result = caseAlloFeedback(interpretationFeedbackElicitation);
				if (result == null) result = caseFeedbackFunction(interpretationFeedbackElicitation);
				if (result == null) result = caseDialogueControlFunction(interpretationFeedbackElicitation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(interpretationFeedbackElicitation);
				if (result == null) result = caseCommunicativeFunction(interpretationFeedbackElicitation);
				if (result == null) result = caseBObject(interpretationFeedbackElicitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.EVALUATION_FEEDACK_ELICITATION: {
				EvaluationFeedackElicitation evaluationFeedackElicitation = (EvaluationFeedackElicitation)theEObject;
				T result = caseEvaluationFeedackElicitation(evaluationFeedackElicitation);
				if (result == null) result = caseFeedbackElicitationFunction(evaluationFeedackElicitation);
				if (result == null) result = caseAlloFeedback(evaluationFeedackElicitation);
				if (result == null) result = caseFeedbackFunction(evaluationFeedackElicitation);
				if (result == null) result = caseDialogueControlFunction(evaluationFeedackElicitation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(evaluationFeedackElicitation);
				if (result == null) result = caseCommunicativeFunction(evaluationFeedackElicitation);
				if (result == null) result = caseBObject(evaluationFeedackElicitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.EXECUTION_FEEDBACK_ELICITATION: {
				ExecutionFeedbackElicitation executionFeedbackElicitation = (ExecutionFeedbackElicitation)theEObject;
				T result = caseExecutionFeedbackElicitation(executionFeedbackElicitation);
				if (result == null) result = caseFeedbackElicitationFunction(executionFeedbackElicitation);
				if (result == null) result = caseAlloFeedback(executionFeedbackElicitation);
				if (result == null) result = caseFeedbackFunction(executionFeedbackElicitation);
				if (result == null) result = caseDialogueControlFunction(executionFeedbackElicitation);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(executionFeedbackElicitation);
				if (result == null) result = caseCommunicativeFunction(executionFeedbackElicitation);
				if (result == null) result = caseBObject(executionFeedbackElicitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.FEEDBACK_GIVING_FUNCTION: {
				FeedbackGivingFunction feedbackGivingFunction = (FeedbackGivingFunction)theEObject;
				T result = caseFeedbackGivingFunction(feedbackGivingFunction);
				if (result == null) result = caseAlloFeedback(feedbackGivingFunction);
				if (result == null) result = caseFeedbackFunction(feedbackGivingFunction);
				if (result == null) result = caseDialogueControlFunction(feedbackGivingFunction);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(feedbackGivingFunction);
				if (result == null) result = caseCommunicativeFunction(feedbackGivingFunction);
				if (result == null) result = caseBObject(feedbackGivingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_ALLO_FEEDBACK: {
				PositiveAlloFeedback positiveAlloFeedback = (PositiveAlloFeedback)theEObject;
				T result = casePositiveAlloFeedback(positiveAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positiveAlloFeedback);
				if (result == null) result = caseAlloFeedback(positiveAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positiveAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveAlloFeedback);
				if (result == null) result = caseBObject(positiveAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_ALLO_FEEDBACK: {
				NegativeAlloFeedback negativeAlloFeedback = (NegativeAlloFeedback)theEObject;
				T result = caseNegativeAlloFeedback(negativeAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativeAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativeAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativeAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeAlloFeedback);
				if (result == null) result = caseBObject(negativeAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_EXECUTION_ALLO_FEEDBACK: {
				PositiveExecutionAlloFeedback positiveExecutionAlloFeedback = (PositiveExecutionAlloFeedback)theEObject;
				T result = casePositiveExecutionAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = casePositiveEvaluationAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = casePositiveInterpretationAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = casePositivePerceptionAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = casePositiveAttentionAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = casePositiveAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positiveExecutionAlloFeedback);
				if (result == null) result = caseAlloFeedback(positiveExecutionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positiveExecutionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveExecutionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveExecutionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveExecutionAlloFeedback);
				if (result == null) result = caseBObject(positiveExecutionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_EXECUTION_ALLO_FEEDBACK: {
				NegativeExecutionAlloFeedback negativeExecutionAlloFeedback = (NegativeExecutionAlloFeedback)theEObject;
				T result = caseNegativeExecutionAlloFeedback(negativeExecutionAlloFeedback);
				if (result == null) result = caseNegativeAlloFeedback(negativeExecutionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativeExecutionAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativeExecutionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativeExecutionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeExecutionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeExecutionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeExecutionAlloFeedback);
				if (result == null) result = caseBObject(negativeExecutionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_EVALUATION_ALLO_FEEDBACK: {
				PositiveEvaluationAlloFeedback positiveEvaluationAlloFeedback = (PositiveEvaluationAlloFeedback)theEObject;
				T result = casePositiveEvaluationAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = casePositiveInterpretationAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = casePositivePerceptionAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = casePositiveAttentionAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = casePositiveAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positiveEvaluationAlloFeedback);
				if (result == null) result = caseAlloFeedback(positiveEvaluationAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positiveEvaluationAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveEvaluationAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveEvaluationAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveEvaluationAlloFeedback);
				if (result == null) result = caseBObject(positiveEvaluationAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_EVALUATION_ALLO_FEEDBACK: {
				NegativeEvaluationAlloFeedback negativeEvaluationAlloFeedback = (NegativeEvaluationAlloFeedback)theEObject;
				T result = caseNegativeEvaluationAlloFeedback(negativeEvaluationAlloFeedback);
				if (result == null) result = caseNegativeExecutionAlloFeedback(negativeEvaluationAlloFeedback);
				if (result == null) result = caseNegativeAlloFeedback(negativeEvaluationAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativeEvaluationAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativeEvaluationAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativeEvaluationAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeEvaluationAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeEvaluationAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeEvaluationAlloFeedback);
				if (result == null) result = caseBObject(negativeEvaluationAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_INTERPRETATION_ALLO_FEEDBACK: {
				PositiveInterpretationAlloFeedback positiveInterpretationAlloFeedback = (PositiveInterpretationAlloFeedback)theEObject;
				T result = casePositiveInterpretationAlloFeedback(positiveInterpretationAlloFeedback);
				if (result == null) result = casePositivePerceptionAlloFeedback(positiveInterpretationAlloFeedback);
				if (result == null) result = casePositiveAttentionAlloFeedback(positiveInterpretationAlloFeedback);
				if (result == null) result = casePositiveAlloFeedback(positiveInterpretationAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positiveInterpretationAlloFeedback);
				if (result == null) result = caseAlloFeedback(positiveInterpretationAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positiveInterpretationAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveInterpretationAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveInterpretationAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveInterpretationAlloFeedback);
				if (result == null) result = caseBObject(positiveInterpretationAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_INTERPRETATION_ALLO_FEEDBACK: {
				NegativeInterpretationAlloFeedback negativeInterpretationAlloFeedback = (NegativeInterpretationAlloFeedback)theEObject;
				T result = caseNegativeInterpretationAlloFeedback(negativeInterpretationAlloFeedback);
				if (result == null) result = caseNegativeEvaluationAlloFeedback(negativeInterpretationAlloFeedback);
				if (result == null) result = caseNegativeExecutionAlloFeedback(negativeInterpretationAlloFeedback);
				if (result == null) result = caseNegativeAlloFeedback(negativeInterpretationAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativeInterpretationAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativeInterpretationAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativeInterpretationAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeInterpretationAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeInterpretationAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeInterpretationAlloFeedback);
				if (result == null) result = caseBObject(negativeInterpretationAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_PERCEPTION_ALLO_FEEDBACK: {
				PositivePerceptionAlloFeedback positivePerceptionAlloFeedback = (PositivePerceptionAlloFeedback)theEObject;
				T result = casePositivePerceptionAlloFeedback(positivePerceptionAlloFeedback);
				if (result == null) result = casePositiveAttentionAlloFeedback(positivePerceptionAlloFeedback);
				if (result == null) result = casePositiveAlloFeedback(positivePerceptionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positivePerceptionAlloFeedback);
				if (result == null) result = caseAlloFeedback(positivePerceptionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positivePerceptionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positivePerceptionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positivePerceptionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positivePerceptionAlloFeedback);
				if (result == null) result = caseBObject(positivePerceptionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_PERCEPTION_ALLO_FEEDBACK: {
				NegativePerceptionAlloFeedback negativePerceptionAlloFeedback = (NegativePerceptionAlloFeedback)theEObject;
				T result = caseNegativePerceptionAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseNegativeInterpretationAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseNegativeEvaluationAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseNegativeExecutionAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseNegativeAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativePerceptionAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativePerceptionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativePerceptionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativePerceptionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativePerceptionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativePerceptionAlloFeedback);
				if (result == null) result = caseBObject(negativePerceptionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_ATTENTION_ALLO_FEEDBACK: {
				NegativeAttentionAlloFeedback negativeAttentionAlloFeedback = (NegativeAttentionAlloFeedback)theEObject;
				T result = caseNegativeAttentionAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseNegativePerceptionAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseNegativeInterpretationAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseNegativeEvaluationAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseNegativeExecutionAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseNegativeAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(negativeAttentionAlloFeedback);
				if (result == null) result = caseAlloFeedback(negativeAttentionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(negativeAttentionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeAttentionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeAttentionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeAttentionAlloFeedback);
				if (result == null) result = caseBObject(negativeAttentionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_AUTO_FEEDBACK: {
				PositiveAutoFeedback positiveAutoFeedback = (PositiveAutoFeedback)theEObject;
				T result = casePositiveAutoFeedback(positiveAutoFeedback);
				if (result == null) result = caseAutoFeedback(positiveAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positiveAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveAutoFeedback);
				if (result == null) result = caseBObject(positiveAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_AUTO_FEEDBACK: {
				NegativeAutoFeedback negativeAutoFeedback = (NegativeAutoFeedback)theEObject;
				T result = caseNegativeAutoFeedback(negativeAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativeAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativeAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeAutoFeedback);
				if (result == null) result = caseBObject(negativeAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_EXECUTION_AUTO_FEEDBACK: {
				PositiveExecutionAutoFeedback positiveExecutionAutoFeedback = (PositiveExecutionAutoFeedback)theEObject;
				T result = casePositiveExecutionAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = casePositiveEvaluationAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = casePositiveInterpretationAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = casePositivePerceptionAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = casePositiveAttentionAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = caseAutoFeedback(positiveExecutionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positiveExecutionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveExecutionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveExecutionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveExecutionAutoFeedback);
				if (result == null) result = caseBObject(positiveExecutionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_EXECUTION_AUTO_FEEDBACK: {
				NegativeExecutionAutoFeedback negativeExecutionAutoFeedback = (NegativeExecutionAutoFeedback)theEObject;
				T result = caseNegativeExecutionAutoFeedback(negativeExecutionAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(negativeExecutionAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativeExecutionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativeExecutionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeExecutionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeExecutionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeExecutionAutoFeedback);
				if (result == null) result = caseBObject(negativeExecutionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_EVALUATION_AUTO_FEEDBACK: {
				PositiveEvaluationAutoFeedback positiveEvaluationAutoFeedback = (PositiveEvaluationAutoFeedback)theEObject;
				T result = casePositiveEvaluationAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = casePositiveInterpretationAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = casePositivePerceptionAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = casePositiveAttentionAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = caseAutoFeedback(positiveEvaluationAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positiveEvaluationAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveEvaluationAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveEvaluationAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveEvaluationAutoFeedback);
				if (result == null) result = caseBObject(positiveEvaluationAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_EVALUATION_AUTO_FEEDBACK: {
				NegativeEvaluationAutoFeedback negativeEvaluationAutoFeedback = (NegativeEvaluationAutoFeedback)theEObject;
				T result = caseNegativeEvaluationAutoFeedback(negativeEvaluationAutoFeedback);
				if (result == null) result = caseNegativeExecutionAutoFeedback(negativeEvaluationAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(negativeEvaluationAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativeEvaluationAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativeEvaluationAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeEvaluationAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeEvaluationAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeEvaluationAutoFeedback);
				if (result == null) result = caseBObject(negativeEvaluationAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_PERCEPTION_AUTO_FEEDBACK: {
				PositivePerceptionAutoFeedback positivePerceptionAutoFeedback = (PositivePerceptionAutoFeedback)theEObject;
				T result = casePositivePerceptionAutoFeedback(positivePerceptionAutoFeedback);
				if (result == null) result = casePositiveAttentionAutoFeedback(positivePerceptionAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(positivePerceptionAutoFeedback);
				if (result == null) result = caseAutoFeedback(positivePerceptionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positivePerceptionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positivePerceptionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positivePerceptionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positivePerceptionAutoFeedback);
				if (result == null) result = caseBObject(positivePerceptionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK: {
				NegativePerceptionAutoFeedback negativePerceptionAutoFeedback = (NegativePerceptionAutoFeedback)theEObject;
				T result = caseNegativePerceptionAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseNegativeInterpretationAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseNegativeEvaluationAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseNegativeExecutionAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativePerceptionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativePerceptionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativePerceptionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativePerceptionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativePerceptionAutoFeedback);
				if (result == null) result = caseBObject(negativePerceptionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK: {
				PositiveInterpretationAutoFeedback positiveInterpretationAutoFeedback = (PositiveInterpretationAutoFeedback)theEObject;
				T result = casePositiveInterpretationAutoFeedback(positiveInterpretationAutoFeedback);
				if (result == null) result = casePositivePerceptionAutoFeedback(positiveInterpretationAutoFeedback);
				if (result == null) result = casePositiveAttentionAutoFeedback(positiveInterpretationAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(positiveInterpretationAutoFeedback);
				if (result == null) result = caseAutoFeedback(positiveInterpretationAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positiveInterpretationAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveInterpretationAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveInterpretationAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveInterpretationAutoFeedback);
				if (result == null) result = caseBObject(positiveInterpretationAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_INTERPRETATION_AUTO_FEEDBACK: {
				NegativeInterpretationAutoFeedback negativeInterpretationAutoFeedback = (NegativeInterpretationAutoFeedback)theEObject;
				T result = caseNegativeInterpretationAutoFeedback(negativeInterpretationAutoFeedback);
				if (result == null) result = caseNegativeEvaluationAutoFeedback(negativeInterpretationAutoFeedback);
				if (result == null) result = caseNegativeExecutionAutoFeedback(negativeInterpretationAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(negativeInterpretationAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativeInterpretationAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativeInterpretationAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeInterpretationAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeInterpretationAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeInterpretationAutoFeedback);
				if (result == null) result = caseBObject(negativeInterpretationAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_ATTENTION_AUTO_FEEDBACK: {
				PositiveAttentionAutoFeedback positiveAttentionAutoFeedback = (PositiveAttentionAutoFeedback)theEObject;
				T result = casePositiveAttentionAutoFeedback(positiveAttentionAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(positiveAttentionAutoFeedback);
				if (result == null) result = caseAutoFeedback(positiveAttentionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(positiveAttentionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveAttentionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveAttentionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveAttentionAutoFeedback);
				if (result == null) result = caseBObject(positiveAttentionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.NEGATIVE_ATTENTION_AUTO_FEEDBACK: {
				NegativeAttentionAutoFeedback negativeAttentionAutoFeedback = (NegativeAttentionAutoFeedback)theEObject;
				T result = caseNegativeAttentionAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseNegativePerceptionAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseNegativeInterpretationAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseNegativeEvaluationAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseNegativeExecutionAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseAutoFeedback(negativeAttentionAutoFeedback);
				if (result == null) result = caseFeedbackFunction(negativeAttentionAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(negativeAttentionAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(negativeAttentionAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(negativeAttentionAutoFeedback);
				if (result == null) result = caseBObject(negativeAttentionAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Communicative_functionsPackage.POSITIVE_ATTENTION_ALLO_FEEDBACK: {
				PositiveAttentionAlloFeedback positiveAttentionAlloFeedback = (PositiveAttentionAlloFeedback)theEObject;
				T result = casePositiveAttentionAlloFeedback(positiveAttentionAlloFeedback);
				if (result == null) result = casePositiveAlloFeedback(positiveAttentionAlloFeedback);
				if (result == null) result = caseFeedbackGivingFunction(positiveAttentionAlloFeedback);
				if (result == null) result = caseAlloFeedback(positiveAttentionAlloFeedback);
				if (result == null) result = caseFeedbackFunction(positiveAttentionAlloFeedback);
				if (result == null) result = caseDialogueControlFunction(positiveAttentionAlloFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(positiveAttentionAlloFeedback);
				if (result == null) result = caseCommunicativeFunction(positiveAttentionAlloFeedback);
				if (result == null) result = caseBObject(positiveAttentionAlloFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticContent(SemanticContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicative Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicative Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicativeFunction(CommunicativeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Purpose Communicative Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Purpose Communicative Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralPurposeCommunicativeFunction(GeneralPurposeCommunicativeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Transfer Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Transfer Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationTransferFunction(InformationTransferFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Seeking Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Seeking Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationSeekingFunction(InformationSeekingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Providing Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Providing Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationProvidingFunction(InformationProvidingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Discussion Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Discussion Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDiscussionFunction(ActionDiscussionFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commissive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commissive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommissive(Commissive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirective(Directive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetQuestion(SetQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propositional Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propositional Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropositionalQuestion(PropositionalQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckQuestion(CheckQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Check Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Check Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveCheckQuestion(PositiveCheckQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Check Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Check Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeCheckQuestion(NegativeCheckQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceQuestion(ChoiceQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInform(Inform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement(Agreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disagreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disagreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisagreement(Disagreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrection(Correction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirm(Confirm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconfirm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconfirm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconfirm(Disconfirm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer(Offer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSuggestion(AddressSuggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromise(Promise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreat(Threat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressRequest(AddressRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptRequest(AcceptRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decline Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decline Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclineRequest(DeclineRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptSuggestion(AcceptSuggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decline Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decline Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclineSuggestion(DeclineSuggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruct(Instruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressOffer(AddressOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptOffer(AcceptOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decline Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decline Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclineOffer(DeclineOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suggestion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suggestion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuggestion(Suggestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Specific Communicative Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Specific Communicative Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionSpecificCommunicativeFunction(DimensionSpecificCommunicativeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue Control Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue Control Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogueControlFunction(DialogueControlFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackFunction(FeedbackFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoFeedback(AutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlloFeedback(AlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionManagementFunction(InteractionManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnManagementFunction(TurnManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeManagementFunction(TimeManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactManagementFunction(ContactManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Own Communication Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Own Communication Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnCommunicationManagementFunction(OwnCommunicationManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partner Communication Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partner Communication Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartnerCommunicationManagementFunction(PartnerCommunicationManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discourse Structure Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discourse Structure Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscourseStructureManagementFunction(DiscourseStructureManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Obligation Management Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Obligation Management Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialObligationManagementFunction(SocialObligationManagementFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salutation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salutation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalutation(Salutation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfIntroduction(SelfIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apologizing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apologizing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApologizing(Apologizing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gratitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gratitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGratitude(Gratitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValediction(Valediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Greeting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Greeting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialGreeting(InitialGreeting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Greeting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Greeting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnGreeting(ReturnGreeting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Self Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Self Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialSelfIntroduction(InitialSelfIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Self Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Self Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnSelfIntroduction(ReturnSelfIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApology(Apology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apology Downplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apology Downplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApologyDownplay(ApologyDownplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thanking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thanking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThanking(Thanking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thanking Downplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thanking Downplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThankingDownplay(ThankingDownplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Goodbye</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Goodbye</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialGoodbye(InitialGoodbye object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Goodbye</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Goodbye</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnGoodbye(ReturnGoodbye object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opening</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opening</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpening(Opening object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preclosing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preclosing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreclosing(Preclosing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicIntroduction(TopicIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Shift Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Shift Announcement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicShiftAnnouncement(TopicShiftAnnouncement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicShift(TopicShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletion(Completion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correct Misspeaking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correct Misspeaking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectMisspeaking(CorrectMisspeaking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Signaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Signaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorSignaling(ErrorSignaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetraction(Retraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Correction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Correction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfCorrection(SelfCorrection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactCheck(ContactCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactIndication(ContactIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stalling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stalling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStalling(Stalling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pausing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pausing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePausing(Pausing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Unit Initial Funtion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Unit Initial Funtion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnUnitInitialFuntion(TurnUnitInitialFuntion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Unit Final Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Unit Final Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnUnitFinalFunction(TurnUnitFinalFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Accept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Accept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnAccept(TurnAccept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Grab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Grab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnGrab(TurnGrab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Take</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Take</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnTake(TurnTake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnAssign(TurnAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Keep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Keep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnKeep(TurnKeep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnRelease(TurnRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Elicitation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Elicitation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackElicitationFunction(FeedbackElicitationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attention Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attention Feedback Elicitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttentionFeedbackElicitation(AttentionFeedbackElicitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perception Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perception Feedback Elicitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerceptionFeedbackElicitation(PerceptionFeedbackElicitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpretation Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpretation Feedback Elicitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpretationFeedbackElicitation(InterpretationFeedbackElicitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Feedack Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Feedack Elicitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationFeedackElicitation(EvaluationFeedackElicitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Feedback Elicitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Feedback Elicitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFeedbackElicitation(ExecutionFeedbackElicitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Giving Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Giving Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackGivingFunction(FeedbackGivingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveAlloFeedback(PositiveAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeAlloFeedback(NegativeAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Execution Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Execution Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveExecutionAlloFeedback(PositiveExecutionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Execution Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Execution Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeExecutionAlloFeedback(NegativeExecutionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Evaluation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Evaluation Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveEvaluationAlloFeedback(PositiveEvaluationAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Evaluation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Evaluation Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeEvaluationAlloFeedback(NegativeEvaluationAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Interpretation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Interpretation Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInterpretationAlloFeedback(PositiveInterpretationAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Interpretation Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Interpretation Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeInterpretationAlloFeedback(NegativeInterpretationAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Perception Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Perception Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositivePerceptionAlloFeedback(PositivePerceptionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Perception Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Perception Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativePerceptionAlloFeedback(NegativePerceptionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Attention Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Attention Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeAttentionAlloFeedback(NegativeAttentionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveAutoFeedback(PositiveAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeAutoFeedback(NegativeAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Execution Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Execution Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveExecutionAutoFeedback(PositiveExecutionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Execution Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Execution Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeExecutionAutoFeedback(NegativeExecutionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Evaluation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Evaluation Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveEvaluationAutoFeedback(PositiveEvaluationAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Evaluation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Evaluation Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeEvaluationAutoFeedback(NegativeEvaluationAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Perception Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Perception Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositivePerceptionAutoFeedback(PositivePerceptionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Perception Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Perception Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativePerceptionAutoFeedback(NegativePerceptionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Interpretation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Interpretation Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInterpretationAutoFeedback(PositiveInterpretationAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Interpretation Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Interpretation Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeInterpretationAutoFeedback(NegativeInterpretationAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Attention Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Attention Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveAttentionAutoFeedback(PositiveAttentionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Attention Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Attention Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeAttentionAutoFeedback(NegativeAttentionAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Attention Allo Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Attention Allo Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveAttentionAlloFeedback(PositiveAttentionAlloFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Communicative_functionsSwitch
