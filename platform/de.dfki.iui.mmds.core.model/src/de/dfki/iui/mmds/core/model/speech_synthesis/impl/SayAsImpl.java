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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Say As</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getInterpretAs <em>Interpret As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SayAsImpl extends MinimalEObjectImpl.Container implements SayAs {
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
	 * The default value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected String detail = DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpretAs() <em>Interpret As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretAs()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRET_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpretAs() <em>Interpret As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretAs()
	 * @generated
	 * @ordered
	 */
	protected String interpretAs = INTERPRET_AS_EDEFAULT;

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
	protected SayAsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.SAY_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.SAY_AS__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SAY_AS__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(String newDetail) {
		String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SAY_AS__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SAY_AS__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpretAs() {
		return interpretAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretAs(String newInterpretAs) {
		String oldInterpretAs = interpretAs;
		interpretAs = newInterpretAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SAY_AS__INTERPRET_AS, oldInterpretAs, interpretAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE);
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
			case SpeechSynthesisPackage.SAY_AS__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SAY_AS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SAY_AS__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.SAY_AS__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.SAY_AS__DETAIL:
				return getDetail();
			case SpeechSynthesisPackage.SAY_AS__FORMAT:
				return getFormat();
			case SpeechSynthesisPackage.SAY_AS__INTERPRET_AS:
				return getInterpretAs();
			case SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpeechSynthesisPackage.SAY_AS__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.SAY_AS__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.SAY_AS__DETAIL:
				setDetail((String)newValue);
				return;
			case SpeechSynthesisPackage.SAY_AS__FORMAT:
				setFormat((String)newValue);
				return;
			case SpeechSynthesisPackage.SAY_AS__INTERPRET_AS:
				setInterpretAs((String)newValue);
				return;
			case SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SAY_AS__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.SAY_AS__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.SAY_AS__DETAIL:
				setDetail(DETAIL_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SAY_AS__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SAY_AS__INTERPRET_AS:
				setInterpretAs(INTERPRET_AS_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE:
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
			case SpeechSynthesisPackage.SAY_AS__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.SAY_AS__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.SAY_AS__DETAIL:
				return DETAIL_EDEFAULT == null ? detail != null : !DETAIL_EDEFAULT.equals(detail);
			case SpeechSynthesisPackage.SAY_AS__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case SpeechSynthesisPackage.SAY_AS__INTERPRET_AS:
				return INTERPRET_AS_EDEFAULT == null ? interpretAs != null : !INTERPRET_AS_EDEFAULT.equals(interpretAs);
			case SpeechSynthesisPackage.SAY_AS__ANY_ATTRIBUTE:
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
		result.append(", detail: ");
		result.append(detail);
		result.append(", format: ");
		result.append(format);
		result.append(", interpretAs: ");
		result.append(interpretAs);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SayAsImpl
