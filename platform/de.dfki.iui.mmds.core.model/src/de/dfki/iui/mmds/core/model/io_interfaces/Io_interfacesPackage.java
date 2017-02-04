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
package de.dfki.iui.mmds.core.model.io_interfaces;

import de.dfki.iui.mmds.core.model.base.BasePackage;

import de.dfki.iui.mmds.core.model.io.IoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesFactory
 * @model kind="package"
 * @generated
 */
public interface Io_interfacesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "io_interfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io_interfaces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "io_interfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Io_interfacesPackage eINSTANCE = de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SensorInput <em>Sensor Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SensorInput
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSensorInput()
	 * @generated
	 */
	int SENSOR_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__BINDING = IoPackage.INPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__DEVICE = IoPackage.INPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__SERVICE_INSTANCE = IoPackage.INPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__SERVICE_NAME = IoPackage.INPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__BEGIN_TIME = IoPackage.INPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__DURATION = IoPackage.INPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__LANGUAGE = IoPackage.INPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT__USER_ALIAS = IoPackage.INPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Sensor Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT_FEATURE_COUNT = IoPackage.INPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INPUT_OPERATION_COUNT = IoPackage.INPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput <em>Controller Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getControllerInput()
	 * @generated
	 */
	int CONTROLLER_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__BINDING = IoPackage.INPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__DEVICE = IoPackage.INPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__SERVICE_INSTANCE = IoPackage.INPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__SERVICE_NAME = IoPackage.INPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__BEGIN_TIME = IoPackage.INPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__DURATION = IoPackage.INPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__LANGUAGE = IoPackage.INPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT__USER_ALIAS = IoPackage.INPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Controller Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT_FEATURE_COUNT = IoPackage.INPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controller Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INPUT_OPERATION_COUNT = IoPackage.INPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput <em>Renderer Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getRendererOutput()
	 * @generated
	 */
	int RENDERER_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__BINDING = IoPackage.OUTPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__DEVICE = IoPackage.OUTPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__SERVICE_INSTANCE = IoPackage.OUTPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__SERVICE_NAME = IoPackage.OUTPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__BEGIN_TIME = IoPackage.OUTPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__DURATION = IoPackage.OUTPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__LANGUAGE = IoPackage.OUTPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT__USER_ALIAS = IoPackage.OUTPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Renderer Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT_FEATURE_COUNT = IoPackage.OUTPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Renderer Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OUTPUT_OPERATION_COUNT = IoPackage.OUTPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput <em>Actuator Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getActuatorOutput()
	 * @generated
	 */
	int ACTUATOR_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__BINDING = IoPackage.OUTPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__DEVICE = IoPackage.OUTPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__SERVICE_INSTANCE = IoPackage.OUTPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__SERVICE_NAME = IoPackage.OUTPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__BEGIN_TIME = IoPackage.OUTPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__DURATION = IoPackage.OUTPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__LANGUAGE = IoPackage.OUTPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT__USER_ALIAS = IoPackage.OUTPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Actuator Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT_FEATURE_COUNT = IoPackage.OUTPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OUTPUT_OPERATION_COUNT = IoPackage.OUTPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.AcousticEventImpl <em>Acoustic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.AcousticEventImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getAcousticEvent()
	 * @generated
	 */
	int ACOUSTIC_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__BINDING = CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__DEVICE = CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__SERVICE_INSTANCE = CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__SERVICE_NAME = CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__BEGIN_TIME = CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__DURATION = CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__LANGUAGE = CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT__USER_ALIAS = CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Acoustic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT_FEATURE_COUNT = CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acoustic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_EVENT_OPERATION_COUNT = CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Gesture <em>Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Gesture
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getGesture()
	 * @generated
	 */
	int GESTURE = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__BINDING = CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__DEVICE = CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__SERVICE_INSTANCE = CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__SERVICE_NAME = CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__BEGIN_TIME = CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__DURATION = CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__LANGUAGE = CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE__USER_ALIAS = CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_FEATURE_COUNT = CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_OPERATION_COUNT = CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl <em>Hand Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getHandGesture()
	 * @generated
	 */
	int HAND_GESTURE = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__BINDING = GESTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__DEVICE = GESTURE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__SERVICE_INSTANCE = GESTURE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__SERVICE_NAME = GESTURE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__BEGIN_TIME = GESTURE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__DURATION = GESTURE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__LANGUAGE = GESTURE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__USER_ALIAS = GESTURE__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Fingers Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__FINGERS_LEFT = GESTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fingers Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__FINGERS_RIGHT = GESTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__LEVEL_LEFT = GESTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__LEVEL_RIGHT = GESTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__GESTURE = GESTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gesture Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE__GESTURE_DIRECTION = GESTURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hand Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE_FEATURE_COUNT = GESTURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hand Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAND_GESTURE_OPERATION_COUNT = GESTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.BodyGestureImpl <em>Body Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.BodyGestureImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getBodyGesture()
	 * @generated
	 */
	int BODY_GESTURE = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__BINDING = GESTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__DEVICE = GESTURE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__SERVICE_INSTANCE = GESTURE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__SERVICE_NAME = GESTURE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__BEGIN_TIME = GESTURE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__DURATION = GESTURE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__LANGUAGE = GESTURE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE__USER_ALIAS = GESTURE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Body Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE_FEATURE_COUNT = GESTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Body Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_GESTURE_OPERATION_COUNT = GESTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl <em>Eye Gaze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getEyeGaze()
	 * @generated
	 */
	int EYE_GAZE = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__BINDING = CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__DEVICE = CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__SERVICE_INSTANCE = CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__SERVICE_NAME = CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__BEGIN_TIME = CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__DURATION = CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__LANGUAGE = CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__USER_ALIAS = CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Left Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__LEFT_EYE = CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE__RIGHT_EYE = CONTROLLER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eye Gaze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE_FEATURE_COUNT = CONTROLLER_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eye Gaze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_GAZE_OPERATION_COUNT = CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl <em>Head Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getHeadGesture()
	 * @generated
	 */
	int HEAD_GESTURE = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__BINDING = GESTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__DEVICE = GESTURE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__SERVICE_INSTANCE = GESTURE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__SERVICE_NAME = GESTURE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__BEGIN_TIME = GESTURE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__DURATION = GESTURE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__LANGUAGE = GESTURE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__USER_ALIAS = GESTURE__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Common Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__COMMON_GESTURE = GESTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__PITCH = GESTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__DISTANCE = GESTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__YAW = GESTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE__ROLL = GESTURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Head Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE_FEATURE_COUNT = GESTURE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Head Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_GESTURE_OPERATION_COUNT = GESTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.PointingGestureImpl <em>Pointing Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.PointingGestureImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getPointingGesture()
	 * @generated
	 */
	int POINTING_GESTURE = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__BINDING = GESTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__DEVICE = GESTURE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__SERVICE_INSTANCE = GESTURE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__SERVICE_NAME = GESTURE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__BEGIN_TIME = GESTURE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__DURATION = GESTURE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__LANGUAGE = GESTURE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__USER_ALIAS = GESTURE__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE__COORDINATE = GESTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointing Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE_FEATURE_COUNT = GESTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pointing Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_GESTURE_OPERATION_COUNT = GESTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechImpl <em>Speech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeech()
	 * @generated
	 */
	int SPEECH = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__BINDING = CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__DEVICE = CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__SERVICE_INSTANCE = CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__SERVICE_NAME = CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__BEGIN_TIME = CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__DURATION = CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__LANGUAGE = CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__USER_ALIAS = CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__WORDS = CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__UTTERANCE = CONTROLLER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__SIGNAL_URI = CONTROLLER_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH__PROBLEM = CONTROLLER_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURE_COUNT = CONTROLLER_INPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OPERATION_COUNT = CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis <em>ISpeech Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getISpeechSynthesis()
	 * @generated
	 */
	int ISPEECH_SYNTHESIS = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__BINDING = RENDERER_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__DEVICE = RENDERER_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__SERVICE_INSTANCE = RENDERER_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__SERVICE_NAME = RENDERER_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__BEGIN_TIME = RENDERER_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__DURATION = RENDERER_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__LANGUAGE = RENDERER_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS__USER_ALIAS = RENDERER_OUTPUT__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>ISpeech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS_FEATURE_COUNT = RENDERER_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISpeech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEECH_SYNTHESIS_OPERATION_COUNT = RENDERER_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechSynthesisImpl <em>Speech Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechSynthesisImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechSynthesis()
	 * @generated
	 */
	int SPEECH_SYNTHESIS = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__BINDING = ISPEECH_SYNTHESIS__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__DEVICE = ISPEECH_SYNTHESIS__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__SERVICE_INSTANCE = ISPEECH_SYNTHESIS__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__SERVICE_NAME = ISPEECH_SYNTHESIS__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__BEGIN_TIME = ISPEECH_SYNTHESIS__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__DURATION = ISPEECH_SYNTHESIS__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__LANGUAGE = ISPEECH_SYNTHESIS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__USER_ALIAS = ISPEECH_SYNTHESIS__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS__UTTERANCE = ISPEECH_SYNTHESIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_FEATURE_COUNT = ISPEECH_SYNTHESIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_OPERATION_COUNT = ISPEECH_SYNTHESIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.AudioTrackImpl <em>Audio Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.AudioTrackImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getAudioTrack()
	 * @generated
	 */
	int AUDIO_TRACK = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__BINDING = RENDERER_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__DEVICE = RENDERER_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__SERVICE_INSTANCE = RENDERER_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__SERVICE_NAME = RENDERER_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__BEGIN_TIME = RENDERER_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__DURATION = RENDERER_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__LANGUAGE = RENDERER_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__USER_ALIAS = RENDERER_OUTPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__TRACK_ID = RENDERER_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__URI = RENDERER_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Audio Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK_FEATURE_COUNT = RENDERER_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Audio Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK_OPERATION_COUNT = RENDERER_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl <em>Virtual Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getVirtualCharacter()
	 * @generated
	 */
	int VIRTUAL_CHARACTER = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__BINDING = RENDERER_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__DEVICE = RENDERER_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__SERVICE_INSTANCE = RENDERER_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__SERVICE_NAME = RENDERER_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__BEGIN_TIME = RENDERER_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__DURATION = RENDERER_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__LANGUAGE = RENDERER_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__USER_ALIAS = RENDERER_OUTPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__UTTERANCE = RENDERER_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avatar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__AVATAR_ID = RENDERER_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__CAMERA = RENDERER_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER__BML = RENDERER_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Virtual Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER_FEATURE_COUNT = RENDERER_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Virtual Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CHARACTER_OPERATION_COUNT = RENDERER_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl <em>Eye Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getEyeData()
	 * @generated
	 */
	int EYE_DATA = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Gaze Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__GAZE_POS_X = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gaze Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__GAZE_POS_Y = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Camera Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__CAMERA_POS_X = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Camera Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__CAMERA_POS_Y = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pupil Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__PUPIL_DIAMETER = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__DISTANCE = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Confusion Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA__CONFUSION_CONFIDENCE = BasePackage.BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Eye Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Eye Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYE_DATA_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl <em>Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__CONFIDENCE = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phonemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__PHONEMES = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__TEXT = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__LEXICAL_FORM = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__BEGIN_TIME = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__END_TIME = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.ThermometerImpl <em>Thermometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.ThermometerImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getThermometer()
	 * @generated
	 */
	int THERMOMETER = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__BINDING = SENSOR_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__DEVICE = SENSOR_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__SERVICE_INSTANCE = SENSOR_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__SERVICE_NAME = SENSOR_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__BEGIN_TIME = SENSOR_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__DURATION = SENSOR_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__LANGUAGE = SENSOR_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__USER_ALIAS = SENSOR_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__TEMPERATURE = SENSOR_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER__UNIT = SENSOR_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thermometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER_FEATURE_COUNT = SENSOR_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Thermometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMOMETER_OPERATION_COUNT = SENSOR_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.PulseMonitorImpl <em>Pulse Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.PulseMonitorImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getPulseMonitor()
	 * @generated
	 */
	int PULSE_MONITOR = 19;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__BINDING = SENSOR_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__DEVICE = SENSOR_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__SERVICE_INSTANCE = SENSOR_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__SERVICE_NAME = SENSOR_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__BEGIN_TIME = SENSOR_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__DURATION = SENSOR_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__LANGUAGE = SENSOR_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__USER_ALIAS = SENSOR_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Pulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR__PULSE = SENSOR_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pulse Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR_FEATURE_COUNT = SENSOR_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pulse Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_MONITOR_OPERATION_COUNT = SENSOR_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.LampControlImpl <em>Lamp Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.LampControlImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getLampControl()
	 * @generated
	 */
	int LAMP_CONTROL = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__BINDING = ACTUATOR_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__DEVICE = ACTUATOR_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__SERVICE_INSTANCE = ACTUATOR_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__SERVICE_NAME = ACTUATOR_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__BEGIN_TIME = ACTUATOR_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__DURATION = ACTUATOR_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__LANGUAGE = ACTUATOR_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__USER_ALIAS = ACTUATOR_OUTPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>On State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__ON_STATE = ACTUATOR_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL__COLOR = ACTUATOR_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lamp Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL_FEATURE_COUNT = ACTUATOR_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lamp Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_CONTROL_OPERATION_COUNT = ACTUATOR_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VentilatorControlImpl <em>Ventilator Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.VentilatorControlImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getVentilatorControl()
	 * @generated
	 */
	int VENTILATOR_CONTROL = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__BINDING = ACTUATOR_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__DEVICE = ACTUATOR_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__SERVICE_INSTANCE = ACTUATOR_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__SERVICE_NAME = ACTUATOR_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__BEGIN_TIME = ACTUATOR_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__DURATION = ACTUATOR_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__LANGUAGE = ACTUATOR_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__USER_ALIAS = ACTUATOR_OUTPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL__LEVEL = ACTUATOR_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ventilator Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL_FEATURE_COUNT = ACTUATOR_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ventilator Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTILATOR_CONTROL_OPERATION_COUNT = ACTUATOR_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.TangibleImpl <em>Tangible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.TangibleImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getTangible()
	 * @generated
	 */
	int TANGIBLE = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__BINDING = CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__DEVICE = CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__SERVICE_INSTANCE = CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__SERVICE_NAME = CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__BEGIN_TIME = CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__DURATION = CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__LANGUAGE = CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE__USER_ALIAS = CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Tangible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_FEATURE_COUNT = CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tangible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANGIBLE_OPERATION_COUNT = CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl <em>Speech Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechFeatures()
	 * @generated
	 */
	int SPEECH_FEATURES = 23;

	/**
	 * The feature id for the '<em><b>Spearking Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURES__SPEARKING_RATE = 0;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURES__INTENSITY = 1;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURES__PITCH = 2;

	/**
	 * The number of structural features of the '<em>Speech Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Speech Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem <em>Speech Recognition Problem</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechRecognitionProblem()
	 * @generated
	 */
	int SPEECH_RECOGNITION_PROBLEM = 24;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Camera <em>Camera</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Camera
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 25;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.SensorInput <em>Sensor Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SensorInput
	 * @generated
	 */
	EClass getSensorInput();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput <em>Controller Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput
	 * @generated
	 */
	EClass getControllerInput();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput <em>Renderer Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renderer Output</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput
	 * @generated
	 */
	EClass getRendererOutput();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput <em>Actuator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Output</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput
	 * @generated
	 */
	EClass getActuatorOutput();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.AcousticEvent <em>Acoustic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acoustic Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.AcousticEvent
	 * @generated
	 */
	EClass getAcousticEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.Gesture <em>Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Gesture
	 * @generated
	 */
	EClass getGesture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture <em>Hand Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hand Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture
	 * @generated
	 */
	EClass getHandGesture();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersLeft <em>Fingers Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingers Left</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersLeft()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_FingersLeft();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersRight <em>Fingers Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingers Right</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getFingersRight()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_FingersRight();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelLeft <em>Level Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Left</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelLeft()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_LevelLeft();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelRight <em>Level Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Right</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getLevelRight()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_LevelRight();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGesture <em>Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGesture()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_Gesture();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGestureDirection <em>Gesture Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesture Direction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HandGesture#getGestureDirection()
	 * @see #getHandGesture()
	 * @generated
	 */
	EAttribute getHandGesture_GestureDirection();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.BodyGesture <em>Body Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.BodyGesture
	 * @generated
	 */
	EClass getBodyGesture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze <em>Eye Gaze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eye Gaze</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze
	 * @generated
	 */
	EClass getEyeGaze();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getLeftEye <em>Left Eye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Eye</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getLeftEye()
	 * @see #getEyeGaze()
	 * @generated
	 */
	EReference getEyeGaze_LeftEye();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getRightEye <em>Right Eye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Eye</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeGaze#getRightEye()
	 * @see #getEyeGaze()
	 * @generated
	 */
	EReference getEyeGaze_RightEye();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture <em>Head Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture
	 * @generated
	 */
	EClass getHeadGesture();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getCommonGesture <em>Common Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getCommonGesture()
	 * @see #getHeadGesture()
	 * @generated
	 */
	EAttribute getHeadGesture_CommonGesture();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getPitch()
	 * @see #getHeadGesture()
	 * @generated
	 */
	EAttribute getHeadGesture_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getDistance()
	 * @see #getHeadGesture()
	 * @generated
	 */
	EAttribute getHeadGesture_Distance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getYaw()
	 * @see #getHeadGesture()
	 * @generated
	 */
	EAttribute getHeadGesture_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.HeadGesture#getRoll()
	 * @see #getHeadGesture()
	 * @generated
	 */
	EAttribute getHeadGesture_Roll();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture <em>Pointing Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointing Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture
	 * @generated
	 */
	EClass getPointingGesture();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.PointingGesture#getCoordinate()
	 * @see #getPointingGesture()
	 * @generated
	 */
	EReference getPointingGesture_Coordinate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech <em>Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Speech
	 * @generated
	 */
	EClass getSpeech();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Speech#getWords()
	 * @see #getSpeech()
	 * @generated
	 */
	EReference getSpeech_Words();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utterance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Speech#getUtterance()
	 * @see #getSpeech()
	 * @generated
	 */
	EAttribute getSpeech_Utterance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getSignalUri <em>Signal Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Speech#getSignalUri()
	 * @see #getSpeech()
	 * @generated
	 */
	EAttribute getSpeech_SignalUri();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Speech#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Speech#getProblem()
	 * @see #getSpeech()
	 * @generated
	 */
	EAttribute getSpeech_Problem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis <em>ISpeech Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISpeech Synthesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis
	 * @generated
	 */
	EClass getISpeechSynthesis();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechSynthesis <em>Speech Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Synthesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechSynthesis
	 * @generated
	 */
	EClass getSpeechSynthesis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechSynthesis#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utterance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechSynthesis#getUtterance()
	 * @see #getSpeechSynthesis()
	 * @generated
	 */
	EAttribute getSpeechSynthesis_Utterance();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack <em>Audio Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Track</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack
	 * @generated
	 */
	EClass getAudioTrack();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getTrackId <em>Track Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getTrackId()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EAttribute getAudioTrack_TrackId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getUri()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EAttribute getAudioTrack_Uri();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter <em>Virtual Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Character</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter
	 * @generated
	 */
	EClass getVirtualCharacter();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utterance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getUtterance()
	 * @see #getVirtualCharacter()
	 * @generated
	 */
	EAttribute getVirtualCharacter_Utterance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getAvatarId <em>Avatar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getAvatarId()
	 * @see #getVirtualCharacter()
	 * @generated
	 */
	EAttribute getVirtualCharacter_AvatarId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getCamera()
	 * @see #getVirtualCharacter()
	 * @generated
	 */
	EAttribute getVirtualCharacter_Camera();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getBml <em>Bml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bml</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VirtualCharacter#getBml()
	 * @see #getVirtualCharacter()
	 * @generated
	 */
	EAttribute getVirtualCharacter_Bml();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData <em>Eye Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eye Data</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData
	 * @generated
	 */
	EClass getEyeData();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosX <em>Gaze Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaze Pos X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosX()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_GazePosX();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosY <em>Gaze Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaze Pos Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosY()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_GazePosY();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosX <em>Camera Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Pos X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosX()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_CameraPosX();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosY <em>Camera Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Pos Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosY()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_CameraPosY();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getPupilDiameter <em>Pupil Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pupil Diameter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getPupilDiameter()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_PupilDiameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getDistance()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_Distance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getConfusionConfidence <em>Confusion Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confusion Confidence</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getConfusionConfidence()
	 * @see #getEyeData()
	 * @generated
	 */
	EAttribute getEyeData_ConfusionConfidence();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word
	 * @generated
	 */
	EClass getWord();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getConfidence()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getPhonemes <em>Phonemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phonemes</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getPhonemes()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_Phonemes();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getText()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getLexicalForm <em>Lexical Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Form</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getLexicalForm()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_LexicalForm();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getBeginTime <em>Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getBeginTime()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_BeginTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Word#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Word#getEndTime()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_EndTime();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.Thermometer <em>Thermometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermometer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Thermometer
	 * @generated
	 */
	EClass getThermometer();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Thermometer#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Thermometer#getTemperature()
	 * @see #getThermometer()
	 * @generated
	 */
	EAttribute getThermometer_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.Thermometer#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Thermometer#getUnit()
	 * @see #getThermometer()
	 * @generated
	 */
	EAttribute getThermometer_Unit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.PulseMonitor <em>Pulse Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pulse Monitor</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.PulseMonitor
	 * @generated
	 */
	EClass getPulseMonitor();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.PulseMonitor#getPulse <em>Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulse</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.PulseMonitor#getPulse()
	 * @see #getPulseMonitor()
	 * @generated
	 */
	EAttribute getPulseMonitor_Pulse();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.LampControl <em>Lamp Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp Control</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.LampControl
	 * @generated
	 */
	EClass getLampControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.LampControl#getOnState <em>On State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.LampControl#getOnState()
	 * @see #getLampControl()
	 * @generated
	 */
	EAttribute getLampControl_OnState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.LampControl#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.LampControl#getColor()
	 * @see #getLampControl()
	 * @generated
	 */
	EAttribute getLampControl_Color();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.VentilatorControl <em>Ventilator Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ventilator Control</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VentilatorControl
	 * @generated
	 */
	EClass getVentilatorControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.VentilatorControl#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.VentilatorControl#getLevel()
	 * @see #getVentilatorControl()
	 * @generated
	 */
	EAttribute getVentilatorControl_Level();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.Tangible <em>Tangible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tangible</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Tangible
	 * @generated
	 */
	EClass getTangible();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures <em>Speech Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Features</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures
	 * @generated
	 */
	EClass getSpeechFeatures();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getSpearkingRate <em>Spearking Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spearking Rate</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getSpearkingRate()
	 * @see #getSpeechFeatures()
	 * @generated
	 */
	EAttribute getSpeechFeatures_SpearkingRate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getIntensity()
	 * @see #getSpeechFeatures()
	 * @generated
	 */
	EAttribute getSpeechFeatures_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechFeatures#getPitch()
	 * @see #getSpeechFeatures()
	 * @generated
	 */
	EAttribute getSpeechFeatures_Pitch();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem <em>Speech Recognition Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speech Recognition Problem</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem
	 * @generated
	 */
	EEnum getSpeechRecognitionProblem();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io_interfaces.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Camera</em>'.
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Camera
	 * @generated
	 */
	EEnum getCamera();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Io_interfacesFactory getIo_interfacesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SensorInput <em>Sensor Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.SensorInput
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSensorInput()
		 * @generated
		 */
		EClass SENSOR_INPUT = eINSTANCE.getSensorInput();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput <em>Controller Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.ControllerInput
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getControllerInput()
		 * @generated
		 */
		EClass CONTROLLER_INPUT = eINSTANCE.getControllerInput();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput <em>Renderer Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.RendererOutput
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getRendererOutput()
		 * @generated
		 */
		EClass RENDERER_OUTPUT = eINSTANCE.getRendererOutput();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput <em>Actuator Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.ActuatorOutput
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getActuatorOutput()
		 * @generated
		 */
		EClass ACTUATOR_OUTPUT = eINSTANCE.getActuatorOutput();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.AcousticEventImpl <em>Acoustic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.AcousticEventImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getAcousticEvent()
		 * @generated
		 */
		EClass ACOUSTIC_EVENT = eINSTANCE.getAcousticEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Gesture <em>Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.Gesture
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getGesture()
		 * @generated
		 */
		EClass GESTURE = eINSTANCE.getGesture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl <em>Hand Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.HandGestureImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getHandGesture()
		 * @generated
		 */
		EClass HAND_GESTURE = eINSTANCE.getHandGesture();

		/**
		 * The meta object literal for the '<em><b>Fingers Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__FINGERS_LEFT = eINSTANCE.getHandGesture_FingersLeft();

		/**
		 * The meta object literal for the '<em><b>Fingers Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__FINGERS_RIGHT = eINSTANCE.getHandGesture_FingersRight();

		/**
		 * The meta object literal for the '<em><b>Level Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__LEVEL_LEFT = eINSTANCE.getHandGesture_LevelLeft();

		/**
		 * The meta object literal for the '<em><b>Level Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__LEVEL_RIGHT = eINSTANCE.getHandGesture_LevelRight();

		/**
		 * The meta object literal for the '<em><b>Gesture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__GESTURE = eINSTANCE.getHandGesture_Gesture();

		/**
		 * The meta object literal for the '<em><b>Gesture Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAND_GESTURE__GESTURE_DIRECTION = eINSTANCE.getHandGesture_GestureDirection();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.BodyGestureImpl <em>Body Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.BodyGestureImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getBodyGesture()
		 * @generated
		 */
		EClass BODY_GESTURE = eINSTANCE.getBodyGesture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl <em>Eye Gaze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeGazeImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getEyeGaze()
		 * @generated
		 */
		EClass EYE_GAZE = eINSTANCE.getEyeGaze();

		/**
		 * The meta object literal for the '<em><b>Left Eye</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EYE_GAZE__LEFT_EYE = eINSTANCE.getEyeGaze_LeftEye();

		/**
		 * The meta object literal for the '<em><b>Right Eye</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EYE_GAZE__RIGHT_EYE = eINSTANCE.getEyeGaze_RightEye();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl <em>Head Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.HeadGestureImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getHeadGesture()
		 * @generated
		 */
		EClass HEAD_GESTURE = eINSTANCE.getHeadGesture();

		/**
		 * The meta object literal for the '<em><b>Common Gesture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_GESTURE__COMMON_GESTURE = eINSTANCE.getHeadGesture_CommonGesture();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_GESTURE__PITCH = eINSTANCE.getHeadGesture_Pitch();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_GESTURE__DISTANCE = eINSTANCE.getHeadGesture_Distance();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_GESTURE__YAW = eINSTANCE.getHeadGesture_Yaw();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_GESTURE__ROLL = eINSTANCE.getHeadGesture_Roll();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.PointingGestureImpl <em>Pointing Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.PointingGestureImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getPointingGesture()
		 * @generated
		 */
		EClass POINTING_GESTURE = eINSTANCE.getPointingGesture();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTING_GESTURE__COORDINATE = eINSTANCE.getPointingGesture_Coordinate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechImpl <em>Speech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeech()
		 * @generated
		 */
		EClass SPEECH = eINSTANCE.getSpeech();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH__WORDS = eINSTANCE.getSpeech_Words();

		/**
		 * The meta object literal for the '<em><b>Utterance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH__UTTERANCE = eINSTANCE.getSpeech_Utterance();

		/**
		 * The meta object literal for the '<em><b>Signal Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH__SIGNAL_URI = eINSTANCE.getSpeech_SignalUri();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH__PROBLEM = eINSTANCE.getSpeech_Problem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis <em>ISpeech Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.ISpeechSynthesis
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getISpeechSynthesis()
		 * @generated
		 */
		EClass ISPEECH_SYNTHESIS = eINSTANCE.getISpeechSynthesis();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechSynthesisImpl <em>Speech Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechSynthesisImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechSynthesis()
		 * @generated
		 */
		EClass SPEECH_SYNTHESIS = eINSTANCE.getSpeechSynthesis();

		/**
		 * The meta object literal for the '<em><b>Utterance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SYNTHESIS__UTTERANCE = eINSTANCE.getSpeechSynthesis_Utterance();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.AudioTrackImpl <em>Audio Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.AudioTrackImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getAudioTrack()
		 * @generated
		 */
		EClass AUDIO_TRACK = eINSTANCE.getAudioTrack();

		/**
		 * The meta object literal for the '<em><b>Track Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TRACK__TRACK_ID = eINSTANCE.getAudioTrack_TrackId();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TRACK__URI = eINSTANCE.getAudioTrack_Uri();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl <em>Virtual Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.VirtualCharacterImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getVirtualCharacter()
		 * @generated
		 */
		EClass VIRTUAL_CHARACTER = eINSTANCE.getVirtualCharacter();

		/**
		 * The meta object literal for the '<em><b>Utterance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_CHARACTER__UTTERANCE = eINSTANCE.getVirtualCharacter_Utterance();

		/**
		 * The meta object literal for the '<em><b>Avatar Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_CHARACTER__AVATAR_ID = eINSTANCE.getVirtualCharacter_AvatarId();

		/**
		 * The meta object literal for the '<em><b>Camera</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_CHARACTER__CAMERA = eINSTANCE.getVirtualCharacter_Camera();

		/**
		 * The meta object literal for the '<em><b>Bml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_CHARACTER__BML = eINSTANCE.getVirtualCharacter_Bml();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl <em>Eye Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.EyeDataImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getEyeData()
		 * @generated
		 */
		EClass EYE_DATA = eINSTANCE.getEyeData();

		/**
		 * The meta object literal for the '<em><b>Gaze Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__GAZE_POS_X = eINSTANCE.getEyeData_GazePosX();

		/**
		 * The meta object literal for the '<em><b>Gaze Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__GAZE_POS_Y = eINSTANCE.getEyeData_GazePosY();

		/**
		 * The meta object literal for the '<em><b>Camera Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__CAMERA_POS_X = eINSTANCE.getEyeData_CameraPosX();

		/**
		 * The meta object literal for the '<em><b>Camera Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__CAMERA_POS_Y = eINSTANCE.getEyeData_CameraPosY();

		/**
		 * The meta object literal for the '<em><b>Pupil Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__PUPIL_DIAMETER = eINSTANCE.getEyeData_PupilDiameter();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__DISTANCE = eINSTANCE.getEyeData_Distance();

		/**
		 * The meta object literal for the '<em><b>Confusion Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EYE_DATA__CONFUSION_CONFIDENCE = eINSTANCE.getEyeData_ConfusionConfidence();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl <em>Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.WordImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getWord()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__CONFIDENCE = eINSTANCE.getWord_Confidence();

		/**
		 * The meta object literal for the '<em><b>Phonemes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__PHONEMES = eINSTANCE.getWord_Phonemes();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__TEXT = eINSTANCE.getWord_Text();

		/**
		 * The meta object literal for the '<em><b>Lexical Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__LEXICAL_FORM = eINSTANCE.getWord_LexicalForm();

		/**
		 * The meta object literal for the '<em><b>Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__BEGIN_TIME = eINSTANCE.getWord_BeginTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__END_TIME = eINSTANCE.getWord_EndTime();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.ThermometerImpl <em>Thermometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.ThermometerImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getThermometer()
		 * @generated
		 */
		EClass THERMOMETER = eINSTANCE.getThermometer();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THERMOMETER__TEMPERATURE = eINSTANCE.getThermometer_Temperature();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THERMOMETER__UNIT = eINSTANCE.getThermometer_Unit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.PulseMonitorImpl <em>Pulse Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.PulseMonitorImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getPulseMonitor()
		 * @generated
		 */
		EClass PULSE_MONITOR = eINSTANCE.getPulseMonitor();

		/**
		 * The meta object literal for the '<em><b>Pulse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_MONITOR__PULSE = eINSTANCE.getPulseMonitor_Pulse();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.LampControlImpl <em>Lamp Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.LampControlImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getLampControl()
		 * @generated
		 */
		EClass LAMP_CONTROL = eINSTANCE.getLampControl();

		/**
		 * The meta object literal for the '<em><b>On State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMP_CONTROL__ON_STATE = eINSTANCE.getLampControl_OnState();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMP_CONTROL__COLOR = eINSTANCE.getLampControl_Color();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.VentilatorControlImpl <em>Ventilator Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.VentilatorControlImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getVentilatorControl()
		 * @generated
		 */
		EClass VENTILATOR_CONTROL = eINSTANCE.getVentilatorControl();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENTILATOR_CONTROL__LEVEL = eINSTANCE.getVentilatorControl_Level();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.TangibleImpl <em>Tangible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.TangibleImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getTangible()
		 * @generated
		 */
		EClass TANGIBLE = eINSTANCE.getTangible();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl <em>Speech Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.SpeechFeaturesImpl
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechFeatures()
		 * @generated
		 */
		EClass SPEECH_FEATURES = eINSTANCE.getSpeechFeatures();

		/**
		 * The meta object literal for the '<em><b>Spearking Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_FEATURES__SPEARKING_RATE = eINSTANCE.getSpeechFeatures_SpearkingRate();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_FEATURES__INTENSITY = eINSTANCE.getSpeechFeatures_Intensity();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_FEATURES__PITCH = eINSTANCE.getSpeechFeatures_Pitch();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem <em>Speech Recognition Problem</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.SpeechRecognitionProblem
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getSpeechRecognitionProblem()
		 * @generated
		 */
		EEnum SPEECH_RECOGNITION_PROBLEM = eINSTANCE.getSpeechRecognitionProblem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io_interfaces.Camera <em>Camera</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.Camera
		 * @see de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl#getCamera()
		 * @generated
		 */
		EEnum CAMERA = eINSTANCE.getCamera();

	}

} //Io_interfacesPackage
