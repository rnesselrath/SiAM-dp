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
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getMargin <em>Margin</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout()
 * @model abstract="true"
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance of the element to its surroundings (e.g. other elements in the container).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin</em>' containment reference.
	 * @see #setMargin(Margin)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout_Margin()
	 * @model containment="true"
	 * @generated
	 */
	Margin getMargin();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getMargin <em>Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' containment reference.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(Margin value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #setHorizontalAlignment(Alignment)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout_HorizontalAlignment()
	 * @model
	 * @generated
	 */
	Alignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.io.gui.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #setVerticalAlignment(Alignment)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getLayout_VerticalAlignment()
	 * @model
	 * @generated
	 */
	Alignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(Alignment value);

} // Layout
