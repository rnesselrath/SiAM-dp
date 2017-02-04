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
package de.dfki.iui.mmds.core.model.speech_synthesis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypeItemProvider
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
	public TokenTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addOnlangfailurePropertyDescriptor(object);
			addRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TokenType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TokenType_id_feature", "_UI_TokenType_type"),
				 SpeechSynthesisPackage.Literals.TOKEN_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TokenType_lang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TokenType_lang_feature", "_UI_TokenType_type"),
				 SpeechSynthesisPackage.Literals.TOKEN_TYPE__LANG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Onlangfailure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlangfailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TokenType_onlangfailure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TokenType_onlangfailure_feature", "_UI_TokenType_type"),
				 SpeechSynthesisPackage.Literals.TOKEN_TYPE__ONLANGFAILURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TokenType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TokenType_role_feature", "_UI_TokenType_type"),
				 SpeechSynthesisPackage.Literals.TOKEN_TYPE__ROLE,
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
			childrenFeatures.add(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED);
			childrenFeatures.add(SpeechSynthesisPackage.Literals.TOKEN_TYPE__ANY_ATTRIBUTE);
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
	 * This returns TokenType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TokenType"));
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
		String label = ((TokenType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TokenType_type") :
			getString("_UI_TokenType_type") + " " + label;
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

		switch (notification.getFeatureID(TokenType.class)) {
			case SpeechSynthesisPackage.TOKEN_TYPE__ID:
			case SpeechSynthesisPackage.TOKEN_TYPE__LANG:
			case SpeechSynthesisPackage.TOKEN_TYPE__ONLANGFAILURE:
			case SpeechSynthesisPackage.TOKEN_TYPE__ROLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpeechSynthesisPackage.TOKEN_TYPE__MIXED:
			case SpeechSynthesisPackage.TOKEN_TYPE__ANY_ATTRIBUTE:
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
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__AUDIO,
					 SpeechSynthesisFactory.eINSTANCE.createAudio())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__BREAK,
					 SpeechSynthesisFactory.eINSTANCE.createBreak())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__EMPHASIS,
					 SpeechSynthesisFactory.eINSTANCE.createEmphasis())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MARK,
					 SpeechSynthesisFactory.eINSTANCE.createMark1())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__PHONEME,
					 SpeechSynthesisFactory.eINSTANCE.createPhoneme())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__PROSODY,
					 SpeechSynthesisFactory.eINSTANCE.createProsody())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__SAY_AS,
					 SpeechSynthesisFactory.eINSTANCE.createSayAs())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__SUB,
					 SpeechSynthesisFactory.eINSTANCE.createSub())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.TOKEN_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.TOKEN_TYPE__VOICE,
					 SpeechSynthesisFactory.eINSTANCE.createVoice())));
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
