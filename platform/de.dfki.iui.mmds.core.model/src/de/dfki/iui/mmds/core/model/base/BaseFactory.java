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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = de.dfki.iui.mmds.core.model.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BObject</em>'.
	 * @generated
	 */
	BObject createBObject();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Knowledge Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Base</em>'.
	 * @generated
	 */
	KnowledgeBase createKnowledgeBase();

	/**
	 * Returns a new object of class '<em>Knowledge Base Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Base Entry</em>'.
	 * @generated
	 */
	KnowledgeBaseEntry createKnowledgeBaseEntry();

	/**
	 * Returns a new object of class '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session</em>'.
	 * @generated
	 */
	Session createSession();

	/**
	 * Returns a new object of class '<em>Number Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Entity</em>'.
	 * @generated
	 */
	NumberEntity createNumberEntity();

	/**
	 * Returns a new object of class '<em>Nothing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nothing</em>'.
	 * @generated
	 */
	Nothing createNothing();

	/**
	 * Returns a new object of class '<em>Named Entity</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Entity</em>'.
	 * @generated
	 */
	NamedEntity createNamedEntity();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Cyber Physical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyber Physical Environment</em>'.
	 * @generated
	 */
	CyberPhysicalEnvironment createCyberPhysicalEnvironment();

	/**
	 * Returns a new object of class '<em>Digital Resource</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Digital Resource</em>'.
	 * @generated
	 */
	DigitalResource createDigitalResource();

	/**
	 * Returns a new object of class '<em>Physical Resource</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Physical Resource</em>'.
	 * @generated
	 */
	PhysicalResource createPhysicalResource();

	/**
	 * Returns a new object of class '<em>Locatable Entity</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Locatable Entity</em>'.
	 * @generated
	 */
	<T extends Location> LocatableEntity<T> createLocatableEntity();

	/**
	 * Returns a new object of class '<em>Entity Resource</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Resource</em>'.
	 * @generated
	 */
	EntityResource createEntityResource();

	/**
	 * Returns a new object of class '<em>Localization Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localization Resource</em>'.
	 * @generated
	 */
	LocalizationResource createLocalizationResource();

	/**
	 * Returns a new object of class '<em>Service Resource</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Service Resource</em>'.
	 * @generated
	 */
	ServiceResource createServiceResource();

	/**
	 * Returns a new object of class '<em>Media Resource</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Media Resource</em>'.
	 * @generated
	 */
	MediaResource createMediaResource();

	/**
	 * Returns a new object of class '<em>Picture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picture</em>'.
	 * @generated
	 */
	Picture createPicture();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Style Sheet</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Sheet</em>'.
	 * @generated
	 */
	StyleSheet createStyleSheet();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Geo Coordinate</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Geo Coordinate</em>'.
	 * @generated
	 */
	GeoCoordinate createGeoCoordinate();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinate2 D</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Cartesian Coordinate2 D</em>'.
	 * @generated
	 */
	CartesianCoordinate2D createCartesianCoordinate2D();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinate3 D</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Cartesian Coordinate3 D</em>'.
	 * @generated
	 */
	CartesianCoordinate3D createCartesianCoordinate3D();

	/**
	 * Returns a new object of class '<em>Postal Address</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Postal Address</em>'.
	 * @generated
	 */
	PostalAddress createPostalAddress();

	/**
	 * Returns a new object of class '<em>Digital Location</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Digital Location</em>'.
	 * @generated
	 */
	DigitalLocation createDigitalLocation();

	/**
	 * Returns a new object of class '<em>Physical Location</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Physical Location</em>'.
	 * @generated
	 */
	PhysicalLocation createPhysicalLocation();

	/**
	 * Returns a new object of class '<em>Date Time Description</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Date Time Description</em>'.
	 * @generated
	 */
	DateTimeDescription createDateTimeDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasePackage getBasePackage();

} // BaseFactory
