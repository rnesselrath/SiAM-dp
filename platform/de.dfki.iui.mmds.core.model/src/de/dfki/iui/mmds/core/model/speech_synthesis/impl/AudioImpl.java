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

import java.math.BigInteger;
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
import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.Desc;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getDescAndSentenceAndStructureClass <em>Desc And Sentence And Structure Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getFetchhint <em>Fetchhint</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getFetchtimeout <em>Fetchtimeout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getMaxage <em>Maxage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getMaxstale <em>Maxstale</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioImpl extends MinimalEObjectImpl.Container implements Audio {
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
	 * The default value of the '{@link #getFetchhint() <em>Fetchhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchhint()
	 * @generated
	 * @ordered
	 */
	protected static final String FETCHHINT_EDEFAULT = "prefetch";

	/**
	 * The cached value of the '{@link #getFetchhint() <em>Fetchhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchhint()
	 * @generated
	 * @ordered
	 */
	protected String fetchhint = FETCHHINT_EDEFAULT;

	/**
	 * This is true if the Fetchhint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchhintESet;

	/**
	 * The default value of the '{@link #getFetchtimeout() <em>Fetchtimeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchtimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String FETCHTIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFetchtimeout() <em>Fetchtimeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchtimeout()
	 * @generated
	 * @ordered
	 */
	protected String fetchtimeout = FETCHTIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxage() <em>Maxage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxage() <em>Maxage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxage = MAXAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxstale() <em>Maxstale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxstale()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXSTALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxstale() <em>Maxstale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxstale()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxstale = MAXSTALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

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
	protected AudioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.AUDIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.AUDIO__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDescAndSentenceAndStructureClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup() {
		return (FeatureMap)getDescAndSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.AUDIO__AWS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAws() {
		return getAwsGroup().list(SpeechSynthesisPackage.Literals.AUDIO__AWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStructGroup() {
		return (FeatureMap)getDescAndSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.AUDIO__STRUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStruct() {
		return getStructGroup().list(SpeechSynthesisPackage.Literals.AUDIO__STRUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup() {
		return getDescAndSentenceAndStructureClass().list(SpeechSynthesisPackage.Literals.AUDIO__LOOKUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Desc> getDesc() {
		return getDescAndSentenceAndStructureClass().list(SpeechSynthesisPackage.Literals.AUDIO__DESC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getDescAndSentenceAndStructureClass().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.AUDIO__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFetchhint() {
		return fetchhint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchhint(String newFetchhint) {
		String oldFetchhint = fetchhint;
		fetchhint = newFetchhint;
		boolean oldFetchhintESet = fetchhintESet;
		fetchhintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.AUDIO__FETCHHINT, oldFetchhint, fetchhint, !oldFetchhintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFetchhint() {
		String oldFetchhint = fetchhint;
		boolean oldFetchhintESet = fetchhintESet;
		fetchhint = FETCHHINT_EDEFAULT;
		fetchhintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpeechSynthesisPackage.AUDIO__FETCHHINT, oldFetchhint, FETCHHINT_EDEFAULT, oldFetchhintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFetchhint() {
		return fetchhintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFetchtimeout() {
		return fetchtimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchtimeout(String newFetchtimeout) {
		String oldFetchtimeout = fetchtimeout;
		fetchtimeout = newFetchtimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT, oldFetchtimeout, fetchtimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxage() {
		return maxage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxage(BigInteger newMaxage) {
		BigInteger oldMaxage = maxage;
		maxage = newMaxage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.AUDIO__MAXAGE, oldMaxage, maxage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxstale() {
		return maxstale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxstale(BigInteger newMaxstale) {
		BigInteger oldMaxstale = maxstale;
		maxstale = newMaxstale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.AUDIO__MAXSTALE, oldMaxstale, maxstale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.AUDIO__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE);
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
			case SpeechSynthesisPackage.AUDIO__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS:
				return ((InternalEList<?>)getDescAndSentenceAndStructureClass()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__AWS_GROUP:
				return ((InternalEList<?>)getAwsGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__AWS:
				return ((InternalEList<?>)getAws()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__STRUCT_GROUP:
				return ((InternalEList<?>)getStructGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__LOOKUP:
				return ((InternalEList<?>)getLookup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__DESC:
				return ((InternalEList<?>)getDesc()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.AUDIO__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS:
				if (coreType) return getDescAndSentenceAndStructureClass();
				return ((FeatureMap.Internal)getDescAndSentenceAndStructureClass()).getWrapper();
			case SpeechSynthesisPackage.AUDIO__AWS_GROUP:
				if (coreType) return getAwsGroup();
				return ((FeatureMap.Internal)getAwsGroup()).getWrapper();
			case SpeechSynthesisPackage.AUDIO__AWS:
				return getAws();
			case SpeechSynthesisPackage.AUDIO__STRUCT_GROUP:
				if (coreType) return getStructGroup();
				return ((FeatureMap.Internal)getStructGroup()).getWrapper();
			case SpeechSynthesisPackage.AUDIO__STRUCT:
				return getStruct();
			case SpeechSynthesisPackage.AUDIO__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.AUDIO__DESC:
				return getDesc();
			case SpeechSynthesisPackage.AUDIO__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.AUDIO__FETCHHINT:
				return getFetchhint();
			case SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT:
				return getFetchtimeout();
			case SpeechSynthesisPackage.AUDIO__MAXAGE:
				return getMaxage();
			case SpeechSynthesisPackage.AUDIO__MAXSTALE:
				return getMaxstale();
			case SpeechSynthesisPackage.AUDIO__SRC:
				return getSrc();
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.AUDIO__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS:
				((FeatureMap.Internal)getDescAndSentenceAndStructureClass()).set(newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__AWS_GROUP:
				((FeatureMap.Internal)getAwsGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__STRUCT_GROUP:
				((FeatureMap.Internal)getStructGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__LOOKUP:
				getLookup().clear();
				getLookup().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__DESC:
				getDesc().clear();
				getDesc().addAll((Collection<? extends Desc>)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__FETCHHINT:
				setFetchhint((String)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT:
				setFetchtimeout((String)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__MAXAGE:
				setMaxage((BigInteger)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__MAXSTALE:
				setMaxstale((BigInteger)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__SRC:
				setSrc((String)newValue);
				return;
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.AUDIO__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS:
				getDescAndSentenceAndStructureClass().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__AWS_GROUP:
				getAwsGroup().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__STRUCT_GROUP:
				getStructGroup().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__LOOKUP:
				getLookup().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__DESC:
				getDesc().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.AUDIO__FETCHHINT:
				unsetFetchhint();
				return;
			case SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT:
				setFetchtimeout(FETCHTIMEOUT_EDEFAULT);
				return;
			case SpeechSynthesisPackage.AUDIO__MAXAGE:
				setMaxage(MAXAGE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.AUDIO__MAXSTALE:
				setMaxstale(MAXSTALE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.AUDIO__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.AUDIO__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS:
				return !getDescAndSentenceAndStructureClass().isEmpty();
			case SpeechSynthesisPackage.AUDIO__AWS_GROUP:
				return !getAwsGroup().isEmpty();
			case SpeechSynthesisPackage.AUDIO__AWS:
				return !getAws().isEmpty();
			case SpeechSynthesisPackage.AUDIO__STRUCT_GROUP:
				return !getStructGroup().isEmpty();
			case SpeechSynthesisPackage.AUDIO__STRUCT:
				return !getStruct().isEmpty();
			case SpeechSynthesisPackage.AUDIO__LOOKUP:
				return !getLookup().isEmpty();
			case SpeechSynthesisPackage.AUDIO__DESC:
				return !getDesc().isEmpty();
			case SpeechSynthesisPackage.AUDIO__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.AUDIO__FETCHHINT:
				return isSetFetchhint();
			case SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT:
				return FETCHTIMEOUT_EDEFAULT == null ? fetchtimeout != null : !FETCHTIMEOUT_EDEFAULT.equals(fetchtimeout);
			case SpeechSynthesisPackage.AUDIO__MAXAGE:
				return MAXAGE_EDEFAULT == null ? maxage != null : !MAXAGE_EDEFAULT.equals(maxage);
			case SpeechSynthesisPackage.AUDIO__MAXSTALE:
				return MAXSTALE_EDEFAULT == null ? maxstale != null : !MAXSTALE_EDEFAULT.equals(maxstale);
			case SpeechSynthesisPackage.AUDIO__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
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
		result.append(", fetchhint: ");
		if (fetchhintESet) result.append(fetchhint); else result.append("<unset>");
		result.append(", fetchtimeout: ");
		result.append(fetchtimeout);
		result.append(", maxage: ");
		result.append(maxage);
		result.append(", maxstale: ");
		result.append(maxstale);
		result.append(", src: ");
		result.append(src);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AudioImpl
