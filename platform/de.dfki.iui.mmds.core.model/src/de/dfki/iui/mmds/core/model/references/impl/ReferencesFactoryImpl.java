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
package de.dfki.iui.mmds.core.model.references.impl;

import de.dfki.iui.mmds.core.model.references.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesFactoryImpl extends EFactoryImpl implements ReferencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferencesFactory init() {
		try {
			ReferencesFactory theReferencesFactory = (ReferencesFactory)EPackage.Registry.INSTANCE.getEFactory(ReferencesPackage.eNS_URI);
			if (theReferencesFactory != null) {
				return theReferencesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactoryImpl() {
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
			case ReferencesPackage.DEICTIC_REFERENCE: return createDeicticReference();
			case ReferencesPackage.KNOWLEDGE_BASE_REFERENCE: return createKnowledgeBaseReference();
			case ReferencesPackage.GUI_CONTENT_REFERENCE: return createGuiContentReference();
			case ReferencesPackage.SPATIAL_REFERENCE: return createSpatialReference();
			case ReferencesPackage.TEMPORAL_REFERENCE: return createTemporalReference();
			case ReferencesPackage.COLLECTION_REFERENCE: return createCollectionReference();
			case ReferencesPackage.LING_INFO: return createLingInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeicticReference createDeicticReference() {
		DeicticReferenceImpl deicticReference = new DeicticReferenceImpl();
		return deicticReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBaseReference createKnowledgeBaseReference() {
		KnowledgeBaseReferenceImpl knowledgeBaseReference = new KnowledgeBaseReferenceImpl();
		return knowledgeBaseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiContentReference createGuiContentReference() {
		GuiContentReferenceImpl guiContentReference = new GuiContentReferenceImpl();
		return guiContentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialReference createSpatialReference() {
		SpatialReferenceImpl spatialReference = new SpatialReferenceImpl();
		return spatialReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalReference createTemporalReference() {
		TemporalReferenceImpl temporalReference = new TemporalReferenceImpl();
		return temporalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionReference createCollectionReference() {
		CollectionReferenceImpl collectionReference = new CollectionReferenceImpl();
		return collectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LingInfo createLingInfo() {
		LingInfoImpl lingInfo = new LingInfoImpl();
		return lingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesPackage getReferencesPackage() {
		return (ReferencesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReferencesPackage getPackage() {
		return ReferencesPackage.eINSTANCE;
	}

} //ReferencesFactoryImpl
