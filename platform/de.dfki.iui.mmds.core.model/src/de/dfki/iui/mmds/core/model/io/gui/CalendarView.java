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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A calendar view for selecting a date in a calendar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getCalendarView()
 * @model
 * @generated
 */
public interface CalendarView extends UIElement {
	/**
	 * Returns the value of the '<em><b>Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies which mode has to be used. Displaymode can be: Year / Week / Day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Mode</em>' attribute.
	 * @see #setDisplayMode(String)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getCalendarView_DisplayMode()
	 * @model
	 * @generated
	 */
	String getDisplayMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDisplayMode <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Mode</em>' attribute.
	 * @see #getDisplayMode()
	 * @generated
	 */
	void setDisplayMode(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getCalendarView_Date()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.Date"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // CalendarView
