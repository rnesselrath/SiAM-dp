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

import de.dfki.iui.mmds.core.model.base.Picture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Image#isSmooth <em>Smooth</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Image#getFillMode <em>Fill Mode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Image#getLoadingIndicator <em>Loading Indicator</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Image#isCanManipulate <em>Can Manipulate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Image#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends UIElement {
	/**
	 * Returns the value of the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smooth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smooth</em>' attribute.
	 * @see #setSmooth(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage_Smooth()
	 * @model
	 * @generated
	 */
	boolean isSmooth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Image#isSmooth <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooth</em>' attribute.
	 * @see #isSmooth()
	 * @generated
	 */
	void setSmooth(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.ImageFillModes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Mode</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageFillModes
	 * @see #setFillMode(ImageFillModes)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage_FillMode()
	 * @model
	 * @generated
	 */
	ImageFillModes getFillMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getFillMode <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Mode</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageFillModes
	 * @see #getFillMode()
	 * @generated
	 */
	void setFillMode(ImageFillModes value);

	/**
	 * Returns the value of the '<em><b>Loading Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loading Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loading Indicator</em>' containment reference.
	 * @see #setLoadingIndicator(ProgressBar)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage_LoadingIndicator()
	 * @model containment="true"
	 * @generated
	 */
	ProgressBar getLoadingIndicator();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getLoadingIndicator <em>Loading Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Indicator</em>' containment reference.
	 * @see #getLoadingIndicator()
	 * @generated
	 */
	void setLoadingIndicator(ProgressBar value);

	/**
	 * Returns the value of the '<em><b>Can Manipulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Manipulate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manipulate</em>' attribute.
	 * @see #setCanManipulate(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage_CanManipulate()
	 * @model
	 * @generated
	 */
	boolean isCanManipulate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Image#isCanManipulate <em>Can Manipulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manipulate</em>' attribute.
	 * @see #isCanManipulate()
	 * @generated
	 */
	void setCanManipulate(boolean value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Picture)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getImage_Resource()
	 * @model required="true"
	 * @generated
	 */
	Picture getResource();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Picture value);

} // Image
