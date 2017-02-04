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
package de.dfki.iui.mmds.core.model.task;

import de.dfki.iui.mmds.core.model.base.MediaResource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMeta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TMetaData#getMedia <em>Media</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TMetaData#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TMetaData#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTMetaData()
 * @model
 * @generated
 */
public interface TMetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.MediaResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTMetaData_Media()
	 * @model
	 * @generated
	 */
	EList<MediaResource> getMedia();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(TDescription)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTMetaData_Description()
	 * @model containment="true"
	 * @generated
	 */
	TDescription getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TMetaData#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(TDescription value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.task.THistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTMetaData_History()
	 * @model containment="true"
	 * @generated
	 */
	EList<THistory> getHistory();

} // TMetaData
