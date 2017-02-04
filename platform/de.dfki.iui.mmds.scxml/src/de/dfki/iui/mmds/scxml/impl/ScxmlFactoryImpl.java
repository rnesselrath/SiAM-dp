/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Assign;
import de.dfki.iui.mmds.scxml.Cancel;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.Conditional;
import de.dfki.iui.mmds.scxml.Content;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Datamodel;
import de.dfki.iui.mmds.scxml.Description;
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
import de.dfki.iui.mmds.scxml.ScxmlFactory;
import de.dfki.iui.mmds.scxml.ScxmlPackage;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.SimpleState;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.Transition;
import de.dfki.iui.mmds.scxml.Validate;
import de.dfki.iui.mmds.scxml.XData;
import de.dfki.iui.mmds.scxml.XObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlFactoryImpl extends EFactoryImpl implements ScxmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScxmlFactory init() {
		try {
			ScxmlFactory theScxmlFactory = (ScxmlFactory)EPackage.Registry.INSTANCE.getEFactory(ScxmlPackage.eNS_URI);
			if (theScxmlFactory != null) {
				return theScxmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScxmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlFactoryImpl() {
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
			case ScxmlPackage.STATE_CHART: return createStateChart();
			case ScxmlPackage.SCRIPT: return createScript();
			case ScxmlPackage.NODE: return createNode();
			case ScxmlPackage.STATE: return createState();
			case ScxmlPackage.TRANSITION: return createTransition();
			case ScxmlPackage.COND_EVENT_TRANSITION: return createCondEventTransition();
			case ScxmlPackage.INITIAL_STATE: return createInitialState();
			case ScxmlPackage.PARAM: return createParam();
			case ScxmlPackage.DONEDATA: return createDonedata();
			case ScxmlPackage.CONTENT: return createContent();
			case ScxmlPackage.FINAL_STATE: return createFinalState();
			case ScxmlPackage.PARALLEL_STATE: return createParallelState();
			case ScxmlPackage.SIMPLE_STATE: return createSimpleState();
			case ScxmlPackage.HISTORY_STATE: return createHistoryState();
			case ScxmlPackage.ON_ENTRY: return createOnEntry();
			case ScxmlPackage.ON_EXIT: return createOnExit();
			case ScxmlPackage.EXECUTABLE_CONTENT: return createExecutableContent();
			case ScxmlPackage.RAISE: return createRaise();
			case ScxmlPackage.CONDITIONAL: return createConditional();
			case ScxmlPackage.IF: return createIf();
			case ScxmlPackage.ELSE_IF: return createElseIf();
			case ScxmlPackage.ELSE: return createElse();
			case ScxmlPackage.LOG: return createLog();
			case ScxmlPackage.SEND: return createSend();
			case ScxmlPackage.CANCEL: return createCancel();
			case ScxmlPackage.INVOKE: return createInvoke();
			case ScxmlPackage.DATA: return createData();
			case ScxmlPackage.XDATA: return createXData();
			case ScxmlPackage.XOBJECT: return createXObject();
			case ScxmlPackage.DATAMODEL: return createDatamodel();
			case ScxmlPackage.DESCRIPTION: return createDescription();
			case ScxmlPackage.ASSIGN: return createAssign();
			case ScxmlPackage.VALIDATE: return createValidate();
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
			case ScxmlPackage.EXMODE_DATATYPE:
				return createExmodeDatatypeFromString(eDataType, initialValue);
			case ScxmlPackage.HISTORY_TYPE_DATATYPE:
				return createHistoryTypeDatatypeFromString(eDataType, initialValue);
			case ScxmlPackage.ADAPTER_TOKEN:
				return createAdapterTokenFromString(eDataType, initialValue);
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
			case ScxmlPackage.EXMODE_DATATYPE:
				return convertExmodeDatatypeToString(eDataType, instanceValue);
			case ScxmlPackage.HISTORY_TYPE_DATATYPE:
				return convertHistoryTypeDatatypeToString(eDataType, instanceValue);
			case ScxmlPackage.ADAPTER_TOKEN:
				return convertAdapterTokenToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public CondEventTransition createCondEventTransition() {
		CondEventTransitionImpl condEventTransition = new CondEventTransitionImpl();
		return condEventTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donedata createDonedata() {
		DonedataImpl donedata = new DonedataImpl();
		return donedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
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
	public ParallelState createParallelState() {
		ParallelStateImpl parallelState = new ParallelStateImpl();
		return parallelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleState createSimpleState() {
		SimpleStateImpl simpleState = new SimpleStateImpl();
		return simpleState;
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
	public OnEntry createOnEntry() {
		OnEntryImpl onEntry = new OnEntryImpl();
		return onEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnExit createOnExit() {
		OnExitImpl onExit = new OnExitImpl();
		return onExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableContent createExecutableContent() {
		ExecutableContentImpl executableContent = new ExecutableContentImpl();
		return executableContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raise createRaise() {
		RaiseImpl raise = new RaiseImpl();
		return raise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIf createElseIf() {
		ElseIfImpl elseIf = new ElseIfImpl();
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send createSend() {
		SendImpl send = new SendImpl();
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cancel createCancel() {
		CancelImpl cancel = new CancelImpl();
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke createInvoke() {
		InvokeImpl invoke = new InvokeImpl();
		return invoke;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XData createXData() {
		XDataImpl xData = new XDataImpl();
		return xData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XObject createXObject() {
		XObjectImpl xObject = new XObjectImpl();
		return xObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datamodel createDatamodel() {
		DatamodelImpl datamodel = new DatamodelImpl();
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate createValidate() {
		ValidateImpl validate = new ValidateImpl();
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
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
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExmodeDatatype createExmodeDatatypeFromString(EDataType eDataType, String initialValue) {
		ExmodeDatatype result = ExmodeDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExmodeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryTypeDatatype createHistoryTypeDatatypeFromString(EDataType eDataType, String initialValue) {
		HistoryTypeDatatype result = HistoryTypeDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryTypeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterToken createAdapterTokenFromString(EDataType eDataType, String initialValue) {
		AdapterToken result = AdapterToken.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdapterTokenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlPackage getScxmlPackage() {
		return (ScxmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScxmlPackage getPackage() {
		return ScxmlPackage.eINSTANCE;
	}

} //ScxmlFactoryImpl
