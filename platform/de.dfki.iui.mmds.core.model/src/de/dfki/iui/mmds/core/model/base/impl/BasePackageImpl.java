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
package de.dfki.iui.mmds.core.model.base.impl;

import static de.dfki.iui.mmds.core.model.base.BasePackage.RESOURCE;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BByte;
import de.dfki.iui.mmds.core.emf.datatypes.BChar;
import de.dfki.iui.mmds.core.emf.datatypes.BDouble;
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BLong;
import de.dfki.iui.mmds.core.emf.datatypes.BShort;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl;
import de.dfki.iui.mmds.core.model.base.Audio;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D;
import de.dfki.iui.mmds.core.model.base.CartesianCoordinate3D;
import de.dfki.iui.mmds.core.model.base.CyberPhysicalEnvironment;
import de.dfki.iui.mmds.core.model.base.DateTimeDescription;
import de.dfki.iui.mmds.core.model.base.DayOfWeek;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.DigitalLocation;
import de.dfki.iui.mmds.core.model.base.DigitalResource;
import de.dfki.iui.mmds.core.model.base.Document;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.EntityResource;
import de.dfki.iui.mmds.core.model.base.Event;
import de.dfki.iui.mmds.core.model.base.GeoCoordinate;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry;
import de.dfki.iui.mmds.core.model.base.LocalizationResource;
import de.dfki.iui.mmds.core.model.base.LocatableEntity;
import de.dfki.iui.mmds.core.model.base.Location;
import de.dfki.iui.mmds.core.model.base.MediaResource;
import de.dfki.iui.mmds.core.model.base.Month;
import de.dfki.iui.mmds.core.model.base.NamedEntity;
import de.dfki.iui.mmds.core.model.base.Nothing;
import de.dfki.iui.mmds.core.model.base.NumberEntity;
import de.dfki.iui.mmds.core.model.base.Person;
import de.dfki.iui.mmds.core.model.base.PhysicalLocation;
import de.dfki.iui.mmds.core.model.base.PhysicalResource;
import de.dfki.iui.mmds.core.model.base.Picture;
import de.dfki.iui.mmds.core.model.base.PostalAddress;
import de.dfki.iui.mmds.core.model.base.Resource;
import de.dfki.iui.mmds.core.model.base.ServiceResource;
import de.dfki.iui.mmds.core.model.base.Session;
import de.dfki.iui.mmds.core.model.base.StyleSheet;
import de.dfki.iui.mmds.core.model.base.UnitType;
import de.dfki.iui.mmds.core.model.base.Video;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.impl.DialoguePackageImpl;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl;
import de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;
import de.dfki.iui.mmds.core.model.io.tangible.impl.TangiblePackageImpl;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.io_interfaces.impl.Io_interfacesPackageImpl;
import de.dfki.iui.mmds.core.model.json.JsonPackage;
import de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl;
import de.dfki.iui.mmds.core.model.pattern.PatternPackage;
import de.dfki.iui.mmds.core.model.pattern.impl.PatternPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.PrimitiveTasksPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.impl.PrimitiveTasksPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.InputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.input.impl.InputPackageImpl;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage;
import de.dfki.iui.mmds.core.model.primitiveTasks.output.impl.OutputPackageImpl;
import de.dfki.iui.mmds.core.model.project.ProjectPackage;
import de.dfki.iui.mmds.core.model.project.impl.ProjectPackageImpl;
import de.dfki.iui.mmds.core.model.references.ReferencesPackage;
import de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl;
import de.dfki.iui.mmds.core.model.task.TaskPackage;
import de.dfki.iui.mmds.core.model.task.impl.TaskPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBaseEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nothingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEntityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyberPhysicalEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSheetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoCoordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinate2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinate3DEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogParticipantEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalLocationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToBStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalResourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeStampEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeSpanEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bByteEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bCharEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bFloatEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bLongEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bShortEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayOfWeekObjectEDataType = null;

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
	 * @see de.dfki.iui.mmds.core.model.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link BasePackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Communicative_functionsPackageImpl theCommunicative_functionsPackage = (Communicative_functionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) instanceof Communicative_functionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Communicative_functionsPackage.eNS_URI) : Communicative_functionsPackage.eINSTANCE);
		DialoguePackageImpl theDialoguePackage = (DialoguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) instanceof DialoguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DialoguePackage.eNS_URI) : DialoguePackage.eINSTANCE);
		EarconsPackageImpl theEarconsPackage = (EarconsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) instanceof EarconsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EarconsPackage.eNS_URI) : EarconsPackage.eINSTANCE);
		Grammar_rulesPackageImpl theGrammar_rulesPackage = (Grammar_rulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) instanceof Grammar_rulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Grammar_rulesPackage.eNS_URI) : Grammar_rulesPackage.eINSTANCE);
		GuiEventsPackageImpl theGuiEventsPackage = (GuiEventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) instanceof GuiEventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiEventsPackage.eNS_URI) : GuiEventsPackage.eINSTANCE);
		GuiPackageImpl theGuiPackage = (GuiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) instanceof GuiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuiPackage.eNS_URI) : GuiPackage.eINSTANCE);
		Io_interfacesPackageImpl theIo_interfacesPackage = (Io_interfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) instanceof Io_interfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Io_interfacesPackage.eNS_URI) : Io_interfacesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		PrimitiveTasksPackageImpl thePrimitiveTasksPackage = (PrimitiveTasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) instanceof PrimitiveTasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTasksPackage.eNS_URI) : PrimitiveTasksPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) : OutputPackage.eINSTANCE);
		ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI) : ProjectPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		SpeechSynthesisPackageImpl theSpeechSynthesisPackage = (SpeechSynthesisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) instanceof SpeechSynthesisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpeechSynthesisPackage.eNS_URI) : SpeechSynthesisPackage.eINSTANCE);
		TangiblePackageImpl theTangiblePackage = (TangiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) instanceof TangiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TangiblePackage.eNS_URI) : TangiblePackage.eINSTANCE);
		JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI) : JsonPackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		BackchannelPackageImpl theBackchannelPackage = (BackchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) instanceof BackchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackchannelPackage.eNS_URI) : BackchannelPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theCommunicative_functionsPackage.createPackageContents();
		theDialoguePackage.createPackageContents();
		theEarconsPackage.createPackageContents();
		theGrammar_rulesPackage.createPackageContents();
		theGuiEventsPackage.createPackageContents();
		theGuiPackage.createPackageContents();
		theIo_interfacesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		thePrimitiveTasksPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theOutputPackage.createPackageContents();
		theProjectPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theSpeechSynthesisPackage.createPackageContents();
		theTangiblePackage.createPackageContents();
		theJsonPackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theBackchannelPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theCommunicative_functionsPackage.initializePackageContents();
		theDialoguePackage.initializePackageContents();
		theEarconsPackage.initializePackageContents();
		theGrammar_rulesPackage.initializePackageContents();
		theGuiEventsPackage.initializePackageContents();
		theGuiPackage.initializePackageContents();
		theIo_interfacesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		thePrimitiveTasksPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theOutputPackage.initializePackageContents();
		theProjectPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theSpeechSynthesisPackage.initializePackageContents();
		theTangiblePackage.initializePackageContents();
		theJsonPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theBackchannelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBObject() {
		return bObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBObject_Binding() {
		return (EAttribute)bObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_ENTITY_ID() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeBase() {
		return knowledgeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBase_Entries() {
		return (EReference)knowledgeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeBaseEntry() {
		return knowledgeBaseEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBaseEntry_Content() {
		return (EReference)knowledgeBaseEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledgeBaseEntry_Confidence() {
		return (EAttribute)knowledgeBaseEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledgeBaseEntry_Source() {
		return (EAttribute)knowledgeBaseEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_Participants() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSession_SessionID() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberEntity() {
		return numberEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberEntity_Number() {
		return (EAttribute)numberEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNothing() {
		return nothingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedEntity() {
		return namedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedEntity_Name() {
		return (EAttribute)namedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Id() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyberPhysicalEnvironment() {
		return cyberPhysicalEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceResource() {
		return serviceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediaResource() {
		return mediaResourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaResource_MimeType() {
		return (EAttribute)mediaResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPicture() {
		return pictureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSheet() {
		return styleSheetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Timestamp() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoCoordinate() {
		return geoCoordinateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoCoordinate_Lat() {
		return (EAttribute)geoCoordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoCoordinate_Long() {
		return (EAttribute)geoCoordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinate2D() {
		return cartesianCoordinate2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinate2D_X() {
		return (EAttribute)cartesianCoordinate2DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinate2D_Y() {
		return (EAttribute)cartesianCoordinate2DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinate3D() {
		return cartesianCoordinate3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinate3D_Z() {
		return (EAttribute)cartesianCoordinate3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalAddress() {
		return postalAddressEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocatableEntity() {
		return locatableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocatableEntity_Location() {
		return (EReference)locatableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityResource() {
		return entityResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityResource_Content() {
		return (EReference)entityResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityResource_AddToKnowledgeManager() {
		return (EAttribute)entityResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizationResource() {
		return localizationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizationResource_Language() {
		return (EAttribute)localizationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalizationResource_Entries() {
		return (EReference)localizationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogParticipant() {
		return dialogParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogParticipant_UserInterfaces() {
		return (EReference)dialogParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogParticipant_ParticipantId() {
		return (EAttribute)dialogParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalLocation() {
		return digitalLocationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigitalLocation_Url() {
		return (EAttribute)digitalLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalLocation() {
		return physicalLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToBStringMapEntry() {
		return stringToBStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToBStringMapEntry_Key() {
		return (EAttribute)stringToBStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToBStringMapEntry_Value() {
		return (EAttribute)stringToBStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeDescription() {
		return dateTimeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_UnitType() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Second() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Minute() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Hour() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Day() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_DayOfWeek() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_DayOfYear() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Month() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDescription_Year() {
		return (EAttribute)dateTimeDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayOfWeek() {
		return dayOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonth() {
		return monthEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalResource() {
		return digitalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalResource() {
		return physicalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrl() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeStamp() {
		return timeStampEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeSpan() {
		return timeSpanEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBBoolean() {
		return bBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBByte() {
		return bByteEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBChar() {
		return bCharEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBDouble() {
		return bDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBFloat() {
		return bFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBInteger() {
		return bIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBLong() {
		return bLongEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBShort() {
		return bShortEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBString() {
		return bStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitTypeObject() {
		return unitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthObject() {
		return monthObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayOfWeekObject() {
		return dayOfWeekObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		bObjectEClass = createEClass(BOBJECT);
		createEAttribute(bObjectEClass, BOBJECT__BINDING);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ENTITY_ID);

		knowledgeBaseEClass = createEClass(KNOWLEDGE_BASE);
		createEReference(knowledgeBaseEClass, KNOWLEDGE_BASE__ENTRIES);

		knowledgeBaseEntryEClass = createEClass(KNOWLEDGE_BASE_ENTRY);
		createEReference(knowledgeBaseEntryEClass, KNOWLEDGE_BASE_ENTRY__CONTENT);
		createEAttribute(knowledgeBaseEntryEClass, KNOWLEDGE_BASE_ENTRY__CONFIDENCE);
		createEAttribute(knowledgeBaseEntryEClass, KNOWLEDGE_BASE_ENTRY__SOURCE);

		sessionEClass = createEClass(SESSION);
		createEReference(sessionEClass, SESSION__PARTICIPANTS);
		createEAttribute(sessionEClass, SESSION__SESSION_ID);

		numberEntityEClass = createEClass(NUMBER_ENTITY);
		createEAttribute(numberEntityEClass, NUMBER_ENTITY__NUMBER);

		nothingEClass = createEClass(NOTHING);

		namedEntityEClass = createEClass(NAMED_ENTITY);
		createEAttribute(namedEntityEClass, NAMED_ENTITY__NAME);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__ID);

		entityResourceEClass = createEClass(ENTITY_RESOURCE);
		createEReference(entityResourceEClass, ENTITY_RESOURCE__CONTENT);
		createEAttribute(entityResourceEClass, ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER);

		localizationResourceEClass = createEClass(LOCALIZATION_RESOURCE);
		createEAttribute(localizationResourceEClass, LOCALIZATION_RESOURCE__LANGUAGE);
		createEReference(localizationResourceEClass, LOCALIZATION_RESOURCE__ENTRIES);

		dialogParticipantEClass = createEClass(DIALOG_PARTICIPANT);
		createEReference(dialogParticipantEClass, DIALOG_PARTICIPANT__USER_INTERFACES);
		createEAttribute(dialogParticipantEClass, DIALOG_PARTICIPANT__PARTICIPANT_ID);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);

		cyberPhysicalEnvironmentEClass = createEClass(CYBER_PHYSICAL_ENVIRONMENT);

		digitalResourceEClass = createEClass(DIGITAL_RESOURCE);

		physicalResourceEClass = createEClass(PHYSICAL_RESOURCE);

		locatableEntityEClass = createEClass(LOCATABLE_ENTITY);
		createEReference(locatableEntityEClass, LOCATABLE_ENTITY__LOCATION);

		serviceResourceEClass = createEClass(SERVICE_RESOURCE);

		styleSheetEClass = createEClass(STYLE_SHEET);

		mediaResourceEClass = createEClass(MEDIA_RESOURCE);
		createEAttribute(mediaResourceEClass, MEDIA_RESOURCE__MIME_TYPE);

		pictureEClass = createEClass(PICTURE);

		videoEClass = createEClass(VIDEO);

		documentEClass = createEClass(DOCUMENT);

		audioEClass = createEClass(AUDIO);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TIMESTAMP);

		locationEClass = createEClass(LOCATION);

		geoCoordinateEClass = createEClass(GEO_COORDINATE);
		createEAttribute(geoCoordinateEClass, GEO_COORDINATE__LAT);
		createEAttribute(geoCoordinateEClass, GEO_COORDINATE__LONG);

		cartesianCoordinate2DEClass = createEClass(CARTESIAN_COORDINATE2_D);
		createEAttribute(cartesianCoordinate2DEClass, CARTESIAN_COORDINATE2_D__X);
		createEAttribute(cartesianCoordinate2DEClass, CARTESIAN_COORDINATE2_D__Y);

		cartesianCoordinate3DEClass = createEClass(CARTESIAN_COORDINATE3_D);
		createEAttribute(cartesianCoordinate3DEClass, CARTESIAN_COORDINATE3_D__Z);

		postalAddressEClass = createEClass(POSTAL_ADDRESS);

		digitalLocationEClass = createEClass(DIGITAL_LOCATION);
		createEAttribute(digitalLocationEClass, DIGITAL_LOCATION__URL);

		physicalLocationEClass = createEClass(PHYSICAL_LOCATION);

		stringToBStringMapEntryEClass = createEClass(STRING_TO_BSTRING_MAP_ENTRY);
		createEAttribute(stringToBStringMapEntryEClass, STRING_TO_BSTRING_MAP_ENTRY__KEY);
		createEAttribute(stringToBStringMapEntryEClass, STRING_TO_BSTRING_MAP_ENTRY__VALUE);

		dateTimeDescriptionEClass = createEClass(DATE_TIME_DESCRIPTION);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__UNIT_TYPE);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__SECOND);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__MINUTE);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__HOUR);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__DAY);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__DAY_OF_WEEK);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__DAY_OF_YEAR);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__MONTH);
		createEAttribute(dateTimeDescriptionEClass, DATE_TIME_DESCRIPTION__YEAR);

		// Create enums
		unitTypeEEnum = createEEnum(UNIT_TYPE);
		monthEEnum = createEEnum(MONTH);
		dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);

		// Create data types
		urlEDataType = createEDataType(URL);
		dateEDataType = createEDataType(DATE);
		timeStampEDataType = createEDataType(TIME_STAMP);
		timeSpanEDataType = createEDataType(TIME_SPAN);
		bBooleanEDataType = createEDataType(BBOOLEAN);
		bByteEDataType = createEDataType(BBYTE);
		bCharEDataType = createEDataType(BCHAR);
		bDoubleEDataType = createEDataType(BDOUBLE);
		bFloatEDataType = createEDataType(BFLOAT);
		bIntegerEDataType = createEDataType(BINTEGER);
		bLongEDataType = createEDataType(BLONG);
		bShortEDataType = createEDataType(BSHORT);
		bStringEDataType = createEDataType(BSTRING);
		unitTypeObjectEDataType = createEDataType(UNIT_TYPE_OBJECT);
		monthObjectEDataType = createEDataType(MONTH_OBJECT);
		dayOfWeekObjectEDataType = createEDataType(DAY_OF_WEEK_OBJECT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

		// Create type parameters
		ETypeParameter locatableEntityEClass_T = addETypeParameter(locatableEntityEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getLocation());
		locatableEntityEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getBObject());
		sessionEClass.getESuperTypes().add(this.getEntity());
		numberEntityEClass.getESuperTypes().add(this.getEntity());
		nothingEClass.getESuperTypes().add(this.getEntity());
		namedEntityEClass.getESuperTypes().add(this.getEntity());
		entityResourceEClass.getESuperTypes().add(this.getResource());
		localizationResourceEClass.getESuperTypes().add(this.getResource());
		personEClass.getESuperTypes().add(this.getNamedEntity());
		personEClass.getESuperTypes().add(this.getDialogParticipant());
		cyberPhysicalEnvironmentEClass.getESuperTypes().add(this.getDialogParticipant());
		cyberPhysicalEnvironmentEClass.getESuperTypes().add(this.getEntity());
		g1 = createEGenericType(this.getResource());
		digitalResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocatableEntity());
		EGenericType g2 = createEGenericType(this.getDigitalLocation());
		g1.getETypeArguments().add(g2);
		digitalResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResource());
		physicalResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocatableEntity());
		g2 = createEGenericType(this.getPhysicalLocation());
		g1.getETypeArguments().add(g2);
		physicalResourceEClass.getEGenericSuperTypes().add(g1);
		locatableEntityEClass.getESuperTypes().add(this.getEntity());
		serviceResourceEClass.getESuperTypes().add(this.getDigitalResource());
		styleSheetEClass.getESuperTypes().add(this.getDigitalResource());
		mediaResourceEClass.getESuperTypes().add(this.getDigitalResource());
		pictureEClass.getESuperTypes().add(this.getMediaResource());
		videoEClass.getESuperTypes().add(this.getMediaResource());
		documentEClass.getESuperTypes().add(this.getMediaResource());
		audioEClass.getESuperTypes().add(this.getMediaResource());
		geoCoordinateEClass.getESuperTypes().add(this.getPhysicalLocation());
		cartesianCoordinate2DEClass.getESuperTypes().add(this.getPhysicalLocation());
		cartesianCoordinate3DEClass.getESuperTypes().add(this.getCartesianCoordinate2D());
		postalAddressEClass.getESuperTypes().add(this.getPhysicalLocation());
		digitalLocationEClass.getESuperTypes().add(this.getLocation());
		physicalLocationEClass.getESuperTypes().add(this.getLocation());
		dateTimeDescriptionEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(bObjectEClass, BObject.class, "BObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBObject_Binding(), ecorePackage.getEString(), "binding", null, 0, 1, BObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_ENTITY_ID(), ecorePackage.getEString(), "ENTITY_ID", "", 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeBaseEClass, KnowledgeBase.class, "KnowledgeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeBase_Entries(), this.getKnowledgeBaseEntry(), null, "entries", null, 0, -1, KnowledgeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeBaseEntryEClass, KnowledgeBaseEntry.class, "KnowledgeBaseEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeBaseEntry_Content(), this.getEntity(), null, "content", null, 1, 1, KnowledgeBaseEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledgeBaseEntry_Confidence(), ecorePackage.getEFloat(), "confidence", null, 0, 1, KnowledgeBaseEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledgeBaseEntry_Source(), ecorePackage.getEString(), "source", null, 0, 1, KnowledgeBaseEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSession_Participants(), this.getDialogParticipant(), null, "participants", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_SessionID(), this.getBString(), "sessionID", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEntityEClass, NumberEntity.class, "NumberEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberEntity_Number(), this.getBInteger(), "number", null, 0, 1, NumberEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedEntityEClass, NamedEntity.class, "NamedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedEntity_Name(), this.getBString(), "name", null, 0, 1, NamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Id(), this.getBString(), "id", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityResourceEClass, EntityResource.class, "EntityResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityResource_Content(), this.getEntity(), null, "content", null, 0, -1, EntityResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityResource_AddToKnowledgeManager(), ecorePackage.getEBoolean(), "addToKnowledgeManager", "false", 0, 1, EntityResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizationResourceEClass, LocalizationResource.class, "LocalizationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalizationResource_Language(), this.getBString(), "language", null, 1, 1, LocalizationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalizationResource_Entries(), this.getStringToBStringMapEntry(), null, "entries", null, 0, -1, LocalizationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogParticipantEClass, DialogParticipant.class, "DialogParticipant", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogParticipant_UserInterfaces(), theIoPackage.getService(), theIoPackage.getService_User(), "userInterfaces", null, 0, -1, DialogParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogParticipant_ParticipantId(), this.getBString(), "participantId", null, 0, 1, DialogParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), this.getBString(), "firstname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Lastname(), this.getBString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cyberPhysicalEnvironmentEClass, CyberPhysicalEnvironment.class, "CyberPhysicalEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalResourceEClass, DigitalResource.class, "DigitalResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalResourceEClass, PhysicalResource.class, "PhysicalResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locatableEntityEClass, LocatableEntity.class, "LocatableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(locatableEntityEClass_T);
		initEReference(getLocatableEntity_Location(), g1, null, "location", null, 0, 1, LocatableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourceEClass, ServiceResource.class, "ServiceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(styleSheetEClass, StyleSheet.class, "StyleSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediaResourceEClass, MediaResource.class, "MediaResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaResource_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, MediaResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pictureEClass, Picture.class, "Picture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Timestamp(), this.getTimeStamp(), "timestamp", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geoCoordinateEClass, GeoCoordinate.class, "GeoCoordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoCoordinate_Lat(), ecorePackage.getEDouble(), "lat", null, 0, 1, GeoCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoCoordinate_Long(), ecorePackage.getEDouble(), "long", null, 0, 1, GeoCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinate2DEClass, CartesianCoordinate2D.class, "CartesianCoordinate2D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianCoordinate2D_X(), ecorePackage.getEFloat(), "x", null, 1, 1, CartesianCoordinate2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinate2D_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, CartesianCoordinate2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinate3DEClass, CartesianCoordinate3D.class, "CartesianCoordinate3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianCoordinate3D_Z(), ecorePackage.getEFloat(), "z", null, 1, 1, CartesianCoordinate3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressEClass, PostalAddress.class, "PostalAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalLocationEClass, DigitalLocation.class, "DigitalLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalLocation_Url(), ecorePackage.getEString(), "url", null, 1, 1, DigitalLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalLocationEClass, PhysicalLocation.class, "PhysicalLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringToBStringMapEntryEClass, Map.Entry.class, "StringToBStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToBStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToBStringMapEntry_Value(), this.getBString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeDescriptionEClass, DateTimeDescription.class, "DateTimeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeDescription_UnitType(), this.getUnitTypeObject(), "unitType", null, 1, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Second(), this.getBInteger(), "second", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Minute(), this.getBInteger(), "minute", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Hour(), this.getBInteger(), "hour", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Day(), this.getBInteger(), "day", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_DayOfWeek(), this.getDayOfWeekObject(), "dayOfWeek", null, 0, 1, DateTimeDescription.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_DayOfYear(), this.getBInteger(), "dayOfYear", null, 0, 1, DateTimeDescription.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Month(), this.getMonthObject(), "month", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDescription_Year(), this.getBInteger(), "year", null, 0, 1, DateTimeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_SECOND);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_MINUTE);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_HOUR);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_DAY);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_WEEK);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_MONTH);
		addEEnumLiteral(unitTypeEEnum, UnitType.UNIT_YEAR);

		initEEnum(monthEEnum, Month.class, "Month");
		addEEnumLiteral(monthEEnum, Month.JANUARY);
		addEEnumLiteral(monthEEnum, Month.FEBRUARY);
		addEEnumLiteral(monthEEnum, Month.MARCH);
		addEEnumLiteral(monthEEnum, Month.APRIL);
		addEEnumLiteral(monthEEnum, Month.MAY);
		addEEnumLiteral(monthEEnum, Month.JUNE);
		addEEnumLiteral(monthEEnum, Month.JULY);
		addEEnumLiteral(monthEEnum, Month.AUGUST);
		addEEnumLiteral(monthEEnum, Month.SEPTEMBER);
		addEEnumLiteral(monthEEnum, Month.OCTOBER);
		addEEnumLiteral(monthEEnum, Month.NOVEMBER);
		addEEnumLiteral(monthEEnum, Month.DECEMBER);

		initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.MONDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.TUESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.WEDNESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.THURSDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.FRIDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SATURDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SUNDAY);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "Url", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeStampEDataType, Long.class, "TimeStamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeSpanEDataType, Long.class, "TimeSpan", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bBooleanEDataType, BBoolean.class, "BBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bByteEDataType, BByte.class, "BByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bCharEDataType, BChar.class, "BChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bDoubleEDataType, BDouble.class, "BDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bFloatEDataType, BFloat.class, "BFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bIntegerEDataType, BInteger.class, "BInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bLongEDataType, BLong.class, "BLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bShortEDataType, BShort.class, "BShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bStringEDataType, BString.class, "BString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitTypeObjectEDataType, UnitType.class, "UnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(monthObjectEDataType, Month.class, "MonthObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dayOfWeekObjectEDataType, DayOfWeek.class, "DayOfWeekObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
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
		  (unitTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "UnitType"
		   });	
		addAnnotation
		  (monthObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "Month"
		   });	
		addAnnotation
		  (dayOfWeekObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "DayOfWeek"
		   });
	}

} // BasePackageImpl
