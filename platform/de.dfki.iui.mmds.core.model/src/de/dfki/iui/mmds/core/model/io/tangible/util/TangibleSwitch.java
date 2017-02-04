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
package de.dfki.iui.mmds.core.model.io.tangible.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.IORepresentation;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput;
import de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput;
import de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage
 * @generated
 */
public class TangibleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TangiblePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TangibleSwitch() {
		if (modelPackage == null) {
			modelPackage = TangiblePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TangiblePackage.TANGIBLE_INPUT: {
				TangibleInput tangibleInput = (TangibleInput)theEObject;
				T result = caseTangibleInput(tangibleInput);
				if (result == null) result = caseControllerInput(tangibleInput);
				if (result == null) result = caseInputRepresentation(tangibleInput);
				if (result == null) result = caseIORepresentation(tangibleInput);
				if (result == null) result = caseBObject(tangibleInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.PUSH_BUTTON_INPUT: {
				PushButtonInput pushButtonInput = (PushButtonInput)theEObject;
				T result = casePushButtonInput(pushButtonInput);
				if (result == null) result = caseTangibleInput(pushButtonInput);
				if (result == null) result = caseControllerInput(pushButtonInput);
				if (result == null) result = caseInputRepresentation(pushButtonInput);
				if (result == null) result = caseIORepresentation(pushButtonInput);
				if (result == null) result = caseBObject(pushButtonInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.TOGGLE_BUTTON_INPUT: {
				ToggleButtonInput toggleButtonInput = (ToggleButtonInput)theEObject;
				T result = caseToggleButtonInput(toggleButtonInput);
				if (result == null) result = caseTangibleInput(toggleButtonInput);
				if (result == null) result = caseControllerInput(toggleButtonInput);
				if (result == null) result = caseInputRepresentation(toggleButtonInput);
				if (result == null) result = caseIORepresentation(toggleButtonInput);
				if (result == null) result = caseBObject(toggleButtonInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.KEYBOARD_INPUT: {
				KeyboardInput keyboardInput = (KeyboardInput)theEObject;
				T result = caseKeyboardInput(keyboardInput);
				if (result == null) result = caseTangibleInput(keyboardInput);
				if (result == null) result = caseControllerInput(keyboardInput);
				if (result == null) result = caseInputRepresentation(keyboardInput);
				if (result == null) result = caseIORepresentation(keyboardInput);
				if (result == null) result = caseBObject(keyboardInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.TURN_DIAL_FINITE_DISCRETE_INPUT: {
				TurnDialFiniteDiscreteInput turnDialFiniteDiscreteInput = (TurnDialFiniteDiscreteInput)theEObject;
				T result = caseTurnDialFiniteDiscreteInput(turnDialFiniteDiscreteInput);
				if (result == null) result = caseTangibleInput(turnDialFiniteDiscreteInput);
				if (result == null) result = caseControllerInput(turnDialFiniteDiscreteInput);
				if (result == null) result = caseInputRepresentation(turnDialFiniteDiscreteInput);
				if (result == null) result = caseIORepresentation(turnDialFiniteDiscreteInput);
				if (result == null) result = caseBObject(turnDialFiniteDiscreteInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.TURN_DIAL_FINITE_CONTINUOUS_INPUT: {
				TurnDialFiniteContinuousInput turnDialFiniteContinuousInput = (TurnDialFiniteContinuousInput)theEObject;
				T result = caseTurnDialFiniteContinuousInput(turnDialFiniteContinuousInput);
				if (result == null) result = caseTangibleInput(turnDialFiniteContinuousInput);
				if (result == null) result = caseControllerInput(turnDialFiniteContinuousInput);
				if (result == null) result = caseInputRepresentation(turnDialFiniteContinuousInput);
				if (result == null) result = caseIORepresentation(turnDialFiniteContinuousInput);
				if (result == null) result = caseBObject(turnDialFiniteContinuousInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.TURN_DIAL_INFINITE_DISCRETE_INPUT: {
				TurnDialInfiniteDiscreteInput turnDialInfiniteDiscreteInput = (TurnDialInfiniteDiscreteInput)theEObject;
				T result = caseTurnDialInfiniteDiscreteInput(turnDialInfiniteDiscreteInput);
				if (result == null) result = caseTangibleInput(turnDialInfiniteDiscreteInput);
				if (result == null) result = caseControllerInput(turnDialInfiniteDiscreteInput);
				if (result == null) result = caseInputRepresentation(turnDialInfiniteDiscreteInput);
				if (result == null) result = caseIORepresentation(turnDialInfiniteDiscreteInput);
				if (result == null) result = caseBObject(turnDialInfiniteDiscreteInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.TURN_DIAL_INFINITE_CONTINUOUS_INPUT: {
				TurnDialInfiniteContinuousInput turnDialInfiniteContinuousInput = (TurnDialInfiniteContinuousInput)theEObject;
				T result = caseTurnDialInfiniteContinuousInput(turnDialInfiniteContinuousInput);
				if (result == null) result = caseTangibleInput(turnDialInfiniteContinuousInput);
				if (result == null) result = caseControllerInput(turnDialInfiniteContinuousInput);
				if (result == null) result = caseInputRepresentation(turnDialInfiniteContinuousInput);
				if (result == null) result = caseIORepresentation(turnDialInfiniteContinuousInput);
				if (result == null) result = caseBObject(turnDialInfiniteContinuousInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.JOYSTICK2_DINPUT: {
				Joystick2DInput joystick2DInput = (Joystick2DInput)theEObject;
				T result = caseJoystick2DInput(joystick2DInput);
				if (result == null) result = caseTangibleInput(joystick2DInput);
				if (result == null) result = caseControllerInput(joystick2DInput);
				if (result == null) result = caseInputRepresentation(joystick2DInput);
				if (result == null) result = caseIORepresentation(joystick2DInput);
				if (result == null) result = caseBObject(joystick2DInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TangiblePackage.JOYSTICK3_DINPUT: {
				Joystick3DInput joystick3DInput = (Joystick3DInput)theEObject;
				T result = caseJoystick3DInput(joystick3DInput);
				if (result == null) result = caseTangibleInput(joystick3DInput);
				if (result == null) result = caseControllerInput(joystick3DInput);
				if (result == null) result = caseInputRepresentation(joystick3DInput);
				if (result == null) result = caseIORepresentation(joystick3DInput);
				if (result == null) result = caseBObject(joystick3DInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTangibleInput(TangibleInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Button Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushButtonInput(PushButtonInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Button Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleButtonInput(ToggleButtonInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyboard Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyboard Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyboardInput(KeyboardInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Dial Finite Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Dial Finite Discrete Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnDialFiniteDiscreteInput(TurnDialFiniteDiscreteInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Dial Finite Continuous Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Dial Finite Continuous Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnDialFiniteContinuousInput(TurnDialFiniteContinuousInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Dial Infinite Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Dial Infinite Discrete Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnDialInfiniteDiscreteInput(TurnDialInfiniteDiscreteInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Dial Infinite Continuous Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Dial Infinite Continuous Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnDialInfiniteContinuousInput(TurnDialInfiniteContinuousInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joystick2 DInput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joystick2 DInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoystick2DInput(Joystick2DInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joystick3 DInput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joystick3 DInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoystick3DInput(Joystick3DInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIORepresentation(IORepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRepresentation(InputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerInput(ControllerInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TangibleSwitch
