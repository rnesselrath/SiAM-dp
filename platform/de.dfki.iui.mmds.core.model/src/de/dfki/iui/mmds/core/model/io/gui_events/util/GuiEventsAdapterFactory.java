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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui_events.GuiEventsPackage
 * @generated
 */
public class GuiEventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiEventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiEventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GuiEventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiEventsSwitch<Adapter> modelSwitch =
		new GuiEventsSwitch<Adapter>() {
			@Override
			public Adapter caseGUIEventData(GUIEventData object) {
				return createGUIEventDataAdapter();
			}
			@Override
			public Adapter caseClickEvent(ClickEvent object) {
				return createClickEventAdapter();
			}
			@Override
			public Adapter caseDblClickEvent(DblClickEvent object) {
				return createDblClickEventAdapter();
			}
			@Override
			public Adapter caseMouseDownEvent(MouseDownEvent object) {
				return createMouseDownEventAdapter();
			}
			@Override
			public Adapter caseMouseMoveEvent(MouseMoveEvent object) {
				return createMouseMoveEventAdapter();
			}
			@Override
			public Adapter caseMouseOverEvent(MouseOverEvent object) {
				return createMouseOverEventAdapter();
			}
			@Override
			public Adapter caseMouseOutEvent(MouseOutEvent object) {
				return createMouseOutEventAdapter();
			}
			@Override
			public Adapter caseMouseUpEvent(MouseUpEvent object) {
				return createMouseUpEventAdapter();
			}
			@Override
			public Adapter caseKeyPressEvent(KeyPressEvent object) {
				return createKeyPressEventAdapter();
			}
			@Override
			public Adapter caseKeyUpEvent(KeyUpEvent object) {
				return createKeyUpEventAdapter();
			}
			@Override
			public Adapter caseKeyDownEvent(KeyDownEvent object) {
				return createKeyDownEventAdapter();
			}
			@Override
			public Adapter caseChangeEvent(ChangeEvent object) {
				return createChangeEventAdapter();
			}
			@Override
			public Adapter caseBlurEvent(BlurEvent object) {
				return createBlurEventAdapter();
			}
			@Override
			public Adapter caseFocusEvent(FocusEvent object) {
				return createFocusEventAdapter();
			}
			@Override
			public Adapter caseSelectTextEvent(SelectTextEvent object) {
				return createSelectTextEventAdapter();
			}
			@Override
			public Adapter caseSubmitEvent(SubmitEvent object) {
				return createSubmitEventAdapter();
			}
			@Override
			public Adapter caseDialogEvent(DialogEvent object) {
				return createDialogEventAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData <em>GUI Event Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData
	 * @generated
	 */
	public Adapter createGUIEventDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent
	 * @generated
	 */
	public Adapter createClickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent <em>Dbl Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent
	 * @generated
	 */
	public Adapter createDblClickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent <em>Mouse Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent
	 * @generated
	 */
	public Adapter createMouseDownEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent <em>Mouse Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent
	 * @generated
	 */
	public Adapter createMouseMoveEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent <em>Mouse Over Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent
	 * @generated
	 */
	public Adapter createMouseOverEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent <em>Mouse Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent
	 * @generated
	 */
	public Adapter createMouseOutEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent <em>Mouse Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent
	 * @generated
	 */
	public Adapter createMouseUpEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent <em>Key Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent
	 * @generated
	 */
	public Adapter createKeyPressEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent <em>Key Up Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent
	 * @generated
	 */
	public Adapter createKeyUpEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent <em>Key Down Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent
	 * @generated
	 */
	public Adapter createKeyDownEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent
	 * @generated
	 */
	public Adapter createChangeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent <em>Blur Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent
	 * @generated
	 */
	public Adapter createBlurEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent <em>Focus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent
	 * @generated
	 */
	public Adapter createFocusEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent <em>Select Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent
	 * @generated
	 */
	public Adapter createSelectTextEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent <em>Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent
	 * @generated
	 */
	public Adapter createSubmitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent <em>Dialog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent
	 * @generated
	 */
	public Adapter createDialogEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GuiEventsAdapterFactory
