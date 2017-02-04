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
package de.dfki.iui.mmds.core.model.primitiveTasks.output;

import de.dfki.iui.mmds.core.model.primitiveTasks.ListItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item Selection Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.primitiveTasks.output.ListItemSelectionTask#getListItem <em>List Item</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage#getListItemSelectionTask()
 * @model
 * @generated
 */
public interface ListItemSelectionTask extends SelectionTaskBase {
	/**
	 * Returns the value of the '<em><b>List Item</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.primitiveTasks.ListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.primitiveTasks.output.OutputPackage#getListItemSelectionTask_ListItem()
	 * @model
	 * @generated
	 */
	EList<ListItem> getListItem();

} // ListItemSelectionTask
