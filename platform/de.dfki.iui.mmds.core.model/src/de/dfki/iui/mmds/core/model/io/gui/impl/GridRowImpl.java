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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl#getArrayAdapter <em>Array Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl#getRowId <em>Row Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl#getIsPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridRowImpl extends UIElementImpl implements GridRow {
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
	 * The default value of the '{@link #getRowId() <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowId()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger ROW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowId() <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowId()
	 * @generated
	 * @ordered
	 */
	protected BInteger rowId = ROW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BFloat HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BFloat height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean IS_PERCENTAGE_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "false");

	/**
	 * The cached value of the '{@link #getIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected BBoolean isPercentage = IS_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<GridItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.GRID_ROW;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ROW__ARRAY_ADAPTER, oldArrayAdapter, newArrayAdapter);
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
				msgs = ((InternalEObject)arrayAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.GRID_ROW__ARRAY_ADAPTER, null, msgs);
			if (newArrayAdapter != null)
				msgs = ((InternalEObject)newArrayAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.GRID_ROW__ARRAY_ADAPTER, null, msgs);
			msgs = basicSetArrayAdapter(newArrayAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ROW__ARRAY_ADAPTER, newArrayAdapter, newArrayAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getRowId() {
		return rowId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowId(BInteger newRowId) {
		BInteger oldRowId = rowId;
		rowId = newRowId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ROW__ROW_ID, oldRowId, rowId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFloat getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BFloat newHeight) {
		BFloat oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ROW__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getIsPercentage() {
		return isPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPercentage(BBoolean newIsPercentage) {
		BBoolean oldIsPercentage = isPercentage;
		isPercentage = newIsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ROW__IS_PERCENTAGE, oldIsPercentage, isPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<GridItem>(GridItem.class, this, GuiPackage.GRID_ROW__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<UIElement> contains() {
		return new BasicEList<UIElement>(getItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(UIElement uiElement) {
		if(uiElement != null && item!=null)
			if(uiElement instanceof GridItem)
				item.add((GridItem)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(BInteger beforeIndex, UIElement uiElement) {
		if(uiElement != null && item!=null)
			if(uiElement instanceof GridItem && beforeIndex!=null && beforeIndex.getValue() >=0)
				item.add(beforeIndex.getValue(), (GridItem)uiElement);
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
			case GuiPackage.GRID_ROW__ARRAY_ADAPTER:
				return basicSetArrayAdapter(null, msgs);
			case GuiPackage.GRID_ROW__ITEM:
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
			case GuiPackage.GRID_ROW__ARRAY_ADAPTER:
				return getArrayAdapter();
			case GuiPackage.GRID_ROW__ROW_ID:
				return getRowId();
			case GuiPackage.GRID_ROW__HEIGHT:
				return getHeight();
			case GuiPackage.GRID_ROW__IS_PERCENTAGE:
				return getIsPercentage();
			case GuiPackage.GRID_ROW__ITEM:
				return getItem();
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
			case GuiPackage.GRID_ROW__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)newValue);
				return;
			case GuiPackage.GRID_ROW__ROW_ID:
				setRowId((BInteger)newValue);
				return;
			case GuiPackage.GRID_ROW__HEIGHT:
				setHeight((BFloat)newValue);
				return;
			case GuiPackage.GRID_ROW__IS_PERCENTAGE:
				setIsPercentage((BBoolean)newValue);
				return;
			case GuiPackage.GRID_ROW__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends GridItem>)newValue);
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
			case GuiPackage.GRID_ROW__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)null);
				return;
			case GuiPackage.GRID_ROW__ROW_ID:
				setRowId(ROW_ID_EDEFAULT);
				return;
			case GuiPackage.GRID_ROW__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GuiPackage.GRID_ROW__IS_PERCENTAGE:
				setIsPercentage(IS_PERCENTAGE_EDEFAULT);
				return;
			case GuiPackage.GRID_ROW__ITEM:
				getItem().clear();
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
			case GuiPackage.GRID_ROW__ARRAY_ADAPTER:
				return arrayAdapter != null;
			case GuiPackage.GRID_ROW__ROW_ID:
				return ROW_ID_EDEFAULT == null ? rowId != null : !ROW_ID_EDEFAULT.equals(rowId);
			case GuiPackage.GRID_ROW__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case GuiPackage.GRID_ROW__IS_PERCENTAGE:
				return IS_PERCENTAGE_EDEFAULT == null ? isPercentage != null : !IS_PERCENTAGE_EDEFAULT.equals(isPercentage);
			case GuiPackage.GRID_ROW__ITEM:
				return item != null && !item.isEmpty();
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
			case GuiPackage.GRID_ROW___CONTAINS:
				return contains();
			case GuiPackage.GRID_ROW___ADD_CHILD__UIELEMENT:
				addChild((UIElement)arguments.get(0));
				return null;
			case GuiPackage.GRID_ROW___ADD_CHILD__BINTEGER_UIELEMENT:
				addChild((BInteger)arguments.get(0), (UIElement)arguments.get(1));
				return null;
			case GuiPackage.GRID_ROW___REMOVE_CHILD__UIELEMENT:
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
		result.append(" (rowId: ");
		result.append(rowId);
		result.append(", height: ");
		result.append(height);
		result.append(", isPercentage: ");
		result.append(isPercentage);
		result.append(')');
		return result.toString();
	}

} //GridRowImpl
