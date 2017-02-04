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

import de.dfki.iui.mmds.core.model.base.Picture;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.Image;
import de.dfki.iui.mmds.core.model.io.gui.ImageFillModes;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl#isSmooth <em>Smooth</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl#getFillMode <em>Fill Mode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl#getLoadingIndicator <em>Loading Indicator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl#isCanManipulate <em>Can Manipulate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends UIElementImpl implements Image {
	/**
	 * The default value of the '{@link #isSmooth() <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmooth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMOOTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSmooth() <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmooth()
	 * @generated
	 * @ordered
	 */
	protected boolean smooth = SMOOTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected static final ImageFillModes FILL_MODE_EDEFAULT = ImageFillModes.ORIGINAL;

	/**
	 * The cached value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected ImageFillModes fillMode = FILL_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadingIndicator() <em>Loading Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadingIndicator()
	 * @generated
	 * @ordered
	 */
	protected ProgressBar loadingIndicator;

	/**
	 * The default value of the '{@link #isCanManipulate() <em>Can Manipulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManipulate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANIPULATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanManipulate() <em>Can Manipulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManipulate()
	 * @generated
	 * @ordered
	 */
	protected boolean canManipulate = CAN_MANIPULATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Picture resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmooth() {
		return smooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmooth(boolean newSmooth) {
		boolean oldSmooth = smooth;
		smooth = newSmooth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__SMOOTH, oldSmooth, smooth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFillModes getFillMode() {
		return fillMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillMode(ImageFillModes newFillMode) {
		ImageFillModes oldFillMode = fillMode;
		fillMode = newFillMode == null ? FILL_MODE_EDEFAULT : newFillMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__FILL_MODE, oldFillMode, fillMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar getLoadingIndicator() {
		return loadingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadingIndicator(ProgressBar newLoadingIndicator, NotificationChain msgs) {
		ProgressBar oldLoadingIndicator = loadingIndicator;
		loadingIndicator = newLoadingIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__LOADING_INDICATOR, oldLoadingIndicator, newLoadingIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadingIndicator(ProgressBar newLoadingIndicator) {
		if (newLoadingIndicator != loadingIndicator) {
			NotificationChain msgs = null;
			if (loadingIndicator != null)
				msgs = ((InternalEObject)loadingIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.IMAGE__LOADING_INDICATOR, null, msgs);
			if (newLoadingIndicator != null)
				msgs = ((InternalEObject)newLoadingIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.IMAGE__LOADING_INDICATOR, null, msgs);
			msgs = basicSetLoadingIndicator(newLoadingIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__LOADING_INDICATOR, newLoadingIndicator, newLoadingIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanManipulate() {
		return canManipulate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanManipulate(boolean newCanManipulate) {
		boolean oldCanManipulate = canManipulate;
		canManipulate = newCanManipulate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__CAN_MANIPULATE, oldCanManipulate, canManipulate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picture getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Picture)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.IMAGE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picture basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Picture newResource) {
		Picture oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.IMAGE__LOADING_INDICATOR:
				return basicSetLoadingIndicator(null, msgs);
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
			case GuiPackage.IMAGE__SMOOTH:
				return isSmooth();
			case GuiPackage.IMAGE__FILL_MODE:
				return getFillMode();
			case GuiPackage.IMAGE__LOADING_INDICATOR:
				return getLoadingIndicator();
			case GuiPackage.IMAGE__CAN_MANIPULATE:
				return isCanManipulate();
			case GuiPackage.IMAGE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case GuiPackage.IMAGE__SMOOTH:
				setSmooth((Boolean)newValue);
				return;
			case GuiPackage.IMAGE__FILL_MODE:
				setFillMode((ImageFillModes)newValue);
				return;
			case GuiPackage.IMAGE__LOADING_INDICATOR:
				setLoadingIndicator((ProgressBar)newValue);
				return;
			case GuiPackage.IMAGE__CAN_MANIPULATE:
				setCanManipulate((Boolean)newValue);
				return;
			case GuiPackage.IMAGE__RESOURCE:
				setResource((Picture)newValue);
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
			case GuiPackage.IMAGE__SMOOTH:
				setSmooth(SMOOTH_EDEFAULT);
				return;
			case GuiPackage.IMAGE__FILL_MODE:
				setFillMode(FILL_MODE_EDEFAULT);
				return;
			case GuiPackage.IMAGE__LOADING_INDICATOR:
				setLoadingIndicator((ProgressBar)null);
				return;
			case GuiPackage.IMAGE__CAN_MANIPULATE:
				setCanManipulate(CAN_MANIPULATE_EDEFAULT);
				return;
			case GuiPackage.IMAGE__RESOURCE:
				setResource((Picture)null);
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
			case GuiPackage.IMAGE__SMOOTH:
				return smooth != SMOOTH_EDEFAULT;
			case GuiPackage.IMAGE__FILL_MODE:
				return fillMode != FILL_MODE_EDEFAULT;
			case GuiPackage.IMAGE__LOADING_INDICATOR:
				return loadingIndicator != null;
			case GuiPackage.IMAGE__CAN_MANIPULATE:
				return canManipulate != CAN_MANIPULATE_EDEFAULT;
			case GuiPackage.IMAGE__RESOURCE:
				return resource != null;
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
		result.append(" (smooth: ");
		result.append(smooth);
		result.append(", fillMode: ");
		result.append(fillMode);
		result.append(", canManipulate: ");
		result.append(canManipulate);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
