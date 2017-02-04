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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage
 * @generated
 */
public interface TaskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskFactory eINSTANCE = de.dfki.iui.mmds.core.model.task.impl.TaskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TPlan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan</em>'.
	 * @generated
	 */
	TPlan createTPlan();

	/**
	 * Returns a new object of class '<em>TTask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTask</em>'.
	 * @generated
	 */
	TTask createTTask();

	/**
	 * Returns a new object of class '<em>TComposite Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TComposite Task</em>'.
	 * @generated
	 */
	TCompositeTask createTCompositeTask();

	/**
	 * Returns a new object of class '<em>TCondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCondition</em>'.
	 * @generated
	 */
	TCondition createTCondition();

	/**
	 * Returns a new object of class '<em>TMaterial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMaterial</em>'.
	 * @generated
	 */
	TMaterial createTMaterial();

	/**
	 * Returns a new object of class '<em>TDescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDescription</em>'.
	 * @generated
	 */
	TDescription createTDescription();

	/**
	 * Returns a new object of class '<em>TMeta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMeta Data</em>'.
	 * @generated
	 */
	TMetaData createTMetaData();

	/**
	 * Returns a new object of class '<em>THistory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>THistory</em>'.
	 * @generated
	 */
	THistory createTHistory();

	/**
	 * Returns a new object of class '<em>THistory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>THistory Entry</em>'.
	 * @generated
	 */
	THistoryEntry createTHistoryEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskPackage getTaskPackage();

} //TaskFactory
