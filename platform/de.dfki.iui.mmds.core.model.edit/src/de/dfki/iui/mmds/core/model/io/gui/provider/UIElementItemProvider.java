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
package de.dfki.iui.mmds.core.model.io.gui.provider;

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
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.task.TaskFactory;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.mmds.core.model.io.gui.UIElement} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UIElementItemProvider extends BObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UIElementItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addStyleNamesPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addTooltipPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_UIElement_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_id_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElement_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_enabled_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style Names feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStyleNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElement_styleNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_styleNames_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__STYLE_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElement_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_x_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElement_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_y_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tooltip feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTooltipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElement_tooltip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElement_tooltip_feature", "_UI_UIElement_type"),
				 GuiPackage.Literals.UI_ELEMENT__TOOLTIP,
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
			childrenFeatures.add(GuiPackage.Literals.UI_ELEMENT__LAYOUT);
			childrenFeatures.add(GuiPackage.Literals.UI_ELEMENT__SUPPORTED_EVENTS);
			childrenFeatures.add(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT);
			childrenFeatures.add(GuiPackage.Literals.UI_ELEMENT__ADAPTER);
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
		BString labelValue = ((UIElement)object).getId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_UIElement_type") :
			getString("_UI_UIElement_type") + " " + label;
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

		switch (notification.getFeatureID(UIElement.class)) {
			case GuiPackage.UI_ELEMENT__ID:
			case GuiPackage.UI_ELEMENT__ENABLED:
			case GuiPackage.UI_ELEMENT__STYLE_NAMES:
			case GuiPackage.UI_ELEMENT__X:
			case GuiPackage.UI_ELEMENT__Y:
			case GuiPackage.UI_ELEMENT__TOOLTIP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuiPackage.UI_ELEMENT__LAYOUT:
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
			case GuiPackage.UI_ELEMENT__ADAPTER:
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
				(GuiPackage.Literals.UI_ELEMENT__LAYOUT,
				 GuiFactory.eINSTANCE.createAbsoluteLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__LAYOUT,
				 GuiFactory.eINSTANCE.createFlowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SUPPORTED_EVENTS,
				 GuiFactory.eINSTANCE.createSupportedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createSession()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createNumberEntity()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createNothing()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createNamedEntity()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createCyberPhysicalEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createDigitalResource()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createPhysicalResource()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createLocatableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createServiceResource()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createMediaResource()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createPicture()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 BaseFactory.eINSTANCE.createDateTimeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 IoFactory.eINSTANCE.createServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 IoFactory.eINSTANCE.createSimpleService()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 IoFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__SEMANTIC_CONTENT,
				 TaskFactory.eINSTANCE.createTMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.UI_ELEMENT__ADAPTER,
				 GuiFactory.eINSTANCE.createElementAdapter()));
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
