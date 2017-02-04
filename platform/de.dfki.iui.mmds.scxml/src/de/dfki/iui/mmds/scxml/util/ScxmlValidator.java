/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.util;

import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.dfki.iui.mmds.scxml.AbstractSimpleState;
import de.dfki.iui.mmds.scxml.AbstractState;
import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.Conditional;
import de.dfki.iui.mmds.scxml.Content;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.DatamodelContainer;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.DescriptionContainer;
import de.dfki.iui.mmds.scxml.Donedata;
import de.dfki.iui.mmds.scxml.Else;
import de.dfki.iui.mmds.scxml.ElseIf;
import de.dfki.iui.mmds.scxml.ExecutableContent;
import de.dfki.iui.mmds.scxml.ExmodeDatatype;
import de.dfki.iui.mmds.scxml.FinalState;
import de.dfki.iui.mmds.scxml.HistoryState;
import de.dfki.iui.mmds.scxml.HistoryTypeDatatype;
import de.dfki.iui.mmds.scxml.If;
import de.dfki.iui.mmds.scxml.InitialState;
import de.dfki.iui.mmds.scxml.Invoke;
import de.dfki.iui.mmds.scxml.Log;
import de.dfki.iui.mmds.scxml.Node;
import de.dfki.iui.mmds.scxml.OnEntry;
import de.dfki.iui.mmds.scxml.OnExit;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.Param;
import de.dfki.iui.mmds.scxml.Raise;
import de.dfki.iui.mmds.scxml.Script;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.Transition;
import de.dfki.iui.mmds.scxml.TransitionSource;
import de.dfki.iui.mmds.scxml.TransitionTarget;
import de.dfki.iui.mmds.scxml.Validate;
import de.dfki.iui.mmds.scxml.XData;
import de.dfki.iui.mmds.scxml.XObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.scxml.ScxmlPackage
 * @generated
 */
