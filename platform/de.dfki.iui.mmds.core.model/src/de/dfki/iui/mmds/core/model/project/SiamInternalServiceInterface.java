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
package de.dfki.iui.mmds.core.model.project;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import de.dfki.iui.mmds.core.model.base.Person;

import de.dfki.iui.mmds.core.model.io.OutputMessage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Siam Internal Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the declarative description of an interface that is supported by the dialogue application.
 * The siamId defines the identifier that is used by device attributes of instances of IORepresentation.
 * If the interface should directly be connected to a service instance, the id of the service instance can be specified in 'serviceInstanceId'.
 * If the service instance contains more than one services, the name of the addressed service is define in 'serviceName', otherwise the first available service is chosen.
 * 
 * If serviceInstanceId and serviceName are not defined, the presentation planner tries to find out a matching service based on the other give attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getSiamId <em>Siam Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceInstanceId <em>Service Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getModality <em>Modality</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getInitMessages <em>Init Messages</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface()
 * @model
 * @generated
 */
public interface SiamInternalServiceInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Siam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Siam Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The siamId defines the identifier that is inernally used in siam by the attribute 'device'  in instances of IORepresentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Siam Id</em>' attribute.
	 * @see #setSiamId(BString)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_SiamId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString" required="true"
	 * @generated
	 */
	BString getSiamId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getSiamId <em>Siam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siam Id</em>' attribute.
	 * @see #getSiamId()
	 * @generated
	 */
	void setSiamId(BString value);

	/**
	 * Returns the value of the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interface should directly be connected to a service instance, the id of the service instance can be specified in 'serviceInstanceId'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Instance Id</em>' attribute.
	 * @see #setServiceInstanceId(BString)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_ServiceInstanceId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getServiceInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceInstanceId <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Id</em>' attribute.
	 * @see #getServiceInstanceId()
	 * @generated
	 */
	void setServiceInstanceId(BString value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the service instance contains more than one services, the name of the addressed service is defined in 'serviceName', otherwise the first available service is chosen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(BString)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_ServiceName()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getServiceName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(BString value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see #setModality(BString)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_Modality()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getModality();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(BString value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Person)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_Participant()
	 * @model
	 * @generated
	 */
	Person getParticipant();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Person value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' reference.
	 * @see #setServiceType(EClass)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_ServiceType()
	 * @model
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface#getServiceType <em>Service Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' reference.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(EClass value);

	/**
	 * Returns the value of the '<em><b>Init Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.OutputMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Messages</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalServiceInterface_InitMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputMessage> getInitMessages();

} // SiamInternalServiceInterface
