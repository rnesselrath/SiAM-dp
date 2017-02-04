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

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import java.net.URL;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A non-standard representation of the data. This has to be accompanied by a format identifier. Should only be processed/interpreted by components that support this particular format. Using this method, special representations can quickly be provided without extending the underlying model. Examples are custom GUIs that should be integrated and support only a limited communication protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getUri <em>Uri</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCustomFormat()
 * @model
 * @generated
 */
public interface CustomFormat extends InputRepresentation, OutputRepresentation {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' map.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCustomFormat_Content()
	 * @model mapType="de.dfki.iui.mmds.core.model.base.StringToBStringMapEntry<org.eclipse.emf.ecore.EString, de.dfki.iui.mmds.core.model.base.BString>"
	 * @generated
	 */
	EMap<String, BString> getContent();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL from which the custom format data should be retrieved if desired (if it is considered too large to include in the document).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URL)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCustomFormat_Uri()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.Url"
	 * @generated
	 */
	URL getUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URL value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getCustomFormat_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CustomFormat
