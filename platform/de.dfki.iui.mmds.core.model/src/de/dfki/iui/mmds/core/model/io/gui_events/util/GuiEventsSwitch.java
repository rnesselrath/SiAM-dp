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
package de.dfki.iui.mmds.core.model.io.gui_events.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage
 * @generated
 */
public class GuiEventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiEventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEventsSwitch() {
		if (modelPackage == null) {
			modelPackage = GuiEventsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GuiEventsPackage.GUI_EVENT_DATA: {
				GUIEventData guiEventData = (GUIEventData)theEObject;
				T result = caseGUIEventData(guiEventData);
				if (result == null) result = caseBObject(guiEventData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.CLICK_EVENT: {
				ClickEvent clickEvent = (ClickEvent)theEObject;
				T result = caseClickEvent(clickEvent);
				if (result == null) result = caseGUIEventData(clickEvent);
				if (result == null) result = caseBObject(clickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.DBL_CLICK_EVENT: {
				DblClickEvent dblClickEvent = (DblClickEvent)theEObject;
				T result = caseDblClickEvent(dblClickEvent);
				if (result == null) result = caseGUIEventData(dblClickEvent);
				if (result == null) result = caseBObject(dblClickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.MOUSE_DOWN_EVENT: {
				MouseDownEvent mouseDownEvent = (MouseDownEvent)theEObject;
				T result = caseMouseDownEvent(mouseDownEvent);
				if (result == null) result = caseGUIEventData(mouseDownEvent);
				if (result == null) result = caseBObject(mouseDownEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.MOUSE_MOVE_EVENT: {
				MouseMoveEvent mouseMoveEvent = (MouseMoveEvent)theEObject;
				T result = caseMouseMoveEvent(mouseMoveEvent);
				if (result == null) result = caseGUIEventData(mouseMoveEvent);
				if (result == null) result = caseBObject(mouseMoveEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.MOUSE_OVER_EVENT: {
				MouseOverEvent mouseOverEvent = (MouseOverEvent)theEObject;
				T result = caseMouseOverEvent(mouseOverEvent);
				if (result == null) result = caseGUIEventData(mouseOverEvent);
				if (result == null) result = caseBObject(mouseOverEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.MOUSE_OUT_EVENT: {
				MouseOutEvent mouseOutEvent = (MouseOutEvent)theEObject;
				T result = caseMouseOutEvent(mouseOutEvent);
				if (result == null) result = caseGUIEventData(mouseOutEvent);
				if (result == null) result = caseBObject(mouseOutEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.MOUSE_UP_EVENT: {
				MouseUpEvent mouseUpEvent = (MouseUpEvent)theEObject;
				T result = caseMouseUpEvent(mouseUpEvent);
				if (result == null) result = caseGUIEventData(mouseUpEvent);
				if (result == null) result = caseBObject(mouseUpEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.KEY_PRESS_EVENT: {
				KeyPressEvent keyPressEvent = (KeyPressEvent)theEObject;
				T result = caseKeyPressEvent(keyPressEvent);
				if (result == null) result = caseGUIEventData(keyPressEvent);
				if (result == null) result = caseBObject(keyPressEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.KEY_UP_EVENT: {
				KeyUpEvent keyUpEvent = (KeyUpEvent)theEObject;
				T result = caseKeyUpEvent(keyUpEvent);
				if (result == null) result = caseGUIEventData(keyUpEvent);
				if (result == null) result = caseBObject(keyUpEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.KEY_DOWN_EVENT: {
				KeyDownEvent keyDownEvent = (KeyDownEvent)theEObject;
				T result = caseKeyDownEvent(keyDownEvent);
				if (result == null) result = caseGUIEventData(keyDownEvent);
				if (result == null) result = caseBObject(keyDownEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.CHANGE_EVENT: {
				ChangeEvent changeEvent = (ChangeEvent)theEObject;
				T result = caseChangeEvent(changeEvent);
				if (result == null) result = caseGUIEventData(changeEvent);
				if (result == null) result = caseBObject(changeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.BLUR_EVENT: {
				BlurEvent blurEvent = (BlurEvent)theEObject;
				T result = caseBlurEvent(blurEvent);
				if (result == null) result = caseGUIEventData(blurEvent);
				if (result == null) result = caseBObject(blurEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.FOCUS_EVENT: {
				FocusEvent focusEvent = (FocusEvent)theEObject;
				T result = caseFocusEvent(focusEvent);
				if (result == null) result = caseGUIEventData(focusEvent);
				if (result == null) result = caseBObject(focusEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.SELECT_TEXT_EVENT: {
				SelectTextEvent selectTextEvent = (SelectTextEvent)theEObject;
				T result = caseSelectTextEvent(selectTextEvent);
				if (result == null) result = caseGUIEventData(selectTextEvent);
				if (result == null) result = caseBObject(selectTextEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.SUBMIT_EVENT: {
				SubmitEvent submitEvent = (SubmitEvent)theEObject;
				T result = caseSubmitEvent(submitEvent);
				if (result == null) result = caseGUIEventData(submitEvent);
				if (result == null) result = caseBObject(submitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiEventsPackage.DIALOG_EVENT: {
				DialogEvent dialogEvent = (DialogEvent)theEObject;
				T result = caseDialogEvent(dialogEvent);
				if (result == null) result = caseGUIEventData(dialogEvent);
				if (result == null) result = caseBObject(dialogEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Event Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Event Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIEventData(GUIEventData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickEvent(ClickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dbl Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dbl Click Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDblClickEvent(DblClickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse Down Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouseDownEvent(MouseDownEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse Move Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouseMoveEvent(MouseMoveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse Over Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse Over Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouseOverEvent(MouseOverEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse Out Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse Out Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouseOutEvent(MouseOutEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse Up Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouseUpEvent(MouseUpEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Press Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPressEvent(KeyPressEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Up Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyUpEvent(KeyUpEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Down Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyDownEvent(KeyDownEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEvent(ChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blur Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blur Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlurEvent(BlurEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Focus Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Focus Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFocusEvent(FocusEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Text Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectTextEvent(SelectTextEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmitEvent(SubmitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogEvent(DialogEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GuiEventsSwitch
