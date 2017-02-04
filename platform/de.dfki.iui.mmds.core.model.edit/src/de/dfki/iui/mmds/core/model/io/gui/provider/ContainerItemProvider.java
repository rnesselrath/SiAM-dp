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


import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.gui.Container;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.gui.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider
	extends UIElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GuiPackage.Literals.ABSTRACT_CONTAINER__ARRAY_ADAPTER);
			childrenFeatures.add(GuiPackage.Literals.CONTAINER__ELEMENTS);
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
		BString labelValue = ((Container)object).getId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
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

		switch (notification.getFeatureID(Container.class)) {
			case GuiPackage.CONTAINER__ARRAY_ADAPTER:
			case GuiPackage.CONTAINER__ELEMENTS:
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
				(GuiPackage.Literals.ABSTRACT_CONTAINER__ARRAY_ADAPTER,
				 GuiFactory.eINSTANCE.createArrayAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createVBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createHBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createGridRow()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createGridItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createGridHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createHTMLView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createDisplayContextView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createLabeledTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createRichTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createSubmitButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createImageButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createButtonBar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createColorPicker()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createImageGallery()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createMediaPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createNumericStepper()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createScrollbar()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createCalendarView()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createDialogBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createCustomDialog()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createFileChooser()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(GuiPackage.Literals.CONTAINER__ELEMENTS,
				 GuiFactory.eINSTANCE.createTabView()));
	}

}
