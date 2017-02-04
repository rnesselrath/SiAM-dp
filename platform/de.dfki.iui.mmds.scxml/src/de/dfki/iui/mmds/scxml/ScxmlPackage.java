/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml;

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
 * @see de.dfki.iui.mmds.scxml.ScxmlFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ScxmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scxml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/07/scxml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scxml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScxmlPackage eINSTANCE = de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.AbstractStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__PARALLEL = 1;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl <em>State Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.StateChartImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getStateChart()
	 * @generated
	 */
	int STATE_CHART = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__STATE = ABSTRACT_STATE__STATE;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__PARALLEL = ABSTRACT_STATE__PARALLEL;

	/**
	 * The feature id for the '<em><b>Initial1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__INITIAL1 = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__INITIAL = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__FINAL = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__DATAMODEL = ABSTRACT_STATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__DESCRIPTION = ABSTRACT_STATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xmlns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__XMLNS = ABSTRACT_STATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__VERSION = ABSTRACT_STATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__PROFILE = ABSTRACT_STATE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__EXMODE = ABSTRACT_STATE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ID = ABSTRACT_STATE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__SCRIPT = ABSTRACT_STATE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>State Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.NodeImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionSourceImpl <em>Transition Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.TransitionSourceImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransitionSource()
	 * @generated
	 */
	int TRANSITION_SOURCE = 3;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionTargetImpl <em>Transition Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.TransitionTargetImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransitionTarget()
	 * @generated
	 */
	int TRANSITION_TARGET = 4;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.StateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl <em>Executable Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getExecutableContent()
	 * @generated
	 */
	int EXECUTABLE_CONTENT = 20;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.TransitionImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl <em>Cond Event Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getCondEventTransition()
	 * @generated
	 */
	int COND_EVENT_TRANSITION = 8;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.InitialStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 9;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ParamImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 10;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.DonedataImpl <em>Donedata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.DonedataImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDonedata()
	 * @generated
	 */
	int DONEDATA = 11;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.FinalStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 13;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.HistoryStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 17;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.OnEntryImpl <em>On Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.OnEntryImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getOnEntry()
	 * @generated
	 */
	int ON_ENTRY = 18;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.OnExitImpl <em>On Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.OnExitImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getOnExit()
	 * @generated
	 */
	int ON_EXIT = 19;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.RaiseImpl <em>Raise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.RaiseImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getRaise()
	 * @generated
	 */
	int RAISE = 21;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ConditionalImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 22;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.IfImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getIf()
	 * @generated
	 */
	int IF = 23;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ElseIfImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 24;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ElseImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 25;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.LogImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 26;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.SendImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSend()
	 * @generated
	 */
	int SEND = 27;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.CancelImpl <em>Cancel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.CancelImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getCancel()
	 * @generated
	 */
	int CANCEL = 28;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.InvokeImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 29;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.DataImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getData()
	 * @generated
	 */
	int DATA = 30;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.DatamodelImpl <em>Datamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.DatamodelImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDatamodel()
	 * @generated
	 */
	int DATAMODEL = 33;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.DatamodelContainer <em>Datamodel Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.DatamodelContainer
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDatamodelContainer()
	 * @generated
	 */
	int DATAMODEL_CONTAINER = 34;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.AssignImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 37;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ValidateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 38;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ScriptImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.DescriptionContainer <em>Description Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.DescriptionContainer
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDescriptionContainer()
	 * @generated
	 */
	int DESCRIPTION_CONTAINER = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getIAdaptable()
	 * @generated
	 */
	int IADAPTABLE = 39;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ContentImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 12;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.ParallelStateImpl <em>Parallel State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.ParallelStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getParallelState()
	 * @generated
	 */
	int PARALLEL_STATE = 14;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl <em>Abstract Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAbstractSimpleState()
	 * @generated
	 */
	int ABSTRACT_SIMPLE_STATE = 15;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.SimpleStateImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSimpleState()
	 * @generated
	 */
	int SIMPLE_STATE = 16;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.XDataImpl <em>XData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.XDataImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getXData()
	 * @generated
	 */
	int XDATA = 31;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl <em>XObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.XObjectImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getXObject()
	 * @generated
	 */
	int XOBJECT = 32;

	/**
	 * The number of structural features of the '<em>IAdaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_CONTAINER__DESCRIPTION = IADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_CONTAINER_FEATURE_COUNT = IADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = DESCRIPTION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ONENTRY = DESCRIPTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ONEXIT = DESCRIPTION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DESCRIPTION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SOURCE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SOURCE__ONENTRY = NODE__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SOURCE__ONEXIT = NODE__ONEXIT;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SOURCE__TRANSITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SOURCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TARGET__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TARGET__ONENTRY = NODE__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TARGET__ONEXIT = NODE__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TARGET__ID = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TARGET_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = TRANSITION_TARGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ONENTRY = TRANSITION_TARGET__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ONEXIT = TRANSITION_TARGET__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = TRANSITION_TARGET__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE = TRANSITION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARALLEL = TRANSITION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION = TRANSITION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DATAMODEL = TRANSITION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HISTORY = TRANSITION_TARGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = TRANSITION_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__IF = 1;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__LOG = 2;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__RAISE = 3;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__SEND = 4;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__CANCEL = 5;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__ASSIGN = 6;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__VALIDATE = 7;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT__SCRIPT = 8;

	/**
	 * The number of structural features of the '<em>Executable Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_FEATURE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GROUP = EXECUTABLE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IF = EXECUTABLE_CONTENT__IF;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LOG = EXECUTABLE_CONTENT__LOG;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RAISE = EXECUTABLE_CONTENT__RAISE;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SEND = EXECUTABLE_CONTENT__SEND;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CANCEL = EXECUTABLE_CONTENT__CANCEL;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ASSIGN = EXECUTABLE_CONTENT__ASSIGN;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VALIDATE = EXECUTABLE_CONTENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SCRIPT = EXECUTABLE_CONTENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__GROUP = TRANSITION__GROUP;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__IF = TRANSITION__IF;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__LOG = TRANSITION__LOG;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__RAISE = TRANSITION__RAISE;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__SEND = TRANSITION__SEND;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__CANCEL = TRANSITION__CANCEL;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__ASSIGN = TRANSITION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__VALIDATE = TRANSITION__VALIDATE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__SCRIPT = TRANSITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__COND = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION__EVENT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cond Event Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EVENT_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = DESCRIPTION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__TRANSITION = DESCRIPTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = DESCRIPTION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Donedata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DESCRIPTION = TRANSITION_TARGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ONENTRY = TRANSITION_TARGET__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ONEXIT = TRANSITION_TARGET__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = TRANSITION_TARGET__ID;

	/**
	 * The feature id for the '<em><b>Donedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DONEDATA = TRANSITION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = TRANSITION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ONENTRY = STATE__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ONEXIT = STATE__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__STATE = STATE__STATE;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__PARALLEL = STATE__PARALLEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__TRANSITION = STATE__TRANSITION;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__DATAMODEL = STATE__DATAMODEL;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE__HISTORY = STATE__HISTORY;

	/**
	 * The number of structural features of the '<em>Parallel State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SIMPLE_STATE__INITIAL1 = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SIMPLE_STATE__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SIMPLE_STATE__FINAL = 2;

	/**
	 * The number of structural features of the '<em>Abstract Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SIMPLE_STATE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__ONENTRY = STATE__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__ONEXIT = STATE__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__STATE = STATE__STATE;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__PARALLEL = STATE__PARALLEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__TRANSITION = STATE__TRANSITION;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__DATAMODEL = STATE__DATAMODEL;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__HISTORY = STATE__HISTORY;

	/**
	 * The feature id for the '<em><b>Initial1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__INITIAL1 = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__INITIAL = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__FINAL = STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__INVOKE = STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__DESCRIPTION = TRANSITION_TARGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ONENTRY = TRANSITION_TARGET__ONENTRY;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ONEXIT = TRANSITION_TARGET__ONEXIT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ID = TRANSITION_TARGET__ID;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__TRANSITION = TRANSITION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__TYPE = TRANSITION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = TRANSITION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__GROUP = EXECUTABLE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__IF = EXECUTABLE_CONTENT__IF;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__LOG = EXECUTABLE_CONTENT__LOG;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__RAISE = EXECUTABLE_CONTENT__RAISE;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__SEND = EXECUTABLE_CONTENT__SEND;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__CANCEL = EXECUTABLE_CONTENT__CANCEL;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__ASSIGN = EXECUTABLE_CONTENT__ASSIGN;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__VALIDATE = EXECUTABLE_CONTENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__SCRIPT = EXECUTABLE_CONTENT__SCRIPT;

	/**
	 * The number of structural features of the '<em>On Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__GROUP = EXECUTABLE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__IF = EXECUTABLE_CONTENT__IF;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__LOG = EXECUTABLE_CONTENT__LOG;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__RAISE = EXECUTABLE_CONTENT__RAISE;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__SEND = EXECUTABLE_CONTENT__SEND;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__CANCEL = EXECUTABLE_CONTENT__CANCEL;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__ASSIGN = EXECUTABLE_CONTENT__ASSIGN;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__VALIDATE = EXECUTABLE_CONTENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__SCRIPT = EXECUTABLE_CONTENT__SCRIPT;

	/**
	 * The number of structural features of the '<em>On Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__PARAM = DONEDATA__PARAM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__CONTENT = DONEDATA__CONTENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__EVENT = DONEDATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_FEATURE_COUNT = DONEDATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__COND = 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = CONDITIONAL__COND;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__GROUP = CONDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF = CONDITIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__LOG = CONDITIONAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__RAISE = CONDITIONAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SEND = CONDITIONAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CANCEL = CONDITIONAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ASSIGN = CONDITIONAL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__VALIDATE = CONDITIONAL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SCRIPT = CONDITIONAL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = CONDITIONAL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = CONDITIONAL_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__COND = CONDITIONAL__COND;

	/**
	 * The number of structural features of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__EXPR = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__PARAM = DONEDATA__PARAM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__CONTENT = DONEDATA__CONTENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__EVENT = DONEDATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eventexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__EVENTEXPR = DONEDATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TARGET = DONEDATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targetexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TARGETEXPR = DONEDATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TYPE = DONEDATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TYPEEXPR = DONEDATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ID = DONEDATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__IDLOCATION = DONEDATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__DELAY = DONEDATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Delayexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__DELAYEXPR = DONEDATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__NAMELIST = DONEDATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__HINTS = DONEDATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Hintsexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__HINTSEXPR = DONEDATA_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = DONEDATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sendid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__SENDID = 0;

	/**
	 * The feature id for the '<em><b>Sendidexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__SENDIDEXPR = 1;

	/**
	 * The number of structural features of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PARAM = DONEDATA__PARAM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CONTENT = DONEDATA__CONTENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TYPE = DONEDATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TYPEEXPR = DONEDATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SRC = DONEDATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srcexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SRCEXPR = DONEDATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ID = DONEDATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__IDLOCATION = DONEDATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAMELIST = DONEDATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Autoforward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__AUTOFORWARD = DONEDATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Finalize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FINALIZE = DONEDATA_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = DONEDATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = DESCRIPTION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = DESCRIPTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SRC = DESCRIPTION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXPR = DESCRIPTION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = DESCRIPTION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA__SRC = DATA__SRC;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA__EXPR = DATA__EXPR;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA__OBJECT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ns Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOBJECT__NS_URI = 0;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOBJECT__CLASSIFIER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOBJECT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOBJECT__EXCHANGE = 3;

	/**
	 * The number of structural features of the '<em>XObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOBJECT_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL__DESCRIPTION = DESCRIPTION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL__SCHEMA = DESCRIPTION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL__DATA = DESCRIPTION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_FEATURE_COUNT = DESCRIPTION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_CONTAINER__DATAMODEL = IADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datamodel Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAMODEL_CONTAINER_FEATURE_COUNT = IADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.impl.DescriptionImpl
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXPR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = 2;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.ExmodeDatatype <em>Exmode Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.ExmodeDatatype
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getExmodeDatatype()
	 * @generated
	 */
	int EXMODE_DATATYPE = 40;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.HistoryTypeDatatype <em>History Type Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.HistoryTypeDatatype
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getHistoryTypeDatatype()
	 * @generated
	 */
	int HISTORY_TYPE_DATATYPE = 41;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.scxml.AdapterToken <em>Adapter Token</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.scxml.AdapterToken
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAdapterToken()
	 * @generated
	 */
	int ADAPTER_TOKEN = 42;


	/**
	 * The meta object id for the '<em>SJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSJavaClass()
	 * @generated
	 */
	int SJAVA_CLASS = 43;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.StateChart <em>State Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Chart</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart
	 * @generated
	 */
	EClass getStateChart();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.StateChart#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getVersion()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.StateChart#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getProfile()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_Profile();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.StateChart#getExmode <em>Exmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exmode</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getExmode()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_Exmode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.StateChart#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getId()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.StateChart#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getScript()
	 * @see #getStateChart()
	 * @generated
	 */
	EReference getStateChart_Script();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.StateChart#getXmlns <em>Xmlns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlns</em>'.
	 * @see de.dfki.iui.mmds.scxml.StateChart#getXmlns()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_Xmlns();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.dfki.iui.mmds.scxml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.Node#getOnentry <em>Onentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Onentry</em>'.
	 * @see de.dfki.iui.mmds.scxml.Node#getOnentry()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Onentry();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.Node#getOnexit <em>Onexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Onexit</em>'.
	 * @see de.dfki.iui.mmds.scxml.Node#getOnexit()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Onexit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.TransitionSource <em>Transition Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Source</em>'.
	 * @see de.dfki.iui.mmds.scxml.TransitionSource
	 * @generated
	 */
	EClass getTransitionSource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.TransitionSource#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see de.dfki.iui.mmds.scxml.TransitionSource#getTransition()
	 * @see #getTransitionSource()
	 * @generated
	 */
	EReference getTransitionSource_Transition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.TransitionTarget <em>Transition Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Target</em>'.
	 * @see de.dfki.iui.mmds.scxml.TransitionTarget
	 * @generated
	 */
	EClass getTransitionTarget();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.TransitionTarget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.scxml.TransitionTarget#getId()
	 * @see #getTransitionTarget()
	 * @generated
	 */
	EAttribute getTransitionTarget_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.AbstractState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractState#getState()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_State();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.AbstractState#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractState#getParallel()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Parallel();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.dfki.iui.mmds.scxml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.State#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History</em>'.
	 * @see de.dfki.iui.mmds.scxml.State#getHistory()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_History();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dfki.iui.mmds.scxml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.scxml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.scxml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.CondEventTransition <em>Cond Event Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond Event Transition</em>'.
	 * @see de.dfki.iui.mmds.scxml.CondEventTransition
	 * @generated
	 */
	EClass getCondEventTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.CondEventTransition#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see de.dfki.iui.mmds.scxml.CondEventTransition#getCond()
	 * @see #getCondEventTransition()
	 * @generated
	 */
	EAttribute getCondEventTransition_Cond();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.CondEventTransition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.scxml.CondEventTransition#getEvent()
	 * @see #getCondEventTransition()
	 * @generated
	 */
	EAttribute getCondEventTransition_Event();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see de.dfki.iui.mmds.scxml.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.InitialState#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see de.dfki.iui.mmds.scxml.InitialState#getTransition()
	 * @see #getInitialState()
	 * @generated
	 */
	EReference getInitialState_Transition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see de.dfki.iui.mmds.scxml.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.scxml.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Param#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Param#getExpr()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Expr();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Donedata <em>Donedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donedata</em>'.
	 * @see de.dfki.iui.mmds.scxml.Donedata
	 * @generated
	 */
	EClass getDonedata();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.Donedata#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see de.dfki.iui.mmds.scxml.Donedata#getParam()
	 * @see #getDonedata()
	 * @generated
	 */
	EReference getDonedata_Param();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.Donedata#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.scxml.Donedata#getContent()
	 * @see #getDonedata()
	 * @generated
	 */
	EReference getDonedata_Content();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.scxml.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Content#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.scxml.Content#getValue()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see de.dfki.iui.mmds.scxml.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.FinalState#getDonedata <em>Donedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Donedata</em>'.
	 * @see de.dfki.iui.mmds.scxml.FinalState#getDonedata()
	 * @see #getFinalState()
	 * @generated
	 */
	EReference getFinalState_Donedata();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.ParallelState <em>Parallel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel State</em>'.
	 * @see de.dfki.iui.mmds.scxml.ParallelState
	 * @generated
	 */
	EClass getParallelState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState <em>Abstract Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Simple State</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractSimpleState
	 * @generated
	 */
	EClass getAbstractSimpleState();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial1 <em>Initial1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial1</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial1()
	 * @see #getAbstractSimpleState()
	 * @generated
	 */
	EReference getAbstractSimpleState_Initial1();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractSimpleState#getInitial()
	 * @see #getAbstractSimpleState()
	 * @generated
	 */
	EReference getAbstractSimpleState_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.AbstractSimpleState#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final</em>'.
	 * @see de.dfki.iui.mmds.scxml.AbstractSimpleState#getFinal()
	 * @see #getAbstractSimpleState()
	 * @generated
	 */
	EReference getAbstractSimpleState_Final();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.SimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see de.dfki.iui.mmds.scxml.SimpleState
	 * @generated
	 */
	EClass getSimpleState();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.SimpleState#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoke</em>'.
	 * @see de.dfki.iui.mmds.scxml.SimpleState#getInvoke()
	 * @see #getSimpleState()
	 * @generated
	 */
	EReference getSimpleState_Invoke();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see de.dfki.iui.mmds.scxml.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.HistoryState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.scxml.HistoryState#getType()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.OnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Entry</em>'.
	 * @see de.dfki.iui.mmds.scxml.OnEntry
	 * @generated
	 */
	EClass getOnEntry();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.OnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Exit</em>'.
	 * @see de.dfki.iui.mmds.scxml.OnExit
	 * @generated
	 */
	EClass getOnExit();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.ExecutableContent <em>Executable Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Content</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent
	 * @generated
	 */
	EClass getExecutableContent();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getGroup()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EAttribute getExecutableContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getIf()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_If();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getLog()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getRaise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getRaise()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Raise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getSend()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getCancel()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Cancel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getAssign()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getValidate()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Validate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.ExecutableContent#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExecutableContent#getScript()
	 * @see #getExecutableContent()
	 * @generated
	 */
	EReference getExecutableContent_Script();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Raise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise</em>'.
	 * @see de.dfki.iui.mmds.scxml.Raise
	 * @generated
	 */
	EClass getRaise();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Raise#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.scxml.Raise#getEvent()
	 * @see #getRaise()
	 * @generated
	 */
	EAttribute getRaise_Event();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see de.dfki.iui.mmds.scxml.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Conditional#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see de.dfki.iui.mmds.scxml.Conditional#getCond()
	 * @see #getConditional()
	 * @generated
	 */
	EAttribute getConditional_Cond();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see de.dfki.iui.mmds.scxml.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see de.dfki.iui.mmds.scxml.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.dfki.iui.mmds.scxml.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see de.dfki.iui.mmds.scxml.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see de.dfki.iui.mmds.scxml.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see de.dfki.iui.mmds.scxml.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Log#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.scxml.Log#getLabel()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Log#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Log#getExpr()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Expr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Log#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.iui.mmds.scxml.Log#getLevel()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Level();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getEvent()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Event();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getEventexpr <em>Eventexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eventexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getEventexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Eventexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getTarget()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Target();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getTargetexpr <em>Targetexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getTargetexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Targetexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getType()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getTypeexpr <em>Typeexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getTypeexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Typeexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getId()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getIdlocation <em>Idlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idlocation</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getIdlocation()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Idlocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getDelay()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Delay();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getDelayexpr <em>Delayexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delayexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getDelayexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Delayexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getNamelist <em>Namelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namelist</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getNamelist()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Namelist();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hints</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getHints()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Hints();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Send#getHintsexpr <em>Hintsexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hintsexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Send#getHintsexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Hintsexpr();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel</em>'.
	 * @see de.dfki.iui.mmds.scxml.Cancel
	 * @generated
	 */
	EClass getCancel();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Cancel#getSendid <em>Sendid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendid</em>'.
	 * @see de.dfki.iui.mmds.scxml.Cancel#getSendid()
	 * @see #getCancel()
	 * @generated
	 */
	EAttribute getCancel_Sendid();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Cancel#getSendidexpr <em>Sendidexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendidexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Cancel#getSendidexpr()
	 * @see #getCancel()
	 * @generated
	 */
	EAttribute getCancel_Sendidexpr();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getType()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getTypeexpr <em>Typeexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getTypeexpr()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Typeexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getSrc()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Src();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getSrcexpr <em>Srcexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcexpr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getSrcexpr()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Srcexpr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getId()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getIdlocation <em>Idlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idlocation</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getIdlocation()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Idlocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#getNamelist <em>Namelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namelist</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getNamelist()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Namelist();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Invoke#isAutoforward <em>Autoforward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoforward</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#isAutoforward()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Autoforward();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.Invoke#getFinalize <em>Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finalize</em>'.
	 * @see de.dfki.iui.mmds.scxml.Invoke#getFinalize()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Finalize();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.dfki.iui.mmds.scxml.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.scxml.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Data#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see de.dfki.iui.mmds.scxml.Data#getSrc()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Src();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Data#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Data#getExpr()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Expr();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.XData <em>XData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XData</em>'.
	 * @see de.dfki.iui.mmds.scxml.XData
	 * @generated
	 */
	EClass getXData();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.XData#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see de.dfki.iui.mmds.scxml.XData#getObject()
	 * @see #getXData()
	 * @generated
	 */
	EReference getXData_Object();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.XObject <em>XObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XObject</em>'.
	 * @see de.dfki.iui.mmds.scxml.XObject
	 * @generated
	 */
	EClass getXObject();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.XObject#getNsUri <em>Ns Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Uri</em>'.
	 * @see de.dfki.iui.mmds.scxml.XObject#getNsUri()
	 * @see #getXObject()
	 * @generated
	 */
	EAttribute getXObject_NsUri();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.XObject#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see de.dfki.iui.mmds.scxml.XObject#getClassifierName()
	 * @see #getXObject()
	 * @generated
	 */
	EAttribute getXObject_ClassifierName();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.scxml.XObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.scxml.XObject#getType()
	 * @see #getXObject()
	 * @generated
	 */
	EReference getXObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.XObject#isExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange</em>'.
	 * @see de.dfki.iui.mmds.scxml.XObject#isExchange()
	 * @see #getXObject()
	 * @generated
	 */
	EAttribute getXObject_Exchange();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Datamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datamodel</em>'.
	 * @see de.dfki.iui.mmds.scxml.Datamodel
	 * @generated
	 */
	EClass getDatamodel();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Datamodel#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see de.dfki.iui.mmds.scxml.Datamodel#getSchema()
	 * @see #getDatamodel()
	 * @generated
	 */
	EAttribute getDatamodel_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.scxml.Datamodel#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.dfki.iui.mmds.scxml.Datamodel#getData()
	 * @see #getDatamodel()
	 * @generated
	 */
	EReference getDatamodel_Data();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.DatamodelContainer <em>Datamodel Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datamodel Container</em>'.
	 * @see de.dfki.iui.mmds.scxml.DatamodelContainer
	 * @generated
	 */
	EClass getDatamodelContainer();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.DatamodelContainer#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datamodel</em>'.
	 * @see de.dfki.iui.mmds.scxml.DatamodelContainer#getDatamodel()
	 * @see #getDatamodelContainer()
	 * @generated
	 */
	EReference getDatamodelContainer_Datamodel();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.DescriptionContainer <em>Description Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Container</em>'.
	 * @see de.dfki.iui.mmds.scxml.DescriptionContainer
	 * @generated
	 */
	EClass getDescriptionContainer();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.scxml.DescriptionContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.scxml.DescriptionContainer#getDescription()
	 * @see #getDescriptionContainer()
	 * @generated
	 */
	EReference getDescriptionContainer_Description();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.scxml.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.scxml.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see de.dfki.iui.mmds.scxml.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Assign#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.dfki.iui.mmds.scxml.Assign#getLocation()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Assign#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see de.dfki.iui.mmds.scxml.Assign#getExpr()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Expr();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Assign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.scxml.Assign#getName()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see de.dfki.iui.mmds.scxml.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Validate#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.dfki.iui.mmds.scxml.Validate#getLocation()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Validate#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see de.dfki.iui.mmds.scxml.Validate#getSchema()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Schema();

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
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.scxml.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see de.dfki.iui.mmds.scxml.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.scxml.Script#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.scxml.Script#getValue()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Value();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.scxml.ExmodeDatatype <em>Exmode Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exmode Datatype</em>'.
	 * @see de.dfki.iui.mmds.scxml.ExmodeDatatype
	 * @generated
	 */
	EEnum getExmodeDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.scxml.HistoryTypeDatatype <em>History Type Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Type Datatype</em>'.
	 * @see de.dfki.iui.mmds.scxml.HistoryTypeDatatype
	 * @generated
	 */
	EEnum getHistoryTypeDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.scxml.AdapterToken <em>Adapter Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adapter Token</em>'.
	 * @see de.dfki.iui.mmds.scxml.AdapterToken
	 * @generated
	 */
	EEnum getAdapterToken();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>SJava Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SJava Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" serializeable="false"
	 * @generated
	 */
	EDataType getSJavaClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScxmlFactory getScxmlFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.StateChartImpl <em>State Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.StateChartImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getStateChart()
		 * @generated
		 */
		EClass STATE_CHART = eINSTANCE.getStateChart();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__VERSION = eINSTANCE.getStateChart_Version();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__PROFILE = eINSTANCE.getStateChart_Profile();

		/**
		 * The meta object literal for the '<em><b>Exmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__EXMODE = eINSTANCE.getStateChart_Exmode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__ID = eINSTANCE.getStateChart_Id();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CHART__SCRIPT = eINSTANCE.getStateChart_Script();

		/**
		 * The meta object literal for the '<em><b>Xmlns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__XMLNS = eINSTANCE.getStateChart_Xmlns();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.NodeImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Onentry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ONENTRY = eINSTANCE.getNode_Onentry();

		/**
		 * The meta object literal for the '<em><b>Onexit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ONEXIT = eINSTANCE.getNode_Onexit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionSourceImpl <em>Transition Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.TransitionSourceImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransitionSource()
		 * @generated
		 */
		EClass TRANSITION_SOURCE = eINSTANCE.getTransitionSource();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SOURCE__TRANSITION = eINSTANCE.getTransitionSource_Transition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionTargetImpl <em>Transition Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.TransitionTargetImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransitionTarget()
		 * @generated
		 */
		EClass TRANSITION_TARGET = eINSTANCE.getTransitionTarget();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TARGET__ID = eINSTANCE.getTransitionTarget_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.AbstractStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__STATE = eINSTANCE.getAbstractState_State();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__PARALLEL = eINSTANCE.getAbstractState_Parallel();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.StateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HISTORY = eINSTANCE.getState_History();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.TransitionImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl <em>Cond Event Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.CondEventTransitionImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getCondEventTransition()
		 * @generated
		 */
		EClass COND_EVENT_TRANSITION = eINSTANCE.getCondEventTransition();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_EVENT_TRANSITION__COND = eINSTANCE.getCondEventTransition_Cond();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_EVENT_TRANSITION__EVENT = eINSTANCE.getCondEventTransition_Event();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.InitialStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE__TRANSITION = eINSTANCE.getInitialState_Transition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ParamImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__EXPR = eINSTANCE.getParam_Expr();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.DonedataImpl <em>Donedata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.DonedataImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDonedata()
		 * @generated
		 */
		EClass DONEDATA = eINSTANCE.getDonedata();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONEDATA__PARAM = eINSTANCE.getDonedata_Param();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONEDATA__CONTENT = eINSTANCE.getDonedata_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ContentImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__VALUE = eINSTANCE.getContent_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.FinalStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>Donedata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE__DONEDATA = eINSTANCE.getFinalState_Donedata();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ParallelStateImpl <em>Parallel State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ParallelStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getParallelState()
		 * @generated
		 */
		EClass PARALLEL_STATE = eINSTANCE.getParallelState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl <em>Abstract Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.AbstractSimpleStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAbstractSimpleState()
		 * @generated
		 */
		EClass ABSTRACT_SIMPLE_STATE = eINSTANCE.getAbstractSimpleState();

		/**
		 * The meta object literal for the '<em><b>Initial1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SIMPLE_STATE__INITIAL1 = eINSTANCE.getAbstractSimpleState_Initial1();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SIMPLE_STATE__INITIAL = eINSTANCE.getAbstractSimpleState_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SIMPLE_STATE__FINAL = eINSTANCE.getAbstractSimpleState_Final();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.SimpleStateImpl <em>Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.SimpleStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSimpleState()
		 * @generated
		 */
		EClass SIMPLE_STATE = eINSTANCE.getSimpleState();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STATE__INVOKE = eINSTANCE.getSimpleState_Invoke();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.HistoryStateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getHistoryState()
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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.OnEntryImpl <em>On Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.OnEntryImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getOnEntry()
		 * @generated
		 */
		EClass ON_ENTRY = eINSTANCE.getOnEntry();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.OnExitImpl <em>On Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.OnExitImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getOnExit()
		 * @generated
		 */
		EClass ON_EXIT = eINSTANCE.getOnExit();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl <em>Executable Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ExecutableContentImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getExecutableContent()
		 * @generated
		 */
		EClass EXECUTABLE_CONTENT = eINSTANCE.getExecutableContent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE_CONTENT__GROUP = eINSTANCE.getExecutableContent_Group();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__IF = eINSTANCE.getExecutableContent_If();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__LOG = eINSTANCE.getExecutableContent_Log();

		/**
		 * The meta object literal for the '<em><b>Raise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__RAISE = eINSTANCE.getExecutableContent_Raise();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__SEND = eINSTANCE.getExecutableContent_Send();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__CANCEL = eINSTANCE.getExecutableContent_Cancel();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__ASSIGN = eINSTANCE.getExecutableContent_Assign();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__VALIDATE = eINSTANCE.getExecutableContent_Validate();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_CONTENT__SCRIPT = eINSTANCE.getExecutableContent_Script();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.RaiseImpl <em>Raise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.RaiseImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getRaise()
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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ConditionalImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL__COND = eINSTANCE.getConditional_Cond();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.IfImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ElseIfImpl <em>Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ElseIfImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getElseIf()
		 * @generated
		 */
		EClass ELSE_IF = eINSTANCE.getElseIf();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ElseImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.LogImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LABEL = eINSTANCE.getLog_Label();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__EXPR = eINSTANCE.getLog_Expr();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LEVEL = eINSTANCE.getLog_Level();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.SendImpl <em>Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.SendImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSend()
		 * @generated
		 */
		EClass SEND = eINSTANCE.getSend();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__EVENT = eINSTANCE.getSend_Event();

		/**
		 * The meta object literal for the '<em><b>Eventexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__EVENTEXPR = eINSTANCE.getSend_Eventexpr();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TARGET = eINSTANCE.getSend_Target();

		/**
		 * The meta object literal for the '<em><b>Targetexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TARGETEXPR = eINSTANCE.getSend_Targetexpr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TYPE = eINSTANCE.getSend_Type();

		/**
		 * The meta object literal for the '<em><b>Typeexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TYPEEXPR = eINSTANCE.getSend_Typeexpr();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__ID = eINSTANCE.getSend_Id();

		/**
		 * The meta object literal for the '<em><b>Idlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__IDLOCATION = eINSTANCE.getSend_Idlocation();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__DELAY = eINSTANCE.getSend_Delay();

		/**
		 * The meta object literal for the '<em><b>Delayexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__DELAYEXPR = eINSTANCE.getSend_Delayexpr();

		/**
		 * The meta object literal for the '<em><b>Namelist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__NAMELIST = eINSTANCE.getSend_Namelist();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__HINTS = eINSTANCE.getSend_Hints();

		/**
		 * The meta object literal for the '<em><b>Hintsexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__HINTSEXPR = eINSTANCE.getSend_Hintsexpr();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.CancelImpl <em>Cancel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.CancelImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getCancel()
		 * @generated
		 */
		EClass CANCEL = eINSTANCE.getCancel();

		/**
		 * The meta object literal for the '<em><b>Sendid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL__SENDID = eINSTANCE.getCancel_Sendid();

		/**
		 * The meta object literal for the '<em><b>Sendidexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL__SENDIDEXPR = eINSTANCE.getCancel_Sendidexpr();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.InvokeImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TYPE = eINSTANCE.getInvoke_Type();

		/**
		 * The meta object literal for the '<em><b>Typeexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TYPEEXPR = eINSTANCE.getInvoke_Typeexpr();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__SRC = eINSTANCE.getInvoke_Src();

		/**
		 * The meta object literal for the '<em><b>Srcexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__SRCEXPR = eINSTANCE.getInvoke_Srcexpr();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__ID = eINSTANCE.getInvoke_Id();

		/**
		 * The meta object literal for the '<em><b>Idlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__IDLOCATION = eINSTANCE.getInvoke_Idlocation();

		/**
		 * The meta object literal for the '<em><b>Namelist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__NAMELIST = eINSTANCE.getInvoke_Namelist();

		/**
		 * The meta object literal for the '<em><b>Autoforward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__AUTOFORWARD = eINSTANCE.getInvoke_Autoforward();

		/**
		 * The meta object literal for the '<em><b>Finalize</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FINALIZE = eINSTANCE.getInvoke_Finalize();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.DataImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SRC = eINSTANCE.getData_Src();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__EXPR = eINSTANCE.getData_Expr();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.XDataImpl <em>XData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.XDataImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getXData()
		 * @generated
		 */
		EClass XDATA = eINSTANCE.getXData();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDATA__OBJECT = eINSTANCE.getXData_Object();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.XObjectImpl <em>XObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.XObjectImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getXObject()
		 * @generated
		 */
		EClass XOBJECT = eINSTANCE.getXObject();

		/**
		 * The meta object literal for the '<em><b>Ns Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOBJECT__NS_URI = eINSTANCE.getXObject_NsUri();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOBJECT__CLASSIFIER_NAME = eINSTANCE.getXObject_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOBJECT__TYPE = eINSTANCE.getXObject_Type();

		/**
		 * The meta object literal for the '<em><b>Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOBJECT__EXCHANGE = eINSTANCE.getXObject_Exchange();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.DatamodelImpl <em>Datamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.DatamodelImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDatamodel()
		 * @generated
		 */
		EClass DATAMODEL = eINSTANCE.getDatamodel();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAMODEL__SCHEMA = eINSTANCE.getDatamodel_Schema();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAMODEL__DATA = eINSTANCE.getDatamodel_Data();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.DatamodelContainer <em>Datamodel Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.DatamodelContainer
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDatamodelContainer()
		 * @generated
		 */
		EClass DATAMODEL_CONTAINER = eINSTANCE.getDatamodelContainer();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAMODEL_CONTAINER__DATAMODEL = eINSTANCE.getDatamodelContainer_Datamodel();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.DescriptionContainer <em>Description Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.DescriptionContainer
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDescriptionContainer()
		 * @generated
		 */
		EClass DESCRIPTION_CONTAINER = eINSTANCE.getDescriptionContainer();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_CONTAINER__DESCRIPTION = eINSTANCE.getDescriptionContainer_Description();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.DescriptionImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.AssignImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__LOCATION = eINSTANCE.getAssign_Location();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__EXPR = eINSTANCE.getAssign_Expr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ValidateImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__LOCATION = eINSTANCE.getValidate_Location();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__SCHEMA = eINSTANCE.getValidate_Schema();

		/**
		 * The meta object literal for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IAdaptable
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getIAdaptable()
		 * @generated
		 */
		EClass IADAPTABLE = eINSTANCE.getIAdaptable();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.impl.ScriptImpl
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__VALUE = eINSTANCE.getScript_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.ExmodeDatatype <em>Exmode Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.ExmodeDatatype
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getExmodeDatatype()
		 * @generated
		 */
		EEnum EXMODE_DATATYPE = eINSTANCE.getExmodeDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.HistoryTypeDatatype <em>History Type Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.HistoryTypeDatatype
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getHistoryTypeDatatype()
		 * @generated
		 */
		EEnum HISTORY_TYPE_DATATYPE = eINSTANCE.getHistoryTypeDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.scxml.AdapterToken <em>Adapter Token</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.scxml.AdapterToken
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getAdapterToken()
		 * @generated
		 */
		EEnum ADAPTER_TOKEN = eINSTANCE.getAdapterToken();

		/**
		 * The meta object literal for the '<em>SJava Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see de.dfki.iui.mmds.scxml.impl.ScxmlPackageImpl#getSJavaClass()
		 * @generated
		 */
		EDataType SJAVA_CLASS = eINSTANCE.getSJavaClass();

	}

} //ScxmlPackage
