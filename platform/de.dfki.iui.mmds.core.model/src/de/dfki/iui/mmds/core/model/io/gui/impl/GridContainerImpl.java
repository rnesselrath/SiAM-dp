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

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GridContainer;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Grid Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl#getArrayAdapter <em>Array Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridContainerImpl extends UIElementImpl implements GridContainer {
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
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<GridRow> row;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GridContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.GRID_CONTAINER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER, oldArrayAdapter, newArrayAdapter);
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
				msgs = ((InternalEObject)arrayAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER, null, msgs);
			if (newArrayAdapter != null)
				msgs = ((InternalEObject)newArrayAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER, null, msgs);
			msgs = basicSetArrayAdapter(newArrayAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER, newArrayAdapter, newArrayAdapter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GridRow> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<GridRow>(GridRow.class, this, GuiPackage.GRID_CONTAINER__ROW);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<UIElement> contains() {
		return new BasicEList<UIElement>(getRow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(UIElement uiElement) {
		if(uiElement instanceof GridRow) 
			if(row!=null)
				row.add((GridRow)uiElement);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(BInteger beforeIndex, UIElement uiElement) {
		if(uiElement instanceof GridRow) 
			if(row!=null && beforeIndex!=null && beforeIndex.getValue() >= 0)
				row.add(beforeIndex.getValue(), (GridRow)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeChild(UIElement uiElement) {
		if(row != null && uiElement!=null)
			return row.remove(uiElement);
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER:
				return basicSetArrayAdapter(null, msgs);
			case GuiPackage.GRID_CONTAINER__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER:
				return getArrayAdapter();
			case GuiPackage.GRID_CONTAINER__ROW:
				return getRow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)newValue);
				return;
			case GuiPackage.GRID_CONTAINER__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends GridRow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)null);
				return;
			case GuiPackage.GRID_CONTAINER__ROW:
				getRow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuiPackage.GRID_CONTAINER__ARRAY_ADAPTER:
				return arrayAdapter != null;
			case GuiPackage.GRID_CONTAINER__ROW:
				return row != null && !row.isEmpty();
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
			case GuiPackage.GRID_CONTAINER___CONTAINS:
				return contains();
			case GuiPackage.GRID_CONTAINER___ADD_CHILD__UIELEMENT:
				addChild((UIElement)arguments.get(0));
				return null;
			case GuiPackage.GRID_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT:
				addChild((BInteger)arguments.get(0), (UIElement)arguments.get(1));
				return null;
			case GuiPackage.GRID_CONTAINER___REMOVE_CHILD__UIELEMENT:
				return removeChild((UIElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // GridContainerImpl
