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

import org.eclipse.emf.common.util.EList;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for visual graphical components that can be combined and used within a predefined layout. These are often called "controls" or "widgets". The UIComponents might take the form of predesigned reusable components. The GUIElement is the base class for graphical elements displayed on the screen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getSupportedEvents <em>Supported Events</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getStyleNames <em>Style Names</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getX <em>X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getY <em>Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getSemanticContent <em>Semantic Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement()
 * @model abstract="true"
 * @generated
 */
public interface UIElement extends BObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique ID for the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Id()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString" required="true"
	 * @generated
	 */
	BString getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BString value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the component can accept user interaction.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Enabled()
	 * @model default="true" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getEnabled();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(BBoolean value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines properties that control how the container positions the element. This affects the rendering functionality of the container, not the element. Depending on the container in which the element is placed, a class derived from Layout should be specified that matchtes the container. If the container cannot find an appropriate layout, it uses default position and size values (which is usually not desired, except for simple containers such as View).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Layout()
	 * @model containment="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Supported Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.gui.SupportedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Events</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_SupportedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedEvent> getSupportedEvents();

	/**
	 * Returns the value of the '<em><b>Style Names</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Names</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_StyleNames()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	EList<BString> getStyleNames();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_X()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getX();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BInteger value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BInteger)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Y()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BInteger"
	 * @generated
	 */
	BInteger getY();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BInteger value);

	/**
	 * Returns the value of the '<em><b>Semantic Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Content</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_SemanticContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getSemanticContent();

	/**
	 * Returns the value of the '<em><b>Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter</em>' containment reference.
	 * @see #setAdapter(ElementAdapter)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Adapter()
	 * @model containment="true"
	 * @generated
	 */
	ElementAdapter getAdapter();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getAdapter <em>Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter</em>' containment reference.
	 * @see #getAdapter()
	 * @generated
	 */
	void setAdapter(ElementAdapter value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElement_Tooltip()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getTooltip();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElement#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(BString value);



} // UIElement
