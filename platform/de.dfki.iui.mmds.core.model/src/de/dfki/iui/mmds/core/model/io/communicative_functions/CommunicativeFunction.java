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
package de.dfki.iui.mmds.core.model.io.communicative_functions;

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicative Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getSemanticContent <em>Semantic Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#isIsEllipsis <em>Is Ellipsis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getKnowledgeItem <em>Knowledge Item</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getCommunicativeFunction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CommunicativeFunction extends BObject {
	/**
	 * Returns the value of the '<em><b>Semantic Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Content</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getCommunicativeFunction_SemanticContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticContent> getSemanticContent();

	/**
	 * Returns the value of the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ellipsis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ellipsis</em>' attribute.
	 * @see #setIsEllipsis(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getCommunicativeFunction_IsEllipsis()
	 * @model
	 * @generated
	 */
	boolean isIsEllipsis();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#isIsEllipsis <em>Is Ellipsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ellipsis</em>' attribute.
	 * @see #isIsEllipsis()
	 * @generated
	 */
	void setIsEllipsis(boolean value);

	/**
	 * Returns the value of the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Item</em>' attribute.
	 * @see #setKnowledgeItem(String)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getCommunicativeFunction_KnowledgeItem()
	 * @model
	 * @generated
	 */
	String getKnowledgeItem();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getKnowledgeItem <em>Knowledge Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Item</em>' attribute.
	 * @see #getKnowledgeItem()
	 * @generated
	 */
	void setKnowledgeItem(String value);

} // CommunicativeFunction
