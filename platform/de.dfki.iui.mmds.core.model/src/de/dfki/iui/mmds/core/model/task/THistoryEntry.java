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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>THistory Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getTime <em>Time</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getData <em>Data</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#isSystemAction <em>System Action</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry()
 * @model
 * @generated
 */
public interface THistoryEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(THistoryEntry)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry_Predecessor()
	 * @model
	 * @generated
	 */
	THistoryEntry getPredecessor();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(THistoryEntry value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(THistoryEntry)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry_Successor()
	 * @model
	 * @generated
	 */
	THistoryEntry getSuccessor();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(THistoryEntry value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getData();

	/**
	 * Returns the value of the '<em><b>System Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Action</em>' attribute.
	 * @see #setSystemAction(boolean)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTHistoryEntry_SystemAction()
	 * @model
	 * @generated
	 */
	boolean isSystemAction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.THistoryEntry#isSystemAction <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Action</em>' attribute.
	 * @see #isSystemAction()
	 * @generated
	 */
	void setSystemAction(boolean value);

} // THistoryEntry
