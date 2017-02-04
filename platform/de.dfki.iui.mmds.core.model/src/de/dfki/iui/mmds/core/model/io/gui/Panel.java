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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Panel layout container may include a title bar, a title, a status message area (in the title bar), and a content area for its children.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Panel#getTitleBarText <em>Title Bar Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Panel#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends UIElement {
	/**
	 * Returns the value of the '<em><b>Title Bar Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text to be displayed in the titlebar of the Panel (optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title Bar Text</em>' attribute.
	 * @see #setTitleBarText(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getPanel_TitleBarText()
	 * @model
	 * @generated
	 */
	String getTitleBarText();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Panel#getTitleBarText <em>Title Bar Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Bar Text</em>' attribute.
	 * @see #getTitleBarText()
	 * @generated
	 */
	void setTitleBarText(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(UIElement)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getPanel_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UIElement getContent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Panel#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(UIElement value);

} // Panel
