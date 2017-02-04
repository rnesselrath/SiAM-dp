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
package de.dfki.iui.mmds.core.model.primitiveTasks.input;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTasksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "input";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.dfki.iui.mmds.modalities.input.primitiveTasks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptInput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputPackage eINSTANCE = de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PrimitiveInputTaskImpl <em>Primitive Input Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PrimitiveInputTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getPrimitiveInputTask()
	 * @generated
	 */
	int PRIMITIVE_INPUT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__BINDING = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__DEVICE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__SERVICE_NAME = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__BEGIN_TIME = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__DURATION = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__LANGUAGE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK__USER_ALIAS = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Primitive Input Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK_FEATURE_COUNT = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Primitive Input Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INPUT_TASK_OPERATION_COUNT = PrimitiveTasksPackage.PRIMITIVE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ContainerManipulationTaskBaseImpl <em>Container Manipulation Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ContainerManipulationTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getContainerManipulationTaskBase()
	 * @generated
	 */
	int CONTAINER_MANIPULATION_TASK_BASE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Container Manipulation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Manipulation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MANIPULATION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.SelectionTaskBaseImpl <em>Selection Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.SelectionTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getSelectionTaskBase()
	 * @generated
	 */
	int SELECTION_TASK_BASE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Selection Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FactEntryTaskBaseImpl <em>Fact Entry Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FactEntryTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getFactEntryTaskBase()
	 * @generated
	 */
	int FACT_ENTRY_TASK_BASE = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Fact Entry Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Entry Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.NavigationTaskBaseImpl <em>Navigation Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.NavigationTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getNavigationTaskBase()
	 * @generated
	 */
	int NAVIGATION_TASK_BASE = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Navigation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InvocationTaskBaseImpl <em>Invocation Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InvocationTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getInvocationTaskBase()
	 * @generated
	 */
	int INVOCATION_TASK_BASE = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Invocation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invocation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.AdaptationTaskBaseImpl <em>Adaptation Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.AdaptationTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getAdaptationTaskBase()
	 * @generated
	 */
	int ADAPTATION_TASK_BASE = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Adaptation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adaptation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ZoomTaskImpl <em>Zoom Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ZoomTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getZoomTask()
	 * @generated
	 */
	int ZOOM_TASK = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__BINDING = CONTAINER_MANIPULATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__DEVICE = CONTAINER_MANIPULATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__SERVICE_INSTANCE = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__SERVICE_NAME = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__BEGIN_TIME = CONTAINER_MANIPULATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__DURATION = CONTAINER_MANIPULATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__LANGUAGE = CONTAINER_MANIPULATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK__USER_ALIAS = CONTAINER_MANIPULATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Zoom Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK_FEATURE_COUNT = CONTAINER_MANIPULATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zoom Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_TASK_OPERATION_COUNT = CONTAINER_MANIPULATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PanTaskImpl <em>Pan Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PanTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getPanTask()
	 * @generated
	 */
	int PAN_TASK = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__BINDING = CONTAINER_MANIPULATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__DEVICE = CONTAINER_MANIPULATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__SERVICE_INSTANCE = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__SERVICE_NAME = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__BEGIN_TIME = CONTAINER_MANIPULATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__DURATION = CONTAINER_MANIPULATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__LANGUAGE = CONTAINER_MANIPULATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK__USER_ALIAS = CONTAINER_MANIPULATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Pan Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK_FEATURE_COUNT = CONTAINER_MANIPULATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pan Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TASK_OPERATION_COUNT = CONTAINER_MANIPULATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ScrollTaskImpl <em>Scroll Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ScrollTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getScrollTask()
	 * @generated
	 */
	int SCROLL_TASK = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__BINDING = CONTAINER_MANIPULATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__DEVICE = CONTAINER_MANIPULATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__SERVICE_INSTANCE = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__SERVICE_NAME = CONTAINER_MANIPULATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__BEGIN_TIME = CONTAINER_MANIPULATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__DURATION = CONTAINER_MANIPULATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__LANGUAGE = CONTAINER_MANIPULATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK__USER_ALIAS = CONTAINER_MANIPULATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Scroll Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK_FEATURE_COUNT = CONTAINER_MANIPULATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scroll Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_TASK_OPERATION_COUNT = CONTAINER_MANIPULATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntraDocumentNavigationTaskImpl <em>Intra Document Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntraDocumentNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getIntraDocumentNavigationTask()
	 * @generated
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__BINDING = NAVIGATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__DEVICE = NAVIGATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__SERVICE_INSTANCE = NAVIGATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__SERVICE_NAME = NAVIGATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__BEGIN_TIME = NAVIGATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__DURATION = NAVIGATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__LANGUAGE = NAVIGATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK__USER_ALIAS = NAVIGATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Intra Document Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK_FEATURE_COUNT = NAVIGATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intra Document Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_DOCUMENT_NAVIGATION_TASK_OPERATION_COUNT = NAVIGATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowDirectionalNavigationTaskImpl <em>Dialog Flow Directional Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowDirectionalNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowDirectionalNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BINDING = NAVIGATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DEVICE = NAVIGATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_INSTANCE = NAVIGATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_NAME = NAVIGATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BEGIN_TIME = NAVIGATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DURATION = NAVIGATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__LANGUAGE = NAVIGATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__USER_ALIAS = NAVIGATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Directional Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_FEATURE_COUNT = NAVIGATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Directional Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_OPERATION_COUNT = NAVIGATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowForwardNavigationTaskImpl <em>Dialog Flow Forward Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowForwardNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowForwardNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__BINDING = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__DURATION = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Forward Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Forward Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_FORWARD_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowBackwardNavigationTaskImpl <em>Dialog Flow Backward Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowBackwardNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowBackwardNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__BINDING = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__DURATION = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Backward Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Backward Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_BACKWARD_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowStartNavigationTaskImpl <em>Dialog Flow Start Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowStartNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowStartNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__BINDING = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__DURATION = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Start Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Start Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_START_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowEndNavigationTaskImpl <em>Dialog Flow End Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowEndNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowEndNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__BINDING = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__DURATION = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow End Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow End Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_END_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowRandomNavigationTaskImpl <em>Dialog Flow Random Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowRandomNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowRandomNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BINDING = NAVIGATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DEVICE = NAVIGATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_INSTANCE = NAVIGATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_NAME = NAVIGATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BEGIN_TIME = NAVIGATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DURATION = NAVIGATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__LANGUAGE = NAVIGATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK__USER_ALIAS = NAVIGATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Random Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK_FEATURE_COUNT = NAVIGATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Random Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_RANDOM_NAVIGATION_TASK_OPERATION_COUNT = NAVIGATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowCancelNavigationTaskImpl <em>Dialog Flow Cancel Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowCancelNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowCancelNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__BINDING = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__DURATION = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Cancel Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_RANDOM_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Cancel Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_CANCEL_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_RANDOM_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowLabelNavigationTaskImpl <em>Dialog Flow Label Navigation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowLabelNavigationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowLabelNavigationTask()
	 * @generated
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__BINDING = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__DEVICE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__SERVICE_INSTANCE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__SERVICE_NAME = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__BEGIN_TIME = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__DURATION = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__LANGUAGE = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK__USER_ALIAS = DIALOG_FLOW_RANDOM_NAVIGATION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Dialog Flow Label Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK_FEATURE_COUNT = DIALOG_FLOW_RANDOM_NAVIGATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialog Flow Label Navigation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FLOW_LABEL_NAVIGATION_TASK_OPERATION_COUNT = DIALOG_FLOW_RANDOM_NAVIGATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.CommandInvocationTaskImpl <em>Command Invocation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.CommandInvocationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getCommandInvocationTask()
	 * @generated
	 */
	int COMMAND_INVOCATION_TASK = 19;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__BINDING = INVOCATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__DEVICE = INVOCATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__SERVICE_INSTANCE = INVOCATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__SERVICE_NAME = INVOCATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__BEGIN_TIME = INVOCATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__DURATION = INVOCATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__LANGUAGE = INVOCATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK__USER_ALIAS = INVOCATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Command Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK_FEATURE_COUNT = INVOCATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_INVOCATION_TASK_OPERATION_COUNT = INVOCATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MenuInvocationTaskImpl <em>Menu Invocation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MenuInvocationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getMenuInvocationTask()
	 * @generated
	 */
	int MENU_INVOCATION_TASK = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__BINDING = INVOCATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__DEVICE = INVOCATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__SERVICE_INSTANCE = INVOCATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__SERVICE_NAME = INVOCATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__BEGIN_TIME = INVOCATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__DURATION = INVOCATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__LANGUAGE = INVOCATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK__USER_ALIAS = INVOCATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Menu Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK_FEATURE_COUNT = INVOCATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INVOCATION_TASK_OPERATION_COUNT = INVOCATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemActivationTaskImpl <em>Item Activation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemActivationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getItemActivationTask()
	 * @generated
	 */
	int ITEM_ACTIVATION_TASK = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__BINDING = SELECTION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__DEVICE = SELECTION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__SERVICE_INSTANCE = SELECTION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__SERVICE_NAME = SELECTION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__BEGIN_TIME = SELECTION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__DURATION = SELECTION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__LANGUAGE = SELECTION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK__USER_ALIAS = SELECTION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Item Activation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK_FEATURE_COUNT = SELECTION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Activation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ACTIVATION_TASK_OPERATION_COUNT = SELECTION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemRearrangementTaskImpl <em>Item Rearrangement Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemRearrangementTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getItemRearrangementTask()
	 * @generated
	 */
	int ITEM_REARRANGEMENT_TASK = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Item Rearrangement Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Rearrangement Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REARRANGEMENT_TASK_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpandInformationTaskImpl <em>Expand Information Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpandInformationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getExpandInformationTask()
	 * @generated
	 */
	int EXPAND_INFORMATION_TASK = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Expand Information Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expand Information Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_INFORMATION_TASK_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ASRErrorCorrectionTaskImpl <em>ASR Error Correction Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ASRErrorCorrectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getASRErrorCorrectionTask()
	 * @generated
	 */
	int ASR_ERROR_CORRECTION_TASK = 24;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>ASR Error Correction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ASR Error Correction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_ERROR_CORRECTION_TASK_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TextSelectionTaskImpl <em>Text Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TextSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getTextSelectionTask()
	 * @generated
	 */
	int TEXT_SELECTION_TASK = 25;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Text Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SELECTION_TASK_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ProactivityInvocationTaskImpl <em>Proactivity Invocation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ProactivityInvocationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getProactivityInvocationTask()
	 * @generated
	 */
	int PROACTIVITY_INVOCATION_TASK = 26;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__BINDING = ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__DEVICE = ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__SERVICE_INSTANCE = ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__SERVICE_NAME = ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__BEGIN_TIME = ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__DURATION = ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__LANGUAGE = ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK__USER_ALIAS = ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Proactivity Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK_FEATURE_COUNT = ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proactivity Invocation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROACTIVITY_INVOCATION_TASK_OPERATION_COUNT = ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpanationExpansionTaskImpl <em>Expanation Expansion Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpanationExpansionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getExpanationExpansionTask()
	 * @generated
	 */
	int EXPANATION_EXPANSION_TASK = 27;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__BINDING = ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__DEVICE = ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__SERVICE_INSTANCE = ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__SERVICE_NAME = ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__BEGIN_TIME = ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__DURATION = ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__LANGUAGE = ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK__USER_ALIAS = ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Expanation Expansion Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK_FEATURE_COUNT = ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expanation Expansion Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANATION_EXPANSION_TASK_OPERATION_COUNT = ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.RevertAdaptationTaskImpl <em>Revert Adaptation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.RevertAdaptationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getRevertAdaptationTask()
	 * @generated
	 */
	int REVERT_ADAPTATION_TASK = 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__BINDING = ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__DEVICE = ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__SERVICE_INSTANCE = ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__SERVICE_NAME = ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__BEGIN_TIME = ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__DURATION = ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__LANGUAGE = ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK__USER_ALIAS = ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Revert Adaptation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK_FEATURE_COUNT = ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Revert Adaptation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERT_ADAPTATION_TASK_OPERATION_COUNT = ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FreeTextEntryTaskImpl <em>Free Text Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FreeTextEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getFreeTextEntryTask()
	 * @generated
	 */
	int FREE_TEXT_ENTRY_TASK = 29;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Free Text Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Free Text Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DateTimeEntryTaskImpl <em>Date Time Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DateTimeEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDateTimeEntryTask()
	 * @generated
	 */
	int DATE_TIME_ENTRY_TASK = 30;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Date Time Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Time Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntegerNumberEntryTaskImpl <em>Integer Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntegerNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getIntegerNumberEntryTask()
	 * @generated
	 */
	int INTEGER_NUMBER_ENTRY_TASK = 31;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.BoundedIntegerNumberEntryTaskImpl <em>Bounded Integer Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.BoundedIntegerNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getBoundedIntegerNumberEntryTask()
	 * @generated
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK = 32;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BINDING = INTEGER_NUMBER_ENTRY_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DEVICE = INTEGER_NUMBER_ENTRY_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME = INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME = INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DURATION = INTEGER_NUMBER_ENTRY_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__LANGUAGE = INTEGER_NUMBER_ENTRY_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS = INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Bounded Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT = INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bounded Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT = INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DecimalNumberEntryTaskImpl <em>Decimal Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DecimalNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDecimalNumberEntryTask()
	 * @generated
	 */
	int DECIMAL_NUMBER_ENTRY_TASK = 33;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Decimal Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.YesNoSelectionTaskImpl <em>Yes No Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.YesNoSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getYesNoSelectionTask()
	 * @generated
	 */
	int YES_NO_SELECTION_TASK = 34;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Yes No Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Yes No Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TriStateSelectionTaskImpl <em>Tri State Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TriStateSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getTriStateSelectionTask()
	 * @generated
	 */
	int TRI_STATE_SELECTION_TASK = 35;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__BINDING = FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__DEVICE = FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__SERVICE_INSTANCE = FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__SERVICE_NAME = FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__BEGIN_TIME = FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__DURATION = FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__LANGUAGE = FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__USER_ALIAS = FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Tri State Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK_FEATURE_COUNT = FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tri State Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK_OPERATION_COUNT = FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemSelectionTaskImpl <em>List Item Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getListItemSelectionTask()
	 * @generated
	 */
	int LIST_ITEM_SELECTION_TASK = 36;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__BINDING = SELECTION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__DEVICE = SELECTION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__SERVICE_INSTANCE = SELECTION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__SERVICE_NAME = SELECTION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__BEGIN_TIME = SELECTION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__DURATION = SELECTION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__LANGUAGE = SELECTION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__USER_ALIAS = SELECTION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK_FEATURE_COUNT = SELECTION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK_OPERATION_COUNT = SELECTION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemMultiSelectionTaskImpl <em>List Item Multi Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemMultiSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getListItemMultiSelectionTask()
	 * @generated
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK = 37;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__BINDING = PRIMITIVE_INPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__DEVICE = PRIMITIVE_INPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_INPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__SERVICE_NAME = PRIMITIVE_INPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__BEGIN_TIME = PRIMITIVE_INPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__DURATION = PRIMITIVE_INPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__LANGUAGE = PRIMITIVE_INPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__USER_ALIAS = PRIMITIVE_INPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>List Item Multi Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK_FEATURE_COUNT = PRIMITIVE_INPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item Multi Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK_OPERATION_COUNT = PRIMITIVE_INPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MessageDismissalTaskImpl <em>Message Dismissal Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MessageDismissalTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getMessageDismissalTask()
	 * @generated
	 */
	int MESSAGE_DISMISSAL_TASK = 38;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__BINDING = ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__DEVICE = ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__SERVICE_INSTANCE = ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__SERVICE_NAME = ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__BEGIN_TIME = ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__DURATION = ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__LANGUAGE = ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__USER_ALIAS = ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Message Dismissal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK_FEATURE_COUNT = ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Dismissal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK_OPERATION_COUNT = ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ObjectSelectionTaskImpl <em>Object Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ObjectSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getObjectSelectionTask()
	 * @generated
	 */
	int OBJECT_SELECTION_TASK = 39;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__BINDING = SELECTION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__DEVICE = SELECTION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__SERVICE_INSTANCE = SELECTION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__SERVICE_NAME = SELECTION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__BEGIN_TIME = SELECTION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__DURATION = SELECTION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__LANGUAGE = SELECTION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__USER_ALIAS = SELECTION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Object Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK_FEATURE_COUNT = SELECTION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK_OPERATION_COUNT = SELECTION_TASK_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask <em>Primitive Input Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Input Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.PrimitiveInputTask
	 * @generated
	 */
	EClass getPrimitiveInputTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ContainerManipulationTaskBase <em>Container Manipulation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Manipulation Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ContainerManipulationTaskBase
	 * @generated
	 */
	EClass getContainerManipulationTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase <em>Selection Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.SelectionTaskBase
	 * @generated
	 */
	EClass getSelectionTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase <em>Fact Entry Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Entry Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.FactEntryTaskBase
	 * @generated
	 */
	EClass getFactEntryTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.NavigationTaskBase <em>Navigation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.NavigationTaskBase
	 * @generated
	 */
	EClass getNavigationTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.InvocationTaskBase <em>Invocation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.InvocationTaskBase
	 * @generated
	 */
	EClass getInvocationTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase <em>Adaptation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.AdaptationTaskBase
	 * @generated
	 */
	EClass getAdaptationTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ZoomTask <em>Zoom Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoom Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ZoomTask
	 * @generated
	 */
	EClass getZoomTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.PanTask <em>Pan Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pan Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.PanTask
	 * @generated
	 */
	EClass getPanTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ScrollTask <em>Scroll Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ScrollTask
	 * @generated
	 */
	EClass getScrollTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.IntraDocumentNavigationTask <em>Intra Document Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra Document Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.IntraDocumentNavigationTask
	 * @generated
	 */
	EClass getIntraDocumentNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowDirectionalNavigationTask <em>Dialog Flow Directional Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Directional Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowDirectionalNavigationTask
	 * @generated
	 */
	EClass getDialogFlowDirectionalNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowForwardNavigationTask <em>Dialog Flow Forward Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Forward Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowForwardNavigationTask
	 * @generated
	 */
	EClass getDialogFlowForwardNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowBackwardNavigationTask <em>Dialog Flow Backward Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Backward Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowBackwardNavigationTask
	 * @generated
	 */
	EClass getDialogFlowBackwardNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowStartNavigationTask <em>Dialog Flow Start Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Start Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowStartNavigationTask
	 * @generated
	 */
	EClass getDialogFlowStartNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowEndNavigationTask <em>Dialog Flow End Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow End Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowEndNavigationTask
	 * @generated
	 */
	EClass getDialogFlowEndNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowRandomNavigationTask <em>Dialog Flow Random Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Random Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowRandomNavigationTask
	 * @generated
	 */
	EClass getDialogFlowRandomNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowCancelNavigationTask <em>Dialog Flow Cancel Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Cancel Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowCancelNavigationTask
	 * @generated
	 */
	EClass getDialogFlowCancelNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowLabelNavigationTask <em>Dialog Flow Label Navigation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Flow Label Navigation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DialogFlowLabelNavigationTask
	 * @generated
	 */
	EClass getDialogFlowLabelNavigationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.CommandInvocationTask <em>Command Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Invocation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.CommandInvocationTask
	 * @generated
	 */
	EClass getCommandInvocationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.MenuInvocationTask <em>Menu Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Invocation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.MenuInvocationTask
	 * @generated
	 */
	EClass getMenuInvocationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemActivationTask <em>Item Activation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Activation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemActivationTask
	 * @generated
	 */
	EClass getItemActivationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemRearrangementTask <em>Item Rearrangement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Rearrangement Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ItemRearrangementTask
	 * @generated
	 */
	EClass getItemRearrangementTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpandInformationTask <em>Expand Information Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expand Information Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpandInformationTask
	 * @generated
	 */
	EClass getExpandInformationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ASRErrorCorrectionTask <em>ASR Error Correction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASR Error Correction Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ASRErrorCorrectionTask
	 * @generated
	 */
	EClass getASRErrorCorrectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.TextSelectionTask <em>Text Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.TextSelectionTask
	 * @generated
	 */
	EClass getTextSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ProactivityInvocationTask <em>Proactivity Invocation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proactivity Invocation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ProactivityInvocationTask
	 * @generated
	 */
	EClass getProactivityInvocationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpanationExpansionTask <em>Expanation Expansion Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expanation Expansion Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ExpanationExpansionTask
	 * @generated
	 */
	EClass getExpanationExpansionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.RevertAdaptationTask <em>Revert Adaptation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revert Adaptation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.RevertAdaptationTask
	 * @generated
	 */
	EClass getRevertAdaptationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.FreeTextEntryTask <em>Free Text Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.FreeTextEntryTask
	 * @generated
	 */
	EClass getFreeTextEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DateTimeEntryTask <em>Date Time Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DateTimeEntryTask
	 * @generated
	 */
	EClass getDateTimeEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask <em>Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.IntegerNumberEntryTask
	 * @generated
	 */
	EClass getIntegerNumberEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask <em>Bounded Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Integer Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.BoundedIntegerNumberEntryTask
	 * @generated
	 */
	EClass getBoundedIntegerNumberEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.DecimalNumberEntryTask <em>Decimal Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.DecimalNumberEntryTask
	 * @generated
	 */
	EClass getDecimalNumberEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.YesNoSelectionTask <em>Yes No Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yes No Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.YesNoSelectionTask
	 * @generated
	 */
	EClass getYesNoSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.TriStateSelectionTask <em>Tri State Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tri State Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.TriStateSelectionTask
	 * @generated
	 */
	EClass getTriStateSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask <em>List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemSelectionTask
	 * @generated
	 */
	EClass getListItemSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemMultiSelectionTask <em>List Item Multi Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Multi Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ListItemMultiSelectionTask
	 * @generated
	 */
	EClass getListItemMultiSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.MessageDismissalTask <em>Message Dismissal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Dismissal Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.MessageDismissalTask
	 * @generated
	 */
	EClass getMessageDismissalTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.ObjectSelectionTask <em>Object Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.ObjectSelectionTask
	 * @generated
	 */
	EClass getObjectSelectionTask();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputFactory getInputFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PrimitiveInputTaskImpl <em>Primitive Input Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PrimitiveInputTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getPrimitiveInputTask()
		 * @generated
		 */
		EClass PRIMITIVE_INPUT_TASK = eINSTANCE.getPrimitiveInputTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ContainerManipulationTaskBaseImpl <em>Container Manipulation Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ContainerManipulationTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getContainerManipulationTaskBase()
		 * @generated
		 */
		EClass CONTAINER_MANIPULATION_TASK_BASE = eINSTANCE.getContainerManipulationTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.SelectionTaskBaseImpl <em>Selection Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.SelectionTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getSelectionTaskBase()
		 * @generated
		 */
		EClass SELECTION_TASK_BASE = eINSTANCE.getSelectionTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FactEntryTaskBaseImpl <em>Fact Entry Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FactEntryTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getFactEntryTaskBase()
		 * @generated
		 */
		EClass FACT_ENTRY_TASK_BASE = eINSTANCE.getFactEntryTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.NavigationTaskBaseImpl <em>Navigation Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.NavigationTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getNavigationTaskBase()
		 * @generated
		 */
		EClass NAVIGATION_TASK_BASE = eINSTANCE.getNavigationTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InvocationTaskBaseImpl <em>Invocation Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InvocationTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getInvocationTaskBase()
		 * @generated
		 */
		EClass INVOCATION_TASK_BASE = eINSTANCE.getInvocationTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.AdaptationTaskBaseImpl <em>Adaptation Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.AdaptationTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getAdaptationTaskBase()
		 * @generated
		 */
		EClass ADAPTATION_TASK_BASE = eINSTANCE.getAdaptationTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ZoomTaskImpl <em>Zoom Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ZoomTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getZoomTask()
		 * @generated
		 */
		EClass ZOOM_TASK = eINSTANCE.getZoomTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PanTaskImpl <em>Pan Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.PanTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getPanTask()
		 * @generated
		 */
		EClass PAN_TASK = eINSTANCE.getPanTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ScrollTaskImpl <em>Scroll Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ScrollTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getScrollTask()
		 * @generated
		 */
		EClass SCROLL_TASK = eINSTANCE.getScrollTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntraDocumentNavigationTaskImpl <em>Intra Document Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntraDocumentNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getIntraDocumentNavigationTask()
		 * @generated
		 */
		EClass INTRA_DOCUMENT_NAVIGATION_TASK = eINSTANCE.getIntraDocumentNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowDirectionalNavigationTaskImpl <em>Dialog Flow Directional Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowDirectionalNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowDirectionalNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_DIRECTIONAL_NAVIGATION_TASK = eINSTANCE.getDialogFlowDirectionalNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowForwardNavigationTaskImpl <em>Dialog Flow Forward Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowForwardNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowForwardNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_FORWARD_NAVIGATION_TASK = eINSTANCE.getDialogFlowForwardNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowBackwardNavigationTaskImpl <em>Dialog Flow Backward Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowBackwardNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowBackwardNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_BACKWARD_NAVIGATION_TASK = eINSTANCE.getDialogFlowBackwardNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowStartNavigationTaskImpl <em>Dialog Flow Start Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowStartNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowStartNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_START_NAVIGATION_TASK = eINSTANCE.getDialogFlowStartNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowEndNavigationTaskImpl <em>Dialog Flow End Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowEndNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowEndNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_END_NAVIGATION_TASK = eINSTANCE.getDialogFlowEndNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowRandomNavigationTaskImpl <em>Dialog Flow Random Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowRandomNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowRandomNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_RANDOM_NAVIGATION_TASK = eINSTANCE.getDialogFlowRandomNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowCancelNavigationTaskImpl <em>Dialog Flow Cancel Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowCancelNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowCancelNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_CANCEL_NAVIGATION_TASK = eINSTANCE.getDialogFlowCancelNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowLabelNavigationTaskImpl <em>Dialog Flow Label Navigation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DialogFlowLabelNavigationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDialogFlowLabelNavigationTask()
		 * @generated
		 */
		EClass DIALOG_FLOW_LABEL_NAVIGATION_TASK = eINSTANCE.getDialogFlowLabelNavigationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.CommandInvocationTaskImpl <em>Command Invocation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.CommandInvocationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getCommandInvocationTask()
		 * @generated
		 */
		EClass COMMAND_INVOCATION_TASK = eINSTANCE.getCommandInvocationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MenuInvocationTaskImpl <em>Menu Invocation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MenuInvocationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getMenuInvocationTask()
		 * @generated
		 */
		EClass MENU_INVOCATION_TASK = eINSTANCE.getMenuInvocationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemActivationTaskImpl <em>Item Activation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemActivationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getItemActivationTask()
		 * @generated
		 */
		EClass ITEM_ACTIVATION_TASK = eINSTANCE.getItemActivationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemRearrangementTaskImpl <em>Item Rearrangement Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ItemRearrangementTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getItemRearrangementTask()
		 * @generated
		 */
		EClass ITEM_REARRANGEMENT_TASK = eINSTANCE.getItemRearrangementTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpandInformationTaskImpl <em>Expand Information Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpandInformationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getExpandInformationTask()
		 * @generated
		 */
		EClass EXPAND_INFORMATION_TASK = eINSTANCE.getExpandInformationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ASRErrorCorrectionTaskImpl <em>ASR Error Correction Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ASRErrorCorrectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getASRErrorCorrectionTask()
		 * @generated
		 */
		EClass ASR_ERROR_CORRECTION_TASK = eINSTANCE.getASRErrorCorrectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TextSelectionTaskImpl <em>Text Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TextSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getTextSelectionTask()
		 * @generated
		 */
		EClass TEXT_SELECTION_TASK = eINSTANCE.getTextSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ProactivityInvocationTaskImpl <em>Proactivity Invocation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ProactivityInvocationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getProactivityInvocationTask()
		 * @generated
		 */
		EClass PROACTIVITY_INVOCATION_TASK = eINSTANCE.getProactivityInvocationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpanationExpansionTaskImpl <em>Expanation Expansion Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ExpanationExpansionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getExpanationExpansionTask()
		 * @generated
		 */
		EClass EXPANATION_EXPANSION_TASK = eINSTANCE.getExpanationExpansionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.RevertAdaptationTaskImpl <em>Revert Adaptation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.RevertAdaptationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getRevertAdaptationTask()
		 * @generated
		 */
		EClass REVERT_ADAPTATION_TASK = eINSTANCE.getRevertAdaptationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FreeTextEntryTaskImpl <em>Free Text Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.FreeTextEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getFreeTextEntryTask()
		 * @generated
		 */
		EClass FREE_TEXT_ENTRY_TASK = eINSTANCE.getFreeTextEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DateTimeEntryTaskImpl <em>Date Time Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DateTimeEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDateTimeEntryTask()
		 * @generated
		 */
		EClass DATE_TIME_ENTRY_TASK = eINSTANCE.getDateTimeEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntegerNumberEntryTaskImpl <em>Integer Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.IntegerNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getIntegerNumberEntryTask()
		 * @generated
		 */
		EClass INTEGER_NUMBER_ENTRY_TASK = eINSTANCE.getIntegerNumberEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.BoundedIntegerNumberEntryTaskImpl <em>Bounded Integer Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.BoundedIntegerNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getBoundedIntegerNumberEntryTask()
		 * @generated
		 */
		EClass BOUNDED_INTEGER_NUMBER_ENTRY_TASK = eINSTANCE.getBoundedIntegerNumberEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DecimalNumberEntryTaskImpl <em>Decimal Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.DecimalNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getDecimalNumberEntryTask()
		 * @generated
		 */
		EClass DECIMAL_NUMBER_ENTRY_TASK = eINSTANCE.getDecimalNumberEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.YesNoSelectionTaskImpl <em>Yes No Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.YesNoSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getYesNoSelectionTask()
		 * @generated
		 */
		EClass YES_NO_SELECTION_TASK = eINSTANCE.getYesNoSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TriStateSelectionTaskImpl <em>Tri State Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.TriStateSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getTriStateSelectionTask()
		 * @generated
		 */
		EClass TRI_STATE_SELECTION_TASK = eINSTANCE.getTriStateSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemSelectionTaskImpl <em>List Item Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getListItemSelectionTask()
		 * @generated
		 */
		EClass LIST_ITEM_SELECTION_TASK = eINSTANCE.getListItemSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemMultiSelectionTaskImpl <em>List Item Multi Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ListItemMultiSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getListItemMultiSelectionTask()
		 * @generated
		 */
		EClass LIST_ITEM_MULTI_SELECTION_TASK = eINSTANCE.getListItemMultiSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MessageDismissalTaskImpl <em>Message Dismissal Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.MessageDismissalTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getMessageDismissalTask()
		 * @generated
		 */
		EClass MESSAGE_DISMISSAL_TASK = eINSTANCE.getMessageDismissalTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ObjectSelectionTaskImpl <em>Object Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.ObjectSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl#getObjectSelectionTask()
		 * @generated
		 */
		EClass OBJECT_SELECTION_TASK = eINSTANCE.getObjectSelectionTask();

	}

} //InputPackage
