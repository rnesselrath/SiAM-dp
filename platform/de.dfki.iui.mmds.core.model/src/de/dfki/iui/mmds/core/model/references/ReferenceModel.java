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

import de.dfki.iui.mmds.core.model.pattern.PObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getReferencePattern <em>Reference Pattern</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getHasMorphoSyntacticDecomposition <em>Has Morpho Syntactic Decomposition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#isIsMany <em>Is Many</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getReferenceModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReferenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Pattern</em>' containment reference.
	 * @see #setReferencePattern(PObject)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getReferenceModel_ReferencePattern()
	 * @model containment="true"
	 * @generated
	 */
	PObject getReferencePattern();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getReferencePattern <em>Reference Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Pattern</em>' containment reference.
	 * @see #getReferencePattern()
	 * @generated
	 */
	void setReferencePattern(PObject value);

	/**
	 * Returns the value of the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Morpho Syntactic Decomposition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Morpho Syntactic Decomposition</em>' containment reference.
	 * @see #setHasMorphoSyntacticDecomposition(LingInfo)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getReferenceModel_HasMorphoSyntacticDecomposition()
	 * @model containment="true"
	 * @generated
	 */
	LingInfo getHasMorphoSyntacticDecomposition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getHasMorphoSyntacticDecomposition <em>Has Morpho Syntactic Decomposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Morpho Syntactic Decomposition</em>' containment reference.
	 * @see #getHasMorphoSyntacticDecomposition()
	 * @generated
	 */
	void setHasMorphoSyntacticDecomposition(LingInfo value);

	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see #setIsMany(boolean)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getReferenceModel_IsMany()
	 * @model
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

} // ReferenceModel
