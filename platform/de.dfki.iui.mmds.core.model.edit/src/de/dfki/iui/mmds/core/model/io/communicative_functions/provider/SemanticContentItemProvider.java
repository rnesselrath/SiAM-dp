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
package de.dfki.iui.mmds.core.model.io.communicative_functions.provider;

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

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.provider.BObjectItemProvider;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.references.ReferencesFactory;
import de.dfki.iui.mmds.core.model.task.TaskFactory;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class SemanticContentItemProvider extends BObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SemanticContentItemProvider(AdapterFactory adapterFactory) {
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

			addResolvedPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addValidityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resolved feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResolvedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticContent_resolved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticContent_resolved_feature", "_UI_SemanticContent_type"),
				 Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__RESOLVED,
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
				 getString("_UI_SemanticContent_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticContent_id_feature", "_UI_SemanticContent_type"),
				 Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValidityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticContent_validity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticContent_validity_feature", "_UI_SemanticContent_type"),
				 Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__VALIDITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT);
			childrenFeatures.add(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE);
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
	 * This returns SemanticContent.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SemanticContent"));
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
		BString labelValue = ((SemanticContent)object).getId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SemanticContent_type") :
			getString("_UI_SemanticContent_type") + " " + label;
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

		switch (notification.getFeatureID(SemanticContent.class)) {
			case Communicative_functionsPackage.SEMANTIC_CONTENT__RESOLVED:
			case Communicative_functionsPackage.SEMANTIC_CONTENT__ID:
			case Communicative_functionsPackage.SEMANTIC_CONTENT__VALIDITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Communicative_functionsPackage.SEMANTIC_CONTENT__CONTENT:
			case Communicative_functionsPackage.SEMANTIC_CONTENT__REFERENCE:
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
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__CONTENT,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createDeicticReference()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createKnowledgeBaseReference()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createGuiContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createSpatialReference()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createTemporalReference()));

		newChildDescriptors.add
			(createChildParameter
				(Communicative_functionsPackage.Literals.SEMANTIC_CONTENT__REFERENCE,
				 ReferencesFactory.eINSTANCE.createCollectionReference()));
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
