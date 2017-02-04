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
package de.dfki.iui.mmds.core.model.io.gui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.ListUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl#getAllowMultipleSelection <em>Allow Multiple Selection</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl#getSelectedIndex <em>Selected Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListUpdateImpl extends UIElementUpdateImpl implements ListUpdate {
	/**
	 * The default value of the '{@link #getAllowMultipleSelection() <em>Allow Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean ALLOW_MULTIPLE_SELECTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAllowMultipleSelection() <em>Allow Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected BBoolean allowMultipleSelection = ALLOW_MULTIPLE_SELECTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSelectedIndex() <em>Selected Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<BInteger> selectedIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.LIST_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getAllowMultipleSelection() {
		return allowMultipleSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMultipleSelection(BBoolean newAllowMultipleSelection) {
		BBoolean oldAllowMultipleSelection = allowMultipleSelection;
		allowMultipleSelection = newAllowMultipleSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.LIST_UPDATE__ALLOW_MULTIPLE_SELECTION, oldAllowMultipleSelection, allowMultipleSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BInteger> getSelectedIndex() {
		if (selectedIndex == null) {
			selectedIndex = new EDataTypeUniqueEList<BInteger>(BInteger.class, this, GuiPackage.LIST_UPDATE__SELECTED_INDEX);
		}
		return selectedIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.LIST_UPDATE__ALLOW_MULTIPLE_SELECTION:
				return getAllowMultipleSelection();
			case GuiPackage.LIST_UPDATE__SELECTED_INDEX:
				return getSelectedIndex();
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
			case GuiPackage.LIST_UPDATE__ALLOW_MULTIPLE_SELECTION:
				setAllowMultipleSelection((BBoolean)newValue);
				return;
			case GuiPackage.LIST_UPDATE__SELECTED_INDEX:
				getSelectedIndex().clear();
				getSelectedIndex().addAll((Collection<? extends BInteger>)newValue);
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
			case GuiPackage.LIST_UPDATE__ALLOW_MULTIPLE_SELECTION:
				setAllowMultipleSelection(ALLOW_MULTIPLE_SELECTION_EDEFAULT);
				return;
			case GuiPackage.LIST_UPDATE__SELECTED_INDEX:
				getSelectedIndex().clear();
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
			case GuiPackage.LIST_UPDATE__ALLOW_MULTIPLE_SELECTION:
				return ALLOW_MULTIPLE_SELECTION_EDEFAULT == null ? allowMultipleSelection != null : !ALLOW_MULTIPLE_SELECTION_EDEFAULT.equals(allowMultipleSelection);
			case GuiPackage.LIST_UPDATE__SELECTED_INDEX:
				return selectedIndex != null && !selectedIndex.isEmpty();
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
		result.append(" (allowMultipleSelection: ");
		result.append(allowMultipleSelection);
		result.append(", selectedIndex: ");
		result.append(selectedIndex);
		result.append(')');
		return result.toString();
	}

} //ListUpdateImpl
