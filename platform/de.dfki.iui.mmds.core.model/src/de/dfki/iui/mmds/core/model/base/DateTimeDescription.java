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
package de.dfki.iui.mmds.core.model.base;

import java.time.LocalDate;
import java.time.LocalDateTime;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Date Time Description</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A datetime description has the following properties/fields: unitType, year, month, week, day, dayOfWeek, dayOfYear, hour, minute, second, and timeZone. The property unitType specifies the temporal unit type of the datetime description.
 * For example, the temporal unit type of 10:30 is minute (unitMinute), and the temporal unit type of March 20, 2006 is day (unitDay). The unit type is required. With a given temporal unit type, all the fields/properties for smaller units will be ignored. For instance, if the temporal unit type is day (unitDay), the values of the field/property hour, minute, and second, if present, will be ignored.
 * 
 * http://www.w3.org/TR/owl-time/
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getSecond <em>Second</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMinute <em>Minute</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getHour <em>Hour</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDay <em>Day</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfYear <em>Day Of Year</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMonth <em>Month</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription()
 * @model
 * @generated
 */
public interface DateTimeDescription extends Entity {
	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute. The
	 * default value is <code>"unitSecond"</code>. The literals are from the
	 * enumeration {@link de.dfki.iui.mmds.core.model.base.UnitType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see #setUnitType(UnitType)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_UnitType()
	 * @model default="unitSecond" required="true"
	 * @generated
	 */
	UnitType getUnitType();

	/**
	 * Sets the value of the '
	 * {@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getUnitType
	 * <em>Unit Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit Type</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(UnitType value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(BInteger)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Second()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getSecond();

	/**
	 * Sets the value of the '
	 * {@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getSecond
	 * <em>Second</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(BInteger value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(BInteger)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Minute()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getMinute();

	/**
	 * Sets the value of the '
	 * {@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMinute
	 * <em>Minute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(BInteger value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(BInteger)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Hour()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getHour();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(BInteger value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(BInteger)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Day()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getDay();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(BInteger value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see #isSetDayOfWeek()
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_DayOfWeek()
	 * @model unsettable="true" dataType="de.dfki.iui.mmds.core.model.base.DayOfWeekObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DayOfWeek getDayOfWeek();

	/**
	 * Returns whether the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfWeek <em>Day Of Week</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Of Week</em>' attribute is set.
	 * @see #getDayOfWeek()
	 * @generated
	 */
	boolean isSetDayOfWeek();

	/**
	 * Returns the value of the '<em><b>Day Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Year</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Year</em>' attribute.
	 * @see #isSetDayOfYear()
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_DayOfYear()
	 * @model unsettable="true" dataType="de.dfki.iui.mmds.core.model.base.BInteger" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	BInteger getDayOfYear();

	/**
	 * Returns whether the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfYear <em>Day Of Year</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Of Year</em>' attribute is set.
	 * @see #getDayOfYear()
	 * @generated
	 */
	boolean isSetDayOfYear();

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(Month)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Month()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.MonthObject"
	 * @generated
	 */
	Month getMonth();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(Month value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(BInteger)
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getDateTimeDescription_Year()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getYear();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(BInteger value);

	public LocalDateTime getLocalDateTime();

	public void setLocalDateTime(LocalDateTime dateTime);

	public LocalDate getLocalDate();

	public void setLocalDate(LocalDate date);

} // DateTimeDescription
