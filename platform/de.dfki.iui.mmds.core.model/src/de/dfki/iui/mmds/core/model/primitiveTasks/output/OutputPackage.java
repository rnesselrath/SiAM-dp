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
package de.dfki.iui.mmds.core.model.primitiveTasks.output;

import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTasksPackage;

import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputFactory
 * @model kind="package"
 * @generated
 */
public interface OutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "output";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.dfki.iui.mmds.modalities.output.primitiveTasks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptOutput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutputPackage eINSTANCE = de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.PrimitiveOutputTaskImpl <em>Primitive Output Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.PrimitiveOutputTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getPrimitiveOutputTask()
	 * @generated
	 */
	int PRIMITIVE_OUTPUT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__BINDING = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__DEVICE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__SERVICE_NAME = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__BEGIN_TIME = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__DURATION = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__LANGUAGE = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK__USER_ALIAS = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Primitive Output Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT = PrimitiveTasksPackage.PRIMITIVE_TASK_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Primitive Output Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT = PrimitiveTasksPackage.PRIMITIVE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.SelectionTaskBaseImpl <em>Selection Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.SelectionTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getSelectionTaskBase()
	 * @generated
	 */
	int SELECTION_TASK_BASE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE__ITEM = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationTaskBaseImpl <em>Adaptation Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getAdaptationTaskBase()
	 * @generated
	 */
	int ADAPTATION_TASK_BASE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Adaptation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adaptation Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_TASK_BASE_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FactEntryTaskBaseImpl <em>Fact Entry Task Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FactEntryTaskBaseImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getFactEntryTaskBase()
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
	int FACT_ENTRY_TASK_BASE__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Fact Entry Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Entry Task Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ENTRY_TASK_BASE_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageTaskImpl <em>Message Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMessageTask()
	 * @generated
	 */
	int MESSAGE_TASK = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Message Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DocumentPresentationTaskImpl <em>Document Presentation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DocumentPresentationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDocumentPresentationTask()
	 * @generated
	 */
	int DOCUMENT_PRESENTATION_TASK = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Document Presentation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document Presentation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PRESENTATION_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.CommandSelectionTaskImpl <em>Command Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.CommandSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getCommandSelectionTask()
	 * @generated
	 */
	int COMMAND_SELECTION_TASK = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Command Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SELECTION_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MenuItemSelectionTaskImpl <em>Menu Item Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MenuItemSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMenuItemSelectionTask()
	 * @generated
	 */
	int MENU_ITEM_SELECTION_TASK = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Menu Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_SELECTION_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ProgressIndicationTaskImpl <em>Progress Indication Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ProgressIndicationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getProgressIndicationTask()
	 * @generated
	 */
	int PROGRESS_INDICATION_TASK = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK__PROGRESS = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Progress Indication Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Progress Indication Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_INDICATION_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationIndicationTaskImpl <em>Adaptation Indication Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationIndicationTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getAdaptationIndicationTask()
	 * @generated
	 */
	int ADAPTATION_INDICATION_TASK = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__BINDING = InputPackage.ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__DEVICE = InputPackage.ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__SERVICE_INSTANCE = InputPackage.ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__SERVICE_NAME = InputPackage.ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__BEGIN_TIME = InputPackage.ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__DURATION = InputPackage.ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__LANGUAGE = InputPackage.ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK__USER_ALIAS = InputPackage.ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Adaptation Indication Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK_FEATURE_COUNT = InputPackage.ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adaptation Indication Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_INDICATION_TASK_OPERATION_COUNT = InputPackage.ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ManipulableImageTaskImpl <em>Manipulable Image Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ManipulableImageTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getManipulableImageTask()
	 * @generated
	 */
	int MANIPULABLE_IMAGE_TASK = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Manipulable Image Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manipulable Image Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULABLE_IMAGE_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FreeTextEntryTaskImpl <em>Free Text Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FreeTextEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getFreeTextEntryTask()
	 * @generated
	 */
	int FREE_TEXT_ENTRY_TASK = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Free Text Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Free Text Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_ENTRY_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DateTimeEntryTaskImpl <em>Date Time Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DateTimeEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDateTimeEntryTask()
	 * @generated
	 */
	int DATE_TIME_ENTRY_TASK = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Date Time Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Time Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_ENTRY_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.IntegerNumberEntryTaskImpl <em>Integer Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.IntegerNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getIntegerNumberEntryTask()
	 * @generated
	 */
	int INTEGER_NUMBER_ENTRY_TASK = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.BoundedIntegerNumberEntryTaskImpl <em>Bounded Integer Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.BoundedIntegerNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getBoundedIntegerNumberEntryTask()
	 * @generated
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BINDING = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DEVICE = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DURATION = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__LANGUAGE = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MIN = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MAX = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Integer Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT = InputPackage.BOUNDED_INTEGER_NUMBER_ENTRY_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DecimalNumberEntryTaskImpl <em>Decimal Number Entry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DecimalNumberEntryTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDecimalNumberEntryTask()
	 * @generated
	 */
	int DECIMAL_NUMBER_ENTRY_TASK = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Decimal Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal Number Entry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_ENTRY_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.YesNoSelectionTaskImpl <em>Yes No Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.YesNoSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getYesNoSelectionTask()
	 * @generated
	 */
	int YES_NO_SELECTION_TASK = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Yes No Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Yes No Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_SELECTION_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.TriStateSelectionTaskImpl <em>Tri State Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.TriStateSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getTriStateSelectionTask()
	 * @generated
	 */
	int TRI_STATE_SELECTION_TASK = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__BINDING = InputPackage.FACT_ENTRY_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__DEVICE = InputPackage.FACT_ENTRY_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__SERVICE_INSTANCE = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__SERVICE_NAME = InputPackage.FACT_ENTRY_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__BEGIN_TIME = InputPackage.FACT_ENTRY_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__DURATION = InputPackage.FACT_ENTRY_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__LANGUAGE = InputPackage.FACT_ENTRY_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK__USER_ALIAS = InputPackage.FACT_ENTRY_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Tri State Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK_FEATURE_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tri State Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_STATE_SELECTION_TASK_OPERATION_COUNT = InputPackage.FACT_ENTRY_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemSelectionTaskImpl <em>List Item Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getListItemSelectionTask()
	 * @generated
	 */
	int LIST_ITEM_SELECTION_TASK = 18;

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
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__ITEM = SELECTION_TASK_BASE__ITEM;

	/**
	 * The feature id for the '<em><b>List Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK__LIST_ITEM = SELECTION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK_FEATURE_COUNT = SELECTION_TASK_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_SELECTION_TASK_OPERATION_COUNT = SELECTION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.LongListItemSelectionTaskImpl <em>Long List Item Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.LongListItemSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getLongListItemSelectionTask()
	 * @generated
	 */
	int LONG_LIST_ITEM_SELECTION_TASK = 19;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__BINDING = InputPackage.LIST_ITEM_SELECTION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__DEVICE = InputPackage.LIST_ITEM_SELECTION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__SERVICE_INSTANCE = InputPackage.LIST_ITEM_SELECTION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__SERVICE_NAME = InputPackage.LIST_ITEM_SELECTION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__BEGIN_TIME = InputPackage.LIST_ITEM_SELECTION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__DURATION = InputPackage.LIST_ITEM_SELECTION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__LANGUAGE = InputPackage.LIST_ITEM_SELECTION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK__USER_ALIAS = InputPackage.LIST_ITEM_SELECTION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Long List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK_FEATURE_COUNT = InputPackage.LIST_ITEM_SELECTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long List Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LIST_ITEM_SELECTION_TASK_OPERATION_COUNT = InputPackage.LIST_ITEM_SELECTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ShortItemSelectionTaskImpl <em>Short Item Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ShortItemSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getShortItemSelectionTask()
	 * @generated
	 */
	int SHORT_ITEM_SELECTION_TASK = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__BINDING = InputPackage.LIST_ITEM_SELECTION_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__DEVICE = InputPackage.LIST_ITEM_SELECTION_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__SERVICE_INSTANCE = InputPackage.LIST_ITEM_SELECTION_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__SERVICE_NAME = InputPackage.LIST_ITEM_SELECTION_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__BEGIN_TIME = InputPackage.LIST_ITEM_SELECTION_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__DURATION = InputPackage.LIST_ITEM_SELECTION_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__LANGUAGE = InputPackage.LIST_ITEM_SELECTION_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK__USER_ALIAS = InputPackage.LIST_ITEM_SELECTION_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Short Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK_FEATURE_COUNT = InputPackage.LIST_ITEM_SELECTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short Item Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ITEM_SELECTION_TASK_OPERATION_COUNT = InputPackage.LIST_ITEM_SELECTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemMultiSelectionTaskImpl <em>List Item Multi Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemMultiSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getListItemMultiSelectionTask()
	 * @generated
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__BINDING = PRIMITIVE_OUTPUT_TASK__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__DEVICE = PRIMITIVE_OUTPUT_TASK__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__SERVICE_INSTANCE = PRIMITIVE_OUTPUT_TASK__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__SERVICE_NAME = PRIMITIVE_OUTPUT_TASK__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__BEGIN_TIME = PRIMITIVE_OUTPUT_TASK__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__DURATION = PRIMITIVE_OUTPUT_TASK__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__LANGUAGE = PRIMITIVE_OUTPUT_TASK__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK__USER_ALIAS = PRIMITIVE_OUTPUT_TASK__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>List Item Multi Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK_FEATURE_COUNT = PRIMITIVE_OUTPUT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item Multi Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_MULTI_SELECTION_TASK_OPERATION_COUNT = PRIMITIVE_OUTPUT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageDismissalTaskImpl <em>Message Dismissal Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageDismissalTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMessageDismissalTask()
	 * @generated
	 */
	int MESSAGE_DISMISSAL_TASK = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__BINDING = InputPackage.ADAPTATION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__DEVICE = InputPackage.ADAPTATION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__SERVICE_INSTANCE = InputPackage.ADAPTATION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__SERVICE_NAME = InputPackage.ADAPTATION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__BEGIN_TIME = InputPackage.ADAPTATION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__DURATION = InputPackage.ADAPTATION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__LANGUAGE = InputPackage.ADAPTATION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK__USER_ALIAS = InputPackage.ADAPTATION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Message Dismissal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK_FEATURE_COUNT = InputPackage.ADAPTATION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Dismissal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DISMISSAL_TASK_OPERATION_COUNT = InputPackage.ADAPTATION_TASK_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ObjectSelectionTaskImpl <em>Object Selection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ObjectSelectionTaskImpl
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getObjectSelectionTask()
	 * @generated
	 */
	int OBJECT_SELECTION_TASK = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__BINDING = InputPackage.SELECTION_TASK_BASE__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__DEVICE = InputPackage.SELECTION_TASK_BASE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__SERVICE_INSTANCE = InputPackage.SELECTION_TASK_BASE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__SERVICE_NAME = InputPackage.SELECTION_TASK_BASE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__BEGIN_TIME = InputPackage.SELECTION_TASK_BASE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__DURATION = InputPackage.SELECTION_TASK_BASE__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__LANGUAGE = InputPackage.SELECTION_TASK_BASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK__USER_ALIAS = InputPackage.SELECTION_TASK_BASE__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Object Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK_FEATURE_COUNT = InputPackage.SELECTION_TASK_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Selection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_TASK_OPERATION_COUNT = InputPackage.SELECTION_TASK_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.PrimitiveOutputTask <em>Primitive Output Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Output Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.PrimitiveOutputTask
	 * @generated
	 */
	EClass getPrimitiveOutputTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase <em>Selection Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase
	 * @generated
	 */
	EClass getSelectionTaskBase();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.SelectionTaskBase#getItem()
	 * @see #getSelectionTaskBase()
	 * @generated
	 */
	EAttribute getSelectionTaskBase_Item();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationTaskBase <em>Adaptation Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationTaskBase
	 * @generated
	 */
	EClass getAdaptationTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.FactEntryTaskBase <em>Fact Entry Task Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Entry Task Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.FactEntryTaskBase
	 * @generated
	 */
	EClass getFactEntryTaskBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageTask <em>Message Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageTask
	 * @generated
	 */
	EClass getMessageTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DocumentPresentationTask <em>Document Presentation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Presentation Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DocumentPresentationTask
	 * @generated
	 */
	EClass getDocumentPresentationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.CommandSelectionTask <em>Command Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.CommandSelectionTask
	 * @generated
	 */
	EClass getCommandSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MenuItemSelectionTask <em>Menu Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MenuItemSelectionTask
	 * @generated
	 */
	EClass getMenuItemSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask <em>Progress Indication Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Indication Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask
	 * @generated
	 */
	EClass getProgressIndicationTask();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ProgressIndicationTask#getProgress()
	 * @see #getProgressIndicationTask()
	 * @generated
	 */
	EAttribute getProgressIndicationTask_Progress();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationIndicationTask <em>Adaptation Indication Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Indication Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.AdaptationIndicationTask
	 * @generated
	 */
	EClass getAdaptationIndicationTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ManipulableImageTask <em>Manipulable Image Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manipulable Image Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ManipulableImageTask
	 * @generated
	 */
	EClass getManipulableImageTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.FreeTextEntryTask <em>Free Text Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.FreeTextEntryTask
	 * @generated
	 */
	EClass getFreeTextEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DateTimeEntryTask <em>Date Time Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DateTimeEntryTask
	 * @generated
	 */
	EClass getDateTimeEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.IntegerNumberEntryTask <em>Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.IntegerNumberEntryTask
	 * @generated
	 */
	EClass getIntegerNumberEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask <em>Bounded Integer Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Integer Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask
	 * @generated
	 */
	EClass getBoundedIntegerNumberEntryTask();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask#getMin()
	 * @see #getBoundedIntegerNumberEntryTask()
	 * @generated
	 */
	EAttribute getBoundedIntegerNumberEntryTask_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.BoundedIntegerNumberEntryTask#getMax()
	 * @see #getBoundedIntegerNumberEntryTask()
	 * @generated
	 */
	EAttribute getBoundedIntegerNumberEntryTask_Max();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.DecimalNumberEntryTask <em>Decimal Number Entry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Number Entry Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.DecimalNumberEntryTask
	 * @generated
	 */
	EClass getDecimalNumberEntryTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.YesNoSelectionTask <em>Yes No Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yes No Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.YesNoSelectionTask
	 * @generated
	 */
	EClass getYesNoSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.TriStateSelectionTask <em>Tri State Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tri State Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.TriStateSelectionTask
	 * @generated
	 */
	EClass getTriStateSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask <em>List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask
	 * @generated
	 */
	EClass getListItemSelectionTask();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask#getListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask#getListItem()
	 * @see #getListItemSelectionTask()
	 * @generated
	 */
	EReference getListItemSelectionTask_ListItem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.LongListItemSelectionTask <em>Long List Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long List Item Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.LongListItemSelectionTask
	 * @generated
	 */
	EClass getLongListItemSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ShortItemSelectionTask <em>Short Item Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Item Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ShortItemSelectionTask
	 * @generated
	 */
	EClass getShortItemSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemMultiSelectionTask <em>List Item Multi Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Multi Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemMultiSelectionTask
	 * @generated
	 */
	EClass getListItemMultiSelectionTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageDismissalTask <em>Message Dismissal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Dismissal Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.MessageDismissalTask
	 * @generated
	 */
	EClass getMessageDismissalTask();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ObjectSelectionTask <em>Object Selection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Selection Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.ObjectSelectionTask
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
	OutputFactory getOutputFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.PrimitiveOutputTaskImpl <em>Primitive Output Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.PrimitiveOutputTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getPrimitiveOutputTask()
		 * @generated
		 */
		EClass PRIMITIVE_OUTPUT_TASK = eINSTANCE.getPrimitiveOutputTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.SelectionTaskBaseImpl <em>Selection Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.SelectionTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getSelectionTaskBase()
		 * @generated
		 */
		EClass SELECTION_TASK_BASE = eINSTANCE.getSelectionTaskBase();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_TASK_BASE__ITEM = eINSTANCE.getSelectionTaskBase_Item();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationTaskBaseImpl <em>Adaptation Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getAdaptationTaskBase()
		 * @generated
		 */
		EClass ADAPTATION_TASK_BASE = eINSTANCE.getAdaptationTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FactEntryTaskBaseImpl <em>Fact Entry Task Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FactEntryTaskBaseImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getFactEntryTaskBase()
		 * @generated
		 */
		EClass FACT_ENTRY_TASK_BASE = eINSTANCE.getFactEntryTaskBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageTaskImpl <em>Message Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMessageTask()
		 * @generated
		 */
		EClass MESSAGE_TASK = eINSTANCE.getMessageTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DocumentPresentationTaskImpl <em>Document Presentation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DocumentPresentationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDocumentPresentationTask()
		 * @generated
		 */
		EClass DOCUMENT_PRESENTATION_TASK = eINSTANCE.getDocumentPresentationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.CommandSelectionTaskImpl <em>Command Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.CommandSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getCommandSelectionTask()
		 * @generated
		 */
		EClass COMMAND_SELECTION_TASK = eINSTANCE.getCommandSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MenuItemSelectionTaskImpl <em>Menu Item Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MenuItemSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMenuItemSelectionTask()
		 * @generated
		 */
		EClass MENU_ITEM_SELECTION_TASK = eINSTANCE.getMenuItemSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ProgressIndicationTaskImpl <em>Progress Indication Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ProgressIndicationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getProgressIndicationTask()
		 * @generated
		 */
		EClass PROGRESS_INDICATION_TASK = eINSTANCE.getProgressIndicationTask();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_INDICATION_TASK__PROGRESS = eINSTANCE.getProgressIndicationTask_Progress();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationIndicationTaskImpl <em>Adaptation Indication Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.AdaptationIndicationTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getAdaptationIndicationTask()
		 * @generated
		 */
		EClass ADAPTATION_INDICATION_TASK = eINSTANCE.getAdaptationIndicationTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ManipulableImageTaskImpl <em>Manipulable Image Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ManipulableImageTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getManipulableImageTask()
		 * @generated
		 */
		EClass MANIPULABLE_IMAGE_TASK = eINSTANCE.getManipulableImageTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FreeTextEntryTaskImpl <em>Free Text Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.FreeTextEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getFreeTextEntryTask()
		 * @generated
		 */
		EClass FREE_TEXT_ENTRY_TASK = eINSTANCE.getFreeTextEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DateTimeEntryTaskImpl <em>Date Time Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DateTimeEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDateTimeEntryTask()
		 * @generated
		 */
		EClass DATE_TIME_ENTRY_TASK = eINSTANCE.getDateTimeEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.IntegerNumberEntryTaskImpl <em>Integer Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.IntegerNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getIntegerNumberEntryTask()
		 * @generated
		 */
		EClass INTEGER_NUMBER_ENTRY_TASK = eINSTANCE.getIntegerNumberEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.BoundedIntegerNumberEntryTaskImpl <em>Bounded Integer Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.BoundedIntegerNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getBoundedIntegerNumberEntryTask()
		 * @generated
		 */
		EClass BOUNDED_INTEGER_NUMBER_ENTRY_TASK = eINSTANCE.getBoundedIntegerNumberEntryTask();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MIN = eINSTANCE.getBoundedIntegerNumberEntryTask_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_INTEGER_NUMBER_ENTRY_TASK__MAX = eINSTANCE.getBoundedIntegerNumberEntryTask_Max();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DecimalNumberEntryTaskImpl <em>Decimal Number Entry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.DecimalNumberEntryTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getDecimalNumberEntryTask()
		 * @generated
		 */
		EClass DECIMAL_NUMBER_ENTRY_TASK = eINSTANCE.getDecimalNumberEntryTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.YesNoSelectionTaskImpl <em>Yes No Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.YesNoSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getYesNoSelectionTask()
		 * @generated
		 */
		EClass YES_NO_SELECTION_TASK = eINSTANCE.getYesNoSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.TriStateSelectionTaskImpl <em>Tri State Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.TriStateSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getTriStateSelectionTask()
		 * @generated
		 */
		EClass TRI_STATE_SELECTION_TASK = eINSTANCE.getTriStateSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemSelectionTaskImpl <em>List Item Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getListItemSelectionTask()
		 * @generated
		 */
		EClass LIST_ITEM_SELECTION_TASK = eINSTANCE.getListItemSelectionTask();

		/**
		 * The meta object literal for the '<em><b>List Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM_SELECTION_TASK__LIST_ITEM = eINSTANCE.getListItemSelectionTask_ListItem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.LongListItemSelectionTaskImpl <em>Long List Item Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.LongListItemSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getLongListItemSelectionTask()
		 * @generated
		 */
		EClass LONG_LIST_ITEM_SELECTION_TASK = eINSTANCE.getLongListItemSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ShortItemSelectionTaskImpl <em>Short Item Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ShortItemSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getShortItemSelectionTask()
		 * @generated
		 */
		EClass SHORT_ITEM_SELECTION_TASK = eINSTANCE.getShortItemSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemMultiSelectionTaskImpl <em>List Item Multi Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ListItemMultiSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getListItemMultiSelectionTask()
		 * @generated
		 */
		EClass LIST_ITEM_MULTI_SELECTION_TASK = eINSTANCE.getListItemMultiSelectionTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageDismissalTaskImpl <em>Message Dismissal Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.MessageDismissalTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getMessageDismissalTask()
		 * @generated
		 */
		EClass MESSAGE_DISMISSAL_TASK = eINSTANCE.getMessageDismissalTask();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ObjectSelectionTaskImpl <em>Object Selection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.ObjectSelectionTaskImpl
		 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl#getObjectSelectionTask()
		 * @generated
		 */
		EClass OBJECT_SELECTION_TASK = eINSTANCE.getObjectSelectionTask();

	}

} //OutputPackage
