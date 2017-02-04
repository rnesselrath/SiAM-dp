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

import de.dfki.iui.mmds.core.emf.datatypes.BString;

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent class for all input and output representations that are sent between SiAM and devices/services. All new interfaces must be dervived from this class and be integrated into its type hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDevice <em>Device</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceInstance <em>Service Instance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getUserAlias <em>User Alias</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IORepresentation extends BObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the internal SiAM-dp id of the device that is sender/receiver of the message. It is specified by the application developer or inferenced from the presentatin planner based on other attributes of the IORepresentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(BString)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_Device()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getDevice();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(BString value);

	/**
	 * Returns the value of the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the ServiceInstance that sends/receives the message. This slot is filled by the presentation planner an cannot be set by the application developer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Instance</em>' attribute.
	 * @see #setServiceInstance(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_ServiceInstance()
	 * @model
	 * @generated
	 */
	String getServiceInstance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceInstance <em>Service Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance</em>' attribute.
	 * @see #getServiceInstance()
	 * @generated
	 */
	void setServiceInstance(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Service that sends/receives the message. This slot is filled by the presentation planner an cannot be set by the application developer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact time when the interaction started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin Time</em>' attribute.
	 * @see #setBeginTime(Long)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_BeginTime()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.TimeStamp"
	 * @generated
	 */
	Long getBeginTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getBeginTime <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Time</em>' attribute.
	 * @see #getBeginTime()
	 * @generated
	 */
	void setBeginTime(Long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requested duration of this presentation. If the beginTime is also given, the end time can be computed from both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Long)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_Duration()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.TimeSpan"
	 * @generated
	 */
	Long getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Long value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of the message if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BString)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_Language()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getLanguage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(BString value);

	/**
	 * Returns the value of the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the user involved in the interaction act.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Alias</em>' attribute.
	 * @see #setUserAlias(BString)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getIORepresentation_UserAlias()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getUserAlias();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getUserAlias <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Alias</em>' attribute.
	 * @see #getUserAlias()
	 * @generated
	 */
	void setUserAlias(BString value);

} // IORepresentation
