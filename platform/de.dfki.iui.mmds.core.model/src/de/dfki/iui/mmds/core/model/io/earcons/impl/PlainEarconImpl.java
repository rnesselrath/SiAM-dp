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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.dfki.iui.mmds.core.model.io.earcons.EarconNote;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Earcon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl#getNote <em>Note</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainEarconImpl extends EarconStructureImpl implements PlainEarcon {
	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<EarconNote> note;

	/**
	 * The default value of the '{@link #getRegister() <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected static final float REGISTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected float register = REGISTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamics() <em>Dynamics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected static final float DYNAMICS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDynamics() <em>Dynamics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected float dynamics = DYNAMICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainEarconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarconsPackage.Literals.PLAIN_EARCON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EarconNote> getNote() {
		if (note == null) {
			note = new EObjectResolvingEList<EarconNote>(EarconNote.class, this, EarconsPackage.PLAIN_EARCON__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(float newRegister) {
		float oldRegister = register;
		register = newRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.PLAIN_EARCON__REGISTER, oldRegister, register));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDynamics() {
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamics(float newDynamics) {
		float oldDynamics = dynamics;
		dynamics = newDynamics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.PLAIN_EARCON__DYNAMICS, oldDynamics, dynamics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarconsPackage.PLAIN_EARCON__NOTE:
				return getNote();
			case EarconsPackage.PLAIN_EARCON__REGISTER:
				return getRegister();
			case EarconsPackage.PLAIN_EARCON__DYNAMICS:
				return getDynamics();
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
			case EarconsPackage.PLAIN_EARCON__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends EarconNote>)newValue);
				return;
			case EarconsPackage.PLAIN_EARCON__REGISTER:
				setRegister((Float)newValue);
				return;
			case EarconsPackage.PLAIN_EARCON__DYNAMICS:
				setDynamics((Float)newValue);
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
			case EarconsPackage.PLAIN_EARCON__NOTE:
				getNote().clear();
				return;
			case EarconsPackage.PLAIN_EARCON__REGISTER:
				setRegister(REGISTER_EDEFAULT);
				return;
			case EarconsPackage.PLAIN_EARCON__DYNAMICS:
				setDynamics(DYNAMICS_EDEFAULT);
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
			case EarconsPackage.PLAIN_EARCON__NOTE:
				return note != null && !note.isEmpty();
			case EarconsPackage.PLAIN_EARCON__REGISTER:
				return register != REGISTER_EDEFAULT;
			case EarconsPackage.PLAIN_EARCON__DYNAMICS:
				return dynamics != DYNAMICS_EDEFAULT;
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
		result.append(" (register: ");
		result.append(register);
		result.append(", dynamics: ");
		result.append(dynamics);
		result.append(')');
		return result.toString();
	}

} //PlainEarconImpl
