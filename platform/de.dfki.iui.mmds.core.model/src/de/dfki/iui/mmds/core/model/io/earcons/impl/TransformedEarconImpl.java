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

import de.dfki.iui.mmds.core.model.io.earcons.EarconStructure;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformed Earcon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl#getModification <em>Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformedEarconImpl extends EarconStructureImpl implements TransformedEarcon {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EarconStructure base;

	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected PlainEarcon modification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformedEarconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarconsPackage.Literals.TRANSFORMED_EARCON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconStructure getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (EarconStructure)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EarconsPackage.TRANSFORMED_EARCON__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconStructure basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(EarconStructure newBase) {
		EarconStructure oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.TRANSFORMED_EARCON__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEarcon getModification() {
		if (modification != null && modification.eIsProxy()) {
			InternalEObject oldModification = (InternalEObject)modification;
			modification = (PlainEarcon)eResolveProxy(oldModification);
			if (modification != oldModification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EarconsPackage.TRANSFORMED_EARCON__MODIFICATION, oldModification, modification));
			}
		}
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEarcon basicGetModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModification(PlainEarcon newModification) {
		PlainEarcon oldModification = modification;
		modification = newModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.TRANSFORMED_EARCON__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarconsPackage.TRANSFORMED_EARCON__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EarconsPackage.TRANSFORMED_EARCON__MODIFICATION:
				if (resolve) return getModification();
				return basicGetModification();
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
			case EarconsPackage.TRANSFORMED_EARCON__BASE:
				setBase((EarconStructure)newValue);
				return;
			case EarconsPackage.TRANSFORMED_EARCON__MODIFICATION:
				setModification((PlainEarcon)newValue);
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
			case EarconsPackage.TRANSFORMED_EARCON__BASE:
				setBase((EarconStructure)null);
				return;
			case EarconsPackage.TRANSFORMED_EARCON__MODIFICATION:
				setModification((PlainEarcon)null);
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
			case EarconsPackage.TRANSFORMED_EARCON__BASE:
				return base != null;
			case EarconsPackage.TRANSFORMED_EARCON__MODIFICATION:
				return modification != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformedEarconImpl
