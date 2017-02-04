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
package de.dfki.iui.mmds.core.model.io;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Servlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The service instance opens a browser that shows content that is created by the HTML generator of SiAM-dp.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.HtmlServlet#getFragmentName <em>Fragment Name</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getHtmlServlet()
 * @model
 * @generated
 */
public interface HtmlServlet extends CommunicationInfo {
	/**
	 * Returns the value of the '<em><b>Fragment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI fragment suffix of the retrieved web page.
	 * 
	 * The jetty server in SiAM uses the following URL for browser content:
	 * http://<host>:<jetty-port>/mmds/html/gui/<fragmentName>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment Name</em>' attribute.
	 * @see #setFragmentName(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getHtmlServlet_FragmentName()
	 * @model
	 * @generated
	 */
	String getFragmentName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.HtmlServlet#getFragmentName <em>Fragment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Name</em>' attribute.
	 * @see #getFragmentName()
	 * @generated
	 */
	void setFragmentName(String value);

} // HtmlServlet
