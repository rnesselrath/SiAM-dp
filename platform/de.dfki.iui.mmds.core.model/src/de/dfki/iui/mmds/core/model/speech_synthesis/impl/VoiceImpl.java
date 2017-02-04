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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getSentenceAndStructureClass <em>Sentence And Structure Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getAge <em>Age</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getOnvoicefailure <em>Onvoicefailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoiceImpl extends MinimalEObjectImpl.Container implements Voice {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final Object AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Object age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderDatatype GENDER_EDEFAULT = GenderDatatype.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderDatatype gender = GENDER_EDEFAULT;

	/**
	 * This is true if the Gender attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genderESet;

	/**
	 * The default value of the '{@link #getLanguages() <em>Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANGUAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected Object languages = LANGUAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnvoicefailure() <em>Onvoicefailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnvoicefailure()
	 * @generated
	 * @ordered
	 */
	protected static final String ONVOICEFAILURE_EDEFAULT = "priorityselect";

	/**
	 * The cached value of the '{@link #getOnvoicefailure() <em>Onvoicefailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnvoicefailure()
	 * @generated
	 * @ordered
	 */
	protected String onvoicefailure = ONVOICEFAILURE_EDEFAULT;

	/**
	 * This is true if the Onvoicefailure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onvoicefailureESet;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final Object ORDERING_EDEFAULT = SpeechSynthesisFactory.eINSTANCE.createFromString(SpeechSynthesisPackage.eINSTANCE.getOrderingDatatype(), "languages");

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected Object ordering = ORDERING_EDEFAULT;

	/**
	 * This is true if the Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderingESet;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Object REQUIRED_EDEFAULT = SpeechSynthesisFactory.eINSTANCE.createFromString(SpeechSynthesisPackage.eINSTANCE.getRequiredDatatype(), "languages");

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Object required = REQUIRED_EDEFAULT;

	/**
	 * This is true if the Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiredESet;

	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final Object VARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected Object variant = VARIANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.VOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.VOICE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSentenceAndStructureClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.VOICE__SENTENCE_AND_STRUCTURE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup() {
		return (FeatureMap)getSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.VOICE__AWS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAws() {
		return getAwsGroup().list(SpeechSynthesisPackage.Literals.VOICE__AWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStructGroup() {
		return (FeatureMap)getSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.VOICE__STRUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStruct() {
		return getStructGroup().list(SpeechSynthesisPackage.Literals.VOICE__STRUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup() {
		return getSentenceAndStructureClass().list(SpeechSynthesisPackage.Literals.VOICE__LOOKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Object newAge) {
		Object oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderDatatype getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GenderDatatype newGender) {
		GenderDatatype oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		boolean oldGenderESet = genderESet;
		genderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__GENDER, oldGender, gender, !oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGender() {
		GenderDatatype oldGender = gender;
		boolean oldGenderESet = genderESet;
		gender = GENDER_EDEFAULT;
		genderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.VOICE__GENDER, oldGender, GENDER_EDEFAULT, oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGender() {
		return genderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLanguages() {
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguages(Object newLanguages) {
		Object oldLanguages = languages;
		languages = newLanguages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__LANGUAGES, oldLanguages, languages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnvoicefailure() {
		return onvoicefailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnvoicefailure(String newOnvoicefailure) {
		String oldOnvoicefailure = onvoicefailure;
		onvoicefailure = newOnvoicefailure;
		boolean oldOnvoicefailureESet = onvoicefailureESet;
		onvoicefailureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__ONVOICEFAILURE, oldOnvoicefailure, onvoicefailure, !oldOnvoicefailureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnvoicefailure() {
		String oldOnvoicefailure = onvoicefailure;
		boolean oldOnvoicefailureESet = onvoicefailureESet;
		onvoicefailure = ONVOICEFAILURE_EDEFAULT;
		onvoicefailureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.VOICE__ONVOICEFAILURE, oldOnvoicefailure, ONVOICEFAILURE_EDEFAULT, oldOnvoicefailureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnvoicefailure() {
		return onvoicefailureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(Object newOrdering) {
		Object oldOrdering = ordering;
		ordering = newOrdering;
		boolean oldOrderingESet = orderingESet;
		orderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__ORDERING, oldOrdering, ordering, !oldOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrdering() {
		Object oldOrdering = ordering;
		boolean oldOrderingESet = orderingESet;
		ordering = ORDERING_EDEFAULT;
		orderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.VOICE__ORDERING, oldOrdering, ORDERING_EDEFAULT, oldOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrdering() {
		return orderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Object newRequired) {
		Object oldRequired = required;
		required = newRequired;
		boolean oldRequiredESet = requiredESet;
		requiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__REQUIRED, oldRequired, required, !oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequired() {
		Object oldRequired = required;
		boolean oldRequiredESet = requiredESet;
		required = REQUIRED_EDEFAULT;
		requiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.VOICE__REQUIRED, oldRequired, REQUIRED_EDEFAULT, oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequired() {
		return requiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Object newVariant) {
		Object oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.VOICE__VARIANT, oldVariant, variant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpeechSynthesisPackage.VOICE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__SENTENCE_AND_STRUCTURE_CLASS:
				return ((InternalEList<?>)getSentenceAndStructureClass()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__AWS_GROUP:
				return ((InternalEList<?>)getAwsGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__AWS:
				return ((InternalEList<?>)getAws()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__STRUCT_GROUP:
				return ((InternalEList<?>)getStructGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__LOOKUP:
				return ((InternalEList<?>)getLookup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpeechSynthesisPackage.VOICE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.VOICE__SENTENCE_AND_STRUCTURE_CLASS:
				if (coreType) return getSentenceAndStructureClass();
				return ((FeatureMap.Internal)getSentenceAndStructureClass()).getWrapper();
			case SpeechSynthesisPackage.VOICE__AWS_GROUP:
				if (coreType) return getAwsGroup();
				return ((FeatureMap.Internal)getAwsGroup()).getWrapper();
			case SpeechSynthesisPackage.VOICE__AWS:
				return getAws();
			case SpeechSynthesisPackage.VOICE__STRUCT_GROUP:
				if (coreType) return getStructGroup();
				return ((FeatureMap.Internal)getStructGroup()).getWrapper();
			case SpeechSynthesisPackage.VOICE__STRUCT:
				return getStruct();
			case SpeechSynthesisPackage.VOICE__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.VOICE__AGE:
				return getAge();
			case SpeechSynthesisPackage.VOICE__GENDER:
				return getGender();
			case SpeechSynthesisPackage.VOICE__LANGUAGES:
				return getLanguages();
			case SpeechSynthesisPackage.VOICE__NAME:
				return getName();
			case SpeechSynthesisPackage.VOICE__ONVOICEFAILURE:
				return getOnvoicefailure();
			case SpeechSynthesisPackage.VOICE__ORDERING:
				return getOrdering();
			case SpeechSynthesisPackage.VOICE__REQUIRED:
				return getRequired();
			case SpeechSynthesisPackage.VOICE__VARIANT:
				return getVariant();
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpeechSynthesisPackage.VOICE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__SENTENCE_AND_STRUCTURE_CLASS:
				((FeatureMap.Internal)getSentenceAndStructureClass()).set(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__AWS_GROUP:
				((FeatureMap.Internal)getAwsGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__STRUCT_GROUP:
				((FeatureMap.Internal)getStructGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__LOOKUP:
				getLookup().clear();
				getLookup().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.VOICE__AGE:
				setAge(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__GENDER:
				setGender((GenderDatatype)newValue);
				return;
			case SpeechSynthesisPackage.VOICE__LANGUAGES:
				setLanguages(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__NAME:
				setName(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__ONVOICEFAILURE:
				setOnvoicefailure((String)newValue);
				return;
			case SpeechSynthesisPackage.VOICE__ORDERING:
				setOrdering(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__REQUIRED:
				setRequired(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__VARIANT:
				setVariant(newValue);
				return;
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpeechSynthesisPackage.VOICE__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.VOICE__SENTENCE_AND_STRUCTURE_CLASS:
				getSentenceAndStructureClass().clear();
				return;
			case SpeechSynthesisPackage.VOICE__AWS_GROUP:
				getAwsGroup().clear();
				return;
			case SpeechSynthesisPackage.VOICE__STRUCT_GROUP:
				getStructGroup().clear();
				return;
			case SpeechSynthesisPackage.VOICE__LOOKUP:
				getLookup().clear();
				return;
			case SpeechSynthesisPackage.VOICE__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.VOICE__GENDER:
				unsetGender();
				return;
			case SpeechSynthesisPackage.VOICE__LANGUAGES:
				setLanguages(LANGUAGES_EDEFAULT);
				return;
			case SpeechSynthesisPackage.VOICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpeechSynthesisPackage.VOICE__ONVOICEFAILURE:
				unsetOnvoicefailure();
				return;
			case SpeechSynthesisPackage.VOICE__ORDERING:
				unsetOrdering();
				return;
			case SpeechSynthesisPackage.VOICE__REQUIRED:
				unsetRequired();
				return;
			case SpeechSynthesisPackage.VOICE__VARIANT:
				setVariant(VARIANT_EDEFAULT);
				return;
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpeechSynthesisPackage.VOICE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.VOICE__SENTENCE_AND_STRUCTURE_CLASS:
				return !getSentenceAndStructureClass().isEmpty();
			case SpeechSynthesisPackage.VOICE__AWS_GROUP:
				return !getAwsGroup().isEmpty();
			case SpeechSynthesisPackage.VOICE__AWS:
				return !getAws().isEmpty();
			case SpeechSynthesisPackage.VOICE__STRUCT_GROUP:
				return !getStructGroup().isEmpty();
			case SpeechSynthesisPackage.VOICE__STRUCT:
				return !getStruct().isEmpty();
			case SpeechSynthesisPackage.VOICE__LOOKUP:
				return !getLookup().isEmpty();
			case SpeechSynthesisPackage.VOICE__AGE:
				return AGE_EDEFAULT == null ? age != null : !AGE_EDEFAULT.equals(age);
			case SpeechSynthesisPackage.VOICE__GENDER:
				return isSetGender();
			case SpeechSynthesisPackage.VOICE__LANGUAGES:
				return LANGUAGES_EDEFAULT == null ? languages != null : !LANGUAGES_EDEFAULT.equals(languages);
			case SpeechSynthesisPackage.VOICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpeechSynthesisPackage.VOICE__ONVOICEFAILURE:
				return isSetOnvoicefailure();
			case SpeechSynthesisPackage.VOICE__ORDERING:
				return isSetOrdering();
			case SpeechSynthesisPackage.VOICE__REQUIRED:
				return isSetRequired();
			case SpeechSynthesisPackage.VOICE__VARIANT:
				return VARIANT_EDEFAULT == null ? variant != null : !VARIANT_EDEFAULT.equals(variant);
			case SpeechSynthesisPackage.VOICE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", age: ");
		result.append(age);
		result.append(", gender: ");
		if (genderESet) result.append(gender); else result.append("<unset>");
		result.append(", languages: ");
		result.append(languages);
		result.append(", name: ");
		result.append(name);
		result.append(", onvoicefailure: ");
		if (onvoicefailureESet) result.append(onvoicefailure); else result.append("<unset>");
		result.append(", ordering: ");
		if (orderingESet) result.append(ordering); else result.append("<unset>");
		result.append(", required: ");
		if (requiredESet) result.append(required); else result.append("<unset>");
		result.append(", variant: ");
		result.append(variant);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //VoiceImpl
