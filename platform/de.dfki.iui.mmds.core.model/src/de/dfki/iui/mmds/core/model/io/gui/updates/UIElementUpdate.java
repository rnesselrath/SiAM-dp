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
package de.dfki.iui.mmds.core.model.io.gui.updates;

import org.eclipse.emf.common.util.EMap;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.gui.UpdateInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Element Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate#getUpdateMap <em>Update Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesPackage#getUIElementUpdate()
 * @model abstract="true"
 * @generated
 */
public interface UIElementUpdate extends UpdateInfo {
	/**
	 * Returns the value of the '<em><b>Update Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.dfki.iui.mmds.core.emf.datatypes.BString},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Map</em>' map.
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesPackage#getUIElementUpdate_UpdateMap()
	 * @model mapType="de.dfki.iui.mmds.core.model.base.StringToBStringMapEntry<org.eclipse.emf.ecore.EString, de.dfki.iui.mmds.core.model.base.BString>" ordered="false"
	 * @generated
	 */
	EMap<String, BString> getUpdateMap();

} // UIElementUpdate
