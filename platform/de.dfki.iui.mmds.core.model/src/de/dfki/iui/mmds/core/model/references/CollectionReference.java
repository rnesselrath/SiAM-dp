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
package de.dfki.iui.mmds.core.model.references;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getPosition <em>Position</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getCollectionReference()
 * @model
 * @generated
 */
public interface CollectionReference extends ReferenceModel {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BInteger)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getCollectionReference_Position()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getPosition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BInteger value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getCollectionReference_Order()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getOrder();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BString value);

} // CollectionReference
