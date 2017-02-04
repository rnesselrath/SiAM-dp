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
 * A representation of the model object '<em><b>Display Context View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a view that shows the content of another display context in SiAM-dp. The HTML renderer generates an IFrame with the URI of the rendered referenced display context.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.DisplayContextView#getDisplayContextName <em>Display Context Name</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDisplayContextView()
 * @model
 * @generated
 */
public interface DisplayContextView extends UIElement {
	/**
	 * Returns the value of the '<em><b>Display Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Context Name</em>' attribute.
	 * @see #setDisplayContextName(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDisplayContextView_DisplayContextName()
	 * @model
	 * @generated
	 */
	String getDisplayContextName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.DisplayContextView#getDisplayContextName <em>Display Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Context Name</em>' attribute.
	 * @see #getDisplayContextName()
	 * @generated
	 */
	void setDisplayContextName(String value);

} // DisplayContextView
