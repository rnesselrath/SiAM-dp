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
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.RadioButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl#getRadioGroup <em>Radio Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl#getChecked <em>Checked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioButtonImpl extends ButtonImpl implements RadioButton {
	/**
	 * The default value of the '{@link #getRadioGroup() <em>Radio Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIO_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadioGroup() <em>Radio Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioGroup()
	 * @generated
	 * @ordered
	 */
	protected String radioGroup = RADIO_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BString VALUE_EDEFAULT = (BString)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBString(), "\"\"");

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BString value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean CHECKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected BBoolean checked = CHECKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.RADIO_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadioGroup() {
		return radioGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioGroup(String newRadioGroup) {
		String oldRadioGroup = radioGroup;
		radioGroup = newRadioGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.RADIO_BUTTON__RADIO_GROUP, oldRadioGroup, radioGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BString newValue) {
		BString oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.RADIO_BUTTON__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getChecked() {
		return checked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(BBoolean newChecked) {
		BBoolean oldChecked = checked;
		checked = newChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.RADIO_BUTTON__CHECKED, oldChecked, checked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.RADIO_BUTTON__RADIO_GROUP:
				return getRadioGroup();
			case GuiPackage.RADIO_BUTTON__VALUE:
				return getValue();
			case GuiPackage.RADIO_BUTTON__CHECKED:
				return getChecked();
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
			case GuiPackage.RADIO_BUTTON__RADIO_GROUP:
				setRadioGroup((String)newValue);
				return;
			case GuiPackage.RADIO_BUTTON__VALUE:
				setValue((BString)newValue);
				return;
			case GuiPackage.RADIO_BUTTON__CHECKED:
				setChecked((BBoolean)newValue);
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
			case GuiPackage.RADIO_BUTTON__RADIO_GROUP:
				setRadioGroup(RADIO_GROUP_EDEFAULT);
				return;
			case GuiPackage.RADIO_BUTTON__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GuiPackage.RADIO_BUTTON__CHECKED:
				setChecked(CHECKED_EDEFAULT);
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
			case GuiPackage.RADIO_BUTTON__RADIO_GROUP:
				return RADIO_GROUP_EDEFAULT == null ? radioGroup != null : !RADIO_GROUP_EDEFAULT.equals(radioGroup);
			case GuiPackage.RADIO_BUTTON__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GuiPackage.RADIO_BUTTON__CHECKED:
				return CHECKED_EDEFAULT == null ? checked != null : !CHECKED_EDEFAULT.equals(checked);
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
		result.append(" (radioGroup: ");
		result.append(radioGroup);
		result.append(", value: ");
		result.append(value);
		result.append(", checked: ");
		result.append(checked);
		result.append(')');
		return result.toString();
	}

} //RadioButtonImpl
