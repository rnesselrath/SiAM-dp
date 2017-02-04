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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.dfki.iui.mmds.core.model.io.earcons.EarconStructure;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inherited Earcon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl#isIncludeBase <em>Include Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritedEarconImpl extends EarconStructureImpl implements InheritedEarcon {
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
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritedEarconLayer> layer;

	/**
	 * The default value of the '{@link #isIncludeBase() <em>Include Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeBase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_BASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeBase() <em>Include Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeBase()
	 * @generated
	 * @ordered
	 */
	protected boolean includeBase = INCLUDE_BASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritedEarconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarconsPackage.Literals.INHERITED_EARCON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EarconsPackage.INHERITED_EARCON__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.INHERITED_EARCON__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InheritedEarconLayer> getLayer() {
		if (layer == null) {
			layer = new EObjectResolvingEList<InheritedEarconLayer>(InheritedEarconLayer.class, this, EarconsPackage.INHERITED_EARCON__LAYER);
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeBase() {
		return includeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeBase(boolean newIncludeBase) {
		boolean oldIncludeBase = includeBase;
		includeBase = newIncludeBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarconsPackage.INHERITED_EARCON__INCLUDE_BASE, oldIncludeBase, includeBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarconsPackage.INHERITED_EARCON__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EarconsPackage.INHERITED_EARCON__LAYER:
				return getLayer();
			case EarconsPackage.INHERITED_EARCON__INCLUDE_BASE:
				return isIncludeBase();
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
			case EarconsPackage.INHERITED_EARCON__BASE:
				setBase((EarconStructure)newValue);
				return;
			case EarconsPackage.INHERITED_EARCON__LAYER:
				getLayer().clear();
				getLayer().addAll((Collection<? extends InheritedEarconLayer>)newValue);
				return;
			case EarconsPackage.INHERITED_EARCON__INCLUDE_BASE:
				setIncludeBase((Boolean)newValue);
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
			case EarconsPackage.INHERITED_EARCON__BASE:
				setBase((EarconStructure)null);
				return;
			case EarconsPackage.INHERITED_EARCON__LAYER:
				getLayer().clear();
				return;
			case EarconsPackage.INHERITED_EARCON__INCLUDE_BASE:
				setIncludeBase(INCLUDE_BASE_EDEFAULT);
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
			case EarconsPackage.INHERITED_EARCON__BASE:
				return base != null;
			case EarconsPackage.INHERITED_EARCON__LAYER:
				return layer != null && !layer.isEmpty();
			case EarconsPackage.INHERITED_EARCON__INCLUDE_BASE:
				return includeBase != INCLUDE_BASE_EDEFAULT;
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
		result.append(" (includeBase: ");
		result.append(includeBase);
		result.append(')');
		return result.toString();
	}

} //InheritedEarconImpl
