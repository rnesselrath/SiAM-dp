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
package de.dfki.iui.mmds.core.model.io.provider;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.OutputAct} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class OutputActItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutputActItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitiatorPropertyDescriptor(object);
			addAddresseePropertyDescriptor(object);
			addPassedFadePropertyDescriptor(object);
			addBindingPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addSessionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initiator feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInitiatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicativeAct_initiator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicativeAct_initiator_feature", "_UI_CommunicativeAct_type"),
				 IoPackage.Literals.COMMUNICATIVE_ACT__INITIATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Addressee feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAddresseePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicativeAct_addressee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicativeAct_addressee_feature", "_UI_CommunicativeAct_type"),
				 IoPackage.Literals.COMMUNICATIVE_ACT__ADDRESSEE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passed Fade feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPassedFadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicativeAct_passedFade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicativeAct_passedFade_feature", "_UI_CommunicativeAct_type"),
				 IoPackage.Literals.COMMUNICATIVE_ACT__PASSED_FADE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Binding feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BObject_binding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BObject_binding_feature", "_UI_BObject_type"),
				 BasePackage.Literals.BOBJECT__BINDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_description_feature", "_UI_Message_type"),
				 IoPackage.Literals.MESSAGE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_id_feature", "_UI_Message_type"),
				 IoPackage.Literals.MESSAGE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_timestamp_feature", "_UI_Message_type"),
				 IoPackage.Literals.MESSAGE__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSessionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_session_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_session_feature", "_UI_Message_type"),
				 IoPackage.Literals.MESSAGE__SESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION);
			childrenFeatures.add(IoPackage.Literals.OUTPUT_ACT__PRESENTATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OutputAct.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutputAct"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OutputAct)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_OutputAct_type") :
			getString("_UI_OutputAct_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OutputAct.class)) {
			case IoPackage.OUTPUT_ACT__INITIATOR:
			case IoPackage.OUTPUT_ACT__ADDRESSEE:
			case IoPackage.OUTPUT_ACT__PASSED_FADE:
			case IoPackage.OUTPUT_ACT__BINDING:
			case IoPackage.OUTPUT_ACT__DESCRIPTION:
			case IoPackage.OUTPUT_ACT__ID:
			case IoPackage.OUTPUT_ACT__TIMESTAMP:
			case IoPackage.OUTPUT_ACT__SESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoPackage.OUTPUT_ACT__COMMUNICATIVE_FUNCTION:
			case IoPackage.OUTPUT_ACT__PRESENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__COMMUNICATIVE_FUNCTION,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 GuiFactory.eINSTANCE.createGUIApplication()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 GuiFactory.eINSTANCE.createGUIUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createVirtualCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createLampControl()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createVentilatorControl()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createPrimitiveOutputTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createMessageTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createDocumentPresentationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createCommandSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createMenuItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createProgressIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createManipulableImageTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 OutputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.OUTPUT_ACT__PRESENTATION,
				 SpeechSynthesisFactory.eINSTANCE.createSSMLSpeechSynthesis()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SiamEditPlugin.INSTANCE;
	}

}
