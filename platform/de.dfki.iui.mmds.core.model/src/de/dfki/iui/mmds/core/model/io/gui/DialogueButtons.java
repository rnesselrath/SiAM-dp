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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dialogue Buttons</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getDialogueButtons()
 * @model
 * @generated
 */
public enum DialogueButtons implements Enumerator {
	/**
	 * The '<em><b>Ok Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	OK_ONLY(0, "okOnly", "okOnly"),

	/**
	 * The '<em><b>Ok Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	OK_CANCEL(1, "okCancel", "okCancel"),

	/**
	 * The '<em><b>Abort Retry Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_RETRY_IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT_RETRY_IGNORE(2, "abortRetryIgnore", "abortRetryIgnore"),

	/**
	 * The '<em><b>Yes No Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_NO_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	YES_NO_CANCEL(3, "yesNoCancel", "yesNoCancel"),

	/**
	 * The '<em><b>Yes No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_NO_VALUE
	 * @generated
	 * @ordered
	 */
	YES_NO(4, "yesNo", "yesNo"),

	/**
	 * The '<em><b>Retry Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRY_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	RETRY_CANCEL(5, "retryCancel", "retryCancel");

	/**
	 * The '<em><b>Ok Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ok Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK_ONLY
	 * @model name="okOnly"
	 * @generated
	 * @ordered
	 */
	public static final int OK_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Ok Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ok Cancel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK_CANCEL
	 * @model name="okCancel"
	 * @generated
	 * @ordered
	 */
	public static final int OK_CANCEL_VALUE = 1;

	/**
	 * The '<em><b>Abort Retry Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort Retry Ignore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT_RETRY_IGNORE
	 * @model name="abortRetryIgnore"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_RETRY_IGNORE_VALUE = 2;

	/**
	 * The '<em><b>Yes No Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yes No Cancel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YES_NO_CANCEL
	 * @model name="yesNoCancel"
	 * @generated
	 * @ordered
	 */
	public static final int YES_NO_CANCEL_VALUE = 3;

	/**
	 * The '<em><b>Yes No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yes No</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YES_NO
	 * @model name="yesNo"
	 * @generated
	 * @ordered
	 */
	public static final int YES_NO_VALUE = 4;

	/**
	 * The '<em><b>Retry Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retry Cancel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRY_CANCEL
	 * @model name="retryCancel"
	 * @generated
	 * @ordered
	 */
	public static final int RETRY_CANCEL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Dialogue Buttons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DialogueButtons[] VALUES_ARRAY =
		new DialogueButtons[] {
			OK_ONLY,
			OK_CANCEL,
			ABORT_RETRY_IGNORE,
			YES_NO_CANCEL,
			YES_NO,
			RETRY_CANCEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Dialogue Buttons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DialogueButtons> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dialogue Buttons</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DialogueButtons get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DialogueButtons result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dialogue Buttons</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DialogueButtons getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DialogueButtons result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dialogue Buttons</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DialogueButtons get(int value) {
		switch (value) {
			case OK_ONLY_VALUE: return OK_ONLY;
			case OK_CANCEL_VALUE: return OK_CANCEL;
			case ABORT_RETRY_IGNORE_VALUE: return ABORT_RETRY_IGNORE;
			case YES_NO_CANCEL_VALUE: return YES_NO_CANCEL;
			case YES_NO_VALUE: return YES_NO;
			case RETRY_CANCEL_VALUE: return RETRY_CANCEL;
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
	private DialogueButtons(int value, String name, String literal) {
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
	
} //DialogueButtons
