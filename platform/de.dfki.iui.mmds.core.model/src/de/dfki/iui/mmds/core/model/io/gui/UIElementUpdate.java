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
import org.eclipse.emf.common.util.EMap;

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BString;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Element Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleNames <em>Style Names</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getStyleProps <em>Style Props</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate()
 * @model abstract="true"
 * @generated
 */
public interface UIElementUpdate extends UpdateInfo {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate_Id()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getId <em>Id</em>}' attribute.
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
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate_Enabled()
	 * @model default="true" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getEnabled();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(BBoolean value);

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
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate_StyleNames()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	EList<BString> getStyleNames();

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
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate_Tooltip()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getTooltip();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(BString value);

	/**
	 * Returns the value of the '<em><b>Style Props</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Props</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Props</em>' map.
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getUIElementUpdate_StyleProps()
	 * @model mapType="de.dfki.iui.mmds.core.model.base.StringToBStringMapEntry<org.eclipse.emf.ecore.EString, de.dfki.iui.mmds.core.model.base.BString>"
	 * @generated
	 */
	EMap<String, BString> getStyleProps();
} // UIElementUpdate
