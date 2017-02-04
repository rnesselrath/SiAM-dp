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

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#getArrayAdapter <em>Array Adapter</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractContainer extends UIElement {
	/**
	 * Returns the value of the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Adapter</em>' containment reference.
	 * @see #setArrayAdapter(ArrayAdapter)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractContainer_ArrayAdapter()
	 * @model containment="true"
	 * @generated
	 */
	ArrayAdapter getArrayAdapter();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#getArrayAdapter <em>Array Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Adapter</em>' containment reference.
	 * @see #getArrayAdapter()
	 * @generated
	 */
	void setArrayAdapter(ArrayAdapter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * collects the  elements contained in the container. This can be any type of UIElement.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<UIElement> contains();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addChild(UIElement uiElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beforeIndexDataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	void addChild(BInteger beforeIndex, UIElement uiElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeChild(UIElement uiElement);

} // AbstractContainer
