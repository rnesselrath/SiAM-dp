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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTool#getSize <em>Size</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTool#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.task.TTool#getTimeWhenTaken <em>Time When Taken</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTool()
 * @model abstract="true"
 * @generated
 */
public interface TTool extends TPhysicalEntity {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTool_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTool#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Person)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTool_Owner()
	 * @model required="true"
	 * @generated
	 */
	Person getOwner();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTool#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Person value);

	/**
	 * Returns the value of the '<em><b>Time When Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time When Taken</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time When Taken</em>' attribute.
	 * @see #setTimeWhenTaken(long)
	 * @see de.dfki.iui.mmds.core.model.task.TaskPackage#getTTool_TimeWhenTaken()
	 * @model
	 * @generated
	 */
	long getTimeWhenTaken();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.task.TTool#getTimeWhenTaken <em>Time When Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time When Taken</em>' attribute.
	 * @see #getTimeWhenTaken()
	 * @generated
	 */
	void setTimeWhenTaken(long value);
} // TTool
