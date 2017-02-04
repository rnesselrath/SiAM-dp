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

import de.dfki.iui.mmds.core.model.base.provider.BObjectItemProvider;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddUIElementItemProvider
	extends BObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUIElementItemProvider(AdapterFactory adapterFactory) {
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

			addParentIdPropertyDescriptor(object);
			addNewElementRefPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUIElement_parentId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUIElement_parentId_feature", "_UI_AddUIElement_type"),
				 GuiPackage.Literals.ADD_UI_ELEMENT__PARENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Element Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewElementRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUIElement_newElementRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUIElement_newElementRef_feature", "_UI_AddUIElement_type"),
				 GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUIElement_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUIElement_position_feature", "_UI_AddUIElement_type"),
				 GuiPackage.Literals.ADD_UI_ELEMENT__POSITION,
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
			childrenFeatures.add(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT);
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
	 * This returns AddUIElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddUIElement"));
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
		String label = ((AddUIElement)object).getBinding();
		return label == null || label.length() == 0 ?
			getString("_UI_AddUIElement_type") :
			getString("_UI_AddUIElement_type") + " " + label;
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

		switch (notification.getFeatureID(AddUIElement.class)) {
			case GuiPackage.ADD_UI_ELEMENT__PARENT_ID:
			case GuiPackage.ADD_UI_ELEMENT__POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
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
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createGridItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createGridHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.ADD_UI_ELEMENT__NEW_ELEMENT,
				 GuiFactory.eINSTANCE.createTabView()));
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
