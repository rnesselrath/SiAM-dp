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

import de.dfki.iui.mmds.core.model.base.UnitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getNumber <em>Number</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getTemporalFrame <em>Temporal Frame</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getTemporalReference()
 * @model
 * @generated
 */
public interface TemporalReference extends ReferenceModel {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.base.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see #setUnit(UnitType)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getTemporalReference_Unit()
	 * @model
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BInteger)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getTemporalReference_Number()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getNumber();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BInteger value);

	/**
	 * Returns the value of the '<em><b>Temporal Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Frame</em>' attribute.
	 * @see #setTemporalFrame(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getTemporalReference_TemporalFrame()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getTemporalFrame();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getTemporalFrame <em>Temporal Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Frame</em>' attribute.
	 * @see #getTemporalFrame()
	 * @generated
	 */
	void setTemporalFrame(BString value);

} // TemporalReference
