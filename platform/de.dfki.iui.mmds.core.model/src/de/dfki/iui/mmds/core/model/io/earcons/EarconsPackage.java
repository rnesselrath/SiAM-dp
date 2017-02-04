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
package de.dfki.iui.mmds.core.model.io.earcons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.iui.mmds.core.model.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsFactory
 * @model kind="package"
 * @generated
 */
public interface EarconsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "earcons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/earcons";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "earcons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EarconsPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.AuditoryIconImpl <em>Auditory Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.AuditoryIconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getAuditoryIcon()
	 * @generated
	 */
	int AUDITORY_ICON = 0;

	/**
	 * The number of structural features of the '<em>Auditory Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITORY_ICON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Auditory Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITORY_ICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconImpl <em>Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarcon()
	 * @generated
	 */
	int EARCON = 1;

	/**
	 * The feature id for the '<em><b>Construction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON__CONSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON__SPEED = 3;

	/**
	 * The number of structural features of the '<em>Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconStructureImpl <em>Earcon Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconStructureImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarconStructure()
	 * @generated
	 */
	int EARCON_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_STRUCTURE__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The number of structural features of the '<em>Earcon Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_STRUCTURE_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earcon Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_STRUCTURE_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.ReferenceEarconImpl <em>Reference Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.ReferenceEarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getReferenceEarcon()
	 * @generated
	 */
	int REFERENCE_EARCON = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EARCON__BINDING = EARCON_STRUCTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EARCON__ID = EARCON_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EARCON__URI = EARCON_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EARCON_FEATURE_COUNT = EARCON_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EARCON_OPERATION_COUNT = EARCON_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl <em>Plain Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getPlainEarcon()
	 * @generated
	 */
	int PLAIN_EARCON = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON__BINDING = EARCON_STRUCTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Note</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON__NOTE = EARCON_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON__REGISTER = EARCON_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON__DYNAMICS = EARCON_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plain Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON_FEATURE_COUNT = EARCON_STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Plain Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EARCON_OPERATION_COUNT = EARCON_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl <em>Earcon Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarconNote()
	 * @generated
	 */
	int EARCON_NOTE = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__PITCH = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__DURATION = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__PAUSE = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intensity Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__INTENSITY_BEGIN = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Intensity End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__INTENSITY_END = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timbre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE__TIMBRE = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Earcon Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Earcon Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARCON_NOTE_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.CombinedEarconImpl <em>Combined Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.CombinedEarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getCombinedEarcon()
	 * @generated
	 */
	int COMBINED_EARCON = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EARCON__BINDING = EARCON_STRUCTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EARCON__ELEMENT = EARCON_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EARCON_FEATURE_COUNT = EARCON_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EARCON_OPERATION_COUNT = EARCON_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl <em>Inherited Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getInheritedEarcon()
	 * @generated
	 */
	int INHERITED_EARCON = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON__BINDING = EARCON_STRUCTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON__BASE = EARCON_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON__LAYER = EARCON_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON__INCLUDE_BASE = EARCON_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inherited Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_FEATURE_COUNT = EARCON_STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Inherited Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_OPERATION_COUNT = EARCON_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl <em>Inherited Earcon Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getInheritedEarconLayer()
	 * @generated
	 */
	int INHERITED_EARCON_LAYER = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_LAYER__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Earcon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_LAYER__EARCON = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_LAYER__INCLUDE = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inherited Earcon Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_LAYER_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inherited Earcon Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_EARCON_LAYER_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl <em>Transformed Earcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getTransformedEarcon()
	 * @generated
	 */
	int TRANSFORMED_EARCON = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_EARCON__BINDING = EARCON_STRUCTURE__BINDING;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_EARCON__BASE = EARCON_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_EARCON__MODIFICATION = EARCON_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformed Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_EARCON_FEATURE_COUNT = EARCON_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformed Earcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_EARCON_OPERATION_COUNT = EARCON_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.SpearconImpl <em>Spearcon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.SpearconImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getSpearcon()
	 * @generated
	 */
	int SPEARCON = 10;

	/**
	 * The number of structural features of the '<em>Spearcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEARCON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spearcon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEARCON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.SemanticonImpl <em>Semanticon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.SemanticonImpl
	 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getSemanticon()
	 * @generated
	 */
	int SEMANTICON = 11;

	/**
	 * The number of structural features of the '<em>Semanticon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICON_FEATURE_COUNT = 0;


	/**
	 * The number of operations of the '<em>Semanticon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICON_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon <em>Auditory Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditory Icon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.AuditoryIcon
	 * @generated
	 */
	EClass getAuditoryIcon();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon <em>Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon
	 * @generated
	 */
	EClass getEarcon();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getConstruction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Construction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon#getConstruction()
	 * @see #getEarcon()
	 * @generated
	 */
	EReference getEarcon_Construction();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSeverity()
	 * @see #getEarcon()
	 * @generated
	 */
	EAttribute getEarcon_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon#getVolume()
	 * @see #getEarcon()
	 * @generated
	 */
	EAttribute getEarcon_Volume();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSpeed()
	 * @see #getEarcon()
	 * @generated
	 */
	EAttribute getEarcon_Speed();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconStructure <em>Earcon Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earcon Structure</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconStructure
	 * @generated
	 */
	EClass getEarconStructure();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon <em>Reference Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon
	 * @generated
	 */
	EClass getReferenceEarcon();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon#getId()
	 * @see #getReferenceEarcon()
	 * @generated
	 */
	EAttribute getReferenceEarcon_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.ReferenceEarcon#getUri()
	 * @see #getReferenceEarcon()
	 * @generated
	 */
	EAttribute getReferenceEarcon_Uri();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon <em>Plain Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon
	 * @generated
	 */
	EClass getPlainEarcon();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Note</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getNote()
	 * @see #getPlainEarcon()
	 * @generated
	 */
	EReference getPlainEarcon_Note();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getRegister()
	 * @see #getPlainEarcon()
	 * @generated
	 */
	EAttribute getPlainEarcon_Register();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getDynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamics</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getDynamics()
	 * @see #getPlainEarcon()
	 * @generated
	 */
	EAttribute getPlainEarcon_Dynamics();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote <em>Earcon Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earcon Note</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote
	 * @generated
	 */
	EClass getEarconNote();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPitch()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getDuration()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pause</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPause()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_Pause();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityBegin <em>Intensity Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity Begin</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityBegin()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_IntensityBegin();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityEnd <em>Intensity End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity End</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityEnd()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_IntensityEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getTimbre <em>Timbre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timbre</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getTimbre()
	 * @see #getEarconNote()
	 * @generated
	 */
	EAttribute getEarconNote_Timbre();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon <em>Combined Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon
	 * @generated
	 */
	EClass getCombinedEarcon();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.CombinedEarcon#getElement()
	 * @see #getCombinedEarcon()
	 * @generated
	 */
	EReference getCombinedEarcon_Element();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon <em>Inherited Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon
	 * @generated
	 */
	EClass getInheritedEarcon();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getBase()
	 * @see #getInheritedEarcon()
	 * @generated
	 */
	EReference getInheritedEarcon_Base();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#getLayer()
	 * @see #getInheritedEarcon()
	 * @generated
	 */
	EReference getInheritedEarcon_Layer();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#isIncludeBase <em>Include Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarcon#isIncludeBase()
	 * @see #getInheritedEarcon()
	 * @generated
	 */
	EAttribute getInheritedEarcon_IncludeBase();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer <em>Inherited Earcon Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited Earcon Layer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer
	 * @generated
	 */
	EClass getInheritedEarconLayer();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#getEarcon <em>Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#getEarcon()
	 * @see #getInheritedEarconLayer()
	 * @generated
	 */
	EReference getInheritedEarconLayer_Earcon();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#isInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.InheritedEarconLayer#isInclude()
	 * @see #getInheritedEarconLayer()
	 * @generated
	 */
	EAttribute getInheritedEarconLayer_Include();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon <em>Transformed Earcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformed Earcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon
	 * @generated
	 */
	EClass getTransformedEarcon();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getBase()
	 * @see #getTransformedEarcon()
	 * @generated
	 */
	EReference getTransformedEarcon_Base();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modification</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getModification()
	 * @see #getTransformedEarcon()
	 * @generated
	 */
	EReference getTransformedEarcon_Modification();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.Spearcon <em>Spearcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spearcon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Spearcon
	 * @generated
	 */
	EClass getSpearcon();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.earcons.Semanticon <em>Semanticon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semanticon</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.Semanticon
	 * @generated
	 */
	EClass getSemanticon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EarconsFactory getEarconsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.AuditoryIconImpl <em>Auditory Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.AuditoryIconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getAuditoryIcon()
		 * @generated
		 */
		EClass AUDITORY_ICON = eINSTANCE.getAuditoryIcon();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconImpl <em>Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarcon()
		 * @generated
		 */
		EClass EARCON = eINSTANCE.getEarcon();

		/**
		 * The meta object literal for the '<em><b>Construction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARCON__CONSTRUCTION = eINSTANCE.getEarcon_Construction();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON__SEVERITY = eINSTANCE.getEarcon_Severity();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON__VOLUME = eINSTANCE.getEarcon_Volume();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON__SPEED = eINSTANCE.getEarcon_Speed();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconStructureImpl <em>Earcon Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconStructureImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarconStructure()
		 * @generated
		 */
		EClass EARCON_STRUCTURE = eINSTANCE.getEarconStructure();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.ReferenceEarconImpl <em>Reference Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.ReferenceEarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getReferenceEarcon()
		 * @generated
		 */
		EClass REFERENCE_EARCON = eINSTANCE.getReferenceEarcon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_EARCON__ID = eINSTANCE.getReferenceEarcon_Id();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_EARCON__URI = eINSTANCE.getReferenceEarcon_Uri();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl <em>Plain Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.PlainEarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getPlainEarcon()
		 * @generated
		 */
		EClass PLAIN_EARCON = eINSTANCE.getPlainEarcon();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_EARCON__NOTE = eINSTANCE.getPlainEarcon_Note();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_EARCON__REGISTER = eINSTANCE.getPlainEarcon_Register();

		/**
		 * The meta object literal for the '<em><b>Dynamics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_EARCON__DYNAMICS = eINSTANCE.getPlainEarcon_Dynamics();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl <em>Earcon Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconNoteImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getEarconNote()
		 * @generated
		 */
		EClass EARCON_NOTE = eINSTANCE.getEarconNote();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__PITCH = eINSTANCE.getEarconNote_Pitch();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__DURATION = eINSTANCE.getEarconNote_Duration();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__PAUSE = eINSTANCE.getEarconNote_Pause();

		/**
		 * The meta object literal for the '<em><b>Intensity Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__INTENSITY_BEGIN = eINSTANCE.getEarconNote_IntensityBegin();

		/**
		 * The meta object literal for the '<em><b>Intensity End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__INTENSITY_END = eINSTANCE.getEarconNote_IntensityEnd();

		/**
		 * The meta object literal for the '<em><b>Timbre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARCON_NOTE__TIMBRE = eINSTANCE.getEarconNote_Timbre();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.CombinedEarconImpl <em>Combined Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.CombinedEarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getCombinedEarcon()
		 * @generated
		 */
		EClass COMBINED_EARCON = eINSTANCE.getCombinedEarcon();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_EARCON__ELEMENT = eINSTANCE.getCombinedEarcon_Element();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl <em>Inherited Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getInheritedEarcon()
		 * @generated
		 */
		EClass INHERITED_EARCON = eINSTANCE.getInheritedEarcon();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITED_EARCON__BASE = eINSTANCE.getInheritedEarcon_Base();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITED_EARCON__LAYER = eINSTANCE.getInheritedEarcon_Layer();

		/**
		 * The meta object literal for the '<em><b>Include Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITED_EARCON__INCLUDE_BASE = eINSTANCE.getInheritedEarcon_IncludeBase();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl <em>Inherited Earcon Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.InheritedEarconLayerImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getInheritedEarconLayer()
		 * @generated
		 */
		EClass INHERITED_EARCON_LAYER = eINSTANCE.getInheritedEarconLayer();

		/**
		 * The meta object literal for the '<em><b>Earcon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITED_EARCON_LAYER__EARCON = eINSTANCE.getInheritedEarconLayer_Earcon();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITED_EARCON_LAYER__INCLUDE = eINSTANCE.getInheritedEarconLayer_Include();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl <em>Transformed Earcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.TransformedEarconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getTransformedEarcon()
		 * @generated
		 */
		EClass TRANSFORMED_EARCON = eINSTANCE.getTransformedEarcon();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMED_EARCON__BASE = eINSTANCE.getTransformedEarcon_Base();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMED_EARCON__MODIFICATION = eINSTANCE.getTransformedEarcon_Modification();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.SpearconImpl <em>Spearcon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.SpearconImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getSpearcon()
		 * @generated
		 */
		EClass SPEARCON = eINSTANCE.getSpearcon();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.earcons.impl.SemanticonImpl <em>Semanticon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.SemanticonImpl
		 * @see de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsPackageImpl#getSemanticon()
		 * @generated
		 */
		EClass SEMANTICON = eINSTANCE.getSemanticon();

	}

} //EarconsPackage
