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
package de.dfki.iui.mmds.core.model.io.earcons.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconNote;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earcon Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getIntensityBegin <em>Intensity Begin</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getIntensityEnd <em>Intensity End</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl#getTimbre <em>Timbre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarconNoteImpl extends BObjectImpl implements EarconNote {
	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final int PITCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected int pitch = PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPause() <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected static final int PAUSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected int pause = PAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensityBegin() <em>Intensity Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityBegin()
	 * @generated
	 * @ordered
	 */
	protected static final float INTENSITY_BEGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntensityBegin() <em>Intensity Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityBegin()
	 * @generated
	 * @ordered
	 */
	protected float intensityBegin = INTENSITY_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensityEnd() <em>Intensity End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityEnd()
	 * @generated
	 * @ordered
	 */
	protected static final float INTENSITY_END_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntensityEnd() <em>Intensity End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityEnd()
	 * @generated
	 * @ordered
	 */
	protected float intensityEnd = INTENSITY_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimbre() <em>Timbre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimbre()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimbre() <em>Timbre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimbre()
	 * @generated
	 * @ordered
	 */
	protected String timbre = TIMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarconNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarconsPackage.Literals.EARCON_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(int newPitch) {
		int oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPause() {
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPause(int newPause) {
		int oldPause = pause;
		pause = newPause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__PAUSE, oldPause, pause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntensityBegin() {
		return intensityBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensityBegin(float newIntensityBegin) {
		float oldIntensityBegin = intensityBegin;
		intensityBegin = newIntensityBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__INTENSITY_BEGIN, oldIntensityBegin, intensityBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntensityEnd() {
		return intensityEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensityEnd(float newIntensityEnd) {
		float oldIntensityEnd = intensityEnd;
		intensityEnd = newIntensityEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__INTENSITY_END, oldIntensityEnd, intensityEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimbre() {
		return timbre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimbre(String newTimbre) {
		String oldTimbre = timbre;
		timbre = newTimbre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.EARCON_NOTE__TIMBRE, oldTimbre, timbre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarconsPackage.EARCON_NOTE__PITCH:
				return getPitch();
			case EarconsPackage.EARCON_NOTE__DURATION:
				return getDuration();
			case EarconsPackage.EARCON_NOTE__PAUSE:
				return getPause();
			case EarconsPackage.EARCON_NOTE__INTENSITY_BEGIN:
				return getIntensityBegin();
			case EarconsPackage.EARCON_NOTE__INTENSITY_END:
				return getIntensityEnd();
			case EarconsPackage.EARCON_NOTE__TIMBRE:
				return getTimbre();
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
			case EarconsPackage.EARCON_NOTE__PITCH:
				setPitch((Integer)newValue);
				return;
			case EarconsPackage.EARCON_NOTE__DURATION:
				setDuration((Integer)newValue);
				return;
			case EarconsPackage.EARCON_NOTE__PAUSE:
				setPause((Integer)newValue);
				return;
			case EarconsPackage.EARCON_NOTE__INTENSITY_BEGIN:
				setIntensityBegin((Float)newValue);
				return;
			case EarconsPackage.EARCON_NOTE__INTENSITY_END:
				setIntensityEnd((Float)newValue);
				return;
			case EarconsPackage.EARCON_NOTE__TIMBRE:
				setTimbre((String)newValue);
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
			case EarconsPackage.EARCON_NOTE__PITCH:
				setPitch(PITCH_EDEFAULT);
				return;
			case EarconsPackage.EARCON_NOTE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EarconsPackage.EARCON_NOTE__PAUSE:
				setPause(PAUSE_EDEFAULT);
				return;
			case EarconsPackage.EARCON_NOTE__INTENSITY_BEGIN:
				setIntensityBegin(INTENSITY_BEGIN_EDEFAULT);
				return;
			case EarconsPackage.EARCON_NOTE__INTENSITY_END:
				setIntensityEnd(INTENSITY_END_EDEFAULT);
				return;
			case EarconsPackage.EARCON_NOTE__TIMBRE:
				setTimbre(TIMBRE_EDEFAULT);
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
			case EarconsPackage.EARCON_NOTE__PITCH:
				return pitch != PITCH_EDEFAULT;
			case EarconsPackage.EARCON_NOTE__DURATION:
				return duration != DURATION_EDEFAULT;
			case EarconsPackage.EARCON_NOTE__PAUSE:
				return pause != PAUSE_EDEFAULT;
			case EarconsPackage.EARCON_NOTE__INTENSITY_BEGIN:
				return intensityBegin != INTENSITY_BEGIN_EDEFAULT;
			case EarconsPackage.EARCON_NOTE__INTENSITY_END:
				return intensityEnd != INTENSITY_END_EDEFAULT;
			case EarconsPackage.EARCON_NOTE__TIMBRE:
				return TIMBRE_EDEFAULT == null ? timbre != null : !TIMBRE_EDEFAULT.equals(timbre);
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
		result.append(" (pitch: ");
		result.append(pitch);
		result.append(", duration: ");
		result.append(duration);
		result.append(", pause: ");
		result.append(pause);
		result.append(", intensityBegin: ");
		result.append(intensityBegin);
		result.append(", intensityEnd: ");
		result.append(intensityEnd);
		result.append(", timbre: ");
		result.append(timbre);
		result.append(')');
		return result.toString();
	}

} //EarconNoteImpl
