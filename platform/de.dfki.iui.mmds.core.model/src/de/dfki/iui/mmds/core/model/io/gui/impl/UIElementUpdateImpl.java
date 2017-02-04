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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Element Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl#getStyleNames <em>Style Names</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl#getStyleProps <em>Style Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UIElementUpdateImpl extends BObjectImpl implements UIElementUpdate {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BString ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BString id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean ENABLED_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "true");
	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected BBoolean enabled = ENABLED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStyleNames() <em>Style Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleNames()
	 * @generated
	 * @ordered
	 */
	protected EList<BString> styleNames;
	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final BString TOOLTIP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected BString tooltip = TOOLTIP_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStyleProps() <em>Style Props</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleProps()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, BString> styleProps;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElementUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.UI_ELEMENT_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BString newId) {
		BString oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT_UPDATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(BBoolean newEnabled) {
		BBoolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT_UPDATE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BString> getStyleNames() {
		if (styleNames == null) {
			styleNames = new EDataTypeUniqueEList<BString>(BString.class, this, GuiPackage.UI_ELEMENT_UPDATE__STYLE_NAMES);
		}
		return styleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BString getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(BString newTooltip) {
		BString oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT_UPDATE__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, BString> getStyleProps() {
		if (styleProps == null) {
			styleProps = new EcoreEMap<String,BString>(BasePackage.Literals.STRING_TO_BSTRING_MAP_ENTRY, StringToBStringMapEntryImpl.class, this, GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS);
		}
		return styleProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS:
				return ((InternalEList<?>)getStyleProps()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.UI_ELEMENT_UPDATE__ID:
				return getId();
			case GuiPackage.UI_ELEMENT_UPDATE__ENABLED:
				return getEnabled();
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_NAMES:
				return getStyleNames();
			case GuiPackage.UI_ELEMENT_UPDATE__TOOLTIP:
				return getTooltip();
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS:
				if (coreType) return getStyleProps();
				else return getStyleProps().map();
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
			case GuiPackage.UI_ELEMENT_UPDATE__ID:
				setId((BString)newValue);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__ENABLED:
				setEnabled((BBoolean)newValue);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_NAMES:
				getStyleNames().clear();
				getStyleNames().addAll((Collection<? extends BString>)newValue);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__TOOLTIP:
				setTooltip((BString)newValue);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS:
				((EStructuralFeature.Setting)getStyleProps()).set(newValue);
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
			case GuiPackage.UI_ELEMENT_UPDATE__ID:
				setId(ID_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_NAMES:
				getStyleNames().clear();
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS:
				getStyleProps().clear();
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
			case GuiPackage.UI_ELEMENT_UPDATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GuiPackage.UI_ELEMENT_UPDATE__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_NAMES:
				return styleNames != null && !styleNames.isEmpty();
			case GuiPackage.UI_ELEMENT_UPDATE__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case GuiPackage.UI_ELEMENT_UPDATE__STYLE_PROPS:
				return styleProps != null && !styleProps.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", styleNames: ");
		result.append(styleNames);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(')');
		return result.toString();
	}

} //UIElementUpdateImpl
