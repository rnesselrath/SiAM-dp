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

import java.net.URL;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BByte;
import de.dfki.iui.mmds.core.emf.datatypes.BChar;
import de.dfki.iui.mmds.core.emf.datatypes.BDouble;
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BLong;
import de.dfki.iui.mmds.core.emf.datatypes.BShort;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init() {
		try {
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory(BasePackage.eNS_URI);
			if (theBaseFactory != null) {
				return theBaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasePackage.BOBJECT: return createBObject();
			case BasePackage.ENTITY: return createEntity();
			case BasePackage.KNOWLEDGE_BASE: return createKnowledgeBase();
			case BasePackage.KNOWLEDGE_BASE_ENTRY: return createKnowledgeBaseEntry();
			case BasePackage.SESSION: return createSession();
			case BasePackage.NUMBER_ENTITY: return createNumberEntity();
			case BasePackage.NOTHING: return createNothing();
			case BasePackage.NAMED_ENTITY: return createNamedEntity();
			case BasePackage.RESOURCE: return createResource();
			case BasePackage.ENTITY_RESOURCE: return createEntityResource();
			case BasePackage.LOCALIZATION_RESOURCE: return createLocalizationResource();
			case BasePackage.PERSON: return createPerson();
			case BasePackage.CYBER_PHYSICAL_ENVIRONMENT: return createCyberPhysicalEnvironment();
			case BasePackage.DIGITAL_RESOURCE: return createDigitalResource();
			case BasePackage.PHYSICAL_RESOURCE: return createPhysicalResource();
			case BasePackage.LOCATABLE_ENTITY: return createLocatableEntity();
			case BasePackage.SERVICE_RESOURCE: return createServiceResource();
			case BasePackage.STYLE_SHEET: return createStyleSheet();
			case BasePackage.MEDIA_RESOURCE: return createMediaResource();
			case BasePackage.PICTURE: return createPicture();
			case BasePackage.VIDEO: return createVideo();
			case BasePackage.DOCUMENT: return createDocument();
			case BasePackage.AUDIO: return createAudio();
			case BasePackage.EVENT: return createEvent();
			case BasePackage.LOCATION: return createLocation();
			case BasePackage.GEO_COORDINATE: return createGeoCoordinate();
			case BasePackage.CARTESIAN_COORDINATE2_D: return createCartesianCoordinate2D();
			case BasePackage.CARTESIAN_COORDINATE3_D: return createCartesianCoordinate3D();
			case BasePackage.POSTAL_ADDRESS: return createPostalAddress();
			case BasePackage.DIGITAL_LOCATION: return createDigitalLocation();
			case BasePackage.PHYSICAL_LOCATION: return createPhysicalLocation();
			case BasePackage.STRING_TO_BSTRING_MAP_ENTRY: return (EObject)createStringToBStringMapEntry();
			case BasePackage.DATE_TIME_DESCRIPTION: return createDateTimeDescription();
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
			case BasePackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case BasePackage.MONTH:
				return createMonthFromString(eDataType, initialValue);
			case BasePackage.DAY_OF_WEEK:
				return createDayOfWeekFromString(eDataType, initialValue);
			case BasePackage.URL:
				return createUrlFromString(eDataType, initialValue);
			case BasePackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case BasePackage.TIME_STAMP:
				return createTimeStampFromString(eDataType, initialValue);
			case BasePackage.TIME_SPAN:
				return createTimeSpanFromString(eDataType, initialValue);
			case BasePackage.BBOOLEAN:
				return createBBooleanFromString(eDataType, initialValue);
			case BasePackage.BBYTE:
				return createBByteFromString(eDataType, initialValue);
			case BasePackage.BCHAR:
				return createBCharFromString(eDataType, initialValue);
			case BasePackage.BDOUBLE:
				return createBDoubleFromString(eDataType, initialValue);
			case BasePackage.BFLOAT:
				return createBFloatFromString(eDataType, initialValue);
			case BasePackage.BINTEGER:
				return createBIntegerFromString(eDataType, initialValue);
			case BasePackage.BLONG:
				return createBLongFromString(eDataType, initialValue);
			case BasePackage.BSHORT:
				return createBShortFromString(eDataType, initialValue);
			case BasePackage.BSTRING:
				return createBStringFromString(eDataType, initialValue);
			case BasePackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case BasePackage.MONTH_OBJECT:
				return createMonthObjectFromString(eDataType, initialValue);
			case BasePackage.DAY_OF_WEEK_OBJECT:
				return createDayOfWeekObjectFromString(eDataType, initialValue);
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
			case BasePackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case BasePackage.MONTH:
				return convertMonthToString(eDataType, instanceValue);
			case BasePackage.DAY_OF_WEEK:
				return convertDayOfWeekToString(eDataType, instanceValue);
			case BasePackage.URL:
				return convertUrlToString(eDataType, instanceValue);
			case BasePackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case BasePackage.TIME_STAMP:
				return convertTimeStampToString(eDataType, instanceValue);
			case BasePackage.TIME_SPAN:
				return convertTimeSpanToString(eDataType, instanceValue);
			case BasePackage.BBOOLEAN:
				return convertBBooleanToString(eDataType, instanceValue);
			case BasePackage.BBYTE:
				return convertBByteToString(eDataType, instanceValue);
			case BasePackage.BCHAR:
				return convertBCharToString(eDataType, instanceValue);
			case BasePackage.BDOUBLE:
				return convertBDoubleToString(eDataType, instanceValue);
			case BasePackage.BFLOAT:
				return convertBFloatToString(eDataType, instanceValue);
			case BasePackage.BINTEGER:
				return convertBIntegerToString(eDataType, instanceValue);
			case BasePackage.BLONG:
				return convertBLongToString(eDataType, instanceValue);
			case BasePackage.BSHORT:
				return convertBShortToString(eDataType, instanceValue);
			case BasePackage.BSTRING:
				return convertBStringToString(eDataType, instanceValue);
			case BasePackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case BasePackage.MONTH_OBJECT:
				return convertMonthObjectToString(eDataType, instanceValue);
			case BasePackage.DAY_OF_WEEK_OBJECT:
				return convertDayOfWeekObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BObject createBObject() {
		BObjectImpl bObject = new BObjectImpl();
		return bObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBase createKnowledgeBase() {
		KnowledgeBaseImpl knowledgeBase = new KnowledgeBaseImpl();
		return knowledgeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBaseEntry createKnowledgeBaseEntry() {
		KnowledgeBaseEntryImpl knowledgeBaseEntry = new KnowledgeBaseEntryImpl();
		return knowledgeBaseEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberEntity createNumberEntity() {
		NumberEntityImpl numberEntity = new NumberEntityImpl();
		return numberEntity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nothing createNothing() {
		NothingImpl nothing = new NothingImpl();
		return nothing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedEntity createNamedEntity() {
		NamedEntityImpl namedEntity = new NamedEntityImpl();
		return namedEntity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalEnvironment createCyberPhysicalEnvironment() {
		CyberPhysicalEnvironmentImpl cyberPhysicalEnvironment = new CyberPhysicalEnvironmentImpl();
		return cyberPhysicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceResource createServiceResource() {
		ServiceResourceImpl serviceResource = new ServiceResourceImpl();
		return serviceResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaResource createMediaResource() {
		MediaResourceImpl mediaResource = new MediaResourceImpl();
		return mediaResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Picture createPicture() {
		PictureImpl picture = new PictureImpl();
		return picture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheet createStyleSheet() {
		StyleSheetImpl styleSheet = new StyleSheetImpl();
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoCoordinate createGeoCoordinate() {
		GeoCoordinateImpl geoCoordinate = new GeoCoordinateImpl();
		return geoCoordinate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCoordinate2D createCartesianCoordinate2D() {
		CartesianCoordinate2DImpl cartesianCoordinate2D = new CartesianCoordinate2DImpl();
		return cartesianCoordinate2D;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCoordinate3D createCartesianCoordinate3D() {
		CartesianCoordinate3DImpl cartesianCoordinate3D = new CartesianCoordinate3DImpl();
		return cartesianCoordinate3D;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress createPostalAddress() {
		PostalAddressImpl postalAddress = new PostalAddressImpl();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Location> LocatableEntity<T> createLocatableEntity() {
		LocatableEntityImpl<T> locatableEntity = new LocatableEntityImpl<T>();
		return locatableEntity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityResource createEntityResource() {
		EntityResourceImpl entityResource = new EntityResourceImpl();
		return entityResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizationResource createLocalizationResource() {
		LocalizationResourceImpl localizationResource = new LocalizationResourceImpl();
		return localizationResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalLocation createDigitalLocation() {
		DigitalLocationImpl digitalLocation = new DigitalLocationImpl();
		return digitalLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalLocation createPhysicalLocation() {
		PhysicalLocationImpl physicalLocation = new PhysicalLocationImpl();
		return physicalLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, BString> createStringToBStringMapEntry() {
		StringToBStringMapEntryImpl stringToBStringMapEntry = new StringToBStringMapEntryImpl();
		return stringToBStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeDescription createDateTimeDescription() {
		DateTimeDescriptionImpl dateTimeDescription = new DateTimeDescriptionImpl();
		return dateTimeDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		DayOfWeek result = DayOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonthFromString(EDataType eDataType, String initialValue) {
		Month result = Month.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalResource createDigitalResource() {
		DigitalResourceImpl digitalResource = new DigitalResourceImpl();
		return digitalResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalResource createPhysicalResource() {
		PhysicalResourceImpl physicalResource = new PhysicalResourceImpl();
		return physicalResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URL createUrlFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTimeStampFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeStampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTimeSpanFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeSpanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean createBBooleanFromString(EDataType eDataType, String initialValue) {
		return (BBoolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BByte createBByteFromString(EDataType eDataType, String initialValue) {
		return (BByte)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBByteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BChar createBCharFromString(EDataType eDataType, String initialValue) {
		return (BChar)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBCharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BDouble createBDoubleFromString(EDataType eDataType, String initialValue) {
		return (BDouble)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BFloat createBFloatFromString(EDataType eDataType, String initialValue) {
		return (BFloat)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger createBIntegerFromString(EDataType eDataType, String initialValue) {
		return (BInteger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BLong createBLongFromString(EDataType eDataType, String initialValue) {
		return (BLong)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BShort createBShortFromString(EDataType eDataType, String initialValue) {
		return (BShort)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBShortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BString createBStringFromString(EDataType eDataType, String initialValue) {
		return (BString)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public String convertBStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(BasePackage.Literals.UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(BasePackage.Literals.UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonthObjectFromString(EDataType eDataType, String initialValue) {
		return createMonthFromString(BasePackage.Literals.MONTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMonthToString(BasePackage.Literals.MONTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekObjectFromString(EDataType eDataType, String initialValue) {
		return createDayOfWeekFromString(BasePackage.Literals.DAY_OF_WEEK, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDayOfWeekToString(BasePackage.Literals.DAY_OF_WEEK, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePackage getBasePackage() {
		return (BasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage() {
		return BasePackage.eINSTANCE;
	}

} // BaseFactoryImpl
