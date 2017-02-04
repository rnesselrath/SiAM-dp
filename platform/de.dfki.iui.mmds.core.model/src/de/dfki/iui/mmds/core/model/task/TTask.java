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

import de.dfki.iui.mmds.core.model.base.Person;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getAction <em>Action</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTask#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask()
 * @model
 * @generated
 */
public interface TTask extends TMetaData {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTask#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.task.TaskState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.task.TaskState
	 * @see #setState(TaskState)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_State()
	 * @model required="true"
	 * @generated
	 */
	TaskState getState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTask#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.task.TaskState
	 * @see #getState()
	 * @generated
	 */
	void setState(TaskState value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.task.TCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.task.TCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCondition> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.task.TTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Successor()
	 * @model
	 * @generated
	 */
	EList<TTask> getSuccessor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(TAction)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Action()
	 * @model containment="true"
	 * @generated
	 */
	TAction getAction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTask#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(TAction value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.base.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTask_Actor()
	 * @model
	 * @generated
	 */
	EList<Person> getActor();

} // TTask
