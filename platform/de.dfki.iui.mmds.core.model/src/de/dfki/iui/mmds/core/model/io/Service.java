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

import org.eclipse.emf.common.util.EList;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Upper class for a service that can be accessed via a service instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.Service#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.Service#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.Service#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Service extends Entity {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> Name of the service. This value should be unique for a ServiceInstance. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getService_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.Service#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Instance</em>' container reference.
	 * @see #setServiceInstance(ServiceInstance)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getService_ServiceInstance()
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	ServiceInstance getServiceInstance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.Service#getServiceInstance <em>Service Instance</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance</em>' container reference.
	 * @see #getServiceInstance()
	 * @generated
	 */
	void setServiceInstance(ServiceInstance value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.DialogParticipant}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.mmds.core.model.base.DialogParticipant#getUserInterfaces <em>User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getService_User()
	 * @see de.dfki.iui.mmds.core.model.base.DialogParticipant#getUserInterfaces
	 * @model opposite="userInterfaces"
	 * @generated
	 */
	EList<DialogParticipant> getUser();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated NOT
	 */
	String getUniqueId();

} // Service
