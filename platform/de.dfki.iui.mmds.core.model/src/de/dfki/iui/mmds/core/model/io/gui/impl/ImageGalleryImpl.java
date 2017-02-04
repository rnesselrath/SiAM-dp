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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.dfki.iui.mmds.core.model.base.Picture;
import de.dfki.iui.mmds.core.model.io.gui.ButtonBar;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.ImageGallery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Gallery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl#getButtonBar <em>Button Bar</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl#isIsSlideShow <em>Is Slide Show</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageGalleryImpl extends UIElementImpl implements ImageGallery {
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Picture> image;

	/**
	 * The cached value of the '{@link #getButtonBar() <em>Button Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonBar()
	 * @generated
	 * @ordered
	 */
	protected ButtonBar buttonBar;

	/**
	 * The default value of the '{@link #isIsSlideShow() <em>Is Slide Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSlideShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SLIDE_SHOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSlideShow() <em>Is Slide Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSlideShow()
	 * @generated
	 * @ordered
	 */
	protected boolean isSlideShow = IS_SLIDE_SHOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageGalleryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.IMAGE_GALLERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Picture> getImage() {
		if (image == null) {
			image = new EObjectResolvingEList<Picture>(Picture.class, this, GuiPackage.IMAGE_GALLERY__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonBar getButtonBar() {
		return buttonBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtonBar(ButtonBar newButtonBar, NotificationChain msgs) {
		ButtonBar oldButtonBar = buttonBar;
		buttonBar = newButtonBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE_GALLERY__BUTTON_BAR, oldButtonBar, newButtonBar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonBar(ButtonBar newButtonBar) {
		if (newButtonBar != buttonBar) {
			NotificationChain msgs = null;
			if (buttonBar != null)
				msgs = ((InternalEObject)buttonBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.IMAGE_GALLERY__BUTTON_BAR, null, msgs);
			if (newButtonBar != null)
				msgs = ((InternalEObject)newButtonBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.IMAGE_GALLERY__BUTTON_BAR, null, msgs);
			msgs = basicSetButtonBar(newButtonBar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE_GALLERY__BUTTON_BAR, newButtonBar, newButtonBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSlideShow() {
		return isSlideShow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSlideShow(boolean newIsSlideShow) {
		boolean oldIsSlideShow = isSlideShow;
		isSlideShow = newIsSlideShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.IMAGE_GALLERY__IS_SLIDE_SHOW, oldIsSlideShow, isSlideShow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.IMAGE_GALLERY__BUTTON_BAR:
				return basicSetButtonBar(null, msgs);
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
			case GuiPackage.IMAGE_GALLERY__IMAGE:
				return getImage();
			case GuiPackage.IMAGE_GALLERY__BUTTON_BAR:
				return getButtonBar();
			case GuiPackage.IMAGE_GALLERY__IS_SLIDE_SHOW:
				return isIsSlideShow();
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
			case GuiPackage.IMAGE_GALLERY__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Picture>)newValue);
				return;
			case GuiPackage.IMAGE_GALLERY__BUTTON_BAR:
				setButtonBar((ButtonBar)newValue);
				return;
			case GuiPackage.IMAGE_GALLERY__IS_SLIDE_SHOW:
				setIsSlideShow((Boolean)newValue);
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
			case GuiPackage.IMAGE_GALLERY__IMAGE:
				getImage().clear();
				return;
			case GuiPackage.IMAGE_GALLERY__BUTTON_BAR:
				setButtonBar((ButtonBar)null);
				return;
			case GuiPackage.IMAGE_GALLERY__IS_SLIDE_SHOW:
				setIsSlideShow(IS_SLIDE_SHOW_EDEFAULT);
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
			case GuiPackage.IMAGE_GALLERY__IMAGE:
				return image != null && !image.isEmpty();
			case GuiPackage.IMAGE_GALLERY__BUTTON_BAR:
				return buttonBar != null;
			case GuiPackage.IMAGE_GALLERY__IS_SLIDE_SHOW:
				return isSlideShow != IS_SLIDE_SHOW_EDEFAULT;
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
		result.append(" (isSlideShow: ");
		result.append(isSlideShow);
		result.append(')');
		return result.toString();
	}

} //ImageGalleryImpl
