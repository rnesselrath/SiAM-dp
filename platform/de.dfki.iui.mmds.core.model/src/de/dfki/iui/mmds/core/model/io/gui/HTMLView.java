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

import java.net.URL;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a webview which can show a HTML based document specified in the source parameter
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getSource <em>Source</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getLoadingIndicator <em>Loading Indicator</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getHTMLView()
 * @model
 * @generated
 */
public interface HTMLView extends UIElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getHTMLView_Content()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getContent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(BString value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the document loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(URL)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getHTMLView_Source()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.Url"
	 * @generated
	 */
	URL getSource();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(URL value);

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
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getHTMLView_LoadingIndicator()
	 * @model containment="true"
	 * @generated
	 */
	ProgressBar getLoadingIndicator();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getLoadingIndicator <em>Loading Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Indicator</em>' containment reference.
	 * @see #getLoadingIndicator()
	 * @generated
	 */
	void setLoadingIndicator(ProgressBar value);

} // HTMLView
