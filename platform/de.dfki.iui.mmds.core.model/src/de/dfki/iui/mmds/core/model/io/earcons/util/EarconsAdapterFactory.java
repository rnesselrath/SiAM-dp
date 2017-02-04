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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage
 * @generated
 */
public class EarconsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EarconsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EarconsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarconsSwitch<Adapter> modelSwitch =
		new EarconsSwitch<Adapter>() {
			@Override
			public Adapter caseAuditoryIcon(AuditoryIcon object) {
				return createAuditoryIconAdapter();
			}
			@Override
			public Adapter caseEarcon(Earcon object) {
				return createEarconAdapter();
			}
			@Override
			public Adapter caseEarconStructure(EarconStructure object) {
				return createEarconStructureAdapter();
			}
			@Override
			public Adapter caseReferenceEarcon(ReferenceEarcon object) {
				return createReferenceEarconAdapter();
			}
			@Override
			public Adapter casePlainEarcon(PlainEarcon object) {
				return createPlainEarconAdapter();
			}
			@Override
			public Adapter caseEarconNote(EarconNote object) {
				return createEarconNoteAdapter();
			}
			@Override
			public Adapter caseCombinedEarcon(CombinedEarcon object) {
				return createCombinedEarconAdapter();
			}
			@Override
			public Adapter caseInheritedEarcon(InheritedEarcon object) {
				return createInheritedEarconAdapter();
			}
			@Override
			public Adapter caseInheritedEarconLayer(InheritedEarconLayer object) {
				return createInheritedEarconLayerAdapter();
			}
			@Override
			public Adapter caseTransformedEarcon(TransformedEarcon object) {
				return createTransformedEarconAdapter();
			}
			@Override
			public Adapter caseSpearcon(Spearcon object) {
				return createSpearconAdapter();
			}
			@Override
			public Adapter caseSemanticon(Semanticon object) {
				return createSemanticonAdapter();
			}
			@Override
			public Adapter caseBObject(BObject object) {
				return createBObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon <em>Auditory Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon
	 * @generated
	 */
	public Adapter createAuditoryIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon <em>Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon
	 * @generated
	 */
	public Adapter createEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconStructure <em>Earcon Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconStructure
	 * @generated
	 */
	public Adapter createEarconStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon <em>Reference Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon
	 * @generated
	 */
	public Adapter createReferenceEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon <em>Plain Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon
	 * @generated
	 */
	public Adapter createPlainEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote <em>Earcon Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote
	 * @generated
	 */
	public Adapter createEarconNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon <em>Combined Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon
	 * @generated
	 */
	public Adapter createCombinedEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon <em>Inherited Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon
	 * @generated
	 */
	public Adapter createInheritedEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer <em>Inherited Earcon Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer
	 * @generated
	 */
	public Adapter createInheritedEarconLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon <em>Transformed Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon
	 * @generated
	 */
	public Adapter createTransformedEarconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.Spearcon <em>Spearcon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Spearcon
	 * @generated
	 */
	public Adapter createSpearconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.io.earcons.Semanticon <em>Semanticon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Semanticon
	 * @generated
	 */
	public Adapter createSemanticonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.iui.mmds.core.model.base.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.iui.mmds.core.model.base.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EarconsAdapterFactory
