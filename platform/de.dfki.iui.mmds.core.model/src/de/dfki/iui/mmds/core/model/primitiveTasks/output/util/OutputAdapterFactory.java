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
package de.dfki.iui.mmds.core.model.primitiveTasks.output.util;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io.OutputRepresentation;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask;

import de.dfki.iui.mmds.core.model.primitiveTasks.output.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage
 * @generated
 */
public class OutputAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutputPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutputPackage.eINSTANCE;
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
	protected OutputSwitch<Adapter> modelSwitch =
		new OutputSwitch<Adapter>() {
			@Override
			public Adapter casePrimitiveOutputTask(PrimitiveOutputTask object) {
				return createPrimitiveOutputTaskAdapter();
			}
			@Override
			public Adapter caseSelectionTaskBase(SelectionTaskBase object) {
				return createSelectionTaskBaseAdapter();
			}
			@Override
			public Adapter caseAdaptationTaskBase(AdaptationTaskBase object) {
				return createAdaptationTaskBaseAdapter();
			}
			@Override
			public Adapter caseFactEntryTaskBase(FactEntryTaskBase object) {
				return createFactEntryTaskBaseAdapter();
			}
			@Override
			public Adapter caseMessageTask(MessageTask object) {
				return createMessageTaskAdapter();
			}
			@Override
			public Adapter caseDocumentPresentationTask(DocumentPresentationTask object) {
				return createDocumentPresentationTaskAdapter();
			}
			@Override
			public Adapter caseCommandSelectionTask(CommandSelectionTask object) {
				return createCommandSelectionTaskAdapter();
			}
			@Override
			public Adapter caseMenuItemSelectionTask(MenuItemSelectionTask object) {
				return createMenuItemSelectionTaskAdapter();
			}
			@Override
			public Adapter caseProgressIndicationTask(ProgressIndicationTask object) {
				return createProgressIndicationTaskAdapter();
			}
			@Override
			public Adapter caseAdaptationIndicationTask(AdaptationIndicationTask object) {
				return createAdaptationIndicationTaskAdapter();
			}
			@Override
			public Adapter caseManipulableImageTask(ManipulableImageTask object) {
				return createManipulableImageTaskAdapter();
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
			public Adapter caseLongListItemSelectionTask(LongListItemSelectionTask object) {
				return createLongListItemSelectionTaskAdapter();
			}
			@Override
			public Adapter caseShortItemSelectionTask(ShortItemSelectionTask object) {
				return createShortItemSelectionTaskAdapter();
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
			public Adapter caseOutputRepresentation(OutputRepresentation object) {
				return createOutputRepresentationAdapter();
			}
			@Override
			public Adapter caseInputRepresentation(InputRepresentation object) {
				return createInputRepresentationAdapter();
			}
			@Override
			public Adapter casePrimitiveInputTask(PrimitiveInputTask object) {
				return createPrimitiveInputTaskAdapter();
			}
			@Override
			public Adapter caseInput_AdaptationTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase object) {
				return createInput_AdaptationTaskBaseAdapter();
			}
			@Override
			public Adapter caseInput_FactEntryTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase object) {
				return createInput_FactEntryTaskBaseAdapter();
			}
			@Override
			public Adapter caseInput_IntegerNumberEntryTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask object) {
				return createInput_IntegerNumberEntryTaskAdapter();
			}
			@Override
			public Adapter caseInput_BoundedIntegerNumberEntryTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask object) {
				return createInput_BoundedIntegerNumberEntryTaskAdapter();
			}
			@Override
			public Adapter caseInput_SelectionTaskBase(de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase object) {
				return createInput_SelectionTaskBaseAdapter();
			}
			@Override
			public Adapter caseInput_ListItemSelectionTask(de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask object) {
				return createInput_ListItemSelectionTaskAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.PrimitiveOutputTask <em>Primitive Output Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.PrimitiveOutputTask
	 * @generated
	 */
	public Adapter createPrimitiveOutputTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase <em>Selection Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase
	 * @generated
	 */
	public Adapter createSelectionTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationTaskBase <em>Adaptation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationTaskBase
	 * @generated
	 */
	public Adapter createAdaptationTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.FactEntryTaskBase <em>Fact Entry Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.FactEntryTaskBase
	 * @generated
	 */
	public Adapter createFactEntryTaskBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageTask <em>Message Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageTask
	 * @generated
	 */
	public Adapter createMessageTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DocumentPresentationTask <em>Document Presentation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DocumentPresentationTask
	 * @generated
	 */
	public Adapter createDocumentPresentationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.CommandSelectionTask <em>Command Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.CommandSelectionTask
	 * @generated
	 */
	public Adapter createCommandSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MenuItemSelectionTask <em>Menu Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MenuItemSelectionTask
	 * @generated
	 */
	public Adapter createMenuItemSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask <em>Progress Indication Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask
	 * @generated
	 */
	public Adapter createProgressIndicationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationIndicationTask <em>Adaptation Indication Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationIndicationTask
	 * @generated
	 */
	public Adapter createAdaptationIndicationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ManipulableImageTask <em>Manipulable Image Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ManipulableImageTask
	 * @generated
	 */
	public Adapter createManipulableImageTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.FreeTextEntryTask <em>Free Text Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.FreeTextEntryTask
	 * @generated
	 */
	public Adapter createFreeTextEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DateTimeEntryTask <em>Date Time Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DateTimeEntryTask
	 * @generated
	 */
	public Adapter createDateTimeEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.IntegerNumberEntryTask <em>Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.IntegerNumberEntryTask
	 * @generated
	 */
	public Adapter createIntegerNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask <em>Bounded Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask
	 * @generated
	 */
	public Adapter createBoundedIntegerNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DecimalNumberEntryTask <em>Decimal Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DecimalNumberEntryTask
	 * @generated
	 */
	public Adapter createDecimalNumberEntryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.YesNoSelectionTask <em>Yes No Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.YesNoSelectionTask
	 * @generated
	 */
	public Adapter createYesNoSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.TriStateSelectionTask <em>Tri State Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.TriStateSelectionTask
	 * @generated
	 */
	public Adapter createTriStateSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask <em>List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask
	 * @generated
	 */
	public Adapter createListItemSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.LongListItemSelectionTask <em>Long List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.LongListItemSelectionTask
	 * @generated
	 */
	public Adapter createLongListItemSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ShortItemSelectionTask <em>Short Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ShortItemSelectionTask
	 * @generated
	 */
	public Adapter createShortItemSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemMultiSelectionTask <em>List Item Multi Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemMultiSelectionTask
	 * @generated
	 */
	public Adapter createListItemMultiSelectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageDismissalTask <em>Message Dismissal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageDismissalTask
	 * @generated
	 */
	public Adapter createMessageDismissalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ObjectSelectionTask <em>Object Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ObjectSelectionTask
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.OutputRepresentation
	 * @generated
	 */
	public Adapter createOutputRepresentationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase <em>Adaptation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase
	 * @generated
	 */
	public Adapter createInput_AdaptationTaskBaseAdapter() {
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
	public Adapter createInput_FactEntryTaskBaseAdapter() {
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
	public Adapter createInput_IntegerNumberEntryTaskAdapter() {
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
	public Adapter createInput_BoundedIntegerNumberEntryTaskAdapter() {
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
	public Adapter createInput_SelectionTaskBaseAdapter() {
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
	public Adapter createInput_ListItemSelectionTaskAdapter() {
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

} //OutputAdapterFactory
