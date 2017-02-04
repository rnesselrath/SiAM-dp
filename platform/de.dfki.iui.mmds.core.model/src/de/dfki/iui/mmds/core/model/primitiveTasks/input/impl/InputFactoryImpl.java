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
package de.dfki.iui.mmds.core.model.primitiveTasks.input.impl;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputFactoryImpl extends EFactoryImpl implements InputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputFactory init() {
		try {
			InputFactory theInputFactory = (InputFactory)EPackage.Registry.INSTANCE.getEFactory(InputPackage.eNS_URI);
			if (theInputFactory != null) {
				return theInputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFactoryImpl() {
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
			case InputPackage.PRIMITIVE_INPUT_TASK: return createPrimitiveInputTask();
			case InputPackage.ZOOM_TASK: return createZoomTask();
			case InputPackage.PAN_TASK: return createPanTask();
			case InputPackage.SCROLL_TASK: return createScrollTask();
			case InputPackage.INTRA_DOCUMENT_NAVIGATION_TASK: return createIntraDocumentNavigationTask();
			case InputPackage.DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK: return createDialogFlowDirectionalNavigationTask();
			case InputPackage.DIALOG_FLOW_FORWARD_NAVIGATION_TASK: return createDialogFlowForwardNavigationTask();
			case InputPackage.DIALOG_FLOW_BACKWARD_NAVIGATION_TASK: return createDialogFlowBackwardNavigationTask();
			case InputPackage.DIALOG_FLOW_START_NAVIGATION_TASK: return createDialogFlowStartNavigationTask();
			case InputPackage.DIALOG_FLOW_END_NAVIGATION_TASK: return createDialogFlowEndNavigationTask();
			case InputPackage.DIALOG_FLOW_RANDOM_NAVIGATION_TASK: return createDialogFlowRandomNavigationTask();
			case InputPackage.DIALOG_FLOW_CANCEL_NAVIGATION_TASK: return createDialogFlowCancelNavigationTask();
			case InputPackage.DIALOG_FLOW_LABEL_NAVIGATION_TASK: return createDialogFlowLabelNavigationTask();
			case InputPackage.COMMAND_INVOCATION_TASK: return createCommandInvocationTask();
			case InputPackage.MENU_INVOCATION_TASK: return createMenuInvocationTask();
			case InputPackage.ITEM_ACTIVATION_TASK: return createItemActivationTask();
			case InputPackage.ITEM_REARRANGEMENT_TASK: return createItemRearrangementTask();
			case InputPackage.EXPAND_INFORMATION_TASK: return createExpandInformationTask();
			case InputPackage.ASR_ERROR_CORRECTION_TASK: return createASRErrorCorrectionTask();
			case InputPackage.TEXT_SELECTION_TASK: return createTextSelectionTask();
			case InputPackage.PROACTIVITY_INVOCATION_TASK: return createProactivityInvocationTask();
			case InputPackage.EXPANATION_EXPANSION_TASK: return createExpanationExpansionTask();
			case InputPackage.REVERT_ADAPTATION_TASK: return createRevertAdaptationTask();
			case InputPackage.FREE_TEXT_ENTRY_TASK: return createFreeTextEntryTask();
			case InputPackage.DATE_TIME_ENTRY_TASK: return createDateTimeEntryTask();
			case InputPackage.INTEGER_NUMBER_ENTRY_TASK: return createIntegerNumberEntryTask();
			case InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK: return createBoundedIntegerNumberEntryTask();
			case InputPackage.DECIMAL_NUMBER_ENTRY_TASK: return createDecimalNumberEntryTask();
			case InputPackage.YES_NO_SELECTION_TASK: return createYesNoSelectionTask();
			case InputPackage.TRI_STATE_SELECTION_TASK: return createTriStateSelectionTask();
			case InputPackage.LIST_ITEM_SELECTION_TASK: return createListItemSelectionTask();
			case InputPackage.LIST_ITEM_MULTI_SELECTION_TASK: return createListItemMultiSelectionTask();
			case InputPackage.MESSAGE_DISMISSAL_TASK: return createMessageDismissalTask();
			case InputPackage.OBJECT_SELECTION_TASK: return createObjectSelectionTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInputTask createPrimitiveInputTask() {
		PrimitiveInputTaskImpl primitiveInputTask = new PrimitiveInputTaskImpl();
		return primitiveInputTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomTask createZoomTask() {
		ZoomTaskImpl zoomTask = new ZoomTaskImpl();
		return zoomTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanTask createPanTask() {
		PanTaskImpl panTask = new PanTaskImpl();
		return panTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollTask createScrollTask() {
		ScrollTaskImpl scrollTask = new ScrollTaskImpl();
		return scrollTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntraDocumentNavigationTask createIntraDocumentNavigationTask() {
		IntraDocumentNavigationTaskImpl intraDocumentNavigationTask = new IntraDocumentNavigationTaskImpl();
		return intraDocumentNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowDirectionalNavigationTask createDialogFlowDirectionalNavigationTask() {
		DialogFlowDirectionalNavigationTaskImpl dialogFlowDirectionalNavigationTask = new DialogFlowDirectionalNavigationTaskImpl();
		return dialogFlowDirectionalNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowForwardNavigationTask createDialogFlowForwardNavigationTask() {
		DialogFlowForwardNavigationTaskImpl dialogFlowForwardNavigationTask = new DialogFlowForwardNavigationTaskImpl();
		return dialogFlowForwardNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowBackwardNavigationTask createDialogFlowBackwardNavigationTask() {
		DialogFlowBackwardNavigationTaskImpl dialogFlowBackwardNavigationTask = new DialogFlowBackwardNavigationTaskImpl();
		return dialogFlowBackwardNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowStartNavigationTask createDialogFlowStartNavigationTask() {
		DialogFlowStartNavigationTaskImpl dialogFlowStartNavigationTask = new DialogFlowStartNavigationTaskImpl();
		return dialogFlowStartNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowEndNavigationTask createDialogFlowEndNavigationTask() {
		DialogFlowEndNavigationTaskImpl dialogFlowEndNavigationTask = new DialogFlowEndNavigationTaskImpl();
		return dialogFlowEndNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowRandomNavigationTask createDialogFlowRandomNavigationTask() {
		DialogFlowRandomNavigationTaskImpl dialogFlowRandomNavigationTask = new DialogFlowRandomNavigationTaskImpl();
		return dialogFlowRandomNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowCancelNavigationTask createDialogFlowCancelNavigationTask() {
		DialogFlowCancelNavigationTaskImpl dialogFlowCancelNavigationTask = new DialogFlowCancelNavigationTaskImpl();
		return dialogFlowCancelNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogFlowLabelNavigationTask createDialogFlowLabelNavigationTask() {
		DialogFlowLabelNavigationTaskImpl dialogFlowLabelNavigationTask = new DialogFlowLabelNavigationTaskImpl();
		return dialogFlowLabelNavigationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandInvocationTask createCommandInvocationTask() {
		CommandInvocationTaskImpl commandInvocationTask = new CommandInvocationTaskImpl();
		return commandInvocationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuInvocationTask createMenuInvocationTask() {
		MenuInvocationTaskImpl menuInvocationTask = new MenuInvocationTaskImpl();
		return menuInvocationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemActivationTask createItemActivationTask() {
		ItemActivationTaskImpl itemActivationTask = new ItemActivationTaskImpl();
		return itemActivationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemRearrangementTask createItemRearrangementTask() {
		ItemRearrangementTaskImpl itemRearrangementTask = new ItemRearrangementTaskImpl();
		return itemRearrangementTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandInformationTask createExpandInformationTask() {
		ExpandInformationTaskImpl expandInformationTask = new ExpandInformationTaskImpl();
		return expandInformationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASRErrorCorrectionTask createASRErrorCorrectionTask() {
		ASRErrorCorrectionTaskImpl asrErrorCorrectionTask = new ASRErrorCorrectionTaskImpl();
		return asrErrorCorrectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSelectionTask createTextSelectionTask() {
		TextSelectionTaskImpl textSelectionTask = new TextSelectionTaskImpl();
		return textSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactivityInvocationTask createProactivityInvocationTask() {
		ProactivityInvocationTaskImpl proactivityInvocationTask = new ProactivityInvocationTaskImpl();
		return proactivityInvocationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpanationExpansionTask createExpanationExpansionTask() {
		ExpanationExpansionTaskImpl expanationExpansionTask = new ExpanationExpansionTaskImpl();
		return expanationExpansionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevertAdaptationTask createRevertAdaptationTask() {
		RevertAdaptationTaskImpl revertAdaptationTask = new RevertAdaptationTaskImpl();
		return revertAdaptationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextEntryTask createFreeTextEntryTask() {
		FreeTextEntryTaskImpl freeTextEntryTask = new FreeTextEntryTaskImpl();
		return freeTextEntryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeEntryTask createDateTimeEntryTask() {
		DateTimeEntryTaskImpl dateTimeEntryTask = new DateTimeEntryTaskImpl();
		return dateTimeEntryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerNumberEntryTask createIntegerNumberEntryTask() {
		IntegerNumberEntryTaskImpl integerNumberEntryTask = new IntegerNumberEntryTaskImpl();
		return integerNumberEntryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedIntegerNumberEntryTask createBoundedIntegerNumberEntryTask() {
		BoundedIntegerNumberEntryTaskImpl boundedIntegerNumberEntryTask = new BoundedIntegerNumberEntryTaskImpl();
		return boundedIntegerNumberEntryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumberEntryTask createDecimalNumberEntryTask() {
		DecimalNumberEntryTaskImpl decimalNumberEntryTask = new DecimalNumberEntryTaskImpl();
		return decimalNumberEntryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoSelectionTask createYesNoSelectionTask() {
		YesNoSelectionTaskImpl yesNoSelectionTask = new YesNoSelectionTaskImpl();
		return yesNoSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriStateSelectionTask createTriStateSelectionTask() {
		TriStateSelectionTaskImpl triStateSelectionTask = new TriStateSelectionTaskImpl();
		return triStateSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemSelectionTask createListItemSelectionTask() {
		ListItemSelectionTaskImpl listItemSelectionTask = new ListItemSelectionTaskImpl();
		return listItemSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemMultiSelectionTask createListItemMultiSelectionTask() {
		ListItemMultiSelectionTaskImpl listItemMultiSelectionTask = new ListItemMultiSelectionTaskImpl();
		return listItemMultiSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDismissalTask createMessageDismissalTask() {
		MessageDismissalTaskImpl messageDismissalTask = new MessageDismissalTaskImpl();
		return messageDismissalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSelectionTask createObjectSelectionTask() {
		ObjectSelectionTaskImpl objectSelectionTask = new ObjectSelectionTaskImpl();
		return objectSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPackage getInputPackage() {
		return (InputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InputPackage getPackage() {
		return InputPackage.eINSTANCE;
	}

} //InputFactoryImpl
