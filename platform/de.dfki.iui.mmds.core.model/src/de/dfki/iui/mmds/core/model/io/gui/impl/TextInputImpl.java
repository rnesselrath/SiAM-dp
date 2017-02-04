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

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard;
import de.dfki.iui.mmds.core.model.io.gui.TextInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl#getMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl#getSoftKeyboard <em>Soft Keyboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextInputImpl extends UIElementImpl implements TextInput {
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
	 * The default value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean MULTI_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected BBoolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftKeyboard() <em>Soft Keyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftKeyboard()
	 * @generated
	 * @ordered
	 */
	protected SoftKeyboard softKeyboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.TEXT_INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.TEXT_INPUT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLine(BBoolean newMultiLine) {
		BBoolean oldMultiLine = multiLine;
		multiLine = newMultiLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.TEXT_INPUT__MULTI_LINE, oldMultiLine, multiLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftKeyboard getSoftKeyboard() {
		return softKeyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftKeyboard(SoftKeyboard newSoftKeyboard, NotificationChain msgs) {
		SoftKeyboard oldSoftKeyboard = softKeyboard;
		softKeyboard = newSoftKeyboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.TEXT_INPUT__SOFT_KEYBOARD, oldSoftKeyboard, newSoftKeyboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftKeyboard(SoftKeyboard newSoftKeyboard) {
		if (newSoftKeyboard != softKeyboard) {
			NotificationChain msgs = null;
			if (softKeyboard != null)
				msgs = ((InternalEObject)softKeyboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.TEXT_INPUT__SOFT_KEYBOARD, null, msgs);
			if (newSoftKeyboard != null)
				msgs = ((InternalEObject)newSoftKeyboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.TEXT_INPUT__SOFT_KEYBOARD, null, msgs);
			msgs = basicSetSoftKeyboard(newSoftKeyboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.TEXT_INPUT__SOFT_KEYBOARD, newSoftKeyboard, newSoftKeyboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.TEXT_INPUT__SOFT_KEYBOARD:
				return basicSetSoftKeyboard(null, msgs);
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
			case GuiPackage.TEXT_INPUT__TEXT:
				return getText();
			case GuiPackage.TEXT_INPUT__MULTI_LINE:
				return getMultiLine();
			case GuiPackage.TEXT_INPUT__SOFT_KEYBOARD:
				return getSoftKeyboard();
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
			case GuiPackage.TEXT_INPUT__TEXT:
				setText((BString)newValue);
				return;
			case GuiPackage.TEXT_INPUT__MULTI_LINE:
				setMultiLine((BBoolean)newValue);
				return;
			case GuiPackage.TEXT_INPUT__SOFT_KEYBOARD:
				setSoftKeyboard((SoftKeyboard)newValue);
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
			case GuiPackage.TEXT_INPUT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case GuiPackage.TEXT_INPUT__MULTI_LINE:
				setMultiLine(MULTI_LINE_EDEFAULT);
				return;
			case GuiPackage.TEXT_INPUT__SOFT_KEYBOARD:
				setSoftKeyboard((SoftKeyboard)null);
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
			case GuiPackage.TEXT_INPUT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case GuiPackage.TEXT_INPUT__MULTI_LINE:
				return MULTI_LINE_EDEFAULT == null ? multiLine != null : !MULTI_LINE_EDEFAULT.equals(multiLine);
			case GuiPackage.TEXT_INPUT__SOFT_KEYBOARD:
				return softKeyboard != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", multiLine: ");
		result.append(multiLine);
		result.append(')');
		return result.toString();
	}

} //TextInputImpl
