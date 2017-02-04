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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.io.gui.AdapterMapping;
import de.dfki.iui.mmds.core.model.io.gui.ElementAdapter;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.pattern.PPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl#getAdapterMapping <em>Adapter Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementAdapterImpl extends MinimalEObjectImpl.Container implements ElementAdapter {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected PPattern pattern;

	/**
	 * The cached value of the '{@link #getAdapterMapping() <em>Adapter Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<AdapterMapping> adapterMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.ELEMENT_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PPattern newPattern, NotificationChain msgs) {
		PPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.ELEMENT_ADAPTER__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ELEMENT_ADAPTER__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ELEMENT_ADAPTER__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ELEMENT_ADAPTER__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdapterMapping> getAdapterMapping() {
		if (adapterMapping == null) {
			adapterMapping = new EObjectContainmentEList<AdapterMapping>(AdapterMapping.class, this, GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING);
		}
		return adapterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.ELEMENT_ADAPTER__PATTERN:
				return basicSetPattern(null, msgs);
			case GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING:
				return ((InternalEList<?>)getAdapterMapping()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.ELEMENT_ADAPTER__PATTERN:
				return getPattern();
			case GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING:
				return getAdapterMapping();
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
			case GuiPackage.ELEMENT_ADAPTER__PATTERN:
				setPattern((PPattern)newValue);
				return;
			case GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING:
				getAdapterMapping().clear();
				getAdapterMapping().addAll((Collection<? extends AdapterMapping>)newValue);
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
			case GuiPackage.ELEMENT_ADAPTER__PATTERN:
				setPattern((PPattern)null);
				return;
			case GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING:
				getAdapterMapping().clear();
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
			case GuiPackage.ELEMENT_ADAPTER__PATTERN:
				return pattern != null;
			case GuiPackage.ELEMENT_ADAPTER__ADAPTER_MAPPING:
				return adapterMapping != null && !adapterMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementAdapterImpl
