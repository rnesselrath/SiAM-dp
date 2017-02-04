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
package de.dfki.iui.mmds.core.model.primitiveTasks.input.util;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage
 * @generated
 */
public class InputAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InputPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InputPackage.eINSTANCE;
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
	protected InputSwitch<Adapter> modelSwitch =
		new InputSwitch<Adapter>() {
			@Override
			public Adapter casePrimitiveInputTask(PrimitiveInputTask object) {
				return createPrimitiveInputTaskAdapter();
			}
			@Override
			public Adapter caseContainerManipulationTaskBase(ContainerManipulationTaskBase object) {
				return createContainerManipulationTaskBaseAdapter();
			}
			@Override
			public Adapter caseSelectionTaskBase(SelectionTaskBase object) {
				return createSelectionTaskBaseAdapter();
			}
			@Override
			public Adapter caseFactEntryTaskBase(FactEntryTaskBase object) {
				return createFactEntryTaskBaseAdapter();
			}
			@Override
			public Adapter caseNavigationTaskBase(NavigationTaskBase object) {
				return createNavigationTaskBaseAdapter();
			}
			@Override
			public Adapter caseInvocationTaskBase(InvocationTaskBase object) {
				return createInvocationTaskBaseAdapter();
			}
			@Override
			public Adapter caseAdaptationTaskBase(AdaptationTaskBase object) {
				return createAdaptationTaskBaseAdapter();
			}
			@Override
			public Adapter caseZoomTask(ZoomTask object) {
				return createZoomTaskAdapter();
			}
			@Override
			public Adapter casePanTask(PanTask object) {
				return createPanTaskAdapter();
			}
			@Override
			public Adapter caseScrollTask(ScrollTask object) {
				return createScrollTaskAdapter();
			}
			@Override
			public Adapter caseIntraDocumentNavigationTask(IntraDocumentNavigationTask object) {
				return createIntraDocumentNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowDirectionalNavigationTask(DialogFlowDirectionalNavigationTask object) {
				return createDialogFlowDirectionalNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowForwardNavigationTask(DialogFlowForwardNavigationTask object) {
				return createDialogFlowForwardNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowBackwardNavigationTask(DialogFlowBackwardNavigationTask object) {
				return createDialogFlowBackwardNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowStartNavigationTask(DialogFlowStartNavigationTask object) {
				return createDialogFlowStartNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowEndNavigationTask(DialogFlowEndNavigationTask object) {
				return createDialogFlowEndNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowRandomNavigationTask(DialogFlowRandomNavigationTask object) {
				return createDialogFlowRandomNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowCancelNavigationTask(DialogFlowCancelNavigationTask object) {
				return createDialogFlowCancelNavigationTaskAdapter();
			}
			@Override
			public Adapter caseDialogFlowLabelNavigationTask(DialogFlowLabelNavigationTask object) {
				return createDialogFlowLabelNavigationTaskAdapter();
			}
			@Override
			public Adapter caseCommandInvocationTask(CommandInvocationTask object) {
				return createCommandInvocationTaskAdapter();
			}
			@Override
			public Adapter caseMenuInvocationTask(MenuInvocationTask object) {
				return createMenuInvocationTaskAdapter();
			}
			@Override
			public Adapter caseItemActivationTask(ItemActivationTask object) {
				return createItemActivationTaskAdapter();
			}
			@Override
			public Adapter caseItemRearrangementTask(ItemRearrangementTask object) {
				return createItemRearrangementTaskAdapter();
			}
			@Override
			public Adapter caseExpandInformationTask(ExpandInformationTask object) {
				return createExpandInformationTaskAdapter();
			}
			@Override
			public Adapter caseASRErrorCorrectionTask(ASRErrorCorrectionTask object) {
				return createASRErrorCorrectionTaskAdapter();
			}
			@Override
			public Adapter caseTextSelectionTask(TextSelectionTask object) {
				return createTextSelectionTaskAdapter();
			}
			@Override
			public Adapter caseProactivityInvocationTask(ProactivityInvocationTask object) {
				return createProactivityInvocationTaskAdapter();
			}
			@Override
			public Adapter caseExpanationExpansionTask(ExpanationExpansionTask object) {
				return createExpanationExpansionTaskAdapter();
			}
			@Override
			public Adapter caseRevertAdaptationTask(RevertAdaptationTask object) {
				return createRevertAdaptationTaskAdapter();
			}
			@Override
			public Adapter caseFreeTextEntryTask(FreeTextEntryTask object) {
				return createFreeTextEntryTaskAdapter();
			}
			@Override
			public Adapter caseDateTimeEntryTask(DateTimeEntryTask object) {
				return createDateTimeEntryTaskAdapter();
			}
			@Override
			public Adapter caseIntegerNumberEntryTask(IntegerNumberEntryTask object) {
				return createIntegerNumberEntryTaskAdapter();
			}
			@Override
			public Adapter caseBoundedIntegerNumberEntryTask(BoundedIntegerNumberEntryTask object) {
				return createBoundedIntegerNumberEntryTaskAdapter();
			}
			@Override
			public Adapter caseDecimalNumberEntryTask(DecimalNumberEntryTask object) {
				return createDecimalNumberEntryTaskAdapter();
			}
			@Override
			public Adapter caseYesNoSelectionTask(YesNoSelectionTask object) {
				return createYesNoSelectionTaskAdapter();
			}
			@Override
			public Adapter caseTriStateSelectionTask(TriStateSelectionTask object) {
				return createTriStateSelectionTaskAdapter();
			}
			@Override
			public Adapter caseListItemSelectionTask(ListItemSelectionTask object) {
				return createListItemSelectionTaskAdapter();
			}
			@Override
			public Adapter caseListItemMultiSelectionTask(ListItemMultiSelectionTask object) {
				return createListItemMultiSelectionTaskAdapter();
			}
			@Override
			public Adapter caseMessageDismissalTask(MessageDismissalTask object) {
				return createMessageDismissalTaskAdapter();
			}
			@Override
			public Adapter caseObjectSelectionTask(ObjectSelectionTask object) {
				return createObjectSelectionTaskAdapter();
			}
			@Override
			public Adapter casePrimitiveTask(PrimitiveTask object) {
				return createPrimitiveTaskAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter caseIORepresentation(IORepresentation object) {
				return createIORepresentationAdapter();
			}
			@Override
			public Adapter caseInputRepresentation(InputRepresentation object) {
				return createInputRepresentationAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask <em>Primitive Input Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask
	 * @generated
	 */
	public Adapter createPrimitiveInputTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ContainerManipulationTaskBase <em>Container Manipulation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ContainerManipulationTaskBase
	 * @generated
	 */
	public Adapter createContainerManipulationTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase <em>Selection Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase
	 * @generated
	 */
	public Adapter createSelectionTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase <em>Fact Entry Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase
	 * @generated
	 */
	public Adapter createFactEntryTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.NavigationTaskBase <em>Navigation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.NavigationTaskBase
	 * @generated
	 */
	public Adapter createNavigationTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.InvocationTaskBase <em>Invocation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InvocationTaskBase
	 * @generated
	 */
	public Adapter createInvocationTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase <em>Adaptation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase
	 * @generated
	 */
	public Adapter createAdaptationTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ZoomTask <em>Zoom Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ZoomTask
	 * @generated
	 */
	public Adapter createZoomTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.PanTask <em>Pan Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.PanTask
	 * @generated
	 */
	public Adapter createPanTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ScrollTask <em>Scroll Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ScrollTask
	 * @generated
	 */
	public Adapter createScrollTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.IntraDocumentNavigationTask <em>Intra Document Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.IntraDocumentNavigationTask
	 * @generated
	 */
	public Adapter createIntraDocumentNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowDirectionalNavigationTask <em>Dialog Flow Directional Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowDirectionalNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowDirectionalNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowForwardNavigationTask <em>Dialog Flow Forward Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowForwardNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowForwardNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowBackwardNavigationTask <em>Dialog Flow Backward Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowBackwardNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowBackwardNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowStartNavigationTask <em>Dialog Flow Start Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowStartNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowStartNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowEndNavigationTask <em>Dialog Flow End Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowEndNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowEndNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowRandomNavigationTask <em>Dialog Flow Random Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowRandomNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowRandomNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowCancelNavigationTask <em>Dialog Flow Cancel Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowCancelNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowCancelNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowLabelNavigationTask <em>Dialog Flow Label Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowLabelNavigationTask
	 * @generated
	 */
	public Adapter createDialogFlowLabelNavigationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.CommandInvocationTask <em>Command Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.CommandInvocationTask
	 * @generated
	 */
	public Adapter createCommandInvocationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.MenuInvocationTask <em>Menu Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.MenuInvocationTask
	 * @generated
	 */
	public Adapter createMenuInvocationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemActivationTask <em>Item Activation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemActivationTask
	 * @generated
	 */
	public Adapter createItemActivationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemRearrangementTask <em>Item Rearrangement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemRearrangementTask
	 * @generated
	 */
	public Adapter createItemRearrangementTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpandInformationTask <em>Expand Information Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpandInformationTask
	 * @generated
	 */
	public Adapter createExpandInformationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ASRErrorCorrectionTask <em>ASR Error Correction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ASRErrorCorrectionTask
	 * @generated
	 */
	public Adapter createASRErrorCorrectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.TextSelectionTask <em>Text Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.TextSelectionTask
	 * @generated
	 */
	public Adapter createTextSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ProactivityInvocationTask <em>Proactivity Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ProactivityInvocationTask
	 * @generated
	 */
	public Adapter createProactivityInvocationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpanationExpansionTask <em>Expanation Expansion Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpanationExpansionTask
	 * @generated
	 */
	public Adapter createExpanationExpansionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.RevertAdaptationTask <em>Revert Adaptation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.RevertAdaptationTask
	 * @generated
	 */
	public Adapter createRevertAdaptationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.FreeTextEntryTask <em>Free Text Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.FreeTextEntryTask
	 * @generated
	 */
	public Adapter createFreeTextEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DateTimeEntryTask <em>Date Time Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DateTimeEntryTask
	 * @generated
	 */
	public Adapter createDateTimeEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask <em>Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask
	 * @generated
	 */
	public Adapter createIntegerNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask <em>Bounded Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask
	 * @generated
	 */
	public Adapter createBoundedIntegerNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DecimalNumberEntryTask <em>Decimal Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DecimalNumberEntryTask
	 * @generated
	 */
	public Adapter createDecimalNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.YesNoSelectionTask <em>Yes No Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.YesNoSelectionTask
	 * @generated
	 */
	public Adapter createYesNoSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.TriStateSelectionTask <em>Tri State Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.TriStateSelectionTask
	 * @generated
	 */
	public Adapter createTriStateSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask <em>List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask
	 * @generated
	 */
	public Adapter createListItemSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemMultiSelectionTask <em>List Item Multi Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemMultiSelectionTask
	 * @generated
	 */
	public Adapter createListItemMultiSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.MessageDismissalTask <em>Message Dismissal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.MessageDismissalTask
	 * @generated
	 */
	public Adapter createMessageDismissalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ObjectSelectionTask <em>Object Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ObjectSelectionTask
	 * @generated
	 */
	public Adapter createObjectSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask <em>Primitive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask
	 * @generated
	 */
	public Adapter createPrimitiveTaskAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.IORepresentation <em>IO Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation
	 * @generated
	 */
	public Adapter createIORepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.InputRepresentation
	 * @generated
	 */
	public Adapter createInputRepresentationAdapter() {
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

} //InputAdapterFactory
