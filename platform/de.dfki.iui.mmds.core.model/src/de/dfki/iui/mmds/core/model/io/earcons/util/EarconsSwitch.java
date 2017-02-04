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
package de.dfki.iui.mmds.core.model.io.earcons.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon;
import de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.Earcon;
import de.dfki.iui.mmds.core.model.io.earcons.EarconNote;
import de.dfki.iui.mmds.core.model.io.earcons.EarconStructure;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage;
import de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer;
import de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.Semanticon;
import de.dfki.iui.mmds.core.model.io.earcons.Spearcon;
import de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon;

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
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage
 * @generated
 */
public class EarconsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EarconsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconsSwitch() {
		if (modelPackage == null) {
			modelPackage = EarconsPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EarconsPackage.AUDITORY_ICON: {
				AuditoryIcon auditoryIcon = (AuditoryIcon)theEObject;
				T result = caseAuditoryIcon(auditoryIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.EARCON: {
				Earcon earcon = (Earcon)theEObject;
				T result = caseEarcon(earcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.EARCON_STRUCTURE: {
				EarconStructure earconStructure = (EarconStructure)theEObject;
				T result = caseEarconStructure(earconStructure);
				if (result == null) result = caseBObject(earconStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.REFERENCE_EARCON: {
				ReferenceEarcon referenceEarcon = (ReferenceEarcon)theEObject;
				T result = caseReferenceEarcon(referenceEarcon);
				if (result == null) result = caseEarconStructure(referenceEarcon);
				if (result == null) result = caseBObject(referenceEarcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.PLAIN_EARCON: {
				PlainEarcon plainEarcon = (PlainEarcon)theEObject;
				T result = casePlainEarcon(plainEarcon);
				if (result == null) result = caseEarconStructure(plainEarcon);
				if (result == null) result = caseBObject(plainEarcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.EARCON_NOTE: {
				EarconNote earconNote = (EarconNote)theEObject;
				T result = caseEarconNote(earconNote);
				if (result == null) result = caseBObject(earconNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.COMBINED_EARCON: {
				CombinedEarcon combinedEarcon = (CombinedEarcon)theEObject;
				T result = caseCombinedEarcon(combinedEarcon);
				if (result == null) result = caseEarconStructure(combinedEarcon);
				if (result == null) result = caseBObject(combinedEarcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.INHERITED_EARCON: {
				InheritedEarcon inheritedEarcon = (InheritedEarcon)theEObject;
				T result = caseInheritedEarcon(inheritedEarcon);
				if (result == null) result = caseEarconStructure(inheritedEarcon);
				if (result == null) result = caseBObject(inheritedEarcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.INHERITED_EARCON_LAYER: {
				InheritedEarconLayer inheritedEarconLayer = (InheritedEarconLayer)theEObject;
				T result = caseInheritedEarconLayer(inheritedEarconLayer);
				if (result == null) result = caseBObject(inheritedEarconLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.TRANSFORMED_EARCON: {
				TransformedEarcon transformedEarcon = (TransformedEarcon)theEObject;
				T result = caseTransformedEarcon(transformedEarcon);
				if (result == null) result = caseEarconStructure(transformedEarcon);
				if (result == null) result = caseBObject(transformedEarcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.SPEARCON: {
				Spearcon spearcon = (Spearcon)theEObject;
				T result = caseSpearcon(spearcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EarconsPackage.SEMANTICON: {
				Semanticon semanticon = (Semanticon)theEObject;
				T result = caseSemanticon(semanticon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auditory Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auditory Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditoryIcon(AuditoryIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarcon(Earcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earcon Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earcon Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarconStructure(EarconStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceEarcon(ReferenceEarcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainEarcon(PlainEarcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earcon Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earcon Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarconNote(EarconNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedEarcon(CombinedEarcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedEarcon(InheritedEarcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Earcon Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Earcon Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedEarconLayer(InheritedEarconLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformed Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformed Earcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformedEarcon(TransformedEarcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spearcon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spearcon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpearcon(Spearcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semanticon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semanticon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticon(Semanticon object) {
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
	public T caseBObject(BObject object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //EarconsSwitch
