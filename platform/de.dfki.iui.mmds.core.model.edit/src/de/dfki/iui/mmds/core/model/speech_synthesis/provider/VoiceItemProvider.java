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
import org.eclipse.emf.ecore.util.FeatureMap;
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
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VoiceItemProvider
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
	public VoiceItemProvider(AdapterFactory adapterFactory) {
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

			addAgePropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOnvoicefailurePropertyDescriptor(object);
			addOrderingPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addVariantPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_age_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_age_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__AGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_gender_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_gender_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__GENDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_languages_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__LANGUAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_name_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Onvoicefailure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnvoicefailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_onvoicefailure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_onvoicefailure_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__ONVOICEFAILURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_ordering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_ordering_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__ORDERING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_required_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Voice_variant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Voice_variant_feature", "_UI_Voice_type"),
				 SpeechSynthesisPackage.Literals.VOICE__VARIANT,
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
			childrenFeatures.add(SpeechSynthesisPackage.Literals.VOICE__MIXED);
			childrenFeatures.add(SpeechSynthesisPackage.Literals.VOICE__ANY_ATTRIBUTE);
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
	 * This returns Voice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Voice"));
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
		Object labelValue = ((Voice)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Voice_type") :
			getString("_UI_Voice_type") + " " + label;
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

		switch (notification.getFeatureID(Voice.class)) {
			case SpeechSynthesisPackage.VOICE__AGE:
			case SpeechSynthesisPackage.VOICE__GENDER:
			case SpeechSynthesisPackage.VOICE__LANGUAGES:
			case SpeechSynthesisPackage.VOICE__NAME:
			case SpeechSynthesisPackage.VOICE__ONVOICEFAILURE:
			case SpeechSynthesisPackage.VOICE__ORDERING:
			case SpeechSynthesisPackage.VOICE__REQUIRED:
			case SpeechSynthesisPackage.VOICE__VARIANT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpeechSynthesisPackage.VOICE__MIXED:
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
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
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__AUDIO,
					 SpeechSynthesisFactory.eINSTANCE.createAudio())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__BREAK,
					 SpeechSynthesisFactory.eINSTANCE.createBreak())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__EMPHASIS,
					 SpeechSynthesisFactory.eINSTANCE.createEmphasis())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__LANG,
					 SpeechSynthesisFactory.eINSTANCE.createLangType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__MARK,
					 SpeechSynthesisFactory.eINSTANCE.createMark1())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__PHONEME,
					 SpeechSynthesisFactory.eINSTANCE.createPhoneme())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__PROSODY,
					 SpeechSynthesisFactory.eINSTANCE.createProsody())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__SAY_AS,
					 SpeechSynthesisFactory.eINSTANCE.createSayAs())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__SUB,
					 SpeechSynthesisFactory.eINSTANCE.createSub())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__TOKEN,
					 SpeechSynthesisFactory.eINSTANCE.createTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__VOICE,
					 SpeechSynthesisFactory.eINSTANCE.createVoice())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__W,
					 SpeechSynthesisFactory.eINSTANCE.createTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__P,
					 SpeechSynthesisFactory.eINSTANCE.createParagraph())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__S,
					 SpeechSynthesisFactory.eINSTANCE.createSentence())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.VOICE__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.VOICE__LOOKUP,
					 SpeechSynthesisFactory.eINSTANCE.createLookupType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == SpeechSynthesisPackage.Literals.SSML__TOKEN ||
			childFeature == SpeechSynthesisPackage.Literals.SSML__W;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
