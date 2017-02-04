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
package de.dfki.iui.mmds.core.model.io.gui;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add UI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElement <em>New Element</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElementRef <em>New Element Ref</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAddUIElement()
 * @model
 * @generated
 */
public interface AddUIElement extends UpdateInfo {
	/**
	 * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Id</em>' attribute.
	 * @see #setParentId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAddUIElement_ParentId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getParentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getParentId <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id</em>' attribute.
	 * @see #getParentId()
	 * @generated
	 */
	void setParentId(BString value);

	/**
	 * Returns the value of the '<em><b>New Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Element</em>' containment reference.
	 * @see #setNewElement(UIElement)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAddUIElement_NewElement()
	 * @model containment="true"
	 * @generated
	 */
	UIElement getNewElement();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElement <em>New Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Element</em>' containment reference.
	 * @see #getNewElement()
	 * @generated
	 */
	void setNewElement(UIElement value);

	/**
	 * Returns the value of the '<em><b>New Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Element Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Element Ref</em>' reference.
	 * @see #setNewElementRef(UIElement)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAddUIElement_NewElementRef()
	 * @model
	 * @generated
	 */
	UIElement getNewElementRef();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElementRef <em>New Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Element Ref</em>' reference.
	 * @see #getNewElementRef()
	 * @generated
	 */
	void setNewElementRef(UIElement value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAddUIElement_Position()
	 * @model default="-1" dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getPosition();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BInteger value);

} // AddUIElement
