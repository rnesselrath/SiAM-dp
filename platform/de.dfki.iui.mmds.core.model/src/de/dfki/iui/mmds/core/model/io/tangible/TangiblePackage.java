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

import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangibleFactory
 * @model kind="package"
 * @generated
 */
public interface TangiblePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tangible";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/tangible";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tangible";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TangiblePackage eINSTANCE = de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTangibleInput()
	 * @generated
	 */
	int TANGIBLE_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__BINDING = Io_interfacesPackage.CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__DEVICE = Io_interfacesPackage.CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__SERVICE_INSTANCE = Io_interfacesPackage.CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__SERVICE_NAME = Io_interfacesPackage.CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__BEGIN_TIME = Io_interfacesPackage.CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__DURATION = Io_interfacesPackage.CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__LANGUAGE = Io_interfacesPackage.CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__USER_ALIAS = Io_interfacesPackage.CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__HARDWARE_ID = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__HARDWARE_TYPE = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT_FEATURE_COUNT = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_INPUT_OPERATION_COUNT = Io_interfacesPackage.CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl <em>Push Button Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getPushButtonInput()
	 * @generated
	 */
	int PUSH_BUTTON_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__IS_PRESSED = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Notify Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Push Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Push Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.ToggleButtonInputImpl <em>Toggle Button Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.ToggleButtonInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getToggleButtonInput()
	 * @generated
	 */
	int TOGGLE_BUTTON_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT__IS_PRESSED = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toggle Button Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.KeyboardInputImpl <em>Keyboard Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.KeyboardInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getKeyboardInput()
	 * @generated
	 */
	int KEYBOARD_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__KEY = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__IS_PRESSED = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Can Notify Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT__CAN_NOTIFY_RELEASE = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Keyboard Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Keyboard Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteDiscreteInputImpl <em>Turn Dial Finite Discrete Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteDiscreteInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialFiniteDiscreteInput()
	 * @generated
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__MIN = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__MAX = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT__VALUE = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turn Dial Finite Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Turn Dial Finite Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_DISCRETE_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteContinuousInputImpl <em>Turn Dial Finite Continuous Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteContinuousInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialFiniteContinuousInput()
	 * @generated
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__MIN = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__MAX = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT__VALUE = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turn Dial Finite Continuous Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Turn Dial Finite Continuous Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_FINITE_CONTINUOUS_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteDiscreteInputImpl <em>Turn Dial Infinite Discrete Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteDiscreteInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialInfiniteDiscreteInput()
	 * @generated
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT__DELTA = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Dial Infinite Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Dial Infinite Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_DISCRETE_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteContinuousInputImpl <em>Turn Dial Infinite Continuous Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteContinuousInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialInfiniteContinuousInput()
	 * @generated
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT__DELTA = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Dial Infinite Continuous Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Dial Infinite Continuous Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DIAL_INFINITE_CONTINUOUS_INPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick2DInputImpl <em>Joystick2 DInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick2DInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getJoystick2DInput()
	 * @generated
	 */
	int JOYSTICK2_DINPUT = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__X = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT__Y = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Joystick2 DInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Joystick2 DInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK2_DINPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick3DInputImpl <em>Joystick3 DInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick3DInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getJoystick3DInput()
	 * @generated
	 */
	int JOYSTICK3_DINPUT = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__BINDING = TANGIBLE_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__DEVICE = TANGIBLE_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__SERVICE_INSTANCE = TANGIBLE_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__SERVICE_NAME = TANGIBLE_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__BEGIN_TIME = TANGIBLE_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__DURATION = TANGIBLE_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__LANGUAGE = TANGIBLE_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__USER_ALIAS = TANGIBLE_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__HARDWARE_ID = TANGIBLE_INPUT__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__HARDWARE_TYPE = TANGIBLE_INPUT__HARDWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Hardware Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__HARDWARE_FRIENDLY_NAME = TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__X = TANGIBLE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__Y = TANGIBLE_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT__Z = TANGIBLE_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Joystick3 DInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT_FEATURE_COUNT = TANGIBLE_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Joystick3 DInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOYSTICK3_DINPUT_OPERATION_COUNT = TANGIBLE_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes <em>Hardware Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes
	 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getHardwareTypes()
	 * @generated
	 */
	int HARDWARE_TYPES = 10;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangibleInput
	 * @generated
	 */
	EClass getTangibleInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareID <em>Hardware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware ID</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareID()
	 * @see #getTangibleInput()
	 * @generated
	 */
	EAttribute getTangibleInput_HardwareID();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareType <em>Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareType()
	 * @see #getTangibleInput()
	 * @generated
	 */
	EAttribute getTangibleInput_HardwareType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareFriendlyName <em>Hardware Friendly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Friendly Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangibleInput#getHardwareFriendlyName()
	 * @see #getTangibleInput()
	 * @generated
	 */
	EAttribute getTangibleInput_HardwareFriendlyName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput <em>Push Button Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Button Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput
	 * @generated
	 */
	EClass getPushButtonInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput#isIsPressed <em>Is Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pressed</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput#isIsPressed()
	 * @see #getPushButtonInput()
	 * @generated
	 */
	EAttribute getPushButtonInput_IsPressed();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput#isCanNotifyRelease <em>Can Notify Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Notify Release</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput#isCanNotifyRelease()
	 * @see #getPushButtonInput()
	 * @generated
	 */
	EAttribute getPushButtonInput_CanNotifyRelease();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput <em>Toggle Button Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Button Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput
	 * @generated
	 */
	EClass getToggleButtonInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput#isIsPressed <em>Is Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pressed</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.ToggleButtonInput#isIsPressed()
	 * @see #getToggleButtonInput()
	 * @generated
	 */
	EAttribute getToggleButtonInput_IsPressed();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyboard Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput
	 * @generated
	 */
	EClass getKeyboardInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#getKey()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	EAttribute getKeyboardInput_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isIsPressed <em>Is Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pressed</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isIsPressed()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	EAttribute getKeyboardInput_IsPressed();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isCanNotifyRelease <em>Can Notify Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Notify Release</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.KeyboardInput#isCanNotifyRelease()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	EAttribute getKeyboardInput_CanNotifyRelease();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput <em>Turn Dial Finite Discrete Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Dial Finite Discrete Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput
	 * @generated
	 */
	EClass getTurnDialFiniteDiscreteInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getMin()
	 * @see #getTurnDialFiniteDiscreteInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteDiscreteInput_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getMax()
	 * @see #getTurnDialFiniteDiscreteInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteDiscreteInput_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteDiscreteInput#getValue()
	 * @see #getTurnDialFiniteDiscreteInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteDiscreteInput_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput <em>Turn Dial Finite Continuous Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Dial Finite Continuous Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput
	 * @generated
	 */
	EClass getTurnDialFiniteContinuousInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getMin()
	 * @see #getTurnDialFiniteContinuousInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteContinuousInput_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getMax()
	 * @see #getTurnDialFiniteContinuousInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteContinuousInput_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialFiniteContinuousInput#getValue()
	 * @see #getTurnDialFiniteContinuousInput()
	 * @generated
	 */
	EAttribute getTurnDialFiniteContinuousInput_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput <em>Turn Dial Infinite Discrete Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Dial Infinite Discrete Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput
	 * @generated
	 */
	EClass getTurnDialInfiniteDiscreteInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput#getDelta()
	 * @see #getTurnDialInfiniteDiscreteInput()
	 * @generated
	 */
	EAttribute getTurnDialInfiniteDiscreteInput_Delta();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput <em>Turn Dial Infinite Continuous Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Dial Infinite Continuous Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput
	 * @generated
	 */
	EClass getTurnDialInfiniteContinuousInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteContinuousInput#getDelta()
	 * @see #getTurnDialInfiniteContinuousInput()
	 * @generated
	 */
	EAttribute getTurnDialInfiniteContinuousInput_Delta();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput <em>Joystick2 DInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joystick2 DInput</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput
	 * @generated
	 */
	EClass getJoystick2DInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput#getX()
	 * @see #getJoystick2DInput()
	 * @generated
	 */
	EAttribute getJoystick2DInput_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick2DInput#getY()
	 * @see #getJoystick2DInput()
	 * @generated
	 */
	EAttribute getJoystick2DInput_Y();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput <em>Joystick3 DInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joystick3 DInput</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput
	 * @generated
	 */
	EClass getJoystick3DInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getX()
	 * @see #getJoystick3DInput()
	 * @generated
	 */
	EAttribute getJoystick3DInput_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getY()
	 * @see #getJoystick3DInput()
	 * @generated
	 */
	EAttribute getJoystick3DInput_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.Joystick3DInput#getZ()
	 * @see #getJoystick3DInput()
	 * @generated
	 */
	EAttribute getJoystick3DInput_Z();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes <em>Hardware Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Types</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes
	 * @generated
	 */
	EEnum getHardwareTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TangibleFactory getTangibleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTangibleInput()
		 * @generated
		 */
		EClass TANGIBLE_INPUT = eINSTANCE.getTangibleInput();

		/**
		 * The meta object literal for the '<em><b>Hardware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANGIBLE_INPUT__HARDWARE_ID = eINSTANCE.getTangibleInput_HardwareID();

		/**
		 * The meta object literal for the '<em><b>Hardware Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANGIBLE_INPUT__HARDWARE_TYPE = eINSTANCE.getTangibleInput_HardwareType();

		/**
		 * The meta object literal for the '<em><b>Hardware Friendly Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANGIBLE_INPUT__HARDWARE_FRIENDLY_NAME = eINSTANCE.getTangibleInput_HardwareFriendlyName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl <em>Push Button Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getPushButtonInput()
		 * @generated
		 */
		EClass PUSH_BUTTON_INPUT = eINSTANCE.getPushButtonInput();

		/**
		 * The meta object literal for the '<em><b>Is Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON_INPUT__IS_PRESSED = eINSTANCE.getPushButtonInput_IsPressed();

		/**
		 * The meta object literal for the '<em><b>Can Notify Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE = eINSTANCE.getPushButtonInput_CanNotifyRelease();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.ToggleButtonInputImpl <em>Toggle Button Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.ToggleButtonInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getToggleButtonInput()
		 * @generated
		 */
		EClass TOGGLE_BUTTON_INPUT = eINSTANCE.getToggleButtonInput();

		/**
		 * The meta object literal for the '<em><b>Is Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON_INPUT__IS_PRESSED = eINSTANCE.getToggleButtonInput_IsPressed();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.KeyboardInputImpl <em>Keyboard Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.KeyboardInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getKeyboardInput()
		 * @generated
		 */
		EClass KEYBOARD_INPUT = eINSTANCE.getKeyboardInput();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD_INPUT__KEY = eINSTANCE.getKeyboardInput_Key();

		/**
		 * The meta object literal for the '<em><b>Is Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD_INPUT__IS_PRESSED = eINSTANCE.getKeyboardInput_IsPressed();

		/**
		 * The meta object literal for the '<em><b>Can Notify Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD_INPUT__CAN_NOTIFY_RELEASE = eINSTANCE.getKeyboardInput_CanNotifyRelease();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteDiscreteInputImpl <em>Turn Dial Finite Discrete Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteDiscreteInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialFiniteDiscreteInput()
		 * @generated
		 */
		EClass TURN_DIAL_FINITE_DISCRETE_INPUT = eINSTANCE.getTurnDialFiniteDiscreteInput();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_DISCRETE_INPUT__MIN = eINSTANCE.getTurnDialFiniteDiscreteInput_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_DISCRETE_INPUT__MAX = eINSTANCE.getTurnDialFiniteDiscreteInput_Max();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_DISCRETE_INPUT__VALUE = eINSTANCE.getTurnDialFiniteDiscreteInput_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteContinuousInputImpl <em>Turn Dial Finite Continuous Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialFiniteContinuousInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialFiniteContinuousInput()
		 * @generated
		 */
		EClass TURN_DIAL_FINITE_CONTINUOUS_INPUT = eINSTANCE.getTurnDialFiniteContinuousInput();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_CONTINUOUS_INPUT__MIN = eINSTANCE.getTurnDialFiniteContinuousInput_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_CONTINUOUS_INPUT__MAX = eINSTANCE.getTurnDialFiniteContinuousInput_Max();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_FINITE_CONTINUOUS_INPUT__VALUE = eINSTANCE.getTurnDialFiniteContinuousInput_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteDiscreteInputImpl <em>Turn Dial Infinite Discrete Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteDiscreteInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialInfiniteDiscreteInput()
		 * @generated
		 */
		EClass TURN_DIAL_INFINITE_DISCRETE_INPUT = eINSTANCE.getTurnDialInfiniteDiscreteInput();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_INFINITE_DISCRETE_INPUT__DELTA = eINSTANCE.getTurnDialInfiniteDiscreteInput_Delta();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteContinuousInputImpl <em>Turn Dial Infinite Continuous Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TurnDialInfiniteContinuousInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getTurnDialInfiniteContinuousInput()
		 * @generated
		 */
		EClass TURN_DIAL_INFINITE_CONTINUOUS_INPUT = eINSTANCE.getTurnDialInfiniteContinuousInput();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_DIAL_INFINITE_CONTINUOUS_INPUT__DELTA = eINSTANCE.getTurnDialInfiniteContinuousInput_Delta();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick2DInputImpl <em>Joystick2 DInput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick2DInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getJoystick2DInput()
		 * @generated
		 */
		EClass JOYSTICK2_DINPUT = eINSTANCE.getJoystick2DInput();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOYSTICK2_DINPUT__X = eINSTANCE.getJoystick2DInput_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOYSTICK2_DINPUT__Y = eINSTANCE.getJoystick2DInput_Y();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick3DInputImpl <em>Joystick3 DInput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.Joystick3DInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getJoystick3DInput()
		 * @generated
		 */
		EClass JOYSTICK3_DINPUT = eINSTANCE.getJoystick3DInput();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOYSTICK3_DINPUT__X = eINSTANCE.getJoystick3DInput_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOYSTICK3_DINPUT__Y = eINSTANCE.getJoystick3DInput_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOYSTICK3_DINPUT__Z = eINSTANCE.getJoystick3DInput_Z();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes <em>Hardware Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.tangible.HardwareTypes
		 * @see de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl#getHardwareTypes()
		 * @generated
		 */
		EEnum HARDWARE_TYPES = eINSTANCE.getHardwareTypes();

	}

} //TangiblePackage
