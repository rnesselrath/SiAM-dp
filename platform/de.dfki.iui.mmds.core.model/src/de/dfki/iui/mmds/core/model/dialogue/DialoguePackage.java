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
package de.dfki.iui.mmds.core.model.dialogue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.dialogue.DialogueFactory
 * @model kind="package"
 * @generated
 */
public interface DialoguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dialogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/dialogue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dialogue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DialoguePackage eINSTANCE = de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.NodeImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent <em>Executable Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.ExecutableContent
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getExecutableContent()
	 * @generated
	 */
	int EXECUTABLE_CONTENT = 8;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.RaiseImpl <em>Raise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.RaiseImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getRaise()
	 * @generated
	 */
	int RAISE = 9;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SendImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSend()
	 * @generated
	 */
	int SEND = 10;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.LogImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getLog()
	 * @generated
	 */
	int LOG = 11;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.AssignImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getIAdaptable()
	 * @generated
	 */
	int IADAPTABLE = 17;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.CondEventImpl <em>Cond Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.CondEventImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getCondEvent()
	 * @generated
	 */
	int COND_EVENT = 3;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DialogueImpl <em>Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialogueImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDialogue()
	 * @generated
	 */
	int DIALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__ID = 1;

	/**
	 * The number of structural features of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DialogueDesignerElementImpl <em>Designer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialogueDesignerElementImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDialogueDesignerElement()
	 * @generated
	 */
	int DIALOGUE_DESIGNER_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_DESIGNER_ELEMENT__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_DESIGNER_ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Designer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Designer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_DESIGNER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractState <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractState
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 30;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__DISPLAY_NAME = DIALOGUE_DESIGNER_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__ID = DIALOGUE_DESIGNER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__VARIABLES = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_OPERATION_COUNT = DIALOGUE_DESIGNER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DISPLAY_NAME = ABSTRACT_STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = ABSTRACT_STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VARIABLES = ABSTRACT_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSITIONS = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT__PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Cond Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cond Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceCondEventImpl <em>Instance Cond Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceCondEventImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceCondEvent()
	 * @generated
	 */
	int INSTANCE_COND_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT__EVENT = COND_EVENT__EVENT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT__PATTERN = COND_EVENT__PATTERN;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT__CONDITION = COND_EVENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Instance Match Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION = COND_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Cond Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT_FEATURE_COUNT = COND_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Cond Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COND_EVENT_OPERATION_COUNT = COND_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionImpl <em>Instance Match Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchCondition()
	 * @generated
	 */
	int INSTANCE_MATCH_CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Instance Match Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instance Match Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl <em>Instance Match Condition Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchConditionFormula()
	 * @generated
	 */
	int INSTANCE_MATCH_CONDITION_FORMULA = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_FORMULA__COND = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Match Condition Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_FORMULA_FEATURE_COUNT = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Match Condition Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_FORMULA_OPERATION_COUNT = INSTANCE_MATCH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl <em>Instance Match Condition Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchConditionAtom()
	 * @generated
	 */
	int INSTANCE_MATCH_CONDITION_ATOM = 7;

	/**
	 * The feature id for the '<em><b>Instance Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_ATOM__INSTANCE = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_ATOM__PATTERN = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Match Condition Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_ATOM_FEATURE_COUNT = INSTANCE_MATCH_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Match Condition Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MATCH_CONDITION_ATOM_OPERATION_COUNT = INSTANCE_MATCH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Executable Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__EVENT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__OUTPUT_REQUEST = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__EXPRESSION = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LABEL = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXPRESSION = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TO = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceAssignImpl <em>Instance Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceAssignImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceAssign()
	 * @generated
	 */
	int INSTANCE_ASSIGN = 13;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ASSIGN__TO = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ASSIGN__INSTANCE = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Copy Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ASSIGN__COPY_OF = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ASSIGN_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ASSIGN_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceModifyFeatureImpl <em>Instance Modify Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceModifyFeatureImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceModifyFeature()
	 * @generated
	 */
	int INSTANCE_MODIFY_FEATURE = 14;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__TO = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__FEATURE = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__EXPR = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__OBJECT = EXECUTABLE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__TYPE = EXECUTABLE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE__OPERATION_TYPE = EXECUTABLE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Instance Modify Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Instance Modify Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODIFY_FEATURE_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DelayImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 16;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DURATION = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IAdaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADAPTABLE_FEATURE_COUNT = 0;


	/**
	 * The number of operations of the '<em>IAdaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADAPTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.VariableImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Emf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EMF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;


	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.IfImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getIf()
	 * @generated
	 */
	int IF = 19;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTENT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_IF = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = EXECUTABLE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ElseIfImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 20;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ElseImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 21;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SequenceImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 22;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CONTENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DecisionImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 23;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__THEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ELSE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONDITION = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DoWhileImpl <em>Do While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DoWhileImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDoWhile()
	 * @generated
	 */
	int DO_WHILE = 24;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__CONDITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__BODY = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.WhileImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 25;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BODY = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ForEachImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 26;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.WaitForEventImpl <em>Wait For Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.WaitForEventImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getWaitForEvent()
	 * @generated
	 */
	int WAIT_FOR_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT__EVENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait For Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait For Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_EVENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ExecutableContentNodeImpl <em>Executable Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ExecutableContentNodeImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getExecutableContentNode()
	 * @generated
	 */
	int EXECUTABLE_CONTENT_NODE = 28;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE__CONTENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl <em>State Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getStateChart()
	 * @generated
	 */
	int STATE_CHART = 29;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__DISPLAY_NAME = NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__VARIABLES = NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__TRANSITIONS = NODE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ON_ENTRY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ON_EXIT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__STATES = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>History State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__HISTORY_STATE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__INITIAL_STATE = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>State Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getState()
	 * @generated
	 */
	int STATE = 31;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DISPLAY_NAME = ABSTRACT_STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = ABSTRACT_STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLES = ABSTRACT_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ON_ENTRY = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ON_EXIT = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState <em>Abstract Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAbstractCompositeState()
	 * @generated
	 */
	int ABSTRACT_COMPOSITE_STATE = 32;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__DISPLAY_NAME = STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__VARIABLES = STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__ON_ENTRY = STATE__ON_ENTRY;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__ON_EXIT = STATE__ON_EXIT;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__STATES = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>History State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE__HISTORY_STATE = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.CompositeStateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 33;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__DISPLAY_NAME = ABSTRACT_COMPOSITE_STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ID = ABSTRACT_COMPOSITE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__VARIABLES = ABSTRACT_COMPOSITE_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__TRANSITIONS = ABSTRACT_COMPOSITE_STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ON_ENTRY = ABSTRACT_COMPOSITE_STATE__ON_ENTRY;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ON_EXIT = ABSTRACT_COMPOSITE_STATE__ON_EXIT;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__STATES = ABSTRACT_COMPOSITE_STATE__STATES;

	/**
	 * The feature id for the '<em><b>History State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__HISTORY_STATE = ABSTRACT_COMPOSITE_STATE__HISTORY_STATE;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__INITIAL_STATE = ABSTRACT_COMPOSITE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = ABSTRACT_COMPOSITE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = ABSTRACT_COMPOSITE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl <em>Parallel State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getParallelState()
	 * @generated
	 */
	int PARALLEL_STATE = 34;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__DISPLAY_NAME = ABSTRACT_COMPOSITE_STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ID = ABSTRACT_COMPOSITE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__VARIABLES = ABSTRACT_COMPOSITE_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__TRANSITIONS = ABSTRACT_COMPOSITE_STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ON_ENTRY = ABSTRACT_COMPOSITE_STATE__ON_ENTRY;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ON_EXIT = ABSTRACT_COMPOSITE_STATE__ON_EXIT;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__STATES = ABSTRACT_COMPOSITE_STATE__STATES;

	/**
	 * The feature id for the '<em><b>History State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__HISTORY_STATE = ABSTRACT_COMPOSITE_STATE__HISTORY_STATE;

	/**
	 * The number of structural features of the '<em>Parallel State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE_FEATURE_COUNT = ABSTRACT_COMPOSITE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE_OPERATION_COUNT = ABSTRACT_COMPOSITE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.FinalStateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 35;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DISPLAY_NAME = ABSTRACT_STATE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = ABSTRACT_STATE__ID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__VARIABLES = ABSTRACT_STATE__VARIABLES;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.TargetState <em>Target State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.TargetState
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getTargetState()
	 * @generated
	 */
	int TARGET_STATE = 39;

	/**
	 * The number of structural features of the '<em>Target State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.HistoryStateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 36;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__DISPLAY_NAME = TARGET_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ID = TARGET_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__TYPE = TARGET_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = TARGET_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_OPERATION_COUNT = TARGET_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.TransitionImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 37;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DISPLAY_NAME = DIALOGUE_DESIGNER_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = DIALOGUE_DESIGNER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ON_TRIGGER = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = DIALOGUE_DESIGNER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = DIALOGUE_DESIGNER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SourceStateImpl <em>Source State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SourceStateImpl
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSourceState()
	 * @generated
	 */
	int SOURCE_STATE = 38;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE__TRANSITIONS = 0;

	/**
	 * The number of structural features of the '<em>Source State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.OperationType
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 40;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.dialogue.HistoryType <em>History Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.dialogue.HistoryType
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getHistoryType()
	 * @generated
	 */
	int HISTORY_TYPE = 41;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 42;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent <em>Executable Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ExecutableContent
	 * @generated
	 */
	EClass getExecutableContent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Raise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Raise
	 * @generated
	 */
	EClass getRaise();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Raise#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Raise#getEvent()
	 * @see #getRaise()
	 * @generated
	 */
	EAttribute getRaise_Event();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.Send#getOutputRequest <em>Output Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Send#getOutputRequest()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_OutputRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Log#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Log#getExpression()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Log#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Log#getLabel()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Label();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Assign#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Assign#getExpression()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Assign#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Assign#getTo()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_To();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign <em>Instance Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Assign</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceAssign
	 * @generated
	 */
	EClass getInstanceAssign();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getInstance()
	 * @see #getInstanceAssign()
	 * @generated
	 */
	EReference getInstanceAssign_Instance();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getCopyOf <em>Copy Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copy Of</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getCopyOf()
	 * @see #getInstanceAssign()
	 * @generated
	 */
	EReference getInstanceAssign_CopyOf();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature <em>Instance Modify Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Modify Feature</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature
	 * @generated
	 */
	EClass getInstanceModifyFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getTo()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EAttribute getInstanceModifyFeature_To();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getFeature()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EReference getInstanceModifyFeature_Feature();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getExpr()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EAttribute getInstanceModifyFeature_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getObject()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EReference getInstanceModifyFeature_Object();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getType()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EReference getInstanceModifyFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceModifyFeature#getOperationType()
	 * @see #getInstanceModifyFeature()
	 * @generated
	 */
	EAttribute getInstanceModifyFeature_OperationType();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceAssign#getTo()
	 * @see #getInstanceAssign()
	 * @generated
	 */
	EAttribute getInstanceAssign_To();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Delay#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Delay#getDuration()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Duration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdaptable</em>'.
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @model instanceClass="org.eclipse.core.runtime.IAdaptable"
	 * @generated
	 */
	EClass getIAdaptable();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Variable#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Variable#getDefault()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Default();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.Variable#getEmfType <em>Emf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emf Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Variable#getEmfType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_EmfType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.If#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.If#getContent()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.If#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.If#getElseIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.ElseIf#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ElseIf#getContent()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.ElseIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ElseIf#getCondition()
	 * @see #getElseIf()
	 * @generated
	 */
	EAttribute getElseIf_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.Else#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Else#getContent()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Content();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.Sequence#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Sequence#getContent()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Content();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.Decision#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Decision#getThen()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Then();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.Decision#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Decision#getElse()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Else();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Decision#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Decision#getCondition()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.DoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DoWhile
	 * @generated
	 */
	EClass getDoWhile();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.DoWhile#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DoWhile#getCondition()
	 * @see #getDoWhile()
	 * @generated
	 */
	EAttribute getDoWhile_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.DoWhile#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DoWhile#getBody()
	 * @see #getDoWhile()
	 * @generated
	 */
	EReference getDoWhile_Body();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.While#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.While#getBody()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Body();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.WaitForEvent <em>Wait For Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait For Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.WaitForEvent
	 * @generated
	 */
	EClass getWaitForEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.WaitForEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.WaitForEvent#getEvent()
	 * @see #getWaitForEvent()
	 * @generated
	 */
	EReference getWaitForEvent_Event();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContentNode <em>Executable Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Content Node</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ExecutableContentNode
	 * @generated
	 */
	EClass getExecutableContentNode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContentNode#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ExecutableContentNode#getContent()
	 * @see #getExecutableContentNode()
	 * @generated
	 */
	EReference getExecutableContentNode_Content();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.StateChart <em>State Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Chart</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.StateChart
	 * @generated
	 */
	EClass getStateChart();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractState#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractState#getVariables()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Variables();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.State#getOnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Entry</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.State#getOnEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OnEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.State#getOnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Exit</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.State#getOnExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OnExit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState <em>Abstract Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Composite State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState
	 * @generated
	 */
	EClass getAbstractCompositeState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getStates()
	 * @see #getAbstractCompositeState()
	 * @generated
	 */
	EReference getAbstractCompositeState_States();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getHistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState#getHistoryState()
	 * @see #getAbstractCompositeState()
	 * @generated
	 */
	EReference getAbstractCompositeState_HistoryState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.CompositeState#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CompositeState#getInitialState()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_InitialState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.ParallelState <em>Parallel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.ParallelState
	 * @generated
	 */
	EClass getParallelState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.HistoryState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.HistoryState#getType()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.Transition#getOnTrigger <em>On Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Trigger</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Transition#getOnTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OnTrigger();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.SourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.SourceState
	 * @generated
	 */
	EClass getSourceState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.SourceState#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.SourceState#getTransitions()
	 * @see #getSourceState()
	 * @generated
	 */
	EReference getSourceState_Transitions();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.TargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target State</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.TargetState
	 * @generated
	 */
	EClass getTargetState();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.dialogue.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.dialogue.HistoryType <em>History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.HistoryType
	 * @generated
	 */
	EEnum getHistoryType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.CondEvent <em>Cond Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CondEvent
	 * @generated
	 */
	EClass getCondEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.CondEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CondEvent#getEvent()
	 * @see #getCondEvent()
	 * @generated
	 */
	EAttribute getCondEvent_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.CondEvent#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CondEvent#getPattern()
	 * @see #getCondEvent()
	 * @generated
	 */
	EReference getCondEvent_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.CondEvent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.CondEvent#getCondition()
	 * @see #getCondEvent()
	 * @generated
	 */
	EAttribute getCondEvent_Condition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent <em>Instance Cond Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Cond Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent
	 * @generated
	 */
	EClass getInstanceCondEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent#getInstanceMatchCondition <em>Instance Match Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Match Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceCondEvent#getInstanceMatchCondition()
	 * @see #getInstanceCondEvent()
	 * @generated
	 */
	EReference getInstanceCondEvent_InstanceMatchCondition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchCondition <em>Instance Match Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Match Condition</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchCondition
	 * @generated
	 */
	EClass getInstanceMatchCondition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula <em>Instance Match Condition Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Match Condition Formula</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula
	 * @generated
	 */
	EClass getInstanceMatchConditionFormula();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula#getOperator()
	 * @see #getInstanceMatchConditionFormula()
	 * @generated
	 */
	EAttribute getInstanceMatchConditionFormula_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cond</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionFormula#getCond()
	 * @see #getInstanceMatchConditionFormula()
	 * @generated
	 */
	EReference getInstanceMatchConditionFormula_Cond();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom <em>Instance Match Condition Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Match Condition Atom</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom
	 * @generated
	 */
	EClass getInstanceMatchConditionAtom();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstanceExpr <em>Instance Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Expr</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstanceExpr()
	 * @see #getInstanceMatchConditionAtom()
	 * @generated
	 */
	EAttribute getInstanceMatchConditionAtom_InstanceExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getInstance()
	 * @see #getInstanceMatchConditionAtom()
	 * @generated
	 */
	EReference getInstanceMatchConditionAtom_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.InstanceMatchConditionAtom#getPattern()
	 * @see #getInstanceMatchConditionAtom()
	 * @generated
	 */
	EReference getInstanceMatchConditionAtom_Pattern();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Dialogue
	 * @generated
	 */
	EClass getDialogue();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.dialogue.Dialogue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Dialogue#getContent()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.Dialogue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.Dialogue#getId()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement <em>Designer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designer Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement
	 * @generated
	 */
	EClass getDialogueDesignerElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement#getId()
	 * @see #getDialogueDesignerElement()
	 * @generated
	 */
	EAttribute getDialogueDesignerElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement#getDisplayName()
	 * @see #getDialogueDesignerElement()
	 * @generated
	 */
	EAttribute getDialogueDesignerElement_DisplayName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DialogueFactory getDialogueFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.NodeImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.ExecutableContent <em>Executable Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.ExecutableContent
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getExecutableContent()
		 * @generated
		 */
		EClass EXECUTABLE_CONTENT = eINSTANCE.getExecutableContent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.RaiseImpl <em>Raise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.RaiseImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getRaise()
		 * @generated
		 */
		EClass RAISE = eINSTANCE.getRaise();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAISE__EVENT = eINSTANCE.getRaise_Event();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SendImpl <em>Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SendImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSend()
		 * @generated
		 */
		EClass SEND = eINSTANCE.getSend();

		/**
		 * The meta object literal for the '<em><b>Output Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__OUTPUT_REQUEST = eINSTANCE.getSend_OutputRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.LogImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__EXPRESSION = eINSTANCE.getLog_Expression();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LABEL = eINSTANCE.getLog_Label();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.AssignImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__EXPRESSION = eINSTANCE.getAssign_Expression();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__TO = eINSTANCE.getAssign_To();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceAssignImpl <em>Instance Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceAssignImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceAssign()
		 * @generated
		 */
		EClass INSTANCE_ASSIGN = eINSTANCE.getInstanceAssign();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ASSIGN__INSTANCE = eINSTANCE.getInstanceAssign_Instance();

		/**
		 * The meta object literal for the '<em><b>Copy Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ASSIGN__COPY_OF = eINSTANCE.getInstanceAssign_CopyOf();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceModifyFeatureImpl <em>Instance Modify Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceModifyFeatureImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceModifyFeature()
		 * @generated
		 */
		EClass INSTANCE_MODIFY_FEATURE = eINSTANCE.getInstanceModifyFeature();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_MODIFY_FEATURE__TO = eINSTANCE.getInstanceModifyFeature_To();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODIFY_FEATURE__FEATURE = eINSTANCE.getInstanceModifyFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_MODIFY_FEATURE__EXPR = eINSTANCE.getInstanceModifyFeature_Expr();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODIFY_FEATURE__OBJECT = eINSTANCE.getInstanceModifyFeature_Object();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODIFY_FEATURE__TYPE = eINSTANCE.getInstanceModifyFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_MODIFY_FEATURE__OPERATION_TYPE = eINSTANCE.getInstanceModifyFeature_OperationType();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_ASSIGN__TO = eINSTANCE.getInstanceAssign_To();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DelayImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__DURATION = eINSTANCE.getDelay_Duration();

		/**
		 * The meta object literal for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IAdaptable
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getIAdaptable()
		 * @generated
		 */
		EClass IADAPTABLE = eINSTANCE.getIAdaptable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.VariableImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFAULT = eINSTANCE.getVariable_Default();

		/**
		 * The meta object literal for the '<em><b>Emf Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__EMF_TYPE = eINSTANCE.getVariable_EmfType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.IfImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONTENT = eINSTANCE.getIf_Content();

		/**
		 * The meta object literal for the '<em><b>Else If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_IF = eINSTANCE.getIf_ElseIf();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ElseIfImpl <em>Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ElseIfImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getElseIf()
		 * @generated
		 */
		EClass ELSE_IF = eINSTANCE.getElseIf();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF__CONTENT = eINSTANCE.getElseIf_Content();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELSE_IF__CONDITION = eINSTANCE.getElseIf_Condition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ElseImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__CONTENT = eINSTANCE.getElse_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SequenceImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__CONTENT = eINSTANCE.getSequence_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DecisionImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__THEN = eINSTANCE.getDecision_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__ELSE = eINSTANCE.getDecision_Else();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__CONDITION = eINSTANCE.getDecision_Condition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DoWhileImpl <em>Do While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DoWhileImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDoWhile()
		 * @generated
		 */
		EClass DO_WHILE = eINSTANCE.getDoWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_WHILE__CONDITION = eINSTANCE.getDoWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_WHILE__BODY = eINSTANCE.getDoWhile_Body();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.WhileImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__BODY = eINSTANCE.getWhile_Body();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ForEachImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.WaitForEventImpl <em>Wait For Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.WaitForEventImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getWaitForEvent()
		 * @generated
		 */
		EClass WAIT_FOR_EVENT = eINSTANCE.getWaitForEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_FOR_EVENT__EVENT = eINSTANCE.getWaitForEvent_Event();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ExecutableContentNodeImpl <em>Executable Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ExecutableContentNodeImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getExecutableContentNode()
		 * @generated
		 */
		EClass EXECUTABLE_CONTENT_NODE = eINSTANCE.getExecutableContentNode();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT_NODE__CONTENT = eINSTANCE.getExecutableContentNode_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl <em>State Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.StateChartImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getStateChart()
		 * @generated
		 */
		EClass STATE_CHART = eINSTANCE.getStateChart();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractState <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractState
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__VARIABLES = eINSTANCE.getAbstractState_Variables();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>On Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ON_ENTRY = eINSTANCE.getState_OnEntry();

		/**
		 * The meta object literal for the '<em><b>On Exit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ON_EXIT = eINSTANCE.getState_OnExit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState <em>Abstract Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.AbstractCompositeState
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getAbstractCompositeState()
		 * @generated
		 */
		EClass ABSTRACT_COMPOSITE_STATE = eINSTANCE.getAbstractCompositeState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPOSITE_STATE__STATES = eINSTANCE.getAbstractCompositeState_States();

		/**
		 * The meta object literal for the '<em><b>History State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPOSITE_STATE__HISTORY_STATE = eINSTANCE.getAbstractCompositeState_HistoryState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.CompositeStateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__INITIAL_STATE = eINSTANCE.getCompositeState_InitialState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl <em>Parallel State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.ParallelStateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getParallelState()
		 * @generated
		 */
		EClass PARALLEL_STATE = eINSTANCE.getParallelState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.FinalStateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.HistoryStateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getHistoryState()
		 * @generated
		 */
		EClass HISTORY_STATE = eINSTANCE.getHistoryState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY_STATE__TYPE = eINSTANCE.getHistoryState_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.TransitionImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>On Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ON_TRIGGER = eINSTANCE.getTransition_OnTrigger();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.SourceStateImpl <em>Source State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.SourceStateImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getSourceState()
		 * @generated
		 */
		EClass SOURCE_STATE = eINSTANCE.getSourceState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_STATE__TRANSITIONS = eINSTANCE.getSourceState_Transitions();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.TargetState <em>Target State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.TargetState
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getTargetState()
		 * @generated
		 */
		EClass TARGET_STATE = eINSTANCE.getTargetState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.OperationType
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.HistoryType <em>History Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.HistoryType
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getHistoryType()
		 * @generated
		 */
		EEnum HISTORY_TYPE = eINSTANCE.getHistoryType();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.CondEventImpl <em>Cond Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.CondEventImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getCondEvent()
		 * @generated
		 */
		EClass COND_EVENT = eINSTANCE.getCondEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_EVENT__EVENT = eINSTANCE.getCondEvent_Event();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COND_EVENT__PATTERN = eINSTANCE.getCondEvent_Pattern();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_EVENT__CONDITION = eINSTANCE.getCondEvent_Condition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceCondEventImpl <em>Instance Cond Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceCondEventImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceCondEvent()
		 * @generated
		 */
		EClass INSTANCE_COND_EVENT = eINSTANCE.getInstanceCondEvent();

		/**
		 * The meta object literal for the '<em><b>Instance Match Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_COND_EVENT__INSTANCE_MATCH_CONDITION = eINSTANCE.getInstanceCondEvent_InstanceMatchCondition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionImpl <em>Instance Match Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchCondition()
		 * @generated
		 */
		EClass INSTANCE_MATCH_CONDITION = eINSTANCE.getInstanceMatchCondition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl <em>Instance Match Condition Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionFormulaImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchConditionFormula()
		 * @generated
		 */
		EClass INSTANCE_MATCH_CONDITION_FORMULA = eINSTANCE.getInstanceMatchConditionFormula();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_MATCH_CONDITION_FORMULA__OPERATOR = eINSTANCE.getInstanceMatchConditionFormula_Operator();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MATCH_CONDITION_FORMULA__COND = eINSTANCE.getInstanceMatchConditionFormula_Cond();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl <em>Instance Match Condition Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.InstanceMatchConditionAtomImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getInstanceMatchConditionAtom()
		 * @generated
		 */
		EClass INSTANCE_MATCH_CONDITION_ATOM = eINSTANCE.getInstanceMatchConditionAtom();

		/**
		 * The meta object literal for the '<em><b>Instance Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_MATCH_CONDITION_ATOM__INSTANCE_EXPR = eINSTANCE.getInstanceMatchConditionAtom_InstanceExpr();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MATCH_CONDITION_ATOM__INSTANCE = eINSTANCE.getInstanceMatchConditionAtom_Instance();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MATCH_CONDITION_ATOM__PATTERN = eINSTANCE.getInstanceMatchConditionAtom_Pattern();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DialogueImpl <em>Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialogueImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDialogue()
		 * @generated
		 */
		EClass DIALOGUE = eINSTANCE.getDialogue();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__CONTENT = eINSTANCE.getDialogue_Content();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__ID = eINSTANCE.getDialogue_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.dialogue.impl.DialogueDesignerElementImpl <em>Designer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialogueDesignerElementImpl
		 * @see de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl#getDialogueDesignerElement()
		 * @generated
		 */
		EClass DIALOGUE_DESIGNER_ELEMENT = eINSTANCE.getDialogueDesignerElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE_DESIGNER_ELEMENT__ID = eINSTANCE.getDialogueDesignerElement_Id();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE_DESIGNER_ELEMENT__DISPLAY_NAME = eINSTANCE.getDialogueDesignerElement_DisplayName();

	}

} //DialoguePackage
