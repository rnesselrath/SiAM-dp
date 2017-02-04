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
package de.dfki.iui.mmds.core.model.task;

import de.dfki.iui.mmds.core.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.dfki.iui.mmds.core.model.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/task";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TMetaDataImpl <em>TMeta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TMetaDataImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTMetaData()
	 * @generated
	 */
	int TMETA_DATA = 10;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETA_DATA__MEDIA = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETA_DATA__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETA_DATA__HISTORY = 2;

	/**
	 * The number of structural features of the '<em>TMeta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETA_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TMeta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETA_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPlanImpl <em>TPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TPlanImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPlan()
	 * @generated
	 */
	int TPLAN = 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__MEDIA = TMETA_DATA__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__DESCRIPTION = TMETA_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__HISTORY = TMETA_DATA__HISTORY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ID = TMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__TASK = TMETA_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FEATURE_COUNT = TMETA_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN___GET_TASK__STRING = TMETA_DATA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_OPERATION_COUNT = TMETA_DATA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl <em>TTask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TTaskImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTTask()
	 * @generated
	 */
	int TTASK = 1;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__MEDIA = TMETA_DATA__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DESCRIPTION = TMETA_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__HISTORY = TMETA_DATA__HISTORY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ID = TMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__STATE = TMETA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__PRECONDITION = TMETA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__POSTCONDITION = TMETA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__SUCCESSOR = TMETA_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ACTION = TMETA_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ACTOR = TMETA_DATA_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_FEATURE_COUNT = TMETA_DATA_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_OPERATION_COUNT = TMETA_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TCompositeTaskImpl <em>TComposite Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TCompositeTaskImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTCompositeTask()
	 * @generated
	 */
	int TCOMPOSITE_TASK = 2;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__MEDIA = TTASK__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__DESCRIPTION = TTASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__HISTORY = TTASK__HISTORY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__STATE = TTASK__STATE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__PRECONDITION = TTASK__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__POSTCONDITION = TTASK__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__SUCCESSOR = TTASK__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__ACTION = TTASK__ACTION;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__ACTOR = TTASK__ACTOR;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK__TASK = TTASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TComposite Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TComposite Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOSITE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TConditionImpl <em>TCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TConditionImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTCondition()
	 * @generated
	 */
	int TCONDITION = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__EXPR = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__PATTERN = 1;

	/**
	 * The number of structural features of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl <em>TPhysical Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPhysicalEntity()
	 * @generated
	 */
	int TPHYSICAL_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__BINDING = BasePackage.NAMED_ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__ENTITY_ID = BasePackage.NAMED_ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__LOCATION = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__MEDIA = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__DESCRIPTION = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY__HISTORY = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TPhysical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TPhysical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ENTITY_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TToolImpl <em>TTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TToolImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTTool()
	 * @generated
	 */
	int TTOOL = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__BINDING = TPHYSICAL_ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__ENTITY_ID = TPHYSICAL_ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__NAME = TPHYSICAL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__LOCATION = TPHYSICAL_ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__MEDIA = TPHYSICAL_ENTITY__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__DESCRIPTION = TPHYSICAL_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__HISTORY = TPHYSICAL_ENTITY__HISTORY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__SIZE = TPHYSICAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__OWNER = TPHYSICAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time When Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL__TIME_WHEN_TAKEN = TPHYSICAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL_FEATURE_COUNT = TPHYSICAL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOOL_OPERATION_COUNT = TPHYSICAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TActionImpl <em>TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TActionImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTAction()
	 * @generated
	 */
	int TACTION = 7;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TMaterialImpl <em>TMaterial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TMaterialImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTMaterial()
	 * @generated
	 */
	int TMATERIAL = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__BINDING = TPHYSICAL_ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__ENTITY_ID = TPHYSICAL_ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__NAME = TPHYSICAL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__LOCATION = TPHYSICAL_ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__MEDIA = TPHYSICAL_ENTITY__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__DESCRIPTION = TPHYSICAL_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__HISTORY = TPHYSICAL_ENTITY__HISTORY;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__DEPTH = TPHYSICAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__HEIGHT = TPHYSICAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__WIDTH = TPHYSICAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL__UNIT = TPHYSICAL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMaterial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL_FEATURE_COUNT = TPHYSICAL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMaterial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMATERIAL_OPERATION_COUNT = TPHYSICAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__MEDIA = TMETA_DATA__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__DESCRIPTION = TMETA_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__HISTORY = TMETA_DATA__HISTORY;

	/**
	 * The number of structural features of the '<em>TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FEATURE_COUNT = TMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_OPERATION_COUNT = TMETA_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalActionImpl <em>TPhysical Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TPhysicalActionImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPhysicalAction()
	 * @generated
	 */
	int TPHYSICAL_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ACTION__MEDIA = TACTION__MEDIA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ACTION__DESCRIPTION = TACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ACTION__HISTORY = TACTION__HISTORY;

	/**
	 * The number of structural features of the '<em>TPhysical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ACTION_FEATURE_COUNT = TACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TPhysical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYSICAL_ACTION_OPERATION_COUNT = TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.TDescriptionImpl <em>TDescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.TDescriptionImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTDescription()
	 * @generated
	 */
	int TDESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDESCRIPTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TDescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.THistoryImpl <em>THistory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.THistoryImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTHistory()
	 * @generated
	 */
	int THISTORY = 11;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY__ENTRY = 2;

	/**
	 * The number of structural features of the '<em>THistory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>THistory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl <em>THistory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTHistoryEntry()
	 * @generated
	 */
	int THISTORY_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY__TIME = 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY__PREDECESSOR = 1;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY__SUCCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY__DATA = 3;

	/**
	 * The feature id for the '<em><b>System Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY__SYSTEM_ACTION = 4;

	/**
	 * The number of structural features of the '<em>THistory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>THistory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THISTORY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.TaskState <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.TaskState
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 13;


	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.task.UserState <em>User State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.task.UserState
	 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getUserState()
	 * @generated
	 */
	int USER_STATE = 14;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TPlan <em>TPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TPlan
	 * @generated
	 */
	EClass getTPlan();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TPlan#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TPlan#getId()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TPlan#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TPlan#getTask()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_Task();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.task.TPlan#getTask(java.lang.String) <em>Get Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Task</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.task.TPlan#getTask(java.lang.String)
	 * @generated
	 */
	EOperation getTPlan__GetTask__String();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTask</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask
	 * @generated
	 */
	EClass getTTask();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TTask#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getId()
	 * @see #getTTask()
	 * @generated
	 */
	EAttribute getTTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TTask#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getState()
	 * @see #getTTask()
	 * @generated
	 */
	EAttribute getTTask_State();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TTask#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getPrecondition()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TTask#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getPostcondition()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Postcondition();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.task.TTask#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getSuccessor()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Successor();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.task.TTask#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getAction()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Action();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.task.TTask#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTask#getActor()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Actor();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TCompositeTask <em>TComposite Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TComposite Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TCompositeTask
	 * @generated
	 */
	EClass getTCompositeTask();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TCompositeTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TCompositeTask#getTask()
	 * @see #getTCompositeTask()
	 * @generated
	 */
	EReference getTCompositeTask_Task();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TCondition <em>TCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCondition</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TCondition
	 * @generated
	 */
	EClass getTCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TCondition#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TCondition#getExpr()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_Expr();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TCondition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TCondition#getPattern()
	 * @see #getTCondition()
	 * @generated
	 */
	EReference getTCondition_Pattern();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TPhysicalEntity <em>TPhysical Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPhysical Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TPhysicalEntity
	 * @generated
	 */
	EClass getTPhysicalEntity();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TTool <em>TTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTool</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTool
	 * @generated
	 */
	EClass getTTool();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TTool#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTool#getSize()
	 * @see #getTTool()
	 * @generated
	 */
	EAttribute getTTool_Size();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.task.TTool#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTool#getOwner()
	 * @see #getTTool()
	 * @generated
	 */
	EReference getTTool_Owner();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TTool#getTimeWhenTaken <em>Time When Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time When Taken</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TTool#getTimeWhenTaken()
	 * @see #getTTool()
	 * @generated
	 */
	EAttribute getTTool_TimeWhenTaken();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TAction <em>TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAction</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TAction
	 * @generated
	 */
	EClass getTAction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TMaterial <em>TMaterial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMaterial</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMaterial
	 * @generated
	 */
	EClass getTMaterial();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TMaterial#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMaterial#getDepth()
	 * @see #getTMaterial()
	 * @generated
	 */
	EAttribute getTMaterial_Depth();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TMaterial#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMaterial#getHeight()
	 * @see #getTMaterial()
	 * @generated
	 */
	EAttribute getTMaterial_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TMaterial#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMaterial#getWidth()
	 * @see #getTMaterial()
	 * @generated
	 */
	EAttribute getTMaterial_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TMaterial#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMaterial#getUnit()
	 * @see #getTMaterial()
	 * @generated
	 */
	EAttribute getTMaterial_Unit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TPhysicalAction <em>TPhysical Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPhysical Action</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TPhysicalAction
	 * @generated
	 */
	EClass getTPhysicalAction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TDescription <em>TDescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDescription</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TDescription
	 * @generated
	 */
	EClass getTDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.TDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TDescription#getValue()
	 * @see #getTDescription()
	 * @generated
	 */
	EAttribute getTDescription_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.TMetaData <em>TMeta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMeta Data</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMetaData
	 * @generated
	 */
	EClass getTMetaData();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.task.TMetaData#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMetaData#getMedia()
	 * @see #getTMetaData()
	 * @generated
	 */
	EReference getTMetaData_Media();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.task.TMetaData#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMetaData#getDescription()
	 * @see #getTMetaData()
	 * @generated
	 */
	EReference getTMetaData_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.TMetaData#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TMetaData#getHistory()
	 * @see #getTMetaData()
	 * @generated
	 */
	EReference getTMetaData_History();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.THistory <em>THistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THistory</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistory
	 * @generated
	 */
	EClass getTHistory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.THistory#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistory#getStartTime()
	 * @see #getTHistory()
	 * @generated
	 */
	EAttribute getTHistory_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.THistory#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistory#getEndTime()
	 * @see #getTHistory()
	 * @generated
	 */
	EAttribute getTHistory_EndTime();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.THistory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistory#getEntry()
	 * @see #getTHistory()
	 * @generated
	 */
	EReference getTHistory_Entry();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry <em>THistory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THistory Entry</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry
	 * @generated
	 */
	EClass getTHistoryEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry#getTime()
	 * @see #getTHistoryEntry()
	 * @generated
	 */
	EAttribute getTHistoryEntry_Time();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry#getPredecessor()
	 * @see #getTHistoryEntry()
	 * @generated
	 */
	EReference getTHistoryEntry_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry#getSuccessor()
	 * @see #getTHistoryEntry()
	 * @generated
	 */
	EReference getTHistoryEntry_Successor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry#getData()
	 * @see #getTHistoryEntry()
	 * @generated
	 */
	EReference getTHistoryEntry_Data();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#isSystemAction <em>System Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Action</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.THistoryEntry#isSystemAction()
	 * @see #getTHistoryEntry()
	 * @generated
	 */
	EAttribute getTHistoryEntry_SystemAction();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.task.TaskState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.TaskState
	 * @generated
	 */
	EEnum getTaskState();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.task.UserState <em>User State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User State</em>'.
	 * @see de.dfki.iui.mmds.core.model.task.UserState
	 * @generated
	 */
	EEnum getUserState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPlanImpl <em>TPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TPlanImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPlan()
		 * @generated
		 */
		EClass TPLAN = eINSTANCE.getTPlan();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__ID = eINSTANCE.getTPlan_Id();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__TASK = eINSTANCE.getTPlan_Task();

		/**
		 * The meta object literal for the '<em><b>Get Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TPLAN___GET_TASK__STRING = eINSTANCE.getTPlan__GetTask__String();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TTaskImpl <em>TTask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TTaskImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTTask()
		 * @generated
		 */
		EClass TTASK = eINSTANCE.getTTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTASK__ID = eINSTANCE.getTTask_Id();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTASK__STATE = eINSTANCE.getTTask_State();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__PRECONDITION = eINSTANCE.getTTask_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__POSTCONDITION = eINSTANCE.getTTask_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__SUCCESSOR = eINSTANCE.getTTask_Successor();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__ACTION = eINSTANCE.getTTask_Action();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__ACTOR = eINSTANCE.getTTask_Actor();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TCompositeTaskImpl <em>TComposite Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TCompositeTaskImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTCompositeTask()
		 * @generated
		 */
		EClass TCOMPOSITE_TASK = eINSTANCE.getTCompositeTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOMPOSITE_TASK__TASK = eINSTANCE.getTCompositeTask_Task();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TConditionImpl <em>TCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TConditionImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTCondition()
		 * @generated
		 */
		EClass TCONDITION = eINSTANCE.getTCondition();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__EXPR = eINSTANCE.getTCondition_Expr();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONDITION__PATTERN = eINSTANCE.getTCondition_Pattern();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl <em>TPhysical Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TPhysicalEntityImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPhysicalEntity()
		 * @generated
		 */
		EClass TPHYSICAL_ENTITY = eINSTANCE.getTPhysicalEntity();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TToolImpl <em>TTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TToolImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTTool()
		 * @generated
		 */
		EClass TTOOL = eINSTANCE.getTTool();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTOOL__SIZE = eINSTANCE.getTTool_Size();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOOL__OWNER = eINSTANCE.getTTool_Owner();

		/**
		 * The meta object literal for the '<em><b>Time When Taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTOOL__TIME_WHEN_TAKEN = eINSTANCE.getTTool_TimeWhenTaken();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TActionImpl <em>TAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TActionImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTAction()
		 * @generated
		 */
		EClass TACTION = eINSTANCE.getTAction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TMaterialImpl <em>TMaterial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TMaterialImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTMaterial()
		 * @generated
		 */
		EClass TMATERIAL = eINSTANCE.getTMaterial();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMATERIAL__DEPTH = eINSTANCE.getTMaterial_Depth();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMATERIAL__HEIGHT = eINSTANCE.getTMaterial_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMATERIAL__WIDTH = eINSTANCE.getTMaterial_Width();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMATERIAL__UNIT = eINSTANCE.getTMaterial_Unit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TPhysicalActionImpl <em>TPhysical Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TPhysicalActionImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTPhysicalAction()
		 * @generated
		 */
		EClass TPHYSICAL_ACTION = eINSTANCE.getTPhysicalAction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TDescriptionImpl <em>TDescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TDescriptionImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTDescription()
		 * @generated
		 */
		EClass TDESCRIPTION = eINSTANCE.getTDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDESCRIPTION__VALUE = eINSTANCE.getTDescription_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.TMetaDataImpl <em>TMeta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.TMetaDataImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTMetaData()
		 * @generated
		 */
		EClass TMETA_DATA = eINSTANCE.getTMetaData();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETA_DATA__MEDIA = eINSTANCE.getTMetaData_Media();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETA_DATA__DESCRIPTION = eINSTANCE.getTMetaData_Description();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETA_DATA__HISTORY = eINSTANCE.getTMetaData_History();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.THistoryImpl <em>THistory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.THistoryImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTHistory()
		 * @generated
		 */
		EClass THISTORY = eINSTANCE.getTHistory();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THISTORY__START_TIME = eINSTANCE.getTHistory_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THISTORY__END_TIME = eINSTANCE.getTHistory_EndTime();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THISTORY__ENTRY = eINSTANCE.getTHistory_Entry();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl <em>THistory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.impl.THistoryEntryImpl
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTHistoryEntry()
		 * @generated
		 */
		EClass THISTORY_ENTRY = eINSTANCE.getTHistoryEntry();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THISTORY_ENTRY__TIME = eINSTANCE.getTHistoryEntry_Time();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THISTORY_ENTRY__PREDECESSOR = eINSTANCE.getTHistoryEntry_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THISTORY_ENTRY__SUCCESSOR = eINSTANCE.getTHistoryEntry_Successor();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THISTORY_ENTRY__DATA = eINSTANCE.getTHistoryEntry_Data();

		/**
		 * The meta object literal for the '<em><b>System Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THISTORY_ENTRY__SYSTEM_ACTION = eINSTANCE.getTHistoryEntry_SystemAction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.TaskState <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.TaskState
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getTaskState()
		 * @generated
		 */
		EEnum TASK_STATE = eINSTANCE.getTaskState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.task.UserState <em>User State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.task.UserState
		 * @see de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl#getUserState()
		 * @generated
		 */
		EEnum USER_STATE = eINSTANCE.getUserState();

	}

} //TaskPackage
