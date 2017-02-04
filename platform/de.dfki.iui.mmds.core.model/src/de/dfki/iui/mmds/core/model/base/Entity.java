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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entity is the most upper class in the class hierarchy for knowledge. Every class that describes knowledge in a domain should be derived from this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.Entity#getENTITY_ID <em>ENTITY ID</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends BObject {
	/**
	 * Returns the value of the '<em><b>ENTITY ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ENTITY ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the entity. This id should be unique for the complete environment and is used for entiy identification in the knowledge base.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ENTITY ID</em>' attribute.
	 * @see #setENTITY_ID(String)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getEntity_ENTITY_ID()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getENTITY_ID();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.Entity#getENTITY_ID <em>ENTITY ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ENTITY ID</em>' attribute.
	 * @see #getENTITY_ID()
	 * @generated
	 */
	void setENTITY_ID(String value);

} // Entity
