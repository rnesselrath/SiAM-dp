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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.Transition;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.mmds.core.model.dialogue.Transition} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransitionItemProvider extends DialogueDesignerElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_target_feature", "_UI_Transition_type"),
				 DialoguePackage.Literals.TRANSITION__TARGET,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(DialoguePackage.Literals.TRANSITION__EVENT);
			childrenFeatures.add(DialoguePackage.Literals.TRANSITION__ON_TRIGGER);
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
	 * This returns Transition.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
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
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String id = ((Transition) object).getDisplayName();
		TargetState targetState = ((Transition) object).getTarget();
		DialogueDesignerElement dde = (DialogueDesignerElement) (targetState instanceof DialogueDesignerElement ? targetState : null);
		String target;
		if (dde == null) {
			target = "null";
		} else if (dde.getDisplayName() != null) {
			target = dde.getDisplayName();
		} else {
			target = dde.getId();
		}

		return String.format("%s (%s) --> %s", getString("_UI_Transition_type"), id, target);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transition.class)) {
		case DialoguePackage.TRANSITION__EVENT:
		case DialoguePackage.TRANSITION__ON_TRIGGER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		case DialoguePackage.TRANSITION__TARGET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(DialoguePackage.Literals.TRANSITION__EVENT,
				 DialogueFactory.eINSTANCE.createCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__EVENT,
				 DialogueFactory.eINSTANCE.createInstanceCondEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createInstanceAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createInstanceModifyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.TRANSITION__ON_TRIGGER,
				 DialogueFactory.eINSTANCE.createIf()));
	}

}
