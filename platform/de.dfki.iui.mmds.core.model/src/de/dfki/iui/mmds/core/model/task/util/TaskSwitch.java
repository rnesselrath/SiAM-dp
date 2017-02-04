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
package de.dfki.iui.mmds.core.model.task.util;

import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.LocatableEntity;
import de.dfki.iui.mmds.core.model.base.Location;
import de.dfki.iui.mmds.core.model.base.NamedEntity;

import de.dfki.iui.mmds.core.model.task.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.task.TaskPackage
 * @generated
 */
public class TaskSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSwitch() {
		if (modelPackage == null) {
			modelPackage = TaskPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TaskPackage.TPLAN: {
				TPlan tPlan = (TPlan)theEObject;
				T1 result = caseTPlan(tPlan);
				if (result == null) result = caseTMetaData(tPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TTASK: {
				TTask tTask = (TTask)theEObject;
				T1 result = caseTTask(tTask);
				if (result == null) result = caseTMetaData(tTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TCOMPOSITE_TASK: {
				TCompositeTask tCompositeTask = (TCompositeTask)theEObject;
				T1 result = caseTCompositeTask(tCompositeTask);
				if (result == null) result = caseTTask(tCompositeTask);
				if (result == null) result = caseTMetaData(tCompositeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TCONDITION: {
				TCondition tCondition = (TCondition)theEObject;
				T1 result = caseTCondition(tCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TPHYSICAL_ENTITY: {
				TPhysicalEntity tPhysicalEntity = (TPhysicalEntity)theEObject;
				T1 result = caseTPhysicalEntity(tPhysicalEntity);
				if (result == null) result = caseNamedEntity(tPhysicalEntity);
				if (result == null) result = caseLocatableEntity(tPhysicalEntity);
				if (result == null) result = caseTMetaData(tPhysicalEntity);
				if (result == null) result = caseEntity(tPhysicalEntity);
				if (result == null) result = caseBObject(tPhysicalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TTOOL: {
				TTool tTool = (TTool)theEObject;
				T1 result = caseTTool(tTool);
				if (result == null) result = caseTPhysicalEntity(tTool);
				if (result == null) result = caseNamedEntity(tTool);
				if (result == null) result = caseLocatableEntity(tTool);
				if (result == null) result = caseTMetaData(tTool);
				if (result == null) result = caseEntity(tTool);
				if (result == null) result = caseBObject(tTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TMATERIAL: {
				TMaterial tMaterial = (TMaterial)theEObject;
				T1 result = caseTMaterial(tMaterial);
				if (result == null) result = caseTPhysicalEntity(tMaterial);
				if (result == null) result = caseNamedEntity(tMaterial);
				if (result == null) result = caseLocatableEntity(tMaterial);
				if (result == null) result = caseTMetaData(tMaterial);
				if (result == null) result = caseEntity(tMaterial);
				if (result == null) result = caseBObject(tMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TACTION: {
				TAction tAction = (TAction)theEObject;
				T1 result = caseTAction(tAction);
				if (result == null) result = caseTMetaData(tAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TPHYSICAL_ACTION: {
				TPhysicalAction tPhysicalAction = (TPhysicalAction)theEObject;
				T1 result = caseTPhysicalAction(tPhysicalAction);
				if (result == null) result = caseTAction(tPhysicalAction);
				if (result == null) result = caseTMetaData(tPhysicalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TDESCRIPTION: {
				TDescription tDescription = (TDescription)theEObject;
				T1 result = caseTDescription(tDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.TMETA_DATA: {
				TMetaData tMetaData = (TMetaData)theEObject;
				T1 result = caseTMetaData(tMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.THISTORY: {
				THistory tHistory = (THistory)theEObject;
				T1 result = caseTHistory(tHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskPackage.THISTORY_ENTRY: {
				THistoryEntry tHistoryEntry = (THistoryEntry)theEObject;
				T1 result = caseTHistoryEntry(tHistoryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTPlan(TPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTTask(TTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TComposite Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TComposite Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTCompositeTask(TCompositeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTCondition(TCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPhysical Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPhysical Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTPhysicalEntity(TPhysicalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTTool(TTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTAction(TAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMaterial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMaterial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTMaterial(TMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPhysical Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPhysical Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTPhysicalAction(TPhysicalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTDescription(TDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMeta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMeta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTMetaData(TMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THistory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THistory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTHistory(THistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THistory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THistory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTHistoryEntry(THistoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locatable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locatable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Location> T1 caseLocatableEntity(LocatableEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //TaskSwitch
