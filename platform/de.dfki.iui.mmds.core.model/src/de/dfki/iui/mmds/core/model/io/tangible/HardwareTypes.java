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
package de.dfki.iui.mmds.core.model.io.tangible;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardware Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getHardwareTypes()
 * @model
 * @generated
 */
public enum HardwareTypes implements Enumerator {
	/**
	 * The '<em><b>Push Button</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH_BUTTON(0, "PushButton", "PushButton"),

	/**
	 * The '<em><b>Dial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIAL(1, "Dial", "Dial"),

	/**
	 * The '<em><b>Slider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDER_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDER(2, "Slider", "Slider"),

	/**
	 * The '<em><b>Flip Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIP_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	FLIP_SWITCH(3, "FlipSwitch", "FlipSwitch"),

	/**
	 * The '<em><b>Keyboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYBOARD(4, "Keyboard", "Keyboard"),

	/**
	 * The '<em><b>Contact Button</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_BUTTON(5, "ContactButton", "ContactButton"),

	/**
	 * The '<em><b>Joystick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOYSTICK_VALUE
	 * @generated
	 * @ordered
	 */
	JOYSTICK(6, "Joystick", "Joystick"),

	/**
	 * The '<em><b>Scroll Wheel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL_WHEEL(7, "ScrollWheel", "ScrollWheel"),

	/**
	 * The '<em><b>Pedal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDAL_VALUE
	 * @generated
	 * @ordered
	 */
	PEDAL(8, "Pedal", "Pedal"),

	/**
	 * The '<em><b>Steering Wheel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEERING_WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	STEERING_WHEEL(9, "SteeringWheel", "SteeringWheel"),

	/**
	 * The '<em><b>Tristate Flip Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRISTATE_FLIP_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	TRISTATE_FLIP_SWITCH(10, "TristateFlipSwitch", "TristateFlipSwitch"),

	/**
	 * The '<em><b>Four Way Button</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_WAY_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR_WAY_BUTTON(11, "FourWayButton", "FourWayButton"),

	/**
	 * The '<em><b>Touch Pad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_PAD_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH_PAD(11, "TouchPad", "TouchPad");

	/**
	 * The '<em><b>Push Button</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Push Button</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH_BUTTON
	 * @model name="PushButton"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_BUTTON_VALUE = 0;

	/**
	 * The '<em><b>Dial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAL
	 * @model name="Dial"
	 * @generated
	 * @ordered
	 */
	public static final int DIAL_VALUE = 1;

	/**
	 * The '<em><b>Slider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLIDER
	 * @model name="Slider"
	 * @generated
	 * @ordered
	 */
	public static final int SLIDER_VALUE = 2;

	/**
	 * The '<em><b>Flip Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flip Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLIP_SWITCH
	 * @model name="FlipSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int FLIP_SWITCH_VALUE = 3;

	/**
	 * The '<em><b>Keyboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keyboard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD
	 * @model name="Keyboard"
	 * @generated
	 * @ordered
	 */
	public static final int KEYBOARD_VALUE = 4;

	/**
	 * The '<em><b>Contact Button</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contact Button</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTACT_BUTTON
	 * @model name="ContactButton"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_BUTTON_VALUE = 5;

	/**
	 * The '<em><b>Joystick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Joystick</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOYSTICK
	 * @model name="Joystick"
	 * @generated
	 * @ordered
	 */
	public static final int JOYSTICK_VALUE = 6;

	/**
	 * The '<em><b>Scroll Wheel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scroll Wheel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL_WHEEL
	 * @model name="ScrollWheel"
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_WHEEL_VALUE = 7;

	/**
	 * The '<em><b>Pedal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pedal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEDAL
	 * @model name="Pedal"
	 * @generated
	 * @ordered
	 */
	public static final int PEDAL_VALUE = 8;

	/**
	 * The '<em><b>Steering Wheel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Steering Wheel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEERING_WHEEL
	 * @model name="SteeringWheel"
	 * @generated
	 * @ordered
	 */
	public static final int STEERING_WHEEL_VALUE = 9;

	/**
	 * The '<em><b>Tristate Flip Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tristate Flip Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRISTATE_FLIP_SWITCH
	 * @model name="TristateFlipSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int TRISTATE_FLIP_SWITCH_VALUE = 10;

	/**
	 * The '<em><b>Four Way Button</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Four Way Button</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUR_WAY_BUTTON
	 * @model name="FourWayButton"
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_WAY_BUTTON_VALUE = 11;

	/**
	 * The '<em><b>Touch Pad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Touch Pad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH_PAD
	 * @model name="TouchPad"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_PAD_VALUE = 11;

	/**
	 * An array of all the '<em><b>Hardware Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HardwareTypes[] VALUES_ARRAY =
		new HardwareTypes[] {
			PUSH_BUTTON,
			DIAL,
			SLIDER,
			FLIP_SWITCH,
			KEYBOARD,
			CONTACT_BUTTON,
			JOYSTICK,
			SCROLL_WHEEL,
			PEDAL,
			STEERING_WHEEL,
			TRISTATE_FLIP_SWITCH,
			FOUR_WAY_BUTTON,
			TOUCH_PAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Hardware Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HardwareTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hardware Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardwareTypes get(int value) {
		switch (value) {
			case PUSH_BUTTON_VALUE: return PUSH_BUTTON;
			case DIAL_VALUE: return DIAL;
			case SLIDER_VALUE: return SLIDER;
			case FLIP_SWITCH_VALUE: return FLIP_SWITCH;
			case KEYBOARD_VALUE: return KEYBOARD;
			case CONTACT_BUTTON_VALUE: return CONTACT_BUTTON;
			case JOYSTICK_VALUE: return JOYSTICK;
			case SCROLL_WHEEL_VALUE: return SCROLL_WHEEL;
			case PEDAL_VALUE: return PEDAL;
			case STEERING_WHEEL_VALUE: return STEERING_WHEEL;
			case TRISTATE_FLIP_SWITCH_VALUE: return TRISTATE_FLIP_SWITCH;
			case FOUR_WAY_BUTTON_VALUE: return FOUR_WAY_BUTTON;
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
	private HardwareTypes(int value, String name, String literal) {
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
	
} //HardwareTypes
