/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import de.dfki.iui.mmds.scxml.ScxmlFactory;
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
import de.dfki.iui.mmds.scxml.util.ScxmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlPackageImpl extends EPackageImpl implements ScxmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass condEventTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donedataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSimpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datamodelContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAdaptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exmodeDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyTypeDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adapterTokenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sJavaClassEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.mmds.scxml.ScxmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScxmlPackageImpl() {
		super(eNS_URI, ScxmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScxmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScxmlPackage init() {
		if (isInited) return (ScxmlPackage)EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI);

		// Obtain or create and register package
		ScxmlPackageImpl theScxmlPackage = (ScxmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScxmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScxmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScxmlPackage.createPackageContents();

		// Initialize created meta-data
		theScxmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theScxmlPackage, 
			 new EValidator.Descriptor() {
				 @Override
				public EValidator getEValidator() {
					 return ScxmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theScxmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScxmlPackage.eNS_URI, theScxmlPackage);
		return theScxmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateChart() {
		return stateChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateChart_Version() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateChart_Profile() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateChart_Exmode() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateChart_Id() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateChart_Script() {
		return (EReference)stateChartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateChart_Xmlns() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Onentry() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Onexit() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionSource() {
		return transitionSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionSource_Transition() {
		return (EReference)transitionSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionTarget() {
		return transitionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionTarget_Id() {
		return (EAttribute)transitionTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractState_State() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractState_Parallel() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_History() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondEventTransition() {
		return condEventTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondEventTransition_Cond() {
		return (EAttribute)condEventTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondEventTransition_Event() {
		return (EAttribute)condEventTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialState_Transition() {
		return (EReference)initialStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParam_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParam_Expr() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDonedata() {
		return donedataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDonedata_Param() {
		return (EReference)donedataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDonedata_Content() {
		return (EReference)donedataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContent_Value() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalState_Donedata() {
		return (EReference)finalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelState() {
		return parallelStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractSimpleState() {
		return abstractSimpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractSimpleState_Initial1() {
		return (EReference)abstractSimpleStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractSimpleState_Initial() {
		return (EReference)abstractSimpleStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractSimpleState_Final() {
		return (EReference)abstractSimpleStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleState() {
		return simpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleState_Invoke() {
		return (EReference)simpleStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryState() {
		return historyStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoryState_Type() {
		return (EAttribute)historyStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnEntry() {
		return onEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnExit() {
		return onExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutableContent() {
		return executableContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutableContent_Group() {
		return (EAttribute)executableContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_If() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Log() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Raise() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Send() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Cancel() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Assign() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Validate() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutableContent_Script() {
		return (EReference)executableContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaise() {
		return raiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaise_Event() {
		return (EAttribute)raiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditional_Cond() {
		return (EAttribute)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIf_Elseif() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIf_Else() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElseIf() {
		return elseIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElse() {
		return elseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLog() {
		return logEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLog_Label() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLog_Expr() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLog_Level() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSend() {
		return sendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Event() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Eventexpr() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Target() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Targetexpr() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Type() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Typeexpr() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Id() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Idlocation() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Delay() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Delayexpr() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Namelist() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Hints() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSend_Hintsexpr() {
		return (EAttribute)sendEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancel() {
		return cancelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancel_Sendid() {
		return (EAttribute)cancelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancel_Sendidexpr() {
		return (EAttribute)cancelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvoke() {
		return invokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Type() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Typeexpr() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Src() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Srcexpr() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Id() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Idlocation() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Namelist() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoke_Autoforward() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvoke_Finalize() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Id() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Src() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Expr() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXData() {
		return xDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXData_Object() {
		return (EReference)xDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXObject() {
		return xObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXObject_NsUri() {
		return (EAttribute)xObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXObject_ClassifierName() {
		return (EAttribute)xObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXObject_Type() {
		return (EReference)xObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXObject_Exchange() {
		return (EAttribute)xObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatamodel() {
		return datamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatamodel_Schema() {
		return (EAttribute)datamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatamodel_Data() {
		return (EReference)datamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatamodelContainer() {
		return datamodelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatamodelContainer_Datamodel() {
		return (EReference)datamodelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionContainer() {
		return descriptionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionContainer_Description() {
		return (EReference)descriptionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescription_Value() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssign() {
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssign_Location() {
		return (EAttribute)assignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssign_Expr() {
		return (EAttribute)assignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssign_Name() {
		return (EAttribute)assignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidate() {
		return validateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidate_Location() {
		return (EAttribute)validateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidate_Schema() {
		return (EAttribute)validateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAdaptable() {
		return iAdaptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScript_Value() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExmodeDatatype() {
		return exmodeDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHistoryTypeDatatype() {
		return historyTypeDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdapterToken() {
		return adapterTokenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSJavaClass() {
		return sJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScxmlFactory getScxmlFactory() {
		return (ScxmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateChartEClass = createEClass(STATE_CHART);
		createEAttribute(stateChartEClass, STATE_CHART__XMLNS);
		createEAttribute(stateChartEClass, STATE_CHART__VERSION);
		createEAttribute(stateChartEClass, STATE_CHART__PROFILE);
		createEAttribute(stateChartEClass, STATE_CHART__EXMODE);
		createEAttribute(stateChartEClass, STATE_CHART__ID);
		createEReference(stateChartEClass, STATE_CHART__SCRIPT);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__VALUE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__ONENTRY);
		createEReference(nodeEClass, NODE__ONEXIT);

		transitionSourceEClass = createEClass(TRANSITION_SOURCE);
		createEReference(transitionSourceEClass, TRANSITION_SOURCE__TRANSITION);

		transitionTargetEClass = createEClass(TRANSITION_TARGET);
		createEAttribute(transitionTargetEClass, TRANSITION_TARGET__ID);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__PARALLEL);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__HISTORY);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);

		condEventTransitionEClass = createEClass(COND_EVENT_TRANSITION);
		createEAttribute(condEventTransitionEClass, COND_EVENT_TRANSITION__COND);
		createEAttribute(condEventTransitionEClass, COND_EVENT_TRANSITION__EVENT);

		initialStateEClass = createEClass(INITIAL_STATE);
		createEReference(initialStateEClass, INITIAL_STATE__TRANSITION);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);
		createEAttribute(paramEClass, PARAM__EXPR);

		donedataEClass = createEClass(DONEDATA);
		createEReference(donedataEClass, DONEDATA__PARAM);
		createEReference(donedataEClass, DONEDATA__CONTENT);

		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__VALUE);

		finalStateEClass = createEClass(FINAL_STATE);
		createEReference(finalStateEClass, FINAL_STATE__DONEDATA);

		parallelStateEClass = createEClass(PARALLEL_STATE);

		abstractSimpleStateEClass = createEClass(ABSTRACT_SIMPLE_STATE);
		createEReference(abstractSimpleStateEClass, ABSTRACT_SIMPLE_STATE__INITIAL1);
		createEReference(abstractSimpleStateEClass, ABSTRACT_SIMPLE_STATE__INITIAL);
		createEReference(abstractSimpleStateEClass, ABSTRACT_SIMPLE_STATE__FINAL);

		simpleStateEClass = createEClass(SIMPLE_STATE);
		createEReference(simpleStateEClass, SIMPLE_STATE__INVOKE);

		historyStateEClass = createEClass(HISTORY_STATE);
		createEAttribute(historyStateEClass, HISTORY_STATE__TYPE);

		onEntryEClass = createEClass(ON_ENTRY);

		onExitEClass = createEClass(ON_EXIT);

		executableContentEClass = createEClass(EXECUTABLE_CONTENT);
		createEAttribute(executableContentEClass, EXECUTABLE_CONTENT__GROUP);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__IF);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__LOG);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__RAISE);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__SEND);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__CANCEL);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__ASSIGN);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__VALIDATE);
		createEReference(executableContentEClass, EXECUTABLE_CONTENT__SCRIPT);

		raiseEClass = createEClass(RAISE);
		createEAttribute(raiseEClass, RAISE__EVENT);

		conditionalEClass = createEClass(CONDITIONAL);
		createEAttribute(conditionalEClass, CONDITIONAL__COND);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__ELSEIF);
		createEReference(ifEClass, IF__ELSE);

		elseIfEClass = createEClass(ELSE_IF);

		elseEClass = createEClass(ELSE);

		logEClass = createEClass(LOG);
		createEAttribute(logEClass, LOG__LABEL);
		createEAttribute(logEClass, LOG__EXPR);
		createEAttribute(logEClass, LOG__LEVEL);

		sendEClass = createEClass(SEND);
		createEAttribute(sendEClass, SEND__EVENT);
		createEAttribute(sendEClass, SEND__EVENTEXPR);
		createEAttribute(sendEClass, SEND__TARGET);
		createEAttribute(sendEClass, SEND__TARGETEXPR);
		createEAttribute(sendEClass, SEND__TYPE);
		createEAttribute(sendEClass, SEND__TYPEEXPR);
		createEAttribute(sendEClass, SEND__ID);
		createEAttribute(sendEClass, SEND__IDLOCATION);
		createEAttribute(sendEClass, SEND__DELAY);
		createEAttribute(sendEClass, SEND__DELAYEXPR);
		createEAttribute(sendEClass, SEND__NAMELIST);
		createEAttribute(sendEClass, SEND__HINTS);
		createEAttribute(sendEClass, SEND__HINTSEXPR);

		cancelEClass = createEClass(CANCEL);
		createEAttribute(cancelEClass, CANCEL__SENDID);
		createEAttribute(cancelEClass, CANCEL__SENDIDEXPR);

		invokeEClass = createEClass(INVOKE);
		createEAttribute(invokeEClass, INVOKE__TYPE);
		createEAttribute(invokeEClass, INVOKE__TYPEEXPR);
		createEAttribute(invokeEClass, INVOKE__SRC);
		createEAttribute(invokeEClass, INVOKE__SRCEXPR);
		createEAttribute(invokeEClass, INVOKE__ID);
		createEAttribute(invokeEClass, INVOKE__IDLOCATION);
		createEAttribute(invokeEClass, INVOKE__NAMELIST);
		createEAttribute(invokeEClass, INVOKE__AUTOFORWARD);
		createEReference(invokeEClass, INVOKE__FINALIZE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__ID);
		createEAttribute(dataEClass, DATA__SRC);
		createEAttribute(dataEClass, DATA__EXPR);

		xDataEClass = createEClass(XDATA);
		createEReference(xDataEClass, XDATA__OBJECT);

		xObjectEClass = createEClass(XOBJECT);
		createEAttribute(xObjectEClass, XOBJECT__NS_URI);
		createEAttribute(xObjectEClass, XOBJECT__CLASSIFIER_NAME);
		createEReference(xObjectEClass, XOBJECT__TYPE);
		createEAttribute(xObjectEClass, XOBJECT__EXCHANGE);

		datamodelEClass = createEClass(DATAMODEL);
		createEAttribute(datamodelEClass, DATAMODEL__SCHEMA);
		createEReference(datamodelEClass, DATAMODEL__DATA);

		datamodelContainerEClass = createEClass(DATAMODEL_CONTAINER);
		createEReference(datamodelContainerEClass, DATAMODEL_CONTAINER__DATAMODEL);

		descriptionContainerEClass = createEClass(DESCRIPTION_CONTAINER);
		createEReference(descriptionContainerEClass, DESCRIPTION_CONTAINER__DESCRIPTION);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__VALUE);

		assignEClass = createEClass(ASSIGN);
		createEAttribute(assignEClass, ASSIGN__LOCATION);
		createEAttribute(assignEClass, ASSIGN__EXPR);
		createEAttribute(assignEClass, ASSIGN__NAME);

		validateEClass = createEClass(VALIDATE);
		createEAttribute(validateEClass, VALIDATE__LOCATION);
		createEAttribute(validateEClass, VALIDATE__SCHEMA);

		iAdaptableEClass = createEClass(IADAPTABLE);

		// Create enums
		exmodeDatatypeEEnum = createEEnum(EXMODE_DATATYPE);
		historyTypeDatatypeEEnum = createEEnum(HISTORY_TYPE_DATATYPE);
		adapterTokenEEnum = createEEnum(ADAPTER_TOKEN);

		// Create data types
		sJavaClassEDataType = createEDataType(SJAVA_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateChartEClass.getESuperTypes().add(this.getAbstractState());
		stateChartEClass.getESuperTypes().add(this.getAbstractSimpleState());
		stateChartEClass.getESuperTypes().add(this.getDatamodelContainer());
		stateChartEClass.getESuperTypes().add(this.getDescriptionContainer());
		nodeEClass.getESuperTypes().add(this.getDescriptionContainer());
		transitionSourceEClass.getESuperTypes().add(this.getNode());
		transitionTargetEClass.getESuperTypes().add(this.getNode());
		stateEClass.getESuperTypes().add(this.getTransitionTarget());
		stateEClass.getESuperTypes().add(this.getAbstractState());
		stateEClass.getESuperTypes().add(this.getTransitionSource());
		stateEClass.getESuperTypes().add(this.getDatamodelContainer());
		transitionEClass.getESuperTypes().add(this.getExecutableContent());
		transitionEClass.getESuperTypes().add(this.getDescriptionContainer());
		condEventTransitionEClass.getESuperTypes().add(this.getTransition());
		initialStateEClass.getESuperTypes().add(this.getDescriptionContainer());
		finalStateEClass.getESuperTypes().add(this.getTransitionTarget());
		parallelStateEClass.getESuperTypes().add(this.getState());
		simpleStateEClass.getESuperTypes().add(this.getState());
		simpleStateEClass.getESuperTypes().add(this.getAbstractSimpleState());
		historyStateEClass.getESuperTypes().add(this.getTransitionTarget());
		historyStateEClass.getESuperTypes().add(this.getInitialState());
		onEntryEClass.getESuperTypes().add(this.getExecutableContent());
		onExitEClass.getESuperTypes().add(this.getExecutableContent());
		raiseEClass.getESuperTypes().add(this.getDonedata());
		ifEClass.getESuperTypes().add(this.getConditional());
		ifEClass.getESuperTypes().add(this.getExecutableContent());
		elseIfEClass.getESuperTypes().add(this.getConditional());
		sendEClass.getESuperTypes().add(this.getDonedata());
		invokeEClass.getESuperTypes().add(this.getDonedata());
		dataEClass.getESuperTypes().add(this.getDescriptionContainer());
		xDataEClass.getESuperTypes().add(this.getData());
		datamodelEClass.getESuperTypes().add(this.getDescriptionContainer());
		datamodelContainerEClass.getESuperTypes().add(this.getIAdaptable());
		descriptionContainerEClass.getESuperTypes().add(this.getIAdaptable());

		// Initialize classes and features; add operations and parameters
		initEClass(stateChartEClass, StateChart.class, "StateChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateChart_Xmlns(), theXMLTypePackage.getAnyURI(), "xmlns", "http://www.w3.org/2005/07/scxml", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_Version(), ecorePackage.getEBigDecimal(), "version", "1.0", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_Profile(), theXMLTypePackage.getNMTOKEN(), "profile", "ecmascript", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_Exmode(), this.getExmodeDatatype(), "exmode", "lax", 0, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_Id(), ecorePackage.getEString(), "id", null, 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateChart_Script(), this.getScript(), null, "script", null, 0, -1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Onentry(), this.getOnEntry(), null, "onentry", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Onexit(), this.getOnExit(), null, "onexit", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionSourceEClass, TransitionSource.class, "TransitionSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionSource_Transition(), this.getCondEventTransition(), null, "transition", null, 0, -1, TransitionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTargetEClass, TransitionTarget.class, "TransitionTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionTarget_Id(), ecorePackage.getEString(), "id", null, 1, 1, TransitionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_State(), this.getSimpleState(), null, "state", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractState_Parallel(), this.getParallelState(), null, "parallel", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_History(), this.getHistoryState(), null, "history", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getTransitionTarget(), null, "target", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(condEventTransitionEClass, CondEventTransition.class, "CondEventTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondEventTransition_Cond(), theXMLTypePackage.getString(), "cond", null, 0, 1, CondEventTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondEventTransition_Event(), theXMLTypePackage.getString(), "event", null, 0, 1, CondEventTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialState_Transition(), this.getTransition(), null, "transition", null, 0, 1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 1, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParam_Expr(), ecorePackage.getEString(), "expr", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donedataEClass, Donedata.class, "Donedata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDonedata_Param(), this.getParam(), null, "param", null, 0, -1, Donedata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDonedata_Content(), theEcorePackage.getEObject(), null, "content", null, 0, 1, Donedata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalState_Donedata(), this.getDonedata(), null, "donedata", null, 0, 1, FinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelStateEClass, ParallelState.class, "ParallelState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSimpleStateEClass, AbstractSimpleState.class, "AbstractSimpleState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSimpleState_Initial1(), this.getTransitionTarget(), null, "initial1", null, 0, 1, AbstractSimpleState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAbstractSimpleState_Initial1().getEKeys().add(this.getTransitionTarget_Id());
		initEReference(getAbstractSimpleState_Initial(), this.getInitialState(), null, "initial", null, 0, 1, AbstractSimpleState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSimpleState_Final(), this.getFinalState(), null, "final", null, 0, -1, AbstractSimpleState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleStateEClass, SimpleState.class, "SimpleState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleState_Invoke(), this.getInvoke(), null, "invoke", null, 0, 1, SimpleState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historyStateEClass, HistoryState.class, "HistoryState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoryState_Type(), this.getHistoryTypeDatatype(), "type", "shallow", 0, 1, HistoryState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onEntryEClass, OnEntry.class, "OnEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onExitEClass, OnExit.class, "OnExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableContentEClass, ExecutableContent.class, "ExecutableContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutableContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ExecutableContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_If(), this.getIf(), null, "if", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Log(), this.getLog(), null, "log", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Raise(), this.getRaise(), null, "raise", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Send(), this.getSend(), null, "send", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Cancel(), this.getCancel(), null, "cancel", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Assign(), this.getAssign(), null, "assign", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Validate(), this.getValidate(), null, "validate", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableContent_Script(), this.getScript(), null, "script", null, 0, -1, ExecutableContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(raiseEClass, Raise.class, "Raise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRaise_Event(), theXMLTypePackage.getNMTOKEN(), "event", null, 1, 1, Raise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditional_Cond(), ecorePackage.getEString(), "cond", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Elseif(), this.getElseIf(), null, "elseif", null, 0, -1, If.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Else(), this.getElse(), null, "else", null, 0, 1, If.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elseIfEClass, ElseIf.class, "ElseIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elseEClass, Else.class, "Else", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLog_Label(), ecorePackage.getEString(), "label", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLog_Expr(), ecorePackage.getEString(), "expr", null, 1, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLog_Level(), ecorePackage.getEString(), "level", "1", 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendEClass, Send.class, "Send", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSend_Event(), theXMLTypePackage.getString(), "event", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Eventexpr(), theXMLTypePackage.getString(), "eventexpr", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Target(), theXMLTypePackage.getString(), "target", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Targetexpr(), theXMLTypePackage.getString(), "targetexpr", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Typeexpr(), theXMLTypePackage.getString(), "typeexpr", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Idlocation(), theXMLTypePackage.getString(), "idlocation", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Delay(), theXMLTypePackage.getString(), "delay", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Delayexpr(), theXMLTypePackage.getString(), "delayexpr", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Namelist(), theXMLTypePackage.getString(), "namelist", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Hints(), theXMLTypePackage.getString(), "hints", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSend_Hintsexpr(), theXMLTypePackage.getString(), "hintsexpr", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelEClass, Cancel.class, "Cancel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancel_Sendid(), theXMLTypePackage.getIDREF(), "sendid", null, 1, 1, Cancel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCancel_Sendidexpr(), theXMLTypePackage.getString(), "sendidexpr", null, 1, 1, Cancel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeEClass, Invoke.class, "Invoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoke_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Typeexpr(), theXMLTypePackage.getString(), "typeexpr", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Srcexpr(), theXMLTypePackage.getString(), "srcexpr", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Idlocation(), theXMLTypePackage.getString(), "idlocation", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Namelist(), theXMLTypePackage.getString(), "namelist", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Autoforward(), theXMLTypePackage.getBoolean(), "autoforward", "false", 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Finalize(), this.getExecutableContent(), null, "finalize", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Id(), ecorePackage.getEString(), "id", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Expr(), theXMLTypePackage.getString(), "expr", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xDataEClass, XData.class, "XData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXData_Object(), theEcorePackage.getEObject(), null, "object", null, 0, 1, XData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xObjectEClass, XObject.class, "XObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXObject_NsUri(), ecorePackage.getEString(), "nsUri", null, 0, 1, XObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXObject_ClassifierName(), ecorePackage.getEString(), "classifierName", null, 0, 1, XObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXObject_Type(), theEcorePackage.getEClass(), null, "type", null, 0, 1, XObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXObject_Exchange(), theEcorePackage.getEBoolean(), "exchange", null, 0, 1, XObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(xObjectEClass, null, "registerAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datamodelEClass, Datamodel.class, "Datamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatamodel_Schema(), theXMLTypePackage.getAnyURI(), "schema", null, 0, 1, Datamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatamodel_Data(), this.getData(), null, "data", null, 0, -1, Datamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datamodelContainerEClass, DatamodelContainer.class, "DatamodelContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatamodelContainer_Datamodel(), this.getDatamodel(), null, "datamodel", null, 0, 1, DatamodelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(datamodelContainerEClass, ecorePackage.getEJavaObject(), "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSJavaClass(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descriptionContainerEClass, DescriptionContainer.class, "DescriptionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionContainer_Description(), this.getDescription(), null, "description", null, 0, 1, DescriptionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(descriptionContainerEClass, ecorePackage.getEJavaObject(), "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSJavaClass(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssign_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssign_Expr(), theXMLTypePackage.getString(), "expr", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssign_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validateEClass, Validate.class, "Validate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidate_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, Validate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidate_Schema(), theXMLTypePackage.getAnyURI(), "schema", null, 1, 1, Validate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iAdaptableEClass, IAdaptable.class, "IAdaptable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(exmodeDatatypeEEnum, ExmodeDatatype.class, "ExmodeDatatype");
		addEEnumLiteral(exmodeDatatypeEEnum, ExmodeDatatype.LAX);
		addEEnumLiteral(exmodeDatatypeEEnum, ExmodeDatatype.STRICT);

		initEEnum(historyTypeDatatypeEEnum, HistoryTypeDatatype.class, "HistoryTypeDatatype");
		addEEnumLiteral(historyTypeDatatypeEEnum, HistoryTypeDatatype.SHALLOW);
		addEEnumLiteral(historyTypeDatatypeEEnum, HistoryTypeDatatype.DEEP);

		initEEnum(adapterTokenEEnum, AdapterToken.class, "AdapterToken");
		addEEnumLiteral(adapterTokenEEnum, AdapterToken.DESCRIPTION);
		addEEnumLiteral(adapterTokenEEnum, AdapterToken.DATAMODEL);

		// Initialize data types
		initEDataType(sJavaClassEDataType, Class.class, "SJavaClass", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// ExtendedMetaData
		createExtendedMetaData_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });			
		addAnnotation
		  (stateChartEClass, 
		   source, 
		   new String[] {
			 "name", "scxml"
		   });				
		addAnnotation
		  (scriptEClass, 
		   source, 
		   new String[] {
			 "kind", "simple"
		   });		
		addAnnotation
		  (getScript_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (contentEClass, 
		   source, 
		   new String[] {
			 "kind", "simple"
		   });		
		addAnnotation
		  (getContent_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });				
		addAnnotation
		  (getAbstractSimpleState_Initial1(), 
		   source, 
		   new String[] {
			 "name", "initial",
			 "kind", "attribute"
		   });				
		addAnnotation
		  (getExecutableContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getExecutableContent_If(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Log(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Raise(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Send(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Cancel(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Assign(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Validate(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExecutableContent_Script(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getIf_Elseif(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getIf_Else(), 
		   source, 
		   new String[] {
			 "group", "#group:0"
		   });		
		addAnnotation
		  (xDataEClass, 
		   source, 
		   new String[] {
			 "qualified", "true"
		   });						
		addAnnotation
		  (descriptionEClass, 
		   source, 
		   new String[] {
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDescription_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });			
		addAnnotation
		  (stateChartEClass, 
		   source, 
		   new String[] {
			 "constraints", "initialStateDefined initialStateIsChild"
		   });							
		addAnnotation
		  (abstractSimpleStateEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueInitialStateDefinition"
		   });				
		addAnnotation
		  (simpleStateEClass, 
		   source, 
		   new String[] {
			 "constraints", "initialStateDefined initialStateIsChild"
		   });																			
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";						
		addAnnotation
		  (stateChartEClass, 
		   source, 
		   new String[] {
			 "initialStateDefined", "(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())",
			 "initialStateIsChild", "initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i )) and (not initial.oclIsUndefined() implies (final->exists( f | f = initial ) or state->exists( s | s = initial ) or parallel->exists( p | p = initial )))"
		   });							
		addAnnotation
		  (abstractSimpleStateEClass, 
		   source, 
		   new String[] {
			 "uniqueInitialStateDefinition", "(initial1->notEmpty() implies initial.oclIsUndefined()) and (not initial.oclIsUndefined() implies initial1->isEmpty())"
		   });				
		addAnnotation
		  (simpleStateEClass, 
		   source, 
		   new String[] {
			 "initialStateDefined", "(parallel->isEmpty() and state->isEmpty() and final->isEmpty()) or not(initial1->isEmpty() and initial.oclIsUndefined())",
			 "initialStateIsChild", "initial1->forAll( i | final->exists( f | f = i ) or state->exists( s | s = i ) or parallel->exists( p | p = i ))"
		   });																		
	}

	/**
	 * Initializes the annotations for <b>ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaData_1Annotations() {
		String source = "ExtendedMetaData";																												
		addAnnotation
		  (getXData_Object(), 
		   source, 
		   new String[] {
		   });					
	}

} //ScxmlPackageImpl
