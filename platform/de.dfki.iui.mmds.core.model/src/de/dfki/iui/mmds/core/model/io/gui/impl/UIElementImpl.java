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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.gui.ElementAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.Layout;
import de.dfki.iui.mmds.core.model.io.gui.SupportedEvent;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getSupportedEvents <em>Supported Events</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getStyleNames <em>Style Names</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getX <em>X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getY <em>Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getSemanticContent <em>Semantic Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UIElementImpl extends BObjectImpl implements UIElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BString ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BString id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean ENABLED_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "true");

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected BBoolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getSupportedEvents()
	 * <em>Supported Events</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSupportedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedEvent> supportedEvents;

	/**
	 * The cached value of the '{@link #getStyleNames() <em>Style Names</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStyleNames()
	 * @generated
	 * @ordered
	 */
	protected EList<BString> styleNames;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected BInteger x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected BInteger y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticContent() <em>Semantic Content</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSemanticContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> semanticContent;

	/**
	 * The cached value of the '{@link #getAdapter() <em>Adapter</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected ElementAdapter adapter;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.UI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BString getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BString newId) {
		BString oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBoolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(BBoolean newEnabled) {
		BBoolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.UI_ELEMENT__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.UI_ELEMENT__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportedEvent> getSupportedEvents() {
		if (supportedEvents == null) {
			supportedEvents = new EObjectContainmentEList<SupportedEvent>(SupportedEvent.class, this, GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS);
		}
		return supportedEvents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BString> getStyleNames() {
		if (styleNames == null) {
			styleNames = new EDataTypeUniqueEList<BString>(BString.class, this, GuiPackage.UI_ELEMENT__STYLE_NAMES);
		}
		return styleNames;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(BInteger newX) {
		BInteger oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(BInteger newY) {
		BInteger oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getSemanticContent() {
		if (semanticContent == null) {
			semanticContent = new EObjectContainmentEList<Entity>(Entity.class, this, GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT);
		}
		return semanticContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementAdapter getAdapter() {
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapter(ElementAdapter newAdapter, NotificationChain msgs) {
		ElementAdapter oldAdapter = adapter;
		adapter = newAdapter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__ADAPTER, oldAdapter, newAdapter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapter(ElementAdapter newAdapter) {
		if (newAdapter != adapter) {
			NotificationChain msgs = null;
			if (adapter != null)
				msgs = ((InternalEObject)adapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.UI_ELEMENT__ADAPTER, null, msgs);
			if (newAdapter != null)
				msgs = ((InternalEObject)newAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.UI_ELEMENT__ADAPTER, null, msgs);
			msgs = basicSetAdapter(newAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__ADAPTER, newAdapter, newAdapter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.UI_ELEMENT__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.UI_ELEMENT__LAYOUT:
				return basicSetLayout(null, msgs);
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
				return ((InternalEList<?>)getSupportedEvents()).basicRemove(otherEnd, msgs);
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
				return ((InternalEList<?>)getSemanticContent()).basicRemove(otherEnd, msgs);
			case GuiPackage.UI_ELEMENT__ADAPTER:
				return basicSetAdapter(null, msgs);
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
			case GuiPackage.UI_ELEMENT__ID:
				return getId();
			case GuiPackage.UI_ELEMENT__ENABLED:
				return getEnabled();
			case GuiPackage.UI_ELEMENT__LAYOUT:
				return getLayout();
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
				return getSupportedEvents();
			case GuiPackage.UI_ELEMENT__STYLE_NAMES:
				return getStyleNames();
			case GuiPackage.UI_ELEMENT__X:
				return getX();
			case GuiPackage.UI_ELEMENT__Y:
				return getY();
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
				return getSemanticContent();
			case GuiPackage.UI_ELEMENT__ADAPTER:
				return getAdapter();
			case GuiPackage.UI_ELEMENT__TOOLTIP:
				return getTooltip();
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
			case GuiPackage.UI_ELEMENT__ID:
				setId((BString)newValue);
				return;
			case GuiPackage.UI_ELEMENT__ENABLED:
				setEnabled((BBoolean)newValue);
				return;
			case GuiPackage.UI_ELEMENT__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
				getSupportedEvents().clear();
				getSupportedEvents().addAll((Collection<? extends SupportedEvent>)newValue);
				return;
			case GuiPackage.UI_ELEMENT__STYLE_NAMES:
				getStyleNames().clear();
				getStyleNames().addAll((Collection<? extends BString>)newValue);
				return;
			case GuiPackage.UI_ELEMENT__X:
				setX((BInteger)newValue);
				return;
			case GuiPackage.UI_ELEMENT__Y:
				setY((BInteger)newValue);
				return;
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
				getSemanticContent().clear();
				getSemanticContent().addAll((Collection<? extends Entity>)newValue);
				return;
			case GuiPackage.UI_ELEMENT__ADAPTER:
				setAdapter((ElementAdapter)newValue);
				return;
			case GuiPackage.UI_ELEMENT__TOOLTIP:
				setTooltip((BString)newValue);
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
			case GuiPackage.UI_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT__LAYOUT:
				setLayout((Layout)null);
				return;
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
				getSupportedEvents().clear();
				return;
			case GuiPackage.UI_ELEMENT__STYLE_NAMES:
				getStyleNames().clear();
				return;
			case GuiPackage.UI_ELEMENT__X:
				setX(X_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT__Y:
				setY(Y_EDEFAULT);
				return;
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
				getSemanticContent().clear();
				return;
			case GuiPackage.UI_ELEMENT__ADAPTER:
				setAdapter((ElementAdapter)null);
				return;
			case GuiPackage.UI_ELEMENT__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
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
			case GuiPackage.UI_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GuiPackage.UI_ELEMENT__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case GuiPackage.UI_ELEMENT__LAYOUT:
				return layout != null;
			case GuiPackage.UI_ELEMENT__SUPPORTED_EVENTS:
				return supportedEvents != null && !supportedEvents.isEmpty();
			case GuiPackage.UI_ELEMENT__STYLE_NAMES:
				return styleNames != null && !styleNames.isEmpty();
			case GuiPackage.UI_ELEMENT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case GuiPackage.UI_ELEMENT__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case GuiPackage.UI_ELEMENT__SEMANTIC_CONTENT:
				return semanticContent != null && !semanticContent.isEmpty();
			case GuiPackage.UI_ELEMENT__ADAPTER:
				return adapter != null;
			case GuiPackage.UI_ELEMENT__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(')');
		return result.toString();
	}

} // UIElementImpl
