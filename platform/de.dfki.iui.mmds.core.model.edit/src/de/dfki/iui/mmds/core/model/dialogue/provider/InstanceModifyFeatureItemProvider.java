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

import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.dialogue.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

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

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceModifyFeatureItemProvider 
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
	public InstanceModifyFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addToPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addExprPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addOperationTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceModifyFeature_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceModifyFeature_to_feature", "_UI_InstanceModifyFeature_type"),
				 DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null) {
			
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				ArrayList<String> varNames = new ArrayList<String>();
				varNames.add(null);
				InstanceModifyFeature instModFeat = (InstanceModifyFeature) object;
				EObject parent = instModFeat.eContainer();
				while (parent != null) {
					if (parent instanceof AbstractState) {
						for (Variable var : ((AbstractState) parent).getVariables()) {
							varNames.add(var.getName());
						}
					}
					parent = parent.eContainer();
				}
				return varNames;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceModifyFeature_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceModifyFeature_feature_feature", "_UI_InstanceModifyFeature_type"),
				 DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceModifyFeature_expr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceModifyFeature_expr_feature", "_UI_InstanceModifyFeature_type"),
				 DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceModifyFeature_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceModifyFeature_type_feature", "_UI_InstanceModifyFeature_type"),
				 DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceModifyFeature_operationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceModifyFeature_operationType_feature", "_UI_InstanceModifyFeature_type"),
				 DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OPERATION_TYPE,
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
			childrenFeatures.add(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT);
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
	 * This returns InstanceModifyFeature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstanceModifyFeature"));
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
		String label = ((InstanceModifyFeature)object).getTo();
		return label == null || label.length() == 0 ?
			getString("_UI_InstanceModifyFeature_type") :
			getString("_UI_InstanceModifyFeature_type") + " " + label;
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

		switch (notification.getFeatureID(InstanceModifyFeature.class)) {
			case DialoguePackage.INSTANCE_MODIFY_FEATURE__TO:
			case DialoguePackage.INSTANCE_MODIFY_FEATURE__EXPR:
			case DialoguePackage.INSTANCE_MODIFY_FEATURE__OPERATION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DialoguePackage.INSTANCE_MODIFY_FEATURE__OBJECT:
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
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createDialogue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createInstanceCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createInstanceMatchConditionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createInstanceAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createInstanceModifyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createElseIf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createElse()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createWaitForEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createExecutableContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createStateChart()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createParallelState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 DialogueFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createBObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createKnowledgeBase()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createKnowledgeBaseEntry()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createEntityResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createLocalizationResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createPhysicalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createGeoCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createCartesianCoordinate2D()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createCartesianCoordinate3D()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createPostalAddress()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createDigitalLocation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.create(BasePackage.Literals.STRING_TO_BSTRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createSemanticContent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createSetQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeCheckQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInform()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createConfirm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createDisconfirm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAddressRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAddressOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAcceptOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createDeclineOffer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createSuggestion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInitialGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createReturnGreeting()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInitialSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createReturnSelfIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createApology()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createApologyDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createThanking()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createThankingDownplay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInitialGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createReturnGoodbye()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createOpening()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPreclosing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTopicIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTopicShiftAnnouncement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTopicShift()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createCompletion()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createCorrectMisspeaking()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createErrorSignaling()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createRetraction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createSelfCorrection()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createContactCheck()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createContactIndication()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createStalling()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPausing()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnAccept()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnGrab()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnTake()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnKeep()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createTurnRelease()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createAttentionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPerceptionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createInterpretationFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createEvaluationFeedackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createExecutionFeedbackElicitation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAlloFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositivePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createPositiveExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeExecutionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeEvaluationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeInterpretationAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativePerceptionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Communicative_functionsFactory.eINSTANCE.createNegativeAttentionAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createAuditoryIcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createReferenceEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createPlainEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createEarconNote()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createCombinedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createInheritedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createInheritedEarconLayer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createTransformedEarcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createSpearcon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EarconsFactory.eINSTANCE.createSemanticon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createRuleset()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createUtterance()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createSemanticMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createPhraseMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Grammar_rulesFactory.eINSTANCE.createPhraseValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createDblClickEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createMouseDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createMouseMoveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createMouseOverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createMouseOutEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createMouseUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createKeyPressEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createKeyUpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createKeyDownEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createBlurEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createFocusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createSelectTextEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiEventsFactory.eINSTANCE.createDialogEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGUIEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGUIApplication()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGUIUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createWindowUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createStyleSheetUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRemoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createAddUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createAddTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRemoveTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createMoveUIElement()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createSupportedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createElementAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createAdapterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createArrayAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGridItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGridHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createMargin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createAbsoluteLayout()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createFlowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createToolTip()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createSoftKeyboard()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createTabView()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createLabeledTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRichTextInputUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createColorPickerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createLabelUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createListUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createComboboxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createListItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createSubmitButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCheckBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createRadioButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createImageButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createToggleButtonUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGridContainerUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createCanvasUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createFormUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createVBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createHBoxUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createHtmlViewUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createTabItemUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createImageUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createDialogUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createProgressBarUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createJavaScriptUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GuiFactory.eINSTANCE.createGuiPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createAcousticEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createHandGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createBodyGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createEyeGaze()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createHeadGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createPointingGesture()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createSpeech()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createVirtualCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createEyeData()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createWord()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createThermometer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createPulseMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createLampControl()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createVentilatorControl()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 Io_interfacesFactory.eINSTANCE.createSpeechFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createTCPServer()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createTECSDirectService()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createHtmlServlet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSipConnection()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createOSGIBundle()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createIOEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createCustomMessage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createUpdateDeviceMode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createDeviceStateChanged()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createInputAct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createOutputAct()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSpeechHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createGestureHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createPointingHypothesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createCustomFormat()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createCancelPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createPresentationState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createUpdateGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSpeechRecognizerState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSpeechRecognizerMode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createSpeechSynthesisState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 IoFactory.eINSTANCE.createActiveGestures()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPEmptySlot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPLogicalFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPSlot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPValue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPBooleanRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPEnumRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPCharRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPStringRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPByteRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPShortRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPIntegerRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPLongRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPFloatRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPDoubleRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PatternFactory.eINSTANCE.createPDateRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PrimitiveTasksFactory.eINSTANCE.createPrimitiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 PrimitiveTasksFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createPrimitiveInputTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createZoomTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createPanTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createScrollTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createIntraDocumentNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowDirectionalNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowForwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowBackwardNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowStartNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowEndNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowRandomNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowCancelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDialogFlowLabelNavigationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createCommandInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createMenuInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createItemActivationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createItemRearrangementTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createExpandInformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createASRErrorCorrectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createTextSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createProactivityInvocationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createExpanationExpansionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createRevertAdaptationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 InputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createPrimitiveOutputTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createMessageTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createDocumentPresentationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createCommandSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createMenuItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createProgressIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createAdaptationIndicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createManipulableImageTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createFreeTextEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createDateTimeEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createBoundedIntegerNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createDecimalNumberEntryTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createYesNoSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createTriStateSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createLongListItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createShortItemSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createListItemMultiSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createMessageDismissalTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 OutputFactory.eINSTANCE.createObjectSelectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createSiamInternalServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createSiamInternalSpeechInputServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createInputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createOutputMappingRules()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createInputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createOutputMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createMappingSubRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createJavaPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ProjectFactory.eINSTANCE.createTestMessageSet()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createDeicticReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createKnowledgeBaseReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createGuiContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createSpatialReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createTemporalReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createCollectionReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 ReferencesFactory.eINSTANCE.createLingInfo()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createGrammar()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createGrammar1()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createRuleref()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 GrammarFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSSMLSpeechSynthesis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createLangType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createLookupType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createMark()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createMark1()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createPhoneme()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createProsody()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSayAs()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSentence()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSpeak()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlLexicon()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMeta()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSsmlMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createSub()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 SpeechSynthesisFactory.eINSTANCE.createVoice()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createTangibleInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createPushButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createToggleButtonInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createKeyboardInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createTurnDialFiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteDiscreteInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createTurnDialInfiniteContinuousInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createJoystick2DInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TangibleFactory.eINSTANCE.createJoystick3DInput()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 JsonFactory.eINSTANCE.createJSONObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 JsonFactory.eINSTANCE.createJSONAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 JsonFactory.eINSTANCE.createJSONValue()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 JsonFactory.eINSTANCE.createJSONParser()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTPlan()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTCompositeTask()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTDescription()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTHistory()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 TaskFactory.eINSTANCE.createTHistoryEntry()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BackchannelFactory.eINSTANCE.createOkayPositiveAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 BackchannelFactory.eINSTANCE.createUhmNegativeAutoFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.INSTANCE_MODIFY_FEATURE__OBJECT,
				 EcoreFactory.eINSTANCE.createETypeParameter()));
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
