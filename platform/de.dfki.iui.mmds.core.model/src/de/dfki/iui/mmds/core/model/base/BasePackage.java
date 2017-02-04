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
package de.dfki.iui.mmds.core.model.base;

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
 * @see de.dfki.iui.mmds.core.model.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.BObjectImpl <em>BObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.BObjectImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBObject()
	 * @generated
	 */
	int BOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT__BINDING = 0;

	/**
	 * The number of structural features of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.EntityImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BINDING = BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_ID = BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseImpl <em>Knowledge Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getKnowledgeBase()
	 * @generated
	 */
	int KNOWLEDGE_BASE = 2;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Knowledge Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Knowledge Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseEntryImpl <em>Knowledge Base Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseEntryImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getKnowledgeBaseEntry()
	 * @generated
	 */
	int KNOWLEDGE_BASE_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_ENTRY__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_ENTRY__CONFIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_ENTRY__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Knowledge Base Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Knowledge Base Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.SessionImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__PARTICIPANTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESSION_ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.NumberEntityImpl <em>Number Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.NumberEntityImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNumberEntity()
	 * @generated
	 */
	int NUMBER_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENTITY__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENTITY__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENTITY__NUMBER = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.NothingImpl <em>Nothing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.NothingImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNothing()
	 * @generated
	 */
	int NOTHING = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The number of structural features of the '<em>Nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.NamedEntityImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.ResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl <em>Physical Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPhysicalResource()
	 * @generated
	 */
	int PHYSICAL_RESOURCE = 15;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.PersonImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 12;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.DigitalResourceImpl <em>Digital Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.DigitalResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDigitalResource()
	 * @generated
	 */
	int DIGITAL_RESOURCE = 14;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocatableEntityImpl <em>Locatable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.LocatableEntityImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocatableEntity()
	 * @generated
	 */
	int LOCATABLE_ENTITY = 16;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl <em>Entity Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEntityResource()
	 * @generated
	 */
	int ENTITY_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOURCE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOURCE__CONTENT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add To Knowledge Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocalizationResourceImpl <em>Localization Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.LocalizationResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocalizationResource()
	 * @generated
	 */
	int LOCALIZATION_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZATION_RESOURCE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZATION_RESOURCE__LANGUAGE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZATION_RESOURCE__ENTRIES = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Localization Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZATION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Localization Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZATION_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant <em>Dialog Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDialogParticipant()
	 * @generated
	 */
	int DIALOG_PARTICIPANT = 11;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PARTICIPANT__USER_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Participant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PARTICIPANT__PARTICIPANT_ID = 1;

	/**
	 * The number of structural features of the '<em>Dialog Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PARTICIPANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dialog Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BINDING = NAMED_ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ENTITY_ID = NAMED_ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USER_INTERFACES = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTICIPANT_ID = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl <em>Cyber Physical Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCyberPhysicalEnvironment()
	 * @generated
	 */
	int CYBER_PHYSICAL_ENVIRONMENT = 13;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT__USER_INTERFACES = DIALOG_PARTICIPANT__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Participant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT__PARTICIPANT_ID = DIALOG_PARTICIPANT__PARTICIPANT_ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT__BINDING = DIALOG_PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT__ENTITY_ID = DIALOG_PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cyber Physical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT_FEATURE_COUNT = DIALOG_PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cyber Physical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_ENVIRONMENT_OPERATION_COUNT = DIALOG_PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE__BINDING = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE__ENTITY_ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE__LOCATION = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digital Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digital Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__BINDING = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__ENTITY_ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__LOCATION = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Physical Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ENTITY__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ENTITY__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ENTITY__LOCATION = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Locatable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Locatable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.ServiceResourceImpl <em>Service Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.ServiceResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getServiceResource()
	 * @generated
	 */
	int SERVICE_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__ID = DIGITAL_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__BINDING = DIGITAL_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__ENTITY_ID = DIGITAL_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__LOCATION = DIGITAL_RESOURCE__LOCATION;

	/**
	 * The number of structural features of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FEATURE_COUNT = DIGITAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_OPERATION_COUNT = DIGITAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.MediaResourceImpl <em>Media Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.MediaResourceImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMediaResource()
	 * @generated
	 */
	int MEDIA_RESOURCE = 19;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.PictureImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 20;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.VideoImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 21;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.DocumentImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 22;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.AudioImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 23;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.StyleSheetImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__ID = DIGITAL_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__BINDING = DIGITAL_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__ENTITY_ID = DIGITAL_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__LOCATION = DIGITAL_RESOURCE__LOCATION;

	/**
	 * The number of structural features of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_FEATURE_COUNT = DIGITAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_OPERATION_COUNT = DIGITAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE__ID = DIGITAL_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE__BINDING = DIGITAL_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE__ENTITY_ID = DIGITAL_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE__LOCATION = DIGITAL_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE__MIME_TYPE = DIGITAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Media Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE_FEATURE_COUNT = DIGITAL_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Media Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_RESOURCE_OPERATION_COUNT = DIGITAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__ID = MEDIA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__BINDING = MEDIA_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__ENTITY_ID = MEDIA_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__LOCATION = MEDIA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__MIME_TYPE = MEDIA_RESOURCE__MIME_TYPE;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = MEDIA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = MEDIA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID = MEDIA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__BINDING = MEDIA_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ENTITY_ID = MEDIA_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LOCATION = MEDIA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__MIME_TYPE = MEDIA_RESOURCE__MIME_TYPE;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = MEDIA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = MEDIA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = MEDIA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BINDING = MEDIA_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ENTITY_ID = MEDIA_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LOCATION = MEDIA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MIME_TYPE = MEDIA_RESOURCE__MIME_TYPE;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = MEDIA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = MEDIA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ID = MEDIA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__BINDING = MEDIA_RESOURCE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ENTITY_ID = MEDIA_RESOURCE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LOCATION = MEDIA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__MIME_TYPE = MEDIA_RESOURCE__MIME_TYPE;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = MEDIA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = MEDIA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.EventImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 24;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.LocationImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 25;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalLocationImpl <em>Physical Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.PhysicalLocationImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPhysicalLocation()
	 * @generated
	 */
	int PHYSICAL_LOCATION = 31;

	/**
	 * The number of structural features of the '<em>Physical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.GeoCoordinateImpl <em>Geo Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.GeoCoordinateImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getGeoCoordinate()
	 * @generated
	 */
	int GEO_COORDINATE = 26;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_COORDINATE__LAT = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_COORDINATE__LONG = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geo Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_COORDINATE_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Geo Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_COORDINATE_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate2DImpl <em>Cartesian Coordinate2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate2DImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCartesianCoordinate2D()
	 * @generated
	 */
	int CARTESIAN_COORDINATE2_D = 27;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE2_D__X = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE2_D__Y = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinate2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE2_D_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cartesian Coordinate2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE2_D_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate3DImpl <em>Cartesian Coordinate3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate3DImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCartesianCoordinate3D()
	 * @generated
	 */
	int CARTESIAN_COORDINATE3_D = 28;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE3_D__X = CARTESIAN_COORDINATE2_D__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE3_D__Y = CARTESIAN_COORDINATE2_D__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE3_D__Z = CARTESIAN_COORDINATE2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinate3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE3_D_FEATURE_COUNT = CARTESIAN_COORDINATE2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cartesian Coordinate3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE3_D_OPERATION_COUNT = CARTESIAN_COORDINATE2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.PostalAddressImpl <em>Postal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.PostalAddressImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPostalAddress()
	 * @generated
	 */
	int POSTAL_ADDRESS = 29;

	/**
	 * The number of structural features of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.DigitalLocationImpl <em>Digital Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.DigitalLocationImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDigitalLocation()
	 * @generated
	 */
	int DIGITAL_LOCATION = 30;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LOCATION__URL = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Digital Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl <em>String To BString Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getStringToBStringMapEntry()
	 * @generated
	 */
	int STRING_TO_BSTRING_MAP_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BSTRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BSTRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To BString Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BSTRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To BString Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BSTRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl <em>Date Time Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDateTimeDescription()
	 * @generated
	 */
	int DATE_TIME_DESCRIPTION = 33;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__BINDING = ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__ENTITY_ID = ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__UNIT_TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__SECOND = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__MINUTE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__HOUR = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__DAY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__DAY_OF_WEEK = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Day Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__DAY_OF_YEAR = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__MONTH = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION__YEAR = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Date Time Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Date Time Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DESCRIPTION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 34;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 36;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.base.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.Month
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 35;

	/**
	 * The meta object id for the '<em>Url</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUrl()
	 * @generated
	 */
	int URL = 37;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 38;

	/**
	 * The meta object id for the '<em>Time Stamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 39;

	/**
	 * The meta object id for the '<em>Time Span</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getTimeSpan()
	 * @generated
	 */
	int TIME_SPAN = 40;

	/**
	 * The meta object id for the '<em>BBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BBoolean
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBBoolean()
	 * @generated
	 */
	int BBOOLEAN = 41;

	/**
	 * The meta object id for the '<em>BByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BByte
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBByte()
	 * @generated
	 */
	int BBYTE = 42;

	/**
	 * The meta object id for the '<em>BChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BChar
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBChar()
	 * @generated
	 */
	int BCHAR = 43;

	/**
	 * The meta object id for the '<em>BDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BDouble
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBDouble()
	 * @generated
	 */
	int BDOUBLE = 44;

	/**
	 * The meta object id for the '<em>BFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BFloat
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBFloat()
	 * @generated
	 */
	int BFLOAT = 45;

	/**
	 * The meta object id for the '<em>BInteger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BInteger
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBInteger()
	 * @generated
	 */
	int BINTEGER = 46;

	/**
	 * The meta object id for the '<em>BLong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BLong
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBLong()
	 * @generated
	 */
	int BLONG = 47;

	/**
	 * The meta object id for the '<em>BShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BShort
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBShort()
	 * @generated
	 */
	int BSHORT = 48;

	/**
	 * The meta object id for the '<em>BString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BString
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBString()
	 * @generated
	 */
	int BSTRING = 49;


	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Month Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.Month
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMonthObject()
	 * @generated
	 */
	int MONTH_OBJECT = 51;


	/**
	 * The meta object id for the '<em>Day Of Week Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
	 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDayOfWeekObject()
	 * @generated
	 */
	int DAY_OF_WEEK_OBJECT = 52;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BObject</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.BObject
	 * @generated
	 */
	EClass getBObject();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.BObject#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.BObject#getBinding()
	 * @see #getBObject()
	 * @generated
	 */
	EAttribute getBObject_Binding();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Entity#getENTITY_ID <em>ENTITY ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ENTITY ID</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Entity#getENTITY_ID()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ENTITY_ID();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBase <em>Knowledge Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBase
	 * @generated
	 */
	EClass getKnowledgeBase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBase#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBase#getEntries()
	 * @see #getKnowledgeBase()
	 * @generated
	 */
	EReference getKnowledgeBase_Entries();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry <em>Knowledge Base Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Base Entry</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry
	 * @generated
	 */
	EClass getKnowledgeBaseEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getContent()
	 * @see #getKnowledgeBaseEntry()
	 * @generated
	 */
	EReference getKnowledgeBaseEntry_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getConfidence()
	 * @see #getKnowledgeBaseEntry()
	 * @generated
	 */
	EAttribute getKnowledgeBaseEntry_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry#getSource()
	 * @see #getKnowledgeBaseEntry()
	 * @generated
	 */
	EAttribute getKnowledgeBaseEntry_Source();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.base.Session#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Session#getParticipants()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Participants();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Session#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Session#getSessionID()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_SessionID();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.NumberEntity <em>Number Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.NumberEntity
	 * @generated
	 */
	EClass getNumberEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.NumberEntity#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.NumberEntity#getNumber()
	 * @see #getNumberEntity()
	 * @generated
	 */
	EAttribute getNumberEntity_Number();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Nothing <em>Nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nothing</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Nothing
	 * @generated
	 */
	EClass getNothing();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Resource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Resource#getId()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.CyberPhysicalEnvironment <em>Cyber Physical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical Environment</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CyberPhysicalEnvironment
	 * @generated
	 */
	EClass getCyberPhysicalEnvironment();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.DigitalResource <em>Digital Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DigitalResource
	 * @generated
	 */
	EClass getDigitalResource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.PhysicalResource <em>Physical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.PhysicalResource
	 * @generated
	 */
	EClass getPhysicalResource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.LocatableEntity <em>Locatable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locatable Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.LocatableEntity
	 * @generated
	 */
	EClass getLocatableEntity();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.base.LocatableEntity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.LocatableEntity#getLocation()
	 * @see #getLocatableEntity()
	 * @generated
	 */
	EReference getLocatableEntity_Location();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.EntityResource <em>Entity Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.EntityResource
	 * @generated
	 */
	EClass getEntityResource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.base.EntityResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.EntityResource#getContent()
	 * @see #getEntityResource()
	 * @generated
	 */
	EReference getEntityResource_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.EntityResource#isAddToKnowledgeManager <em>Add To Knowledge Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add To Knowledge Manager</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.EntityResource#isAddToKnowledgeManager()
	 * @see #getEntityResource()
	 * @generated
	 */
	EAttribute getEntityResource_AddToKnowledgeManager();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.LocalizationResource <em>Localization Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localization Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.LocalizationResource
	 * @generated
	 */
	EClass getLocalizationResource();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.LocalizationResource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.LocalizationResource#getLanguage()
	 * @see #getLocalizationResource()
	 * @generated
	 */
	EAttribute getLocalizationResource_Language();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.base.LocalizationResource#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.LocalizationResource#getEntries()
	 * @see #getLocalizationResource()
	 * @generated
	 */
	EReference getLocalizationResource_Entries();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant <em>Dialog Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Participant</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant
	 * @generated
	 */
	EClass getDialogParticipant();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getUserInterfaces <em>User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Interfaces</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant#getUserInterfaces()
	 * @see #getDialogParticipant()
	 * @generated
	 */
	EReference getDialogParticipant_UserInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getParticipantId <em>Participant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participant Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant#getParticipantId()
	 * @see #getDialogParticipant()
	 * @generated
	 */
	EAttribute getDialogParticipant_ParticipantId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.ServiceResource <em>Service Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.ServiceResource
	 * @generated
	 */
	EClass getServiceResource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.MediaResource <em>Media Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.MediaResource
	 * @generated
	 */
	EClass getMediaResource();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.MediaResource#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.MediaResource#getMimeType()
	 * @see #getMediaResource()
	 * @generated
	 */
	EAttribute getMediaResource_MimeType();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.StyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Sheet</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.StyleSheet
	 * @generated
	 */
	EClass getStyleSheet();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.Event#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Event#getTimestamp()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.GeoCoordinate <em>Geo Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Coordinate</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.GeoCoordinate
	 * @generated
	 */
	EClass getGeoCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.GeoCoordinate#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.GeoCoordinate#getLat()
	 * @see #getGeoCoordinate()
	 * @generated
	 */
	EAttribute getGeoCoordinate_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.GeoCoordinate#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.GeoCoordinate#getLong()
	 * @see #getGeoCoordinate()
	 * @generated
	 */
	EAttribute getGeoCoordinate_Long();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D <em>Cartesian Coordinate2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinate2 D</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D
	 * @generated
	 */
	EClass getCartesianCoordinate2D();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D#getX()
	 * @see #getCartesianCoordinate2D()
	 * @generated
	 */
	EAttribute getCartesianCoordinate2D_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CartesianCoordinate2D#getY()
	 * @see #getCartesianCoordinate2D()
	 * @generated
	 */
	EAttribute getCartesianCoordinate2D_Y();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.CartesianCoordinate3D <em>Cartesian Coordinate3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinate3 D</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CartesianCoordinate3D
	 * @generated
	 */
	EClass getCartesianCoordinate3D();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.CartesianCoordinate3D#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.CartesianCoordinate3D#getZ()
	 * @see #getCartesianCoordinate3D()
	 * @generated
	 */
	EAttribute getCartesianCoordinate3D_Z();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.PostalAddress
	 * @generated
	 */
	EClass getPostalAddress();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.DigitalLocation <em>Digital Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DigitalLocation
	 * @generated
	 */
	EClass getDigitalLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DigitalLocation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DigitalLocation#getUrl()
	 * @see #getDigitalLocation()
	 * @generated
	 */
	EAttribute getDigitalLocation_Url();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.PhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.PhysicalLocation
	 * @generated
	 */
	EClass getPhysicalLocation();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To BString Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To BString Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueUnique="false" valueDataType="de.dfki.iui.mmds.core.model.base.BString" valueRequired="true"
	 * @generated
	 */
	EClass getStringToBStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToBStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToBStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription <em>Date Time Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription
	 * @generated
	 */
	EClass getDateTimeDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getUnitType()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_UnitType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getSecond()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Second();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMinute()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Minute();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getHour()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Hour();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDay()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Day();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfWeek()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_DayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfYear <em>Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Year</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getDayOfYear()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_DayOfYear();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getMonth()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Month();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.base.DateTimeDescription#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DateTimeDescription#getYear()
	 * @see #getDateTimeDescription()
	 * @generated
	 */
	EAttribute getDateTimeDescription_Year();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.base.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.base.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.base.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Month
	 * @generated
	 */
	EEnum getMonth();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getUrl();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Stamp</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getTimeStamp();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Span</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getTimeSpan();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BBoolean <em>BBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BBoolean</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BBoolean
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BBoolean"
	 * @generated
	 */
	EDataType getBBoolean();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BByte <em>BByte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BByte</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BByte
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BByte"
	 * @generated
	 */
	EDataType getBByte();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BChar <em>BChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BChar</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BChar
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BChar"
	 * @generated
	 */
	EDataType getBChar();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BDouble <em>BDouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BDouble</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BDouble
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BDouble"
	 * @generated
	 */
	EDataType getBDouble();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BFloat <em>BFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BFloat</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BFloat
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BFloat"
	 * @generated
	 */
	EDataType getBFloat();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BInteger <em>BInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BInteger</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BInteger
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BInteger"
	 * @generated
	 */
	EDataType getBInteger();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BLong <em>BLong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BLong</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BLong
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BLong"
	 * @generated
	 */
	EDataType getBLong();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BShort <em>BShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BShort</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BShort
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BShort"
	 * @generated
	 */
	EDataType getBShort();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.emf.datatypes.BString <em>BString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BString</em>'.
	 * @see de.dfki.iui.mmds.core.emf.datatypes.BString
	 * @model instanceClass="de.dfki.iui.mmds.core.emf.datatypes.BString"
	 * @generated
	 */
	EDataType getBString();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.base.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.UnitType
	 * @model instanceClass="de.dfki.iui.mmds.core.model.base.UnitType"
	 *        extendedMetaData="baseType='UnitType'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.base.Month <em>Month Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.Month
	 * @model instanceClass="de.dfki.iui.mmds.core.model.base.Month"
	 *        extendedMetaData="baseType='Month'"
	 * @generated
	 */
	EDataType getMonthObject();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.base.DayOfWeek <em>Day Of Week Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Of Week Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
	 * @model instanceClass="de.dfki.iui.mmds.core.model.base.DayOfWeek"
	 *        extendedMetaData="baseType='DayOfWeek'"
	 * @generated
	 */
	EDataType getDayOfWeekObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.BObjectImpl <em>BObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.BObjectImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBObject()
		 * @generated
		 */
		EClass BOBJECT = eINSTANCE.getBObject();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOBJECT__BINDING = eINSTANCE.getBObject_Binding();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.EntityImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>ENTITY ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENTITY_ID = eINSTANCE.getEntity_ENTITY_ID();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseImpl <em>Knowledge Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getKnowledgeBase()
		 * @generated
		 */
		EClass KNOWLEDGE_BASE = eINSTANCE.getKnowledgeBase();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_BASE__ENTRIES = eINSTANCE.getKnowledgeBase_Entries();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseEntryImpl <em>Knowledge Base Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.KnowledgeBaseEntryImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getKnowledgeBaseEntry()
		 * @generated
		 */
		EClass KNOWLEDGE_BASE_ENTRY = eINSTANCE.getKnowledgeBaseEntry();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_BASE_ENTRY__CONTENT = eINSTANCE.getKnowledgeBaseEntry_Content();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_BASE_ENTRY__CONFIDENCE = eINSTANCE.getKnowledgeBaseEntry_Confidence();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_BASE_ENTRY__SOURCE = eINSTANCE.getKnowledgeBaseEntry_Source();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.SessionImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__PARTICIPANTS = eINSTANCE.getSession_Participants();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__SESSION_ID = eINSTANCE.getSession_SessionID();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.NumberEntityImpl <em>Number Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.NumberEntityImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNumberEntity()
		 * @generated
		 */
		EClass NUMBER_ENTITY = eINSTANCE.getNumberEntity();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ENTITY__NUMBER = eINSTANCE.getNumberEntity_Number();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.NothingImpl <em>Nothing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.NothingImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNothing()
		 * @generated
		 */
		EClass NOTHING = eINSTANCE.getNothing();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.NamedEntityImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.ResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ID = eINSTANCE.getResource_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.PersonImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl <em>Cyber Physical Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.CyberPhysicalEnvironmentImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCyberPhysicalEnvironment()
		 * @generated
		 */
		EClass CYBER_PHYSICAL_ENVIRONMENT = eINSTANCE.getCyberPhysicalEnvironment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.DigitalResourceImpl <em>Digital Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.DigitalResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDigitalResource()
		 * @generated
		 */
		EClass DIGITAL_RESOURCE = eINSTANCE.getDigitalResource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl <em>Physical Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.PhysicalResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPhysicalResource()
		 * @generated
		 */
		EClass PHYSICAL_RESOURCE = eINSTANCE.getPhysicalResource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocatableEntityImpl <em>Locatable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.LocatableEntityImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocatableEntity()
		 * @generated
		 */
		EClass LOCATABLE_ENTITY = eINSTANCE.getLocatableEntity();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATABLE_ENTITY__LOCATION = eINSTANCE.getLocatableEntity_Location();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl <em>Entity Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEntityResource()
		 * @generated
		 */
		EClass ENTITY_RESOURCE = eINSTANCE.getEntityResource();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RESOURCE__CONTENT = eINSTANCE.getEntityResource_Content();

		/**
		 * The meta object literal for the '<em><b>Add To Knowledge Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER = eINSTANCE.getEntityResource_AddToKnowledgeManager();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocalizationResourceImpl <em>Localization Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.LocalizationResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocalizationResource()
		 * @generated
		 */
		EClass LOCALIZATION_RESOURCE = eINSTANCE.getLocalizationResource();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZATION_RESOURCE__LANGUAGE = eINSTANCE.getLocalizationResource_Language();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZATION_RESOURCE__ENTRIES = eINSTANCE.getLocalizationResource_Entries();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant <em>Dialog Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDialogParticipant()
		 * @generated
		 */
		EClass DIALOG_PARTICIPANT = eINSTANCE.getDialogParticipant();

		/**
		 * The meta object literal for the '<em><b>User Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_PARTICIPANT__USER_INTERFACES = eINSTANCE.getDialogParticipant_UserInterfaces();

		/**
		 * The meta object literal for the '<em><b>Participant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_PARTICIPANT__PARTICIPANT_ID = eINSTANCE.getDialogParticipant_ParticipantId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.ServiceResourceImpl <em>Service Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.ServiceResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getServiceResource()
		 * @generated
		 */
		EClass SERVICE_RESOURCE = eINSTANCE.getServiceResource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.MediaResourceImpl <em>Media Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.MediaResourceImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMediaResource()
		 * @generated
		 */
		EClass MEDIA_RESOURCE = eINSTANCE.getMediaResource();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_RESOURCE__MIME_TYPE = eINSTANCE.getMediaResource_MimeType();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.PictureImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.VideoImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.DocumentImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.AudioImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.StyleSheetImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getStyleSheet()
		 * @generated
		 */
		EClass STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.EventImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.LocationImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.GeoCoordinateImpl <em>Geo Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.GeoCoordinateImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getGeoCoordinate()
		 * @generated
		 */
		EClass GEO_COORDINATE = eINSTANCE.getGeoCoordinate();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_COORDINATE__LAT = eINSTANCE.getGeoCoordinate_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_COORDINATE__LONG = eINSTANCE.getGeoCoordinate_Long();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate2DImpl <em>Cartesian Coordinate2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate2DImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCartesianCoordinate2D()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATE2_D = eINSTANCE.getCartesianCoordinate2D();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE2_D__X = eINSTANCE.getCartesianCoordinate2D_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE2_D__Y = eINSTANCE.getCartesianCoordinate2D_Y();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate3DImpl <em>Cartesian Coordinate3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.CartesianCoordinate3DImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getCartesianCoordinate3D()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATE3_D = eINSTANCE.getCartesianCoordinate3D();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE3_D__Z = eINSTANCE.getCartesianCoordinate3D_Z();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.PostalAddressImpl <em>Postal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.PostalAddressImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPostalAddress()
		 * @generated
		 */
		EClass POSTAL_ADDRESS = eINSTANCE.getPostalAddress();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.DigitalLocationImpl <em>Digital Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.DigitalLocationImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDigitalLocation()
		 * @generated
		 */
		EClass DIGITAL_LOCATION = eINSTANCE.getDigitalLocation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_LOCATION__URL = eINSTANCE.getDigitalLocation_Url();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.PhysicalLocationImpl <em>Physical Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.PhysicalLocationImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getPhysicalLocation()
		 * @generated
		 */
		EClass PHYSICAL_LOCATION = eINSTANCE.getPhysicalLocation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl <em>String To BString Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.StringToBStringMapEntryImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getStringToBStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_BSTRING_MAP_ENTRY = eINSTANCE.getStringToBStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BSTRING_MAP_ENTRY__KEY = eINSTANCE.getStringToBStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BSTRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToBStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl <em>Date Time Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.impl.DateTimeDescriptionImpl
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDateTimeDescription()
		 * @generated
		 */
		EClass DATE_TIME_DESCRIPTION = eINSTANCE.getDateTimeDescription();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__UNIT_TYPE = eINSTANCE.getDateTimeDescription_UnitType();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__SECOND = eINSTANCE.getDateTimeDescription_Second();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__MINUTE = eINSTANCE.getDateTimeDescription_Minute();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__HOUR = eINSTANCE.getDateTimeDescription_Hour();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__DAY = eINSTANCE.getDateTimeDescription_Day();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__DAY_OF_WEEK = eINSTANCE.getDateTimeDescription_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Day Of Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__DAY_OF_YEAR = eINSTANCE.getDateTimeDescription_DayOfYear();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__MONTH = eINSTANCE.getDateTimeDescription_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DESCRIPTION__YEAR = eINSTANCE.getDateTimeDescription_Year();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.UnitType
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.base.Month <em>Month</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.Month
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMonth()
		 * @generated
		 */
		EEnum MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '<em>Url</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUrl()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Time Stamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getTimeStamp()
		 * @generated
		 */
		EDataType TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '<em>Time Span</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getTimeSpan()
		 * @generated
		 */
		EDataType TIME_SPAN = eINSTANCE.getTimeSpan();

		/**
		 * The meta object literal for the '<em>BBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BBoolean
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBBoolean()
		 * @generated
		 */
		EDataType BBOOLEAN = eINSTANCE.getBBoolean();

		/**
		 * The meta object literal for the '<em>BByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BByte
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBByte()
		 * @generated
		 */
		EDataType BBYTE = eINSTANCE.getBByte();

		/**
		 * The meta object literal for the '<em>BChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BChar
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBChar()
		 * @generated
		 */
		EDataType BCHAR = eINSTANCE.getBChar();

		/**
		 * The meta object literal for the '<em>BDouble</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BDouble
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBDouble()
		 * @generated
		 */
		EDataType BDOUBLE = eINSTANCE.getBDouble();

		/**
		 * The meta object literal for the '<em>BFloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BFloat
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBFloat()
		 * @generated
		 */
		EDataType BFLOAT = eINSTANCE.getBFloat();

		/**
		 * The meta object literal for the '<em>BInteger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BInteger
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBInteger()
		 * @generated
		 */
		EDataType BINTEGER = eINSTANCE.getBInteger();

		/**
		 * The meta object literal for the '<em>BLong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BLong
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBLong()
		 * @generated
		 */
		EDataType BLONG = eINSTANCE.getBLong();

		/**
		 * The meta object literal for the '<em>BShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BShort
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBShort()
		 * @generated
		 */
		EDataType BSHORT = eINSTANCE.getBShort();

		/**
		 * The meta object literal for the '<em>BString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.emf.datatypes.BString
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getBString()
		 * @generated
		 */
		EDataType BSTRING = eINSTANCE.getBString();

		/**
		 * The meta object literal for the '<em>Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.UnitType
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getUnitTypeObject()
		 * @generated
		 */
		EDataType UNIT_TYPE_OBJECT = eINSTANCE.getUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Month Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.Month
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getMonthObject()
		 * @generated
		 */
		EDataType MONTH_OBJECT = eINSTANCE.getMonthObject();

		/**
		 * The meta object literal for the '<em>Day Of Week Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.base.DayOfWeek
		 * @see de.dfki.iui.mmds.core.model.base.impl.BasePackageImpl#getDayOfWeekObject()
		 * @generated
		 */
		EDataType DAY_OF_WEEK_OBJECT = eINSTANCE.getDayOfWeekObject();

	}

} //BasePackage
