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
package de.dfki.iui.mmds.core.model.base.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.base.BasePackage
 * @generated
 */
public class BaseSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public BaseSwitch() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasePackage.BOBJECT: {
				BObject bObject = (BObject)theEObject;
				T1 result = caseBObject(bObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T1 result = caseEntity(entity);
				if (result == null) result = caseBObject(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.KNOWLEDGE_BASE: {
				KnowledgeBase knowledgeBase = (KnowledgeBase)theEObject;
				T1 result = caseKnowledgeBase(knowledgeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.KNOWLEDGE_BASE_ENTRY: {
				KnowledgeBaseEntry knowledgeBaseEntry = (KnowledgeBaseEntry)theEObject;
				T1 result = caseKnowledgeBaseEntry(knowledgeBaseEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.SESSION: {
				Session session = (Session)theEObject;
				T1 result = caseSession(session);
				if (result == null) result = caseEntity(session);
				if (result == null) result = caseBObject(session);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.NUMBER_ENTITY: {
				NumberEntity numberEntity = (NumberEntity)theEObject;
				T1 result = caseNumberEntity(numberEntity);
				if (result == null) result = caseEntity(numberEntity);
				if (result == null) result = caseBObject(numberEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.NOTHING: {
				Nothing nothing = (Nothing)theEObject;
				T1 result = caseNothing(nothing);
				if (result == null) result = caseEntity(nothing);
				if (result == null) result = caseBObject(nothing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.NAMED_ENTITY: {
				NamedEntity namedEntity = (NamedEntity)theEObject;
				T1 result = caseNamedEntity(namedEntity);
				if (result == null) result = caseEntity(namedEntity);
				if (result == null) result = caseBObject(namedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ENTITY_RESOURCE: {
				EntityResource entityResource = (EntityResource)theEObject;
				T1 result = caseEntityResource(entityResource);
				if (result == null) result = caseResource(entityResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.LOCALIZATION_RESOURCE: {
				LocalizationResource localizationResource = (LocalizationResource)theEObject;
				T1 result = caseLocalizationResource(localizationResource);
				if (result == null) result = caseResource(localizationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DIALOG_PARTICIPANT: {
				DialogParticipant dialogParticipant = (DialogParticipant)theEObject;
				T1 result = caseDialogParticipant(dialogParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.PERSON: {
				Person person = (Person)theEObject;
				T1 result = casePerson(person);
				if (result == null) result = caseNamedEntity(person);
				if (result == null) result = caseDialogParticipant(person);
				if (result == null) result = caseEntity(person);
				if (result == null) result = caseBObject(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT: {
				CyberPhysicalEnvironment cyberPhysicalEnvironment = (CyberPhysicalEnvironment)theEObject;
				T1 result = caseCyberPhysicalEnvironment(cyberPhysicalEnvironment);
				if (result == null) result = caseDialogParticipant(cyberPhysicalEnvironment);
				if (result == null) result = caseEntity(cyberPhysicalEnvironment);
				if (result == null) result = caseBObject(cyberPhysicalEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DIGITAL_RESOURCE: {
				DigitalResource digitalResource = (DigitalResource)theEObject;
				T1 result = caseDigitalResource(digitalResource);
				if (result == null) result = caseResource(digitalResource);
				if (result == null) result = caseLocatableEntity(digitalResource);
				if (result == null) result = caseEntity(digitalResource);
				if (result == null) result = caseBObject(digitalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.PHYSICAL_RESOURCE: {
				PhysicalResource physicalResource = (PhysicalResource)theEObject;
				T1 result = casePhysicalResource(physicalResource);
				if (result == null) result = caseResource(physicalResource);
				if (result == null) result = caseLocatableEntity(physicalResource);
				if (result == null) result = caseEntity(physicalResource);
				if (result == null) result = caseBObject(physicalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.LOCATABLE_ENTITY: {
				LocatableEntity<?> locatableEntity = (LocatableEntity<?>)theEObject;
				T1 result = caseLocatableEntity(locatableEntity);
				if (result == null) result = caseEntity(locatableEntity);
				if (result == null) result = caseBObject(locatableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.SERVICE_RESOURCE: {
				ServiceResource serviceResource = (ServiceResource)theEObject;
				T1 result = caseServiceResource(serviceResource);
				if (result == null) result = caseDigitalResource(serviceResource);
				if (result == null) result = caseResource(serviceResource);
				if (result == null) result = caseLocatableEntity(serviceResource);
				if (result == null) result = caseEntity(serviceResource);
				if (result == null) result = caseBObject(serviceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.STYLE_SHEET: {
				StyleSheet styleSheet = (StyleSheet)theEObject;
				T1 result = caseStyleSheet(styleSheet);
				if (result == null) result = caseDigitalResource(styleSheet);
				if (result == null) result = caseResource(styleSheet);
				if (result == null) result = caseLocatableEntity(styleSheet);
				if (result == null) result = caseEntity(styleSheet);
				if (result == null) result = caseBObject(styleSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.MEDIA_RESOURCE: {
				MediaResource mediaResource = (MediaResource)theEObject;
				T1 result = caseMediaResource(mediaResource);
				if (result == null) result = caseDigitalResource(mediaResource);
				if (result == null) result = caseResource(mediaResource);
				if (result == null) result = caseLocatableEntity(mediaResource);
				if (result == null) result = caseEntity(mediaResource);
				if (result == null) result = caseBObject(mediaResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.PICTURE: {
				Picture picture = (Picture)theEObject;
				T1 result = casePicture(picture);
				if (result == null) result = caseMediaResource(picture);
				if (result == null) result = caseDigitalResource(picture);
				if (result == null) result = caseResource(picture);
				if (result == null) result = caseLocatableEntity(picture);
				if (result == null) result = caseEntity(picture);
				if (result == null) result = caseBObject(picture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.VIDEO: {
				Video video = (Video)theEObject;
				T1 result = caseVideo(video);
				if (result == null) result = caseMediaResource(video);
				if (result == null) result = caseDigitalResource(video);
				if (result == null) result = caseResource(video);
				if (result == null) result = caseLocatableEntity(video);
				if (result == null) result = caseEntity(video);
				if (result == null) result = caseBObject(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T1 result = caseDocument(document);
				if (result == null) result = caseMediaResource(document);
				if (result == null) result = caseDigitalResource(document);
				if (result == null) result = caseResource(document);
				if (result == null) result = caseLocatableEntity(document);
				if (result == null) result = caseEntity(document);
				if (result == null) result = caseBObject(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.AUDIO: {
				Audio audio = (Audio)theEObject;
				T1 result = caseAudio(audio);
				if (result == null) result = caseMediaResource(audio);
				if (result == null) result = caseDigitalResource(audio);
				if (result == null) result = caseResource(audio);
				if (result == null) result = caseLocatableEntity(audio);
				if (result == null) result = caseEntity(audio);
				if (result == null) result = caseBObject(audio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.EVENT: {
				Event event = (Event)theEObject;
				T1 result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.LOCATION: {
				Location location = (Location)theEObject;
				T1 result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.GEO_COORDINATE: {
				GeoCoordinate geoCoordinate = (GeoCoordinate)theEObject;
				T1 result = caseGeoCoordinate(geoCoordinate);
				if (result == null) result = casePhysicalLocation(geoCoordinate);
				if (result == null) result = caseLocation(geoCoordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.CARTESIAN_COORDINATE2_D: {
				CartesianCoordinate2D cartesianCoordinate2D = (CartesianCoordinate2D)theEObject;
				T1 result = caseCartesianCoordinate2D(cartesianCoordinate2D);
				if (result == null) result = casePhysicalLocation(cartesianCoordinate2D);
				if (result == null) result = caseLocation(cartesianCoordinate2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.CARTESIAN_COORDINATE3_D: {
				CartesianCoordinate3D cartesianCoordinate3D = (CartesianCoordinate3D)theEObject;
				T1 result = caseCartesianCoordinate3D(cartesianCoordinate3D);
				if (result == null) result = caseCartesianCoordinate2D(cartesianCoordinate3D);
				if (result == null) result = casePhysicalLocation(cartesianCoordinate3D);
				if (result == null) result = caseLocation(cartesianCoordinate3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.POSTAL_ADDRESS: {
				PostalAddress postalAddress = (PostalAddress)theEObject;
				T1 result = casePostalAddress(postalAddress);
				if (result == null) result = casePhysicalLocation(postalAddress);
				if (result == null) result = caseLocation(postalAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DIGITAL_LOCATION: {
				DigitalLocation digitalLocation = (DigitalLocation)theEObject;
				T1 result = caseDigitalLocation(digitalLocation);
				if (result == null) result = caseLocation(digitalLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.PHYSICAL_LOCATION: {
				PhysicalLocation physicalLocation = (PhysicalLocation)theEObject;
				T1 result = casePhysicalLocation(physicalLocation);
				if (result == null) result = caseLocation(physicalLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.STRING_TO_BSTRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, BString> stringToBStringMapEntry = (Map.Entry<String, BString>)theEObject;
				T1 result = caseStringToBStringMapEntry(stringToBStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DATE_TIME_DESCRIPTION: {
				DateTimeDescription dateTimeDescription = (DateTimeDescription)theEObject;
				T1 result = caseDateTimeDescription(dateTimeDescription);
				if (result == null) result = caseEntity(dateTimeDescription);
				if (result == null) result = caseBObject(dateTimeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKnowledgeBase(KnowledgeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Base Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Base Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKnowledgeBaseEntry(KnowledgeBaseEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSession(Session object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberEntity(NumberEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nothing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nothing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNothing(Nothing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cyber Physical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cyber Physical Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCyberPhysicalEnvironment(CyberPhysicalEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Resource</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseServiceResource(ServiceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Resource</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMediaResource(MediaResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePicture(Picture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStyleSheet(StyleSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Coordinate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoCoordinate(GeoCoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinate2 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinate2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinate2D(CartesianCoordinate2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinate3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinate3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinate3D(CartesianCoordinate3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePostalAddress(PostalAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locatable Entity</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locatable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Location> T1 caseLocatableEntity(LocatableEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityResource(EntityResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localization Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localization Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalizationResource(LocalizationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDialogParticipant(DialogParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Location</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDigitalLocation(DigitalLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Location</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePhysicalLocation(PhysicalLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To BString Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To BString Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringToBStringMapEntry(Map.Entry<String, BString> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDateTimeDescription(DateTimeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Resource</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDigitalResource(DigitalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Resource</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePhysicalResource(PhysicalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} // BaseSwitch
