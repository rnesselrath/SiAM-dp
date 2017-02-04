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
package de.dfki.iui.mmds.core.model.base;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.EntityResource#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.EntityResource#isAddToKnowledgeManager <em>Add To Knowledge Manager</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getEntityResource()
 * @model
 * @generated
 */
public interface EntityResource extends Resource {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getEntityResource_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getContent();

	/**
	 * Returns the value of the '<em><b>Add To Knowledge Manager</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add To Knowledge Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add To Knowledge Manager</em>' attribute.
	 * @see #setAddToKnowledgeManager(boolean)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getEntityResource_AddToKnowledgeManager()
	 * @model default="false"
	 * @generated
	 */
	boolean isAddToKnowledgeManager();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.EntityResource#isAddToKnowledgeManager <em>Add To Knowledge Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add To Knowledge Manager</em>' attribute.
	 * @see #isAddToKnowledgeManager()
	 * @generated
	 */
	void setAddToKnowledgeManager(boolean value);
} // EntityResource
