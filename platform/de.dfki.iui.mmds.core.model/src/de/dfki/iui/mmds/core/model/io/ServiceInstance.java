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
package de.dfki.iui.mmds.core.model.io;

import de.dfki.iui.mmds.core.model.base.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A service instance defines and describes one ore more services that are accessbile by one communciation connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getCommunicationinfo <em>Communicationinfo</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServices <em>Services</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getUsedHardware <em>Used Hardware</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServiceInstanceName <em>Service Instance Name</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance()
 * @model
 * @generated
 */
public interface ServiceInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the service instance specified by the developer. This value has no further use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Communicationinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicationinfo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about how the service instance can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communicationinfo</em>' containment reference.
	 * @see #setCommunicationinfo(CommunicationInfo)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_Communicationinfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CommunicationInfo getCommunicationinfo();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getCommunicationinfo <em>Communicationinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicationinfo</em>' containment reference.
	 * @see #getCommunicationinfo()
	 * @generated
	 */
	void setCommunicationinfo(CommunicationInfo value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.Service}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.mmds.core.model.io.Service#getServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The services available via the ServiceInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_Services()
	 * @see de.dfki.iui.mmds.core.model.io.Service#getServiceInstance
	 * @model opposite="serviceInstance" containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device entity in the environment on which the service is running or to which it is assinged to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_Device()
	 * @model
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Used Hardware</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.Hardware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Hardware</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware of the device that is actually used by the provided services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Hardware</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_UsedHardware()
	 * @model
	 * @generated
	 */
	EList<Hardware> getUsedHardware();

	/**
	 * Returns the value of the '<em><b>Service Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identifier for the serviceInstance that can be used for a direction connection between registered internal siam device and service instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Instance Name</em>' attribute.
	 * @see #setServiceInstanceName(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getServiceInstance_ServiceInstanceName()
	 * @model
	 * @generated
	 */
	String getServiceInstanceName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServiceInstanceName <em>Service Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Name</em>' attribute.
	 * @see #getServiceInstanceName()
	 * @generated
	 */
	void setServiceInstanceName(String value);

} // ServiceInstance
