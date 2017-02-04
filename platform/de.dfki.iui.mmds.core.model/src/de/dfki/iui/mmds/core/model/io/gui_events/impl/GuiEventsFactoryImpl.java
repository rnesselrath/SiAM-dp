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
package de.dfki.iui.mmds.core.model.io.gui_events.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsFactory;
import de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiEventsFactoryImpl extends EFactoryImpl implements GuiEventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuiEventsFactory init() {
		try {
			GuiEventsFactory theGuiEventsFactory = (GuiEventsFactory)EPackage.Registry.INSTANCE.getEFactory(GuiEventsPackage.eNS_URI);
			if (theGuiEventsFactory != null) {
				return theGuiEventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuiEventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEventsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GuiEventsPackage.CLICK_EVENT: return createClickEvent();
			case GuiEventsPackage.DBL_CLICK_EVENT: return createDblClickEvent();
			case GuiEventsPackage.MOUSE_DOWN_EVENT: return createMouseDownEvent();
			case GuiEventsPackage.MOUSE_MOVE_EVENT: return createMouseMoveEvent();
			case GuiEventsPackage.MOUSE_OVER_EVENT: return createMouseOverEvent();
			case GuiEventsPackage.MOUSE_OUT_EVENT: return createMouseOutEvent();
			case GuiEventsPackage.MOUSE_UP_EVENT: return createMouseUpEvent();
			case GuiEventsPackage.KEY_PRESS_EVENT: return createKeyPressEvent();
			case GuiEventsPackage.KEY_UP_EVENT: return createKeyUpEvent();
			case GuiEventsPackage.KEY_DOWN_EVENT: return createKeyDownEvent();
			case GuiEventsPackage.CHANGE_EVENT: return createChangeEvent();
			case GuiEventsPackage.BLUR_EVENT: return createBlurEvent();
			case GuiEventsPackage.FOCUS_EVENT: return createFocusEvent();
			case GuiEventsPackage.SELECT_TEXT_EVENT: return createSelectTextEvent();
			case GuiEventsPackage.SUBMIT_EVENT: return createSubmitEvent();
			case GuiEventsPackage.DIALOG_EVENT: return createDialogEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickEvent createClickEvent() {
		ClickEventImpl clickEvent = new ClickEventImpl();
		return clickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblClickEvent createDblClickEvent() {
		DblClickEventImpl dblClickEvent = new DblClickEventImpl();
		return dblClickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouseDownEvent createMouseDownEvent() {
		MouseDownEventImpl mouseDownEvent = new MouseDownEventImpl();
		return mouseDownEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouseMoveEvent createMouseMoveEvent() {
		MouseMoveEventImpl mouseMoveEvent = new MouseMoveEventImpl();
		return mouseMoveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouseOverEvent createMouseOverEvent() {
		MouseOverEventImpl mouseOverEvent = new MouseOverEventImpl();
		return mouseOverEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouseOutEvent createMouseOutEvent() {
		MouseOutEventImpl mouseOutEvent = new MouseOutEventImpl();
		return mouseOutEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouseUpEvent createMouseUpEvent() {
		MouseUpEventImpl mouseUpEvent = new MouseUpEventImpl();
		return mouseUpEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPressEvent createKeyPressEvent() {
		KeyPressEventImpl keyPressEvent = new KeyPressEventImpl();
		return keyPressEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyUpEvent createKeyUpEvent() {
		KeyUpEventImpl keyUpEvent = new KeyUpEventImpl();
		return keyUpEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDownEvent createKeyDownEvent() {
		KeyDownEventImpl keyDownEvent = new KeyDownEventImpl();
		return keyDownEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlurEvent createBlurEvent() {
		BlurEventImpl blurEvent = new BlurEventImpl();
		return blurEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FocusEvent createFocusEvent() {
		FocusEventImpl focusEvent = new FocusEventImpl();
		return focusEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectTextEvent createSelectTextEvent() {
		SelectTextEventImpl selectTextEvent = new SelectTextEventImpl();
		return selectTextEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitEvent createSubmitEvent() {
		SubmitEventImpl submitEvent = new SubmitEventImpl();
		return submitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogEvent createDialogEvent() {
		DialogEventImpl dialogEvent = new DialogEventImpl();
		return dialogEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEventsPackage getGuiEventsPackage() {
		return (GuiEventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GuiEventsPackage getPackage() {
		return GuiEventsPackage.eINSTANCE;
	}

} //GuiEventsFactoryImpl
