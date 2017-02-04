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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProgressBar control provides a visual representation of the progress of a task over time. There are two types of ProgressBar controls: determinate and indeterminate. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Progression#getProgressionPercentage <em>Progression Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.Progression#isDeterminate <em>Determinate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgression()
 * @model
 * @generated
 */
public interface Progression extends UIElement {
	/**
	 * Returns the value of the '<em><b>Progression Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progression Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progression Percentage</em>' attribute.
	 * @see #setProgressionPercentage(float)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgression_ProgressionPercentage()
	 * @model
	 * @generated
	 */
	float getProgressionPercentage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Progression#getProgressionPercentage <em>Progression Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progression Percentage</em>' attribute.
	 * @see #getProgressionPercentage()
	 * @generated
	 */
	void setProgressionPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determinate is a linear representation of the progress of a task over time otherwise displays a indeterminate animation (loader spin or sandhour).
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Determinate</em>' attribute.
	 * @see #setDeterminate(boolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getProgression_Determinate()
	 * @model
	 * @generated
	 */
	boolean isDeterminate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.Progression#isDeterminate <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determinate</em>' attribute.
	 * @see #isDeterminate()
	 * @generated
	 */
	void setDeterminate(boolean value);

} // Progression
