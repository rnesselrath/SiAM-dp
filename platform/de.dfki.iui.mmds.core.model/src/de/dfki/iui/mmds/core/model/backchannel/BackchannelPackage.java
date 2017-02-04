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
package de.dfki.iui.mmds.core.model.backchannel;

import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.dfki.iui.mmds.core.model.backchannel.BackchannelFactory
 * @model kind="package"
 * @generated
 */
public interface BackchannelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "backchannel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/communicative_functions/backchannel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "backchannel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackchannelPackage eINSTANCE = de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.backchannel.impl.OkayPositiveAutoFeedbackImpl <em>Okay Positive Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.backchannel.impl.OkayPositiveAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl#getOkayPositiveAutoFeedback()
	 * @generated
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK__BINDING = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK__IS_ELLIPSIS = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Okay Positive Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK_FEATURE_COUNT = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Okay Positive Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OKAY_POSITIVE_AUTO_FEEDBACK_OPERATION_COUNT = Communicative_functionsPackage.POSITIVE_INTERPRETATION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.backchannel.impl.UhmNegativeAutoFeedbackImpl <em>Uhm Negative Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.backchannel.impl.UhmNegativeAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl#getUhmNegativeAutoFeedback()
	 * @generated
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK__BINDING = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK__IS_ELLIPSIS = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Uhm Negative Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK_FEATURE_COUNT = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uhm Negative Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHM_NEGATIVE_AUTO_FEEDBACK_OPERATION_COUNT = Communicative_functionsPackage.NEGATIVE_PERCEPTION_AUTO_FEEDBACK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback <em>Okay Positive Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Okay Positive Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback
	 * @generated
	 */
	EClass getOkayPositiveAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.backchannel.UhmNegativeAutoFeedback <em>Uhm Negative Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uhm Negative Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.backchannel.UhmNegativeAutoFeedback
	 * @generated
	 */
	EClass getUhmNegativeAutoFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BackchannelFactory getBackchannelFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.backchannel.impl.OkayPositiveAutoFeedbackImpl <em>Okay Positive Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.backchannel.impl.OkayPositiveAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl#getOkayPositiveAutoFeedback()
		 * @generated
		 */
		EClass OKAY_POSITIVE_AUTO_FEEDBACK = eINSTANCE.getOkayPositiveAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.backchannel.impl.UhmNegativeAutoFeedbackImpl <em>Uhm Negative Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.backchannel.impl.UhmNegativeAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.backchannel.impl.BackchannelPackageImpl#getUhmNegativeAutoFeedback()
		 * @generated
		 */
		EClass UHM_NEGATIVE_AUTO_FEEDBACK = eINSTANCE.getUhmNegativeAutoFeedback();

	}

} //BackchannelPackage
