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
package de.dfki.iui.mmds.core.model.backchannel.util;

import de.dfki.iui.mmds.core.model.backchannel.*;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback;
import de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage
 * @generated
 */
public class BackchannelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BackchannelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackchannelSwitch() {
		if (modelPackage == null) {
			modelPackage = BackchannelPackage.eINSTANCE;
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
			case BackchannelPackage.OKAY_POSITIVE_AUTO_FEEDBACK: {
				OkayPositiveAutoFeedback okayPositiveAutoFeedback = (OkayPositiveAutoFeedback)theEObject;
				T result = caseOkayPositiveAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositiveExecutionAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositiveInterpretationAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositivePerceptionAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositiveEvaluationAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositiveAttentionAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = casePositiveAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = caseAutoFeedback(okayPositiveAutoFeedback);
				if (result == null) result = caseFeedbackFunction(okayPositiveAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(okayPositiveAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(okayPositiveAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(okayPositiveAutoFeedback);
				if (result == null) result = caseBObject(okayPositiveAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BackchannelPackage.UHM_NEGATIVE_AUTO_FEEDBACK: {
				UhmNegativeAutoFeedback uhmNegativeAutoFeedback = (UhmNegativeAutoFeedback)theEObject;
				T result = caseUhmNegativeAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseNegativePerceptionAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseNegativeInterpretationAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseNegativeEvaluationAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseNegativeExecutionAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseNegativeAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseAutoFeedback(uhmNegativeAutoFeedback);
				if (result == null) result = caseFeedbackFunction(uhmNegativeAutoFeedback);
				if (result == null) result = caseDialogueControlFunction(uhmNegativeAutoFeedback);
				if (result == null) result = caseDimensionSpecificCommunicativeFunction(uhmNegativeAutoFeedback);
				if (result == null) result = caseCommunicativeFunction(uhmNegativeAutoFeedback);
				if (result == null) result = caseBObject(uhmNegativeAutoFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Okay Positive Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Okay Positive Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOkayPositiveAutoFeedback(OkayPositiveAutoFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uhm Negative Auto Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uhm Negative Auto Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUhmNegativeAutoFeedback(UhmNegativeAutoFeedback object) {
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

} //BackchannelSwitch
