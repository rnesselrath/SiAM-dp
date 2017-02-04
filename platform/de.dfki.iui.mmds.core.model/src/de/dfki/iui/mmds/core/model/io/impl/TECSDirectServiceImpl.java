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
package de.dfki.iui.mmds.core.model.io.impl;

import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.TECSDirectService;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TECS Direct Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl#getData1 <em>Data1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl#getData2 <em>Data2</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl#getURIs <em>UR Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TECSDirectServiceImpl extends MinimalEObjectImpl.Container implements TECSDirectService {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData1() <em>Data1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData1()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> data1;

	/**
	 * The cached value of the '{@link #getData2() <em>Data2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData2()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> data2;

	/**
	 * The cached value of the '{@link #getURIs() <em>UR Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> urIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TECSDirectServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.TECS_DIRECT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TECS_DIRECT_SERVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getData1() {
		if (data1 == null) {
			data1 = new EDataTypeUniqueEList<Byte>(Byte.class, this, IoPackage.TECS_DIRECT_SERVICE__DATA1);
		}
		return data1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getData2() {
		if (data2 == null) {
			data2 = new EDataTypeUniqueEList<Byte>(Byte.class, this, IoPackage.TECS_DIRECT_SERVICE__DATA2);
		}
		return data2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getURIs() {
		if (urIs == null) {
			urIs = new EDataTypeUniqueEList<String>(String.class, this, IoPackage.TECS_DIRECT_SERVICE__UR_IS);
		}
		return urIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.TECS_DIRECT_SERVICE__TYPE:
				return getType();
			case IoPackage.TECS_DIRECT_SERVICE__DATA1:
				return getData1();
			case IoPackage.TECS_DIRECT_SERVICE__DATA2:
				return getData2();
			case IoPackage.TECS_DIRECT_SERVICE__UR_IS:
				return getURIs();
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
			case IoPackage.TECS_DIRECT_SERVICE__TYPE:
				setType((String)newValue);
				return;
			case IoPackage.TECS_DIRECT_SERVICE__DATA1:
				getData1().clear();
				getData1().addAll((Collection<? extends Byte>)newValue);
				return;
			case IoPackage.TECS_DIRECT_SERVICE__DATA2:
				getData2().clear();
				getData2().addAll((Collection<? extends Byte>)newValue);
				return;
			case IoPackage.TECS_DIRECT_SERVICE__UR_IS:
				getURIs().clear();
				getURIs().addAll((Collection<? extends String>)newValue);
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
			case IoPackage.TECS_DIRECT_SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IoPackage.TECS_DIRECT_SERVICE__DATA1:
				getData1().clear();
				return;
			case IoPackage.TECS_DIRECT_SERVICE__DATA2:
				getData2().clear();
				return;
			case IoPackage.TECS_DIRECT_SERVICE__UR_IS:
				getURIs().clear();
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
			case IoPackage.TECS_DIRECT_SERVICE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IoPackage.TECS_DIRECT_SERVICE__DATA1:
				return data1 != null && !data1.isEmpty();
			case IoPackage.TECS_DIRECT_SERVICE__DATA2:
				return data2 != null && !data2.isEmpty();
			case IoPackage.TECS_DIRECT_SERVICE__UR_IS:
				return urIs != null && !urIs.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", data1: ");
		result.append(data1);
		result.append(", data2: ");
		result.append(data2);
		result.append(", URIs: ");
		result.append(urIs);
		result.append(')');
		return result.toString();
	}

} //TECSDirectServiceImpl
