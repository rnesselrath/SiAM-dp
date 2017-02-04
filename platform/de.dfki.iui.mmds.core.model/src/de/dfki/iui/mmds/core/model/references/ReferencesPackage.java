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
package de.dfki.iui.mmds.core.model.references;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.references.ReferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "references";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/references";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "references";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesPackage eINSTANCE = de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel <em>Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getReferenceModel()
	 * @generated
	 */
	int REFERENCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__REFERENCE_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__IS_MANY = 2;

	/**
	 * The number of structural features of the '<em>Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.DeicticReferenceImpl <em>Deictic Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.DeicticReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getDeicticReference()
	 * @generated
	 */
	int DEICTIC_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEICTIC_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEICTIC_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEICTIC_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The number of structural features of the '<em>Deictic Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEICTIC_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deictic Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEICTIC_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.KnowledgeBaseReferenceImpl <em>Knowledge Base Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.KnowledgeBaseReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getKnowledgeBaseReference()
	 * @generated
	 */
	int KNOWLEDGE_BASE_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The number of structural features of the '<em>Knowledge Base Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Knowledge Base Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.GuiContentReferenceImpl <em>Gui Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.GuiContentReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getGuiContentReference()
	 * @generated
	 */
	int GUI_CONTENT_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTENT_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTENT_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTENT_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The number of structural features of the '<em>Gui Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTENT_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gui Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONTENT_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.SpatialReferenceImpl <em>Spatial Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.SpatialReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getSpatialReference()
	 * @generated
	 */
	int SPATIAL_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The feature id for the '<em><b>Relatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE__RELATUM = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spatial Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE__SPATIAL_EXPRESSION = REFERENCE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spatial Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Spatial Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.TemporalReferenceImpl <em>Temporal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.TemporalReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getTemporalReference()
	 * @generated
	 */
	int TEMPORAL_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__UNIT = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__NUMBER = REFERENCE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE__TEMPORAL_FRAME = REFERENCE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getCollectionReference()
	 * @generated
	 */
	int COLLECTION_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Reference Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__REFERENCE_PATTERN = REFERENCE_MODEL__REFERENCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__IS_MANY = REFERENCE_MODEL__IS_MANY;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__POSITION = REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__ORDER = REFERENCE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE_FEATURE_COUNT = REFERENCE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE_OPERATION_COUNT = REFERENCE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.references.impl.LingInfoImpl <em>Ling Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.references.impl.LingInfoImpl
	 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getLingInfo()
	 * @generated
	 */
	int LING_INFO = 7;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO__CASE = 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO__GENDER = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO__NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO__PART_OF_SPEECH = 3;

	/**
	 * The number of structural features of the '<em>Ling Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ling Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LING_INFO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel <em>Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Model</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel
	 * @generated
	 */
	EClass getReferenceModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getReferencePattern <em>Reference Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Pattern</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel#getReferencePattern()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EReference getReferenceModel_ReferencePattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#getHasMorphoSyntacticDecomposition <em>Has Morpho Syntactic Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Morpho Syntactic Decomposition</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel#getHasMorphoSyntacticDecomposition()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EReference getReferenceModel_HasMorphoSyntacticDecomposition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel#isIsMany()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EAttribute getReferenceModel_IsMany();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.DeicticReference <em>Deictic Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deictic Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.DeicticReference
	 * @generated
	 */
	EClass getDeicticReference();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.KnowledgeBaseReference <em>Knowledge Base Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Base Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.KnowledgeBaseReference
	 * @generated
	 */
	EClass getKnowledgeBaseReference();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.GuiContentReference <em>Gui Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Content Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.GuiContentReference
	 * @generated
	 */
	EClass getGuiContentReference();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.SpatialReference <em>Spatial Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.SpatialReference
	 * @generated
	 */
	EClass getSpatialReference();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getRelatum <em>Relatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relatum</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.SpatialReference#getRelatum()
	 * @see #getSpatialReference()
	 * @generated
	 */
	EReference getSpatialReference_Relatum();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.SpatialReference#getSpatialExpression <em>Spatial Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial Expression</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.SpatialReference#getSpatialExpression()
	 * @see #getSpatialReference()
	 * @generated
	 */
	EAttribute getSpatialReference_SpatialExpression();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.TemporalReference <em>Temporal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.TemporalReference
	 * @generated
	 */
	EClass getTemporalReference();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.TemporalReference#getUnit()
	 * @see #getTemporalReference()
	 * @generated
	 */
	EAttribute getTemporalReference_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.TemporalReference#getNumber()
	 * @see #getTemporalReference()
	 * @generated
	 */
	EAttribute getTemporalReference_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.TemporalReference#getTemporalFrame <em>Temporal Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal Frame</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.TemporalReference#getTemporalFrame()
	 * @see #getTemporalReference()
	 * @generated
	 */
	EAttribute getTemporalReference_TemporalFrame();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.CollectionReference <em>Collection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.CollectionReference
	 * @generated
	 */
	EClass getCollectionReference();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.CollectionReference#getPosition()
	 * @see #getCollectionReference()
	 * @generated
	 */
	EAttribute getCollectionReference_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.CollectionReference#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.CollectionReference#getOrder()
	 * @see #getCollectionReference()
	 * @generated
	 */
	EAttribute getCollectionReference_Order();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.references.LingInfo <em>Ling Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ling Info</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.LingInfo
	 * @generated
	 */
	EClass getLingInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.LingInfo#getCase()
	 * @see #getLingInfo()
	 * @generated
	 */
	EAttribute getLingInfo_Case();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.LingInfo#getGender()
	 * @see #getLingInfo()
	 * @generated
	 */
	EAttribute getLingInfo_Gender();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.LingInfo#getNumber()
	 * @see #getLingInfo()
	 * @generated
	 */
	EAttribute getLingInfo_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.references.LingInfo#getPartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Of Speech</em>'.
	 * @see de.dfki.iui.mmds.core.model.references.LingInfo#getPartOfSpeech()
	 * @see #getLingInfo()
	 * @generated
	 */
	EAttribute getLingInfo_PartOfSpeech();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferencesFactory getReferencesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.ReferenceModel <em>Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.ReferenceModel
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getReferenceModel()
		 * @generated
		 */
		EClass REFERENCE_MODEL = eINSTANCE.getReferenceModel();

		/**
		 * The meta object literal for the '<em><b>Reference Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODEL__REFERENCE_PATTERN = eINSTANCE.getReferenceModel_ReferencePattern();

		/**
		 * The meta object literal for the '<em><b>Has Morpho Syntactic Decomposition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODEL__HAS_MORPHO_SYNTACTIC_DECOMPOSITION = eINSTANCE.getReferenceModel_HasMorphoSyntacticDecomposition();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_MODEL__IS_MANY = eINSTANCE.getReferenceModel_IsMany();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.DeicticReferenceImpl <em>Deictic Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.DeicticReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getDeicticReference()
		 * @generated
		 */
		EClass DEICTIC_REFERENCE = eINSTANCE.getDeicticReference();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.KnowledgeBaseReferenceImpl <em>Knowledge Base Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.KnowledgeBaseReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getKnowledgeBaseReference()
		 * @generated
		 */
		EClass KNOWLEDGE_BASE_REFERENCE = eINSTANCE.getKnowledgeBaseReference();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.GuiContentReferenceImpl <em>Gui Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.GuiContentReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getGuiContentReference()
		 * @generated
		 */
		EClass GUI_CONTENT_REFERENCE = eINSTANCE.getGuiContentReference();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.SpatialReferenceImpl <em>Spatial Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.SpatialReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getSpatialReference()
		 * @generated
		 */
		EClass SPATIAL_REFERENCE = eINSTANCE.getSpatialReference();

		/**
		 * The meta object literal for the '<em><b>Relatum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_REFERENCE__RELATUM = eINSTANCE.getSpatialReference_Relatum();

		/**
		 * The meta object literal for the '<em><b>Spatial Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REFERENCE__SPATIAL_EXPRESSION = eINSTANCE.getSpatialReference_SpatialExpression();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.TemporalReferenceImpl <em>Temporal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.TemporalReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getTemporalReference()
		 * @generated
		 */
		EClass TEMPORAL_REFERENCE = eINSTANCE.getTemporalReference();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REFERENCE__UNIT = eINSTANCE.getTemporalReference_Unit();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REFERENCE__NUMBER = eINSTANCE.getTemporalReference_Number();

		/**
		 * The meta object literal for the '<em><b>Temporal Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REFERENCE__TEMPORAL_FRAME = eINSTANCE.getTemporalReference_TemporalFrame();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.CollectionReferenceImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getCollectionReference()
		 * @generated
		 */
		EClass COLLECTION_REFERENCE = eINSTANCE.getCollectionReference();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_REFERENCE__POSITION = eINSTANCE.getCollectionReference_Position();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_REFERENCE__ORDER = eINSTANCE.getCollectionReference_Order();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.references.impl.LingInfoImpl <em>Ling Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.references.impl.LingInfoImpl
		 * @see de.dfki.iui.mmds.core.model.references.impl.ReferencesPackageImpl#getLingInfo()
		 * @generated
		 */
		EClass LING_INFO = eINSTANCE.getLingInfo();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LING_INFO__CASE = eINSTANCE.getLingInfo_Case();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LING_INFO__GENDER = eINSTANCE.getLingInfo_Gender();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LING_INFO__NUMBER = eINSTANCE.getLingInfo_Number();

		/**
		 * The meta object literal for the '<em><b>Part Of Speech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LING_INFO__PART_OF_SPEECH = eINSTANCE.getLingInfo_PartOfSpeech();

	}

} //ReferencesPackage