public class ScxmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScxmlValidator INSTANCE = new ScxmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.mmds.scxml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ScxmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ScxmlPackage.STATE_CHART:
				return validateStateChart((StateChart)value, diagnostics, context);
			case ScxmlPackage.SCRIPT:
				return validateScript((Script)value, diagnostics, context);
			case ScxmlPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case ScxmlPackage.TRANSITION_SOURCE:
				return validateTransitionSource((TransitionSource)value, diagnostics, context);
			case ScxmlPackage.TRANSITION_TARGET:
				return validateTransitionTarget((TransitionTarget)value, diagnostics, context);
			case ScxmlPackage.ABSTRACT_STATE:
				return validateAbstractState((AbstractState)value, diagnostics, context);
			case ScxmlPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case ScxmlPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case ScxmlPackage.COND_EVENT_TRANSITION:
				return validateCondEventTransition((CondEventTransition)value, diagnostics, context);
			case ScxmlPackage.INITIAL_STATE:
				return validateInitialState((InitialState)value, diagnostics, context);
			case ScxmlPackage.PARAM:
				return validateParam((Param)value, diagnostics, context);
			case ScxmlPackage.DONEDATA:
				return validateDonedata((Donedata)value, diagnostics, context);
			case ScxmlPackage.CONTENT:
				return validateContent((Content)value, diagnostics, context);
			case ScxmlPackage.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case ScxmlPackage.PARALLEL_STATE:
				return validateParallelState((ParallelState)value, diagnostics, context);
			case ScxmlPackage.ABSTRACT_SIMPLE_STATE:
				return validateAbstractSimpleState((AbstractSimpleState)value, diagnostics, context);
			case ScxmlPackage.SIMPLE_STATE:
				return validateSimpleState((SimpleState)value, diagnostics, context);
			case ScxmlPackage.HISTORY_STATE:
				return validateHistoryState((HistoryState)value, diagnostics, context);
			case ScxmlPackage.ON_ENTRY:
				return validateOnEntry((OnEntry)value, diagnostics, context);
			case ScxmlPackage.ON_EXIT:
				return validateOnExit((OnExit)value, diagnostics, context);
			case ScxmlPackage.EXECUTABLE_CONTENT:
				return validateExecutableContent((ExecutableContent)value, diagnostics, context);
			case ScxmlPackage.RAISE:
				return validateRaise((Raise)value, diagnostics, context);
			case ScxmlPackage.CONDITIONAL:
				return validateConditional((Conditional)value, diagnostics, context);
			case ScxmlPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case ScxmlPackage.ELSE_IF:
				return validateElseIf((ElseIf)value, diagnostics, context);
			case ScxmlPackage.ELSE:
				return validateElse((Else)value, diagnostics, context);
			case ScxmlPackage.LOG:
				return validateLog((Log)value, diagnostics, context);
			case ScxmlPackage.SEND:
				return validateSend((Send)value, diagnostics, context);
			case ScxmlPackage.CANCEL:
				return validateCancel((Cancel)value, diagnostics, context);
			case ScxmlPackage.INVOKE:
				return validateInvoke((Invoke)value, diagnostics, context);
			case ScxmlPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case ScxmlPackage.XDATA:
				return validateXData((XData)value, diagnostics, context);
			case ScxmlPackage.XOBJECT:
				return validateXObject((XObject)value, diagnostics, context);
			case ScxmlPackage.DATAMODEL:
				return validateDatamodel((Datamodel)value, diagnostics, context);
			case ScxmlPackage.DATAMODEL_CONTAINER:
				return validateDatamodelContainer((DatamodelContainer)value, diagnostics, context);
			case ScxmlPackage.DESCRIPTION_CONTAINER:
				return validateDescriptionContainer((DescriptionContainer)value, diagnostics, context);
			case ScxmlPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case ScxmlPackage.ASSIGN:
				return validateAssign((Assign)value, diagnostics, context);
			case ScxmlPackage.VALIDATE:
				return validateValidate((Validate)value, diagnostics, context);
			case ScxmlPackage.IADAPTABLE:
				return validateIAdaptable((IAdaptable)value, diagnostics, context);
			case ScxmlPackage.EXMODE_DATATYPE:
				return validateExmodeDatatype((ExmodeDatatype)value, diagnostics, context);
			case ScxmlPackage.HISTORY_TYPE_DATATYPE:
				return validateHistoryTypeDatatype((HistoryTypeDatatype)value, diagnostics, context);
			case ScxmlPackage.ADAPTER_TOKEN:
				return validateAdapterToken((AdapterToken)value, diagnostics, context);
			case ScxmlPackage.SJAVA_CLASS:
				return validateSJavaClass((Class)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateChart(StateChart stateChart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateChart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractSimpleState_uniqueInitialStateDefinition(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateChart_initialStateDefined(stateChart, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateChart_initialStateIsChild(stateChart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the initialStateDefined constraint of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_CHART__INITIAL_STATE_DEFINED__EEXPRESSION = "(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())";

	/**
	 * Validates the initialStateDefined constraint of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateChart_initialStateDefined(StateChart stateChart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScxmlPackage.Literals.STATE_CHART,
				 stateChart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initialStateDefined",
				 STATE_CHART__INITIAL_STATE_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the initialStateIsChild constraint of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_CHART__INITIAL_STATE_IS_CHILD__EEXPRESSION = "initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i )) and (not initial.oclIsUndefined() implies (final->exists( f | f = initial ) or state->exists( s | s = initial ) or parallel->exists( p | p = initial )))";

	/**
	 * Validates the initialStateIsChild constraint of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateChart_initialStateIsChild(StateChart stateChart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScxmlPackage.Literals.STATE_CHART,
				 stateChart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initialStateIsChild",
				 STATE_CHART__INITIAL_STATE_IS_CHILD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(Script script, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(script, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionSource(TransitionSource transitionSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionTarget(TransitionTarget transitionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractState(AbstractState abstractState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondEventTransition(CondEventTransition condEventTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condEventTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialState(InitialState initialState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParam(Param param, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(param, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDonedata(Donedata donedata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(donedata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContent(Content content, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(content, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finalState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelState(ParallelState parallelState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parallelState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSimpleState(AbstractSimpleState abstractSimpleState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractSimpleState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractSimpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractSimpleState_uniqueInitialStateDefinition(abstractSimpleState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueInitialStateDefinition constraint of '<em>Abstract Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_SIMPLE_STATE__UNIQUE_INITIAL_STATE_DEFINITION__EEXPRESSION = "(initial1->notEmpty() implies initial.oclIsUndefined()) and (not initial.oclIsUndefined() implies initial1->isEmpty())";

	/**
	 * Validates the uniqueInitialStateDefinition constraint of '<em>Abstract Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSimpleState_uniqueInitialStateDefinition(AbstractSimpleState abstractSimpleState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScxmlPackage.Literals.ABSTRACT_SIMPLE_STATE,
				 abstractSimpleState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueInitialStateDefinition",
				 ABSTRACT_SIMPLE_STATE__UNIQUE_INITIAL_STATE_DEFINITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleState(SimpleState simpleState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractSimpleState_uniqueInitialStateDefinition(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleState_initialStateDefined(simpleState, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleState_initialStateIsChild(simpleState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the initialStateDefined constraint of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIMPLE_STATE__INITIAL_STATE_DEFINED__EEXPRESSION = "(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())";

	/**
	 * Validates the initialStateDefined constraint of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleState_initialStateDefined(SimpleState simpleState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScxmlPackage.Literals.SIMPLE_STATE,
				 simpleState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initialStateDefined",
				 SIMPLE_STATE__INITIAL_STATE_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the initialStateIsChild constraint of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIMPLE_STATE__INITIAL_STATE_IS_CHILD__EEXPRESSION = "initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i ))";

	/**
	 * Validates the initialStateIsChild constraint of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleState_initialStateIsChild(SimpleState simpleState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScxmlPackage.Literals.SIMPLE_STATE,
				 simpleState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initialStateIsChild",
				 SIMPLE_STATE__INITIAL_STATE_IS_CHILD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryState(HistoryState historyState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historyState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnEntry(OnEntry onEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnExit(OnExit onExit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onExit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableContent(ExecutableContent executableContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executableContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaise(Raise raise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raise, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditional(Conditional conditional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(if_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElseIf(ElseIf elseIf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elseIf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElse(Else else_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(else_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLog(Log log, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(log, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSend(Send send, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(send, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancel(Cancel cancel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoke(Invoke invoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoke, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXData(XData xData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXObject(XObject xObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatamodel(Datamodel datamodel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datamodel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatamodelContainer(DatamodelContainer datamodelContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datamodelContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionContainer(DescriptionContainer descriptionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(description, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssign(Assign assign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidate(Validate validate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIAdaptable(IAdaptable iAdaptable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)iAdaptable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExmodeDatatype(ExmodeDatatype exmodeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryTypeDatatype(HistoryTypeDatatype historyTypeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdapterToken(AdapterToken adapterToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSJavaClass(Class sJavaClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ScxmlValidator
