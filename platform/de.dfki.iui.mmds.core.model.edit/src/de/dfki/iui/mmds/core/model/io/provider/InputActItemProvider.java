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
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory;
import de.dfki.iui.mmds.core.model.json.JsonFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.InputAct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InputActItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputActItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Initiator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Addressee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Passed Fade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Session feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IoPackage.Literals.INPUT_ACT__REPRESENTATION);
			childrenFeatures.add(IoPackage.Literals.INPUT_ACT__HYPOTHESES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InputAct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InputAct"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InputAct)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_InputAct_type") :
			getString("_UI_InputAct_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(InputAct.class)) {
			case IoPackage.INPUT_ACT__INITIATOR:
			case IoPackage.INPUT_ACT__ADDRESSEE:
			case IoPackage.INPUT_ACT__PASSED_FADE:
			case IoPackage.INPUT_ACT__BINDING:
			case IoPackage.INPUT_ACT__DESCRIPTION:
			case IoPackage.INPUT_ACT__ID:
			case IoPackage.INPUT_ACT__TIMESTAMP:
			case IoPackage.INPUT_ACT__SESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoPackage.INPUT_ACT__REPRESENTATION:
			case IoPackage.INPUT_ACT__HYPOTHESES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 GuiFactory.eINSTANCE.createGUIEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createAcousticEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createHandGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createBodyGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createEyeGaze()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createHeadGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createPointingGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createSpeech()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createThermometer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createPulseMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 Io_interfacesFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createPrimitiveInputTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createZoomTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createPanTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createScrollTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createIntraDocumentNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowDirectionalNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowForwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowBackwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowStartNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowEndNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowRandomNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowCancelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDialogFlowLabelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createCommandInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createMenuInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createItemActivationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createItemRearrangementTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createExpandInformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createASRErrorCorrectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createTextSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createProactivityInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createExpanationExpansionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createRevertAdaptationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 InputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createAdaptationIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createLongListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createShortItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 OutputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createTangibleInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createPushButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createToggleButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createKeyboardInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createJoystick2DInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 TangibleFactory.eINSTANCE.createJoystick3DInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 JsonFactory.eINSTANCE.createJSONObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__REPRESENTATION,
				 JsonFactory.eINSTANCE.createJSONValue()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__HYPOTHESES,
				 IoFactory.eINSTANCE.createHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__HYPOTHESES,
				 IoFactory.eINSTANCE.createSpeechHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__HYPOTHESES,
				 IoFactory.eINSTANCE.createGestureHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.INPUT_ACT__HYPOTHESES,
				 IoFactory.eINSTANCE.createPointingHypothesis()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SiamEditPlugin.INSTANCE;
	}

}
