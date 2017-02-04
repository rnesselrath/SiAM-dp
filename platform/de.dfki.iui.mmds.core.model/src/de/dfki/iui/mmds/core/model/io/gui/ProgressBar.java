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

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProgressBar control provides a visual representation of the progress of a task over time. There are two types of ProgressBar controls: determinate and indeterminate. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getDeterminate <em>Determinate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgressBar()
 * @model
 * @generated
 */
public interface ProgressBar extends UIElement {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgressBar_Percentage()
	 * @model default="10" dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getPercentage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(BInteger value);

	/**
	 * Returns the value of the '<em><b>Determinate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determinate is a linear representation of the progress of a task over time otherwise displays a indeterminate animation (loader spin or sandhour).
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Determinate</em>' attribute.
	 * @see #setDeterminate(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgressBar_Determinate()
	 * @model default="true" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getDeterminate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getDeterminate <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determinate</em>' attribute.
	 * @see #getDeterminate()
	 * @generated
	 */
	void setDeterminate(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgressBar_Max()
	 * @model default="100" dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getMax();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(BInteger value);

} // ProgressBar
