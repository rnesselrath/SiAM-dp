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
package de.dfki.iui.mmds.core.model.io.gui.updates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui.updates.LabelUpdate;
import de.dfki.iui.mmds.core.model.io.gui.updates.TextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate;
import de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesFactory;
import de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl;
import de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl;
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;
import de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class UpdatesPackageImpl extends EPackageImpl implements UpdatesPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiElementUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass textInputUpdateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass labelUpdateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpdatesPackageImpl() {
		super(eNS_URI, UpdatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link UpdatesPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpdatesPackage init() {
		if (isInited)
			return (UpdatesPackage) EPackage.Registry.INSTANCE.getEPackage(UpdatesPackage.eNS_URI);

		// Obtain or create and register package
		UpdatesPackageImpl theUpdatesPackage = (UpdatesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UpdatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new UpdatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		SpeechSynthesisPackage.eINSTANCE.eClass();
		GrammarPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Communicative_functionsPackage.eNS_URI) : Communicative_functionsPackage.eINSTANCE);
		GuiPackageImpl theGuiPackage = (GuiPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) instanceof GuiPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GuiPackage.eNS_URI) : GuiPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		EarconsPackageImpl theEarconsPackage = (EarconsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) instanceof EarconsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EarconsPackage.eNS_URI) : EarconsPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		GuiEventsPackageImpl theGuiEventsPackage = (GuiEventsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) instanceof GuiEventsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GuiEventsPackage.eNS_URI) : GuiEventsPackage.eINSTANCE);

		// Create package meta-data objects
		theUpdatesPackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theGuiPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();

		// Initialize created meta-data
		theUpdatesPackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theGuiPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpdatesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpdatesPackage.eNS_URI, theUpdatesPackage);
		return theUpdatesPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIElementUpdate() {
		return uiElementUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIElementUpdate_UpdateMap() {
		return (EReference) uiElementUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTextInputUpdate() {
		return textInputUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLabelUpdate() {
		return labelUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UpdatesFactory getUpdatesFactory() {
		return (UpdatesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		uiElementUpdateEClass = createEClass(UI_ELEMENT_UPDATE);
		createEReference(uiElementUpdateEClass, UI_ELEMENT_UPDATE__UPDATE_MAP);

		textInputUpdateEClass = createEClass(TEXT_INPUT_UPDATE);

		labelUpdateEClass = createEClass(LABEL_UPDATE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GuiPackage theGuiPackage = (GuiPackage) EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage) EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiElementUpdateEClass.getESuperTypes().add(theGuiPackage.getUpdateInfo());
		textInputUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());
		labelUpdateEClass.getESuperTypes().add(this.getUIElementUpdate());

		// Initialize classes and features; add operations and parameters
		initEClass(uiElementUpdateEClass, UIElementUpdate.class, "UIElementUpdate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIElementUpdate_UpdateMap(), theBasePackage.getStringToBStringMapEntry(), null, "updateMap", null, 0, -1, UIElementUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textInputUpdateEClass, TextInputUpdate.class, "TextInputUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelUpdateEClass, LabelUpdate.class, "LabelUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} // UpdatesPackageImpl
