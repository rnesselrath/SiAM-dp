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
package de.dfki.iui.mmds.core.model.project.provider;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory;
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

import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsFactory;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory;
import de.dfki.iui.mmds.core.model.json.JsonFactory;
import de.dfki.iui.mmds.core.model.pattern.PatternFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputFactory;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory;
import de.dfki.iui.mmds.core.model.project.MappingSubRule;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.task.TaskFactory;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.mmds.core.model.project.MappingSubRule} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MappingSubRuleItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappingSubRuleItemProvider(AdapterFactory adapterFactory) {
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
			addActivePropertyDescriptor(object);
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
				 getString("_UI_MappingRule_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_description_feature", "_UI_MappingRule_type"),
				 ProjectPackage.Literals.MAPPING_RULE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_active_feature", "_UI_MappingRule_type"),
				 ProjectPackage.Literals.MAPPING_RULE__ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ProjectPackage.Literals.MAPPING_RULE__CONDITION);
			childrenFeatures.add(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET);
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
	 * This returns MappingSubRule.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingSubRule"));
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
		String label = ((MappingSubRule)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingSubRule_type") :
			getString("_UI_MappingSubRule_type") + " " + label;
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

		switch (notification.getFeatureID(MappingSubRule.class)) {
			case ProjectPackage.MAPPING_SUB_RULE__DESCRIPTION:
			case ProjectPackage.MAPPING_SUB_RULE__ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProjectPackage.MAPPING_SUB_RULE__CONDITION:
			case ProjectPackage.MAPPING_SUB_RULE__TARGET:
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
				(ProjectPackage.Literals.MAPPING_RULE__CONDITION,
				 PatternFactory.eINSTANCE.createPEmptySlot()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_RULE__CONDITION,
				 PatternFactory.eINSTANCE.createPLogicalFormula()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_RULE__CONDITION,
				 PatternFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_RULE__CONDITION,
				 PatternFactory.eINSTANCE.createPValue()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createBObject()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createSemanticContent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createReferenceEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createPlainEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createEarconNote()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createCombinedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createInheritedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createInheritedEarconLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 EarconsFactory.eINSTANCE.createTransformedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createDblClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createMouseDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createMouseMoveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createMouseOverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createMouseOutEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createMouseUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createKeyPressEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createKeyUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createKeyDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createBlurEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createFocusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createSelectTextEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiEventsFactory.eINSTANCE.createDialogEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGUIEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGUIApplication()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGUIUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createWindowUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createStyleSheetUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRemoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createAddUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createAddTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRemoveTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createTabView()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createLabeledTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRichTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createColorPickerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createLabelUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createListUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createComboboxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createListItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createSubmitButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCheckBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createRadioButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createImageButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createToggleButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGridContainerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createCanvasUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createFormUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createVBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createHBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createHtmlViewUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createTabItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createImageUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createDialogUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createProgressBarUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 GuiFactory.eINSTANCE.createGuiPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createAcousticEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createHandGesture()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createBodyGesture()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createEyeGaze()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createHeadGesture()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createPointingGesture()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createSpeech()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createVirtualCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createEyeData()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createWord()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createThermometer()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createPulseMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createLampControl()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createVentilatorControl()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 Io_interfacesFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createIOEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createCustomMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createUpdateDeviceMode()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createDeviceStateChanged()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createInputAct()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createOutputAct()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createSpeechHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createGestureHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createPointingHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createCancelPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createPresentationState()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createUpdateGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createSpeechRecognizerState()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createSpeechRecognizerMode()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createSpeechSynthesisState()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 IoFactory.eINSTANCE.createActiveGestures()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createPrimitiveInputTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createZoomTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createPanTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createScrollTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createIntraDocumentNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowDirectionalNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowForwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowBackwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowStartNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowEndNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowRandomNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowCancelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDialogFlowLabelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createCommandInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createMenuInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createItemActivationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createItemRearrangementTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createExpandInformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createASRErrorCorrectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createTextSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createProactivityInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createExpanationExpansionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createRevertAdaptationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 InputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createPrimitiveOutputTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createMessageTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createDocumentPresentationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createCommandSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createMenuItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createProgressIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createAdaptationIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createManipulableImageTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createLongListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createShortItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 OutputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 SpeechSynthesisFactory.eINSTANCE.createSSMLSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createTangibleInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createPushButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createToggleButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createKeyboardInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createJoystick2DInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TangibleFactory.eINSTANCE.createJoystick3DInput()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 JsonFactory.eINSTANCE.createJSONObject()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 JsonFactory.eINSTANCE.createJSONValue()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(ProjectPackage.Literals.MAPPING_SUB_RULE__TARGET,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));
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
