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
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.base.provider.BObjectItemProvider;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.Hypothesis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HypothesisItemProvider
	extends BObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypothesisItemProvider(AdapterFactory adapterFactory) {
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

			addConfidencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Confidence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfidencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hypothesis_confidence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hypothesis_confidence_feature", "_UI_Hypothesis_type"),
				 IoPackage.Literals.HYPOTHESIS__CONFIDENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION);
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
	 * This returns Hypothesis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hypothesis"));
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
		String label = ((Hypothesis)object).getBinding();
		return label == null || label.length() == 0 ?
			getString("_UI_Hypothesis_type") :
			getString("_UI_Hypothesis_type") + " " + label;
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

		switch (notification.getFeatureID(Hypothesis.class)) {
			case IoPackage.HYPOTHESIS__CONFIDENCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
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
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.HYPOTHESIS__COMMUNICATIVE_FUNCTION,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));
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
