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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A margin is the space between an element and the elements to its top, left, bottom and right.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getTop <em>Top</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getRight <em>Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Margin#isIsPercentage <em>Is Percentage</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin()
 * @model
 * @generated
 */
public interface Margin extends EObject {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see #setTop(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin_Top()
	 * @model
	 * @generated
	 */
	int getTop();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(int value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin_Left()
	 * @model
	 * @generated
	 */
	int getLeft();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(int value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin_Right()
	 * @model
	 * @generated
	 */
	int getRight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(int value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see #setBottom(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin_Bottom()
	 * @model
	 * @generated
	 */
	int getBottom();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(int value);

	/**
	 * Returns the value of the '<em><b>Is Percentage</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Percentage</em>' attribute.
	 * @see #setIsPercentage(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getMargin_IsPercentage()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsPercentage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#isIsPercentage <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage</em>' attribute.
	 * @see #isIsPercentage()
	 * @generated
	 */
	void setIsPercentage(boolean value);

} // Margin
