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
package de.dfki.iui.mmds.core.model.base.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.DateTimeDescription;
import de.dfki.iui.mmds.core.model.base.DayOfWeek;
import de.dfki.iui.mmds.core.model.base.Month;
import de.dfki.iui.mmds.core.model.base.UnitType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Date Time Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getDay <em>Day</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getDayOfYear <em>Day Of Year</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTimeDescriptionImpl extends EntityImpl implements DateTimeDescription {
	/**
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType UNIT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected UnitType unitType = UNIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected BInteger second = SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected BInteger minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected BInteger hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected BInteger day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDayOfYear() <em>Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger DAY_OF_YEAR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Month MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected Month month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected BInteger year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.DATE_TIME_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitType(UnitType newUnitType) {
		UnitType oldUnitType = unitType;
		unitType = newUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__UNIT_TYPE, oldUnitType, unitType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(BInteger newSecond) {
		BInteger oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(BInteger newMinute) {
		BInteger oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHour(BInteger newHour) {
		BInteger oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(BInteger newDay) {
		BInteger oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public DayOfWeek getDayOfWeek() {
		if (getLocalDate() == null)
			return null;
		return DayOfWeek.get(getLocalDate().getDayOfWeek().ordinal());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isSetDayOfWeek() {
		return getLocalDate() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public BInteger getDayOfYear() {
		if (getLocalDate() == null)
			return null;
		return new BInteger(getLocalDate().getDayOfYear());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isSetDayOfYear() {
		return getLocalDate() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Month getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(Month newMonth) {
		Month oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInteger getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(BInteger newYear) {
		BInteger oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATE_TIME_DESCRIPTION__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.DATE_TIME_DESCRIPTION__UNIT_TYPE:
				return getUnitType();
			case BasePackage.DATE_TIME_DESCRIPTION__SECOND:
				return getSecond();
			case BasePackage.DATE_TIME_DESCRIPTION__MINUTE:
				return getMinute();
			case BasePackage.DATE_TIME_DESCRIPTION__HOUR:
				return getHour();
			case BasePackage.DATE_TIME_DESCRIPTION__DAY:
				return getDay();
			case BasePackage.DATE_TIME_DESCRIPTION__DAY_OF_WEEK:
				return getDayOfWeek();
			case BasePackage.DATE_TIME_DESCRIPTION__DAY_OF_YEAR:
				return getDayOfYear();
			case BasePackage.DATE_TIME_DESCRIPTION__MONTH:
				return getMonth();
			case BasePackage.DATE_TIME_DESCRIPTION__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.DATE_TIME_DESCRIPTION__UNIT_TYPE:
				setUnitType((UnitType)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__SECOND:
				setSecond((BInteger)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__MINUTE:
				setMinute((BInteger)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__HOUR:
				setHour((BInteger)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__DAY:
				setDay((BInteger)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__MONTH:
				setMonth((Month)newValue);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__YEAR:
				setYear((BInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.DATE_TIME_DESCRIPTION__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case BasePackage.DATE_TIME_DESCRIPTION__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.DATE_TIME_DESCRIPTION__UNIT_TYPE:
				return UNIT_TYPE_EDEFAULT == null ? unitType != null : !UNIT_TYPE_EDEFAULT.equals(unitType);
			case BasePackage.DATE_TIME_DESCRIPTION__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
			case BasePackage.DATE_TIME_DESCRIPTION__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case BasePackage.DATE_TIME_DESCRIPTION__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case BasePackage.DATE_TIME_DESCRIPTION__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case BasePackage.DATE_TIME_DESCRIPTION__DAY_OF_WEEK:
				return isSetDayOfWeek();
			case BasePackage.DATE_TIME_DESCRIPTION__DAY_OF_YEAR:
				return isSetDayOfYear();
			case BasePackage.DATE_TIME_DESCRIPTION__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case BasePackage.DATE_TIME_DESCRIPTION__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unitType: ");
		result.append(unitType);
		result.append(", second: ");
		result.append(second);
		result.append(", minute: ");
		result.append(minute);
		result.append(", hour: ");
		result.append(hour);
		result.append(", day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		return LocalDateTime.of(getYear().getValue(), getMonth().getValue(), getDay().getValue(), getHour().getValue(), getMinute().getValue(), getSecond().getValue());
	}

	@Override
	public void setLocalDateTime(LocalDateTime dateTime) {
		setYear(new BInteger(dateTime.getYear()));
		setMonth(Month.get(dateTime.getMonth().getValue()));
		setDay(new BInteger(dateTime.getDayOfMonth()));
		setHour(new BInteger(dateTime.getHour()));
		setMinute(new BInteger(dateTime.getMinute()));
		setSecond(new BInteger(dateTime.getSecond()));
		setUnitType(UnitType.UNIT_SECOND);
	}

	@Override
	public LocalDate getLocalDate() {
		if (getYear() == null || getMonth() == null || getDay() == null)
			return null;
		else
			return LocalDate.of(getYear().getValue(), getMonth().getValue(), getDay().getValue());
	}

	@Override
	public void setLocalDate(LocalDate date) {
		setYear(new BInteger(date.getYear()));
		setMonth(Month.get(date.getMonth().getValue()));
		setDay(new BInteger(date.getDayOfMonth()));
		setUnitType(UnitType.UNIT_DAY);
	}
} // DateTimeDescriptionImpl