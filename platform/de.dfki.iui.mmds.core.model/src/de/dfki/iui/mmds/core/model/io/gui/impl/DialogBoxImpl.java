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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.gui.DialogBox;
import de.dfki.iui.mmds.core.model.io.gui.DialogueButtons;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl#getModal <em>Modal</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogBoxImpl extends UIElementImpl implements DialogBox {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final BString TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected BString title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final BString TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected BString text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean VISIBLE_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "false");

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected BBoolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModal()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean MODAL_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "false");

	/**
	 * The cached value of the '{@link #getModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModal()
	 * @generated
	 * @ordered
	 */
	protected BBoolean modal = MODAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected static final DialogueButtons BUTTONS_EDEFAULT = DialogueButtons.OK_ONLY;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected DialogueButtons buttons = BUTTONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.DIALOG_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(BString newTitle) {
		BString oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DIALOG_BOX__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(BString newText) {
		BString oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DIALOG_BOX__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getModal() {
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModal(BBoolean newModal) {
		BBoolean oldModal = modal;
		modal = newModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DIALOG_BOX__MODAL, oldModal, modal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogueButtons getButtons() {
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtons(DialogueButtons newButtons) {
		DialogueButtons oldButtons = buttons;
		buttons = newButtons == null ? BUTTONS_EDEFAULT : newButtons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DIALOG_BOX__BUTTONS, oldButtons, buttons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(BBoolean newVisible) {
		BBoolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DIALOG_BOX__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.DIALOG_BOX__TITLE:
				return getTitle();
			case GuiPackage.DIALOG_BOX__TEXT:
				return getText();
			case GuiPackage.DIALOG_BOX__VISIBLE:
				return getVisible();
			case GuiPackage.DIALOG_BOX__MODAL:
				return getModal();
			case GuiPackage.DIALOG_BOX__BUTTONS:
				return getButtons();
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
			case GuiPackage.DIALOG_BOX__TITLE:
				setTitle((BString)newValue);
				return;
			case GuiPackage.DIALOG_BOX__TEXT:
				setText((BString)newValue);
				return;
			case GuiPackage.DIALOG_BOX__VISIBLE:
				setVisible((BBoolean)newValue);
				return;
			case GuiPackage.DIALOG_BOX__MODAL:
				setModal((BBoolean)newValue);
				return;
			case GuiPackage.DIALOG_BOX__BUTTONS:
				setButtons((DialogueButtons)newValue);
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
			case GuiPackage.DIALOG_BOX__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GuiPackage.DIALOG_BOX__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case GuiPackage.DIALOG_BOX__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case GuiPackage.DIALOG_BOX__MODAL:
				setModal(MODAL_EDEFAULT);
				return;
			case GuiPackage.DIALOG_BOX__BUTTONS:
				setButtons(BUTTONS_EDEFAULT);
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
			case GuiPackage.DIALOG_BOX__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GuiPackage.DIALOG_BOX__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case GuiPackage.DIALOG_BOX__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
			case GuiPackage.DIALOG_BOX__MODAL:
				return MODAL_EDEFAULT == null ? modal != null : !MODAL_EDEFAULT.equals(modal);
			case GuiPackage.DIALOG_BOX__BUTTONS:
				return buttons != BUTTONS_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", text: ");
		result.append(text);
		result.append(", visible: ");
		result.append(visible);
		result.append(", modal: ");
		result.append(modal);
		result.append(", buttons: ");
		result.append(buttons);
		result.append(')');
		return result.toString();
	}

} //DialogBoxImpl
