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

import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammarID <em>Grammar ID</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateGrammar()
 * @model
 * @generated
 */
public interface UpdateGrammar extends DeviceMode {
	/**
	 * Returns the value of the '<em><b>Grammar ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar ID</em>' attribute.
	 * @see #setGrammarID(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateGrammar_GrammarID()
	 * @model required="true"
	 * @generated
	 */
	String getGrammarID();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammarID <em>Grammar ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar ID</em>' attribute.
	 * @see #getGrammarID()
	 * @generated
	 */
	void setGrammarID(String value);

	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar</em>' containment reference.
	 * @see #setGrammar(DocumentRoot)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateGrammar_Grammar()
	 * @model containment="true" required="true"
	 *        annotation="http://de.dfki.iui/TypeMapping dotnet='opaque'"
	 * @generated
	 */
	DocumentRoot getGrammar();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammar <em>Grammar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar</em>' containment reference.
	 * @see #getGrammar()
	 * @generated
	 */
	void setGrammar(DocumentRoot value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getUpdateGrammar_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // UpdateGrammar
