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
package de.dfki.iui.mmds.core.model.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Speech Recognizer State Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getSpeechRecognizerStateEnum()
 * @model
 * @generated
 */
public enum SpeechRecognizerStateEnum implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>Microphone Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	MICROPHONE_OPEN(1, "MicrophoneOpen", "MicrophoneOpen"),

	/**
	 * The '<em><b>Microphone Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	MICROPHONE_CLOSED(2, "MicrophoneClosed", "MicrophoneClosed"),

	/**
	 * The '<em><b>Speech Started</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_STARTED(3, "SpeechStarted", "SpeechStarted"),

	/**
	 * The '<em><b>Speech Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_STOPPED(4, "SpeechStopped", "SpeechStopped"),

	/**
	 * The '<em><b>Silence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SILENCE(5, "Silence", "Silence");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Microphone Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Microphone Open</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_OPEN
	 * @model name="MicrophoneOpen"
	 * @generated
	 * @ordered
	 */
	public static final int MICROPHONE_OPEN_VALUE = 1;

	/**
	 * The '<em><b>Microphone Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Microphone Closed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_CLOSED
	 * @model name="MicrophoneClosed"
	 * @generated
	 * @ordered
	 */
	public static final int MICROPHONE_CLOSED_VALUE = 2;

	/**
	 * The '<em><b>Speech Started</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Speech Started</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECH_STARTED
	 * @model name="SpeechStarted"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_STARTED_VALUE = 3;

	/**
	 * The '<em><b>Speech Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Speech Stopped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEECH_STOPPED
	 * @model name="SpeechStopped"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_STOPPED_VALUE = 4;

	/**
	 * The '<em><b>Silence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Silence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILENCE
	 * @model name="Silence"
	 * @generated
	 * @ordered
	 */
	public static final int SILENCE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Speech Recognizer State Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpeechRecognizerStateEnum[] VALUES_ARRAY =
		new SpeechRecognizerStateEnum[] {
			NONE,
			MICROPHONE_OPEN,
			MICROPHONE_CLOSED,
			SPEECH_STARTED,
			SPEECH_STOPPED,
			SILENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Speech Recognizer State Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpeechRecognizerStateEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Speech Recognizer State Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechRecognizerStateEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeechRecognizerStateEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speech Recognizer State Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechRecognizerStateEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeechRecognizerStateEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speech Recognizer State Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechRecognizerStateEnum get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case MICROPHONE_OPEN_VALUE: return MICROPHONE_OPEN;
			case MICROPHONE_CLOSED_VALUE: return MICROPHONE_CLOSED;
			case SPEECH_STARTED_VALUE: return SPEECH_STARTED;
			case SPEECH_STOPPED_VALUE: return SPEECH_STOPPED;
			case SILENCE_VALUE: return SILENCE;
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
	private SpeechRecognizerStateEnum(int value, String name, String literal) {
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
	
} //SpeechRecognizerStateEnum
