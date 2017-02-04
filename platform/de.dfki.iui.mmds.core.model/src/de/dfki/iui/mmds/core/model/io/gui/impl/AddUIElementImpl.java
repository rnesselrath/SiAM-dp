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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add UI Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl#getNewElement <em>New Element</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl#getNewElementRef <em>New Element Ref</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddUIElementImpl extends BObjectImpl implements AddUIElement {
	/**
	 * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected static final BString PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected BString parentId = PARENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewElement() <em>New Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewElement()
	 * @generated
	 * @ordered
	 */
	protected UIElement newElement;

	/**
	 * The cached value of the '{@link #getNewElementRef() <em>New Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewElementRef()
	 * @generated
	 * @ordered
	 */
	protected UIElement newElementRef;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger POSITION_EDEFAULT = (BInteger)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBInteger(), "-1");

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BInteger position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddUIElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.ADD_UI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getParentId() {
		return parentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentId(BString newParentId) {
		BString oldParentId = parentId;
		parentId = newParentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ADD_UI_ELEMENT__PARENT_ID, oldParentId, parentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement getNewElement() {
		return newElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewElement(UIElement newNewElement, NotificationChain msgs) {
		UIElement oldNewElement = newElement;
		newElement = newNewElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT, oldNewElement, newNewElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewElement(UIElement newNewElement) {
		if (newNewElement != newElement) {
			NotificationChain msgs = null;
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT, null, msgs);
			if (newNewElement != null)
				msgs = ((InternalEObject)newNewElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT, null, msgs);
			msgs = basicSetNewElement(newNewElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT, newNewElement, newNewElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement getNewElementRef() {
		if (newElementRef != null && newElementRef.eIsProxy()) {
			InternalEObject oldNewElementRef = (InternalEObject)newElementRef;
			newElementRef = (UIElement)eResolveProxy(oldNewElementRef);
			if (newElementRef != oldNewElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF, oldNewElementRef, newElementRef));
			}
		}
		return newElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement basicGetNewElementRef() {
		return newElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewElementRef(UIElement newNewElementRef) {
		UIElement oldNewElementRef = newElementRef;
		newElementRef = newNewElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF, oldNewElementRef, newElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BInteger newPosition) {
		BInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ADD_UI_ELEMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
				return basicSetNewElement(null, msgs);
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
			case GuiPackage.ADD_UI_ELEMENT__PARENT_ID:
				return getParentId();
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
				return getNewElement();
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF:
				if (resolve) return getNewElementRef();
				return basicGetNewElementRef();
			case GuiPackage.ADD_UI_ELEMENT__POSITION:
				return getPosition();
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
			case GuiPackage.ADD_UI_ELEMENT__PARENT_ID:
				setParentId((BString)newValue);
				return;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
				setNewElement((UIElement)newValue);
				return;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF:
				setNewElementRef((UIElement)newValue);
				return;
			case GuiPackage.ADD_UI_ELEMENT__POSITION:
				setPosition((BInteger)newValue);
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
			case GuiPackage.ADD_UI_ELEMENT__PARENT_ID:
				setParentId(PARENT_ID_EDEFAULT);
				return;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
				setNewElement((UIElement)null);
				return;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF:
				setNewElementRef((UIElement)null);
				return;
			case GuiPackage.ADD_UI_ELEMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case GuiPackage.ADD_UI_ELEMENT__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT:
				return newElement != null;
			case GuiPackage.ADD_UI_ELEMENT__NEW_ELEMENT_REF:
				return newElementRef != null;
			case GuiPackage.ADD_UI_ELEMENT__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
		result.append(" (parentId: ");
		result.append(parentId);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //AddUIElementImpl
