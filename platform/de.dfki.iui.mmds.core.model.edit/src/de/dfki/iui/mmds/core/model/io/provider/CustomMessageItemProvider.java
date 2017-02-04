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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.provider.BObjectItemProvider;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.io.CustomMessage;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsFactory;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory;
import de.dfki.iui.mmds.core.model.json.JsonFactory;
import de.dfki.iui.mmds.core.model.pattern.PatternFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTasksFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory;
import de.dfki.iui.mmds.core.model.project.ProjectFactory;
import de.dfki.iui.mmds.core.model.references.ReferencesFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.task.TaskFactory;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.mmds.core.model.io.CustomMessage} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CustomMessageItemProvider extends BObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CustomMessageItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addSessionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT);
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
	 * This returns CustomMessage.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomMessage"));
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
		BString labelValue = ((CustomMessage)object).getId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomMessage_type") :
			getString("_UI_CustomMessage_type") + " " + label;
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

		switch (notification.getFeatureID(CustomMessage.class)) {
			case IoPackage.CUSTOM_MESSAGE__DESCRIPTION:
			case IoPackage.CUSTOM_MESSAGE__ID:
			case IoPackage.CUSTOM_MESSAGE__TIMESTAMP:
			case IoPackage.CUSTOM_MESSAGE__SESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoPackage.CUSTOM_MESSAGE__CONTENT:
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
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createTCPServer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createTECSDirectService()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createHtmlServlet()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSipConnection()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createOSGIBundle()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createIOEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createCustomMessage()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createUpdateDeviceMode()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createDeviceStateChanged()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createInputAct()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createOutputAct()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSpeechHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createGestureHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createPointingHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createCancelPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createPresentationState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createUpdateGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSpeechRecognizerState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSpeechRecognizerMode()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createSpeechSynthesisState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 IoFactory.eINSTANCE.createActiveGestures()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createBObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createKnowledgeBase()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createKnowledgeBaseEntry()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createEntityResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createLocalizationResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createPhysicalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createGeoCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createCartesianCoordinate2D()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createCartesianCoordinate3D()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createPostalAddress()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createDigitalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.create(BasePackage.Literals.STRING_TO_BSTRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createSemanticContent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createDialogue()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createInstanceCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionFormula()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createInstanceAssign()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createInstanceModifyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createElseIf()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createElse()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createWaitForEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createExecutableContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createStateChart()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createParallelState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 DialogueFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createAuditoryIcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createReferenceEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createPlainEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createEarconNote()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createCombinedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createInheritedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createInheritedEarconLayer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createTransformedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createSpearcon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EarconsFactory.eINSTANCE.createSemanticon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createRuleset()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createUtterance()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createSemanticMapping()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createPhraseMapping()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Grammar_rulesFactory.eINSTANCE.createPhraseValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createDblClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createMouseDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createMouseMoveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createMouseOverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createMouseOutEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createMouseUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createKeyPressEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createKeyUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createKeyDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createBlurEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createFocusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createSelectTextEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiEventsFactory.eINSTANCE.createDialogEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGUIEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGUIApplication()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGUIUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createWindowUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createStyleSheetUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRemoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createAddUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createAddTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRemoveTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createSupportedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createElementAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createAdapterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createArrayAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGridItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGridHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createMargin()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createAbsoluteLayout()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createFlowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createToolTip()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createSoftKeyboard()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createTabView()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createLabeledTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRichTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createColorPickerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createLabelUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createListUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createComboboxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createListItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createSubmitButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCheckBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createRadioButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createImageButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createToggleButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGridContainerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createCanvasUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createFormUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createVBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createHBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createHtmlViewUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createTabItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createImageUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createDialogUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createProgressBarUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GuiFactory.eINSTANCE.createGuiPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createAcousticEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createHandGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createBodyGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createEyeGaze()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createHeadGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createPointingGesture()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createSpeech()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createVirtualCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createEyeData()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createWord()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createThermometer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createPulseMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createLampControl()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createVentilatorControl()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 Io_interfacesFactory.eINSTANCE.createSpeechFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPEmptySlot()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPLogicalFormula()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPSlot()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPValue()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPBooleanRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPEnumRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPCharRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPStringRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPByteRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPShortRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPIntegerRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPLongRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPFloatRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPDoubleRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PatternFactory.eINSTANCE.createPDateRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PrimitiveTasksFactory.eINSTANCE.createPrimitiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 PrimitiveTasksFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createPrimitiveInputTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createZoomTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createPanTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createScrollTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createIntraDocumentNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowDirectionalNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowForwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowBackwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowStartNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowEndNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowRandomNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowCancelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDialogFlowLabelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createCommandInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createMenuInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createItemActivationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createItemRearrangementTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createExpandInformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createASRErrorCorrectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createTextSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createProactivityInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createExpanationExpansionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createRevertAdaptationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 InputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createPrimitiveOutputTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createMessageTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createDocumentPresentationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createCommandSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createMenuItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createProgressIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createAdaptationIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createManipulableImageTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createLongListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createShortItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 OutputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createSiamInternalServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createSiamInternalSpeechInputServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createInputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createOutputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createInputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createOutputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createMappingSubRule()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createJavaPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ProjectFactory.eINSTANCE.createTestMessageSet()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createDeicticReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createKnowledgeBaseReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createGuiContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createSpatialReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createTemporalReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createCollectionReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 ReferencesFactory.eINSTANCE.createLingInfo()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createGrammar1()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createRuleref()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 GrammarFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSSMLSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createLangType()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createLookupType()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createMark()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createMark1()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createPhoneme()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createProsody()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSayAs()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSentence()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSpeak()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMeta()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createSub()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 SpeechSynthesisFactory.eINSTANCE.createVoice()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createTangibleInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createPushButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createToggleButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createKeyboardInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createJoystick2DInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TangibleFactory.eINSTANCE.createJoystick3DInput()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 JsonFactory.eINSTANCE.createJSONObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 JsonFactory.eINSTANCE.createJSONAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 JsonFactory.eINSTANCE.createJSONValue()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 JsonFactory.eINSTANCE.createJSONParser()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTPlan()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTCompositeTask()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTCondition()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 TaskFactory.eINSTANCE.createTDescription()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.CUSTOM_MESSAGE__CONTENT,
				 EcoreFactory.eINSTANCE.createETypeParameter()));
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
