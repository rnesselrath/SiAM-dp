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
package de.dfki.iui.mmds.core.model.io.earcons.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon;
import de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon;
import de.dfki.iui.mmds.core.model.io.earcons.Earcon;
import de.dfki.iui.mmds.core.model.io.earcons.EarconNote;
import de.dfki.iui.mmds.core.model.io.earcons.EarconsFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EarconsFactoryImpl extends EFactoryImpl implements EarconsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EarconsFactory init() {
		try {
			EarconsFactory theEarconsFactory = (EarconsFactory)EPackage.Registry.INSTANCE.getEFactory(EarconsPackage.eNS_URI);
			if (theEarconsFactory != null) {
				return theEarconsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EarconsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EarconsPackage.AUDITORY_ICON: return createAuditoryIcon();
			case EarconsPackage.EARCON: return createEarcon();
			case EarconsPackage.REFERENCE_EARCON: return createReferenceEarcon();
			case EarconsPackage.PLAIN_EARCON: return createPlainEarcon();
			case EarconsPackage.EARCON_NOTE: return createEarconNote();
			case EarconsPackage.COMBINED_EARCON: return createCombinedEarcon();
			case EarconsPackage.INHERITED_EARCON: return createInheritedEarcon();
			case EarconsPackage.INHERITED_EARCON_LAYER: return createInheritedEarconLayer();
			case EarconsPackage.TRANSFORMED_EARCON: return createTransformedEarcon();
			case EarconsPackage.SPEARCON: return createSpearcon();
			case EarconsPackage.SEMANTICON: return createSemanticon();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditoryIcon createAuditoryIcon() {
		AuditoryIconImpl auditoryIcon = new AuditoryIconImpl();
		return auditoryIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earcon createEarcon() {
		EarconImpl earcon = new EarconImpl();
		return earcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceEarcon createReferenceEarcon() {
		ReferenceEarconImpl referenceEarcon = new ReferenceEarconImpl();
		return referenceEarcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEarcon createPlainEarcon() {
		PlainEarconImpl plainEarcon = new PlainEarconImpl();
		return plainEarcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconNote createEarconNote() {
		EarconNoteImpl earconNote = new EarconNoteImpl();
		return earconNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedEarcon createCombinedEarcon() {
		CombinedEarconImpl combinedEarcon = new CombinedEarconImpl();
		return combinedEarcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedEarcon createInheritedEarcon() {
		InheritedEarconImpl inheritedEarcon = new InheritedEarconImpl();
		return inheritedEarcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedEarconLayer createInheritedEarconLayer() {
		InheritedEarconLayerImpl inheritedEarconLayer = new InheritedEarconLayerImpl();
		return inheritedEarconLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformedEarcon createTransformedEarcon() {
		TransformedEarconImpl transformedEarcon = new TransformedEarconImpl();
		return transformedEarcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spearcon createSpearcon() {
		SpearconImpl spearcon = new SpearconImpl();
		return spearcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semanticon createSemanticon() {
		SemanticonImpl semanticon = new SemanticonImpl();
		return semanticon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarconsPackage getEarconsPackage() {
		return (EarconsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EarconsPackage getPackage() {
		return EarconsPackage.eINSTANCE;
	}

} //EarconsFactoryImpl
