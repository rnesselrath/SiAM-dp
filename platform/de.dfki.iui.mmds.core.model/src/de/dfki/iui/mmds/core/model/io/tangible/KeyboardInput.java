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
package de.dfki.iui.mmds.core.model.io.tangible;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyboard Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#getKey <em>Key</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isIsPressed <em>Is Pressed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isCanNotifyRelease <em>Can Notify Release</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getKeyboardInput()
 * @model
 * @generated
 */
public interface KeyboardInput extends TangibleInput {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getKeyboardInput_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pressed</em>' attribute.
	 * @see #setIsPressed(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getKeyboardInput_IsPressed()
	 * @model
	 * @generated
	 */
	boolean isIsPressed();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isIsPressed <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pressed</em>' attribute.
	 * @see #isIsPressed()
	 * @generated
	 */
	void setIsPressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Notify Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Notify Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Notify Release</em>' attribute.
	 * @see #setCanNotifyRelease(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getKeyboardInput_CanNotifyRelease()
	 * @model
	 * @generated
	 */
	boolean isCanNotifyRelease();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isCanNotifyRelease <em>Can Notify Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Notify Release</em>' attribute.
	 * @see #isCanNotifyRelease()
	 * @generated
	 */
	void setCanNotifyRelease(boolean value);

} // KeyboardInput
