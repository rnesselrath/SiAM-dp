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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.PresentationState#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.PresentationState#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getPresentationState()
 * @model
 * @generated
 */
public interface PresentationState extends DeviceState {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getPresentationState_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.PresentationState#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.PresentationStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationStateEnum
	 * @see #setState(PresentationStateEnum)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getPresentationState_State()
	 * @model required="true"
	 * @generated
	 */
	PresentationStateEnum getState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.PresentationState#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationStateEnum
	 * @see #getState()
	 * @generated
	 */
	void setState(PresentationStateEnum value);

} // PresentationState
