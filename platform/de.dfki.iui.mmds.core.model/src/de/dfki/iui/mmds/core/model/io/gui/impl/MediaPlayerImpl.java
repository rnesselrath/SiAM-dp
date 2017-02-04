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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.MediaResource;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.MediaPlayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#isIsPlaying <em>Is Playing</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getAutoPlay <em>Auto Play</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getShowControls <em>Show Controls</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaPlayerImpl extends UIElementImpl implements MediaPlayer {
	/**
	 * The default value of the '{@link #isIsPlaying() <em>Is Playing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlaying()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLAYING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlaying() <em>Is Playing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlaying()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlaying = IS_PLAYING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected MediaResource media;

	/**
	 * The default value of the '{@link #getAutoPlay() <em>Auto Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoPlay()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean AUTO_PLAY_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "false");

	/**
	 * The cached value of the '{@link #getAutoPlay() <em>Auto Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoPlay()
	 * @generated
	 * @ordered
	 */
	protected BBoolean autoPlay = AUTO_PLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowControls() <em>Show Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowControls()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean SHOW_CONTROLS_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "true");

	/**
	 * The cached value of the '{@link #getShowControls() <em>Show Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowControls()
	 * @generated
	 * @ordered
	 */
	protected BBoolean showControls = SHOW_CONTROLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger WIDTH_EDEFAULT = (BInteger)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBInteger(), "640");

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BInteger width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger HEIGHT_EDEFAULT = (BInteger)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBInteger(), "240");

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BInteger height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean VISIBLE_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "true");

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.MEDIA_PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlaying() {
		return isPlaying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlaying(boolean newIsPlaying) {
		boolean oldIsPlaying = isPlaying;
		isPlaying = newIsPlaying;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__IS_PLAYING, oldIsPlaying, isPlaying));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaResource getMedia() {
		if (media != null && media.eIsProxy()) {
			InternalEObject oldMedia = (InternalEObject)media;
			media = (MediaResource)eResolveProxy(oldMedia);
			if (media != oldMedia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.MEDIA_PLAYER__MEDIA, oldMedia, media));
			}
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaResource basicGetMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(MediaResource newMedia) {
		MediaResource oldMedia = media;
		media = newMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__MEDIA, oldMedia, media));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getAutoPlay() {
		return autoPlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoPlay(BBoolean newAutoPlay) {
		BBoolean oldAutoPlay = autoPlay;
		autoPlay = newAutoPlay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__AUTO_PLAY, oldAutoPlay, autoPlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getShowControls() {
		return showControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowControls(BBoolean newShowControls) {
		BBoolean oldShowControls = showControls;
		showControls = newShowControls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__SHOW_CONTROLS, oldShowControls, showControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BInteger newWidth) {
		BInteger oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BInteger newHeight) {
		BInteger oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MEDIA_PLAYER__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.MEDIA_PLAYER__IS_PLAYING:
				return isIsPlaying();
			case GuiPackage.MEDIA_PLAYER__MEDIA:
				if (resolve) return getMedia();
				return basicGetMedia();
			case GuiPackage.MEDIA_PLAYER__AUTO_PLAY:
				return getAutoPlay();
			case GuiPackage.MEDIA_PLAYER__SHOW_CONTROLS:
				return getShowControls();
			case GuiPackage.MEDIA_PLAYER__WIDTH:
				return getWidth();
			case GuiPackage.MEDIA_PLAYER__HEIGHT:
				return getHeight();
			case GuiPackage.MEDIA_PLAYER__VISIBLE:
				return getVisible();
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
			case GuiPackage.MEDIA_PLAYER__IS_PLAYING:
				setIsPlaying((Boolean)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__MEDIA:
				setMedia((MediaResource)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__AUTO_PLAY:
				setAutoPlay((BBoolean)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__SHOW_CONTROLS:
				setShowControls((BBoolean)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__WIDTH:
				setWidth((BInteger)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__HEIGHT:
				setHeight((BInteger)newValue);
				return;
			case GuiPackage.MEDIA_PLAYER__VISIBLE:
				setVisible((BBoolean)newValue);
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
			case GuiPackage.MEDIA_PLAYER__IS_PLAYING:
				setIsPlaying(IS_PLAYING_EDEFAULT);
				return;
			case GuiPackage.MEDIA_PLAYER__MEDIA:
				setMedia((MediaResource)null);
				return;
			case GuiPackage.MEDIA_PLAYER__AUTO_PLAY:
				setAutoPlay(AUTO_PLAY_EDEFAULT);
				return;
			case GuiPackage.MEDIA_PLAYER__SHOW_CONTROLS:
				setShowControls(SHOW_CONTROLS_EDEFAULT);
				return;
			case GuiPackage.MEDIA_PLAYER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GuiPackage.MEDIA_PLAYER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GuiPackage.MEDIA_PLAYER__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case GuiPackage.MEDIA_PLAYER__IS_PLAYING:
				return isPlaying != IS_PLAYING_EDEFAULT;
			case GuiPackage.MEDIA_PLAYER__MEDIA:
				return media != null;
			case GuiPackage.MEDIA_PLAYER__AUTO_PLAY:
				return AUTO_PLAY_EDEFAULT == null ? autoPlay != null : !AUTO_PLAY_EDEFAULT.equals(autoPlay);
			case GuiPackage.MEDIA_PLAYER__SHOW_CONTROLS:
				return SHOW_CONTROLS_EDEFAULT == null ? showControls != null : !SHOW_CONTROLS_EDEFAULT.equals(showControls);
			case GuiPackage.MEDIA_PLAYER__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case GuiPackage.MEDIA_PLAYER__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case GuiPackage.MEDIA_PLAYER__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
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
		result.append(" (isPlaying: ");
		result.append(isPlaying);
		result.append(", autoPlay: ");
		result.append(autoPlay);
		result.append(", showControls: ");
		result.append(showControls);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //MediaPlayerImpl
