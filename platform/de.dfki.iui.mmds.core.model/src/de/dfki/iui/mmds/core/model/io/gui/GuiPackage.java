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
package de.dfki.iui.mmds.core.model.io.gui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;

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
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiFactory
 * @model kind="package"
 * @generated
 */
public interface GuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/gui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIRequest <em>GUI Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIRequest
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIRequest()
	 * @generated
	 */
	int GUI_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__BINDING = Io_interfacesPackage.RENDERER_OUTPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__DEVICE = Io_interfacesPackage.RENDERER_OUTPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__SERVICE_INSTANCE = Io_interfacesPackage.RENDERER_OUTPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__SERVICE_NAME = Io_interfacesPackage.RENDERER_OUTPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__BEGIN_TIME = Io_interfacesPackage.RENDERER_OUTPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__DURATION = Io_interfacesPackage.RENDERER_OUTPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__LANGUAGE = Io_interfacesPackage.RENDERER_OUTPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST__USER_ALIAS = Io_interfacesPackage.RENDERER_OUTPUT__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>GUI Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST_FEATURE_COUNT = Io_interfacesPackage.RENDERER_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GUI Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REQUEST_OPERATION_COUNT = Io_interfacesPackage.RENDERER_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIEventImpl <em>GUI Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIEvent()
	 * @generated
	 */
	int GUI_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__BINDING = Io_interfacesPackage.CONTROLLER_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__DEVICE = Io_interfacesPackage.CONTROLLER_INPUT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__SERVICE_INSTANCE = Io_interfacesPackage.CONTROLLER_INPUT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__SERVICE_NAME = Io_interfacesPackage.CONTROLLER_INPUT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__BEGIN_TIME = Io_interfacesPackage.CONTROLLER_INPUT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__DURATION = Io_interfacesPackage.CONTROLLER_INPUT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__LANGUAGE = Io_interfacesPackage.CONTROLLER_INPUT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__USER_ALIAS = Io_interfacesPackage.CONTROLLER_INPUT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Event Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT__EVENT_DATA = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUI Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_FEATURE_COUNT = Io_interfacesPackage.CONTROLLER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GUI Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_OPERATION_COUNT = Io_interfacesPackage.CONTROLLER_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl <em>GUI Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIApplication()
	 * @generated
	 */
	int GUI_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__BINDING = GUI_REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__DEVICE = GUI_REQUEST__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__SERVICE_INSTANCE = GUI_REQUEST__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__SERVICE_NAME = GUI_REQUEST__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__BEGIN_TIME = GUI_REQUEST__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__DURATION = GUI_REQUEST__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__LANGUAGE = GUI_REQUEST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__USER_ALIAS = GUI_REQUEST__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__WINDOW = GUI_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__APPLICATION_ID = GUI_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION__STYLE_RESOURCE = GUI_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GUI Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION_FEATURE_COUNT = GUI_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GUI Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_APPLICATION_OPERATION_COUNT = GUI_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl <em>GUI Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIUpdate()
	 * @generated
	 */
	int GUI_UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__BINDING = GUI_REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__DEVICE = GUI_REQUEST__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__SERVICE_INSTANCE = GUI_REQUEST__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__SERVICE_NAME = GUI_REQUEST__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__BEGIN_TIME = GUI_REQUEST__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__DURATION = GUI_REQUEST__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__LANGUAGE = GUI_REQUEST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__USER_ALIAS = GUI_REQUEST__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__UPDATES = GUI_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__APPLICATION_ID = GUI_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE__VALIDATED = GUI_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GUI Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE_FEATURE_COUNT = GUI_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GUI Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_UPDATE_OPERATION_COUNT = GUI_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.UpdateInfo <em>Update Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.UpdateInfo
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUpdateInfo()
	 * @generated
	 */
	int UPDATE_INFO = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_INFO__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The number of structural features of the '<em>Update Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_INFO_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_INFO_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.WindowUpdateImpl <em>Window Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.WindowUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getWindowUpdate()
	 * @generated
	 */
	int WINDOW_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_UPDATE__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_UPDATE__WINDOW = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Window Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_UPDATE_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Window Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_UPDATE_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.StyleSheetUpdateImpl <em>Style Sheet Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.StyleSheetUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getStyleSheetUpdate()
	 * @generated
	 */
	int STYLE_SHEET_UPDATE = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_UPDATE__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Style Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_UPDATE__STYLE_RESOURCE = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style Sheet Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_UPDATE_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Style Sheet Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_UPDATE_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RemoveUIElementImpl <em>Remove UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RemoveUIElementImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRemoveUIElement()
	 * @generated
	 */
	int REMOVE_UI_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UI_ELEMENT__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UI_ELEMENT__ELEMENT_ID = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UI_ELEMENT_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UI_ELEMENT_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl <em>Add UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAddUIElement()
	 * @generated
	 */
	int ADD_UI_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT__PARENT_ID = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT__NEW_ELEMENT = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT__NEW_ELEMENT_REF = UPDATE_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT__POSITION = UPDATE_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Add UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UI_ELEMENT_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddTableCellImpl <em>Add Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AddTableCellImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAddTableCell()
	 * @generated
	 */
	int ADD_TABLE_CELL = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__BINDING = ADD_UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__PARENT_ID = ADD_UI_ELEMENT__PARENT_ID;

	/**
	 * The feature id for the '<em><b>New Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__NEW_ELEMENT = ADD_UI_ELEMENT__NEW_ELEMENT;

	/**
	 * The feature id for the '<em><b>New Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__NEW_ELEMENT_REF = ADD_UI_ELEMENT__NEW_ELEMENT_REF;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__POSITION = ADD_UI_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Column Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL__COLUMN_POSITION = ADD_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL_FEATURE_COUNT = ADD_UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_CELL_OPERATION_COUNT = ADD_UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RemoveTableCellImpl <em>Remove Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RemoveTableCellImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRemoveTableCell()
	 * @generated
	 */
	int REMOVE_TABLE_CELL = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CELL__BINDING = REMOVE_UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CELL__ELEMENT_ID = REMOVE_UI_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Remove Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CELL__REMOVE_ROW = REMOVE_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CELL_FEATURE_COUNT = REMOVE_UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CELL_OPERATION_COUNT = REMOVE_UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MoveUIElementImpl <em>Move UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MoveUIElementImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMoveUIElement()
	 * @generated
	 */
	int MOVE_UI_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>New Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT__NEW_PARENT_ID = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT__ELEMENT_ID = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT__POSITION = UPDATE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Move UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UI_ELEMENT_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl <em>UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUIElement()
	 * @generated
	 */
	int UI_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ID = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ENABLED = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__LAYOUT = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__SUPPORTED_EVENTS = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__STYLE_NAMES = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__X = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__Y = BasePackage.BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__SEMANTIC_CONTENT = BasePackage.BOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ADAPTER = BasePackage.BOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__TOOLTIP = BasePackage.BOBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SupportedEventImpl <em>Supported Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SupportedEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSupportedEvent()
	 * @generated
	 */
	int SUPPORTED_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_EVENT__INTERPRETATION = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_EVENT__EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_EVENT__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Supported Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Supported Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer <em>Abstract Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbstractContainer()
	 * @generated
	 */
	int ABSTRACT_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__ARRAY_ADAPTER = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER___CONTAINS = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT = UI_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT = UI_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT = UI_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ContainerImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.WindowImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TITLE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PLUGINS = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabViewImpl <em>Tab View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabViewImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabView()
	 * @generated
	 */
	int TAB_VIEW = 66;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabItemImpl <em>Tab Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabItemImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabItem()
	 * @generated
	 */
	int TAB_ITEM = 65;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl <em>Element Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getElementAdapter()
	 * @generated
	 */
	int ELEMENT_ADAPTER = 17;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ADAPTER__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Adapter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ADAPTER__ADAPTER_MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Element Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ADAPTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AdapterMappingImpl <em>Adapter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AdapterMappingImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAdapterMapping()
	 * @generated
	 */
	int ADAPTER_MAPPING = 18;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MAPPING__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MAPPING__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Adapter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adapter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ArrayAdapterImpl <em>Array Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ArrayAdapterImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getArrayAdapter()
	 * @generated
	 */
	int ARRAY_ADAPTER = 19;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADAPTER__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADAPTER__PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADAPTER__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Array Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Array Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl <em>Grid Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridContainer()
	 * @generated
	 */
	int GRID_CONTAINER = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ROW = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Grid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl <em>Grid Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridRow()
	 * @generated
	 */
	int GRID_ROW = 26;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl <em>Grid Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridItem()
	 * @generated
	 */
	int GRID_ITEM = 27;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl <em>Button Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButtonBar()
	 * @generated
	 */
	int BUTTON_BAR = 50;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HTMLViewImpl <em>HTML View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HTMLViewImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHTMLView()
	 * @generated
	 */
	int HTML_VIEW = 29;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CanvasImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LayoutImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 31;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 32;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SizeImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 33;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AbsoluteLayoutImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbsoluteLayout()
	 * @generated
	 */
	int ABSOLUTE_LAYOUT = 34;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FlowLayoutImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFlowLayout()
	 * @generated
	 */
	int FLOW_LAYOUT = 35;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToolTipImpl <em>Tool Tip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToolTipImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToolTip()
	 * @generated
	 */
	int TOOL_TIP = 36;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 44;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSubmitButton()
	 * @generated
	 */
	int SUBMIT_BUTTON = 45;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 46;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 47;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabelImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 37;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 38;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputImpl <em>Labeled Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabeledTextInput()
	 * @generated
	 */
	int LABELED_TEXT_INPUT = 39;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputImpl <em>Rich Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRichTextInput()
	 * @generated
	 */
	int RICH_TEXT_INPUT = 40;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getList()
	 * @generated
	 */
	int LIST = 41;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListItemImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 42;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ComboBoxImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 43;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerImpl <em>Color Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getColorPicker()
	 * @generated
	 */
	int COLOR_PICKER = 51;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 53;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl <em>Image Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageGallery()
	 * @generated
	 */
	int IMAGE_GALLERY = 54;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl <em>Media Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMediaPlayer()
	 * @generated
	 */
	int MEDIA_PLAYER = 55;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SpinnerImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 56;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.NumericStepperImpl <em>Numeric Stepper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.NumericStepperImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getNumericStepper()
	 * @generated
	 */
	int NUMERIC_STEPPER = 57;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ScrollbarImpl <em>Scrollbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ScrollbarImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getScrollbar()
	 * @generated
	 */
	int SCROLLBAR = 58;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CalendarViewImpl <em>Calendar View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CalendarViewImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCalendarView()
	 * @generated
	 */
	int CALENDAR_VIEW = 59;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl <em>Soft Keyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSoftKeyboard()
	 * @generated
	 */
	int SOFT_KEYBOARD = 60;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl <em>Dialog Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogBox()
	 * @generated
	 */
	int DIALOG_BOX = 62;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CustomDialogImpl <em>Custom Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CustomDialogImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCustomDialog()
	 * @generated
	 */
	int CUSTOM_DIALOG = 63;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToggleButton()
	 * @generated
	 */
	int TOGGLE_BUTTON = 48;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonImpl <em>Image Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageButton()
	 * @generated
	 */
	int IMAGE_BUTTON = 49;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FormImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.VBoxImpl <em>VBox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.VBoxImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVBox()
	 * @generated
	 */
	int VBOX = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>VBox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>VBox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HBoxImpl <em>HBox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HBoxImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHBox()
	 * @generated
	 */
	int HBOX = 24;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>HBox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>HBox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DivImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 25;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CONTENT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Row Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ROW_ID = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__HEIGHT = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__IS_PERCENTAGE = ABSTRACT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW__ITEM = ABSTRACT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Grid Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ROW_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__BINDING = CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__LAYOUT = CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__SUPPORTED_EVENTS = CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__STYLE_NAMES = CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__SEMANTIC_CONTENT = CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ADAPTER = CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__TOOLTIP = CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ARRAY_ADAPTER = CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__WIDTH = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__IS_PERCENTAGE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ROW_SPAN = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Column Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__COLUMN_SPAN = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__ALIGNMENT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Valignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM__VALIGNMENT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Grid Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM___CONTAINS = CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM___ADD_CHILD__UIELEMENT = CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM___ADD_CHILD__BINTEGER_UIELEMENT = CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM___REMOVE_CHILD__UIELEMENT = CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Grid Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridHeaderItemImpl <em>Grid Header Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridHeaderItemImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridHeaderItem()
	 * @generated
	 */
	int GRID_HEADER_ITEM = 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__BINDING = GRID_ITEM__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ID = GRID_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ENABLED = GRID_ITEM__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__LAYOUT = GRID_ITEM__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__SUPPORTED_EVENTS = GRID_ITEM__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__STYLE_NAMES = GRID_ITEM__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__X = GRID_ITEM__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__Y = GRID_ITEM__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__SEMANTIC_CONTENT = GRID_ITEM__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ADAPTER = GRID_ITEM__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__TOOLTIP = GRID_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ARRAY_ADAPTER = GRID_ITEM__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ELEMENTS = GRID_ITEM__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__WIDTH = GRID_ITEM__WIDTH;

	/**
	 * The feature id for the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__IS_PERCENTAGE = GRID_ITEM__IS_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ROW_SPAN = GRID_ITEM__ROW_SPAN;

	/**
	 * The feature id for the '<em><b>Column Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__COLUMN_SPAN = GRID_ITEM__COLUMN_SPAN;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__ALIGNMENT = GRID_ITEM__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Valignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM__VALIGNMENT = GRID_ITEM__VALIGNMENT;

	/**
	 * The number of structural features of the '<em>Grid Header Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM_FEATURE_COUNT = GRID_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM___CONTAINS = GRID_ITEM___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM___ADD_CHILD__UIELEMENT = GRID_ITEM___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM___ADD_CHILD__BINTEGER_UIELEMENT = GRID_ITEM___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM___REMOVE_CHILD__UIELEMENT = GRID_ITEM___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Grid Header Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_HEADER_ITEM_OPERATION_COUNT = GRID_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__CONTENT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__SOURCE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loading Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW__LOADING_INDICATOR = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HTML View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HTML View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DisplayContextViewImpl <em>Display Context View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DisplayContextViewImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDisplayContextView()
	 * @generated
	 */
	int DISPLAY_CONTEXT_VIEW = 30;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Display Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW__DISPLAY_CONTEXT_NAME = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display Context View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Display Context View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CONTEXT_VIEW_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN = 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HORIZONTAL_ALIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VERTICAL_ALIGNMENT = 4;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__TOP = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__IS_PERCENTAGE = 4;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__HEIGHT = LAYOUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__WIDTH = LAYOUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__MARGIN = LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__HORIZONTAL_ALIGNMENT = LAYOUT__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__VERTICAL_ALIGNMENT = LAYOUT__VERTICAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__X = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__Z = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__Y = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Absolute Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Absolute Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__HEIGHT = LAYOUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__WIDTH = LAYOUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MARGIN = LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__HORIZONTAL_ALIGNMENT = LAYOUT__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__VERTICAL_ALIGNMENT = LAYOUT__VERTICAL_ALIGNMENT;

	/**
	 * The number of structural features of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Tool Tip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tool Tip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__MULTI_LINE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soft Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__SOFT_KEYBOARD = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__BINDING = TEXT_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__ID = TEXT_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__ENABLED = TEXT_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__LAYOUT = TEXT_INPUT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__SUPPORTED_EVENTS = TEXT_INPUT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__STYLE_NAMES = TEXT_INPUT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__X = TEXT_INPUT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__Y = TEXT_INPUT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__SEMANTIC_CONTENT = TEXT_INPUT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__ADAPTER = TEXT_INPUT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__TOOLTIP = TEXT_INPUT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__TEXT = TEXT_INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__MULTI_LINE = TEXT_INPUT__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Soft Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__SOFT_KEYBOARD = TEXT_INPUT__SOFT_KEYBOARD;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT__LABEL = TEXT_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FEATURE_COUNT = TEXT_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Labeled Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_OPERATION_COUNT = TEXT_INPUT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__BINDING = TEXT_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__ID = TEXT_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__ENABLED = TEXT_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__LAYOUT = TEXT_INPUT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__SUPPORTED_EVENTS = TEXT_INPUT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__STYLE_NAMES = TEXT_INPUT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__X = TEXT_INPUT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__Y = TEXT_INPUT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__SEMANTIC_CONTENT = TEXT_INPUT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__ADAPTER = TEXT_INPUT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__TOOLTIP = TEXT_INPUT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__TEXT = TEXT_INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__MULTI_LINE = TEXT_INPUT__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Soft Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT__SOFT_KEYBOARD = TEXT_INPUT__SOFT_KEYBOARD;

	/**
	 * The number of structural features of the '<em>Rich Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_FEATURE_COUNT = TEXT_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rich Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_OPERATION_COUNT = TEXT_INPUT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ALLOW_MULTIPLE_SELECTION = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEM = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SELECTED_INDEX = ABSTRACT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LABEL = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__VALUE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__SELECTED = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__BINDING = LIST__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID = LIST__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ENABLED = LIST__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__LAYOUT = LIST__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SUPPORTED_EVENTS = LIST__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__STYLE_NAMES = LIST__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__X = LIST__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__Y = LIST__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SEMANTIC_CONTENT = LIST__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ADAPTER = LIST__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TOOLTIP = LIST__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ARRAY_ADAPTER = LIST__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ALLOW_MULTIPLE_SELECTION = LIST__ALLOW_MULTIPLE_SELECTION;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ITEM = LIST__ITEM;

	/**
	 * The feature id for the '<em><b>Selected Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SELECTED_INDEX = LIST__SELECTED_INDEX;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX___CONTAINS = LIST___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX___ADD_CHILD__UIELEMENT = LIST___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX___ADD_CHILD__BINTEGER_UIELEMENT = LIST___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX___REMOVE_CHILD__UIELEMENT = LIST___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__BINDING = BUTTON__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__LAYOUT = BUTTON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__SUPPORTED_EVENTS = BUTTON__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__STYLE_NAMES = BUTTON__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__SEMANTIC_CONTENT = BUTTON__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__ADAPTER = BUTTON__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The number of structural features of the '<em>Submit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Submit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BINDING = BUTTON__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LAYOUT = BUTTON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SUPPORTED_EVENTS = BUTTON__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STYLE_NAMES = BUTTON__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SEMANTIC_CONTENT = BUTTON__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ADAPTER = BUTTON__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__CHECKED = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BINDING = BUTTON__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LAYOUT = BUTTON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SUPPORTED_EVENTS = BUTTON__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__STYLE_NAMES = BUTTON__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SEMANTIC_CONTENT = BUTTON__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ADAPTER = BUTTON__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Radio Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__RADIO_GROUP = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VALUE = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__CHECKED = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__BINDING = BUTTON__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__LAYOUT = BUTTON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__SUPPORTED_EVENTS = BUTTON__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__STYLE_NAMES = BUTTON__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__SEMANTIC_CONTENT = BUTTON__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__ADAPTER = BUTTON__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__IS_SELECTED = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__BINDING = BUTTON__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__LAYOUT = BUTTON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__SUPPORTED_EVENTS = BUTTON__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__STYLE_NAMES = BUTTON__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__SEMANTIC_CONTENT = BUTTON__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__ADAPTER = BUTTON__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__RESOURCE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__BUTTON = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ORIENTATION = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Button Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__BINDING = TEXT_INPUT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__ID = TEXT_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__ENABLED = TEXT_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__LAYOUT = TEXT_INPUT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__SUPPORTED_EVENTS = TEXT_INPUT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__STYLE_NAMES = TEXT_INPUT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__X = TEXT_INPUT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__Y = TEXT_INPUT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__SEMANTIC_CONTENT = TEXT_INPUT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__ADAPTER = TEXT_INPUT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__TOOLTIP = TEXT_INPUT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__TEXT = TEXT_INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__MULTI_LINE = TEXT_INPUT__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Soft Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__SOFT_KEYBOARD = TEXT_INPUT__SOFT_KEYBOARD;

	/**
	 * The number of structural features of the '<em>Color Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_FEATURE_COUNT = TEXT_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_OPERATION_COUNT = TEXT_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getProgressBar()
	 * @generated
	 */
	int PROGRESS_BAR = 52;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__PERCENTAGE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__DETERMINATE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MAX = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SMOOTH = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILL_MODE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loading Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOADING_INDICATOR = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Can Manipulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CAN_MANIPULATE = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__RESOURCE = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__IMAGE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Button Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__BUTTON_BAR = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Slide Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY__IS_SLIDE_SHOW = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_GALLERY_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Is Playing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__IS_PLAYING = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__MEDIA = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Play</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__AUTO_PLAY = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__SHOW_CONTROLS = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__WIDTH = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__HEIGHT = UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER__VISIBLE = UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Media Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Media Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PLAYER_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__BINDING = SPINNER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__ID = SPINNER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__ENABLED = SPINNER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__LAYOUT = SPINNER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__SUPPORTED_EVENTS = SPINNER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__STYLE_NAMES = SPINNER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__X = SPINNER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__Y = SPINNER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__SEMANTIC_CONTENT = SPINNER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__ADAPTER = SPINNER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__TOOLTIP = SPINNER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__MIN_VALUE = SPINNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER__MAX_VALUE = SPINNER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Stepper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER_FEATURE_COUNT = SPINNER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Numeric Stepper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STEPPER_OPERATION_COUNT = SPINNER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__MAX_VALUE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__MIN_VALUE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__VALUE = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR__ORIENTATION = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scrollbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scrollbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLBAR_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__DISPLAY_MODE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW__DATE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calendar View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Calendar View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_VIEW_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyboard Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__KEYBOARD_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Use Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__USE_DICTIONARY = 1;

	/**
	 * The feature id for the '<em><b>Dictionary Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__DICTIONARY_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__ENABLED = 3;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__DICTIONARY = 4;

	/**
	 * The feature id for the '<em><b>Enable Speech Input Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON = 5;

	/**
	 * The number of structural features of the '<em>Soft Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Soft Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_KEYBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox <em>Abstract Dialog Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbstractDialogBox()
	 * @generated
	 */
	int ABSTRACT_DIALOG_BOX = 61;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__TITLE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__TEXT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX__VISIBLE = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Dialog Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Dialog Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOG_BOX_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__BINDING = ABSTRACT_DIALOG_BOX__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__ID = ABSTRACT_DIALOG_BOX__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__ENABLED = ABSTRACT_DIALOG_BOX__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__LAYOUT = ABSTRACT_DIALOG_BOX__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__SUPPORTED_EVENTS = ABSTRACT_DIALOG_BOX__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__STYLE_NAMES = ABSTRACT_DIALOG_BOX__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__X = ABSTRACT_DIALOG_BOX__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__Y = ABSTRACT_DIALOG_BOX__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__SEMANTIC_CONTENT = ABSTRACT_DIALOG_BOX__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__ADAPTER = ABSTRACT_DIALOG_BOX__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__TOOLTIP = ABSTRACT_DIALOG_BOX__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__TITLE = ABSTRACT_DIALOG_BOX__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__TEXT = ABSTRACT_DIALOG_BOX__TEXT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__VISIBLE = ABSTRACT_DIALOG_BOX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__MODAL = ABSTRACT_DIALOG_BOX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX__BUTTONS = ABSTRACT_DIALOG_BOX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dialog Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX_FEATURE_COUNT = ABSTRACT_DIALOG_BOX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dialog Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_BOX_OPERATION_COUNT = ABSTRACT_DIALOG_BOX_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__BINDING = ABSTRACT_DIALOG_BOX__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__ID = ABSTRACT_DIALOG_BOX__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__ENABLED = ABSTRACT_DIALOG_BOX__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__LAYOUT = ABSTRACT_DIALOG_BOX__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__SUPPORTED_EVENTS = ABSTRACT_DIALOG_BOX__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__STYLE_NAMES = ABSTRACT_DIALOG_BOX__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__X = ABSTRACT_DIALOG_BOX__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__Y = ABSTRACT_DIALOG_BOX__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__SEMANTIC_CONTENT = ABSTRACT_DIALOG_BOX__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__ADAPTER = ABSTRACT_DIALOG_BOX__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__TOOLTIP = ABSTRACT_DIALOG_BOX__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__TITLE = ABSTRACT_DIALOG_BOX__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__TEXT = ABSTRACT_DIALOG_BOX__TEXT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__VISIBLE = ABSTRACT_DIALOG_BOX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG__ELEMENT = ABSTRACT_DIALOG_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_FEATURE_COUNT = ABSTRACT_DIALOG_BOX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_OPERATION_COUNT = ABSTRACT_DIALOG_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FileChooserImpl <em>File Chooser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FileChooserImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFileChooser()
	 * @generated
	 */
	int FILE_CHOOSER = 64;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The number of structural features of the '<em>File Chooser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Chooser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHOOSER_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__BINDING = UI_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__LAYOUT = UI_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__SUPPORTED_EVENTS = UI_ELEMENT__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__STYLE_NAMES = UI_ELEMENT__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__X = UI_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__Y = UI_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__SEMANTIC_CONTENT = UI_ELEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ADAPTER = UI_ELEMENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__TOOLTIP = UI_ELEMENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__TITLE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ELEMENT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__BINDING = ABSTRACT_CONTAINER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__ID = ABSTRACT_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__ENABLED = ABSTRACT_CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__LAYOUT = ABSTRACT_CONTAINER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Supported Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__SUPPORTED_EVENTS = ABSTRACT_CONTAINER__SUPPORTED_EVENTS;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__STYLE_NAMES = ABSTRACT_CONTAINER__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__X = ABSTRACT_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__Y = ABSTRACT_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__SEMANTIC_CONTENT = ABSTRACT_CONTAINER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__ADAPTER = ABSTRACT_CONTAINER__ADAPTER;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__TOOLTIP = ABSTRACT_CONTAINER__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Array Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__ARRAY_ADAPTER = ABSTRACT_CONTAINER__ARRAY_ADAPTER;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW__ITEMS = ABSTRACT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW_FEATURE_COUNT = ABSTRACT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW___CONTAINS = ABSTRACT_CONTAINER___CONTAINS;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW___ADD_CHILD__UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT;

	/**
	 * The operation id for the '<em>Add Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW___ADD_CHILD__BINTEGER_UIELEMENT = ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT;

	/**
	 * The operation id for the '<em>Remove Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW___REMOVE_CHILD__UIELEMENT = ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT;

	/**
	 * The number of operations of the '<em>Tab View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_VIEW_OPERATION_COUNT = ABSTRACT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl <em>UI Element Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUIElementUpdate()
	 * @generated
	 */
	int UI_ELEMENT_UPDATE = 67;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__ID = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__ENABLED = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__STYLE_NAMES = UPDATE_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__TOOLTIP = UPDATE_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__STYLE_PROPS = UPDATE_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UI Element Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>UI Element Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputUpdateImpl <em>Text Input Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TextInputUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTextInputUpdate()
	 * @generated
	 */
	int TEXT_INPUT_UPDATE = 68;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__TEXT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputUpdateImpl <em>Labeled Text Input Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabeledTextInputUpdate()
	 * @generated
	 */
	int LABELED_TEXT_INPUT_UPDATE = 69;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__BINDING = TEXT_INPUT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__ID = TEXT_INPUT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__ENABLED = TEXT_INPUT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__STYLE_NAMES = TEXT_INPUT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__TOOLTIP = TEXT_INPUT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__STYLE_PROPS = TEXT_INPUT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__TEXT = TEXT_INPUT_UPDATE__TEXT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE__LABEL = TEXT_INPUT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE_FEATURE_COUNT = TEXT_INPUT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Labeled Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_UPDATE_OPERATION_COUNT = TEXT_INPUT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputUpdateImpl <em>Rich Text Input Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRichTextInputUpdate()
	 * @generated
	 */
	int RICH_TEXT_INPUT_UPDATE = 70;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__BINDING = TEXT_INPUT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__ID = TEXT_INPUT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__ENABLED = TEXT_INPUT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__STYLE_NAMES = TEXT_INPUT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__TOOLTIP = TEXT_INPUT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__STYLE_PROPS = TEXT_INPUT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE__TEXT = TEXT_INPUT_UPDATE__TEXT;

	/**
	 * The number of structural features of the '<em>Rich Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE_FEATURE_COUNT = TEXT_INPUT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rich Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_INPUT_UPDATE_OPERATION_COUNT = TEXT_INPUT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerUpdateImpl <em>Color Picker Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getColorPickerUpdate()
	 * @generated
	 */
	int COLOR_PICKER_UPDATE = 71;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__BINDING = TEXT_INPUT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__ID = TEXT_INPUT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__ENABLED = TEXT_INPUT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__STYLE_NAMES = TEXT_INPUT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__TOOLTIP = TEXT_INPUT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__STYLE_PROPS = TEXT_INPUT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE__TEXT = TEXT_INPUT_UPDATE__TEXT;

	/**
	 * The number of structural features of the '<em>Color Picker Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE_FEATURE_COUNT = TEXT_INPUT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color Picker Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_UPDATE_OPERATION_COUNT = TEXT_INPUT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabelUpdateImpl <em>Label Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabelUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabelUpdate()
	 * @generated
	 */
	int LABEL_UPDATE = 72;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__TEXT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl <em>List Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListUpdate()
	 * @generated
	 */
	int LIST_UPDATE = 73;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__ALLOW_MULTIPLE_SELECTION = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE__SELECTED_INDEX = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ComboboxUpdateImpl <em>Combobox Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ComboboxUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getComboboxUpdate()
	 * @generated
	 */
	int COMBOBOX_UPDATE = 74;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__BINDING = LIST_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__ID = LIST_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__ENABLED = LIST_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__STYLE_NAMES = LIST_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__TOOLTIP = LIST_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__STYLE_PROPS = LIST_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Allow Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__ALLOW_MULTIPLE_SELECTION = LIST_UPDATE__ALLOW_MULTIPLE_SELECTION;

	/**
	 * The feature id for the '<em><b>Selected Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE__SELECTED_INDEX = LIST_UPDATE__SELECTED_INDEX;

	/**
	 * The number of structural features of the '<em>Combobox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE_FEATURE_COUNT = LIST_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Combobox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBOBOX_UPDATE_OPERATION_COUNT = LIST_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListItemUpdateImpl <em>List Item Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListItemUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListItemUpdate()
	 * @generated
	 */
	int LIST_ITEM_UPDATE = 75;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__LABEL = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__VALUE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE__SELECTED = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Item Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>List Item Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonUpdateImpl <em>Button Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButtonUpdate()
	 * @generated
	 */
	int BUTTON_UPDATE = 76;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE__LABEL = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonUpdateImpl <em>Submit Button Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSubmitButtonUpdate()
	 * @generated
	 */
	int SUBMIT_BUTTON_UPDATE = 77;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__BINDING = BUTTON_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__ID = BUTTON_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__ENABLED = BUTTON_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__STYLE_NAMES = BUTTON_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__TOOLTIP = BUTTON_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__STYLE_PROPS = BUTTON_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE__LABEL = BUTTON_UPDATE__LABEL;

	/**
	 * The number of structural features of the '<em>Submit Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE_FEATURE_COUNT = BUTTON_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Submit Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_UPDATE_OPERATION_COUNT = BUTTON_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxUpdateImpl <em>Check Box Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCheckBoxUpdate()
	 * @generated
	 */
	int CHECK_BOX_UPDATE = 78;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__CHECKED = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE__VALUE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Box Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Check Box Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonUpdateImpl <em>Radio Button Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRadioButtonUpdate()
	 * @generated
	 */
	int RADIO_BUTTON_UPDATE = 79;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__BINDING = CHECK_BOX_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__ID = CHECK_BOX_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__ENABLED = CHECK_BOX_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__STYLE_NAMES = CHECK_BOX_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__TOOLTIP = CHECK_BOX_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__STYLE_PROPS = CHECK_BOX_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__CHECKED = CHECK_BOX_UPDATE__CHECKED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE__VALUE = CHECK_BOX_UPDATE__VALUE;

	/**
	 * The number of structural features of the '<em>Radio Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE_FEATURE_COUNT = CHECK_BOX_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radio Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_UPDATE_OPERATION_COUNT = CHECK_BOX_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonUpdateImpl <em>Image Button Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageButtonUpdate()
	 * @generated
	 */
	int IMAGE_BUTTON_UPDATE = 80;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__BINDING = BUTTON_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__ID = BUTTON_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__ENABLED = BUTTON_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__STYLE_NAMES = BUTTON_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__TOOLTIP = BUTTON_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__STYLE_PROPS = BUTTON_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__LABEL = BUTTON_UPDATE__LABEL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE__RESOURCE = BUTTON_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE_FEATURE_COUNT = BUTTON_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_UPDATE_OPERATION_COUNT = BUTTON_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonUpdateImpl <em>Toggle Button Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToggleButtonUpdate()
	 * @generated
	 */
	int TOGGLE_BUTTON_UPDATE = 81;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__BINDING = BUTTON_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__ID = BUTTON_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__ENABLED = BUTTON_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__STYLE_NAMES = BUTTON_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__TOOLTIP = BUTTON_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__STYLE_PROPS = BUTTON_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__LABEL = BUTTON_UPDATE__LABEL;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE__IS_SELECTED = BUTTON_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE_FEATURE_COUNT = BUTTON_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toggle Button Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_UPDATE_OPERATION_COUNT = BUTTON_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerUpdateImpl <em>Grid Container Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridContainerUpdate()
	 * @generated
	 */
	int GRID_CONTAINER_UPDATE = 82;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The number of structural features of the '<em>Grid Container Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grid Container Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CanvasUpdateImpl <em>Canvas Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CanvasUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCanvasUpdate()
	 * @generated
	 */
	int CANVAS_UPDATE = 83;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The number of structural features of the '<em>Canvas Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Canvas Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FormUpdateImpl <em>Form Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FormUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFormUpdate()
	 * @generated
	 */
	int FORM_UPDATE = 84;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The number of structural features of the '<em>Form Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.VBoxUpdateImpl <em>VBox Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.VBoxUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVBoxUpdate()
	 * @generated
	 */
	int VBOX_UPDATE = 85;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The number of structural features of the '<em>VBox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VBox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBOX_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HBoxUpdateImpl <em>HBox Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HBoxUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHBoxUpdate()
	 * @generated
	 */
	int HBOX_UPDATE = 86;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__BINDING = VBOX_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__ID = VBOX_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__ENABLED = VBOX_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__STYLE_NAMES = VBOX_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__TOOLTIP = VBOX_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE__STYLE_PROPS = VBOX_UPDATE__STYLE_PROPS;

	/**
	 * The number of structural features of the '<em>HBox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE_FEATURE_COUNT = VBOX_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HBox Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBOX_UPDATE_OPERATION_COUNT = VBOX_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HtmlViewUpdateImpl <em>Html View Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HtmlViewUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHtmlViewUpdate()
	 * @generated
	 */
	int HTML_VIEW_UPDATE = 87;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__CONTENT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE__SOURCE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Html View Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Html View Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_VIEW_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabItemUpdateImpl <em>Tab Item Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabItemUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabItemUpdate()
	 * @generated
	 */
	int TAB_ITEM_UPDATE = 88;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE__TITLE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab Item Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tab Item Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageUpdateImpl <em>Image Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageUpdate()
	 * @generated
	 */
	int IMAGE_UPDATE = 89;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE__RESOURCE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogUpdateImpl <em>Dialog Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DialogUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogUpdate()
	 * @generated
	 */
	int DIALOG_UPDATE = 90;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__VISIBLE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__TITLE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE__TEXT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dialog Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dialog Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarUpdateImpl <em>Progress Bar Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getProgressBarUpdate()
	 * @generated
	 */
	int PROGRESS_BAR_UPDATE = 91;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__ID = UI_ELEMENT_UPDATE__ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__ENABLED = UI_ELEMENT_UPDATE__ENABLED;

	/**
	 * The feature id for the '<em><b>Style Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__STYLE_NAMES = UI_ELEMENT_UPDATE__STYLE_NAMES;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__TOOLTIP = UI_ELEMENT_UPDATE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Style Props</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__STYLE_PROPS = UI_ELEMENT_UPDATE__STYLE_PROPS;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__PERCENTAGE = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE__MAX = UI_ELEMENT_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Progress Bar Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Progress Bar Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_UPDATE_OPERATION_COUNT = UI_ELEMENT_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.JavaScriptUpdateImpl <em>Java Script Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.JavaScriptUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getJavaScriptUpdate()
	 * @generated
	 */
	int JAVA_SCRIPT_UPDATE = 92;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_UPDATE__BINDING = UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_UPDATE__SCRIPT = UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Script Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_UPDATE_FEATURE_COUNT = UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Script Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_UPDATE_OPERATION_COUNT = UPDATE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GuiPluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPluginImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGuiPlugin()
	 * @generated
	 */
	int GUI_PLUGIN = 93;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_PLUGIN__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_PLUGIN__CLASS_NAME = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_PLUGIN_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_PLUGIN_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 94;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.VAlignment <em>VAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.VAlignment
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVAlignment()
	 * @generated
	 */
	int VALIGNMENT = 95;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.Orientation
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 96;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.ImageFillModes <em>Image Fill Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageFillModes
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageFillModes()
	 * @generated
	 */
	int IMAGE_FILL_MODES = 97;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.DirectionHV <em>Direction HV</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.DirectionHV
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDirectionHV()
	 * @generated
	 */
	int DIRECTION_HV = 98;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.DialogueButtons <em>Dialogue Buttons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogueButtons
	 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogueButtons()
	 * @generated
	 */
	int DIALOGUE_BUTTONS = 99;

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIRequest <em>GUI Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIRequest
	 * @generated
	 */
	EClass getGUIRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIEvent <em>GUI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIEvent
	 * @generated
	 */
	EClass getGUIEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.GUIEvent#getEventData <em>Event Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Data</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIEvent#getEventData()
	 * @see #getGUIEvent()
	 * @generated
	 */
	EReference getGUIEvent_EventData();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication <em>GUI Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Application</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIApplication
	 * @generated
	 */
	EClass getGUIApplication();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getWindow()
	 * @see #getGUIApplication()
	 * @generated
	 */
	EReference getGUIApplication_Window();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getApplicationId()
	 * @see #getGUIApplication()
	 * @generated
	 */
	EAttribute getGUIApplication_ApplicationId();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getStyleResource <em>Style Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIApplication#getStyleResource()
	 * @see #getGUIApplication()
	 * @generated
	 */
	EReference getGUIApplication_StyleResource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate <em>GUI Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIUpdate
	 * @generated
	 */
	EClass getGUIUpdate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updates</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getUpdates()
	 * @see #getGUIUpdate()
	 * @generated
	 */
	EReference getGUIUpdate_Updates();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#getApplicationId()
	 * @see #getGUIUpdate()
	 * @generated
	 */
	EAttribute getGUIUpdate_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#isValidated <em>Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GUIUpdate#isValidated()
	 * @see #getGUIUpdate()
	 * @generated
	 */
	EAttribute getGUIUpdate_Validated();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.UpdateInfo <em>Update Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Info</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UpdateInfo
	 * @generated
	 */
	EClass getUpdateInfo();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.WindowUpdate <em>Window Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.WindowUpdate
	 * @generated
	 */
	EClass getWindowUpdate();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.WindowUpdate#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.WindowUpdate#getWindow()
	 * @see #getWindowUpdate()
	 * @generated
	 */
	EReference getWindowUpdate_Window();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate <em>Style Sheet Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Sheet Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate
	 * @generated
	 */
	EClass getStyleSheetUpdate();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate#getStyleResource <em>Style Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate#getStyleResource()
	 * @see #getStyleSheetUpdate()
	 * @generated
	 */
	EReference getStyleSheetUpdate_StyleResource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement <em>Remove UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove UI Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement
	 * @generated
	 */
	EClass getRemoveUIElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement#getElementId()
	 * @see #getRemoveUIElement()
	 * @generated
	 */
	EAttribute getRemoveUIElement_ElementId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement <em>Add UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add UI Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement
	 * @generated
	 */
	EClass getAddUIElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getParentId()
	 * @see #getAddUIElement()
	 * @generated
	 */
	EAttribute getAddUIElement_ParentId();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElement <em>New Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElement()
	 * @see #getAddUIElement()
	 * @generated
	 */
	EReference getAddUIElement_NewElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElementRef <em>New Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Element Ref</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getNewElementRef()
	 * @see #getAddUIElement()
	 * @generated
	 */
	EReference getAddUIElement_NewElementRef();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddUIElement#getPosition()
	 * @see #getAddUIElement()
	 * @generated
	 */
	EAttribute getAddUIElement_Position();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AddTableCell <em>Add Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Table Cell</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddTableCell
	 * @generated
	 */
	EClass getAddTableCell();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AddTableCell#getColumnPosition <em>Column Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Position</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AddTableCell#getColumnPosition()
	 * @see #getAddTableCell()
	 * @generated
	 */
	EAttribute getAddTableCell_ColumnPosition();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell <em>Remove Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Table Cell</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell
	 * @generated
	 */
	EClass getRemoveTableCell();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell#isRemoveRow <em>Remove Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Row</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RemoveTableCell#isRemoveRow()
	 * @see #getRemoveTableCell()
	 * @generated
	 */
	EAttribute getRemoveTableCell_RemoveRow();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.MoveUIElement <em>Move UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move UI Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MoveUIElement
	 * @generated
	 */
	EClass getMoveUIElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getNewParentId <em>New Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Parent Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getNewParentId()
	 * @see #getMoveUIElement()
	 * @generated
	 */
	EAttribute getMoveUIElement_NewParentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getElementId()
	 * @see #getMoveUIElement()
	 * @generated
	 */
	EAttribute getMoveUIElement_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MoveUIElement#getPosition()
	 * @see #getMoveUIElement()
	 * @generated
	 */
	EAttribute getMoveUIElement_Position();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement
	 * @generated
	 */
	EClass getUIElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getId()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getEnabled()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Enabled();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getLayout()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getSupportedEvents <em>Supported Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Events</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getSupportedEvents()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_SupportedEvents();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getStyleNames <em>Style Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Names</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getStyleNames()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_StyleNames();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getX()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getY()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Y();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getSemanticContent <em>Semantic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getSemanticContent()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_SemanticContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adapter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getAdapter()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Adapter();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElement#getTooltip()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Tooltip();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent <em>Supported Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SupportedEvent
	 * @generated
	 */
	EClass getSupportedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpretation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getInterpretation()
	 * @see #getSupportedEvent()
	 * @generated
	 */
	EReference getSupportedEvent_Interpretation();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getEventType()
	 * @see #getSupportedEvent()
	 * @generated
	 */
	EReference getSupportedEvent_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SupportedEvent#getAnnotation()
	 * @see #getSupportedEvent()
	 * @generated
	 */
	EReference getSupportedEvent_Annotation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer <em>Abstract Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer
	 * @generated
	 */
	EClass getAbstractContainer();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#getArrayAdapter <em>Array Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Adapter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#getArrayAdapter()
	 * @see #getAbstractContainer()
	 * @generated
	 */
	EReference getAbstractContainer_ArrayAdapter();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#contains() <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#contains()
	 * @generated
	 */
	EOperation getAbstractContainer__Contains();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#addChild(de.dfki.iui.mmds.core.model.io.gui.UIElement) <em>Add Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Child</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#addChild(de.dfki.iui.mmds.core.model.io.gui.UIElement)
	 * @generated
	 */
	EOperation getAbstractContainer__AddChild__UIElement();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#addChild(de.dfki.iui.mmds.core.emf.datatypes.BInteger, de.dfki.iui.mmds.core.model.io.gui.UIElement) <em>Add Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Child</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#addChild(de.dfki.iui.mmds.core.emf.datatypes.BInteger, de.dfki.iui.mmds.core.model.io.gui.UIElement)
	 * @generated
	 */
	EOperation getAbstractContainer__AddChild__BInteger_UIElement();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#removeChild(de.dfki.iui.mmds.core.model.io.gui.UIElement) <em>Remove Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Child</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer#removeChild(de.dfki.iui.mmds.core.model.io.gui.UIElement)
	 * @generated
	 */
	EOperation getAbstractContainer__RemoveChild__UIElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Window#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Window#getTitle()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.Window#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Window#getPlugins()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Plugins();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.TabView <em>Tab View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab View</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabView
	 * @generated
	 */
	EClass getTabView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.TabView#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabView#getItems()
	 * @see #getTabView()
	 * @generated
	 */
	EReference getTabView_Items();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate <em>UI Element Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Element Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate
	 * @generated
	 */
	EClass getUIElementUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getId()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EAttribute getUIElementUpdate_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getEnabled()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EAttribute getUIElementUpdate_Enabled();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleNames <em>Style Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Names</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleNames()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EAttribute getUIElementUpdate_StyleNames();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getTooltip()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EAttribute getUIElementUpdate_Tooltip();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleProps <em>Style Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style Props</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleProps()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EReference getUIElementUpdate_StyleProps();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate <em>Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate
	 * @generated
	 */
	EClass getTextInputUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate#getText()
	 * @see #getTextInputUpdate()
	 * @generated
	 */
	EAttribute getTextInputUpdate_Text();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate <em>Labeled Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Text Input Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate
	 * @generated
	 */
	EClass getLabeledTextInputUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate#getLabel()
	 * @see #getLabeledTextInputUpdate()
	 * @generated
	 */
	EAttribute getLabeledTextInputUpdate_Label();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate <em>Rich Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Input Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate
	 * @generated
	 */
	EClass getRichTextInputUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate <em>Color Picker Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Picker Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate
	 * @generated
	 */
	EClass getColorPickerUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.LabelUpdate <em>Label Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabelUpdate
	 * @generated
	 */
	EClass getLabelUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.LabelUpdate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabelUpdate#getText()
	 * @see #getLabelUpdate()
	 * @generated
	 */
	EAttribute getLabelUpdate_Text();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate <em>List Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListUpdate
	 * @generated
	 */
	EClass getListUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getAllowMultipleSelection <em>Allow Multiple Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple Selection</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getAllowMultipleSelection()
	 * @see #getListUpdate()
	 * @generated
	 */
	EAttribute getListUpdate_AllowMultipleSelection();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getSelectedIndex <em>Selected Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Index</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListUpdate#getSelectedIndex()
	 * @see #getListUpdate()
	 * @generated
	 */
	EAttribute getListUpdate_SelectedIndex();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate <em>Combobox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combobox Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate
	 * @generated
	 */
	EClass getComboboxUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate <em>List Item Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate
	 * @generated
	 */
	EClass getListItemUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getLabel()
	 * @see #getListItemUpdate()
	 * @generated
	 */
	EAttribute getListItemUpdate_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getValue()
	 * @see #getListItemUpdate()
	 * @generated
	 */
	EAttribute getListItemUpdate_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate#getSelected()
	 * @see #getListItemUpdate()
	 * @generated
	 */
	EAttribute getListItemUpdate_Selected();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate <em>Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate
	 * @generated
	 */
	EClass getButtonUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate#getLabel()
	 * @see #getButtonUpdate()
	 * @generated
	 */
	EAttribute getButtonUpdate_Label();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate <em>Submit Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Button Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate
	 * @generated
	 */
	EClass getSubmitButtonUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate <em>Check Box Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate
	 * @generated
	 */
	EClass getCheckBoxUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate#getChecked()
	 * @see #getCheckBoxUpdate()
	 * @generated
	 */
	EAttribute getCheckBoxUpdate_Checked();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate#getValue()
	 * @see #getCheckBoxUpdate()
	 * @generated
	 */
	EAttribute getCheckBoxUpdate_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate <em>Radio Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate
	 * @generated
	 */
	EClass getRadioButtonUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate <em>Image Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Button Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate
	 * @generated
	 */
	EClass getImageButtonUpdate();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate#getResource()
	 * @see #getImageButtonUpdate()
	 * @generated
	 */
	EReference getImageButtonUpdate_Resource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate <em>Toggle Button Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Button Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate
	 * @generated
	 */
	EClass getToggleButtonUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate#getIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate#getIsSelected()
	 * @see #getToggleButtonUpdate()
	 * @generated
	 */
	EAttribute getToggleButtonUpdate_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate <em>Grid Container Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Container Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate
	 * @generated
	 */
	EClass getGridContainerUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate <em>Canvas Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate
	 * @generated
	 */
	EClass getCanvasUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.FormUpdate <em>Form Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FormUpdate
	 * @generated
	 */
	EClass getFormUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate <em>VBox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBox Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate
	 * @generated
	 */
	EClass getVBoxUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate <em>HBox Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBox Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate
	 * @generated
	 */
	EClass getHBoxUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate <em>Html View Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html View Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate
	 * @generated
	 */
	EClass getHtmlViewUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate#getContent()
	 * @see #getHtmlViewUpdate()
	 * @generated
	 */
	EAttribute getHtmlViewUpdate_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate#getSource()
	 * @see #getHtmlViewUpdate()
	 * @generated
	 */
	EAttribute getHtmlViewUpdate_Source();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate <em>Tab Item Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Item Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate
	 * @generated
	 */
	EClass getTabItemUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate#getTitle()
	 * @see #getTabItemUpdate()
	 * @generated
	 */
	EAttribute getTabItemUpdate_Title();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageUpdate <em>Image Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageUpdate
	 * @generated
	 */
	EClass getImageUpdate();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.ImageUpdate#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageUpdate#getResource()
	 * @see #getImageUpdate()
	 * @generated
	 */
	EReference getImageUpdate_Resource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.DialogUpdate <em>Dialog Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogUpdate
	 * @generated
	 */
	EClass getDialogUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getVisible()
	 * @see #getDialogUpdate()
	 * @generated
	 */
	EAttribute getDialogUpdate_Visible();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getTitle()
	 * @see #getDialogUpdate()
	 * @generated
	 */
	EAttribute getDialogUpdate_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogUpdate#getText()
	 * @see #getDialogUpdate()
	 * @generated
	 */
	EAttribute getDialogUpdate_Text();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate <em>Progress Bar Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate
	 * @generated
	 */
	EClass getProgressBarUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate#getPercentage()
	 * @see #getProgressBarUpdate()
	 * @generated
	 */
	EAttribute getProgressBarUpdate_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate#getMax()
	 * @see #getProgressBarUpdate()
	 * @generated
	 */
	EAttribute getProgressBarUpdate_Max();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate <em>Java Script Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate
	 * @generated
	 */
	EClass getJavaScriptUpdate();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Script</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.JavaScriptUpdate#getScript()
	 * @see #getJavaScriptUpdate()
	 * @generated
	 */
	EAttribute getJavaScriptUpdate_Script();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GuiPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPlugin
	 * @generated
	 */
	EClass getGuiPlugin();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GuiPlugin#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPlugin#getClassName()
	 * @see #getGuiPlugin()
	 * @generated
	 */
	EAttribute getGuiPlugin_ClassName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.TabItem <em>Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItem
	 * @generated
	 */
	EClass getTabItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.TabItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItem#getTitle()
	 * @see #getTabItem()
	 * @generated
	 */
	EAttribute getTabItem_Title();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.TabItem#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TabItem#getElement()
	 * @see #getTabItem()
	 * @generated
	 */
	EReference getTabItem_Element();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ElementAdapter <em>Element Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Adapter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ElementAdapter
	 * @generated
	 */
	EClass getElementAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.ElementAdapter#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ElementAdapter#getPattern()
	 * @see #getElementAdapter()
	 * @generated
	 */
	EReference getElementAdapter_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.ElementAdapter#getAdapterMapping <em>Adapter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adapter Mapping</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ElementAdapter#getAdapterMapping()
	 * @see #getElementAdapter()
	 * @generated
	 */
	EReference getElementAdapter_AdapterMapping();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AdapterMapping <em>Adapter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Mapping</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AdapterMapping
	 * @generated
	 */
	EClass getAdapterMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AdapterMapping#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AdapterMapping#getFeature()
	 * @see #getAdapterMapping()
	 * @generated
	 */
	EAttribute getAdapterMapping_Feature();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AdapterMapping#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AdapterMapping#getExpression()
	 * @see #getAdapterMapping()
	 * @generated
	 */
	EAttribute getAdapterMapping_Expression();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter <em>Array Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Adapter</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter
	 * @generated
	 */
	EClass getArrayAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getElement()
	 * @see #getArrayAdapter()
	 * @generated
	 */
	EReference getArrayAdapter_Element();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getPattern()
	 * @see #getArrayAdapter()
	 * @generated
	 */
	EReference getArrayAdapter_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ArrayAdapter#getExpression()
	 * @see #getArrayAdapter()
	 * @generated
	 */
	EAttribute getArrayAdapter_Expression();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GridContainer <em>Grid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Container</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridContainer
	 * @generated
	 */
	EClass getGridContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.GridContainer#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridContainer#getRow()
	 * @see #getGridContainer()
	 * @generated
	 */
	EReference getGridContainer_Row();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow <em>Grid Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Row</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow
	 * @generated
	 */
	EClass getGridRow();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getRowId <em>Row Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow#getRowId()
	 * @see #getGridRow()
	 * @generated
	 */
	EAttribute getGridRow_RowId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow#getHeight()
	 * @see #getGridRow()
	 * @generated
	 */
	EAttribute getGridRow_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getIsPercentage <em>Is Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow#getIsPercentage()
	 * @see #getGridRow()
	 * @generated
	 */
	EAttribute getGridRow_IsPercentage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.GridRow#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridRow#getItem()
	 * @see #getGridRow()
	 * @generated
	 */
	EReference getGridRow_Item();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem <em>Grid Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem
	 * @generated
	 */
	EClass getGridItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getWidth()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getIsPercentage <em>Is Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getIsPercentage()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_IsPercentage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getRowSpan <em>Row Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Span</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getRowSpan()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_RowSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getColumnSpan <em>Column Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Span</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getColumnSpan()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_ColumnSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getAlignment()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.GridItem#getValignment <em>Valignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridItem#getValignment()
	 * @see #getGridItem()
	 * @generated
	 */
	EAttribute getGridItem_Valignment();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonBar <em>Button Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Bar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonBar
	 * @generated
	 */
	EClass getButtonBar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonBar#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonBar#getButton()
	 * @see #getButtonBar()
	 * @generated
	 */
	EReference getButtonBar_Button();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ButtonBar#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ButtonBar#getOrientation()
	 * @see #getButtonBar()
	 * @generated
	 */
	EAttribute getButtonBar_Orientation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView <em>HTML View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML View</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HTMLView
	 * @generated
	 */
	EClass getHTMLView();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HTMLView#getContent()
	 * @see #getHTMLView()
	 * @generated
	 */
	EAttribute getHTMLView_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HTMLView#getSource()
	 * @see #getHTMLView()
	 * @generated
	 */
	EAttribute getHTMLView_Source();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.HTMLView#getLoadingIndicator <em>Loading Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loading Indicator</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HTMLView#getLoadingIndicator()
	 * @see #getHTMLView()
	 * @generated
	 */
	EReference getHTMLView_LoadingIndicator();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.DisplayContextView <em>Display Context View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Context View</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DisplayContextView
	 * @generated
	 */
	EClass getDisplayContextView();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DisplayContextView#getDisplayContextName <em>Display Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Context Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DisplayContextView#getDisplayContextName()
	 * @see #getDisplayContextView()
	 * @generated
	 */
	EAttribute getDisplayContextView_DisplayContextName();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout#getHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout#getWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Width();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margin</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout#getMargin()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Margin();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout#getHorizontalAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Layout#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Layout#getVerticalAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_VerticalAlignment();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin#getTop()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Top();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin#getLeft()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Left();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin#getRight()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin#getBottom()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Margin#isIsPercentage <em>Is Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Margin#isIsPercentage()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_IsPercentage();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout <em>Absolute Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Layout</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout
	 * @generated
	 */
	EClass getAbsoluteLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getX()
	 * @see #getAbsoluteLayout()
	 * @generated
	 */
	EAttribute getAbsoluteLayout_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getZ()
	 * @see #getAbsoluteLayout()
	 * @generated
	 */
	EAttribute getAbsoluteLayout_Z();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout#getY()
	 * @see #getAbsoluteLayout()
	 * @generated
	 */
	EAttribute getAbsoluteLayout_Y();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Layout</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FlowLayout
	 * @generated
	 */
	EClass getFlowLayout();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ToolTip <em>Tool Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Tip</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToolTip
	 * @generated
	 */
	EClass getToolTip();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ToolTip#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToolTip#getText()
	 * @see #getToolTip()
	 * @generated
	 */
	EAttribute getToolTip_Text();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.ToolTip#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToolTip#getElement()
	 * @see #getToolTip()
	 * @generated
	 */
	EReference getToolTip_Element();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SubmitButton
	 * @generated
	 */
	EClass getSubmitButton();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.CheckBox#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CheckBox#getChecked()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Checked();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getRadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButton#getRadioGroup()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_RadioGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButton#getValue()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.RadioButton#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RadioButton#getChecked()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Checked();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInput#getText()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInput#getMultiLine()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_MultiLine();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.TextInput#getSoftKeyboard <em>Soft Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soft Keyboard</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.TextInput#getSoftKeyboard()
	 * @see #getTextInput()
	 * @generated
	 */
	EReference getTextInput_SoftKeyboard();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput <em>Labeled Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Text Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput
	 * @generated
	 */
	EClass getLabeledTextInput();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput#getLabel()
	 * @see #getLabeledTextInput()
	 * @generated
	 */
	EAttribute getLabeledTextInput_Label();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.RichTextInput <em>Rich Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Input</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.RichTextInput
	 * @generated
	 */
	EClass getRichTextInput();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.List#getAllowMultipleSelection <em>Allow Multiple Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple Selection</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.List#getAllowMultipleSelection()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_AllowMultipleSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.gui.List#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.List#getItem()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Item();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.List#getSelectedIndex <em>Selected Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Index</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.List#getSelectedIndex()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_SelectedIndex();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItem#getLabel()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItem#getValue()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ListItem#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ListItem#getSelected()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Selected();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ColorPicker <em>Color Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Picker</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ColorPicker
	 * @generated
	 */
	EClass getColorPicker();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBar
	 * @generated
	 */
	EClass getProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getPercentage()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getDeterminate <em>Determinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determinate</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getDeterminate()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Determinate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ProgressBar#getMax()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Max();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Image#isSmooth <em>Smooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smooth</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image#isSmooth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Smooth();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getFillMode <em>Fill Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image#getFillMode()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_FillMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getLoadingIndicator <em>Loading Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loading Indicator</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image#getLoadingIndicator()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_LoadingIndicator();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Image#isCanManipulate <em>Can Manipulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manipulate</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image#isCanManipulate()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_CanManipulate();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.Image#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Image#getResource()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Resource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery <em>Image Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Gallery</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageGallery
	 * @generated
	 */
	EClass getImageGallery();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getImage()
	 * @see #getImageGallery()
	 * @generated
	 */
	EReference getImageGallery_Image();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getButtonBar <em>Button Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Button Bar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageGallery#getButtonBar()
	 * @see #getImageGallery()
	 * @generated
	 */
	EReference getImageGallery_ButtonBar();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ImageGallery#isIsSlideShow <em>Is Slide Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Slide Show</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageGallery#isIsSlideShow()
	 * @see #getImageGallery()
	 * @generated
	 */
	EAttribute getImageGallery_IsSlideShow();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer <em>Media Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Player</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer
	 * @generated
	 */
	EClass getMediaPlayer();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#isIsPlaying <em>Is Playing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Playing</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#isIsPlaying()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_IsPlaying();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Media</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getMedia()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EReference getMediaPlayer_Media();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getAutoPlay <em>Auto Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Play</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getAutoPlay()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_AutoPlay();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getShowControls <em>Show Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Controls</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getShowControls()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_ShowControls();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getWidth()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getHeight()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.MediaPlayer#getVisible()
	 * @see #getMediaPlayer()
	 * @generated
	 */
	EAttribute getMediaPlayer_Visible();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.NumericStepper <em>Numeric Stepper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Stepper</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.NumericStepper
	 * @generated
	 */
	EClass getNumericStepper();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.NumericStepper#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.NumericStepper#getMinValue()
	 * @see #getNumericStepper()
	 * @generated
	 */
	EAttribute getNumericStepper_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.NumericStepper#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.NumericStepper#getMaxValue()
	 * @see #getNumericStepper()
	 * @generated
	 */
	EAttribute getNumericStepper_MaxValue();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar <em>Scrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scrollbar</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar
	 * @generated
	 */
	EClass getScrollbar();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getMaxValue()
	 * @see #getScrollbar()
	 * @generated
	 */
	EAttribute getScrollbar_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getMinValue()
	 * @see #getScrollbar()
	 * @generated
	 */
	EAttribute getScrollbar_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getValue()
	 * @see #getScrollbar()
	 * @generated
	 */
	EAttribute getScrollbar_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Scrollbar#getOrientation()
	 * @see #getScrollbar()
	 * @generated
	 */
	EAttribute getScrollbar_Orientation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView <em>Calendar View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar View</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CalendarView
	 * @generated
	 */
	EClass getCalendarView();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDisplayMode()
	 * @see #getCalendarView()
	 * @generated
	 */
	EAttribute getCalendarView_DisplayMode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CalendarView#getDate()
	 * @see #getCalendarView()
	 * @generated
	 */
	EAttribute getCalendarView_Date();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard <em>Soft Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Keyboard</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard
	 * @generated
	 */
	EClass getSoftKeyboard();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getKeyboardLayout <em>Keyboard Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyboard Layout</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getKeyboardLayout()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_KeyboardLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isUseDictionary <em>Use Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Dictionary</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isUseDictionary()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_UseDictionary();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionaryLanguage <em>Dictionary Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary Language</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionaryLanguage()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_DictionaryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnabled()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_Enabled();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dictionary</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#getDictionary()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_Dictionary();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnableSpeechInputIcon <em>Enable Speech Input Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Speech Input Icon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard#isEnableSpeechInputIcon()
	 * @see #getSoftKeyboard()
	 * @generated
	 */
	EAttribute getSoftKeyboard_EnableSpeechInputIcon();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox <em>Dialog Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Box</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogBox
	 * @generated
	 */
	EClass getDialogBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getModal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modal</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogBox#getModal()
	 * @see #getDialogBox()
	 * @generated
	 */
	EAttribute getDialogBox_Modal();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.DialogBox#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buttons</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogBox#getButtons()
	 * @see #getDialogBox()
	 * @generated
	 */
	EAttribute getDialogBox_Buttons();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox <em>Abstract Dialog Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dialog Box</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox
	 * @generated
	 */
	EClass getAbstractDialogBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getTitle()
	 * @see #getAbstractDialogBox()
	 * @generated
	 */
	EAttribute getAbstractDialogBox_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getText()
	 * @see #getAbstractDialogBox()
	 * @generated
	 */
	EAttribute getAbstractDialogBox_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getVisible()
	 * @see #getAbstractDialogBox()
	 * @generated
	 */
	EAttribute getAbstractDialogBox_Visible();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.CustomDialog <em>Custom Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Dialog</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CustomDialog
	 * @generated
	 */
	EClass getCustomDialog();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.CustomDialog#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.CustomDialog#getElement()
	 * @see #getCustomDialog()
	 * @generated
	 */
	EReference getCustomDialog_Element();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.FileChooser <em>File Chooser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Chooser</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.FileChooser
	 * @generated
	 */
	EClass getFileChooser();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButton <em>Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButton
	 * @generated
	 */
	EClass getToggleButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.ToggleButton#isIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ToggleButton#isIsSelected()
	 * @see #getToggleButton()
	 * @generated
	 */
	EAttribute getToggleButton_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButton <em>Image Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Button</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButton
	 * @generated
	 */
	EClass getImageButton();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.gui.ImageButton#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageButton#getResource()
	 * @see #getImageButton()
	 * @generated
	 */
	EReference getImageButton_Resource();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem <em>Grid Header Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Header Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem
	 * @generated
	 */
	EClass getGridHeaderItem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.VBox <em>VBox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBox</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VBox
	 * @generated
	 */
	EClass getVBox();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.HBox <em>HBox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBox</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.HBox
	 * @generated
	 */
	EClass getHBox();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui.Div#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Div#getContent()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Content();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.VAlignment <em>VAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VAlignment</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.VAlignment
	 * @generated
	 */
	EEnum getVAlignment();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.ImageFillModes <em>Image Fill Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Fill Modes</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.ImageFillModes
	 * @generated
	 */
	EEnum getImageFillModes();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.DirectionHV <em>Direction HV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction HV</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DirectionHV
	 * @generated
	 */
	EEnum getDirectionHV();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.gui.DialogueButtons <em>Dialogue Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dialogue Buttons</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.DialogueButtons
	 * @generated
	 */
	EEnum getDialogueButtons();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuiFactory getGuiFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.GUIRequest <em>GUI Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.GUIRequest
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIRequest()
		 * @generated
		 */
		EClass GUI_REQUEST = eINSTANCE.getGUIRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIEventImpl <em>GUI Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIEvent()
		 * @generated
		 */
		EClass GUI_EVENT = eINSTANCE.getGUIEvent();

		/**
		 * The meta object literal for the '<em><b>Event Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_EVENT__EVENT_DATA = eINSTANCE.getGUIEvent_EventData();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl <em>GUI Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIApplicationImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIApplication()
		 * @generated
		 */
		EClass GUI_APPLICATION = eINSTANCE.getGUIApplication();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_APPLICATION__WINDOW = eINSTANCE.getGUIApplication_Window();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_APPLICATION__APPLICATION_ID = eINSTANCE.getGUIApplication_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Style Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_APPLICATION__STYLE_RESOURCE = eINSTANCE.getGUIApplication_StyleResource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl <em>GUI Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GUIUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGUIUpdate()
		 * @generated
		 */
		EClass GUI_UPDATE = eINSTANCE.getGUIUpdate();

		/**
		 * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_UPDATE__UPDATES = eINSTANCE.getGUIUpdate_Updates();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_UPDATE__APPLICATION_ID = eINSTANCE.getGUIUpdate_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Validated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_UPDATE__VALIDATED = eINSTANCE.getGUIUpdate_Validated();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.UpdateInfo <em>Update Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.UpdateInfo
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUpdateInfo()
		 * @generated
		 */
		EClass UPDATE_INFO = eINSTANCE.getUpdateInfo();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.WindowUpdateImpl <em>Window Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.WindowUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getWindowUpdate()
		 * @generated
		 */
		EClass WINDOW_UPDATE = eINSTANCE.getWindowUpdate();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW_UPDATE__WINDOW = eINSTANCE.getWindowUpdate_Window();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.StyleSheetUpdateImpl <em>Style Sheet Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.StyleSheetUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getStyleSheetUpdate()
		 * @generated
		 */
		EClass STYLE_SHEET_UPDATE = eINSTANCE.getStyleSheetUpdate();

		/**
		 * The meta object literal for the '<em><b>Style Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET_UPDATE__STYLE_RESOURCE = eINSTANCE.getStyleSheetUpdate_StyleResource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RemoveUIElementImpl <em>Remove UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RemoveUIElementImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRemoveUIElement()
		 * @generated
		 */
		EClass REMOVE_UI_ELEMENT = eINSTANCE.getRemoveUIElement();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_UI_ELEMENT__ELEMENT_ID = eINSTANCE.getRemoveUIElement_ElementId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl <em>Add UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AddUIElementImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAddUIElement()
		 * @generated
		 */
		EClass ADD_UI_ELEMENT = eINSTANCE.getAddUIElement();

		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UI_ELEMENT__PARENT_ID = eINSTANCE.getAddUIElement_ParentId();

		/**
		 * The meta object literal for the '<em><b>New Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_UI_ELEMENT__NEW_ELEMENT = eINSTANCE.getAddUIElement_NewElement();

		/**
		 * The meta object literal for the '<em><b>New Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_UI_ELEMENT__NEW_ELEMENT_REF = eINSTANCE.getAddUIElement_NewElementRef();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UI_ELEMENT__POSITION = eINSTANCE.getAddUIElement_Position();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AddTableCellImpl <em>Add Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AddTableCellImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAddTableCell()
		 * @generated
		 */
		EClass ADD_TABLE_CELL = eINSTANCE.getAddTableCell();

		/**
		 * The meta object literal for the '<em><b>Column Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TABLE_CELL__COLUMN_POSITION = eINSTANCE.getAddTableCell_ColumnPosition();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RemoveTableCellImpl <em>Remove Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RemoveTableCellImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRemoveTableCell()
		 * @generated
		 */
		EClass REMOVE_TABLE_CELL = eINSTANCE.getRemoveTableCell();

		/**
		 * The meta object literal for the '<em><b>Remove Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE_CELL__REMOVE_ROW = eINSTANCE.getRemoveTableCell_RemoveRow();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MoveUIElementImpl <em>Move UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MoveUIElementImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMoveUIElement()
		 * @generated
		 */
		EClass MOVE_UI_ELEMENT = eINSTANCE.getMoveUIElement();

		/**
		 * The meta object literal for the '<em><b>New Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_UI_ELEMENT__NEW_PARENT_ID = eINSTANCE.getMoveUIElement_NewParentId();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_UI_ELEMENT__ELEMENT_ID = eINSTANCE.getMoveUIElement_ElementId();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_UI_ELEMENT__POSITION = eINSTANCE.getMoveUIElement_Position();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl <em>UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.UIElementImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUIElement()
		 * @generated
		 */
		EClass UI_ELEMENT = eINSTANCE.getUIElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__ID = eINSTANCE.getUIElement_Id();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__ENABLED = eINSTANCE.getUIElement_Enabled();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__LAYOUT = eINSTANCE.getUIElement_Layout();

		/**
		 * The meta object literal for the '<em><b>Supported Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__SUPPORTED_EVENTS = eINSTANCE.getUIElement_SupportedEvents();

		/**
		 * The meta object literal for the '<em><b>Style Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__STYLE_NAMES = eINSTANCE.getUIElement_StyleNames();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__X = eINSTANCE.getUIElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__Y = eINSTANCE.getUIElement_Y();

		/**
		 * The meta object literal for the '<em><b>Semantic Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__SEMANTIC_CONTENT = eINSTANCE.getUIElement_SemanticContent();

		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__ADAPTER = eINSTANCE.getUIElement_Adapter();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__TOOLTIP = eINSTANCE.getUIElement_Tooltip();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SupportedEventImpl <em>Supported Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SupportedEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSupportedEvent()
		 * @generated
		 */
		EClass SUPPORTED_EVENT = eINSTANCE.getSupportedEvent();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_EVENT__INTERPRETATION = eINSTANCE.getSupportedEvent_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_EVENT__EVENT_TYPE = eINSTANCE.getSupportedEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_EVENT__ANNOTATION = eINSTANCE.getSupportedEvent_Annotation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractContainer <em>Abstract Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractContainer
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbstractContainer()
		 * @generated
		 */
		EClass ABSTRACT_CONTAINER = eINSTANCE.getAbstractContainer();

		/**
		 * The meta object literal for the '<em><b>Array Adapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTAINER__ARRAY_ADAPTER = eINSTANCE.getAbstractContainer_ArrayAdapter();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTAINER___CONTAINS = eINSTANCE.getAbstractContainer__Contains();

		/**
		 * The meta object literal for the '<em><b>Add Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTAINER___ADD_CHILD__UIELEMENT = eINSTANCE.getAbstractContainer__AddChild__UIElement();

		/**
		 * The meta object literal for the '<em><b>Add Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTAINER___ADD_CHILD__BINTEGER_UIELEMENT = eINSTANCE.getAbstractContainer__AddChild__BInteger_UIElement();

		/**
		 * The meta object literal for the '<em><b>Remove Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTAINER___REMOVE_CHILD__UIELEMENT = eINSTANCE.getAbstractContainer__RemoveChild__UIElement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ContainerImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.WindowImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TITLE = eINSTANCE.getWindow_Title();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__PLUGINS = eINSTANCE.getWindow_Plugins();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabViewImpl <em>Tab View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabViewImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabView()
		 * @generated
		 */
		EClass TAB_VIEW = eINSTANCE.getTabView();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_VIEW__ITEMS = eINSTANCE.getTabView_Items();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl <em>UI Element Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.UIElementUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getUIElementUpdate()
		 * @generated
		 */
		EClass UI_ELEMENT_UPDATE = eINSTANCE.getUIElementUpdate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT_UPDATE__ID = eINSTANCE.getUIElementUpdate_Id();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT_UPDATE__ENABLED = eINSTANCE.getUIElementUpdate_Enabled();

		/**
		 * The meta object literal for the '<em><b>Style Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT_UPDATE__STYLE_NAMES = eINSTANCE.getUIElementUpdate_StyleNames();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT_UPDATE__TOOLTIP = eINSTANCE.getUIElementUpdate_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Style Props</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT_UPDATE__STYLE_PROPS = eINSTANCE.getUIElementUpdate_StyleProps();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputUpdateImpl <em>Text Input Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TextInputUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTextInputUpdate()
		 * @generated
		 */
		EClass TEXT_INPUT_UPDATE = eINSTANCE.getTextInputUpdate();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_UPDATE__TEXT = eINSTANCE.getTextInputUpdate_Text();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputUpdateImpl <em>Labeled Text Input Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabeledTextInputUpdate()
		 * @generated
		 */
		EClass LABELED_TEXT_INPUT_UPDATE = eINSTANCE.getLabeledTextInputUpdate();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_TEXT_INPUT_UPDATE__LABEL = eINSTANCE.getLabeledTextInputUpdate_Label();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputUpdateImpl <em>Rich Text Input Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRichTextInputUpdate()
		 * @generated
		 */
		EClass RICH_TEXT_INPUT_UPDATE = eINSTANCE.getRichTextInputUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerUpdateImpl <em>Color Picker Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getColorPickerUpdate()
		 * @generated
		 */
		EClass COLOR_PICKER_UPDATE = eINSTANCE.getColorPickerUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabelUpdateImpl <em>Label Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabelUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabelUpdate()
		 * @generated
		 */
		EClass LABEL_UPDATE = eINSTANCE.getLabelUpdate();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_UPDATE__TEXT = eINSTANCE.getLabelUpdate_Text();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl <em>List Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListUpdate()
		 * @generated
		 */
		EClass LIST_UPDATE = eINSTANCE.getListUpdate();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_UPDATE__ALLOW_MULTIPLE_SELECTION = eINSTANCE.getListUpdate_AllowMultipleSelection();

		/**
		 * The meta object literal for the '<em><b>Selected Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_UPDATE__SELECTED_INDEX = eINSTANCE.getListUpdate_SelectedIndex();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ComboboxUpdateImpl <em>Combobox Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ComboboxUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getComboboxUpdate()
		 * @generated
		 */
		EClass COMBOBOX_UPDATE = eINSTANCE.getComboboxUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListItemUpdateImpl <em>List Item Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListItemUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListItemUpdate()
		 * @generated
		 */
		EClass LIST_ITEM_UPDATE = eINSTANCE.getListItemUpdate();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_UPDATE__LABEL = eINSTANCE.getListItemUpdate_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_UPDATE__VALUE = eINSTANCE.getListItemUpdate_Value();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_UPDATE__SELECTED = eINSTANCE.getListItemUpdate_Selected();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonUpdateImpl <em>Button Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButtonUpdate()
		 * @generated
		 */
		EClass BUTTON_UPDATE = eINSTANCE.getButtonUpdate();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_UPDATE__LABEL = eINSTANCE.getButtonUpdate_Label();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonUpdateImpl <em>Submit Button Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSubmitButtonUpdate()
		 * @generated
		 */
		EClass SUBMIT_BUTTON_UPDATE = eINSTANCE.getSubmitButtonUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxUpdateImpl <em>Check Box Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCheckBoxUpdate()
		 * @generated
		 */
		EClass CHECK_BOX_UPDATE = eINSTANCE.getCheckBoxUpdate();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX_UPDATE__CHECKED = eINSTANCE.getCheckBoxUpdate_Checked();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX_UPDATE__VALUE = eINSTANCE.getCheckBoxUpdate_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonUpdateImpl <em>Radio Button Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRadioButtonUpdate()
		 * @generated
		 */
		EClass RADIO_BUTTON_UPDATE = eINSTANCE.getRadioButtonUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonUpdateImpl <em>Image Button Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageButtonUpdate()
		 * @generated
		 */
		EClass IMAGE_BUTTON_UPDATE = eINSTANCE.getImageButtonUpdate();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_BUTTON_UPDATE__RESOURCE = eINSTANCE.getImageButtonUpdate_Resource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonUpdateImpl <em>Toggle Button Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToggleButtonUpdate()
		 * @generated
		 */
		EClass TOGGLE_BUTTON_UPDATE = eINSTANCE.getToggleButtonUpdate();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON_UPDATE__IS_SELECTED = eINSTANCE.getToggleButtonUpdate_IsSelected();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerUpdateImpl <em>Grid Container Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridContainerUpdate()
		 * @generated
		 */
		EClass GRID_CONTAINER_UPDATE = eINSTANCE.getGridContainerUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CanvasUpdateImpl <em>Canvas Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CanvasUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCanvasUpdate()
		 * @generated
		 */
		EClass CANVAS_UPDATE = eINSTANCE.getCanvasUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FormUpdateImpl <em>Form Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FormUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFormUpdate()
		 * @generated
		 */
		EClass FORM_UPDATE = eINSTANCE.getFormUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.VBoxUpdateImpl <em>VBox Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.VBoxUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVBoxUpdate()
		 * @generated
		 */
		EClass VBOX_UPDATE = eINSTANCE.getVBoxUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HBoxUpdateImpl <em>HBox Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HBoxUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHBoxUpdate()
		 * @generated
		 */
		EClass HBOX_UPDATE = eINSTANCE.getHBoxUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HtmlViewUpdateImpl <em>Html View Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HtmlViewUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHtmlViewUpdate()
		 * @generated
		 */
		EClass HTML_VIEW_UPDATE = eINSTANCE.getHtmlViewUpdate();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_VIEW_UPDATE__CONTENT = eINSTANCE.getHtmlViewUpdate_Content();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_VIEW_UPDATE__SOURCE = eINSTANCE.getHtmlViewUpdate_Source();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabItemUpdateImpl <em>Tab Item Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabItemUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabItemUpdate()
		 * @generated
		 */
		EClass TAB_ITEM_UPDATE = eINSTANCE.getTabItemUpdate();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_ITEM_UPDATE__TITLE = eINSTANCE.getTabItemUpdate_Title();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageUpdateImpl <em>Image Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageUpdate()
		 * @generated
		 */
		EClass IMAGE_UPDATE = eINSTANCE.getImageUpdate();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UPDATE__RESOURCE = eINSTANCE.getImageUpdate_Resource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogUpdateImpl <em>Dialog Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DialogUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogUpdate()
		 * @generated
		 */
		EClass DIALOG_UPDATE = eINSTANCE.getDialogUpdate();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_UPDATE__VISIBLE = eINSTANCE.getDialogUpdate_Visible();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_UPDATE__TITLE = eINSTANCE.getDialogUpdate_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_UPDATE__TEXT = eINSTANCE.getDialogUpdate_Text();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarUpdateImpl <em>Progress Bar Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getProgressBarUpdate()
		 * @generated
		 */
		EClass PROGRESS_BAR_UPDATE = eINSTANCE.getProgressBarUpdate();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR_UPDATE__PERCENTAGE = eINSTANCE.getProgressBarUpdate_Percentage();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR_UPDATE__MAX = eINSTANCE.getProgressBarUpdate_Max();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.JavaScriptUpdateImpl <em>Java Script Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.JavaScriptUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getJavaScriptUpdate()
		 * @generated
		 */
		EClass JAVA_SCRIPT_UPDATE = eINSTANCE.getJavaScriptUpdate();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SCRIPT_UPDATE__SCRIPT = eINSTANCE.getJavaScriptUpdate_Script();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GuiPluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPluginImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGuiPlugin()
		 * @generated
		 */
		EClass GUI_PLUGIN = eINSTANCE.getGuiPlugin();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_PLUGIN__CLASS_NAME = eINSTANCE.getGuiPlugin_ClassName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TabItemImpl <em>Tab Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TabItemImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTabItem()
		 * @generated
		 */
		EClass TAB_ITEM = eINSTANCE.getTabItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_ITEM__TITLE = eINSTANCE.getTabItem_Title();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_ITEM__ELEMENT = eINSTANCE.getTabItem_Element();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl <em>Element Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ElementAdapterImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getElementAdapter()
		 * @generated
		 */
		EClass ELEMENT_ADAPTER = eINSTANCE.getElementAdapter();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ADAPTER__PATTERN = eINSTANCE.getElementAdapter_Pattern();

		/**
		 * The meta object literal for the '<em><b>Adapter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ADAPTER__ADAPTER_MAPPING = eINSTANCE.getElementAdapter_AdapterMapping();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AdapterMappingImpl <em>Adapter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AdapterMappingImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAdapterMapping()
		 * @generated
		 */
		EClass ADAPTER_MAPPING = eINSTANCE.getAdapterMapping();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER_MAPPING__FEATURE = eINSTANCE.getAdapterMapping_Feature();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER_MAPPING__EXPRESSION = eINSTANCE.getAdapterMapping_Expression();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ArrayAdapterImpl <em>Array Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ArrayAdapterImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getArrayAdapter()
		 * @generated
		 */
		EClass ARRAY_ADAPTER = eINSTANCE.getArrayAdapter();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ADAPTER__ELEMENT = eINSTANCE.getArrayAdapter_Element();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ADAPTER__PATTERN = eINSTANCE.getArrayAdapter_Pattern();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_ADAPTER__EXPRESSION = eINSTANCE.getArrayAdapter_Expression();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl <em>Grid Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridContainerImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridContainer()
		 * @generated
		 */
		EClass GRID_CONTAINER = eINSTANCE.getGridContainer();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_CONTAINER__ROW = eINSTANCE.getGridContainer_Row();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl <em>Grid Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridRowImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridRow()
		 * @generated
		 */
		EClass GRID_ROW = eINSTANCE.getGridRow();

		/**
		 * The meta object literal for the '<em><b>Row Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ROW__ROW_ID = eINSTANCE.getGridRow_RowId();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ROW__HEIGHT = eINSTANCE.getGridRow_Height();

		/**
		 * The meta object literal for the '<em><b>Is Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ROW__IS_PERCENTAGE = eINSTANCE.getGridRow_IsPercentage();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_ROW__ITEM = eINSTANCE.getGridRow_Item();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl <em>Grid Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridItem()
		 * @generated
		 */
		EClass GRID_ITEM = eINSTANCE.getGridItem();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__WIDTH = eINSTANCE.getGridItem_Width();

		/**
		 * The meta object literal for the '<em><b>Is Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__IS_PERCENTAGE = eINSTANCE.getGridItem_IsPercentage();

		/**
		 * The meta object literal for the '<em><b>Row Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__ROW_SPAN = eINSTANCE.getGridItem_RowSpan();

		/**
		 * The meta object literal for the '<em><b>Column Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__COLUMN_SPAN = eINSTANCE.getGridItem_ColumnSpan();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__ALIGNMENT = eINSTANCE.getGridItem_Alignment();

		/**
		 * The meta object literal for the '<em><b>Valignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM__VALIGNMENT = eINSTANCE.getGridItem_Valignment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl <em>Button Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonBarImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButtonBar()
		 * @generated
		 */
		EClass BUTTON_BAR = eINSTANCE.getButtonBar();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_BAR__BUTTON = eINSTANCE.getButtonBar_Button();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_BAR__ORIENTATION = eINSTANCE.getButtonBar_Orientation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HTMLViewImpl <em>HTML View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HTMLViewImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHTMLView()
		 * @generated
		 */
		EClass HTML_VIEW = eINSTANCE.getHTMLView();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_VIEW__CONTENT = eINSTANCE.getHTMLView_Content();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_VIEW__SOURCE = eINSTANCE.getHTMLView_Source();

		/**
		 * The meta object literal for the '<em><b>Loading Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_VIEW__LOADING_INDICATOR = eINSTANCE.getHTMLView_LoadingIndicator();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DisplayContextViewImpl <em>Display Context View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DisplayContextViewImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDisplayContextView()
		 * @generated
		 */
		EClass DISPLAY_CONTEXT_VIEW = eINSTANCE.getDisplayContextView();

		/**
		 * The meta object literal for the '<em><b>Display Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_CONTEXT_VIEW__DISPLAY_CONTEXT_NAME = eINSTANCE.getDisplayContextView_DisplayContextName();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CanvasImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LayoutImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__HEIGHT = eINSTANCE.getLayout_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__WIDTH = eINSTANCE.getLayout_Width();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__MARGIN = eINSTANCE.getLayout_Margin();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__HORIZONTAL_ALIGNMENT = eINSTANCE.getLayout_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__VERTICAL_ALIGNMENT = eINSTANCE.getLayout_VerticalAlignment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__TOP = eINSTANCE.getMargin_Top();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__LEFT = eINSTANCE.getMargin_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__RIGHT = eINSTANCE.getMargin_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__BOTTOM = eINSTANCE.getMargin_Bottom();

		/**
		 * The meta object literal for the '<em><b>Is Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__IS_PERCENTAGE = eINSTANCE.getMargin_IsPercentage();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SizeImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.AbsoluteLayoutImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbsoluteLayout()
		 * @generated
		 */
		EClass ABSOLUTE_LAYOUT = eINSTANCE.getAbsoluteLayout();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_LAYOUT__X = eINSTANCE.getAbsoluteLayout_X();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_LAYOUT__Z = eINSTANCE.getAbsoluteLayout_Z();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_LAYOUT__Y = eINSTANCE.getAbsoluteLayout_Y();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FlowLayoutImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFlowLayout()
		 * @generated
		 */
		EClass FLOW_LAYOUT = eINSTANCE.getFlowLayout();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToolTipImpl <em>Tool Tip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToolTipImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToolTip()
		 * @generated
		 */
		EClass TOOL_TIP = eINSTANCE.getToolTip();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_TIP__TEXT = eINSTANCE.getToolTip_Text();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_TIP__ELEMENT = eINSTANCE.getToolTip_Element();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ButtonImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SubmitButtonImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSubmitButton()
		 * @generated
		 */
		EClass SUBMIT_BUTTON = eINSTANCE.getSubmitButton();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CheckBoxImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__CHECKED = eINSTANCE.getCheckBox_Checked();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RadioButtonImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Radio Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__RADIO_GROUP = eINSTANCE.getRadioButton_RadioGroup();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__VALUE = eINSTANCE.getRadioButton_Value();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__CHECKED = eINSTANCE.getRadioButton_Checked();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabelImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.TextInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT = eINSTANCE.getTextInput_Text();

		/**
		 * The meta object literal for the '<em><b>Multi Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__MULTI_LINE = eINSTANCE.getTextInput_MultiLine();

		/**
		 * The meta object literal for the '<em><b>Soft Keyboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_INPUT__SOFT_KEYBOARD = eINSTANCE.getTextInput_SoftKeyboard();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputImpl <em>Labeled Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.LabeledTextInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getLabeledTextInput()
		 * @generated
		 */
		EClass LABELED_TEXT_INPUT = eINSTANCE.getLabeledTextInput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_TEXT_INPUT__LABEL = eINSTANCE.getLabeledTextInput_Label();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputImpl <em>Rich Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.RichTextInputImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getRichTextInput()
		 * @generated
		 */
		EClass RICH_TEXT_INPUT = eINSTANCE.getRichTextInput();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__ALLOW_MULTIPLE_SELECTION = eINSTANCE.getList_AllowMultipleSelection();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEM = eINSTANCE.getList_Item();

		/**
		 * The meta object literal for the '<em><b>Selected Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SELECTED_INDEX = eINSTANCE.getList_SelectedIndex();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ListItemImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__LABEL = eINSTANCE.getListItem_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__VALUE = eINSTANCE.getListItem_Value();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__SELECTED = eINSTANCE.getListItem_Selected();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ComboBoxImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerImpl <em>Color Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ColorPickerImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getColorPicker()
		 * @generated
		 */
		EClass COLOR_PICKER = eINSTANCE.getColorPicker();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getProgressBar()
		 * @generated
		 */
		EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__PERCENTAGE = eINSTANCE.getProgressBar_Percentage();

		/**
		 * The meta object literal for the '<em><b>Determinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__DETERMINATE = eINSTANCE.getProgressBar_Determinate();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__MAX = eINSTANCE.getProgressBar_Max();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Smooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SMOOTH = eINSTANCE.getImage_Smooth();

		/**
		 * The meta object literal for the '<em><b>Fill Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__FILL_MODE = eINSTANCE.getImage_FillMode();

		/**
		 * The meta object literal for the '<em><b>Loading Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__LOADING_INDICATOR = eINSTANCE.getImage_LoadingIndicator();

		/**
		 * The meta object literal for the '<em><b>Can Manipulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CAN_MANIPULATE = eINSTANCE.getImage_CanManipulate();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__RESOURCE = eINSTANCE.getImage_Resource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl <em>Image Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageGalleryImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageGallery()
		 * @generated
		 */
		EClass IMAGE_GALLERY = eINSTANCE.getImageGallery();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_GALLERY__IMAGE = eINSTANCE.getImageGallery_Image();

		/**
		 * The meta object literal for the '<em><b>Button Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_GALLERY__BUTTON_BAR = eINSTANCE.getImageGallery_ButtonBar();

		/**
		 * The meta object literal for the '<em><b>Is Slide Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_GALLERY__IS_SLIDE_SHOW = eINSTANCE.getImageGallery_IsSlideShow();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl <em>Media Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.MediaPlayerImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getMediaPlayer()
		 * @generated
		 */
		EClass MEDIA_PLAYER = eINSTANCE.getMediaPlayer();

		/**
		 * The meta object literal for the '<em><b>Is Playing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__IS_PLAYING = eINSTANCE.getMediaPlayer_IsPlaying();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_PLAYER__MEDIA = eINSTANCE.getMediaPlayer_Media();

		/**
		 * The meta object literal for the '<em><b>Auto Play</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__AUTO_PLAY = eINSTANCE.getMediaPlayer_AutoPlay();

		/**
		 * The meta object literal for the '<em><b>Show Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__SHOW_CONTROLS = eINSTANCE.getMediaPlayer_ShowControls();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__WIDTH = eINSTANCE.getMediaPlayer_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__HEIGHT = eINSTANCE.getMediaPlayer_Height();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_PLAYER__VISIBLE = eINSTANCE.getMediaPlayer_Visible();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SpinnerImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSpinner()
		 * @generated
		 */
		EClass SPINNER = eINSTANCE.getSpinner();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.NumericStepperImpl <em>Numeric Stepper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.NumericStepperImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getNumericStepper()
		 * @generated
		 */
		EClass NUMERIC_STEPPER = eINSTANCE.getNumericStepper();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_STEPPER__MIN_VALUE = eINSTANCE.getNumericStepper_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_STEPPER__MAX_VALUE = eINSTANCE.getNumericStepper_MaxValue();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ScrollbarImpl <em>Scrollbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ScrollbarImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getScrollbar()
		 * @generated
		 */
		EClass SCROLLBAR = eINSTANCE.getScrollbar();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLBAR__MAX_VALUE = eINSTANCE.getScrollbar_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLBAR__MIN_VALUE = eINSTANCE.getScrollbar_MinValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLBAR__VALUE = eINSTANCE.getScrollbar_Value();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLBAR__ORIENTATION = eINSTANCE.getScrollbar_Orientation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CalendarViewImpl <em>Calendar View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CalendarViewImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCalendarView()
		 * @generated
		 */
		EClass CALENDAR_VIEW = eINSTANCE.getCalendarView();

		/**
		 * The meta object literal for the '<em><b>Display Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_VIEW__DISPLAY_MODE = eINSTANCE.getCalendarView_DisplayMode();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_VIEW__DATE = eINSTANCE.getCalendarView_Date();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl <em>Soft Keyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.SoftKeyboardImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getSoftKeyboard()
		 * @generated
		 */
		EClass SOFT_KEYBOARD = eINSTANCE.getSoftKeyboard();

		/**
		 * The meta object literal for the '<em><b>Keyboard Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__KEYBOARD_LAYOUT = eINSTANCE.getSoftKeyboard_KeyboardLayout();

		/**
		 * The meta object literal for the '<em><b>Use Dictionary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__USE_DICTIONARY = eINSTANCE.getSoftKeyboard_UseDictionary();

		/**
		 * The meta object literal for the '<em><b>Dictionary Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__DICTIONARY_LANGUAGE = eINSTANCE.getSoftKeyboard_DictionaryLanguage();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__ENABLED = eINSTANCE.getSoftKeyboard_Enabled();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__DICTIONARY = eINSTANCE.getSoftKeyboard_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Enable Speech Input Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_KEYBOARD__ENABLE_SPEECH_INPUT_ICON = eINSTANCE.getSoftKeyboard_EnableSpeechInputIcon();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl <em>Dialog Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DialogBoxImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogBox()
		 * @generated
		 */
		EClass DIALOG_BOX = eINSTANCE.getDialogBox();

		/**
		 * The meta object literal for the '<em><b>Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_BOX__MODAL = eINSTANCE.getDialogBox_Modal();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_BOX__BUTTONS = eINSTANCE.getDialogBox_Buttons();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox <em>Abstract Dialog Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAbstractDialogBox()
		 * @generated
		 */
		EClass ABSTRACT_DIALOG_BOX = eINSTANCE.getAbstractDialogBox();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIALOG_BOX__TITLE = eINSTANCE.getAbstractDialogBox_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIALOG_BOX__TEXT = eINSTANCE.getAbstractDialogBox_Text();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIALOG_BOX__VISIBLE = eINSTANCE.getAbstractDialogBox_Visible();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.CustomDialogImpl <em>Custom Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.CustomDialogImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getCustomDialog()
		 * @generated
		 */
		EClass CUSTOM_DIALOG = eINSTANCE.getCustomDialog();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DIALOG__ELEMENT = eINSTANCE.getCustomDialog_Element();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FileChooserImpl <em>File Chooser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FileChooserImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getFileChooser()
		 * @generated
		 */
		EClass FILE_CHOOSER = eINSTANCE.getFileChooser();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ToggleButtonImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getToggleButton()
		 * @generated
		 */
		EClass TOGGLE_BUTTON = eINSTANCE.getToggleButton();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON__IS_SELECTED = eINSTANCE.getToggleButton_IsSelected();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonImpl <em>Image Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.ImageButtonImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageButton()
		 * @generated
		 */
		EClass IMAGE_BUTTON = eINSTANCE.getImageButton();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_BUTTON__RESOURCE = eINSTANCE.getImageButton_Resource();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridHeaderItemImpl <em>Grid Header Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GridHeaderItemImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getGridHeaderItem()
		 * @generated
		 */
		EClass GRID_HEADER_ITEM = eINSTANCE.getGridHeaderItem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.FormImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.VBoxImpl <em>VBox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.VBoxImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVBox()
		 * @generated
		 */
		EClass VBOX = eINSTANCE.getVBox();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.HBoxImpl <em>HBox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.HBoxImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getHBox()
		 * @generated
		 */
		EClass HBOX = eINSTANCE.getHBox();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.DivImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__CONTENT = eINSTANCE.getDiv_Content();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.Alignment
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.VAlignment <em>VAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.VAlignment
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getVAlignment()
		 * @generated
		 */
		EEnum VALIGNMENT = eINSTANCE.getVAlignment();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.Orientation
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.ImageFillModes <em>Image Fill Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.ImageFillModes
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getImageFillModes()
		 * @generated
		 */
		EEnum IMAGE_FILL_MODES = eINSTANCE.getImageFillModes();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.DirectionHV <em>Direction HV</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.DirectionHV
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDirectionHV()
		 * @generated
		 */
		EEnum DIRECTION_HV = eINSTANCE.getDirectionHV();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.DialogueButtons <em>Dialogue Buttons</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.DialogueButtons
		 * @see de.dfki.iui.mmds.core.model.io.gui.impl.GuiPackageImpl#getDialogueButtons()
		 * @generated
		 */
		EEnum DIALOGUE_BUTTONS = eINSTANCE.getDialogueButtons();

	}

} //GuiPackage
