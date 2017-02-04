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

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.references.ReferenceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getReference <em>Reference</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getResolved <em>Resolved</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent()
 * @model
 * @generated
 */
public interface SemanticContent extends BObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Entity)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent_Content()
	 * @model containment="true"
	 * @generated
	 */
	Entity getContent();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Entity value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceModel)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent_Reference()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceModel getReference();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceModel value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState
	 * @see #setResolved(ResolveState)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent_Resolved()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	ResolveState getResolved();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(ResolveState value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent_Id()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BString value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(long)
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage#getSemanticContent_Validity()
	 * @model default="-1"
	 * @generated
	 */
	long getValidity();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(long value);

} // SemanticContent
