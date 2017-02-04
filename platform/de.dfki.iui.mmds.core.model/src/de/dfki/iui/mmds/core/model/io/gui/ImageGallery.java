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

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.model.base.Picture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ImageGallery enables users to visualize a list of Images in a interactive manner.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getImage <em>Image</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getButtonBar <em>Button Bar</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#isIsSlideShow <em>Is Slide Show</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImageGallery()
 * @model
 * @generated
 */
public interface ImageGallery extends UIElement {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.Picture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImageGallery_Image()
	 * @model
	 * @generated
	 */
	EList<Picture> getImage();

	/**
	 * Returns the value of the '<em><b>Button Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Bar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Bar</em>' containment reference.
	 * @see #setButtonBar(ButtonBar)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImageGallery_ButtonBar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ButtonBar getButtonBar();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getButtonBar <em>Button Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Bar</em>' containment reference.
	 * @see #getButtonBar()
	 * @generated
	 */
	void setButtonBar(ButtonBar value);

	/**
	 * Returns the value of the '<em><b>Is Slide Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets if the gallery should be in slideshow mode.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Slide Show</em>' attribute.
	 * @see #setIsSlideShow(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImageGallery_IsSlideShow()
	 * @model
	 * @generated
	 */
	boolean isIsSlideShow();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#isIsSlideShow <em>Is Slide Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Slide Show</em>' attribute.
	 * @see #isIsSlideShow()
	 * @generated
	 */
	void setIsSlideShow(boolean value);

} // ImageGallery
