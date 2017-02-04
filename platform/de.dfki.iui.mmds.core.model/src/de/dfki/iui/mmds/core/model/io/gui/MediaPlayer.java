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
package de.dfki.iui.mmds.core.model.io.gui;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.MediaResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MediaPlayer is a visual component that will allow the playback of multimedia files (sound,music or videos) within a defined screen space.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#isIsPlaying <em>Is Playing</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getMedia <em>Media</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getAutoPlay <em>Auto Play</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getShowControls <em>Show Controls</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer()
 * @model
 * @generated
 */
public interface MediaPlayer extends UIElement {
	/**
	 * Returns the value of the '<em><b>Is Playing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A visual VideoPlayer (with buttons and video output)
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Playing</em>' attribute.
	 * @see #setIsPlaying(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_IsPlaying()
	 * @model
	 * @generated
	 */
	boolean isIsPlaying();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#isIsPlaying <em>Is Playing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Playing</em>' attribute.
	 * @see #isIsPlaying()
	 * @generated
	 */
	void setIsPlaying(boolean value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference.
	 * @see #setMedia(MediaResource)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_Media()
	 * @model
	 * @generated
	 */
	MediaResource getMedia();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getMedia <em>Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(MediaResource value);

	/**
	 * Returns the value of the '<em><b>Auto Play</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Play</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Play</em>' attribute.
	 * @see #setAutoPlay(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_AutoPlay()
	 * @model default="false" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getAutoPlay();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getAutoPlay <em>Auto Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Play</em>' attribute.
	 * @see #getAutoPlay()
	 * @generated
	 */
	void setAutoPlay(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Show Controls</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Controls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Controls</em>' attribute.
	 * @see #setShowControls(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_ShowControls()
	 * @model default="true" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getShowControls();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getShowControls <em>Show Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Controls</em>' attribute.
	 * @see #getShowControls()
	 * @generated
	 */
	void setShowControls(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"640"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_Width()
	 * @model default="640" dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getWidth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"240"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_Height()
	 * @model default="240" dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getHeight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BInteger value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMediaPlayer_Visible()
	 * @model default="true" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getVisible();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(BBoolean value);

} // MediaPlayer
