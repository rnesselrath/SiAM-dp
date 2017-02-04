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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ling Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.LingInfo#getCase <em>Case</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.LingInfo#getGender <em>Gender</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.LingInfo#getNumber <em>Number</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.references.LingInfo#getPartOfSpeech <em>Part Of Speech</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getLingInfo()
 * @model
 * @generated
 */
public interface LingInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getLingInfo_Case()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getCase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(BString value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getLingInfo_Gender()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getGender();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(BString value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getLingInfo_Number()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getNumber();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BString value);

	/**
	 * Returns the value of the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Speech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Speech</em>' attribute.
	 * @see #setPartOfSpeech(BString)
	 * @see de.dfki.iui.mmds.core.model.references.ReferencesPackage#getLingInfo_PartOfSpeech()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getPartOfSpeech();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getPartOfSpeech <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of Speech</em>' attribute.
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	void setPartOfSpeech(BString value);

} // LingInfo
