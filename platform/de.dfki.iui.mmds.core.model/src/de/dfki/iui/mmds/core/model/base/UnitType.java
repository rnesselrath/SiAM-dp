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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.base.BasePackage#getUnitType()
 * @model
 * @generated
 */
public enum UnitType implements Enumerator {
	/**
	 * The '<em><b>Unit Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_SECOND(0, "unitSecond", "unitSecond"),

	/**
	 * The '<em><b>Unit Minute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_MINUTE(1, "unitMinute", "unitMinute"),

	/**
	 * The '<em><b>Unit Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_HOUR(2, "unitHour", "unitHour"),

	/**
	 * The '<em><b>Unit Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_DAY(3, "unitDay", "unitDay"), /**
	 * The '<em><b>Unit Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_WEEK(4, "unitWeek", "unitWeek"),

	/**
	 * The '<em><b>Unit Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_MONTH(5, "unitMonth", "unitMonth"),

	/**
	 * The '<em><b>Unit Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_YEAR(6, "unitYear", "unitYear");

	/**
	 * The '<em><b>Unit Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Second</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_SECOND
	 * @model name="unitSecond"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_SECOND_VALUE = 0;

	/**
	 * The '<em><b>Unit Minute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Minute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_MINUTE
	 * @model name="unitMinute"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_MINUTE_VALUE = 1;

	/**
	 * The '<em><b>Unit Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_HOUR
	 * @model name="unitHour"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_HOUR_VALUE = 2;

	/**
	 * The '<em><b>Unit Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_DAY
	 * @model name="unitDay"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_DAY_VALUE = 3;

	/**
	 * The '<em><b>Unit Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Week</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_WEEK
	 * @model name="unitWeek"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_WEEK_VALUE = 4;

	/**
	 * The '<em><b>Unit Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_MONTH
	 * @model name="unitMonth"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_MONTH_VALUE = 5;

	/**
	 * The '<em><b>Unit Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_YEAR
	 * @model name="unitYear"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_YEAR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitType[] VALUES_ARRAY =
		new UnitType[] {
			UNIT_SECOND,
			UNIT_MINUTE,
			UNIT_HOUR,
			UNIT_DAY,
			UNIT_WEEK,
			UNIT_MONTH,
			UNIT_YEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(int value) {
		switch (value) {
			case UNIT_SECOND_VALUE: return UNIT_SECOND;
			case UNIT_MINUTE_VALUE: return UNIT_MINUTE;
			case UNIT_HOUR_VALUE: return UNIT_HOUR;
			case UNIT_DAY_VALUE: return UNIT_DAY;
			case UNIT_WEEK_VALUE: return UNIT_WEEK;
			case UNIT_MONTH_VALUE: return UNIT_MONTH;
			case UNIT_YEAR_VALUE: return UNIT_YEAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnitType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnitType
