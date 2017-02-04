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
package de.dfki.iui.mmds.core.model.io.tangible.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput;
import de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput;
import de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput;
import de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory;
import de.dfki.iui.mmds.core.model.io.tangible.TangibleInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput;
import de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TangibleFactoryImpl extends EFactoryImpl implements TangibleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TangibleFactory init() {
		try {
			TangibleFactory theTangibleFactory = (TangibleFactory)EPackage.Registry.INSTANCE.getEFactory(TangiblePackage.eNS_URI);
			if (theTangibleFactory != null) {
				return theTangibleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TangibleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TangibleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TangiblePackage.TANGIBLE_INPUT: return createTangibleInput();
			case TangiblePackage.PUSH_BUTTON_INPUT: return createPushButtonInput();
			case TangiblePackage.TOGGLE_BUTTON_INPUT: return createToggleButtonInput();
			case TangiblePackage.KEYBOARD_INPUT: return createKeyboardInput();
			case TangiblePackage.TURN_DIAL_FINITE_DISCRETE_INPUT: return createTurnDialFiniteDiscreteInput();
			case TangiblePackage.TURN_DIAL_FINITE_CONTINUOUS_INPUT: return createTurnDialFiniteContinuousInput();
			case TangiblePackage.TURN_DIAL_INFINITE_DISCRETE_INPUT: return createTurnDialInfiniteDiscreteInput();
			case TangiblePackage.TURN_DIAL_INFINITE_CONTINUOUS_INPUT: return createTurnDialInfiniteContinuousInput();
			case TangiblePackage.JOYSTICK2_DINPUT: return createJoystick2DInput();
			case TangiblePackage.JOYSTICK3_DINPUT: return createJoystick3DInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TangiblePackage.HARDWARE_TYPES:
				return createHardwareTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TangiblePackage.HARDWARE_TYPES:
				return convertHardwareTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TangibleInput createTangibleInput() {
		TangibleInputImpl tangibleInput = new TangibleInputImpl();
		return tangibleInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButtonInput createPushButtonInput() {
		PushButtonInputImpl pushButtonInput = new PushButtonInputImpl();
		return pushButtonInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleButtonInput createToggleButtonInput() {
		ToggleButtonInputImpl toggleButtonInput = new ToggleButtonInputImpl();
		return toggleButtonInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyboardInput createKeyboardInput() {
		KeyboardInputImpl keyboardInput = new KeyboardInputImpl();
		return keyboardInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnDialFiniteDiscreteInput createTurnDialFiniteDiscreteInput() {
		TurnDialFiniteDiscreteInputImpl turnDialFiniteDiscreteInput = new TurnDialFiniteDiscreteInputImpl();
		return turnDialFiniteDiscreteInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnDialFiniteContinuousInput createTurnDialFiniteContinuousInput() {
		TurnDialFiniteContinuousInputImpl turnDialFiniteContinuousInput = new TurnDialFiniteContinuousInputImpl();
		return turnDialFiniteContinuousInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnDialInfiniteDiscreteInput createTurnDialInfiniteDiscreteInput() {
		TurnDialInfiniteDiscreteInputImpl turnDialInfiniteDiscreteInput = new TurnDialInfiniteDiscreteInputImpl();
		return turnDialInfiniteDiscreteInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnDialInfiniteContinuousInput createTurnDialInfiniteContinuousInput() {
		TurnDialInfiniteContinuousInputImpl turnDialInfiniteContinuousInput = new TurnDialInfiniteContinuousInputImpl();
		return turnDialInfiniteContinuousInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joystick2DInput createJoystick2DInput() {
		Joystick2DInputImpl joystick2DInput = new Joystick2DInputImpl();
		return joystick2DInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joystick3DInput createJoystick3DInput() {
		Joystick3DInputImpl joystick3DInput = new Joystick3DInputImpl();
		return joystick3DInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTypes createHardwareTypesFromString(EDataType eDataType, String initialValue) {
		HardwareTypes result = HardwareTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHardwareTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TangiblePackage getTangiblePackage() {
		return (TangiblePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TangiblePackage getPackage() {
		return TangiblePackage.eINSTANCE;
	}

} //TangibleFactoryImpl
