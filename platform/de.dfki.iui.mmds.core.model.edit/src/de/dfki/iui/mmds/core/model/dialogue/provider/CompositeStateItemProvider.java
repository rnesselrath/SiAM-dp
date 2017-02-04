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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.dialogue.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;

/**
 * This is the item provider adapter for a
 * {@link de.dfki.iui.mmds.core.model.dialogue.CompositeState} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompositeStateItemProvider extends StateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeStateItemProvider(AdapterFactory adapterFactory) {
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

			addInitialStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial State feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CompositeState_initialState_feature"), getString("_UI_PropertyDescriptor_description", "_UI_CompositeState_initialState_feature", "_UI_CompositeState_type"),
				DialoguePackage.Literals.COMPOSITE_STATE__INITIAL_STATE, true, false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Iterator<?> iterator = choiceOfValues.iterator();
				while (iterator.hasNext()) {
					EObject eObject = (EObject) iterator.next();
					if (eObject != null && (object.equals(eObject) || !EcoreUtil.isAncestor((EObject) object, eObject))) {
						iterator.remove();
					}
				}
				return choiceOfValues;
			}
		});
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
			childrenFeatures.add(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES);
			childrenFeatures.add(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__HISTORY_STATE);
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
	 * This returns CompositeState.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeState"));
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
		String label = ((CompositeState)object).getDisplayName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeState_type") :
			getString("_UI_CompositeState_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeState.class)) {
			case DialoguePackage.COMPOSITE_STATE__STATES:
			case DialoguePackage.COMPOSITE_STATE__HISTORY_STATE:
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
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createWaitForEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createExecutableContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createStateChart()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createParallelState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__STATES,
				 DialogueFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(DialoguePackage.Literals.ABSTRACT_COMPOSITE_STATE__HISTORY_STATE,
				 DialogueFactory.eINSTANCE.createHistoryState()));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DialoguePackage.Literals.STATE__ON_ENTRY ||
			childFeature == DialoguePackage.Literals.STATE__ON_EXIT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
