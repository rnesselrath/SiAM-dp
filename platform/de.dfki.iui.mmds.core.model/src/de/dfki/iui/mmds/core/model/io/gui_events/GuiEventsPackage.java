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
package de.dfki.iui.mmds.core.model.io.gui_events;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.iui.mmds.core.model.base.BasePackage;

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
 * @see de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsFactory
 * @model kind="package"
 * @generated
 */
public interface GuiEventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gui_events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/gui/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gui_events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiEventsPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.GUIEventDataImpl <em>GUI Event Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GUIEventDataImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getGUIEventData()
	 * @generated
	 */
	int GUI_EVENT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_DATA__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_DATA__TARGET_ID = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_DATA__VALUE = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GUI Event Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_DATA_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GUI Event Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_EVENT_DATA_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.ClickEventImpl <em>Click Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.ClickEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getClickEvent()
	 * @generated
	 */
	int CLICK_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.DblClickEventImpl <em>Dbl Click Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.DblClickEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getDblClickEvent()
	 * @generated
	 */
	int DBL_CLICK_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBL_CLICK_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBL_CLICK_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBL_CLICK_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Dbl Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBL_CLICK_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dbl Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBL_CLICK_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseDownEventImpl <em>Mouse Down Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseDownEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseDownEvent()
	 * @generated
	 */
	int MOUSE_DOWN_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_DOWN_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_DOWN_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_DOWN_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mouse Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_DOWN_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_DOWN_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseMoveEventImpl <em>Mouse Move Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseMoveEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseMoveEvent()
	 * @generated
	 */
	int MOUSE_MOVE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOVE_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOVE_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOVE_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mouse Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOVE_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOVE_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOverEventImpl <em>Mouse Over Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOverEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseOverEvent()
	 * @generated
	 */
	int MOUSE_OVER_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OVER_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OVER_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OVER_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mouse Over Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OVER_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse Over Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OVER_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOutEventImpl <em>Mouse Out Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOutEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseOutEvent()
	 * @generated
	 */
	int MOUSE_OUT_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OUT_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OUT_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OUT_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mouse Out Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OUT_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse Out Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OUT_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseUpEventImpl <em>Mouse Up Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseUpEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseUpEvent()
	 * @generated
	 */
	int MOUSE_UP_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_UP_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_UP_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_UP_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mouse Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_UP_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_UP_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyPressEventImpl <em>Key Press Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyPressEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyPressEvent()
	 * @generated
	 */
	int KEY_PRESS_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Key Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyUpEventImpl <em>Key Up Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyUpEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyUpEvent()
	 * @generated
	 */
	int KEY_UP_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_UP_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_UP_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_UP_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Key Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_UP_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Up Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_UP_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyDownEventImpl <em>Key Down Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyDownEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyDownEvent()
	 * @generated
	 */
	int KEY_DOWN_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DOWN_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DOWN_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DOWN_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Key Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DOWN_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Down Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DOWN_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.ChangeEventImpl <em>Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.ChangeEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getChangeEvent()
	 * @generated
	 */
	int CHANGE_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__INDEX = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.BlurEventImpl <em>Blur Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.BlurEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getBlurEvent()
	 * @generated
	 */
	int BLUR_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Blur Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blur Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.FocusEventImpl <em>Focus Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.FocusEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getFocusEvent()
	 * @generated
	 */
	int FOCUS_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Focus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Focus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.SelectTextEventImpl <em>Select Text Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.SelectTextEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getSelectTextEvent()
	 * @generated
	 */
	int SELECT_TEXT_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TEXT_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TEXT_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TEXT_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Select Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TEXT_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TEXT_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.SubmitEventImpl <em>Submit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.SubmitEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getSubmitEvent()
	 * @generated
	 */
	int SUBMIT_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__ATTRIBUTES = GUI_EVENT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.DialogEventImpl <em>Dialog Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.DialogEventImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getDialogEvent()
	 * @generated
	 */
	int DIALOG_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_EVENT__BINDING = GUI_EVENT_DATA__BINDING;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_EVENT__TARGET_ID = GUI_EVENT_DATA__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_EVENT__VALUE = GUI_EVENT_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Dialog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_EVENT_FEATURE_COUNT = GUI_EVENT_DATA_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Dialog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_EVENT_OPERATION_COUNT = GUI_EVENT_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData <em>GUI Event Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Event Data</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData
	 * @generated
	 */
	EClass getGUIEventData();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData#getTargetId()
	 * @see #getGUIEventData()
	 * @generated
	 */
	EAttribute getGUIEventData_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData#getValue()
	 * @see #getGUIEventData()
	 * @generated
	 */
	EAttribute getGUIEventData_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent
	 * @generated
	 */
	EClass getClickEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent <em>Dbl Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dbl Click Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent
	 * @generated
	 */
	EClass getDblClickEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent <em>Mouse Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Down Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent
	 * @generated
	 */
	EClass getMouseDownEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent <em>Mouse Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Move Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent
	 * @generated
	 */
	EClass getMouseMoveEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent <em>Mouse Over Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Over Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent
	 * @generated
	 */
	EClass getMouseOverEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent <em>Mouse Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Out Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent
	 * @generated
	 */
	EClass getMouseOutEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent <em>Mouse Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Up Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent
	 * @generated
	 */
	EClass getMouseUpEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent <em>Key Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Press Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent
	 * @generated
	 */
	EClass getKeyPressEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent <em>Key Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Up Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent
	 * @generated
	 */
	EClass getKeyUpEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent <em>Key Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Down Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent
	 * @generated
	 */
	EClass getKeyDownEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent
	 * @generated
	 */
	EClass getChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent#getIndex()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EAttribute getChangeEvent_Index();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent <em>Blur Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blur Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent
	 * @generated
	 */
	EClass getBlurEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent <em>Focus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent
	 * @generated
	 */
	EClass getFocusEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent <em>Select Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Text Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent
	 * @generated
	 */
	EClass getSelectTextEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent <em>Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent
	 * @generated
	 */
	EClass getSubmitEvent();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent#getAttributes()
	 * @see #getSubmitEvent()
	 * @generated
	 */
	EReference getSubmitEvent_Attributes();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent <em>Dialog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Event</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent
	 * @generated
	 */
	EClass getDialogEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuiEventsFactory getGuiEventsFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.GUIEventDataImpl <em>GUI Event Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GUIEventDataImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getGUIEventData()
		 * @generated
		 */
		EClass GUI_EVENT_DATA = eINSTANCE.getGUIEventData();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_EVENT_DATA__TARGET_ID = eINSTANCE.getGUIEventData_TargetId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_EVENT_DATA__VALUE = eINSTANCE.getGUIEventData_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.ClickEventImpl <em>Click Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.ClickEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getClickEvent()
		 * @generated
		 */
		EClass CLICK_EVENT = eINSTANCE.getClickEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.DblClickEventImpl <em>Dbl Click Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.DblClickEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getDblClickEvent()
		 * @generated
		 */
		EClass DBL_CLICK_EVENT = eINSTANCE.getDblClickEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseDownEventImpl <em>Mouse Down Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseDownEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseDownEvent()
		 * @generated
		 */
		EClass MOUSE_DOWN_EVENT = eINSTANCE.getMouseDownEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseMoveEventImpl <em>Mouse Move Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseMoveEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseMoveEvent()
		 * @generated
		 */
		EClass MOUSE_MOVE_EVENT = eINSTANCE.getMouseMoveEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOverEventImpl <em>Mouse Over Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOverEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseOverEvent()
		 * @generated
		 */
		EClass MOUSE_OVER_EVENT = eINSTANCE.getMouseOverEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOutEventImpl <em>Mouse Out Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseOutEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseOutEvent()
		 * @generated
		 */
		EClass MOUSE_OUT_EVENT = eINSTANCE.getMouseOutEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseUpEventImpl <em>Mouse Up Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.MouseUpEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getMouseUpEvent()
		 * @generated
		 */
		EClass MOUSE_UP_EVENT = eINSTANCE.getMouseUpEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyPressEventImpl <em>Key Press Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyPressEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyPressEvent()
		 * @generated
		 */
		EClass KEY_PRESS_EVENT = eINSTANCE.getKeyPressEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyUpEventImpl <em>Key Up Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyUpEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyUpEvent()
		 * @generated
		 */
		EClass KEY_UP_EVENT = eINSTANCE.getKeyUpEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyDownEventImpl <em>Key Down Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.KeyDownEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getKeyDownEvent()
		 * @generated
		 */
		EClass KEY_DOWN_EVENT = eINSTANCE.getKeyDownEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.ChangeEventImpl <em>Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.ChangeEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getChangeEvent()
		 * @generated
		 */
		EClass CHANGE_EVENT = eINSTANCE.getChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_EVENT__INDEX = eINSTANCE.getChangeEvent_Index();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.BlurEventImpl <em>Blur Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.BlurEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getBlurEvent()
		 * @generated
		 */
		EClass BLUR_EVENT = eINSTANCE.getBlurEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.FocusEventImpl <em>Focus Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.FocusEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getFocusEvent()
		 * @generated
		 */
		EClass FOCUS_EVENT = eINSTANCE.getFocusEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.SelectTextEventImpl <em>Select Text Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.SelectTextEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getSelectTextEvent()
		 * @generated
		 */
		EClass SELECT_TEXT_EVENT = eINSTANCE.getSelectTextEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.SubmitEventImpl <em>Submit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.SubmitEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getSubmitEvent()
		 * @generated
		 */
		EClass SUBMIT_EVENT = eINSTANCE.getSubmitEvent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT_EVENT__ATTRIBUTES = eINSTANCE.getSubmitEvent_Attributes();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui_events.impl.DialogEventImpl <em>Dialog Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.DialogEventImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui_events.impl.GuiEventsPackageImpl#getDialogEvent()
		 * @generated
		 */
		EClass DIALOG_EVENT = eINSTANCE.getDialogEvent();

	}

} //GuiEventsPackage
