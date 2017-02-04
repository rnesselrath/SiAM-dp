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

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.StyleSheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The application is the definition of the user interface and its interactions possibilities. Each application consists only of one top-level "window", but it can have additional modal dialog boxes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getWindow <em>Window</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getStyleResource <em>Style Resource</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIApplication()
 * @model
 * @generated
 */
public interface GUIApplication extends GUIRequest {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root element of the application display. The rendering engine draws this so that it convers the entire available space. This is usually a container used as a basis for further controls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(Window)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIApplication_Window()
	 * @model required="true"
	 * @generated
	 */
	Window getWindow();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(Window value);

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the application. This is sometimes displayed in the application title bar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIApplication_ApplicationId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getApplicationId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(BString value);

	/**
	 * Returns the value of the '<em><b>Style Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Resource</em>' reference.
	 * @see #setStyleResource(StyleSheet)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getGUIApplication_StyleResource()
	 * @model
	 * @generated
	 */
	StyleSheet getStyleResource();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getStyleResource <em>Style Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Resource</em>' reference.
	 * @see #getStyleResource()
	 * @generated
	 */
	void setStyleResource(StyleSheet value);

} // GUIApplication
