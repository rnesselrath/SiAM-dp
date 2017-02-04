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
import java.util.List;
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
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prosody</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getSentenceAndStructureClass <em>Sentence And Structure Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getContour <em>Contour</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProsodyImpl extends MinimalEObjectImpl.Container implements Prosody {
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
	 * The default value of the '{@link #getContour() <em>Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContour()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CONTOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContour() <em>Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContour()
	 * @generated
	 * @ordered
	 */
	protected List<String> contour = CONTOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final Object PITCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected Object pitch = PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Object range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Object rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final Object VOLUME_EDEFAULT = SpeechSynthesisFactory.eINSTANCE.createFromString(SpeechSynthesisPackage.eINSTANCE.getVolumeDatatype(), "+0.0dB");

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Object volume = VOLUME_EDEFAULT;

	/**
	 * This is true if the Volume attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeESet;

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
	protected ProsodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.PROSODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.PROSODY__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSentenceAndStructureClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.PROSODY__SENTENCE_AND_STRUCTURE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup() {
		return (FeatureMap)getSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.PROSODY__AWS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAws() {
		return getAwsGroup().list(SpeechSynthesisPackage.Literals.PROSODY__AWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStructGroup() {
		return (FeatureMap)getSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.PROSODY__STRUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStruct() {
		return getStructGroup().list(SpeechSynthesisPackage.Literals.PROSODY__STRUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup() {
		return getSentenceAndStructureClass().list(SpeechSynthesisPackage.Literals.PROSODY__LOOKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getContour() {
		return contour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContour(List<String> newContour) {
		List<String> oldContour = contour;
		contour = newContour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__CONTOUR, oldContour, contour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(Object newPitch) {
		Object oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Object newRange) {
		Object oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Object newRate) {
		Object oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(Object newVolume) {
		Object oldVolume = volume;
		volume = newVolume;
		boolean oldVolumeESet = volumeESet;
		volumeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.PROSODY__VOLUME, oldVolume, volume, !oldVolumeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolume() {
		Object oldVolume = volume;
		boolean oldVolumeESet = volumeESet;
		volume = VOLUME_EDEFAULT;
		volumeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.PROSODY__VOLUME, oldVolume, VOLUME_EDEFAULT, oldVolumeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolume() {
		return volumeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE);
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
			case SpeechSynthesisPackage.PROSODY__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__SENTENCE_AND_STRUCTURE_CLASS:
				return ((InternalEList<?>)getSentenceAndStructureClass()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__AWS_GROUP:
				return ((InternalEList<?>)getAwsGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__AWS:
				return ((InternalEList<?>)getAws()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__STRUCT_GROUP:
				return ((InternalEList<?>)getStructGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__LOOKUP:
				return ((InternalEList<?>)getLookup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.PROSODY__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.PROSODY__SENTENCE_AND_STRUCTURE_CLASS:
				if (coreType) return getSentenceAndStructureClass();
				return ((FeatureMap.Internal)getSentenceAndStructureClass()).getWrapper();
			case SpeechSynthesisPackage.PROSODY__AWS_GROUP:
				if (coreType) return getAwsGroup();
				return ((FeatureMap.Internal)getAwsGroup()).getWrapper();
			case SpeechSynthesisPackage.PROSODY__AWS:
				return getAws();
			case SpeechSynthesisPackage.PROSODY__STRUCT_GROUP:
				if (coreType) return getStructGroup();
				return ((FeatureMap.Internal)getStructGroup()).getWrapper();
			case SpeechSynthesisPackage.PROSODY__STRUCT:
				return getStruct();
			case SpeechSynthesisPackage.PROSODY__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.PROSODY__CONTOUR:
				return getContour();
			case SpeechSynthesisPackage.PROSODY__DURATION:
				return getDuration();
			case SpeechSynthesisPackage.PROSODY__PITCH:
				return getPitch();
			case SpeechSynthesisPackage.PROSODY__RANGE:
				return getRange();
			case SpeechSynthesisPackage.PROSODY__RATE:
				return getRate();
			case SpeechSynthesisPackage.PROSODY__VOLUME:
				return getVolume();
			case SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.PROSODY__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__SENTENCE_AND_STRUCTURE_CLASS:
				((FeatureMap.Internal)getSentenceAndStructureClass()).set(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__AWS_GROUP:
				((FeatureMap.Internal)getAwsGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__STRUCT_GROUP:
				((FeatureMap.Internal)getStructGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__LOOKUP:
				getLookup().clear();
				getLookup().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__CONTOUR:
				setContour((List<String>)newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__DURATION:
				setDuration((String)newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__PITCH:
				setPitch(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__RANGE:
				setRange(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__RATE:
				setRate(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__VOLUME:
				setVolume(newValue);
				return;
			case SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.PROSODY__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.PROSODY__SENTENCE_AND_STRUCTURE_CLASS:
				getSentenceAndStructureClass().clear();
				return;
			case SpeechSynthesisPackage.PROSODY__AWS_GROUP:
				getAwsGroup().clear();
				return;
			case SpeechSynthesisPackage.PROSODY__STRUCT_GROUP:
				getStructGroup().clear();
				return;
			case SpeechSynthesisPackage.PROSODY__LOOKUP:
				getLookup().clear();
				return;
			case SpeechSynthesisPackage.PROSODY__CONTOUR:
				setContour(CONTOUR_EDEFAULT);
				return;
			case SpeechSynthesisPackage.PROSODY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case SpeechSynthesisPackage.PROSODY__PITCH:
				setPitch(PITCH_EDEFAULT);
				return;
			case SpeechSynthesisPackage.PROSODY__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.PROSODY__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.PROSODY__VOLUME:
				unsetVolume();
				return;
			case SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.PROSODY__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.PROSODY__SENTENCE_AND_STRUCTURE_CLASS:
				return !getSentenceAndStructureClass().isEmpty();
			case SpeechSynthesisPackage.PROSODY__AWS_GROUP:
				return !getAwsGroup().isEmpty();
			case SpeechSynthesisPackage.PROSODY__AWS:
				return !getAws().isEmpty();
			case SpeechSynthesisPackage.PROSODY__STRUCT_GROUP:
				return !getStructGroup().isEmpty();
			case SpeechSynthesisPackage.PROSODY__STRUCT:
				return !getStruct().isEmpty();
			case SpeechSynthesisPackage.PROSODY__LOOKUP:
				return !getLookup().isEmpty();
			case SpeechSynthesisPackage.PROSODY__CONTOUR:
				return CONTOUR_EDEFAULT == null ? contour != null : !CONTOUR_EDEFAULT.equals(contour);
			case SpeechSynthesisPackage.PROSODY__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case SpeechSynthesisPackage.PROSODY__PITCH:
				return PITCH_EDEFAULT == null ? pitch != null : !PITCH_EDEFAULT.equals(pitch);
			case SpeechSynthesisPackage.PROSODY__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case SpeechSynthesisPackage.PROSODY__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
			case SpeechSynthesisPackage.PROSODY__VOLUME:
				return isSetVolume();
			case SpeechSynthesisPackage.PROSODY__ANY_ATTRIBUTE:
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
		result.append(", contour: ");
		result.append(contour);
		result.append(", duration: ");
		result.append(duration);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(", range: ");
		result.append(range);
		result.append(", rate: ");
		result.append(rate);
		result.append(", volume: ");
		if (volumeESet) result.append(volume); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ProsodyImpl
