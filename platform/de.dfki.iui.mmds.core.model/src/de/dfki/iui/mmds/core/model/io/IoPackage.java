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

import de.dfki.iui.mmds.core.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.IoFactory
 * @model kind="package"
 *        annotation="http://de.dfki.iui/ReferencedBy gui='../../../de.dfki.iui.mmds.core.model/model/io/gui.ecore'"
 * @generated
 */
public interface IoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "io";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "io";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getServiceInstance()
	 * @generated
	 */
	int SERVICE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__ENTITY_ID = BasePackage.ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__DESCRIPTION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communicationinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__COMMUNICATIONINFO = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__SERVICES = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__DEVICE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Hardware</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__USED_HARDWARE = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__SERVICE_INSTANCE_NAME = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.Service <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.Service
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENTITY_ID = BasePackage.ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_NAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_INSTANCE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USER = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Unique Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_UNIQUE_ID = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl <em>Compound Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCompoundService()
	 * @generated
	 */
	int COMPOUND_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__BINDING = SERVICE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__ENTITY_ID = SERVICE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__SERVICE_NAME = SERVICE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__SERVICE_INSTANCE = SERVICE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__USER = SERVICE__USER;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE__SERVICES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE___GET_UNIQUE_ID = SERVICE___GET_UNIQUE_ID;

	/**
	 * The number of operations of the '<em>Compound Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SimpleServiceImpl <em>Simple Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SimpleServiceImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSimpleService()
	 * @generated
	 */
	int SIMPLE_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__BINDING = SERVICE__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__ENTITY_ID = SERVICE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__SERVICE_NAME = SERVICE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__SERVICE_INSTANCE = SERVICE__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__USER = SERVICE__USER;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__SERVICE_TYPE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modalities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__MODALITIES = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE___GET_UNIQUE_ID = SERVICE___GET_UNIQUE_ID;

	/**
	 * The number of operations of the '<em>Simple Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.CommunicationInfo <em>Communication Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.CommunicationInfo
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCommunicationInfo()
	 * @generated
	 */
	int COMMUNICATION_INFO = 4;

	/**
	 * The number of structural features of the '<em>Communication Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INFO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Communication Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.TCPServerImpl <em>TCP Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.TCPServerImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getTCPServer()
	 * @generated
	 */
	int TCP_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SERVER__HOST = COMMUNICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SERVER__PORT = COMMUNICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCP Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SERVER_FEATURE_COUNT = COMMUNICATION_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCP Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SERVER_OPERATION_COUNT = COMMUNICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl <em>TECS Direct Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getTECSDirectService()
	 * @generated
	 */
	int TECS_DIRECT_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE__TYPE = COMMUNICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE__DATA1 = COMMUNICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE__DATA2 = COMMUNICATION_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>UR Is</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE__UR_IS = COMMUNICATION_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TECS Direct Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE_FEATURE_COUNT = COMMUNICATION_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TECS Direct Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECS_DIRECT_SERVICE_OPERATION_COUNT = COMMUNICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.HtmlServletImpl <em>Html Servlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.HtmlServletImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHtmlServlet()
	 * @generated
	 */
	int HTML_SERVLET = 7;

	/**
	 * The feature id for the '<em><b>Fragment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_SERVLET__FRAGMENT_NAME = COMMUNICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Html Servlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_SERVLET_FEATURE_COUNT = COMMUNICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Html Servlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_SERVLET_OPERATION_COUNT = COMMUNICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SipConnectionImpl <em>Sip Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SipConnectionImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSipConnection()
	 * @generated
	 */
	int SIP_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Call Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIP_CONNECTION__CALL_ID = COMMUNICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sip Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIP_CONNECTION_FEATURE_COUNT = COMMUNICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sip Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIP_CONNECTION_OPERATION_COUNT = COMMUNICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.OSGIBundleImpl <em>OSGI Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.OSGIBundleImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOSGIBundle()
	 * @generated
	 */
	int OSGI_BUNDLE = 9;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_BUNDLE__BUNDLE_NAME = COMMUNICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OSGI Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_BUNDLE_FEATURE_COUNT = COMMUNICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OSGI Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_BUNDLE_OPERATION_COUNT = COMMUNICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.DeviceImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BINDING = BasePackage.NAMED_ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>ENTITY ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ENTITY_ID = BasePackage.NAMED_ENTITY__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_TYPE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HARDWARE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.HardwareImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ID = 0;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.IOEventImpl <em>IO Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.IOEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getIOEvent()
	 * @generated
	 */
	int IO_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EVENT__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EVENT__MESSAGE = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EVENT_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IO Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EVENT_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.Message <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.Message
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIMESTAMP = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SESSION = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.InputMessage <em>Input Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.InputMessage
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputMessage()
	 * @generated
	 */
	int INPUT_MESSAGE = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE__DESCRIPTION = MESSAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE__TIMESTAMP = MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE__SESSION = MESSAGE__SESSION;

	/**
	 * The number of structural features of the '<em>Input Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.OutputMessage <em>Output Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.OutputMessage
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputMessage()
	 * @generated
	 */
	int OUTPUT_MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE__DESCRIPTION = MESSAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE__TIMESTAMP = MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE__SESSION = MESSAGE__SESSION;

	/**
	 * The number of structural features of the '<em>Output Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.CustomMessageImpl <em>Custom Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.CustomMessageImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCustomMessage()
	 * @generated
	 */
	int CUSTOM_MESSAGE = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__DESCRIPTION = MESSAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__TIMESTAMP = MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__SESSION = MESSAGE__SESSION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE__CONTENT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct <em>Communicative Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCommunicativeAct()
	 * @generated
	 */
	int COMMUNICATIVE_ACT = 17;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__INITIATOR = 0;

	/**
	 * The feature id for the '<em><b>Addressee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__ADDRESSEE = 1;

	/**
	 * The feature id for the '<em><b>Passed Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__PASSED_FADE = 2;

	/**
	 * The number of structural features of the '<em>Communicative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Communicative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.ControlMessage <em>Control Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.ControlMessage
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getControlMessage()
	 * @generated
	 */
	int CONTROL_MESSAGE = 18;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MESSAGE__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MESSAGE__SERVICE_INSTANCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MESSAGE__SERVICE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Control Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl <em>Update Device Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getUpdateDeviceMode()
	 * @generated
	 */
	int UPDATE_DEVICE_MODE = 19;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__DEVICE = CONTROL_MESSAGE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__SERVICE_INSTANCE_ID = CONTROL_MESSAGE__SERVICE_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__SERVICE_NAME = CONTROL_MESSAGE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__BINDING = CONTROL_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__DESCRIPTION = CONTROL_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__ID = CONTROL_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__TIMESTAMP = CONTROL_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__SESSION = CONTROL_MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Device Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE__DEVICE_MODE = CONTROL_MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Update Device Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE_FEATURE_COUNT = CONTROL_MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Update Device Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DEVICE_MODE_OPERATION_COUNT = CONTROL_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.DeviceStateChangedImpl <em>Device State Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.DeviceStateChangedImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceStateChanged()
	 * @generated
	 */
	int DEVICE_STATE_CHANGED = 20;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__DEVICE = CONTROL_MESSAGE__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__SERVICE_INSTANCE_ID = CONTROL_MESSAGE__SERVICE_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__SERVICE_NAME = CONTROL_MESSAGE__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__BINDING = CONTROL_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__DESCRIPTION = CONTROL_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__ID = CONTROL_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__TIMESTAMP = CONTROL_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__SESSION = CONTROL_MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED__DEVICE_STATE = CONTROL_MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Device State Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED_FEATURE_COUNT = CONTROL_MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Device State Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_CHANGED_OPERATION_COUNT = CONTROL_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl <em>Input Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.InputActImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputAct()
	 * @generated
	 */
	int INPUT_ACT = 21;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__INITIATOR = COMMUNICATIVE_ACT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Addressee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__ADDRESSEE = COMMUNICATIVE_ACT__ADDRESSEE;

	/**
	 * The feature id for the '<em><b>Passed Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__PASSED_FADE = COMMUNICATIVE_ACT__PASSED_FADE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__BINDING = COMMUNICATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__DESCRIPTION = COMMUNICATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__ID = COMMUNICATIVE_ACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__TIMESTAMP = COMMUNICATIVE_ACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__SESSION = COMMUNICATIVE_ACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__REPRESENTATION = COMMUNICATIVE_ACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT__HYPOTHESES = COMMUNICATIVE_ACT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Input Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT_FEATURE_COUNT = COMMUNICATIVE_ACT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Input Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACT_OPERATION_COUNT = COMMUNICATIVE_ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.OutputActImpl <em>Output Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.OutputActImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputAct()
	 * @generated
	 */
	int OUTPUT_ACT = 22;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__INITIATOR = COMMUNICATIVE_ACT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Addressee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__ADDRESSEE = COMMUNICATIVE_ACT__ADDRESSEE;

	/**
	 * The feature id for the '<em><b>Passed Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__PASSED_FADE = COMMUNICATIVE_ACT__PASSED_FADE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__BINDING = COMMUNICATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__DESCRIPTION = COMMUNICATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__ID = COMMUNICATIVE_ACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__TIMESTAMP = COMMUNICATIVE_ACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__SESSION = COMMUNICATIVE_ACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__COMMUNICATIVE_FUNCTION = COMMUNICATIVE_ACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT__PRESENTATION = COMMUNICATIVE_ACT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Output Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT_FEATURE_COUNT = COMMUNICATIVE_ACT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Output Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ACT_OPERATION_COUNT = COMMUNICATIVE_ACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation <em>IO Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getIORepresentation()
	 * @generated
	 */
	int IO_REPRESENTATION = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__DEVICE = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__SERVICE_INSTANCE = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__SERVICE_NAME = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__BEGIN_TIME = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__DURATION = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__LANGUAGE = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION__USER_ALIAS = BasePackage.BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>IO Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>IO Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_REPRESENTATION_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.InputRepresentation <em>Input Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.InputRepresentation
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputRepresentation()
	 * @generated
	 */
	int INPUT_REPRESENTATION = 24;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__BINDING = IO_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__DEVICE = IO_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__SERVICE_INSTANCE = IO_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__SERVICE_NAME = IO_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__BEGIN_TIME = IO_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__DURATION = IO_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__LANGUAGE = IO_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__USER_ALIAS = IO_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_FEATURE_COUNT = IO_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_OPERATION_COUNT = IO_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.OutputRepresentation <em>Output Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.OutputRepresentation
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputRepresentation()
	 * @generated
	 */
	int OUTPUT_REPRESENTATION = 25;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__BINDING = IO_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__DEVICE = IO_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__SERVICE_INSTANCE = IO_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__SERVICE_NAME = IO_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__BEGIN_TIME = IO_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__DURATION = IO_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__LANGUAGE = IO_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__USER_ALIAS = IO_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_FEATURE_COUNT = IO_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_OPERATION_COUNT = IO_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl <em>Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHypothesis()
	 * @generated
	 */
	int HYPOTHESIS = 26;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__CONFIDENCE = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__COMMUNICATIVE_FUNCTION = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl <em>Speech Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechHypothesis()
	 * @generated
	 */
	int SPEECH_HYPOTHESIS = 27;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__BINDING = HYPOTHESIS__BINDING;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__CONFIDENCE = HYPOTHESIS__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__COMMUNICATIVE_FUNCTION = HYPOTHESIS__COMMUNICATIVE_FUNCTION;

	/**
	 * The feature id for the '<em><b>Utterance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__UTTERANCE = HYPOTHESIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__TOKENS = HYPOTHESIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS__GRAMMAR = HYPOTHESIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Speech Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS_FEATURE_COUNT = HYPOTHESIS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Speech Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_HYPOTHESIS_OPERATION_COUNT = HYPOTHESIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.GestureHypothesisImpl <em>Gesture Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.GestureHypothesisImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getGestureHypothesis()
	 * @generated
	 */
	int GESTURE_HYPOTHESIS = 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS__BINDING = HYPOTHESIS__BINDING;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS__CONFIDENCE = HYPOTHESIS__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS__COMMUNICATIVE_FUNCTION = HYPOTHESIS__COMMUNICATIVE_FUNCTION;

	/**
	 * The feature id for the '<em><b>Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS__GESTURE = HYPOTHESIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS__PARAMETER = HYPOTHESIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gesture Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS_FEATURE_COUNT = HYPOTHESIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gesture Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_HYPOTHESIS_OPERATION_COUNT = HYPOTHESIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.PointingHypothesisImpl <em>Pointing Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.PointingHypothesisImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPointingHypothesis()
	 * @generated
	 */
	int POINTING_HYPOTHESIS = 29;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_HYPOTHESIS__BINDING = HYPOTHESIS__BINDING;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_HYPOTHESIS__CONFIDENCE = HYPOTHESIS__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_HYPOTHESIS__COMMUNICATIVE_FUNCTION = HYPOTHESIS__COMMUNICATIVE_FUNCTION;

	/**
	 * The number of structural features of the '<em>Pointing Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_HYPOTHESIS_FEATURE_COUNT = HYPOTHESIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pointing Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_HYPOTHESIS_OPERATION_COUNT = HYPOTHESIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.CustomFormatImpl <em>Custom Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.CustomFormatImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCustomFormat()
	 * @generated
	 */
	int CUSTOM_FORMAT = 30;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__BINDING = INPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__DEVICE = INPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__SERVICE_INSTANCE = INPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__SERVICE_NAME = INPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__BEGIN_TIME = INPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__DURATION = INPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__LANGUAGE = INPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__USER_ALIAS = INPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__CONTENT = INPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__URI = INPUT_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT__TYPE = INPUT_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT_FEATURE_COUNT = INPUT_REPRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Custom Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORMAT_OPERATION_COUNT = INPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.DeviceState <em>Device State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.DeviceState
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceState()
	 * @generated
	 */
	int DEVICE_STATE = 31;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The number of structural features of the '<em>Device State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.DeviceMode <em>Device Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.DeviceMode
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceMode()
	 * @generated
	 */
	int DEVICE_MODE = 32;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODE__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The number of structural features of the '<em>Device Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODE_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MODE_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.CancelPresentationImpl <em>Cancel Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.CancelPresentationImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCancelPresentation()
	 * @generated
	 */
	int CANCEL_PRESENTATION = 33;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_PRESENTATION__BINDING = DEVICE_MODE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_PRESENTATION__ID = DEVICE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cancel Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_PRESENTATION_FEATURE_COUNT = DEVICE_MODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cancel Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_PRESENTATION_OPERATION_COUNT = DEVICE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.PresentationStateImpl <em>Presentation State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.PresentationStateImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPresentationState()
	 * @generated
	 */
	int PRESENTATION_STATE = 34;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_STATE__BINDING = DEVICE_STATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_STATE__ID = DEVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_STATE__STATE = DEVICE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Presentation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_STATE_FEATURE_COUNT = DEVICE_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Presentation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_STATE_OPERATION_COUNT = DEVICE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl <em>Update Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getUpdateGrammar()
	 * @generated
	 */
	int UPDATE_GRAMMAR = 35;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR__BINDING = DEVICE_MODE__BINDING;

	/**
	 * The feature id for the '<em><b>Grammar ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR__GRAMMAR_ID = DEVICE_MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR__GRAMMAR = DEVICE_MODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR__ACTIVE = DEVICE_MODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Update Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR_FEATURE_COUNT = DEVICE_MODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Update Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GRAMMAR_OPERATION_COUNT = DEVICE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerStateImpl <em>Speech Recognizer State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerStateImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerState()
	 * @generated
	 */
	int SPEECH_RECOGNIZER_STATE = 36;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_STATE__BINDING = DEVICE_STATE__BINDING;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_STATE__STATE = DEVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speech Recognizer State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_STATE_FEATURE_COUNT = DEVICE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speech Recognizer State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_STATE_OPERATION_COUNT = DEVICE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerModeImpl <em>Speech Recognizer Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerModeImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerMode()
	 * @generated
	 */
	int SPEECH_RECOGNIZER_MODE = 37;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_MODE__BINDING = DEVICE_MODE__BINDING;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_MODE__MODE = DEVICE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speech Recognizer Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_MODE_FEATURE_COUNT = DEVICE_MODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speech Recognizer Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECOGNIZER_MODE_OPERATION_COUNT = DEVICE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl <em>Speech Synthesis State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechSynthesisState()
	 * @generated
	 */
	int SPEECH_SYNTHESIS_STATE = 38;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE__BINDING = DEVICE_STATE__BINDING;

	/**
	 * The feature id for the '<em><b>Phoneme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE__PHONEME = DEVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Viseme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE__VISEME = DEVICE_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Char Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE__CHAR_INDEX = DEVICE_STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bookmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE__BOOKMARK = DEVICE_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Speech Synthesis State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE_FEATURE_COUNT = DEVICE_STATE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Speech Synthesis State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SYNTHESIS_STATE_OPERATION_COUNT = DEVICE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.impl.ActiveGesturesImpl <em>Active Gestures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.impl.ActiveGesturesImpl
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getActiveGestures()
	 * @generated
	 */
	int ACTIVE_GESTURES = 39;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_GESTURES__BINDING = DEVICE_MODE__BINDING;

	/**
	 * The feature id for the '<em><b>Gestures</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_GESTURES__GESTURES = DEVICE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Gestures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_GESTURES_FEATURE_COUNT = DEVICE_MODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Gestures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_GESTURES_OPERATION_COUNT = DEVICE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum <em>Speech Recognizer State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerStateEnum()
	 * @generated
	 */
	int SPEECH_RECOGNIZER_STATE_ENUM = 41;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum <em>Speech Recognizer Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerModeEnum()
	 * @generated
	 */
	int SPEECH_RECOGNIZER_MODE_ENUM = 42;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.PresentationStateEnum <em>Presentation State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.PresentationStateEnum
	 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPresentationStateEnum()
	 * @generated
	 */
	int PRESENTATION_STATE_ENUM = 40;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance
	 * @generated
	 */
	EClass getServiceInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getDescription()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EAttribute getServiceInstance_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getCommunicationinfo <em>Communicationinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communicationinfo</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getCommunicationinfo()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_Communicationinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getServices()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_Services();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getDevice()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_Device();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getUsedHardware <em>Used Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Hardware</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getUsedHardware()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_UsedHardware();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.ServiceInstance#getServiceInstanceName <em>Service Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ServiceInstance#getServiceInstanceName()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EAttribute getServiceInstance_ServiceInstanceName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Service#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Service#getServiceName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceName();

	/**
	 * Returns the meta object for the container reference '{@link de.dfki.iui.mmds.core.model.io.Service#getServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Instance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Service#getServiceInstance()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.Service#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Service#getUser()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_User();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.io.Service#getUniqueId() <em>Get Unique Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Id</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.io.Service#getUniqueId()
	 * @generated
	 */
	EOperation getService__GetUniqueId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CompoundService <em>Compound Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Service</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CompoundService
	 * @generated
	 */
	EClass getCompoundService();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.CompoundService#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CompoundService#getServices()
	 * @see #getCompoundService()
	 * @generated
	 */
	EReference getCompoundService_Services();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SimpleService <em>Simple Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Service</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SimpleService
	 * @generated
	 */
	EClass getSimpleService();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.SimpleService#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SimpleService#getServiceType()
	 * @see #getSimpleService()
	 * @generated
	 */
	EReference getSimpleService_ServiceType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.SimpleService#getModalities <em>Modalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modalities</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SimpleService#getModalities()
	 * @see #getSimpleService()
	 * @generated
	 */
	EAttribute getSimpleService_Modalities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CommunicationInfo <em>Communication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Info</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CommunicationInfo
	 * @generated
	 */
	EClass getCommunicationInfo();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.TCPServer <em>TCP Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP Server</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TCPServer
	 * @generated
	 */
	EClass getTCPServer();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.TCPServer#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TCPServer#getHost()
	 * @see #getTCPServer()
	 * @generated
	 */
	EAttribute getTCPServer_Host();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.TCPServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TCPServer#getPort()
	 * @see #getTCPServer()
	 * @generated
	 */
	EAttribute getTCPServer_Port();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.TECSDirectService <em>TECS Direct Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TECS Direct Service</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TECSDirectService
	 * @generated
	 */
	EClass getTECSDirectService();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.TECSDirectService#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TECSDirectService#getType()
	 * @see #getTECSDirectService()
	 * @generated
	 */
	EAttribute getTECSDirectService_Type();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.TECSDirectService#getData1 <em>Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data1</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TECSDirectService#getData1()
	 * @see #getTECSDirectService()
	 * @generated
	 */
	EAttribute getTECSDirectService_Data1();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.TECSDirectService#getData2 <em>Data2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data2</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TECSDirectService#getData2()
	 * @see #getTECSDirectService()
	 * @generated
	 */
	EAttribute getTECSDirectService_Data2();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.TECSDirectService#getURIs <em>UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>UR Is</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.TECSDirectService#getURIs()
	 * @see #getTECSDirectService()
	 * @generated
	 */
	EAttribute getTECSDirectService_URIs();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.HtmlServlet <em>Html Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Servlet</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.HtmlServlet
	 * @generated
	 */
	EClass getHtmlServlet();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.HtmlServlet#getFragmentName <em>Fragment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.HtmlServlet#getFragmentName()
	 * @see #getHtmlServlet()
	 * @generated
	 */
	EAttribute getHtmlServlet_FragmentName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SipConnection <em>Sip Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sip Connection</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SipConnection
	 * @generated
	 */
	EClass getSipConnection();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SipConnection#getCallId <em>Call Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SipConnection#getCallId()
	 * @see #getSipConnection()
	 * @generated
	 */
	EAttribute getSipConnection_CallId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.OSGIBundle <em>OSGI Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSGI Bundle</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OSGIBundle
	 * @generated
	 */
	EClass getOSGIBundle();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.OSGIBundle#getBundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OSGIBundle#getBundleName()
	 * @see #getOSGIBundle()
	 * @generated
	 */
	EAttribute getOSGIBundle_BundleName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Device#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Device#getDeviceType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.Device#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Device#getHardware()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Hardware();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Hardware#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Hardware#getId()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.IOEvent <em>IO Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IOEvent
	 * @generated
	 */
	EClass getIOEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.IOEvent#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IOEvent#getMessage()
	 * @see #getIOEvent()
	 * @generated
	 */
	EReference getIOEvent_Message();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Message#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Message#getDescription()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Message#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Message#getId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Message#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Message#getTimestamp()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Message#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Message#getSession()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Session();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.InputMessage <em>Input Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.InputMessage
	 * @generated
	 */
	EClass getInputMessage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.OutputMessage <em>Output Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OutputMessage
	 * @generated
	 */
	EClass getOutputMessage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CustomMessage <em>Custom Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomMessage
	 * @generated
	 */
	EClass getCustomMessage();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.CustomMessage#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomMessage#getContent()
	 * @see #getCustomMessage()
	 * @generated
	 */
	EReference getCustomMessage_Content();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct <em>Communicative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Act</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct
	 * @generated
	 */
	EClass getCommunicativeAct();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct#getInitiator()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EAttribute getCommunicativeAct_Initiator();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#getAddressee <em>Addressee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addressee</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct#getAddressee()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EAttribute getCommunicativeAct_Addressee();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct#isPassedFade <em>Passed Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passed Fade</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct#isPassedFade()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EAttribute getCommunicativeAct_PassedFade();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.ControlMessage <em>Control Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Message</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ControlMessage
	 * @generated
	 */
	EClass getControlMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.ControlMessage#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ControlMessage#getDevice()
	 * @see #getControlMessage()
	 * @generated
	 */
	EAttribute getControlMessage_Device();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.ControlMessage#getServiceInstanceId <em>Service Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ControlMessage#getServiceInstanceId()
	 * @see #getControlMessage()
	 * @generated
	 */
	EAttribute getControlMessage_ServiceInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.ControlMessage#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ControlMessage#getServiceName()
	 * @see #getControlMessage()
	 * @generated
	 */
	EAttribute getControlMessage_ServiceName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode <em>Update Device Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Device Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateDeviceMode
	 * @generated
	 */
	EClass getUpdateDeviceMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode#getDeviceMode <em>Device Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateDeviceMode#getDeviceMode()
	 * @see #getUpdateDeviceMode()
	 * @generated
	 */
	EReference getUpdateDeviceMode_DeviceMode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.DeviceStateChanged <em>Device State Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device State Changed</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.DeviceStateChanged
	 * @generated
	 */
	EClass getDeviceStateChanged();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.DeviceStateChanged#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.DeviceStateChanged#getDeviceState()
	 * @see #getDeviceStateChanged()
	 * @generated
	 */
	EReference getDeviceStateChanged_DeviceState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.InputAct <em>Input Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Act</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.InputAct
	 * @generated
	 */
	EClass getInputAct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.InputAct#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.InputAct#getRepresentation()
	 * @see #getInputAct()
	 * @generated
	 */
	EReference getInputAct_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.InputAct#getHypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypotheses</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.InputAct#getHypotheses()
	 * @see #getInputAct()
	 * @generated
	 */
	EReference getInputAct_Hypotheses();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.OutputAct <em>Output Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Act</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OutputAct
	 * @generated
	 */
	EClass getOutputAct();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.OutputAct#getCommunicativeFunction <em>Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communicative Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OutputAct#getCommunicativeFunction()
	 * @see #getOutputAct()
	 * @generated
	 */
	EReference getOutputAct_CommunicativeFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.OutputAct#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OutputAct#getPresentation()
	 * @see #getOutputAct()
	 * @generated
	 */
	EReference getOutputAct_Presentation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.IORepresentation <em>IO Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Representation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation
	 * @generated
	 */
	EClass getIORepresentation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getDevice()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_Device();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceInstance()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_ServiceInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getServiceName()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getBeginTime <em>Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getBeginTime()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_BeginTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getDuration()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getLanguage()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.IORepresentation#getUserAlias <em>User Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Alias</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.IORepresentation#getUserAlias()
	 * @see #getIORepresentation()
	 * @generated
	 */
	EAttribute getIORepresentation_UserAlias();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Representation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.InputRepresentation
	 * @generated
	 */
	EClass getInputRepresentation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Representation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.OutputRepresentation
	 * @generated
	 */
	EClass getOutputRepresentation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.Hypothesis <em>Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypothesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Hypothesis
	 * @generated
	 */
	EClass getHypothesis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Hypothesis#getConfidence()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Confidence();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getCommunicativeFunction <em>Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communicative Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.Hypothesis#getCommunicativeFunction()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_CommunicativeFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis <em>Speech Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Hypothesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechHypothesis
	 * @generated
	 */
	EClass getSpeechHypothesis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getUtterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utterance</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getUtterance()
	 * @see #getSpeechHypothesis()
	 * @generated
	 */
	EAttribute getSpeechHypothesis_Utterance();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tokens</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getTokens()
	 * @see #getSpeechHypothesis()
	 * @generated
	 */
	EReference getSpeechHypothesis_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechHypothesis#getGrammar()
	 * @see #getSpeechHypothesis()
	 * @generated
	 */
	EAttribute getSpeechHypothesis_Grammar();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.GestureHypothesis <em>Gesture Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesture Hypothesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.GestureHypothesis
	 * @generated
	 */
	EClass getGestureHypothesis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.GestureHypothesis#getGesture <em>Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesture</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.GestureHypothesis#getGesture()
	 * @see #getGestureHypothesis()
	 * @generated
	 */
	EAttribute getGestureHypothesis_Gesture();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.GestureHypothesis#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.GestureHypothesis#getParameter()
	 * @see #getGestureHypothesis()
	 * @generated
	 */
	EReference getGestureHypothesis_Parameter();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.PointingHypothesis <em>Pointing Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointing Hypothesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.PointingHypothesis
	 * @generated
	 */
	EClass getPointingHypothesis();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CustomFormat <em>Custom Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Format</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomFormat
	 * @generated
	 */
	EClass getCustomFormat();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomFormat#getContent()
	 * @see #getCustomFormat()
	 * @generated
	 */
	EReference getCustomFormat_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomFormat#getUri()
	 * @see #getCustomFormat()
	 * @generated
	 */
	EAttribute getCustomFormat_Uri();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.CustomFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CustomFormat#getType()
	 * @see #getCustomFormat()
	 * @generated
	 */
	EAttribute getCustomFormat_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.DeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.DeviceState
	 * @generated
	 */
	EClass getDeviceState();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.DeviceMode <em>Device Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.DeviceMode
	 * @generated
	 */
	EClass getDeviceMode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.CancelPresentation <em>Cancel Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Presentation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CancelPresentation
	 * @generated
	 */
	EClass getCancelPresentation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.CancelPresentation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.CancelPresentation#getId()
	 * @see #getCancelPresentation()
	 * @generated
	 */
	EAttribute getCancelPresentation_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.PresentationState <em>Presentation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationState
	 * @generated
	 */
	EClass getPresentationState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.PresentationState#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationState#getId()
	 * @see #getPresentationState()
	 * @generated
	 */
	EAttribute getPresentationState_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.PresentationState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationState#getState()
	 * @see #getPresentationState()
	 * @generated
	 */
	EAttribute getPresentationState_State();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar <em>Update Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Grammar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateGrammar
	 * @generated
	 */
	EClass getUpdateGrammar();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammarID <em>Grammar ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar ID</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammarID()
	 * @see #getUpdateGrammar()
	 * @generated
	 */
	EAttribute getUpdateGrammar_GrammarID();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grammar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateGrammar#getGrammar()
	 * @see #getUpdateGrammar()
	 * @generated
	 */
	EReference getUpdateGrammar_Grammar();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.UpdateGrammar#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.UpdateGrammar#isActive()
	 * @see #getUpdateGrammar()
	 * @generated
	 */
	EAttribute getUpdateGrammar_Active();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerState <em>Speech Recognizer State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Recognizer State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerState
	 * @generated
	 */
	EClass getSpeechRecognizerState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerState#getState()
	 * @see #getSpeechRecognizerState()
	 * @generated
	 */
	EAttribute getSpeechRecognizerState_State();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode <em>Speech Recognizer Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Recognizer Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode
	 * @generated
	 */
	EClass getSpeechRecognizerMode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode#getMode()
	 * @see #getSpeechRecognizerMode()
	 * @generated
	 */
	EAttribute getSpeechRecognizerMode_Mode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState <em>Speech Synthesis State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Synthesis State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechSynthesisState
	 * @generated
	 */
	EClass getSpeechSynthesisState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getPhoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getPhoneme()
	 * @see #getSpeechSynthesisState()
	 * @generated
	 */
	EAttribute getSpeechSynthesisState_Phoneme();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getViseme <em>Viseme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viseme</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getViseme()
	 * @see #getSpeechSynthesisState()
	 * @generated
	 */
	EAttribute getSpeechSynthesisState_Viseme();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getCharIndex <em>Char Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Index</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getCharIndex()
	 * @see #getSpeechSynthesisState()
	 * @generated
	 */
	EAttribute getSpeechSynthesisState_CharIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getBookmark <em>Bookmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bookmark</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechSynthesisState#getBookmark()
	 * @see #getSpeechSynthesisState()
	 * @generated
	 */
	EAttribute getSpeechSynthesisState_Bookmark();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.ActiveGestures <em>Active Gestures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Gestures</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ActiveGestures
	 * @generated
	 */
	EClass getActiveGestures();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.ActiveGestures#getGestures <em>Gestures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gestures</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.ActiveGestures#getGestures()
	 * @see #getActiveGestures()
	 * @generated
	 */
	EAttribute getActiveGestures_Gestures();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum <em>Speech Recognizer State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speech Recognizer State Enum</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum
	 * @generated
	 */
	EEnum getSpeechRecognizerStateEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum <em>Speech Recognizer Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speech Recognizer Mode Enum</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum
	 * @generated
	 */
	EEnum getSpeechRecognizerModeEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.PresentationStateEnum <em>Presentation State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation State Enum</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.PresentationStateEnum
	 * @generated
	 */
	EEnum getPresentationStateEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoFactory getIoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.ServiceInstanceImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getServiceInstance()
		 * @generated
		 */
		EClass SERVICE_INSTANCE = eINSTANCE.getServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE__DESCRIPTION = eINSTANCE.getServiceInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Communicationinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__COMMUNICATIONINFO = eINSTANCE.getServiceInstance_Communicationinfo();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__SERVICES = eINSTANCE.getServiceInstance_Services();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__DEVICE = eINSTANCE.getServiceInstance_Device();

		/**
		 * The meta object literal for the '<em><b>Used Hardware</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__USED_HARDWARE = eINSTANCE.getServiceInstance_UsedHardware();

		/**
		 * The meta object literal for the '<em><b>Service Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE__SERVICE_INSTANCE_NAME = eINSTANCE.getServiceInstance_ServiceInstanceName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.Service <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.Service
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_NAME = eINSTANCE.getService_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Service Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_INSTANCE = eINSTANCE.getService_ServiceInstance();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__USER = eINSTANCE.getService_User();

		/**
		 * The meta object literal for the '<em><b>Get Unique Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___GET_UNIQUE_ID = eINSTANCE.getService__GetUniqueId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl <em>Compound Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.CompoundServiceImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCompoundService()
		 * @generated
		 */
		EClass COMPOUND_SERVICE = eINSTANCE.getCompoundService();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SERVICE__SERVICES = eINSTANCE.getCompoundService_Services();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SimpleServiceImpl <em>Simple Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SimpleServiceImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSimpleService()
		 * @generated
		 */
		EClass SIMPLE_SERVICE = eINSTANCE.getSimpleService();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SERVICE__SERVICE_TYPE = eINSTANCE.getSimpleService_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Modalities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SERVICE__MODALITIES = eINSTANCE.getSimpleService_Modalities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.CommunicationInfo <em>Communication Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.CommunicationInfo
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCommunicationInfo()
		 * @generated
		 */
		EClass COMMUNICATION_INFO = eINSTANCE.getCommunicationInfo();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.TCPServerImpl <em>TCP Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.TCPServerImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getTCPServer()
		 * @generated
		 */
		EClass TCP_SERVER = eINSTANCE.getTCPServer();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_SERVER__HOST = eINSTANCE.getTCPServer_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_SERVER__PORT = eINSTANCE.getTCPServer_Port();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl <em>TECS Direct Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.TECSDirectServiceImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getTECSDirectService()
		 * @generated
		 */
		EClass TECS_DIRECT_SERVICE = eINSTANCE.getTECSDirectService();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECS_DIRECT_SERVICE__TYPE = eINSTANCE.getTECSDirectService_Type();

		/**
		 * The meta object literal for the '<em><b>Data1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECS_DIRECT_SERVICE__DATA1 = eINSTANCE.getTECSDirectService_Data1();

		/**
		 * The meta object literal for the '<em><b>Data2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECS_DIRECT_SERVICE__DATA2 = eINSTANCE.getTECSDirectService_Data2();

		/**
		 * The meta object literal for the '<em><b>UR Is</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECS_DIRECT_SERVICE__UR_IS = eINSTANCE.getTECSDirectService_URIs();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.HtmlServletImpl <em>Html Servlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.HtmlServletImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHtmlServlet()
		 * @generated
		 */
		EClass HTML_SERVLET = eINSTANCE.getHtmlServlet();

		/**
		 * The meta object literal for the '<em><b>Fragment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_SERVLET__FRAGMENT_NAME = eINSTANCE.getHtmlServlet_FragmentName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SipConnectionImpl <em>Sip Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SipConnectionImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSipConnection()
		 * @generated
		 */
		EClass SIP_CONNECTION = eINSTANCE.getSipConnection();

		/**
		 * The meta object literal for the '<em><b>Call Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIP_CONNECTION__CALL_ID = eINSTANCE.getSipConnection_CallId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.OSGIBundleImpl <em>OSGI Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.OSGIBundleImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOSGIBundle()
		 * @generated
		 */
		EClass OSGI_BUNDLE = eINSTANCE.getOSGIBundle();

		/**
		 * The meta object literal for the '<em><b>Bundle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSGI_BUNDLE__BUNDLE_NAME = eINSTANCE.getOSGIBundle_BundleName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.DeviceImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_TYPE = eINSTANCE.getDevice_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__HARDWARE = eINSTANCE.getDevice_Hardware();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.HardwareImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__ID = eINSTANCE.getHardware_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.IOEventImpl <em>IO Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.IOEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getIOEvent()
		 * @generated
		 */
		EClass IO_EVENT = eINSTANCE.getIOEvent();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_EVENT__MESSAGE = eINSTANCE.getIOEvent_Message();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.Message <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.Message
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DESCRIPTION = eINSTANCE.getMessage_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ID = eINSTANCE.getMessage_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TIMESTAMP = eINSTANCE.getMessage_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SESSION = eINSTANCE.getMessage_Session();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.InputMessage <em>Input Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.InputMessage
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputMessage()
		 * @generated
		 */
		EClass INPUT_MESSAGE = eINSTANCE.getInputMessage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.OutputMessage <em>Output Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.OutputMessage
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputMessage()
		 * @generated
		 */
		EClass OUTPUT_MESSAGE = eINSTANCE.getOutputMessage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.CustomMessageImpl <em>Custom Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.CustomMessageImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCustomMessage()
		 * @generated
		 */
		EClass CUSTOM_MESSAGE = eINSTANCE.getCustomMessage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_MESSAGE__CONTENT = eINSTANCE.getCustomMessage_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.CommunicativeAct <em>Communicative Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.CommunicativeAct
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCommunicativeAct()
		 * @generated
		 */
		EClass COMMUNICATIVE_ACT = eINSTANCE.getCommunicativeAct();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE_ACT__INITIATOR = eINSTANCE.getCommunicativeAct_Initiator();

		/**
		 * The meta object literal for the '<em><b>Addressee</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE_ACT__ADDRESSEE = eINSTANCE.getCommunicativeAct_Addressee();

		/**
		 * The meta object literal for the '<em><b>Passed Fade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE_ACT__PASSED_FADE = eINSTANCE.getCommunicativeAct_PassedFade();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.ControlMessage <em>Control Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.ControlMessage
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getControlMessage()
		 * @generated
		 */
		EClass CONTROL_MESSAGE = eINSTANCE.getControlMessage();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_MESSAGE__DEVICE = eINSTANCE.getControlMessage_Device();

		/**
		 * The meta object literal for the '<em><b>Service Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_MESSAGE__SERVICE_INSTANCE_ID = eINSTANCE.getControlMessage_ServiceInstanceId();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_MESSAGE__SERVICE_NAME = eINSTANCE.getControlMessage_ServiceName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl <em>Update Device Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.UpdateDeviceModeImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getUpdateDeviceMode()
		 * @generated
		 */
		EClass UPDATE_DEVICE_MODE = eINSTANCE.getUpdateDeviceMode();

		/**
		 * The meta object literal for the '<em><b>Device Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_DEVICE_MODE__DEVICE_MODE = eINSTANCE.getUpdateDeviceMode_DeviceMode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.DeviceStateChangedImpl <em>Device State Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.DeviceStateChangedImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceStateChanged()
		 * @generated
		 */
		EClass DEVICE_STATE_CHANGED = eINSTANCE.getDeviceStateChanged();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATE_CHANGED__DEVICE_STATE = eINSTANCE.getDeviceStateChanged_DeviceState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.InputActImpl <em>Input Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.InputActImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputAct()
		 * @generated
		 */
		EClass INPUT_ACT = eINSTANCE.getInputAct();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ACT__REPRESENTATION = eINSTANCE.getInputAct_Representation();

		/**
		 * The meta object literal for the '<em><b>Hypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ACT__HYPOTHESES = eINSTANCE.getInputAct_Hypotheses();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.OutputActImpl <em>Output Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.OutputActImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputAct()
		 * @generated
		 */
		EClass OUTPUT_ACT = eINSTANCE.getOutputAct();

		/**
		 * The meta object literal for the '<em><b>Communicative Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ACT__COMMUNICATIVE_FUNCTION = eINSTANCE.getOutputAct_CommunicativeFunction();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ACT__PRESENTATION = eINSTANCE.getOutputAct_Presentation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.IORepresentation <em>IO Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.IORepresentation
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getIORepresentation()
		 * @generated
		 */
		EClass IO_REPRESENTATION = eINSTANCE.getIORepresentation();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__DEVICE = eINSTANCE.getIORepresentation_Device();

		/**
		 * The meta object literal for the '<em><b>Service Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__SERVICE_INSTANCE = eINSTANCE.getIORepresentation_ServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__SERVICE_NAME = eINSTANCE.getIORepresentation_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__BEGIN_TIME = eINSTANCE.getIORepresentation_BeginTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__DURATION = eINSTANCE.getIORepresentation_Duration();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__LANGUAGE = eINSTANCE.getIORepresentation_Language();

		/**
		 * The meta object literal for the '<em><b>User Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_REPRESENTATION__USER_ALIAS = eINSTANCE.getIORepresentation_UserAlias();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.InputRepresentation <em>Input Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.InputRepresentation
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getInputRepresentation()
		 * @generated
		 */
		EClass INPUT_REPRESENTATION = eINSTANCE.getInputRepresentation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.OutputRepresentation <em>Output Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.OutputRepresentation
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getOutputRepresentation()
		 * @generated
		 */
		EClass OUTPUT_REPRESENTATION = eINSTANCE.getOutputRepresentation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl <em>Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getHypothesis()
		 * @generated
		 */
		EClass HYPOTHESIS = eINSTANCE.getHypothesis();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__CONFIDENCE = eINSTANCE.getHypothesis_Confidence();

		/**
		 * The meta object literal for the '<em><b>Communicative Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__COMMUNICATIVE_FUNCTION = eINSTANCE.getHypothesis_CommunicativeFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl <em>Speech Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechHypothesisImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechHypothesis()
		 * @generated
		 */
		EClass SPEECH_HYPOTHESIS = eINSTANCE.getSpeechHypothesis();

		/**
		 * The meta object literal for the '<em><b>Utterance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_HYPOTHESIS__UTTERANCE = eINSTANCE.getSpeechHypothesis_Utterance();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_HYPOTHESIS__TOKENS = eINSTANCE.getSpeechHypothesis_Tokens();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_HYPOTHESIS__GRAMMAR = eINSTANCE.getSpeechHypothesis_Grammar();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.GestureHypothesisImpl <em>Gesture Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.GestureHypothesisImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getGestureHypothesis()
		 * @generated
		 */
		EClass GESTURE_HYPOTHESIS = eINSTANCE.getGestureHypothesis();

		/**
		 * The meta object literal for the '<em><b>Gesture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESTURE_HYPOTHESIS__GESTURE = eINSTANCE.getGestureHypothesis_Gesture();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTURE_HYPOTHESIS__PARAMETER = eINSTANCE.getGestureHypothesis_Parameter();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.PointingHypothesisImpl <em>Pointing Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.PointingHypothesisImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPointingHypothesis()
		 * @generated
		 */
		EClass POINTING_HYPOTHESIS = eINSTANCE.getPointingHypothesis();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.CustomFormatImpl <em>Custom Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.CustomFormatImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCustomFormat()
		 * @generated
		 */
		EClass CUSTOM_FORMAT = eINSTANCE.getCustomFormat();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_FORMAT__CONTENT = eINSTANCE.getCustomFormat_Content();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FORMAT__URI = eINSTANCE.getCustomFormat_Uri();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FORMAT__TYPE = eINSTANCE.getCustomFormat_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.DeviceState <em>Device State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.DeviceState
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceState()
		 * @generated
		 */
		EClass DEVICE_STATE = eINSTANCE.getDeviceState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.DeviceMode <em>Device Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.DeviceMode
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getDeviceMode()
		 * @generated
		 */
		EClass DEVICE_MODE = eINSTANCE.getDeviceMode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.CancelPresentationImpl <em>Cancel Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.CancelPresentationImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getCancelPresentation()
		 * @generated
		 */
		EClass CANCEL_PRESENTATION = eINSTANCE.getCancelPresentation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_PRESENTATION__ID = eINSTANCE.getCancelPresentation_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.PresentationStateImpl <em>Presentation State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.PresentationStateImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPresentationState()
		 * @generated
		 */
		EClass PRESENTATION_STATE = eINSTANCE.getPresentationState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_STATE__ID = eINSTANCE.getPresentationState_Id();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_STATE__STATE = eINSTANCE.getPresentationState_State();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl <em>Update Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.UpdateGrammarImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getUpdateGrammar()
		 * @generated
		 */
		EClass UPDATE_GRAMMAR = eINSTANCE.getUpdateGrammar();

		/**
		 * The meta object literal for the '<em><b>Grammar ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_GRAMMAR__GRAMMAR_ID = eINSTANCE.getUpdateGrammar_GrammarID();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_GRAMMAR__GRAMMAR = eINSTANCE.getUpdateGrammar_Grammar();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_GRAMMAR__ACTIVE = eINSTANCE.getUpdateGrammar_Active();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerStateImpl <em>Speech Recognizer State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerStateImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerState()
		 * @generated
		 */
		EClass SPEECH_RECOGNIZER_STATE = eINSTANCE.getSpeechRecognizerState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_RECOGNIZER_STATE__STATE = eINSTANCE.getSpeechRecognizerState_State();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerModeImpl <em>Speech Recognizer Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechRecognizerModeImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerMode()
		 * @generated
		 */
		EClass SPEECH_RECOGNIZER_MODE = eINSTANCE.getSpeechRecognizerMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_RECOGNIZER_MODE__MODE = eINSTANCE.getSpeechRecognizerMode_Mode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl <em>Speech Synthesis State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.SpeechSynthesisStateImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechSynthesisState()
		 * @generated
		 */
		EClass SPEECH_SYNTHESIS_STATE = eINSTANCE.getSpeechSynthesisState();

		/**
		 * The meta object literal for the '<em><b>Phoneme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SYNTHESIS_STATE__PHONEME = eINSTANCE.getSpeechSynthesisState_Phoneme();

		/**
		 * The meta object literal for the '<em><b>Viseme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SYNTHESIS_STATE__VISEME = eINSTANCE.getSpeechSynthesisState_Viseme();

		/**
		 * The meta object literal for the '<em><b>Char Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SYNTHESIS_STATE__CHAR_INDEX = eINSTANCE.getSpeechSynthesisState_CharIndex();

		/**
		 * The meta object literal for the '<em><b>Bookmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SYNTHESIS_STATE__BOOKMARK = eINSTANCE.getSpeechSynthesisState_Bookmark();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.impl.ActiveGesturesImpl <em>Active Gestures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.impl.ActiveGesturesImpl
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getActiveGestures()
		 * @generated
		 */
		EClass ACTIVE_GESTURES = eINSTANCE.getActiveGestures();

		/**
		 * The meta object literal for the '<em><b>Gestures</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_GESTURES__GESTURES = eINSTANCE.getActiveGestures_Gestures();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum <em>Speech Recognizer State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerStateEnum
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerStateEnum()
		 * @generated
		 */
		EEnum SPEECH_RECOGNIZER_STATE_ENUM = eINSTANCE.getSpeechRecognizerStateEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum <em>Speech Recognizer Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.SpeechRecognizerModeEnum
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getSpeechRecognizerModeEnum()
		 * @generated
		 */
		EEnum SPEECH_RECOGNIZER_MODE_ENUM = eINSTANCE.getSpeechRecognizerModeEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.PresentationStateEnum <em>Presentation State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.PresentationStateEnum
		 * @see de.dfki.iui.mmds.core.model.io.impl.IoPackageImpl#getPresentationStateEnum()
		 * @generated
		 */
		EEnum PRESENTATION_STATE_ENUM = eINSTANCE.getPresentationStateEnum();

	}

} //IoPackage
