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
package de.dfki.iui.mmds.core.model.dialogue.provider;


import de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory;

import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;

import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom;

import de.dfki.iui.mmds.core.model.io.IoFactory;

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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceMatchConditionAtomItemProvider extends InstanceMatchConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceMatchConditionAtomItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceExprPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceMatchConditionAtom_instanceExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceMatchConditionAtom_instanceExpr_feature", "_UI_InstanceMatchConditionAtom_type"),
				 DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR,
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
			childrenFeatures.add(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE);
			childrenFeatures.add(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN);
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
	 * This returns InstanceMatchConditionAtom.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstanceMatchConditionAtom"));
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
		String label = ((InstanceMatchConditionAtom)object).getInstanceExpr();
		return label == null || label.length() == 0 ?
			getString("_UI_InstanceMatchConditionAtom_type") :
			getString("_UI_InstanceMatchConditionAtom_type") + " " + label;
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

		switch (notification.getFeatureID(InstanceMatchConditionAtom.class)) {
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE:
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM__PATTERN:
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
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createDialogue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createInstanceCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createInstanceAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createInstanceModifyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createElseIf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createElse()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createWaitForEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createExecutableContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createStateChart()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createParallelState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 DialogueFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createBObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createKnowledgeBase()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createKnowledgeBaseEntry()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createEntityResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createLocalizationResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createPhysicalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createGeoCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createCartesianCoordinate2D()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createCartesianCoordinate3D()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createPostalAddress()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createDigitalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.create(BasePackage.Literals.STRING_TO_BSTRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createSemanticContent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createAuditoryIcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createReferenceEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createPlainEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createEarconNote()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createCombinedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createInheritedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createInheritedEarconLayer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createTransformedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createSpearcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EarconsFactory.eINSTANCE.createSemanticon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createRuleset()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createUtterance()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createSemanticMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createPhraseMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Grammar_rulesFactory.eINSTANCE.createPhraseValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createDblClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createMouseDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createMouseMoveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createMouseOverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createMouseOutEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createMouseUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createKeyPressEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createKeyUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createKeyDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createBlurEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createFocusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createSelectTextEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiEventsFactory.eINSTANCE.createDialogEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGUIEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGUIApplication()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGUIUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createWindowUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createStyleSheetUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRemoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createAddUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createAddTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRemoveTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createMoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createSupportedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createElementAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createAdapterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createArrayAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGridItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGridHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createMargin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createAbsoluteLayout()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createFlowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createToolTip()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createSoftKeyboard()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createTabView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createLabeledTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRichTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createColorPickerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createLabelUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createListUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createComboboxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createListItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createSubmitButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCheckBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createRadioButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createImageButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createToggleButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGridContainerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createCanvasUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createFormUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createVBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createHBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createHtmlViewUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createTabItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createImageUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createDialogUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createProgressBarUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createJavaScriptUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GuiFactory.eINSTANCE.createGuiPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createAcousticEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createHandGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createBodyGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createEyeGaze()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createHeadGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createPointingGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createSpeech()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createVirtualCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createEyeData()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createWord()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createThermometer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createPulseMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createLampControl()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createVentilatorControl()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 Io_interfacesFactory.eINSTANCE.createSpeechFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createTCPServer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createTECSDirectService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createHtmlServlet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSipConnection()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createOSGIBundle()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createIOEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createCustomMessage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createUpdateDeviceMode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createDeviceStateChanged()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createInputAct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createOutputAct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSpeechHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createGestureHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createPointingHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createCancelPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createPresentationState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createUpdateGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSpeechRecognizerState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSpeechRecognizerMode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createSpeechSynthesisState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 IoFactory.eINSTANCE.createActiveGestures()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPEmptySlot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPLogicalFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPSlot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPValue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPBooleanRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPEnumRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPCharRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPStringRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPByteRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPShortRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPIntegerRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPLongRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPFloatRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPDoubleRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PatternFactory.eINSTANCE.createPDateRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PrimitiveTasksFactory.eINSTANCE.createPrimitiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 PrimitiveTasksFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createPrimitiveInputTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createZoomTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createPanTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createScrollTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createIntraDocumentNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowDirectionalNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowForwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowBackwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowStartNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowEndNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowRandomNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowCancelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDialogFlowLabelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createCommandInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createMenuInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createItemActivationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createItemRearrangementTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createExpandInformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createASRErrorCorrectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createTextSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createProactivityInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createExpanationExpansionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createRevertAdaptationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 InputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createPrimitiveOutputTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createMessageTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createDocumentPresentationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createCommandSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createMenuItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createProgressIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createAdaptationIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createManipulableImageTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createLongListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createShortItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 OutputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createSiamInternalServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createSiamInternalSpeechInputServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createInputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createOutputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createInputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createOutputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createMappingSubRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createJavaPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ProjectFactory.eINSTANCE.createTestMessageSet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createDeicticReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createKnowledgeBaseReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createGuiContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createSpatialReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createTemporalReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createCollectionReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 ReferencesFactory.eINSTANCE.createLingInfo()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createGrammar1()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createRuleref()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 GrammarFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSSMLSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createLangType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createLookupType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createMark()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createMark1()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createPhoneme()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createProsody()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSayAs()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSentence()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSpeak()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMeta()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createSub()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 SpeechSynthesisFactory.eINSTANCE.createVoice()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createTangibleInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createPushButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createToggleButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createKeyboardInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createJoystick2DInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TangibleFactory.eINSTANCE.createJoystick3DInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 JsonFactory.eINSTANCE.createJSONObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 JsonFactory.eINSTANCE.createJSONAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 JsonFactory.eINSTANCE.createJSONValue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 JsonFactory.eINSTANCE.createJSONParser()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTPlan()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTCompositeTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTDescription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTHistory()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 TaskFactory.eINSTANCE.createTHistoryEntry()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE,
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN,
				 PatternFactory.eINSTANCE.createPEmptySlot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN,
				 PatternFactory.eINSTANCE.createPLogicalFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN,
				 PatternFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN,
				 PatternFactory.eINSTANCE.createPValue()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__INSTANCE ||
			childFeature == DialoguePackage.Literals.INSTANCE_MATCH_CONDITION_ATOM__PATTERN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
