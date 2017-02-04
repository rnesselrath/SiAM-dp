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
package de.dfki.iui.mmds.core.model.dialogue.impl;

import de.dfki.iui.mmds.core.model.dialogue.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueFactory;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.Else;
import de.dfki.iui.mmds.core.model.dialogue.ElseIf;
import de.dfki.iui.mmds.core.model.dialogue.If;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DialogueFactoryImpl extends EFactoryImpl implements DialogueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static DialogueFactory init() {
		try {
			DialogueFactory theDialogueFactory = (DialogueFactory)EPackage.Registry.INSTANCE.getEFactory(DialoguePackage.eNS_URI);
			if (theDialogueFactory != null) {
				return theDialogueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DialogueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DialogueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DialoguePackage.DIALOGUE: return createDialogue();
			case DialoguePackage.COND_EVENT: return createCondEvent();
			case DialoguePackage.INSTANCE_COND_EVENT: return createInstanceCondEvent();
			case DialoguePackage.INSTANCE_MATCH_CONDITION_FORMULA: return createInstanceMatchConditionFormula();
			case DialoguePackage.INSTANCE_MATCH_CONDITION_ATOM: return createInstanceMatchConditionAtom();
			case DialoguePackage.RAISE: return createRaise();
			case DialoguePackage.SEND: return createSend();
			case DialoguePackage.LOG: return createLog();
			case DialoguePackage.ASSIGN: return createAssign();
			case DialoguePackage.INSTANCE_ASSIGN: return createInstanceAssign();
			case DialoguePackage.INSTANCE_MODIFY_FEATURE: return createInstanceModifyFeature();
			case DialoguePackage.REFERENCE: return createReference();
			case DialoguePackage.DELAY: return createDelay();
			case DialoguePackage.VARIABLE: return createVariable();
			case DialoguePackage.IF: return createIf();
			case DialoguePackage.ELSE_IF: return createElseIf();
			case DialoguePackage.ELSE: return createElse();
			case DialoguePackage.SEQUENCE: return createSequence();
			case DialoguePackage.DECISION: return createDecision();
			case DialoguePackage.DO_WHILE: return createDoWhile();
			case DialoguePackage.WHILE: return createWhile();
			case DialoguePackage.FOR_EACH: return createForEach();
			case DialoguePackage.WAIT_FOR_EVENT: return createWaitForEvent();
			case DialoguePackage.EXECUTABLE_CONTENT_NODE: return createExecutableContentNode();
			case DialoguePackage.STATE_CHART: return createStateChart();
			case DialoguePackage.STATE: return createState();
			case DialoguePackage.COMPOSITE_STATE: return createCompositeState();
			case DialoguePackage.PARALLEL_STATE: return createParallelState();
			case DialoguePackage.FINAL_STATE: return createFinalState();
			case DialoguePackage.HISTORY_STATE: return createHistoryState();
			case DialoguePackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DialoguePackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case DialoguePackage.HISTORY_TYPE:
				return createHistoryTypeFromString(eDataType, initialValue);
			case DialoguePackage.CLASS:
				return createClassFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DialoguePackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case DialoguePackage.HISTORY_TYPE:
				return convertHistoryTypeToString(eDataType, instanceValue);
			case DialoguePackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raise createRaise() {
		RaiseImpl raise = new RaiseImpl();
		return raise;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Send createSend() {
		SendImpl send = new SendImpl();
		return send;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAssign createInstanceAssign() {
		InstanceAssignImpl instanceAssign = new InstanceAssignImpl();
		return instanceAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModifyFeature createInstanceModifyFeature() {
		InstanceModifyFeatureImpl instanceModifyFeature = new InstanceModifyFeatureImpl();
		return instanceModifyFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseIf createElseIf() {
		ElseIfImpl elseIf = new ElseIfImpl();
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhile createDoWhile() {
		DoWhileImpl doWhile = new DoWhileImpl();
		return doWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForEvent createWaitForEvent() {
		WaitForEventImpl waitForEvent = new WaitForEventImpl();
		return waitForEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableContentNode createExecutableContentNode() {
		ExecutableContentNodeImpl executableContentNode = new ExecutableContentNodeImpl();
		return executableContentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChart createStateChart() {
		StateChartImpl stateChart = new StateChartImpl();
		return stateChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelState createParallelState() {
		ParallelStateImpl parallelState = new ParallelStateImpl();
		return parallelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryState createHistoryState() {
		HistoryStateImpl historyState = new HistoryStateImpl();
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryType createHistoryTypeFromString(EDataType eDataType, String initialValue) {
		HistoryType result = HistoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class createClassFromString(EDataType eDataType, String initialValue) {
		return (Class)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CondEvent createCondEvent() {
		CondEventImpl condEvent = new CondEventImpl();
		return condEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondEvent createInstanceCondEvent() {
		InstanceCondEventImpl instanceCondEvent = new InstanceCondEventImpl();
		return instanceCondEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceMatchConditionFormula createInstanceMatchConditionFormula() {
		InstanceMatchConditionFormulaImpl instanceMatchConditionFormula = new InstanceMatchConditionFormulaImpl();
		return instanceMatchConditionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceMatchConditionAtom createInstanceMatchConditionAtom() {
		InstanceMatchConditionAtomImpl instanceMatchConditionAtom = new InstanceMatchConditionAtomImpl();
		return instanceMatchConditionAtom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dialogue createDialogue() {
		DialogueImpl dialogue = new DialogueImpl();
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DialoguePackage getDialoguePackage() {
		return (DialoguePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DialoguePackage getPackage() {
		return DialoguePackage.eINSTANCE;
	}

} // DialogueFactoryImpl
