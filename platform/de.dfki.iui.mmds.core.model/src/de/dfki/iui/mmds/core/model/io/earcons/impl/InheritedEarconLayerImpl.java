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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer;
import de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inherited Earcon Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl#getEarcon <em>Earcon</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl#isInclude <em>Include</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritedEarconLayerImpl extends BObjectImpl implements InheritedEarconLayer {
	/**
	 * The cached value of the '{@link #getEarcon() <em>Earcon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarcon()
	 * @generated
	 * @ordered
	 */
	protected PlainEarcon earcon;

	/**
	 * The default value of the '{@link #isInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclude()
	 * @generated
	 * @ordered
	 */
	protected boolean include = INCLUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritedEarconLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarconsPackage.Literals.INHERITED_EARCON_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEarcon getEarcon() {
		if (earcon != null && earcon.eIsProxy()) {
			InternalEObject oldEarcon = (InternalEObject)earcon;
			earcon = (PlainEarcon)eResolveProxy(oldEarcon);
			if (earcon != oldEarcon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EarconsPackage.INHERITED_EARCON_LAYER__EARCON, oldEarcon, earcon));
			}
		}
		return earcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEarcon basicGetEarcon() {
		return earcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarcon(PlainEarcon newEarcon) {
		PlainEarcon oldEarcon = earcon;
		earcon = newEarcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.INHERITED_EARCON_LAYER__EARCON, oldEarcon, earcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(boolean newInclude) {
		boolean oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.INHERITED_EARCON_LAYER__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarconsPackage.INHERITED_EARCON_LAYER__EARCON:
				if (resolve) return getEarcon();
				return basicGetEarcon();
			case EarconsPackage.INHERITED_EARCON_LAYER__INCLUDE:
				return isInclude();
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
			case EarconsPackage.INHERITED_EARCON_LAYER__EARCON:
				setEarcon((PlainEarcon)newValue);
				return;
			case EarconsPackage.INHERITED_EARCON_LAYER__INCLUDE:
				setInclude((Boolean)newValue);
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
			case EarconsPackage.INHERITED_EARCON_LAYER__EARCON:
				setEarcon((PlainEarcon)null);
				return;
			case EarconsPackage.INHERITED_EARCON_LAYER__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
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
			case EarconsPackage.INHERITED_EARCON_LAYER__EARCON:
				return earcon != null;
			case EarconsPackage.INHERITED_EARCON_LAYER__INCLUDE:
				return include != INCLUDE_EDEFAULT;
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
		result.append(" (include: ");
		result.append(include);
		result.append(')');
		return result.toString();
	}

} //InheritedEarconLayerImpl
