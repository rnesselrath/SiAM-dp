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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage
 * @generated
 */
public class BackchannelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BackchannelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackchannelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BackchannelPackage.eINSTANCE;
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
	protected BackchannelSwitch<Adapter> modelSwitch =
		new BackchannelSwitch<Adapter>() {
			@Override
			public Adapter caseOkayPositiveAutoFeedback(OkayPositiveAutoFeedback object) {
				return createOkayPositiveAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseUhmNegativeAutoFeedback(UhmNegativeAutoFeedback object) {
				return createUhmNegativeAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseCommunicativeFunction(CommunicativeFunction object) {
				return createCommunicativeFunctionAdapter();
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
			public Adapter casePositiveAutoFeedback(PositiveAutoFeedback object) {
				return createPositiveAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveAttentionAutoFeedback(PositiveAttentionAutoFeedback object) {
				return createPositiveAttentionAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositivePerceptionAutoFeedback(PositivePerceptionAutoFeedback object) {
				return createPositivePerceptionAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveInterpretationAutoFeedback(PositiveInterpretationAutoFeedback object) {
				return createPositiveInterpretationAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveEvaluationAutoFeedback(PositiveEvaluationAutoFeedback object) {
				return createPositiveEvaluationAutoFeedbackAdapter();
			}
			@Override
			public Adapter casePositiveExecutionAutoFeedback(PositiveExecutionAutoFeedback object) {
				return createPositiveExecutionAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeAutoFeedback(NegativeAutoFeedback object) {
				return createNegativeAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeExecutionAutoFeedback(NegativeExecutionAutoFeedback object) {
				return createNegativeExecutionAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeEvaluationAutoFeedback(NegativeEvaluationAutoFeedback object) {
				return createNegativeEvaluationAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeInterpretationAutoFeedback(NegativeInterpretationAutoFeedback object) {
				return createNegativeInterpretationAutoFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativePerceptionAutoFeedback(NegativePerceptionAutoFeedback object) {
				return createNegativePerceptionAutoFeedbackAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback <em>Okay Positive Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback
	 * @generated
	 */
	public Adapter createOkayPositiveAutoFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.backchannel.UhmNegativeAutoFeedback <em>Uhm Negative Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.backchannel.UhmNegativeAutoFeedback
	 * @generated
	 */
	public Adapter createUhmNegativeAutoFeedbackAdapter() {
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

} //BackchannelAdapterFactory
