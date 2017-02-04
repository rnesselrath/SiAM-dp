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

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import de.dfki.iui.mmds.core.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getRelatum <em>Relatum</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getSpatialExpression <em>Spatial Expression</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getSpatialReference()
 * @model
 * @generated
 */
public interface SpatialReference extends ReferenceModel {
	/**
	 * Returns the value of the '<em><b>Relatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relatum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatum</em>' containment reference.
	 * @see #setRelatum(Entity)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getSpatialReference_Relatum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entity getRelatum();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getRelatum <em>Relatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatum</em>' containment reference.
	 * @see #getRelatum()
	 * @generated
	 */
	void setRelatum(Entity value);

	/**
	 * Returns the value of the '<em><b>Spatial Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spatial Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Expression</em>' attribute.
	 * @see #setSpatialExpression(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getSpatialReference_SpatialExpression()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getSpatialExpression();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getSpatialExpression <em>Spatial Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Expression</em>' attribute.
	 * @see #getSpatialExpression()
	 * @generated
	 */
	void setSpatialExpression(BString value);

} // SpatialReference
