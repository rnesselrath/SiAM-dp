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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl#getArrayAdapter <em>Array Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl#getAllowMultipleSelection <em>Allow Multiple Selection</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl#getItem <em>Item</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl#getSelectedIndex <em>Selected Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends UIElementImpl implements List {
	/**
	 * The cached value of the '{@link #getArrayAdapter() <em>Array Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayAdapter()
	 * @generated
	 * @ordered
	 */
	protected ArrayAdapter arrayAdapter;

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
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> item;

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
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAdapter getArrayAdapter() {
		return arrayAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayAdapter(ArrayAdapter newArrayAdapter, NotificationChain msgs) {
		ArrayAdapter oldArrayAdapter = arrayAdapter;
		arrayAdapter = newArrayAdapter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.LIST__ARRAY_ADAPTER, oldArrayAdapter, newArrayAdapter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayAdapter(ArrayAdapter newArrayAdapter) {
		if (newArrayAdapter != arrayAdapter) {
			NotificationChain msgs = null;
			if (arrayAdapter != null)
				msgs = ((InternalEObject)arrayAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.LIST__ARRAY_ADAPTER, null, msgs);
			if (newArrayAdapter != null)
				msgs = ((InternalEObject)newArrayAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.LIST__ARRAY_ADAPTER, null, msgs);
			msgs = basicSetArrayAdapter(newArrayAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.LIST__ARRAY_ADAPTER, newArrayAdapter, newArrayAdapter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.LIST__ALLOW_MULTIPLE_SELECTION, oldAllowMultipleSelection, allowMultipleSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ListItem>(ListItem.class, this, GuiPackage.LIST__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BInteger> getSelectedIndex() {
		if (selectedIndex == null) {
			selectedIndex = new EDataTypeUniqueEList<BInteger>(BInteger.class, this, GuiPackage.LIST__SELECTED_INDEX);
		}
		return selectedIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<UIElement> contains() {
		EList<UIElement> result = new BasicEList<UIElement>();
		for (ListItem it : item) {
			result.add(it);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(UIElement uiElement) {
		if(uiElement != null && item != null)
			if(uiElement instanceof ListItem)
				item.add((ListItem)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(BInteger beforeIndex, UIElement uiElement) {
		if(uiElement != null && item != null)
			if(uiElement instanceof ListItem && beforeIndex!=null && beforeIndex.getValue() >= 0)
				item.add(beforeIndex.getValue(), (ListItem)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeChild(UIElement uiElement) {
		if(item != null && uiElement!=null)
			return item.remove(uiElement);
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.LIST__ARRAY_ADAPTER:
				return basicSetArrayAdapter(null, msgs);
			case GuiPackage.LIST__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.LIST__ARRAY_ADAPTER:
				return getArrayAdapter();
			case GuiPackage.LIST__ALLOW_MULTIPLE_SELECTION:
				return getAllowMultipleSelection();
			case GuiPackage.LIST__ITEM:
				return getItem();
			case GuiPackage.LIST__SELECTED_INDEX:
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
			case GuiPackage.LIST__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)newValue);
				return;
			case GuiPackage.LIST__ALLOW_MULTIPLE_SELECTION:
				setAllowMultipleSelection((BBoolean)newValue);
				return;
			case GuiPackage.LIST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ListItem>)newValue);
				return;
			case GuiPackage.LIST__SELECTED_INDEX:
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
			case GuiPackage.LIST__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)null);
				return;
			case GuiPackage.LIST__ALLOW_MULTIPLE_SELECTION:
				setAllowMultipleSelection(ALLOW_MULTIPLE_SELECTION_EDEFAULT);
				return;
			case GuiPackage.LIST__ITEM:
				getItem().clear();
				return;
			case GuiPackage.LIST__SELECTED_INDEX:
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
			case GuiPackage.LIST__ARRAY_ADAPTER:
				return arrayAdapter != null;
			case GuiPackage.LIST__ALLOW_MULTIPLE_SELECTION:
				return ALLOW_MULTIPLE_SELECTION_EDEFAULT == null ? allowMultipleSelection != null : !ALLOW_MULTIPLE_SELECTION_EDEFAULT.equals(allowMultipleSelection);
			case GuiPackage.LIST__ITEM:
				return item != null && !item.isEmpty();
			case GuiPackage.LIST__SELECTED_INDEX:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GuiPackage.LIST___CONTAINS:
				return contains();
			case GuiPackage.LIST___ADD_CHILD__UIELEMENT:
				addChild((UIElement)arguments.get(0));
				return null;
			case GuiPackage.LIST___ADD_CHILD__BINTEGER_UIELEMENT:
				addChild((BInteger)arguments.get(0), (UIElement)arguments.get(1));
				return null;
			case GuiPackage.LIST___REMOVE_CHILD__UIELEMENT:
				return removeChild((UIElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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

} //ListImpl
