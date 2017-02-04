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
package de.dfki.iui.mmds.core.model.primitiveTasks.output.impl;

import de.dfki.iui.mmds.core.model.primitiveTasks.output.*;

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
public class OutputFactoryImpl extends EFactoryImpl implements OutputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputFactory init() {
		try {
			OutputFactory theOutputFactory = (OutputFactory)EPackage.Registry.INSTANCE.getEFactory(OutputPackage.eNS_URI);
			if (theOutputFactory != null) {
				return theOutputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFactoryImpl() {
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
			case OutputPackage.PRIMITIVE_OUTPUT_TASK: return createPrimitiveOutputTask();
			case OutputPackage.MESSAGE_TASK: return createMessageTask();
			case OutputPackage.DOCUMENT_PRESENTATION_TASK: return createDocumentPresentationTask();
			case OutputPackage.COMMAND_SELECTION_TASK: return createCommandSelectionTask();
			case OutputPackage.MENU_ITEM_SELECTION_TASK: return createMenuItemSelectionTask();
			case OutputPackage.PROGRESS_INDICATION_TASK: return createProgressIndicationTask();
			case OutputPackage.ADAPTATION_INDICATION_TASK: return createAdaptationIndicationTask();
			case OutputPackage.MANIPULABLE_IMAGE_TASK: return createManipulableImageTask();
			case OutputPackage.FREE_TEXT_ENTRY_TASK: return createFreeTextEntryTask();
			case OutputPackage.DATE_TIME_ENTRY_TASK: return createDateTimeEntryTask();
			case OutputPackage.INTEGER_NUMBER_ENTRY_TASK: return createIntegerNumberEntryTask();
			case OutputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK: return createBoundedIntegerNumberEntryTask();
			case OutputPackage.DECIMAL_NUMBER_ENTRY_TASK: return createDecimalNumberEntryTask();
			case OutputPackage.YES_NO_SELECTION_TASK: return createYesNoSelectionTask();
			case OutputPackage.TRI_STATE_SELECTION_TASK: return createTriStateSelectionTask();
			case OutputPackage.LIST_ITEM_SELECTION_TASK: return createListItemSelectionTask();
			case OutputPackage.LONG_LIST_ITEM_SELECTION_TASK: return createLongListItemSelectionTask();
			case OutputPackage.SHORT_ITEM_SELECTION_TASK: return createShortItemSelectionTask();
			case OutputPackage.LIST_ITEM_MULTI_SELECTION_TASK: return createListItemMultiSelectionTask();
			case OutputPackage.MESSAGE_DISMISSAL_TASK: return createMessageDismissalTask();
			case OutputPackage.OBJECT_SELECTION_TASK: return createObjectSelectionTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveOutputTask createPrimitiveOutputTask() {
		PrimitiveOutputTaskImpl primitiveOutputTask = new PrimitiveOutputTaskImpl();
		return primitiveOutputTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTask createMessageTask() {
		MessageTaskImpl messageTask = new MessageTaskImpl();
		return messageTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentPresentationTask createDocumentPresentationTask() {
		DocumentPresentationTaskImpl documentPresentationTask = new DocumentPresentationTaskImpl();
		return documentPresentationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandSelectionTask createCommandSelectionTask() {
		CommandSelectionTaskImpl commandSelectionTask = new CommandSelectionTaskImpl();
		return commandSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItemSelectionTask createMenuItemSelectionTask() {
		MenuItemSelectionTaskImpl menuItemSelectionTask = new MenuItemSelectionTaskImpl();
		return menuItemSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressIndicationTask createProgressIndicationTask() {
		ProgressIndicationTaskImpl progressIndicationTask = new ProgressIndicationTaskImpl();
		return progressIndicationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationIndicationTask createAdaptationIndicationTask() {
		AdaptationIndicationTaskImpl adaptationIndicationTask = new AdaptationIndicationTaskImpl();
		return adaptationIndicationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManipulableImageTask createManipulableImageTask() {
		ManipulableImageTaskImpl manipulableImageTask = new ManipulableImageTaskImpl();
		return manipulableImageTask;
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
	public LongListItemSelectionTask createLongListItemSelectionTask() {
		LongListItemSelectionTaskImpl longListItemSelectionTask = new LongListItemSelectionTaskImpl();
		return longListItemSelectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortItemSelectionTask createShortItemSelectionTask() {
		ShortItemSelectionTaskImpl shortItemSelectionTask = new ShortItemSelectionTaskImpl();
		return shortItemSelectionTask;
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
	public OutputPackage getOutputPackage() {
		return (OutputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutputPackage getPackage() {
		return OutputPackage.eINSTANCE;
	}

} //OutputFactoryImpl
