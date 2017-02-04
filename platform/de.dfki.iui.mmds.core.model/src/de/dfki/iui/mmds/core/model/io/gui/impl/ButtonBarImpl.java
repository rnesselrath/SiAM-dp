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
import de.dfki.iui.mmds.core.model.io.gui.Button;
import de.dfki.iui.mmds.core.model.io.gui.ButtonBar;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.Orientation;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl#getArrayAdapter <em>Array Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl#getButton <em>Button</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonBarImpl extends UIElementImpl implements ButtonBar {
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
	 * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> button;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.BUTTON_BAR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.BUTTON_BAR__ARRAY_ADAPTER, oldArrayAdapter, newArrayAdapter);
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
				msgs = ((InternalEObject)arrayAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.BUTTON_BAR__ARRAY_ADAPTER, null, msgs);
			if (newArrayAdapter != null)
				msgs = ((InternalEObject)newArrayAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.BUTTON_BAR__ARRAY_ADAPTER, null, msgs);
			msgs = basicSetArrayAdapter(newArrayAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.BUTTON_BAR__ARRAY_ADAPTER, newArrayAdapter, newArrayAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, GuiPackage.BUTTON_BAR__BUTTON);
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.BUTTON_BAR__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<UIElement> contains() {
		EList<UIElement> result = new BasicEList<UIElement>();
		for (Button b : button) {
			result.add(b);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(UIElement uiElement) {
		if(uiElement != null && button!=null)
			if(uiElement instanceof Button)
				button.add((Button)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(BInteger beforeIndex, UIElement uiElement) {
		if(uiElement != null && button!=null)
			if(uiElement instanceof Button && beforeIndex!=null && beforeIndex.getValue()>=0)
				button.add(beforeIndex.getValue(),(Button)uiElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeChild(UIElement uiElement) {
		if(uiElement != null && button!=null)
			return button.remove(uiElement);
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
			case GuiPackage.BUTTON_BAR__ARRAY_ADAPTER:
				return basicSetArrayAdapter(null, msgs);
			case GuiPackage.BUTTON_BAR__BUTTON:
				return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.BUTTON_BAR__ARRAY_ADAPTER:
				return getArrayAdapter();
			case GuiPackage.BUTTON_BAR__BUTTON:
				return getButton();
			case GuiPackage.BUTTON_BAR__ORIENTATION:
				return getOrientation();
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
			case GuiPackage.BUTTON_BAR__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)newValue);
				return;
			case GuiPackage.BUTTON_BAR__BUTTON:
				getButton().clear();
				getButton().addAll((Collection<? extends Button>)newValue);
				return;
			case GuiPackage.BUTTON_BAR__ORIENTATION:
				setOrientation((Orientation)newValue);
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
			case GuiPackage.BUTTON_BAR__ARRAY_ADAPTER:
				setArrayAdapter((ArrayAdapter)null);
				return;
			case GuiPackage.BUTTON_BAR__BUTTON:
				getButton().clear();
				return;
			case GuiPackage.BUTTON_BAR__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case GuiPackage.BUTTON_BAR__ARRAY_ADAPTER:
				return arrayAdapter != null;
			case GuiPackage.BUTTON_BAR__BUTTON:
				return button != null && !button.isEmpty();
			case GuiPackage.BUTTON_BAR__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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
			case GuiPackage.BUTTON_BAR___CONTAINS:
				return contains();
			case GuiPackage.BUTTON_BAR___ADD_CHILD__UIELEMENT:
				addChild((UIElement)arguments.get(0));
				return null;
			case GuiPackage.BUTTON_BAR___ADD_CHILD__BINTEGER_UIELEMENT:
				addChild((BInteger)arguments.get(0), (UIElement)arguments.get(1));
				return null;
			case GuiPackage.BUTTON_BAR___REMOVE_CHILD__UIELEMENT:
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //ButtonBarImpl
